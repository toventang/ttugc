package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.AbstractC27060b;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31309e;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.d */
public final /* synthetic */ class C31324d implements AbstractC27060b {

    /* renamed from: a */
    private final Locale f75047a;

    static {
        Covode.recordClassIndex(38024);
    }

    C31324d(Locale locale) {
        this.f75047a = locale;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27060b
    /* renamed from: a */
    public final void mo35009a(Object obj) {
        C31309e.f75024b.put(this.f75047a.getLanguage(), Integer.valueOf(((Integer) obj).intValue()));
    }
}
