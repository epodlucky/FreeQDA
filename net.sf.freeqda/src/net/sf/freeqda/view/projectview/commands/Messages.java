/*******************************************************************************
 * FreeQDA,  a software for professional qualitative research data 
 * analysis, such as interviews, manuscripts, journal articles, memos
 * and field notes.
 *
 * Copyright (C) 2011 Dirk Kitscha, Jörg große Schlarmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package net.sf.freeqda.view.projectview.commands;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.sf.freeqda.view.projectview.commands.messages"; //$NON-NLS-1$
	public static String DeleteCategoryHandler_DialogMessage;
	public static String DeleteCategoryHandler_DialogMessageAddition;
	public static String DeleteCategoryHandler_DialogText;
	public static String DeleteTextHandler_DialogMessage;
	public static String DeleteTextHandler_DialogText;
	public static String DeleteTextHandler_InvalidObject;
	public static String EditTextHandler_InvalidObject;
	public static String NewTextCategoryHandler_DefaultName;
	public static String NewTextHandler_DefaultName;
	public static String NewTextHandler_InvalidObject;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
