package com.p2082ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59393g;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59394h;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59402b;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c */
public final class C59911c extends RecyclerView.ViewHolder implements AbstractC59394h {

    /* renamed from: j */
    public static final int f136456j = C34728n.m70946a(36.0d);

    /* renamed from: k */
    public static final int f136457k = C34728n.m70946a(16.0d);

    /* renamed from: l */
    public static final int f136458l = C34728n.m70946a(8.0d);

    /* renamed from: m */
    public static final int f136459m = C34728n.m70946a(16.0d);

    /* renamed from: n */
    public static final int f136460n = C34728n.m70946a(40.5d);

    /* renamed from: o */
    public static int f136461o = C34728n.m70946a(88.0d);

    /* renamed from: p */
    public static final int f136462p = C34728n.m70946a(102.0d);

    /* renamed from: q */
    public static final int f136463q = C34728n.m70946a(82.0d);

    /* renamed from: r */
    public static int f136464r;

    /* renamed from: s */
    public static boolean f136465s = true;

    /* renamed from: t */
    public static boolean f136466t;

    /* renamed from: u */
    public static int f136467u;

    /* renamed from: v */
    public static int f136468v;

    /* renamed from: w */
    public static boolean f136469w;

    /* renamed from: x */
    public static final C59912a f136470x = new C59912a((byte) 0);

    /* renamed from: A */
    private final TextView f136471A;

    /* renamed from: B */
    private final TextView f136472B;

    /* renamed from: C */
    private final FrameLayout f136473C;

    /* renamed from: D */
    private final FrameLayout f136474D;

    /* renamed from: E */
    private final View f136475E;

    /* renamed from: F */
    private final AbstractC89244h f136476F;

    /* renamed from: G */
    private final AbstractC59393g f136477G;

    /* renamed from: a */
    public final ArrayList<C59867d> f136478a = new ArrayList<>();

    /* renamed from: b */
    public String f136479b = "";

    /* renamed from: c */
    public String f136480c = "";

    /* renamed from: d */
    public final PowerList f136481d;

    /* renamed from: e */
    public C59864a f136482e;

    /* renamed from: f */
    public final View f136483f;

    /* renamed from: g */
    public final boolean f136484g;

    /* renamed from: h */
    public final boolean f136485h;

    /* renamed from: i */
    public final String f136486i;

    /* renamed from: y */
    private final ConstraintLayout f136487y;

    /* renamed from: z */
    private final ConstraintLayout f136488z;

