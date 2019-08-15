package view;

import org.opencv.core.Core;
import org.opencv.core.Point;

public class jfPrincipal extends java.lang.Thread {

    static templatem.templatematch temp = new templatem.templatematch();
    static screenshooter.screen2image screen2image = new screenshooter.screen2image();
    static entry.entrada entrada = new entry.entrada();
    static apachepoi.apachepoi apachepoi = new apachepoi.apachepoi();

    
    static String[][] empresas1 = {
{"SOUZA & TAZINAFO"},
{"SUELAINE APARECIDA FORTUNATO"},
{"TATIANE SCARDILLI DA SILVA"},
{"TELES & AZEVEDO"},
{"THIAGO PEREIRA CAETANO"},
{"UESLEI ANDRADE"},
{"VERA LUCIA FERREIRA"},
{"VERA LUCIA ANGELO"},
{"VINICIUS DE SOUZA FORTUNATO"},
{"VITOR FRESSATTI ROCHA"},
{"W. FERREIRA DE OLIVEIRA"},
{"WELLINGTON CARLOS DIAS"},
{"WELLINGTON LEITE SILVA"},
{"WILLIAN BARDAO AGUIAR"},
{"WILSON DE PAULA LICO"},
{"WILTON DE SOUZA LOPES"},
{"WM TRANSP. DE PASSAGEIROS"},
};
    
