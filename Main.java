public class Main {// v 1.0

		public static void main(String[] args) {
			
			String nombreEmpresa = "Distribuidora TupperWare";
			
			double costoUnitario = 45; // Q45.00
			int cantidadProducto = 200;
			double totalAPagar = costoUnitario*cantidadProducto; // Q
			double precioDeVenta = 50;
			final double IVA = 0.12;// 12%
			double TotalIVAPorUnidad = precioDeVenta*IVA;
			
			
			System.out.println("Costo por unidad: Q"+costoUnitario);
			System.out.println("Costo por unidad: Q"+costoUnitario);
			System.out.println("Cantidad de producto:"+ cantidadProducto);
			System.out.println("-------------------------");
			System.out.println("Total: Q"+totalAPagar);
			
			System.out.println("Venderse a: Q"+precioDeVenta);
			System.out.println("Impuesto establecido: "+IVA);
			System.out.println("Impuesto por unidad comprada: Q"+TotalIVAPorUnidad); 
			
			
			int cantidadProductosVendidos = 40;
			double totalCobradoSinDescuento =  cantidadProductosVendidos*precioDeVenta;
			
			double tipoDeDescuento = 0;
			double totalConDescuento = 0;
			if(cantidadProductosVendidos>=50) {
			 tipoDeDescuento = 0.05;
			 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
			}
			
			if(cantidadProductosVendidos>=100) {
			 tipoDeDescuento = 0.15;
			 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
			}
			
			if(cantidadProductosVendidos>=1000) {
			 tipoDeDescuento = 0.25;	
			 totalConDescuento = totalCobradoSinDescuento -(totalCobradoSinDescuento*tipoDeDescuento);
			}
			
			
			double impuestoTotalADeclarar = totalConDescuento * IVA;
			
			double ganancias = (totalCobradoSinDescuento - (cantidadProductosVendidos*costoUnitario))-impuestoTotalADeclarar;
				
			System.out.println("");
			System.out.println("-------------------------");
			System.out.println("Cantidad vendida: "+ cantidadProductosVendidos);
			System.out.println("Total sin descuento: " +totalCobradoSinDescuento);
			System.out.println("Total con descuento: "+ totalConDescuento);
			System.out.println("IVA a declarar: Q"+ impuestoTotalADeclarar);
			System.out.println("Tipo de descuento: "+ tipoDeDescuento);
			System.out.println("Ganancia: Q"+ganancias);		

		}

	}
