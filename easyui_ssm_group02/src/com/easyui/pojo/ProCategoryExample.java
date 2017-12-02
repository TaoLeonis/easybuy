package com.easyui.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProCategoryExample() {
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

        public Criteria andEpcIdIsNull() {
            addCriterion("EPC_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpcIdIsNotNull() {
            addCriterion("EPC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpcIdEqualTo(Integer value) {
            addCriterion("EPC_ID =", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotEqualTo(Integer value) {
            addCriterion("EPC_ID <>", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdGreaterThan(Integer value) {
            addCriterion("EPC_ID >", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EPC_ID >=", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdLessThan(Integer value) {
            addCriterion("EPC_ID <", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdLessThanOrEqualTo(Integer value) {
            addCriterion("EPC_ID <=", value, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdIn(List<Integer> values) {
            addCriterion("EPC_ID in", values, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotIn(List<Integer> values) {
            addCriterion("EPC_ID not in", values, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdBetween(Integer value1, Integer value2) {
            addCriterion("EPC_ID between", value1, value2, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EPC_ID not between", value1, value2, "epcId");
            return (Criteria) this;
        }

        public Criteria andEpcNameIsNull() {
            addCriterion("EPC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEpcNameIsNotNull() {
            addCriterion("EPC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEpcNameEqualTo(String value) {
            addCriterion("EPC_NAME =", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameNotEqualTo(String value) {
            addCriterion("EPC_NAME <>", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameGreaterThan(String value) {
            addCriterion("EPC_NAME >", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameGreaterThanOrEqualTo(String value) {
            addCriterion("EPC_NAME >=", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameLessThan(String value) {
            addCriterion("EPC_NAME <", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameLessThanOrEqualTo(String value) {
            addCriterion("EPC_NAME <=", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameLike(String value) {
            addCriterion("EPC_NAME like", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameNotLike(String value) {
            addCriterion("EPC_NAME not like", value, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameIn(List<String> values) {
            addCriterion("EPC_NAME in", values, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameNotIn(List<String> values) {
            addCriterion("EPC_NAME not in", values, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameBetween(String value1, String value2) {
            addCriterion("EPC_NAME between", value1, value2, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcNameNotBetween(String value1, String value2) {
            addCriterion("EPC_NAME not between", value1, value2, "epcName");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdIsNull() {
            addCriterion("EPC_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdIsNotNull() {
            addCriterion("EPC_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdEqualTo(Integer value) {
            addCriterion("EPC_PARENT_ID =", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdNotEqualTo(Integer value) {
            addCriterion("EPC_PARENT_ID <>", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdGreaterThan(Integer value) {
            addCriterion("EPC_PARENT_ID >", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EPC_PARENT_ID >=", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdLessThan(Integer value) {
            addCriterion("EPC_PARENT_ID <", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("EPC_PARENT_ID <=", value, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdIn(List<Integer> values) {
            addCriterion("EPC_PARENT_ID in", values, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdNotIn(List<Integer> values) {
            addCriterion("EPC_PARENT_ID not in", values, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdBetween(Integer value1, Integer value2) {
            addCriterion("EPC_PARENT_ID between", value1, value2, "epcParentId");
            return (Criteria) this;
        }

        public Criteria andEpcParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EPC_PARENT_ID not between", value1, value2, "epcParentId");
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