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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-03-20 15:12:36 UTC)
 * on 2013-04-01 at 23:47:39 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.hefesoftpharmacy.model;

/**
 * Model definition for UnidadVisita.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UnidadVisita extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Actividadjustificada actividadjustificadaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Farmacias farmaciasEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> idUnidadVisita;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Medicos medicosEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key unidadVisita;

  /**
   * @return value or {@code null} for none
   */
  public Actividadjustificada getActividadjustificadaEntity() {
    return actividadjustificadaEntity;
  }

  /**
   * @param actividadjustificadaEntity actividadjustificadaEntity or {@code null} for none
   */
  public UnidadVisita setActividadjustificadaEntity(Actividadjustificada actividadjustificadaEntity) {
    this.actividadjustificadaEntity = actividadjustificadaEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Farmacias getFarmaciasEntity() {
    return farmaciasEntity;
  }

  /**
   * @param farmaciasEntity farmaciasEntity or {@code null} for none
   */
  public UnidadVisita setFarmaciasEntity(Farmacias farmaciasEntity) {
    this.farmaciasEntity = farmaciasEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public UnidadVisita setId(Key id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getIdUnidadVisita() {
    return idUnidadVisita;
  }

  /**
   * @param idUnidadVisita idUnidadVisita or {@code null} for none
   */
  public UnidadVisita setIdUnidadVisita(java.util.List<java.lang.Long> idUnidadVisita) {
    this.idUnidadVisita = idUnidadVisita;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Medicos getMedicosEntity() {
    return medicosEntity;
  }

  /**
   * @param medicosEntity medicosEntity or {@code null} for none
   */
  public UnidadVisita setMedicosEntity(Medicos medicosEntity) {
    this.medicosEntity = medicosEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getUnidadVisita() {
    return unidadVisita;
  }

  /**
   * @param unidadVisita unidadVisita or {@code null} for none
   */
  public UnidadVisita setUnidadVisita(Key unidadVisita) {
    this.unidadVisita = unidadVisita;
    return this;
  }

  @Override
  public UnidadVisita set(String fieldName, Object value) {
    return (UnidadVisita) super.set(fieldName, value);
  }

  @Override
  public UnidadVisita clone() {
    return (UnidadVisita) super.clone();
  }

}
