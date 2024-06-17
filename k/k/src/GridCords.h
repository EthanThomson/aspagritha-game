//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_GAME_GRIDCORDS_H
#define ASPAGRITHA_GAME_GRIDCORDS_H

#include<iostream>
#include<vector>

namespace GridSpace {
    class GridCords {


    public:
        GridCords(int* X, int* Y)
        {
            x = X, y = Y;


        }

        int *x;
        int *y;
    }; // GridSpace

#endif //ASPAGRITHA_GAME_GRIDCORDS_H
}