/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.swing.driver;

import org.junit.Test;

/**
 * Tests for {@link FrameDriver#requireTitle(Frame, String)}.
 *
 * @author Christian Rösch
 */
public class FrameDriver_requireTitle_Test extends FrameDriver_TestCase {
  private static final String CORRECT_TITLE = FrameDriver_requireTitle_Test.class.getSimpleName();

  @Test
  public void should_Fail_If_Frame_Does_Not_Have_Expected_Title() {
    thrown.expectAssertionError("property:'title'");
    thrown.expectMessageToContain("expected:<\"[incorrect title]\"> but was:<\"[" + CORRECT_TITLE + "]\">");
    driver.requireTitle(window, "incorrect title");
  }

  @Test
  public void should_Pass_If_Frame_Has_Expected_Title() {
    driver.requireTitle(window, CORRECT_TITLE);
  }
}
