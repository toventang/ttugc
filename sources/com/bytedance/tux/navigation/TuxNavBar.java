package com.bytedance.tux.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.p037h.C0803x;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23186a;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23191e;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.FlexLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

public final class TuxNavBar extends FrameLayout {

    /* renamed from: a */
    public int f54906a;

    /* renamed from: b */
    public int f54907b;

    /* renamed from: c */
    private C23179a f54908c;

    /* renamed from: d */
    private int f54909d;

    /* renamed from: e */
    private int f54910e;

    /* renamed from: f */
    private int f54911f;

    /* renamed from: g */
    private int f54912g;

    /* renamed from: h */
    private final int f54913h;

    /* renamed from: i */
    private final int f54914i;

    /* renamed from: j */
    private HashMap f54915j;

    static {
        Covode.recordClassIndex(27116);
    }

    public TuxNavBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    public final View mo37723a(int i) {
        if (this.f54915j == null) {
            this.f54915j = new HashMap();
        }
        View view = (View) this.f54915j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f54915j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo37725a(C23194g gVar) {
        C89219l.m154719c(gVar, "");
        this.f54908c.f54918c = gVar;
        m43702b(gVar);
    }

    /* renamed from: a */
    public final void mo37727a(boolean z) {
        View a = mo37723a(R.id.cq3);
        C89219l.m154709a((Object) a, "");
        a.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public final void mo37726a(Object obj, AbstractC89172b<? super AbstractC23189c, C89391z> bVar) {
        AbstractC23189c cVar;
        C89219l.m154719c(obj, "");
        C89219l.m154719c(bVar, "");
        LinearLayout linearLayout = (LinearLayout) mo37723a(R.id.nav_start);
        C89219l.m154709a((Object) linearLayout, "");
        AbstractC89306h<View> a = C0803x.m2810a(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) mo37723a(R.id.nav_end);
        C89219l.m154709a((Object) linearLayout2, "");
        Iterator a2 = C89309k.m154800a((AbstractC89306h) a, (AbstractC89306h) C0803x.m2810a(linearLayout2)).mo2926a();
        int i = 0;
        while (a2.hasNext()) {
            Object next = a2.next();
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            View view = (View) next;
            if (m43699a(view, obj)) {
                if (i < this.f54908c.f54916a.size()) {
                    cVar = this.f54908c.f54916a.get(i);
                } else {
                    cVar = this.f54908c.f54917b.get(i - this.f54908c.f54916a.size());
                }
                bVar.invoke(cVar);
                if ((cVar instanceof C23187b) && (view instanceof TuxIconView)) {
                    m43697a((C23187b) cVar, (TuxIconView) view);
                } else if ((cVar instanceof C23191e) && (view instanceof TuxTextView)) {
                    m43698a((C23191e) cVar, (TuxTextView) view);
                }
            }
            i = i2;
        }
    }

    /* renamed from: b */
    private final void m43700b() {
        MethodCollector.m26663i(9008);
        ((LinearLayout) mo37723a(R.id.nav_end)).removeAllViews();
        Iterator<T> it = this.f54908c.f54917b.iterator();
        while (it.hasNext()) {
            m43704d(it.next());
        }
        MethodCollector.m26664o(9008);
    }

    /* renamed from: a */
    private final void m43696a() {
        MethodCollector.m26663i(8854);
        ((LinearLayout) mo37723a(R.id.nav_start)).removeAllViews();
        Iterator<T> it = this.f54908c.f54916a.iterator();
        while (it.hasNext()) {
            m43703c(it.next());
        }
        MethodCollector.m26664o(8854);
    }

    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$a */
    public static final class C23179a {

        /* renamed from: a */
        public final List<AbstractC23189c> f54916a = new ArrayList();

        /* renamed from: b */
        public final List<AbstractC23189c> f54917b = new ArrayList();

        /* renamed from: c */
        public C23194g f54918c;

        /* renamed from: d */
        public boolean f54919d;

        static {
            Covode.recordClassIndex(27117);
        }

        /* renamed from: a */
        public final C23179a mo37731a(C23194g gVar) {
            C89219l.m154719c(gVar, "");
            this.f54918c = gVar;
            return this;
        }

        /* renamed from: a */
        public final C23179a mo37732a(AbstractC23189c... cVarArr) {
            C89219l.m154719c(cVarArr, "");
            this.f54916a.addAll(C89064i.m154508i(cVarArr));
            return this;
        }

        /* renamed from: b */
        public final C23179a mo37733b(AbstractC23189c... cVarArr) {
            C89219l.m154719c(cVarArr, "");
            this.f54917b.addAll(C89064i.m154508i(cVarArr));
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$b */
    public static final class View$OnClickListenerC23180b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23194g f54920a;

        static {
            Covode.recordClassIndex(27118);
        }

        View$OnClickListenerC23180b(C23194g gVar) {
            this.f54920a = gVar;
        }

        public final void onClick(View view) {
            AbstractC23190d dVar = this.f54920a.f54935f;
            if (dVar != null) {
                dVar.mo37744a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$d */
    public static final class View$OnClickListenerC23182d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23187b f54923a;

        static {
            Covode.recordClassIndex(27120);
        }

        View$OnClickListenerC23182d(C23187b bVar) {
            this.f54923a = bVar;
        }

        public final void onClick(View view) {
            AbstractC23190d dVar = this.f54923a.f54935f;
            if (dVar != null) {
                dVar.mo37744a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$f */
    public static final class View$OnClickListenerC23184f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23191e f54927a;

        static {
            Covode.recordClassIndex(27122);
        }

        View$OnClickListenerC23184f(C23191e eVar) {
            this.f54927a = eVar;
        }

        public final void onClick(View view) {
            AbstractC23190d dVar = this.f54927a.f54935f;
            if (dVar != null) {
                dVar.mo37744a();
            }
        }
    }

    /* renamed from: a */
    public final void mo37724a(AbstractC23189c cVar) {
        C89219l.m154719c(cVar, "");
        this.f54908c.f54916a.add(cVar);
        m43696a();
    }

    /* renamed from: b */
    public final void mo37728b(AbstractC23189c cVar) {
        C89219l.m154719c(cVar, "");
        this.f54908c.f54917b.add(cVar);
        m43700b();
    }

    public final void setNavBackground(int i) {
        FlexLayout flexLayout = (FlexLayout) mo37723a(R.id.cq0);
        if (flexLayout != null) {
            flexLayout.setBackgroundColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$c */
    public static final class C23181c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxNavBar f54921a;

        /* renamed from: b */
        final /* synthetic */ C23194g f54922b;

        static {
            Covode.recordClassIndex(27119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23181c(TuxNavBar tuxNavBar, C23194g gVar) {
            super(1);
            this.f54921a = tuxNavBar;
            this.f54922b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54922b.f54945c;
            aVar2.f54434d = Integer.valueOf(this.f54921a.f54907b);
            return C89391z.f203057a;
        }
    }

    public final void setNavActions(C23179a aVar) {
        C89219l.m154719c(aVar, "");
        this.f54908c = aVar;
        m43696a();
        m43700b();
        m43702b(aVar.f54918c);
        mo37727a(aVar.f54919d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.navigation.TuxNavBar$e */
    public static final class C23183e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxNavBar f54924a;

        /* renamed from: b */
        final /* synthetic */ C23187b f54925b;

        /* renamed from: c */
        final /* synthetic */ int f54926c;

        static {
            Covode.recordClassIndex(27121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23183e(TuxNavBar tuxNavBar, C23187b bVar, int i) {
            super(1);
            this.f54924a = tuxNavBar;
            this.f54925b = bVar;
            this.f54926c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            int i;
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54925b.f54929a;
            if (this.f54925b.f54930b) {
                i = this.f54924a.f54907b;
            } else {
                i = this.f54924a.f54906a;
            }
            aVar2.f54434d = Integer.valueOf(i);
            aVar2.f54432b = this.f54926c;
            aVar2.f54433c = this.f54926c;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static View m43693a(C23186a aVar) {
        View view = aVar.f54928a;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        return view;
    }

    /* renamed from: c */
    private final void m43703c(AbstractC23189c cVar) {
        View a;
        MethodCollector.m26663i(8689);
        if (cVar instanceof C23191e) {
            a = m43695a((C23191e) cVar);
        } else if (cVar instanceof C23187b) {
            a = m43694a((C23187b) cVar);
        } else {
            if (cVar instanceof C23186a) {
                a = m43693a((C23186a) cVar);
            }
            MethodCollector.m26664o(8689);
        }
        if (a != null) {
            ((LinearLayout) mo37723a(R.id.nav_start)).addView(a);
            MethodCollector.m26664o(8689);
            return;
        }
        MethodCollector.m26664o(8689);
    }

    /* renamed from: d */
    private final void m43704d(AbstractC23189c cVar) {
        View a;
        MethodCollector.m26663i(8691);
        if (cVar instanceof C23191e) {
            a = m43695a((C23191e) cVar);
        } else if (cVar instanceof C23187b) {
            a = m43694a((C23187b) cVar);
        } else {
            if (cVar instanceof C23186a) {
                a = m43693a((C23186a) cVar);
            }
            MethodCollector.m26664o(8691);
        }
        if (a != null) {
            ((LinearLayout) mo37723a(R.id.nav_end)).addView(a);
            MethodCollector.m26664o(8691);
            return;
        }
        MethodCollector.m26664o(8691);
    }

    /* renamed from: a */
    private final View m43694a(C23187b bVar) {
        if (bVar.f54929a == -1 && bVar.f54931c == null && bVar.f54932d == null) {
            return null;
        }
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
        tuxIconView.setLayoutParams(new LinearLayout.LayoutParams(a, a));
        m43697a(bVar, tuxIconView);
        return tuxIconView;
    }

    /* renamed from: a */
    private final TuxTextView m43695a(C23191e eVar) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setGravity(17);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        C23163i.m43660a((View) tuxTextView, valueOf, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()))), (Integer) null, false, 26);
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system3.getDisplayMetrics())));
        layoutParams.gravity = 16;
        tuxTextView.setLayoutParams(layoutParams);
        m43698a(eVar, tuxTextView);
        return tuxTextView;
    }

    /* renamed from: b */
    private final void m43702b(C23194g gVar) {
        boolean z;
        if (gVar != null) {
            TuxTextView tuxTextView = (TuxTextView) mo37723a(R.id.cpx);
            C89219l.m154709a((Object) tuxTextView, "");
            m43701b(tuxTextView, gVar.f54936g);
            if (gVar.f54943a.length() > 0) {
                TuxTextView tuxTextView2 = (TuxTextView) mo37723a(R.id.cpx);
                C89219l.m154709a((Object) tuxTextView2, "");
                tuxTextView2.setText(gVar.f54943a);
            }
            CharSequence charSequence = gVar.f54944b;
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView3 = (TuxTextView) mo37723a(R.id.cq5);
                C89219l.m154709a((Object) tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) mo37723a(R.id.cq5);
                C89219l.m154709a((Object) tuxTextView4, "");
                tuxTextView4.setText(charSequence);
                ((TuxTextView) mo37723a(R.id.cpx)).setTuxFont(this.f54914i);
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) mo37723a(R.id.cq5);
                C89219l.m154709a((Object) tuxTextView5, "");
                tuxTextView5.setVisibility(8);
                ((TuxTextView) mo37723a(R.id.cpx)).setTuxFont(this.f54913h);
            }
            if (gVar.f54945c != -1) {
                C22999a a = C23005c.m43393a(new C23181c(this, gVar));
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                C23001b a2 = a.mo37368a(context);
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                a2.setBounds(0, 0, a3, C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics())));
                if (C23163i.m43664a(this)) {
                    ((TuxTextView) mo37723a(R.id.cpx)).setCompoundDrawables(a2, null, null, null);
                } else {
                    ((TuxTextView) mo37723a(R.id.cpx)).setCompoundDrawables(null, null, a2, null);
                }
                ((TuxTextView) mo37723a(R.id.cpx)).setOnClickListener(new View$OnClickListenerC23180b(gVar));
                return;
            }
            ((TuxTextView) mo37723a(R.id.cpx)).setCompoundDrawables(null, null, null, null);
        }
    }

    /* renamed from: b */
    private static void m43701b(View view, Object obj) {
        view.setTag(R.id.er6, obj);
    }

    /* renamed from: a */
    public static boolean m43699a(View view, Object obj) {
        Object tag = view.getTag(R.id.er6);
        if (tag == null || !tag.equals(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m43697a(C23187b bVar, TuxIconView tuxIconView) {
        int i;
        AbstractC89172b<? super TuxIconView, C89391z> bVar2;
        m43701b(tuxIconView, bVar.f54936g);
        if (bVar.f54933e) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        if (bVar.f54930b) {
            C23163i.m43666b(tuxIconView);
            tuxIconView.setOnClickListener(new View$OnClickListenerC23182d(bVar));
        } else {
            tuxIconView.setOnTouchListener(null);
            tuxIconView.setOnClickListener(null);
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        C22999a aVar = bVar.f54931c;
        if (aVar != null) {
            if (aVar.f54432b < 0) {
                aVar.f54432b = a;
            }
            if (aVar.f54433c < 0) {
                aVar.f54433c = a;
            }
            tuxIconView.setTuxIcon(aVar);
        } else if (bVar.f54929a != -1) {
            tuxIconView.setTuxIcon(C23005c.m43393a(new C23183e(this, bVar, a)));
        } else if (bVar.f54932d != null && (bVar2 = bVar.f54932d) != null) {
            bVar2.invoke(tuxIconView);
        }
    }

    /* renamed from: a */
    private final void m43698a(C23191e eVar, TuxTextView tuxTextView) {
        int i;
        m43701b(tuxTextView, eVar.f54936g);
        if (eVar.f54940d) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
        if (C23196b.f54947a[eVar.f54938b.ordinal()] != 1) {
            tuxTextView.setTuxFont(this.f54910e);
            tuxTextView.setTextColor(this.f54912g);
        } else {
            tuxTextView.setTuxFont(this.f54909d);
            tuxTextView.setTextColor(this.f54911f);
        }
        if (eVar.f54939c) {
            C23163i.m43666b(tuxTextView);
            tuxTextView.setOnClickListener(new View$OnClickListenerC23184f(eVar));
        } else {
            tuxTextView.setTextColor(this.f54906a);
            tuxTextView.setOnTouchListener(null);
            tuxTextView.setOnClickListener(null);
        }
        tuxTextView.setText(eVar.f54937a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxNavBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9012);
        this.f54908c = new C23179a();
        this.f54906a = -16777216;
        this.f54911f = -16777216;
        this.f54912g = -16777216;
        this.f54907b = -16777216;
        View.inflate(context, R.layout.j, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.e1, R.attr.e2, R.attr.e3, R.attr.e4, R.attr.e5, R.attr.e6, R.attr.e7, R.attr.e8, R.attr.e9, R.attr.e_, R.attr.ea, R.attr.eb, R.attr.ec}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(3, -16777216);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        this.f54910e = obtainStyledAttributes.getInt(0, 0);
        this.f54909d = obtainStyledAttributes.getInt(1, 0);
        this.f54911f = obtainStyledAttributes.getColor(8, -16777216);
        this.f54912g = obtainStyledAttributes.getColor(7, -16777216);
        this.f54906a = obtainStyledAttributes.getColor(6, -16777216);
        int i2 = obtainStyledAttributes.getInt(10, 0);
        this.f54913h = i2;
        this.f54914i = obtainStyledAttributes.getInt(11, 0);
        int i3 = obtainStyledAttributes.getInt(5, 0);
        int color3 = obtainStyledAttributes.getColor(9, -16777216);
        this.f54907b = color3;
        int color4 = obtainStyledAttributes.getColor(4, -16777216);
        float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
        obtainStyledAttributes.recycle();
        TuxTextView tuxTextView = (TuxTextView) mo37723a(R.id.cpx);
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(color3);
        tuxTextView.setMinTextSizePx((int) dimension);
        TuxTextView tuxTextView2 = (TuxTextView) mo37723a(R.id.cq5);
        tuxTextView2.setTuxFont(i3);
        tuxTextView2.setTextColor(color4);
        mo37723a(R.id.cq3).setBackgroundColor(color);
        setNavBackground(color2);
        MethodCollector.m26664o(9012);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxNavBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.bz : i);
    }
}
