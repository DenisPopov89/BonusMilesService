public class BonusMilesService {
    public int calculate(int cost) {
        int milePerCost = 33;

        int miles = cost / milePerCost;
        return miles;
    }
}
