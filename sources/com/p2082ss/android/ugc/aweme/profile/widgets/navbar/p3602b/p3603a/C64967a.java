package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.C12290b;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityIcon;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.C63504c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a */
public final class C64967a extends AbstractC64959h<EnumC65077d> {

    /* renamed from: i */
    public static final C64968a f146805i = new C64968a((byte) 0);

    /* renamed from: h */
    public List<? extends UgProfileActivityButton> f146806h;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$a */
    public static final class C64968a {
        static {
            Covode.recordClassIndex(76436);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$a$a */
        public static final class C64969a extends AbstractC20727d {
            static {
                Covode.recordClassIndex(76437);
            }

            C64969a() {
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34149a(Uri uri, Throwable th) {
                C89219l.m154721d(uri, "");
                C89219l.m154721d(th, "");
                C51423a.m95792b("activity_image_log", "Entrance image intermediate failed ".concat(String.valueOf(th)));
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34159a(Uri uri, View view, Throwable th) {
                C89219l.m154721d(uri, "");
                if (th != null) {
                    C51423a.m95792b("activity_image_log", "Entrance image failed ".concat(String.valueOf(th)));
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "1");
                } catch (JSONException e) {
                    ALog.m59865d("ug_activity_button", e.toString());
                }
                C12290b.m22066a("profile_activity_reward_button_show", jSONObject, (JSONObject) null, (JSONObject) null);
            }

            @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
            /* renamed from: a */
            public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                C89219l.m154721d(uri, "");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "0");
                } catch (JSONException e) {
                    ALog.m59865d("ug_activity_button", e.toString());
                }
                C12290b.m22066a("profile_activity_reward_button_show", jSONObject, (JSONObject) null, (JSONObject) null);
            }
        }

        private C64968a() {
        }

        public /* synthetic */ C64968a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m116739a(Context context, UgProfileActivityButton ugProfileActivityButton) {
            C89219l.m154721d(ugProfileActivityButton, "");
            String h5Link = ugProfileActivityButton.getH5Link();
            if (h5Link != null) {
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                intent.setFlags(268435456);
                intent.setData(Uri.parse(h5Link));
                Context a = C17867d.m33078a();
                C84349a.m145093a(intent, a);
                a.startActivity(intent);
            }
        }

