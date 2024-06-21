//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_GAME_PLAYERUNIT_H
#define ASPAGRITHA_GAME_PLAYERUNIT_H

#include "iostream"
#include <list>
#include "list"
#include "Item.h"
#include "Unit.h"

namespace UnitSpace {

    class PlayerUnit : Unit
        {
            ::std::list<ItemSpace::Item> itemStore;

            PlayerUnit(int *x, int *y, int *racein, ::std::string *unitTypein, char *allegencein)
            {

            }


            struct Self
                {


                };
            struct Body
                {

                };

            void addItem(ItemSpace::Item itemIn, int addCount)
            {
                if(itemStore.empty())
                {
                    itemStore.push_front(itemIn);
                }

                for(auto iter = itemStore.begin(); iter != itemStore.end(); iter++)
                {
                    if(iter->getid() == itemIn.getid())
                    {
                        iter->addOrSubCount(addCount);
                    }

                }
            }

            void removeItem(ItemSpace::Item itemOut, int subCount)
            {

            }




    };

} // Unit

#endif //ASPAGRITHA_GAME_PLAYERUNIT_H
