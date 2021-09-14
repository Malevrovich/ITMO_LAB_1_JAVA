import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random случ = new Random();
        int[] а = new int[8];

        а[0] = 18;
        for (int и = 1; и != 8; и++) {
            а[и] = а[и - 1] - 2;
        }

        double[] икс = new double[12];
        for (int и = 0; и != 12; и++) {
            икс[и] = случ.nextDouble() * 17 - 2;
        }

        double[][] б = new double[8][12];

        for (int и = 0; и != 8; и++) {
            for (int ж = 0; ж != 12; ж++) {
                if (а[и] == 12) {
                    б[и][ж] = Math.atan(
                                    Math.pow(
                                        Math.E,
                                        Math.cbrt(
                                            -Math.exp(икс[ж])
                                        )
                                    )
                                );
                } else if(а[и] == 6 || а[и] == 8 || а[и] == 18){
                    б[и][ж] = Math.sin(
                                    Math.pow(
                                        Math.pow(
                                            Math.tan(икс[ж]),
                                            0.75D / Math.atan((икс[ж] + 6.5) / 17)
                                        ),
                                        3 / (2/3 + Math.pow(
                                                Math.pow(
                                                    икс[ж],
                                                    0.5 / (икс[ж] - 0.5)
                                                ),
                                                Math.pow(
                                                    (1 - икс[ж]) / (3 * 4),
                                                    икс[ж]
                                                )
                                            )
                                        )
                                    )
                                );
                } else{
                    double tmp = Math.log(Math.exp(икс[ж])); // Equals to икс[ж] =)
                    б[и][ж] = Math.pow(
                                    tmp / (2 * 3),
                                    tmp
                                );
                }
            }
        }

        System.out.printf("  A\\X |");

        for (int и = 0; и != 12; и++) {
            System.out.printf("%10.2f|", икс[и]);
        }
        System.out.println();

        for (int и = 0; и != 12 * 11 + 7; и++) {
            System.out.print("-");
        }
        System.out.println();

        for (int и = 0; и != 8; и++) {
            System.out.printf("%5d |", а[и]);
            for (int ж = 0; ж != 12; ж++) {
                System.out.printf("%10.2f|", б[и][ж]);
            }
            System.out.println();
        }
    }
}
