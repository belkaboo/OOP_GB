
public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    String getName();

    double getMinSalary();

    int getNumber();
}