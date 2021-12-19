package com.bytedance.sdk.p1665b.p1669d.p1672c;

import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.sdk.p1665b.p1666a.AbstractC22523c;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.b.d.c.a */
public class C22560a implements AbstractC22523c {

    /* renamed from: a */
    private static C22560a f53327a;

    static {
        Covode.recordClassIndex(26376);
    }

    private C22560a() {
    }

    /* renamed from: a */
    public static C22560a m42561a() {
        MethodCollector.m26663i(4872);
        if (f53327a == null) {
            synchronized (C22560a.class) {
                try {
                    if (f53327a == null) {
                        f53327a = new C22560a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4872);
                    throw th;
                }
            }
        }
        C22560a aVar = f53327a;
        MethodCollector.m26664o(4872);
        return aVar;
    }

    @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22523c
    /* renamed from: a */
    public final String mo36795a(String str, Map<String, String> map) {
        try {
            if (C13627m.m24498a(str)) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
            String str2 = (String) a.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a((String) a.first, INetworkApi.class);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (map != null && !map.isEmpty()) {
                linkedHashMap2.putAll(map);
            }
            if (iNetworkApi != null) {
                C22099u<String> execute = iNetworkApi.doPost(102400, str2, linkedHashMap, linkedHashMap2, null, null).execute();
                if (execute.f52261a.mo35845a()) {
                    return execute.f52262b;
                }
                throw new RuntimeException("request fail, ".concat(String.valueOf(C22584a.m42605a(execute.f52263c.mo11577in()))));
            }
            throw new RuntimeException("netWorkApi == null");
        } catch (Throwable th) {
            throw new RuntimeException(th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.p1665b.p1666a.AbstractC22523c
    /* renamed from: a */
    public final String mo36796a(boolean z, String str) {
        try {
            if (C13627m.m24498a(str)) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
            String str2 = (String) a.second;
            INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m43281a((String) a.first, INetworkApi.class);
            if (iNetworkApi != null) {
                C22099u<String> execute = iNetworkApi.doGet(z, 102400, str2, linkedHashMap, null, null).execute();
                if (execute.f52261a.mo35845a()) {
                    return execute.f52262b;
                }
                throw new RuntimeException("request fail, ".concat(String.valueOf(C22584a.m42605a(execute.f52263c.mo11577in()))));
            }
            throw new RuntimeException("netWorkApi == null");
        } catch (Throwable th) {
            throw new RuntimeException(th.getMessage());
        }
    }
}
