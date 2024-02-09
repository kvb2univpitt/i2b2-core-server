/*
 * Copyright (C) 2023 University of Pittsburgh.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package edu.pitt.dbmi.i2b2.ontologystore;

/**
 *
 * Dec 14, 2023 9:30:50 PM
 *
 * @author Kevin V. Bui (kvb2univpitt@gmail.com)
 */
public class ZipFileValidationException extends Exception {

    public ZipFileValidationException() {
    }

    public ZipFileValidationException(String message) {
        super(message);
    }

    public ZipFileValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZipFileValidationException(Throwable cause) {
        super(cause);
    }

    public ZipFileValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
