package com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a.C72572a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.EnumC73918s;
import com.p2082ss.android.ugc.aweme.utils.C80322d;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a.i */
public final /* synthetic */ class C72587i implements AbstractC73910l.AbstractC73911a {

    /* renamed from: a */
    private final C72572a.C725764 f162739a;

    static {
        Covode.recordClassIndex(85270);
    }

    C72587i(C72572a.C725764 r1) {
        this.f162739a = r1;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.upload.AbstractC73910l.AbstractC73911a
    /* renamed from: a */
    public final void mo114893a(EnumC73918s sVar) {
        C72572a.C725764 r3 = this.f162739a;
        if (sVar == EnumC73918s.CANCEL) {
            C80322d.m139251a("user_cancel_publish", new C33744d().mo59983a("publish_id", C72572a.this.f161078d).mo59980a("video_type", 0).mo59980a("video_upload_type", 1).mo59983a("cancel_step", "call_uploader").f79943a);
            C72572a.this.f162687j.mo104667b();
        }
    }
}
