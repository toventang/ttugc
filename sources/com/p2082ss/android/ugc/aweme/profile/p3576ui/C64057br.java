package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.br */
public final /* synthetic */ class C64057br implements AbstractC89172b {

    /* renamed from: a */
    static final AbstractC89172b f145291a = new C64057br();

    static {
        Covode.recordClassIndex(75501);
    }

    private C64057br() {
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        String trim = obj.toString().trim();
        return Boolean.valueOf(TextUtils.isEmpty(trim) || trim.contains("@"));
    }
}
