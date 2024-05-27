class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other):
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, other):
        return self.edad - other.edad

persona1 = Persona('Santiago', 18)
persona2 = Persona('Angelina', 18)

# persona1.__add__(persona2) sintaxis interna y automática
print(persona1 + persona2)
print((persona1 - persona2))