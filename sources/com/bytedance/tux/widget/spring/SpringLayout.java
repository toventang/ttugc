package com.bytedance.tux.widget.spring;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.AbstractC0781k;
import androidx.core.p037h.AbstractC0785o;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import androidx.p043e.p044a.AbstractC0855b;
import androidx.p043e.p044a.C0875d;
import androidx.p043e.p044a.C0876e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.widget.spring.p1731a.C23422a;
import com.bytedance.tux.widget.spring.p1732b.AbstractC23424a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

public class SpringLayout extends FrameLayout implements AbstractC0781k, AbstractC0785o {

    /* renamed from: h */
    public static final C23417c f55519h = new C23417c((byte) 0);

    /* renamed from: A */
    private float f55520A;

    /* renamed from: B */
    private C0875d f55521B;

    /* renamed from: C */
    private AbstractC23423b f55522C;

    /* renamed from: D */
    private AbstractC23421a f55523D;

    /* renamed from: E */
    private int f55524E;

    /* renamed from: F */
    private boolean f55525F;

    /* renamed from: G */
    private boolean f55526G;

    /* renamed from: a */
    public boolean f55527a;

    /* renamed from: b */
    public int f55528b;

    /* renamed from: c */
    public boolean f55529c;

    /* renamed from: d */
    public AbstractC23425c f55530d;

    /* renamed from: e */
    public C23422a f55531e;

    /* renamed from: f */
    public boolean f55532f;

    /* renamed from: g */
    public boolean f55533g;

    /* renamed from: i */
    private final C0787q f55534i;

    /* renamed from: j */
    private final C0783m f55535j;

    /* renamed from: k */
    private final int[] f55536k;

    /* renamed from: l */
    private AbstractC23424a f55537l;

    /* renamed from: m */
    private int f55538m;

    /* renamed from: n */
    private int f55539n;

    /* renamed from: o */
    private int f55540o;

    /* renamed from: p */
    private int f55541p;

    /* renamed from: q */
    private int f55542q;

    /* renamed from: r */
    private boolean f55543r;

    /* renamed from: s */
    private boolean f55544s;

    /* renamed from: t */
    private VelocityTracker f55545t;

    /* renamed from: u */
    private EnumC23427e f55546u;

    /* renamed from: v */
    private EnumC23429g f55547v;

    /* renamed from: w */
    private float f55548w;

    /* renamed from: x */
    private float f55549x;

    /* renamed from: y */
    private float f55550y;

    /* renamed from: z */
    private final C0876e f55551z;

    static {
        Covode.recordClassIndex(27374);
    }

    public SpringLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$c */
    public static final class C23417c {
        static {
            Covode.recordClassIndex(27377);
        }

        private C23417c() {
        }

        public /* synthetic */ C23417c(byte b) {
            this();
        }
    }

    public final int getHoverBottomHeight() {
        return this.f55524E;
    }

    public final float getMaxOverScrollDistance() {
        return this.f55549x;
    }

    public final AbstractC23424a getNestedHeader() {
        return this.f55537l;
    }

    public final EnumC23427e getOverScrollMode() {
        return this.f55546u;
    }

    public final float getRubberBandCoefficient() {
        return this.f55550y;
    }

    public final EnumC23429g getScrollMode() {
        return this.f55547v;
    }

