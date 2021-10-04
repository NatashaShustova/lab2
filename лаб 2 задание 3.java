public class lab2 {
    public static void main (String args[]){
        Phone a = new Phone("+7 (968) 563-18-93", "iPhone", 140.0);
        Phone b = new Phone("+7 (915) 484-51-25", "Samsung");
        Phone c = new Phone();
        Phone[] phones = {a, b, c};
        for(Phone p:phones){
            System.out.println("Модель телефона: " + p.model + "\nНомер: " + p.number + "\nВес: " + p.weight + "\n");
        }
        a.receiveCall("Анастасия");
        b.receiveCall("Анна");
        c.receiveCall("Константин\n");
        for(Phone p:phones){
            System.out.println(p.getNumber());
        }
        a.receiveCall("Анастасия", "+7 (999) 333-11-22");
        b.receiveCall("Анна", "+7 (985) 127-45-12");
        c.receiveCall("Константин", "+7 (916) 834-48-63\n");

        Phone.sendMessage("Hello, World!", "+7 (999) 333-11-22", "+7 (985) 127-45-12", "+7 (916) 834-48-63");
    }
}
class Phone {
    String number, model;
    double weight;
    public Phone (String number, String model, double weight){
        this(number, model);
        this.weight=weight;
    }
    public Phone (String number, String model){
        this.number=number;
        this.model=model;
    }
    public Phone (){
    }
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " " + number);
    }
    public String getNumber(){
        return number;
    }
    public static void sendMessage(String message, String ...number){
        for(String n:number){
            System.out.println(n + ";");
        }
    }
}

