package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.PdpSelectItemView */
public final class PdpSelectItemView extends ConstraintLayout {

    /* renamed from: g */
    private SparseArray f104966g;

    static {
        Covode.recordClassIndex(53417);
    }

    public PdpSelectItemView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public PdpSelectItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: b */
    private View m87682b(int i) {
        if (this.f104966g == null) {
            this.f104966g = new SparseArray();
        }
        View view = (View) this.f104966g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104966g.put(i, findViewById);
        return findViewById;
    }

    public final void setDescColor(int i) {
        ((TuxTextView) m87682b(R.id.duc)).setTextColor(i);
    }

    public final void setSubDescColor(int i) {
        ((TuxTextView) m87682b(R.id.due)).setTextColor(i);
    }

    public final void setSubDescFont(int i) {
        ((TuxTextView) m87682b(R.id.due)).setTuxFont(i);
    }

    public final void setBackIconVisibility(boolean z) {
        int i;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m87682b(R.id.po);
        C89219l.m154716b(autoRTLImageView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        autoRTLImageView.setVisibility(i);
    }

    public final void setTitle(int i) {
        TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.dui);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(getContext().getText(i));
    }

    public final void setDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.duc);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(4);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.duc);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.duc);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setVisibility(0);
    }

    public final void setSecondLineDescExtra(SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.dug);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.dug);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.dug);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(spannableStringBuilder);
    }

    public final void setSecondLineDescL1(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.duh);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.duh);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.duh);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    public final void setSecondLineDescL2(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.dud);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.dud);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.dud);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    public final void setSubDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.due);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.due);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.due);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setVisibility(0);
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.dui);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setDescLineThru(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.duc);
            C89219l.m154716b(tuxTextView, "");
            TextPaint paint = tuxTextView.getPaint();
            C89219l.m154716b(paint, "");
            TuxTextView tuxTextView2 = (TuxTextView) m87682b(R.id.duc);
            C89219l.m154716b(tuxTextView2, "");
            TextPaint paint2 = tuxTextView2.getPaint();
            C89219l.m154716b(paint2, "");
            paint.setFlags(paint2.getFlags() | 16);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) m87682b(R.id.duc);
        C89219l.m154716b(tuxTextView3, "");
        TextPaint paint3 = tuxTextView3.getPaint();
        C89219l.m154716b(paint3, "");
        TuxTextView tuxTextView4 = (TuxTextView) m87682b(R.id.duc);
        C89219l.m154716b(tuxTextView4, "");
        TextPaint paint4 = tuxTextView4.getPaint();
        C89219l.m154716b(paint4, "");
        paint3.setFlags(paint4.getFlags() & -17);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ PdpSelectItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PdpSelectItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.q2, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aiw});
        String string = obtainStyledAttributes.getString(0);
        if (string != null && string.length() > 0) {
            TuxTextView tuxTextView = (TuxTextView) m87682b(R.id.dui);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(string);
        }
        obtainStyledAttributes.recycle();
    }
}
