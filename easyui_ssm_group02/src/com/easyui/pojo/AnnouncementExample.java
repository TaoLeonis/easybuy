package com.easyui.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andEaIdIsNull() {
            addCriterion("EA_ID is null");
            return (Criteria) this;
        }

        public Criteria andEaIdIsNotNull() {
            addCriterion("EA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEaIdEqualTo(Integer value) {
            addCriterion("EA_ID =", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotEqualTo(Integer value) {
            addCriterion("EA_ID <>", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdGreaterThan(Integer value) {
            addCriterion("EA_ID >", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EA_ID >=", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdLessThan(Integer value) {
            addCriterion("EA_ID <", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdLessThanOrEqualTo(Integer value) {
            addCriterion("EA_ID <=", value, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdIn(List<Integer> values) {
            addCriterion("EA_ID in", values, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotIn(List<Integer> values) {
            addCriterion("EA_ID not in", values, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdBetween(Integer value1, Integer value2) {
            addCriterion("EA_ID between", value1, value2, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EA_ID not between", value1, value2, "eaId");
            return (Criteria) this;
        }

        public Criteria andEaTitleIsNull() {
            addCriterion("EA_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEaTitleIsNotNull() {
            addCriterion("EA_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEaTitleEqualTo(String value) {
            addCriterion("EA_TITLE =", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleNotEqualTo(String value) {
            addCriterion("EA_TITLE <>", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleGreaterThan(String value) {
            addCriterion("EA_TITLE >", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EA_TITLE >=", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleLessThan(String value) {
            addCriterion("EA_TITLE <", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleLessThanOrEqualTo(String value) {
            addCriterion("EA_TITLE <=", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleLike(String value) {
            addCriterion("EA_TITLE like", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleNotLike(String value) {
            addCriterion("EA_TITLE not like", value, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleIn(List<String> values) {
            addCriterion("EA_TITLE in", values, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleNotIn(List<String> values) {
            addCriterion("EA_TITLE not in", values, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleBetween(String value1, String value2) {
            addCriterion("EA_TITLE between", value1, value2, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaTitleNotBetween(String value1, String value2) {
            addCriterion("EA_TITLE not between", value1, value2, "eaTitle");
            return (Criteria) this;
        }

        public Criteria andEaContentIsNull() {
            addCriterion("EA_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andEaContentIsNotNull() {
            addCriterion("EA_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andEaContentEqualTo(String value) {
            addCriterion("EA_CONTENT =", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentNotEqualTo(String value) {
            addCriterion("EA_CONTENT <>", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentGreaterThan(String value) {
            addCriterion("EA_CONTENT >", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentGreaterThanOrEqualTo(String value) {
            addCriterion("EA_CONTENT >=", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentLessThan(String value) {
            addCriterion("EA_CONTENT <", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentLessThanOrEqualTo(String value) {
            addCriterion("EA_CONTENT <=", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentLike(String value) {
            addCriterion("EA_CONTENT like", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentNotLike(String value) {
            addCriterion("EA_CONTENT not like", value, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentIn(List<String> values) {
            addCriterion("EA_CONTENT in", values, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentNotIn(List<String> values) {
            addCriterion("EA_CONTENT not in", values, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentBetween(String value1, String value2) {
            addCriterion("EA_CONTENT between", value1, value2, "eaContent");
            return (Criteria) this;
        }

        public Criteria andEaContentNotBetween(String value1, String value2) {
            addCriterion("EA_CONTENT not between", value1, value2, "eaContent");
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