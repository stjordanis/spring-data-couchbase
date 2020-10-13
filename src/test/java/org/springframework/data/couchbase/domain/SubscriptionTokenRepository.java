package org.springframework.data.couchbase.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


  /**
   * User Repository for tests
   *
   * @author Michael Nitschinger
   * @author Michael Reiche
   */
  @Repository
  public interface SubscriptionTokenRepository extends PagingAndSortingRepository<SubscriptionToken, String> {

  }
