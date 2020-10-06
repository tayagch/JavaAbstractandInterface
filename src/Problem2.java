
public class Problem2 implements PricesInterface {

    public static void main(String[] args){
        switch (budget){
            case driving:
                System.out.println("Please Choose Driving to use as transportation from Wuhan to Beijing for a budget of: " + budget);
                break;
            case bus:
                System.out.println("Please Choose Bus to use as transportation from Wuhan to Beijing for a budget of: " + budget);
                break;
            case train:
                System.out.println("Please Choose Train to use as transportation from Wuhan to Beijing for a budget of: " + budget);
                break;
            case plane:
                System.out.println("Please Choose Plane to use as transportation from Wuhan to Beijing for a budget of: " + budget);
                break;
        }


    }
}

interface PricesInterface{
    int budget = 500;
    int driving = 500;
    int bus = 300;
    int train = 400;
    int plane = 1000;
}
