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
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AbstractC37687t;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38234e;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38742g;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38748i;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p2082ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38866ab;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2300h.AbstractC33279b;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.e */
public final class C38888e implements AbstractC1214u<C33942b>, AbstractC38880af {

    /* renamed from: a */
    public Context f91836a;

    /* renamed from: b */
    public Aweme f91837b;

    /* renamed from: c */
    public AdHalfWebPageContainer f91838c;

    /* renamed from: d */
    public AdHalfWebPageMaskLayer f91839d;

    /* renamed from: e */
    public AbstractC0952i f91840e;

    /* renamed from: f */
    public AbstractC38883ai f91841f;

    /* renamed from: g */
    public int f91842g;

    /* renamed from: h */
    TopPageAction f91843h;

    /* renamed from: i */
    public AdHalfWebPageMaskLayer f91844i;

    /* renamed from: j */
    Integer f91845j;

    /* renamed from: k */
    Integer f91846k;

    /* renamed from: l */
    Integer f91847l;

    /* renamed from: m */
    public DataCenter f91848m;

    /* renamed from: n */
    Handler f91849n;

    /* renamed from: o */
    Runnable f91850o;

    /* renamed from: p */
    long f91851p;

    /* renamed from: q */
    long f91852q;

    /* renamed from: r */
    public AbstractC48149ai f91853r;

    /* renamed from: s */
    boolean f91854s;

    /* renamed from: t */
    String f91855t;

    /* renamed from: u */
    boolean f91856u;

    /* renamed from: v */
    IAdCardService f91857v;

    /* renamed from: w */
    private AdHalfWebPageContainer f91858w;

    /* renamed from: x */
    private AbstractC0952i f91859x;

    /* renamed from: y */
    private C38742g f91860y;

    /* renamed from: z */
    private AbstractC33279b f91861z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.e$a */
    public static class C38896a {

        /* renamed from: a */
        public C38888e f91871a = new C38888e((byte) 0);

        static {
            Covode.recordClassIndex(46483);
        }
    }

