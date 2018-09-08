public class unitconverter {
    public static void main(String [] args) {
        String[] inputAsString = {args[0], args[1], args[2]};    // takes user input from command line as a string
        String typeInput = args[3];
        String[] types = {"kilometer","millimeter","centimeter"};

        double multiplier = 0.3048; // multiplier for feet

        // Now we convert using a for loop and other doodads
        for(int i = 0; i <= 2; i++) {
            int intInput = Integer.parseInt(inputAsString[i]); //converts each argument into a string
            if(typeInput == types[i]) {
                if(typeInput == types[0]) {
                    multiplier = 0.0003048;
                    System.out.println("Feet:" + intInput + '\n' + multiplier * intInput);
                }
                else if(typeInput == types[1]) {
                    multiplier = 304.8;
                    System.out.println("Feet:" + intInput + '\n' +  multiplier * intInput);

                }
                else if(typeInput == types[2]) {
                    multiplier = 30.48;
                    System.out.println("Feet:" + intInput + '\n' + multiplier * intInput);
                }
                else {
                    System.out.println("yo this shit dont work");
                }
            }
        }
    }
}