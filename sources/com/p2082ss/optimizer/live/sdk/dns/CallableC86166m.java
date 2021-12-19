package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.optimizer.live.sdk.dns.m */
public final class CallableC86166m implements Callable<List<String>> {

    /* renamed from: a */
    private final List<String> f192164a;

    /* renamed from: b */
    private final List<String> f192165b;

    static {
        Covode.recordClassIndex(101308);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<String> call() {
        MethodCollector.m26663i(2727);
        ArrayList arrayList = new ArrayList();
        NativeConnect nativeConnect = new NativeConnect();
        for (String str : this.f192164a) {
            if (this.f192165b.isEmpty() || !this.f192165b.contains(str)) {
                int connect = nativeConnect.connect(str, "8080");
                if (connect == -1) {
                    if (C86159g.f192141a) {
                        C86159g.m147972a();
                    }
                } else if (connect == 0) {
                    arrayList.add(str);
                    if (C86159g.f192141a) {
                        C86159g.m147972a();
                    }
                }
            }
        }
        MethodCollector.m26664o(2727);
        return arrayList;
    }

    CallableC86166m(List<String> list, List<String> list2) {
        this.f192164a = list;
        this.f192165b = list2;
    }
}
