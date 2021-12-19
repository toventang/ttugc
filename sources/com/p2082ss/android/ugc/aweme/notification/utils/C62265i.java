package com.p2082ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.i */
public final class C62265i {

    /* renamed from: a */
    public static final C62265i f141320a = new C62265i();

    private C62265i() {
    }

    static {
        Covode.recordClassIndex(73039);
    }

    /* renamed from: a */
    public static String m112641a(Context context, User user) {
        String entranceButtonText;
        if (user == null) {
            return null;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return "following";
            }
            if (followStatus != 2) {
                return null;
            }
            if (IMUnder16ProxyImpl.m102047n().mo93022d() || context == null) {
                return "friend";
            }
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin == null || (entranceButtonText = createIIMServicebyMonsterPlugin.getEntranceButtonText(context, user.getUid())) == null || C89219l.m154714a((Object) entranceButtonText, (Object) context.getResources().getString(R.string.d2m))) {
                return "message";
            }
            return "sayhi";
        } else if (user.getFollowerStatus() == 1) {
            return "follow_back";
        } else {
            return "follow";
        }
    }
}
