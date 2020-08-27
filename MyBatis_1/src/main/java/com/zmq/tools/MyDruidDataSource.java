package com.zmq.tools;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

/**
 * @Author ZMQ
 * @Date 2020/8/27
 * @since 1.8
 *
 * 配置Druid连接池
 */
public class MyDruidDataSource extends PooledDataSourceFactory {

    /**
     * 创建Druid数据源
     */
    public MyDruidDataSource() {
        this.dataSource = new DruidDataSource();
    }
}
