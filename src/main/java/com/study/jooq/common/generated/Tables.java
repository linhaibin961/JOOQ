/**
 * This class is generated by jOOQ
 */
package com.study.jooq.common.generated;


import com.study.jooq.common.generated.tables.Order;
import com.study.jooq.common.generated.tables.SchemaVersion;
import com.study.jooq.common.generated.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in study
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table study.order
	 */
	public static final Order ORDER = com.study.jooq.common.generated.tables.Order.ORDER;

	/**
	 * The table study.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = com.study.jooq.common.generated.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table study.user
	 */
	public static final User USER = com.study.jooq.common.generated.tables.User.USER;
}
