import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {
            System.out.println("Chuong trinh quan ly thu vien");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            System.out.println("--------------------------------------------");
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Journal");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" -> {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter author: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();

                        }
                        case "b" -> {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter Day issue: ");
                            int dayIssue = scanner.nextInt();
                            Document newspaper = new Newspaper(id, nxb, number, dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                        }
                        case "c" -> {
                            System.out.print("Enter ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Enter number: ");
                            int number = scanner.nextInt();
                            System.out.print("Enter issue number : ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Enter issue month : ");
                            int issueMonth = scanner.nextInt();
                            Document journal = new Journal(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                        }
                        default -> {
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a" -> {
                            managerDocument.searchByBook();
                        }
                        case "b" -> {
                            managerDocument.searchByNewspaper();
                        }
                        case "c" -> managerDocument.searchByJournal();
                        default -> System.out.println("Invalid");
                    }
                }
                case "3" -> {
                    managerDocument.showInfor();
                }
                case "4" -> {
                    System.out.print("Enter id to remove: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
                }
                case "5" -> {
                    System.exit(5);
                }
                default -> {
                    System.out.println("Invalid");
                }
            }

        }
    }
}
