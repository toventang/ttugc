package com.p2082ss.android.ugc.aweme.ftc;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.y */
public final /* synthetic */ class C52815y implements AbstractC22231l {

    /* renamed from: a */
    private final FTCVideoRecordNewActivity f121520a;

    static {
        Covode.recordClassIndex(62215);
    }

    C52815y(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f121520a = fTCVideoRecordNewActivity;
    }

    @Override // com.bytedance.scene.AbstractC22231l
    public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f121520a;
        if (TextUtils.equals(C51913c.class.getName(), str)) {
            return fTCVideoRecordNewActivity.f119428t;
        }
        return null;
    }
}
