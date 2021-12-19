package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ah */
final /* synthetic */ class RunnableC71042ah implements Runnable {

    /* renamed from: a */
    private final C71056i.C710604 f159045a;

    /* renamed from: b */
    private final C71044aj f159046b;

    /* renamed from: c */
    private final String f159047c;

    static {
        Covode.recordClassIndex(83540);
    }

    RunnableC71042ah(C71056i.C710604 r1, C71044aj ajVar, String str) {
        this.f159045a = r1;
        this.f159046b = ajVar;
        this.f159047c = str;
    }

    public final void run() {
        C71056i.C710604 r3 = this.f159045a;
        C71044aj ajVar = this.f159046b;
        String str = this.f159047c;
        C71056i.this.f159108O.mo112116b();
        if (ajVar != null && !TextUtils.isEmpty(str)) {
            ajVar.f159054c.setPin(true);
        }
        C71056i.this.f159122d.f158998g.mo112232b(ajVar);
    }
}
