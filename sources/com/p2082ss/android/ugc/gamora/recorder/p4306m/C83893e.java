package com.p2082ss.android.ugc.gamora.recorder.p4306m;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73989bh;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74294n;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83717a;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.m.e */
public final class C83893e extends AbstractC22186b implements AbstractC21566a {

    /* renamed from: j */
    public static final C83894a f187268j = new C83894a((byte) 0);

    /* renamed from: A */
    private final String f187269A;

    /* renamed from: B */
    private final boolean f187270B;

    /* renamed from: C */
    private final C2549d<Integer> f187271C;

    /* renamed from: b */
    public TabHost f187272b;

    /* renamed from: c */
    public ScrollableLinearLayout f187273c;

    /* renamed from: d */
    public View f187274d;

    /* renamed from: e */
    public int f187275e = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: f */
    final Set<String> f187276f = new LinkedHashSet();

    /* renamed from: g */
    final C83717a f187277g = new C83717a();

    /* renamed from: h */
    final Map<Integer, View> f187278h = new LinkedHashMap();

    /* renamed from: i */
    public final C2563k<C83408c> f187279i;

    /* renamed from: k */
    private final int f187280k;

    /* renamed from: l */
    private final int f187281l;

    /* renamed from: t */
    private final int f187282t;

    /* renamed from: u */
    private final int f187283u;

    /* renamed from: v */
    private final C21582f f187284v;

    /* renamed from: w */
    private final C2564l<Integer> f187285w;

    /* renamed from: x */
    private final C2560h<Boolean> f187286x;

    /* renamed from: y */
    private final C2560h<C89391z> f187287y;

    /* renamed from: z */
    private final C2559g<C83903f> f187288z;

