package com.easyui.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEU_USER_IDIsNull() {
            addCriterion("EU_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDIsNotNull() {
            addCriterion("EU_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDEqualTo(String value) {
            addCriterion("EU_USER_ID =", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDNotEqualTo(String value) {
            addCriterion("EU_USER_ID <>", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDGreaterThan(String value) {
            addCriterion("EU_USER_ID >", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("EU_USER_ID >=", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDLessThan(String value) {
            addCriterion("EU_USER_ID <", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDLessThanOrEqualTo(String value) {
            addCriterion("EU_USER_ID <=", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDLike(String value) {
            addCriterion("EU_USER_ID like", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDNotLike(String value) {
            addCriterion("EU_USER_ID not like", value, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDIn(List<String> values) {
            addCriterion("EU_USER_ID in", values, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDNotIn(List<String> values) {
            addCriterion("EU_USER_ID not in", values, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDBetween(String value1, String value2) {
            addCriterion("EU_USER_ID between", value1, value2, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_IDNotBetween(String value1, String value2) {
            addCriterion("EU_USER_ID not between", value1, value2, "EU_USER_ID");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEIsNull() {
            addCriterion("EU_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEIsNotNull() {
            addCriterion("EU_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEEqualTo(String value) {
            addCriterion("EU_USER_NAME =", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMENotEqualTo(String value) {
            addCriterion("EU_USER_NAME <>", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEGreaterThan(String value) {
            addCriterion("EU_USER_NAME >", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("EU_USER_NAME >=", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMELessThan(String value) {
            addCriterion("EU_USER_NAME <", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMELessThanOrEqualTo(String value) {
            addCriterion("EU_USER_NAME <=", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMELike(String value) {
            addCriterion("EU_USER_NAME like", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMENotLike(String value) {
            addCriterion("EU_USER_NAME not like", value, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEIn(List<String> values) {
            addCriterion("EU_USER_NAME in", values, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMENotIn(List<String> values) {
            addCriterion("EU_USER_NAME not in", values, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMEBetween(String value1, String value2) {
            addCriterion("EU_USER_NAME between", value1, value2, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_USER_NAMENotBetween(String value1, String value2) {
            addCriterion("EU_USER_NAME not between", value1, value2, "EU_USER_NAME");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDIsNull() {
            addCriterion("EU_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDIsNotNull() {
            addCriterion("EU_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDEqualTo(String value) {
            addCriterion("EU_PASSWORD =", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDNotEqualTo(String value) {
            addCriterion("EU_PASSWORD <>", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDGreaterThan(String value) {
            addCriterion("EU_PASSWORD >", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("EU_PASSWORD >=", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDLessThan(String value) {
            addCriterion("EU_PASSWORD <", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDLessThanOrEqualTo(String value) {
            addCriterion("EU_PASSWORD <=", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDLike(String value) {
            addCriterion("EU_PASSWORD like", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDNotLike(String value) {
            addCriterion("EU_PASSWORD not like", value, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDIn(List<String> values) {
            addCriterion("EU_PASSWORD in", values, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDNotIn(List<String> values) {
            addCriterion("EU_PASSWORD not in", values, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDBetween(String value1, String value2) {
            addCriterion("EU_PASSWORD between", value1, value2, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_PASSWORDNotBetween(String value1, String value2) {
            addCriterion("EU_PASSWORD not between", value1, value2, "EU_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andEU_SEXIsNull() {
            addCriterion("EU_SEX is null");
            return (Criteria) this;
        }

        public Criteria andEU_SEXIsNotNull() {
            addCriterion("EU_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andEU_SEXEqualTo(String value) {
            addCriterion("EU_SEX =", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXNotEqualTo(String value) {
            addCriterion("EU_SEX <>", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXGreaterThan(String value) {
            addCriterion("EU_SEX >", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXGreaterThanOrEqualTo(String value) {
            addCriterion("EU_SEX >=", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXLessThan(String value) {
            addCriterion("EU_SEX <", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXLessThanOrEqualTo(String value) {
            addCriterion("EU_SEX <=", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXLike(String value) {
            addCriterion("EU_SEX like", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXNotLike(String value) {
            addCriterion("EU_SEX not like", value, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXIn(List<String> values) {
            addCriterion("EU_SEX in", values, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXNotIn(List<String> values) {
            addCriterion("EU_SEX not in", values, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXBetween(String value1, String value2) {
            addCriterion("EU_SEX between", value1, value2, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_SEXNotBetween(String value1, String value2) {
            addCriterion("EU_SEX not between", value1, value2, "EU_SEX");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYIsNull() {
            addCriterion("EU_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYIsNotNull() {
            addCriterion("EU_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYEqualTo(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY =", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYNotEqualTo(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY <>", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYGreaterThan(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY >", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY >=", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYLessThan(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY <", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EU_BIRTHDAY <=", value, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYIn(List<Date> values) {
            addCriterionForJDBCDate("EU_BIRTHDAY in", values, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYNotIn(List<Date> values) {
            addCriterionForJDBCDate("EU_BIRTHDAY not in", values, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EU_BIRTHDAY between", value1, value2, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_BIRTHDAYNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EU_BIRTHDAY not between", value1, value2, "EU_BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEIsNull() {
            addCriterion("EU_IDENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEIsNotNull() {
            addCriterion("EU_IDENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEEqualTo(String value) {
            addCriterion("EU_IDENTITY_CODE =", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODENotEqualTo(String value) {
            addCriterion("EU_IDENTITY_CODE <>", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEGreaterThan(String value) {
            addCriterion("EU_IDENTITY_CODE >", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("EU_IDENTITY_CODE >=", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODELessThan(String value) {
            addCriterion("EU_IDENTITY_CODE <", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODELessThanOrEqualTo(String value) {
            addCriterion("EU_IDENTITY_CODE <=", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODELike(String value) {
            addCriterion("EU_IDENTITY_CODE like", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODENotLike(String value) {
            addCriterion("EU_IDENTITY_CODE not like", value, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEIn(List<String> values) {
            addCriterion("EU_IDENTITY_CODE in", values, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODENotIn(List<String> values) {
            addCriterion("EU_IDENTITY_CODE not in", values, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODEBetween(String value1, String value2) {
            addCriterion("EU_IDENTITY_CODE between", value1, value2, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_IDENTITY_CODENotBetween(String value1, String value2) {
            addCriterion("EU_IDENTITY_CODE not between", value1, value2, "EU_IDENTITY_CODE");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILIsNull() {
            addCriterion("EU_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILIsNotNull() {
            addCriterion("EU_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILEqualTo(String value) {
            addCriterion("EU_EMAIL =", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILNotEqualTo(String value) {
            addCriterion("EU_EMAIL <>", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILGreaterThan(String value) {
            addCriterion("EU_EMAIL >", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EU_EMAIL >=", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILLessThan(String value) {
            addCriterion("EU_EMAIL <", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILLessThanOrEqualTo(String value) {
            addCriterion("EU_EMAIL <=", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILLike(String value) {
            addCriterion("EU_EMAIL like", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILNotLike(String value) {
            addCriterion("EU_EMAIL not like", value, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILIn(List<String> values) {
            addCriterion("EU_EMAIL in", values, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILNotIn(List<String> values) {
            addCriterion("EU_EMAIL not in", values, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILBetween(String value1, String value2) {
            addCriterion("EU_EMAIL between", value1, value2, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_EMAILNotBetween(String value1, String value2) {
            addCriterion("EU_EMAIL not between", value1, value2, "EU_EMAIL");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEIsNull() {
            addCriterion("EU_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEIsNotNull() {
            addCriterion("EU_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEEqualTo(String value) {
            addCriterion("EU_MOBILE =", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILENotEqualTo(String value) {
            addCriterion("EU_MOBILE <>", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEGreaterThan(String value) {
            addCriterion("EU_MOBILE >", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("EU_MOBILE >=", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILELessThan(String value) {
            addCriterion("EU_MOBILE <", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILELessThanOrEqualTo(String value) {
            addCriterion("EU_MOBILE <=", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILELike(String value) {
            addCriterion("EU_MOBILE like", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILENotLike(String value) {
            addCriterion("EU_MOBILE not like", value, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEIn(List<String> values) {
            addCriterion("EU_MOBILE in", values, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILENotIn(List<String> values) {
            addCriterion("EU_MOBILE not in", values, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILEBetween(String value1, String value2) {
            addCriterion("EU_MOBILE between", value1, value2, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_MOBILENotBetween(String value1, String value2) {
            addCriterion("EU_MOBILE not between", value1, value2, "EU_MOBILE");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSIsNull() {
            addCriterion("EU_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSIsNotNull() {
            addCriterion("EU_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSEqualTo(String value) {
            addCriterion("EU_ADDRESS =", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSNotEqualTo(String value) {
            addCriterion("EU_ADDRESS <>", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSGreaterThan(String value) {
            addCriterion("EU_ADDRESS >", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("EU_ADDRESS >=", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSLessThan(String value) {
            addCriterion("EU_ADDRESS <", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("EU_ADDRESS <=", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSLike(String value) {
            addCriterion("EU_ADDRESS like", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSNotLike(String value) {
            addCriterion("EU_ADDRESS not like", value, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSIn(List<String> values) {
            addCriterion("EU_ADDRESS in", values, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSNotIn(List<String> values) {
            addCriterion("EU_ADDRESS not in", values, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSBetween(String value1, String value2) {
            addCriterion("EU_ADDRESS between", value1, value2, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("EU_ADDRESS not between", value1, value2, "EU_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSIsNull() {
            addCriterion("EU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSIsNotNull() {
            addCriterion("EU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSEqualTo(Integer value) {
            addCriterion("EU_STATUS =", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSNotEqualTo(Integer value) {
            addCriterion("EU_STATUS <>", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSGreaterThan(Integer value) {
            addCriterion("EU_STATUS >", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSGreaterThanOrEqualTo(Integer value) {
            addCriterion("EU_STATUS >=", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSLessThan(Integer value) {
            addCriterion("EU_STATUS <", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSLessThanOrEqualTo(Integer value) {
            addCriterion("EU_STATUS <=", value, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSIn(List<Integer> values) {
            addCriterion("EU_STATUS in", values, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSNotIn(List<Integer> values) {
            addCriterion("EU_STATUS not in", values, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSBetween(Integer value1, Integer value2) {
            addCriterion("EU_STATUS between", value1, value2, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_STATUSNotBetween(Integer value1, Integer value2) {
            addCriterion("EU_STATUS not between", value1, value2, "EU_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSIsNull() {
            addCriterion("EU_DELETE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSIsNotNull() {
            addCriterion("EU_DELETE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSEqualTo(Integer value) {
            addCriterion("EU_DELETE_STATUS =", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSNotEqualTo(Integer value) {
            addCriterion("EU_DELETE_STATUS <>", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSGreaterThan(Integer value) {
            addCriterion("EU_DELETE_STATUS >", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSGreaterThanOrEqualTo(Integer value) {
            addCriterion("EU_DELETE_STATUS >=", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSLessThan(Integer value) {
            addCriterion("EU_DELETE_STATUS <", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSLessThanOrEqualTo(Integer value) {
            addCriterion("EU_DELETE_STATUS <=", value, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSIn(List<Integer> values) {
            addCriterion("EU_DELETE_STATUS in", values, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSNotIn(List<Integer> values) {
            addCriterion("EU_DELETE_STATUS not in", values, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSBetween(Integer value1, Integer value2) {
            addCriterion("EU_DELETE_STATUS between", value1, value2, "EU_DELETE_STATUS");
            return (Criteria) this;
        }

        public Criteria andEU_DELETE_STATUSNotBetween(Integer value1, Integer value2) {
            addCriterion("EU_DELETE_STATUS not between", value1, value2, "EU_DELETE_STATUS");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}