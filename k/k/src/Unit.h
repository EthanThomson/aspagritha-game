//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_GAME_UNIT_H
#define ASPAGRITHA_GAME_UNIT_H

namespace UnitSpace
{
#include "list"
#include <string>
#include "GridCords.h"

#include "Item.h"
    class Unit {

    private:
        int* Race;
        std::string* UnitType;
        char* Allegence;
        GridSpace::GridCords Coords = GridSpace::GridCords(nullptr, nullptr);


    public:
        Unit(int *X, int *Y, int* racein, std::string* UnitTypein, char* Allegencein) {
            Coords.x = X;
            Coords.y = Y;
            Race = racein;
            UnitType = UnitTypein;
            Allegence = Allegencein;
        }

    }

;} // Unit


#endif //ASPAGRITHA_GAME_UNIT_H
