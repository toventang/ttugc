package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17040e;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63746h;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64121cr;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus */
public final class RecommendCommonUserViewMus extends RelativeLayout {

    /* renamed from: j */
    public static final int f145014j = 0;

    /* renamed from: k */
    public static final int f145015k = 1;

    /* renamed from: l */
    public static final int f145016l = 2;

    /* renamed from: m */
    public static final int f145017m = 3;

    /* renamed from: n */
    public static final C63955a f145018n = new C63955a((byte) 0);

    /* renamed from: a */
    public View f145019a;

    /* renamed from: b */
    public TuxTextView f145020b;

    /* renamed from: c */
    public RecyclerView f145021c;

    /* renamed from: d */
    public View f145022d;

    /* renamed from: e */
    public C64363i f145023e;

    /* renamed from: f */
    public String f145024f;

    /* renamed from: g */
    public String f145025g;

    /* renamed from: h */
    public AbstractC63956b f145026h;

    /* renamed from: i */
    public UserProfileRecommendUserVM f145027i;

    /* renamed from: o */
    private LinearLayout f145028o;

    /* renamed from: p */
    private TuxIconView f145029p;

    /* renamed from: q */
    private List<? extends User> f145030q;

    /* renamed from: r */
    private int f145031r;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$b */
    public interface AbstractC63956b {
        static {
            Covode.recordClassIndex(75397);
        }

        /* renamed from: a */
        void mo103534a();
    }

    public RecommendCommonUserViewMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$a */
    public static final class C63955a {
        static {
            Covode.recordClassIndex(75396);
        }

        private C63955a() {
        }

        public /* synthetic */ C63955a(byte b) {
            this();
        }
    }

    public final UserProfileRecommendUserVM getViewModel() {
        return this.f145027i;
    }

