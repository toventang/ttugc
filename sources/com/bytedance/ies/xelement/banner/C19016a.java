package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ies.xelement.banner.a */
public final class C19016a extends FrameLayout implements ViewPager.AbstractC1579e {

    /* renamed from: A */
    private int f44990A;

    /* renamed from: B */
    private int f44991B;

    /* renamed from: C */
    private int f44992C;

    /* renamed from: D */
    private List<View> f44993D;

    /* renamed from: E */
    private LinearLayout f44994E;

    /* renamed from: F */
    private C19020a f44995F;

    /* renamed from: G */
    private ViewPager.AbstractC1579e f44996G;

    /* renamed from: H */
    private Method f44997H;

    /* renamed from: I */
    private Field f44998I;

    /* renamed from: a */
    public int f44999a;

    /* renamed from: b */
    public int f45000b;

    /* renamed from: c */
    public int f45001c;

    /* renamed from: d */
    public int f45002d;

    /* renamed from: e */
    public String f45003e;

    /* renamed from: f */
    public boolean f45004f;

    /* renamed from: g */
    public boolean f45005g;

    /* renamed from: h */
    boolean f45006h;

    /* renamed from: i */
    public boolean f45007i;

    /* renamed from: j */
    int f45008j;

    /* renamed from: k */
    public int f45009k;

    /* renamed from: l */
    public int f45010l;

    /* renamed from: m */
    public BannerViewPager f45011m;

    /* renamed from: n */
    boolean f45012n;

    /* renamed from: o */
    public List<LynxUI> f45013o;

    /* renamed from: p */
    public final Runnable f45014p;

    /* renamed from: q */
    private int f45015q;

    /* renamed from: r */
    private int f45016r;

    /* renamed from: s */
    private int f45017s;

    /* renamed from: t */
    private int f45018t;

    /* renamed from: u */
    private int f45019u;

    /* renamed from: v */
    private int f45020v;

    /* renamed from: w */
    private int f45021w;

    /* renamed from: x */
    private int f45022x;

    /* renamed from: y */
    private boolean f45023y;

    /* renamed from: z */
    private boolean f45024z;

    static {
        Covode.recordClassIndex(21772);
    }

    /* renamed from: d */
    private void m35322d() {
        removeCallbacks(this.f45014p);
        postDelayed(this.f45014p, (long) this.f45000b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.banner.a$a */
    public class C19020a extends PagerAdapter {
        static {
            Covode.recordClassIndex(21776);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            if (C19016a.this.f45004f) {
                return C19016a.this.f44999a;
            }
            return C19016a.this.f45013o.size();
        }

        C19020a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i) {
            if (C19016a.this.f45003e.equals("multi-pages")) {
                if (C19016a.this.f45010l == 0) {
                    return 1.0f;
                }
                return ((float) C19016a.this.f45002d) / ((float) C19016a.this.f45010l);
            } else if (C19016a.this.f45003e.equals("carousel")) {
                return 0.8f;
            } else {
                return 1.0f;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            boolean z;
            FrameLayout frameLayout;
            MethodCollector.m26663i(7836);
            int n = C19016a.this.mo30247n(i);
            C19016a aVar = C19016a.this;
            if (aVar.f45013o.size() == 0) {
                frameLayout = new View(aVar.getContext());
            } else {
                LynxUI lynxUI = aVar.f45013o.get(n);
                T t = lynxUI.mView;
                FrameLayout frameLayout2 = new FrameLayout(aVar.getContext());
                if (t instanceof ViewGroup) {
                    if (lynxUI.getOverflow() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    frameLayout2.setClipChildren(z);
                }
                if (t.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t.getParent()).removeView(t);
                }
                if (aVar.f45012n) {
                    t.setTag("swiper_lynx_view_tag");
                }
                frameLayout2.addView(t);
                View view = new View(aVar.getContext());
                frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -1));
                if (!aVar.f45006h) {
                    view.setBackgroundColor(aVar.f45008j);
                    view.setTag("swiper_item_mask_tag");
                }
                frameLayout = frameLayout2;
                if (aVar.f45012n) {
                    frameLayout2.setTag(Integer.valueOf(i));
                    frameLayout = frameLayout2;
                }
            }
            viewGroup.addView(frameLayout);
            MethodCollector.m26664o(7836);
            return frameLayout;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            MethodCollector.m26663i(7970);
            viewGroup.removeView((View) obj);
            MethodCollector.m26664o(7970);
        }
    }