    static String[][] empresas = {
        {"A ROBERTO FRESSATTI", "001", "012016"},
        {"ACADEMIA DE GINASTICA", "002", ""},
        {"ADAILTON SOARES DO NASCIMENTO", "003", ""},
        {"ADALBERTO RODRIGUES DA SILVA", "004", ""},
        {"ADEMIR NOVAIS", "005", ""},
        {"ADRIANA GUMIERO", "006", ""},
        {"ALDO CAR PECAS", "007", ""},
        {"ALESSANDRA BUENO", "008", ""},
        {"ALESSANDRA CASSIA BONATO", "009", ""},
        {"ALESSANDRO BRAS", "010", ""},
        {"ALEX JUNIOR NOVAIS", "011", "012016"},
        {"ALINE MEIRELLES ROCHA", "012", "012016"},
        {"ANA CLAUDIA RIBEIRO", "013", ""},
        {"ANA MARIA PEREIRA", "014", ""},
        {"ANGELA LUCIA FERNANDES", "015", ""},
        {"ANTONIO ALVES DE BARROS", "016", "012016"},
        {"ANTONIO CAMILO MAGALHAES", "017", "012016"},
        {"ANTONIO JOSE DIAS DA COSTA", "018", "012016"},
        {"ANTONIO MARCOS MESSIAS", "019", ""},
        {"ARISTON KLEVER", "020", ""},
        {"BRIGO & MIOTO", "021", ""},
        {"BRUNO ZANETI", "022", ""},
        {"C. D. J. MATERIAIS DE CONSTRUCAO", "023", ""},
        {"CAMILA DE FATIMA NEGREIROS", "024", ""},
        {"CARLOS ALEXANDRE", "025", ""},
        {"CESAR AP. MATEUS", "026", ""},
        {"CLARINDO CARDOSO", "027", ""},
        {"CLAUDINEI VITOR DIAS", "028", ""},
        {"CLAUDIO APARECIDO MORAIS", "029", ""},
        {"CLEBER LUIS PEREIRA TEODORO", "030", ""},
        {"CONSTRUTORA FJS", "031", ""},
        {"DAYANE PEREIRA ROCHA DOS SANTOS", "032", ""},
        {"DELSON TEODORO DA SILVA", "033", ""},
        {"DIRCEU DE SOUZA", "034", ""},
        {"DULCINEA LUIZA FERREIRA", "035", ""},
        {"EDER CARLOS PEREIRA", "036", ""},
        {"EDILSON ROMUALDO", "037", ""},
        {"EDISON LUIZ PEREIRA", "038", ""},
        {"EDNEI CESAR DA SILVA", "039", ""},
        {"EDVAR BRIGO", "040", ""},
        {"ELIANE DE AZEVEDO", "041", ""},
        {"ELIZABETH ALMEIDA", "042", ""},
        {"ELSON CARLOS FERNANDES", "043", ""},
        {"ELZA CRESTANI ZANETI", "044", ""},
        {"EMERSON PEREIRA BATISTA", "045", ""},
        {"EMPORIUM VIMI", "046", ""},
        {"EURIPEDES GONCALVES", "047", ""},
        {"F.FRANCO", "048", ""},
        {"FABIANE CLEIA PERES BUOSI", "049", ""},
        {"FABIO AZEVEDO DA SILVA", "050", ""},
        {"FABIO LUIS RIBEIRO", "051", ""},
        {"FABRICIO DOMINGUES", "052", ""},
        {"FARMACIA SANTO ANTONIO", "053", ""},
        {"FAUSTO HENRIQUE RIBEIRO", "054", ""},
        {"FERNANDES & ANDRADE", "055", ""},
        {"FERNANDO SANTANA DE MELO", "056", ""},
        {"GEISA DE SOUZA PEREIRA", "057", ""},
        {"GERALDO BERNARDO", "058", ""},
        {"GILBERTO FERNANDO", "059", ""},
        {"GILDO CESAR MOLINARI", "060", ""},
        {"GLAUCO BRUNO", "061", ""},
        {"GUSTAVO SILVA", "062", ""},
        {"HELIO ELIAS", "063", ""},
        {"ISABEL CRISTINA", "064", ""},
        {"JAMIL ALVES", "065", ""},
        {"JAQUELINE FORNEL", "066", ""},
        {"JEAN CARNEIRO CANEDO", "067", ""},
        {"JOACIR GUARNIERI", "068", ""},
        {"JOAO CARLOS DOS REIS", "069", ""},
        {"JOAO DONIZETE HENRIQUE", "070", ""},
        {"JOAO FRESSATTI", "071", ""},
        {"JOAO PAULO GERIN", "072", ""},
        {"JORDANA FRANCELINO", "073", ""},
        {"JOSE ANTONIO BATISTA", "074", ""},
        {"JOSE ANTONIO DE ALMEIDA", "075", ""},
        {"JOSE AUGUSTO GARCIA", "076", ""},
        {"JOSE FERREIRA DE OLIVEIRA", "077", ""},
        {"JOSE HENRIQUE BALDUINO CHAGAS", "078", ""},
        {"JOSE HUMBERTO", "079", ""},
        {"JOSE SINOMAR", "080", ""},
        {"JULIO CESAR", "081", ""},
        {"LEITE & ROMANATO", "082", ""},
        {"LEONTINA BARDON DE MELO", "083", ""},
        {"LISBOA E SILVA", "084", ""},
        {"LOURDES TERIN CARDOSO", "085", ""},
        {"LUCEMARY APARECIDA", "086", ""},
        {"LUCIANA DA SILVA ROUALDO", "087", ""},
        {"LUCIANA TORRES DE MORAES", "088", ""},
        {"LUCIANE APARECIDA DE RIBEIRO", "089", ""},
        {"LUIZ DONIZETE MOREIRA", "090", ""},
        {"LUIZ SERGIO MORIS", "091", ""},
        {"LUIZ SILVA", "092", ""},
        {"M & N FUNILARIA", "093", ""},
        {"M E V ENGENHARIA E CONSTRUCOES", "094", ""},
        {"MACIEL JULIANO GOMES", "095", ""},
        {"MAKIO GOMES DE OLIVEIRA", "096", ""},
        {"MARA ISA DE ALMEIDA", "097", ""},
        {"MARCELO GOMES DE OLIVEIRA", "098", ""},
        {"MARCIA HELENA ZANETI", "099", ""},
        {"MARCO AURELIO FRESSATTI", "100", ""},
        {"MARCOS ANTONIO CASTEJON", "101", ""},
        {"MARCOS ANTONIO DA ROCHA", "102", ""},
        {"MARIA CRISTIANA CARNEIRO", "103", ""},
        {"MARIA DAS GRA�AS MOTA", "104", ""},
        {"MARIA DE LOURDES CARVALHO", "105", ""},
        {"MARIA DE LOURDES LEANDRO OLIVEIRA", "106", ""},
        {"MARIA DO CARMO BIANCHI", "107", ""},
        {"MARIA HELENA ZANETI", "108", ""},
        {"MARIA LAURA MOSCONI", "109", ""},
        {"MARIA LENIEIDE DA SILVA", "110", ""},
        {"MARINEI APARECIDA DE MORAIS", "111", ""},
        {"MAXWELL PEREIRA", "112", ""},
        {"MAYARA SACARDO FERREIRA", "113", ""},
        {"MEIRE ADRIANA DA SILVA CLEMENTE", "114", ""},
        {"MICHELI LOPES MELO", "115", ""},
        {"NAIARA DE SOUZA GABRIEL", "116", ""},
        {"ODETE CARVALHO", "117", ""},
        {"OSVALDO FERREIRA DE OLIVEIRA", "118", ""},
        {"OSWALDO FLAVIO ZANUTIM", "119", ""},
        {"OSWALDO PEREIRA FILHO", "120", ""},
        {"PAULA CRISTINA BREGANTIN", "121", ""},
        {"R. L. BARDAO", "122", ""},
        {"REGINA MAURA SACARDO", "123", ""},
        {"REGINA PAULA FERREIRA", "124", ""},
        {"REINALDO APARECIDO", "125", ""},
        {"RENATO ZANETTI HOMAN", "126", ""},
        {"ROANE MARTINS ULIAN", "127", ""},
        {"ROBERTO BENTO", "128", ""},
        {"ROBERTO LEANDRO SOARES", "129", ""},
        {"RODRIGO LEOPOLDO BARDAO", "130", ""},
        {"ROGERIO GUERREIRO", "131", ""},
        {"ROMANATO E BATISTA", "132", ""},
        {"ROMILDA APARECIDA", "133", ""},
        {"RONIE EDSON", "134", ""},
        {"ROSINEI ANGELA", "135", ""},
        {"S & E DROGARIA", "136", ""},
        {"SANDRA REGINA FREITAS", "137", ""},
        {"SELMA REGINA", "138", ""},
        {"SERRARIA SANTO ANTONIO", "139", ""},
        {"SILVA & FRESSATTI", "140", ""},
        {"SUELAINE APARECIDA", "141", ""},
        {"TATIANE SCARDILLI", "142", ""},
        {"TELES & AZEVEDO", "143", ""},
        {"THIAGO PEREIRA CAETANO", "144", ""},
        {"VERA LUCIA ANGELO", "145", ""},
        {"VERA LUCIA FERREIRA", "146", ""},
        {"VITOR FRESSATTI", "147", ""},
        {"WELLINGTON CARLOS DIAS", "148", ""},
        {"WELLINGTON LEITE SILVA", "149", ""},
        {"WILLIAN BARDAO AGUIAR", "150", ""},
        {"WILSON DE PAULA LICO", "151", ""},
        {"WILTON DE SOUZA LOPES", "152", ""},
        {"WM TRANSP. DE PASSAGEIROS", "153", ""}};
    
