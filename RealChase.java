import java.io.*;
import java.text.*;
import java.util.Random;
class RealChase{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String builder[]={"Sobha","Prestige","Brigade","Embassy"};
    String sobha[]={"Sobha City-Hebbal","Sobha Dew Flower-Jayanagar"};
    int sobhacityp[]={8400000,8350000,8450000,10000000,9000000,10500000,12000000,11000000,12500000};
    String sobhacityn[]={"2BHK(GF)","2BHK(FF)","2BHK(SF)","3BHK(GF)","3BHK(FF)","3BHK(SF)","4BHK(GF)","4BHK(FF)","4BHK(SF)"};
    String sobhacitys[]={"1400","1300","1600","2000","1900","2150","2200","2100","2250"};
    int sobhadewp[]={23000000,23500000,24500000,33000000,33500000,34500000};
    String sobhadewn[]={"3BHK(GF)","3BHK(FF)","3BHK(SF)","4BHK(GF)","4BHK(FF)","4BHK(SF)"};
    String sobhadews[]={"2400","2500","2700","3100","3200","3400"};
    String prestige[]={"Prestige Agusta Golf Village-Hormavu"};
    int agustap[]={14000000,26000000};
    String agustan[]={"3BHK","4BHK"};
    String agustas[]={"2400","4300"};
    String brigade[]={"Brigade Exotica-Old Madras Road,Indranagar","Brigade Sonata-Palace Road,Shivaji Nagar"};
    int brigexop[]={17000000,16000000,18000000,18000000,17000000,19000000};
    String brigexon[]={"4BHK(GF)","4BHK(FF)","4BHK(SF)","5BHK(GF)","5BHK(FF)","5BHK(SF)"};
    String brigexos[]={"3600","3400","3800","3800","3600","4000",};
    int brigsonp[]={43000000,43500000,44000000,50000000,50500000,51000000};
    String brigsonn[]={"3BHK(GF)","3BHK(FF)","3BHK(SF)","4BHK(GF)","4BHK(FF)","4BHK(SF)"};
    String brigsons[]={"2500","2600","2700","2800","2900","3000"};
    String embassy[]={"Embassy Lake Terraces-Hebbal","Embassy Pristine-Koramangala"};
    int emblakep[]={35000000,34000000,36000000,48600000,47600000,49600000,110000000,10000000,111000000};
    String emblaken[]={"3BHK(GF)","3BHK(FF)","3BHK(SF)","4BHK(GF)","4BHK(FF)","4BHK(SF)","5BHK(GF)","5BHK(FF)","5BHK(SF)"};
    String emblakes[]={"3500","3300","3700","5000","4800","5200","8300","8100","8500"};
    int embprisp[]={17000000,18500000,20000000,30000000,31000000,32000000};
    String embprisn[]={"3BHK(GF)","3BHK(FF)","3BHK(SF)","4BHK(GF)","4BHK(FF)","4BHK(SF)"};
    String embpriss[]={"2000","2300","2600","3600","3800","4000"};
    String name;
    long num;
    boolean valid=false;
    boolean check=false;
    boolean menu=true;
    boolean em;
    int cho; int build;
    int sob; 
    int sobcity; int sobcityverif; int sobcityverif2; int sobcityverif3;
    int sobdew; int sobdewverif; int sobdewverif2;
    int pres; int agusta; 
    int agustaverif; int agustaverif2;
    int brig;
    int brigex; int brigexverif; int brigexverif2;
    int brigson; int brigsonverif; int brigsonverif2;
    int emb;
    int emblak; int emblakverif; int emblakverif2; int emblakverif3;
    int embpri; int embpriverif; int embpriverif2;
    String cartname[]=new String[100]; int cartprice[]=new int[100]; String cartsqft[]=new String[100]; 
    int flag=0; String cart[]=new String[100]; int flag1=0;
    int nobill; int totprice=0; Integer intRandNumber; String orderNum; int member; String EMAIL_FORMAT,strEmailId,strEmailId2; long loan; double rate=0.00854166666666666666666666666667; 
    double time,emi; int emiverif; 
    double nume,denom;
    public void getInput() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("********************************************************************************Welcome to Realchase*********************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("We are the leading property website  where you can reserve the property you choose.");
        System.out.println();
        System.out.println("Before choosing your property, please enter your name and contact information:-");
        System.out.println("Please enter your Name --> ");
        while(true) {
            name = b.readLine();
            for (int i=0;i<name.length();i++) {
                char c = name.charAt(i);
                if (Character.isLetter(c)==true) {
                    check=true;
                }
                else {
                    if(c!=' ')
                    {
                        check=false;
                        break;
                    }
                }
            }

            if (check==false){ 
                System.out.println("Invalid name. Numbers and special characters not accepted. Try again. ");
            }

            else{
                System.out.println("Your name has been accepted");
                break;
            }
        }
        if(name.length()>20)
        {
            name=name.substring(0,20);
            System.out.println("Your name is more than 20 characters. The first 20 characters will be saved.");
        }
        System.out.println();
        System.out.println("Enter your Email ID to receive offers, and to receive info on your property-->");
        while(true){
            strEmailId=b.readLine();
            String EMAIL_FORMAT= "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            em= strEmailId.matches(EMAIL_FORMAT);
            if(em==true){
                System.out.println("Please confirm your Email ID");
                while(true){
                    strEmailId2=b.readLine();
                    if(strEmailId2.equals(strEmailId)){
                        System.out.println("Email ID confirmed.");
                        break;
                    }
                    else{
                        System.out.println("Email ID does not match, please enter the correct id.");
                    }
                }
                break;
            }
            else{
                System.out.println("Invalid E-Mail ID.");
            }
        }
        while (valid==false)
        {
            System.out.println();
            System.out.println();
            try
            {

                System.out.print("Please enter your Phone Number --> ");
                num=Long.parseLong(b.readLine());
            }

            catch(Exception e)
            {
                valid=false;
            }
            System.out.println();
            valid=validate();
        }
        Menu();
    }

