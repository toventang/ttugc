package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.p1398a.C19447a;
import com.google.android.material.tabs.TabLayout;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.viewpager.c */
public final class C19450c extends LinearLayout {

    /* renamed from: g */
    public static final C19452b f46081g = new C19452b((byte) 0);

    /* renamed from: A */
    private int f46082A;

    /* renamed from: B */
    private boolean f46083B;

    /* renamed from: C */
    private int f46084C;

    /* renamed from: a */
    final C19451a f46085a;

    /* renamed from: b */
    public boolean f46086b;

    /* renamed from: c */
    public final List<LynxViewpagerItem> f46087c;

    /* renamed from: d */
    final List<String> f46088d;

    /* renamed from: e */
    public int f46089e;

    /* renamed from: f */
    public AbstractC19453c f46090f;

    /* renamed from: h */
    private LynxTabBarView f46091h;

    /* renamed from: i */
    private int f46092i;

    /* renamed from: j */
    private int f46093j;

    /* renamed from: k */
    private int f46094k;

    /* renamed from: l */
    private float f46095l = 9.0f;

    /* renamed from: m */
    private AbstractC19455e f46096m;

    /* renamed from: n */
    private ViewPager f46097n;

    /* renamed from: o */
    private TabLayout f46098o;

    /* renamed from: p */
    private float f46099p;

    /* renamed from: q */
    private int f46100q;

    /* renamed from: r */
    private float f46101r;

    /* renamed from: s */
    private int f46102s;

    /* renamed from: t */
    private boolean f46103t;

    /* renamed from: u */
    private boolean f46104u;

    /* renamed from: v */
    private TabLayout.AbstractC26717c f46105v;

    /* renamed from: w */
    private AbstractC19454d f46106w;

    /* renamed from: x */
    private int f46107x;

    /* renamed from: y */
    private int f46108y;

    /* renamed from: z */
    private int f46109z;

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$c */
    public interface AbstractC19453c {
        static {
            Covode.recordClassIndex(22285);
        }

        /* renamed from: a */
        void mo31065a(TabLayout.C26722f fVar);
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$d */
    public interface AbstractC19454d {
        static {
            Covode.recordClassIndex(22286);
        }

        /* renamed from: a */
        void mo31076a(TabLayout tabLayout, boolean z);
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$e */
    public interface AbstractC19455e {
        static {
            Covode.recordClassIndex(22287);
        }

        /* renamed from: a */
        void mo31064a(boolean z);
    }

