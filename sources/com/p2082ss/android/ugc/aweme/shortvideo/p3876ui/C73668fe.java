package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fe */
public final /* synthetic */ class C73668fe implements AbstractC22231l {

    /* renamed from: a */
    private final VideoRecordNewActivity f165502a;

    static {
        Covode.recordClassIndex(86406);
    }

    C73668fe(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165502a = videoRecordNewActivity;
    }

    @Override // com.bytedance.scene.AbstractC22231l
    public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        VideoRecordNewActivity videoRecordNewActivity = this.f165502a;
        if (TextUtils.equals(C69926ch.class.getName(), str)) {
            return videoRecordNewActivity.f164826u;
        }
        return null;
    }
}
