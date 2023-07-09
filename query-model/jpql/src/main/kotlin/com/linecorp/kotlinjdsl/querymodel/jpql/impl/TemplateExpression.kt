package com.linecorp.kotlinjdsl.querymodel.jpql.impl

import com.linecorp.kotlinjdsl.querymodel.jpql.Expression

data class TemplateExpression<T>(
    val template: String,
    val args: Collection<Expression<*>>,
) : Expression<T>
