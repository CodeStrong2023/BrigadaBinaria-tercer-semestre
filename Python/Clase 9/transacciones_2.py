import psycopg2 as Bd

conexion = bd.connect(
    user= "postgres",
    password= "admin",
    host= "127.0.0.1",
    port= "5432",
    database= "test_bd"
)
try:
    #conexion.autocommit = False # para que no se guarde de manera automatica  #No deberia estar (mala practica)
    cursor = conexion.cursor()
    sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)"
    valores = ("Carlos", "Zamarbidez", "zamar_carlos@gmail.com")
    cursor.execute(sentencia, valores)
    
    sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_perosna=%s"
    valores = ("Santi", "Garcia", "santiGarci@gmail.com", 2)
    cursor.execute(sentencia, valores)
    
    conexion.commit()#Estamos haciendo el commit manualmente
    print("Termina la transaccion")
except Exception as e:
    conexion.rollback()
    print(f"ocurrio un error, se hizo un rollback: {e}")
finally:
    conexion.close()    
