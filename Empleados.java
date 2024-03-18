class Empleados {
    private Empleado[] lista;

    public Empleados() {
        this.lista = new Empleado[0];
    }

    public void agregarEmpleado(Empleado empleado) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }
        nuevaLista[lista.length] = empleado;
        lista = nuevaLista;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado.getNombre() + ": " + empleado.getSalario());
        }
    }
}
