package com.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class WantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WantExample() {
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

        public Criteria andWantjobIsNull() {
            addCriterion("wantJob is null");
            return (Criteria) this;
        }

        public Criteria andWantjobIsNotNull() {
            addCriterion("wantJob is not null");
            return (Criteria) this;
        }

        public Criteria andWantjobEqualTo(String value) {
            addCriterion("wantJob =", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobNotEqualTo(String value) {
            addCriterion("wantJob <>", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobGreaterThan(String value) {
            addCriterion("wantJob >", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobGreaterThanOrEqualTo(String value) {
            addCriterion("wantJob >=", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobLessThan(String value) {
            addCriterion("wantJob <", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobLessThanOrEqualTo(String value) {
            addCriterion("wantJob <=", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobLike(String value) {
            addCriterion("wantJob like", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobNotLike(String value) {
            addCriterion("wantJob not like", value, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobIn(List<String> values) {
            addCriterion("wantJob in", values, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobNotIn(List<String> values) {
            addCriterion("wantJob not in", values, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobBetween(String value1, String value2) {
            addCriterion("wantJob between", value1, value2, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantjobNotBetween(String value1, String value2) {
            addCriterion("wantJob not between", value1, value2, "wantjob");
            return (Criteria) this;
        }

        public Criteria andWantindustryIsNull() {
            addCriterion("wantIndustry is null");
            return (Criteria) this;
        }

        public Criteria andWantindustryIsNotNull() {
            addCriterion("wantIndustry is not null");
            return (Criteria) this;
        }

        public Criteria andWantindustryEqualTo(String value) {
            addCriterion("wantIndustry =", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryNotEqualTo(String value) {
            addCriterion("wantIndustry <>", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryGreaterThan(String value) {
            addCriterion("wantIndustry >", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryGreaterThanOrEqualTo(String value) {
            addCriterion("wantIndustry >=", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryLessThan(String value) {
            addCriterion("wantIndustry <", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryLessThanOrEqualTo(String value) {
            addCriterion("wantIndustry <=", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryLike(String value) {
            addCriterion("wantIndustry like", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryNotLike(String value) {
            addCriterion("wantIndustry not like", value, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryIn(List<String> values) {
            addCriterion("wantIndustry in", values, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryNotIn(List<String> values) {
            addCriterion("wantIndustry not in", values, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryBetween(String value1, String value2) {
            addCriterion("wantIndustry between", value1, value2, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantindustryNotBetween(String value1, String value2) {
            addCriterion("wantIndustry not between", value1, value2, "wantindustry");
            return (Criteria) this;
        }

        public Criteria andWantsalaryIsNull() {
            addCriterion("wantSalary is null");
            return (Criteria) this;
        }

        public Criteria andWantsalaryIsNotNull() {
            addCriterion("wantSalary is not null");
            return (Criteria) this;
        }

        public Criteria andWantsalaryEqualTo(String value) {
            addCriterion("wantSalary =", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryNotEqualTo(String value) {
            addCriterion("wantSalary <>", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryGreaterThan(String value) {
            addCriterion("wantSalary >", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("wantSalary >=", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryLessThan(String value) {
            addCriterion("wantSalary <", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryLessThanOrEqualTo(String value) {
            addCriterion("wantSalary <=", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryLike(String value) {
            addCriterion("wantSalary like", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryNotLike(String value) {
            addCriterion("wantSalary not like", value, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryIn(List<String> values) {
            addCriterion("wantSalary in", values, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryNotIn(List<String> values) {
            addCriterion("wantSalary not in", values, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryBetween(String value1, String value2) {
            addCriterion("wantSalary between", value1, value2, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantsalaryNotBetween(String value1, String value2) {
            addCriterion("wantSalary not between", value1, value2, "wantsalary");
            return (Criteria) this;
        }

        public Criteria andWantcityIsNull() {
            addCriterion("wantCity is null");
            return (Criteria) this;
        }

        public Criteria andWantcityIsNotNull() {
            addCriterion("wantCity is not null");
            return (Criteria) this;
        }

        public Criteria andWantcityEqualTo(String value) {
            addCriterion("wantCity =", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotEqualTo(String value) {
            addCriterion("wantCity <>", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityGreaterThan(String value) {
            addCriterion("wantCity >", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityGreaterThanOrEqualTo(String value) {
            addCriterion("wantCity >=", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLessThan(String value) {
            addCriterion("wantCity <", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLessThanOrEqualTo(String value) {
            addCriterion("wantCity <=", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityLike(String value) {
            addCriterion("wantCity like", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotLike(String value) {
            addCriterion("wantCity not like", value, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityIn(List<String> values) {
            addCriterion("wantCity in", values, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotIn(List<String> values) {
            addCriterion("wantCity not in", values, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityBetween(String value1, String value2) {
            addCriterion("wantCity between", value1, value2, "wantcity");
            return (Criteria) this;
        }

        public Criteria andWantcityNotBetween(String value1, String value2) {
            addCriterion("wantCity not between", value1, value2, "wantcity");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNull() {
            addCriterion("workstatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("workstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(String value) {
            addCriterion("workstatus =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(String value) {
            addCriterion("workstatus <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(String value) {
            addCriterion("workstatus >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("workstatus >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(String value) {
            addCriterion("workstatus <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(String value) {
            addCriterion("workstatus <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLike(String value) {
            addCriterion("workstatus like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotLike(String value) {
            addCriterion("workstatus not like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<String> values) {
            addCriterion("workstatus in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<String> values) {
            addCriterion("workstatus not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(String value1, String value2) {
            addCriterion("workstatus between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(String value1, String value2) {
            addCriterion("workstatus not between", value1, value2, "workstatus");
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