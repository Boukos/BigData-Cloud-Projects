/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.refactorlabs.cs378;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum ActionName { 
  VIEWED_CARFAX_REPORT, VIEWED_CARFAX_REPORT_UNHOSTED, VEHICLE_AT_DEALER_PAGE_VIEWED, MAP_DEALER_LOCATION, PRINT_VEHICLE_DETAIL, MORE_PHOTOS_VIEWED, DEALER_PAGE_VIEWED, DEALER_WEBSITE_VIEWED, UNKNOWN, NONE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"ActionName\",\"namespace\":\"com.refactorlabs.cs378\",\"symbols\":[\"VIEWED_CARFAX_REPORT\",\"VIEWED_CARFAX_REPORT_UNHOSTED\",\"VEHICLE_AT_DEALER_PAGE_VIEWED\",\"MAP_DEALER_LOCATION\",\"PRINT_VEHICLE_DETAIL\",\"MORE_PHOTOS_VIEWED\",\"DEALER_PAGE_VIEWED\",\"DEALER_WEBSITE_VIEWED\",\"UNKNOWN\",\"NONE\"],\"default\":\"NONE\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}