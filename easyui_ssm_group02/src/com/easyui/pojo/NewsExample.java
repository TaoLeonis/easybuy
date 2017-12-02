package com.easyui.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andEnIdIsNull() {
            addCriterion("EN_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNotNull() {
            addCriterion("EN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnIdEqualTo(Integer value) {
            addCriterion("EN_ID =", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotEqualTo(Integer value) {
            addCriterion("EN_ID <>", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThan(Integer value) {
            addCriterion("EN_ID >", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EN_ID >=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThan(Integer value) {
            addCriterion("EN_ID <", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThanOrEqualTo(Integer value) {
            addCriterion("EN_ID <=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdIn(List<Integer> values) {
            addCriterion("EN_ID in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotIn(List<Integer> values) {
            addCriterion("EN_ID not in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdBetween(Integer value1, Integer value2) {
            addCriterion("EN_ID between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EN_ID not between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnTitleIsNull() {
            addCriterion("EN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEnTitleIsNotNull() {
            addCriterion("EN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEnTitleEqualTo(String value) {
            addCriterion("EN_TITLE =", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotEqualTo(String value) {
            addCriterion("EN_TITLE <>", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleGreaterThan(String value) {
            addCriterion("EN_TITLE >", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EN_TITLE >=", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLessThan(String value) {
            addCriterion("EN_TITLE <", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLessThanOrEqualTo(String value) {
            addCriterion("EN_TITLE <=", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleLike(String value) {
            addCriterion("EN_TITLE like", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotLike(String value) {
            addCriterion("EN_TITLE not like", value, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleIn(List<String> values) {
            addCriterion("EN_TITLE in", values, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotIn(List<String> values) {
            addCriterion("EN_TITLE not in", values, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleBetween(String value1, String value2) {
            addCriterion("EN_TITLE between", value1, value2, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnTitleNotBetween(String value1, String value2) {
            addCriterion("EN_TITLE not between", value1, value2, "enTitle");
            return (Criteria) this;
        }

        public Criteria andEnContentIsNull() {
            addCriterion("EN_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andEnContentIsNotNull() {
            addCriterion("EN_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andEnContentEqualTo(String value) {
            addCriterion("EN_CONTENT =", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotEqualTo(String value) {
            addCriterion("EN_CONTENT <>", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentGreaterThan(String value) {
            addCriterion("EN_CONTENT >", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentGreaterThanOrEqualTo(String value) {
            addCriterion("EN_CONTENT >=", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLessThan(String value) {
            addCriterion("EN_CONTENT <", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLessThanOrEqualTo(String value) {
            addCriterion("EN_CONTENT <=", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentLike(String value) {
            addCriterion("EN_CONTENT like", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotLike(String value) {
            addCriterion("EN_CONTENT not like", value, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentIn(List<String> values) {
            addCriterion("EN_CONTENT in", values, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotIn(List<String> values) {
            addCriterion("EN_CONTENT not in", values, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentBetween(String value1, String value2) {
            addCriterion("EN_CONTENT between", value1, value2, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnContentNotBetween(String value1, String value2) {
            addCriterion("EN_CONTENT not between", value1, value2, "enContent");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeIsNull() {
            addCriterion("EN_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeIsNotNull() {
            addCriterion("EN_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME =", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME <>", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME >", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME >=", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME <", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EN_CREATE_TIME <=", value, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EN_CREATE_TIME in", values, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EN_CREATE_TIME not in", values, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EN_CREATE_TIME between", value1, value2, "enCreateTime");
            return (Criteria) this;
        }

        public Criteria andEnCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EN_CREATE_TIME not between", value1, value2, "enCreateTime");
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