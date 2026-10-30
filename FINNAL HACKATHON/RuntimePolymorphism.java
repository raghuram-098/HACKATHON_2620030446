class Visitor {
    int entryFee() {
        return 500;
    }

    String category() {
        return "General visitor";
    }
}

class StudentVisitor extends Visitor {
    @Override
    int entryFee() {
        return 200;
    }

    @Override
    String category() {
        return "Student";
    }
}

class SeniorVisitor extends Visitor {
    @Override
    int entryFee() {
        return 250;
    }

    @Override
    String category() {
        return "Senior citizen";
    }
}

class ChildVisitor extends Visitor {
    @Override
    int entryFee() {
        return 0;
    }

    @Override
    String category() {
        return "Child under 6";
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Visitor[] visitors = {
            new Visitor(),
            new StudentVisitor(),
            new SeniorVisitor(),
            new ChildVisitor()
        };

        int total = 0;
        for (Visitor v : visitors) {
            System.out.println(v.category() + " pays $" + v.entryFee());
            total += v.entryFee();
        }
        System.out.println("Total collected: $" + total);
    }
}
