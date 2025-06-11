package Iunie2024_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

class Ex1 {

    public static void main(String[] args)

            throws FileNotFoundException {

        for (int i = 1; i <= 5; i++)

            try (Scanner sc = new Scanner(new File("Input1/fisier" + i + ".txt"))) {

                System.out.print(sc.nextInt());

            } catch (FileNotFoundException e) {

                System.out.print("!");

            } catch (InputMismatchException e) {

                System.out.print("?");

            } catch (Exception e) {

                System.out.print("@");

            } finally {

                System.out.print("F");

            }

    }

}
