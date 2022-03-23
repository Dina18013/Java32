public class BmiService {
    public double calculate(double ves, double rost) { // функция расчета индекса массы тела

        double weight = 60;
        double height = 1.7;
        double index = weight / (height * height); // расчет индекса массы тела
        return index;
    }
}
