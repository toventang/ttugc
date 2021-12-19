package com.p2082ss.android.ugc.aweme.comment;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.n */
public final class C36546n {

    /* renamed from: a */
    public final C1213t<Boolean> f86531a;

    /* renamed from: b */
    public int f86532b;

    static {
        Covode.recordClassIndex(43875);
    }

    public C36546n() {
        C1213t<Boolean> tVar = new C1213t<>();
        this.f86531a = tVar;
        tVar.setValue(false);
    }

    /* renamed from: a */
    public final void mo64258a() {
        int i = this.f86532b + 1;
        this.f86532b = i;
        if (i == 1) {
            this.f86531a.setValue(true);
        }
    }
}
