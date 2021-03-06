/**
 * Copyright 2011-2012 Adrian Stabiszewski, as@nfctools.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nfctools.mf.classic;

import java.util.Arrays;


public class KeyValue {

	private Key key;
	private byte[] keyValue;

	public KeyValue(Key key, byte[] keyValue) {
		this.key = key;
		this.keyValue = keyValue;
	}

	public Key getKey() {
		return key;
	}

	public byte[] getKeyValue() {
		return keyValue;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public void setKeyValue(byte[] keyValue) {
		this.keyValue = keyValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + Arrays.hashCode(keyValue);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValue other = (KeyValue) obj;
		if (key != other.key)
			return false;
		if (!Arrays.equals(keyValue, other.keyValue))
			return false;
		return true;
	}

	
}
