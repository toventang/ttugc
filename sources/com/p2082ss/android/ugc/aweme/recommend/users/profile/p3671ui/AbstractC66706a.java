package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.AssemListViewModel;
import dagger.hilt.android.internal.managers.C88110c;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.a */
public abstract class AbstractC66706a<VM extends AssemListViewModel<?, ?, ?>> extends AbstractC14534m<VM> implements AbstractC88084b<Object> {

    /* renamed from: j */
    private volatile C88110c f149894j;

    /* renamed from: k */
    private final Object f149895k = new Object();

    static {
        Covode.recordClassIndex(78275);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        generatedComponent();
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m118512y().generatedComponent();
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

    /* renamed from: y */
    private C88110c m118512y() {
        if (this.f149894j == null) {
            synchronized (this.f149895k) {
                if (this.f149894j == null) {
                    this.f149894j = new C88110c(this);
                }
            }
        }
        return this.f149894j;
    }
}
