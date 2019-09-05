package com.xiaosama.HisSystem.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(Integer value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(Integer value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(Integer value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(Integer value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(Integer value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<Integer> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<Integer> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(Integer value1, Integer value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeIsNull() {
            addCriterion("pay_return_time is null");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeIsNotNull() {
            addCriterion("pay_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeEqualTo(Date value) {
            addCriterion("pay_return_time =", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeNotEqualTo(Date value) {
            addCriterion("pay_return_time <>", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeGreaterThan(Date value) {
            addCriterion("pay_return_time >", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_return_time >=", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeLessThan(Date value) {
            addCriterion("pay_return_time <", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_return_time <=", value, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeIn(List<Date> values) {
            addCriterion("pay_return_time in", values, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeNotIn(List<Date> values) {
            addCriterion("pay_return_time not in", values, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeBetween(Date value1, Date value2) {
            addCriterion("pay_return_time between", value1, value2, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_return_time not between", value1, value2, "payReturnTime");
            return (Criteria) this;
        }

        public Criteria andPayApproachIsNull() {
            addCriterion("pay_approach is null");
            return (Criteria) this;
        }

        public Criteria andPayApproachIsNotNull() {
            addCriterion("pay_approach is not null");
            return (Criteria) this;
        }

        public Criteria andPayApproachEqualTo(String value) {
            addCriterion("pay_approach =", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachNotEqualTo(String value) {
            addCriterion("pay_approach <>", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachGreaterThan(String value) {
            addCriterion("pay_approach >", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachGreaterThanOrEqualTo(String value) {
            addCriterion("pay_approach >=", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachLessThan(String value) {
            addCriterion("pay_approach <", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachLessThanOrEqualTo(String value) {
            addCriterion("pay_approach <=", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachLike(String value) {
            addCriterion("pay_approach like", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachNotLike(String value) {
            addCriterion("pay_approach not like", value, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachIn(List<String> values) {
            addCriterion("pay_approach in", values, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachNotIn(List<String> values) {
            addCriterion("pay_approach not in", values, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachBetween(String value1, String value2) {
            addCriterion("pay_approach between", value1, value2, "payApproach");
            return (Criteria) this;
        }

        public Criteria andPayApproachNotBetween(String value1, String value2) {
            addCriterion("pay_approach not between", value1, value2, "payApproach");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberIsNull() {
            addCriterion("rush_red_number is null");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberIsNotNull() {
            addCriterion("rush_red_number is not null");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberEqualTo(Integer value) {
            addCriterion("rush_red_number =", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberNotEqualTo(Integer value) {
            addCriterion("rush_red_number <>", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberGreaterThan(Integer value) {
            addCriterion("rush_red_number >", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("rush_red_number >=", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberLessThan(Integer value) {
            addCriterion("rush_red_number <", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("rush_red_number <=", value, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberIn(List<Integer> values) {
            addCriterion("rush_red_number in", values, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberNotIn(List<Integer> values) {
            addCriterion("rush_red_number not in", values, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberBetween(Integer value1, Integer value2) {
            addCriterion("rush_red_number between", value1, value2, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andRushRedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("rush_red_number not between", value1, value2, "rushRedNumber");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIsNull() {
            addCriterion("fee_category is null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIsNotNull() {
            addCriterion("fee_category is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryEqualTo(String value) {
            addCriterion("fee_category =", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotEqualTo(String value) {
            addCriterion("fee_category <>", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryGreaterThan(String value) {
            addCriterion("fee_category >", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("fee_category >=", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLessThan(String value) {
            addCriterion("fee_category <", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLessThanOrEqualTo(String value) {
            addCriterion("fee_category <=", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLike(String value) {
            addCriterion("fee_category like", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotLike(String value) {
            addCriterion("fee_category not like", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIn(List<String> values) {
            addCriterion("fee_category in", values, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotIn(List<String> values) {
            addCriterion("fee_category not in", values, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryBetween(String value1, String value2) {
            addCriterion("fee_category between", value1, value2, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotBetween(String value1, String value2) {
            addCriterion("fee_category not between", value1, value2, "feeCategory");
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