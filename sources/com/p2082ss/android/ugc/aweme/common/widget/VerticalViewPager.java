package com.p2082ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.p033d.AbstractC0653f;
import androidx.core.p033d.C0651e;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.core.p037h.p038a.C0740f;
import androidx.core.widget.C0819d;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.experiment.C46797cn;
import com.p2082ss.android.ugc.aweme.experiment.C46805cu;
import com.p2082ss.android.ugc.aweme.experiment.C46806cv;
import com.p2082ss.android.ugc.aweme.experiment.C46826de;
import com.p2082ss.android.ugc.aweme.experiment.C46827df;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.helper.C49628k;
import com.p2082ss.android.ugc.aweme.feed.p2977v.C50481b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2726da.C40928a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager */
public class VerticalViewPager extends AbstractC39191c {

    /* renamed from: a */
    public static final int[] f92424a = {16842931};

    /* renamed from: aC */
    private static final C39188h f92425aC = new C39188h();

    /* renamed from: b */
    public static final Interpolator f92426b = new Interpolator() {
        /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.animationInterpolatorC391762 */

        static {
            Covode.recordClassIndex(46806);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: v */
    static Field f92427v;

    /* renamed from: y */
    private static final Comparator<C39182b> f92428y = new Comparator<C39182b>() {
        /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.C391751 */

        static {
            Covode.recordClassIndex(46805);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C39182b bVar, C39182b bVar2) {
            return bVar.f92516b - bVar2.f92516b;
        }
    };

    /* renamed from: A */
    private final C39182b f92429A;

    /* renamed from: B */
    private final Rect f92430B;

    /* renamed from: C */
    private int f92431C;

    /* renamed from: D */
    private Parcelable f92432D;

    /* renamed from: E */
    private ClassLoader f92433E;

    /* renamed from: F */
    private Scroller f92434F;

    /* renamed from: G */
    private boolean f92435G;

    /* renamed from: H */
    private C39187g f92436H;

    /* renamed from: I */
    private int f92437I;

    /* renamed from: J */
    private Drawable f92438J;

    /* renamed from: K */
    private int f92439K;

    /* renamed from: L */
    private int f92440L;

    /* renamed from: M */
    private float f92441M;

    /* renamed from: N */
    private float f92442N;

    /* renamed from: O */
    private int f92443O;

    /* renamed from: P */
    private int f92444P;

    /* renamed from: Q */
    private boolean f92445Q;

    /* renamed from: R */
    private boolean f92446R;

    /* renamed from: S */
    private boolean f92447S;

    /* renamed from: T */
    private int f92448T;

    /* renamed from: U */
    private boolean f92449U;

    /* renamed from: V */
    private boolean f92450V;

    /* renamed from: W */
    private int f92451W;

    /* renamed from: aA */
    private int f92452aA;

    /* renamed from: aB */
    private ArrayList<View> f92453aB;

    /* renamed from: aD */
    private int f92454aD;

    /* renamed from: aE */
    private int f92455aE;

    /* renamed from: aF */
    private final Runnable f92456aF;

    /* renamed from: aG */
    private int f92457aG;

    /* renamed from: aH */
    private AbstractC39186f f92458aH;

    /* renamed from: aI */
    private boolean f92459aI;

    /* renamed from: aa */
    private int f92460aa;

    /* renamed from: ab */
    private int f92461ab;

    /* renamed from: ac */
    private float f92462ac;

    /* renamed from: ad */
    private float f92463ad;

    /* renamed from: ae */
    private float f92464ae;

    /* renamed from: af */
    private float f92465af;

    /* renamed from: ag */
    private float f92466ag;

    /* renamed from: ah */
    private float f92467ah;

    /* renamed from: ai */
    private int f92468ai;

    /* renamed from: aj */
    private VelocityTracker f92469aj;

    /* renamed from: ak */
    private int f92470ak;

    /* renamed from: al */
    private int f92471al;

    /* renamed from: am */
    private int f92472am;

    /* renamed from: an */
    private int f92473an;

    /* renamed from: ao */
    private boolean f92474ao;

    /* renamed from: ap */
    private long f92475ap;

    /* renamed from: aq */
    private C0819d f92476aq;

    /* renamed from: ar */
    private C0819d f92477ar;

    /* renamed from: as */
    private boolean f92478as;

    /* renamed from: at */
    private boolean f92479at;

    /* renamed from: au */
    private boolean f92480au;

    /* renamed from: av */
    private int f92481av;

    /* renamed from: aw */
    private ViewPager.AbstractC1579e f92482aw;

    /* renamed from: ax */
    private AbstractC39185e f92483ax;

    /* renamed from: ay */
    private ViewPager.AbstractC1580f f92484ay;

    /* renamed from: az */
    private Method f92485az;

    /* renamed from: c */
    public PagerAdapter f92486c;

    /* renamed from: d */
    public int f92487d;

    /* renamed from: e */
    public List<ViewPager.AbstractC1579e> f92488e;

    /* renamed from: f */
    public int f92489f;

    /* renamed from: g */
    public boolean f92490g;

    /* renamed from: h */
    public int f92491h;

    /* renamed from: i */
    Handler f92492i;

    /* renamed from: j */
    public final Runnable f92493j;

    /* renamed from: k */
    int f92494k;

    /* renamed from: l */
    int f92495l;

    /* renamed from: m */
    final AbstractC89171a<String> f92496m;

    /* renamed from: n */
    int f92497n;

    /* renamed from: o */
    boolean f92498o;

    /* renamed from: p */
    final AbstractC89171a<String> f92499p;

    /* renamed from: q */
    final AbstractC89171a<String> f92500q;

    /* renamed from: r */
    final AbstractC89171a<String> f92501r;

    /* renamed from: s */
    final AbstractC89171a<String> f92502s;

    /* renamed from: t */
    final AbstractC89171a<String> f92503t;

    /* renamed from: u */
    final AbstractC89171a<String> f92504u;

    /* renamed from: w */
    private boolean f92505w;

    /* renamed from: x */
    private int f92506x;

    /* renamed from: z */
    private final ArrayList<C39182b> f92507z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$a */
    interface AbstractC39181a {
        static {
            Covode.recordClassIndex(46812);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$e */
    public interface AbstractC39185e {
        static {
            Covode.recordClassIndex(46816);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$f */
    public interface AbstractC39186f {
        static {
            Covode.recordClassIndex(46817);
        }

        /* renamed from: a */
        int mo68047a(int i, int i2, int i3);

        /* renamed from: a */
        int mo68048a(int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo68049a();

        /* renamed from: a */
        boolean mo68050a(boolean z);

        /* renamed from: b */
        boolean mo68051b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$b */
    public static class C39182b {

        /* renamed from: a */
        Object f92515a;

        /* renamed from: b */
        int f92516b;

        /* renamed from: c */
        boolean f92517c;

        /* renamed from: d */
        float f92518d;

        /* renamed from: e */
        float f92519e;

        static {
            Covode.recordClassIndex(46813);
        }

        C39182b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$h */
    public static class C39188h implements Comparator<View> {
        static {
            Covode.recordClassIndex(46819);
        }

        C39188h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C39183c cVar = (C39183c) view.getLayoutParams();
            C39183c cVar2 = (C39183c) view2.getLayoutParams();
            if (cVar.f92520a == cVar2.f92520a) {
                return cVar.f92524e - cVar2.f92524e;
            }
            if (cVar.f92520a) {
                return 1;
            }
            return -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c
    /* renamed from: a */
    public final boolean mo67976a() {
        return this.f92459aI;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: b */
    public final boolean mo67981b() {
        return this.f92474ao;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public PagerAdapter getAdapter() {
        return this.f92486c;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public int getCurrentItem() {
        return this.f92487d;
    }

    public int getExpectedAdapterCount() {
        return this.f92506x;
    }

    public int getOffscreenPageLimit() {
        return this.f92448T;
    }

    public int getPageMargin() {
        return this.f92437I;
    }

    public int getScrollState() {
        return this.f92457aG;
    }

    /* renamed from: a */
    public final void mo67973a(int i, boolean z) {
        this.f92447S = false;
        m79485a(i, z, false);
    }

    /* renamed from: a */
    public final void mo67971a(int i) {
        this.f92447S = false;
        m79486a(i, true, false, 1000);
    }

    /* renamed from: a */
    private void m79486a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f92486c;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f92487d != i || this.f92507z.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f92486c.getCount()) {
                i = this.f92486c.getCount() - 1;
            }
            int i3 = this.f92448T;
            int i4 = this.f92487d;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f92507z.size(); i5++) {
                    this.f92507z.get(i5).f92517c = true;
                }
            }
            if (this.f92487d == i) {
                z3 = false;
            }
            if (this.f92478as) {
                this.f92487d = i;
                if (z3) {
                    List<ViewPager.AbstractC1579e> list = this.f92488e;
                    if (list != null && !list.isEmpty()) {
                        for (ViewPager.AbstractC1579e eVar : this.f92488e) {
                            eVar.onPageSelected(i);
                        }
                    }
                    ViewPager.AbstractC1579e eVar2 = this.f92482aw;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i);
                    }
                }
                requestLayout();
                return;
            }
            mo67982c(i, false);
            m79484a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m79484a(int i, boolean z, int i2, boolean z2) {
        ViewPager.AbstractC1579e eVar;
        List<ViewPager.AbstractC1579e> list;
        C39182b b = m79493b(i);
        C0004a.m2a(EnumC0044d.TT_FEED_SCROLL, C50481b.m94645a());
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f92441M, Math.min(b.f92519e, this.f92442N))) : 0;
        if (z2 && (list = this.f92488e) != null) {
            list.isEmpty();
        }
        if (z) {
            m79482a(clientHeight, i2);
            if (!C46805cu.f109044a || !m79502m()) {
                mo67980b(i, z2);
            } else {
                Message obtain = Message.obtain(getMainHander(), new RunnableC39203o(this, i, z2));
                if (C46805cu.m90143a() && Build.VERSION.SDK_INT >= 22) {
                    obtain.setAsynchronous(true);
                }
                getMainHander().sendMessageAtFrontOfQueue(obtain);
            }
            if (z2 && (eVar = this.f92482aw) != null) {
                eVar.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            List<ViewPager.AbstractC1579e> list2 = this.f92488e;
            if (list2 != null && !list2.isEmpty()) {
                for (ViewPager.AbstractC1579e eVar2 : this.f92488e) {
                    eVar2.onPageSelected(i);
                }
            }
            ViewPager.AbstractC1579e eVar3 = this.f92482aw;
            if (eVar3 != null) {
                eVar3.onPageSelected(i);
            }
        }
        m79496b(false);
        scrollTo(0, clientHeight);
        m79498c(clientHeight);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    /* renamed from: a */
    public final void mo67974a(ViewPager.AbstractC1579e eVar) {
        if (eVar != null) {
            this.f92488e.add(eVar);
        }
    }

    /* renamed from: a */
    public final void mo67975a(boolean z, ViewPager.AbstractC1580f fVar) {
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        int i2 = 1;
        if (this.f92484ay == null) {
            z2 = true;
        }
        this.f92484ay = fVar;
        setChildrenDrawingOrderEnabledCompat(true);
        if (z) {
            i2 = 2;
        }
        this.f92452aA = i2;
        if (z2) {
            mo67994f();
        }
    }

    /* renamed from: a */
    private void m79489a(C39182b bVar, int i, C39182b bVar2) {
        C39182b bVar3;
        C39182b bVar4;
        int count = this.f92486c.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f92437I) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f92516b;
            if (i2 < bVar.f92516b) {
                float f2 = bVar2.f92519e + bVar2.f92518d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f92516b && i4 < this.f92507z.size()) {
                    C39182b bVar5 = this.f92507z.get(i4);
                    while (true) {
                        bVar4 = bVar5;
                        if (i3 > bVar4.f92516b && i4 < this.f92507z.size() - 1) {
                            i4++;
                            bVar5 = this.f92507z.get(i4);
                        }
                    }
                    while (i3 < bVar4.f92516b) {
                        f2 += this.f92486c.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f92519e = f2;
                    f2 += bVar4.f92518d + f;
                    i3++;
                }
            } else if (i2 > bVar.f92516b) {
                int size = this.f92507z.size() - 1;
                float f3 = bVar2.f92519e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f92516b && size >= 0) {
                    C39182b bVar6 = this.f92507z.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i5 < bVar3.f92516b && size > 0) {
                            size--;
                            bVar6 = this.f92507z.get(size);
                        }
                    }
                    while (i5 > bVar3.f92516b) {
                        f3 -= this.f92486c.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= bVar3.f92518d + f;
                    bVar3.f92519e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f92507z.size();
        float f4 = bVar.f92519e;
        int i6 = bVar.f92516b - 1;
        this.f92441M = bVar.f92516b == 0 ? bVar.f92519e : -3.4028235E38f;
        int i7 = count - 1;
        this.f92442N = bVar.f92516b == i7 ? (bVar.f92519e + bVar.f92518d) - 1.0f : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            C39182b bVar7 = this.f92507z.get(i8);
            while (i6 > bVar7.f92516b) {
                f4 -= this.f92486c.getPageWidth(i6) + f;
                i6--;
            }
            f4 -= bVar7.f92518d + f;
            bVar7.f92519e = f4;
            if (bVar7.f92516b == 0) {
                this.f92441M = f4;
            }
            i8--;
            i6--;
        }
        float f5 = bVar.f92519e + bVar.f92518d + f;
        int i9 = bVar.f92516b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C39182b bVar8 = this.f92507z.get(i10);
            while (i9 < bVar8.f92516b) {
                f5 += this.f92486c.getPageWidth(i9) + f;
                i9++;
            }
            if (bVar8.f92516b == i7) {
                this.f92442N = (bVar8.f92518d + f5) - 1.0f;
            }
            bVar8.f92519e = f5;
            f5 += bVar8.f92518d + f;
            i10++;
            i9++;
        }
        this.f92479at = false;
    }

    /* renamed from: a */
    public final void mo67972a(int i, int i2, int i3) {
        AbstractC39186f fVar;
        if (i > i2 && (fVar = this.f92458aH) != null) {
            fVar.mo68049a();
        }
        m79486a(i, true, true, i3);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: a */
    public final void mo67970a(float f) {
        if (!this.f92474ao) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f92486c != null) {
            try {
                this.f92463ad += f;
                float scrollY = ((float) getScrollY()) - f;
                float clientHeight = (float) getClientHeight();
                float f2 = this.f92441M * clientHeight;
                float f3 = this.f92442N * clientHeight;
                C39182b bVar = this.f92507z.get(0);
                ArrayList<C39182b> arrayList = this.f92507z;
                C39182b bVar2 = arrayList.get(arrayList.size() - 1);
                if (bVar.f92516b != 0) {
                    f2 = bVar.f92519e * clientHeight;
                }
                if (bVar2.f92516b != this.f92486c.getCount() - 1) {
                    f3 = bVar2.f92519e * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.f92463ad += scrollY - ((float) i);
                scrollTo(getScrollX(), i);
                m79498c(i);
                MotionEvent obtain = MotionEvent.obtain(this.f92475ap, SystemClock.uptimeMillis(), 2, 0.0f, this.f92463ad, 0);
                if (this.f92469aj == null) {
                    this.f92469aj = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.f92469aj;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                C13468b.m24211a(e, "VerticalViewPager");
            }
        }
    }

    /* renamed from: a */
    private void m79487a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f92468ai) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f92463ad = motionEvent.getY(i);
            this.f92468ai = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f92469aj;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m79490a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if ((view instanceof AbstractC39194f) || m79499c(i2, i3)) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((!C46797cn.f109021a || childAt.getVisibility() == 0) && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && m79490a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$c */
    public static class C39183c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f92520a;

        /* renamed from: b */
        public int f92521b;

        /* renamed from: c */
        float f92522c;

        /* renamed from: d */
        boolean f92523d;

        /* renamed from: e */
        int f92524e;

        /* renamed from: f */
        int f92525f;

        static {
            Covode.recordClassIndex(46814);
        }

        public C39183c() {
            super(-1, -1);
        }

        public C39183c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f92424a);
            this.f92521b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$g */
    class C39187g extends DataSetObserver {
        static {
            Covode.recordClassIndex(46818);
        }

        public final void onInvalidated() {
            VerticalViewPager.this.mo67993e();
        }

        public final void onChanged() {
            C39192d.m79544a("PagerObserver onChanged");
            VerticalViewPager.this.mo67993e();
        }

        private C39187g() {
        }

        /* synthetic */ C39187g(VerticalViewPager verticalViewPager, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo67994f() {
        mo67982c(this.f92487d, false);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C39183c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo68009k() {
        this.f92491h = 0;
        mo67994f();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f92478as = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: m */
    private static boolean m79502m() {
        if (!C46805cu.f109046c) {
            return true;
        }
        return C40928a.m82419b();
    }

    /* renamed from: p */
    private void m79505p() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: r */
    private void m79507r() {
        this.f92449U = false;
        this.f92450V = false;
        VelocityTracker velocityTracker = this.f92469aj;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f92469aj = null;
        }
    }

    /* renamed from: s */
    private boolean m79508s() {
        int i = this.f92487d;
        if (i <= 0) {
            return false;
        }
        mo67973a(i - 1, true);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.SavedState.C391801 */

            static {
                Covode.recordClassIndex(46811);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ SavedState[] mo2683a(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* synthetic */ SavedState mo2682a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a */
        int f92512a;

        /* renamed from: b */
        Parcelable f92513b;

        /* renamed from: c */
        ClassLoader f92514c;

        static {
            Covode.recordClassIndex(46810);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f92512a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f92512a);
            parcel.writeParcelable(this.f92513b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f92512a = parcel.readInt();
            this.f92513b = parcel.readParcelable(classLoader);
            this.f92514c = classLoader;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.common.widget.VerticalViewPager$d */
    public class C39184d extends C0726a {
        static {
            Covode.recordClassIndex(46815);
        }

        /* renamed from: a */
        private boolean m79532a() {
            if (VerticalViewPager.this.f92486c == null || VerticalViewPager.this.f92486c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C39184d() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            dVar.mo2834a((CharSequence) ViewPager.class.getName());
            dVar.mo2844d(m79532a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                dVar.mo2829a(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                dVar.mo2829a(8192);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0740f a = C0740f.m2624a();
            a.mo2859a(m79532a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f92486c != null) {
                a.mo2858a(VerticalViewPager.this.f92486c.getCount());
                a.mo2860b(VerticalViewPager.this.f92487d);
                a.mo2861c(VerticalViewPager.this.f92487d);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f92487d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                verticalViewPager2.setCurrentItem(verticalViewPager2.f92487d + 1);
                return true;
            }
        }
    }

    private Handler getMainHander() {
        if (this.f92492i == null) {
            this.f92492i = new Handler(Looper.getMainLooper());
        }
        return this.f92492i;
    }

    /* renamed from: o */
    private boolean m79504o() {
        this.f92468ai = -1;
        m79507r();
        return this.f92476aq.mo3010a() | this.f92477ar.mo3010a();
    }

    /* renamed from: t */
    private boolean m79509t() {
        PagerAdapter pagerAdapter = this.f92486c;
        if (pagerAdapter == null || this.f92487d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        mo67973a(this.f92487d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f92438J;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ String mo67995g() {
        return "VerticalViewPager draw start for overScrollMode mBottomEdge:" + this.f92498o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ String mo68006h() {
        return "VerticalViewPager draw start for overScrollMode mTopEdge:" + this.f92498o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ String mo68007i() {
        return "VerticalViewPager draw start for overScrollMode:" + this.f92497n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ String mo68008j() {
        return "VerticalViewPager scrollTo:" + this.f92495l + "/" + this.f92494k;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f92512a = this.f92487d;
        PagerAdapter pagerAdapter = this.f92486c;
        if (pagerAdapter != null) {
            savedState.f92513b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(46804);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f92427v = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: n */
    private void m79503n() {
        if (this.f92452aA != 0) {
            ArrayList<View> arrayList = this.f92453aB;
            if (arrayList == null) {
                this.f92453aB = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f92453aB.add(getChildAt(i));
            }
            Collections.sort(this.f92453aB, f92425aC);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f92456aF);
        removeCallbacks(this.f92493j);
        Handler handler = this.f92492i;
        if (handler != null) {
            handler.removeCallbacks(this.f92493j);
        }
        this.f92491h = 0;
        Scroller scroller = this.f92434F;
        if (scroller != null && !scroller.isFinished()) {
            this.f92434F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: q */
    private C39182b m79506q() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
            f2 = ((float) this.f92437I) / ((float) clientHeight);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C39182b bVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f92507z.size()) {
            C39182b bVar2 = this.f92507z.get(i3);
            if (!z && bVar2.f92516b != (i = i2 + 1)) {
                bVar2 = this.f92429A;
                bVar2.f92519e = f3 + f4 + f2;
                bVar2.f92516b = i;
                bVar2.f92518d = this.f92486c.getPageWidth(bVar2.f92516b);
                i3--;
            }
            f3 = bVar2.f92519e;
            float f5 = bVar2.f92518d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i3 == this.f92507z.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f92516b;
            f4 = bVar2.f92518d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f92435G = true;
        if (this.f92434F.isFinished() || !this.f92434F.computeScrollOffset()) {
            m79496b(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f92434F.getCurrX();
        int currY = this.f92434F.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m79498c(currY)) {
                this.f92434F.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0792v.m2764c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: d */
    public final void mo67987d() {
        if (this.f92474ao) {
            this.f92474ao = false;
            if (this.f92486c != null) {
                VelocityTracker velocityTracker = this.f92469aj;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f92471al);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f92468ai);
                this.f92447S = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C39182b q = m79506q();
                if (q != null) {
                    m79486a(m79478a(q.f92516b, ((((float) scrollY) / ((float) clientHeight)) - q.f92519e) / q.f92518d, yVelocity, (int) (this.f92463ad - this.f92465af)), true, true, yVelocity);
                }
            }
            m79507r();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* renamed from: l */
    private void m79501l() {
        this.f92490g = C46806cv.f109047a;
        if (C46827df.f109098a) {
            this.f92455aE = C46826de.m90149a();
        }
        this.f92505w = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f92434F = new Scroller(context, f92426b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f92461ab = viewConfiguration.getScaledPagingTouchSlop();
        this.f92470ak = (int) (400.0f * f);
        this.f92471al = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f92476aq = new C0819d(context);
        this.f92477ar = new C0819d(context);
        this.f92472am = (int) (25.0f * f);
        this.f92473an = (int) (2.0f * f);
        this.f92451W = (int) (f * 16.0f);
        C0792v.m2747a(this, new C39184d());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.C391795 */

            /* renamed from: b */
            private final Rect f92511b = new Rect();

            static {
                Covode.recordClassIndex(46809);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f92511b;
                rect.left = a.mo2865a();
                rect.top = a.mo2867b();
                rect.right = a.mo2868c();
                rect.bottom = a.mo2869d();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0753ad b = C0792v.m2757b(VerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2865a(), rect.left);
                    rect.top = Math.min(b.mo2867b(), rect.top);
                    rect.right = Math.min(b.mo2868c(), rect.right);
                    rect.bottom = Math.min(b.mo2869d(), rect.bottom);
                }
                return a.mo2866a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo67993e() {
        boolean z;
        int count = this.f92486c.getCount();
        this.f92506x = count;
        if (this.f92507z.size() >= (this.f92448T * 2) + 1 || this.f92507z.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f92487d;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f92507z.size()) {
            C39182b bVar = this.f92507z.get(i2);
            int itemPosition = this.f92486c.getItemPosition(bVar.f92515a);
            C39192d.m79544a("dataSetChanged newPos = " + itemPosition + " mItems.size() = " + this.f92507z.size());
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f92507z.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f92486c.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f92486c.destroyItem((ViewGroup) this, bVar.f92516b, bVar.f92515a);
                    if (this.f92487d == bVar.f92516b) {
                        i = Math.max(0, Math.min(this.f92487d, count - 1));
                    }
                } else if (bVar.f92516b != itemPosition) {
                    if (bVar.f92516b == this.f92487d) {
                        i = itemPosition;
                    }
                    bVar.f92516b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f92486c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f92507z, f92428y);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C39183c cVar = (C39183c) getChildAt(i3).getLayoutParams();
                if (!cVar.f92520a) {
                    cVar.f92522c = 0.0f;
                }
            }
            m79485a(i, false, true);
            requestLayout();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: c */
    public final boolean mo67983c() {
        if (this.f92449U) {
            return false;
        }
        this.f92474ao = true;
        setScrollState(1);
        this.f92465af = 0.0f;
        this.f92463ad = 0.0f;
        VelocityTracker velocityTracker = this.f92469aj;
        if (velocityTracker == null) {
            this.f92469aj = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f92469aj.addMovement(obtain);
        obtain.recycle();
        this.f92475ap = uptimeMillis;
        return true;
    }

    public void setCanTouch(boolean z) {
        this.f92505w = z;
    }

    public void setDisableScroll(boolean z) {
        this.f92459aI = z;
    }

    public void setEndScrollDelayTime(int i) {
        this.f92489f = i;
    }

    public void setMaxSettleDuration(int i) {
        this.f92454aD = i;
    }

    public void setOnAdapterChangeListener(AbstractC39185e eVar) {
        this.f92483ax = eVar;
    }

    public void setOnUserSwipeUpListener(AbstractC39186f fVar) {
        this.f92458aH = fVar;
    }

    public void setScroller(Scroller scroller) {
        this.f92434F = scroller;
    }

    public void setmCurItem(int i) {
        this.f92487d = i;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f92446R != z) {
            this.f92446R = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f92447S = false;
        m79486a(i, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C39183c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f92505w || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C39183c(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f92445Q) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f92447S = false;
        m79485a(i, !this.f92478as, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f92448T) {
            this.f92448T = i;
            mo67994f();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f92437I;
        this.f92437I = i;
        int height = getHeight();
        m79483a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f92438J) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m79491a(boolean z) {
        if (!this.f92490g) {
            return false;
        }
        if (z) {
            return true;
        }
        int i = this.f92491h;
        if (i <= 0) {
            return false;
        }
        this.f92491h = i - 1;
        return true;
    }

    /* renamed from: b */
    private static float m79492b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f92438J = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* renamed from: a */
    private C39182b m79480a(View view) {
        for (int i = 0; i < this.f92507z.size(); i++) {
            C39182b bVar = this.f92507z.get(i);
            if (this.f92486c.isViewFromObject(view, bVar.f92515a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private C39182b m79493b(int i) {
        for (int i2 = 0; i2 < this.f92507z.size(); i2++) {
            C39182b bVar = this.f92507z.get(i2);
            if (bVar.f92516b == i) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C39182b a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m79480a(childAt)) != null && a.f92516b == this.f92487d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f92486c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f92441M))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f92442N))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C39182b a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m79480a(childAt)) != null && a.f92516b == this.f92487d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f92486c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f92513b, savedState.f92514c);
            m79485a(savedState.f92512a, false, true);
            return;
        }
        this.f92431C = savedState.f92512a;
        this.f92432D = savedState.f92513b;
        this.f92433E = savedState.f92514c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:2|3|4)|5|6|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 7
            java.lang.reflect.Method r0 = r6.f92485az
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r2 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0019 }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            r6.f92485az = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
        L_0x0019:
            java.lang.reflect.Method r2 = r6.f92485az     // Catch:{ Exception -> 0x0026 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0026 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0026 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    /* renamed from: c */
    private boolean m79498c(int i) {
        if (this.f92507z.size() != 0) {
            C39182b q = m79506q();
            int clientHeight = getClientHeight();
            int i2 = this.f92437I;
            int i3 = clientHeight + i2;
            float f = (float) i2;
            float f2 = (float) clientHeight;
            int i4 = q.f92516b;
            float f3 = ((((float) i) / f2) - q.f92519e) / (q.f92518d + (f / f2));
            this.f92480au = false;
            m79481a(i4, f3, (int) (((float) i3) * f3));
            if (this.f92480au) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f92478as) {
            return false;
        } else {
            this.f92480au = false;
            m79481a(0, 0.0f, 0);
            if (this.f92480au) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z = m79500d(17);
                } else if (keyCode == 22) {
                    z = m79500d(66);
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        z = m79500d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z = m79500d(1);
                    }
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f92457aG != i) {
            this.f92457aG = i;
            if (this.f92484ay != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            List<ViewPager.AbstractC1579e> list = this.f92488e;
            if (!(list == null || list.isEmpty())) {
                for (ViewPager.AbstractC1579e eVar : this.f92488e) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        this.f92507z = new ArrayList<>();
        this.f92429A = new C39182b();
        this.f92430B = new Rect();
        this.f92431C = -1;
        this.f92432D = null;
        this.f92433E = null;
        this.f92441M = -3.4028235E38f;
        this.f92442N = Float.MAX_VALUE;
        this.f92448T = 1;
        this.f92468ai = -1;
        this.f92478as = true;
        this.f92479at = false;
        this.f92488e = new ArrayList();
        this.f92489f = 0;
        this.f92454aD = 600;
        this.f92490g = false;
        this.f92491h = 0;
        this.f92455aE = 100;
        this.f92492i = null;
        this.f92456aF = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.RunnableC391773 */

            static {
                Covode.recordClassIndex(46807);
            }

            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                if (VerticalViewPager.this.f92489f > 0) {
                    VerticalViewPager verticalViewPager = VerticalViewPager.this;
                    verticalViewPager.postDelayed(verticalViewPager.f92493j, (long) VerticalViewPager.this.f92489f);
                } else if (VerticalViewPager.this.f92490g) {
                    VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                    verticalViewPager2.f92491h = 1;
                    verticalViewPager2.mo67982c(verticalViewPager2.f92487d, true);
                    C40928a.m82418a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.RunnableC391784 */

                        static {
                            Covode.recordClassIndex(46808);
                        }

                        public final void run() {
                            VerticalViewPager.this.f92491h = 0;
                        }
                    });
                    if (C46806cv.f109048b == 1) {
                        if (!C40928a.m82418a(verticalViewPager2.f92493j)) {
                            verticalViewPager2.f92491h = 0;
                            verticalViewPager2.f92493j.run();
                        }
                    } else if (C46806cv.f109048b == 2) {
                        if (verticalViewPager2.f92492i == null) {
                            verticalViewPager2.f92492i = new Handler(Looper.getMainLooper());
                        }
                        verticalViewPager2.f92492i.postAtFrontOfQueue(verticalViewPager2.f92493j);
                    } else {
                        verticalViewPager2.postOnAnimation(verticalViewPager2.f92493j);
                    }
                } else {
                    VerticalViewPager.this.mo67994f();
                }
            }
        };
        this.f92493j = new RunnableC39195g(this);
        this.f92457aG = 0;
        this.f92494k = -1;
        this.f92495l = -1;
        this.f92496m = new C39196h(this);
        this.f92499p = C39204p.f92540a;
        this.f92500q = C39205q.f92541a;
        this.f92501r = C39206r.f92542a;
        this.f92502s = new C39207s(this);
        this.f92503t = new C39214t(this);
        this.f92504u = new C39215u(this);
        this.f92459aI = false;
        m79501l();
    }

    /* renamed from: b */
    private C39182b m79495b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m79480a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: c */
    private boolean m79497c(float f) {
        boolean z;
        this.f92463ad = f;
        float scrollY = ((float) getScrollY()) + (this.f92463ad - f);
        float clientHeight = (float) getClientHeight();
        float f2 = this.f92441M * clientHeight;
        float f3 = this.f92442N * clientHeight;
        boolean z2 = false;
        if (this.f92507z.size() <= 0) {
            return false;
        }
        C39182b bVar = this.f92507z.get(0);
        ArrayList<C39182b> arrayList = this.f92507z;
        boolean z3 = true;
        C39182b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f92516b != 0) {
            f2 = bVar.f92519e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f92516b != this.f92486c.getCount() - 1) {
            f3 = bVar2.f92519e * clientHeight;
            z3 = false;
        }
        if (scrollY < f2) {
            if (z) {
                z2 = this.f92476aq.mo3011a(Math.abs(f2 - scrollY) / clientHeight);
            }
            scrollY = f2;
        } else if (scrollY > f3) {
            if (z3) {
                z2 = this.f92477ar.mo3011a(Math.abs(scrollY - f3) / clientHeight);
            }
            scrollY = f3;
        }
        int i = (int) scrollY;
        this.f92462ac += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m79498c(i);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m79500d(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.m79500d(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            C13468b.m24211a(e, "VerticalViewPager");
        }
        int overScrollMode = getOverScrollMode();
        this.f92497n = overScrollMode;
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f92486c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f92476aq.f3048a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f92441M * ((float) height));
                this.f92476aq.mo3009a(width, height);
                z = false | this.f92476aq.mo3012a(canvas);
                canvas.restoreToCount(save);
                this.f92498o = z;
            }
            if (!this.f92477ar.f3048a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f92442N + 1.0f)) * ((float) height2));
                this.f92477ar.mo3009a(width2, height2);
                z |= this.f92477ar.mo3012a(canvas);
                canvas.restoreToCount(save2);
                this.f92498o = z;
            }
            if (z) {
                C0792v.m2764c(this);
                return;
            }
            return;
        }
        this.f92476aq.f3048a.finish();
        this.f92477ar.f3048a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f92437I > 0 && this.f92438J != null && this.f92507z.size() > 0 && this.f92486c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f2 = (float) height;
            float f3 = ((float) this.f92437I) / f2;
            int i = 0;
            C39182b bVar = this.f92507z.get(0);
            float f4 = bVar.f92519e;
            int size = this.f92507z.size();
            int i2 = this.f92507z.get(size - 1).f92516b;
            for (int i3 = bVar.f92516b; i3 < i2; i3++) {
                while (i3 > bVar.f92516b && i < size) {
                    i++;
                    bVar = this.f92507z.get(i);
                }
                if (i3 == bVar.f92516b) {
                    f = (bVar.f92519e + bVar.f92518d) * f2;
                    f4 = bVar.f92519e + bVar.f92518d + f3;
                } else {
                    float pageWidth = this.f92486c.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                int i4 = this.f92437I;
                if (((float) i4) + f > ((float) scrollY)) {
                    this.f92438J.setBounds(this.f92439K, (int) f, this.f92440L, (int) (((float) i4) + f + 0.5f));
                    this.f92438J.draw(canvas);
                }
                if (f > ((float) (scrollY + height))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f92486c;
        if (pagerAdapter2 != null) {
            m79488a(pagerAdapter2, (C39187g) null);
            this.f92486c.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f92507z.size(); i++) {
                C39182b bVar = this.f92507z.get(i);
                this.f92486c.destroyItem((ViewGroup) this, bVar.f92516b, bVar.f92515a);
            }
            this.f92486c.finishUpdate((ViewGroup) this);
            this.f92507z.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C39183c) getChildAt(i2).getLayoutParams()).f92520a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f92487d = 0;
            scrollTo(0, 0);
        }
        this.f92486c = pagerAdapter;
        this.f92506x = 0;
        if (pagerAdapter != null) {
            if (this.f92436H == null) {
                this.f92436H = new C39187g(this, (byte) 0);
            }
            m79488a(this.f92486c, this.f92436H);
            this.f92447S = false;
            boolean z = this.f92478as;
            this.f92478as = true;
            this.f92506x = this.f92486c.getCount();
            if (this.f92431C >= 0) {
                this.f92486c.restoreState(this.f92432D, this.f92433E);
                m79485a(this.f92431C, false, true);
                this.f92431C = -1;
                this.f92432D = null;
                this.f92433E = null;
            } else if (!z) {
                mo67994f();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: b */
    private void m79496b(boolean z) {
        boolean z2;
        if (this.f92457aG == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.f92434F.isFinished()) {
                this.f92434F.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f92434F.getCurrX();
                int currY = this.f92434F.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m79498c(currY);
                    }
                }
            } else if (this.f92434F.getCurrY() != getScrollY()) {
                try {
                    C51423a.m95791b(5, "VerticalViewPager", "try fix->".concat(String.valueOf("realY:" + getScrollY() + ",expectY:" + this.f92434F.getCurrY())));
                } catch (Exception e) {
                    C13468b.m24210a(e);
                    C51423a.m95786a(e);
                }
                scrollTo(this.f92434F.getCurrX(), this.f92434F.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.f92447S = false;
        for (int i = 0; i < this.f92507z.size(); i++) {
            C39182b bVar = this.f92507z.get(i);
            if (bVar.f92517c) {
                bVar.f92517c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.f92456aF);
        } else {
            this.f92456aF.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00db, code lost:
        if (r9 >= ((float) com.p2082ss.android.ugc.aweme.feed.p2979x.C50561z.f116853c[1])) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e8 A[Catch:{ IllegalArgumentException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0106 A[Catch:{ IllegalArgumentException -> 0x019c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Exception e;
        PagerAdapter pagerAdapter;
        boolean z;
        AbstractC39186f fVar;
        int i;
        int i2;
        float f;
        if (this.f92459aI) {
            return false;
        }
        try {
            if (this.f92474ao) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f92486c) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.f92469aj == null) {
                        this.f92469aj = VelocityTracker.obtain();
                    }
                    this.f92469aj.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                AbstractC39186f fVar2 = this.f92458aH;
                                if (fVar2 != null && fVar2.mo68050a(true)) {
                                    return false;
                                }
                                if (!this.f92449U) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.f92468ai);
                                    if (findPointerIndex == -1) {
                                        z = m79504o();
                                    } else {
                                        float y = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y - this.f92463ad);
                                        float x = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x - this.f92462ac);
                                        if (abs > ((float) this.f92461ab) && abs > abs2) {
                                            this.f92449U = true;
                                            m79505p();
                                            float f2 = this.f92465af;
                                            if (y - f2 > 0.0f) {
                                                f = f2 + ((float) this.f92461ab);
                                            } else {
                                                f = f2 - ((float) this.f92461ab);
                                            }
                                            this.f92463ad = f;
                                            this.f92462ac = x;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f92449U) {
                                    z = false | m79497c(motionEvent.getY(motionEvent.findPointerIndex(this.f92468ai)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.f92463ad = motionEvent.getY(actionIndex);
                                    this.f92468ai = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    m79487a(motionEvent);
                                    this.f92463ad = motionEvent.getY(motionEvent.findPointerIndex(this.f92468ai));
                                }
                            } else if (this.f92449U) {
                                m79484a(this.f92487d, true, 0, false);
                                z = m79504o();
                            }
                        } else if (this.f92449U) {
                            VelocityTracker velocityTracker = this.f92469aj;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f92471al);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.f92468ai);
                            this.f92447S = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            C39182b q = m79506q();
                            if (q != null) {
                                float f3 = (float) clientHeight;
                                int i3 = q.f92516b;
                                int a = m79478a(i3, ((((float) scrollY) / f3) - q.f92519e) / (q.f92518d + (((float) this.f92437I) / f3)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.f92468ai)) - this.f92465af));
                                if (C49628k.m93081c() && a != (i2 = this.f92487d)) {
                                    a = this.f92458aH.mo68048a(a, i2, i3, yVelocity);
                                }
                                AbstractC39186f fVar3 = this.f92458aH;
                                if (!(fVar3 == null || !fVar3.mo68051b() || a == (i = this.f92487d))) {
                                    a = this.f92458aH.mo68047a(a, i, yVelocity);
                                }
                                AbstractC39186f fVar4 = this.f92458aH;
                                if (fVar4 != null && fVar4.mo68050a(false)) {
                                    a = i3;
                                }
                                if (a > i3 && (fVar = this.f92458aH) != null) {
                                    fVar.mo68049a();
                                }
                                m79486a(a, true, true, yVelocity);
                            }
                            z = m79504o();
                        }
                        if (z) {
                            C0792v.m2764c(this);
                        }
                    } else {
                        this.f92434F.abortAnimation();
                        this.f92447S = false;
                        mo67994f();
                        this.f92462ac = motionEvent.getX();
                        this.f92464ae = motionEvent.getX();
                        this.f92463ad = motionEvent.getY();
                        this.f92465af = motionEvent.getY();
                        this.f92468ai = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C13468b.m24210a(e);
            C51423a.m95788a("", e);
            return true;
        } catch (IllegalStateException e3) {
            e = e3;
            if (this.f92486c.getCount() != this.f92506x) {
                this.f92486c.notifyDataSetChanged();
            }
            C13468b.m24210a(e);
            C51423a.m95788a("", e);
            return true;
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.f92494k = i2;
        this.f92495l = i;
    }

    /* renamed from: a */
    private static void m79488a(PagerAdapter pagerAdapter, C39187g gVar) {
        try {
            Field field = f92427v;
            if (field != null) {
                field.set(pagerAdapter, gVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f92452aA == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C39183c) this.f92453aB.get(i2).getLayoutParams()).f92525f;
    }

    /* renamed from: c */
    private boolean m79499c(int i, int i2) {
        if (!C46965gb.f109453a) {
            return false;
        }
        float abs = Math.abs(((float) i) - this.f92464ae);
        float abs2 = Math.abs(((float) i2) - this.f92465af);
        if (abs2 <= ((float) this.f92461ab) || abs2 <= abs) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C39182b a;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a = m79480a(childAt)) != null && a.f92516b == this.f92487d && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: b */
    private C39182b m79494b(int i, int i2) {
        C39182b bVar = new C39182b();
        bVar.f92516b = i;
        bVar.f92515a = this.f92486c.instantiateItem((ViewGroup) this, i);
        bVar.f92518d = this.f92486c.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f92507z.size()) {
            this.f92507z.add(bVar);
        } else {
            this.f92507z.add(i2, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    private Rect m79479a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92507z = new ArrayList<>();
        this.f92429A = new C39182b();
        this.f92430B = new Rect();
        this.f92431C = -1;
        this.f92432D = null;
        this.f92433E = null;
        this.f92441M = -3.4028235E38f;
        this.f92442N = Float.MAX_VALUE;
        this.f92448T = 1;
        this.f92468ai = -1;
        this.f92478as = true;
        this.f92479at = false;
        this.f92488e = new ArrayList();
        this.f92489f = 0;
        this.f92454aD = 600;
        this.f92490g = false;
        this.f92491h = 0;
        this.f92455aE = 100;
        this.f92492i = null;
        this.f92456aF = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.RunnableC391773 */

            static {
                Covode.recordClassIndex(46807);
            }

            public final void run() {
                VerticalViewPager.this.setScrollState(0);
                if (VerticalViewPager.this.f92489f > 0) {
                    VerticalViewPager verticalViewPager = VerticalViewPager.this;
                    verticalViewPager.postDelayed(verticalViewPager.f92493j, (long) VerticalViewPager.this.f92489f);
                } else if (VerticalViewPager.this.f92490g) {
                    VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                    verticalViewPager2.f92491h = 1;
                    verticalViewPager2.mo67982c(verticalViewPager2.f92487d, true);
                    C40928a.m82418a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.RunnableC391784 */

                        static {
                            Covode.recordClassIndex(46808);
                        }

                        public final void run() {
                            VerticalViewPager.this.f92491h = 0;
                        }
                    });
                    if (C46806cv.f109048b == 1) {
                        if (!C40928a.m82418a(verticalViewPager2.f92493j)) {
                            verticalViewPager2.f92491h = 0;
                            verticalViewPager2.f92493j.run();
                        }
                    } else if (C46806cv.f109048b == 2) {
                        if (verticalViewPager2.f92492i == null) {
                            verticalViewPager2.f92492i = new Handler(Looper.getMainLooper());
                        }
                        verticalViewPager2.f92492i.postAtFrontOfQueue(verticalViewPager2.f92493j);
                    } else {
                        verticalViewPager2.postOnAnimation(verticalViewPager2.f92493j);
                    }
                } else {
                    VerticalViewPager.this.mo67994f();
                }
            }
        };
        this.f92493j = new RunnableC39216v(this);
        this.f92457aG = 0;
        this.f92494k = -1;
        this.f92495l = -1;
        this.f92496m = new C39217w(this);
        this.f92499p = C39197i.f92531a;
        this.f92500q = C39198j.f92532a;
        this.f92501r = C39199k.f92533a;
        this.f92502s = new C39200l(this);
        this.f92503t = new C39201m(this);
        this.f92504u = new C39202n(this);
        this.f92459aI = false;
        m79501l();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m79482a(int i, int i2) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f92434F;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.f92435G) {
                scrollY = this.f92434F.getCurrY();
            } else {
                scrollY = this.f92434F.getStartY();
            }
            this.f92434F.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i3 = 0 - scrollX;
        int i4 = i - scrollY;
        if (i3 == 0 && i4 == 0) {
            m79496b(false);
            mo67994f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i5 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i5;
        float b = f2 + (m79492b(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i3)) / ((f * this.f92486c.getPageWidth(this.f92487d)) + ((float) this.f92437I))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, this.f92454aD);
        int i6 = this.f92455aE;
        if (i6 != 100) {
            double d = (double) min;
            double d2 = (double) i6;
            Double.isNaN(d2);
            Double.isNaN(d);
            min = (int) (d * (d2 / 100.0d));
        }
        this.f92435G = false;
        this.f92434F.startScroll(scrollX, scrollY, i3, i4, min);
        C0792v.m2764c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo67980b(int i, boolean z) {
        List<ViewPager.AbstractC1579e> list;
        if (!(!z || (list = this.f92488e) == null || list.isEmpty())) {
            for (ViewPager.AbstractC1579e eVar : this.f92488e) {
                eVar.onPageSelected(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a6, code lost:
        if ((r4.f92515a instanceof android.widget.FrameLayout) == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b0, code lost:
        if (((android.widget.FrameLayout) r4.f92515a).isLayoutRequested() == false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b2, code lost:
        requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r4.f92516b == r17.f92487d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.f92507z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r11 = getClientHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r11 > 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r1 = r17.f92487d - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r1 < 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r15 < r2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1 >= r7) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r13 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1 != r13.f92516b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f92517c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.f92507z.remove(r12);
        r17.f92486c.destroyItem((android.view.ViewGroup) r17, r1, r13.f92515a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.f92507z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f92516b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f92518d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.f92507z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + m79494b(r1, r12 + 1).f92518d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.f92507z.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r4.f92518d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r4 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r7 = r4.f92518d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (m79491a(r19) != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r7 >= 2.0f) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011b, code lost:
        if (r2 >= r17.f92507z.size()) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011d, code lost:
        r13 = r17.f92507z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0125, code lost:
        if (r11 > 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        r11 = r17.f92487d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        if (r11 >= r6) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        if (r7 < r1) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
        if (r11 <= r9) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0134, code lost:
        if (r13 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0138, code lost:
        if (r11 != r13.f92516b) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013c, code lost:
        if (r13.f92517c != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013e, code lost:
        r17.f92507z.remove(r2);
        r17.f92486c.destroyItem((android.view.ViewGroup) r17, r11, r13.f92515a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0150, code lost:
        if (r2 >= r17.f92507z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0152, code lost:
        r13 = r17.f92507z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        if (r13 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015f, code lost:
        if (r11 != r13.f92516b) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0161, code lost:
        r7 = r7 + r13.f92518d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r2 >= r17.f92507z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016e, code lost:
        r13 = r17.f92507z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0177, code lost:
        r0 = m79494b(r11, r2);
        r2 = r2 + 1;
        r7 = r7 + r0.f92518d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0186, code lost:
        if (r2 >= r17.f92507z.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0188, code lost:
        r13 = r17.f92507z.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0191, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019d, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019f, code lost:
        m79489a(r4, r8, r10);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67982c(int r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 656
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.mo67982c(int, boolean):void");
    }

    /* renamed from: a */
    private void m79485a(int i, boolean z, boolean z2) {
        m79486a(i, z, z2, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C39183c cVar = (C39183c) layoutParams;
        cVar.f92520a |= view instanceof AbstractC39181a;
        if (!this.f92445Q) {
            super.addView(view, i, layoutParams);
        } else if (!cVar.f92520a) {
            cVar.f92523d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C39182b a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = m79480a(childAt)) != null && a.f92516b == this.f92487d) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    /* renamed from: a */
    private void m79481a(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.f92481av > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C39183c cVar = (C39183c) childAt.getLayoutParams();
                if (cVar.f92520a) {
                    int i6 = cVar.f92521b & 112;
                    if (i6 == 16) {
                        i3 = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i4 = paddingTop;
                        paddingTop = i3;
                    } else if (i6 == 48) {
                        i4 = childAt.getHeight() + paddingTop;
                    } else if (i6 != 80) {
                        i4 = paddingTop;
                    } else {
                        i3 = (height - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i4 = paddingTop;
                        paddingTop = i3;
                    }
                    int top = (paddingTop + scrollY) - childAt.getTop();
                    if (top != 0) {
                        childAt.offsetTopAndBottom(top);
                    }
                    paddingTop = i4;
                }
            }
        }
        List<ViewPager.AbstractC1579e> list = this.f92488e;
        if (list != null && !list.isEmpty()) {
            for (ViewPager.AbstractC1579e eVar : this.f92488e) {
                eVar.onPageScrolled(i, f, i2);
            }
        }
        ViewPager.AbstractC1579e eVar2 = this.f92482aw;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i, f, i2);
        }
        if (this.f92484ay != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C39183c) childAt2.getLayoutParams()).f92520a) {
                    this.f92484ay.mo5330a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.f92480au = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.f92437I;
            m79483a(i2, i4, i5, i5);
        }
    }

    /* renamed from: a */
    private int m79478a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f92472am || Math.abs(i2) <= this.f92470ak) {
            if (i >= this.f92487d) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f92507z.size() <= 0) {
            return i;
        }
        ArrayList<C39182b> arrayList = this.f92507z;
        return Math.max(this.f92507z.get(0).f92516b, Math.min(i, arrayList.get(arrayList.size() - 1).f92516b));
    }

    /* renamed from: a */
    private void m79483a(int i, int i2, int i3, int i4) {
        float f;
        C39182b b;
        if (i2 <= 0 || this.f92507z.isEmpty()) {
            C39182b b2 = m79493b(this.f92487d);
            if (b2 != null) {
                f = Math.min(b2.f92519e, this.f92442N);
            } else {
                f = 0.0f;
            }
            int paddingTop = (int) (f * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                m79496b(false);
                scrollTo(getScrollX(), paddingTop);
            }
        } else if (!this.f92434F.isFinished()) {
            int clientHeight = getClientHeight();
            if (C39218x.m79568a()) {
                int finalY = this.f92434F.getFinalY() / i2;
                int i5 = finalY * clientHeight;
                C39182b b3 = m79493b(this.f92487d);
                if (b3 != null) {
                    int i6 = (int) (b3.f92519e * ((float) clientHeight));
                    C51423a.m95791b(4, "VerticalViewPager_YCH", "use itemInfo to calculate final y after = " + i6 + " before= " + i5);
                    i5 = i6;
                }
                C51423a.m95791b(4, "VerticalViewPager_YCH", "getCurItem = " + getCurrentItem() + "current scroll y = " + getScrollY() + "finalY = " + (getClientHeight() * getCurrentItem()) + "trueCount = " + finalY + "newY = " + i5);
                this.f92434F.setFinalY(i5);
                return;
            }
            C51423a.m95791b(4, "VerticalViewPager", "use origin logic");
            this.f92434F.setFinalY(getCurrentItem() * clientHeight);
        } else {
            int scrollY = (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
            if (this.f92457aG == 0 && (b = m79493b(this.f92487d)) != null) {
                scrollY = (int) (b.f92519e * ((float) getClientHeight()));
            }
            scrollTo(getScrollX(), scrollY);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C39183c cVar = (C39183c) childAt.getLayoutParams();
                if (cVar.f92520a) {
                    int i13 = cVar.f92521b & 7;
                    int i14 = cVar.f92521b & 112;
                    if (i13 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i13 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i13 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i14 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i14 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i14 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i15 = paddingTop + scrollY;
                    childAt.layout(paddingLeft, i15, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i15);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i16 = (i10 - paddingTop) - paddingBottom;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                C39183c cVar2 = (C39183c) childAt2.getLayoutParams();
                C39182b a = m79480a(childAt2);
                if (!cVar2.f92520a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f92519e * f)) + paddingTop;
                    if (cVar2.f92523d) {
                        cVar2.f92523d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i9 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f * cVar2.f92522c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i18, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f92439K = paddingLeft;
        this.f92440L = i9 - paddingRight;
        this.f92481av = i11;
        if (this.f92478as) {
            z2 = false;
            m79484a(this.f92487d, false, 0, false);
        } else {
            z2 = false;
        }
        this.f92478as = z2;
    }
}
