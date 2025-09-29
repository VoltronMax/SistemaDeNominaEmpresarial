package org.sistemaGestorNomina;


public class Main {
    public static void main(String[] args){

                GestorNomina gestor = new GestorNomina();

                // Crear empleados
                Empleado emp1 = new Empleado("Juan Perez", "1234567890",
                        Cargo.EMPLEADO, 2_000_000);
                Empleado emp2 = new Empleado("Maria Garcia", "0987654321",
                        Cargo.ADMINISTRADOR, 3_500_000);

                // Agregar al gestor
                gestor.agregarEmpleado(emp1);
                gestor.agregarEmpleado(emp2);

                // Registrar horas trabajadas
                gestor.registrarHoras("1234567890", 240, Mes.ENERO);
                gestor.registrarHoras("0987654321", 240, Mes.ENERO);

                // Calcular salarios brutos
                gestor.salarioOrdinarioBrutoPorMes("1234567890", Mes.ENERO);
                gestor.salarioOrdinarioBrutoPorMes("0987654321", Mes.ENERO);

                // Registrar horas extras
                gestor.registrarHorasExtra("1234567890", Mes.ENERO,
                        10, Horas.EXTRA_DIURNA);

                // Registrar bonificaciones
                gestor.registrarBonificaciones("0987654321", Mes.ENERO,
                        500000, Bono.PRODUCTIVIDAD);

                // Calcular deducciones
                gestor.calcularDeducciones("1234567890", Mes.ENERO);
                gestor.calcularDeducciones("0987654321", Mes.ENERO);

                // Listar empleados
                System.out.println("=== EMPLEADOS REGISTRADOS ===");
                for(Empleado e : gestor.listarEmpleados()){
                    System.out.println(e);
                }

                // Mostrar nóminas
                System.out.println("\n=== NÓMINAS DE ENERO ===");
                Nomina n1 = gestor.obtenerNominaMes("1234567890", Mes.ENERO);
                Nomina n2 = gestor.obtenerNominaMes("0987654321", Mes.ENERO);

                System.out.println("\nEmpleado: " + n1.getEmpleado().getNombreCompleto());
                System.out.printf("Monto Bruto: $ %.2f", n1.getMontoBruto());
                System.out.printf("Monto Pagado: $ %.2f", n1.getMontoBruto());

                System.out.println("\nEmpleado: " + n2.getEmpleado().getNombreCompleto());
                System.out.printf("Monto Bruto: $ %.2f", n2.getMontoBruto());
                System.out.printf("Monto Pagado: $ %.2f", n2.getMontoPagado());
            }
        }