        /* renamed from: a */
        public static void m116740a(UrlModel urlModel, TuxIconView tuxIconView) {
            C89219l.m154721d(tuxIconView, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics())));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics())));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C23163i.m43660a((View) tuxIconView, valueOf, valueOf2, valueOf3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system4.getDisplayMetrics()))), false, 16);
            if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
                String str = urlModel.getUrlList().get(0);
                if (!TextUtils.isEmpty(str)) {
                    C20766v a = C20761r.m39061a(str);
                    a.f49093F = tuxIconView;
                    a.mo34181a(new C64969a());
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(76435);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC65076c mo104273v() {
        return EnumC65077d.Activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h, com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        if (mo104271t()) {
            mo104295A();
            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64982b.f146822a, new C64981f(this));
        }
    }

    /* renamed from: A */
    public final void mo104295A() {
        UrlModel resourceUrl;
        UrlModel urlModel;
        List<UgProfileActivityButton> list;
        List<String> urlList;
        if (C80580in.m139687c()) {
            C51423a.m95792b("activity_image_log", "child mode");
            return;
        }
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            UgProfileActivityButton a = m116728a(awemeActivitySetting);
            UgProfileActivityIcon b = m116733b(awemeActivitySetting);
            String str = null;
            if (m116732a(b)) {
                if (b != null) {
                    urlModel = b.getIconUrl();
                    list = b.getProfileActivityButtonList();
                } else {
                    urlModel = null;
                    list = null;
                }
                this.f146806h = m116730a(list);
                if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
                    str = urlList.get(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    mo104289y();
                    mo104286a(new C64970b(urlModel));
                    List<? extends UgProfileActivityButton> list2 = this.f146806h;
                    if (list2 == null) {
                        C89219l.m154710a("profileActivityButtonList");
                    }
                    if (list2.size() == 1) {
                        mo104286a(new C64972c(this));
                    } else {
                        List<? extends UgProfileActivityButton> list3 = this.f146806h;
                        if (list3 == null) {
                            C89219l.m154710a("profileActivityButtonList");
                        }
                        if (list3.size() > 1) {
                            mo104286a(new C64974d(this));
                        } else {
                            mo104290z();
                            return;
                        }
                    }
                }
                List<? extends UgProfileActivityButton> list4 = this.f146806h;
                if (list4 == null) {
                    C89219l.m154710a("profileActivityButtonList");
                }
                if (list4.size() > 1) {
                    C39162r.m79460a("gift_entrance_show", new C33744d().mo59983a("bubble_type", "merge_button").mo59983a("enter_from", "personal_homepage").f79943a);
                    return;
                }
                List<? extends UgProfileActivityButton> list5 = this.f146806h;
                if (list5 == null) {
                    C89219l.m154710a("profileActivityButtonList");
                }
                if (list5.size() == 1) {
                    C33744d dVar = new C33744d();
                    List<? extends UgProfileActivityButton> list6 = this.f146806h;
                    if (list6 == null) {
                        C89219l.m154710a("profileActivityButtonList");
                    }
                    C39162r.m79460a("gift_entrance_show", dVar.mo59983a("bubble_type", ((UgProfileActivityButton) list6.get(0)).getId()).mo59983a("enter_from", "personal_homepage").f79943a);
                }
            } else if (b != null || a == null) {
                mo104290z();
            } else {
                a.setId("Coupon");
                if (TextUtils.isEmpty(a.getH5Link())) {
                    return;
                }
                if ((m116734b(a) || C63504c.m115069a().mo102144g()) && (resourceUrl = a.getResourceUrl()) != null && resourceUrl.getUrlList() != null && !resourceUrl.getUrlList().isEmpty() && !TextUtils.isEmpty(resourceUrl.getUrlList().get(0))) {
                    mo104289y();
                    mo104286a(new C64978e(this, resourceUrl, a));
                }
            }
        } catch (C16041a e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static UgProfileActivityButton m116728a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return null;
        }
        try {
            return ugAwemeActivitySetting.getProfileActivityButton();
        } catch (C16041a unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static UgProfileActivityIcon m116733b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting == null) {
            return null;
        }
        try {
            return ugAwemeActivitySetting.getProfileActivityIcon();
        } catch (C16041a unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$f */
    static final class C64981f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64967a f146821a;

        static {
            Covode.recordClassIndex(76449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64981f(C64967a aVar) {
            super(1);
            this.f146821a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            if (aVar != null) {
                this.f146821a.mo104295A();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ List m116729a(C64967a aVar) {
        List<? extends UgProfileActivityButton> list = aVar.f146806h;
        if (list == null) {
            C89219l.m154710a("profileActivityButtonList");
        }
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$b */
    public static final class C64970b extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UrlModel f146807a;

        static {
            Covode.recordClassIndex(76438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64970b(UrlModel urlModel) {
            super(1);
            this.f146807a = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23187b bVar) {
            C23187b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37742a((AbstractC89172b<? super TuxIconView, C89391z>) new AbstractC89172b<TuxIconView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64970b.C649711 */

                /* renamed from: a */
                final /* synthetic */ C64970b f146808a;

                static {
                    Covode.recordClassIndex(76439);
                }

                {
                    this.f146808a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TuxIconView tuxIconView) {
                    TuxIconView tuxIconView2 = tuxIconView;
                    C89219l.m154721d(tuxIconView2, "");
                    C64968a.m116740a(this.f146808a.f146807a, tuxIconView2);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$c */
    public static final class C64972c extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64967a f146809a;

        static {
            Covode.recordClassIndex(76440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64972c(C64967a aVar) {
            super(1);
            this.f146809a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23187b bVar) {
            C23187b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64972c.C649731 */

                /* renamed from: a */
                final /* synthetic */ C64972c f146810a;

                static {
                    Covode.recordClassIndex(76441);
                }

                {
                    this.f146810a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C39162r.m79460a("gift_entrance_click", new C33744d().mo59983a("bubble_type", ((UgProfileActivityButton) C64967a.m116729a(this.f146810a.f146809a).get(0)).getId()).mo59983a("enter_from", "personal_homepage").f79943a);
                    C64968a.m116739a(this.f146810a.f146809a.az_(), (UgProfileActivityButton) C64967a.m116729a(this.f146810a.f146809a).get(0));
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$d */
    public static final class C64974d extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64967a f146811a;

        static {
            Covode.recordClassIndex(76442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64974d(C64967a aVar) {
            super(1);
            this.f146811a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23187b bVar) {
            C23187b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64974d.C649751 */

                /* renamed from: a */
                final /* synthetic */ C64974d f146812a;

                static {
                    Covode.recordClassIndex(76443);
                }

                {
                    this.f146812a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C39162r.m79460a("gift_entrance_click", new C33744d().mo59983a("bubble_type", "merge_button").mo59983a("enter_from", "personal_homepage").f79943a);
                    ArrayList arrayList = new ArrayList();
                    for (final UgProfileActivityButton ugProfileActivityButton : C64967a.m116729a(this.f146812a.f146811a)) {
                        C23208a.C23213d dVar = new C23208a.C23213d();
                        C649761 r0 = new AbstractC89172b<TuxIconView, C89391z>() {
                            /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64974d.C649751.C649761 */

                            static {
                                Covode.recordClassIndex(76444);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(TuxIconView tuxIconView) {
                                TuxIconView tuxIconView2 = tuxIconView;
                                C89219l.m154721d(tuxIconView2, "");
                                UrlModel resourceUrl = ugProfileActivityButton.getResourceUrl();
                                C89219l.m154716b(resourceUrl, "");
                                C20766v a = C20761r.m39061a(resourceUrl.getUrlList().get(0));
                                a.f49093F = tuxIconView2;
                                a.mo34186c();
                                return C89391z.f203057a;
                            }
                        };
                        C89219l.m154719c(r0, "");
                        dVar.f55004g = r0;
                        String name = ugProfileActivityButton.getName();
                        C89219l.m154716b(name, "");
                        arrayList.add(dVar.mo37788a(name).mo37787a(new AbstractC89172b<View, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64974d.C649751.C649772 */

                            /* renamed from: a */
                            final /* synthetic */ C649751 f146814a;

                            static {
                                Covode.recordClassIndex(76445);
                            }

                            {
                                this.f146814a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(View view) {
                                C89219l.m154721d(view, "");
                                C64968a.m116739a(this.f146814a.f146812a.f146811a.az_(), ugProfileActivityButton);
                                C39162r.m79460a("activity_button_click", new C33744d().mo59983a("button_type", ugProfileActivityButton.getId()).mo59983a("enter_from", "personal_homepage").f79943a);
                                return C89391z.f203057a;
                            }
                        }));
                    }
                    Activity j = C17873f.m33102j();
                    C23208a b = new C23208a.C23211b().mo37795a(arrayList).mo37800b();
                    if (j != null && (j instanceof ActivityC0945e)) {
                        b.show(((ActivityC0945e) j).getSupportFragmentManager(), "");
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.a$e */
    public static final class C64978e extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64967a f146816a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f146817b;

        /* renamed from: c */
        final /* synthetic */ UgProfileActivityButton f146818c;

        static {
            Covode.recordClassIndex(76446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64978e(C64967a aVar, UrlModel urlModel, UgProfileActivityButton ugProfileActivityButton) {
            super(1);
            this.f146816a = aVar;
            this.f146817b = urlModel;
            this.f146818c = ugProfileActivityButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23187b bVar) {
            C23187b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37742a((AbstractC89172b<? super TuxIconView, C89391z>) new AbstractC89172b<TuxIconView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64978e.C649791 */

                /* renamed from: a */
                final /* synthetic */ C64978e f146819a;

                static {
                    Covode.recordClassIndex(76447);
                }

                {
                    this.f146819a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TuxIconView tuxIconView) {
                    TuxIconView tuxIconView2 = tuxIconView;
                    C89219l.m154721d(tuxIconView2, "");
                    C64968a.m116740a(this.f146819a.f146817b, tuxIconView2);
                    return C89391z.f203057a;
                }
            }).mo37741a((AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.p3603a.C64967a.C64978e.C649802 */

                /* renamed from: a */
                final /* synthetic */ C64978e f146820a;

                static {
                    Covode.recordClassIndex(76448);
                }

                {
                    this.f146820a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C39162r.m79460a("gift_entrance_click", new C33744d().mo59983a("bubble_type", "coupon_fission").mo59983a("enter_from", "personal_homepage").f79943a);
                    C64968a.m116739a(this.f146820a.f146816a.az_(), this.f146820a.f146818c);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static boolean m116734b(UgProfileActivityButton ugProfileActivityButton) {
        try {
            Integer showScenery = ugProfileActivityButton.getShowScenery();
            if (showScenery == null) {
                return false;
            }
            if (showScenery.intValue() == 1) {
                return true;
            }
            return false;
        } catch (C16041a unused) {
            C51423a.m95792b("activity_image_log", "show scenery not get");
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c
    /* renamed from: a */
    public final /* synthetic */ void mo104269a(C23187b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    private static List<UgProfileActivityButton> m116730a(List<? extends UgProfileActivityButton> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (UgProfileActivityButton ugProfileActivityButton : list) {
                if (C89219l.m154714a((Object) ugProfileActivityButton.getId(), (Object) "Coupon") && m116731a(ugProfileActivityButton)) {
                    arrayList.add(ugProfileActivityButton);
                } else if (!C89219l.m154714a((Object) ugProfileActivityButton.getId(), (Object) "Coupon")) {
                    arrayList.add(ugProfileActivityButton);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m116731a(UgProfileActivityButton ugProfileActivityButton) {
        UrlModel resourceUrl;
        if (ugProfileActivityButton == null || (resourceUrl = ugProfileActivityButton.getResourceUrl()) == null || resourceUrl.getUrlList() == null) {
            return false;
        }
        List<String> urlList = resourceUrl.getUrlList();
        C89219l.m154716b(urlList, "");
        if (!(!urlList.isEmpty()) || (!m116734b(ugProfileActivityButton) && !C63504c.m115069a().mo102144g())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m116732a(UgProfileActivityIcon ugProfileActivityIcon) {
        if (ugProfileActivityIcon == null) {
            return false;
        }
        UrlModel iconUrl = ugProfileActivityIcon.getIconUrl();
        List<UgProfileActivityButton> profileActivityButtonList = ugProfileActivityIcon.getProfileActivityButtonList();
        if (iconUrl == null || profileActivityButtonList == null || !(!profileActivityButtonList.isEmpty()) || iconUrl.getUrlList() == null) {
            return false;
        }
        List<String> urlList = iconUrl.getUrlList();
        C89219l.m154716b(urlList, "");
        if (!urlList.isEmpty()) {
            return true;
        }
        return false;
    }
}
