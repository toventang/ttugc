package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33138c;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.l */
public final /* synthetic */ class C37172l implements AbstractC33138c {

    /* renamed from: a */
    private final C37157k f87669a;

    static {
        Covode.recordClassIndex(44526);
    }

    C37172l(C37157k kVar) {
        this.f87669a = kVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33138c
    /* renamed from: a */
    public final void mo58998a() {
        C37157k kVar = this.f87669a;
        if (C37699a.m76259ae(kVar.f87623c)) {
            if (!C13603b.m24435a((Collection) kVar.f87638v.mo63369e())) {
                kVar.f87638v.mo63369e().remove(0);
                kVar.f87638v.notifyItemRemoved(0);
            }
            C38214ac a = C38681bh.m78486a(kVar.f87623c);
            if (a != null) {
                a.setHasDislike(true);
            }
            C80214ai.m139042a(new RunnableC37033ay(kVar), "BoltsUtils");
        }
    }
}
