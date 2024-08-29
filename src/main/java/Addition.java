public class Addition implements Action {
    private String A;
    private String B;

    public Addition(String A, String B) {
        this.A = A;
        this.B = B;
    }

    /**
     * Метод конвертирует поля класса Addition в значения типа int, складывает их и возвращает
     * сумму чисел в виде строки
     * @return возвращает сумму чисел, которые пришли в аргументы конструктора
     * @exception NumberFormatException
     */
    @Override
    public String action() {
        try {
            int result = Integer.parseInt(A) + Integer.parseInt(B);
            return Integer.toString(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("В строке должны быть числа!");
        }
        return null;
    }
}
