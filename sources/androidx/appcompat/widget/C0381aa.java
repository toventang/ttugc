package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0324s;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0822g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.aa */
public class C0381aa implements AbstractC0324s {

    /* renamed from: a */
    private static Method f1469a;

    /* renamed from: b */
    private static Method f1470b;

    /* renamed from: c */
    private static Method f1471c;

    /* renamed from: A */
    private boolean f1472A;

    /* renamed from: B */
    private boolean f1473B;

    /* renamed from: C */
    private boolean f1474C;

    /* renamed from: D */
    private View f1475D;

    /* renamed from: E */
    private DataSetObserver f1476E;

    /* renamed from: F */
    private final View$OnTouchListenerC0388d f1477F;

    /* renamed from: G */
    private final C0387c f1478G;

    /* renamed from: H */
    private final RunnableC0385a f1479H;

    /* renamed from: I */
    private Runnable f1480I;

    /* renamed from: J */
    private final Rect f1481J;

    /* renamed from: d */
    private Context f1482d;

    /* renamed from: e */
    public C0456x f1483e;

    /* renamed from: f */
    public int f1484f;

    /* renamed from: g */
    public int f1485g;

    /* renamed from: h */
    public int f1486h;

    /* renamed from: i */
    public int f1487i;

    /* renamed from: j */
    public int f1488j;

    /* renamed from: k */
    public boolean f1489k;

    /* renamed from: l */
    public boolean f1490l;

    /* renamed from: m */
    public int f1491m;

    /* renamed from: n */
    public int f1492n;

    /* renamed from: o */
    public View f1493o;

    /* renamed from: p */
    public Drawable f1494p;

    /* renamed from: q */
    public AdapterView.OnItemClickListener f1495q;

    /* renamed from: r */
    public AdapterView.OnItemSelectedListener f1496r;

    /* renamed from: s */
    final RunnableC0389e f1497s;

    /* renamed from: t */
    final Handler f1498t;

    /* renamed from: u */
    public Rect f1499u;

    /* renamed from: v */
    public boolean f1500v;

    /* renamed from: w */
    public PopupWindow f1501w;

    /* renamed from: x */
    private ListAdapter f1502x;

    /* renamed from: y */
    private int f1503y;

