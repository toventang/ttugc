package com.p2082ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1719f.p1720a.C23126b;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectTextView */
public class SearchCorrectTextView extends AppCompatTextView {

    /* renamed from: a */
    private String f100301a = "";

    /* renamed from: b */
    private String f100302b = "";

    /* renamed from: c */
    private int f100303c = -1;

    /* renamed from: e */
    private boolean f100304e;

    static {
        Covode.recordClassIndex(51175);
    }

    /* renamed from: a */
    private void m85855a() {
        if (getLayout().getEllipsisCount(getLineCount() - 1) > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(this.f100302b, getPaint(), (float) ((int) (((float) getMeasuredWidth()) - getPaint().measureText(this.f100301a))), TextUtils.TruncateAt.END);
            m85856a(C1764a.m5928a(this.f100301a, new Object[]{String.valueOf(ellipsize)}), String.valueOf(ellipsize));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f100304e = true;
        try {
            m85855a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SearchCorrectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: a */
    private void m85856a(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.f100303c != -1) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f100303c), indexOf, length, 33);
            spannableStringBuilder.setSpan(new C23126b(42, true), indexOf, length, 33);
        }
        setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public final void mo73223a(int i, String str, int i2) {
        this.f100301a = getResources().getString(i);
        this.f100302b = str;
        this.f100303c = i2;
        m85856a(getResources().getString(i, String.valueOf(str)), str);
        if (this.f100304e) {
            m85855a();
        }
    }
}
