package com.easyui.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andEodIdIsNull() {
            addCriterion("EOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andEodIdIsNotNull() {
            addCriterion("EOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEodIdEqualTo(Integer value) {
            addCriterion("EOD_ID =", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdNotEqualTo(Integer value) {
            addCriterion("EOD_ID <>", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdGreaterThan(Integer value) {
            addCriterion("EOD_ID >", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EOD_ID >=", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdLessThan(Integer value) {
            addCriterion("EOD_ID <", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdLessThanOrEqualTo(Integer value) {
            addCriterion("EOD_ID <=", value, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdIn(List<Integer> values) {
            addCriterion("EOD_ID in", values, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdNotIn(List<Integer> values) {
            addCriterion("EOD_ID not in", values, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdBetween(Integer value1, Integer value2) {
            addCriterion("EOD_ID between", value1, value2, "eodId");
            return (Criteria) this;
        }

        public Criteria andEodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EOD_ID not between", value1, value2, "eodId");
            return (Criteria) this;
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

        public Criteria andEodQuantityIsNull() {
            addCriterion("EOD_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andEodQuantityIsNotNull() {
            addCriterion("EOD_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andEodQuantityEqualTo(Integer value) {
            addCriterion("EOD_QUANTITY =", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityNotEqualTo(Integer value) {
            addCriterion("EOD_QUANTITY <>", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityGreaterThan(Integer value) {
            addCriterion("EOD_QUANTITY >", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("EOD_QUANTITY >=", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityLessThan(Integer value) {
            addCriterion("EOD_QUANTITY <", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("EOD_QUANTITY <=", value, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityIn(List<Integer> values) {
            addCriterion("EOD_QUANTITY in", values, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityNotIn(List<Integer> values) {
            addCriterion("EOD_QUANTITY not in", values, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityBetween(Integer value1, Integer value2) {
            addCriterion("EOD_QUANTITY between", value1, value2, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("EOD_QUANTITY not between", value1, value2, "eodQuantity");
            return (Criteria) this;
        }

        public Criteria andEodCostIsNull() {
            addCriterion("EOD_COST is null");
            return (Criteria) this;
        }

        public Criteria andEodCostIsNotNull() {
            addCriterion("EOD_COST is not null");
            return (Criteria) this;
        }

        public Criteria andEodCostEqualTo(Double value) {
            addCriterion("EOD_COST =", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostNotEqualTo(Double value) {
            addCriterion("EOD_COST <>", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostGreaterThan(Double value) {
            addCriterion("EOD_COST >", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostGreaterThanOrEqualTo(Double value) {
            addCriterion("EOD_COST >=", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostLessThan(Double value) {
            addCriterion("EOD_COST <", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostLessThanOrEqualTo(Double value) {
            addCriterion("EOD_COST <=", value, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostIn(List<Double> values) {
            addCriterion("EOD_COST in", values, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostNotIn(List<Double> values) {
            addCriterion("EOD_COST not in", values, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostBetween(Double value1, Double value2) {
            addCriterion("EOD_COST between", value1, value2, "eodCost");
            return (Criteria) this;
        }

        public Criteria andEodCostNotBetween(Double value1, Double value2) {
            addCriterion("EOD_COST not between", value1, value2, "eodCost");
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