package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.AbstractC37841f;
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38234e;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38742g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.p */
public final class C38907p implements AbstractC1214u<C33942b>, AbstractC38880af {

    /* renamed from: a */
    public Context f91883a;

    /* renamed from: b */
    public Aweme f91884b;

    /* renamed from: c */
    public AdHalfWebPageContainer f91885c;

    /* renamed from: d */
    public AdHalfWebPageMaskLayer f91886d;

    /* renamed from: e */
    public AbstractC0952i f91887e;

    /* renamed from: f */
    public AbstractC38883ai f91888f;

    /* renamed from: g */
    public int f91889g;

    /* renamed from: h */
    TopPageActionV2 f91890h;

    /* renamed from: i */
    public AdHalfWebPageMaskLayer f91891i;

    /* renamed from: j */
    public DataCenter f91892j;

    /* renamed from: k */
    Handler f91893k;

    /* renamed from: l */
    Runnable f91894l;

    /* renamed from: m */
    long f91895m;

    /* renamed from: n */
    long f91896n;

    /* renamed from: o */
    Integer f91897o;

    /* renamed from: p */
    Integer f91898p;

    /* renamed from: q */
    Integer f91899q;

    /* renamed from: r */
    public Object f91900r;

    /* renamed from: s */
    boolean f91901s;

    /* renamed from: t */
    String f91902t;

    /* renamed from: u */
    boolean f91903u;

    /* renamed from: v */
    private AdHalfWebPageContainer f91904v;

    /* renamed from: w */
    private AbstractC0952i f91905w;

    /* renamed from: x */
    private C38742g f91906x;

    /* renamed from: y */
    private AbstractC37841f f91907y;

