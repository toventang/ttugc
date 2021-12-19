package com.p2082ss.android.ugc.aweme.commercialize.utils.p2621a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.C37638d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.AbstractC37639a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38565b;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38573c;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38557c;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38559d;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.C38560e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2621a.p2622a.C38613a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38665a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33263f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2295d.C33243a;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a */
public final class C38606a {

    /* renamed from: a */
    public static final C38606a f91223a = new C38606a();

    private C38606a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$b */
    public static final class C38609b extends AbstractC38555a {

        /* renamed from: a */
        final /* synthetic */ C38214ac f91229a;

        /* renamed from: d */
        final /* synthetic */ Context f91230d;

        /* renamed from: e */
        final /* synthetic */ Aweme f91231e;

        /* renamed from: f */
        final /* synthetic */ boolean f91232f;

        static {
            Covode.recordClassIndex(46150);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
        /* renamed from: a */
        public final boolean mo65690a() {
            return TextUtils.equals(this.f91229a.type, "app");
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
        /* renamed from: b */
        public final boolean mo65691b() {
            return C38669b.m78462a(this.f91230d, this.f91229a.packageName);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            if (z) {
                C38189j.m77495a("open_url_app", this.f91230d, this.f91229a, this.f91231e, this.f91232f);
            }
        }

        C38609b(C38214ac acVar, Context context, Aweme aweme, boolean z) {
            this.f91229a = acVar;
            this.f91230d = context;
            this.f91231e = aweme;
            this.f91232f = z;
        }
    }

    static {
        Covode.recordClassIndex(46147);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$d */
    public static final class CallableC38611d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Aweme f91237a;

        static {
            Covode.recordClassIndex(46152);
        }

        CallableC38611d(Aweme aweme) {
            this.f91237a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                C37638d dVar = C37638d.f88998a;
                C89219l.m154716b(dVar, "");
                dVar.f88999b = this.f91237a.getAwemeRawAd();
                return null;
            } catch (Exception e) {
                C51423a.m95788a("", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static boolean m78339a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            Boolean enableAdRouter = iESSettingsProxy.getEnableAdRouter();
            C89219l.m154716b(enableAdRouter, "");
            return enableAdRouter.booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$e */
    public static final class C38612e implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        final /* synthetic */ Context f91238a;

        /* renamed from: b */
        final /* synthetic */ C38214ac f91239b;

        /* renamed from: c */
        final /* synthetic */ Aweme f91240c;

        /* renamed from: d */
        final /* synthetic */ boolean f91241d;

        static {
            Covode.recordClassIndex(46153);
        }

        C38612e(Context context, C38214ac acVar, Aweme aweme, boolean z) {
            this.f91238a = context;
            this.f91239b = acVar;
            this.f91240c = aweme;
            this.f91241d = z;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final void sendLog(boolean z) {
            if (z) {
                C38189j.m77495a("deeplink_success", this.f91238a, this.f91239b, this.f91240c, this.f91241d);
            } else {
                C38189j.m77495a("deeplink_failed", this.f91238a, this.f91239b, this.f91240c, this.f91241d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$a */
    public static final class C38607a extends C38560e {

        /* renamed from: a */
        final /* synthetic */ Context f91224a;

        /* renamed from: e */
        final /* synthetic */ C38214ac f91225e;

        /* renamed from: f */
        final /* synthetic */ Aweme f91226f;

        /* renamed from: g */
        final /* synthetic */ boolean f91227g;

        static {
            Covode.recordClassIndex(46148);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$a$a */
        static final class C38608a implements AbstractC38757n.AbstractC38758a {

            /* renamed from: a */
            final /* synthetic */ C38607a f91228a;

            static {
                Covode.recordClassIndex(46149);
            }

            C38608a(C38607a aVar) {
                this.f91228a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
            public final void sendLog(boolean z) {
                if (z) {
                    C38189j.m77495a("deeplink_success", this.f91228a.f91224a, this.f91228a.f91225e, this.f91228a.f91226f, this.f91228a.f91227g);
                } else {
                    C38189j.m77495a("deeplink_failed", this.f91228a.f91224a, this.f91228a.f91225e, this.f91228a.f91226f, this.f91228a.f91227g);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            if (z) {
                C38189j.m77495a("open_url_app", this.f91224a, this.f91225e, this.f91226f, this.f91227g);
                C38767w.m78630a(new C38608a(this));
            }
        }

        C38607a(Context context, C38214ac acVar, Aweme aweme, boolean z) {
            this.f91224a = context;
            this.f91225e = acVar;
            this.f91226f = aweme;
            this.f91227g = z;
        }
    }

    /* renamed from: a */
    private static boolean m78341a(String str) {
        try {
            if (Long.parseLong(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a$c */
    public static final class C38610c extends C38613a {

        /* renamed from: a */
        final /* synthetic */ Context f91233a;

        /* renamed from: d */
        final /* synthetic */ C38214ac f91234d;

        /* renamed from: e */
        final /* synthetic */ Aweme f91235e;

        /* renamed from: f */
        final /* synthetic */ boolean f91236f;

        static {
            Covode.recordClassIndex(46151);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            if (z) {
                C38189j.m77495a("open_url_h5", this.f91233a, this.f91234d, this.f91235e, this.f91236f);
            }
        }

        C38610c(Context context, C38214ac acVar, Aweme aweme, boolean z) {
            this.f91233a = context;
            this.f91234d = acVar;
            this.f91235e = aweme;
            this.f91236f = z;
        }
    }

    /* renamed from: a */
    public static final boolean m78340a(Context context, C38214ac acVar, Aweme aweme, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (context == null || acVar == null || aweme == null) {
            return false;
        }
        String str8 = acVar.creativeId;
        C89219l.m154716b(str8, "");
        String str9 = acVar.logExtra;
        if (!m78341a(str8)) {
            C33263f fVar = C33263f.f79009a;
            C89219l.m154716b(fVar, "");
            C33243a aVar = fVar.f79010b;
            if (aVar != null) {
                str8 = String.valueOf(aVar.f78980a);
                str9 = aVar.f78981b;
            }
        }
        String str10 = "mp_url";
        String str11 = null;
        if (m78339a()) {
            C38565b.C38566a f = new C38565b.C38566a().mo67100f(acVar.openUrl);
            String str12 = acVar.mpUrl;
            C38565b.C38570e eVar = f.f91099a.f91096d;
            if (str12 == null) {
                str12 = "";
            }
            C89219l.m154721d(str12, "");
            eVar.f91123a = str12;
            C59315a.C59316a aVar2 = new C59315a.C59316a();
            if (C59308d.m109008c(acVar.openUrl)) {
                str10 = "open_url";
            }
            aVar2.f135538d = str10;
            if (z) {
                str5 = "comment_page";
            } else {
                str5 = "in_video_tag";
            }
            aVar2.f135535a = str5;
            f.f91099a.f91096d.f91124b = aVar2.mo96936a();
            C38565b.C38566a h = f.mo67102g(acVar.webUrl).mo67104h(acVar.webTitle);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (str6 = awemeRawAd.getDownloadUrl()) == null) {
                str6 = acVar.downloadUrl;
            }
            C38565b.C38566a s = h.mo67117s(str6);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null || (str7 = awemeRawAd2.getPackageName()) == null) {
                str7 = acVar.packageName;
            }
            C38565b.C38566a t = s.mo67118t(str7);
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                str11 = awemeRawAd3.getAppName();
            }
            return new C38573c.C38574a().mo67165a(context).mo67167a(t.mo67120v(str11).mo67081a(aweme.getAwemeRawAd()).mo67091c(str8).mo67094d(str9).mo67082a(aweme.getAid()).mo67087b(aweme.getAuthorUid()).f91099a).mo67166a(new C38557c()).mo67166a(new C38607a(context, acVar, aweme, z)).mo67166a(new C38609b(acVar, context, aweme, z)).mo67166a(new C38559d()).mo67166a(new C38610c(context, acVar, aweme, z)).f91162a.mo67164a();
        }
        String str13 = acVar.openUrl;
        if (!TextUtils.isEmpty(acVar.openUrl) && C59308d.m109008c(str13)) {
            String a = C89219l.m154704a(str13, (Object) "&schema_from=ad_link");
            if (z) {
                str4 = "&position=comment_page";
            } else {
                str4 = "&position=in_video_tag";
            }
            str13 = C89219l.m154704a(a, (Object) str4);
        }
        if (C37699a.m76283b(str13)) {
            if (acVar.feedShowType == 3) {
                str3 = "comment_ad";
            } else {
                str3 = "draw_ad";
            }
            String builder = Uri.parse(AbstractC37639a.AbstractC37640a.f89002a).buildUpon().appendQueryParameter("tag", str3).toString();
            C89219l.m154716b(builder, "");
            if (C37699a.m76283b(str13)) {
                str13 = str13.replace("__back_url__", Uri.encode(builder));
            }
            C1731i.m5640b(new CallableC38611d(aweme), C1731i.f5562a);
        }
        if (C38767w.m78643a(context, str13, false)) {
            C38189j.m77495a("open_url_app", context, acVar, aweme, z);
            C38767w.m78630a(new C38612e(context, acVar, aweme, z));
            return true;
        }
        if (C59308d.m109008c(acVar.mpUrl)) {
            C59320c cVar = C59320c.C59324a.f135560a;
            C89219l.m154716b(cVar, "");
            IMiniAppService a2 = cVar.mo96989a();
            C89219l.m154716b(a2, "");
            String str14 = acVar.mpUrl;
            C59315a aVar3 = new C59315a();
            aVar3.f135533e = str10;
            if (a2.openMiniApp(context, str14, aVar3)) {
                return true;
            }
        }
        if (TextUtils.equals(acVar.type, "app")) {
            C38189j.m77495a("open_url_app", context, acVar, aweme, z);
            return C38669b.m78462a(context, acVar.packageName);
        }
        long j = 0;
        try {
            j = Long.parseLong(str8);
        } catch (Exception unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                str = awemeRawAd4.getDownloadUrl();
            } else {
                str = null;
            }
            AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
            if (awemeRawAd5 != null) {
                str2 = awemeRawAd5.getPackageName();
            } else {
                str2 = null;
            }
            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                str11 = awemeRawAd6.getAppName();
            }
        } else if (acVar.feedShowType == 3) {
            str = acVar.downloadUrl;
            str2 = acVar.packageName;
            linkedHashMap.put("aweme_package_name", acVar.packageName);
            linkedHashMap.put("bundle_app_ad_from", "6");
        } else {
            str = null;
            str2 = null;
            str11 = null;
        }
        if (!C38665a.m78455a(context, acVar.webUrl, acVar.webTitle, false, linkedHashMap, true, new C38665a.C38666a(Long.valueOf(j), str9, str, str2, str11, acVar.type, 192))) {
            return false;
        }
        C38189j.m77495a("open_url_h5", context, acVar, aweme, z);
        return true;
    }
}