    /* renamed from: e */
    private void m35323e() {
        try {
            if (this.f44998I == null) {
                Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
                this.f44998I = declaredField;
                declaredField.setAccessible(true);
            }
            this.f44998I.set(this.f45011m, true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo30230b() {
        if (!this.f45012n || !this.f45004f || !"normal".equals(this.f45003e) || this.f45013o.size() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m35321c() {
        if (this.f44995F != null) {
            for (View view : this.f44993D) {
                view.setBackground(m35324o(this.f44991B));
            }
            int i = 0;
            int i2 = this.f45009k;
            if (i2 >= 0 && i2 < this.f44993D.size()) {
                i = this.f45009k;
            }
            if (this.f44993D.size() > 0) {
                this.f44993D.get(i).setBackground(m35324o(this.f44990A));
                this.f44992C = this.f45011m.getCurrentItem();
            }
        }
    }

    /* renamed from: a */
    public final void mo30226a() {
        int i;
        m35319a(this.f45003e, this.f45018t, this.f45019u, this.f45020v);
        mo30237e(this.f45024z);
        if (this.f44995F == null) {
            this.f44995F = new C19020a();
            this.f45011m.addOnPageChangeListener(this);
            this.f45011m.setAdapter(this.f44995F);
        }
        int i2 = this.f45009k;
        if (i2 < 0 || i2 >= this.f45013o.size()) {
            this.f45009k = 0;
        }
        if (this.f45004f) {
            i = (this.f44999a / 2) + this.f45009k;
        } else {
            i = this.f45009k;
        }
        boolean z = this.f45007i;
        try {
            m35323e();
            if (this.f44997H == null) {
                Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", Integer.TYPE, Boolean.TYPE, Boolean.TYPE);
                this.f44997H = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            this.f44997H.invoke(this.f45011m, Integer.valueOf(i), Boolean.valueOf(z), true);
        } catch (Throwable unused) {
            this.f45011m.setCurrentItem(i, z);
        }
        if (this.f45005g) {
            m35322d();
        }
    }

    /* renamed from: a */
    public final C19016a mo30222a(int i) {
        this.f44990A = i;
        return this;
    }

    /* renamed from: b */
    public final C19016a mo30227b(int i) {
        this.f44991B = i;
        return this;
    }

    /* renamed from: c */
    public final C19016a mo30231c(int i) {
        this.f45008j = i;
        return this;
    }

    /* renamed from: d */
    public final C19016a mo30234d(boolean z) {
        this.f45023y = z;
        return this;
    }

    /* renamed from: e */
    public final C19016a mo30236e(int i) {
        this.f45001c = i;
        return this;
    }

    /* renamed from: j */
    public final C19016a mo30243j(int i) {
        this.f45002d = i;
        return this;
    }

    /* renamed from: k */
    public final C19016a mo30244k(int i) {
        this.f45021w = i;
        return this;
    }

    /* renamed from: l */
    public final C19016a mo30245l(int i) {
        this.f45022x = i;
        return this;
    }

    /* renamed from: m */
    public final C19016a mo30246m(int i) {
        this.f45010l = i;
        return this;
    }

    public final void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        this.f44996G = eVar;
    }

    public final void setTwoItemCircularSwipe(boolean z) {
        this.f45012n = z;
    }

    public C19016a(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: b */
    public final C19016a mo30228b(boolean z) {
        this.f45006h = z;
        return this;
    }

    /* renamed from: c */
    public final C19016a mo30232c(boolean z) {
        this.f45005g = z;
        m35322d();
        return this;
    }

    /* renamed from: f */
    public final C19016a mo30238f(int i) {
        this.f45000b = i;
        m35322d();
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
        ViewPager.AbstractC1579e eVar = this.f44996G;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
    }

    public final void setLayerTextureType(int i) {
        this.f45011m.setLayerType(i, null);
    }

    /* renamed from: o */
    private static GradientDrawable m35324o(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: e */
    public final C19016a mo30237e(boolean z) {
        this.f45024z = z;
        BannerViewPager bannerViewPager = this.f45011m;
        if (bannerViewPager != null) {
            bannerViewPager.setScrollable(z);
        }
        return this;
    }

    /* renamed from: f */
    public final C19016a mo30239f(boolean z) {
        this.f45007i = z;
        m35319a(this.f45003e, this.f45018t, this.f45019u, this.f45020v);
        return this;
    }

    /* renamed from: g */
    public final C19016a mo30240g(int i) {
        this.f45018t = i;
        m35319a(this.f45003e, i, this.f45019u, this.f45020v);
        return this;
    }

    /* renamed from: h */
    public final C19016a mo30241h(int i) {
        this.f45019u = i;
        m35319a(this.f45003e, this.f45018t, i, this.f45020v);
        return this;
    }

    /* renamed from: i */
    public final C19016a mo30242i(int i) {
        this.f45020v = i;
        m35319a(this.f45003e, this.f45018t, this.f45019u, i);
        return this;
    }

    public final void setOverflow(int i) {
        boolean z = false;
        if (i == 0) {
            this.f45011m.setLayerType(0, null);
        } else {
            z = true;
        }
        setClipChildren(z);
    }

    /* renamed from: a */
    public final C19016a mo30225a(boolean z) {
        if (this.f45004f != z) {
            int n = mo30247n(this.f45011m.getCurrentItem());
            this.f45004f = z;
            C19020a aVar = this.f44995F;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
                this.f45011m.setCurrentItem(n);
            }
        }
        return this;
    }

    /* renamed from: p */
    private View m35325p(int i) {
        List<LynxUI> list;
        if (i < 0 || (list = this.f45013o) == null || list.size() == 0 || i >= this.f45013o.size()) {
            return null;
        }
        return this.f45013o.get(i).mView;
    }

    /* renamed from: d */
    public final C19016a mo30233d(final int i) {
        C19020a aVar;
        this.f45009k = i;
        if (mo30247n(this.f45011m.getCurrentItem()) == i && (aVar = this.f44995F) != null && aVar.getCount() > 0) {
            return this;
        }
        C19020a aVar2 = this.f44995F;
        if (aVar2 == null || i >= aVar2.getCount()) {
            this.f45011m.postDelayed(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.C19016a.RunnableC190182 */

                static {
                    Covode.recordClassIndex(21774);
                }

                public final void run() {
                    C19016a.this.mo30226a();
                }
            }, 200);
        } else {
            this.f45011m.post(new Runnable() {
                /* class com.bytedance.ies.xelement.banner.C19016a.RunnableC190171 */

                static {
                    Covode.recordClassIndex(21773);
                }

                public final void run() {
                    if (C19016a.this.f45004f) {
                        int currentItem = C19016a.this.f45011m.getCurrentItem();
                        C19016a.this.f45011m.setCurrentItem((i + currentItem) - C19016a.this.mo30247n(currentItem), C19016a.this.f45007i);
                        return;
                    }
                    C19016a aVar = C19016a.this;
                    aVar.f45009k = Math.max(Math.min(aVar.f45009k, C19016a.this.f45013o.size()), 0);
                    C19016a.this.f45011m.setCurrentItem(C19016a.this.f45009k, C19016a.this.f45007i);
                }
            });
        }
        return this;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f45005g) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                m35322d();
            } else if (action == 0) {
                removeCallbacks(this.f45014p);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: n */
    public final int mo30247n(int i) {
        if (this.f45013o.size() == 0 || !this.f45004f) {
            return i;
        }
        int i2 = i - (this.f44999a / 2);
        int abs = Math.abs(i2) % this.f45013o.size();
        if (i2 >= 0 || abs == 0) {
            return abs;
        }
        return this.f45013o.size() - abs;
    }

    /* renamed from: a */
    public final C19016a mo30223a(LynxUI lynxUI) {
        MethodCollector.m26663i(6600);
        if (lynxUI != null) {
            this.f45013o.add(lynxUI);
            if (this.f45023y) {
                View view = new View(getContext());
                view.setClickable(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f45016r, this.f45017s);
                layoutParams.leftMargin = this.f45015q;
                layoutParams.rightMargin = this.f45015q;
                this.f44994E.addView(view, layoutParams);
                view.setBackground(m35324o(this.f44991B));
                this.f44993D.add(view);
            }
        }
        if (this.f44995F != null) {
            m35323e();
            this.f44995F.notifyDataSetChanged();
        }
        m35321c();
        MethodCollector.m26664o(6600);
        return this;
    }

    /* renamed from: b */
    public final void mo30229b(LynxUI lynxUI) {
        MethodCollector.m26663i(6744);
        for (LynxUI lynxUI2 : this.f45013o) {
            if (lynxUI2 == lynxUI) {
                this.f45013o.remove(lynxUI);
                if (this.f45023y) {
                    try {
                        this.f44993D.remove(0);
                        LinearLayout linearLayout = this.f44994E;
                        linearLayout.removeView(linearLayout.getChildAt(0));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (this.f44995F != null) {
                    m35323e();
                    this.f44995F.notifyDataSetChanged();
                }
                m35321c();
                MethodCollector.m26664o(6744);
                return;
            }
        }
        MethodCollector.m26664o(6744);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageSelected(int i) {
        ViewPager.AbstractC1579e eVar = this.f44996G;
        if (eVar != null) {
            eVar.onPageSelected(mo30247n(i));
        }
        if (this.f45023y) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f45016r, this.f45017s);
            layoutParams.leftMargin = this.f45015q;
            layoutParams.rightMargin = this.f45015q;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f45016r, this.f45017s);
            layoutParams2.leftMargin = this.f45015q;
            layoutParams2.rightMargin = this.f45015q;
            int n = mo30247n(this.f44992C);
            int n2 = mo30247n(i);
            if (this.f45013o.size() == 0) {
                n2 = 0;
            }
            if (!this.f44993D.isEmpty() && m35320a(n, this.f44993D) && m35320a(n2, this.f44993D)) {
                this.f44993D.get(n).setBackground(m35324o(this.f44991B));
                this.f44993D.get(n).setLayoutParams(layoutParams2);
                this.f44993D.get(n2).setBackground(m35324o(this.f44990A));
                this.f44993D.get(n2).setLayoutParams(layoutParams);
                this.f44992C = i;
            }
        }
    }

    /* renamed from: a */
    public final C19016a mo30224a(String str) {
        this.f45003e = str;
        if (!str.equals("coverflow") && !str.equals("flat-coverflow")) {
            this.f45006h = true;
            this.f45008j = Color.argb(128, 0, 0, 0);
        }
        m35319a(this.f45003e, this.f45018t, this.f45019u, this.f45020v);
        return this;
    }

    /* renamed from: com.bytedance.ies.xelement.banner.a$b */
    class C19021b extends Scroller {
        static {
            Covode.recordClassIndex(21777);
        }

        public C19021b(Context context) {
            super(context);
        }

        public final void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, C19016a.this.f45001c);
        }

        public final void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, C19016a.this.f45001c);
        }
    }

    private C19016a(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private static boolean m35320a(int i, Collection<?> collection) {
        if (i < 0 || i >= collection.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m35318a(int i, View view) {
        MethodCollector.m26663i(7033);
        if (view instanceof ViewGroup) {
            if (view.findViewWithTag("swiper_lynx_view_tag") != null) {
                MethodCollector.m26664o(7033);
                return;
            }
            View p = m35325p(mo30247n(i));
            if (p == null) {
                MethodCollector.m26664o(7033);
                return;
            }
            if (p.getParent() instanceof ViewGroup) {
                ((ViewGroup) p.getParent()).removeView(p);
            }
            ((ViewGroup) view).addView(p);
        }
        MethodCollector.m26664o(7033);
    }

    private C19016a(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(6450);
        this.f44999a = 5000;
        this.f45015q = 5;
        this.f45016r = 20;
        this.f45017s = 20;
        this.f45000b = 5000;
        this.f45001c = 500;
        this.f45018t = 10;
        this.f45019u = -1;
        this.f45020v = -1;
        this.f45021w = -1;
        this.f45022x = -1;
        this.f45002d = 1;
        this.f45003e = "normal";
        this.f45023y = true;
        this.f45004f = true;
        this.f45005g = true;
        this.f45024z = true;
        this.f45006h = true;
        this.f45007i = true;
        this.f45008j = Color.argb(128, 0, 0, 0);
        this.f44990A = Color.argb(255, 255, 255, 255);
        this.f44991B = Color.argb(89, 255, 255, 255);
        this.f45009k = 0;
        this.f44992C = 0;
        this.f45010l = 0;
        this.f45012n = false;
        this.f45013o = new CopyOnWriteArrayList();
        this.f45014p = new Runnable() {
            /* class com.bytedance.ies.xelement.banner.C19016a.RunnableC190193 */

            static {
                Covode.recordClassIndex(21775);
            }

            public final void run() {
                boolean z;
                if (!C19016a.this.f45005g) {
                    return;
                }
                if (C19016a.this.f45004f) {
                    if (C19016a.this.f45003e.equals("coverflow") || C19016a.this.f45003e.equals("flat-coverflow")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int size = C19016a.this.f45013o.size();
                    int i = 3;
                    if (C19016a.this.mo30230b()) {
                        i = 2;
                    }
                    if ((size > 5 || !z) && size >= i) {
                        int currentItem = C19016a.this.f45011m.getCurrentItem() + 1;
                        if (currentItem >= C19016a.this.f44999a) {
                            C19016a.this.f45011m.setCurrentItem(C19016a.this.f44999a / 2, false);
                        } else {
                            C19016a.this.f45011m.setCurrentItem(currentItem, C19016a.this.f45007i);
                        }
                        C19016a aVar = C19016a.this;
                        aVar.postDelayed(aVar.f45014p, (long) C19016a.this.f45000b);
                        return;
                    }
                    return;
                }
                int currentItem2 = C19016a.this.f45011m.getCurrentItem() + 1;
                if (currentItem2 >= C19016a.this.f45011m.getAdapter().getCount()) {
                    C19016a.this.f45011m.setCurrentItem(0, false);
                    C19016a aVar2 = C19016a.this;
                    aVar2.postDelayed(aVar2.f45014p, (long) C19016a.this.f45000b);
                    return;
                }
                C19016a.this.f45011m.setCurrentItem(currentItem2, C19016a.this.f45007i);
                C19016a aVar3 = C19016a.this;
                aVar3.postDelayed(aVar3.f45014p, (long) C19016a.this.f45000b);
            }
        };
        this.f44993D = new ArrayList();
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.bjy, this, true);
        this.f45011m = (BannerViewPager) a.findViewById(R.id.qi);
        this.f44994E = (LinearLayout) a.findViewById(R.id.a5f);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.f45011m, new C19021b(this.f45011m.getContext()));
            MethodCollector.m26664o(6450);
        } catch (Exception e) {
            LLog.m56856a(6, "Banner", e.getMessage());
            MethodCollector.m26664o(6450);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r4 >= 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r4 >= 0) goto L_0x0069;
     */
    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageScrolled(int r8, float r9, int r10) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.banner.C19016a.onPageScrolled(int, float, int):void");
    }

    /* renamed from: a */
    private void m35319a(String str, int i, int i2, int i3) {
        int i4;
        C19020a aVar = this.f44995F;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        if (str.equals("coverflow") || str.equals("flat-coverflow")) {
            this.f45011m.setClipToPadding(false);
            int i5 = this.f45010l / 5;
            if (i2 < 0 || i3 < 0) {
                this.f45011m.setPadding(i5, 0, i5, 0);
            } else {
                this.f45011m.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.f45011m.setPageMargin(i);
            this.f45011m.setOffscreenPageLimit(2);
            if (str.equals("coverflow")) {
                this.f45011m.setPageTransformer(false, new C19022b());
            }
        } else if (str.equals("multi-pages")) {
            this.f45011m.setClipToPadding(false);
            int i6 = this.f45021w;
            if (i6 >= 0 && (i4 = this.f45022x) >= 0) {
                this.f45011m.setPadding(i6, 0, i4, 0);
            }
            this.f45011m.setPageMargin(i);
            this.f45011m.setOffscreenPageLimit(1);
        } else {
            this.f45011m.setPageMargin(i);
            ViewGroup.LayoutParams layoutParams = this.f45011m.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            this.f45011m.setOffscreenPageLimit(1);
            this.f45011m.setPageTransformer(false, null);
        }
    }
}
