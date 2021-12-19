package com.bytedance.tiktok.homepage.mainactivity;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.tiktok.homepage.mainactivity.q */
public final /* synthetic */ class C22762q implements AbstractC89172b {

    /* renamed from: a */
    private final C22759o f53758a;

    static {
        Covode.recordClassIndex(26655);
    }

    public C22762q(C22759o oVar) {
        this.f53758a = oVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C22759o oVar = this.f53758a;
        Boolean bool = (Boolean) obj;
        if (AVExternalServiceImpl.m113114a().configService().shortVideoConfig().isRecording()) {
            C22759o.m42924a();
            return null;
        } else if (bool.booleanValue()) {
            oVar.f53752c = true;
            oVar.f53751b.mo37042a((MainActivity) oVar.f53750a);
            return null;
        } else {
            C22759o.m42924a();
            oVar.mo37077b(oVar.f53750a.getIntent(), oVar.f53750a.getIntent().getBooleanExtra("enter_record_from_other_platform", false));
            return null;
        }
    }
}
