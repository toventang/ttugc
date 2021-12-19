package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ao */
final /* synthetic */ class C70815ao implements AbstractC22231l {

    /* renamed from: a */
    private final VEVideoPublishEditActivity f158566a;

    /* renamed from: b */
    private final Class f158567b;

    static {
        Covode.recordClassIndex(83300);
    }

    C70815ao(VEVideoPublishEditActivity vEVideoPublishEditActivity, Class cls) {
        this.f158566a = vEVideoPublishEditActivity;
        this.f158567b = cls;
    }

    @Override // com.bytedance.scene.AbstractC22231l
    public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f158566a;
        if (TextUtils.equals(this.f158567b.getName(), str)) {
            return vEVideoPublishEditActivity.f158495u;
        }
        return null;
    }
}
