package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.cw */
public final /* synthetic */ class C50192cw implements AbstractC1214u {

    /* renamed from: a */
    private final C50188cv f115900a;

    static {
        Covode.recordClassIndex(59318);
    }

    C50192cw(C50188cv cvVar) {
        this.f115900a = cvVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C50188cv cvVar = this.f115900a;
        C89378p pVar = (C89378p) obj;
        if (cvVar.f113953L != null && TextUtils.equals((CharSequence) pVar.getFirst(), cvVar.f113953L.getAid()) && cvVar.f115874f != ((Long) pVar.getSecond()).longValue()) {
            cvVar.f115874f = ((Long) pVar.getSecond()).longValue();
            cvVar.f115870b.setText(C50188cv.m94186a(cvVar.f115874f, cvVar.f113953L));
        }
    }
}
