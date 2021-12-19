package com.p2082ss.android.ugc.aweme.music.assem.p3464a;

import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88110c;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.music.assem.a.a */
public abstract class AbstractC60344a extends AbstractC12769a implements AbstractC88084b<Object> {

    /* renamed from: j */
    private volatile C88110c f137532j;

    /* renamed from: k */
    private final Object f137533k = new Object();

    static {
        Covode.recordClassIndex(70893);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        generatedComponent();
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m110055v().generatedComponent();
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
    private C88110c m110055v() {
        if (this.f137532j == null) {
            synchronized (this.f137533k) {
                if (this.f137532j == null) {
                    this.f137532j = new C88110c(this);
                }
            }
        }
        return this.f137532j;
    }
}
