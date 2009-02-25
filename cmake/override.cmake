# compiling Java source files into object files
FILE (MAKE_DIRECTORY "${CMAKE_CURRENT_BINARY_DIR}/.class")

# default charset
SET (ENCODING utf8)

SET (CMAKE_Java_COMPILE_OBJECT "<CMAKE_Java_COMPILER> <FLAGS> -encoding ${ENCODING} <SOURCE> -d \"<CMAKE_CURRENT_BINARY_DIR>/.class\"")

# default Manifest
SET (MANIFEST Manifest.txt)

# Java compiler flags
SET (CMAKE_Java_CREATE_STATIC_LIBRARY "<CMAKE_Java_ARCHIVE> -cfm <TARGET> ${MANIFEST} -C \"<CMAKE_CURRENT_BINARY_DIR>/.class\" .")
