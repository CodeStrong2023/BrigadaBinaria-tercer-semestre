class Pelicula:
    def __init__(self,nombre):
        self._nombre = nombre
    #Metodo string
    def __str__(self):
        return f"Pelicula: {self._nombre}"
    #Metodo get
    @property
    def nombre(self):
        return self._nombre
    #metodo setter
    @nombre.setter
    def nombre(self,nombre):
        self._nombre = nombre
