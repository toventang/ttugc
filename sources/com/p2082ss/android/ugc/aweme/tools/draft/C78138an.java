package com.p2082ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.tools.draft.an */
public final /* synthetic */ class C78138an implements AbstractC89183m {

    /* renamed from: a */
    private final C43223c f175472a;

    /* renamed from: b */
    private final IDraftService.DraftListener f175473b;

    /* renamed from: c */
    private final ProgressDialog f175474c;

    /* renamed from: d */
    private final ActivityC0945e f175475d;

    /* renamed from: e */
    private final int f175476e;

    /* renamed from: f */
    private final long f175477f;

    static {
        Covode.recordClassIndex(91253);
    }

    C78138an(C43223c cVar, IDraftService.DraftListener draftListener, ProgressDialog progressDialog, ActivityC0945e eVar, int i, long j) {
        this.f175472a = cVar;
        this.f175473b = draftListener;
        this.f175474c = progressDialog;
        this.f175475d = eVar;
        this.f175476e = i;
        this.f175477f = j;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        return C78135ak.m136627a(this.f175472a, this.f175473b, this.f175474c, this.f175475d, this.f175476e, this.f175477f, (Boolean) obj);
    }
}
