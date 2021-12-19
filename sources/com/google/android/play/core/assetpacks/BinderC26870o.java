package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.C27071m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.o */
final class BinderC26870o extends BinderC26868m<List<String>> {

    /* renamed from: c */
    final /* synthetic */ C26873r f63745c;

    static {
        Covode.recordClassIndex(32345);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BinderC26870o(C26873r rVar, C27071m<List<String>> mVar) {
        super(rVar, mVar);
        this.f63745c = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC26868m, com.google.android.play.core.p1963b.AbstractC26939cc
    /* renamed from: a */
    public final void mo44548a(List<Bundle> list) {
        super.mo44548a(list);
        C26873r rVar = this.f63745c;
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : list) {
            AssetPackState next = AbstractC26847d.m53312a(bundle, rVar.f63754c, new ArrayList(), C26768ab.f63425a).mo44475b().values().iterator().next();
            if (next == null) {
                C26873r.f63751a.mo44596b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C26816bw.m53267a(next.mo44430b())) {
                arrayList.add(next.mo44429a());
            }
        }
        this.f63743a.mo44783a(arrayList);
    }
}
