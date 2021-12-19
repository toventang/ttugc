package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38212aa;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37591b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38426i;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38457o;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38625ag;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget */
public final class AdFakeUserProfileBottomBarWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final C38988a f92103j = new C38988a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f92104k = C89250i.m154773a((AbstractC89171a) new C38991d(this));

    /* renamed from: l */
    private final AbstractC89244h f92105l = C89250i.m154773a((AbstractC89171a) new C38993f(this));

    /* renamed from: m */
    private final AbstractC89244h f92106m = C89250i.m154773a((AbstractC89171a) new C38992e(this));

    /* renamed from: n */
    private final AbstractC89244h f92107n = C89250i.m154773a((AbstractC89171a) new C38990c(this));

    static {
        Covode.recordClassIndex(46581);
    }

    /* renamed from: f */
    private final ViewGroup m79150f() {
        return (ViewGroup) this.f92104k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$a */
    public static final class C38988a {
        static {
            Covode.recordClassIndex(46582);
        }

        private C38988a() {
        }

        public /* synthetic */ C38988a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$c */
    static final class C38990c extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f92110a;

        static {
            Covode.recordClassIndex(46584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38990c(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.f92110a = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f92110a.mo66948a(R.id.d8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$d */
    static final class C38991d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f92111a;

        static {
            Covode.recordClassIndex(46585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38991d(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.f92111a = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f92111a.mo66948a(R.id.d_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$e */
    static final class C38992e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f92112a;

        static {
            Covode.recordClassIndex(46586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38992e(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.f92112a = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f92112a.mo66948a(R.id.db);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$f */
    static final class C38993f extends AbstractC89220m implements AbstractC89171a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f92113a;

        static {
            Covode.recordClassIndex(46587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38993f(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget) {
            super(0);
            this.f92113a = adFakeUserProfileBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.f92113a.mo66948a(R.id.dd);
        }
    }

    /* renamed from: g */
    private final void m79151g() {
        ViewGroup f = m79150f();
        if (f != null) {
            f.animate().translationY((float) C34728n.m70946a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        m79151g();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget$b */
    static final class View$OnClickListenerC38989b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileBottomBarWidget f92108a;

        /* renamed from: b */
        final /* synthetic */ C38426i f92109b;

        static {
            Covode.recordClassIndex(46583);
        }

        View$OnClickListenerC38989b(AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget, C38426i iVar) {
            this.f92108a = adFakeUserProfileBottomBarWidget;
            this.f92109b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C38625ag.m78385a(this.f92108a.f80270b, ((AbsAdProfileWidget) this.f92108a).f90607a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66951a(boolean z) {
        super.mo66951a(z);
        if (z) {
            ViewGroup f = m79150f();
            if (f != null) {
                f.animate().translationY((float) C34728n.m70946a(-16.0d)).setDuration(300).start();
                return;
            }
            return;
        }
        m79151g();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        AwemeRawAd awemeRawAd;
        String learnMoreBgColor;
        String str;
        AwemeRawAd awemeRawAd2;
        C38212aa fakeAuthor;
        String str2;
        AwemeRawAd awemeRawAd3;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        TextView textView = (TextView) this.f92106m.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str2 = null;
            } else {
                str2 = awemeRawAd3.getButtonText();
            }
            textView.setText(str2);
        }
        TextView textView2 = (TextView) this.f92107n.getValue();
        if (textView2 != null) {
            Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
            if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null) {
                str = null;
            } else {
                str = fakeAuthor.getButtonText();
            }
            textView2.setText(str);
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        }
        C20714a a = C38457o.C38458a.m77917a(user);
        if (a != null) {
            C20766v a2 = C20761r.m39058a(a);
            a2.f49092E = (SmartRoundImageView) this.f92105l.getValue();
            a2.mo34186c();
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
        if (!(aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) == null || learnMoreBgColor.length() <= 0)) {
            int parseColor = Color.parseColor(learnMoreBgColor);
            ViewGroup f = m79150f();
            if (f != null) {
                f.setBackground(new C37591b((float) C34728n.m70946a(4.0d), parseColor));
            }
        }
        ViewGroup f2 = m79150f();
        if (f2 != null) {
            f2.setOnClickListener(new View$OnClickListenerC38989b(this, iVar));
        }
    }
}
