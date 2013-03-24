/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * Warning! This file is generated. Modify at your own risk.
 */

package com.google.api.services.hefesoftpharmacy.model;

import com.google.api.client.json.GenericJson;

/**
 * Model definition for DateHelperInt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * <p>
 * Upgrade warning: starting with version 1.12 {@code getResponseHeaders()} is removed, instead use
 * {@link com.google.api.client.http.json.JsonHttpRequest#getLastResponseHeaders()}
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateHelperInt extends GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer day;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer hour;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer minute;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer month;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Integer year;

  /**

   * The value returned may be {@code null}.
   */
  public Integer getDay() {
    return day;
  }

  /**

   * The value set may be {@code null}.
   */
  public DateHelperInt setDay(Integer day) {
    this.day = day;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getHour() {
    return hour;
  }

  /**

   * The value set may be {@code null}.
   */
  public DateHelperInt setHour(Integer hour) {
    this.hour = hour;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getMinute() {
    return minute;
  }

  /**

   * The value set may be {@code null}.
   */
  public DateHelperInt setMinute(Integer minute) {
    this.minute = minute;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getMonth() {
    return month;
  }

  /**

   * The value set may be {@code null}.
   */
  public DateHelperInt setMonth(Integer month) {
    this.month = month;
    return this;
  }

  /**

   * The value returned may be {@code null}.
   */
  public Integer getYear() {
    return year;
  }

  /**

   * The value set may be {@code null}.
   */
  public DateHelperInt setYear(Integer year) {
    this.year = year;
    return this;
  }

}
