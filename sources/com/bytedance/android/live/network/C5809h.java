package com.bytedance.android.live.network;

import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.android.live.network.AbstractC5799b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.model.AbstractC11837c;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.network.h */
public class C5809h {

    /* renamed from: d */
    private static volatile C5809h f14659d;

    /* renamed from: a */
    public final Map<Class, Object> f14660a = new ConcurrentHashMap();

    /* renamed from: b */
    public final AbstractC5799b f14661b = new C5795a();

    /* renamed from: c */
    private final Map<Class, AbstractC2724b> f14662c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(6414);
    }

    /* renamed from: c */
    public static String m12740c() {
        return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).getHostDomain();
    }

    private C5809h() {
    }

    /* renamed from: b */
    public final Map<String, String> mo11588b() {
        Map<String, String> commonParams = ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).getCommonParams();
        AbstractC5799b bVar = this.f14661b;
        if (bVar != null) {
            bVar.mo11567a(commonParams);
        }
        return commonParams;
    }

    /* renamed from: a */
    public static C5809h m12739a() {
        MethodCollector.m26663i(11657);
        if (f14659d == null) {
            synchronized (C5809h.class) {
                try {
                    if (f14659d == null) {
                        f14659d = new C5809h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11657);
                    throw th;
                }
            }
        }
        C5809h hVar = f14659d;
        MethodCollector.m26664o(11657);
        return hVar;
    }

    /* renamed from: a */
    public final void mo11587a(Map<Class, AbstractC2724b> map) {
        this.f14662c.putAll(map);
    }

    /* renamed from: a */
    public final <T> AbstractC2724b<T> mo11582a(Class<T> cls) {
        return this.f14662c.get(cls);
    }

    /* renamed from: a */
    public final AbstractC11837c<C11835a> mo11584a(String str, List<C2959a> list, Object obj) {
        AbstractC5799b bVar = this.f14661b;
        if (bVar == null) {
            return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).get(str, list, obj);
        }
        AbstractC5799b.C5800a a = bVar.mo11566a(new AbstractC5799b.C5800a(str, list));
        return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).get(a.f14640a, a.f14641b, obj);
    }

    /* renamed from: a */
    public final AbstractC11837c<C11835a> mo11585a(String str, List<C2959a> list, String str2, byte[] bArr) {
        return mo11586a(str, list, str2, bArr, null);
    }

    /* renamed from: a */
    public final AbstractC11837c<C11835a> mo11586a(String str, List<C2959a> list, String str2, byte[] bArr, Object obj) {
        AbstractC5799b bVar = this.f14661b;
        if (bVar == null) {
            return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).post(str, list, str2, bArr, obj);
        }
        AbstractC5799b.C5800a a = bVar.mo11566a(new AbstractC5799b.C5800a(str, list));
        return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).post(a.f14640a, a.f14641b, str2, bArr, obj);
    }

    /* renamed from: a */
    public final AbstractC11837c<C11835a> mo11583a(int i, String str, List<C2959a> list, String str2, byte[] bArr, long j, String str3) {
        AbstractC5799b bVar = this.f14661b;
        if (bVar == null) {
            return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).uploadFile(i, str, list, str2, bArr, j, str3);
        }
        AbstractC5799b.C5800a a = bVar.mo11566a(new AbstractC5799b.C5800a(str, list));
        return ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).uploadFile(i, a.f14640a, a.f14641b, str2, bArr, j, str3);
    }
}
