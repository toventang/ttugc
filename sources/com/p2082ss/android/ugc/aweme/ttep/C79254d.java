package com.p2082ss.android.ugc.aweme.ttep;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ttep.d */
public final /* synthetic */ class C79254d implements AbstractC22231l {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178074a;

    static {
        Covode.recordClassIndex(92441);
    }

    C79254d(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178074a = tTEPEffectPreviewActivity;
    }

    @Override // com.bytedance.scene.AbstractC22231l
    public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178074a;
        if (TextUtils.equals(C69926ch.class.getName(), str)) {
            return tTEPEffectPreviewActivity.f177942s;
        }
        return null;
    }
}
