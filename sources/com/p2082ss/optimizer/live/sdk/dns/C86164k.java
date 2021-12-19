package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.optimizer.live.sdk.dns.k */
public final class C86164k {

    /* renamed from: a */
    public final String f192159a;

    /* renamed from: b */
    public final List<String> f192160b;

    /* renamed from: c */
    public final long f192161c = 0;

    static {
        Covode.recordClassIndex(101306);
    }

    public final String toString() {
        String str = "\"" + this.f192159a + "\":[";
        if (this.f192160b != null) {
            for (int i = 0; i < this.f192160b.size(); i++) {
                str = str + "\"" + this.f192160b.get(i) + "\"";
                if (i != this.f192160b.size() - 1) {
                    str = str + ",";
                }
            }
        }
        return str + "]";
    }

    public C86164k(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.f192160b = arrayList;
        this.f192159a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
