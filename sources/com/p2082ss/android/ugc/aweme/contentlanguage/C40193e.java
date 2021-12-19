package com.p2082ss.android.ugc.aweme.contentlanguage;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.contentlanguage.e */
public final /* synthetic */ class C40193e implements AbstractC1214u {

    /* renamed from: a */
    private final C40190d f94369a;

    static {
        Covode.recordClassIndex(47988);
    }

    C40193e(C40190d dVar) {
        this.f94369a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C40190d dVar = this.f94369a;
        dVar.f94364a = (ArrayList) obj;
        dVar.notifyDataSetChanged();
    }
}
