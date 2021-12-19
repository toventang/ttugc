package com.bytedance.android.livesdk.feed.p523a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.a.j */
final /* synthetic */ class C8486j implements AbstractC88433f {

    /* renamed from: a */
    private final C8476d f20993a;

    static {
        Covode.recordClassIndex(9339);
    }

    C8486j(C8476d dVar) {
        this.f20993a = dVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C8476d dVar = this.f20993a;
        dVar.f20972k = false;
        if (dVar.f20964c != null) {
            String d = C7411d.m15284a().mo13613d();
            String str = "";
            String str2 = !TextUtils.isEmpty(d) ? d + "_" : str;
            if (C13627m.m24499a("homepage_hot", C7411d.m15284a().mo13614e())) {
                str = "foru_";
            }
            String str3 = str2 + str + "feed_loadmore";
            if (C13627m.m24499a("referral_task", C7411d.m15284a().mo13614e())) {
                str3 = "referrals_loadmore";
            }
            if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                str3 = "drawer_loadmore";
            }
            BaseFeedDataViewModel baseFeedDataViewModel = dVar.f20964c;
            if (baseFeedDataViewModel.f21481a != null) {
                baseFeedDataViewModel.f21481a.mo14938a(null, str3);
            }
        }
    }
}
