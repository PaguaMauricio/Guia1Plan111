package implementacion;

import static java.lang.Math.sqrt;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicios {

    public Ejercicios(){}

    /*
    Ejercicio 1
    Escribir un código que inicialice 3 variables texto, entero y boolean. Para cada
    una de las variables visualizar en pantalla el valor de las variables.
     */

    public void ej1 (){
        String text;
        int num;
        boolean bool;

        this.mostrar("Ingrese un texto: ");
        text = this.leer();

        this.mostrar("Ingrese un entero: ");
        num = Integer.parseInt(this.leer());

        this.mostrar("Ingrese T/F(booleano): ");
        String prebool = this.leer();

        switch (prebool.charAt(0)){
            case 'T' : bool = true;
                        break;
            case 't' : bool = true;
                        break;
            case '1' : bool = true;
                        break;
            default: bool=false;
                        break;
        }

        System.out.println(text);
        System.out.println(num);
        System.out.println(bool);
    }

    /*
    Ejercicio 3
    a. Escribir un programa que: - Declare e inicialice 3 variables enteras a, b, c con
        los siguientes valores: a=10; b=-8; c = 36
    i. Visualice el contenido de las tres variables
    ii. Realice las siguientes operaciones de asignación: a=b; b=c; c = a;
    iii. Visualice nuevamente el contenido de las tres variables.
    b. Ejecute el programa
    c. Explique los cambios en los valores de las variables.
     */
    public void ej3 (){
        int a = 10;
        int b = -8;
        int c = 36;
        this.mostrar("a= "+ Integer.toString(a));
        this.mostrar("b= "+ Integer.toString(b));
        this.mostrar("c= "+ Integer.toString(c));

        a = b;
        b = c;
        c = a;
        this.mostrar("a= "+ Integer.toString(a));
        this.mostrar("b= "+ Integer.toString(b));
        this.mostrar("c= "+ Integer.toString(c));

        this.mostrar("valor de 'a' desaparece");
        this.mostrar("valor de 'b' queda en a y en 'c'");
    }

    /*
    Ejercicio 4
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
    dos. Si son iguales indicarlo también. Cambiar los valores para comprobar que
    funciona.
     */
    public void ej4 (){
        mostrar("ingrese un valor 'a': ");
        int a = io().nextInt();
        mostrar("ingrese un valor 'b': ");
        int b = io().nextInt();

        if(a>b){
            mostrar("El mayor es 'a'");
        }else if(a<b){
            mostrar("El mayor es 'b'");
        }else{
            mostrar("'a' y 'b' son iguales");
        }
    }

    /*
    Ejercicio 5
    Declara un String que contenga tu nombre, después muestra un mensaje de
    bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca
    “Bienvenido Fernando”.
     */
    public void ej5 (){
        String mi_nombre = "Mauricio";
            mostrar("Bienvenido, " + mi_nombre + ".");
    }

    /*
    Ejercicio 6
    Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
    por teclado.
     */
    public void ej6 (){
        String mi_nombre;
        mostrar("Ingrese su nombre: ");
        mi_nombre = io().nextLine();
        if (mi_nombre.equals("")){
            mostrar("Bienvenido, desconocido.");
        }else{
            mostrar("Bienvenido, " + mi_nombre + ".");
        }
    }

    /*
    Ejercicio 7
    Haz una aplicación que calcule el área de un círculo (pi*R2). El radio se pedirá por
    teclado.
     */
    public void ej7 (){
        mostrar("Ingrese radio, este programa calculara el area: ");
        double radio;
        try {
            radio = io().nextDouble();
        }catch (InputMismatchException ime){
            mostrar("ingrese ',' para separar la parte decimal");
            radio = io().nextDouble();
        }
        double area = Math.PI * Math.pow(radio,2);
        mostrar("Area = " + Double.toString(area));
    }

    /*
    Ejercicio 8
    Lee un número por teclado e indica si es divisible entre 2. Si no lo es, también
    debemos indicarlo.
    */
    public void ej8 (){
        mostrar("Ingrese un numero, el programa indicara si es divisible por 2: ");
        try{
            int a = io().nextInt();
            if (a%2 == 0) {
                mostrar("es divisible por 2(numero par)");
            }else{
                mostrar("No es divisible por 2");
            }
        }catch (InputMismatchException ime){
            mostrar("ni siquiera es un numero entero!!!");
        }
    }

    /*
    Ejercicio 9
    Lee un número por teclado y muestra por consola, el carácter al que pertenece en la
    tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
     */
    public void ej9 (){
        mostrar("Ingrese un numero: ");
        try {
            mostrar(Character.toString((char)io().nextInt()));
        }catch (InputMismatchException ime){
            mostrar("Debe ser un numero entero.");
        }
    }

    /*
    Ejercicio 10
    Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter
    (char) y muestre su código en la tabla ASCII.
     */
    public void ej10 () {
        mostrar("ingrese una letra, el programa devolvera su codigo en ascii");
        mostrar(Integer.toString((int)io().nextLine().charAt(0)));
    }

    /*
    Ejercicio 11
    Lee un número por teclado que pida el precio de un producto y calcule el precio final
    con IVA. El IVA sera una constante que sera del 21%.
     */
    public void ej11 () {
        final double IVA = 21;
        mostrar("Ingrese precio del producto: ");
        Double precioBase = io().nextDouble();
        mostrar(Double.toString(precioBase+(precioBase/100)*21));
    }

    /*
    Ejercicio 12
    Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
     */
    public void ej12 () {
        int a = 0;
        while (a<100){
            a++;
            mostrar(Integer.toString(a));
        }
    }

    /*
    Ejercicio 13
    Haz el mismo ejercicio anterior con un bucle for.
     */
    public void ej13 () {
        for (int a = 1; a <= 100; a++){
            mostrar(Integer.toString(a));
        }
    }

    /*
    Ejercicio 14
    Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el
    bucle que desees.
     */
    public void ej14 () {
        for (int a = 1; a <= 100 ;a++){
            if ((a%2==0)&&(a%3==0)){
                mostrar(Integer.toString(a));
            }
        }
    }

    /*
    Ejercicio 15
    Realiza una aplicación que nos pida un número de ventas a introducir, después nos
    pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
    mostrara la suma de todas las ventas.
     */
    public void ej15 () {
        mostrar("Ingrese cantidad de ventas: ");
        int cantVentas = io().nextInt();
        Double sum = 0.0;
        for (int i = 1; i <= cantVentas; i++){
            mostrar("precio producto "+i+": ");
            sum = sum + io().nextDouble();
        }
        mostrar("total = " + sum);
    }

    /*
    Ejercicio 16
    
    */
    public void ej16 () {
        double a, b, c, discriminante, raiz1, raiz2;
        this.mostrar("X mediante resolvente: ");
        this.mostrar("a = ");
        a = this.io().nextDouble();
        this.mostrar("b = ");
        b = this.io().nextDouble();
        this.mostrar("c = ");
        c = this.io().nextDouble();
        discriminante = ((b*b)-(4*(a*c)));
        
        if (discriminante < 0) {
        this.mostrar("La Ecuacion No Tiene Soluciones Reales");
        }
        if (discriminante == 0) {
        this.mostrar("La ecuacion tiene solo una raiz real");
        raiz1 = (-b)/(2*a);
        this.mostrar("La Solucion es, X1=X2 : " +raiz1);
        }
        if (discriminante > 0) {
        raiz1 = ((-b) + (sqrt(discriminante)/(2*a)));
        raiz2 = ((-b) - (sqrt(discriminante)/(2*a)));
        this.mostrar("x1 = "+raiz1);
        this.mostrar("x2 = "+raiz2);
        }
    }
    
    /*
    Ejercicio 17
    Lee un número por teclado y comprueba que este número es mayor o igual que cero,
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
    */
    public void ej17(){
        double num;
        do{
        this.mostrar("Ingrese un numero por teclado");
        num = this.io().nextDouble();
        }while(num<0);
        this.mostrar(""+num);
    }
    
    /*
    Ejercicio 18
    Login con 3 intentos
    */
    public void ej18(){
        String user;
        String pass;
        int intentos = 0;
        do{
        this.mostrar("Usuario: ");
        user = this.io().nextLine();
        this.mostrar("Password: ");
        pass = this.io().nextLine();
        intentos++;
        } while ((this.validar(user,pass)!=true)&& intentos!=3);
        
    }
    public String generarPass(String p_user) {
    if (p_user.length() == 1)
    return p_user;
    else return generarPass(p_user.substring(1)) + p_user.charAt(0);
    }
    public boolean validar(String u, String p){
        if(p.equals(this.generarPass(u))){
            return true;
        } else return false;
    }
    
    /*
    Ejercicio 19
    Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
    laboral o no.
    */
    public void ej19(){
        String[] diaLaboral;
        diaLaboral = new String[]{
            "LUNES",
            "MARTES",
            "MIERCOLES",
            "JUEVES",
            "VIERNES"};
        String dia;
        boolean esLaboral=false;
        this.mostrar("Escriba el dia de la semana: ");
        dia = this.io().nextLine().toUpperCase();
        for(int i = 0; i<diaLaboral.length; i++){
            if(diaLaboral[i].equals(dia)){
                esLaboral=true;
            }
        }
        if(esLaboral==true){
            this.mostrar("El dia "+dia.toLowerCase()+" es laboral.");
        }else this.mostrar("El dia "+dia+" no es laboral.");   
    }
    
    /*
    Ejercicio 20
    Pide por teclado dos números y genera 10 números aleatorios entre esos números.
    */
    public void ej20 (){
        int a, b;
        this.mostrar("Ingrese un numero: ");
        a = this.io().nextInt();
        this.mostrar("Ingrese otro numero: ");
        b = this.io().nextInt();
        this.mostrar("Aqui tienes 10 numeros aleatorios entre a y b" );
        for(int i=1;i<=10;i++){
            this.mostrar(""+ThreadLocalRandom.current().nextInt(a, b+1));
        }
    }
    
    /*
    Ejercicio 21
    Pide por teclado un número entero positivo (debemos controlarlo) y muestra el
    número de cifras que tiene.
    */
    public void ej21(){
        int num = 0;
        do{
            this.mostrar("Ingrese un numero entero positivo: ");
            try{
                num = this.io().nextInt();
            }catch(InputMismatchException ime){
                this.mostrar("NUMERO ENTERO DIJE!!!");
            }
            if(num<=0){
                this.mostrar("debe ser mayor a cero '0'!!!");
                num = 0;
            }
        }while(num==0);
    }
    
    /*
    Ejercicio 22
    Pide un número por teclado e indica si es un número primo o no.
    */
    public void ej22(){
        int num=0;
        int a=0;
        this.mostrar("Ingrese un numero: ");
        try{
                num = this.io().nextInt();
            }catch(InputMismatchException ime){
                this.mostrar("Ni siquiera es entero. No es numero primo");
            }
        int aux;
        for(int i=1;i<(num+1);i++){
         if(num%i==0){
             a++;
            }
         }
         if(a!=2){
              this.mostrar("No es Primo");
            }else{
                this.mostrar("Es Primo");
         }
    }
    
    /*
    Ejercicio 22
    Muestra los números primos entre 1 y 100.
    */
    public void ej23(){
        for(int num = 1; num <100; num++){
            int a = 0;
            for(int i=1;i<(num+1);i++){
             if(num%i==0){
                 a++;
                }
            }
            if(a==2){
                 this.mostrar(""+num);
               }
        }
    }
    
    /*
    Ejercicio 23
    Del siguiente String “La lluvia en Corrientes fue una pesadilla durante los meses de
abril y mayo” cuenta cuantas vocales hay en total.
    */
    public void ej24(){
        this.mostrar("El siguiente texto: ");
        this.mostrar("La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo");
        String miTexto = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        this.mostrar("tiene "+this.contarVocales(miTexto)+" vocales");
    }
    public int contarVocales(String texto){
        int contador=0;
        for(int i=0;i<texto.length();i++){
            char a = texto.toUpperCase().charAt(i);
            if(a  == 'A'||a  == 'E'||a  == 'I'||a  == 'O'||a  == 'U'){
                contador++;
            }
        }
        return contador;
    }
    
    /*
    Ejercicio 25
    Reemplaza todas las a del String anterior por una e.
    */
    public void ej25(){
        this.mostrar("La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo");
        String texto = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        char [] vocales = {'a','e','i','o','u'};
        for(char c: vocales){
            texto = texto.replace(c, 'e');
        }
        this.mostrar(texto+"");
    }
    
    /*
    Ejercicio 26
     Recorre el mismo String y transforma cada carácter a su código ASCII.
    Muéstralos en línea recta, separados por un espacio entre cada carácter. 
    */
    public void ej26(){
        this.mostrar("La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo");
        String texto = "La lluvia en Corrientes fue una pesadilla durante los meses de abril y mayo";
        String textoASCII = this.stringToASCII(texto);
        this.mostrar(""+textoASCII);
    }
        
    public String stringToASCII(String t){
        String tASCII;
        if(t.length()==0){
            return "";
        }else{
            tASCII = (int)t.charAt(0)+ " " + this.stringToASCII(t.substring(1));
        }
        return tASCII;
    }
    
    /*
    Ejercicio 27
     Crea una aplicación llamada CalculadoraPolacaInversaApp, 
    nos pedirá 2 operandos (int) y un signo aritmético (String), 
    según este último se realizara la operación correspondiente. 
    Al final mostrara el resultado. Hacer tantas operaciones como 
    desee el usuario Los signos aritméticos disponibles son: 
    +: suma los dos operandos. 
    -: resta los operandos. 
    *: multiplica los operandos. 
    /: divide los operandos, este debe dar un resultado con decimales (double) 
    ^:  1º operando como base y 2º como exponente. 
    %:  módulo, resto de la división entre operando1 y operando2. 
    */
        
    
    
    /*
    CLASES AUXILIARES
     */
    public static void main(String [] args) {
        Ejercicios ej = new Ejercicios();
        //ej.ej1();
        ej.ej26();
    }
    private void mostrar(String texto){
        System.out.println(texto);
    }
    private String leer() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    private Scanner io(){
        return new Scanner(System.in);
    }
}