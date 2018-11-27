package com.devon.demo.common;

/**
 * The interface Shape.
 */
public interface Shape {
    /**
     * Transform shape.
     *
     * @return the shape
     */
    Shape transform();

    /**
     * Name string.
     *
     * @return the string
     */
    String getName();

    /**
     * Gets description.
     *
     * @return the description
     */
    String getDescription();
}
