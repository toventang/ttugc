package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p037h.AbstractC0791u;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.r */
public class C0443r extends Spinner implements AbstractC0791u {

    /* renamed from: d */
    private static final int[] f1710d = {16843505};

    /* renamed from: a */
    C0446b f1711a;

    /* renamed from: b */
    int f1712b;

    /* renamed from: c */
    final Rect f1713c;

    /* renamed from: e */
    private final C0425e f1714e;

    /* renamed from: f */
    private final Context f1715f;

    /* renamed from: g */
    private AbstractView$OnAttachStateChangeListenerC0461z f1716g;

    /* renamed from: h */
    private SpinnerAdapter f1717h;

    /* renamed from: i */
    private final boolean f1718i;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.r$a */
    public static class C0445a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1721a;

        /* renamed from: b */
        private ListAdapter f1722b;

        static {
            Covode.recordClassIndex(510);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1722b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1722b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public C0445a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1721a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1722b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1721a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            eVar.mo1915d();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            return bVar.f1486h;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1711a != null) {
            return this.f1712b;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    public CharSequence getPrompt() {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            return bVar.f1723a;
        }
        return super.getPrompt();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            return eVar.mo1913b();
        }
        return null;
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            return eVar.mo1914c();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(508);
    }

    public int getDropDownVerticalOffset() {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            return bVar.mo1714f();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    public Drawable getPopupBackground() {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            return bVar.f1501w.getBackground();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        if (this.f1711a != null) {
            return this.f1715f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0446b bVar = this.f1711a;
        if (bVar != null && bVar.f1501w.isShowing()) {
            this.f1711a.mo918d();
        }
    }

    public boolean performClick() {
        C0446b bVar = this.f1711a;
        if (bVar == null) {
            return super.performClick();
        }
        if (bVar.f1501w.isShowing()) {
            return true;
        }
        this.f1711a.mo915c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.r$b */
    public class C0446b extends C0381aa {

        /* renamed from: a */
        public CharSequence f1723a;

        /* renamed from: b */
        ListAdapter f1724b;

        /* renamed from: c */
        final Rect f1725c = new Rect();

        static {
            Covode.recordClassIndex(511);
        }

        @Override // androidx.appcompat.widget.C0381aa, androidx.appcompat.view.menu.AbstractC0324s
        /* renamed from: c */
        public final void mo915c() {
            ViewTreeObserver viewTreeObserver;
            boolean e = mo919e();
            mo1729a();
            mo1715h();
            super.mo915c();
            this.f1483e.setChoiceMode(1);
            mo1713c(C0443r.this.getSelectedItemPosition());
            if (!e && (viewTreeObserver = C0443r.this.getViewTreeObserver()) != null) {
                final ViewTreeObserver$OnGlobalLayoutListenerC04482 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class androidx.appcompat.widget.C0443r.C0446b.ViewTreeObserver$OnGlobalLayoutListenerC04482 */

                    static {
                        Covode.recordClassIndex(513);
                    }

                    public final void onGlobalLayout() {
                        C0446b bVar = C0446b.this;
                        C0443r rVar = C0443r.this;
                        if (!C0792v.m2791y(rVar) || !rVar.getGlobalVisibleRect(bVar.f1725c)) {
                            C0446b.this.mo918d();
                            return;
                        }
                        C0446b.this.mo1729a();
                        C0446b.super.mo915c();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                mo1710a(new PopupWindow.OnDismissListener() {
                    /* class androidx.appcompat.widget.C0443r.C0446b.C04493 */

                    static {
                        Covode.recordClassIndex(514);
                    }

                    public final void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C0443r.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo1729a() {
            int i;
            Drawable background = this.f1501w.getBackground();
            int i2 = 0;
            if (background != null) {
                background.getPadding(C0443r.this.f1713c);
                if (C0415ar.m1540a(C0443r.this)) {
                    i2 = C0443r.this.f1713c.right;
                } else {
                    i2 = -C0443r.this.f1713c.left;
                }
            } else {
                Rect rect = C0443r.this.f1713c;
                C0443r.this.f1713c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0443r.this.getPaddingLeft();
            int paddingRight = C0443r.this.getPaddingRight();
            int width = C0443r.this.getWidth();
            if (C0443r.this.f1712b == -2) {
                int a = C0443r.this.mo1959a((SpinnerAdapter) this.f1724b, this.f1501w.getBackground());
                int i3 = (C0443r.this.getContext().getResources().getDisplayMetrics().widthPixels - C0443r.this.f1713c.left) - C0443r.this.f1713c.right;
                if (a > i3) {
                    a = i3;
                }
                mo1712b(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (C0443r.this.f1712b == -1) {
                mo1712b((width - paddingLeft) - paddingRight);
            } else {
                mo1712b(C0443r.this.f1712b);
            }
            if (C0415ar.m1540a(C0443r.this)) {
                i = i2 + ((width - paddingRight) - this.f1485g);
            } else {
                i = i2 + paddingLeft;
            }
            this.f1486h = i;
        }

        @Override // androidx.appcompat.widget.C0381aa
        /* renamed from: a */
        public final void mo1709a(ListAdapter listAdapter) {
            super.mo1709a(listAdapter);
            this.f1724b = listAdapter;
        }

        public C0446b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1493o = C0443r.this;
            mo1711b();
            this.f1492n = 0;
            this.f1495q = new AdapterView.OnItemClickListener(C0443r.this) {
                /* class androidx.appcompat.widget.C0443r.C0446b.C04471 */

                static {
                    Covode.recordClassIndex(512);
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C0443r.this.setSelection(i);
                    if (C0443r.this.getOnItemClickListener() != null) {
                        C0443r.this.performItemClick(view, i, C0446b.this.f1724b.getItemId(i));
                    }
                    C0446b.this.mo918d();
                }
            };
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            eVar.mo1910a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            eVar.mo1911a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            eVar.mo1908a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0425e eVar = this.f1714e;
        if (eVar != null) {
            eVar.mo1909a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            bVar.f1486h = i;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            bVar.mo1707a(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownVerticalOffset(i);
    }

    public void setDropDownWidth(int i) {
        if (this.f1711a != null) {
            this.f1712b = i;
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownWidth(i);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            bVar.mo1708a(drawable);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setPopupBackgroundDrawable(drawable);
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0196a.m619b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0446b bVar = this.f1711a;
        if (bVar != null) {
            bVar.f1723a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC0461z zVar = this.f1716g;
        if (zVar == null || !zVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1718i) {
            this.f1717h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1711a != null) {
            Context context = this.f1715f;
            if (context == null) {
                context = getContext();
            }
            this.f1711a.mo1709a(new C0445a(spinnerAdapter, context.getTheme()));
        }
    }

    public C0443r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ad1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1711a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1959a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo1959a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1713c);
        return i2 + this.f1713c.left + this.f1713c.right;
    }

    public C0443r(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private C0443r(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r2 == null) goto L_0x0058;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0443r(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0443r.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