    static String template = "E:\\Samples\\template\\";
    

    public static void main(String[] args) throws Exception {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        //arrasta(450,200,450,600);
        //gera aproximadamente 50 novas em 2 horas
        maximizasedif();
        modulogerar();
        //competencia();
        //modulofinalizar();
        //modulotransmitir();
        //modulotransmitir2();
        //modulotransmitir();
        //modulotransmitir4();
        //selecionarEmpresa();
        //contribuinte();
        //maximizasedif();
    }
    /*
     */

    public static void modulogerar1() throws Exception {
        if (teste2(template+"botaoabrir.png",260,56)){
            //System.out.println("A porcentagem é "+temp.getmaxval()*100+"%");    
        seleciona(309,77);}
        if (teste2(template+"templatedetalhar.png",159,77)){
        seleciona(70,434);
        }
        if (teste2(template+"templatenovodeclaracao.png",650,141)){
        selecionarEmpresa1();
        }
        else {
            modulogerar1();
        }
    }
    public static void selecionarEmpresa1(){
    
    }

    public static void modulogerar() throws Exception {
        if (teste2("E:\\Samples\\templatehome.png", 6, 26)) {
        }
        if (teste2("E:\\Samples\\templatehome1.png", 2, 55)) {
            seleciona(300, 80);
        }
        if (teste2("E:\\Samples\\templatedetalhar.png", 155, 76)) {
            seleciona(70, 434);
        }
        if (teste2("E:\\Samples\\templatenovo2.png", 697, 139)) {
            //seleciona(70,173);
            selecionarEmpresa();
        } else {
            modulogerar();
        }
    }

