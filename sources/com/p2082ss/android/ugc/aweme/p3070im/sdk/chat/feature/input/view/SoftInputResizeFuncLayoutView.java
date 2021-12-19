package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23154c;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54234c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55189ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55216l;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView */
public class SoftInputResizeFuncLayoutView extends C54231a implements AbstractC54234c {

    /* renamed from: d */
    protected AbstractC54234c.AbstractC54235a f124239d;

    /* renamed from: e */
    private View f124240e;

    /* renamed from: f */
    private EditText f124241f;

    /* renamed from: g */
    private boolean f124242g;

    /* renamed from: h */
    private boolean f124243h;

    /* renamed from: i */
    private int f124244i;

    /* renamed from: j */
    private boolean f124245j;

    static {
        Covode.recordClassIndex(63919);
    }

    /* renamed from: c */
    public final void mo91313c() {
        mo91312a(-2);
    }

    public int getSoftKeyboardHeight() {
        return C54236d.m99493a(0);
    }

    private int getCurrentHeight() {
        if (this.f124243h) {
            return C54236d.m99493a(this.f124244i);
        }
        return this.f124244i;
    }

    public int getPanelHeight() {
        if (!mo91326a()) {
            return 0;
        }
        if (this.f124245j) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ boolean mo91314d() {
        boolean z = false;
        if (this.f124242g) {
            return false;
        }
        Rect rect = new Rect();
        Activity a = C23154c.m43640a(getContext());
        if (a == null) {
            return false;
        }
        View view = this.f124240e;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int f = C34723i.m70933f(a);
        int a2 = C55189ai.m100894a(a);
        int b = C34723i.m70927b();
        int i = ((f - rect.bottom) - a2) + b;
        if (i >= (((f - a2) - b) / 10) * 3) {
            z = true;
        }
        if (this.f124245j != z) {
            this.f124245j = z;
            getLocationInWindow(new int[2]);
            if (z) {
                if (i > 0) {
                    C54236d.f124249a = i;
                }
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int currentHeight = getCurrentHeight();
                if (layoutParams.height != currentHeight) {
                    layoutParams.height = currentHeight;
                    setLayoutParams(layoutParams);
                }
                this.f124246a = -2;
                if (this.f124247b != null) {
                    this.f124247b.mo91202a(this.f124246a, null);
                }
            } else if (this.f124246a == -2) {
                mo91312a(-1);
            }
        }
        return z;
    }

    public void setDefaultPanelHeight(int i) {
        this.f124244i = i;
    }

    public void setEditText(EditText editText) {
        this.f124241f = editText;
    }

    public void setForceHide(boolean z) {
        this.f124242g = z;
    }

    public void setOnKeyBordChangedListener(AbstractC54234c.AbstractC54235a aVar) {
        this.f124239d = aVar;
    }

    public void setOuterView(View view) {
        this.f124240e = view;
    }

    public void setResizable(boolean z) {
        this.f124243h = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.C54231a
    /* renamed from: a */
    public final void mo91312a(int i) {
        if (this.f124246a != i) {
            Activity a = C23154c.m43640a(getContext());
            if (i == -1) {
                setVisibility(8);
                C55216l.m100963a(a, this.f124241f);
                this.f124246a = i;
                if (this.f124247b != null) {
                    this.f124247b.mo91202a(i, null);
                }
            } else if (i == -2) {
                this.f124241f.requestFocus();
                EditText editText = this.f124241f;
                if (editText != null) {
                    Context context = editText.getContext();
                    C89219l.m154716b(context, "");
                    InputMethodManager a2 = C55216l.m100961a(context);
                    if (a2 != null && !a2.showSoftInput(editText, 0)) {
                        editText.postDelayed(new C55216l.RunnableC55217a(a2, editText), 100);
                    }
                }
                this.f124246a = i;
                if (this.f124247b != null) {
                    this.f124247b.mo91202a(i, null);
                }
            } else {
                View view = (View) this.f124248c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f124248c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f124248c.keyAt(i2);
                        if (keyAt != i) {
                            ((View) this.f124248c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f124246a = i;
                    if (this.f124247b != null) {
                        this.f124247b.mo91202a(i, view);
                    }
                    C55216l.m100963a(a, this.f124241f);
                }
            }
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCurrentHeight(), 1073741824));
    }

    private SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f124243h = true;
        this.f124244i = getResources().getDimensionPixelSize(R.dimen.mo);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC54237e(this));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
