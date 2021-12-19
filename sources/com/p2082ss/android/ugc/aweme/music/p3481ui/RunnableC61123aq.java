package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.aq */
public final /* synthetic */ class RunnableC61123aq implements Runnable {

    /* renamed from: a */
    private final C61100ah f138800a;

    static {
        Covode.recordClassIndex(71728);
    }

    RunnableC61123aq(C61100ah ahVar) {
        this.f138800a = ahVar;
    }

    public final void run() {
        C61100ah ahVar = this.f138800a;
        if (ahVar.getActivity() != null && !ahVar.getActivity().isFinishing() && ahVar.af_()) {
            try {
                ahVar.f138714ae.mo27341a();
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }
}
