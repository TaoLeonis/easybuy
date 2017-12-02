package com.easyui.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andEcIdIsNull() {
            addCriterion("EC_ID is null");
            return (Criteria) this;
        }

        public Criteria andEcIdIsNotNull() {
            addCriterion("EC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEcIdEqualTo(Integer value) {
            addCriterion("EC_ID =", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotEqualTo(Integer value) {
            addCriterion("EC_ID <>", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdGreaterThan(Integer value) {
            addCriterion("EC_ID >", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EC_ID >=", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdLessThan(Integer value) {
            addCriterion("EC_ID <", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdLessThanOrEqualTo(Integer value) {
            addCriterion("EC_ID <=", value, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdIn(List<Integer> values) {
            addCriterion("EC_ID in", values, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotIn(List<Integer> values) {
            addCriterion("EC_ID not in", values, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdBetween(Integer value1, Integer value2) {
            addCriterion("EC_ID between", value1, value2, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EC_ID not between", value1, value2, "ecId");
            return (Criteria) this;
        }

        public Criteria andEcContentIsNull() {
            addCriterion("EC_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andEcContentIsNotNull() {
            addCriterion("EC_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andEcContentEqualTo(String value) {
            addCriterion("EC_CONTENT =", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentNotEqualTo(String value) {
            addCriterion("EC_CONTENT <>", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentGreaterThan(String value) {
            addCriterion("EC_CONTENT >", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentGreaterThanOrEqualTo(String value) {
            addCriterion("EC_CONTENT >=", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentLessThan(String value) {
            addCriterion("EC_CONTENT <", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentLessThanOrEqualTo(String value) {
            addCriterion("EC_CONTENT <=", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentLike(String value) {
            addCriterion("EC_CONTENT like", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentNotLike(String value) {
            addCriterion("EC_CONTENT not like", value, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentIn(List<String> values) {
            addCriterion("EC_CONTENT in", values, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentNotIn(List<String> values) {
            addCriterion("EC_CONTENT not in", values, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentBetween(String value1, String value2) {
            addCriterion("EC_CONTENT between", value1, value2, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcContentNotBetween(String value1, String value2) {
            addCriterion("EC_CONTENT not between", value1, value2, "ecContent");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeIsNull() {
            addCriterion("EC_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeIsNotNull() {
            addCriterion("EC_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME =", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME <>", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME >", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME >=", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME <", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EC_CREATE_TIME <=", value, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EC_CREATE_TIME in", values, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EC_CREATE_TIME not in", values, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EC_CREATE_TIME between", value1, value2, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EC_CREATE_TIME not between", value1, value2, "ecCreateTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyIsNull() {
            addCriterion("EC_REPLY is null");
            return (Criteria) this;
        }

        public Criteria andEcReplyIsNotNull() {
            addCriterion("EC_REPLY is not null");
            return (Criteria) this;
        }

        public Criteria andEcReplyEqualTo(String value) {
            addCriterion("EC_REPLY =", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyNotEqualTo(String value) {
            addCriterion("EC_REPLY <>", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyGreaterThan(String value) {
            addCriterion("EC_REPLY >", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyGreaterThanOrEqualTo(String value) {
            addCriterion("EC_REPLY >=", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyLessThan(String value) {
            addCriterion("EC_REPLY <", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyLessThanOrEqualTo(String value) {
            addCriterion("EC_REPLY <=", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyLike(String value) {
            addCriterion("EC_REPLY like", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyNotLike(String value) {
            addCriterion("EC_REPLY not like", value, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyIn(List<String> values) {
            addCriterion("EC_REPLY in", values, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyNotIn(List<String> values) {
            addCriterion("EC_REPLY not in", values, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyBetween(String value1, String value2) {
            addCriterion("EC_REPLY between", value1, value2, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyNotBetween(String value1, String value2) {
            addCriterion("EC_REPLY not between", value1, value2, "ecReply");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeIsNull() {
            addCriterion("EC_REPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeIsNotNull() {
            addCriterion("EC_REPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME =", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME <>", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME >", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME >=", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeLessThan(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME <", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EC_REPLY_TIME <=", value, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("EC_REPLY_TIME in", values, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EC_REPLY_TIME not in", values, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EC_REPLY_TIME between", value1, value2, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcReplyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EC_REPLY_TIME not between", value1, value2, "ecReplyTime");
            return (Criteria) this;
        }

        public Criteria andEcNickNameIsNull() {
            addCriterion("EC_NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEcNickNameIsNotNull() {
            addCriterion("EC_NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEcNickNameEqualTo(String value) {
            addCriterion("EC_NICK_NAME =", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameNotEqualTo(String value) {
            addCriterion("EC_NICK_NAME <>", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameGreaterThan(String value) {
            addCriterion("EC_NICK_NAME >", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("EC_NICK_NAME >=", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameLessThan(String value) {
            addCriterion("EC_NICK_NAME <", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameLessThanOrEqualTo(String value) {
            addCriterion("EC_NICK_NAME <=", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameLike(String value) {
            addCriterion("EC_NICK_NAME like", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameNotLike(String value) {
            addCriterion("EC_NICK_NAME not like", value, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameIn(List<String> values) {
            addCriterion("EC_NICK_NAME in", values, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameNotIn(List<String> values) {
            addCriterion("EC_NICK_NAME not in", values, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameBetween(String value1, String value2) {
            addCriterion("EC_NICK_NAME between", value1, value2, "ecNickName");
            return (Criteria) this;
        }

        public Criteria andEcNickNameNotBetween(String value1, String value2) {
            addCriterion("EC_NICK_NAME not between", value1, value2, "ecNickName");
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