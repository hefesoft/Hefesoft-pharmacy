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
 * Model definition for Usuario.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Usuario extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apellidos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteCluster gerenteClusterEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteDistrito gerenteDistritoEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteDivision gerenteDivisionEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteEmpresa gerenteEmpresaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteLinea gerenteLineaEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerentePais gerentePaisEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GerenteRegional gerenteRegionalEntity;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteCluster;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteDistrito;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteDivision;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteEmpresa;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteLinea;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerentePais;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGerenteRegional;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> idsLineas;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Linea> lineasEntitys;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombres;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telefono;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telefonoCelular;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApellidos() {
    return apellidos;
  }

  /**
   * @param apellidos apellidos or {@code null} for none
   */
  public Usuario setApellidos(java.lang.String apellidos) {
    this.apellidos = apellidos;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public Usuario setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteCluster getGerenteClusterEntity() {
    return gerenteClusterEntity;
  }

  /**
   * @param gerenteClusterEntity gerenteClusterEntity or {@code null} for none
   */
  public Usuario setGerenteClusterEntity(GerenteCluster gerenteClusterEntity) {
    this.gerenteClusterEntity = gerenteClusterEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteDistrito getGerenteDistritoEntity() {
    return gerenteDistritoEntity;
  }

  /**
   * @param gerenteDistritoEntity gerenteDistritoEntity or {@code null} for none
   */
  public Usuario setGerenteDistritoEntity(GerenteDistrito gerenteDistritoEntity) {
    this.gerenteDistritoEntity = gerenteDistritoEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteDivision getGerenteDivisionEntity() {
    return gerenteDivisionEntity;
  }

  /**
   * @param gerenteDivisionEntity gerenteDivisionEntity or {@code null} for none
   */
  public Usuario setGerenteDivisionEntity(GerenteDivision gerenteDivisionEntity) {
    this.gerenteDivisionEntity = gerenteDivisionEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteEmpresa getGerenteEmpresaEntity() {
    return gerenteEmpresaEntity;
  }

  /**
   * @param gerenteEmpresaEntity gerenteEmpresaEntity or {@code null} for none
   */
  public Usuario setGerenteEmpresaEntity(GerenteEmpresa gerenteEmpresaEntity) {
    this.gerenteEmpresaEntity = gerenteEmpresaEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteLinea getGerenteLineaEntity() {
    return gerenteLineaEntity;
  }

  /**
   * @param gerenteLineaEntity gerenteLineaEntity or {@code null} for none
   */
  public Usuario setGerenteLineaEntity(GerenteLinea gerenteLineaEntity) {
    this.gerenteLineaEntity = gerenteLineaEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerentePais getGerentePaisEntity() {
    return gerentePaisEntity;
  }

  /**
   * @param gerentePaisEntity gerentePaisEntity or {@code null} for none
   */
  public Usuario setGerentePaisEntity(GerentePais gerentePaisEntity) {
    this.gerentePaisEntity = gerentePaisEntity;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GerenteRegional getGerenteRegionalEntity() {
    return gerenteRegionalEntity;
  }

  /**
   * @param gerenteRegionalEntity gerenteRegionalEntity or {@code null} for none
   */
  public Usuario setGerenteRegionalEntity(GerenteRegional gerenteRegionalEntity) {
    this.gerenteRegionalEntity = gerenteRegionalEntity;
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
  public Usuario setId(Key id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteCluster() {
    return idGerenteCluster;
  }

  /**
   * @param idGerenteCluster idGerenteCluster or {@code null} for none
   */
  public Usuario setIdGerenteCluster(java.lang.Long idGerenteCluster) {
    this.idGerenteCluster = idGerenteCluster;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteDistrito() {
    return idGerenteDistrito;
  }

  /**
   * @param idGerenteDistrito idGerenteDistrito or {@code null} for none
   */
  public Usuario setIdGerenteDistrito(java.lang.Long idGerenteDistrito) {
    this.idGerenteDistrito = idGerenteDistrito;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteDivision() {
    return idGerenteDivision;
  }

  /**
   * @param idGerenteDivision idGerenteDivision or {@code null} for none
   */
  public Usuario setIdGerenteDivision(java.lang.Long idGerenteDivision) {
    this.idGerenteDivision = idGerenteDivision;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteEmpresa() {
    return idGerenteEmpresa;
  }

  /**
   * @param idGerenteEmpresa idGerenteEmpresa or {@code null} for none
   */
  public Usuario setIdGerenteEmpresa(java.lang.Long idGerenteEmpresa) {
    this.idGerenteEmpresa = idGerenteEmpresa;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteLinea() {
    return idGerenteLinea;
  }

  /**
   * @param idGerenteLinea idGerenteLinea or {@code null} for none
   */
  public Usuario setIdGerenteLinea(java.lang.Long idGerenteLinea) {
    this.idGerenteLinea = idGerenteLinea;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerentePais() {
    return idGerentePais;
  }

  /**
   * @param idGerentePais idGerentePais or {@code null} for none
   */
  public Usuario setIdGerentePais(java.lang.Long idGerentePais) {
    this.idGerentePais = idGerentePais;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGerenteRegional() {
    return idGerenteRegional;
  }

  /**
   * @param idGerenteRegional idGerenteRegional or {@code null} for none
   */
  public Usuario setIdGerenteRegional(java.lang.Long idGerenteRegional) {
    this.idGerenteRegional = idGerenteRegional;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getIdsLineas() {
    return idsLineas;
  }

  /**
   * @param idsLineas idsLineas or {@code null} for none
   */
  public Usuario setIdsLineas(java.util.List<java.lang.Long> idsLineas) {
    this.idsLineas = idsLineas;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Linea> getLineasEntitys() {
    return lineasEntitys;
  }

  /**
   * @param lineasEntitys lineasEntitys or {@code null} for none
   */
  public Usuario setLineasEntitys(java.util.List<Linea> lineasEntitys) {
    this.lineasEntitys = lineasEntitys;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombres() {
    return nombres;
  }

  /**
   * @param nombres nombres or {@code null} for none
   */
  public Usuario setNombres(java.lang.String nombres) {
    this.nombres = nombres;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * @param password password or {@code null} for none
   */
  public Usuario setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelefono() {
    return telefono;
  }

  /**
   * @param telefono telefono or {@code null} for none
   */
  public Usuario setTelefono(java.lang.String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelefonoCelular() {
    return telefonoCelular;
  }

  /**
   * @param telefonoCelular telefonoCelular or {@code null} for none
   */
  public Usuario setTelefonoCelular(java.lang.String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
    return this;
  }

  @Override
  public Usuario set(String fieldName, Object value) {
    return (Usuario) super.set(fieldName, value);
  }

  @Override
  public Usuario clone() {
    return (Usuario) super.clone();
  }

}
