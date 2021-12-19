package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ToggleAutoCaptionApi */
public interface ToggleAutoCaptionApi {

    /* renamed from: a */
    public static final C39985a f93978a = C39985a.f93979a;

    static {
        Covode.recordClassIndex(47750);
    }

    @AbstractC89731o(mo144285a = "/tiktok/v1/caption/cla/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> toggleAutoCaptionSetting(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "enable_auto_caption") boolean z);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.video.ToggleAutoCaptionApi$a */
    public static final class C39985a {

        /* renamed from: a */
        static final /* synthetic */ C39985a f93979a = new C39985a();

        private C39985a() {
        }

        static {
            Covode.recordClassIndex(47751);
        }
    }
}
