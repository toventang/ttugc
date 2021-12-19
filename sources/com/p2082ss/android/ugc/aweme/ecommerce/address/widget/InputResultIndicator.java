package com.p2082ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputResultIndicator */
public final class InputResultIndicator extends LinearLayout {

    /* renamed from: a */
    public static final C43573a f101583a = new C43573a((byte) 0);

    /* renamed from: b */
    private View f101584b;

    /* renamed from: c */
    private View f101585c;

    /* renamed from: d */
    private TextView f101586d;

    /* renamed from: e */
    private int f101587e;

    /* renamed from: f */
    private int f101588f;

    /* renamed from: g */
    private int f101589g;

    /* renamed from: h */
    private int f101590h;

    /* renamed from: i */
    private boolean f101591i;

    static {
        Covode.recordClassIndex(51813);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.InputResultIndicator$a */
    public static final class C43573a {
        static {
            Covode.recordClassIndex(51814);
        }

        private C43573a() {
        }

        public /* synthetic */ C43573a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo74039a() {
        this.f101584b.setBackgroundColor(this.f101588f);
        this.f101585c.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo74040a(String str) {
        C89219l.m154721d(str, "");
        boolean z = this.f101591i;
        C89219l.m154721d(str, "");
        if (z) {
            this.f101584b.setVisibility(0);
            this.f101584b.setBackgroundColor(this.f101589g);
        } else {
            this.f101584b.setVisibility(8);
        }
        if (str.length() > 0) {
            this.f101585c.setVisibility(0);
            this.f101586d.setText(str);
        }
    }

    private /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputResultIndicator(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        MethodCollector.m26663i(9901);
        this.f101591i = true;
        this.f101587e = C34728n.m70946a(0.5d);
        this.f101588f = C0643b.m2378c(context, R.color.b0);
        this.f101589g = C0643b.m2378c(context, R.color.bd);
        this.f101590h = C0643b.m2378c(context, R.color.bd);
        this.f101591i = true;
        View.inflate(context, R.layout.oo, this);
        View findViewById = findViewById(R.id.dja);
        C89219l.m154716b(findViewById, "");
        this.f101584b = findViewById;
        View findViewById2 = findViewById(R.id.dj9);
        C89219l.m154716b(findViewById2, "");
        this.f101585c = findViewById2;
        View findViewById3 = findViewById(R.id.djb);
        C89219l.m154716b(findViewById3, "");
        this.f101586d = (TextView) findViewById3;
        C45573n.m88123a(this.f101584b, this.f101587e);
        this.f101586d.setTextColor(this.f101590h);
        this.f101584b.setVisibility(!this.f101591i ? 8 : i);
        mo74039a();
        MethodCollector.m26664o(9901);
    }
}
