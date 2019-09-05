package com.xiaosama.HisSystem.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeeDtlExample() {
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

        public Criteria andInvoiceIdIsNull() {
            addCriterion("invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(Integer value) {
            addCriterion("invoice_id =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(Integer value) {
            addCriterion("invoice_id <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(Integer value) {
            addCriterion("invoice_id >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_id >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(Integer value) {
            addCriterion("invoice_id <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_id <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<Integer> values) {
            addCriterion("invoice_id in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<Integer> values) {
            addCriterion("invoice_id not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id not between", value1, value2, "invoiceId");
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

        public Criteria andFeeNameIsNull() {
            addCriterion("fee_name is null");
            return (Criteria) this;
        }

        public Criteria andFeeNameIsNotNull() {
            addCriterion("fee_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeeNameEqualTo(String value) {
            addCriterion("fee_name =", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameNotEqualTo(String value) {
            addCriterion("fee_name <>", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameGreaterThan(String value) {
            addCriterion("fee_name >", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("fee_name >=", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameLessThan(String value) {
            addCriterion("fee_name <", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameLessThanOrEqualTo(String value) {
            addCriterion("fee_name <=", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameLike(String value) {
            addCriterion("fee_name like", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameNotLike(String value) {
            addCriterion("fee_name not like", value, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameIn(List<String> values) {
            addCriterion("fee_name in", values, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameNotIn(List<String> values) {
            addCriterion("fee_name not in", values, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameBetween(String value1, String value2) {
            addCriterion("fee_name between", value1, value2, "feeName");
            return (Criteria) this;
        }

        public Criteria andFeeNameNotBetween(String value1, String value2) {
            addCriterion("fee_name not between", value1, value2, "feeName");
            return (Criteria) this;
        }

        public Criteria andIsMedicineIsNull() {
            addCriterion("is_medicine is null");
            return (Criteria) this;
        }

        public Criteria andIsMedicineIsNotNull() {
            addCriterion("is_medicine is not null");
            return (Criteria) this;
        }

        public Criteria andIsMedicineEqualTo(Boolean value) {
            addCriterion("is_medicine =", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineNotEqualTo(Boolean value) {
            addCriterion("is_medicine <>", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineGreaterThan(Boolean value) {
            addCriterion("is_medicine >", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_medicine >=", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineLessThan(Boolean value) {
            addCriterion("is_medicine <", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineLessThanOrEqualTo(Boolean value) {
            addCriterion("is_medicine <=", value, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineIn(List<Boolean> values) {
            addCriterion("is_medicine in", values, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineNotIn(List<Boolean> values) {
            addCriterion("is_medicine not in", values, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineBetween(Boolean value1, Boolean value2) {
            addCriterion("is_medicine between", value1, value2, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andIsMedicineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_medicine not between", value1, value2, "isMedicine");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
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