package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38213ab;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget */
public final class AdNewFakeBottomDescBarWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final C38353a f90632j = new C38353a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f90633k;

    /* renamed from: l */
    private final AbstractC89244h f90634l;

    /* renamed from: m */
    private final AbstractC89244h f90635m;

    /* renamed from: n */
    private final AbstractC89244h f90636n;

    /* renamed from: o */
    private final boolean f90637o;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$g */
    static final class C38359g implements AbstractC38029b {

        /* renamed from: a */
        public static final C38359g f90643a = new C38359g();

        static {
            Covode.recordClassIndex(45858);
        }

        C38359g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$h */
    static final class C38360h implements AbstractC38029b {

        /* renamed from: a */
        public static final C38360h f90644a = new C38360h();

        static {
            Covode.recordClassIndex(45859);
        }

        C38360h() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$i */
    static final class C38361i implements AbstractC38029b {

        /* renamed from: a */
        public static final C38361i f90645a = new C38361i();

        static {
            Covode.recordClassIndex(45860);
        }

        C38361i() {
        }
    }

    static {
        Covode.recordClassIndex(45851);
    }

    private AdNewFakeBottomDescBarWidget(byte b) {
        this();
    }

    /* renamed from: f */
    private final ViewGroup m77752f() {
        return (ViewGroup) this.f90633k.getValue();
    }

    /* renamed from: g */
    private final TextView m77753g() {
        return (TextView) this.f90635m.getValue();
    }

    /* renamed from: h */
    private final TextView m77754h() {
        return (TextView) this.f90636n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$a */
    public static final class C38353a {
        static {
            Covode.recordClassIndex(45852);
        }

        private C38353a() {
        }

        public /* synthetic */ C38353a(byte b) {
            this();
        }
    }

    private /* synthetic */ AdNewFakeBottomDescBarWidget() {
        this(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$c */
    static final class C38355c extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f90639a;

        static {
            Covode.recordClassIndex(45854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38355c(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.f90639a = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90639a.mo66948a(R.id.ev);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$d */
    static final class C38356d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f90640a;

        static {
            Covode.recordClassIndex(45855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38356d(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.f90640a = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f90640a.mo66948a(R.id.ew);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$e */
    static final class C38357e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f90641a;

        static {
            Covode.recordClassIndex(45856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38357e(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.f90641a = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f90641a.mo66948a(R.id.ex);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$f */
    static final class C38358f extends AbstractC89220m implements AbstractC89171a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f90642a;

        static {
            Covode.recordClassIndex(45857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38358f(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            super(0);
            this.f90642a = adNewFakeBottomDescBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.f90642a.mo66948a(R.id.ey);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: e */
    public final void mo66952e() {
        super.mo66952e();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("AD_PROFILE_GP_WEBVIEW_HIDDEN", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: i */
    private final void m77755i() {
        ViewGroup f = m77752f();
        if (f != null) {
            f.animate().translationY((float) C34728n.m70946a(0.0d)).setDuration(300).start();
        }
    }

    /* renamed from: j */
    private final void m77756j() {
        ViewGroup f = m77752f();
        if (f != null) {
            f.animate().translationY((float) C34728n.m70946a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        m77756j();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66949a(C33942b bVar) {
        String str;
        super.onChanged(bVar);
        if (bVar != null) {
            str = bVar.f80277a;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "AD_PROFILE_GP_WEBVIEW_HIDDEN")) {
            m77755i();
        }
    }

    public AdNewFakeBottomDescBarWidget(boolean z) {
        this.f90637o = z;
        this.f90633k = C89250i.m154773a((AbstractC89171a) new C38356d(this));
        this.f90634l = C89250i.m154773a((AbstractC89171a) new C38358f(this));
        this.f90635m = C89250i.m154773a((AbstractC89171a) new C38357e(this));
        this.f90636n = C89250i.m154773a((AbstractC89171a) new C38355c(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66951a(boolean z) {
        super.mo66951a(z);
        if (!z || this.f90637o) {
            m77756j();
        } else {
            m77755i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        C38212aa fakeAuthor;
        AwemeRawAd awemeRawAd2;
        String str3;
        AwemeRawAd awemeRawAd3;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        TextView g = m77753g();
        User user = null;
        if (g != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str3 = null;
            } else {
                str3 = awemeRawAd3.getButtonText();
            }
            g.setText(str3);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd2.getOpenUrl();
        }
        if (str == null || str.length() == 0) {
            TextView h = m77754h();
            if (h != null) {
                h.setVisibility(0);
            }
            TextView h2 = m77754h();
            if (h2 != null) {
                Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = fakeAuthor.getButtonText();
                }
                h2.setText(str2);
            }
        } else {
            TextView h3 = m77754h();
            if (h3 != null) {
                h3.setVisibility(8);
            }
            TextView g2 = m77753g();
            if (g2 != null) {
                C23163i.m43668b(g2, 0, 0, 0, 0, false, 16);
            }
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        }
        C20714a a = AdNewFakeUserProfileHeaderWidget.C38375a.m77792a(user);
        if (a != null) {
            C20766v a2 = C20761r.m39058a(a);
            a2.f49092E = (SmartRoundImageView) this.f90634l.getValue();
            a2.mo34186c();
        }
        ViewGroup f = m77752f();
        if (f != null) {
            f.setOnClickListener(new View$OnClickListenerC38354b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeBottomDescBarWidget$b */
    static final class View$OnClickListenerC38354b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdNewFakeBottomDescBarWidget f90638a;

        static {
            Covode.recordClassIndex(45853);
        }

        View$OnClickListenerC38354b(AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget) {
            this.f90638a = adNewFakeBottomDescBarWidget;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            C38212aa fakeAuthor;
            C38213ab jumpData;
            String str;
            C38212aa fakeAuthor2;
            C38213ab jumpData2;
            String str2;
            C38212aa fakeAuthor3;
            C38213ab jumpData3;
            String str3;
            C38212aa fakeAuthor4;
            C38213ab jumpData4;
            ClickAgent.onClick(view);
            AdNewFakeBottomDescBarWidget adNewFakeBottomDescBarWidget = this.f90638a;
            Aweme aweme = ((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f90607a;
            if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                C89219l.m154716b(awemeRawAd, "");
                String type = awemeRawAd.getType();
                if (!TextUtils.isEmpty(type)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f90607a;
                    String str4 = null;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    if (C37699a.m76298g(awemeRawAd2) && C37699a.m76300h(awemeRawAd)) {
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        if (awemeRawAd3 != null) {
                            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                            if (awemeRawAd4 == null || (fakeAuthor4 = awemeRawAd4.getFakeAuthor()) == null || (jumpData4 = fakeAuthor4.getJumpData()) == null) {
                                str3 = null;
                            } else {
                                str3 = jumpData4.getOpenUrl();
                            }
                            awemeRawAd3.setOpenUrl(str3);
                        }
                        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                        if (awemeRawAd5 != null) {
                            AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                            if (awemeRawAd6 == null || (fakeAuthor3 = awemeRawAd6.getFakeAuthor()) == null || (jumpData3 = fakeAuthor3.getJumpData()) == null) {
                                str2 = null;
                            } else {
                                str2 = jumpData3.getWebUrl();
                            }
                            awemeRawAd5.setWebUrl(str2);
                        }
                        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
                        if (awemeRawAd7 != null) {
                            AwemeRawAd awemeRawAd8 = aweme.getAwemeRawAd();
                            if (awemeRawAd8 == null || (fakeAuthor2 = awemeRawAd8.getFakeAuthor()) == null || (jumpData2 = fakeAuthor2.getJumpData()) == null) {
                                str = null;
                            } else {
                                str = jumpData2.getWebTitle();
                            }
                            awemeRawAd7.setWebTitle(str);
                        }
                        AwemeRawAd awemeRawAd9 = aweme.getAwemeRawAd();
                        if (awemeRawAd9 != null) {
                            AwemeRawAd awemeRawAd10 = aweme.getAwemeRawAd();
                            if (!(awemeRawAd10 == null || (fakeAuthor = awemeRawAd10.getFakeAuthor()) == null || (jumpData = fakeAuthor.getJumpData()) == null)) {
                                str4 = jumpData.getPackageName();
                            }
                            awemeRawAd9.setPackageName(str4);
                        }
                    }
                    if (type != null) {
                        int hashCode = type.hashCode();
                        if (hashCode != 96801) {
                            if (hashCode != 117588) {
                                if (hashCode == 1893962841 && type.equals("redpacket")) {
                                    C38000g.m77050a().mo65905q(adNewFakeBottomDescBarWidget.f80270b, aweme);
                                    C38000g.m77050a().mo65908t(adNewFakeBottomDescBarWidget.f80270b, aweme);
                                    C18129a.m33746a("homepage_ad", "click_redpacket", awemeRawAd).mo28902c();
                                    C38000g.m77052c().mo65918a(adNewFakeBottomDescBarWidget.f80270b, aweme, 8, C38361i.f90645a);
                                }
                            } else if (type.equals("web")) {
                                C38000g.m77050a().mo65904p(adNewFakeBottomDescBarWidget.f80270b, aweme);
                                C18129a.m33746a("homepage_ad", "click_button", awemeRawAd).mo28902c();
                                C38000g.m77050a().mo65905q(adNewFakeBottomDescBarWidget.f80270b, aweme);
                                C38000g.m77052c().mo65918a(adNewFakeBottomDescBarWidget.f80270b, aweme, 8, C38359g.f90643a);
                            }
                        } else if (!type.equals("app")) {
                        } else {
                            if (C37699a.m76241aM(((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f90607a)) {
                                C38000g.m77052c().mo65918a(adNewFakeBottomDescBarWidget.f80270b, ((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f90607a, 8, C38360h.f90644a);
                            } else if (C37699a.m76242aN(((AbsAdProfileWidget) adNewFakeBottomDescBarWidget).f90607a)) {
                                C38000g.m77052c().mo65922b(adNewFakeBottomDescBarWidget.f80270b, aweme);
                            }
                        }
                    }
                }
            }
        }
    }
}
