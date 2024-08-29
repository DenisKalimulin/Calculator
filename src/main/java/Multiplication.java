public class Multiplication implements Action {
    private String A;
    private String B;

    public Multiplication(String A, String B) {
        this.A = A;
        this.B = B;
    }

    /**
     * Метод конвертирует поля класса Addition в значения типа int, умножает их и возвращает
     *результат умножения в виде строки
     * @return возвращает произведение чисел, которые пришли в аргументы конструктора
     * @exception NumberFormatException
     */
    @Override
    public String action() {
        try {
            int result = Integer.parseInt(A) * Integer.parseInt(B);
            return Integer.toString(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("В строке должны быть числа!");
        }
        return null;
    }
}
