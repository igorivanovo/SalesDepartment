public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 45, 87, 56, 90, 23, 100, 23, 110, 80};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(" МАКСИМАЛЬНАЯ ПРОДАЖА  " + salesManager.max() + " РУБ.");
        System.out.println(" МИНИМАЛЬНАЯ  " + salesManager.min());
        System.out.println("Усредненная продажа  " + salesManager.average());
    }
}