package com.facebook.imagepipeline.p1881f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.p1886k.AbstractC24462c;
import com.facebook.imagepipeline.p1889n.AbstractC24544ak;
import com.facebook.imagepipeline.p1889n.AbstractC24574b;
import com.facebook.imagepipeline.p1889n.C24561au;
import com.facebook.imagepipeline.p1889n.C24586d;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1844d.AbstractC24152a;

/* renamed from: com.facebook.imagepipeline.f.a */
public abstract class AbstractC24433a<T> extends AbstractC24152a<T> {

    /* renamed from: a */
    private final C24561au f58063a;

    /* renamed from: b */
    private final AbstractC24462c f58064b;

    static {
        Covode.recordClassIndex(28576);
    }

    /* renamed from: h */
    public final synchronized void mo39758h() {
        C24091i.m45622b(mo39741a());
    }

    @Override // com.facebook.p1844d.AbstractC24157c, com.facebook.p1844d.AbstractC24152a
    /* renamed from: g */
    public final boolean mo39750g() {
        if (!super.mo39750g()) {
            return false;
        }
        if (super.mo39745b()) {
            return true;
        }
        this.f58064b.onRequestCancellation(this.f58063a.f58413b);
        C24586d.m47026a(this.f58063a.mo40443i());
        return true;
    }

    /* renamed from: b */
    public final void mo40275b(Throwable th) {
        if (super.mo39744a(th)) {
            this.f58064b.onRequestFailure(this.f58063a.f58412a, this.f58063a.f58413b, th, this.f58063a.mo40419f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40274a(T t, int i) {
        boolean a = AbstractC24574b.m46992a(i);
        if (super.mo39743a(t, a) && a) {
            this.f58064b.onRequestSuccess(this.f58063a.f58412a, this.f58063a.f58413b, this.f58063a.mo40419f());
        }
    }

    protected AbstractC24433a(AbstractC24544ak<T> akVar, C24561au auVar, AbstractC24462c cVar) {
        C24644b.m47156a();
        this.f58063a = auVar;
        this.f58064b = cVar;
        C24644b.m47156a();
        cVar.onRequestStart(auVar.f58412a, auVar.f58414c, auVar.f58413b, auVar.mo40419f());
        C24644b.m47156a();
        C24644b.m47156a();
        akVar.mo40379a(new AbstractC24574b<T>() {
            /* class com.facebook.imagepipeline.p1881f.AbstractC24433a.C244341 */

            static {
                Covode.recordClassIndex(28577);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40276a() {
                AbstractC24433a.this.mo39758h();
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40277a(float f) {
                AbstractC24433a.this.mo39742a(f);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40279a(Throwable th) {
                AbstractC24433a.this.mo40275b(th);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24574b
            /* renamed from: a */
            public final void mo40278a(T t, int i) {
                AbstractC24433a.this.mo40274a(t, i);
            }
        }, auVar);
        C24644b.m47156a();
        C24644b.m47156a();
    }
}
