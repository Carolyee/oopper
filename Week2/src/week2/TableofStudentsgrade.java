package week2;

public class TableofStudentsgrade {
    public static void main(String[] args) {
        // Print the top border
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table header
        System.out.println();
        System.out.printf("%-12s %-6s %-6s %-6s%n", "Name", "Lab", "Bonus", "Total");
        System.out.printf("%-12s %-6s %-6s %-6s%n", "----", "---", "-----", "-----");

        // Print student data
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Carolye", 22, 8, (22 + 8));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Alina", 8, 80, (8 + 80));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Kanchan", 0, 20, (0 + 20));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Nima", 45, 6, (45 + 6));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Suman", 45, 9, (45 + 9));
    }
}


