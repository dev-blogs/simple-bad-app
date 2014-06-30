PATH_TO_BUILD=`pwd`
 
# Удаляем каталог с предыдущим билдом
if test -d $PATH_TO_BUILD/build;
then
    rm -rf $PATH_TO_BUILD/build
fi
 
# Создаем новый каталог, куда будем помещать билд
mkdir $PATH_TO_BUILD/build
 
# Компилируем проект в каталог build
javac -d build src/*.java
 
# Выполняем приложение
java -cp .:build com.execute.Execute
