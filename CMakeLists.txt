# CMake version requirement
CMAKE_MINIMUM_REQUIRED (VERSION 2.6)

# project name
PROJECT (cube)

# version number
SET (CUBE_VERSION 0.1)

# custom CMake directory
SET (CMAKE_MODULE_PATH "${CUBE_SOURCE_DIR}/cmake")

# override Java cmake
SET (CMAKE_USER_MAKE_RULES_OVERRIDE "override")

# source directory
ADD_SUBDIRECTORY (src)
