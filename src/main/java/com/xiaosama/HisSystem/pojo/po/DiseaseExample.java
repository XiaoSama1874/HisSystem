package com.xiaosama.HisSystem.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiseaseExample() {
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

        public Criteria andInitialCodeIsNull() {
            addCriterion("initial_code is null");
            return (Criteria) this;
        }

        public Criteria andInitialCodeIsNotNull() {
            addCriterion("initial_code is not null");
            return (Criteria) this;
        }

        public Criteria andInitialCodeEqualTo(String value) {
            addCriterion("initial_code =", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeNotEqualTo(String value) {
            addCriterion("initial_code <>", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeGreaterThan(String value) {
            addCriterion("initial_code >", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("initial_code >=", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeLessThan(String value) {
            addCriterion("initial_code <", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeLessThanOrEqualTo(String value) {
            addCriterion("initial_code <=", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeLike(String value) {
            addCriterion("initial_code like", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeNotLike(String value) {
            addCriterion("initial_code not like", value, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeIn(List<String> values) {
            addCriterion("initial_code in", values, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeNotIn(List<String> values) {
            addCriterion("initial_code not in", values, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeBetween(String value1, String value2) {
            addCriterion("initial_code between", value1, value2, "initialCode");
            return (Criteria) this;
        }

        public Criteria andInitialCodeNotBetween(String value1, String value2) {
            addCriterion("initial_code not between", value1, value2, "initialCode");
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

        public Criteria andIcdCodeIsNull() {
            addCriterion("icd_code is null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIsNotNull() {
            addCriterion("icd_code is not null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeEqualTo(String value) {
            addCriterion("icd_code =", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotEqualTo(String value) {
            addCriterion("icd_code <>", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThan(String value) {
            addCriterion("icd_code >", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("icd_code >=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThan(String value) {
            addCriterion("icd_code <", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThanOrEqualTo(String value) {
            addCriterion("icd_code <=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLike(String value) {
            addCriterion("icd_code like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotLike(String value) {
            addCriterion("icd_code not like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIn(List<String> values) {
            addCriterion("icd_code in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotIn(List<String> values) {
            addCriterion("icd_code not in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeBetween(String value1, String value2) {
            addCriterion("icd_code between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotBetween(String value1, String value2) {
            addCriterion("icd_code not between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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