    static {
        Covode.recordClassIndex(46475);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: f */
    public final void mo67563f() {
        if (!this.f91854s) {
            m78967h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: g */
    public final void mo67564g() {
        if (!this.f91854s) {
            m78968i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: e */
    public final void mo67562e() {
        if (!this.f91854s) {
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = this.f91839d;
            if (adHalfWebPageMaskLayer != null && adHalfWebPageMaskLayer.f91585a) {
                this.f91839d.mo67348c();
            }
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer2 = this.f91844i;
            if (adHalfWebPageMaskLayer2 != null && adHalfWebPageMaskLayer2.f91585a) {
                this.f91844i.mo67348c();
            }
        }
    }

    private C38888e() {
        this.f91845j = -100;
        this.f91846k = -100;
        this.f91847l = 0;
        this.f91848m = new DataCenter();
        this.f91849n = new Handler(Looper.getMainLooper());
        this.f91851p = -1;
        this.f91852q = -1;
        this.f91854s = false;
        this.f91855t = null;
        this.f91856u = false;
        this.f91857v = AdCardServiceImpl.m75807c();
    }

    /* renamed from: h */
    private void m78967h() {
        if (this.f91850o != null && this.f91851p > 0 && this.f91852q > 0) {
            this.f91852q = System.currentTimeMillis();
            this.f91849n.removeCallbacks(this.f91850o);
            this.f91849n.postDelayed(this.f91850o, this.f91851p);
        }
    }

    /* renamed from: i */
    private void m78968i() {
        if (this.f91850o != null && this.f91852q > 0) {
            long j = this.f91851p;
            if (j > 0) {
                this.f91851p = j - (System.currentTimeMillis() - this.f91852q);
                this.f91849n.removeCallbacks(this.f91850o);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: b */
    public final void mo67558b() {
        Context context;
        if (!this.f91854s && (context = this.f91836a) != null && (context instanceof ActivityC0945e)) {
            this.f91859x = ((ActivityC0945e) context).getSupportFragmentManager();
            if (C67248d.m119174b()) {
                if (((ActivityC0945e) this.f91836a).findViewById(R.id.fhh) != null) {
                    m78964a((Activity) this.f91836a, (int) R.id.fhh);
                }
                if (((ActivityC0945e) this.f91836a).findViewById(R.id.fhr) != null) {
                    m78964a((Activity) this.f91836a, (int) R.id.fhr);
                }
            }
            this.f91858w = (AdHalfWebPageContainer) ((ActivityC0945e) this.f91836a).findViewById(R.id.g7);
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = (AdHalfWebPageMaskLayer) ((ActivityC0945e) this.f91836a).findViewById(R.id.g8);
            this.f91844i = adHalfWebPageMaskLayer;
            if (this.f91859x != null && this.f91858w != null && adHalfWebPageMaskLayer != null) {
                CardStruct ar = C37699a.m76272ar(this.f91837b);
                if (ar == null) {
                    this.f91858w.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f91858w.getLayoutParams();
                layoutParams.height = C38748i.m78593a(ar, this.f91858w);
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.f91858w.mo67316b();
                this.f91858w.setLayoutParams(layoutParams);
                this.f91844i.mo67347b();
                AbstractC0976n a = this.f91859x.mo3552a();
                C38866ab a2 = C38866ab.C38867a.m78904a(C38739d.m78574b(this.f91837b));
                a2.mo67532a(new AbstractC38878ae.AbstractC38879a() {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e.C388902 */

                    static {
                        Covode.recordClassIndex(46477);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: a */
                    public final void mo67553a() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                    /* renamed from: b */
                    public final void mo67554b() {
                        C38888e.this.f91848m.mo60191a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                    }
                });
                TopPageAction topPageAction = new TopPageAction(this.f91836a, this.f91837b, a2);
                this.f91843h = topPageAction;
                topPageAction.mo67482a(this.f91848m);
                this.f91843h.f91782i = new C38897f(this);
                a.mo3454a(R.id.g7, a2.mo67538c(), "card_tag_top_page");
                a.mo3471b(a2.mo67538c()).mo3473c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: c */
    public final void mo67560c() {
        AbstractC38878ae a;
        IAdCardService iAdCardService = this.f91857v;
        if (iAdCardService != null) {
            iAdCardService.mo65444b().mo67551f(this.f91837b);
        }
        if (!this.f91854s) {
            this.f91854s = true;
            AdHalfWebPageContainer adHalfWebPageContainer = this.f91838c;
            if (adHalfWebPageContainer != null && adHalfWebPageContainer.mo67315a()) {
                this.f91841f.mo67491f();
            }
            if (!(this.f91840e == null || mo67573a(false) == null)) {
                AbstractC0976n a2 = this.f91840e.mo3552a();
                AbstractC38878ae a3 = mo67573a(false);
                if (a3 != null) {
                    a2.mo3455a(a3.mo67538c());
                    a2.mo3473c();
                }
            }
            if ((this.f91836a instanceof ActivityC0945e) && (a = mo67573a(true)) != null) {
                this.f91859x.mo3552a().mo3455a(a.mo67538c()).mo3473c();
            }
            AbstractC38883ai aiVar = this.f91841f;
            if (aiVar != null) {
                aiVar.mo67488c();
                this.f91841f = null;
            }
            TopPageAction topPageAction = this.f91843h;
            if (topPageAction != null) {
                topPageAction.mo67488c();
                this.f91843h = null;
            }
            this.f91848m.mo60188a(this);
            Handler handler = this.f91849n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f91849n = null;
                this.f91850o = null;
            }
            C38748i.m78602g(this.f91837b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r4 = mo67573a(false);
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67561d() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e.mo67561d():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    public final void mo67555a() {
        Integer num;
        float f;
        if (!this.f91854s) {
            int i = this.f91842g;
            if (i == 0 || i == 1) {
                CardStruct a = C38748i.m78595a(this.f91837b);
                int width = this.f91838c.getWidth();
                int b = (int) C13628n.m24520b(this.f91836a, 138.0f);
                if (a != null) {
                    int cardStyle = a.getCardStyle();
                    if (cardStyle != 0) {
                        if (cardStyle == 1) {
                            f = C13628n.m24520b(this.f91836a, 130.0f);
                        } else if (cardStyle == 2) {
                            width = (int) C13628n.m24520b(this.f91836a, 260.0f);
                        }
                    } else if (a.getCardType() == 2) {
                        f = C13628n.m24520b(this.f91836a, 147.0f);
                    }
                    b = (int) f;
                }
                this.f91838c.mo67317b(width, b);
            } else if (i == 2) {
                int b2 = (int) C13628n.m24520b(this.f91836a, 112.0f);
                this.f91838c.mo67317b((int) (((float) C13628n.m24504a(this.f91836a)) - (C13628n.m24520b(this.f91836a, 12.0f) * 2.0f)), b2);
            }
            if (this.f91842g == 0) {
                C38748i.m78596a(this.f91836a, this.f91837b, this.f91838c);
            }
            this.f91838c.setInCleanMode(false);
            this.f91838c.mo67320d();
            this.f91838c.mo67316b();
            this.f91839d.mo67347b();
            if (C37699a.m76290d(this.f91837b)) {
                C81570a.f182403c = C37699a.m76292e(this.f91837b);
                C81570a.f182404d = C37699a.m76272ar(this.f91837b);
                C81570a.f182406f = 1;
                C81570a.f182407g = this.f91837b;
            }
            C38866ab a2 = C38866ab.C38867a.m78904a(C38739d.m78572a(this.f91837b));
            Context context = this.f91836a;
            Aweme aweme = this.f91837b;
            C89219l.m154721d(a2, "");
            AbstractC37687t a3 = C37663b.f89031b.mo65688a();
            if (a3 == null) {
                C89219l.m154715b();
            }
            CardStruct a4 = C38748i.m78595a(aweme);
            if (a4 != null) {
                num = Integer.valueOf(a4.getCardType());
            } else {
                num = null;
            }
            AbstractC38883ai a5 = a3.mo65648a(num, context, aweme, a2);
            this.f91841f = a5;
            a5.mo67482a(this.f91848m);
            a2.mo67532a(new AbstractC38878ae.AbstractC38879a() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e.C388891 */

                static {
                    Covode.recordClassIndex(46476);
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                /* renamed from: a */
                public final void mo67553a() {
                    C38888e.this.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38878ae.AbstractC38879a
                /* renamed from: b */
                public final void mo67554b() {
                    if (C38888e.this.f91841f == null || !C38888e.this.f91841f.mo67494i()) {
                        C38888e.this.f91848m.mo60191a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                    } else {
                        C38888e.this.f91848m.mo60191a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) true);
                    }
                }
            });
            View a6 = C38748i.m78594a(this.f91838c);
            if (a6 != null) {
                AbstractC0976n a7 = this.f91840e.mo3552a();
                a7.mo3470b(a6.getId(), a2.mo67538c(), "card_default");
                a7.mo3473c();
            }
            mo67558b();
            this.f91848m.mo60189a("ACTION_HALF_WEB_PAGE_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ACTION_HALF_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ACTION_HALF_WEB_PAGE_COLLAPSE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ACTION_TOP_WEB_PAGE_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ad_comment_dialog_visible", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ad_share_dialog_visible", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("on_ad_light_web_page_show", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("on_ad_light_web_page_hide", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_COMMON_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_COMMON_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_FORM_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_FORM_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_LYNX_MASK_SHOW", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_AD_LYNX_MASK_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_SIMILAR_ADVERT_DATA_RECEIVE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ON_SIMILAR_ADVERT_HIDE", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("ad_on_live_link_user_count_changed", (AbstractC1214u<C33942b>) this);
            this.f91848m.mo60189a("SET_HALF_WEB_PAGE_REAL_SHOW", (AbstractC1214u<C33942b>) this);
        }
    }

    /* synthetic */ C38888e(byte b) {
        this();
    }

    /* renamed from: a */
    private void m78965a(C38234e eVar) {
        boolean z;
        if (this.f91838c.mo67315a()) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f91838c;
            if (C38748i.m78601f(this.f91837b) || this.f91842g == 2) {
                z = true;
            } else {
                z = false;
            }
            adHalfWebPageContainer.mo67318b(z);
            this.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_HIDE_START", (Object) null);
            this.f91838c.postDelayed(new RunnableC38900i(this), 200);
            this.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_HIDE", eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo67575b(boolean z) {
        boolean a;
        AbstractC38878ae a2 = mo67573a(z);
        if (a2 == null) {
            return "data_load_fail";
        }
        boolean e = a2.mo67540e();
        if (z) {
            a = m78966a(e, this.f91843h);
        } else {
            a = m78966a(e, this.f91841f);
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
    public final AbstractC38878ae mo67573a(boolean z) {
        if (z) {
            AbstractC0952i iVar = this.f91859x;
            if (iVar == null) {
                return null;
            }
            Fragment a = iVar.mo3551a("card_tag_top_page");
            if (a instanceof AbstractC38878ae) {
                return (AbstractC38878ae) a;
            }
            return null;
        }
        AbstractC0952i iVar2 = this.f91840e;
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
        r3 = mo67573a(true);
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67556a(int r7) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e.mo67556a(int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @Override // androidx.lifecycle.AbstractC1214u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r7) {
        /*
        // Method dump skipped, instructions count: 766
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38888e.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo67574a(String str) {
        this.f91848m.mo60191a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", str);
        C38747h.m78591b(this.f91837b, str, false);
        IAdCardService iAdCardService = this.f91857v;
        if (iAdCardService != null) {
            iAdCardService.mo65444b().mo67545a(this.f91837b, str);
        }
    }

    /* renamed from: a */
    private boolean m78966a(boolean z, AbstractC38883ai aiVar) {
        if (this.f91841f instanceof AbsAdCardAction) {
            return ((AbsAdCardAction) aiVar).mo67472a();
        }
        return z;
    }

    /* renamed from: a */
    private static void m78964a(Activity activity, int i) {
        MethodCollector.m26663i(8394);
        ((ViewStub) activity.findViewById(i)).inflate();
        MethodCollector.m26664o(8394);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: b */
    public final void mo67559b(int i, int i2) {
        if (!this.f91854s) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f91858w.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C34728n.m70947a(this.f91836a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C34728n.m70947a(this.f91836a, i2);
                }
                this.f91858w.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbstractC38880af
    /* renamed from: a */
    public final void mo67557a(int i, int i2) {
        if (!this.f91854s) {
            if (i != 0 || i2 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f91838c.getLayoutParams();
                if (i != 0) {
                    layoutParams.width = C34728n.m70947a(this.f91836a, i);
                }
                if (i2 != 0) {
                    layoutParams.height = C34728n.m70947a(this.f91836a, i2);
                }
                this.f91838c.setLayoutParams(layoutParams);
            }
        }
    }
}
