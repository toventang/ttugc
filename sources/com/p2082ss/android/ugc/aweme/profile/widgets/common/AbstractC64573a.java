package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88110c;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.a */
public abstract class AbstractC64573a extends AbstractC64593h implements AbstractC88084b<Object> {

    /* renamed from: l */
    private volatile C88110c f146293l;

    /* renamed from: m */
    private final Object f146294m = new Object();

    static {
        Covode.recordClassIndex(76039);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        generatedComponent();
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo104155v().generatedComponent();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: q */
    public final C1175ad.AbstractC1177b mo20598q() {
        C1175ad.AbstractC1177b a = C88098a.m153169a(this);
        if (a != null) {
            return a;
        }
        return super.mo20598q();
    }

    /* renamed from: v */
    private C88110c mo104155v() {
        if (this.f146293l == null) {
            synchronized (this.f146294m) {
                if (this.f146293l == null) {
                    this.f146293l = new C88110c(this);
                }
            }
        }
        return this.f146293l;
    }
}
