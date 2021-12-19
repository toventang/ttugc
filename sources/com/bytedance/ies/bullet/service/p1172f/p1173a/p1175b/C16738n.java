package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.n */
public final class C16738n<T> implements AbstractC16726e<T> {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC89183m<?, String, ?>> f39971a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Class<?>, AbstractC89187q<?, String, ?, ?>> f39972b = new LinkedHashMap();

    /* renamed from: c */
    private final Class<T> f39973c;

    static {
        Covode.recordClassIndex(19178);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16726e
    /* renamed from: a */
    public final <R> AbstractC89183m<R, String, T> mo26553a(Class<R> cls) {
        Object obj;
        C89219l.m154719c(cls, "");
        AbstractC89183m<R, String, T> mVar = null;
        try {
            AbstractC89183m<?, String, ?> mVar2 = this.f39971a.get(cls);
            obj = C89379q.m157068constructorimpl(mVar2 != null ? (AbstractC89183m) C89206ad.m154679b(mVar2, 2) : null);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            mVar = obj;
        }
        return mVar;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16726e
    /* renamed from: b */
    public final <R> AbstractC89187q<R, String, T, R> mo26556b(Class<R> cls) {
        Object obj;
        C89219l.m154719c(cls, "");
        AbstractC89187q<R, String, T, R> qVar = null;
        try {
            AbstractC89187q<?, String, ?, ?> qVar2 = this.f39972b.get(cls);
            obj = C89379q.m157068constructorimpl(qVar2 != null ? (AbstractC89187q) C89206ad.m154679b(qVar2, 3) : null);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            qVar = obj;
        }
        return qVar;
    }

    public final String toString() {
        return "ParamType: " + this.f39973c.getCanonicalName();
    }

    public C16738n(Class<T> cls) {
        C89219l.m154719c(cls, "");
        this.f39973c = cls;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16726e
    /* renamed from: a */
    public final <R> void mo26554a(Class<R> cls, AbstractC89183m<? super R, ? super String, ? extends T> mVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(mVar, "");
        this.f39971a.put(cls, mVar);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16726e
    /* renamed from: a */
    public final <R> void mo26555a(Class<R> cls, AbstractC89187q<? super R, ? super String, ? super T, ? extends R> qVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(qVar, "");
        this.f39972b.put(cls, qVar);
    }
}
