package com.bytedance.tiktok.homepage.mainfragment;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.c */
public final /* synthetic */ class RunnableC22766c implements Runnable {

    /* renamed from: a */
    private final C22764a f53771a;

    /* renamed from: b */
    private final Activity f53772b;

    static {
        Covode.recordClassIndex(26659);
    }

    public RunnableC22766c(C22764a aVar, Activity activity) {
        this.f53771a = aVar;
        this.f53772b = activity;
    }

    public final void run() {
        C22764a aVar = this.f53771a;
        Activity activity = this.f53772b;
        if (aVar.f53764a.af_()) {
            if (!AVExternalServiceImpl.m113114a().publishService().isPublishServiceRunning(C17867d.m33078a()) && (activity instanceof MainActivity) && !C39223a.m79589c().mo68606a(1)) {
                aVar.mo37078a(null, false, "AvApiFragmentObserver onAttach", null);
            }
        }
    }
}
