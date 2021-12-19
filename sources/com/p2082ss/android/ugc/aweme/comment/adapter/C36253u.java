package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.adapter.u */
public final /* synthetic */ class C36253u implements AbstractC1214u {

    /* renamed from: a */
    private final C36247s f85668a;

    /* renamed from: b */
    private final View f85669b;

    static {
        Covode.recordClassIndex(43519);
    }

    C36253u(C36247s sVar, View view) {
        this.f85668a = sVar;
        this.f85669b = view;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f85668a.mo63413a(this.f85669b, (Boolean) obj);
    }
}
