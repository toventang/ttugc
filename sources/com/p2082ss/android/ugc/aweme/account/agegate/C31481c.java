package com.p2082ss.android.ugc.aweme.account.agegate;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.c */
public final /* synthetic */ class C31481c implements OnActivityResultCallback {

    /* renamed from: a */
    private final C31412b f75337a;

    static {
        Covode.recordClassIndex(38198);
    }

    public C31481c(C31412b bVar) {
        this.f75337a = bVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        C31412b bVar = this.f75337a;
        if (i == 998 && bVar.f75221a != null) {
            if (i2 == -1) {
                bVar.f75221a.mo57404d();
            } else if (i2 == 0) {
                bVar.f75221a.mo57403c();
            } else {
                C31412b.AbstractC31413a aVar = bVar.f75221a;
                new Exception();
                aVar.mo57402b();
            }
        }
    }
}