    static {
        Covode.recordClassIndex(97784);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$a */
    public static final class C83894a {
        static {
            Covode.recordClassIndex(97785);
        }

        private C83894a() {
        }

        public /* synthetic */ C83894a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187284v;
    }

    /* renamed from: E */
    public final TabHost mo62771E() {
        TabHost tabHost = this.f187272b;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        return tabHost;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$b */
    static final class C83895b implements TabHost.AbstractC74261a {

        /* renamed from: a */
        final /* synthetic */ C83893e f187289a;

        static {
            Covode.recordClassIndex(97786);
        }

        C83895b(C83893e eVar) {
            this.f187289a = eVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$b$a */
        static final class RunnableC83896a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextView f187290a;

            /* renamed from: b */
            final /* synthetic */ C83895b f187291b;

            /* renamed from: c */
            final /* synthetic */ int f187292c;

            /* renamed from: d */
            final /* synthetic */ int f187293d;

            static {
                Covode.recordClassIndex(97787);
            }

            RunnableC83896a(TextView textView, C83895b bVar, int i, int i2) {
                this.f187290a = textView;
                this.f187291b = bVar;
                this.f187292c = i;
                this.f187293d = i2;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C83893e.m144290c(this.f187291b.f187289a).getLayoutParams();
                layoutParams.width = this.f187290a.getWidth();
                C83893e.m144290c(this.f187291b.f187289a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.AbstractC74261a
        /* renamed from: a */
        public final void mo116853a(Object obj, int i, int i2, boolean z, boolean z2) {
            TextView textView;
            Object a = C83893e.m144287a(this.f187289a).mo116829a(i);
            if (a == null) {
                C89219l.m154715b();
            }
            C83408c cVar = new C83408c(obj, a, i2, false, z2, 8);
            cVar.f186275a = z;
            this.f187289a.f187279i.mo6999a(cVar);
            int childCount = C83893e.m144289b(this.f187289a).getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = C83893e.m144289b(this.f187289a).getChildAt(i3);
                if (!(childAt instanceof C74294n)) {
                    childAt = null;
                }
                C74294n nVar = (C74294n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (i3 == i) {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#80000000"));
                        textView.post(new RunnableC83896a(textView, this, i3, i));
                    } else {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#40000000"));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$e */
    static final class C83899e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83893e f187296a;

        static {
            Covode.recordClassIndex(97790);
        }

        C83899e(C83893e eVar) {
            this.f187296a = eVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$e$a */
        static final class RunnableC83900a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextView f187297a;

            /* renamed from: b */
            final /* synthetic */ C83899e f187298b;

            /* renamed from: c */
            final /* synthetic */ int f187299c;

            static {
                Covode.recordClassIndex(97791);
            }

            RunnableC83900a(TextView textView, C83899e eVar, int i) {
                this.f187297a = textView;
                this.f187298b = eVar;
                this.f187299c = i;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C83893e.m144290c(this.f187298b.f187296a).getLayoutParams();
                layoutParams.width = this.f187297a.getWidth();
                C83893e.m144290c(this.f187298b.f187296a).setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView;
            String str;
            int childCount = C83893e.m144289b(this.f187296a).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C83893e.m144289b(this.f187296a).getChildAt(i);
                if (!(childAt instanceof C74294n)) {
                    childAt = null;
                }
                C74294n nVar = (C74294n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (C83893e.m144287a(this.f187296a).getCurrentIndex() == i) {
                        str = "#80000000";
                    } else {
                        str = "#40000000";
                    }
                    C83891d.m144281a(textView, Color.parseColor("#00000000"), Color.parseColor(str));
                    if (C83893e.m144287a(this.f187296a).getCurrentIndex() == i) {
                        textView.post(new RunnableC83900a(textView, this, i));
                    }
                }
            }
        }
    }

    /* renamed from: F */
    private final C74294n m144286F() {
        ScrollableLinearLayout scrollableLinearLayout = this.f187273c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        C74294n nVar = new C74294n(scrollableLinearLayout.getContext());
        nVar.mo9139b();
        return nVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m144287a(C83893e eVar) {
        TabHost tabHost = eVar.f187272b;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        return tabHost;
    }

    /* renamed from: b */
    public static final /* synthetic */ ScrollableLinearLayout m144289b(C83893e eVar) {
        ScrollableLinearLayout scrollableLinearLayout = eVar.f187273c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        return scrollableLinearLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m144290c(C83893e eVar) {
        View view = eVar.f187274d;
        if (view == null) {
            C89219l.m154710a("selectedBg");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$c */
    static final class C83897c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83893e f187294a;

        static {
            Covode.recordClassIndex(97788);
        }

        C83897c(C83893e eVar) {
            this.f187294a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            TabHost a = C83893e.m144287a(this.f187294a);
            C89219l.m154716b(num, "");
            a.setVisibility(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$g */
    static final class C83902g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83893e f187301a;

        static {
            Covode.recordClassIndex(97793);
        }

        C83902g(C83893e eVar) {
            this.f187301a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C83893e eVar = this.f187301a;
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            View view = eVar.f52550n;
            if (view != null) {
                view.setTranslationY((float) intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$d */
    static final class C83898d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83893e f187295a;

        static {
            Covode.recordClassIndex(97789);
        }

        C83898d(C83893e eVar) {
            this.f187295a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f187295a.f187275e;
            } else {
                i = this.f187295a.f187275e;
            }
            ViewGroup.LayoutParams layoutParams = C83893e.m144287a(this.f187295a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i + ((int) C13628n.m24520b(this.f187295a.f52549m, 100.0f)) + ((int) C13628n.m24520b(this.f187295a.f52549m, -12.5f));
            C83893e.m144287a(this.f187295a).setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.e$f */
    static final class C83901f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83893e f187300a;

        static {
            Covode.recordClassIndex(97792);
        }

        C83901f(C83893e eVar) {
            this.f187300a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Set b;
            C83903f fVar = (C83903f) obj;
            if (fVar.f187302a) {
                C83893e eVar = this.f187300a;
                TabHost tabHost = eVar.f187272b;
                if (tabHost == null) {
                    C89219l.m154710a("tabHost");
                }
                C73989bh.m130124a(tabHost, eVar.f187276f, eVar.f187278h);
                return;
            }
            C83893e eVar2 = this.f187300a;
            Set<String> set = fVar.f187303b;
            TabHost tabHost2 = eVar2.f187272b;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            ScrollableLinearLayout scrollableLinearLayout = eVar2.f187273c;
            if (scrollableLinearLayout == null) {
                C89219l.m154710a("tabContainer");
            }
            C73989bh.m130126a(set, tabHost2, scrollableLinearLayout, eVar2.f187276f, eVar2.f187278h);
            C83893e eVar3 = this.f187300a;
            Set<String> set2 = fVar.f187303b;
            if (set2 != null && (b = C89070n.m154563b((Iterable) set2, (Iterable) eVar3.f187276f)) != null && b.size() >= 2 && !eVar3.f187277g.mo128692a()) {
                ScrollableLinearLayout scrollableLinearLayout2 = eVar3.f187273c;
                if (scrollableLinearLayout2 == null) {
                    C89219l.m154710a("tabContainer");
                }
                View a = C73989bh.m130121a(scrollableLinearLayout2, b);
                Activity activity = eVar3.f52549m;
                if (activity != null && !activity.isFinishing() && a != null) {
                    ScrollableLinearLayout scrollableLinearLayout3 = eVar3.f187273c;
                    if (scrollableLinearLayout3 == null) {
                        C89219l.m154710a("tabContainer");
                    }
                    Context context = scrollableLinearLayout3.getContext();
                    C89219l.m154716b(context, "");
                    Activity a2 = C67279a.m119194a(context);
                    if (a2 == null) {
                        C89219l.m154715b();
                    }
                    ((C23329a) new C23329a(a2).mo38041b(a).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.aaf).mo38030a(5000L).mo38012d().mo38001a();
                    eVar3.f187277g.mo128693b();
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ahl, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        View findViewById = viewGroup2.findViewById(R.id.e5h);
        C89219l.m154716b(findViewById, "");
        TabHost tabHost = (TabHost) findViewById;
        this.f187272b = tabHost;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        View findViewById2 = tabHost.findViewById(R.id.acf);
        C89219l.m154716b(findViewById2, "");
        this.f187273c = (ScrollableLinearLayout) findViewById2;
        TabHost tabHost2 = this.f187272b;
        if (tabHost2 == null) {
            C89219l.m154710a("tabHost");
        }
        View findViewById3 = tabHost2.findViewById(R.id.e5g);
        C89219l.m154716b(findViewById3, "");
        this.f187274d = findViewById3;
        int i2 = this.f187280k;
        if (i2 >= 0) {
            String string = C63247i.f143610a.getString(R.string.gcc);
            C89219l.m154716b(string, "");
            m144288a(i2, string, C69797ae.f155982c);
        }
        int i3 = this.f187281l;
        String string2 = C63247i.f143610a.getString(R.string.f7_);
        C89219l.m154716b(string2, "");
        m144288a(i3, string2, C69797ae.f155981b);
        int i4 = this.f187282t;
        String string3 = C63247i.f143610a.getString(R.string.f79);
        C89219l.m154716b(string3, "");
        m144288a(i4, string3, C69797ae.f155980a);
        int i5 = this.f187283u;
        if (i5 >= 0) {
            String string4 = C63247i.f143610a.getString(R.string.g60);
            C89219l.m154716b(string4, "");
            m144288a(i5, string4, "RecordCombinePhoto");
        }
        TabHost tabHost3 = this.f187272b;
        if (tabHost3 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost3.setOnIndexChangedListener(new C83895b(this));
        String str = this.f187269A;
        if (C89219l.m154714a((Object) str, (Object) C69797ae.f155982c)) {
            i = this.f187280k;
            if (i < 0) {
                i = this.f187282t;
            }
        } else if (C89219l.m154714a((Object) str, (Object) C69797ae.f155981b)) {
            i = this.f187281l;
        } else {
            i = this.f187282t;
        }
        TabHost tabHost4 = this.f187272b;
        if (tabHost4 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost4.mo116831a(i, true, true);
        this.f187285w.mo7036a(this, new C83897c(this));
        C2560h<Boolean> hVar = this.f187286x;
        if (hVar != null) {
            hVar.mo7036a(this, new C83898d(this));
        }
        C2560h<C89391z> hVar2 = this.f187287y;
        if (hVar2 != null) {
            hVar2.mo7036a(this, new C83899e(this));
        }
        C2559g<C83903f> gVar = this.f187288z;
        if (gVar != null) {
            gVar.mo6997a(this, new C83901f(this));
        }
        this.f187271C.mo7036a(this, new C83902g(this));
        return viewGroup2;
    }

    /* renamed from: a */
    private final void m144288a(int i, String str, String str2) {
        C74294n F = m144286F();
        F.setText(str);
        F.setTag(str2);
        F.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        ScrollableLinearLayout scrollableLinearLayout = this.f187273c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        scrollableLinearLayout.addView(F, i);
        this.f187276f.add(str2);
    }

    public C83893e(C21582f fVar, C2563k<C83408c> kVar, C2564l<Integer> lVar, C2560h<Boolean> hVar, C2560h<C89391z> hVar2, C2559g<C83903f> gVar, String str, boolean z, boolean z2, C2549d<Integer> dVar) {
        int i;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f187284v = fVar;
        this.f187279i = kVar;
        this.f187285w = lVar;
        this.f187286x = hVar;
        this.f187287y = hVar2;
        this.f187288z = gVar;
        this.f187269A = str;
        this.f187270B = z;
        this.f187271C = dVar;
        int i2 = -1;
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        this.f187280k = i;
        this.f187281l = i + 1;
        int i3 = i + 2;
        this.f187282t = i3;
        this.f187283u = z2 ? i3 + 1 : i2;
    }
}
