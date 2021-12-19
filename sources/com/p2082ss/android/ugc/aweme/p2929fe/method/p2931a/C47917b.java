package com.p2082ss.android.ugc.aweme.p2929fe.method.p2931a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a.b */
final /* synthetic */ class C47917b implements C35444b.AbstractC35447b {

    /* renamed from: a */
    private final C47913a f110987a;

    /* renamed from: b */
    private final Activity f110988b;

    static {
        Covode.recordClassIndex(56614);
    }

    C47917b(C47913a aVar, Activity activity) {
        this.f110987a = aVar;
        this.f110988b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
    /* renamed from: a */
    public final void mo53515a(String[] strArr, int[] iArr) {
        C47913a aVar = this.f110987a;
        Activity activity = this.f110988b;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            new C79459a(activity).mo123050a(R.string.dne).mo123053a();
            aVar.f110971b.mo61886a(-1, "uploadFailed");
            return;
        }
        aVar.mo79940a(activity);
    }
}