    static {
        Covode.recordClassIndex(46494);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.p$a */
    public static class C38914a implements AbstractC38881ag {

        /* renamed from: a */
        C38907p f91916a = new C38907p((byte) 0);

        static {
            Covode.recordClassIndex(46501);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38880af mo67565a() {
            return this.f91916a;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67566a(Context context) {
            this.f91916a.f91883a = context;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67567a(AbstractC0952i iVar) {
            this.f91916a.f91887e = iVar;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67568a(DataCenter dataCenter) {
            this.f91916a.f91892j = dataCenter;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* synthetic */ AbstractC38881ag mo67569a(AdHalfWebPageContainer adHalfWebPageContainer) {
            boolean z;
            if (C37663b.f89031b.mo65688a() != null) {
                z = C37663b.f89031b.mo65688a().mo65663b();
            } else {
                z = false;
            }
            adHalfWebPageContainer.setUseZOrder(z);
            this.f91916a.f91885c = adHalfWebPageContainer;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67570a(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f91916a.f91886d = adHalfWebPageMaskLayer;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67571a(Aweme aweme) {
            this.f91916a.f91884b = aweme;
            return this;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38881ag
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC38881ag mo67572a(Object obj) {
            this.f91916a.f91900r = obj;
            return this;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: f */
    public final void mo67563f() {
        if (!this.f91901s) {
            m78998h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: g */
    public final void mo67564g() {
        if (!this.f91901s) {
            m78999i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: e */
    public final void mo67562e() {
        if (!this.f91901s) {
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = this.f91886d;
            if (adHalfWebPageMaskLayer != null && adHalfWebPageMaskLayer.f91585a) {
                this.f91886d.mo67348c();
            }
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer2 = this.f91891i;
            if (adHalfWebPageMaskLayer2 != null && adHalfWebPageMaskLayer2.f91585a) {
                this.f91891i.mo67348c();
            }
        }
    }

    private C38907p() {
        this.f91892j = new DataCenter();
        this.f91893k = new Handler(Looper.getMainLooper());
        this.f91895m = -1;
        this.f91896n = -1;
        this.f91897o = -100;
        this.f91898p = -100;
        this.f91899q = 0;
        this.f91901s = false;
        this.f91902t = null;
        this.f91903u = false;
    }

    /* renamed from: h */
    private void m78998h() {
        if (this.f91894l != null && this.f91895m > 0 && this.f91896n > 0) {
            this.f91896n = System.currentTimeMillis();
            this.f91893k.removeCallbacks(this.f91894l);
            this.f91893k.postDelayed(this.f91894l, this.f91895m);
        }
    }

    /* renamed from: i */
    private void m78999i() {
        if (this.f91894l != null && this.f91896n > 0) {
            long j = this.f91895m;
            if (j > 0) {
                this.f91895m = j - (System.currentTimeMillis() - this.f91896n);
                this.f91893k.removeCallbacks(this.f91894l);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: c */
    public final void mo67560c() {
        AbstractC38878ae a;
        C38875ac.f91817a.mo67551f(this.f91884b);
        if (!this.f91901s) {
            this.f91901s = true;
            AdHalfWebPageContainer adHalfWebPageContainer = this.f91885c;
            if (adHalfWebPageContainer != null && adHalfWebPageContainer.mo67315a()) {
                this.f91888f.mo67491f();
            }
            if (!(this.f91887e == null || mo67584a(false) == null)) {
                AbstractC0976n a2 = this.f91887e.mo3552a();
                AbstractC38878ae a3 = mo67584a(false);
                if (a3 != null) {
                    a2.mo3455a(a3.mo67538c());
                    a2.mo3473c();
                }
            }
            if ((this.f91883a instanceof ActivityC0945e) && (a = mo67584a(true)) != null) {
                this.f91905w.mo3552a().mo3455a(a.mo67538c()).mo3473c();
            }
            AbstractC38883ai aiVar = this.f91888f;
            if (aiVar != null) {
                aiVar.mo67488c();
                this.f91888f = null;
            }
            TopPageActionV2 topPageActionV2 = this.f91890h;
            if (topPageActionV2 != null) {
                topPageActionV2.mo67488c();
                this.f91890h = null;
            }
            this.f91892j.mo60188a(this);
            Handler handler = this.f91893k;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f91893k = null;
                this.f91894l = null;
            }
            C38748i.m78602g(this.f91884b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r4 = mo67584a(false);
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67561d() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p.mo67561d():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    public final void mo67555a() {
        AbstractC38878ae b;
        float f;
        if (!this.f91901s) {
            int i = this.f91889g;
            if (i == 0 || i == 1) {
                CardStruct a = C38748i.m78595a(this.f91884b);
                int width = this.f91885c.getWidth();
                int b2 = (int) C13628n.m24520b(this.f91883a, 138.0f);
                if (a != null) {
                    int cardStyle = a.getCardStyle();
                    if (cardStyle != 0) {
                        if (cardStyle == 1) {
                            f = C13628n.m24520b(this.f91883a, 130.0f);
                        } else if (cardStyle == 2) {
                            width = (int) C13628n.m24520b(this.f91883a, 260.0f);
                        }
                    } else if (a.getCardType() == 2) {
                        f = C13628n.m24520b(this.f91883a, 147.0f);
                    }
                    b2 = (int) f;
                }
                this.f91885c.mo67317b(width, b2);
            } else if (i == 2) {
                this.f91885c.mo67317b((int) (((float) C13628n.m24504a(this.f91883a)) - (C13628n.m24520b(this.f91883a, 12.0f) * 2.0f)), (int) C13628n.m24520b(this.f91883a, 112.0f));
            }
            if (this.f91889g == 0) {
                C38748i.m78596a(this.f91883a, this.f91884b, this.f91885c);
            }
            this.f91885c.setInCleanMode(false);
            this.f91885c.mo67320d();
            this.f91885c.mo67316b();
            this.f91886d.mo67347b();
            if (C37663b.f89031b.mo65688a() != null && C37663b.f89031b.mo65688a().mo65682n(this.f91884b)) {
                C37663b.f89031b.mo65688a().mo65652a(this.f91884b);
            }
            Integer num = null;
            if (!(C37663b.f89031b.mo65688a() == null || (b = C37663b.f89031b.mo65688a().mo65662b(this.f91884b)) == null)) {
                Context context = this.f91883a;
                Aweme aweme = this.f91884b;
                C89219l.m154721d(b, "");
                IAdCardService c = AdCardServiceImpl.m75807c();
                CardStruct a2 = C38748i.m78595a(aweme);
                if (a2 != null) {
                    num = Integer.valueOf(a2.getCardType());
                }
                AbstractC38883ai a3 = c.mo65442a(num, context, aweme, b);
                this.f91888f = a3;
                a3.mo67482a(this.f91892j);
                b.mo67532a(new AbstractC38878ae.AbstractC38879a() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p.C389081 */

                    static {
                        Covode.recordClassIndex(46495);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: a */
                    public final void mo67553a() {
                        C38907p.this.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: b */
                    public final void mo67554b() {
                        if (C38907p.this.f91888f == null || !C38907p.this.f91888f.mo67494i()) {
                            C38907p.this.f91892j.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                        } else {
                            C38907p.this.f91892j.mo60191a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) true);
                        }
                    }
                });
                View a4 = C38748i.m78594a(this.f91885c);
                if (a4 != null) {
                    AbstractC0976n a5 = this.f91887e.mo3552a();
                    a5.mo3470b(a4.getId(), b.mo67538c(), "card_default");
                    a5.mo3473c();
                }
            }
            mo67558b();
            this.f91892j.mo60189a("ACTION_HALF_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ACTION_HALF_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ACTION_HALF_WEB_PAGE_COLLAPSE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ACTION_TOP_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ad_comment_dialog_visible", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ad_share_dialog_visible", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("on_ad_light_web_page_show", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("on_ad_light_web_page_hide", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_COMMON_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_COMMON_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_FORM_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_FORM_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_LYNX_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_AD_LYNX_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_SIMILAR_ADVERT_DATA_RECEIVE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ON_SIMILAR_ADVERT_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("ad_on_live_link_user_count_changed", (AbstractC1214u<C33942b>) this);
            this.f91892j.mo60189a("SET_HALF_WEB_PAGE_REAL_SHOW", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: b */
    public final void mo67558b() {
        Context context;
        CardStruct o;
        if (!this.f91901s && C37663b.f89031b.mo65688a() != null && (context = this.f91883a) != null && (context instanceof ActivityC0945e)) {
            this.f91905w = ((ActivityC0945e) context).getSupportFragmentManager();
            if (C67248d.m119174b()) {
                if (((ActivityC0945e) this.f91883a).findViewById(R.id.fhh) != null) {
                    m78995a((Activity) this.f91883a, (int) R.id.fhh);
                }
                if (((ActivityC0945e) this.f91883a).findViewById(R.id.fhr) != null) {
                    m78995a((Activity) this.f91883a, (int) R.id.fhr);
                }
            }
            this.f91904v = (AdHalfWebPageContainer) ((ActivityC0945e) this.f91883a).findViewById(R.id.g7);
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = (AdHalfWebPageMaskLayer) ((ActivityC0945e) this.f91883a).findViewById(R.id.g8);
            this.f91891i = adHalfWebPageMaskLayer;
            if (this.f91905w != null && this.f91904v != null && adHalfWebPageMaskLayer != null) {
                if (C37663b.f89031b.mo65688a() == null || (o = C37663b.f89031b.mo65688a().mo65683o(this.f91884b)) == null) {
                    this.f91904v.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f91904v.getLayoutParams();
                layoutParams.height = C38748i.m78593a(o, this.f91904v);
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.f91904v.mo67316b();
                this.f91904v.setLayoutParams(layoutParams);
                this.f91891i.mo67347b();
                AbstractC0976n a = this.f91905w.mo3552a();
                AbstractC38878ae c = C37663b.f89031b.mo65688a().mo65665c(this.f91884b);
                c.mo67532a(new AbstractC38878ae.AbstractC38879a() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p.C389092 */

                    static {
                        Covode.recordClassIndex(46496);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: a */
                    public final void mo67553a() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: b */
                    public final void mo67554b() {
                        C38907p.this.f91892j.mo60191a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                    }
                });
                TopPageActionV2 topPageActionV2 = new TopPageActionV2(this.f91883a, this.f91884b, c);
                this.f91890h = topPageActionV2;
                topPageActionV2.mo67482a(this.f91892j);
                this.f91890h.f91785i = new C38915q(this);
                a.mo3454a(R.id.g7, c.mo67538c(), "card_tag_top_page");
                a.mo3471b(c.mo67538c()).mo3473c();
            }
        }
    }

    /* synthetic */ C38907p(byte b) {
        this();
    }

    /* renamed from: a */
    private void m78996a(C38234e eVar) {
        boolean z;
        if (this.f91885c.mo67315a()) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f91885c;
            if (C38748i.m78601f(this.f91884b) || this.f91889g == 2) {
                z = true;
            } else {
                z = false;
            }
            adHalfWebPageContainer.mo67318b(z);
            this.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_HIDE_START", (Object) null);
            this.f91885c.postDelayed(new RunnableC38918t(this), 200);
            this.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_HIDE", eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo67586b(boolean z) {
        boolean a;
        AbstractC38878ae a2 = mo67584a(z);
        if (a2 == null) {
            return "data_load_fail";
        }
        boolean e = a2.mo67540e();
        if (z) {
            a = m78997a(e, this.f91890h);
        } else {
            a = m78997a(e, this.f91888f);
        }
        if (a) {
            return null;
        }
        if (!e) {
            return "data_load_fail";
        }
        return "load_timeout";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC38878ae mo67584a(boolean z) {
        if (z) {
            AbstractC0952i iVar = this.f91905w;
            if (iVar == null) {
                return null;
            }
            Fragment a = iVar.mo3551a("card_tag_top_page");
            if (a instanceof AbstractC38878ae) {
                return (AbstractC38878ae) a;
            }
            return null;
        }
        AbstractC0952i iVar2 = this.f91887e;
        if (iVar2 == null) {
            return null;
        }
        Fragment a2 = iVar2.mo3551a("card_default");
        if (a2 instanceof AbstractC38878ae) {
            return (AbstractC38878ae) a2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r3 = mo67584a(true);
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67556a(int r7) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p.mo67556a(int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e3  */
    @Override // androidx.lifecycle.AbstractC1214u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r6) {
        /*
        // Method dump skipped, instructions count: 794
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38907p.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67585a(String str) {
        this.f91892j.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", str);
        if (C37663b.f89031b.mo65688a() != null) {
            C37663b.f89031b.mo65688a().mo65653a(this.f91884b, str);
        }
        C38875ac.f91817a.mo67545a(this.f91884b, str);
    }

    /* renamed from: a */
    private boolean m78997a(boolean z, AbstractC38883ai aiVar) {
        if (this.f91888f instanceof AbsAdCardActionV2) {
            return ((AbsAdCardActionV2) aiVar).mo67477a();
        }
        return z;
    }

    /* renamed from: a */
    private static void m78995a(Activity activity, int i) {
        MethodCollector.m26663i(8428);
        ((ViewStub) activity.findViewById(i)).inflate();
        MethodCollector.m26664o(8428);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: b */
    public final void mo67559b(int i, int i2) {
        if (!this.f91901s) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f91904v.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C34728n.m70947a(this.f91883a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C34728n.m70947a(this.f91883a, i2);
                }
                this.f91904v.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    public final void mo67557a(int i, int i2) {
        if (!this.f91901s) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f91885c.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C34728n.m70947a(this.f91883a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C34728n.m70947a(this.f91883a, i2);
                }
                this.f91885c.setLayoutParams(layoutParams);
            }
        }
    }
}
