/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.data.screen;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;

public interface JustifiedClause extends CobolDivisionElement {

	enum Justified {
		JUSTIFIED, JUSTIFIED_RIGHT
	}

	Justified getJustified();

	void setJustified(Justified justified);
}
