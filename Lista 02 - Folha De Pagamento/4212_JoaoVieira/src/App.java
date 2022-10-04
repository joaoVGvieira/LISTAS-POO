public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu() ;
        int opc;
        do {
            opc = menu.menu_inicializa();
            menu.menu_swtich(opc);
        } while (opc!=0);
    }
}


