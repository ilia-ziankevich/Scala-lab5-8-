package Application

object main {
     def main(args: Array[String]){
     var places = 1;
     var driver, pas = "0";
     var speed, hours, distance, mode = 0;
     print("Введите имя водителя: ")
     driver = scala.io.StdIn.readLine();
     println("Водитель "+driver+" находится в водительском кресле номер 1.\n");
     do
     {
       print("Выберите действие:\n 0 - заглушить мотор и закончить поездку\n 1 - покататься на автомобиле\n 2 - прокатить товарища на автомобиле\nДействие: ");
       mode = scala.io.StdIn.readInt();
       if(mode==1)
       {
          print("Введите скорость, с которой вы будете кататься и количество часов: \nСкорость (км/ч) = ");
          speed = scala.io.StdIn.readInt();
          print("Часы (ч) = ");
          hours = scala.io.StdIn.readInt();
          distance = distance+(speed * hours);
          println("Вы катались "+hours+" часов со скоростью "+speed+" км/ч. Вы проехали "+hours*speed+" километров.\nВсего вы проехали "+distance+" километров!");
       }
       else
         if(mode==2)
         {
           if(places < 5)
           {
             pas = addPassanger();
             places = places + 1;
             println("Товарищ-пассажир "+pas+" находится кресле номер " + places +".");
           }
           else
             println("К сожалению в вашем автомобиле больше нету места.");
         }
         else
           if(mode!=0)
             println("Данное действие выполнить невозможно! Попробуйте снова.");
     }while(mode!=0);
     println("Вы вышли из автомобиля и пошли домой отдыхать.");
  }
     
     def addPassanger(): String = {
       var name = "0";
       print("Введите имя пасажира: ");
       name = scala.io.StdIn.readLine();
       return name;
     }
}