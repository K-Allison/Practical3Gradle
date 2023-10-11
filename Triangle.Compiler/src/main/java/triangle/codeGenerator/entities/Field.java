/*
 * @(#)Field.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package triangle.codeGenerator.entities;

public class Field extends RuntimeEntity {

	private final int fieldOffset;

	public Field(int size, int fieldOffset) {
		super(size);
		this.fieldOffset = fieldOffset;
	}

	public final int getFieldOffset() {
		return fieldOffset;
	}
}