    public static void selecionarEmpresa() throws Exception {
        for (int a = 2016; a <= 2018; a++) {//seleção de ano
            for (int m = 1; m <= 12; m++) {//seleção de m�s
                for (int i = 0; i <= 152; i++) {//seleção de empresa (ver String empresas)

                    if (apachepoi.consultar(m, a, i)) {
                        System.out.println("Empresa: " + empresas[i][0] + ", Competencia " + m + " de " + a + " Ja Gerado");
                    } //316, 267
                    else {
                        System.out.println("\nEmpresa: " + empresas[i][0] + ", Competencia " + m + " de " + a + " Nao Gerado");
                        Thread.sleep(700);
                        seleciona(66, 173);
                        modulotravado();
                        if (teste3(template + "templatenovo1.png", 182, 131, 66, 173) && teste(template + "templatenovo2.png", 181, 145)) {
                            while (teste2(template + "templatetravado.png", 316, 267)) {
                            }
                            seleciona(207, 152); //181, 145
                        } //else {selecionarEmpresa();}
                        entrada.digitar(empresas[i][0]);
                        System.out.println("Empresa atualmente selecionada: " + empresas[i][0]);
                        entrada.digitar("$");
                        if (m < 10) {
                            entrada.digitar("0" + m + a);
                        } else {
                            entrada.digitar("" + m + a);
                        }//180 285
                        entrada.digitar("$ ");
                        if (teste(template + "templatecarregado.png", 229, 275) && teste(template + "templatecarregado1.png", 181, 286)) {
                            Thread.sleep(300);
                            entrada.digitar("%$");
                            Thread.sleep(300);
                            entrada.digitar("0$$$");
                            Thread.sleep(300);
                            entrada.digitar("1$");
                            Thread.sleep(300);
                            seleciona(74, 262);
                        }
                        modulofinalizar(m, a, i);
                    }
                }
            }
        }
    }

    public static void modulotravado() throws Exception {
        if (teste3(template + "templatenovo1.png", 182, 131, 66, 173)) {
            if (!teste2(template + "templatetravado.png", 316, 267)) {
                seleciona(66, 173);
            } else {
                modulotravado();
            }
        }
    }

    public static void modulofinalizar(int m, int a, int i) throws Exception {
        if (teste2(template + "templateincorreto.png", 319, 278)) {
            seleciona(645, 405);
            Thread.sleep(500);
            seleciona(71, 290);
        }
        if (teste2(template + "templateduplicidade.png", 310, 294)) {
            Thread.sleep(500);
            seleciona(660, 442);
            Thread.sleep(500);
            seleciona(71, 290);
            Thread.sleep(500);
        }
        Thread.sleep(1250);
        if (teste2(template + "templatefinalizado.png", 520, 221)) {
            apachepoi.setdata(m, a, i);
            //seleciona(59,261);
        } else {
            modulofinalizar(m, a, i);
        }
    }

    public static void modulotransmitir() throws Exception {
        if (teste("E:\\Samples\\templatetransmitir1.png", 208, 52)) {
            seleciona(279, 79);
            if (teste("E:\\Samples\\template154x82y.png", 154, 80)) {
		//	seleciona(74,438);
                //modulotransmitir2();
                contribuinte();
            }
        }
    }

