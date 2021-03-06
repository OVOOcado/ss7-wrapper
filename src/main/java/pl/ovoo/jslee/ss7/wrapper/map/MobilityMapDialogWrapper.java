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

package pl.ovoo.jslee.ss7.wrapper.map;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.map.args.AnyTimeInterrogationArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.AnyTimeInterrogationResultWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.AnyTimeSubscriptionInterrogationArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.InsertSubscriberDataArg_v1Wrapper;


/**
 * MobillityMapDialogWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MobilityMapDialogWrapper extends MapDialogWrapper {
    
    /**
     * Send any time interrogation.
     *
     * @param atiTimeout the ati timeout
     * @param arg the arg
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendAnyTimeInterrogation(long atiTimeout, AnyTimeInterrogationArgWrapper arg) throws Ss7WrapperException;
    
    /**
     * Send any time interrogation response.
     *
     * @param invoke the invoke
     * @param arg the arg
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendAnyTimeInterrogationResponse(long invoke, AnyTimeInterrogationResultWrapper arg) throws Ss7WrapperException;
    
    /**
     * Send any time subscription interrogation.
     *
     * @param atiTimeout the ati timeout
     * @param arg the arg
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendAnyTimeSubscriptionInterrogation(long atiTimeout, AnyTimeSubscriptionInterrogationArgWrapper arg) throws Ss7WrapperException;
    
    /**
     * Send insert subscriber data arg_v1.
     *
     * @param isdTimeout the isd timeout
     * @param arg the arg
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendInsertSubscriberDataArg_v1(long isdTimeout, InsertSubscriberDataArg_v1Wrapper arg) throws Ss7WrapperException;
    
    /**
     * Send insert subscriber data response.
     *
     * @param invoke the invoke
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendInsertSubscriberDataResponse(long invoke) throws Ss7WrapperException;
}
