/*

Створити двовимірний масив та знайти максимальний елемент масиву.
Значення елементу розрахувати за формулою
y=√(| sin(с)-(4*ln(d ))/i^j | )
i,j-номери елементу в масиві
Значення параметрів с = -1.49, d =23.4

 */
public class Task1 {

    private static double getValue(int i, int j){
        double c = -1.49;
        double d =23.4;
        return Math.sqrt(Math.abs(Math.sin(c) - ((4*Math.log10(d))/Math.pow(i, j))));
    }

    public static void main(String[] args) {
        double[][] matrix = new double[100][100];
        for (int i = 1; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrix[i][j] = getValue(i, j);
            }
        }

        double max = matrix[0][0];
        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }

        //OptionalDouble max = Arrays.stream(matrix).flatMapToDouble(Arrays::stream).max();
        System.out.println(max);

    }
}
