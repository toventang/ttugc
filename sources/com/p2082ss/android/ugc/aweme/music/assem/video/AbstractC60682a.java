package com.p2082ss.android.ugc.aweme.music.assem.video;

import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import dagger.hilt.android.internal.managers.C88110c;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.music.assem.video.a */
public abstract class AbstractC60682a extends AbstractC12769a implements AbstractC88084b<Object> {

    /* renamed from: j */
    private volatile C88110c f137909j;

    /* renamed from: k */
    private final Object f137910k = new Object();

    static {
        Covode.recordClassIndex(71238);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        generatedComponent();
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo98139v().generatedComponent();
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
    private C88110c mo98139v() {
        if (this.f137909j == null) {
            synchronized (this.f137910k) {
                if (this.f137909j == null) {
                    this.f137909j = new C88110c(this);
                }
            }
        }
        return this.f137909j;
    }
}
