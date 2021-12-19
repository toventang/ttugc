package com.p2082ss.android.ugc.aweme.deeplink.actions;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.deeplink.C41059q;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.OpenChatInviteAction */
public final class OpenChatInviteAction extends AbstractC41008b<C89391z> {
    static {
        Covode.recordClassIndex(48872);
    }

    /* renamed from: com_ss_android_ugc_aweme_deeplink_actions_OpenChatInviteAction_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m82625x652a0099(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        return new C89378p<>(C89219l.m154704a(parse.getHost(), (Object) parse.getPath()), hashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41006a
    public final boolean doRealOpen(Context context, String str, HashMap<String, Object> hashMap, ArrayList<Integer> arrayList) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        String queryParameter = getOriginalUri().getQueryParameter("invite_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() > 0) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() && (context instanceof Activity)) {
                if (!C41059q.C41060a.m82717a()) {
                    m82625x652a0099("UG-deeplink-refactor", "App is cold launch, open MAIN as default in openChatInviteAction");
                    SmartRouter.buildRoute(context, "//main").open();
                }
                IMService.createIIMServicebyMonsterPlugin(false).handleGroupInvite((Activity) context, queryParameter);
                return true;
            }
        }
        return false;
    }
}
