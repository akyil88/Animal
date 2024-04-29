public class Main {
    public static void main(String[] args) {
        OwnerR owner1 = new OwnerR("Hans", 45,"Street 123" );
        SpeciesR species1 = new SpeciesR("Hollywood", 45);

        AnimalR lion = new AnimalR(1, "Leo", "Lion", 5,owner1,species1);
        AnimalR elephant = new AnimalR(2, "Dumbo", "Elephant", 10,owner1,species1);
        AnimalR giraffe = new AnimalR(3, "Gerry", "Giraffe", 7, owner1, species1);


        System.out.println("Animal 1: " + lion);
        System.out.println("Animal 2: " + elephant);
        System.out.println("Animal 3: " + giraffe);

        AnimalR lion1 = new AnimalR(1, "Leo", "Lion", 5,owner1,species1);
        AnimalR lion2 = new AnimalR(1, "Leo", "Lion", 6,owner1,species1);
        AnimalR elephant2 = new AnimalR(2, "Dumbo", "Elephant", 10,owner1,species1);

        System.out.println("lion1 equals lion2: " + lion1.equals(lion2));
        System.out.println("lion1 euquals elephant: " + lion1.equals(elephant2));
        System.out.println("lion1: " + lion1.toString());


        AnimalR animal1 = new AnimalR(1, "Leo", "Lion", 5, owner1,species1);




    }
}
