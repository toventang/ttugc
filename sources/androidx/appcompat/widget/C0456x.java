package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.p019b.p020a.C0268c;
import androidx.core.p037h.C0807z;
import androidx.core.widget.C0821f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.x */
public class C0456x extends ListView {

    /* renamed from: a */
    public boolean f1759a;

    /* renamed from: b */
    RunnableC0458b f1760b;

    /* renamed from: c */
    private final Rect f1761c = new Rect();

    /* renamed from: d */
    private int f1762d = 0;

    /* renamed from: e */
    private int f1763e = 0;

    /* renamed from: f */
    private int f1764f = 0;

    /* renamed from: g */
    private int f1765g = 0;

    /* renamed from: h */
    private int f1766h;

    /* renamed from: i */
    private Field f1767i;

    /* renamed from: j */
    private C0457a f1768j;

    /* renamed from: k */
    private boolean f1769k;

    /* renamed from: l */
    private boolean f1770l;

    /* renamed from: m */
    private C0807z f1771m;

    /* renamed from: n */
    private C0821f f1772n;

    static {
        Covode.recordClassIndex(521);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1760b = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.x$b */
    public class RunnableC0458b implements Runnable {
        static {
            Covode.recordClassIndex(523);
        }

        public final void run() {
            C0456x.this.f1760b = null;
            C0456x.this.drawableStateChanged();
        }

        RunnableC0458b() {
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1760b == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m1699a();
        }
    }

    public boolean hasFocus() {
        if (this.f1770l || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f1770l || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f1770l || super.isFocused()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m1699a() {
        Drawable selector = getSelector();
        if (selector != null && this.f1759a && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public boolean isInTouchMode() {
        if ((!this.f1770l || !this.f1769k) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1769k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.x$a */
    public static class C0457a extends C0268c {

        /* renamed from: b */
        public boolean f1773b = true;

        static {
            Covode.recordClassIndex(522);
        }

        C0457a(Drawable drawable) {
            super(drawable);
        }

        @Override // androidx.appcompat.p019b.p020a.C0268c
        public final void draw(Canvas canvas) {
            if (this.f1773b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.p019b.p020a.C0268c
        public final boolean setState(int[] iArr) {
            if (this.f1773b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.p019b.p020a.C0268c
        public final void setHotspot(float f, float f2) {
            if (this.f1773b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.p019b.p020a.C0268c
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f1773b) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        @Override // androidx.appcompat.p019b.p020a.C0268c
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1773b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0457a aVar = this.f1768j;
        if (aVar != null) {
            aVar.f1773b = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1761c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1761c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1766h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0458b bVar = this.f1760b;
        if (bVar != null) {
            C0456x.this.f1760b = null;
            C0456x.this.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0457a aVar;
        if (drawable != null) {
            aVar = new C0457a(drawable);
        } else {
            aVar = null;
        }
        this.f1768j = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1762d = rect.left;
        this.f1763e = rect.top;
        this.f1764f = rect.right;
        this.f1765g = rect.bottom;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1760b == null) {
            RunnableC0458b bVar = new RunnableC0458b();
            this.f1760b = bVar;
            C0456x.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1699a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    C0456x(Context context, boolean z) {
        super(context, null, R.attr.s1);
        this.f1770l = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1767i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (1 == 0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r10 != 3) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1732a(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0456x.mo1732a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    public int mo1731a(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i9 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 < i4) {
                if (i5 >= 0 && i9 >= i5) {
                    i8 = i6;
                }
            } else if (i5 < 0 || i9 <= i5 || i8 <= 0 || i6 == i4) {
                return i4;
            } else {
                return i8;
            }
        }
        return i6;
    }
}
