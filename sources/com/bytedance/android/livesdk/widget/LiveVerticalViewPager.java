package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveViewpagerSlideBlockSwitchSetting;
import com.bytedance.android.livesdk.util.rxutils.C11192g;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class LiveVerticalViewPager extends ViewGroup {

    /* renamed from: a */
    public static final int[] f27220a = {16842931};

    /* renamed from: an */
    private static final C11367i f27221an = new C11367i();

    /* renamed from: g */
    static Field f27222g;

    /* renamed from: i */
    private static final Comparator<C11360b> f27223i = new Comparator<C11360b>() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C113511 */

        static {
            Covode.recordClassIndex(13004);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C11360b bVar, C11360b bVar2) {
            return bVar.f27297b - bVar2.f27297b;
        }
    };

    /* renamed from: j */
    private static final Interpolator f27224j = new Interpolator() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.animationInterpolatorC113522 */

        static {
            Covode.recordClassIndex(13005);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private boolean f27225A;

    /* renamed from: B */
    private boolean f27226B;

    /* renamed from: C */
    private boolean f27227C;

    /* renamed from: D */
    private int f27228D = 1;

    /* renamed from: E */
    private boolean f27229E;

    /* renamed from: F */
    private boolean f27230F;

    /* renamed from: G */
    private int f27231G;

    /* renamed from: H */
    private int f27232H;

    /* renamed from: I */
    private int f27233I;

    /* renamed from: J */
    private float f27234J;

    /* renamed from: K */
    private float f27235K;

    /* renamed from: L */
    private float f27236L;

    /* renamed from: M */
    private float f27237M;

    /* renamed from: N */
    private int f27238N = -1;

    /* renamed from: O */
    private VelocityTracker f27239O;

    /* renamed from: P */
    private int f27240P;

    /* renamed from: Q */
    private int f27241Q;

    /* renamed from: R */
    private int f27242R;

    /* renamed from: S */
    private int f27243S;

    /* renamed from: T */
    private C0819d f27244T;

    /* renamed from: U */
    private C0819d f27245U;

    /* renamed from: V */
    private boolean f27246V = false;

    /* renamed from: W */
    private boolean f27247W = false;

    /* renamed from: aa */
    private boolean f27248aa = true;

    /* renamed from: ab */
    private boolean f27249ab = false;

    /* renamed from: ac */
    private boolean f27250ac;

    /* renamed from: ad */
    private int f27251ad;

    /* renamed from: ae */
    private ViewPager.AbstractC1579e f27252ae;

    /* renamed from: af */
    private ViewPager.AbstractC1579e f27253af;

    /* renamed from: ag */
    private AbstractC11363e f27254ag;

    /* renamed from: ah */
    private ViewPager.AbstractC1580f f27255ah;

    /* renamed from: ai */
    private Method f27256ai;

    /* renamed from: aj */
    private AbstractC11364f f27257aj;

    /* renamed from: ak */
    private boolean f27258ak = false;

    /* renamed from: al */
    private int f27259al;

    /* renamed from: am */
    private ArrayList<View> f27260am;

    /* renamed from: ao */
    private final Runnable f27261ao = new Runnable() {
        /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.RunnableC113533 */

        static {
            Covode.recordClassIndex(13006);
        }

        public final void run() {
            LiveVerticalViewPager.this.setScrollState(0);
            LiveVerticalViewPager.this.mo18184b();
        }
    };

    /* renamed from: ap */
    private int f27262ap = 0;

    /* renamed from: b */
    public PagerAdapter f27263b;

    /* renamed from: c */
    public int f27264c;

    /* renamed from: d */
    public Scroller f27265d;

    /* renamed from: e */
    public boolean f27266e;

    /* renamed from: f */
    public AbstractC11365g f27267f = null;

    /* renamed from: h */
    private int f27268h;

    /* renamed from: k */
    private final ArrayList<C11360b> f27269k = new ArrayList<>();

    /* renamed from: l */
    private final C11360b f27270l = new C11360b();

    /* renamed from: m */
    private final Rect f27271m = new Rect();

    /* renamed from: n */
    private int f27272n = -1;

    /* renamed from: o */
    private Parcelable f27273o = null;

    /* renamed from: p */
    private ClassLoader f27274p = null;

    /* renamed from: q */
    private boolean f27275q;

    /* renamed from: r */
    private C11366h f27276r;

    /* renamed from: s */
    private int f27277s;

    /* renamed from: t */
    private Drawable f27278t;

    /* renamed from: u */
    private int f27279u;

    /* renamed from: v */
    private int f27280v;

    /* renamed from: w */
    private float f27281w = -3.4028235E38f;

    /* renamed from: x */
    private float f27282x = Float.MAX_VALUE;

    /* renamed from: y */
    private int f27283y;

    /* renamed from: z */
    private int f27284z;

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$a */
    interface AbstractC11359a {
        static {
            Covode.recordClassIndex(13013);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$e */
    interface AbstractC11363e {
        static {
            Covode.recordClassIndex(13017);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$f */
    public interface AbstractC11364f {
        static {
            Covode.recordClassIndex(13018);
        }

        /* renamed from: a */
        boolean mo12721a();
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$g */
    public interface AbstractC11365g {
        static {
            Covode.recordClassIndex(13019);
        }

        /* renamed from: a */
        void mo12718a();

        /* renamed from: b */
        void mo12719b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$b */
    public static class C11360b {

        /* renamed from: a */
        Object f27296a;

        /* renamed from: b */
        int f27297b;

        /* renamed from: c */
        boolean f27298c;

        /* renamed from: d */
        float f27299d;

        /* renamed from: e */
        float f27300e;

        static {
            Covode.recordClassIndex(13014);
        }

        C11360b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$i */
    public static class C11367i implements Comparator<View> {
        static {
            Covode.recordClassIndex(13021);
        }

        C11367i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C11361c cVar = (C11361c) view.getLayoutParams();
            C11361c cVar2 = (C11361c) view2.getLayoutParams();
            if (cVar.f27301a == cVar2.f27301a) {
                return cVar.f27305e - cVar2.f27305e;
            }
            if (cVar.f27301a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f27263b;
    }

    public int getCurrentItem() {
        return this.f27264c;
    }

    public int getOffscreenPageLimit() {
        return this.f27228D;
    }

    public int getPageMargin() {
        return this.f27277s;
    }

    /* renamed from: a */
    public final void mo18180a(int i, boolean z) {
        this.f27227C = false;
        m20148a(i, z, false);
    }

    /* renamed from: a */
    private void m20149a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f27263b;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f27264c != i || this.f27269k.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f27263b.getCount()) {
                i = this.f27263b.getCount() - 1;
            }
            int i3 = this.f27228D;
            int i4 = this.f27264c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f27269k.size(); i5++) {
                    this.f27269k.get(i5).f27298c = true;
                }
            }
            if (this.f27264c != i) {
                z3 = true;
            }
            if (this.f27248aa) {
                this.f27264c = i;
                if (z3) {
                    ViewPager.AbstractC1579e eVar = this.f27252ae;
                    if (eVar != null) {
                        eVar.onPageSelected(i);
                    }
                    ViewPager.AbstractC1579e eVar2 = this.f27253af;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i);
                    }
                }
                requestLayout();
                return;
            }
            m20143a(i);
            m20147a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m20147a(int i, boolean z, int i2, boolean z2) {
        C11360b b = m20155b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f27281w, Math.min(b.f27300e, this.f27282x))) : 0;
        if (z) {
            m20145a(clientHeight, i2);
            if (z2) {
                ViewPager.AbstractC1579e eVar = this.f27252ae;
                if (eVar != null) {
                    eVar.onPageSelected(i);
                }
                ViewPager.AbstractC1579e eVar2 = this.f27253af;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            ViewPager.AbstractC1579e eVar3 = this.f27252ae;
            if (eVar3 != null) {
                eVar3.onPageSelected(i);
            }
            ViewPager.AbstractC1579e eVar4 = this.f27253af;
            if (eVar4 != null) {
                eVar4.onPageSelected(i);
            }
        }
        m20153a(false);
        scrollTo(0, clientHeight);
        m20160c(clientHeight);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo18179a() {
        int count = this.f27263b.getCount();
        this.f27268h = count;
        boolean z = this.f27269k.size() < (this.f27228D * 2) + 1 && this.f27269k.size() < count;
        int i = this.f27264c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f27269k.size()) {
            C11360b bVar = this.f27269k.get(i2);
            int itemPosition = this.f27263b.getItemPosition(bVar.f27296a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f27269k.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f27263b.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f27263b.destroyItem((ViewGroup) this, bVar.f27297b, bVar.f27296a);
                    if (this.f27264c == bVar.f27297b) {
                        i = Math.max(0, Math.min(this.f27264c, count - 1));
                    }
                } else if (bVar.f27297b != itemPosition) {
                    if (bVar.f27297b == this.f27264c) {
                        i = itemPosition;
                    }
                    bVar.f27297b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f27263b.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f27269k, f27223i);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C11361c cVar = (C11361c) getChildAt(i3).getLayoutParams();
                if (!cVar.f27301a) {
                    cVar.f27303c = 0.0f;
                }
            }
            m20148a(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m20152a(C11360b bVar, int i, C11360b bVar2) {
        C11360b bVar3;
        C11360b bVar4;
        int count = this.f27263b.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f27277s) / ((float) clientHeight) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f27297b;
            if (i2 < bVar.f27297b) {
                float f2 = bVar2.f27300e + bVar2.f27299d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f27297b && i4 < this.f27269k.size()) {
                    C11360b bVar5 = this.f27269k.get(i4);
                    while (true) {
                        bVar4 = bVar5;
                        if (i3 > bVar4.f27297b && i4 < this.f27269k.size() - 1) {
                            i4++;
                            bVar5 = this.f27269k.get(i4);
                        }
                    }
                    while (i3 < bVar4.f27297b) {
                        f2 += this.f27263b.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f27300e = f2;
                    f2 += bVar4.f27299d + f;
                    i3++;
                }
            } else if (i2 > bVar.f27297b) {
                int size = this.f27269k.size() - 1;
                float f3 = bVar2.f27300e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f27297b && size >= 0) {
                    C11360b bVar6 = this.f27269k.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i5 < bVar3.f27297b && size > 0) {
                            size--;
                            bVar6 = this.f27269k.get(size);
                        }
                    }
                    while (i5 > bVar3.f27297b) {
                        f3 -= this.f27263b.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= bVar3.f27299d + f;
                    bVar3.f27300e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f27269k.size();
        float f4 = bVar.f27300e;
        int i6 = bVar.f27297b - 1;
        this.f27281w = bVar.f27297b == 0 ? bVar.f27300e : -3.4028235E38f;
        int i7 = count - 1;
        this.f27282x = bVar.f27297b == i7 ? (bVar.f27300e + bVar.f27299d) - 1.0f : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            C11360b bVar7 = this.f27269k.get(i8);
            while (i6 > bVar7.f27297b) {
                f4 -= this.f27263b.getPageWidth(i6) + f;
                i6--;
            }
            f4 -= bVar7.f27299d + f;
            bVar7.f27300e = f4;
            if (bVar7.f27297b == 0) {
                this.f27281w = f4;
            }
            i8--;
            i6--;
        }
        float f5 = bVar.f27300e + bVar.f27299d + f;
        int i9 = bVar.f27297b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C11360b bVar8 = this.f27269k.get(i10);
            while (i9 < bVar8.f27297b) {
                f5 += this.f27263b.getPageWidth(i9) + f;
                i9++;
            }
            if (bVar8.f27297b == i7) {
                this.f27282x = (bVar8.f27299d + f5) - 1.0f;
            }
            bVar8.f27300e = f5;
            f5 += bVar8.f27299d + f;
            i10++;
            i9++;
        }
        this.f27249ab = false;
    }

    /* renamed from: a */
    private void m20153a(boolean z) {
        boolean z2;
        if (this.f27262ap == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.f27265d.isFinished()) {
                this.f27265d.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f27265d.getCurrX();
                int currY = this.f27265d.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m20160c(currY);
                    }
                }
            } else if (this.f27265d.getCurrY() != getScrollY() && LiveViewpagerSlideBlockSwitchSetting.INSTANCE.getValue()) {
                C3854a.m9453a(6, "slide_log", "DmtViewPager completeScroll mScroller.getCurrY() != getScrollY() " + (this.f27265d.getCurrY() - getScrollY()));
                scrollTo(this.f27265d.getCurrX(), this.f27265d.getCurrY());
                C11192g.m19836a(TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new AbstractC88986z<Long>() {
                    /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C113555 */

                    /* renamed from: a */
                    AbstractC88412b f27288a;

                    /* renamed from: b */
                    int f27289b = 2;

                    static {
                        Covode.recordClassIndex(13008);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onComplete() {
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onError(Throwable th) {
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onSubscribe(AbstractC88412b bVar) {
                        this.f27288a = bVar;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88986z
                    public final /* synthetic */ void onNext(Long l) {
                        C3854a.m9453a(6, "slide_log", "scroll " + (LiveVerticalViewPager.this.f27265d.getCurrY() - LiveVerticalViewPager.this.getScrollY()));
                        if (LiveVerticalViewPager.this.f27265d.getCurrY() == LiveVerticalViewPager.this.getScrollY()) {
                            this.f27289b--;
                            AbstractC88412b bVar = this.f27288a;
                            if (bVar != null && !bVar.isDisposed() && this.f27289b <= 0) {
                                C3854a.m9453a(6, "slide_log", "dispose " + LiveVerticalViewPager.this.f27265d.getCurrY());
                                this.f27288a.dispose();
                                return;
                            }
                            return;
                        }
                        LiveVerticalViewPager liveVerticalViewPager = LiveVerticalViewPager.this;
                        liveVerticalViewPager.scrollTo(liveVerticalViewPager.f27265d.getCurrX(), LiveVerticalViewPager.this.f27265d.getCurrY());
                    }
                });
            }
        } else {
            z2 = false;
        }
        this.f27227C = false;
        for (int i = 0; i < this.f27269k.size(); i++) {
            C11360b bVar = this.f27269k.get(i);
            if (bVar.f27298c) {
                bVar.f27298c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.f27261ao);
        } else {
            this.f27261ao.run();
        }
    }

    /* renamed from: a */
    private boolean m20154a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && m20154a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m20150a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f27238N) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f27235K = motionEvent.getY(i);
            this.f27238N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f27239O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$c */
    public static class C11361c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f27301a;

        /* renamed from: b */
        public int f27302b;

        /* renamed from: c */
        float f27303c;

        /* renamed from: d */
        boolean f27304d;

        /* renamed from: e */
        int f27305e;

        /* renamed from: f */
        int f27306f;

        static {
            Covode.recordClassIndex(13015);
        }

        public C11361c() {
            super(-1, -1);
        }

        public C11361c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LiveVerticalViewPager.f27220a);
            this.f27302b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$h */
    class C11366h extends DataSetObserver {
        static {
            Covode.recordClassIndex(13020);
        }

        public final void onChanged() {
            LiveVerticalViewPager.this.mo18179a();
        }

        public final void onInvalidated() {
            LiveVerticalViewPager.this.mo18179a();
        }

        private C11366h() {
        }

        /* synthetic */ C11366h(LiveVerticalViewPager liveVerticalViewPager, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18184b() {
        m20143a(this.f27264c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C11361c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27248aa = true;
    }

    /* renamed from: f */
    private void m20164f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: h */
    private void m20166h() {
        this.f27229E = false;
        this.f27230F = false;
        VelocityTracker velocityTracker = this.f27239O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27239O = null;
        }
    }

    /* renamed from: i */
    private boolean m20167i() {
        int i = this.f27264c;
        if (i <= 0) {
            return false;
        }
        mo18180a(i - 1, true);
        return true;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.SavedState.C113581 */

            static {
                Covode.recordClassIndex(13012);
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
        int f27293a;

        /* renamed from: b */
        Parcelable f27294b;

        /* renamed from: c */
        ClassLoader f27295c;

        static {
            Covode.recordClassIndex(13011);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f27293a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27293a);
            parcel.writeParcelable(this.f27294b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f27293a = parcel.readInt();
            this.f27294b = parcel.readParcelable(classLoader);
            this.f27295c = classLoader;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.widget.LiveVerticalViewPager$d */
    public class C11362d extends C0726a {
        static {
            Covode.recordClassIndex(13016);
        }

        /* renamed from: a */
        private boolean m20175a() {
            if (LiveVerticalViewPager.this.f27263b == null || LiveVerticalViewPager.this.f27263b.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C11362d() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0740f a = C0740f.m2624a();
            a.mo2859a(m20175a());
            if (accessibilityEvent.getEventType() == 4096 && LiveVerticalViewPager.this.f27263b != null) {
                a.mo2858a(LiveVerticalViewPager.this.f27263b.getCount());
                a.mo2860b(LiveVerticalViewPager.this.f27264c);
                a.mo2861c(LiveVerticalViewPager.this.f27264c);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            try {
                super.mo2808a(view, dVar);
            } catch (Exception e) {
                if (Logger.debug()) {
                    C3854a.m9453a(6, "MyAccessibilityDelegate", e.getMessage());
                }
            }
            dVar.mo2834a((CharSequence) ViewPager.class.getName());
            dVar.mo2844d(m20175a());
            if (LiveVerticalViewPager.this.canScrollVertically(1)) {
                dVar.mo2829a(4096);
            }
            if (LiveVerticalViewPager.this.canScrollVertically(-1)) {
                dVar.mo2829a(8192);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !LiveVerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                LiveVerticalViewPager liveVerticalViewPager = LiveVerticalViewPager.this;
                liveVerticalViewPager.setCurrentItem(liveVerticalViewPager.f27264c - 1);
                return true;
            } else if (!LiveVerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                LiveVerticalViewPager liveVerticalViewPager2 = LiveVerticalViewPager.this;
                liveVerticalViewPager2.setCurrentItem(liveVerticalViewPager2.f27264c + 1);
                return true;
            }
        }
    }

    /* renamed from: e */
    private boolean m20163e() {
        this.f27238N = -1;
        m20166h();
        return this.f27244T.mo3010a() | this.f27245U.mo3010a();
    }

    /* renamed from: j */
    private boolean m20168j() {
        PagerAdapter pagerAdapter = this.f27263b;
        if (pagerAdapter == null || this.f27264c >= pagerAdapter.getCount() - 1) {
            return false;
        }
        mo18180a(this.f27264c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f27278t;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f27261ao);
        Scroller scroller = this.f27265d;
        if (scroller != null && !scroller.isFinished()) {
            this.f27265d.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27293a = this.f27264c;
        PagerAdapter pagerAdapter = this.f27263b;
        if (pagerAdapter != null) {
            savedState.f27294b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(13003);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f27222g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    private void m20161d() {
        if (this.f27259al != 0) {
            ArrayList<View> arrayList = this.f27260am;
            if (arrayList == null) {
                this.f27260am = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f27260am.add(getChildAt(i));
            }
            Collections.sort(this.f27260am, f27221an);
        }
    }

    /* renamed from: c */
    private void m20159c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f27265d = new Scroller(context, f27224j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f27233I = viewConfiguration.getScaledPagingTouchSlop();
        this.f27240P = (int) (400.0f * f);
        this.f27241Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f27244T = new C0819d(context);
        this.f27245U = new C0819d(context);
        this.f27242R = (int) (25.0f * f);
        this.f27243S = (int) (2.0f * f);
        this.f27231G = (int) (f * 16.0f);
        C0792v.m2747a(this, new C11362d());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C113544 */

            /* renamed from: b */
            private final Rect f27287b = new Rect();

            static {
                Covode.recordClassIndex(13007);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f27287b;
                rect.left = a.mo2865a();
                rect.top = a.mo2867b();
                rect.right = a.mo2868c();
                rect.bottom = a.mo2869d();
                int childCount = LiveVerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0753ad b = C0792v.m2757b(LiveVerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2865a(), rect.left);
                    rect.top = Math.min(b.mo2867b(), rect.top);
                    rect.right = Math.min(b.mo2868c(), rect.right);
                    rect.bottom = Math.min(b.mo2869d(), rect.bottom);
                }
                return a.mo2866a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: g */
    private C11360b m20165g() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
            f2 = ((float) this.f27277s) / ((float) clientHeight);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C11360b bVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f27269k.size()) {
            C11360b bVar2 = this.f27269k.get(i3);
            if (!z && bVar2.f27297b != (i = i2 + 1)) {
                bVar2 = this.f27270l;
                bVar2.f27300e = f3 + f4 + f2;
                bVar2.f27297b = i;
                bVar2.f27299d = this.f27263b.getPageWidth(bVar2.f27297b);
                i3--;
            }
            f3 = bVar2.f27300e;
            float f5 = bVar2.f27299d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i3 == this.f27269k.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f27297b;
            f4 = bVar2.f27299d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f27275q = true;
        if (this.f27265d.isFinished() || !this.f27265d.computeScrollOffset()) {
            m20153a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f27265d.getCurrX();
        int currY = this.f27265d.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m20160c(currY)) {
                this.f27265d.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0792v.m2764c(this);
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(AbstractC11363e eVar) {
        this.f27254ag = eVar;
    }

    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        this.f27252ae = eVar;
    }

    public void setOnSlideInterceptor(AbstractC11364f fVar) {
        this.f27257aj = fVar;
    }

    public void setOverScrollListener(AbstractC11365g gVar) {
        this.f27267f = gVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f27226B != z) {
            this.f27226B = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f27227C = false;
        m20149a(i, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C11361c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C11361c(getContext(), attributeSet);
    }

    public void setCurrentItem(int i) {
        this.f27227C = false;
        m20148a(i, !this.f27248aa, false);
    }

    public void setPageMargin(int i) {
        int i2 = this.f27277s;
        this.f27277s = i;
        int height = getHeight();
        m20146a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f27278t) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static float m20140a(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    /* renamed from: b */
    private C11360b m20155b(int i) {
        for (int i2 = 0; i2 < this.f27269k.size(); i2++) {
            C11360b bVar = this.f27269k.get(i2);
            if (bVar.f27297b == i) {
                return bVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        MethodCollector.m26663i(9712);
        if (this.f27225A) {
            removeViewInLayout(view);
            MethodCollector.m26664o(9712);
            return;
        }
        super.removeView(view);
        MethodCollector.m26664o(9712);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f27278t = drawable;
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
    private C11360b m20142a(View view) {
        for (int i = 0; i < this.f27269k.size(); i++) {
            C11360b bVar = this.f27269k.get(i);
            if (this.f27263b.isViewFromObject(view, bVar.f27296a)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C11360b a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m20142a(childAt)) != null && a.f27297b == this.f27264c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f27263b == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f27281w))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f27282x))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C11360b a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m20142a(childAt)) != null && a.f27297b == this.f27264c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        PagerAdapter pagerAdapter = this.f27263b;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f27294b, savedState.f27295c);
            m20148a(savedState.f27293a, false, true);
            return;
        }
        this.f27272n = savedState.f27293a;
        this.f27273o = savedState.f27294b;
        this.f27274p = savedState.f27295c;
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (this.f27256ai == null) {
            try {
                this.f27256ai = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                C3854a.m9460b("LiveVerticalViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
            }
        }
        try {
            this.f27256ai.invoke(this, Boolean.valueOf(z));
        } catch (Exception e2) {
            C3854a.m9460b("LiveVerticalViewPager", "Error changing children drawing order", e2);
        }
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            C3854a.m9453a(5, "LiveVerticalViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f27228D) {
            this.f27228D = i;
            mo18184b();
        }
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f27262ap != i) {
            this.f27262ap = i;
            if (this.f27255ah != null) {
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
            ViewPager.AbstractC1579e eVar = this.f27252ae;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
        }
    }

    public LiveVerticalViewPager(Context context) {
        super(context);
        MethodCollector.m26663i(9250);
        m20159c();
        MethodCollector.m26664o(9250);
    }

    /* renamed from: b */
    private C11360b m20157b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m20142a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z = m20162d(17);
                } else if (keyCode == 22) {
                    z = m20162d(66);
                } else if (keyCode == 61) {
                    int i = Build.VERSION.SDK_INT;
                    if (keyEvent.hasNoModifiers()) {
                        z = m20162d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z = m20162d(1);
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

    /* renamed from: b */
    private boolean m20158b(float f) {
        boolean z;
        this.f27235K = f;
        float scrollY = ((float) getScrollY()) + (this.f27235K - f);
        float clientHeight = (float) getClientHeight();
        float f2 = this.f27281w * clientHeight;
        float f3 = this.f27282x * clientHeight;
        boolean z2 = false;
        C11360b bVar = this.f27269k.get(0);
        ArrayList<C11360b> arrayList = this.f27269k;
        boolean z3 = true;
        C11360b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f27297b != 0) {
            f2 = bVar.f27300e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f27297b != this.f27263b.getCount() - 1) {
            f3 = bVar2.f27300e * clientHeight;
            z3 = false;
        }
        if (scrollY < f2) {
            if (z) {
                z2 = this.f27244T.mo3011a(Math.abs(f2 - scrollY) / clientHeight);
            }
            scrollY = f2;
        } else if (scrollY > f3) {
            if (z3) {
                z2 = this.f27245U.mo3011a(Math.abs(scrollY - f3) / clientHeight);
            }
            scrollY = f3;
        }
        int i = (int) scrollY;
        this.f27234J += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m20160c(i);
        return z2;
    }

    /* renamed from: c */
    private boolean m20160c(int i) {
        if (this.f27269k.size() != 0) {
            C11360b g = m20165g();
            int clientHeight = getClientHeight();
            int i2 = this.f27277s;
            int i3 = clientHeight + i2;
            float f = (float) i2;
            float f2 = (float) clientHeight;
            int i4 = g.f27297b;
            float f3 = ((((float) i) / f2) - g.f27300e) / (g.f27299d + (f / f2));
            this.f27250ac = false;
            m20144a(i4, f3, (int) (((float) i3) * f3));
            if (this.f27250ac) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f27248aa) {
            return false;
        } else {
            this.f27250ac = false;
            m20144a(0, 0.0f, 0);
            if (this.f27250ac) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r8 != 2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m20162d(int r8) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m20162d(int):boolean");
    }

    public void draw(Canvas canvas) {
        boolean z;
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f27263b) != null && pagerAdapter.getCount() > 1)) {
                if (!this.f27244T.f3048a.isFinished()) {
                    int save = canvas.save();
                    int height = getHeight();
                    int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.translate((float) getPaddingLeft(), this.f27281w * ((float) height));
                    this.f27244T.mo3009a(width, height);
                    z = this.f27244T.mo3012a(canvas) | false;
                    canvas.restoreToCount(save);
                    if (!this.f27246V) {
                        this.f27246V = true;
                        if (this.f27267f != null) {
                            post(new Runnable() {
                                /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.RunnableC113566 */

                                static {
                                    Covode.recordClassIndex(13009);
                                }

                                public final void run() {
                                    if (LiveVerticalViewPager.this.f27267f != null) {
                                        LiveVerticalViewPager.this.f27267f.mo12718a();
                                    }
                                }
                            });
                        }
                    }
                } else {
                    z = false;
                }
                if (!this.f27245U.f3048a.isFinished()) {
                    int save2 = canvas.save();
                    int height2 = getHeight();
                    int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.rotate(180.0f);
                    canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f27282x + 1.0f)) * ((float) height2));
                    this.f27245U.mo3009a(width2, height2);
                    z |= this.f27245U.mo3012a(canvas);
                    canvas.restoreToCount(save2);
                    if (!this.f27247W) {
                        this.f27247W = true;
                        if (this.f27267f != null) {
                            post(new Runnable() {
                                /* class com.bytedance.android.livesdk.widget.LiveVerticalViewPager.RunnableC113577 */

                                static {
                                    Covode.recordClassIndex(13010);
                                }

                                public final void run() {
                                    if (LiveVerticalViewPager.this.f27267f != null) {
                                        LiveVerticalViewPager.this.f27267f.mo12719b();
                                    }
                                }
                            });
                        }
                    }
                }
                if (z) {
                    C0792v.m2764c(this);
                    return;
                }
            } else {
                this.f27244T.f3048a.finish();
                this.f27245U.f3048a.finish();
            }
            if (this.f27246V) {
                this.f27246V = false;
            }
            if (this.f27247W) {
                this.f27247W = false;
            }
        } catch (Throwable th) {
            C3854a.m9458a("LiveVerticalViewPager", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i = 9866;
        MethodCollector.m26663i(9866);
        super.onDraw(canvas);
        if (this.f27277s > 0 && this.f27278t != null && this.f27269k.size() > 0 && this.f27263b != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f2 = (float) height;
            float f3 = ((float) this.f27277s) / f2;
            int i2 = 0;
            C11360b bVar = this.f27269k.get(0);
            float f4 = bVar.f27300e;
            int size = this.f27269k.size();
            int i3 = bVar.f27297b;
            int i4 = this.f27269k.get(size - 1).f27297b;
            while (true) {
                if (i3 >= i4) {
                    break;
                }
                while (i3 > bVar.f27297b && i2 < size) {
                    i2++;
                    bVar = this.f27269k.get(i2);
                }
                if (i3 == bVar.f27297b) {
                    f = (bVar.f27300e + bVar.f27299d) * f2;
                    f4 = bVar.f27300e + bVar.f27299d + f3;
                } else {
                    float pageWidth = this.f27263b.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                int i5 = this.f27277s;
                if (((float) i5) + f > ((float) scrollY)) {
                    this.f27278t.setBounds(this.f27279u, (int) f, this.f27280v, (int) (((float) i5) + f + 0.5f));
                    this.f27278t.draw(canvas);
                }
                if (f > ((float) (scrollY + height))) {
                    i = 9866;
                    break;
                } else {
                    i3++;
                    i = 9866;
                }
            }
        }
        MethodCollector.m26664o(i);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f27263b;
        if (pagerAdapter2 != null) {
            m20151a(pagerAdapter2, (C11366h) null);
            this.f27263b.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f27269k.size(); i++) {
                C11360b bVar = this.f27269k.get(i);
                this.f27263b.destroyItem((ViewGroup) this, bVar.f27297b, bVar.f27296a);
            }
            this.f27263b.finishUpdate((ViewGroup) this);
            this.f27269k.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C11361c) getChildAt(i2).getLayoutParams()).f27301a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f27264c = 0;
            scrollTo(0, 0);
        }
        this.f27263b = pagerAdapter;
        this.f27268h = 0;
        if (pagerAdapter != null) {
            if (this.f27276r == null) {
                this.f27276r = new C11366h(this, (byte) 0);
            }
            m20151a(this.f27263b, this.f27276r);
            this.f27227C = false;
            boolean z = this.f27248aa;
            this.f27248aa = true;
            this.f27268h = this.f27263b.getCount();
            if (this.f27272n >= 0) {
                this.f27263b.restoreState(this.f27273o, this.f27274p);
                m20148a(this.f27272n, false, true);
                this.f27272n = -1;
                this.f27273o = null;
                this.f27274p = null;
            } else if (!z) {
                mo18184b();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f27266e) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f27229E) {
                            return true;
                        }
                        if (this.f27230F) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f27234J = motionEvent.getX();
                        this.f27236L = motionEvent.getX();
                        this.f27235K = motionEvent.getY();
                        this.f27237M = motionEvent.getY();
                        this.f27238N = motionEvent.getPointerId(0);
                        this.f27230F = false;
                        this.f27275q = true;
                        this.f27265d.computeScrollOffset();
                        if (this.f27262ap != 2 || Math.abs(this.f27265d.getFinalY() - this.f27265d.getCurrY()) <= this.f27243S) {
                            m20153a(false);
                            this.f27229E = false;
                            this.f27258ak = false;
                        } else {
                            this.f27265d.abortAnimation();
                            this.f27227C = false;
                            mo18184b();
                            this.f27229E = true;
                            m20164f();
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f27238N;
                        if (i != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            float y = motionEvent.getY(findPointerIndex);
                            float f2 = y - this.f27235K;
                            float abs = Math.abs(f2);
                            float x = motionEvent.getX(findPointerIndex);
                            float abs2 = Math.abs(x - this.f27236L);
                            if (f2 != 0.0f) {
                                float f3 = this.f27235K;
                                if (f3 >= ((float) this.f27232H) || f2 <= 0.0f) {
                                    if (f3 <= ((float) (getHeight() - this.f27232H)) || f2 >= 0.0f) {
                                        if (m20154a(this, false, (int) f2, (int) x, (int) y)) {
                                            this.f27234J = x;
                                            this.f27235K = y;
                                            this.f27230F = true;
                                            return false;
                                        }
                                    }
                                }
                            }
                            int i2 = this.f27233I;
                            if (abs <= ((float) i2) || abs * 0.5f <= abs2) {
                                if (abs2 > ((float) i2)) {
                                    this.f27230F = true;
                                }
                            } else if (this.f27258ak) {
                                return false;
                            } else {
                                AbstractC11364f fVar = this.f27257aj;
                                if (fVar == null || !fVar.mo12721a()) {
                                    this.f27229E = true;
                                    m20164f();
                                    setScrollState(1);
                                    if (f2 > 0.0f) {
                                        f = this.f27237M + ((float) this.f27233I);
                                    } else {
                                        f = this.f27237M - ((float) this.f27233I);
                                    }
                                    this.f27235K = f;
                                    this.f27234J = x;
                                    setScrollingCacheEnabled(true);
                                } else {
                                    this.f27258ak = true;
                                    return false;
                                }
                            }
                            if (this.f27229E && m20158b(y)) {
                                C0792v.m2764c(this);
                            }
                        }
                    } else if (action == 6) {
                        m20150a(motionEvent);
                    }
                    if (this.f27239O == null) {
                        this.f27239O = VelocityTracker.obtain();
                    }
                    this.f27239O.addMovement(motionEvent);
                    return this.f27229E;
                }
            }
            m20163e();
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        float f;
        float f2;
        if (!isEnabled()) {
            return false;
        }
        try {
            if (this.f27266e) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f27263b) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.f27239O == null) {
                        this.f27239O = VelocityTracker.obtain();
                    }
                    this.f27239O.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                if (!this.f27229E) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.f27238N);
                                    if (findPointerIndex == -1) {
                                        z = m20163e();
                                    } else {
                                        float y = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y - this.f27235K);
                                        float x = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x - this.f27234J);
                                        if (abs > ((float) this.f27233I) && abs > abs2) {
                                            this.f27229E = true;
                                            m20164f();
                                            float f3 = this.f27237M;
                                            if (y - f3 > 0.0f) {
                                                f2 = f3 + ((float) this.f27233I);
                                            } else {
                                                f2 = f3 - ((float) this.f27233I);
                                            }
                                            this.f27235K = f2;
                                            this.f27234J = x;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f27229E) {
                                    z = false | m20158b(motionEvent.getY(motionEvent.findPointerIndex(this.f27238N)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.f27235K = motionEvent.getY(actionIndex);
                                    this.f27238N = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    m20150a(motionEvent);
                                    this.f27235K = motionEvent.getY(motionEvent.findPointerIndex(this.f27238N));
                                }
                            } else if (this.f27229E) {
                                m20147a(this.f27264c, true, 0, false);
                                z = m20163e();
                            }
                        } else if (this.f27229E) {
                            VelocityTracker velocityTracker = this.f27239O;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f27241Q);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.f27238N);
                            this.f27227C = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            C11360b g = m20165g();
                            float f4 = (float) clientHeight;
                            int i = g.f27297b;
                            float f5 = ((((float) scrollY) / f4) - g.f27300e) / (g.f27299d + (((float) this.f27277s) / f4));
                            if (Math.abs((int) (motionEvent.getY(motionEvent.findPointerIndex(this.f27238N)) - this.f27237M)) <= this.f27242R || Math.abs(yVelocity) <= this.f27240P) {
                                if (i >= this.f27264c) {
                                    f = 0.6f;
                                } else {
                                    f = 0.4f;
                                }
                                i = (int) (((float) i) + f5 + f);
                            } else if (yVelocity <= 0) {
                                i++;
                            }
                            if (this.f27269k.size() > 0) {
                                ArrayList<C11360b> arrayList = this.f27269k;
                                i = Math.max(this.f27269k.get(0).f27297b, Math.min(i, arrayList.get(arrayList.size() - 1).f27297b));
                            }
                            m20149a(i, true, true, yVelocity);
                            z = m20163e();
                        }
                        if (z) {
                            C0792v.m2764c(this);
                        }
                    } else {
                        this.f27265d.abortAnimation();
                        this.f27227C = false;
                        mo18184b();
                        this.f27236L = motionEvent.getX();
                        this.f27234J = motionEvent.getX();
                        this.f27235K = motionEvent.getY();
                        this.f27237M = motionEvent.getY();
                        this.f27238N = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r6.f27297b == r17.f27264c) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r12 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r12 < 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r13 = r17.f27269k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r11 = getClientHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r11 > 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        r1 = r17.f27264c - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r1 < 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r15 < r2) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r1 >= r3) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r13 == null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r1 != r13.f27297b) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r13.f27298c != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r17.f27269k.remove(r12);
        r17.f27263b.destroyItem((android.view.ViewGroup) r17, r1, r13.f27296a);
        r12 = r12 - 1;
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r13 = r17.f27269k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r13 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r1 != r13.f27297b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r15 = r15 + r13.f27299d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        r13 = r17.f27269k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        r15 = r15 + m20156b(r1, r12 + 1).f27299d;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r12 < 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        r13 = r17.f27269k.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        r2 = (2.0f - r6.f27299d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r6 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        r3 = r6.f27299d;
        r2 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0107, code lost:
        if (r3 >= 2.0f) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (r2 >= r17.f27269k.size()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0111, code lost:
        r13 = r17.f27269k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        if (r11 > 0) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011c, code lost:
        r11 = r17.f27264c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011e, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        if (r11 >= r9) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r3 < r1) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        if (r11 <= r8) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if (r13 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        if (r11 != r13.f27297b) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0130, code lost:
        if (r13.f27298c != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0132, code lost:
        r17.f27269k.remove(r2);
        r17.f27263b.destroyItem((android.view.ViewGroup) r17, r11, r13.f27296a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r2 >= r17.f27269k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0146, code lost:
        r13 = r17.f27269k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014f, code lost:
        if (r13 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r11 != r13.f27297b) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        r3 = r3 + r13.f27299d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0160, code lost:
        if (r2 >= r17.f27269k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0162, code lost:
        r13 = r17.f27269k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016b, code lost:
        r0 = m20156b(r11, r2);
        r2 = r2 + 1;
        r3 = r3 + r0.f27299d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017a, code lost:
        if (r2 >= r17.f27269k.size()) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017c, code lost:
        r13 = r17.f27269k.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0185, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0191, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0193, code lost:
        m20152a(r6, r7, r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20143a(int r18) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.m20143a(int):void");
    }

    /* renamed from: a */
    private static void m20151a(PagerAdapter pagerAdapter, C11366h hVar) {
        try {
            f27222g.set(pagerAdapter, hVar);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f27259al == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C11361c) this.f27260am.get(i2).getLayoutParams()).f27306f;
    }

    /* renamed from: b */
    private C11360b m20156b(int i, int i2) {
        C11360b bVar = new C11360b();
        bVar.f27297b = i;
        bVar.f27296a = this.f27263b.instantiateItem((ViewGroup) this, i);
        bVar.f27299d = this.f27263b.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f27269k.size()) {
            this.f27269k.add(bVar);
        } else {
            this.f27269k.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C11360b a;
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
            if (childAt.getVisibility() == 0 && (a = m20142a(childAt)) != null && a.f27297b == this.f27264c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: a */
    private Rect m20141a(Rect rect, View view) {
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

    public LiveVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9251);
        m20159c();
        MethodCollector.m26664o(9251);
    }

    /* renamed from: a */
    private void m20145a(int i, int i2) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f27265d;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.f27275q) {
                scrollY = this.f27265d.getCurrY();
            } else {
                scrollY = this.f27265d.getStartY();
            }
            this.f27265d.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i3 = 0 - scrollX;
        int i4 = i - scrollY;
        if (i3 == 0 && i4 == 0) {
            m20153a(false);
            mo18184b();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i5 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i5;
        float a = f2 + (m20140a(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i3)) / ((f * this.f27263b.getPageWidth(this.f27264c)) + ((float) this.f27277s))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f27275q = false;
        this.f27265d.startScroll(scrollX, scrollY, i3, i4, min);
        C0792v.m2764c(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveVerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m20148a(int i, boolean z, boolean z2) {
        m20149a(i, z, z2, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(9567);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C11361c cVar = (C11361c) layoutParams;
        cVar.f27301a |= view instanceof AbstractC11359a;
        if (!this.f27225A) {
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(9567);
        } else if (!cVar.f27301a) {
            cVar.f27304d = true;
            addViewInLayout(view, i, layoutParams);
            MethodCollector.m26664o(9567);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            MethodCollector.m26664o(9567);
            throw illegalStateException;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C11360b a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = m20142a(childAt)) != null && a.f27297b == this.f27264c) {
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
    private void m20144a(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.f27251ad > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C11361c cVar = (C11361c) childAt.getLayoutParams();
                if (cVar.f27301a) {
                    int i6 = cVar.f27302b & 112;
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
        ViewPager.AbstractC1579e eVar = this.f27252ae;
        if (eVar != null) {
            eVar.onPageScrolled(i, f, i2);
        }
        ViewPager.AbstractC1579e eVar2 = this.f27253af;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i, f, i2);
        }
        if (this.f27255ah != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C11361c) childAt2.getLayoutParams()).f27301a) {
                    this.f27255ah.mo5330a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.f27250ac = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.f27277s;
            m20146a(i2, i4, i5, i5);
        }
    }

    /* renamed from: a */
    private void m20146a(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.f27269k.isEmpty()) {
            C11360b b = m20155b(this.f27264c);
            if (b != null) {
                f = Math.min(b.f27300e, this.f27282x);
            } else {
                f = 0.0f;
            }
            int paddingTop = (int) (f * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (paddingTop != getScrollY()) {
                m20153a(false);
                scrollTo(getScrollX(), paddingTop);
            }
        } else if (!this.f27265d.isFinished()) {
            this.f27265d.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
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
                C11361c cVar = (C11361c) childAt.getLayoutParams();
                if (cVar.f27301a) {
                    int i13 = cVar.f27302b & 7;
                    int i14 = cVar.f27302b & 112;
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
                C11361c cVar2 = (C11361c) childAt2.getLayoutParams();
                C11360b a = m20142a(childAt2);
                if (!cVar2.f27301a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f27300e * f)) + paddingTop;
                    if (cVar2.f27304d) {
                        cVar2.f27304d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i9 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f * cVar2.f27303c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i18, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f27279u = paddingLeft;
        this.f27280v = i9 - paddingRight;
        this.f27251ad = i11;
        if (this.f27248aa) {
            z2 = false;
            m20147a(this.f27264c, false, 0, false);
        } else {
            z2 = false;
        }
        this.f27248aa = z2;
    }
}
