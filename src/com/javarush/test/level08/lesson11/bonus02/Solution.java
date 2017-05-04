package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> addressMap = new HashMap<>();
        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            addressMap.put(city, family);
//            addresses.add(family);
        }

        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());

//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
//        for (Map.Entry<String, String> item: addressMap.entrySet()) {
//            System.out.println("city " + item.getKey() + " : " + "family " + item.getValue());
//        }
        String cityFamily = reader.readLine();
        if (addressMap.containsKey(cityFamily))
            System.out.println(addressMap.get(cityFamily));
    }
}