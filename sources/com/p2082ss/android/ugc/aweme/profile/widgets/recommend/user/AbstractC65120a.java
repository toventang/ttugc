package com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user;

import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88110c;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.a */
public abstract class AbstractC65120a extends AbstractC12769a implements AbstractC88084b<Object> {

    /* renamed from: j */
    private volatile C88110c f146994j;

    /* renamed from: k */
    private final Object f146995k = new Object();

    static {
        Covode.recordClassIndex(76589);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        generatedComponent();
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo104335v().generatedComponent();
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
    private C88110c mo104335v() {
        if (this.f146994j == null) {
            synchronized (this.f146995k) {
                if (this.f146994j == null) {
                    this.f146994j = new C88110c(this);
                }
            }
        }
        return this.f146994j;
    }
}
