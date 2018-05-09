/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Connection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConnectionList
 */

public class ConnectionList {
  @SerializedName("nextLink")
  private String nextLink = null;

  @SerializedName("connection")
  private List<Connection> connection = null;

  public ConnectionList nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

   /**
   * Get nextLink
   * @return nextLink
  **/
  @ApiModelProperty(value = "")
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }

  public ConnectionList connection(List<Connection> connection) {
    this.connection = connection;
    return this;
  }

  public ConnectionList addConnectionItem(Connection connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<Connection>();
    }
    this.connection.add(connectionItem);
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public List<Connection> getConnection() {
    return connection;
  }

  public void setConnection(List<Connection> connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionList connectionList = (ConnectionList) o;
    return Objects.equals(this.nextLink, connectionList.nextLink) &&
        Objects.equals(this.connection, connectionList.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextLink, connection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionList {\n");
    
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
