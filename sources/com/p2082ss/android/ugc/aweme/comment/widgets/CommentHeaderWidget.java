package com.p2082ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;
import com.p2082ss.android.ugc.aweme.commerce.model.C37516e;
import com.p2082ss.android.ugc.aweme.commerce.p2515d.C37493a;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.commercialize.link.C38038b;
import com.p2082ss.android.ugc.aweme.commercialize.link.p2574a.C38036a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38205z;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59314b;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget */
public final class CommentHeaderWidget extends BaseCommentWidget implements View.OnClickListener, AbstractC33974au {

    /* renamed from: C */
    private static final C37303a f87981C = new C37303a((byte) 0);

    /* renamed from: i */
    static final /* synthetic */ AbstractC89286i[] f87982i = {new C89232y(CommentHeaderWidget.class, "mLinkTag", "getMLinkTag()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new C89232y(CommentHeaderWidget.class, "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceArea", "getMCommerceArea()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mPosCouponText", "getMPosCouponText()Landroid/widget/TextView;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;", 0), new C89232y(CommentHeaderWidget.class, "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;", 0)};

    /* renamed from: A */
    private final BaseCommentWidget.C37302a f87983A = m75298a((int) R.id.aap);

    /* renamed from: B */
    private AbstractC89172b<? super View, C89391z> f87984B = C37304b.f88002a;

    /* renamed from: j */
    public final AbstractC89171a<C89391z> f87985j;

    /* renamed from: k */
    private final BaseCommentWidget.C37302a f87986k = m75298a((int) R.id.c9w);

    /* renamed from: l */
    private final BaseCommentWidget.C37302a f87987l = m75298a((int) R.id.c9t);

    /* renamed from: m */
    private final BaseCommentWidget.C37302a f87988m = m75298a((int) R.id.c9x);

    /* renamed from: n */
    private final BaseCommentWidget.C37302a f87989n = m75298a((int) R.id.g0);

    /* renamed from: o */
    private final BaseCommentWidget.C37302a f87990o = m75298a((int) R.id.g2);

    /* renamed from: p */
    private final BaseCommentWidget.C37302a f87991p = m75298a((int) R.id.c9s);

    /* renamed from: q */
    private final BaseCommentWidget.C37302a f87992q = m75298a((int) R.id.aa4);

    /* renamed from: r */
    private final BaseCommentWidget.C37302a f87993r = m75298a((int) R.id.aao);

    /* renamed from: s */
    private final BaseCommentWidget.C37302a f87994s = m75298a((int) R.id.ab2);

    /* renamed from: t */
    private final BaseCommentWidget.C37302a f87995t = m75298a((int) R.id.c3m);

    /* renamed from: u */
    private final BaseCommentWidget.C37302a f87996u = m75298a((int) R.id.aar);

    /* renamed from: v */
    private final BaseCommentWidget.C37302a f87997v = m75298a((int) R.id.aa6);

    /* renamed from: w */
    private final BaseCommentWidget.C37302a f87998w = m75298a((int) R.id.aas);

    /* renamed from: x */
    private final BaseCommentWidget.C37302a f87999x = m75298a((int) R.id.aa7);

    /* renamed from: y */
    private final BaseCommentWidget.C37302a f88000y = m75298a((int) R.id.afh);

    /* renamed from: z */
    private final BaseCommentWidget.C37302a f88001z = m75298a((int) R.id.aae);

    static {
        Covode.recordClassIndex(44676);
    }

    /* renamed from: A */
    private final TextView m75315A() {
        return (TextView) this.f88000y.mo64904a(this, f87982i[14]);
    }

    /* renamed from: o */
    private final View m75320o() {
        return this.f87986k.mo64904a(this, f87982i[0]);
    }

    /* renamed from: p */
    private final RemoteImageView m75321p() {
        return (RemoteImageView) this.f87987l.mo64904a(this, f87982i[1]);
    }

    /* renamed from: q */
    private final TextView m75322q() {
        return (TextView) this.f87989n.mo64904a(this, f87982i[3]);
    }

    /* renamed from: r */
    private final View m75323r() {
        return this.f87990o.mo64904a(this, f87982i[4]);
    }

    /* renamed from: s */
    private final View m75324s() {
        return this.f87992q.mo64904a(this, f87982i[6]);
    }

    /* renamed from: t */
    private final RemoteImageView m75325t() {
        return (RemoteImageView) this.f87993r.mo64904a(this, f87982i[7]);
    }

    /* renamed from: u */
    private final TextView m75326u() {
        return (TextView) this.f87994s.mo64904a(this, f87982i[8]);
    }

    /* renamed from: v */
    private final View m75327v() {
        return this.f87995t.mo64904a(this, f87982i[9]);
    }

    /* renamed from: w */
    private final TextView m75328w() {
        return (TextView) this.f87996u.mo64904a(this, f87982i[10]);
    }

    /* renamed from: x */
    private final View m75329x() {
        return this.f87997v.mo64904a(this, f87982i[11]);
    }

    /* renamed from: y */
    private final TextView m75330y() {
        return (TextView) this.f87998w.mo64904a(this, f87982i[12]);
    }

    /* renamed from: z */
    private final View m75331z() {
        return this.f87999x.mo64904a(this, f87982i[13]);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: c */
    public final int mo60207c() {
        return R.layout.bjo;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$a */
    static final class C37303a {
        static {
            Covode.recordClassIndex(44677);
        }

        private C37303a() {
        }

        public /* synthetic */ C37303a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: k */
    public final void mo64903k() {
        m75320o().setOnClickListener(this);
        m75324s().setOnClickListener(this);
    }

    /* renamed from: l */
    private final boolean m75317l() {
        if (!mo64898f() || !C38038b.m77116a("company_link", mo64897e(), true) || C38681bh.m78486a(mo64897e()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private final boolean m75318m() {
        if (!mo64898f() || !C38038b.m77115a(mo64897e(), true, 4) || mo64897e().getMicroAppInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m75319n() {
        if (!mo64898f() || !C38038b.m77116a("shopping_cart", mo64897e(), true) || mo64897e().getPromotion() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$b */
    static final class C37304b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        public static final C37304b f88002a = new C37304b();

        static {
            Covode.recordClassIndex(44678);
        }

        C37304b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* renamed from: a */
    private final boolean m75316a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1648893033) {
            if (hashCode == -309942941 && str.equals("iron_man")) {
                return m75318m();
            }
            return false;
        } else if (str.equals("shopping_cart")) {
            return m75319n();
        } else {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$c */
    static final class C37305c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f88003a;

        static {
            Covode.recordClassIndex(44679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37305c(CommentHeaderWidget commentHeaderWidget) {
            super(1);
            this.f88003a = commentHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            C89219l.m154721d(view, "");
            if (C37699a.m76221X(this.f88003a.mo64897e())) {
                Context context = this.f88003a.f80270b;
                Aweme e = this.f88003a.mo64897e();
                String str2 = "comment_first_ad";
                if (TextUtils.equals(this.f88003a.mo64901i(), "general_search")) {
                    str = str2;
                } else {
                    str = null;
                }
                JSONObject a = C38189j.m77468a(context, e, false, (Map<String, String>) C38189j.m77515c(e));
                try {
                    a.put("refer", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C38189j.m77492a(context, "comment_ad", "click_product", e, a);
                C18129a.C18130a a2 = C18129a.m33746a("comment_ad", "click_product", this.f88003a.mo64897e().getAwemeRawAd());
                if (!TextUtils.equals(this.f88003a.mo64901i(), "general_search")) {
                    str2 = null;
                }
                a2.mo28900b("refer", str2).mo28902c();
            } else if (C37699a.m76220W(this.f88003a.mo64897e()) || C37699a.m76222Y(this.f88003a.mo64897e())) {
                Context context2 = this.f88003a.f80270b;
                Aweme e3 = this.f88003a.mo64897e();
                JSONObject a3 = C38189j.m77468a(context2, e3, true, (Map<String, String>) C38189j.m77515c(e3));
                try {
                    a3.put("refer", "cart");
                } catch (JSONException unused) {
                }
                C38189j.m77492a(context2, "comment_ad", "click", e3, a3);
                if (C37699a.m76314s(e3)) {
                    AwemeRawAd awemeRawAd = e3.getAwemeRawAd();
                    C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38205z(awemeRawAd));
                }
            }
            return C89391z.f203057a;
        }
    }

    public CommentHeaderWidget(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f87985j = aVar;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200) && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.c9w) {
                C38214ac a = C38681bh.m78486a(mo64897e());
                C38189j.m77473a(this.f80270b, new C38036a.C38037a().mo66313a("click").mo66311a(a).mo66312a(mo64897e()).mo66314a(true).mo66315a());
                C38767w.m78627a(this.f80270b, a, mo64897e(), true);
                if (C37699a.m76221X(mo64897e())) {
                    C38189j.m77474a(this.f80270b, a, mo64897e(), true);
                }
                if (m75317l() && C37699a.m76223Z(mo64897e())) {
                    Context context = this.f80270b;
                    Aweme e = mo64897e();
                    JSONObject a2 = C38189j.m77468a(context, e, false, (Map<String, String>) null);
                    if (!TextUtils.isEmpty("common_link")) {
                        try {
                            a2.put("refer", "common_link");
                        } catch (JSONException unused) {
                        }
                    }
                    if (C38189j.m77551z(context, e)) {
                        C38189j.m77493a(context, "comment_ad", "otherclick", a2, e.getAwemeRawAd());
                    }
                    C18129a.m33746a("comment_ad", "otherclick", mo64897e().getAwemeRawAd()).mo28900b("refer", "common_link").mo28902c();
                }
            } else if (valueOf.intValue() == R.id.aa4) {
                this.f87984B.invoke(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget$d */
    static final class C37306d extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommentHeaderWidget f88004a;

        /* renamed from: b */
        final /* synthetic */ IMiniAppService f88005b;

        /* renamed from: c */
        final /* synthetic */ C59314b f88006c;

        static {
            Covode.recordClassIndex(44680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37306d(CommentHeaderWidget commentHeaderWidget, IMiniAppService iMiniAppService, C59314b bVar) {
            super(1);
            this.f88004a = commentHeaderWidget;
            this.f88005b = iMiniAppService;
            this.f88006c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            String str2;
            C89219l.m154721d(view, "");
            C59315a.C59316a aVar = new C59315a.C59316a();
            aVar.f135536b = this.f88004a.mo64900h();
            aVar.f135535a = "comment_page";
            aVar.f135539e = this.f88004a.mo64897e().getAid();
            aVar.f135537c = "023002";
            if (this.f88005b.openMiniApp(this.f88004a.f80270b, C59308d.m109005a(this.f88006c), aVar.mo96936a())) {
                this.f88004a.f87985j.invoke();
            }
            C33744d a = new C33744d().mo59983a("enter_from", this.f88004a.mo64900h()).mo59983a("position", "comment_top").mo59983a("group_id", this.f88004a.mo64897e().getAid()).mo59983a("author_id", this.f88004a.mo64897e().getAuthorUid());
            if (this.f88006c.isApp()) {
                str = "micro_app";
            } else {
                str = "micro_game";
            }
            C39162r.m79460a("mp_click", a.mo59983a("_param_for_special", str).mo59983a("mp_id", this.f88006c.getAppId()).f79943a);
            if (C37699a.m76314s(this.f88004a.mo64897e())) {
                Context context = this.f88004a.f80270b;
                Aweme e = this.f88004a.mo64897e();
                String str3 = "comment_first_ad";
                if (TextUtils.equals(this.f88004a.mo64901i(), "general_search")) {
                    str2 = str3;
                } else {
                    str2 = null;
                }
                JSONObject a2 = C38189j.m77468a(context, e, false, (Map<String, String>) null);
                try {
                    a2.put("refer", str2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C38189j.m77492a(context, "comment_ad", "applet_click", e, a2);
                C18129a.C18130a a3 = C18129a.m33746a("comment_ad", "applet_click", this.f88004a.mo64897e().getAwemeRawAd());
                if (!TextUtils.equals(this.f88004a.mo64901i(), "general_search")) {
                    str3 = null;
                }
                a3.mo28900b("refer", str3).mo28902c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: a */
    public final void mo64896a(C33942b bVar) {
        C37516e promotion;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onChanged(bVar);
        if (bVar != null) {
            String str6 = bVar.f80277a;
            if (str6.hashCode() == 2016314694 && str6.equals("comment_aweme_and_params") && mo64898f() && mo64899g() && mo64898f()) {
                m75299a(m75327v());
                BaseCommentWidget.C37302a aVar = this.f88001z;
                AbstractC89286i<?>[] iVarArr = f87982i;
                m75300b(m75324s(), m75328w(), m75329x(), m75330y(), m75331z(), aVar.mo64904a(this, iVarArr[15]), (ImageView) this.f87983A.mo64904a(this, iVarArr[16]), m75315A(), m75320o(), m75322q(), m75323r());
                if (m75317l()) {
                    if (C37699a.m76259ae(mo64897e())) {
                        m75300b(m75320o());
                    } else {
                        C38214ac a = C38681bh.m78486a(mo64897e());
                        if (a != null) {
                            m75299a(m75320o());
                            TextView textView = (TextView) this.f87988m.mo64904a(this, iVarArr[2]);
                            C38214ac.C38215a aVar2 = a.commentArea;
                            if (aVar2 == null || (str4 = aVar2.title) == null) {
                                str4 = "";
                            }
                            textView.setText(str4);
                            TextView textView2 = (TextView) this.f87991p.mo64904a(this, iVarArr[5]);
                            C38214ac.C38215a aVar3 = a.commentArea;
                            if (aVar3 == null || (str5 = aVar3.featureLabel) == null) {
                                str5 = "";
                            }
                            textView2.setText(str5);
                            ((C24246a) m75321p().getHierarchy()).mo39970d(R.color.j);
                            String str7 = a.label;
                            if (str7 == null || str7.length() == 0) {
                                m75300b(m75322q(), m75323r());
                            } else {
                                m75322q().setText(a.label);
                                m75299a(m75322q(), m75323r());
                            }
                            C34577e.m70592a(m75321p(), a.getCommentAvatarIcon());
                            C38189j.m77473a(this.f80270b, new C38036a.C38037a().mo66313a("comment_show").mo66311a(a).mo66312a(mo64897e()).mo66314a(true).mo66315a());
                        }
                    }
                } else if (m75316a("iron_man")) {
                    C59314b microAppInfo = mo64897e().getMicroAppInfo();
                    if (microAppInfo != null) {
                        m75299a(m75324s(), m75328w());
                        TextView u = m75326u();
                        String title = microAppInfo.getTitle();
                        if (title == null || title.length() == 0) {
                            str = microAppInfo.getName();
                        } else {
                            str = microAppInfo.getTitle();
                        }
                        u.setText(str);
                        int type = microAppInfo.getType();
                        if (type == 1) {
                            m75325t().setImageURI(new Uri.Builder().scheme("res").path("2131232641").build());
                        } else if (type == 2) {
                            m75325t().setImageURI(new Uri.Builder().scheme("res").path("2131232644").build());
                        } else if (type == 3) {
                            C34577e.m70591a(m75325t(), 2131232643);
                        }
                        TextView w = m75328w();
                        String desc = microAppInfo.getDesc();
                        if (desc != null && desc.length() != 0) {
                            str2 = microAppInfo.getDesc();
                        } else if (microAppInfo.isApp()) {
                            str2 = "";
                        } else {
                            str2 = this.f80270b.getString(R.string.d35);
                            C89219l.m154716b(str2, "");
                        }
                        w.setText(str2);
                        C33744d a2 = new C33744d().mo59983a("enter_from", mo64900h()).mo59983a("position", "comment_top").mo59983a("group_id", mo64897e().getAid()).mo59983a("author_id", mo64897e().getAuthorUid()).mo59983a("mp_id", microAppInfo.getAppId());
                        if (microAppInfo.isApp()) {
                            str3 = "micro_app";
                        } else {
                            str3 = "micro_game";
                        }
                        C39162r.m79460a("mp_show", a2.mo59983a("_param_for_special", str3).f79943a);
                        C59320c cVar = C59320c.C59324a.f135560a;
                        C89219l.m154716b(cVar, "");
                        this.f87984B = new C37306d(this, cVar.mo96989a(), microAppInfo);
                    }
                } else if (m75316a("shopping_cart") && (promotion = mo64897e().getPromotion()) != null) {
                    C89219l.m154716b(promotion, "");
                    m75299a(m75328w(), m75324s());
                    m75328w().setText(promotion.getCommentArea());
                    m75325t().setImageURI(new Uri.Builder().scheme("res").path("2131232527").build());
                    m75326u().setText(promotion.getShortTitle());
                    this.f87984B = new C37305c(this);
                    Context context = m75328w().getContext();
                    C89219l.m154716b(context, "");
                    String fromGroupId = FeedParamProvider.C49809a.m93270a(context).getFromGroupId();
                    Context context2 = m75328w().getContext();
                    C89219l.m154716b(context2, "");
                    String referCommodityId = FeedParamProvider.C49809a.m93270a(context2).getReferCommodityId();
                    Long a3 = C37493a.m75594a(mo64902j());
                    String a4 = C37493a.m75595a(mo64897e(), mo64902j());
                    ICommerceService a5 = C37533a.m75656a();
                    C37534a aVar4 = new C37534a();
                    aVar4.f88682d = mo64897e().getAuthorUid();
                    aVar4.f88688j = "comment_cart_tag";
                    aVar4.f88685g = promotion.getPromotionId();
                    aVar4.f88686h = Long.valueOf((long) promotion.getPromotionSource());
                    aVar4.f88684f = fromGroupId;
                    aVar4.f88690l = referCommodityId;
                    aVar4.f88680b = mo64901i();
                    aVar4.f88681c = mo64897e().getAid();
                    aVar4.f88664I = Integer.valueOf(mo64897e().getFollowStatus());
                    aVar4.f88697s = a3;
                    aVar4.f88698t = a4;
                    a5.logCommerceEvents("product_entrance_show", aVar4);
                    ICommerceService a6 = C37533a.m75656a();
                    C37534a aVar5 = new C37534a();
                    aVar5.f88682d = mo64897e().getAuthorUid();
                    aVar5.f88688j = "comment_cart_tag";
                    aVar5.f88685g = promotion.getPromotionId();
                    aVar5.f88686h = Long.valueOf((long) promotion.getPromotionSource());
                    aVar5.f88680b = mo64901i();
                    aVar5.f88681c = mo64897e().getAid();
                    aVar5.f88689k = "click_comment";
                    aVar5.f88687i = mo64901i();
                    aVar5.f88664I = Integer.valueOf(mo64897e().getFollowStatus());
                    a6.logCommerceEvents("show_product", aVar5);
                }
                if (m75328w().getVisibility() != 0 && m75329x().getVisibility() != 0 && m75330y().getVisibility() != 0 && m75331z().getVisibility() != 0 && m75315A().getVisibility() != 0) {
                    m75300b(m75327v());
                }
            }
        }
    }
}
