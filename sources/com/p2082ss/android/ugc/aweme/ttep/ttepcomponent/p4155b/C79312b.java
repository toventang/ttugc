package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4155b;

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
import com.p2082ss.android.ugc.gamora.recorder.p4306m.C83891d;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b */
public final class C79312b extends AbstractC22186b implements AbstractC21566a {

    /* renamed from: j */
    public static final C79313a f178190j = new C79313a((byte) 0);

    /* renamed from: A */
    private final boolean f178191A;

    /* renamed from: B */
    private final C2549d<Integer> f178192B;

    /* renamed from: b */
    public TabHost f178193b;

    /* renamed from: c */
    public ScrollableLinearLayout f178194c;

    /* renamed from: d */
    public View f178195d;

    /* renamed from: e */
    public int f178196e = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: f */
    final Set<String> f178197f = new LinkedHashSet();

    /* renamed from: g */
    final C83717a f178198g = new C83717a();

    /* renamed from: h */
    final Map<Integer, View> f178199h = new LinkedHashMap();

    /* renamed from: i */
    public final C2563k<C83408c> f178200i;

    /* renamed from: k */
    private final int f178201k;

    /* renamed from: l */
    private final int f178202l;

    /* renamed from: t */
    private final int f178203t;

    /* renamed from: u */
    private final C21582f f178204u;

    /* renamed from: v */
    private final C2564l<Integer> f178205v;

    /* renamed from: w */
    private final C2560h<Boolean> f178206w;

    /* renamed from: x */
    private final C2560h<C89391z> f178207x;

    /* renamed from: y */
    private final C2559g<C79322c> f178208y;

    /* renamed from: z */
    private final String f178209z;

