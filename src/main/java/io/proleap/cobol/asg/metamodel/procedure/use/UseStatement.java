/*
 * Copyright (C) 2017, Ulrich Wolffgang <ulrich.wolffgang@proleap.io>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure.use;

import io.proleap.cobol.CobolParser.UseAfterClauseContext;
import io.proleap.cobol.CobolParser.UseDebugClauseContext;
import io.proleap.cobol.asg.metamodel.procedure.Statement;

/**
 * Specifies procedures for handling input or output errors.
 */
public interface UseStatement extends Statement {

	enum UseType {
		AFTER, DEBUG
	}

	UseAfterStatement addUseAfterStatement(UseAfterClauseContext ctx);

	UseDebugStatement addUseDebugStatement(UseDebugClauseContext ctx);

	UseAfterStatement getUseAfterStatement();

	UseDebugStatement getUseDebugStatement();

	UseType getUseType();

	void setUseType(UseType useType);
}
