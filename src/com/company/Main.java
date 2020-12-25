package com.company;

import com.company.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Wizard wizard = new Wizard("Cornelia", 500, 50);
        Swordsman swordsman = new Swordsman("Irma", 500, 50, 0);
        Archer archer = new Archer("Will", 500, 50);

        System.out.print("""
                Enter an option
                1: WIZARD     to attack ARCHER
                2: WIZARD     to attack SWORDSMAN
                3: SWORDSMAN  to attack WIZARD
                4: SWORDSMAN  to attack ARCHER
                5: ARCHER     to attack WIZARD
                6: ARCHER     to attack SWORDSMAN
                Ayo other option: EXIT
                """);

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                //wizard->archer
                System.out.println("Player 1: WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                        "\nPlayer 2: ARCHER " + archer.getName() + " - health: " + archer.getHealth() + "\n");

                for (int i = archer.getHealth(); true; i--) {

                    wizard.attack(archer, wizard);
                    if (archer.getHealth() <= 0) {
                        System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                                "  |  ARCHER " + archer.getName() + " - health: 0" +
                                "\n\nWIZARD WON!");
                        break;
                    }

                    System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                            "  |  ARCHER " + archer.getName() + " - health: " + archer.getHealth());
                    System.out.println();

                    archer.attack(wizard, archer);
                    if (wizard.getHealth() <= 0) {
                        System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                                "  |  WIZARD " + wizard.getName() + " - health: 0" +
                                "\n\nARCHER WON!");
                        break;
                    }

                    System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                            "  |  WIZARD " + wizard.getName() + " - health: " + wizard.getHealth());
                    System.out.println();
                }
            }

            case 2 -> {
                //wizard->swordsman
                System.out.println("Player 1: WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                        "\nPlayer 2: SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() + "\n");

                for (int i = swordsman.getHealth(); true; i--) {

                    wizard.attack(swordsman, wizard);
                    if (swordsman.getHealth() <= 0) {
                        System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                                "  |  SWORDSMAN " + swordsman.getName() + " - health: 0" +
                                "\n\nWIZARD WON!");
                        break;
                    }

                    System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                            "  |  SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth());
                    System.out.println();

                    swordsman.attack(wizard, swordsman);
                    if (wizard.getHealth() <= 0) {
                        System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                                "  |  WIZARD " + wizard.getName() + " - health: 0" +
                                "\n\nSWORDSMAN WON!");
                        break;
                    }

                    System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                            "  |  WIZARD " + wizard.getName() + " - health: " + wizard.getHealth());
                    System.out.println();
                }
            }

            case 3 -> {
                //swordsman->wizard
                System.out.println("Player 1: SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                        "\nPlayer 2: WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() + "\n");

                for (int i = wizard.getHealth(); true; i--) {

                    swordsman.attack(wizard, swordsman);
                    if (wizard.getHealth() <= 0) {
                        System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                                "  |  WIZARD " + wizard.getName() + " - health: 0" +
                                "\n\nSWORDSMAN WON!");
                        break;
                    }

                    System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                            "  |  WIZARD " + wizard.getName() + " - health: " + wizard.getHealth());
                    System.out.println();

                    wizard.attack(swordsman, wizard);
                    if (swordsman.getHealth() <= 0) {
                        System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                                "  |  SWORDSMAN " + swordsman.getName() + " - health: 0" +
                                "\n\nWIZARD WON!");
                        break;
                    }

                    System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                            "  |  SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth());
                    System.out.println();
                }
            }

            case 4 -> {
                //swordsman->archer
                System.out.println("Player 1: SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                        "\nPlayer 2: ARCHER " + archer.getName() + " - health: " + archer.getHealth() + "\n");

                for (int i = archer.getHealth(); true; i--) {

                    swordsman.attack(archer, swordsman);
                    if (archer.getHealth() <= 0) {
                        System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                                "  |  ARCHER " + archer.getName() + " - health: 0" +
                                "\n\nSWORDSMAN WON!");
                        break;
                    }

                    System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                            "  |  ARCHER " + archer.getName() + " - health: " + archer.getHealth());
                    System.out.println();

                    archer.attack(swordsman, archer);
                    if (swordsman.getHealth() <= 0) {
                        System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                                "  |  SWORDSMAN " + swordsman.getName() + " - health: 0" +
                                "\n\nARCHER WON!");
                        break;
                    }

                    System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                            "  |  SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth());
                    System.out.println();
                }
            }

            case 5 -> {
                //archer->wizard
                System.out.println("Player 1: ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                        "\nPlayer 2: WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() + "\n");

                for (int i = wizard.getHealth(); true; i--) {

                    archer.attack(wizard, archer);
                    if (wizard.getHealth() <= 0) {
                        System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                                "  |  WIZARD " + wizard.getName() + " - health: 0" +
                                "\n\nARCHER WON!");
                        break;
                    }

                    System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                            "  |  WIZARD " + wizard.getName() + " - health: " + wizard.getHealth());
                    System.out.println();

                    wizard.attack(archer, wizard);
                    if (archer.getHealth() <= 0) {
                        System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                                "  |  ARCHER " + archer.getName() + " - health: 0" +
                                "\n\nWIZARD WON!");
                        break;
                    }
                    System.out.println("WIZARD " + wizard.getName() + " - health: " + wizard.getHealth() +
                            "  |  ARCHER " + archer.getName() + " - health: " + archer.getHealth());
                    System.out.println();
                }
            }

            case 6 -> {
                //archer->swordsman
                System.out.println("Player 1: ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                        "\nPlayer 2: SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() + "\n");

                for (int i = swordsman.getHealth(); true; i--) {

                    archer.attack(swordsman, archer);
                    if (swordsman.getHealth() <= 0) {
                        System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                                "  |  SWORDSMAN " + swordsman.getName() + " - health: 0" +
                                "\n\nARCHER WON!");
                        break;
                    }

                    System.out.println("ARCHER " + archer.getName() + " - health: " + archer.getHealth() +
                            "  |  SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth());
                    System.out.println();

                    swordsman.attack(archer, swordsman);
                    if (archer.getHealth() <= 0) {
                        System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                                "  |  ARCHER " + archer.getName() + " - health: 0" +
                                "\n\nSWORDSMAN WON!");
                        break;
                    }

                    System.out.println("SWORDSMAN " + swordsman.getName() + " - health: " + swordsman.getHealth() +
                            "  |  ARCHER " + archer.getName() + " - health: " + archer.getHealth());
                    System.out.println();
                }

            }

            default -> {
            }
        }
    }
}