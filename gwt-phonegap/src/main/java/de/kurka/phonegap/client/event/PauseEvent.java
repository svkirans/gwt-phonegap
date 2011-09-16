/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.phonegap.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class PauseEvent extends GwtEvent<PauseHandler> {

	public static final GwtEvent.Type<PauseHandler> TYPE = new Type<PauseHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<PauseHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(PauseHandler handler) {
		handler.onPause(this);

	}

	public static GwtEvent.Type<PauseHandler> getType() {
		return TYPE;
	}

}