    public boolean validate()
    {
        if (num<9999999999l && num>999999991)
        {
            System.out.println();
            return(true);
        }

        else
        {
            System.out.println("Please re-enter your phone number.");
            return (false);
        }
    }

    public void Menu() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************************");
        System.out.println();
        while (true)
        {

            System.out.println("Choose your option from the below list");
            System.out.println();
            System.out.println("1. Go to Property List");
            System.out.println("2. View Bill");
            System.out.println("3. Exit Program");
            System.out.println();
            System.out.print("Please enter your choice -->  ");

            while (true)
            { 
                try
                {
                    cho=Integer.parseInt(b.readLine());
                    System.out.println();
                    if(cho!=1&&cho!=2&&cho!=3){
                        System.out.println("Please re-enter your number.");
                    }
                    else{ 
                        break;
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }
            }
            switch(cho)
            {

                case 1 :    getList();
                break;
                case 2 :    getReceipt();
                break;
                case 3 :    System.out.println("Thank you for visting Realchase. We hope you were satisfied. Come again!"); 
                System.exit(0);
                break;
                default:    System.out.println ("Please re-enter your number."); 
                System.out.println("*************************************************************************************************************************************************************************************");
                break;

            }

        }
    }

    public void getList() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("*************************************************************************************************************************************************************************************");
        System.out.println();
        System.out.println("Welcome to the Property List");
        System.out.println();
        while(menu==true){
            System.out.println("These are the list of builders available in Bangalore:-");
            for(int i=0;i<4;i++){
                System.out.println((i+1)+"."+builder[i]); 
            }
            System.out.println("5.Go to Main Menu");
            System.out.println();
            System.out.print("Please enter your choice -->  ");
            while (true)
            {
                try
                {
                    build=Integer.parseInt(b.readLine());
                    if(build!=1&&build!=2&&build!=3&&build!=4&&build!=5){
                        System.out.println("Please re-enter the number.");
                    }
                    else{
                        break;
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }
            }
            System.out.println();
            System.out.println("*************************************************************************************************************************************************************************************");

            switch(build){

                case 1:       getSobha();
                break;

                case 2:       getPrestige();
                break;

                case 3:       getBrigade();
                break;

                case 4:       getEmbassy();
                break;

                case 5:       Menu();
                break;

                default:    System.out.println("Please re-enter your number.");
                break;
            }

        }
    }

    public void getSobha() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available Sobha properties are:");

