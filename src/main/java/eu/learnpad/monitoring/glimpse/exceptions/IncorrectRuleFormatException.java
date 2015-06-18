 /*
  * GLIMPSE: A generic and flexible monitoring infrastructure.
  * For further information: http://labsewiki.isti.cnr.it/labse/tools/glimpse/public/main
  * 
  * Copyright (C) 2011  Software Engineering Laboratory - ISTI CNR - Pisa - Italy
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
  * 
*/

package eu.learnpad.monitoring.glimpse.exceptions;

import eu.learnpad.monitoring.glimpse.utils.DebugMessages;

import org.apache.commons.net.ntp.TimeStamp;

/**
 * This exception will be thrown when the Monitoring Manager<br />
 * will receive an invalid rule.<br />
 * The rule is contained into the field RuleBody of the ComplexEventRuleDocument object
 * 
 * @author Antonello Calabr&ograve;
 * @version 3.2
 */

public class IncorrectRuleFormatException extends Exception {
	private static final long serialVersionUID = -2577929182751048650L;

	public IncorrectRuleFormatException()
	{
		DebugMessages.println(TimeStamp.getCurrentTime(), this.getClass().getSimpleName(), "Check rule format, may contains errors");
	}
}
