public class Tablero{
    public static void main(String[] args) {
        Empleado[] equipo = {
            new Piloto("Luis", "P-1572", 3547.89, 18),
            new TecnicoMantenimiento("Josefina", "T-5241", 8596.35, 15),
            new AgenteVentas("Felipe", "A-8005", 6145.32, 15),
            new Supervisor("Anita", "S-4937", 5473.62, 20)
        };

        for (Empleado e : equipo){
            System.out.println(
                e.getNombre() + ": Q " + e.calcularSalario()
            );
        }
    }
}