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

import java.awt.Component;

import javax.annotation.Nullable;

import org.assertj.swing.annotation.RunsInCurrentThread;

/**
 * <p>
 * Reads the value of an AWT or Swing {@code Component} that used as a cell renderer.
 * </p>
 * 
 * @author Alex Ruiz
 */
public interface CellRendererReader {
  /**
   * <p>
   * Reads the value in the given cell renderer {@code Component}, or returns {@code null} if the component is not
   * recognized by this reader.
   * </p>
   * 
   * <p>
   * <b>Note:</b> This method is accessed in the current executing thread. Such thread may or may not be the event
   * dispatch thread (EDT). Client code must call this method from the EDT.
   * </p>
   * 
   * @param c the given cell renderer component.
   * @return the value of the given {@code Component}, or {@code null} if the renderer belongs to an unknown component
   *         type.
   */
  @RunsInCurrentThread
  @Nullable
  String valueFrom(@Nullable Component c);
}
