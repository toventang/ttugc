package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import androidx.core.p033d.C0646a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a */
public final class C73835a implements C0646a.AbstractC0647a {

    /* renamed from: a */
    private List<C0646a.AbstractC0647a> f165758a = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(86581);
    }

    @Override // androidx.core.p033d.C0646a.AbstractC0647a
    /* renamed from: a */
    public final void mo2678a() {
        for (C0646a.AbstractC0647a aVar : this.f165758a) {
            aVar.mo2678a();
        }
    }

    /* renamed from: a */
    public final void mo116294a(C0646a.AbstractC0647a aVar) {
        this.f165758a.add(aVar);
    }
}
