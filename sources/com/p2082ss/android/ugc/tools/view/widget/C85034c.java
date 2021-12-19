package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70632dd;
import com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.c */
public final class C85034c extends FrameLayout implements AbstractC84953a {

    /* renamed from: a */
    private int f190240a;

    /* renamed from: b */
    private ImageView f190241b;

    /* renamed from: c */
    private TextView f190242c;

    /* renamed from: d */
    private EnumC85050h f190243d;

    /* renamed from: e */
    private int f190244e;

    static {
        Covode.recordClassIndex(99055);
    }

    /* renamed from: a */
    private void m146193a() {
        if (this.f190243d == EnumC85050h.SOLID) {
            m146194b();
        } else {
            m146195c();
        }
    }

    /* renamed from: b */
    private void m146194b() {
        if (this.f190240a == 0) {
            setBackgroundResource(R.drawable.bna);
        } else {
            setBackgroundResource(R.drawable.bn_);
        }
        this.f190242c.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        if (this.f190244e != -1) {
            C70632dd.m124825a(getContext(), this.f190241b, this.f190244e, R.color.a9);
        }
    }

    /* renamed from: c */
    private void m146195c() {
        if (this.f190240a == 0) {
            setBackgroundResource(R.drawable.bnb);
            this.f190242c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            if (this.f190244e != -1) {
                C70632dd.m124825a(getContext(), this.f190241b, this.f190244e, R.color.bx);
                return;
            }
            return;
        }
        setBackgroundResource(R.drawable.bn8);
        this.f190242c.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
        if (this.f190244e != -1) {
            C70632dd.m124825a(getContext(), this.f190241b, this.f190244e, R.color.a_);
        }
    }

    public C85034c(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a
    /* renamed from: a */
    public final void mo129712a(int i) {
        if (this.f190240a != i) {
            this.f190240a = i;
            m146193a();
        }
    }

    private C85034c(Context context, byte b) {
        this(context, (char) 0);
    }

    private C85034c(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(1060);
        this.f190240a = C63244g.m114602a().mo73259E().mo93881a();
        this.f190243d = EnumC85050h.SOLID;
        this.f190244e = -1;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3m, this, true);
        this.f190241b = (ImageView) a.findViewById(R.id.bwm);
        this.f190242c = (TextView) a.findViewById(R.id.f5s);
        m146193a();
        MethodCollector.m26664o(1060);
    }

    /* renamed from: a */
    public final void mo129963a(EnumC85050h hVar, int i, String str) {
        this.f190244e = i;
        if (hVar == EnumC85050h.BORDER) {
            m146195c();
        } else {
            m146194b();
        }
        this.f190242c.setText(str);
    }
}