    /* renamed from: z */
    private boolean f1504z;

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: g */
    public final ListView mo921g() {
        return this.f1483e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.aa$a */
    public class RunnableC0385a implements Runnable {
        static {
            Covode.recordClassIndex(450);
        }

        public final void run() {
            C0381aa.this.mo1716i();
        }

        RunnableC0385a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.aa$b */
    public class C0386b extends DataSetObserver {
        static {
            Covode.recordClassIndex(451);
        }

        public final void onInvalidated() {
            C0381aa.this.mo918d();
        }

        public final void onChanged() {
            if (C0381aa.this.f1501w.isShowing()) {
                C0381aa.this.mo915c();
            }
        }

        C0386b() {
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: e */
    public final boolean mo919e() {
        return this.f1501w.isShowing();
    }

    /* renamed from: h */
    public final void mo1715h() {
        this.f1501w.setInputMethodMode(2);
    }

    /* renamed from: k */
    public final void mo1718k() {
        this.f1474C = true;
        this.f1473B = true;
    }

    /* renamed from: b */
    public final void mo1711b() {
        this.f1500v = true;
        this.f1501w.setFocusable(true);
    }

    /* renamed from: f */
    public final int mo1714f() {
        if (!this.f1504z) {
            return 0;
        }
        return this.f1503y;
    }

    /* renamed from: i */
    public final void mo1716i() {
        C0456x xVar = this.f1483e;
        if (xVar != null) {
            xVar.setListSelectionHidden(true);
            xVar.requestLayout();
        }
    }

    /* renamed from: j */
    public final boolean mo1717j() {
        if (this.f1501w.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void mo1729a() {
        View view = this.f1475D;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1475D);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: d */
    public final void mo918d() {
        this.f1501w.dismiss();
        mo1729a();
        this.f1501w.setContentView(null);
        this.f1483e = null;
        this.f1498t.removeCallbacks(this.f1497s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.aa$e */
    public class RunnableC0389e implements Runnable {
        static {
            Covode.recordClassIndex(454);
        }

        public final void run() {
            if (C0381aa.this.f1483e != null && C0792v.m2791y(C0381aa.this.f1483e) && C0381aa.this.f1483e.getCount() > C0381aa.this.f1483e.getChildCount() && C0381aa.this.f1483e.getChildCount() <= C0381aa.this.f1491m) {
                C0381aa.this.f1501w.setInputMethodMode(2);
                C0381aa.this.mo915c();
            }
        }

        RunnableC0389e() {
        }
    }

    static {
        Covode.recordClassIndex(446);
        try {
            f1469a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            f1470b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f1471c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.AbstractC0324s
    /* renamed from: c */
    public void mo915c() {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        boolean z3 = true;
        if (this.f1483e == null) {
            Context context = this.f1482d;
            this.f1480I = new Runnable() {
                /* class androidx.appcompat.widget.C0381aa.RunnableC03832 */

                static {
                    Covode.recordClassIndex(448);
                }

                public final void run() {
                    View view = C0381aa.this.f1493o;
                    if (view != null && view.getWindowToken() != null) {
                        C0381aa.this.mo915c();
                    }
                }
            };
            C0456x a = mo1706a(context, !this.f1500v);
            this.f1483e = a;
            Drawable drawable = this.f1494p;
            if (drawable != null) {
                a.setSelector(drawable);
            }
            this.f1483e.setAdapter(this.f1502x);
            this.f1483e.setOnItemClickListener(this.f1495q);
            this.f1483e.setFocusable(true);
            this.f1483e.setFocusableInTouchMode(true);
            this.f1483e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class androidx.appcompat.widget.C0381aa.C03843 */

                static {
                    Covode.recordClassIndex(449);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C0456x xVar;
                    if (i != -1 && (xVar = C0381aa.this.f1483e) != null) {
                        xVar.setListSelectionHidden(false);
                    }
                }
            });
            this.f1483e.setOnScrollListener(this.f1478G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1496r;
            if (onItemSelectedListener != null) {
                this.f1483e.setOnItemSelectedListener(onItemSelectedListener);
            }
            C0456x xVar = this.f1483e;
            View view = this.f1475D;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i7 = this.f1492n;
                if (i7 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(xVar, layoutParams);
                } else if (i7 == 1) {
                    linearLayout.addView(xVar, layoutParams);
                    linearLayout.addView(view);
                }
                int i8 = this.f1485g;
                if (i8 >= 0) {
                    i6 = Integer.MIN_VALUE;
                } else {
                    i8 = 0;
                    i6 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, i6), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                xVar = linearLayout;
            } else {
                i = 0;
            }
            this.f1501w.setContentView(xVar);
        } else {
            this.f1501w.getContentView();
            View view2 = this.f1475D;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1501w.getBackground();
        if (background != null) {
            background.getPadding(this.f1481J);
            i2 = this.f1481J.top + this.f1481J.bottom;
            if (!this.f1504z) {
                this.f1503y = -this.f1481J.top;
            }
        } else {
            this.f1481J.setEmpty();
            i2 = 0;
        }
        if (this.f1501w.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a2 = m1405a(this.f1493o, this.f1503y, z);
        if (this.f1489k || this.f1484f == -1) {
            i3 = a2 + i2;
        } else {
            int i9 = this.f1485g;
            if (i9 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1482d.getResources().getDisplayMetrics().widthPixels - (this.f1481J.left + this.f1481J.right), Integer.MIN_VALUE);
            } else if (i9 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1482d.getResources().getDisplayMetrics().widthPixels - (this.f1481J.left + this.f1481J.right), 1073741824);
            }
            int a3 = this.f1483e.mo1731a(makeMeasureSpec, 0, -1, a2 - i, -1);
            if (a3 > 0) {
                i += i2 + this.f1483e.getPaddingTop() + this.f1483e.getPaddingBottom();
            }
            i3 = a3 + i;
        }
        boolean j = mo1717j();
        C0822g.m2900a(this.f1501w, this.f1487i);
        if (!this.f1501w.isShowing()) {
            int i10 = this.f1485g;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = this.f1493o.getWidth();
            }
            int i11 = this.f1484f;
            if (i11 == -1) {
                i3 = -1;
            } else if (i11 != -2) {
                i3 = i11;
            }
            this.f1501w.setWidth(i10);
            this.f1501w.setHeight(i3);
            Method method = f1469a;
            if (method != null) {
                try {
                    method.invoke(this.f1501w, true);
                } catch (Exception unused) {
                }
            }
            PopupWindow popupWindow = this.f1501w;
            if (this.f1490l || this.f1489k) {
                z2 = false;
            } else {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            this.f1501w.setTouchInterceptor(this.f1477F);
            if (this.f1474C) {
                C0822g.m2902a(this.f1501w, this.f1473B);
            }
            Method method2 = f1471c;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1501w, this.f1499u);
                } catch (Exception unused2) {
                }
            }
            C0822g.m2901a(this.f1501w, this.f1493o, this.f1486h, this.f1503y, this.f1488j);
            this.f1483e.setSelection(-1);
            if (!this.f1500v || this.f1483e.isInTouchMode()) {
                mo1716i();
            }
            if (!this.f1500v) {
                this.f1498t.post(this.f1479H);
            }
        } else if (C0792v.m2791y(this.f1493o)) {
            int i12 = this.f1485g;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.f1493o.getWidth();
            }
            int i13 = this.f1484f;
            if (i13 == -1) {
                if (j) {
                    PopupWindow popupWindow2 = this.f1501w;
                    if (this.f1485g == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    popupWindow2.setWidth(i5);
                    this.f1501w.setHeight(0);
                } else {
                    i3 = -1;
                    PopupWindow popupWindow3 = this.f1501w;
                    if (this.f1485g == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow3.setWidth(i4);
                    this.f1501w.setHeight(-1);
                }
            } else if (i13 != -2) {
                i3 = i13;
            }
            PopupWindow popupWindow4 = this.f1501w;
            if (this.f1490l || this.f1489k) {
                z3 = false;
            }
            popupWindow4.setOutsideTouchable(z3);
            PopupWindow popupWindow5 = this.f1501w;
            View view3 = this.f1493o;
            int i14 = this.f1486h;
            int i15 = this.f1503y;
            if (i12 < 0) {
                i12 = -1;
            }
            if (i3 < 0) {
                i3 = -1;
            }
            popupWindow5.update(view3, i14, i15, i12, i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.aa$c */
    public class C0387c implements AbsListView.OnScrollListener {
        static {
            Covode.recordClassIndex(452);
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C0387c() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0381aa.this.mo1717j() && C0381aa.this.f1501w.getContentView() != null) {
                C0381aa.this.f1498t.removeCallbacks(C0381aa.this.f1497s);
                C0381aa.this.f1497s.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.aa$d */
    public class View$OnTouchListenerC0388d implements View.OnTouchListener {
        static {
            Covode.recordClassIndex(453);
        }

        View$OnTouchListenerC0388d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                if (C0381aa.this.f1501w == null || !C0381aa.this.f1501w.isShowing() || x < 0 || x >= C0381aa.this.f1501w.getWidth() || y < 0 || y >= C0381aa.this.f1501w.getHeight()) {
                    return false;
                }
                C0381aa.this.f1498t.postDelayed(C0381aa.this.f1497s, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0381aa.this.f1498t.removeCallbacks(C0381aa.this.f1497s);
                return false;
            }
        }
    }

    public C0381aa(Context context) {
        this(context, null, R.attr.a2r);
    }

    /* renamed from: a */
    public final void mo1707a(int i) {
        this.f1503y = i;
        this.f1504z = true;
    }

    /* renamed from: b */
    public final void mo1712b(int i) {
        Drawable background = this.f1501w.getBackground();
        if (background != null) {
            background.getPadding(this.f1481J);
            this.f1485g = this.f1481J.left + this.f1481J.right + i;
            return;
        }
        this.f1485g = i;
    }

    /* renamed from: c */
    public final void mo1713c(int i) {
        C0456x xVar = this.f1483e;
        if (this.f1501w.isShowing() && xVar != null) {
            xVar.setListSelectionHidden(false);
            xVar.setSelection(i);
            if (xVar.getChoiceMode() != 0) {
                xVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo1708a(Drawable drawable) {
        this.f1501w.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1709a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1476E;
        if (dataSetObserver == null) {
            this.f1476E = new C0386b();
        } else {
            ListAdapter listAdapter2 = this.f1502x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1502x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1476E);
        }
        C0456x xVar = this.f1483e;
        if (xVar != null) {
            xVar.setAdapter(this.f1502x);
        }
    }

    /* renamed from: a */
    public final void mo1710a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1501w.setOnDismissListener(onDismissListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0456x mo1706a(Context context, boolean z) {
        return new C0456x(context, z);
    }

    public C0381aa(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private int m1405a(View view, int i, boolean z) {
        Method method = f1470b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1501w, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f1501w.getMaxAvailableHeight(view, i);
    }

    public C0381aa(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1484f = -2;
        this.f1485g = -2;
        this.f1487i = 1002;
        this.f1472A = true;
        this.f1491m = Integer.MAX_VALUE;
        this.f1497s = new RunnableC0389e();
        this.f1477F = new View$OnTouchListenerC0388d();
        this.f1478G = new C0387c();
        this.f1479H = new RunnableC0385a();
        this.f1481J = new Rect();
        this.f1482d = context;
        this.f1498t = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843436, 16843437}, i, i2);
        this.f1486h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1503y = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1504z = true;
        }
        obtainStyledAttributes.recycle();
        C0437l lVar = new C0437l(context, attributeSet, i, i2);
        this.f1501w = lVar;
        lVar.setInputMethodMode(1);
    }
}
