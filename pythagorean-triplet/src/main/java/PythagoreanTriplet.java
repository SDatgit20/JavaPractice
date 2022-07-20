import java.util.ArrayList;
import java.util.List;
record PythagoreanTriplet(int a, int b, int c) {
    static PythagoreanTripletBuild makeTripletsList() {
        return new PythagoreanTripletBuild();
    }
}
class PythagoreanTripletBuild {
    private int maxFactor;
    private int sum;
    PythagoreanTripletBuild withFactorsLessThanOrEqualTo(int maxFactor) {
        this.maxFactor = maxFactor;
        return this;
    }
    PythagoreanTripletBuild thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        for (int a = 1; a < maxFactor; a++) {
            for (int b = a + 1; b <maxFactor && a + b < sum; b++){
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    triplets.add(new PythagoreanTriplet(a, b, c));
                }
            }
        }
        return triplets;
    }
}