package com.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class SkillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andListenskillIsNull() {
            addCriterion("listenskill is null");
            return (Criteria) this;
        }

        public Criteria andListenskillIsNotNull() {
            addCriterion("listenskill is not null");
            return (Criteria) this;
        }

        public Criteria andListenskillEqualTo(String value) {
            addCriterion("listenskill =", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillNotEqualTo(String value) {
            addCriterion("listenskill <>", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillGreaterThan(String value) {
            addCriterion("listenskill >", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillGreaterThanOrEqualTo(String value) {
            addCriterion("listenskill >=", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillLessThan(String value) {
            addCriterion("listenskill <", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillLessThanOrEqualTo(String value) {
            addCriterion("listenskill <=", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillLike(String value) {
            addCriterion("listenskill like", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillNotLike(String value) {
            addCriterion("listenskill not like", value, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillIn(List<String> values) {
            addCriterion("listenskill in", values, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillNotIn(List<String> values) {
            addCriterion("listenskill not in", values, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillBetween(String value1, String value2) {
            addCriterion("listenskill between", value1, value2, "listenskill");
            return (Criteria) this;
        }

        public Criteria andListenskillNotBetween(String value1, String value2) {
            addCriterion("listenskill not between", value1, value2, "listenskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillIsNull() {
            addCriterion("writeskill is null");
            return (Criteria) this;
        }

        public Criteria andWriteskillIsNotNull() {
            addCriterion("writeskill is not null");
            return (Criteria) this;
        }

        public Criteria andWriteskillEqualTo(String value) {
            addCriterion("writeskill =", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillNotEqualTo(String value) {
            addCriterion("writeskill <>", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillGreaterThan(String value) {
            addCriterion("writeskill >", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillGreaterThanOrEqualTo(String value) {
            addCriterion("writeskill >=", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillLessThan(String value) {
            addCriterion("writeskill <", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillLessThanOrEqualTo(String value) {
            addCriterion("writeskill <=", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillLike(String value) {
            addCriterion("writeskill like", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillNotLike(String value) {
            addCriterion("writeskill not like", value, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillIn(List<String> values) {
            addCriterion("writeskill in", values, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillNotIn(List<String> values) {
            addCriterion("writeskill not in", values, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillBetween(String value1, String value2) {
            addCriterion("writeskill between", value1, value2, "writeskill");
            return (Criteria) this;
        }

        public Criteria andWriteskillNotBetween(String value1, String value2) {
            addCriterion("writeskill not between", value1, value2, "writeskill");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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