    public final Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f145933h;
    }

    public final List<User> getData() {
        return getAdapter().mo63369e();
    }

    public final float getViewHeightFromInnerAdapter() {
        return getAdapter().mo103922n();
    }

    static {
        Covode.recordClassIndex(75386);
    }

    /* renamed from: a */
    public final void mo103515a() {
        new C23144b(this).mo37640e(R.string.gfx).mo37637b();
    }

    public final C64363i getAdapter() {
        if (this.f145023e == null) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            this.f145023e = new C64363i(context);
        }
        return this.f145023e;
    }

    public final void setViewModel(UserProfileRecommendUserVM userProfileRecommendUserVM) {
        this.f145027i = userProfileRecommendUserVM;
    }

    public final void setSeeAllListener(AbstractC63956b bVar) {
        C89219l.m154721d(bVar, "");
        this.f145026h = bVar;
    }

    public final void setOnItemOperationListener(C64363i.AbstractC64365b bVar) {
        C89219l.m154721d(bVar, "");
        C64363i adapter = getAdapter();
        C89219l.m154721d(bVar, "");
        adapter.f145926a = bVar;
    }

    public final void setOnViewAttachedToWindowListener(AbstractC39097c<View$OnClickListenerC64123cs> cVar) {
        C89219l.m154721d(cVar, "");
        C64363i adapter = getAdapter();
        C89219l.m154721d(cVar, "");
        adapter.f145927b = cVar;
    }

    public final void setPageType(int i) {
        this.f145031r = i;
        getAdapter().f145932g = i;
        getAdapter().mo67829d(false);
        this.f145020b.setText(R.string.evs);
    }

    private /* synthetic */ RecommendCommonUserViewMus(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RecommendCommonUserViewMus(final Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7653);
        this.f145027i = null;
        View a = C1862a.m6032a(context, R.layout.apt, this, true);
        C89219l.m154716b(a, "");
        this.f145019a = a;
        View findViewById = a.findViewById(R.id.dgw);
        C89219l.m154716b(findViewById, "");
        this.f145021c = (RecyclerView) findViewById;
        View findViewById2 = this.f145019a.findViewById(R.id.dm2);
        C89219l.m154716b(findViewById2, "");
        this.f145028o = (LinearLayout) findViewById2;
        this.f145023e = new C64363i(context);
        this.f145021c.setAdapter(getAdapter());
        View findViewById3 = this.f145019a.findViewById(R.id.ffv);
        C89219l.m154716b(findViewById3, "");
        this.f145022d = findViewById3;
        View findViewById4 = this.f145019a.findViewById(R.id.f27);
        C89219l.m154716b(findViewById4, "");
        this.f145020b = (TuxTextView) findViewById4;
        View findViewById5 = this.f145019a.findViewById(R.id.bkm);
        C89219l.m154716b(findViewById5, "");
        this.f145029p = (TuxIconView) findViewById5;
        RecyclerView.AbstractC1356f itemAnimator = this.f145021c.getItemAnimator();
        if (itemAnimator != null) {
            ((AbstractC1391ab) itemAnimator).f4621m = false;
            C64363i iVar = this.f145023e;
            C639461 r0 = new View$OnClickListenerC64123cs.AbstractC64126c(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.C639461 */

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f145032a;

                static {
                    Covode.recordClassIndex(75387);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$1$a */
                static final class RunnableC63947a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C639461 f145033a;

                    /* renamed from: b */
                    final /* synthetic */ float f145034b;

                    static {
                        Covode.recordClassIndex(75388);
                    }

                    RunnableC63947a(C639461 r1, float f) {
                        this.f145033a = r1;
                        this.f145034b = f;
                    }

                    public final void run() {
                        RecyclerView recyclerView = this.f145033a.f145032a.f145021c;
                        float f = this.f145034b;
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        recyclerView.mo4395a(C89241a.m154730a(TypedValue.applyDimension(1, f, system.getDisplayMetrics())), 0);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs.AbstractC64126c
                /* renamed from: a */
                public final void mo103527a() {
                    float f;
                    if (C63746h.m115277a()) {
                        f = 164.0f;
                    } else {
                        f = 134.0f;
                    }
                    this.f145032a.f145021c.mo4420b(50, 0);
                    new Handler().postDelayed(new RunnableC63947a(this, f), 600);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145032a = r1;
                }
            };
            C89219l.m154721d(r0, "");
            iVar.f145928c = r0;
            this.f145021c.setItemAnimator(new C1434i() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.C639482 */

                static {
                    Covode.recordClassIndex(75389);
                }

                @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
                /* renamed from: a */
                public final boolean mo4850a(RecyclerView.ViewHolder viewHolder) {
                    this.f4469k = 250;
                    return super.mo4850a(viewHolder);
                }
            });
            this.f145023e.f145929d = new C64121cr.AbstractC64122a(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.C639493 */

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f145035a;

                static {
                    Covode.recordClassIndex(75390);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$3$a */
                static final class RunnableC63950a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C639493 f145036a;

                    /* renamed from: b */
                    final /* synthetic */ int f145037b;

                    static {
                        Covode.recordClassIndex(75391);
                    }

                    RunnableC63950a(C639493 r1, int i) {
                        this.f145036a = r1;
                        this.f145037b = i;
                    }

                    public final void run() {
                        RecyclerView.AbstractC1356f itemAnimator = this.f145036a.f145035a.f145021c.getItemAnimator();
                        if (itemAnimator != null) {
                            C89219l.m154716b(itemAnimator, "");
                            itemAnimator.f4469k = 0;
                        }
                        this.f145036a.f145035a.f145021c.mo4413b(this.f145037b);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145035a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64121cr.AbstractC64122a
                /* renamed from: a */
                public final void mo103529a(int i) {
                    this.f145035a.f145019a.post(new RunnableC63950a(this, i));
                }
            };
            RecyclerView recyclerView = this.f145021c;
            recyclerView.setPadding((int) C13628n.m24520b(recyclerView.getContext(), 16.0f), 0, 0, 0);
            this.f145021c.setClipToPadding(false);
            this.f145021c.mo4415b(new C51453d(0, (int) C13628n.m24520b(context, 4.0f), 0));
            this.f145021c.setLayoutManager(new WrapLinearLayoutManager(0));
            new C80440fo(this.f145021c, new C80440fo.AbstractC80442a(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.C639514 */

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f145038a;

                static {
                    Covode.recordClassIndex(75392);
                }

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$4$a */
                static final class RunnableC63952a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ User f145039a;

                    /* renamed from: b */
                    final /* synthetic */ C639514 f145040b;

                    /* renamed from: c */
                    final /* synthetic */ C80440fo f145041c;

                    static {
                        Covode.recordClassIndex(75393);
                    }

                    RunnableC63952a(User user, C639514 r2, C80440fo foVar) {
                        this.f145039a = user;
                        this.f145040b = r2;
                        this.f145041c = foVar;
                    }

                    public final void run() {
                        C59256u a = new C59256u().mo96834a("others_homepage");
                        a.f135350a = C59256u.EnumC59259c.CARD;
                        a.f135352b = C59256u.EnumC59257a.SHOW;
                        a.mo96832a(this.f145039a).mo96838p("top").mo96841s(this.f145040b.f145038a.f145024f).mo96842t(this.f145040b.f145038a.f145025g).mo96792f();
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145038a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
                /* renamed from: a */
                public final void mo86642a(int i, C80440fo foVar) {
                    C89219l.m154721d(foVar, "");
                    User user = (User) this.f145038a.getAdapter().mo63369e().get(i);
                    if (user != null && !(user instanceof RecommendContact)) {
                        String uid = user.getUid();
                        C89219l.m154716b(uid, "");
                        foVar.mo123741a(uid, new RunnableC63952a(user, this, foVar));
                    }
                }
            });
            if (C66652b.f149825a.mo105660f()) {
                this.f145028o.setVisibility(0);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    this.f145029p.setVisibility(0);
                } else {
                    this.f145029p.setVisibility(8);
                }
            } else {
                this.f145028o.setVisibility(8);
                this.f145029p.setVisibility(8);
            }
            this.f145028o.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.View$OnClickListenerC639535 */

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f145042a;

                static {
                    Covode.recordClassIndex(75394);
                }

                {
                    this.f145042a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC63956b bVar = this.f145042a.f145026h;
                    if (bVar != null) {
                        bVar.mo103534a();
                    }
                    C39162r.m79460a("click_see_all", new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
                }
            });
            this.f145029p.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.View$OnClickListenerC639546 */

                static {
                    Covode.recordClassIndex(75395);
                }

                public final void onClick(View view) {
                    Activity a;
                    ClickAgent.onClick(view);
                    Context context = context;
                    if (!(context == null || (a = C17040e.m31504a(context)) == null)) {
                        C63419ae.f143971a.mo101955a(a, "others_homepage", "others_homepage");
                    }
                    C39162r.m79460a("click_suggested_account_information", new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
                }
            });
            MethodCollector.m26664o(7653);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        MethodCollector.m26664o(7653);
        throw nullPointerException;
    }

    /* renamed from: a */
    public final void mo103516a(List<? extends User> list, String str, String str2, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                mo103515a();
            }
            if (!C63748i.m115281b()) {
                return;
            }
        }
        this.f145024f = str;
        this.f145025g = str2;
        if (list == null || list.isEmpty()) {
            list = C89070n.m154525d(new RecommendContact(null, 1, null));
        }
        this.f145030q = list;
        C64363i adapter = getAdapter();
        List<? extends User> list2 = this.f145030q;
        if (list2 == null) {
            C89219l.m154710a("mUsers");
        }
        adapter.mo62377b_(list2);
        getAdapter().f145930e = str;
        getAdapter().f145931f = str2;
        getAdapter().mo67829d(false);
    }
}
