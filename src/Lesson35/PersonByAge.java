package Lesson35;

import java.util.Comparator;


public class PersonByAge implements Comparator<Person>
{
    @Override
    public int compare(Person p1, Person p2)
    {
            int ret = 0;
            if (p1.getAge() == p2.getAge())
            {
                ret = 0;
            }
            else if (p1.getAge() > p2.getAge())
            {
                ret = 1;
            }
            else
            {
                ret = -1;
            }
            return ret;
        }
    }