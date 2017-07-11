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

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;

/**
 * CalledPartyNumberWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CalledPartyNumberWrapper extends Serializable {

    String getAddress() throws Ss7WrapperException;

    Nature getNature() throws Ss7WrapperException;

    NumberingPlan getNumberingPlan() throws Ss7WrapperException;

    boolean hasAddress() throws Ss7WrapperException;

    boolean hasNature() throws Ss7WrapperException;

    boolean hasNumberingPlan() throws Ss7WrapperException;

    RoutingToInternalNetworkNumber getRoutingToInternalNetworkNumber() throws Ss7WrapperException;

    enum NumberingPlan {
        SPARE_0(0),
        ISDN(1),
        SPARE_2(2),
        DATA(3),
        TELEX(4),
        NATIONAL_5(5),
        NATIONAL_6(6),
        SPARE_7(7);

        private int value;

        NumberingPlan(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static NumberingPlan valueOf(int id) {
            for (NumberingPlan m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    enum RoutingToInternalNetworkNumber {
        ALLOWED(0),
        NOT_ALLOWED(1);

        private int value;

        RoutingToInternalNetworkNumber(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static RoutingToInternalNetworkNumber valueOf(int id) {
            for (RoutingToInternalNetworkNumber m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    class Nature {
        private static final int _SUBSCRIBER = 1;
        private static final int _UNKNOWN = 2;
        private static final int _NATIONAL = 3;
        private static final int _INTERNATIONAL = 4;
        private static final int _NETWORK_SPECIFIC = 5;
        private static final int _NETWORK_ROUTING_NATIONAL = 6;
        private static final int _NETWORK_ROUTING_NETWORK_SPECIFIC = 7;
        private static final int _NETWORK_ROUTING_WITH_CALLED_DIRECTORY = 8;

        public static final Nature SUBSCRIBER = new Nature(_SUBSCRIBER);
        public static final Nature UNKNOWN = new Nature(_UNKNOWN);
        public static final Nature NATIONAL = new Nature(_NATIONAL);
        public static final Nature INTERNATIONAL = new Nature(_INTERNATIONAL);
        public static final Nature NETWORK_SPECIFIC = new Nature(_NETWORK_SPECIFIC);
        public static final Nature NETWORK_ROUTING_NATIONAL = new Nature(_NETWORK_ROUTING_NATIONAL);
        public static final Nature NETWORK_ROUTING_NETWORK_SPECIFIC = new Nature(_NETWORK_ROUTING_NETWORK_SPECIFIC);
        public static final Nature NETWORK_ROUTING_WITH_CALLED_DIRECTORY = new Nature(_NETWORK_ROUTING_WITH_CALLED_DIRECTORY);
        public static final int MAX = 127;
        public static final int MIN = 0;


        private int value;

        private Nature(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Nature valueOf(int id) {
            switch (id) {
                case _SUBSCRIBER: return SUBSCRIBER;
                case _UNKNOWN: return UNKNOWN;
                case _NATIONAL: return NATIONAL;
                case _INTERNATIONAL: return INTERNATIONAL;
                case _NETWORK_SPECIFIC: return NETWORK_SPECIFIC;
                case _NETWORK_ROUTING_NATIONAL: return NETWORK_ROUTING_NATIONAL;
                case _NETWORK_ROUTING_NETWORK_SPECIFIC: return NETWORK_ROUTING_NETWORK_SPECIFIC;
                case _NETWORK_ROUTING_WITH_CALLED_DIRECTORY: return NETWORK_ROUTING_WITH_CALLED_DIRECTORY;
                default:
                    if (id >= MIN && id < MAX) {
                        return new Nature(id);
                    }
            }

            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.Nature constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Nature)) return false;

            final Nature that = (Nature) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}