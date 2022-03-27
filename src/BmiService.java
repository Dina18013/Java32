public class BmiService {
    public double calculate(double weight, double height) { // функция расчета индекса массы тела

        double index = weight / (height * height); // расчет индекса массы тела
        return index;
    }
}
