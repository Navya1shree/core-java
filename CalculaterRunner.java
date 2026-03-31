public class CalculaterRunner {

    public static void main(String[] args) {

        Calculater calc = new Calculater();

        // -------- ADD --------
        calc.add(10);
        calc.add(20);

        calc.add(5, 3);
        calc.add(7, 2);

        calc.add(1, 2, 3);
        calc.add(4, 5, 6);

        calc.add(1, 2, 3, 4);
        calc.add(2, 3, 4, 5);

        calc.add(1, 2, 3, 4, 5);
        calc.add(5, 4, 3, 2, 1);

        calc.add(1, 7, 9, 9, 10, 17);
        calc.add(2,42, 5, 2, 87, 26;

        calc.add(1, 2, 3, 4, 5, 6, 7);
        calc.add(7, 6, 5, 4, 3, 2, 1);

        calc.add(1, 2, 3, 4, 5, 6, 7, 8);
        calc.add(8, 7, 6, 5, 4, 3, 2, 1);

        calc.add(1, 2, 3, 4, 5, 6, 7, 8, 9);
        calc.add(9, 8, 7, 6, 5, 4, 3, 2, 1);

        calc.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        calc.add(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);

System.out.println("-------------------------------------------");
        // -------- SUB --------
        calc.sub(50);
        calc.sub(100);

        calc.sub(10, 5);
        calc.sub(20, 10);

        calc.sub(30, 10, 5);
        calc.sub(40, 20, 10);

        calc.sub(50, 10, 5, 5);
        calc.sub(60, 20, 10, 5);

        calc.sub(100, 10, 10, 10, 10);
        calc.sub(90, 5, 5, 5, 5);

        calc.sub(60, 5, 5, 5, 5, 5);
        calc.sub(70, 10, 10, 10, 10, 10);

        calc.sub(70, 5, 5, 5, 5, 5, 5);
        calc.sub(80, 10, 10, 10, 10, 10, 10);

        calc.sub(80, 5, 5, 5, 5, 5, 5, 5);
        calc.sub(90, 10, 10, 10, 10, 10, 10, 10);

        calc.sub(90, 5, 5, 5, 5, 5, 5, 5, 5);
        calc.sub(100, 10, 10, 10, 10, 10, 10, 10, 10);

        calc.sub(100, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        calc.sub(110, 10, 10, 10, 10, 10, 10, 10, 10, 10);

System.out.println("-------------------------------------------");
        // -------- MUL --------
        calc.mul(5);
        calc.mul(6);

        calc.mul(2, 3);
        calc.mul(4, 5);

        calc.mul(2, 3, 4);
        calc.mul(3, 4, 5);

        calc.mul(2, 2, 2, 2);
        calc.mul(3, 3, 3, 3);

        calc.mul(1, 2, 3, 4, 5);
        calc.mul(2, 3, 4, 5, 6);

        calc.mul(1, 1, 1, 1, 1, 1);
        calc.mul(2, 2, 2, 2, 2, 2);

        calc.mul(1, 2, 3, 4, 5, 6, 7);
        calc.mul(2, 3, 4, 5, 6, 7, 8);

        calc.mul(1, 2, 3, 4, 5, 6, 7, 8);
        calc.mul(2, 3, 4, 5, 6, 7, 8, 9);

        calc.mul(1, 2, 3, 4, 5, 6, 7, 8, 9);
        calc.mul(2, 3, 4, 5, 6, 7, 8, 9, 10);

        calc.mul(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        calc.mul(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    }
}