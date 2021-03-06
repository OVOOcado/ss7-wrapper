/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.cap.args.cap2;

import pl.ovoo.jslee.ss7.wrapper.cap.args.TimeAndTimezoneWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap1.Cap1InitialDPArgWrapper;


/**
 * Cap2InitialDPArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2InitialDPArgWrapper extends Cap1InitialDPArgWrapper {

    /**
     * Gets the time and timezone.
     *
     * @return the time and timezone
     */
    TimeAndTimezoneWrapper getTimeAndTimezone();

    /**
     * Sets the time and timezone.
     *
     * @param timeAndTimezone the new time and timezone
     */
    void setTimeAndTimezone(TimeAndTimezoneWrapper timeAndTimezone);

}
