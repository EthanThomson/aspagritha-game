//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_ITEM_H
#define ASPAGRITHA_ITEM_H
#include "string"

namespace ItemSpace {

    class Item
    {
        unsigned int id;
        int count;
        std::string name;

        Item(int idin, int countin)
        {
            id = idin;
            count = countin;
        }

    public:
        int getid()
        {
            return id;
        }

        int getCount()
        {
            return count;
        }

        void addOrSubCount(int ammount)
        {
            count += ammount;
        }
        void addOrSubCount(Item itemin)
        {
            count += itemin.getCount();
        }


    };


} // ItemSpace



#endif //ASPAGRITHA_ITEM_H
