package pjb02.team1.financialplanning.common.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.stream.Stream;

public class PlanDetailIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        String query = "SELECT pd.planDetailId FROM PlanDetail pd";
        Stream<String> ids = session.createQuery(query, String.class).stream();
        Long max = ids.map(o -> o.replace(Constant.PREFIX_PLAN_DETAIL, "")).mapToLong(Long::parseLong).max().orElse(0L);
        return Constant.PREFIX_PLAN_DETAIL + (max + 1);
    }
}
