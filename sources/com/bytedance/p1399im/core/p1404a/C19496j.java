package com.bytedance.p1399im.core.p1404a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.a.j */
public class C19496j implements Serializable {
    @AbstractC27891c(mo46611a = "batch_query_enable_and_query_limit")
    public int batchQueryEnableAndQueryLimit;
    @AbstractC27891c(mo46611a = "full_info_optimize_enable")
    public int fullInfoOptimizeEnable;
    @AbstractC27891c(mo46611a = "init_conv_list_pull_async_enable")
    public int initConvListPullAsyncEnable;

    static {
        Covode.recordClassIndex(22340);
    }

    public String toString() {
        return "OptimizeConvListPullConfig{init_conv_list_pull_async_enable:" + this.initConvListPullAsyncEnable + ", full_info_optimize_enable:" + this.fullInfoOptimizeEnable + ", batch_query_enable_and_query_limit:" + this.batchQueryEnableAndQueryLimit + "}";
    }
}
