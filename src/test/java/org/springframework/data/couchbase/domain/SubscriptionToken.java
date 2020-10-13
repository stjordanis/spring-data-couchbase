package org.springframework.data.couchbase.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Getter
@ToString
@EqualsAndHashCode
@Document
public class SubscriptionToken {
  private @Id
  @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
  String id;
  private @Version
  long version;
  private @Field
  String subscriptionType;
  private @Field
  String userName;
  private @Field
  String appId;
  private @Field
  String deviceId;
  private @Field
  long subscriptionDate;

  public SubscriptionToken(
      String id,
      long version,
      String subscriptionType,
      String userName,
      String appId,
      String deviceId,
      long subscriptionDate) {
    this.id = id;
    this.version = version;
    this.subscriptionType = subscriptionType;
    this.userName = userName;
    this.appId = appId;
    this.deviceId = deviceId;
    this.subscriptionDate = subscriptionDate;
  }

  public void setType(String type) {
    type = type;
  }
}
