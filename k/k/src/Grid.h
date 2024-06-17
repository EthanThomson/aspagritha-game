//
// Created by Mercurios on 17/06/2024.
//

#ifndef ASPAGRITHA_GAME_GRID_H
#define ASPAGRITHA_GAME_GRID_H

#include<vector>
#include "Unit.h"

namespace GridSpace {

    class Grid {
    private:
        std::vector<std::vector<UnitSpace::Unit>> grid;
        int rows, cols;

    public:
        Grid(int rows, int cols) : rows(rows), cols(cols), grid(rows, std::vector<0>(cols)) {}

        // Method to set a Unit at a specific position
        void setUnit(int row, int col, const UnitSpace::Unit& unit) {
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                grid[row][col] = unit;
            }
        }

        // Method to get a Unit from a specific position
        UnitSpace::Unit getUnit(int row, int col) const {
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                return grid[row][col];
            }
            throw std::out_of_range("Grid position out of range");
        }

    };

} // GridSpace

#endif //ASPAGRITHA_GAME_GRID_H
