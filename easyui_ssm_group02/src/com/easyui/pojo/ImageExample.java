package com.easyui.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andEiPidIsNull() {
            addCriterion("EI_PID is null");
            return (Criteria) this;
        }

        public Criteria andEiPidIsNotNull() {
            addCriterion("EI_PID is not null");
            return (Criteria) this;
        }

        public Criteria andEiPidEqualTo(Integer value) {
            addCriterion("EI_PID =", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidNotEqualTo(Integer value) {
            addCriterion("EI_PID <>", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidGreaterThan(Integer value) {
            addCriterion("EI_PID >", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EI_PID >=", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidLessThan(Integer value) {
            addCriterion("EI_PID <", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidLessThanOrEqualTo(Integer value) {
            addCriterion("EI_PID <=", value, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidIn(List<Integer> values) {
            addCriterion("EI_PID in", values, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidNotIn(List<Integer> values) {
            addCriterion("EI_PID not in", values, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidBetween(Integer value1, Integer value2) {
            addCriterion("EI_PID between", value1, value2, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPidNotBetween(Integer value1, Integer value2) {
            addCriterion("EI_PID not between", value1, value2, "eiPid");
            return (Criteria) this;
        }

        public Criteria andEiPictureIsNull() {
            addCriterion("EI_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andEiPictureIsNotNull() {
            addCriterion("EI_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andEiPictureEqualTo(String value) {
            addCriterion("EI_PICTURE =", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureNotEqualTo(String value) {
            addCriterion("EI_PICTURE <>", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureGreaterThan(String value) {
            addCriterion("EI_PICTURE >", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureGreaterThanOrEqualTo(String value) {
            addCriterion("EI_PICTURE >=", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureLessThan(String value) {
            addCriterion("EI_PICTURE <", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureLessThanOrEqualTo(String value) {
            addCriterion("EI_PICTURE <=", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureLike(String value) {
            addCriterion("EI_PICTURE like", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureNotLike(String value) {
            addCriterion("EI_PICTURE not like", value, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureIn(List<String> values) {
            addCriterion("EI_PICTURE in", values, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureNotIn(List<String> values) {
            addCriterion("EI_PICTURE not in", values, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureBetween(String value1, String value2) {
            addCriterion("EI_PICTURE between", value1, value2, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiPictureNotBetween(String value1, String value2) {
            addCriterion("EI_PICTURE not between", value1, value2, "eiPicture");
            return (Criteria) this;
        }

        public Criteria andEiUseridIsNull() {
            addCriterion("EI_USERID is null");
            return (Criteria) this;
        }

        public Criteria andEiUseridIsNotNull() {
            addCriterion("EI_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andEiUseridEqualTo(String value) {
            addCriterion("EI_USERID =", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridNotEqualTo(String value) {
            addCriterion("EI_USERID <>", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridGreaterThan(String value) {
            addCriterion("EI_USERID >", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridGreaterThanOrEqualTo(String value) {
            addCriterion("EI_USERID >=", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridLessThan(String value) {
            addCriterion("EI_USERID <", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridLessThanOrEqualTo(String value) {
            addCriterion("EI_USERID <=", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridLike(String value) {
            addCriterion("EI_USERID like", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridNotLike(String value) {
            addCriterion("EI_USERID not like", value, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridIn(List<String> values) {
            addCriterion("EI_USERID in", values, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridNotIn(List<String> values) {
            addCriterion("EI_USERID not in", values, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridBetween(String value1, String value2) {
            addCriterion("EI_USERID between", value1, value2, "eiUserid");
            return (Criteria) this;
        }

        public Criteria andEiUseridNotBetween(String value1, String value2) {
            addCriterion("EI_USERID not between", value1, value2, "eiUserid");
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