package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter */
public final class PrivacySettingDialogRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(47749);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        String str4;
        Aweme aweme = C50540h.f116809a;
        if (C50540h.f116809a == aweme) {
            C50540h.f116809a = null;
        }
        if (aweme == null) {
            return null;
        }
        if (bundle != null) {
            str2 = bundle.getString("tab_name");
            str3 = bundle.getString("enter_from");
            str4 = bundle.getString("impr_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        C39986a aVar = new C39986a();
        aVar.f93984c = aweme;
        aVar.f93995n = str2;
        aVar.f93996o = str3;
        aVar.f93997p = str4;
        C23226a.C23227a aVar2 = new C23226a.C23227a();
        C89219l.m154716b(aVar, "");
        aVar2.mo37817a(aVar);
        aVar2.mo37812a(1);
        aVar2.mo37821b(C34728n.m70946a(386.0d));
        if (!(context instanceof ActivityC0945e)) {
            return null;
        }
        C23226a aVar3 = aVar2.f55057a;
        aVar3.show(((ActivityC0945e) context).getSupportFragmentManager(), "PrivacySettingDialog");
        return aVar3;
    }
}