    public final float getSpringStiffness() {
        return this.f55520A;
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final boolean mo2474a(View view, View view2, int i, int i2) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        C23428f.m44095a("onStartNestedScroll", Integer.valueOf(i2), null, null, null, null, null, null, null, Integer.valueOf(getNestedScrollY()), null, null, 126970);
        return (i & 2) != 0;
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$d */
    public static final class C23418d implements AbstractC23421a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f55554a;

        static {
            Covode.recordClassIndex(27378);
        }

        @Override // com.bytedance.tux.widget.spring.AbstractC23421a
        /* renamed from: a */
        public final void mo38193a() {
            this.f55554a.invoke();
        }

        C23418d(AbstractC89171a aVar) {
            this.f55554a = aVar;
        }
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$e */
    public static final class C23419e implements AbstractC23423b {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f55555a;

        static {
            Covode.recordClassIndex(27379);
        }

        @Override // com.bytedance.tux.widget.spring.AbstractC23423b
        /* renamed from: a */
        public final void mo38194a() {
            this.f55555a.invoke();
        }

        C23419e(AbstractC89171a aVar) {
            this.f55555a = aVar;
        }
    }

    /* renamed from: e */
    private static void m44073e() {
        throw new IllegalArgumentException("Spring layout just have one child view");
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        mo2900a(0);
    }

    /* renamed from: b */
    private final void m44068b() {
        this.f55543r = false;
        this.f55539n = 0;
        this.f55538m = 0;
        m44071c();
    }

    private final int getHeaderHeight() {
        AbstractC23424a aVar = this.f55537l;
        if (aVar != null) {
            return aVar.getActualHeight();
        }
        return 0;
    }

    public final int getNestedScrollY() {
        return getScrollY() - getHeaderHeight();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55545t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f55545t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f55521B.mo3150b();
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$b */
    static final class C23416b implements AbstractC0855b.AbstractC0871b {

        /* renamed from: a */
        final /* synthetic */ SpringLayout f55553a;

        static {
            Covode.recordClassIndex(27376);
        }

        C23416b(SpringLayout springLayout) {
            this.f55553a = springLayout;
        }

        @Override // androidx.p043e.p044a.AbstractC0855b.AbstractC0871b
        /* renamed from: a */
        public final void mo3155a() {
            SpringLayout springLayout = this.f55553a;
            springLayout.f55528b = springLayout.f55531e.mo38196a(this.f55553a.getNestedScrollY());
        }
    }

    /* renamed from: c */
    private final void m44071c() {
        int i;
        if (getNestedScrollY() != 0) {
            if (getNestedScrollY() < 0) {
                i = -1;
            } else {
                i = 1;
            }
            m44065a(i, true, Float.valueOf(0.0f));
        }
    }

    /* renamed from: d */
    private final boolean m44072d() {
        if (getScrollY() != 0 || !this.f55533g || getHeaderHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m44064a() {
        AbstractC23424a aVar;
        AbstractC23424a aVar2;
        boolean z = false;
        if (getNestedScrollY() < 0) {
            if (!this.f55527a && (aVar = this.f55537l) != null) {
                aVar.mo37905b(false);
            }
            z = true;
        } else if (this.f55527a && (aVar2 = this.f55537l) != null) {
            aVar2.mo37905b(true);
        }
        this.f55527a = z;
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$a */
    static final class C23415a implements AbstractC0855b.AbstractC0872c {

        /* renamed from: a */
        final /* synthetic */ SpringLayout f55552a;

        static {
            Covode.recordClassIndex(27375);
        }

        C23415a(SpringLayout springLayout) {
            this.f55552a = springLayout;
        }

        @Override // androidx.p043e.p044a.AbstractC0855b.AbstractC0872c
        /* renamed from: a */
        public final void mo3156a() {
            AbstractC23424a nestedHeader;
            AbstractC23424a nestedHeader2;
            SpringLayout springLayout = this.f55552a;
            springLayout.f55528b = springLayout.f55531e.mo38196a(this.f55552a.getNestedScrollY());
            AbstractC23424a nestedHeader3 = this.f55552a.getNestedHeader();
            boolean z = true;
            if (nestedHeader3 != null) {
                nestedHeader3.mo37903a(this.f55552a.getNestedScrollY(), true);
            }
            AbstractC23425c cVar = this.f55552a.f55530d;
            if (cVar != null) {
                cVar.mo38195a(this.f55552a.getNestedScrollY(), this.f55552a.f55528b, true);
            }
            SpringLayout springLayout2 = this.f55552a;
            if (springLayout2.getNestedScrollY() >= 0) {
                if (this.f55552a.f55527a && (nestedHeader2 = this.f55552a.getNestedHeader()) != null) {
                    nestedHeader2.mo37905b(true);
                }
                z = false;
            } else if (!this.f55552a.f55527a && (nestedHeader = this.f55552a.getNestedHeader()) != null) {
                nestedHeader.mo37905b(false);
            }
            springLayout2.f55527a = z;
        }
    }

    private final View getNestedChild() {
        if (getChildCount() == 0) {
            return null;
        }
        if (getChildCount() > 2) {
            m44073e();
        }
        int i = 0;
        if (getChildCount() == 2) {
            if (!(getChildAt(0) instanceof AbstractC23424a)) {
                m44073e();
            }
            if (getChildAt(1) instanceof AbstractC23424a) {
                throw new IllegalArgumentException("Header view must as first child");
            }
        }
        int childCount = getChildCount();
        if (childCount < 0) {
            return null;
        }
        while (true) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof AbstractC23424a) && childAt != null) {
                return childAt;
            }
            if (i == childCount) {
                return null;
            }
            i++;
        }
    }

    public final void setHoverBottomHeight(int i) {
        this.f55524E = i;
    }

    /* renamed from: com.bytedance.tux.widget.spring.SpringLayout$f */
    public static final class C23420f implements AbstractC23425c {

        /* renamed from: a */
        final /* synthetic */ AbstractC89187q f55556a;

        static {
            Covode.recordClassIndex(27380);
        }

        C23420f(AbstractC89187q qVar) {
            this.f55556a = qVar;
        }

        @Override // com.bytedance.tux.widget.spring.AbstractC23425c
        /* renamed from: a */
        public final void mo38195a(int i, int i2, boolean z) {
            this.f55556a.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    @Override // androidx.core.p037h.AbstractC0781k
    /* renamed from: a */
    public final void mo2900a(int i) {
        this.f55535j.mo2910b(i);
    }

    public final void setOnHoverBottomListener(AbstractC23421a aVar) {
        C89219l.m154719c(aVar, "");
        this.f55523D = aVar;
    }

    public final void setOnRefreshListener(AbstractC23423b bVar) {
        C89219l.m154719c(bVar, "");
        this.f55522C = bVar;
    }

    public final void setOnScrollChangeListener(AbstractC23425c cVar) {
        C89219l.m154719c(cVar, "");
        this.f55530d = cVar;
    }

    public final void setOverScrollMode(EnumC23427e eVar) {
        C89219l.m154719c(eVar, "");
        this.f55546u = eVar;
    }

    public final void setRubberBandCoefficient(float f) {
        this.f55550y = f;
        this.f55531e.f55558b = f;
    }

    public final void setScrollMode(EnumC23429g gVar) {
        C89219l.m154719c(gVar, "");
        this.f55547v = gVar;
    }

    public final void setSpringStiffness(float f) {
        this.f55520A = f;
        this.f55551z.mo3159a(f);
    }

    public boolean startNestedScroll(int i) {
        return m44070b(i, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        C89219l.m154719c(view, "");
        mo2476b(view, 0);
    }

    public final void setOnHoverBottomListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f55523D = new C23418d(aVar);
    }

    public final void setOnRefreshListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f55522C = new C23419e(aVar);
    }

    public final void setOnScrollChangeListener(AbstractC89187q<? super Integer, ? super Integer, ? super Boolean, C89391z> qVar) {
        C89219l.m154719c(qVar, "");
        this.f55530d = new C23420f(qVar);
    }

    public final void setHoverAtBottom(boolean z) {
        if (this.f55532f != z) {
            this.f55532f = z;
            int i = 1;
            if (z) {
                if (!this.f55525F) {
                    this.f55525F = true;
                    AbstractC23421a aVar = this.f55523D;
                    if (aVar != null) {
                        aVar.mo38193a();
                    }
                }
            } else if (this.f55525F) {
                this.f55525F = false;
                if (getNestedScrollY() < 0) {
                    i = -1;
                }
                m44065a(i, this.f55532f, Float.valueOf(0.0f));
            }
        }
    }

    public final void setMaxOverScrollDistance(float f) {
        if (f >= 1.0f) {
            this.f55549x = f;
            this.f55531e.f55557a = f;
            C0875d dVar = this.f55521B;
            if (dVar != null) {
                dVar.mo3149b((this.f55549x - 1.0f) + ((float) getHeaderHeight()));
            }
            C0875d dVar2 = this.f55521B;
            if (dVar2 != null) {
                dVar2.mo3152c((-this.f55549x) + 1.0f);
                return;
            }
            return;
        }
        throw new IllegalStateException("maxOverScrollDistance must >= 1");
    }

    public final void setRefreshing(boolean z) {
        if (this.f55533g != z) {
            this.f55533g = z;
            int i = 1;
            if (z) {
                if (!this.f55526G) {
                    this.f55526G = true;
                    AbstractC23423b bVar = this.f55522C;
                    if (bVar != null) {
                        bVar.mo38194a();
                    }
                    AbstractC23424a aVar = this.f55537l;
                    if (aVar != null) {
                        aVar.mo37904a(true);
                    }
                }
            } else if (this.f55526G) {
                this.f55526G = false;
                AbstractC23424a aVar2 = this.f55537l;
                if (aVar2 != null) {
                    aVar2.mo37904a(false);
                }
                if (getNestedScrollY() < 0) {
                    i = -1;
                }
                m44065a(i, this.f55533g, Float.valueOf(0.0f));
            }
        }
    }

    /* renamed from: b */
    private final void m44069b(int i) {
        int i2 = 1;
        if (Math.abs(i) > 1) {
            int a = this.f55531e.mo38196a(getNestedScrollY());
            this.f55528b = a;
            this.f55528b = a + i;
            int headerHeight = getHeaderHeight();
            C23422a aVar = this.f55531e;
            int i3 = this.f55528b;
            int nestedScrollY = getNestedScrollY() + i;
            if (i <= 0) {
                i2 = -1;
            }
            scrollTo(0, headerHeight + aVar.mo38197a(i3, nestedScrollY, i2));
            this.f55528b = this.f55531e.mo38196a(getNestedScrollY());
            m44064a();
            AbstractC23424a aVar2 = this.f55537l;
            if (aVar2 != null) {
                aVar2.mo37903a(getNestedScrollY(), false);
            }
            AbstractC23425c cVar = this.f55530d;
            if (cVar != null) {
                cVar.mo38195a(getNestedScrollY(), this.f55528b, false);
            }
        }
    }

    public final void setNestedHeader(AbstractC23424a aVar) {
        int i;
        int i2;
        this.f55537l = aVar;
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                if (!(getChildAt(i3) instanceof AbstractC23424a)) {
                    if (i3 == childCount) {
                        break;
                    }
                    i3++;
                } else {
                    removeViewAt(i3);
                    break;
                }
            }
        }
        if (this.f55521B.f3157t) {
            this.f55521B.mo3150b();
            scrollTo(0, 0);
        }
        if (!(aVar instanceof View)) {
            this.f55537l = null;
            setRefreshing(false);
            this.f55526G = false;
            scrollTo(0, 0);
            return;
        }
        AbstractC23424a aVar2 = this.f55537l;
        if (aVar2 != null) {
            View view = (View) aVar2;
            AbstractC23424a aVar3 = this.f55537l;
            if (aVar3 != null) {
                i = aVar3.getActualHeight();
            } else {
                i = 0;
            }
            addView(view, 0, new ViewGroup.LayoutParams(-1, i));
            this.f55521B.mo3149b((this.f55549x - 1.0f) + ((float) aVar.getActualHeight()));
            AbstractC23424a aVar4 = this.f55537l;
            if (aVar4 != null) {
                i2 = aVar4.getActualHeight();
            } else {
                i2 = 0;
            }
            scrollTo(0, i2);
            AbstractC23424a aVar5 = this.f55537l;
            if (aVar5 != null) {
                aVar5.mo37904a(this.f55533g);
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public final void mo38159a(float f) {
        boolean z;
        if (this.f55546u == EnumC23427e.ALWAYS || this.f55546u == EnumC23427e.ONLY_TOP) {
            if (this.f55526G || this.f55525F) {
                z = true;
            } else {
                z = false;
            }
            m44065a(-1, z, Float.valueOf(f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
        if (r0 != 2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0169, code lost:
        if ((getNestedScrollY() + r4) <= 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        if (r0 != 2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018e, code lost:
        if ((getNestedScrollY() + r4) >= 0) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r1 != 2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if ((getNestedScrollY() + r4) >= 0) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154719c(motionEvent, "");
        if (this.f55544s) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            this.f55540o = motionEvent.getPointerId(0);
            this.f55539n = C89241a.m154730a(motionEvent.getY());
            this.f55538m = C89241a.m154730a(motionEvent.getX());
            if (this.f55521B.f3157t) {
                this.f55521B.mo3150b();
            }
            C23428f.m44095a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 1) {
            m44068b();
            C23428f.m44095a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f55540o);
            if (findPointerIndex < 0) {
                return false;
            }
            int a = C89241a.m154730a(motionEvent.getY(findPointerIndex));
            int i2 = this.f55539n - a;
            this.f55539n = a;
            m44069b(i2);
            C23428f.m44095a("onTouchEvent", null, null, Integer.valueOf(i2), null, null, null, null, null, null, null, null, 131052);
        } else if (actionMasked == 3) {
            m44068b();
            C23428f.m44095a("onTouchEvent", null, null, null, null, null, null, null, null, null, null, null, 131068);
        } else if (actionMasked == 5) {
            this.f55540o = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f55539n = C89241a.m154730a(motionEvent.getY(motionEvent.getActionIndex()));
            this.f55538m = C89241a.m154730a(motionEvent.getX(motionEvent.getActionIndex()));
        } else if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f55540o) {
            if (motionEvent.getActionIndex() == 0) {
                i = 1;
            }
            this.f55540o = motionEvent.getPointerId(i);
            this.f55539n = C89241a.m154730a(motionEvent.getY(i));
            this.f55538m = C89241a.m154730a(motionEvent.getX(i));
        }
        return this.f55543r;
    }

    /* renamed from: b */
    private boolean m44070b(int i, int i2) {
        return this.f55535j.mo2906a(i, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f55535j.mo2903a(f, f2);
    }

    /* renamed from: a */
    private static boolean m44067a(int i, int i2) {
        if (((float) Math.abs(i2)) <= 10.0f || Math.abs(i2) <= Math.abs(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2476b(View view, int i) {
        C89219l.m154719c(view, "");
        this.f55534i.mo2914a(i);
        if (i == 0) {
            m44071c();
        }
        mo2900a(i);
        C23428f.m44095a("onStopNestedScroll", Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, 131066);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f55535j.mo2904a(f, f2, z);
    }

    private /* synthetic */ SpringLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        mo2477b(view, view2, i, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        return mo2474a(view, view2, i, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        C89219l.m154719c(view, "");
        C23428f.m44095a("onNestedFling", null, null, null, null, null, null, null, Float.valueOf(f2), null, null, null, 130046);
        this.f55548w = f2;
        return dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        EnumC23429g gVar;
        EnumC23427e eVar;
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(6857);
        this.f55536k = new int[2];
        this.f55546u = EnumC23427e.ALWAYS;
        this.f55547v = EnumC23429g.NONE;
        this.f55531e = new C23422a();
        this.f55549x = 2000.0f;
        this.f55550y = 0.55f;
        C0876e eVar2 = new C0876e();
        eVar2.mo3160b(1.0f);
        eVar2.mo3161c(0.0f);
        this.f55551z = eVar2;
        this.f55520A = 100.0f;
        C0875d dVar = new C0875d(this, AbstractC0855b.f3151n);
        dVar.mo3157a(eVar2);
        C0876e eVar3 = dVar.f3167x;
        C89219l.m154709a((Object) eVar3, "");
        eVar3.mo3159a(this.f55520A);
        dVar.mo3152c((-this.f55549x) + 1.0f);
        dVar.mo3149b((this.f55549x - 1.0f) + ((float) getHeaderHeight()));
        dVar.mo3147a(new C23415a(this));
        dVar.mo3146a(new C23416b(this));
        this.f55521B = dVar;
        this.f55524E = -1;
        if (getChildCount() <= 1) {
            this.f55534i = new C0787q();
            this.f55535j = new C0783m(this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap4, R.attr.aq9, R.attr.aql}, 0, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            if (obtainStyledAttributes.getInt(2, 0) != 1) {
                gVar = EnumC23429g.NONE;
            } else {
                gVar = EnumC23429g.REFRESH;
            }
            this.f55547v = gVar;
            int i2 = obtainStyledAttributes.getInt(1, 3);
            if (i2 == 0) {
                eVar = EnumC23427e.NONE;
            } else if (i2 == 1) {
                eVar = EnumC23427e.ONLY_TOP;
            } else if (i2 != 2) {
                eVar = EnumC23427e.ALWAYS;
            } else {
                eVar = EnumC23427e.ONLY_BOTTOM;
            }
            this.f55546u = eVar;
            this.f55529c = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(6857);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Spring layout just have one child view");
        MethodCollector.m26664o(6857);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    private final void m44065a(int i, boolean z, Float f) {
        float f2;
        float f3;
        float f4;
        if (this.f55521B.f3157t) {
            this.f55521B.mo3150b();
        }
        if (i != 0) {
            VelocityTracker velocityTracker = this.f55545t;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000, this.f55548w);
            }
            C89233z.C89235b bVar = new C89233z.C89235b();
            if (f != null) {
                f3 = f.floatValue();
            } else {
                VelocityTracker velocityTracker2 = this.f55545t;
                if (velocityTracker2 != null) {
                    f2 = velocityTracker2.getYVelocity(this.f55540o);
                } else {
                    f2 = 0.0f;
                }
                bVar.element = f2;
                if (i < 0) {
                    if (bVar.element > 0.0f) {
                        f4 = bVar.element;
                    } else {
                        f3 = bVar.element;
                    }
                } else if (bVar.element < 0.0f) {
                    f4 = bVar.element;
                } else {
                    f3 = bVar.element;
                }
                f3 = -f4;
            }
            bVar.element = f3;
            C0875d dVar = this.f55521B;
            if (i >= 0 || this.f55547v != EnumC23429g.REFRESH || !z || (getNestedScrollY() >= (-getHeaderHeight()) && !this.f55526G)) {
                int nestedScrollY = getNestedScrollY();
                int i2 = this.f55524E;
                if (1 <= i2 && nestedScrollY >= i2 && z) {
                    C0876e eVar = dVar.f3167x;
                    C89219l.m154709a((Object) eVar, "");
                    eVar.mo3161c((float) this.f55524E);
                    if (!this.f55525F) {
                        setHoverAtBottom(true);
                    }
                } else {
                    C0876e eVar2 = dVar.f3167x;
                    C89219l.m154709a((Object) eVar2, "");
                    eVar2.mo3161c((float) getHeaderHeight());
                }
            } else {
                C0876e eVar3 = dVar.f3167x;
                C89219l.m154709a((Object) eVar3, "");
                eVar3.mo3161c(0.0f);
                if (!this.f55526G) {
                    setRefreshing(true);
                }
            }
            dVar.mo3145a(bVar.element / 2.0f);
            C23428f.m44095a("startAnimation", null, null, null, null, null, null, null, null, null, Integer.valueOf(getScrollY()), Integer.valueOf(i), 106494);
            dVar.mo3148a();
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C89219l.m154719c(view, "");
        C23428f.m44095a("onNestedFling", null, null, null, null, null, null, null, Float.valueOf(f2), null, null, null, 130046);
        return false;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(iArr, "");
        mo2472a(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2477b(View view, View view2, int i, int i2) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        this.f55534i.mo2915a(i, i2);
        m44070b(2, i2);
        if (!this.f55529c) {
            this.f55544s = true;
        }
        if (i2 == 0 && this.f55521B.f3157t) {
            this.f55521B.mo3150b();
        }
        C23428f.m44095a("onNestedScrollAccept", Integer.valueOf(i2), null, null, null, null, null, null, null, null, null, null, 131066);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f55535j.mo2907a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C89219l.m154719c(view, "");
        m44066a(view, i, i2, i3, i4, 0, this.f55536k);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int headerHeight = getHeaderHeight();
        AbstractC23424a aVar = this.f55537l;
        if (!(aVar instanceof View)) {
            aVar = null;
        }
        View view = (View) aVar;
        if (view != null) {
            view.layout(0, 0, view.getMeasuredWidth(), headerHeight);
        }
        View nestedChild = getNestedChild();
        if (nestedChild != null) {
            nestedChild.layout(0, headerHeight, nestedChild.getMeasuredWidth(), nestedChild.getMeasuredHeight() + headerHeight);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2472a(android.view.View r14, int r15, int r16, int[] r17, int r18) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.mo2472a(android.view.View, int, int, int[], int):void");
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154719c(view, "");
        m44066a(view, i, i2, i3, i4, i5, this.f55536k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r16.f55546u == com.bytedance.tux.widget.spring.EnumC23427e.ALWAYS) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44066a(android.view.View r17, int r18, int r19, int r20, int r21, int r22, int[] r23) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.spring.SpringLayout.m44066a(android.view.View, int, int, int, int, int, int[]):void");
    }
}
