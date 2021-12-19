package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.p2297a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.drawee.p1851c.C24202c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38177d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.track.AbstractC38530e;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38525a;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38526b;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33260b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.C33262d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.C33278a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a */
public final class View$OnClickListenerC33254a implements View.OnClickListener, AbstractC33260b {

    /* renamed from: a */
    public Aweme f78998a;

    /* renamed from: b */
    private final RemoteImageView f78999b;

    /* renamed from: c */
    private String f79000c = "";

    /* renamed from: d */
    private final AbstractC89244h f79001d = C89250i.m154773a((AbstractC89171a) C33255a.f79002a);

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$b */
    static final class C33256b implements AbstractC38029b {

        /* renamed from: a */
        public static final C33256b f79003a = new C33256b();

        static {
            Covode.recordClassIndex(40082);
        }

        C33256b() {
        }
    }

    static {
        Covode.recordClassIndex(40080);
    }

    /* renamed from: a */
    private final AbstractC33253a m68187a() {
        return (AbstractC33253a) this.f79001d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$a */
    static final class C33255a extends AbstractC89220m implements AbstractC89171a<AbstractC33253a> {

        /* renamed from: a */
        public static final C33255a f79002a = new C33255a();

        static {
            Covode.recordClassIndex(40081);
        }

        C33255a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33253a invoke() {
            return CommercializeAdServiceImpl.m79243a().mo67720a(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$c */
    public static final class C33257c implements AbstractC38530e {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC33254a f79004a;

        static {
            Covode.recordClassIndex(40083);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33257c(View$OnClickListenerC33254a aVar) {
            this.f79004a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.track.AbstractC38530e
        /* renamed from: a */
        public final void mo59217a(String str, String str2, long j) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C38151a.C38153b a = C38151a.m77333a(str, str2, j);
            a.f90123b = "track_url";
            a.f90122a = "track_ad";
            a.mo66453b("click").mo66451b(View$OnClickListenerC33254a.m68188a(this.f79004a).getAwemeRawAd()).mo66455c();
            C18129a.C18130a b = C18129a.m33746a("track_ad", "track_url", View$OnClickListenerC33254a.m68188a(this.f79004a).getAwemeRawAd()).mo28900b("track_label", "click").mo28900b("ad_event_priority", "10").mo28900b("ad_event_type", "monitor").mo28900b("track_url_list", str).mo28900b("track_status", str2).mo28900b("ts", Long.valueOf(j)).mo28900b("ad_event_priority", "10");
            String e = C38525a.f91037a.mo65638e();
            if (!TextUtils.isEmpty(e)) {
                b.mo28900b("user_agent", e);
            }
            b.mo28902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$e */
    public static final class C33259e implements AbstractC38530e {

        /* renamed from: a */
        final /* synthetic */ Aweme f79007a;

        static {
            Covode.recordClassIndex(40085);
        }

        C33259e(Aweme aweme) {
            this.f79007a = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.track.AbstractC38530e
        /* renamed from: a */
        public final void mo59217a(String str, String str2, long j) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C38151a.C38153b a = C38151a.m77333a(str, str2, j);
            a.f90123b = "track_url";
            a.f90122a = "track_ad";
            a.mo66453b("show").mo66451b(this.f79007a.getAwemeRawAd()).mo66455c();
            C18129a.C18130a b = C18129a.m33746a("track_ad", "track_url", this.f79007a.getAwemeRawAd()).mo28900b("track_label", "show").mo28900b("ad_event_priority", "10").mo28900b("ad_event_type", "monitor").mo28900b("track_url_list", str).mo28900b("track_status", str2).mo28900b("ts", Long.valueOf(j)).mo28900b("ad_event_priority", "10");
            String e = C38525a.f91037a.mo65638e();
            if (!TextUtils.isEmpty(e)) {
                b.mo28900b("user_agent", e);
            }
            b.mo28902c();
        }
    }

    public View$OnClickListenerC33254a(C33262d dVar) {
        C89219l.m154721d(dVar, "");
        this.f78999b = dVar.f79008a;
    }

    /* renamed from: a */
    public static final /* synthetic */ Aweme m68188a(View$OnClickListenerC33254a aVar) {
        Aweme aweme = aVar.f78998a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        return aweme;
    }

    public final void onClick(View view) {
        AbstractC33253a a;
        IAppLogDepend iAppLogDepend;
        String str;
        String uid;
        Context context;
        ClickAgent.onClick(view);
        Aweme aweme = this.f78998a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        User author = aweme.getAuthor();
        Aweme aweme2 = this.f78998a;
        if (aweme2 == null) {
            C89219l.m154710a("aweme");
        }
        String str2 = "";
        if (C33278a.m68225a(aweme2)) {
            AbstractC33253a a2 = m68187a();
            if (a2 != null) {
                Context context2 = this.f78999b.getContext();
                C89219l.m154716b(context2, str2);
                Aweme aweme3 = this.f78998a;
                if (aweme3 == null) {
                    C89219l.m154710a("aweme");
                }
                a2.mo59213a(context2, aweme3, C33256b.f79003a);
                return;
            }
            return;
        }
        Aweme aweme4 = this.f78998a;
        if (aweme4 == null) {
            C89219l.m154710a("aweme");
        }
        Context context3 = null;
        List<String> list = null;
        if (C33278a.m68226b(aweme4)) {
            AbstractC33253a a3 = m68187a();
            if (a3 != null) {
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                Aweme aweme5 = this.f78998a;
                if (aweme5 == null) {
                    C89219l.m154710a("aweme");
                }
                a3.mo59210a(context, aweme5);
            }
            IAppLogDepend iAppLogDepend2 = C16091a.f38741a;
            if (iAppLogDepend2 != null) {
                C33744d a4 = new C33744d().mo59983a("enter_from", this.f79000c);
                Aweme aweme6 = this.f78998a;
                if (aweme6 == null) {
                    C89219l.m154710a("aweme");
                }
                C33744d a5 = a4.mo59983a("group_id", aweme6.getAid());
                if (!(author == null || (uid = author.getUid()) == null)) {
                    str2 = uid;
                }
                iAppLogDepend2.onEventV3Map("click_brand_sticker", a5.mo59983a("author_id", str2).f79943a);
            }
            C33257c cVar = new C33257c(this);
            Aweme aweme7 = this.f78998a;
            if (aweme7 == null) {
                C89219l.m154710a("aweme");
            }
            UrlModel clickTrackUrlList = aweme7.getActivityPendant().getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                list = clickTrackUrlList.getUrlList();
            }
            C38526b.m78143a(cVar, list);
            return;
        }
        Aweme aweme8 = this.f78998a;
        if (aweme8 == null) {
            C89219l.m154710a("aweme");
        }
        if (C33278a.m68227c(aweme8) && (a = m68187a()) != null) {
            if (view != null) {
                context3 = view.getContext();
            }
            Aweme aweme9 = this.f78998a;
            if (aweme9 == null) {
                C89219l.m154710a("aweme");
            }
            if (a.mo59214b(context3, aweme9) && (iAppLogDepend = C16091a.f38741a) != null) {
                C33744d a6 = new C33744d().mo59983a("enter_from", this.f79000c);
                Aweme aweme10 = this.f78998a;
                if (aweme10 == null) {
                    C89219l.m154710a("aweme");
                }
                C33744d a7 = a6.mo59983a("group_id", aweme10.getAid());
                if (author == null || (str = author.getUid()) == null) {
                    str = str2;
                }
                C33744d a8 = a7.mo59983a("author_id", str);
                Aweme aweme11 = this.f78998a;
                if (aweme11 == null) {
                    C89219l.m154710a("aweme");
                }
                SpecialSticker specialSticker = aweme11.getSpecialSticker();
                C89219l.m154716b(specialSticker, str2);
                iAppLogDepend.onEventV3Map("click_brand_sticker", a8.mo59983a("sticker_id", specialSticker.getStickerId()).f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$d */
    public static final class C33258d extends C24202c<Object> {

        /* renamed from: a */
        final /* synthetic */ boolean f79005a;

        /* renamed from: b */
        final /* synthetic */ Aweme f79006b;

        static {
            Covode.recordClassIndex(40084);
        }

        C33258d(boolean z, Aweme aweme) {
            this.f79005a = z;
            this.f79006b = aweme;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            if (!this.f79005a) {
                C38177d.m77408c(this.f79006b, 1);
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onSubmit(String str, Object obj) {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            if (!this.f79005a && (aweme = this.f79006b) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                C38177d.f90185a.mo66479a((C38177d) "redpacket", "preload_start", (String) awemeRawAd.getCreativeId(), (Long) awemeRawAd.getLogExtra(), aweme.getAid(), (String) -1);
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (!this.f79005a) {
                C38177d.m77408c(this.f79006b, 0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33260b
    /* renamed from: a */
    public final void mo59215a(boolean z, Aweme aweme, String str) {
        IAppLogDepend iAppLogDepend;
        String str2;
        String uid;
        String str3 = "";
        C89219l.m154721d(aweme, str3);
        C89219l.m154721d(str, str3);
        this.f78998a = aweme;
        this.f79000c = str;
        this.f78999b.setOnClickListener(this);
        List<String> list = null;
        UrlModel urlModel = null;
        if (C33278a.m68225a(aweme)) {
            this.f78999b.setVisibility(0);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                urlModel = awemeRawAd.getRedImageUrl();
            }
            C38002b.m77061a(this.f78999b, urlModel, new C33258d(z, aweme));
            if (z) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    C38177d.f90185a.mo66479a("redpacket", "show_result", awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), aweme.getAid(), 0);
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                C38187i.C38188a aVar = new C38187i.C38188a();
                aVar.f90222a = awemeRawAd3;
                aVar.f90223b = "redpacket";
                JSONObject a = aVar.mo66507a();
                if (awemeRawAd3 != null) {
                    C38585e.m78291a("draw_ad", "othershow", a, awemeRawAd3);
                }
                C18129a.m33746a("draw_ad", "othershow", awemeRawAd).mo28900b("refer", "redpacket").mo28902c();
            }
        } else if (C33278a.m68226b(aweme)) {
            this.f78999b.setVisibility(0);
            C38002b.m77060a(this.f78999b, aweme.getActivityPendant().getImage());
            User author = aweme.getAuthor();
            if (z) {
                IAppLogDepend iAppLogDepend2 = C16091a.f38741a;
                if (iAppLogDepend2 != null) {
                    C33744d a2 = new C33744d().mo59983a("enter_from", str).mo59983a("group_id", aweme.getAid());
                    if (!(author == null || (uid = author.getUid()) == null)) {
                        str3 = uid;
                    }
                    iAppLogDepend2.onEventV3Map("show_brand_sticker", a2.mo59983a("author_id", str3).f79943a);
                }
                C33259e eVar = new C33259e(aweme);
                UrlModel trackUrlList = aweme.getActivityPendant().getTrackUrlList();
                if (trackUrlList != null) {
                    list = trackUrlList.getUrlList();
                }
                C38526b.m78143a(eVar, list);
            }
        } else if (C33278a.m68227c(aweme)) {
            this.f78999b.setVisibility(0);
            SpecialSticker specialSticker = aweme.getSpecialSticker();
            if (specialSticker != null) {
                C38002b.m77060a(this.f78999b, specialSticker.getIconUrl());
            }
            User author2 = aweme.getAuthor();
            if (z && (iAppLogDepend = C16091a.f38741a) != null) {
                C33744d a3 = new C33744d().mo59983a("enter_from", str).mo59983a("group_id", aweme.getAid());
                if (author2 == null || (str2 = author2.getUid()) == null) {
                    str2 = str3;
                }
                C33744d a4 = a3.mo59983a("author_id", str2);
                SpecialSticker specialSticker2 = aweme.getSpecialSticker();
                C89219l.m154716b(specialSticker2, str3);
                iAppLogDepend.onEventV3Map("show_brand_sticker", a4.mo59983a("sticker_id", specialSticker2.getStickerId()).f79943a);
            }
        } else {
            this.f78999b.setVisibility(8);
        }
    }
}
