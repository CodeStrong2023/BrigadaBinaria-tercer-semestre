import psycopg2 #conexión con Postgree

'''conexion = psycopg2.connect(
    user='postgres',
    password='Angi#Mono',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)

cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia) #ejecución de la sentencia
registros = cursor.fetchall() #recyupera todos los registros de la sentencia
print(registros) #devuelve la lista con una tupla por id o miembro'''

#Creamos funciones para consultar la base de datos 
#Para que todo funcione correctamente debemos ir comentando las funciones y llamar solo a la que necesitemos
#o en otro caso también se pueden crear distintos archivos para cada función y así no tener que ir comentando las demás
# Función para conectar a la base de datos
def conectar():
    try:
        conexion = psycopg2.connect(
            user='postgres',
            password='Angi#Mono',
            host='127.0.0.1',
            port='5432',
            database='test_bd'
        )
        return conexion
    except Exception as error: #utilizamos esta sentencia para que el programa no se detenga si la conexión con la bd falla
        print("Error al conectar a la base de datos:", error)
        return None

# Función para mostrar los registros de personas
def consultar_personas():
    conexion = conectar()
    if conexion:
        try:
            cursor = conexion.cursor()
            cursor.execute("SELECT * FROM persona")
            registros = cursor.fetchall()
            print("Personas registradas en la base de datos")
            for registro in registros:
                print(registro)
        except Exception as error:
            print("Error al ejecutar la consulta:", error)
        finally:
            cursor.close()
            conexion.close()

# Función para insertar un nuevo registro
def insertar_persona(nombre, apellido, email):
    conexion = conectar()
    if conexion:
        try:
            cursor = conexion.cursor()
            query = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
            cursor.execute(query, (nombre, apellido, email))
            conexion.commit()
            print("Persona insertada correctamente")
        except Exception as error:
            print("Error al insertar persona:", error)
        finally:
            cursor.close()
            conexion.close()

# Función para actualizar un registro
def actualizar_persona(id_persona, nuevo_nombre, nuevo_apellido, nuevo_email):
    conexion = conectar()
    if conexion:
        try:
            cursor = conexion.cursor()
            query = "UPDATE persona SET nombre = %s, apellido = %s, email = %s WHERE id_persona = %s"
            cursor.execute(query, (nuevo_nombre, nuevo_apellido, nuevo_email, id_persona))
            conexion.commit()
            print(f"Registro con id_persona={id_persona} actualizado correctamente")
        except Exception as error:
            print("Error al actualizar persona:", error)
        finally:
            cursor.close()
            conexion.close()

# Función para eliminar un registro
def eliminar_persona(id_persona):
    conexion = conectar()
    if conexion:
        try:
            cursor = conexion.cursor()
            query = "DELETE FROM persona WHERE id_persona = %s"
            cursor.execute(query, (id_persona,))
            conexion.commit()
            print(f"Registro con id_persona={id_persona} eliminado correctamente")
        except Exception as error:
            print("Error al eliminar persona:", error)
        finally:
            cursor.close()
            conexion.close()

def main(): #con el main podemos ejecutar el resto 
    # Ejemplo de uso de las funciones
    consultar_personas()

    insertar_persona('Susana', 'Lopez', 'lopezsus@gmail.com')

    actualizar_persona(3, 'Ivana', 'Gimenez', 'ivanag12@gmail.com')

    eliminar_persona(3)
    
if __name__ == "__main__":
    main()
