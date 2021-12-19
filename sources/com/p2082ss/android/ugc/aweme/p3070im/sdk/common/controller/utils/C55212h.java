package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.h */
public final class C55212h {

    /* renamed from: a */
    public static final C55212h f126285a = new C55212h();

    private C55212h() {
    }

    static {
        Covode.recordClassIndex(64959);
    }

    /* renamed from: a */
    public static final boolean m100953a(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.f155492i.getString("is_friend_private"), "true");
    }
}
