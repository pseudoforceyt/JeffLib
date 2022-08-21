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

package com.jeff_media.jefflib.tests;

import com.jeff_media.jefflib.TextUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTextUtils {

    @Test
    public void testColor() {
        Assertions.assertEquals("§x§1§2§3§4§5§6Text", TextUtils.color("<#123456>Text"));
    }

    @Test
    public void testPlaceholders() {
        String expected = "My name is Jeff.";
        String placeholder = "My {property} is {value}.";
        Assertions.assertEquals(expected, TextUtils.replaceInString(placeholder, "{property}", "name", "{value}", "Jeff"));
    }
}
