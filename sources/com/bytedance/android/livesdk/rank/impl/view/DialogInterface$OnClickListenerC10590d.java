package com.bytedance.android.livesdk.rank.impl.view;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.rank.impl.view.d */
final /* synthetic */ class DialogInterface$OnClickListenerC10590d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SelfRankInfoView f25567a;

    static {
        Covode.recordClassIndex(12178);
    }

    DialogInterface$OnClickListenerC10590d(SelfRankInfoView selfRankInfoView) {
        this.f25567a = selfRankInfoView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IGiftService iGiftService;
        SelfRankInfoView selfRankInfoView = this.f25567a;
        dialogInterface.dismiss();
        if (TextUtils.isEmpty(LiveSdkAppealWebviewSetting.INSTANCE.getValue()) && (iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class)) != null) {
            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(selfRankInfoView.f25509n.getContext(), iGiftService.getLowAgeReportUrl());
        }
        if (C11115u.m19743a().mo17915b() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
            C6501b.C6502a.m13948a("livesdk_anchor_click_contact_us").mo12643a(selfRankInfoView.f25508m).mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
