
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
/* generated from migration version 20110324000133 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.Post;
import java.io.IOException;

import com.rapleaf.jack.IModelPersistence;

public interface IPostPersistence extends IModelPersistence<Post> {
  public Post create(final String title, final Long posted_at_millis, final Integer user_id) throws IOException;
}
