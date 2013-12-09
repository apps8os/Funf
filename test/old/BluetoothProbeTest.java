/**
 * Funf: Open Sensing Framework
 * Copyright (C) 2010-2011 Nadav Aharony, Wei Pan, Alex Pentland. 
 * Acknowledgments: Alan Gardner
 * Contact: nadav@media.mit.edu
 * 
 * This file is part of Funf.
 * 
 * Funf is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version. 
 * 
 * Funf is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with Funf. If not, see <http://www.gnu.org/licenses/>.
 */
package edu.mit.media.funf.probe.builtin;

import edu.mit.media.funftest.probe.ProbeTestCase;
import android.os.Bundle;

public class BluetoothProbeTest extends ProbeTestCase<BluetoothProbe> {

	public BluetoothProbeTest() {
		super(BluetoothProbe.class);
	}

	public void testBluetoothProbe() {
		Bundle params = new Bundle();
		startProbe(params);
		Bundle data = getData(20);
		assertNotNull(data.get("DEVICES"));
	}
}
