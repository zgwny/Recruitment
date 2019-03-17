package com.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class RecruiterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruiterExample() {
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

        public Criteria andRecruiteridIsNull() {
            addCriterion("recruiterId is null");
            return (Criteria) this;
        }

        public Criteria andRecruiteridIsNotNull() {
            addCriterion("recruiterId is not null");
            return (Criteria) this;
        }

        public Criteria andRecruiteridEqualTo(Integer value) {
            addCriterion("recruiterId =", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridNotEqualTo(Integer value) {
            addCriterion("recruiterId <>", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridGreaterThan(Integer value) {
            addCriterion("recruiterId >", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruiterId >=", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridLessThan(Integer value) {
            addCriterion("recruiterId <", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridLessThanOrEqualTo(Integer value) {
            addCriterion("recruiterId <=", value, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridIn(List<Integer> values) {
            addCriterion("recruiterId in", values, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridNotIn(List<Integer> values) {
            addCriterion("recruiterId not in", values, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridBetween(Integer value1, Integer value2) {
            addCriterion("recruiterId between", value1, value2, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiteridNotBetween(Integer value1, Integer value2) {
            addCriterion("recruiterId not between", value1, value2, "recruiterid");
            return (Criteria) this;
        }

        public Criteria andRecruiternameIsNull() {
            addCriterion("recruiterName is null");
            return (Criteria) this;
        }

        public Criteria andRecruiternameIsNotNull() {
            addCriterion("recruiterName is not null");
            return (Criteria) this;
        }

        public Criteria andRecruiternameEqualTo(String value) {
            addCriterion("recruiterName =", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameNotEqualTo(String value) {
            addCriterion("recruiterName <>", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameGreaterThan(String value) {
            addCriterion("recruiterName >", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameGreaterThanOrEqualTo(String value) {
            addCriterion("recruiterName >=", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameLessThan(String value) {
            addCriterion("recruiterName <", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameLessThanOrEqualTo(String value) {
            addCriterion("recruiterName <=", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameLike(String value) {
            addCriterion("recruiterName like", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameNotLike(String value) {
            addCriterion("recruiterName not like", value, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameIn(List<String> values) {
            addCriterion("recruiterName in", values, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameNotIn(List<String> values) {
            addCriterion("recruiterName not in", values, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameBetween(String value1, String value2) {
            addCriterion("recruiterName between", value1, value2, "recruitername");
            return (Criteria) this;
        }

        public Criteria andRecruiternameNotBetween(String value1, String value2) {
            addCriterion("recruiterName not between", value1, value2, "recruitername");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andPositionnIsNull() {
            addCriterion("positionn is null");
            return (Criteria) this;
        }

        public Criteria andPositionnIsNotNull() {
            addCriterion("positionn is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnEqualTo(String value) {
            addCriterion("positionn =", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnNotEqualTo(String value) {
            addCriterion("positionn <>", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnGreaterThan(String value) {
            addCriterion("positionn >", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnGreaterThanOrEqualTo(String value) {
            addCriterion("positionn >=", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnLessThan(String value) {
            addCriterion("positionn <", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnLessThanOrEqualTo(String value) {
            addCriterion("positionn <=", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnLike(String value) {
            addCriterion("positionn like", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnNotLike(String value) {
            addCriterion("positionn not like", value, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnIn(List<String> values) {
            addCriterion("positionn in", values, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnNotIn(List<String> values) {
            addCriterion("positionn not in", values, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnBetween(String value1, String value2) {
            addCriterion("positionn between", value1, value2, "positionn");
            return (Criteria) this;
        }

        public Criteria andPositionnNotBetween(String value1, String value2) {
            addCriterion("positionn not between", value1, value2, "positionn");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
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