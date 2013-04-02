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
 * Model definition for GerenteRegional.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GerenteRegional extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idUsuario;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usuario usuarioEntity;

  /**
   * @return value or {@code null} for none
   */
  public Key getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public GerenteRegional setId(Key id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdUsuario() {
    return idUsuario;
  }

  /**
   * @param idUsuario idUsuario or {@code null} for none
   */
  public GerenteRegional setIdUsuario(java.lang.Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Usuario getUsuarioEntity() {
    return usuarioEntity;
  }

  /**
   * @param usuarioEntity usuarioEntity or {@code null} for none
   */
  public GerenteRegional setUsuarioEntity(Usuario usuarioEntity) {
    this.usuarioEntity = usuarioEntity;
    return this;
  }

  @Override
  public GerenteRegional set(String fieldName, Object value) {
    return (GerenteRegional) super.set(fieldName, value);
  }

  @Override
  public GerenteRegional clone() {
    return (GerenteRegional) super.clone();
  }

}
