package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.i */
public final /* synthetic */ class C14662i implements C14749b.AbstractC14750a {

    /* renamed from: a */
    static final C14749b.AbstractC14750a f35591a = new C14662i();

    static {
        Covode.recordClassIndex(16757);
    }

    private C14662i() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p994f.C14749b.AbstractC14750a
    /* renamed from: a */
    public final void mo23630a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            if (C14659h.f35584c != null) {
                Reflect.m24529on(C14659h.f35584c).call("notifyStoreRegionUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6, str7, str8).get();
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
