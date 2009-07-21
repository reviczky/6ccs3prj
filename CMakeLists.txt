# CMake version requirement
CMAKE_MINIMUM_REQUIRED (VERSION 2.6)

# project name
PROJECT (CUBE)

# version number
SET (CUBE_VERSION 0.1)

# custom CMake directory
SET (CMAKE_MODULE_PATH "${CUBE_SOURCE_DIR}/cmake")

# override Java cmake
SET (CMAKE_USER_MAKE_RULES_OVERRIDE "override")

# source directory
ADD_SUBDIRECTORY (src)

# default binary format
SET (CPACK_GENERATOR "TBZ2")

# default source format
SET (CPACK_SOURCE_GENERATOR "TBZ2")
SET (CPACK_SOURCE_IGNORE_FILES "/.git/;/CMakeFiles/;/Makefile;/cmake_install.cmake;/CMakeCache.txt;/CPackConfig.cmake;/CPackSourceConfig.cmake")

# CPack packaging tool
INCLUDE (CPack)
