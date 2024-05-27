from empleado import Empleado
from gerente import Gerente


def imprimir_detalles(objeto):
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)


empleado = Empleado('Santino', 7000.00)
imprimir_detalles(empleado)

gerente = Gerente('Santiago', 60000.00, 'Sistemas')
imprimir_detalles(gerente)

