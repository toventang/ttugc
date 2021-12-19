package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.AbstractC35864a;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35958ab;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.e */
final /* synthetic */ class C35790e implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC35789d f84485a;

    static {
        Covode.recordClassIndex(43029);
    }

    C35790e(AbstractC35789d dVar) {
        this.f84485a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC35789d dVar = this.f84485a;
        if (obj == AbstractC35864a.C35865a.f84655a) {
            C1731i.m5640b(new CallableC35792g(dVar), C1731i.f5564c);
            new C35958ab(new C35793h(dVar), 5).mo63094a(dVar.f84473a);
        }
    }
}
