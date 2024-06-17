//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_GAME_PLAYERUNIT_H
#define ASPAGRITHA_GAME_PLAYERUNIT_H

#include "Item.h"
#include "Unit.h"

namespace UnitSpace {

    class PlayerUnit : Unit
        {
            PlayerUnit(int *x, int *y, int *racein, std::string *unitTypein, char *allegencein) : Unit(x, y, racein, unitTypein, allegencein) {

            }


            struct Self
                {


                };
            struct Body
                {

                };


    };

} // Unit

#endif //ASPAGRITHA_GAME_PLAYERUNIT_H
