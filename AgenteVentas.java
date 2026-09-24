public class AgenteVentas extends Empleado{
    private int comisionVentas;
    
    public AgenteVentas(String nombre, String id, double salarioBase, int comisionVentas) {
        super(nombre, id, salarioBase);
        this.comisionVentas = comisionVentas;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (comisionVentas * 0.10);
    }
}