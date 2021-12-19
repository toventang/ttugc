package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53872b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53874d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53875e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.data.p3099a.C53876f;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.api.AutoMsgSettingApiManager */
public final class AutoMsgSettingApiManager {

    /* renamed from: a */
    public static final AutoMsgSettingApi f123540a;

    /* renamed from: b */
    public static final AutoMsgSettingApiManager f123541b = new AutoMsgSettingApiManager();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.api.AutoMsgSettingApiManager$AutoMsgSettingApi */
    public interface AutoMsgSettingApi {

        /* renamed from: a */
        public static final C53878a f123542a = C53878a.f123544b;

        static {
            Covode.recordClassIndex(63540);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/ba/auto_reply/get/review_status/")
        AbstractFutureC27655q<C53872b> getAutoReply();

        @AbstractC89722f(mo144276a = "/tiktok/v1/ba/get/message_switch/")
        AbstractFutureC27655q<C53875e> getMsgSwitches();

        @AbstractC89722f(mo144276a = "/tiktok/v1/ba/wel_message/get/review_status/")
        AbstractFutureC27655q<C53876f> getWelMsgReviewStatus();

        @AbstractC89731o(mo144285a = "/tiktok/v1/ba/open/dm_dialog/report/")
        AbstractFutureC27655q<BaseResponse> reportOpenDmDialog(@AbstractC89736t(mo144292a = "ba_uid") String str);

        @AbstractC89731o(mo144285a = "/tiktok/v1/ba/set/auto_reply/")
        @AbstractC89721e
        AbstractFutureC27655q<BaseResponse> setAutoReply(@AbstractC89719c(mo144273a = "operation_type") int i, @AbstractC89719c(mo144273a = "auto_reply_struct") String str);

        @AbstractC89731o(mo144285a = "/tiktok/v1/ba/set/message_switch/")
        AbstractFutureC27655q<BaseResponse> setMsgSwitch(@AbstractC89736t(mo144292a = "message_type") int i, @AbstractC89736t(mo144292a = "message_switch") int i2);

        @AbstractC89731o(mo144285a = "/tiktok/v1/ba/set/wel_message/")
        AbstractFutureC27655q<BaseResponse> setWelMsg(@AbstractC89736t(mo144292a = "operation_type") int i, @AbstractC89736t(mo144292a = "content") String str, @AbstractC89736t(mo144292a = "message_id") Long l);

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.data.api.AutoMsgSettingApiManager$AutoMsgSettingApi$a */
        public static final class C53878a {

            /* renamed from: a */
            static final String f123543a = ("https://" + C17867d.f42587k.f42569a);

            /* renamed from: b */
            static final /* synthetic */ C53878a f123544b = new C53878a();

            private C53878a() {
            }

            static {
                Covode.recordClassIndex(63541);
            }
        }
    }

    private AutoMsgSettingApiManager() {
    }

    static {
        Covode.recordClassIndex(63539);
        Object a = RetrofitFactory.m33635a().mo28816a(AutoMsgSettingApi.C53878a.f123543a).mo28858a(AutoMsgSettingApi.class);
        C89219l.m154716b(a, "");
        f123540a = (AutoMsgSettingApi) a;
    }

    /* renamed from: a */
    public static AbstractFutureC27655q<BaseResponse> m99138a(int i, C53874d dVar) {
        C89219l.m154721d(dVar, "");
        AutoMsgSettingApi autoMsgSettingApi = f123540a;
        String b = C58589b.m107696a().mo46674b(dVar);
        C89219l.m154716b(b, "");
        return autoMsgSettingApi.setAutoReply(i, b);
    }

    /* renamed from: a */
    public static AbstractFutureC27655q<BaseResponse> m99139a(int i, String str, Long l) {
        C89219l.m154721d(str, "");
        return f123540a.setWelMsg(i, str, l);
    }
}
