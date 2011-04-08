
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project;

import com.rapleaf.jack.DatabaseConnection;
import com.rapleaf.jack.test_project.database_1.IDatabase1;
import com.rapleaf.jack.test_project.database_1.impl.Database1Impl;

public class DatabasesImpl implements IDatabases {
  private final IDatabase1 database1;

  public DatabasesImpl(DatabaseConnection database1_connection) {
    this.database1 = new Database1Impl(database1_connection, this);
  }

  public DatabasesImpl() {
    this.database1 = new Database1Impl(new DatabaseConnection("database1"), this);
  }

  public IDatabase1 getDatabase1() {
    return database1;
  }
}
