package com.datamountaineer.ingestor.models

case class SqoopJobSearchParameters( job_name: Option[String] = None,
                                  table: Option[String] = None,
                                  database: Option[String] = None,
                                  server: Option[String] = None,
                                  enabled : Option[Boolean] = None)

case class SqoopJobPropParameters( job_name: Option[String] = None, prop_name: Option[String] = None)

case class SqoopLogParameters( job_name: Option[String] = None, status: Option[String] = None)