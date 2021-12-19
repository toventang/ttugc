package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2958o.C49766a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.api.C63434h;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63762ab;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63804z;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.m */
public final class C64642m implements AbstractC12644a<AbstractC64647q> {

    /* renamed from: a */
    public final AbstractC64647q f146356a = new C64643a();

    static {
        Covode.recordClassIndex(76108);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.m$a */
    public static final class C64643a implements AbstractC64647q {
        static {
            Covode.recordClassIndex(76109);
        }

        C64643a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64647q
        /* renamed from: a */
        public final Object mo104157a(Aweme aweme, String str, String str2, String str3, int i, boolean z) {
            String a;
            AwemeRawAd awemeRawAd;
            String str4;
            String str5;
            String str6 = null;
            if (C49766a.f114511a) {
                StringBuilder sb = new StringBuilder("ProfileApi queryUserResponse aid: ");
                if (aweme != null) {
                    str4 = aweme.getAid();
                } else {
                    str4 = null;
                }
                StringBuilder append = sb.append(str4).append(", aweme_secUid: ");
                if (aweme != null) {
                    str5 = aweme.getSecAuthorUid();
                } else {
                    str5 = null;
                }
                C51423a.m95791b(4, "feed2profile", append.append(str5).append(", request_secUid: ").append(str).toString());
            }
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Integer secIdSwitch = iESSettingsProxy.getSecIdSwitch();
            if (secIdSwitch != null && secIdSwitch.intValue() == 0) {
                a = C63429c.m115019a(str, str2, str3, i, Boolean.valueOf(z));
            } else if (!TextUtils.isEmpty(str)) {
                a = C63429c.m115018a(str, null, i, Boolean.valueOf(z));
            } else {
                a = C63429c.m115019a(null, str2, str3, i, Boolean.valueOf(z));
            }
            Uri.Builder buildUpon = Uri.parse(a).buildUpon();
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getNotificationConfig() != 1)) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str6 = awemeRawAd2.getCreativeIdStr();
                }
                buildUpon.appendQueryParameter("creative_id", str6);
                buildUpon.appendQueryParameter("need_nofify_settings", "true");
            }
            C63434h.m115029a(a);
            C63762ab abVar = C63804z.f144626a;
            if (abVar != null) {
                abVar.mo102324a();
            }
            C29935e eVar = new C29935e();
            eVar.mo52260a(new C29931a("check_preload", "true"));
            return C63873h.f144797a.apiExecuteGetJSONObject(0, a, UserResponse.class, "", eVar, true, null);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC64647q mo20458a() {
        return this.f146356a;
    }
}
