package com.rebelempiremc.landimpedance.api;

/*
* Represents a quadrant of the map; used for around 400% faster loading from the protectionstore--you only search through protections in the quadrant
* Known caveat, no support for protections on the axis or overlapping; it won't make a big difference at all, so it will be based on what's returned first.
 */
public enum Quadrant {
    Q1,Q2,Q3,Q4;
}
