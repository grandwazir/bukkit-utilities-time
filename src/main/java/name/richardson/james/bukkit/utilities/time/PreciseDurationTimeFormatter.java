/*******************************************************************************
 Copyright (c) 2014 James Richardson.

 PreciseDurationTimeFormatter.java is part of BukkitUtilities.

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
import org.ocpsoft.prettytime.units.JustNow;

public class PreciseDurationTimeFormatter extends AbstractTimeFormatter {

	/**
	 * Return the human readable duration for a given number of milliseconds.
	 *
	 * @param time the number of milliseconds
	 * @return the string representing the number of milliseconds in a human readable format.
	 */
	@Override
	public final String getHumanReadableDuration(long time) {
		// This is a bit of a hack so it only works with the english language
		PrettyTime formatter = new PrettyTime();
		formatter.removeUnit(JustNow.class);
		Date date = new Date(System.currentTimeMillis() + time);
		List<Duration> durationList = formatter.calculatePreciseDuration(date);
		String duration = formatter.format(durationList);
		duration = duration.replaceAll("from now", "");
		duration = duration.replaceAll("ago", "");
		return duration.trim();
	}

}
