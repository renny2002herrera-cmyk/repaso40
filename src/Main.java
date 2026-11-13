
import java.util.Scanner;
import java.util.Locale;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n========== TALLER DE PROGRAMACION ==========");
            System.out.println("PARTE I");
            System.out.println("1. Concatenar dos textos");
            System.out.println("2. Imprimir Hola y nombre");
            System.out.println("3. Cuadrado de un numero");
            System.out.println("4. Suma de dos numeros");
            System.out.println("5. Operaciones matematicas");
            System.out.println("6. Parte entera y decimal");
            System.out.println("7. Calcular promedio de cinco notas");
            System.out.println("8. Calcular IVA");
            System.out.println("9. Area y perimetro del circulo");
            System.out.println("10. Area de un hexagono");
            System.out.println("11. Promedio de N numeros");
            System.out.println("12. Distancia entre dos puntos");
            System.out.println("13. Generar n, nn y nnn");
            System.out.println("14. Convertir segundos");

            System.out.println("\nPARTE II");
            System.out.println("15. Par o impar");
            System.out.println("16. Positivo o negativo");
            System.out.println("17. IVA con descuento");
            System.out.println("18. Calificacion del estudiante");
            System.out.println("19. Ecuacion cuadratica");
            System.out.println("20. Validar usuario y contrasena");
            System.out.println("21. Numero a letras");
            System.out.println("22. Contar digitos");
            System.out.println("23. Orden de tres numeros");
            System.out.println("24. Dia de la semana");

            System.out.println("\nPARTE III");
            System.out.println("25. Invertir texto");
            System.out.println("26. Primera letra en mayuscula");
            System.out.println("27. Penultima palabra");
            System.out.println("28. Buscar texto dentro de otro");
            System.out.println("29. Verificar palindromo");
            System.out.println("30. Area de un poligono");

            System.out.println("\nPARTE IV");
            System.out.println("31. Diez primeros naturales");
            System.out.println("32. Diez primeros impares");
            System.out.println("33. Diez primeros pares");
            System.out.println("34. Validar entero positivo");
            System.out.println("35. Decimal a binario");
            System.out.println("36. Binario a decimal");
            System.out.println("37. Patron numerico");
            System.out.println("38. Triangulo de arrobas");
            System.out.println("39. Triangulo de asteriscos");

            System.out.println("\nPROBLEMA FINAL");
            System.out.println("40. Control de equipajes BOING 747");

            System.out.println("\n0. Salir");
            System.out.println("============================================");

            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {

                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;

                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
                case 21: ejercicio21(); break;
                case 22: ejercicio22(); break;
                case 23: ejercicio23(); break;
                case 24: ejercicio24(); break;

                case 25: ejercicio25(); break;
                case 26: ejercicio26(); break;
                case 27: ejercicio27(); break;
                case 28: ejercicio28(); break;
                case 29: ejercicio29(); break;
                case 30: ejercicio30(); break;

                case 31: ejercicio31(); break;
                case 32: ejercicio32(); break;
                case 33: ejercicio33(); break;
                case 34: ejercicio34(); break;
                case 35: ejercicio35(); break;
                case 36: ejercicio36(); break;
                case 37: ejercicio37(); break;
                case 38: ejercicio38(); break;
                case 39: ejercicio39(); break;

                case 40: ejercicio40(); break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // ==========================================
    // METODOS AUXILIARES DE LECTURA
    // ==========================================

    static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero entero valido.");
            }
        }
    }

    static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(
                        sc.nextLine().trim().replace(",", ".")
                );
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }

    static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    // ==========================================
    // PARTE I
    // ==========================================

    // 1. Concatenar dos textos

    static void ejercicio1() {
        String texto1 = leerTexto("Primer texto: ");
        String texto2 = leerTexto("Segundo texto: ");

        System.out.println("Resultado: " + texto1 + " " + texto2);
    }

    // 2. Imprimir Hola y nombre

    static void ejercicio2() {
        String nombre = leerTexto("Ingrese su nombre: ");

        System.out.println("Hola " + nombre);
    }

    // 3. Cuadrado de un numero

    static void ejercicio3() {
        double numero = leerDecimal("Ingrese un numero: ");

        System.out.println("Cuadrado: " + Math.pow(numero, 2));
    }

    // 4. Suma de dos numeros

    static void ejercicio4() {
        double a = leerDecimal("Primer numero: ");
        double b = leerDecimal("Segundo numero: ");

        System.out.println("Suma: " + (a + b));
    }

    // 5. Operaciones matematicas

    static void ejercicio5() {
        double a = leerDecimal("Primer numero: ");
        double b = leerDecimal("Segundo numero: ");

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Residuo: " + (a % b));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    // 6. Parte entera y decimal

    static void ejercicio6() {
        double numero = leerDecimal("Ingrese un decimal: ");

        double parteEntera = numero >= 0
                ? Math.floor(numero) : Math.ceil(numero);

        double parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + (long) parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }

    // 7. Promedio ponderado

    static double calcularPromedio(
            double n1, double n2, double n3,
            double n4, double n5) {

        return n1 * 0.15 +
                n2 * 0.20 +
                n3 * 0.15 +
                n4 * 0.30 +
                n5 * 0.20;
    }

    static void ejercicio7() {
        double n1 = leerDecimal("Nota 1 (15%): ");
        double n2 = leerDecimal("Nota 2 (20%): ");
        double n3 = leerDecimal("Nota 3 (15%): ");
        double n4 = leerDecimal("Nota 4 (30%): ");
        double n5 = leerDecimal("Nota 5 (20%): ");

        double promedio = calcularPromedio(n1, n2, n3, n4, n5);

        System.out.println("Nota final: " + promedio);
    }

    // 8. Calcular IVA

    static double calcularIVA(double precioBruto) {
        return precioBruto * 1.19;
    }

    static void ejercicio8() {
        double precio = leerDecimal("Precio bruto: ");

        double iva = precio * 0.19;
        double total = calcularIVA(precio);

        System.out.println("Precio original: $" + precio);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total con IVA: $" + total);
    }

    // 9. Area y perimetro del circulo

    static void ejercicio9() {
        double radio = leerDecimal("Radio del circulo: ");

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    // 10. Area de un hexagono regular

    static void ejercicio10() {
        double lado = leerDecimal("Longitud del lado: ");

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);

        System.out.println("Area del hexagono: " + area);
    }

    // 11. Promedio de N numeros

    static void ejercicio11() {
        int n;

        do {
            n = leerEntero("Cantidad de numeros: ");
        } while (n <= 0);

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += leerDecimal("Numero " + i + ": ");
        }

        System.out.println("Promedio: " + (suma / n));
    }

    // 12. Distancia entre dos puntos

    static void ejercicio12() {
        double x1 = leerDecimal("X1: ");
        double y1 = leerDecimal("Y1: ");
        double x2 = leerDecimal("X2: ");
        double y2 = leerDecimal("Y2: ");

        double distancia = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        System.out.println("Distancia: " + distancia);
    }

    // 13. Generar n, nn y nnn

    static void ejercicio13() {
        int n;

        do {
            n = leerEntero("Ingrese un digito entre 0 y 9: ");
        } while (n < 0 || n > 9);

        int nn = n * 10 + n;
        int nnn = n * 100 + n * 10 + n;

        System.out.println(n);
        System.out.println(nn);
        System.out.println(nnn);

        System.out.println("Suma: " + (n + nn + nnn));
    }

    // 14. Convertir segundos a horas, minutos y segundos

    static void ejercicio14() {
        int segundos;

        do {
            segundos = leerEntero("Cantidad de segundos: ");
        } while (segundos < 0);

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int resto = segundos % 60;

        System.out.printf(
                "%02d:%02d:%02d%n", horas, minutos, resto
        );
    }

    // ==========================================
    // PARTE II
    // ==========================================

    // 15. Par o impar

    static void ejercicio15() {
        int numero = leerEntero("Ingrese un numero: ");

        if (numero % 2 == 0) {
            System.out.println("El numero es PAR.");
        } else {
            System.out.println("El numero es IMPAR.");
        }
    }

    // 16. Positivo o negativo

    static void ejercicio16() {
        double numero = leerDecimal("Ingrese un numero: ");

        if (numero > 0) {
            System.out.println("Positivo.");
        } else if (numero < 0) {
            System.out.println("Negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }

    // 17. IVA con descuento

    static void ejercicio17() {
        double precio = leerDecimal("Precio de la venta: ");

        double descuento = 0;

        if (precio > 150000) {
            descuento = precio * 0.05;
        }

        double precioDescontado = precio - descuento;
        double total = calcularIVA(precioDescontado);
        double iva = precioDescontado * 0.19;

        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio con descuento: $" + precioDescontado);
        System.out.println("IVA: $" + iva);
        System.out.println("Total a pagar: $" + total);
    }

    // 18. Calificacion del estudiante

    static void ejercicio18() {
        double n1 = leerDecimal("Nota 1: ");
        double n2 = leerDecimal("Nota 2: ");
        double n3 = leerDecimal("Nota 3: ");
        double n4 = leerDecimal("Nota 4: ");
        double n5 = leerDecimal("Nota 5: ");

        double nota = calcularPromedio(n1, n2, n3, n4, n5);

        System.out.println("Nota final: " + nota);

        if (nota < 2.0) {
            System.out.println("No puede habilitar.");
        } else if (nota < 3.0) {
            System.out.println("Reprobo.");
        } else if (nota >= 3.0) {
            System.out.println("Aprobo.");

            if (nota > 4.5) {
                System.out.println("¡Felicitaciones por tu excelente nota!");
            }
        }
    }

    // 19. Ecuacion cuadratica

    static void ejercicio19() {
        double a = leerDecimal("Valor de a: ");
        double b = leerDecimal("Valor de b: ");
        double c = leerDecimal("Valor de c: ");

        if (a == 0) {
            System.out.println("No es una ecuacion cuadratica.");
            return;
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Dos soluciones reales:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        } else if (discriminante == 0) {

            double x = -b / (2 * a);

            System.out.println("Una solucion real: " + x);

        } else {

            double parteReal = -b / (2 * a);
            double parteImaginaria =
                    Math.sqrt(-discriminante) / Math.abs(2 * a);

            System.out.println("Dos soluciones complejas:");
            System.out.println("X1 = " + parteReal + " + "
                    + parteImaginaria + "i");
            System.out.println("X2 = " + parteReal + " - "
                    + parteImaginaria + "i");
        }
    }

    // 20. Validar usuario y contrasena

    static void ejercicio20() {
        String usuarioCorrecto = "carlos";
        String claveCorrecta = "1234";

        String usuario = leerTexto("Usuario: ");
        String clave = leerTexto("Contrasena: ");

        if (usuario.equals(usuarioCorrecto)
                && clave.equals(claveCorrecta)) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Usuario o contrasena incorrectos.");
        }
    }

    // 21. Numero a letras

    static void ejercicio21() {
        int numero;

        do {
            numero = leerEntero("Ingrese un numero entre 0 y 10: ");
        } while (numero < 0 || numero > 10);

        String[] nombres = {
                "CERO", "UNO", "DOS", "TRES", "CUATRO",
                "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ"
        };

        System.out.println(nombres[numero]);
    }

    // 22. Contar digitos

    static void ejercicio22() {
        int numero;

        do {
            numero = leerEntero("Ingrese un numero menor a 100000: ");
        } while (Math.abs((long) numero) >= 100000);

        int auxiliar = Math.abs(numero);
        int contador = 0;

        if (auxiliar == 0) {
            contador = 1;
        } else {
            while (auxiliar > 0) {
                auxiliar /= 10;
                contador++;
            }
        }

        System.out.println("Cantidad de digitos: " + contador);
    }

    // 23. Orden de tres numeros

    static void ejercicio23() {
        double a = leerDecimal("Primer numero: ");
        double b = leerDecimal("Segundo numero: ");
        double c = leerDecimal("Tercer numero: ");

        if (a < b && b < c) {
            System.out.println("Esta incrementando.");
        } else if (a > b && b > c) {
            System.out.println("Esta disminuyendo.");
        } else {
            System.out.println("Ni se incrementa ni se disminuye.");
        }
    }

    // 24. Dia de la semana

    static void ejercicio24() {
        int dia;

        do {
            dia = leerEntero("Ingrese un dia entre 1 y 7: ");
        } while (dia < 1 || dia > 7);

        String[] dias = {
                "Lunes", "Martes", "Miercoles", "Jueves",
                "Viernes", "Sabado", "Domingo"
        };

        System.out.println(dias[dia - 1]);
    }

    // ==========================================
    // PARTE III
    // ==========================================

    // 25. Invertir texto

    static String invertirTexto(String texto) {
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        return invertido;
    }

    static void ejercicio25() {
        String texto = leerTexto("Ingrese un texto: ");

        System.out.println("Texto invertido: " + invertirTexto(texto));
    }

    // 26. Primera letra de cada palabra en mayuscula

    static void ejercicio26() {
        String texto = leerTexto("Ingrese un texto: ");

        String resultado = texto.toLowerCase()
                .replaceAll("\\b\\p{L}", "")
                ;

        StringBuilder nuevo = new StringBuilder();
        boolean inicioPalabra = true;

        for (int i = 0; i < texto.length(); i++) {

            char actual = texto.charAt(i);

            if (Character.isLetter(actual)) {
                if (inicioPalabra) {
                    nuevo.append(Character.toUpperCase(actual));
                } else {
                    nuevo.append(Character.toLowerCase(actual));
                }
                inicioPalabra = false;
            } else {
                nuevo.append(actual);
                inicioPalabra = true;
            }
        }

        System.out.println("Resultado: " + nuevo);
    }

    // 27. Penultima palabra

    static void ejercicio27() {
        String texto = leerTexto("Ingrese un texto: ").trim();

        String[] palabras = texto.split("\\s+");

        if (palabras.length < 2) {
            System.out.println("No existe penultima palabra.");
        } else {
            System.out.println("Penultima palabra: "
                    + palabras[palabras.length - 2]);
        }
    }

    // 28. Buscar un texto dentro de otro

    static void ejercicio28() {
        String texto1 = leerTexto("Texto que desea buscar: ");
        String texto2 = leerTexto("Texto donde desea buscar: ");

        if (texto2.contains(texto1)) {
            System.out.println("El segundo texto contiene al primero.");
        } else {
            System.out.println("No lo contiene.");
        }
    }

    // 29. Verificar palindromo

    static boolean esPalindromo(String palabra) {

        String limpia = palabra.toLowerCase()
                .replaceAll("[^\\p{L}\\p{N}]", "");

        String invertida = invertirTexto(limpia);

        return limpia.equals(invertida);
    }

    static void ejercicio29() {
        String palabra = leerTexto("Ingrese una palabra o frase: ");

        if (esPalindromo(palabra)) {
            System.out.println("Es palindromo.");
        } else {
            System.out.println("No es palindromo.");
        }
    }

    // 30. Area de cualquier poligono mediante coordenadas

    static void ejercicio30() {
        int n;

        do {
            n = leerEntero("Cantidad de vertices del poligono: ");
        } while (n < 3);

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Vertice " + (i + 1));
            x[i] = leerDecimal("X: ");
            y[i] = leerDecimal("Y: ");
        }

        double suma = 0;

        for (int i = 0; i < n; i++) {
            int siguiente = (i + 1) % n;

            suma += x[i] * y[siguiente]
                    - y[i] * x[siguiente];
        }

        double area = Math.abs(suma) / 2;

        System.out.println("Area del poligono: " + area);
    }

    // ==========================================
    // PARTE IV
    // ==========================================

    // 31. Diez primeros numeros naturales

    static void ejercicio31() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 32. Diez primeros impares

    static void ejercicio32() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 33. Diez primeros pares

    static void ejercicio33() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 34. Validar entero positivo

    static void ejercicio34() {
        int numero;

        do {
            numero = leerEntero("Ingrese un entero positivo: ");

            if (numero <= 0) {
                System.out.println("Valor no permitido. Intente otra vez.");
            }

        } while (numero <= 0);

        System.out.println("Numero valido: " + numero);
    }

    // 35. Decimal a binario

    static void ejercicio35() {
        int numero;

        do {
            numero = leerEntero("Ingrese un entero no negativo: ");
        } while (numero < 0);

        System.out.println("Binario: " + Integer.toBinaryString(numero));
    }

    // 36. Binario a decimal

    static void ejercicio36() {
        String binario = leerTexto("Ingrese un numero binario: ").trim();

        if (!binario.matches("[01]+")) {
            System.out.println("Numero binario invalido.");
            return;
        }

        long decimal = 0;

        for (int i = 0; i < binario.length(); i++) {
            decimal = decimal * 2 + (binario.charAt(i) - '0');
        }

        System.out.println("Decimal: " + decimal);
    }

    // 37. Patron numerico

    static void ejercicio37() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    // 38. Triangulo de arrobas

    static void ejercicio38() {
        int filas;

        do {
            filas = leerEntero("Cantidad de filas: ");
        } while (filas <= 0);

        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }

            System.out.println();
        }
    }

    // 39. Triangulo de asteriscos invertido

    static void ejercicio39() {
        int filas;

        do {
            filas = leerEntero("Cantidad de filas: ");
        } while (filas <= 0);

        for (int i = filas; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // ==========================================
    // 40. PROBLEMA FINAL: EQUIPAJES BOING 747
    // ==========================================

    static void ejercicio40() {

        final double CAPACIDAD_AVION = 18000;
        final double DOLAR = 4000; // Tasa de ejemplo, editable.

        int cantidad = 0;
        double pesoTotal = 0;
        double pesoMayor = 0;
        double pesoMenor = Double.MAX_VALUE;
        double ingresoTotal = 0;

        System.out.println("\nCONTROL DE EQUIPAJES BOING 747");
        System.out.println("Capacidad maxima: 18000 kg");
        System.out.println("Peso maximo por bulto: 500 kg");

        int continuar;

        do {

            double peso = leerDecimal("\nPeso del nuevo bulto (kg): ");

            if (peso <= 0 || peso > 500) {
                System.out.println("Bulto rechazado. Peso no permitido.");
                continuar = 1;
                continue;
            }

            if (pesoTotal + peso > CAPACIDAD_AVION) {
                System.out.println("Bulto rechazado. Se supera la capacidad.");
                continuar = 1;
                continue;
            }

            double tarifa;
            double costo;

            if (peso <= 25) {
                tarifa = 0;
            } else if (peso <= 300) {
                tarifa = 1500;
            } else {
                tarifa = 2500;
            }

            costo = peso * tarifa;

            cantidad++;
            pesoTotal += peso;
            ingresoTotal += costo;

            if (peso > pesoMayor) {
                pesoMayor = peso;
            }

            if (peso < pesoMenor) {
                pesoMenor = peso;
            }

            System.out.println("Bulto aceptado.");
            System.out.println("Tarifa por kilo: $" + tarifa);
            System.out.println("Costo del bulto: $" + costo);
            System.out.println("Capacidad utilizada: "
                    + pesoTotal + " / " + CAPACIDAD_AVION + " kg");

            continuar = leerEntero(
                    "Desea ingresar otro bulto? (1=Si, 0=No): "
            );

        } while (continuar == 1);

        System.out.println("\n========== REPORTE DEL VUELO ==========");

        if (cantidad == 0) {
            System.out.println("No se registraron bultos.");
            return;
        }

        double promedio = pesoTotal / cantidad;
        double ingresoDolares = ingresoTotal / DOLAR;

        System.out.println("Total de bultos: " + cantidad);
        System.out.println("Peso total: " + pesoTotal + " kg");
        System.out.println("Bulto mas pesado: " + pesoMayor + " kg");
        System.out.println("Bulto mas liviano: " + pesoMenor + " kg");
        System.out.println("Peso promedio: " + promedio + " kg");
        System.out.println("Ingreso en pesos: $" + ingresoTotal);
        System.out.println("Ingreso en dolares: US$" + ingresoDolares);
        System.out.println("Capacidad restante: "
                + (CAPACIDAD_AVION - pesoTotal) + " kg");

        System.out.println("=======================================");
    }
}
