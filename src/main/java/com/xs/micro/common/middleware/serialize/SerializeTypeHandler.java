package com.xs.micro.common.middleware.serialize;

import com.xs.micro.common.middleware.entity.MethodInvocation;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 序列化类型处理。{@link MethodInvocation}
 *
 * @author chenrg
 * @date 2019年1月28日
 */
public class SerializeTypeHandler extends BaseTypeHandler<MethodInvocation> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, MethodInvocation parameter, JdbcType jdbcType)
            throws SQLException {
        if (parameter == null) {
            return;
        }
        ps.setObject(i, KryoSerializer.serialize(parameter));
    }

    @Override
    public MethodInvocation getNullableResult(ResultSet rs, String columnName) throws SQLException {
        byte[] bytes = rs.getBytes(columnName);
        return convertBytesResult(bytes);
    }

    @Override
    public MethodInvocation getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        byte[] bytes = rs.getBytes(columnIndex);
        return convertBytesResult(bytes);
    }

    @Override
    public MethodInvocation getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        byte[] bytes = cs.getBytes(columnIndex);
        return convertBytesResult(bytes);
    }

    private MethodInvocation convertBytesResult(byte[] bytes) {
        if (ArrayUtils.isEmpty(bytes)) {
            return null;
        }
        return KryoSerializer.deSerialize(bytes, MethodInvocation.class);
    }

}