    static {
        Covode.recordClassIndex(92502);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$a */
    public static final class C79313a {
        static {
            Covode.recordClassIndex(92503);
        }

        private C79313a() {
        }

        public /* synthetic */ C79313a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f178204u;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$b */
    static final class C79314b implements TabHost.AbstractC74261a {

        /* renamed from: a */
        final /* synthetic */ C79312b f178210a;

        static {
            Covode.recordClassIndex(92504);
        }

        C79314b(C79312b bVar) {
            this.f178210a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$b$a */
        static final class RunnableC79315a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextView f178211a;

            /* renamed from: b */
            final /* synthetic */ C79314b f178212b;

            /* renamed from: c */
            final /* synthetic */ int f178213c;

            /* renamed from: d */
            final /* synthetic */ int f178214d;

            static {
                Covode.recordClassIndex(92505);
            }

            RunnableC79315a(TextView textView, C79314b bVar, int i, int i2) {
                this.f178211a = textView;
                this.f178212b = bVar;
                this.f178213c = i;
                this.f178214d = i2;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C79312b.m138137c(this.f178212b.f178210a).getLayoutParams();
                layoutParams.width = this.f178211a.getWidth();
                C79312b.m138137c(this.f178212b.f178210a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.AbstractC74261a
        /* renamed from: a */
        public final void mo116853a(Object obj, int i, int i2, boolean z, boolean z2) {
            TextView textView;
            Object a = C79312b.m138134a(this.f178210a).mo116829a(i);
            if (a == null) {
                C89219l.m154715b();
            }
            C83408c cVar = new C83408c(obj, a, i2, z2, false, 16);
            cVar.f186275a = z;
            this.f178210a.f178200i.mo6999a(cVar);
            int childCount = C79312b.m138136b(this.f178210a).getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = C79312b.m138136b(this.f178210a).getChildAt(i3);
                if (!(childAt instanceof C74294n)) {
                    childAt = null;
                }
                C74294n nVar = (C74294n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (i3 == i) {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#80000000"));
                        textView.post(new RunnableC79315a(textView, this, i3, i));
                    } else {
                        textView.setShadowLayer(8.0f, 0.0f, 1.0f, Color.parseColor("#40000000"));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$e */
    static final class C79318e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79312b f178217a;

        static {
            Covode.recordClassIndex(92508);
        }

        C79318e(C79312b bVar) {
            this.f178217a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$e$a */
        static final class RunnableC79319a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextView f178218a;

            /* renamed from: b */
            final /* synthetic */ C79318e f178219b;

            /* renamed from: c */
            final /* synthetic */ int f178220c;

            static {
                Covode.recordClassIndex(92509);
            }

            RunnableC79319a(TextView textView, C79318e eVar, int i) {
                this.f178218a = textView;
                this.f178219b = eVar;
                this.f178220c = i;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C79312b.m138137c(this.f178219b.f178217a).getLayoutParams();
                layoutParams.width = this.f178218a.getWidth();
                C79312b.m138137c(this.f178219b.f178217a).setLayoutParams(layoutParams);
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView;
            String str;
            int childCount = C79312b.m138136b(this.f178217a).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C79312b.m138136b(this.f178217a).getChildAt(i);
                if (!(childAt instanceof C74294n)) {
                    childAt = null;
                }
                C74294n nVar = (C74294n) childAt;
                if (!(nVar == null || (textView = nVar.getTextView()) == null)) {
                    if (C79312b.m138134a(this.f178217a).getCurrentIndex() == i) {
                        str = "#80000000";
                    } else {
                        str = "#40000000";
                    }
                    C83891d.m144281a(textView, Color.parseColor("#00000000"), Color.parseColor(str));
                    if (C79312b.m138134a(this.f178217a).getCurrentIndex() == i) {
                        textView.post(new RunnableC79319a(textView, this, i));
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private final C74294n m138133E() {
        ScrollableLinearLayout scrollableLinearLayout = this.f178194c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        C74294n nVar = new C74294n(scrollableLinearLayout.getContext());
        nVar.mo9139b();
        return nVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m138134a(C79312b bVar) {
        TabHost tabHost = bVar.f178193b;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        return tabHost;
    }

    /* renamed from: b */
    public static final /* synthetic */ ScrollableLinearLayout m138136b(C79312b bVar) {
        ScrollableLinearLayout scrollableLinearLayout = bVar.f178194c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        return scrollableLinearLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m138137c(C79312b bVar) {
        View view = bVar.f178195d;
        if (view == null) {
            C89219l.m154710a("selectedBg");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$c */
    static final class C79316c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79312b f178215a;

        static {
            Covode.recordClassIndex(92506);
        }

        C79316c(C79312b bVar) {
            this.f178215a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            TabHost a = C79312b.m138134a(this.f178215a);
            C89219l.m154716b(num, "");
            a.setVisibility(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$g */
    static final class C79321g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79312b f178222a;

        static {
            Covode.recordClassIndex(92511);
        }

        C79321g(C79312b bVar) {
            this.f178222a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C79312b bVar = this.f178222a;
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            View view = bVar.f52550n;
            if (view != null) {
                view.setTranslationY((float) intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$d */
    static final class C79317d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79312b f178216a;

        static {
            Covode.recordClassIndex(92507);
        }

        C79317d(C79312b bVar) {
            this.f178216a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f178216a.f178196e;
            } else {
                i = this.f178216a.f178196e;
            }
            ViewGroup.LayoutParams layoutParams = C79312b.m138134a(this.f178216a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i + ((int) C13628n.m24520b(this.f178216a.f52549m, 100.0f)) + ((int) C13628n.m24520b(this.f178216a.f52549m, -12.5f));
            C79312b.m138134a(this.f178216a).setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.b$f */
    static final class C79320f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C79312b f178221a;

        static {
            Covode.recordClassIndex(92510);
        }

        C79320f(C79312b bVar) {
            this.f178221a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Set b;
            C79322c cVar = (C79322c) obj;
            if (cVar.f178223a) {
                C79312b bVar = this.f178221a;
                TabHost tabHost = bVar.f178193b;
                if (tabHost == null) {
                    C89219l.m154710a("tabHost");
                }
                C73989bh.m130124a(tabHost, bVar.f178197f, bVar.f178199h);
                return;
            }
            C79312b bVar2 = this.f178221a;
            Set<String> set = cVar.f178224b;
            TabHost tabHost2 = bVar2.f178193b;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            ScrollableLinearLayout scrollableLinearLayout = bVar2.f178194c;
            if (scrollableLinearLayout == null) {
                C89219l.m154710a("tabContainer");
            }
            C73989bh.m130126a(set, tabHost2, scrollableLinearLayout, bVar2.f178197f, bVar2.f178199h);
            C79312b bVar3 = this.f178221a;
            Set<String> set2 = cVar.f178224b;
            if (set2 != null && (b = C89070n.m154563b((Iterable) set2, (Iterable) bVar3.f178197f)) != null && b.size() >= 2 && !bVar3.f178198g.mo128692a()) {
                ScrollableLinearLayout scrollableLinearLayout2 = bVar3.f178194c;
                if (scrollableLinearLayout2 == null) {
                    C89219l.m154710a("tabContainer");
                }
                View a = C73989bh.m130121a(scrollableLinearLayout2, b);
                Activity activity = bVar3.f52549m;
                if (activity != null && !activity.isFinishing() && a != null) {
                    ScrollableLinearLayout scrollableLinearLayout3 = bVar3.f178194c;
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
                    bVar3.f178198g.mo128693b();
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
        this.f178193b = tabHost;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        View findViewById2 = tabHost.findViewById(R.id.acf);
        C89219l.m154716b(findViewById2, "");
        this.f178194c = (ScrollableLinearLayout) findViewById2;
        TabHost tabHost2 = this.f178193b;
        if (tabHost2 == null) {
            C89219l.m154710a("tabHost");
        }
        View findViewById3 = tabHost2.findViewById(R.id.e5g);
        C89219l.m154716b(findViewById3, "");
        this.f178195d = findViewById3;
        int i2 = this.f178201k;
        if (i2 >= 0) {
            String string = C63247i.f143610a.getString(R.string.gcc);
            C89219l.m154716b(string, "");
            m138135a(i2, string, C69797ae.f155982c);
        }
        int i3 = this.f178202l;
        String string2 = C63247i.f143610a.getString(R.string.f7_);
        C89219l.m154716b(string2, "");
        m138135a(i3, string2, C69797ae.f155981b);
        int i4 = this.f178203t;
        String string3 = C63247i.f143610a.getString(R.string.f79);
        C89219l.m154716b(string3, "");
        m138135a(i4, string3, C69797ae.f155980a);
        TabHost tabHost3 = this.f178193b;
        if (tabHost3 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost3.setOnIndexChangedListener(new C79314b(this));
        String str = this.f178209z;
        if (C89219l.m154714a((Object) str, (Object) C69797ae.f155982c)) {
            i = this.f178201k;
            if (i < 0) {
                i = this.f178203t;
            }
        } else if (C89219l.m154714a((Object) str, (Object) C69797ae.f155981b)) {
            i = this.f178202l;
        } else {
            i = this.f178203t;
        }
        TabHost tabHost4 = this.f178193b;
        if (tabHost4 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost4.mo116831a(i, true, true);
        this.f178205v.mo7036a(this, new C79316c(this));
        C2560h<Boolean> hVar = this.f178206w;
        if (hVar != null) {
            hVar.mo7036a(this, new C79317d(this));
        }
        C2560h<C89391z> hVar2 = this.f178207x;
        if (hVar2 != null) {
            hVar2.mo7036a(this, new C79318e(this));
        }
        C2559g<C79322c> gVar = this.f178208y;
        if (gVar != null) {
            gVar.mo6997a(this, new C79320f(this));
        }
        this.f178192B.mo7036a(this, new C79321g(this));
        return viewGroup2;
    }

    /* renamed from: a */
    private final void m138135a(int i, String str, String str2) {
        C74294n E = m138133E();
        E.setText(str);
        E.setTag(str2);
        E.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        ScrollableLinearLayout scrollableLinearLayout = this.f178194c;
        if (scrollableLinearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        scrollableLinearLayout.addView(E, i);
        this.f178197f.add(str2);
    }

    public C79312b(C21582f fVar, C2563k<C83408c> kVar, C2564l<Integer> lVar, C2560h<Boolean> hVar, C2560h<C89391z> hVar2, C2559g<C79322c> gVar, String str, boolean z, C2549d<Integer> dVar) {
        int i;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f178204u = fVar;
        this.f178200i = kVar;
        this.f178205v = lVar;
        this.f178206w = hVar;
        this.f178207x = hVar2;
        this.f178208y = gVar;
        this.f178209z = str;
        this.f178191A = z;
        this.f178192B = dVar;
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        this.f178201k = i;
        this.f178202l = i + 1;
        this.f178203t = i + 2;
    }
}