        for(int i=0;i<2;i++){
            System.out.println((i+1)+"."+sobha[i]);
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("To choose Sobha City enter 1 or to choose Sobha Dew Flower enter 2. Enter 3 to go to the menu.");
                sob=Integer.parseInt(b.readLine());
                if(sob==1){
                    System.out.println("*************************************************************************************************************************************************************************************");                   
                    getSobhaCity();
                    break;
                }
                else if(sob==2){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getSobhaDew();
                    break;
                }
                else if(sob==3){
                    getList();
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }
            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(sob){

            case 1:      getSobhaCity();
            break;

            case 2:      getSobhaDew();
            break;

            default: System.out.println();
            break;
        }

    }            

    public void getSobhaCity() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available apartments at Sobha City-Hebbal are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<sobhacityn.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",sobhacityn[i]);System.out.printf("%-19s",sobhacitys[i]);customFormat("###,###,###",sobhacityp[i]);
            System.out.println();
        }   

        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                sobcity=Integer.parseInt(b.readLine());
                if(sobcity==0){
                    getList();
                    break;
                }
                else if(sobcity==1||sobcity==2||sobcity==3||sobcity==4||sobcity==5||sobcity==6||sobcity==7||sobcity==8||sobcity==9){
                    cart[flag1]=sobha[sob-1];
                    flag1++;
                    break;
                }
                else{
                    System.out.println("Please re-enter your number.");
                }
            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(sobcity){
            case 1:      System.out.println();
            System.out.println("You have chosen a 2BHK(GF) flat with 1400 sqft, for Rs 8,400,000 with a complementary parking space.");                    
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif=Integer.parseInt(b.readLine());
                    if(sobcityverif==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:      System.out.println();
            System.out.println("You have chosen a 2BHK(FF) flat with 1300 sqft, for Rs 8,350,000 with a complementary parking space.");                    
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif=Integer.parseInt(b.readLine());
                    if(sobcityverif==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif==2){                        
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 3:      System.out.println();
            System.out.println("You have chosen a 2BHK(SF) flat with 1600 sqft, for Rs 8,450,000 with a complementary parking space.");                    
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif=Integer.parseInt(b.readLine());
                    if(sobcityverif==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 4:     System.out.println();
            System.out.println("You have chosen a 3BHK(GF) flat with 2000 sqft, for Rs 10,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif2=Integer.parseInt(b.readLine());
                    if(sobcityverif2==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif2==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 5:     System.out.println();
            System.out.println("You have chosen a 3BHK(FF) flat with 1900 sqft, for Rs 9,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif2=Integer.parseInt(b.readLine());
                    if(sobcityverif2==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif2==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 6:     System.out.println();
            System.out.println("You have chosen a 3BHK(SF) flat with 2150 sqft, for Rs 10,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif2=Integer.parseInt(b.readLine());
                    if(sobcityverif2==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif2==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 7:     System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 2200 sqft, for Rs 12,000,000 with a complementary parking space.");            
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif3=Integer.parseInt(b.readLine());
                    if(sobcityverif3==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif3==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 8:     System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 2100 sqft, for Rs 11,000,000 with a complementary parking space.");            
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif3=Integer.parseInt(b.readLine());
                    if(sobcityverif3==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif3==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 9:     System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 2250 sqft, for Rs 12,500,000 with a complementary parking space.");            
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobcityverif3=Integer.parseInt(b.readLine());
                    if(sobcityverif3==1){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobcityverif3==2){
                        cartname[flag]=sobhacityn[sobcity-1];
                        cartprice[flag]=sobhacityp[sobcity-1];
                        cartsqft[flag]=sobhacitys[sobcity-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            default:     System.out.println("Please re-enter your choice");
            break;
        }
    }

    public void getSobhaDew() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available apartments at Sobha Dew Flower-Jayanagar are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<sobhadewn.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",sobhadewn[i]);System.out.printf("%-19s",sobhadews[i]);customFormat("###,###,###",sobhadewp[i]);
            System.out.println();
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                sobdew=Integer.parseInt(b.readLine());
                if(sobdew==0){
                    getList();
                    break;
                }
                else if(sobdew==1||sobdew==2||sobdew==3||sobdew==4||sobdew==5||sobdew==6){
                    cart[flag1]=sobha[sob-1];
                    flag1++;
                    break;
                }
                else{
                    System.out.println("Please re-enter your number.");
                }

            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(sobdew){
            case 1:      System.out.println();
            System.out.println("You have chosen a 3BHK(GF) flat with 2400 sqft, for  Rs 23,000,000 with a complementary parking space.");          
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif=Integer.parseInt(b.readLine());
                    if(sobdewverif==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:      System.out.println();
            System.out.println("You have chosen a 3BHK(FF) flat with 2500 sqft, for  Rs 23,500,000 with a complementary parking space.");          
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif=Integer.parseInt(b.readLine());
                    if(sobdewverif==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 3:      System.out.println();
            System.out.println("You have chosen a 3BHK(SF) flat with 2700 sqft, for  Rs 24,500,000 with a complementary parking space.");          
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif=Integer.parseInt(b.readLine());
                    if(sobdewverif==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 4:     System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 3100 sqft, for Rs 33,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif2=Integer.parseInt(b.readLine());
                    if(sobdewverif2==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif2==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 5:     System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 3200 sqft, for Rs 33,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif2=Integer.parseInt(b.readLine());
                    if(sobdewverif2==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif2==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 6:     System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 3400 sqft, for Rs 34,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    sobdewverif2=Integer.parseInt(b.readLine());
                    if(sobdewverif2==1){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(sobdewverif2==2){
                        cartname[flag]=sobhadewn[sobdew-1];
                        cartprice[flag]=sobhadewp[sobdew-1];
                        cartsqft[flag]=sobhadews[sobdew-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            default:     System.out.println("Please re-enter your choice");
            break;
        }
    }

    public void getPrestige() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available Prestige properties are:");

        for(int i=0;i<1;i++){
            System.out.println((i+1)+"."+prestige[i]);
        }

        while(true){
            try{
                System.out.println();
                System.out.println("To choose Prestige Agusta Golf Village enter 1. Enter 2 to go menu.");
                pres=Integer.parseInt(b.readLine());
                if(pres==1){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getPrestigeAgusta();
                    break;
                }
                else if(pres==2){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getList();
                    break;
                }
                else{ 
                    System.out.println("Please re-enter the number.");
                }

            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

    }

    public void getPrestigeAgusta() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available villas at Prestige Agusta Golf Village-Hormavu are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<agustan.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",agustan[i]);System.out.printf("%-19s",agustas[i]);customFormat("###,###,###",agustap[i]);
            System.out.println();
        }

        while(true){
            try{
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                agusta=Integer.parseInt(b.readLine());
                if(agusta==0){
                    getList();
                    break;
                }
                else if(agusta==1||agusta==2){
                    cart[flag1]=prestige[pres-1];
                    flag1++;
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }
            }
            catch(Exception e){
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(agusta){
            case 1:     System.out.println();
            System.out.println("You have chosen a 3BHK villa with 2400 sqft, for Rs 14,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    agustaverif=Integer.parseInt(b.readLine());
                    if(agustaverif==1){
                        cartname[flag]=agustan[agusta-1];
                        cartprice[flag]=agustap[agusta-1];
                        cartsqft[flag]=agustas[agusta-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(agustaverif==2){
                        cartname[flag]=agustan[agusta-1];
                        cartprice[flag]=agustap[agusta-1];
                        cartsqft[flag]=agustas[agusta-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:     System.out.println();
            System.out.println("You have chosen a 4BHK villa with 4300 sqft, for Rs 26,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    agustaverif2=Integer.parseInt(b.readLine());
                    if(agustaverif2==1){
                        cartname[flag]=agustan[agusta-1];
                        cartprice[flag]=agustap[agusta-1];
                        cartsqft[flag]=agustas[agusta-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(agustaverif2==2){
                        cartname[flag]=agustan[agusta-1];
                        cartprice[flag]=agustap[agusta-1];
                        cartsqft[flag]=agustas[agusta-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }

                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;

            default:     System.out.println("Please re-enter your choice");
            break;
        }
    }

    public void getBrigade() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available Brigade properties are:");
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"."+brigade[i]);
        }   
        while(true){
            try
            {
                System.out.println();
                System.out.println("To choose Brigade Exotica enter 1 or to choose Brigade Sonata enter 2. Enter 3 to go the menu.");
                brig=Integer.parseInt(b.readLine());
                if(brig==1){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getBrigadeExotica();
                    break;
                }
                else if(brig==2){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getBrigadeSonata();
                    break;
                }
                else if(brig==3){
                    getList();
                    break;
                }
                else{ 
                    System.out.println("Please re-enter the number.");
                }

            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(brig){
            case 1:      getBrigadeExotica();
            break;

            case 2:      getBrigadeSonata();
            break;

            default: System.out.println("Please re-enter your choice.");
            break;
        }

    }

    public void getBrigadeExotica() throws IOException,InterruptedException
    {
        System.out.println("The available apartments at Brigade Exotica-Old Madras Road,Indranagar are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<brigexon.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",brigexon[i]);System.out.printf("%-19s",brigexos[i]);customFormat("###,###,###",brigexop[i]);
            System.out.println();
        }
        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                brigex=Integer.parseInt(b.readLine());
                if(brigex==0){
                    getList();
                    break;
                }
                else if(brigex==1||brigex==2||brigex==3||brigex==4||brigex==5||brigex==6){
                    cart[flag1]=brigade[brig-1];
                    flag1++;
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }  
            }
            catch(Exception e)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }

        }

        switch(brigex){
            case 1:      System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 3600 sqft, for Rs 17,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif=Integer.parseInt(b.readLine());
                    if(brigexverif==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:      System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 3400 sqft, for Rs 16,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif=Integer.parseInt(b.readLine());
                    if(brigexverif==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 3:      System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 3800 sqft, for Rs 18,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif=Integer.parseInt(b.readLine());
                    if(brigexverif==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 4:     System.out.println();
            System.out.println("You have chosen a 5BHK(GF) flat with 3800 sqft, for Rs 18,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif2=Integer.parseInt(b.readLine());
                    if(brigexverif2==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif2==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 5:     System.out.println();
            System.out.println("You have chosen a 5BHK(FF) flat with 3600 sqft, for Rs 17,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif2=Integer.parseInt(b.readLine());
                    if(brigexverif2==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif2==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 6:     System.out.println();
            System.out.println("You have chosen a 5BHK(SF) flat with 4000 sqft, for Rs 19,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigexverif2=Integer.parseInt(b.readLine());
                    if(brigexverif2==1){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigexverif2==2){
                        cartname[flag]=brigexon[brigex-1];
                        cartprice[flag]=brigexop[brigex-1];
                        cartsqft[flag]=brigexos[brigex-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            default:     System.out.println("Please re-enter your choice");
            break;
        }
    }

    public void getBrigadeSonata() throws IOException,InterruptedException
    {
        System.out.println("The available apartments at Brigade Sonata-Palace Road,Shivaji Nagar are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();

        for(int i=0;i<brigsonn.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",brigsonn[i]);System.out.printf("%-19s",brigsons[i]);customFormat("###,###,###",brigsonp[i]);
            System.out.println();
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                brigson=Integer.parseInt(b.readLine());
                if(brigson==0){
                    getList();
                    break;
                }
                else if(brigson==1||brigson==2||brigson==3||brigson==4||brigson==5||brigson==6){
                    cart[flag1]=brigade[brig-1];
                    flag1++;
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }
            }
            catch(Exception e)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(brigson){
            case 1:      System.out.println();
            System.out.println("You have chosen a 3BHK(GF) flat with 2500 sqft, for Rs 43,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2");
            while(true){
                try{
                    brigsonverif=Integer.parseInt(b.readLine());
                    if(brigsonverif==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:      System.out.println();
            System.out.println("You have chosen a 3BHK(FF) flat with 2600 sqft, for Rs 43,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2");
            while(true){
                try{
                    brigsonverif=Integer.parseInt(b.readLine());
                    if(brigsonverif==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 3:      System.out.println();
            System.out.println("You have chosen a 3BHK(SF) flat with 2700 sqft, for Rs 44,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2");
            while(true){
                try{
                    brigsonverif=Integer.parseInt(b.readLine());
                    if(brigsonverif==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 4:     System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 2800 sqft, for Rs 50,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigsonverif2=Integer.parseInt(b.readLine());
                    if(brigsonverif2==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif2==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 5:     System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 2900 sqft, for Rs 50,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigsonverif2=Integer.parseInt(b.readLine());
                    if(brigsonverif2==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif2==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 6:     System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 3000 sqft, for Rs 51,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    brigsonverif2=Integer.parseInt(b.readLine());
                    if(brigsonverif2==1){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(brigsonverif2==2){
                        cartname[flag]=brigsonn[brigson-1];
                        cartprice[flag]=brigsonp[brigson-1];
                        cartsqft[flag]=brigsons[brigson-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            default:     System.out.println();
            break;
        }

    }

    public void getEmbassy() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available Embassy properties are:");

        for(int i=0;i<2;i++){
            System.out.println((i+1)+"."+embassy[i]);
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("To choose Embassy Lake Terraces enter 1 or to choose Embassy Pristine enter 2. Enter 3 to go the menu.");
                emb=Integer.parseInt(b.readLine());
                if(emb==1){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getEmbassyLake();
                    break;
                }
                else if(emb==2){
                    System.out.println("*************************************************************************************************************************************************************************************");
                    getEmbassyPristine();
                    break;
                }
                else if(emb==3){
                    getList();
                    break;
                }
                else{ 
                    System.out.println("Please re-enter your number");
                }
            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }

        }

        switch(emb){
            case 1:      getEmbassyLake();
            break;

            case 2:      getEmbassyPristine();
            break;

            default: System.out.println("Please re-enter your choice.");
            break;
        }

    }

    public void getEmbassyLake() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available apartments at Embassy Lake Terraces-Hebbal are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<emblaken.length;i++){
            System.out.printf("%-10d",(i+1));System.out.printf("%-18s",emblaken[i]);System.out.printf("%-19s",emblakes[i]);customFormat("###,###,###",emblakep[i]);
            System.out.println();
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                emblak=Integer.parseInt(b.readLine());
                if(emblak==0){
                    getList();
                    break;
                }
                else if(emblak==1||emblak==2||emblak==3||emblak==4||emblak==5||emblak==6||emblak==7||emblak==8||emblak==9){
                    cart[flag1]=embassy[emb-1];
                    flag1++; 
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }
            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(emblak){
            case 1:      System.out.println();
            System.out.println("You have chosen a 3BHK(GF) flat with 3500 sqft, for Rs 35,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif=Integer.parseInt(b.readLine());
                    if(emblakverif==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak];
                        cartsqft[flag]=emblakes[emblak];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 2:      System.out.println();
            System.out.println("You have chosen a 3BHK(FF) flat with 3300 sqft, for Rs 34,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif=Integer.parseInt(b.readLine());
                    if(emblakverif==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak];
                        cartsqft[flag]=emblakes[emblak];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 3:      System.out.println();
            System.out.println("You have chosen a 3BHK(SF) flat with 3700 sqft, for Rs 36,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif=Integer.parseInt(b.readLine());
                    if(emblakverif==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak];
                        cartsqft[flag]=emblakes[emblak];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 4:     System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 5000 sqft, for Rs 48,600,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif2=Integer.parseInt(b.readLine());
                    if(emblakverif2==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif2==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 5:     System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 4800 sqft, for Rs 47,600,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif2=Integer.parseInt(b.readLine());
                    if(emblakverif2==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif2==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 6:     System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 5200 sqft, for Rs 49,600,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif2=Integer.parseInt(b.readLine());
                    if(emblakverif2==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif2==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;
            case 7:     System.out.println();
            System.out.println("You have chosen a 5BHK(GF) flat with 8300 sqft, for Rs 110,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif3=Integer.parseInt(b.readLine());
                    if(emblakverif3==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif3==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            case 8:     System.out.println();
            System.out.println("You have chosen a 5BHK(FF) flat with 8100 sqft, for Rs 109,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif3=Integer.parseInt(b.readLine());
                    if(emblakverif3==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif3==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            case 9:     System.out.println();
            System.out.println("You have chosen a 5BHK(SF) flat with 8500 sqft, for Rs 111,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    emblakverif3=Integer.parseInt(b.readLine());
                    if(emblakverif3==1){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(emblakverif3==2){
                        cartname[flag]=emblaken[emblak-1];
                        cartprice[flag]=emblakep[emblak-1];
                        cartsqft[flag]=emblakes[emblak-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            default:     System.out.println("Please re-enter your choice");
            break;
        }
    }

    public void getEmbassyPristine() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println("The available apartments at Embassy Pristine-Koramangala are:-");
        System.out.println();
        System.out.printf("%-10s","S.No"); System.out.printf("%-18s", "Type(Floor)"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price(Rs)");
        System.out.println();
        System.out.println();
        for(int i=0;i<embprisn.length;i++){
            System.out.printf("%-10d",(i+1) );System.out.printf("%-18s",embprisn[i]);System.out.printf("%-19s",embpriss[i]);customFormat("###,###,###",embprisp[i]);
            System.out.println();
        }

        while(true){
            try
            {
                System.out.println();
                System.out.println("Enter the corresponding serial number of a property. Enter 0 to go to the menu.");
                embpri=Integer.parseInt(b.readLine());
                if(embpri==0){
                    getList();
                    break;
                }
                else if(embpri==1||embpri==2||embpri==3||embpri==4||embpri==5||embpri==6){
                    cart[flag1]=embassy[emb-1];
                    flag1++; 
                    break;
                }
                else{
                    System.out.println("Please re-enter the number.");
                }
            }
            catch(Exception e3)
            {
                System.out.println("Please re-enter your number. Only whole numbers are accepted.");
            }
        }

        switch(embpri){
            case 1:      System.out.println();
            System.out.println("You have chosen a 3BHK(GF) flat with 2000 sqft, for Rs 17,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif=Integer.parseInt(b.readLine());
                    if( embpriverif==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif==2){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;  
            case 2:      System.out.println();
            System.out.println("You have chosen a 3BHK(FF) flat with 2300 sqft, for Rs 18,500,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif=Integer.parseInt(b.readLine());
                    if( embpriverif==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif==2){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break;  
            case 3:      System.out.println();
            System.out.println("You have chosen a 3BHK(SF) flat with 2600 sqft, for Rs 20,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif=Integer.parseInt(b.readLine());
                    if( embpriverif==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif==2){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            case 4:     System.out.println();
            System.out.println("You have chosen a 4BHK(GF) flat with 3600 sqft, for Rs 30,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif2=Integer.parseInt(b.readLine());
                    if( embpriverif2==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif2==2){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            case 5:     System.out.println();
            System.out.println("You have chosen a 4BHK(FF) flat with 3800 sqft, for Rs 31,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif2=Integer.parseInt(b.readLine());
                    if( embpriverif2==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif2==2){
                        System.out.println("*************************************************************************************************************************************************************************************");
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 
            case 6:     System.out.println();
            System.out.println("You have chosen a 4BHK(SF) flat with 4000 sqft, for Rs 32,000,000 with a complementary parking space.");
            System.out.println("To go to the menu enter 1 or to continue to your bill enter 2.");
            while(true){
                try{
                    embpriverif2=Integer.parseInt(b.readLine());
                    if( embpriverif2==1){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getList();
                        break;
                    }
                    else if(embpriverif2==2){
                        cartname[flag]=embprisn[embpri-1];
                        cartprice[flag]=embprisp[embpri-1];
                        cartsqft[flag]=embpriss[embpri-1];
                        flag++;
                        getReceipt();
                        break;
                    }
                    else{ 
                        System.out.println("Please re-enter the number.");
                    }
                }
                catch(Exception e3)
                {
                    System.out.println("Please re-enter your number. Only whole numbers are accepted.");
                }

            }
            break; 

            default:     System.out.println("Please re-enter your choice");
            break;
        }

    }

    public void getReceipt() throws InterruptedException,IOException 
    {
        if(flag==0){
            System.out.println("You have not booked any properties. To go to the property list enter 1 or to exit the program enter 2.");
            while(true){
                try{
                    nobill=Integer.parseInt(b.readLine());
                    if(nobill==1){
                        System.out.println("*************************************************************************************************************************************************************************************");
                        getList();
                        break;
                    }
                    else if(nobill==2){
                        System.out.println("Thank you for visting Realchase. We hope you were satisfied. Come again!"); 
                        System.exit(0);
                    }
                    else{
                        System.out.println("Please re-enter your number.");
                    }
                }
                catch(Exception e){
                    System.out.println("Please re-enter your number, special characters not accepted.");
                }
            }
        }
        else {
            System.out.println("Generating your Order Number");
            intRandNumber = new Random().nextInt(1000);
            orderNum =intRandNumber.toString();
            System.out.println ();            
            System.out.println("****************************************************************************************Bill*****************************************************************************************");
            System.out.println("Your unique Order Number is " + orderNum);
            System.out.println("Name: "+name);
            System.out.println("Phone number: "+num);
            System.out.println("Email ID: "+strEmailId);
            System.out.println();
            System.out.printf("%-10s","S.No");
            System.out.printf("%-60s", "Property name"); System.out.printf("%-18s", "Type"); System.out.printf("%-19s", "Sq ft."); System.out.printf("%-24s", "Price"); 
            System.out.println(); 
            System.out.println(); 
            for(int j=0;j<flag1;j++){
                System.out.printf("%-10d",(j+1));System.out.printf("%-60s",cart[j]); System.out.printf("%-18s",cartname[j]); System.out.printf("%-19s",cartsqft[j]);
                customFormat("###,###,###.00", cartprice[j]);
                totprice = totprice + cartprice [j];
                System.out.println();                
            }              
            System.out.println("*************************************************************************************************************************************************************************************");
            System.out.println();
            System.out.printf("%-100s","");
            System.out.printf("%19s","Total Bill:-");
            customFormat("###,###,###.00",totprice);
            getEMI();
            getMembership();
            Thread.sleep(4000);
            System.out.println();
            System.out.println("Notice:-The properties that you have reserved will be held for you no longer than one month.");
            System.out.println();
            System.out.println("*************************************************************************************************************************************************************************************");
            System.out.println(); 
            System.out.println("Thank you for using RealChase!");
            System.out.println("*************************************************************************************Come again!*************************************************************************************");
            System.exit(0);
        }
    }

    public void customFormat(String pattern,int value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output= myFormatter.format(value);
        System.out.println(output);
    }

    public void customFormat2(String pattern2,double value2) {
        DecimalFormat myFormatter = new DecimalFormat(pattern2);
        String output2= myFormatter.format(value2);
        System.out.println(output2);
    }

    public void getMembership () throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println();
        System.out.println("Please take a moment to consider our offer:-");
        System.out.println("Available discount of 1% on total bill, if you apply for membership.");
        System.out.println("Would you like to get a membership with us? Enter 1 to get a membership and 2 to go to leave. ");        
        while(true){
            try{
                int member = Integer.parseInt(b.readLine());
                if (member==1) {
                    intRandNumber = new Random().nextInt(1000);
                    orderNum = name.charAt(0) + intRandNumber.toString();
                    System.out.println("The original price is:- ") ;
                    customFormat("###,###,###.00",totprice);
                    totprice =totprice-(totprice/100);
                    System.out.println("The price after discount is:- ");
                    customFormat("###,###,###.00",totprice);
                    System.out.println("Your membership ID is:-"+orderNum);
                    System.out.println("Please present this bill, along with your Membership ID to your builder.");
                    break;
                }
                else if (member==2) {
                    break;
                }
                else{
                    System.out.println("Please re-enter number.");
                }
            }
            catch(Exception e){
                System.out.println("Please re-enter your number, special characters not accepted.");
            }
        }
    }

    public void getEMI() throws IOException,InterruptedException
    {
        System.out.println();
        System.out.println();
        System.out.println("If you wish to choose our EMI plan, please choose to after your house loan EMI is calculated.");
        System.out.println("Please enter the amount of loan you wish to take. House loan available between:-Rs 1,00,000 and Rs 1,00,00,000.");
        while(true){
            try{

                loan=Long.parseLong(b.readLine());
                if(loan>=100000&&loan<=10000000){               
                    break;
                }
                else{ 
                    System.out.println("Please re-enter the amount of the loan.");
                }
            }
            catch(Exception e){
                System.out.println("Please re-enter the amount of the loan.");
            }
        }        
        System.out.println("Please enter the time(>20 years)- in which you will pay back the loan.");
        while(true){
            try{
                time=Double.parseDouble(b.readLine());
                if(time>=1&&time<=20){
                    time=time*12;
                    break;
                }
                else{
                    System.out.println("Please re-enter the time period of the loan.");
                }
            }
            catch(Exception e){
                System.out.println("Please re-enter the time period of the loan.");
            }
        }
        System.out.println("Rate offered as per SBI's standards is 10.25% on home loans.");
        nume=Math.pow((1+rate),time);
        denom=Math.pow((1+rate),time)-1;
        emi=loan*rate*nume/denom;
        System.out.println("EMI:-");
        customFormat2("###,###,###.00",emi);
        System.out.println("If you wish to choose our EMI plan enter 1, if you want to continue enter 2");
        while(true){
            try{
                emiverif=Integer.parseInt(b.readLine());
                if(emiverif==1){
                    System.out.println("An email has been sent to you, as to when our banking representative will come to you this week. Thank you for choosing our plan.");
                    break;
                }
                else if(emiverif==2){
                    System.out.println("You have not chosen our EMI plan.");
                    break;
                }
                else{
                    System.out.println("Please re-enter number.");
                }
            }
            catch(Exception e){
                System.out.println("Please re-enter your number, special characters not accepted.");
            }

        }
    }
}