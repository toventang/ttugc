package com.bytedance.android.monitorV2.p735h;

import android.content.Context;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12099b;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.monitorV2.h.b */
public class C12104b implements AbstractC12113f {

    /* renamed from: a */
    private static volatile C12104b f29114a;

    /* renamed from: b */
    private C12097a f29115b;

    /* renamed from: c */
    private C12103e f29116c;

    /* renamed from: d */
    private Map<String, Integer> f29117d;

    /* renamed from: e */
    private String f29118e = "";

    static {
        Covode.recordClassIndex(13833);
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: a */
    public final void mo19478a(Context context) {
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: d */
    public final List<C12099b> mo19481d() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: b */
    public final C12097a mo19479b() {
        if (this.f29115b == null) {
            this.f29115b = new C12097a();
        }
        return this.f29115b;
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: c */
    public final C12103e mo19480c() {
        if (this.f29116c == null) {
            this.f29116c = new C12103e();
        }
        return this.f29116c;
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: e */
    public final Map<String, Integer> mo19482e() {
        if (this.f29117d == null) {
            this.f29117d = new HashMap();
        }
        return this.f29117d;
    }

    /* renamed from: a */
    public static C12104b m21550a() {
        MethodCollector.m26663i(461);
        if (f29114a == null) {
            synchronized (C12104b.class) {
                try {
                    if (f29114a == null) {
                        f29114a = new C12104b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(461);
                    throw th;
                }
            }
        }
        C12104b bVar = f29114a;
        MethodCollector.m26664o(461);
        return bVar;
    }
}
