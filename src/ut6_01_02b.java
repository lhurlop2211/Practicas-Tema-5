public class ut6_01_02b {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
    }
    private static void a(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        cadena1a.append(cadena1b);
        System.out.println(" a) " + cadena1a);
    }
    private static void b(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        cadena1a.append(cadena1b);
        System.out.println(" b) " + cadena1a.deleteCharAt(cadena1a.length()-1));
    }
    private static void c(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        cadena1a.append(cadena1b);
        if (cadena1a.length() > 0){
            cadena1a.setCharAt(0,'h');
        }
        System.out.println(" c) " + cadena1a);
    }
    private static void d(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        StringBuffer c =  new StringBuffer("-");
        System.out.println(" d) " + cadena1a.append(c.append(cadena1b)));
    }
    private static void e(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        StringBuffer c =  new StringBuffer("-");
        cadena1a.append(c.append(cadena1b));

        System.out.println(" e) " + cadena1a.delete(4,11));

    }
    private static void f(){
        StringBuffer cadena1a = new StringBuffer("Hola mundo");
        StringBuffer cadena1b = new StringBuffer("!!!");

        StringBuffer c =  new StringBuffer("-");
        cadena1a.append(c.append(cadena1b));

        System.out.println(" f) " + cadena1a.reverse());
    }
    private static void g(){
        StringBuffer vacia = new StringBuffer();
        System.out.println(vacia.capacity());
    }
}