    public static void modulotransmitir2() throws Exception {
        Thread.sleep(3000);
        if (teste2("E:\\Samples\\templatejatransmitido.png", 178, 346)) {
            seleciona(98, 96);
            System.out.println("Transmitida, pulando para a pr�xima");
            modulotransmitir2();
        } else {
            seleciona(68, 584);
            modulotransmitir3();
        }
    }

    public static void modulotransmitir3() throws Exception {
        System.out.println("modulo3");
        if (teste("E:\\Samples\\templatetrocardetela.png", 3, 55)) {
            seleciona(191, 46);
            modulotransmitir4();
        }
    }

    public static void modulotransmitir4() throws Exception {
        Thread.sleep(200);
        if (teste2("E:\\Samples\\templategerar1.png", 12, 62)) {
            seleciona(41, 88);
            Thread.sleep(4000);
            seleciona(106, 172);
            Thread.sleep(10000);
            if (teste("E:\\Samples\\templateassinar.png", 378, 316)) {
                seleciona(520, 430);
            }
            seleciona(532, 453);
            Thread.sleep(7000);
            if (teste("E:\\Samples\\templatefinalizado4.png", 325, 293)) {
                seleciona(648, 400);
            }
            modulotransmitir4();
        } else if (teste2("E:\\Samples\\templategerar2.png", 92, 62)) {
            seleciona(109, 89);
            Thread.sleep(4000);
            if (teste2("E:\\Samples\\templatetransmitirpendente.png", 331, 238)) {
                seleciona(98, 172);
                Thread.sleep(3000);
                if (teste2("E:\\Samples\\templateidentificacao.png", 313, 266)) {
                    entry.entrada entrada = new entry.entrada();
                    entrada.digitar("LUIZINHOIPUA$");
                    Thread.sleep(1000);
                    entrada.digitar("g9uzmap9ef$ ");
                    Thread.sleep(5000);
                    if (teste2("E:\\Samples\\templatefinalizado3.png", 425, 290)) {
                        seleciona(510, 408);
                    }
                    //entrada.digitar("$");
                    if (teste("E:\\Samples\\templaterecibo.png", 573, 20)) {
                        seleciona(1007, 42);
                        modulotransmitir5();
                    }
                } else {
                    seleciona(875, 206);
                    Thread.sleep(1000);
                    seleciona(787, 313);
                }
            }
        } else {
            modulotransmitir4();
        }
    }

    public static void modulotransmitir5() throws Exception {
        if (teste("E:\\Samples\\templatefechar.png", 16, 639)) {
            seleciona(84, 678);
            Thread.sleep(1000);
            seleciona(75, 46);
            Thread.sleep(1000);
            seleciona(279, 82);
            if (teste("E:\\Samples\\template154x82y.png", 154, 82)) {
                seleciona(74, 684);
                modulotransmitir();
            }
        }
    }

    public static void arrasta(int x1, int y1, int x2, int y2) {
        entry.entrada entrada = new entry.entrada();
        entrada.arrasta(x1, y1, x2, y2);
    }

    public static void seleciona(int x, int y) {
        entry.entrada entrada = new entry.entrada();
        entrada.movermouse(x, y);
        entrada.mouseclick();
    }

    public static void segura(int x, int y, int milis) throws Exception {
        entry.entrada entrada = new entry.entrada();
        entrada.movermouse(x, y);
        entrada.mousesegura(milis);
    }

    //teste com recursão:

    public static boolean teste(String infile1, int x, int y) throws Exception {
        screen2image.robo();
        temp.templatematch1(infile1);
        if(temp.getmaxval()<0.99){
        return false;}
        System.out.println("comparando " + infile1);
        if (temp.getmatchLoc().equals(new Point(x, y))) {

            System.out.println("condição teste 1");
            return true;
        } else {
            System.out.println("recursão teste 1");
            Thread.sleep(2000);
            //screen2image.robo();
            teste(infile1, x, y);
            return true;
        }
    }

