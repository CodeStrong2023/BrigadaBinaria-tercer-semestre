from empleado import empleado
from gerente import gerente


def imprimir_detalles(objeto):
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)


empleado = empleado('Lucia', 50000.00)
imprimir_detalles(empleado)

gerente = gerente('Luciana', 60000.00, 'Sistemas')
imprimir_detalles(gerente)