    /* renamed from: a */
    private final AbstractC17692b<C59864a> m109365a() {
        return (AbstractC17692b) this.f136476F.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$a */
    public static final class C59912a {
        static {
            Covode.recordClassIndex(70325);
        }

        private C59912a() {
        }

        public /* synthetic */ C59912a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$b */
    static final class C59913b extends AbstractC89220m implements AbstractC89171a<C599141> {

        /* renamed from: a */
        final /* synthetic */ C59911c f136489a;

        static {
            Covode.recordClassIndex(70326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59913b(C59911c cVar) {
            super(0);
            this.f136489a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C599141 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            cVar.f42319a = 3;
            return new AbstractC17692b<C59864a>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.mix.profile.entry.C59911c.C59913b.C599141 */

                /* renamed from: a */
                final /* synthetic */ C59913b f136490a;

                static {
                    Covode.recordClassIndex(70327);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$b$1$b */
                static final class C59916b<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89124d f136493a;

                    static {
                        Covode.recordClassIndex(70329);
                    }

                    C59916b(AbstractC89124d dVar) {
                        this.f136493a = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f136493a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<C59864a>> dVar) {
                    C89219l.m154721d(dVar, "");
                    List<AbstractC17641a> a = this.f136490a.f136489a.mo97300a(this.f136490a.f136489a.f136478a);
                    if (this.f136490a.f136489a.f136484g) {
                        a.add(0, new C59909a());
                    }
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, this.f136490a.f136489a.f136482e, a)));
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$b$1$a */
                static final class C59915a<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C599141 f136491a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f136492b;

                    static {
                        Covode.recordClassIndex(70328);
                    }

                    C59915a(C599141 r1, AbstractC89124d dVar) {
                        this.f136491a = r1;
                        this.f136492b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        List<C59867d> list;
                        List<C59867d> mixList;
                        List<C59867d> list2;
                        List<C59867d> list3;
                        C59864a aVar = (C59864a) obj;
                        if (!(aVar == null || (mixList = aVar.getMixList()) == null)) {
                            this.f136491a.f136490a.f136489a.f136478a.addAll(mixList);
                            C59864a aVar2 = this.f136491a.f136490a.f136489a.f136482e;
                            if (aVar2 != null) {
                                list2 = aVar2.getMixList();
                            } else {
                                list2 = null;
                            }
                            if (list2 instanceof ArrayList) {
                                C59864a aVar3 = this.f136491a.f136490a.f136489a.f136482e;
                                if (aVar3 != null) {
                                    list3 = aVar3.getMixList();
                                } else {
                                    list3 = null;
                                }
                                Objects.requireNonNull(list3, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.mix.model.MixStruct>");
                                ArrayList arrayList = (ArrayList) list3;
                                if (arrayList != null) {
                                    arrayList.addAll(mixList);
                                }
                            }
                        }
                        AbstractC89124d dVar = this.f136492b;
                        C59911c cVar = this.f136491a.f136490a.f136489a;
                        if (aVar != null) {
                            list = aVar.getMixList();
                        } else {
                            list = null;
                        }
                        dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, aVar, cVar.mo97300a(list))));
                        this.f136491a.f136490a.f136489a.f136481d.mo4487o();
                    }
                }

                {
                    this.f136490a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    AbstractC88403ab<C59864a> userMixList;
                    String str;
                    C59864a aVar = (C59864a) obj;
                    C89219l.m154721d(dVar, "");
                    C89219l.m154721d(aVar, "");
                    if (this.f136490a.f136489a.f136485h) {
                        MixFeedApi a = MixFeedApi.C59385a.m109095a();
                        String str2 = this.f136490a.f136489a.f136479b;
                        long cursor = aVar.getCursor();
                        C59864a aVar2 = this.f136490a.f136489a.f136482e;
                        if (aVar2 == null || (str = aVar2.getKeyWord()) == null) {
                            str = "";
                        }
                        userMixList = a.searchLodeMore(str2, cursor, 10, 16, str);
                    } else {
                        userMixList = MixFeedApi.C59385a.m109095a().getUserMixList(this.f136490a.f136489a.f136479b, aVar.getCursor(), this.f136490a.f136489a.f136480c);
                    }
                    if (aVar.getHasMore()) {
                        C89219l.m154716b(userMixList.mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59915a(this, dVar), new C59916b(dVar)), "");
                    }
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(70324);
    }

    /* renamed from: b */
    private final void m109366b() {
        this.f136481d.mo28083a(PlayListNameCell.class, PlayListNameAddCell.class);
        this.f136483f.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f136481d.setLayoutManager(linearLayoutManager);
        this.f136474D.setOnClickListener(View$OnClickListenerC59917c.f136494a);
        this.f136473C.setOnClickListener(View$OnClickListenerC59918d.f136495a);
        this.f136487y.setOnClickListener(new View$OnClickListenerC59919e(this));
        this.f136488z.setOnClickListener(View$OnClickListenerC59920f.f136497a);
        View findViewById = this.f136483f.findViewById(R.id.bn);
        C89219l.m154716b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f136483f.findViewById(R.id.auw);
        C89219l.m154716b(findViewById2, "");
        ImageView imageView2 = (ImageView) findViewById2;
        Context context = this.f136483f.getContext();
        C89219l.m154716b(context, "");
        Drawable drawable = context.getResources().getDrawable(2131233499);
        if (Build.VERSION.SDK_INT > 19) {
            C89219l.m154716b(drawable, "");
            drawable.setAutoMirrored(true);
        }
        imageView.setImageDrawable(drawable);
        imageView2.setImageDrawable(drawable);
        this.f136481d.mo4402a(new C59921g(this));
        this.f136472B.setMaxWidth(C13628n.m24504a(this.f136483f.getContext()) - f136463q);
        this.f136471A.setMaxWidth(C13628n.m24504a(this.f136483f.getContext()) - f136462p);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$g */
    public static final class C59921g extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ C59911c f136498a;

        static {
            Covode.recordClassIndex(70334);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59921g(C59911c cVar) {
            this.f136498a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            super.getItemOffsets(rect, view, recyclerView, sVar);
            int d = RecyclerView.m4277d(view);
            if (d == 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
                jVar.setMarginStart(C59911c.f136457k);
                jVar.leftMargin = C59911c.f136457k;
                jVar.rightMargin = 0;
                jVar.setMarginEnd(0);
                view.setLayoutParams(jVar);
            } else if (d == this.f136498a.f136481d.getState().mo28134b() - 1) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar2 = (RecyclerView.C1367j) layoutParams2;
                jVar2.setMarginStart(C59911c.f136458l);
                jVar2.leftMargin = C59911c.f136458l;
                jVar2.rightMargin = C59911c.f136459m;
                jVar2.setMarginEnd(C59911c.f136459m);
                view.setLayoutParams(jVar2);
            } else {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.C1367j jVar3 = (RecyclerView.C1367j) layoutParams3;
                jVar3.setMarginStart(C59911c.f136458l);
                jVar3.leftMargin = C59911c.f136458l;
                jVar3.rightMargin = 0;
                jVar3.setMarginEnd(0);
                view.setLayoutParams(jVar3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$c */
    public static final class View$OnClickListenerC59917c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC59917c f136494a = new View$OnClickListenerC59917c();

        static {
            Covode.recordClassIndex(70330);
        }

        View$OnClickListenerC59917c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.m109435k().mo97329e();
            AbstractC81915c.m141874a(new C59402b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$d */
    public static final class View$OnClickListenerC59918d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC59918d f136495a = new View$OnClickListenerC59918d();

        static {
            Covode.recordClassIndex(70331);
        }

        View$OnClickListenerC59918d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.m109435k().mo97322a(false);
            AbstractC81915c.m141874a(new C59402b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$f */
    public static final class View$OnClickListenerC59920f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC59920f f136497a = new View$OnClickListenerC59920f();

        static {
            Covode.recordClassIndex(70333);
        }

        View$OnClickListenerC59920f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            SmartRouter.buildRoute(view.getContext(), "//account/setting").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.c$e */
    public static final class View$OnClickListenerC59919e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59911c f136496a;

        static {
            Covode.recordClassIndex(70332);
        }

        View$OnClickListenerC59919e(C59911c cVar) {
            this.f136496a = cVar;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            if (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) {
                i = 2;
            } else {
                i = 1;
            }
            IMixFeedService k = MixFeedService.m109435k();
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            k.mo97312a(context, new Bundle(), i, this.f136496a.f136486i, "profile");
        }
    }

    /* renamed from: a */
    public final List<AbstractC17641a> mo97300a(List<? extends C59867d> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C59867d dVar : list) {
                C59910b bVar = new C59910b();
                bVar.f136442a = dVar.icon;
                bVar.f136443b = dVar.getMixName();
                bVar.f136445d = dVar.mixId;
                String str = this.f136479b;
                C89219l.m154721d(str, "");
                bVar.f136447f = str;
                String str2 = this.f136480c;
                C89219l.m154721d(str2, "");
                bVar.f136448g = str2;
                bVar.f136450i = this.f136485h;
                C59864a aVar = this.f136482e;
                String str3 = null;
                bVar.f136451j = aVar != null ? aVar.getKeyWord() : null;
                C59864a aVar2 = this.f136482e;
                bVar.f136452k = aVar2 != null ? aVar2.getSearchId() : null;
                C59864a aVar3 = this.f136482e;
                bVar.f136453l = aVar3 != null ? aVar3.getSearchResultId() : null;
                String str4 = this.f136486i;
                C89219l.m154721d(str4, "");
                bVar.f136449h = str4;
                bVar.f136455n = this.f136477G;
                C59864a aVar4 = this.f136482e;
                if (aVar4 != null) {
                    str3 = aVar4.getSearchType();
                }
                bVar.f136454m = str3;
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59394h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97059a(java.lang.String r9, java.lang.String r10, com.p2082ss.android.ugc.aweme.mix.model.C59864a r11) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.profile.entry.C59911c.mo97059a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.mix.model.a):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59911c(View view, boolean z, boolean z2, String str, AbstractC59393g gVar) {
        super(view);
        int a;
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        this.f136483f = view;
        this.f136484g = z;
        this.f136485h = z2;
        this.f136486i = str;
        this.f136477G = gVar;
        View findViewById = view.findViewById(R.id.d54);
        C89219l.m154716b(findViewById, "");
        PowerList powerList = (PowerList) findViewById;
        this.f136481d = powerList;
        View findViewById2 = view.findViewById(R.id.d2u);
        C89219l.m154716b(findViewById2, "");
        this.f136487y = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.d2r);
        C89219l.m154716b(findViewById3, "");
        this.f136488z = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.d2t);
        C89219l.m154716b(findViewById4, "");
        this.f136471A = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.d2q);
        C89219l.m154716b(findViewById5, "");
        this.f136472B = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bs);
        C89219l.m154716b(findViewById6, "");
        this.f136473C = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.bgj);
        C89219l.m154716b(findViewById7, "");
        this.f136474D = (FrameLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.c93);
        C89219l.m154716b(findViewById8, "");
        this.f136475E = findViewById8;
        this.f136476F = C89250i.m154773a((AbstractC89171a) new C59913b(this));
        m109366b();
        powerList.mo28082a(m109365a());
        if (!C68432f.f153189a.mo108870f() || z) {
            findViewById8.setVisibility(8);
        } else {
            findViewById8.setVisibility(0);
        }
        if (z2) {
            a = C34728n.m70946a(109.0d);
        } else {
            a = C34728n.m70946a(88.0d);
        }
        f136461o = a;
    }
}
