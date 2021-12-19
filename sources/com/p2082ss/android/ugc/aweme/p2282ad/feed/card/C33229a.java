package com.p2082ss.android.ugc.aweme.p2282ad.feed.card;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a */
public final class C33229a implements AbstractC1214u<C33942b> {

    /* renamed from: j */
    public static final C33230a f78951j = new C33230a((byte) 0);

    /* renamed from: a */
    public FrameLayout f78952a;

    /* renamed from: b */
    public final C33237b f78953b;

    /* renamed from: c */
    public AbstractC33241d f78954c;

    /* renamed from: d */
    public DataCenter f78955d;

    /* renamed from: e */
    public Handler f78956e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public Aweme f78957f;

    /* renamed from: g */
    public boolean f78958g;

    /* renamed from: h */
    public boolean f78959h;

    /* renamed from: i */
    public boolean f78960i;

    /* renamed from: k */
    private final AbstractC89244h f78961k = C89250i.m154773a((AbstractC89171a) new C33231b(this));

    /* renamed from: l */
    private String f78962l;

    /* renamed from: m */
    private final double f78963m;

    static {
        Covode.recordClassIndex(40054);
    }

    /* renamed from: a */
    public final AbstractC33241d mo59181a() {
        return (AbstractC33241d) this.f78961k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$a */
    public static final class C33230a {
        static {
            Covode.recordClassIndex(40055);
        }

        private C33230a() {
        }

        public /* synthetic */ C33230a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$f */
    static final class RunnableC33236f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f78970a;

        static {
            Covode.recordClassIndex(40061);
        }

        RunnableC33236f(FrameLayout frameLayout) {
            this.f78970a = frameLayout;
        }

        public final void run() {
            this.f78970a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo59187c() {
        this.f78953b.mo59198a(this.f78957f);
    }

    /* renamed from: g */
    public final void mo59191g() {
        DataCenter dataCenter = this.f78955d;
        if (dataCenter != null) {
            dataCenter.mo60191a("action_ad_pop_up_web_pause_video", (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$b */
    static final class C33231b extends AbstractC89220m implements AbstractC89171a<AbstractC33241d> {

        /* renamed from: a */
        final /* synthetic */ C33229a f78964a;

        static {
            Covode.recordClassIndex(40056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33231b(C33229a aVar) {
            super(0);
            this.f78964a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33241d invoke() {
            C33237b bVar = this.f78964a.f78953b;
            if (bVar.f78975e == null) {
                bVar.f78975e = new C33238c(bVar.f78972b);
            }
            return bVar.f78975e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$c */
    static final class RunnableC33232c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33229a f78965a;

        static {
            Covode.recordClassIndex(40057);
        }

        RunnableC33232c(C33229a aVar) {
            this.f78965a = aVar;
        }

        public final void run() {
            this.f78965a.f78958g = false;
            DataCenter dataCenter = this.f78965a.f78955d;
            if (dataCenter != null) {
                dataCenter.mo60191a("AD_ACTION_MOVE_IN_DESC", (Object) true);
            }
        }
    }

    /* renamed from: h */
    private final void m68133h() {
        this.f78959h = false;
        this.f78962l = null;
        this.f78958g = false;
        this.f78953b.mo59197a();
        this.f78956e.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$e */
    public static final class RunnableC33235e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33229a f78969a;

        static {
            Covode.recordClassIndex(40060);
        }

        public RunnableC33235e(C33229a aVar) {
            this.f78969a = aVar;
        }

        public final void run() {
            this.f78969a.f78958g = true;
            AbstractC33241d dVar = this.f78969a.f78954c;
            if (dVar != null) {
                dVar.mo59153a(8);
            }
            AbstractC33241d a = this.f78969a.mo59181a();
            if (a != null) {
                a.mo59153a(0);
            }
            this.f78969a.mo59189e();
            AbstractC33241d a2 = this.f78969a.mo59181a();
            if (a2 != null) {
                a2.mo59152a();
            }
        }
    }

    /* renamed from: b */
    public final void mo59186b() {
        if (C37699a.m76208K(this.f78957f) && !C37699a.m76212O(this.f78957f) && !this.f78958g) {
            mo59187c();
            AbstractC33241d dVar = this.f78954c;
            if (dVar != null) {
                dVar.mo59159b();
            }
        }
    }

    /* renamed from: e */
    public final void mo59189e() {
        FrameLayout frameLayout = this.f78952a;
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
            if (!this.f78960i) {
                frameLayout.setVisibility(0);
            }
            frameLayout.setTranslationY((float) C34728n.m70946a(this.f78963m));
            frameLayout.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(290).start();
        }
    }

    /* renamed from: f */
    public final String mo59190f() {
        String str = this.f78962l;
        if (str != null && str.length() != 0) {
            return this.f78962l;
        }
        AbstractC33241d dVar = this.f78954c;
        if (dVar == null || !dVar.mo59162e()) {
            return "data_load_fail";
        }
        AbstractC33241d dVar2 = this.f78954c;
        if (dVar2 == null || !dVar2.mo59163f()) {
            return "load_timeout";
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.card.a$d */
    static final class RunnableC33233d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33229a f78966a;

        /* renamed from: b */
        final /* synthetic */ boolean f78967b;

        static {
            Covode.recordClassIndex(40058);
        }

        RunnableC33233d(C33229a aVar, boolean z) {
            this.f78966a = aVar;
            this.f78967b = z;
        }

        public final void run() {
            String f = this.f78966a.mo59190f();
            if (f != null && f.length() != 0) {
                AbstractC33241d dVar = this.f78966a.f78954c;
                if (dVar != null) {
                    dVar.mo59156a(f);
                }
            } else if (!this.f78966a.f78959h || this.f78967b) {
                this.f78966a.f78959h = true;
                DataCenter dataCenter = this.f78966a.f78955d;
                if (dataCenter != null) {
                    dataCenter.mo60191a("ad_feed_card_show_state", (Object) true);
                }
                DataCenter dataCenter2 = this.f78966a.f78955d;
                if (dataCenter2 != null) {
                    dataCenter2.mo60191a("AD_ACTION_MOVE_OUT_DESC", (Object) true);
                }
                this.f78966a.f78956e.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.card.C33229a.RunnableC33233d.RunnableC332341 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC33233d f78968a;

                    static {
                        Covode.recordClassIndex(40059);
                    }

                    {
                        this.f78968a = r1;
                    }

                    public final void run() {
                        this.f78968a.f78966a.f78958g = true;
                        AbstractC33241d dVar = this.f78968a.f78966a.f78954c;
                        if (dVar != null) {
                            dVar.mo59153a(0);
                        }
                        AbstractC33241d a = this.f78968a.f78966a.mo59181a();
                        if (a != null) {
                            a.mo59153a(8);
                        }
                        this.f78968a.f78966a.mo59189e();
                        AbstractC33241d dVar2 = this.f78968a.f78966a.f78954c;
                        if (dVar2 != null) {
                            dVar2.mo59152a();
                        }
                    }
                }, 200);
            }
        }
    }

    /* renamed from: d */
    public final void mo59188d() {
        if (this.f78958g) {
            DataCenter dataCenter = this.f78955d;
            if (dataCenter != null) {
                dataCenter.mo60191a("ad_feed_card_show_state", (Object) false);
            }
            FrameLayout frameLayout = this.f78952a;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).translationY((float) C34728n.m70946a(this.f78963m)).setDuration(290).withEndAction(new RunnableC33236f(frameLayout)).start();
            }
            this.f78956e.postDelayed(new RunnableC33232c(this), 200);
        }
    }

    /* renamed from: a */
    public final void mo59185a(boolean z) {
        FrameLayout frameLayout;
        int i;
        if (C37699a.m76208K(this.f78957f)) {
            this.f78960i = z;
            if (this.f78958g && (frameLayout = this.f78952a) != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                frameLayout.setVisibility(i);
            }
        }
    }

    public C33229a(View view) {
        double d;
        C89219l.m154721d(view, "");
        this.f78953b = new C33237b(view);
        if (C37699a.m76216S(this.f78957f)) {
            d = 8.0d;
        } else {
            d = 15.0d;
        }
        this.f78963m = d;
    }

    /* renamed from: a */
    public final void mo59184a(Aweme aweme) {
        FrameLayout frameLayout;
        AbstractC33241d dVar;
        if ((aweme != null && aweme.isAd()) || C37699a.m76210M(aweme)) {
            AwemeRawAd awemeRawAd = null;
            if (!C37699a.m76208K(aweme) || C37699a.m76212O(aweme)) {
                this.f78957f = null;
                C33237b bVar = this.f78953b;
                for (AbstractC33241d dVar2 : C89070n.m154522b(bVar.f78973c, bVar.f78974d, bVar.f78975e)) {
                    if (dVar2 != null) {
                        dVar2.mo59155a((Aweme) null);
                    }
                }
                return;
            }
            this.f78957f = aweme;
            C33237b bVar2 = this.f78953b;
            if (C37699a.m76293e(aweme != null ? aweme.getAwemeRawAd() : null)) {
                frameLayout = bVar2.f78972b;
            } else {
                frameLayout = bVar2.f78971a;
            }
            this.f78952a = frameLayout;
            C33237b bVar3 = this.f78953b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C89219l.m154721d(this, "");
            if (C37699a.m76293e(awemeRawAd)) {
                if (bVar3.f78974d == null) {
                    bVar3.f78974d = new FeedAdLynxCard(this, bVar3.f78972b);
                }
                dVar = bVar3.f78974d;
            } else {
                if (bVar3.f78973c == null) {
                    bVar3.f78973c = new FeedAdLynxCard(this, bVar3.f78971a);
                }
                dVar = bVar3.f78973c;
            }
            this.f78954c = dVar;
            if (dVar != null) {
                dVar.mo59155a(aweme);
            }
            AbstractC33241d a = mo59181a();
            if (a != null) {
                a.mo59155a(aweme);
            }
            m68133h();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        AbstractC33241d dVar;
        AbstractC33241d dVar2;
        C33942b bVar2 = bVar;
        if (C37699a.m76208K(this.f78957f)) {
            String str2 = null;
            if (bVar2 != null && (str = bVar2.f80277a) != null) {
                switch (str.hashCode()) {
                    case -2033402377:
                        if (str.equals("ad_comment_dialog_visible")) {
                            Object a = bVar2.mo60212a();
                            C89219l.m154716b(a, "");
                            if (((Boolean) a).booleanValue()) {
                                str2 = "comment_block";
                            }
                            this.f78962l = str2;
                            return;
                        }
                        return;
                    case -1540531799:
                        if (str.equals("ad_feed_on_page_unselected")) {
                            AbstractC33241d dVar3 = this.f78954c;
                            if (dVar3 != null) {
                                dVar3.mo59161d();
                            }
                            m68133h();
                            return;
                        }
                        return;
                    case -1282907273:
                        if (str.equals("ad_share_dialog_visible")) {
                            Object a2 = bVar2.mo60212a();
                            C89219l.m154716b(a2, "");
                            if (((Boolean) a2).booleanValue()) {
                                str2 = "share_block";
                            }
                            this.f78962l = str2;
                            return;
                        }
                        return;
                    case -1132409520:
                        if (str.equals("ad_feed_on_page_selected") && (dVar = this.f78954c) != null) {
                            dVar.mo59160c();
                            return;
                        }
                        return;
                    case 2040441990:
                        if (str.equals("ad_video_on_resume_play") && (dVar2 = this.f78954c) != null) {
                            dVar2.mo59164g();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59183a(long j, boolean z) {
        if (C37699a.m76208K(this.f78957f) && !C37699a.m76212O(this.f78957f) && !this.f78958g) {
            this.f78956e.postDelayed(new RunnableC33233d(this, z), j);
        }
    }

    /* renamed from: a */
    public final void mo59182a(int i, int i2, int i3) {
        AbstractC33241d dVar = this.f78954c;
        if (dVar != null) {
            dVar.mo59154a(i, i2, i3);
        }
    }
}
