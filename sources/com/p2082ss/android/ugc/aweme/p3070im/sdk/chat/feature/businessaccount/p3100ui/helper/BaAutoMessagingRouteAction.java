package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.commerce.C37491d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.activity.BaMessageSettingActivity;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessagingRouteAction */
public final class BaAutoMessagingRouteAction implements IRouteAction {
    static {
        Covode.recordClassIndex(63650);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_feature_businessaccount_ui_helper_BaAutoMessagingRouteAction_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m99197xfdacdc76(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Boolean open(Context context, String str, Bundle bundle) {
        User curUser;
        C37491d bizAccountInfo;
        if (context == null) {
            return null;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        if (e == null || (curUser = e.getCurUser()) == null || (bizAccountInfo = curUser.getBizAccountInfo()) == null || !bizAccountInfo.enableAutoMsg()) {
            return false;
        }
        Intent intent = new Intent(context, BaMessageSettingActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        m99197xfdacdc76(context, intent);
        return true;
    }
}
