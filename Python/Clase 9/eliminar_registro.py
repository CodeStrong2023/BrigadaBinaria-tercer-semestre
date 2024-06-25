import psycopg2 

conexion = psycopg2.connect(
    user= "postgres",
    password= "admin",
    host= "127.0.0.1",
    port= "5432",
    database= "test_bd"
)
try:
    with conexion:
        with conexion.cursor() as cursor:
        sentencia = "DELETE FROM persona WHERE id_persona IN %s"
        entrada = input("Ingresa los numeros de registros a eliminar: ")
        valores = (entrada,)
        cursor.executemany(sentencia, valores) #De esta manera ejecutamos la sentencia
        registros_eliminados = cursor.rowcount
        print(f"Los registros eliminados son: {registros_eliminados}")
        

except Exception as e:
    print(f"ocurrio un error: {e}")
finally:
    conexion.close()
