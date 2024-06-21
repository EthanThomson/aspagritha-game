cmake_minimum_required(VERSION 3.27)
project(aspagritha-game)

set(CMAKE_CXX_STANDARD 23)

add_executable(
        Aspagritha main.cpp
        k/src/AutonomusUnit.cpp
        k/src/AutonomusUnit.h
        k/src/Grid.cpp
        k/src/Grid.h
        k/src/GridCords.cpp
        k/src/GridCords.h
        k/src/GridSlice.cpp
        k/src/GridSlice.h
        k/src/PlayerUnit.cpp
        k/src/PlayerUnit.h
        k/src/Unit.cpp
        k/src/Unit.h
        k/src/UnitEnumStore.h
        k/src/Item.h
        #        k/src/WindowControl.h
#        k/src/WindowControl.cpp
#        k/pakage/glut-3.7/include/GL/glut.h
#        k/src/Window.h
#        k/src/Window.cpp
#        k/src/Unit.h
)


