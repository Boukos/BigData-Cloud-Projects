/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.refactorlabs.cs378;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Lead extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Lead\",\"namespace\":\"com.refactorlabs.cs378\",\"fields\":[{\"name\":\"lead_id\",\"type\":\"long\",\"default\":0},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"LeadType\",\"symbols\":[\"GOOD\",\"DUPLICATE\",\"RANGE\",\"ERROR\",\"BAD\"],\"default\":\"BAD\"},\"default\":\"BAD\"},{\"name\":\"bid_type\",\"type\":{\"type\":\"enum\",\"name\":\"BidType\",\"symbols\":[\"LEAD\",\"SALE\",\"OTHER\"],\"default\":\"LEAD\"},\"default\":\"LEAD\"},{\"name\":\"advertiser\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"campaign_id\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"id\",\"type\":\"long\",\"default\":0},{\"name\":\"amount\",\"type\":\"float\",\"default\":0.0},{\"name\":\"revenue\",\"type\":\"float\",\"default\":0.0},{\"name\":\"test\",\"type\":\"boolean\",\"default\":\"false\"},{\"name\":\"ab\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"vdp_index\",\"type\":\"int\",\"default\":-1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long lead_id;
  @Deprecated public com.refactorlabs.cs378.LeadType type;
  @Deprecated public com.refactorlabs.cs378.BidType bid_type;
  @Deprecated public java.lang.CharSequence advertiser;
  @Deprecated public java.lang.CharSequence campaign_id;
  @Deprecated public long id;
  @Deprecated public float amount;
  @Deprecated public float revenue;
  @Deprecated public boolean test;
  @Deprecated public java.lang.CharSequence ab;
  @Deprecated public int vdp_index;

  /**
   * Default constructor.
   */
  public Lead() {}

  /**
   * All-args constructor.
   */
  public Lead(java.lang.Long lead_id, com.refactorlabs.cs378.LeadType type, com.refactorlabs.cs378.BidType bid_type, java.lang.CharSequence advertiser, java.lang.CharSequence campaign_id, java.lang.Long id, java.lang.Float amount, java.lang.Float revenue, java.lang.Boolean test, java.lang.CharSequence ab, java.lang.Integer vdp_index) {
    this.lead_id = lead_id;
    this.type = type;
    this.bid_type = bid_type;
    this.advertiser = advertiser;
    this.campaign_id = campaign_id;
    this.id = id;
    this.amount = amount;
    this.revenue = revenue;
    this.test = test;
    this.ab = ab;
    this.vdp_index = vdp_index;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return lead_id;
    case 1: return type;
    case 2: return bid_type;
    case 3: return advertiser;
    case 4: return campaign_id;
    case 5: return id;
    case 6: return amount;
    case 7: return revenue;
    case 8: return test;
    case 9: return ab;
    case 10: return vdp_index;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: lead_id = (java.lang.Long)value$; break;
    case 1: type = (com.refactorlabs.cs378.LeadType)value$; break;
    case 2: bid_type = (com.refactorlabs.cs378.BidType)value$; break;
    case 3: advertiser = (java.lang.CharSequence)value$; break;
    case 4: campaign_id = (java.lang.CharSequence)value$; break;
    case 5: id = (java.lang.Long)value$; break;
    case 6: amount = (java.lang.Float)value$; break;
    case 7: revenue = (java.lang.Float)value$; break;
    case 8: test = (java.lang.Boolean)value$; break;
    case 9: ab = (java.lang.CharSequence)value$; break;
    case 10: vdp_index = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'lead_id' field.
   */
  public java.lang.Long getLeadId() {
    return lead_id;
  }

  /**
   * Sets the value of the 'lead_id' field.
   * @param value the value to set.
   */
  public void setLeadId(java.lang.Long value) {
    this.lead_id = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public com.refactorlabs.cs378.LeadType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.refactorlabs.cs378.LeadType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'bid_type' field.
   */
  public com.refactorlabs.cs378.BidType getBidType() {
    return bid_type;
  }

  /**
   * Sets the value of the 'bid_type' field.
   * @param value the value to set.
   */
  public void setBidType(com.refactorlabs.cs378.BidType value) {
    this.bid_type = value;
  }

  /**
   * Gets the value of the 'advertiser' field.
   */
  public java.lang.CharSequence getAdvertiser() {
    return advertiser;
  }

  /**
   * Sets the value of the 'advertiser' field.
   * @param value the value to set.
   */
  public void setAdvertiser(java.lang.CharSequence value) {
    this.advertiser = value;
  }

  /**
   * Gets the value of the 'campaign_id' field.
   */
  public java.lang.CharSequence getCampaignId() {
    return campaign_id;
  }

  /**
   * Sets the value of the 'campaign_id' field.
   * @param value the value to set.
   */
  public void setCampaignId(java.lang.CharSequence value) {
    this.campaign_id = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'amount' field.
   */
  public java.lang.Float getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Float value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'revenue' field.
   */
  public java.lang.Float getRevenue() {
    return revenue;
  }

  /**
   * Sets the value of the 'revenue' field.
   * @param value the value to set.
   */
  public void setRevenue(java.lang.Float value) {
    this.revenue = value;
  }

  /**
   * Gets the value of the 'test' field.
   */
  public java.lang.Boolean getTest() {
    return test;
  }

  /**
   * Sets the value of the 'test' field.
   * @param value the value to set.
   */
  public void setTest(java.lang.Boolean value) {
    this.test = value;
  }

  /**
   * Gets the value of the 'ab' field.
   */
  public java.lang.CharSequence getAb() {
    return ab;
  }

  /**
   * Sets the value of the 'ab' field.
   * @param value the value to set.
   */
  public void setAb(java.lang.CharSequence value) {
    this.ab = value;
  }

  /**
   * Gets the value of the 'vdp_index' field.
   */
  public java.lang.Integer getVdpIndex() {
    return vdp_index;
  }

  /**
   * Sets the value of the 'vdp_index' field.
   * @param value the value to set.
   */
  public void setVdpIndex(java.lang.Integer value) {
    this.vdp_index = value;
  }

  /** Creates a new Lead RecordBuilder */
  public static com.refactorlabs.cs378.Lead.Builder newBuilder() {
    return new com.refactorlabs.cs378.Lead.Builder();
  }
  
  /** Creates a new Lead RecordBuilder by copying an existing Builder */
  public static com.refactorlabs.cs378.Lead.Builder newBuilder(com.refactorlabs.cs378.Lead.Builder other) {
    return new com.refactorlabs.cs378.Lead.Builder(other);
  }
  
  /** Creates a new Lead RecordBuilder by copying an existing Lead instance */
  public static com.refactorlabs.cs378.Lead.Builder newBuilder(com.refactorlabs.cs378.Lead other) {
    return new com.refactorlabs.cs378.Lead.Builder(other);
  }
  
  /**
   * RecordBuilder for Lead instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Lead>
    implements org.apache.avro.data.RecordBuilder<Lead> {

    private long lead_id;
    private com.refactorlabs.cs378.LeadType type;
    private com.refactorlabs.cs378.BidType bid_type;
    private java.lang.CharSequence advertiser;
    private java.lang.CharSequence campaign_id;
    private long id;
    private float amount;
    private float revenue;
    private boolean test;
    private java.lang.CharSequence ab;
    private int vdp_index;

    /** Creates a new Builder */
    private Builder() {
      super(com.refactorlabs.cs378.Lead.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.refactorlabs.cs378.Lead.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Lead instance */
    private Builder(com.refactorlabs.cs378.Lead other) {
            super(com.refactorlabs.cs378.Lead.SCHEMA$);
      if (isValidValue(fields()[0], other.lead_id)) {
        this.lead_id = data().deepCopy(fields()[0].schema(), other.lead_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bid_type)) {
        this.bid_type = data().deepCopy(fields()[2].schema(), other.bid_type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.advertiser)) {
        this.advertiser = data().deepCopy(fields()[3].schema(), other.advertiser);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.campaign_id)) {
        this.campaign_id = data().deepCopy(fields()[4].schema(), other.campaign_id);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.amount)) {
        this.amount = data().deepCopy(fields()[6].schema(), other.amount);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.revenue)) {
        this.revenue = data().deepCopy(fields()[7].schema(), other.revenue);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.test)) {
        this.test = data().deepCopy(fields()[8].schema(), other.test);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.ab)) {
        this.ab = data().deepCopy(fields()[9].schema(), other.ab);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.vdp_index)) {
        this.vdp_index = data().deepCopy(fields()[10].schema(), other.vdp_index);
        fieldSetFlags()[10] = true;
      }
    }

    /** Gets the value of the 'lead_id' field */
    public java.lang.Long getLeadId() {
      return lead_id;
    }
    
    /** Sets the value of the 'lead_id' field */
    public com.refactorlabs.cs378.Lead.Builder setLeadId(long value) {
      validate(fields()[0], value);
      this.lead_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'lead_id' field has been set */
    public boolean hasLeadId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'lead_id' field */
    public com.refactorlabs.cs378.Lead.Builder clearLeadId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public com.refactorlabs.cs378.LeadType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.refactorlabs.cs378.Lead.Builder setType(com.refactorlabs.cs378.LeadType value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'type' field */
    public com.refactorlabs.cs378.Lead.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'bid_type' field */
    public com.refactorlabs.cs378.BidType getBidType() {
      return bid_type;
    }
    
    /** Sets the value of the 'bid_type' field */
    public com.refactorlabs.cs378.Lead.Builder setBidType(com.refactorlabs.cs378.BidType value) {
      validate(fields()[2], value);
      this.bid_type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'bid_type' field has been set */
    public boolean hasBidType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'bid_type' field */
    public com.refactorlabs.cs378.Lead.Builder clearBidType() {
      bid_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'advertiser' field */
    public java.lang.CharSequence getAdvertiser() {
      return advertiser;
    }
    
    /** Sets the value of the 'advertiser' field */
    public com.refactorlabs.cs378.Lead.Builder setAdvertiser(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.advertiser = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'advertiser' field has been set */
    public boolean hasAdvertiser() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'advertiser' field */
    public com.refactorlabs.cs378.Lead.Builder clearAdvertiser() {
      advertiser = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'campaign_id' field */
    public java.lang.CharSequence getCampaignId() {
      return campaign_id;
    }
    
    /** Sets the value of the 'campaign_id' field */
    public com.refactorlabs.cs378.Lead.Builder setCampaignId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.campaign_id = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'campaign_id' field has been set */
    public boolean hasCampaignId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'campaign_id' field */
    public com.refactorlabs.cs378.Lead.Builder clearCampaignId() {
      campaign_id = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.refactorlabs.cs378.Lead.Builder setId(long value) {
      validate(fields()[5], value);
      this.id = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'id' field */
    public com.refactorlabs.cs378.Lead.Builder clearId() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'amount' field */
    public java.lang.Float getAmount() {
      return amount;
    }
    
    /** Sets the value of the 'amount' field */
    public com.refactorlabs.cs378.Lead.Builder setAmount(float value) {
      validate(fields()[6], value);
      this.amount = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'amount' field has been set */
    public boolean hasAmount() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'amount' field */
    public com.refactorlabs.cs378.Lead.Builder clearAmount() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'revenue' field */
    public java.lang.Float getRevenue() {
      return revenue;
    }
    
    /** Sets the value of the 'revenue' field */
    public com.refactorlabs.cs378.Lead.Builder setRevenue(float value) {
      validate(fields()[7], value);
      this.revenue = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'revenue' field has been set */
    public boolean hasRevenue() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'revenue' field */
    public com.refactorlabs.cs378.Lead.Builder clearRevenue() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'test' field */
    public java.lang.Boolean getTest() {
      return test;
    }
    
    /** Sets the value of the 'test' field */
    public com.refactorlabs.cs378.Lead.Builder setTest(boolean value) {
      validate(fields()[8], value);
      this.test = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'test' field has been set */
    public boolean hasTest() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'test' field */
    public com.refactorlabs.cs378.Lead.Builder clearTest() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'ab' field */
    public java.lang.CharSequence getAb() {
      return ab;
    }
    
    /** Sets the value of the 'ab' field */
    public com.refactorlabs.cs378.Lead.Builder setAb(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.ab = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'ab' field has been set */
    public boolean hasAb() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'ab' field */
    public com.refactorlabs.cs378.Lead.Builder clearAb() {
      ab = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'vdp_index' field */
    public java.lang.Integer getVdpIndex() {
      return vdp_index;
    }
    
    /** Sets the value of the 'vdp_index' field */
    public com.refactorlabs.cs378.Lead.Builder setVdpIndex(int value) {
      validate(fields()[10], value);
      this.vdp_index = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'vdp_index' field has been set */
    public boolean hasVdpIndex() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'vdp_index' field */
    public com.refactorlabs.cs378.Lead.Builder clearVdpIndex() {
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public Lead build() {
      try {
        Lead record = new Lead();
        record.lead_id = fieldSetFlags()[0] ? this.lead_id : (java.lang.Long) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (com.refactorlabs.cs378.LeadType) defaultValue(fields()[1]);
        record.bid_type = fieldSetFlags()[2] ? this.bid_type : (com.refactorlabs.cs378.BidType) defaultValue(fields()[2]);
        record.advertiser = fieldSetFlags()[3] ? this.advertiser : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.campaign_id = fieldSetFlags()[4] ? this.campaign_id : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.id = fieldSetFlags()[5] ? this.id : (java.lang.Long) defaultValue(fields()[5]);
        record.amount = fieldSetFlags()[6] ? this.amount : (java.lang.Float) defaultValue(fields()[6]);
        record.revenue = fieldSetFlags()[7] ? this.revenue : (java.lang.Float) defaultValue(fields()[7]);
        record.test = fieldSetFlags()[8] ? this.test : (java.lang.Boolean) defaultValue(fields()[8]);
        record.ab = fieldSetFlags()[9] ? this.ab : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.vdp_index = fieldSetFlags()[10] ? this.vdp_index : (java.lang.Integer) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}