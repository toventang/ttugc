package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton */
public final class LoadingButton extends FrameLayout {

    /* renamed from: a */
    public static final C32981a f78479a = new C32981a((byte) 0);

    /* renamed from: b */
    private LoadingCircleView f78480b;

    /* renamed from: c */
    private TextView f78481c;

    /* renamed from: d */
    private String f78482d;

    /* renamed from: e */
    private boolean f78483e;

    static {
        Covode.recordClassIndex(39780);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingButton$a */
    public static final class C32981a {
        static {
            Covode.recordClassIndex(39781);
        }

        private C32981a() {
        }

        public /* synthetic */ C32981a(byte b) {
            this();
        }
    }

    public final boolean getDisableWhileLoading() {
        return this.f78483e;
    }

    /* renamed from: a */
    private void m67610a() {
        if (this.f78480b.getVisibility() != 0) {
            this.f78480b.setVisibility(0);
        }
        this.f78480b.mo58783a();
    }

    /* renamed from: b */
    private void m67611b() {
        if (this.f78480b.getVisibility() != 8) {
            this.f78480b.setVisibility(8);
        }
        this.f78480b.mo58784b();
    }

    public final void setDisableWhileLoading(boolean z) {
        this.f78483e = z;
    }

    /* renamed from: a */
    public final void mo58776a(boolean z) {
        this.f78483e = z;
        setEnabled(!z);
        m67610a();
        setText("");
    }

    /* renamed from: b */
    public final void mo58777b(boolean z) {
        this.f78483e = false;
        setEnabled(z);
        m67611b();
        setText(this.f78482d);
    }

    public final void setButtonText(String str) {
        C89219l.m154721d(str, "");
        this.f78482d = str;
        this.f78481c.setText(str);
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.f78481c.setText(str);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z || this.f78483e) {
            this.f78481c.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
            this.f78481c.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.ig));
        } else {
            this.f78481c.setTextColor(C0643b.m2378c(getContext(), R.color.bz));
            this.f78481c.setBackground(C0643b.m2369a(getContext(), (int) R.drawable.kt));
        }
        this.f78481c.setEnabled(z);
    }

    private /* synthetic */ LoadingButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LoadingButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9784);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16842964, 16843087, R.attr.a3h, R.attr.a3j, R.attr.a3k, R.attr.a3m});
        C89219l.m154716b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(4, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, C34728n.m70946a(20.0d));
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(5, C34728n.m70946a(3.0d));
        int color2 = obtainStyledAttributes.getColor(1, -16777216);
        String string = obtainStyledAttributes.getString(3);
        this.f78482d = string == null ? "" : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.gu, this);
        if (drawable != null) {
            setBackground(drawable);
        }
        View findViewById = findViewById(R.id.cfg);
        C89219l.m154716b(findViewById, "");
        this.f78480b = (LoadingCircleView) findViewById;
        View findViewById2 = findViewById(R.id.cfh);
        C89219l.m154716b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f78481c = textView;
        textView.setText(this.f78482d);
        this.f78481c.setTextColor(color2);
        ViewGroup.LayoutParams layoutParams = this.f78480b.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimensionPixelSize;
            layoutParams2.width = dimensionPixelSize;
            this.f78480b.setLayoutParams(layoutParams2);
            this.f78480b.setLoadingColor(color);
            this.f78480b.setLineWidth(dimensionPixelSize2);
            if (dimensionPixelSize3 != -1) {
                this.f78481c.setTextSize(0, (float) dimensionPixelSize3);
            }
            setEnabled(false);
            C17235c.m31810a(this, 0.5f);
            MethodCollector.m26664o(9784);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        MethodCollector.m26664o(9784);
        throw nullPointerException;
    }
}
