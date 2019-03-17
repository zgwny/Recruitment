package com.recruitment.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andGroupkeyIsNull() {
            addCriterion("groupKey is null");
            return (Criteria) this;
        }

        public Criteria andGroupkeyIsNotNull() {
            addCriterion("groupKey is not null");
            return (Criteria) this;
        }

        public Criteria andGroupkeyEqualTo(Integer value) {
            addCriterion("groupKey =", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyNotEqualTo(Integer value) {
            addCriterion("groupKey <>", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyGreaterThan(Integer value) {
            addCriterion("groupKey >", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupKey >=", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyLessThan(Integer value) {
            addCriterion("groupKey <", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyLessThanOrEqualTo(Integer value) {
            addCriterion("groupKey <=", value, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyIn(List<Integer> values) {
            addCriterion("groupKey in", values, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyNotIn(List<Integer> values) {
            addCriterion("groupKey not in", values, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyBetween(Integer value1, Integer value2) {
            addCriterion("groupKey between", value1, value2, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupkeyNotBetween(Integer value1, Integer value2) {
            addCriterion("groupKey not between", value1, value2, "groupkey");
            return (Criteria) this;
        }

        public Criteria andGroupvalueIsNull() {
            addCriterion("groupValue is null");
            return (Criteria) this;
        }

        public Criteria andGroupvalueIsNotNull() {
            addCriterion("groupValue is not null");
            return (Criteria) this;
        }

        public Criteria andGroupvalueEqualTo(String value) {
            addCriterion("groupValue =", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueNotEqualTo(String value) {
            addCriterion("groupValue <>", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueGreaterThan(String value) {
            addCriterion("groupValue >", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueGreaterThanOrEqualTo(String value) {
            addCriterion("groupValue >=", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueLessThan(String value) {
            addCriterion("groupValue <", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueLessThanOrEqualTo(String value) {
            addCriterion("groupValue <=", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueLike(String value) {
            addCriterion("groupValue like", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueNotLike(String value) {
            addCriterion("groupValue not like", value, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueIn(List<String> values) {
            addCriterion("groupValue in", values, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueNotIn(List<String> values) {
            addCriterion("groupValue not in", values, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueBetween(String value1, String value2) {
            addCriterion("groupValue between", value1, value2, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andGroupvalueNotBetween(String value1, String value2) {
            addCriterion("groupValue not between", value1, value2, "groupvalue");
            return (Criteria) this;
        }

        public Criteria andItemkeyIsNull() {
            addCriterion("itemKey is null");
            return (Criteria) this;
        }

        public Criteria andItemkeyIsNotNull() {
            addCriterion("itemKey is not null");
            return (Criteria) this;
        }

        public Criteria andItemkeyEqualTo(Integer value) {
            addCriterion("itemKey =", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyNotEqualTo(Integer value) {
            addCriterion("itemKey <>", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyGreaterThan(Integer value) {
            addCriterion("itemKey >", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemKey >=", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyLessThan(Integer value) {
            addCriterion("itemKey <", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyLessThanOrEqualTo(Integer value) {
            addCriterion("itemKey <=", value, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyIn(List<Integer> values) {
            addCriterion("itemKey in", values, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyNotIn(List<Integer> values) {
            addCriterion("itemKey not in", values, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyBetween(Integer value1, Integer value2) {
            addCriterion("itemKey between", value1, value2, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemkeyNotBetween(Integer value1, Integer value2) {
            addCriterion("itemKey not between", value1, value2, "itemkey");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNull() {
            addCriterion("itemValue is null");
            return (Criteria) this;
        }

        public Criteria andItemvalueIsNotNull() {
            addCriterion("itemValue is not null");
            return (Criteria) this;
        }

        public Criteria andItemvalueEqualTo(String value) {
            addCriterion("itemValue =", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotEqualTo(String value) {
            addCriterion("itemValue <>", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThan(String value) {
            addCriterion("itemValue >", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueGreaterThanOrEqualTo(String value) {
            addCriterion("itemValue >=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThan(String value) {
            addCriterion("itemValue <", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLessThanOrEqualTo(String value) {
            addCriterion("itemValue <=", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueLike(String value) {
            addCriterion("itemValue like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotLike(String value) {
            addCriterion("itemValue not like", value, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueIn(List<String> values) {
            addCriterion("itemValue in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotIn(List<String> values) {
            addCriterion("itemValue not in", values, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueBetween(String value1, String value2) {
            addCriterion("itemValue between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andItemvalueNotBetween(String value1, String value2) {
            addCriterion("itemValue not between", value1, value2, "itemvalue");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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