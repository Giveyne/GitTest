package newGitTest;

import java.io.Serializable;
import java.io.*;
import java.lang.*;

import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.*;
import java.util.List;


public class BranchTest implements Serializable {


    private static final long serialVersionUID = 1L;

            String brain = "Изначальное значение brain в классе Animal";
            String heart = "Изначальное значение heart в классе Animal";

            public static int animalCount = 7700000;

            public BranchTest (String brain, String heart) {
                System.out.println("Выполняется конструктор базового класса Animal");
                System.out.println("Были ли уже проинициализированы переменные класса Animal?");
                System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
                System.out.println("Текущее значение brain в классе Animal = " + this.brain);
                System.out.println("Текущее значение heart в классе Animal = " + this.heart);

                this.brain = brain;
                this.heart = heart;
                System.out.println("Конструктор базового класса Animal завершил работу!");
                System.out.println("Текущее значение brain = " + this.brain);
                System.out.println("Текущее значение heart = " + this.heart);
            }
        }

        class Cat extends BranchTest implements Serializable {


            String tail = "Изначальное значение tail в классе Cat";

           private transient static int catsCount = 37;

            public Cat(String brain, String heart, String tail) {
                super(brain, heart);


                System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
                System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
                System.out.println("Текущее значение tail = " + this.tail);
                this.tail = tail;
                System.out.println("Текущее значение tail = " + this.tail);
            }

            @Override
            public String toString() {
                return "Cat{" +
                        "brain='" + brain + '\'' +
                        ", heart='" + heart + '\'' +
                        ", tail='" + tail + '\'' + catsCount+
                        '}';
            }

            public static void main(String[] args) throws Exception{

                System.out.println("This code first");
                Cat cat = new Cat("Мозг", "Сердце", "Хвост");
                System.out.println(catsCount);
                //File file = new File("C:\\test\\save.txt");
                FileOutputStream outputStream = new FileOutputStream("C:\\test\\save.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                // сохраняем игру в файл
                objectOutputStream.writeObject(catsCount);

                //закрываем поток и освобождаем ресурсы
                objectOutputStream.close();

                FileInputStream fileInputStream = new FileInputStream("C:\\test\\save.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                int savedGame = (int) objectInputStream.readObject();

                System.out.println(savedGame);
                System.out.println(catsCount);

            }
        }


