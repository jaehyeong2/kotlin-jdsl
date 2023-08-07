package com.linecorp.kotlinjdsl.example.jpql.springjpa.entity.employee

import jakarta.persistence.*

@Entity
@DiscriminatorValue("PART_TIME")
class PartTimeEmployee(
    override val employeeId: Long,

    override var name: String,

    override var nickname: String?,

    override var phone: String,

    override var address: EmployeeAddress,

    @Embedded
    @AttributeOverride(name = "value", column = Column(name = "weekly_salary"))
    val weeklySalary: EmployeeSalary,

    @OneToMany(mappedBy = "employee")
    override val departments: MutableSet<EmployeeDepartment>,
) : Employee(
    employeeId = employeeId,
    name = name,
    nickname = nickname,
    phone = phone,
    address = address,
    departments = departments,
) {

}
