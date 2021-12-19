package com.bytedance.lynx.hybrid.p1522h;

import com.bytedance.android.monitorV2.p739k.C12121d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.AbstractC21195h;
import com.bytedance.lynx.hybrid.C21170d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.h.a */
public class C21196a {

    /* renamed from: f */
    public String f50280f = C12121d.m21607a();

    /* renamed from: g */
    public String f50281g = "default_bid";

    /* renamed from: h */
    public AbstractC21195h f50282h;

    /* renamed from: i */
    public C21198c f50283i = new C21198c();

    static {
        Covode.recordClassIndex(24812);
    }

    public int hashCode() {
        return this.f50280f.hashCode();
    }

    /* renamed from: a */
    public final void mo34747a(C21198c cVar) {
        C89219l.m154719c(cVar, "");
        this.f50283i = cVar;
    }

    /* renamed from: a */
    public final <T> T mo34746a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) C21170d.C21171a.m39868a().mo34736a(this, cls);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C21196a) {
            return C89219l.m154714a((Object) ((C21196a) obj).f50280f, (Object) this.f50280f);
        }
        return false;
    }

    /* renamed from: a */
    public final <T> void mo34748a(Class<T> cls, T t) {
        C89219l.m154719c(cls, "");
        C21170d.C21171a.m39868a().mo34737a(this, cls, t);
    }
}
