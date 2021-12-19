package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34505b;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51435a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80618c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.bf */
public final /* synthetic */ class C80242bf implements C35444b.AbstractC35447b {

    /* renamed from: a */
    private final AbstractC51735f f179724a;

    /* renamed from: b */
    private final Activity f179725b;

    static {
        Covode.recordClassIndex(93510);
    }

    C80242bf(AbstractC51735f fVar, Activity activity) {
        this.f179724a = fVar;
        this.f179725b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
    /* renamed from: a */
    public final void mo53515a(String[] strArr, int[] iArr) {
        AbstractC51735f fVar = this.f179724a;
        Activity activity = this.f179725b;
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                if (fVar != null) {
                    fVar.mo79931a();
                }
                C80618c.m139773c();
                return;
            }
            if (fVar != null) {
                fVar.mo79932b();
            }
            ((AbstractC51435a) C34505b.m70490a(activity, AbstractC51435a.class)).mo60945a(true);
        }
    }
}
