package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.login.DialogC58952a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.setting.ui.bn */
public final /* synthetic */ class RunnableC68562bn implements Runnable {

    /* renamed from: a */
    private final AbstractActivityC68607v f153414a;

    static {
        Covode.recordClassIndex(80815);
    }

    RunnableC68562bn(AbstractActivityC68607v vVar) {
        this.f153414a = vVar;
    }

    public final void run() {
        AbstractActivityC68607v vVar = this.f153414a;
        if (vVar.f153515ak == null) {
            vVar.f153515ak = new DialogC58952a(vVar);
        }
        vVar.f153515ak.show();
    }
}
