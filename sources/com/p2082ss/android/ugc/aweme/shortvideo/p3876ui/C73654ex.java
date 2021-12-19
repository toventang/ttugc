package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39252m;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40383b;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62855a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.setting.C68028bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4601a.C89064i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ex */
public final /* synthetic */ class C73654ex implements AbstractC73756j {

    /* renamed from: a */
    private final C73560cj f165484a;

    static {
        Covode.recordClassIndex(86392);
    }

    C73654ex(C73560cj cjVar) {
        this.f165484a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73756j
    /* renamed from: a */
    public final void mo79539a(int i) {
        C39252m a;
        C73560cj cjVar = this.f165484a;
        boolean z = cjVar.f165284a;
        String str = "public";
        if (i != 0) {
            if (i == 1) {
                str = "private";
            } else if (i == 2) {
                str = "friends";
            } else if (i == 3) {
                str = "exclude";
            }
        } else if (z) {
            str = "followers";
        }
        C39162r.m79460a("select_privacy_setting", new C84425b().mo129406a("creation_id", cjVar.f165268K.creationId).mo129406a("shoot_way", cjVar.f165268K.mShootWay).mo129406a("content_source", C71817eu.m126793d(cjVar.f165268K)).mo129406a("content_type", C71817eu.m126792c(cjVar.f165268K)).mo129406a("enter_from", "video_post_page").mo129406a("to_status", str).mo129403a("is_private", z ? 1 : 0).mo129406a("enter_method", "publishing").f188764a);
        cjVar.f165338m.setValue(new C62855a(i));
        if (C89064i.m154489a(new Integer[]{0, 2, 1}, Integer.valueOf(i))) {
            C40383b.f94573d = i;
            C40383b.f94571b.storeInt(C40383b.m81652a(C40383b.f94570a), i);
        }
        if (cjVar.f165332g != null) {
            cjVar.f165332g.mo114886a(i);
        }
        cjVar.f165269L = true;
        if (C68028bn.m120330a() != 0 && (a = C39223a.m79605s().mo68676a("video_visibility_select")) != null && a.f92732a == 1) {
            C63253l.f143623a.mo73305a().mo101761b(cjVar.requireActivity());
            C39223a.m79605s().mo68679b("video_visibility_select");
        }
    }
}
