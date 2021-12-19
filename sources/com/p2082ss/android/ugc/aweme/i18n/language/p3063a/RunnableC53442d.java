package com.p2082ss.android.ugc.aweme.i18n.language.p3063a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.C81079v;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.d */
public final /* synthetic */ class RunnableC53442d implements Runnable {

    /* renamed from: a */
    private final DialogC53439a f122656a;

    static {
        Covode.recordClassIndex(63011);
    }

    RunnableC53442d(DialogC53439a aVar) {
        this.f122656a = aVar;
    }

    public final void run() {
        DialogC53439a aVar = this.f122656a;
        if (!aVar.isShowing()) {
            return;
        }
        if (C81079v.m140776O().mo123892o()) {
            C81079v.m140776O().mo123908B();
            aVar.f122652b = true;
            return;
        }
        aVar.mo90005b();
    }
}
