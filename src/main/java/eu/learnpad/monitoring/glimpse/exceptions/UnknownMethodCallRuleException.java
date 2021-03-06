/**
 * 
 */
package eu.learnpad.monitoring.glimpse.exceptions;

import eu.learnpad.monitoring.glimpse.utils.DebugMessages;

import org.apache.commons.net.ntp.TimeStamp;

/**
 * 
 * @author Antonello Calabr&ograve;
 *
 * @version 3.2
 */
public class UnknownMethodCallRuleException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnknownMethodCallRuleException() {
		DebugMessages.println(TimeStamp.getCurrentTime(), this.getClass().getSimpleName(), "Loaded rule may contains unknown method calls");
	}
	
}
