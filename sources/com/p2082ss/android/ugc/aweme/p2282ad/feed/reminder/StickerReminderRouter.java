package com.p2082ss.android.ugc.aweme.p2282ad.feed.reminder;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.feed.model.AdNoticeModel;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.StickerReminderRouter */
public final class StickerReminderRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(40161);
    }

    /* renamed from: com_ss_android_ugc_aweme_ad_feed_reminder_StickerReminderRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m68330xc7173e7b(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.StickerReminderRouter$b */
    static final class C33327b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f79174a;

        static {
            Covode.recordClassIndex(40163);
        }

        C33327b(ActivityC0945e eVar) {
            this.f79174a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f79174a != null) {
                new C23144b(this.f79174a).mo37640e(R.string.dck).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.reminder.StickerReminderRouter$a */
    static final class C33326a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f79165a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f79166b;

        /* renamed from: c */
        final /* synthetic */ String f79167c;

        /* renamed from: d */
        final /* synthetic */ String f79168d;

        /* renamed from: e */
        final /* synthetic */ String f79169e;

        /* renamed from: f */
        final /* synthetic */ String f79170f;

        /* renamed from: g */
        final /* synthetic */ String f79171g;

        /* renamed from: h */
        final /* synthetic */ String f79172h;

        /* renamed from: i */
        final /* synthetic */ String f79173i;

        static {
            Covode.recordClassIndex(40162);
        }

        C33326a(Context context, ActivityC0945e eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f79165a = context;
            this.f79166b = eVar;
            this.f79167c = str;
            this.f79168d = str2;
            this.f79169e = str3;
            this.f79170f = str4;
            this.f79171g = str5;
            this.f79172h = str6;
            this.f79173i = str7;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AdNoticeModel adNoticeModel = (AdNoticeModel) obj;
            if (this.f79165a != null && this.f79166b != null) {
                ActivityC0945e eVar = this.f79166b;
                String str = this.f79167c;
                String str2 = this.f79168d;
                if (str2 == null) {
                    str2 = "0";
                }
                String str3 = this.f79169e;
                String str4 = this.f79170f;
                String str5 = this.f79171g;
                if (str5 == null) {
                    str5 = "";
                }
                new C23226a.C23227a().mo37816a(new C33328a(eVar, str, str2, str3, str4, str5, adNoticeModel.getSubscriptionStatus(), this.f79172h, this.f79173i)).mo37821b((int) C13628n.m24520b(this.f79165a, 380.0f)).mo37819a(true).f55057a.show(this.f79166b.getSupportFragmentManager(), "stickerReminderSheet");
            }
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        m68330xc7173e7b("message_shixingyi", "url = " + str + "   extra = " + bundle);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("account_name");
        String queryParameter2 = parse.getQueryParameter("reminder_time");
        if (queryParameter2 == null) {
            queryParameter2 = "0";
        }
        C89219l.m154716b(queryParameter2, "");
        String queryParameter3 = parse.getQueryParameter("cid");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        C89219l.m154716b(queryParameter3, "");
        String queryParameter4 = parse.getQueryParameter("learn_more_url");
        String queryParameter5 = parse.getQueryParameter("log_id");
        String queryParameter6 = parse.getQueryParameter("log_extra");
        if (queryParameter6 == null) {
            queryParameter6 = "";
        }
        C89219l.m154716b(queryParameter6, "");
        String queryParameter7 = parse.getQueryParameter("enter_from");
        if (queryParameter7 == null) {
            queryParameter7 = "";
        }
        C89219l.m154716b(queryParameter7, "");
        ActivityC0945e a = C33334b.m68335a(context);
        if (Long.parseLong(queryParameter2) > System.currentTimeMillis()) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            if (!createIUserServicebyMonsterPlugin.isLogin()) {
                return false;
            }
        }
        ((AdNoticeApi) C38582a.m78287a(AdNoticeApi.class, C38583c.f91178a)).getAdNotice(queryParameter3).mo143254a(new C33326a(context, a, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7), new C33327b(a));
        return true;
    }
}
