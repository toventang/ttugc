package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dm */
public final /* synthetic */ class C73616dm implements AbstractC89183m {

    /* renamed from: a */
    private final C73560cj f165437a;

    static {
        Covode.recordClassIndex(86354);
    }

    C73616dm(C73560cj cjVar) {
        this.f165437a = cjVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        int i;
        C73560cj cjVar = this.f165437a;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (booleanValue) {
            i = 1;
        } else {
            i = 2;
        }
        repo.storeInt("USER_HD_VIDEO_SWITCH_SETTING", i);
        C63238c.f143586m.mo93857d().mo93861a(true);
        C63244g.m114602a().mo73287o().mo104790j().mo104829a(cjVar.getContext(), null);
        return null;
    }
}
