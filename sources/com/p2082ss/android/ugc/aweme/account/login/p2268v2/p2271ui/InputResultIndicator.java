package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator */
public final class InputResultIndicator extends LinearLayout {

    /* renamed from: d */
    public static final C32602a f77764d = new C32602a((byte) 0);

    /* renamed from: a */
    public View f77765a;

    /* renamed from: b */
    public View f77766b;

    /* renamed from: c */
    public int f77767c;

    /* renamed from: e */
    private ImageView f77768e;

    /* renamed from: f */
    private TextView f77769f;

    /* renamed from: g */
    private int f77770g;

    /* renamed from: h */
    private int f77771h;

    /* renamed from: i */
    private int f77772i;

    /* renamed from: j */
    private int f77773j;

    /* renamed from: k */
    private boolean f77774k;

    /* renamed from: l */
    private int f77775l;

    /* renamed from: m */
    private int f77776m;

    static {
        Covode.recordClassIndex(39376);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator$a */
    public static final class C32602a {
        static {
            Covode.recordClassIndex(39377);
        }

        private C32602a() {
        }

        public /* synthetic */ C32602a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo58481a() {
        this.f77765a.setBackgroundColor(this.f77771h);
        this.f77766b.setVisibility(8);
    }

    /* renamed from: a */
    private final boolean m67093a(int i) {
        try {
            return C89219l.m154714a((Object) getResources().getResourceTypeName(i), (Object) "drawable");
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo58482a(String str) {
        C89219l.m154721d(str, "");
        m67092a(str, this.f77774k);
    }

    /* renamed from: a */
    public final void mo58483a(boolean z) {
        int i;
        this.f77765a.setVisibility(0);
        View view = this.f77765a;
        if (z) {
            i = this.f77771h;
        } else {
            i = this.f77767c;
        }
        view.setBackgroundColor(i);
        this.f77766b.setVisibility(8);
    }

    /* renamed from: a */
    private void m67092a(String str, boolean z) {
        C89219l.m154721d(str, "");
        if (m67093a(0)) {
            this.f77768e.setImageResource(0);
        }
        if (z) {
            this.f77765a.setVisibility(0);
            this.f77765a.setBackgroundColor(this.f77767c);
        } else {
            this.f77765a.setVisibility(8);
        }
        this.f77766b.setVisibility(0);
        this.f77769f.setText(str);
    }

    private /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputResultIndicator(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        MethodCollector.m26663i(10897);
        this.f77774k = true;
        this.f77775l = -1;
        this.f77776m = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, R.attr.rn, R.attr.ro, R.attr.rq, R.attr.a4v, R.attr.a9n, R.attr.a9o, R.attr.ac0});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f77770g = obtainStyledAttributes.getDimensionPixelSize(1, C34728n.m70946a(0.5d));
        this.f77771h = obtainStyledAttributes.getColor(2, C0643b.m2378c(context, R.color.b0));
        this.f77767c = obtainStyledAttributes.getColor(3, C0643b.m2378c(context, R.color.im));
        this.f77772i = obtainStyledAttributes.getColor(6, C0643b.m2378c(context, R.color.im));
        this.f77773j = obtainStyledAttributes.getResourceId(5, 2131231114);
        this.f77774k = obtainStyledAttributes.getBoolean(7, true);
        this.f77775l = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        this.f77776m = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        View.inflate(context, R.layout.h6, this);
        View findViewById = findViewById(R.id.dja);
        C89219l.m154716b(findViewById, "");
        this.f77765a = findViewById;
        View findViewById2 = findViewById(R.id.dj9);
        C89219l.m154716b(findViewById2, "");
        this.f77766b = findViewById2;
        View findViewById3 = findViewById(R.id.dj_);
        C89219l.m154716b(findViewById3, "");
        this.f77768e = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.djb);
        C89219l.m154716b(findViewById4, "");
        this.f77769f = (TextView) findViewById4;
        if (this.f77775l != -1) {
            ViewGroup.LayoutParams layoutParams = this.f77766b.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f77775l;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(10897);
                throw nullPointerException;
            }
        }
        int i2 = this.f77776m;
        if (i2 != -1) {
            this.f77769f.setTextSize(0, (float) i2);
        }
        View view = this.f77765a;
        int i3 = this.f77770g;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = i3;
            view.setLayoutParams(layoutParams2);
        }
        if (m67093a(this.f77773j)) {
            this.f77768e.setImageResource(this.f77773j);
        }
        this.f77769f.setTextColor(this.f77772i);
        this.f77765a.setVisibility(!this.f77774k ? 8 : i);
        mo58481a();
        MethodCollector.m26664o(10897);
    }
}
