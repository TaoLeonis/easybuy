package com.easyui.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andEpIdIsNull() {
            addCriterion("EP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpIdIsNotNull() {
            addCriterion("EP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpIdEqualTo(Integer value) {
            addCriterion("EP_ID =", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotEqualTo(Integer value) {
            addCriterion("EP_ID <>", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThan(Integer value) {
            addCriterion("EP_ID >", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EP_ID >=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThan(Integer value) {
            addCriterion("EP_ID <", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdLessThanOrEqualTo(Integer value) {
            addCriterion("EP_ID <=", value, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdIn(List<Integer> values) {
            addCriterion("EP_ID in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotIn(List<Integer> values) {
            addCriterion("EP_ID not in", values, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdBetween(Integer value1, Integer value2) {
            addCriterion("EP_ID between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EP_ID not between", value1, value2, "epId");
            return (Criteria) this;
        }

        public Criteria andEpNameIsNull() {
            addCriterion("EP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEpNameIsNotNull() {
            addCriterion("EP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEpNameEqualTo(String value) {
            addCriterion("EP_NAME =", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotEqualTo(String value) {
            addCriterion("EP_NAME <>", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameGreaterThan(String value) {
            addCriterion("EP_NAME >", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameGreaterThanOrEqualTo(String value) {
            addCriterion("EP_NAME >=", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLessThan(String value) {
            addCriterion("EP_NAME <", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLessThanOrEqualTo(String value) {
            addCriterion("EP_NAME <=", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameLike(String value) {
            addCriterion("EP_NAME like", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotLike(String value) {
            addCriterion("EP_NAME not like", value, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameIn(List<String> values) {
            addCriterion("EP_NAME in", values, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotIn(List<String> values) {
            addCriterion("EP_NAME not in", values, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameBetween(String value1, String value2) {
            addCriterion("EP_NAME between", value1, value2, "epName");
            return (Criteria) this;
        }

        public Criteria andEpNameNotBetween(String value1, String value2) {
            addCriterion("EP_NAME not between", value1, value2, "epName");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionIsNull() {
            addCriterion("EP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionIsNotNull() {
            addCriterion("EP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionEqualTo(String value) {
            addCriterion("EP_DESCRIPTION =", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionNotEqualTo(String value) {
            addCriterion("EP_DESCRIPTION <>", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionGreaterThan(String value) {
            addCriterion("EP_DESCRIPTION >", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("EP_DESCRIPTION >=", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionLessThan(String value) {
            addCriterion("EP_DESCRIPTION <", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("EP_DESCRIPTION <=", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionLike(String value) {
            addCriterion("EP_DESCRIPTION like", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionNotLike(String value) {
            addCriterion("EP_DESCRIPTION not like", value, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionIn(List<String> values) {
            addCriterion("EP_DESCRIPTION in", values, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionNotIn(List<String> values) {
            addCriterion("EP_DESCRIPTION not in", values, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionBetween(String value1, String value2) {
            addCriterion("EP_DESCRIPTION between", value1, value2, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpDescriptionNotBetween(String value1, String value2) {
            addCriterion("EP_DESCRIPTION not between", value1, value2, "epDescription");
            return (Criteria) this;
        }

        public Criteria andEpPriceIsNull() {
            addCriterion("EP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEpPriceIsNotNull() {
            addCriterion("EP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEpPriceEqualTo(Double value) {
            addCriterion("EP_PRICE =", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceNotEqualTo(Double value) {
            addCriterion("EP_PRICE <>", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceGreaterThan(Double value) {
            addCriterion("EP_PRICE >", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("EP_PRICE >=", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceLessThan(Double value) {
            addCriterion("EP_PRICE <", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceLessThanOrEqualTo(Double value) {
            addCriterion("EP_PRICE <=", value, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceIn(List<Double> values) {
            addCriterion("EP_PRICE in", values, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceNotIn(List<Double> values) {
            addCriterion("EP_PRICE not in", values, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceBetween(Double value1, Double value2) {
            addCriterion("EP_PRICE between", value1, value2, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpPriceNotBetween(Double value1, Double value2) {
            addCriterion("EP_PRICE not between", value1, value2, "epPrice");
            return (Criteria) this;
        }

        public Criteria andEpStockIsNull() {
            addCriterion("EP_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andEpStockIsNotNull() {
            addCriterion("EP_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andEpStockEqualTo(Integer value) {
            addCriterion("EP_STOCK =", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockNotEqualTo(Integer value) {
            addCriterion("EP_STOCK <>", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockGreaterThan(Integer value) {
            addCriterion("EP_STOCK >", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("EP_STOCK >=", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockLessThan(Integer value) {
            addCriterion("EP_STOCK <", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockLessThanOrEqualTo(Integer value) {
            addCriterion("EP_STOCK <=", value, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockIn(List<Integer> values) {
            addCriterion("EP_STOCK in", values, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockNotIn(List<Integer> values) {
            addCriterion("EP_STOCK not in", values, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockBetween(Integer value1, Integer value2) {
            addCriterion("EP_STOCK between", value1, value2, "epStock");
            return (Criteria) this;
        }

        public Criteria andEpStockNotBetween(Integer value1, Integer value2) {
            addCriterion("EP_STOCK not between", value1, value2, "epStock");
            return (Criteria) this;
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

        public Criteria andEpcChildIdIsNull() {
            addCriterion("EPC_CHILD_ID is null");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdIsNotNull() {
            addCriterion("EPC_CHILD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdEqualTo(Integer value) {
            addCriterion("EPC_CHILD_ID =", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdNotEqualTo(Integer value) {
            addCriterion("EPC_CHILD_ID <>", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdGreaterThan(Integer value) {
            addCriterion("EPC_CHILD_ID >", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EPC_CHILD_ID >=", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdLessThan(Integer value) {
            addCriterion("EPC_CHILD_ID <", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("EPC_CHILD_ID <=", value, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdIn(List<Integer> values) {
            addCriterion("EPC_CHILD_ID in", values, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdNotIn(List<Integer> values) {
            addCriterion("EPC_CHILD_ID not in", values, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdBetween(Integer value1, Integer value2) {
            addCriterion("EPC_CHILD_ID between", value1, value2, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpcChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EPC_CHILD_ID not between", value1, value2, "epcChildId");
            return (Criteria) this;
        }

        public Criteria andEpFileNameIsNull() {
            addCriterion("EP_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEpFileNameIsNotNull() {
            addCriterion("EP_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEpFileNameEqualTo(String value) {
            addCriterion("EP_FILE_NAME =", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameNotEqualTo(String value) {
            addCriterion("EP_FILE_NAME <>", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameGreaterThan(String value) {
            addCriterion("EP_FILE_NAME >", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("EP_FILE_NAME >=", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameLessThan(String value) {
            addCriterion("EP_FILE_NAME <", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameLessThanOrEqualTo(String value) {
            addCriterion("EP_FILE_NAME <=", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameLike(String value) {
            addCriterion("EP_FILE_NAME like", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameNotLike(String value) {
            addCriterion("EP_FILE_NAME not like", value, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameIn(List<String> values) {
            addCriterion("EP_FILE_NAME in", values, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameNotIn(List<String> values) {
            addCriterion("EP_FILE_NAME not in", values, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameBetween(String value1, String value2) {
            addCriterion("EP_FILE_NAME between", value1, value2, "epFileName");
            return (Criteria) this;
        }

        public Criteria andEpFileNameNotBetween(String value1, String value2) {
            addCriterion("EP_FILE_NAME not between", value1, value2, "epFileName");
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