package com.p2082ss.android.ugc.aweme.mediaplayer;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.e */
final /* synthetic */ class C59197e implements AbstractC1729g {

    /* renamed from: a */
    private final MediaPlayerModule f134725a;

    static {
        Covode.recordClassIndex(69557);
    }

    C59197e(MediaPlayerModule mediaPlayerModule) {
        this.f134725a = mediaPlayerModule;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z;
        MediaPlayerModule mediaPlayerModule = this.f134725a;
        int intValue = ((Integer) iVar.mo5545d()).intValue();
        C1213t<C59201i> tVar = mediaPlayerModule.f134720h;
        if (intValue >= 0) {
            z = true;
        } else {
            z = false;
        }
        tVar.setValue(new C59201i(1, z));
        return Integer.valueOf(intValue);
    }
}
