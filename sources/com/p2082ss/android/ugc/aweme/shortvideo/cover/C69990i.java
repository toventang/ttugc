package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71992b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.i */
final /* synthetic */ class C69990i implements AbstractC72001h {

    /* renamed from: a */
    private final C71992b f156441a;

    static {
        Covode.recordClassIndex(82404);
    }

    C69990i(C71992b bVar) {
        this.f156441a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h
    /* renamed from: a */
    public final void mo78808a(List list) {
        C71992b bVar = this.f156441a;
        if (list != null && !list.isEmpty()) {
            bVar.f161323a.clear();
            bVar.f161323a.addAll(list);
            bVar.notifyDataSetChanged();
        }
    }
}
