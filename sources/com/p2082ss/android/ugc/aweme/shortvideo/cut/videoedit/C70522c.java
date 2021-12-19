package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c */
public final /* synthetic */ class C70522c implements AbstractC72001h {

    /* renamed from: a */
    private final C70520b f157726a;

    static {
        Covode.recordClassIndex(82978);
    }

    C70522c(C70520b bVar) {
        this.f157726a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.AbstractC72001h
    /* renamed from: a */
    public final void mo78808a(List list) {
        C70520b bVar = this.f157726a;
        if (list != null && !list.isEmpty()) {
            bVar.f157719n.clear();
            bVar.f157719n.addAll(list);
            bVar.notifyDataSetChanged();
        }
    }
}
