package com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.a.b.m */
public class C16737m<T> implements AbstractC16725d<T> {

    /* renamed from: a */
    public final AbstractC16726e<T> f39964a;

    /* renamed from: b */
    public final T f39965b;

    /* renamed from: c */
    private T f39966c;

    /* renamed from: d */
    private AbstractC16727f f39967d;

    /* renamed from: e */
    private boolean f39968e;

    /* renamed from: f */
    private boolean f39969f;

    /* renamed from: g */
    private final String f39970g;

    static {
        Covode.recordClassIndex(19177);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: a */
    public final String mo26546a() {
        return this.f39970g;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: c */
    public final boolean mo26552c() {
        mo26550b();
        return this.f39969f;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: b */
    public final T mo26550b() {
        AbstractC16727f fVar;
        if (!this.f39968e && !this.f39969f && (fVar = this.f39967d) != null) {
            fVar.mo26557a(this);
            this.f39968e = true;
        }
        T t = this.f39966c;
        if (t == null) {
            return this.f39965b;
        }
        return t;
    }

    public String toString() {
        return "Param(" + this.f39964a + "){key: " + this.f39970g + ", value: " + ((Object) mo26550b()) + '}';
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: a */
    public final void mo26547a(AbstractC16727f fVar) {
        this.f39967d = fVar;
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: a */
    public final void mo26549a(T t) {
        this.f39966c = t;
        this.f39969f = true;
    }

    public /* synthetic */ C16737m(String str, AbstractC16726e eVar) {
        this(str, eVar, null);
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: a */
    public final <R> void mo26548a(Class<R> cls, R r) {
        T invoke;
        C89219l.m154719c(cls, "");
        AbstractC89183m<R, String, T> a = this.f39964a.mo26553a(cls);
        if (a != null && (invoke = a.invoke(r, this.f39970g)) != null) {
            mo26549a((Object) invoke);
        }
    }

    @Override // com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d
    /* renamed from: b */
    public final <R> R mo26551b(Class<R> cls, R r) {
        T t;
        C89219l.m154719c(cls, "");
        AbstractC89187q<R, String, T, R> b = this.f39964a.mo26556b(cls);
        if (b == null || (t = this.f39966c) == null) {
            return r;
        }
        return b.invoke(r, this.f39970g, t);
    }

    public C16737m(String str, AbstractC16726e<T> eVar, T t) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(eVar, "");
        this.f39970g = str;
        this.f39964a = eVar;
        this.f39965b = t;
    }
}
