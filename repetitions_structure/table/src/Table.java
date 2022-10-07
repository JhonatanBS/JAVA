public class Table {
    public int table;

    public Table(int table) {
        this.table = table;
    }

    public void choiceTable() {
        int i;

        for(i = 1; i <= 10; i++) {
            System.out.printf("| %d + %d = %d |\n", this.table, i, i * this.table);
        }
    }


}
