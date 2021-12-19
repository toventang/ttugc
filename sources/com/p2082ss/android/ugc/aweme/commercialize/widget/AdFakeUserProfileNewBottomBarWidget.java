package com.p2082ss.android.ugc.aweme.commercialize.widget;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget */
public final class AdFakeUserProfileNewBottomBarWidget extends AbsAdProfileWidget implements AbstractC33974au {

    /* renamed from: j */
    public static final C38994a f92114j = new C38994a((byte) 0);

    /* renamed from: k */
    private final AbstractC89244h f92115k = C89250i.m154773a((AbstractC89171a) new C38997d(this));

    /* renamed from: l */
    private final AbstractC89244h f92116l = C89250i.m154773a((AbstractC89171a) new C38999f(this));

    /* renamed from: m */
    private final AbstractC89244h f92117m = C89250i.m154773a((AbstractC89171a) new C38998e(this));

    /* renamed from: n */
    private final AbstractC89244h f92118n = C89250i.m154773a((AbstractC89171a) new C38996c(this));

    static {
        Covode.recordClassIndex(46588);
    }

    /* renamed from: f */
    private final ViewGroup m79155f() {
        return (ViewGroup) this.f92115k.getValue();
    }

    /* renamed from: g */
    private final TextView m79156g() {
        return (TextView) this.f92118n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$a */
    public static final class C38994a {
        static {
            Covode.recordClassIndex(46589);
        }

        private C38994a() {
        }

        public /* synthetic */ C38994a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$c */
    static final class C38996c extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f92121a;

        static {
            Covode.recordClassIndex(46591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38996c(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.f92121a = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f92121a.mo66948a(R.id.d9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$d */
    static final class C38997d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f92122a;

        static {
            Covode.recordClassIndex(46592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38997d(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.f92122a = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f92122a.mo66948a(R.id.da);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$e */
    static final class C38998e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f92123a;

        static {
            Covode.recordClassIndex(46593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38998e(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.f92123a = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f92123a.mo66948a(R.id.dc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$f */
    static final class C38999f extends AbstractC89220m implements AbstractC89171a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f92124a;

        static {
            Covode.recordClassIndex(46594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38999f(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget) {
            super(0);
            this.f92124a = adFakeUserProfileNewBottomBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartRoundImageView invoke() {
            return this.f92124a.mo66948a(R.id.de);
        }
    }

    /* renamed from: h */
    private final void m79157h() {
        ViewGroup f = m79155f();
        if (f != null) {
            f.animate().translationY((float) C34728n.m70946a(100.0d)).setDuration(0).start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        m79157h();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget$b */
    static final class View$OnClickListenerC38995b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNewBottomBarWidget f92119a;

        /* renamed from: b */
        final /* synthetic */ C38426i f92120b;

        static {
            Covode.recordClassIndex(46590);
        }

        View$OnClickListenerC38995b(AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget, C38426i iVar) {
            this.f92119a = adFakeUserProfileNewBottomBarWidget;
            this.f92120b = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C38625ag.m78385a(this.f92119a.f80270b, ((AbsAdProfileWidget) this.f92119a).f90607a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66951a(boolean z) {
        super.mo66951a(z);
        if (z) {
            ViewGroup f = m79155f();
            if (f != null) {
                f.animate().translationY((float) C34728n.m70946a(0.0d)).setDuration(300).start();
                return;
            }
            return;
        }
        m79157h();
    }

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
        TextView textView = (TextView) this.f92117m.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
            if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
                str3 = null;
            } else {
                str3 = awemeRawAd3.getButtonText();
            }
            textView.setText(str3);
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd2.getOpenUrl();
        }
        if (str == null || str.length() == 0) {
            TextView g = m79156g();
            if (g != null) {
                g.setVisibility(0);
            }
            TextView g2 = m79156g();
            if (g2 != null) {
                Aweme aweme3 = ((AbsAdProfileWidget) this).f90607a;
                if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = fakeAuthor.getButtonText();
                }
                g2.setText(str2);
            }
        } else {
            TextView g3 = m79156g();
            if (g3 != null) {
                g3.setVisibility(8);
            }
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f90607a;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        }
        C20714a a = C38457o.C38458a.m77917a(user);
        if (a != null) {
            C20766v a2 = C20761r.m39058a(a);
            a2.f49092E = (SmartRoundImageView) this.f92116l.getValue();
            a2.mo34186c();
        }
        ViewGroup f = m79155f();
        if (f != null) {
            f.setOnClickListener(new View$OnClickListenerC38995b(this, iVar));
        }
    }
}
