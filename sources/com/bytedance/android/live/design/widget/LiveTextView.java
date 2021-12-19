package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.emoji.widget.C0915g;
import com.bytedance.android.live.design.C4052a;
import com.bytedance.android.live.design.widget.p235b.C4127e;
import com.bytedance.covode.number.Covode;

public class LiveTextView extends AppCompatTextView {

    /* renamed from: a */
    private static final boolean f11515a = C4052a.C4053a.f11190a.mo9495a();

    /* renamed from: b */
    private static final boolean f11516b = C4052a.C4053a.f11190a.f11188b;

    /* renamed from: c */
    private C0915g f11517c;

    /* renamed from: e */
    private C4120a f11518e;

    /* renamed from: f */
    private boolean f11519f;

    /* renamed from: g */
    private C4127e f11520g;

    private C0915g getEmojiTextViewHelper() {
        if (this.f11517c == null) {
            this.f11517c = new C0915g(this);
        }
        return this.f11517c;
    }

    private C4120a getInputFilterHelper() {
        if (this.f11518e == null) {
            this.f11518e = new C4120a(this);
        }
        return this.f11518e;
    }

    private C4127e getTextStyleableHelper() {
        if (this.f11520g == null) {
            this.f11520g = new C4127e(this);
        }
        return this.f11520g;
    }

    static {
        Covode.recordClassIndex(4678);
    }

    /* renamed from: a */
    public final void mo9623a(int i) {
        getTextStyleableHelper().mo9634b(i);
    }

    public LiveTextView(Context context) {
        super(context);
        mo9523a(null, 0);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (f11515a) {
            getEmojiTextViewHelper().mo3224a(z);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        if (f11516b) {
            C4120a inputFilterHelper = getInputFilterHelper();
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    int length2 = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
                    inputFilterArr2[length2] = inputFilterHelper.f11521a;
                    inputFilterArr = inputFilterArr2;
                    break;
                } else if (inputFilterArr[i] instanceof C4129d) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (f11515a) {
            super.setFilters(getEmojiTextViewHelper().mo3225a(inputFilterArr));
        } else {
            super.setFilters(inputFilterArr);
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo9523a(attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        getTextStyleableHelper().mo9633a(i);
    }

    /* renamed from: a */
    public void mo9523a(AttributeSet attributeSet, int i) {
        if (!this.f11519f) {
            this.f11519f = true;
            getTextStyleableHelper().mo9537a(attributeSet, i, 0);
            if (f11515a) {
                getEmojiTextViewHelper().f3274a.mo3226a();
            }
        }
    }

    public LiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        mo9523a(attributeSet, 0);
    }
}
