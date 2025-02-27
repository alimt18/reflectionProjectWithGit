import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ReflectionExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {

//       Method[] methods=ReflectionExample.class.getDeclaredMethods();
//       for(Method m:methods){
//           if(!m.getName().equals("main")) {
//             //  System.out.println((Float)m.invoke((new ReflectionExample()),1,2));
//
//               for(Class<?> f:m.getParameterTypes()){
//                   System.out.println(f.getSimpleName());
//               }
//
//               System.out.println(m.getReturnType().getSimpleName());
//           }
//       }

        while(true){
            Reflections reflection = new Reflections("", ClassLoader.getSystemClassLoader(), new SubTypesScanner(false));
            Set<Class<?>> classes = reflection.getSubTypesOf(Object.class);
            List<Class<?>> list=classes.stream().filter(a->!a.getSimpleName().equals("ReflectionExample")).collect(Collectors.toList());
            int i=1;
            for(Class<?> cls:list){
                System.out.println(i+"."+cls.getSimpleName());
                i++;
            }
            Scanner scanner=new Scanner(System.in);
           int j=Integer.valueOf( scanner.nextLine());
            if(j==-1){
                break;
            }
            Class<?> cls1 = list.get(j-1);
            String[] params = null;
            cls1.getMethod("main",String[].class).invoke(Class.forName(cls1.getName()),(Object)params);

        }

    }



}
