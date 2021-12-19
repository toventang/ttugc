package com.bytedance.disk.p966h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.AbstractC14448c;
import com.bytedance.disk.parcel.MigrationItem;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.disk.h.f */
public final class C14479f {

    /* renamed from: a */
    private Map<String, String> f35005a = new HashMap();

    /* renamed from: b */
    private AbstractC14448c f35006b;

    static {
        Covode.recordClassIndex(16558);
    }

    /* renamed from: a */
    private void m26469a() {
        AbstractC14448c cVar = this.f35006b;
        if (cVar != null) {
            cVar.mo23277a("monitor", this.f35005a);
        }
    }

    /* renamed from: a */
    private C14479f m26468a(Map<String, String> map) {
        this.f35005a.putAll(map);
        return this;
    }

    private C14479f(AbstractC14448c cVar) {
        this.f35006b = cVar;
    }

    /* renamed from: a */
    private C14479f m26467a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f35005a.put(str, str2);
        }
        return this;
    }

    /* renamed from: a */
    public static void m26470a(AbstractC14448c cVar, int i, MigrationItem migrationItem, Map<String, String> map) {
        C14479f a = new C14479f(cVar).m26467a("stage", String.valueOf(i)).m26467a("data_uri", migrationItem.f35012c.f35021c).m26467a("target_uri", migrationItem.f35012c.f35022d).m26467a("MigrationItem", migrationItem.toString());
        if (map != null) {
            a.m26468a(map);
        }
        a.m26469a();
    }
}
