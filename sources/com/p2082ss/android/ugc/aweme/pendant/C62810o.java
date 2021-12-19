package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.pendant.C62766b;
import com.p2082ss.android.ugc.aweme.pendant.C62795i;
import com.p2082ss.android.ugc.aweme.pendant.C62802k;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.o */
public final class C62810o implements AbstractC62771e {

    /* renamed from: m */
    public static final C62811a f142422m = new C62811a((byte) 0);

    /* renamed from: a */
    public final UgAwemeActivitySetting f142423a;

    /* renamed from: b */
    public C62821p f142424b;

    /* renamed from: c */
    public final View f142425c;

    /* renamed from: d */
    public int f142426d;

    /* renamed from: e */
    public int f142427e = -1;

    /* renamed from: f */
    public boolean f142428f;

    /* renamed from: g */
    public boolean f142429g;

    /* renamed from: h */
    public boolean f142430h;

    /* renamed from: i */
    public final String f142431i = "newpendant";

    /* renamed from: j */
    public final AbstractC62769c f142432j = new C62797j();

    /* renamed from: k */
    public String f142433k = "";

    /* renamed from: l */
    public final ActivityC0945e f142434l;

    /* renamed from: n */
    private int f142435n = 3;

    /* renamed from: o */
    private boolean f142436o;

    /* renamed from: p */
    private boolean f142437p;

    /* renamed from: q */
    private List<Integer> f142438q;

