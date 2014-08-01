/*******************************************************************************
 Copyright (c) 2014 James Richardson.

 PreciseDurationTimeFormatterTest.java is part of BukkitUtilities.

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

package name.richardson.james.bukkit.utilities.formatters;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import name.richardson.james.bukkit.utilities.time.PreciseDurationTimeFormatter;

@RunWith(JUnit4.class)
public class PreciseDurationTimeFormatterTest extends AbstractTimeFormatterTest {

	@Test
	public void getHumanReadableTime_WhenTimeInFuture_GetPreciseDuration() {
		assertEquals("1 day 12 hours 30 minutes 15 seconds", getFormatter().getHumanReadableDuration(131415000));
	}

	@Test
	@Ignore("Occasionally fails depending on how quick the test is executed. Will fix this later on.")
	public void getHumanReadableTime_WhenTimeisShort_GetPreciseDuration() {
		assertEquals("10 seconds", getFormatter().getHumanReadableDuration(10000));
	}

	@Before
	public void setUp()
	throws Exception {
		setFormatter(new PreciseDurationTimeFormatter());
	}


}
