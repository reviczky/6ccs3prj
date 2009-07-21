# programming language
ENABLE_LANGUAGE (Java)

SET (CMAKE_Java_FLAGS "-sourcepath \"${CMAKE_CURRENT_SOURCE_DIR}\"")

# source files
SET (CUBE_SOURCE_FILES
    cube.java
)

ADD_LIBRARY (cube ${CUBE_SOURCE_FILES})

# Java exec shell script
IF (UNIX)
    SET (SH_SCRIPT cube.sh)

    ADD_CUSTOM_COMMAND (
        OUTPUT ${SH_SCRIPT}
        COMMAND ${CMAKE_COMMAND} -E touch ${SH_SCRIPT}
        COMMAND ${CMAKE_COMMAND} -E echo
        ARGS "\"#!/bin/sh\""
        ">>"
        "${SH_SCRIPT}"
        COMMAND ${CMAKE_COMMAND} -E echo
        ARGS "\"JAVA='/usr/bin/java'\""
        ">>"
        "${SH_SCRIPT}"
        COMMAND ${CMAKE_COMMAND} -E echo
        ARGS ""
        ">>"
        "${SH_SCRIPT}"
        COMMAND ${CMAKE_COMMAND} -E echo
        ARGS "exec $$\\JAVA -classpath $$\\PWD/cube.jar:$$\\JARS cube \\\"$$\\@\\\""
        ">>"
        "${SH_SCRIPT}"
        COMMAND chmod 777 ${SH_SCRIPT}
        COMMENT "Generating shell script file"
    )

    ADD_CUSTOM_TARGET (
        SH_SCRIPT_FILE ALL
        DEPENDS ${SH_SCRIPT}
    )
ENDIF (UNIX)

# install target path
INSTALL (FILES cube.jar DESTINATION usr/local/bin)
INSTALL (PROGRAMS cube.sh DESTINATION usr/local/bin)
