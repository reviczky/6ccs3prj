ENABLE_LANGUAGE (Java)

SET (CMAKE_Java_FLAGS "-sourcepath \"${CMAKE_CURRENT_SOURCE_DIR}\"")

SET (PROTO_SOURCE_FILES
    proto.java
)

ADD_LIBRARY (proto ${PROTO_SOURCE_FILES})