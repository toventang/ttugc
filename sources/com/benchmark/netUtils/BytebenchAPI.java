package com.benchmark.netUtils;

import com.benchmark.p118b.C2417a;
import com.benchmark.p118b.C2426e;
import com.benchmark.p118b.C2427f;
import com.benchmark.p118b.C2429h;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22003k;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;
import okhttp3.AbstractC90025ab;

public interface BytebenchAPI {
    static {
        Covode.recordClassIndex(2852);
    }

    @AbstractC22000h(mo35789a = "/bytebench/api/task/group")
    AbstractC21983b<TypedInput> getDefaultBenchmark(@AbstractC22005m Map<String, String> map, @AbstractC21987aa Map<String, String> map2);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/info")
    AbstractC21983b<C2426e<Object>> getDeviceInfo(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/score")
    AbstractC21983b<C2426e<C2417a>> getDeviceScore(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22000h(mo35789a = "/model/api/arithmetics")
    AbstractC21983b<TypedInput> getModels(@AbstractC21987aa Map<String, String> map);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/strategy/score")
    AbstractC21983b<C2426e<C2417a>> getSceneScore(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/strategy/batch")
    AbstractC21983b<C2426e<C2427f>> getStrategyComprise(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/strategy/result")
    AbstractC21983b<C2426e<C2429h>> getStrategyResult(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22012t(mo35799a = "/bytebench/api/sdk/device/task/result")
    AbstractC21983b<C2426e<Object>> getTaskResult(@AbstractC22003k(mo35794a = "x-bytebench-signature") String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);

    @AbstractC22012t(mo35799a = "/bytebench/api/task/result")
    AbstractC21983b<TypedInput> reportResult(@AbstractC21987aa Map<String, String> map, @AbstractC21994b AbstractC90025ab abVar);
}