    static {
        Covode.recordClassIndex(22282);
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$b */
    public static final class C19452b {
        static {
            Covode.recordClassIndex(22284);
        }

        private C19452b() {
        }

        public /* synthetic */ C19452b(byte b) {
            this();
        }
    }

    public final AbstractC19455e getInterceptTouchEventListener() {
        return this.f46096m;
    }

    public final TabLayout getMTabLayout() {
        return this.f46098o;
    }

    public final List<String> getMTabLayoutTitles() {
        return this.f46088d;
    }

    public final ViewPager getMViewPager() {
        return this.f46097n;
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$a */
    public final class C19451a extends PagerAdapter {
        static {
            Covode.recordClassIndex(22283);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return C19450c.this.f46087c.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C19451a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            C89219l.m154719c(obj, "");
            int a = C89070n.m154546a((List) C19450c.this.f46087c, obj);
            if (a == -1) {
                return -2;
            }
            return a;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            if (i + 1 > C19450c.this.getMTabLayoutTitles().size() || C19450c.this.f46089e == 1) {
                return null;
            }
            return C19450c.this.getMTabLayoutTitles().get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(obj, "");
            if (!(obj instanceof LynxViewpagerItem) || view != ((LynxUI) obj).mView) {
                return false;
            }
            return true;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            MethodCollector.m26663i(6536);
            C89219l.m154719c(viewGroup, "");
            LynxViewpagerItem lynxViewpagerItem = C19450c.this.f46087c.get(i);
            viewGroup.addView(lynxViewpagerItem.mView);
            lynxViewpagerItem.mo31125a(true, i);
            MethodCollector.m26664o(6536);
            return lynxViewpagerItem;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m26663i(6539);
            C89219l.m154719c(viewGroup, "");
            C89219l.m154719c(obj, "");
            if (obj instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) obj;
                viewGroup.removeView(lynxViewpagerItem.mView);
                lynxViewpagerItem.mo31125a(false, i);
            }
            MethodCollector.m26664o(6539);
        }
    }

    /* renamed from: b */
    private final void m36288b() {
        if (this.f46098o == null) {
            mo31080a((TabLayout) null);
        }
    }

    /* renamed from: c */
    private final void m36289c() {
        Drawable background;
        if (this.f46098o == null) {
            mo31080a((TabLayout) null);
        }
        TabLayout tabLayout = this.f46098o;
        if (tabLayout == null || tabLayout.getBackground() == null) {
            TabLayout tabLayout2 = this.f46098o;
            if (tabLayout2 != null) {
                tabLayout2.setBackgroundResource(R.drawable.b3w);
            }
            TabLayout tabLayout3 = this.f46098o;
            if (tabLayout3 != null && (background = tabLayout3.getBackground()) != null) {
                background.mutate();
            }
        }
    }

    /* renamed from: d */
    private final void m36290d() {
        Drawable background;
        if (Build.VERSION.SDK_INT < 23 && this.f46094k > 0 && this.f46092i > 0 && this.f46093j > 0) {
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            int a = (C19447a.m36281a(context) - this.f46093j) / 2;
            int i = this.f46094k - this.f46092i;
            TabLayout tabLayout = this.f46098o;
            if (tabLayout == null || (background = tabLayout.getBackground()) == null) {
                throw new C89388w("null cannot be cast to non-null type");
            }
            ((LayerDrawable) background).setLayerInset(1, a, i, a, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31077a() {
        TabLayout.C26722f tabAt;
        Typeface typeface;
        int i;
        Typeface typeface2;
        if (this.f46089e == 1) {
            LynxTabBarView lynxTabBarView = this.f46091h;
            if (lynxTabBarView != null) {
                lynxTabBarView.mo31012a(0, 0);
                return;
            }
            return;
        }
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            int tabCount = tabLayout.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout tabLayout2 = this.f46098o;
                if (!(tabLayout2 == null || (tabAt = tabLayout2.getTabAt(i2)) == null)) {
                    C89219l.m154709a((Object) tabAt, "");
                    if (i2 == this.f46084C) {
                        tabAt.mo44370a();
                    }
                    if (tabAt.f63312f == null) {
                        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aed, tabAt.f63314h, false);
                        TextView textView = (TextView) a.findViewById(16908308);
                        C89219l.m154709a((Object) textView, "");
                        textView.setText(tabAt.f63309c);
                        TabLayout tabLayout3 = this.f46098o;
                        if (tabLayout3 == null || i2 != tabLayout3.getSelectedTabPosition()) {
                            textView.setTextSize(1, this.f46101r);
                            if (this.f46104u) {
                                typeface = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface);
                            int i3 = this.f46102s;
                            if (i3 != 0) {
                                textView.setTextColor(i3);
                            }
                        } else {
                            textView.setTextSize(1, this.f46099p);
                            if (this.f46103t) {
                                typeface2 = Typeface.DEFAULT_BOLD;
                            } else {
                                typeface2 = Typeface.DEFAULT;
                            }
                            textView.setTypeface(typeface2);
                            int i4 = this.f46100q;
                            if (i4 != 0) {
                                textView.setTextColor(i4);
                            }
                        }
                        tabAt.mo44368a(a);
                        TabLayout.TabView tabView = tabAt.f63314h;
                        C89219l.m154709a((Object) tabView, "");
                        tabView.setBackgroundColor(0);
                        Context context = getContext();
                        C89219l.m154709a((Object) context, "");
                        int a2 = C19447a.m36282a(context, this.f46095l);
                        if (this.f46107x == -1109) {
                            this.f46107x = a2;
                        }
                        if (this.f46108y == -1109) {
                            this.f46108y = a2;
                        }
                        if (i2 == 0) {
                            i = this.f46107x;
                        } else {
                            i = a2;
                        }
                        if (i2 == this.f46088d.size() - 1) {
                            a2 = this.f46108y;
                        }
                        View view = tabAt.f63312f;
                        if (view == null) {
                            C89219l.m154707a();
                        }
                        View view2 = tabAt.f63312f;
                        if (view2 == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) view2, "");
                        int paddingTop = view2.getPaddingTop();
                        View view3 = tabAt.f63312f;
                        if (view3 == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) view3, "");
                        C0792v.m2741a(view, i, paddingTop, a2, view3.getPaddingBottom());
                        TabLayout.TabView tabView2 = tabAt.f63314h;
                        if (tabView2 != null) {
                            tabView2.setOnClickListener(new View$OnClickListenerC19457g(this, tabAt));
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void setInterceptTouchEventListener(AbstractC19455e eVar) {
        this.f46096m = eVar;
    }

    public final void setMTabLayout(TabLayout tabLayout) {
        this.f46098o = tabLayout;
    }

    public final void setRTLMode(boolean z) {
        this.f46086b = z;
    }

    public final void setSelectedIndex(int i) {
        this.f46084C = i;
    }

    public final void setTabBarDragEnable(boolean z) {
        this.f46083B = z;
    }

    /* renamed from: a */
    public final void mo31079a(View view) {
        if (view != null) {
            removeView(view);
        }
    }

    public final void setCurrentSelectIndex(int i) {
        this.f46097n.setCurrentItem(i);
    }

    public final void setMViewPager(ViewPager viewPager) {
        C89219l.m154719c(viewPager, "");
        this.f46097n = viewPager;
    }

    public final void setTabClickListenerListener(AbstractC19453c cVar) {
        C89219l.m154719c(cVar, "");
        this.f46090f = cVar;
    }

    public final void setTabInterspace(float f) {
        this.f46095l = f / 2.0f;
    }

    public final void setTabLayoutUpdateListener$x_element_fold_view_newelement(AbstractC19454d dVar) {
        C89219l.m154719c(dVar, "");
        this.f46106w = dVar;
    }

    public final void setTabSelectedListener$x_element_fold_view_newelement(TabLayout.AbstractC26717c cVar) {
        C89219l.m154719c(cVar, "");
        this.f46105v = cVar;
    }

    /* renamed from: com.bytedance.ies.xelement.viewpager.c$f */
    public static final class C19456f extends ViewPager {

        /* renamed from: a */
        final /* synthetic */ C19450c f46111a;

        /* renamed from: b */
        final /* synthetic */ Context f46112b;

        static {
            Covode.recordClassIndex(22288);
        }

        @Override // androidx.viewpager.widget.ViewPager
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            AbstractC19455e interceptTouchEventListener = this.f46111a.getInterceptTouchEventListener();
            if (interceptTouchEventListener != null) {
                interceptTouchEventListener.mo31064a(onInterceptTouchEvent);
            }
            return onInterceptTouchEvent;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19456f(C19450c cVar, Context context, Context context2) {
            super(context2);
            this.f46111a = cVar;
            this.f46112b = context;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.viewpager.c$g */
    public static final class View$OnClickListenerC19457g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C19450c f46113a;

        /* renamed from: b */
        final /* synthetic */ TabLayout.C26722f f46114b;

        static {
            Covode.recordClassIndex(22289);
        }

        View$OnClickListenerC19457g(C19450c cVar, TabLayout.C26722f fVar) {
            this.f46113a = cVar;
            this.f46114b = fVar;
        }

        public final void onClick(View view) {
            AbstractC19453c cVar = this.f46113a.f46090f;
            if (cVar != null) {
                cVar.mo31065a(this.f46114b);
            }
        }
    }

    public final void setTabLayout(LynxTabBarView lynxTabBarView) {
        C89219l.m154719c(lynxTabBarView, "");
        this.f46091h = lynxTabBarView;
        mo31080a(lynxTabBarView.mo31011a());
    }

    public final void setLynxDirection(int i) {
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            if (i == 2 || i == 2) {
                C0792v.m2759b((View) tabLayout, 1);
            } else {
                C0792v.m2759b((View) tabLayout, 0);
            }
        }
    }

    public final void setSelectedTabIndicatorColor(String str) {
        C89219l.m154719c(str, "");
        m36288b();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(C19447a.m36283a(str));
        }
    }

    public final void setTabPaddingBottom(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f46082A = C19447a.m36282a(context, (float) i);
        mo31077a();
    }

    public final void setTabPaddingEnd(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f46108y = C19447a.m36282a(context, (float) i);
        mo31077a();
    }

    public final void setTabPaddingStart(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f46107x = C19447a.m36282a(context, (float) i);
        mo31077a();
    }

    public final void setTabPaddingTop(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f46109z = C19447a.m36282a(context, (float) i);
        mo31077a();
    }

    public final void setBorderLineColor(String str) {
        Drawable drawable;
        C89219l.m154719c(str, "");
        m36289c();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                ((GradientDrawable) drawable2).setColor(C19447a.m36283a(str));
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setSelectedTextColor(String str) {
        Integer valueOf;
        TabLayout.C26722f tabAt;
        View view;
        TextView textView;
        C89219l.m154719c(str, "");
        this.f46100q = C19447a.m36283a(str);
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null && (valueOf = Integer.valueOf(tabLayout.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            TabLayout tabLayout2 = this.f46098o;
            if (tabLayout2 != null && (tabAt = tabLayout2.getTabAt(intValue)) != null && (view = tabAt.f63312f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextSize(float f) {
        Integer valueOf;
        TabLayout.C26722f tabAt;
        View view;
        TextView textView;
        this.f46099p = f;
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null && (valueOf = Integer.valueOf(tabLayout.getSelectedTabPosition())) != null) {
            int intValue = valueOf.intValue();
            TabLayout tabLayout2 = this.f46098o;
            if (tabLayout2 != null && (tabAt = tabLayout2.getTabAt(intValue)) != null && (view = tabAt.f63312f) != null && (textView = (TextView) view.findViewById(16908308)) != null) {
                setSelectedTextStyle(textView);
            }
        }
    }

    public final void setSelectedTextStyle(TextView textView) {
        Typeface typeface;
        C89219l.m154719c(textView, "");
        if (this.f46089e == 0) {
            textView.setTextSize(1, this.f46099p);
            if (this.f46103t) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            textView.setTextColor(this.f46100q);
        }
    }

    public final void setTabbarBackground(String str) {
        Drawable drawable;
        C89219l.m154719c(str, "");
        m36289c();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                ((GradientDrawable) drawable2).setColor(C19447a.m36283a(str));
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setTextBold(String str) {
        C89219l.m154719c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1577166796) {
            if (hashCode == 1191572123 && str.equals("selected")) {
                this.f46103t = true;
                this.f46104u = false;
            }
        } else if (str.equals("unselected")) {
            this.f46104u = true;
            this.f46103t = false;
        }
    }

    public final void setUnSelectedTextStyle(TextView textView) {
        Typeface typeface;
        C89219l.m154719c(textView, "");
        if (this.f46089e == 0) {
            textView.setTextSize(1, this.f46101r);
            if (this.f46104u) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            textView.setTextColor(this.f46102s);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19450c(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(5249);
        C19451a aVar = new C19451a();
        this.f46085a = aVar;
        this.f46097n = new C19456f(this, context, context);
        this.f46087c = new ArrayList();
        this.f46088d = new ArrayList();
        this.f46099p = 16.0f;
        this.f46101r = 16.0f;
        this.f46107x = -1109;
        this.f46108y = -1109;
        this.f46109z = -1109;
        this.f46082A = -1109;
        this.f46083B = true;
        setOrientation(1);
        this.f46097n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f46097n.setAdapter(aVar);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(this.f46097n, 0);
        MethodCollector.m26664o(5249);
    }

    public final void setBorderHeight(float f) {
        Drawable drawable;
        m36289c();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                gradientDrawable.setSize(intrinsicWidth, C19447a.m36282a(context, f));
                Context context2 = getContext();
                C89219l.m154709a((Object) context2, "");
                this.f46092i = C19447a.m36282a(context2, f);
                m36290d();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setBorderWidth(float f) {
        Drawable drawable;
        m36289c();
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        int a = (int) (((float) C19447a.m36281a(context)) * (f / 375.0f));
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getBackground();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(1);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                gradientDrawable.setSize(a, gradientDrawable.getIntrinsicHeight());
                Context context2 = getContext();
                C89219l.m154709a((Object) context2, "");
                this.f46093j = C19447a.m36282a(context2, f);
                m36290d();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorHeight(float f) {
        Drawable drawable;
        m36288b();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                int intrinsicWidth = gradientDrawable.getIntrinsicWidth();
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                gradientDrawable.setSize(intrinsicWidth, C19447a.m36282a(context, f));
                TabLayout tabLayout2 = this.f46098o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorRadius(float f) {
        Drawable drawable;
        m36288b();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                ((GradientDrawable) drawable2).setCornerRadius((float) C19447a.m36282a(context, f));
                TabLayout tabLayout2 = this.f46098o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setTabIndicatorWidth(float f) {
        Drawable drawable;
        m36288b();
        TabLayout tabLayout = this.f46098o;
        if (tabLayout != null) {
            drawable = tabLayout.getTabSelectedIndicator();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Drawable drawable2 = ((LayerDrawable) drawable).getDrawable(0);
            if (drawable2 != null) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                gradientDrawable.setSize((int) (((float) C19447a.m36281a(context)) * (f / 375.0f)), gradientDrawable.getIntrinsicHeight());
                TabLayout tabLayout2 = this.f46098o;
                if (tabLayout2 != null) {
                    tabLayout2.requestLayout();
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public final void setUnSelectedTextColor(String str) {
        Integer num;
        TabLayout tabLayout;
        TabLayout.C26722f tabAt;
        TextView textView;
        C89219l.m154719c(str, "");
        TabLayout tabLayout2 = this.f46098o;
        if (tabLayout2 != null) {
            num = Integer.valueOf(tabLayout2.getSelectedTabPosition());
        } else {
            num = null;
        }
        this.f46102s = C19447a.m36283a(str);
        TabLayout tabLayout3 = this.f46098o;
        if (tabLayout3 != null) {
            int tabCount = tabLayout3.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if (!((num != null && num.intValue() == i) || (tabLayout = this.f46098o) == null || (tabAt = tabLayout.getTabAt(i)) == null)) {
                    C89219l.m154709a((Object) tabAt, "");
                    View view = tabAt.f63312f;
                    if (!(view == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                        setUnSelectedTextStyle(textView);
                    }
                }
            }
        }
    }

    public final void setUnSelectedTextSize(float f) {
        Integer num;
        TabLayout tabLayout;
        TabLayout.C26722f tabAt;
        TextView textView;
        this.f46101r = f;
        TabLayout tabLayout2 = this.f46098o;
        if (tabLayout2 != null) {
            num = Integer.valueOf(tabLayout2.getSelectedTabPosition());
        } else {
            num = null;
        }
        TabLayout tabLayout3 = this.f46098o;
        if (tabLayout3 != null) {
            int tabCount = tabLayout3.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                if (!((num != null && num.intValue() == i) || (tabLayout = this.f46098o) == null || (tabAt = tabLayout.getTabAt(i)) == null)) {
                    C89219l.m154709a((Object) tabAt, "");
                    View view = tabAt.f63312f;
                    if (!(view == null || (textView = (TextView) view.findViewById(16908308)) == null)) {
                        setUnSelectedTextStyle(textView);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31080a(TabLayout tabLayout) {
        if (tabLayout != null) {
            removeView(this.f46098o);
            TabLayout tabLayout2 = this.f46098o;
            if (tabLayout2 != null) {
                tabLayout2.setupWithViewPager(null);
            }
            this.f46098o = tabLayout;
            this.f46088d.clear();
            this.f46089e = 1;
        } else if (this.f46098o == null) {
            Context context = getContext();
            C89219l.m154709a((Object) context, "");
            TabLayout a = LynxTabBarView.C19431a.m36268a(context);
            this.f46098o = a;
            TabLayout.AbstractC26717c cVar = this.f46105v;
            if (!(cVar == null || a == null)) {
                a.addOnTabSelectedListener(cVar);
            }
        } else {
            return;
        }
        TabLayout tabLayout3 = this.f46098o;
        if (tabLayout3 != null) {
            tabLayout3.setupWithViewPager(this.f46097n);
        }
        addView(this.f46098o, 0);
        AbstractC19454d dVar = this.f46106w;
        if (dVar != null) {
            TabLayout tabLayout4 = this.f46098o;
            if (tabLayout4 == null) {
                C89219l.m154707a();
            }
            dVar.mo31076a(tabLayout4, this.f46083B);
        }
    }

    public final void setTablayoutGravity(String str) {
        Class<?> cls;
        Field declaredField;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        C89219l.m154719c(str, "");
        m36288b();
        Locale locale = Locale.ROOT;
        C89219l.m154709a((Object) locale, "");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154709a((Object) lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3143043) {
                if (hashCode == 3317767 && lowerCase.equals("left")) {
                    TabLayout tabLayout = this.f46098o;
                    if (!(tabLayout == null || (layoutParams3 = tabLayout.getLayoutParams()) == null)) {
                        layoutParams3.width = -1;
                    }
                    TabLayout tabLayout2 = this.f46098o;
                    if (tabLayout2 != null) {
                        tabLayout2.requestLayout();
                    }
                }
            } else if (lowerCase.equals("fill")) {
                TabLayout tabLayout3 = this.f46098o;
                if (tabLayout3 != null) {
                    tabLayout3.setTabMode(1);
                }
                TabLayout tabLayout4 = this.f46098o;
                if (!(tabLayout4 == null || (layoutParams2 = tabLayout4.getLayoutParams()) == null)) {
                    layoutParams2.width = -1;
                }
                TabLayout tabLayout5 = this.f46098o;
                if (tabLayout5 != null) {
                    tabLayout5.setTabGravity(0);
                }
                TabLayout tabLayout6 = this.f46098o;
                if (tabLayout6 != null) {
                    tabLayout6.requestLayout();
                }
            }
        } else if (lowerCase.equals("center")) {
            TabLayout tabLayout7 = this.f46098o;
            if (tabLayout7 != null) {
                tabLayout7.setTabGravity(1);
            }
            TabLayout tabLayout8 = this.f46098o;
            if (!(tabLayout8 == null || (layoutParams = tabLayout8.getLayoutParams()) == null)) {
                layoutParams.width = -1;
            }
            try {
                TabLayout tabLayout9 = this.f46098o;
                if (!(tabLayout9 == null || (cls = tabLayout9.getClass()) == null || (declaredField = cls.getDeclaredField("slidingTabIndicator")) == null)) {
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.f46098o);
                    if (obj != null) {
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.setGravity(17);
                        linearLayout.getLayoutParams().width = -2;
                        C89379q.m157068constructorimpl(C89391z.f203057a);
                        TabLayout tabLayout10 = this.f46098o;
                        if (tabLayout10 != null) {
                            tabLayout10.requestLayout();
                            return;
                        }
                        return;
                    }
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* renamed from: a */
    public final void mo31078a(float f, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        if (z) {
            TabLayout tabLayout = this.f46098o;
            if (!(tabLayout == null || (layoutParams3 = tabLayout.getLayoutParams()) == null)) {
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                layoutParams3.height = C19447a.m36284b(context, f);
            }
        } else {
            TabLayout tabLayout2 = this.f46098o;
            if (!(tabLayout2 == null || (layoutParams = tabLayout2.getLayoutParams()) == null)) {
                Context context2 = getContext();
                C89219l.m154709a((Object) context2, "");
                layoutParams.height = C19447a.m36282a(context2, f);
            }
        }
        TabLayout tabLayout3 = this.f46098o;
        if (tabLayout3 == null || (layoutParams2 = tabLayout3.getLayoutParams()) == null) {
            i = 0;
        } else {
            i = layoutParams2.height;
        }
        this.f46094k = i;
        m36290d();
        TabLayout tabLayout4 = this.f46098o;
        if (tabLayout4 != null) {
            tabLayout4.requestLayout();
        }
    }
}
