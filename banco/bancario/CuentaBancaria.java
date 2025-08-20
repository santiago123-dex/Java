package bancario;
public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarInformacion() {

        System.out.println("------------INFORMACION DE LA CUENTA--------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------------");
    }
    
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("------------CANTIDAD DEPOSITADA--------------------");
        if (cantidad > 0) {
            String cantidadStr = String.valueOf(cantidad);
            System.out.println("Depósito de " + cantidadStr + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad ingresada no es válida");
        }
        System.out.println("--------------------------------");
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("------------RETIRO NO REALIZADA--------------------");
            System.out.println("Saldo insuficiente para retirar " + cantidad);
            System.out.println("--------------------------------");
        } else {
            saldo -= cantidad;
            System.out.println("------------CANTIDAD RETIRADA--------------------");
            if (cantidad < saldo) {
                String cantidadStr = String.valueOf(cantidad);
                System.out.println("Retiro de " + cantidadStr + " realizado. Nuevo saldo: " + saldo);
            } else {
                System.out.println("La cantidad ingresada no es válida");
            }
            System.out.println("--------------------------------");
        }
    }

    public void transferir(CuentaBancaria destino, double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            this.saldo -= cantidad;
            destino.saldo += cantidad;
            System.out.println("------------TRANSFERENCIA REALIZADA--------------------");
            System.out.println("La tranferencia con monto de: " + cantidad + " a " + destino.titular + " fue exitosa");
            System.out.println("--------------------------------");
        }else{
            System.out.println("------------TRANSFERENCIA NO REALIZADA--------------------");
            System.out.println("No se pudo realizar la transferencia");
            System.out.println("--------------------------------");
        }
    }

    
}