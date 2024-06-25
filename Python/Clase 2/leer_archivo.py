import os

archivo = open("prueba.txt", "r", encoding="utf8")#Las letras son: "r" ready,"a" append,"w" write,"x"
#print(archivo.read())
#print(archivo.read(16))
#print(archivo.read(10)) = Ccntinuamos desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#Vamos  a Iterar el archivo , cada una de las lineas
#for linea in archivo:
    #print(linea) Iteramos todos los elementos del archivo
    #print(archivo.readlines()[10])#Accedemos al archivo como si fuera una lista


#Anexamos informacion, copiamos a otro
archivo2 = open("copia.txt", "w", encoding= "utf8")
archivo2.write(archivo.read())
archivo.close() #Cerramos el primer archivo
archivo.close()#Cerramos el segundo archivo
print("Se ha terminado el proceso de leer y copiar archivos")