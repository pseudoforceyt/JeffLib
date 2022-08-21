/*
 *     Copyright (c) 2022. JEFF Media GbR / mfnalex et al.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.jeff_media.jefflib.internal;

import com.allatori.annotations.DoNotRename;
import com.jeff_media.jefflib.ReflUtils;
import com.jeff_media.jefflib.internal.annotations.Internal;

@Internal
@DoNotRename
public final class NMSReflUtils {

    @DoNotRename
    public static void setField(final Class<?> clazz, final Object object, final String fieldName, final Object value) {
        ReflUtils.setFieldValue(clazz, object, fieldName, value);
    }
}