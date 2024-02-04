/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectostarwars;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Adrián Uceta Gamaza
 */
/*
******************************ESTRUCTURA**DEL**CÓDIGO**************************
*El programa comienza declarando las variables que se van a utilizar. Cada vez
*que se pide un resultado por consola, se emplea una estructura do-while junto
*con un try-catch.
*
*El programa coomienza mostrando por consola el primer texto y, tras introducir
*el primer resultado, se entra en una estructura do-while de la que no se  sale
*hasta fallar una pregunta o completar el juego. Dentro de dicha estructura 
*se encuentra uan estructura condicional switch, en la cual se va accediendo a 
*los distintos niveles según corresponde.
*
*Tras salir del do-while, se accede a una estructura condicional en la que se 
*muestra un mensaje de victoria o derrota según corresponde.
*******************************************************************************
*/
public class ProyectoStarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String amarillo="\033[33m",gris="\033[47m",azul="\033[44m",rojo="\033[41m"; //Paleta de colores
        
        String opcion="";   //principio del programa
        
        int nivel=0,resultado=0,respuesta=0;    //Variables para todos los niveles
        
        int num1=0,num2=0;  //Variables para todos los niveles
        
        boolean repetir=true,ganar=true;   //para los do-whiles y  para ganar o perder
        
        System.out.println(gris+amarillo+"=== STAR WARS CÓDIGOS SECRETOS ===\n" +
        "Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia,\n" +
        "Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada\n" +
        "en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio\n" +
        "está construyendo para destruirla.\n "+azul+"(Presiona Intro para continuar)");
        
        do {                                                                    //Para comprobar que introduce 'intro'
           
            opcion=sc.nextLine();
            
            if (opcion.equals("")==true) {
                
                repetir=false;
                
            }
            
        } while (repetir);
     
        do {                                                                    //Dentro de este bucle se desarrolla el groso del juego
            
            nivel++;
            
            switch (nivel) {                                                    //Según el nivel que corresponda, el usuario tendrá acceso a una parte de esa condicional. 
                
                case 1:
                    
                    num1=(int)(Math.random()*10)+1;                             //Las variables se inicializan conforme empezemos un nuevo nivel
                    num2=(int)(Math.random()*11)+20;
                    
                    System.out.println("");
                    System.out.println(gris+amarillo+"================NIVEL 1=============");
                    System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                    "sistema S1="+num1+" en el sector S2="+num2+", pero el sistema de navegación está estropeado y el\n" +
                    "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                    "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                    "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                    "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                    "¿Qué debe introducir?");
                    
                    for (int i = num1; i <= num2; i++) {
                        
                        resultado+=i;
                        
                    }
                    
                    System.out.println(resultado);                            //Dejamos que veas el resultado para no hacer cálculos
                    
                    do {                                                        //Dentro de cada nivel recurrimos a un do-while interno para realizar el try-cath y comprobar que los datos sean del tipo correcto o que sean positivos
                        
                        repetir=true;
                        
                        try{
                            
                            respuesta=sc.nextInt();
                            
                        if (respuesta>=0) {
                            
                            repetir=false;
                            
                        }else{
                            
                            System.out.println("Joven padawan introduzca un valor positivo:");
                            
                        }
                            
                        }catch(InputMismatchException e){
                            
                            System.out.println("Joven padawan meta un dato correcto entre el sector y el sistema:");
                            
                            sc.nextLine();
                            
                        }
                        
                        
                    } while (repetir);
                    
                    if (resultado!=respuesta) {                                 //Condicional para cuando salga del bucle ver si pierde porque no coincidan la respuesta del usuario con el resultado de cada nivel
                        
                        ganar=false;
                        
                    }
                    
                    break;
                    
                case 2:
                    
                    resultado=1;
                    
                    respuesta=0;
                    
                    num1=(int)(Math.random()*7)+1;
                    num2=(int)(Math.random()*5)+8;
                    
                    System.out.println("");
                    System.out.println(gris+amarillo+"======NIVEL 2=======");
                    System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella\n" +
                    "de la muerte. Como van en una nave imperial robada se aproximan lentamente con\n" +
                    "la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí\n" +
                    "agente de espaciopuerto P1="+num1+" contactando con nave imperial P2="+num2+". No están destinados\n" +
                    "en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n" +
                    "“Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso\n" +
                    "para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde\n" +
                    "“Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el\n" +
                    "manual del piloto que estaba en la guantera y da con la página correcta. El código\n" +
                    "es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                    "¿Cuál es el código?");
                    
                    for (int i = num1; i <= num2; i++) {
                        
                        resultado*=i;
                        
                    }
                    
                    System.out.println(resultado);
                    
                    do {
                        
                        repetir=true;
                        
                        try{
                            
                            respuesta=sc.nextInt();
                            
                        if (resultado>=0) {
                            
                            repetir=false;
                            
                        }else{
                            
                            System.out.println("Joven padawan introduzca un número positivo:");
                            
                        }
                            
                        }catch(InputMismatchException e){
                            
                            System.out.println("Joven padawan inserte un valor correcto entre el espaciopuerto y la nave imperial:");
                            
                            sc.nextLine();
                            
                        }
                        
                    } while (repetir);
                    
                    if (resultado!=respuesta) {
                        
                        ganar=false;
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    resultado=1;
                    
                    respuesta=0;
                    
                    num1=(int)((Math.random()*51)+50)/10;
                    
                    System.out.println("");
                    System.out.println(gris+amarillo+"==========NIVEL 3=========");
                    System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se\n" +
                    "equipan con trajes de soldados imperiales que encuentran en la nave para pasar\n" +
                    "desapercibidos y bajan. Ahora deben averiguar en qué nivel de los N="+num1+" existentes se\n" +
                    "encuentra el reactor principal. Se dirigen al primer panel computerizado que\n" +
                    "encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita\n" +
                    "introducir una clave de acceso. Entonces recuerda la información que le proporcionó\n" +
                    "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10\n" +
                    "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                    "¿Cual es el nivel correcto?");
                    
                    for (int i = 2; i <= num1; i++) {
                        
                        resultado*=i;
                        
                    }
                    
                    System.out.println(resultado);
                    
                    do {
                        
                        repetir=true;
                        
                        try{
                            
                            respuesta=sc.nextInt();
                            
                        if (resultado>=0) {
                            
                            repetir=false;
                            
                        }else{
                            
                            System.out.println("Joven padawan introduzca un valor positivo:");
                            
                        }
                            
                        }catch(InputMismatchException e){
                            
                            System.out.println("Joven padawan inserte un valor correcto para las claves de los planos:");
                            
                            sc.nextLine();
                        }
                        
                        
                    } while (repetir);
                    
                    if (respuesta!=resultado) {
                        
                        ganar=false;
                        
                    }
                    break;
                    
                case 4:
                    
                    num1=(int)(Math.random()*91)+10;
                    
                    resultado=2;
                    
                    respuesta=-1;
                    
                    System.out.println("");
                    System.out.println(gris+amarillo+"====NIVEL 4====");
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta\n" +
                    "acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para\n" +
                    "intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita\n" +
                    "verificar si el número P="+num1+" es primo o no. Si es primo introduce un 1, si no lo es\n" +
                    "introduce un 0.");
                    
                    for (int i = 2; i < num1; i++) {
                        
                        if (num1%i==0) {
                            
                            resultado++;
                            
                        }
                        
                    }
                    
                    
                    do {
                        
                        repetir=true;
                        
                        try{
                            
                            respuesta=sc.nextInt();
                            
                        if (respuesta==0 || respuesta==1) {
                            
                            repetir=false;
                            
                        }else{
                            
                            System.out.println("Joven padawan inserte o 0 o 1:");
                            
                        }
                            
                        }catch(InputMismatchException e){
                            
                            System.out.println("Joven padawan inserte un valor correcto para desencriptar la clave:");
                            sc.nextLine();
                        }
                        

                        
                    } while (repetir);
                    
                    if (respuesta==1 && resultado>2 || respuesta==0 && resultado==2) {
                        
                        ganar=false;
                        
                    }
                    break;
                    
                case 5:
                    
                    num1=(int)(Math.random()*6)+5;
                    
                    num2=(int)(Math.random()*6)+5;
                    
                    resultado=0;
                    
                    respuesta=-1;
                    
                    System.out.println("");
                    System.out.println(gris+amarillo+"====NIVEL 5=====");
                    System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n" +
                    "programe el temporizador y salir de allí corriendo. Necesita programarlo para que\n" +
                    "explote en exactamente M="+num1+" minutos y S="+num2+" segundos, el tiempo suficiente para escapar\n" +
                    "antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y\n" +
                    "desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto\n" +
                    "peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar\n" +
                    "el factorial de M y el factorial de S. ¿Qué valor debe introducir?");
                    
                    for (int i = num1-1; i > 0; i--) {
                        
                        num1*=i;
                        
                    }
                    
                    for (int i = num2-1; i > 0; i--) {
                        
                        num2*=i;
                        
                    }
                    
                    resultado=num1+num2;
                    System.out.println(resultado);
                    
                    do {
                        
                        repetir=true;
                        
                        try{
                            
                            respuesta=sc.nextInt();
                            
                        if (respuesta>=0) {
                            
                            repetir=false;
                            
                        }else{
                            System.out.println("");
                            System.out.println("Joven padawan Introduzca números positivos:");
                            
                        }
                            
                        }catch(InputMismatchException e){
                            System.out.println("");
                            System.out.println("Joven padawan inserte un valor correcto entre el espaciopuerto y la nave imperial:");
                            
                            sc.nextLine();
                            
                        }

                        
                    } while (repetir);
                    
                    if (respuesta!=resultado) {
                        
                        ganar=false;
                        
                    }
                    
                    
                break;
            }   //Switch principal
            
            
            
            
        } while (ganar==true && nivel<5);   //Do-While Principal
        
        
        if (ganar==true) {                                                      //Condición para ganar
            
            System.out.println("");
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a\n" +
            "sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se\n" +
            "convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
            "consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
            "observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
            "el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
            "imperio.\n" +
            "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
            
        }else{                                                                  //Condición para perder
            
            System.out.println("");
            System.out.println(rojo+"Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n" +rojo+
            "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
            
        }
        
    }//main
    
}//class
