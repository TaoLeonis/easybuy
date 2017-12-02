package com.easyui.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andEoIdIsNull() {
            addCriterion("EO_ID is null");
            return (Criteria) this;
        }

        public Criteria andEoIdIsNotNull() {
            addCriterion("EO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEoIdEqualTo(Integer value) {
            addCriterion("EO_ID =", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdNotEqualTo(Integer value) {
            addCriterion("EO_ID <>", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdGreaterThan(Integer value) {
            addCriterion("EO_ID >", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EO_ID >=", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdLessThan(Integer value) {
            addCriterion("EO_ID <", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdLessThanOrEqualTo(Integer value) {
            addCriterion("EO_ID <=", value, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdIn(List<Integer> values) {
            addCriterion("EO_ID in", values, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdNotIn(List<Integer> values) {
            addCriterion("EO_ID not in", values, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdBetween(Integer value1, Integer value2) {
            addCriterion("EO_ID between", value1, value2, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EO_ID not between", value1, value2, "eoId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdIsNull() {
            addCriterion("EO_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEoUserIdIsNotNull() {
            addCriterion("EO_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEoUserIdEqualTo(String value) {
            addCriterion("EO_USER_ID =", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdNotEqualTo(String value) {
            addCriterion("EO_USER_ID <>", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdGreaterThan(String value) {
            addCriterion("EO_USER_ID >", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("EO_USER_ID >=", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdLessThan(String value) {
            addCriterion("EO_USER_ID <", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdLessThanOrEqualTo(String value) {
            addCriterion("EO_USER_ID <=", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdLike(String value) {
            addCriterion("EO_USER_ID like", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdNotLike(String value) {
            addCriterion("EO_USER_ID not like", value, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdIn(List<String> values) {
            addCriterion("EO_USER_ID in", values, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdNotIn(List<String> values) {
            addCriterion("EO_USER_ID not in", values, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdBetween(String value1, String value2) {
            addCriterion("EO_USER_ID between", value1, value2, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserIdNotBetween(String value1, String value2) {
            addCriterion("EO_USER_ID not between", value1, value2, "eoUserId");
            return (Criteria) this;
        }

        public Criteria andEoUserNameIsNull() {
            addCriterion("EO_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEoUserNameIsNotNull() {
            addCriterion("EO_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEoUserNameEqualTo(String value) {
            addCriterion("EO_USER_NAME =", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameNotEqualTo(String value) {
            addCriterion("EO_USER_NAME <>", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameGreaterThan(String value) {
            addCriterion("EO_USER_NAME >", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("EO_USER_NAME >=", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameLessThan(String value) {
            addCriterion("EO_USER_NAME <", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameLessThanOrEqualTo(String value) {
            addCriterion("EO_USER_NAME <=", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameLike(String value) {
            addCriterion("EO_USER_NAME like", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameNotLike(String value) {
            addCriterion("EO_USER_NAME not like", value, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameIn(List<String> values) {
            addCriterion("EO_USER_NAME in", values, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameNotIn(List<String> values) {
            addCriterion("EO_USER_NAME not in", values, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameBetween(String value1, String value2) {
            addCriterion("EO_USER_NAME between", value1, value2, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserNameNotBetween(String value1, String value2) {
            addCriterion("EO_USER_NAME not between", value1, value2, "eoUserName");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressIsNull() {
            addCriterion("EO_USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressIsNotNull() {
            addCriterion("EO_USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressEqualTo(String value) {
            addCriterion("EO_USER_ADDRESS =", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressNotEqualTo(String value) {
            addCriterion("EO_USER_ADDRESS <>", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressGreaterThan(String value) {
            addCriterion("EO_USER_ADDRESS >", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EO_USER_ADDRESS >=", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressLessThan(String value) {
            addCriterion("EO_USER_ADDRESS <", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressLessThanOrEqualTo(String value) {
            addCriterion("EO_USER_ADDRESS <=", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressLike(String value) {
            addCriterion("EO_USER_ADDRESS like", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressNotLike(String value) {
            addCriterion("EO_USER_ADDRESS not like", value, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressIn(List<String> values) {
            addCriterion("EO_USER_ADDRESS in", values, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressNotIn(List<String> values) {
            addCriterion("EO_USER_ADDRESS not in", values, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressBetween(String value1, String value2) {
            addCriterion("EO_USER_ADDRESS between", value1, value2, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoUserAddressNotBetween(String value1, String value2) {
            addCriterion("EO_USER_ADDRESS not between", value1, value2, "eoUserAddress");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeIsNull() {
            addCriterion("EO_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeIsNotNull() {
            addCriterion("EO_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME =", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME <>", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME >", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME >=", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME <", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EO_CREATE_TIME <=", value, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EO_CREATE_TIME in", values, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EO_CREATE_TIME not in", values, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EO_CREATE_TIME between", value1, value2, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EO_CREATE_TIME not between", value1, value2, "eoCreateTime");
            return (Criteria) this;
        }

        public Criteria andEoCostIsNull() {
            addCriterion("EO_COST is null");
            return (Criteria) this;
        }

        public Criteria andEoCostIsNotNull() {
            addCriterion("EO_COST is not null");
            return (Criteria) this;
        }

        public Criteria andEoCostEqualTo(Double value) {
            addCriterion("EO_COST =", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostNotEqualTo(Double value) {
            addCriterion("EO_COST <>", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostGreaterThan(Double value) {
            addCriterion("EO_COST >", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostGreaterThanOrEqualTo(Double value) {
            addCriterion("EO_COST >=", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostLessThan(Double value) {
            addCriterion("EO_COST <", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostLessThanOrEqualTo(Double value) {
            addCriterion("EO_COST <=", value, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostIn(List<Double> values) {
            addCriterion("EO_COST in", values, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostNotIn(List<Double> values) {
            addCriterion("EO_COST not in", values, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostBetween(Double value1, Double value2) {
            addCriterion("EO_COST between", value1, value2, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoCostNotBetween(Double value1, Double value2) {
            addCriterion("EO_COST not between", value1, value2, "eoCost");
            return (Criteria) this;
        }

        public Criteria andEoStatusIsNull() {
            addCriterion("EO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEoStatusIsNotNull() {
            addCriterion("EO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEoStatusEqualTo(Integer value) {
            addCriterion("EO_STATUS =", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusNotEqualTo(Integer value) {
            addCriterion("EO_STATUS <>", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusGreaterThan(Integer value) {
            addCriterion("EO_STATUS >", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EO_STATUS >=", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusLessThan(Integer value) {
            addCriterion("EO_STATUS <", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("EO_STATUS <=", value, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusIn(List<Integer> values) {
            addCriterion("EO_STATUS in", values, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusNotIn(List<Integer> values) {
            addCriterion("EO_STATUS not in", values, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusBetween(Integer value1, Integer value2) {
            addCriterion("EO_STATUS between", value1, value2, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EO_STATUS not between", value1, value2, "eoStatus");
            return (Criteria) this;
        }

        public Criteria andEoTypeIsNull() {
            addCriterion("EO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEoTypeIsNotNull() {
            addCriterion("EO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEoTypeEqualTo(Integer value) {
            addCriterion("EO_TYPE =", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeNotEqualTo(Integer value) {
            addCriterion("EO_TYPE <>", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeGreaterThan(Integer value) {
            addCriterion("EO_TYPE >", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EO_TYPE >=", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeLessThan(Integer value) {
            addCriterion("EO_TYPE <", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("EO_TYPE <=", value, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeIn(List<Integer> values) {
            addCriterion("EO_TYPE in", values, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeNotIn(List<Integer> values) {
            addCriterion("EO_TYPE not in", values, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeBetween(Integer value1, Integer value2) {
            addCriterion("EO_TYPE between", value1, value2, "eoType");
            return (Criteria) this;
        }

        public Criteria andEoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("EO_TYPE not between", value1, value2, "eoType");
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