package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49666aa;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.bytedance.tiktok.homepage.e */
final /* synthetic */ class DialogInterface$OnClickListenerC22731e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C22724a f53697a;

    /* renamed from: b */
    private final MainActivity f53698b;

    static {
        Covode.recordClassIndex(26620);
    }

    DialogInterface$OnClickListenerC22731e(C22724a aVar, MainActivity mainActivity) {
        this.f53697a = aVar;
        this.f53698b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f53698b;
        if (mainActivity.isUnderMainTab()) {
            IExternalService a = AVExternalServiceImpl.m113114a();
            if (a != null) {
                a.publishService().cancelRestoreOnMain(mainActivity);
            }
            if (Hox.C15490a.m28529a(mainActivity).mo25213b("HOME")) {
                Bundle bundle = new Bundle();
                bundle.putString(C34792be.f82123b, C34792be.f82125d);
                Hox.C15490a.m28529a(mainActivity).mo25208a("HOME", bundle);
            }
        }
        AVExternalServiceImpl.m113114a().abnormalExitLogService().logRestoreDialogClick(false);
        dialogInterface.dismiss();
        AbstractC81915c.m141874a(new C49666aa());
    }
}