    //teste sem recursão:

    public static boolean teste2(String infile1, int x, int y) throws Exception {
        screen2image.robo();
        temp.templatematch1(infile1);
        if(temp.getmaxval()<0.99){
        return false;}
        System.out.println("comparando " + infile1);
        if (temp.getmatchLoc().equals(new Point(x, y))) {

            System.out.println("condição teste 2");
            return true;
        } else {
            System.out.println("recursão teste 2");
			//Thread.sleep(1000);
            //screen2image.robo();
            //teste(infile1,x,y);
            return false;
        }
    }

    //teste com recursão e clique

    public static boolean teste3(String infile1, int x, int y, int cordx, int cordy) throws Exception {
        screen2image.robo();
        temp.templatematch1(infile1);
        if(temp.getmaxval()<0.99){
        return false;}
        System.out.println("comparando " + infile1);
        if (temp.getmatchLoc().equals(new Point(x, y))) {
            System.out.println("condição teste 3");
            return true;
        } else {
            System.out.println("recursão teste 3");
            Thread.sleep(1000);
            //screen2image.robo();
            seleciona(cordx, cordy);
            teste3(infile1, x, y, cordx, cordy);
            return true;
        }
    }

    //teste sem recursão e clique

    public static boolean teste4(String infile1, int x, int y, int cordx, int cordy) throws Exception {
        screen2image.robo();
        temp.templatematch1(infile1);
        if(temp.getmaxval()<0.99){
        return false;}
        System.out.println("comparando " + infile1);
        if (temp.getmatchLoc().equals(new Point(x, y))) {

            System.out.println("condição teste 4");
            return true;
        } else {
            System.out.println("recursão teste 4");
            seleciona(cordx, cordy);
			//Thread.sleep(1000);
            //screen2image.robo();
            //teste(infile1,x,y);
            return false;
        }
    }

    public static void contribuinte() throws Exception {
        //segura(1006,693,2200);
        screen2image.robo();
        temp.templatematch1(template + "templatecontribuinteselecionado.png");
        int tempy1 = temp.getmatchLocY();
        if (teste2(template + "templatemaximizado.png", 383, 0)) {
            seleciona(168, tempy1);
        }
        screen2image.robo();
        temp.templatematch1(template + "templatenaotransmitido1.png");
        if (temp.getmatchLocX() == 700) {
            System.out.println("Já Transmitida!");
            if (teste2(template + "templatemaximizado.png", 383, 0)) {
                seleciona(500, temp.getmatchLocY() + 3);
            }
            Thread.sleep(2000);
            if (teste2(template + "templatemaximizado.png", 383, 0)) {
                seleciona(500, temp.getmatchLocY() + 3);
            }
            seleciona(64, 583);
            modulotransmitir3();
        } else {
            seleciona(168, tempy1);
            Thread.sleep(2000);
            seleciona(1008, 679);
            contribuinte();
        }
    }

    public static void maximizasedif() throws Exception {

        screen2image.robo();
        temp.templatematch1(template + "templatesedif.png");
        seleciona(temp.getmatchLocX() + 30, temp.getmatchLocY() + 10);
    }

    public static boolean matchtrue(String infile, int x, int y) throws Exception {
        try {
            screen2image.robo();
        } catch (Exception e) {
        }
        temp.templatematch1(infile);
        if(temp.getmaxval()<0.99){
        return false;}
        if (temp.getmatchLoc().equals(new Point(x, y))) {
            return true;
        } else {
            matchtrue(infile, x, y);
            return true;
        }
    }

    public static void testematch(String caminho) throws Exception {
        screen2image.robo();
        temp.templatematch1(template + caminho);
        seleciona(temp.getmatchLocX(), temp.getmatchLocY());
    }
}

//TODO
/*
- Reformular totalmente a função contribuinte.
- Criar condição para loops apenas executarem se o sedif estiver maximizado.



*/
