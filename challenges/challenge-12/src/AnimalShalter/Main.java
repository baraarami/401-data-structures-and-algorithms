package AnimalShalter;

public class Main {
    public boolean someMethode (){
        return true;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        AnimalShelter animalShelter= new AnimalShelter();
        animalShelter.enqueue(" cat");
        animalShelter.enqueue(" dog");


        System.out.println(animalShelter);
        System.out.println(animalShelter.dequeue(" cat"));
        System.out.println(animalShelter.dequeue(" dog"));
        System.out.println(animalShelter.dequeue(" bird"));
        System.out.println(animalShelter.dequeue(" turtle"));
        System.out.println(animalShelter.dequeue(" duck"));
    }
}
