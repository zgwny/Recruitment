package com.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeId is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeId is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(String value) {
            addCriterion("resumeId =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(String value) {
            addCriterion("resumeId <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(String value) {
            addCriterion("resumeId >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(String value) {
            addCriterion("resumeId >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(String value) {
            addCriterion("resumeId <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(String value) {
            addCriterion("resumeId <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLike(String value) {
            addCriterion("resumeId like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotLike(String value) {
            addCriterion("resumeId not like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<String> values) {
            addCriterion("resumeId in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<String> values) {
            addCriterion("resumeId not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(String value1, String value2) {
            addCriterion("resumeId between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(String value1, String value2) {
            addCriterion("resumeId not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andWantidIsNull() {
            addCriterion("wantId is null");
            return (Criteria) this;
        }

        public Criteria andWantidIsNotNull() {
            addCriterion("wantId is not null");
            return (Criteria) this;
        }

        public Criteria andWantidEqualTo(String value) {
            addCriterion("wantId =", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidNotEqualTo(String value) {
            addCriterion("wantId <>", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidGreaterThan(String value) {
            addCriterion("wantId >", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidGreaterThanOrEqualTo(String value) {
            addCriterion("wantId >=", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidLessThan(String value) {
            addCriterion("wantId <", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidLessThanOrEqualTo(String value) {
            addCriterion("wantId <=", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidLike(String value) {
            addCriterion("wantId like", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidNotLike(String value) {
            addCriterion("wantId not like", value, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidIn(List<String> values) {
            addCriterion("wantId in", values, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidNotIn(List<String> values) {
            addCriterion("wantId not in", values, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidBetween(String value1, String value2) {
            addCriterion("wantId between", value1, value2, "wantid");
            return (Criteria) this;
        }

        public Criteria andWantidNotBetween(String value1, String value2) {
            addCriterion("wantId not between", value1, value2, "wantid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidIsNull() {
            addCriterion("porjectsId is null");
            return (Criteria) this;
        }

        public Criteria andPorjectsidIsNotNull() {
            addCriterion("porjectsId is not null");
            return (Criteria) this;
        }

        public Criteria andPorjectsidEqualTo(String value) {
            addCriterion("porjectsId =", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidNotEqualTo(String value) {
            addCriterion("porjectsId <>", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidGreaterThan(String value) {
            addCriterion("porjectsId >", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidGreaterThanOrEqualTo(String value) {
            addCriterion("porjectsId >=", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidLessThan(String value) {
            addCriterion("porjectsId <", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidLessThanOrEqualTo(String value) {
            addCriterion("porjectsId <=", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidLike(String value) {
            addCriterion("porjectsId like", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidNotLike(String value) {
            addCriterion("porjectsId not like", value, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidIn(List<String> values) {
            addCriterion("porjectsId in", values, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidNotIn(List<String> values) {
            addCriterion("porjectsId not in", values, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidBetween(String value1, String value2) {
            addCriterion("porjectsId between", value1, value2, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andPorjectsidNotBetween(String value1, String value2) {
            addCriterion("porjectsId not between", value1, value2, "porjectsid");
            return (Criteria) this;
        }

        public Criteria andEnducationidIsNull() {
            addCriterion("enducationId is null");
            return (Criteria) this;
        }

        public Criteria andEnducationidIsNotNull() {
            addCriterion("enducationId is not null");
            return (Criteria) this;
        }

        public Criteria andEnducationidEqualTo(String value) {
            addCriterion("enducationId =", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidNotEqualTo(String value) {
            addCriterion("enducationId <>", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidGreaterThan(String value) {
            addCriterion("enducationId >", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidGreaterThanOrEqualTo(String value) {
            addCriterion("enducationId >=", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidLessThan(String value) {
            addCriterion("enducationId <", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidLessThanOrEqualTo(String value) {
            addCriterion("enducationId <=", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidLike(String value) {
            addCriterion("enducationId like", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidNotLike(String value) {
            addCriterion("enducationId not like", value, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidIn(List<String> values) {
            addCriterion("enducationId in", values, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidNotIn(List<String> values) {
            addCriterion("enducationId not in", values, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidBetween(String value1, String value2) {
            addCriterion("enducationId between", value1, value2, "enducationid");
            return (Criteria) this;
        }

        public Criteria andEnducationidNotBetween(String value1, String value2) {
            addCriterion("enducationId not between", value1, value2, "enducationid");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNull() {
            addCriterion("skillId is null");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNotNull() {
            addCriterion("skillId is not null");
            return (Criteria) this;
        }

        public Criteria andSkillidEqualTo(String value) {
            addCriterion("skillId =", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotEqualTo(String value) {
            addCriterion("skillId <>", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThan(String value) {
            addCriterion("skillId >", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThanOrEqualTo(String value) {
            addCriterion("skillId >=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThan(String value) {
            addCriterion("skillId <", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThanOrEqualTo(String value) {
            addCriterion("skillId <=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLike(String value) {
            addCriterion("skillId like", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotLike(String value) {
            addCriterion("skillId not like", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidIn(List<String> values) {
            addCriterion("skillId in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotIn(List<String> values) {
            addCriterion("skillId not in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidBetween(String value1, String value2) {
            addCriterion("skillId between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotBetween(String value1, String value2) {
            addCriterion("skillId not between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andRewardidIsNull() {
            addCriterion("rewardId is null");
            return (Criteria) this;
        }

        public Criteria andRewardidIsNotNull() {
            addCriterion("rewardId is not null");
            return (Criteria) this;
        }

        public Criteria andRewardidEqualTo(String value) {
            addCriterion("rewardId =", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotEqualTo(String value) {
            addCriterion("rewardId <>", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidGreaterThan(String value) {
            addCriterion("rewardId >", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidGreaterThanOrEqualTo(String value) {
            addCriterion("rewardId >=", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLessThan(String value) {
            addCriterion("rewardId <", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLessThanOrEqualTo(String value) {
            addCriterion("rewardId <=", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLike(String value) {
            addCriterion("rewardId like", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotLike(String value) {
            addCriterion("rewardId not like", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidIn(List<String> values) {
            addCriterion("rewardId in", values, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotIn(List<String> values) {
            addCriterion("rewardId not in", values, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidBetween(String value1, String value2) {
            addCriterion("rewardId between", value1, value2, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotBetween(String value1, String value2) {
            addCriterion("rewardId not between", value1, value2, "rewardid");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workId is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("workId =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("workId <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("workId >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("workId >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("workId <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("workId <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("workId like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("workId not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("workId in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("workId not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("workId between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("workId not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidIsNull() {
            addCriterion("introduceId is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceidIsNotNull() {
            addCriterion("introduceId is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceidEqualTo(String value) {
            addCriterion("introduceId =", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidNotEqualTo(String value) {
            addCriterion("introduceId <>", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidGreaterThan(String value) {
            addCriterion("introduceId >", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidGreaterThanOrEqualTo(String value) {
            addCriterion("introduceId >=", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidLessThan(String value) {
            addCriterion("introduceId <", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidLessThanOrEqualTo(String value) {
            addCriterion("introduceId <=", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidLike(String value) {
            addCriterion("introduceId like", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidNotLike(String value) {
            addCriterion("introduceId not like", value, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidIn(List<String> values) {
            addCriterion("introduceId in", values, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidNotIn(List<String> values) {
            addCriterion("introduceId not in", values, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidBetween(String value1, String value2) {
            addCriterion("introduceId between", value1, value2, "introduceid");
            return (Criteria) this;
        }

        public Criteria andIntroduceidNotBetween(String value1, String value2) {
            addCriterion("introduceId not between", value1, value2, "introduceid");
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