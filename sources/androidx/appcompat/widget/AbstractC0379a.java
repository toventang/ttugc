package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.AbstractC0750aa;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
public abstract class AbstractC0379a extends ViewGroup {

    /* renamed from: a */
    protected final C0380a f1458a;

    /* renamed from: b */
    protected final Context f1459b;

    /* renamed from: c */
    protected ActionMenuView f1460c;

    /* renamed from: d */
    protected ActionMenuPresenter f1461d;

    /* renamed from: e */
    protected int f1462e;

    /* renamed from: f */
    protected C0807z f1463f;

    /* renamed from: g */
    private boolean f1464g;

    /* renamed from: h */
    private boolean f1465h;

    static {
        Covode.recordClassIndex(444);
    }

    /* renamed from: a */
    protected static int m1394a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getContentHeight() {
        return this.f1462e;
    }

    public int getAnimatedVisibility() {
        if (this.f1463f != null) {
            return this.f1458a.f1466a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public boolean mo1202a() {
        ActionMenuPresenter actionMenuPresenter = this.f1461d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1278e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0380a implements AbstractC0750aa {

        /* renamed from: a */
        int f1466a;

        /* renamed from: c */
        private boolean f1468c;

        static {
            Covode.recordClassIndex(445);
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: c */
        public final void mo1705c(View view) {
            this.f1468c = true;
        }

        protected C0380a() {
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: a */
        public final void mo557a(View view) {
            AbstractC0379a.super.setVisibility(0);
            this.f1468c = false;
        }

        @Override // androidx.core.p037h.AbstractC0750aa
        /* renamed from: b */
        public final void mo558b(View view) {
            if (!this.f1468c) {
                AbstractC0379a.this.f1463f = null;
                AbstractC0379a.super.setVisibility(this.f1466a);
            }
        }

        /* renamed from: a */
        public final C0380a mo1704a(C0807z zVar, int i) {
            AbstractC0379a.this.f1463f = zVar;
            this.f1466a = i;
            return this;
        }
    }

    public void setContentHeight(int i) {
        this.f1462e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0807z zVar = this.f1463f;
            if (zVar != null) {
                zVar.mo2939b();
            }
            super.setVisibility(i);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1465h = false;
        }
        if (!this.f1465h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.f1465h = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1465h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1464g = false;
        }
        if (!this.f1464g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.f1464g = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1464g = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.ja, R.attr.jd, R.attr.je, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.qr, R.attr.re, R.attr.rg, R.attr.sf, R.attr.v_, R.attr.vg, R.attr.vq, R.attr.vr, R.attr.vu, R.attr.wm, R.attr.y1, R.attr.a3p, R.attr.a67, R.attr.a7j, R.attr.a7v, R.attr.a7w, R.attr.afv, R.attr.afy, R.attr.aiw, R.attr.aj9}, R.attr.h0, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1461d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1276c();
        }
    }

    AbstractC0379a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C0807z mo1200a(int i, long j) {
        C0807z zVar = this.f1463f;
        if (zVar != null) {
            zVar.mo2939b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0807z a = C0792v.m2776j(this).mo2931a(1.0f);
            a.mo2932a(j);
            a.mo2934a(this.f1458a.mo1704a(a, i));
            return a;
        }
        C0807z a2 = C0792v.m2776j(this).mo2931a(0.0f);
        a2.mo2932a(j);
        a2.mo2934a(this.f1458a.mo1704a(a2, i));
        return a2;
    }

    /* renamed from: a */
    protected static int m1395a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    AbstractC0379a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1458a = new C0380a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.gx, typedValue, true) || typedValue.resourceId == 0) {
            this.f1459b = context;
        } else {
            this.f1459b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m1396a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }
}
