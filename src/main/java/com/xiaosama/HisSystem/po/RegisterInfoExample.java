package com.xiaosama.HisSystem.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegisterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterInfoExample() {
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

        public Criteria andMedicalIdIsNull() {
            addCriterion("medical_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIsNotNull() {
            addCriterion("medical_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalIdEqualTo(Integer value) {
            addCriterion("medical_id =", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotEqualTo(Integer value) {
            addCriterion("medical_id <>", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThan(Integer value) {
            addCriterion("medical_id >", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medical_id >=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThan(Integer value) {
            addCriterion("medical_id <", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdLessThanOrEqualTo(Integer value) {
            addCriterion("medical_id <=", value, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdIn(List<Integer> values) {
            addCriterion("medical_id in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotIn(List<Integer> values) {
            addCriterion("medical_id not in", values, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdBetween(Integer value1, Integer value2) {
            addCriterion("medical_id between", value1, value2, "medicalId");
            return (Criteria) this;
        }

        public Criteria andMedicalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medical_id not between", value1, value2, "medicalId");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelIsNull() {
            addCriterion("register_level is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelIsNotNull() {
            addCriterion("register_level is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelEqualTo(String value) {
            addCriterion("register_level =", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelNotEqualTo(String value) {
            addCriterion("register_level <>", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelGreaterThan(String value) {
            addCriterion("register_level >", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelGreaterThanOrEqualTo(String value) {
            addCriterion("register_level >=", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelLessThan(String value) {
            addCriterion("register_level <", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelLessThanOrEqualTo(String value) {
            addCriterion("register_level <=", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelLike(String value) {
            addCriterion("register_level like", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelNotLike(String value) {
            addCriterion("register_level not like", value, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelIn(List<String> values) {
            addCriterion("register_level in", values, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelNotIn(List<String> values) {
            addCriterion("register_level not in", values, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelBetween(String value1, String value2) {
            addCriterion("register_level between", value1, value2, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andRegisterLevelNotBetween(String value1, String value2) {
            addCriterion("register_level not between", value1, value2, "registerLevel");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("settlement_type like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlementType");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsInMorningIsNull() {
            addCriterion("is_in_morning is null");
            return (Criteria) this;
        }

        public Criteria andIsInMorningIsNotNull() {
            addCriterion("is_in_morning is not null");
            return (Criteria) this;
        }

        public Criteria andIsInMorningEqualTo(Boolean value) {
            addCriterion("is_in_morning =", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningNotEqualTo(Boolean value) {
            addCriterion("is_in_morning <>", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningGreaterThan(Boolean value) {
            addCriterion("is_in_morning >", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_in_morning >=", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningLessThan(Boolean value) {
            addCriterion("is_in_morning <", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningLessThanOrEqualTo(Boolean value) {
            addCriterion("is_in_morning <=", value, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningIn(List<Boolean> values) {
            addCriterion("is_in_morning in", values, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningNotIn(List<Boolean> values) {
            addCriterion("is_in_morning not in", values, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_morning between", value1, value2, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsInMorningNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_in_morning not between", value1, value2, "isInMorning");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookIsNull() {
            addCriterion("is_need_medical_book is null");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookIsNotNull() {
            addCriterion("is_need_medical_book is not null");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookEqualTo(Boolean value) {
            addCriterion("is_need_medical_book =", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookNotEqualTo(Boolean value) {
            addCriterion("is_need_medical_book <>", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookGreaterThan(Boolean value) {
            addCriterion("is_need_medical_book >", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_need_medical_book >=", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookLessThan(Boolean value) {
            addCriterion("is_need_medical_book <", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookLessThanOrEqualTo(Boolean value) {
            addCriterion("is_need_medical_book <=", value, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookIn(List<Boolean> values) {
            addCriterion("is_need_medical_book in", values, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookNotIn(List<Boolean> values) {
            addCriterion("is_need_medical_book not in", values, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need_medical_book between", value1, value2, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andIsNeedMedicalBookNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_need_medical_book not between", value1, value2, "isNeedMedicalBook");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateIsNull() {
            addCriterion("diagnose_date is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateIsNotNull() {
            addCriterion("diagnose_date is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateEqualTo(Date value) {
            addCriterionForJDBCDate("diagnose_date =", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diagnose_date <>", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("diagnose_date >", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnose_date >=", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateLessThan(Date value) {
            addCriterionForJDBCDate("diagnose_date <", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diagnose_date <=", value, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateIn(List<Date> values) {
            addCriterionForJDBCDate("diagnose_date in", values, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diagnose_date not in", values, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnose_date between", value1, value2, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnoseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diagnose_date not between", value1, value2, "diagnoseDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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