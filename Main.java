package exercise12;

public class Main {
    public static void main(String[] args){
        Person person=new Person("Артём","Олегович","Новопольский");
        System.out.println(person.fio());
        Person person1=new Person("Новопольский");
        System.out.println(person1.fio());

        Address address = new Address("Russia, Penzenskaya, Penza--, Lenina() 19, 15, 6");
        System.out.println(address);

        String[] shirts=new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1=new Shirt[11];
        for(int i=0;i<11;i++){
            shirts1[i]=new Shirt(shirts[i]);
            System.out.println(shirts1[i]);
        }

        System.out.println(new PhoneNumber("+79378763356"));

        Last last=new Last("ТоК СоЛ КОс");
        System.out.println(last);
    }
}

