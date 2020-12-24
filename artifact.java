public class Artifact {

    static int count = 0;

    public Artifact(){
        count++;
        this.number = "Number" + count;
        }
    
        public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
        }   

        public Artifact(int number, String culture, int century) {
            this.number = number;
            this.culture = culture;
            this.century = century;
        }

    public static void main(String[] args) {
        Artifact unkown = new Artifact();
        Artifact unkown = new Artifact();
        Artifact unkown = new Artifact();
        Artifact egypt = new Artifact(4, Egypt);
        Artifact actec = new Artifact(15, Actec, 5);

        System.out.println(unkown.number);
        System.out.println(unkown.number);
        System.out.println(unkown.number);
        System.out.println(egypt.number, egypt.cuture);
        System.out.println(actec.number, actec.cukture, actec.century);
    }
}