    static {
        Covode.recordClassIndex(73633);
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.o$a */
    public static final class C62811a {
        static {
            Covode.recordClassIndex(73634);
        }

        private C62811a() {
        }

        public /* synthetic */ C62811a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private final void m113200d() {
        C62821p pVar = this.f142424b;
        if (pVar != null) {
            pVar.mo100773b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.o$b */
    static final class CallableC62812b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C62810o f142439a;

        /* renamed from: b */
        final /* synthetic */ Context f142440b;

        static {
            Covode.recordClassIndex(73635);
        }

        CallableC62812b(C62810o oVar, Context context) {
            this.f142439a = oVar;
            this.f142440b = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.f142439a.mo100770b(this.f142440b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.o$c */
    static final class C62813c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C62810o f142441a;

        /* renamed from: b */
        final /* synthetic */ Context f142442b;

        static {
            Covode.recordClassIndex(73636);
        }

        C62813c(C62810o oVar, Context context) {
            this.f142441a = oVar;
            this.f142442b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.o$c$a */
        public static final class C62814a implements AbstractC62804l {

            /* renamed from: a */
            final /* synthetic */ C62813c f142443a;

            /* renamed from: b */
            final /* synthetic */ C62802k.C62803a f142444b;

            static {
                Covode.recordClassIndex(73637);
            }

            @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
            /* renamed from: b */
            public final void mo100764b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62804l
            /* renamed from: a */
            public final void mo100763a() {
                try {
                    this.f142444b.f142405a = this.f142443a.f142441a.f142432j.mo100739a(0);
                    this.f142444b.f142406b = this.f142443a.f142441a.f142432j.mo100739a(1);
                    this.f142444b.f142407c = this.f142443a.f142441a.f142432j.mo100740a();
                    C62821p pVar = this.f142443a.f142441a.f142424b;
                    if (pVar != null) {
                        pVar.mo100758a(this.f142444b.mo100765a());
                    }
                } catch (Exception unused) {
                }
            }

            C62814a(C62813c cVar, C62802k.C62803a aVar) {
                this.f142443a = cVar;
                this.f142444b = aVar;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.pendant.o$c$b */
        public static final class C62815b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C62813c f142445a;

            static {
                Covode.recordClassIndex(73638);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62815b(C62813c cVar) {
                super(0);
                this.f142445a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String str;
                C62766b.C62768b.f142302a.mo100738b();
                if (this.f142445a.f142441a.f142424b != null) {
                    C62821p pVar = this.f142445a.f142441a.f142424b;
                    if (pVar == null) {
                        C89219l.m154715b();
                    }
                    boolean z = !pVar.getCollapsed();
                    C33744d dVar = new C33744d();
                    if (z) {
                        str = "big";
                    } else {
                        str = "small";
                    }
                    C39162r.m79460a("homepage_decoration_close", dVar.mo59983a("decoration_type", str).f79943a);
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.pendant.o$c$c */
        public static final class C62816c extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C62813c f142446a;

            static {
                Covode.recordClassIndex(73639);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62816c(C62813c cVar) {
                super(0);
                this.f142446a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C62821p pVar = this.f142446a.f142441a.f142424b;
                if (pVar == null || !pVar.getCollapsed() || !this.f142446a.f142441a.f142428f) {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting = this.f142446a.f142441a.f142423a;
                        if (ugAwemeActivitySetting == null) {
                            C89219l.m154715b();
                        }
                        UgNewFeedPendant newFeedPendant = ugAwemeActivitySetting.getNewFeedPendant();
                        C89219l.m154716b(newFeedPendant, "");
                        String h5Link = newFeedPendant.getH5Link();
                        if (this.f142446a.f142442b != null) {
                            UgAllServiceImpl.m65444c().mo57254a(this.f142446a.f142442b, h5Link);
                            C39162r.m79460a("enter_activity_page", new C33744d().mo59983a("enter_from", "feed").f79943a);
                        }
                    } catch (C16041a unused) {
                    }
                } else {
                    C62821p pVar2 = this.f142446a.f142441a.f142424b;
                    if (pVar2 != null) {
                        pVar2.mo100714a((AbstractC89171a<C89391z>) null);
                    }
                    this.f142446a.f142441a.f142426d = 0;
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.pendant.o$c$d */
        public static final class C62817d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C62813c f142447a;

            static {
                Covode.recordClassIndex(73640);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62817d(C62813c cVar) {
                super(0);
                this.f142447a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C39162r.m79460a("homepage_decoration_show", new C33744d().f79943a);
                if (this.f142447a.f142441a.mo100768a()) {
                    C62821p pVar = this.f142447a.f142441a.f142424b;
                    if (pVar != null) {
                        pVar.mo100772a();
                    }
                    if (this.f142447a.f142442b != null) {
                        C62766b bVar = C62766b.C62768b.f142302a;
                        C89219l.m154721d(this.f142447a.f142442b, "");
                        Calendar instance = Calendar.getInstance();
                        C89219l.m154716b(instance, "");
                        instance.setTimeInMillis(System.currentTimeMillis());
                        instance.set(11, 0);
                        instance.set(12, 0);
                        instance.set(13, 0);
                        instance.set(14, 0);
                        bVar.mo100734a().storeString(C62766b.f142287b, String.valueOf(instance.getTimeInMillis()));
                        C62766b.C62768b.f142302a.mo100735a(this.f142447a.f142442b);
                    }
                }
                AwemeChangeCallBack.m108594a(this.f142447a.f142441a.f142434l, this.f142447a.f142441a.f142434l, new AwemeChangeCallBack.AbstractC59111a(this) {
                    /* class com.p2082ss.android.ugc.aweme.pendant.C62810o.C62813c.C62817d.C628181 */

                    /* renamed from: a */
                    final /* synthetic */ C62817d f142448a;

                    static {
                        Covode.recordClassIndex(73641);
                    }

                    {
                        this.f142448a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.AbstractC59111a
                    /* renamed from: a */
                    public final void mo37101a(Aweme aweme) {
                        this.f142448a.f142447a.f142441a.mo100769b(true);
                    }
                });
                C69488a a = C69488a.C69489a.m122709a(this.f142447a.f142441a.f142434l);
                C628192 r1 = new C69488a.AbstractC69490b(this) {
                    /* class com.p2082ss.android.ugc.aweme.pendant.C62810o.C62813c.C62817d.C628192 */

                    /* renamed from: a */
                    final /* synthetic */ C62817d f142449a;

                    static {
                        Covode.recordClassIndex(73642);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
                    /* renamed from: a */
                    public final void mo87085a() {
                        C62821p pVar = this.f142449a.f142447a.f142441a.f142424b;
                        if (pVar != null) {
                            pVar.mo100773b();
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
                    /* renamed from: b */
                    public final void mo87086b() {
                        C62821p pVar;
                        if (this.f142449a.f142447a.f142441a.mo100768a() && (pVar = this.f142449a.f142447a.f142441a.f142424b) != null) {
                            pVar.mo100772a();
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f142449a = r1;
                    }
                };
                C89219l.m154721d(r1, "");
                a.mo109735a("long_press_layer", r1);
                C69488a a2 = C69488a.C69489a.m122709a(this.f142447a.f142441a.f142434l);
                C628203 r12 = new C69488a.AbstractC69490b(this) {
                    /* class com.p2082ss.android.ugc.aweme.pendant.C62810o.C62813c.C62817d.C628203 */

                    /* renamed from: a */
                    final /* synthetic */ C62817d f142450a;

                    static {
                        Covode.recordClassIndex(73643);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
                    /* renamed from: a */
                    public final void mo87085a() {
                        C62821p pVar = this.f142450a.f142447a.f142441a.f142424b;
                        if (pVar != null) {
                            pVar.mo100773b();
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a.AbstractC69490b
                    /* renamed from: b */
                    public final void mo87086b() {
                        C62821p pVar;
                        if (this.f142450a.f142447a.f142441a.mo100768a() && (pVar = this.f142450a.f142447a.f142441a.f142424b) != null) {
                            pVar.mo100772a();
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f142450a = r1;
                    }
                };
                C89219l.m154721d(r12, "");
                a2.mo109735a("upload_progress_fragment", r12);
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1731i<Boolean> iVar) {
            int i;
            UgNewFeedPendant newFeedPendant;
            List<UrlModel> resourceUrl;
            List<String> list;
            List<String> list2;
            UgNewFeedPendant newFeedPendant2;
            UgNewFeedPendant newFeedPendant3;
            UgNewFeedPendant newFeedPendant4;
            List<UrlModel> resourceUrl2;
            String str;
            List<String> list3;
            UgNewFeedPendant newFeedPendant5;
            UgNewFeedPendant newFeedPendant6;
            MethodCollector.m26663i(7153);
            C89219l.m154716b(iVar, "");
            Boolean d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            if (d.booleanValue()) {
                C62795i.C62796a aVar = new C62795i.C62796a();
                C62816c cVar = new C62816c(this);
                C62815b bVar = new C62815b(this);
                C62817d dVar = new C62817d(this);
                aVar.f142373a = this.f142441a.f142429g;
                aVar.f142374b = this.f142441a.f142430h;
                aVar.f142375c = cVar;
                aVar.f142376d = bVar;
                aVar.f142377e = dVar;
                this.f142441a.f142424b = new C62821p(this.f142441a.f142427e, new C62795i(aVar, (byte) 0), this.f142442b, (byte) 0);
                float e = ((float) C13628n.m24525e(this.f142442b)) + 0.0f;
                if (this.f142441a.f142425c instanceof FrameLayout) {
                    ((FrameLayout) this.f142441a.f142425c).addView(this.f142441a.f142424b);
                }
                int c = C13628n.m24522c(this.f142441a.f142434l, e);
                C62810o oVar = this.f142441a;
                int a = C13628n.m24504a(oVar.f142434l);
                if (C13628n.m24521b(oVar.f142434l) <= 1280 || a <= 720) {
                    i = 54;
                } else {
                    i = 64;
                }
                int i2 = c + i;
                C62821p pVar = this.f142441a.f142424b;
                if (pVar == null) {
                    C89219l.m154715b();
                }
                ViewGroup.LayoutParams layoutParams = pVar.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i3 = layoutParams2.topMargin;
                    layoutParams2.topMargin = (int) C13628n.m24520b(this.f142441a.f142434l, (float) i2);
                    C62821p pVar2 = this.f142441a.f142424b;
                    if (pVar2 == null) {
                        C89219l.m154715b();
                    }
                    pVar2.setLayoutParams(layoutParams);
                }
                C62802k.C62803a aVar2 = new C62802k.C62803a();
                int i4 = this.f142441a.f142427e;
                if (i4 == 0) {
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting = this.f142441a.f142423a;
                        if (ugAwemeActivitySetting == null || (newFeedPendant3 = ugAwemeActivitySetting.getNewFeedPendant()) == null) {
                            list = null;
                        } else {
                            list = newFeedPendant3.getBigPngFragmentsUrls();
                        }
                        aVar2.f142410f = list;
                        UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f142441a.f142423a;
                        if (ugAwemeActivitySetting2 == null || (newFeedPendant2 = ugAwemeActivitySetting2.getNewFeedPendant()) == null) {
                            list2 = null;
                        } else {
                            list2 = newFeedPendant2.getSmallPngFragmentsUrls();
                        }
                        aVar2.f142411g = list2;
                    } catch (C16041a unused) {
                    }
                    UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f142441a.f142423a;
                    if (!(ugAwemeActivitySetting3 == null || (newFeedPendant = ugAwemeActivitySetting3.getNewFeedPendant()) == null || (resourceUrl = newFeedPendant.getResourceUrl()) == null || resourceUrl.size() != 2)) {
                        aVar2.f142408d = resourceUrl.get(0);
                        aVar2.f142409e = resourceUrl.get(1);
                        C62821p pVar3 = this.f142441a.f142424b;
                        if (pVar3 != null) {
                            pVar3.mo100758a(aVar2.mo100765a());
                        }
                    }
                } else if (i4 == 1) {
                    UgAwemeActivitySetting ugAwemeActivitySetting4 = this.f142441a.f142423a;
                    if (!(ugAwemeActivitySetting4 == null || (newFeedPendant4 = ugAwemeActivitySetting4.getNewFeedPendant()) == null || (resourceUrl2 = newFeedPendant4.getResourceUrl()) == null || resourceUrl2.size() != 2)) {
                        aVar2.f142408d = resourceUrl2.get(0);
                        aVar2.f142409e = resourceUrl2.get(1);
                        C62821p pVar4 = this.f142441a.f142424b;
                        if (pVar4 != null) {
                            pVar4.mo100758a(aVar2.mo100765a());
                        }
                    }
                } else if (i4 == 2) {
                    C62814a aVar3 = new C62814a(this, aVar2);
                    try {
                        UgAwemeActivitySetting ugAwemeActivitySetting5 = this.f142441a.f142423a;
                        if (ugAwemeActivitySetting5 == null || (newFeedPendant6 = ugAwemeActivitySetting5.getNewFeedPendant()) == null) {
                            str = null;
                        } else {
                            str = newFeedPendant6.getLottieFileMd5();
                        }
                        UgAwemeActivitySetting ugAwemeActivitySetting6 = this.f142441a.f142423a;
                        if (ugAwemeActivitySetting6 == null || (newFeedPendant5 = ugAwemeActivitySetting6.getNewFeedPendant()) == null) {
                            list3 = null;
                        } else {
                            list3 = newFeedPendant5.getLottieFileZip();
                        }
                        if (!(str == null || list3 == null)) {
                            this.f142441a.f142432j.mo100743a(this.f142441a.f142433k, list3, str);
                        }
                        this.f142441a.f142432j.mo100742a(aVar3);
                        this.f142441a.f142432j.mo100741a(this.f142442b);
                    } catch (C16041a unused2) {
                    }
                }
            }
            MethodCollector.m26664o(7153);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo100768a() {
        if (m113199c() || !m113197b() || this.f142436o || C69488a.C69489a.m122709a(this.f142434l).mo109737a("long_press_layer") || C69488a.C69489a.m122709a(this.f142434l).mo109737a("upload_progress_fragment")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m113197b() {
        ActivityC0945e eVar = this.f142434l;
        if ((eVar instanceof AbstractC59103j) && (((AbstractC59103j) eVar).getCurFragment() instanceof AbstractC59105l)) {
            Fragment curFragment = ((AbstractC59103j) this.f142434l).getCurFragment();
            Objects.requireNonNull(curFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            if (((AbstractC59105l) curFragment).mo96548m()) {
                return true;
            }
        }
        ActivityC0945e eVar2 = this.f142434l;
        if ((eVar2 instanceof AbstractC59103j) && (((AbstractC59103j) eVar2).getCurFragment() instanceof AbstractC59105l)) {
            Fragment curFragment2 = ((AbstractC59103j) this.f142434l).getCurFragment();
            Objects.requireNonNull(curFragment2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
            if (((AbstractC59105l) curFragment2).mo96549n()) {
                return this.f142437p;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m113199c() {
        Aweme a = AwemeChangeCallBack.m108593a(this.f142434l);
        if (a == null) {
            return true;
        }
        C37437a commerceVideoAuthInfo = a.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.isAvoidGlobalPendant()) {
            return true;
        }
        if (!C37699a.m76314s(a)) {
            return false;
        }
        if (!C37699a.m76221X(a) || C37699a.m76274at(a)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62771e
    /* renamed from: a */
    public final void mo100748a(boolean z) {
        this.f142436o = z;
        mo100769b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo100769b(boolean z) {
        if (mo100768a()) {
            m113198c(z);
        } else {
            m113200d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62771e
    /* renamed from: a */
    public final void mo100747a(Context context) {
        if (context != null) {
            C1731i.m5640b(new CallableC62812b(this, context), C1731i.f5562a).mo5534a(new C62813c(this, context), C1731i.f5564c, null);
        }
    }

    /* renamed from: c */
    private final void m113198c(boolean z) {
        C62821p pVar;
        C62821p pVar2 = this.f142424b;
        if (pVar2 != null && !pVar2.getClosed()) {
            pVar2.mo100772a();
        }
        C62821p pVar3 = this.f142424b;
        if (pVar3 != null && pVar3.getVisibility() == 0 && z) {
            this.f142426d++;
        }
        if (this.f142426d >= this.f142435n && (pVar = this.f142424b) != null) {
            pVar.mo100774c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:41|42|43|44|(1:46)|47|(1:49)|50|(1:52)|53|54|(1:56)|(3:57|58|(1:60)(1:68))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:20|21|22|23|25|26|27|28|29|30|31|32|33|34|37|(15:41|42|43|44|(1:46)|47|(1:49)|50|(1:52)|53|54|(1:56)|57|58|(1:60)(1:68))(1:40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r1 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ec */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x012d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0187 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102 A[Catch:{ a -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f A[Catch:{ a -> 0x012d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c A[Catch:{ a -> 0x012d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186 A[Catch:{ a -> 0x0187 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a3 A[Catch:{ a -> 0x01a4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo100770b(android.content.Context r7) {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.pendant.C62810o.mo100770b(android.content.Context):boolean");
    }

    public C62810o(View view, ActivityC0945e eVar, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        this.f142434l = eVar;
        this.f142423a = ugAwemeActivitySetting;
        this.f142425c = view;
    }
}
