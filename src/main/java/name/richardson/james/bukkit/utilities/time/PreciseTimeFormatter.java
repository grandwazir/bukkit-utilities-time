/*******************************************************************************
 Copyright (c) 2014 James Richardson.

 PreciseTimeFormatter.java is part of BukkitUtilities.

 BukkitUtilities is free software: you can redistribute it and/or modify it
 under the terms of the GNU General Public License as published by the Free
 Software Foundation, either version 3 of the License, or (at your option) any
 later version.

 BukkitUtilities is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along with
 BukkitUtilities. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package name.richardson.james.bukkit.utilities.time;

import java.util.Date;
import java.util.List;

import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.PrettyTime;

/**
 * Formats time into their exact respective units without prefixes or suffixes. For example "3 hours 12 seconds".
 */
public class PreciseTimeFormatter extends AbstractTimeFormatter {

	/**
	 * Return the human readable duration for a given number of milliseconds.
	 *
	 * @param time the number of milliseconds
	 * @return the string representing the number of milliseconds in a human readable format.
	 */
	@Override
	public String getHumanReadableDuration(long time) {
		if (time < System.currentTimeMillis()) throw new IllegalArgumentException("Dates in the past are not formatted correctly.");
		PrettyTime formatter = new PrettyTime();
		// formatter.removeUnit(Millisecond.class);
		Date date = new Date(time);
		List<Duration> duration = formatter.calculatePreciseDuration(date);
		return formatter.format(duration);
	}

}
