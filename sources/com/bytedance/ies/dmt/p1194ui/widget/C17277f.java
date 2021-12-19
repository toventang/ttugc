package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1203b.C17252a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.f */
public final class C17277f extends FrameLayout implements AbstractC17178d {

    /* renamed from: a */
    private int f41396a;

    /* renamed from: b */
    private ImageView f41397b;

    /* renamed from: c */
    private DmtTextView f41398c;

    /* renamed from: d */
    private EnumC17270a f41399d;

    /* renamed from: e */
    private int f41400e;

    static {
        Covode.recordClassIndex(19755);
    }

    /* renamed from: a */
    private void m31956a() {
        if (this.f41399d == EnumC17270a.SOLID) {
            m31957b();
        } else {
            m31958c();
        }
    }

    public final String getTextString() {
        DmtTextView dmtTextView = this.f41398c;
        if (dmtTextView == null || dmtTextView.getText() == null) {
            return "";
        }
        return this.f41398c.getText().toString();
    }

    /* renamed from: b */
    private void m31957b() {
        if (this.f41396a == 0) {
            setBackgroundResource(R.drawable.cc2);
        } else {
            setBackgroundResource(R.drawable.cc1);
        }
        this.f41398c.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        if (this.f41400e != -1) {
            C17252a.m31844a(getContext(), this.f41397b, this.f41400e, R.color.a9);
        }
    }

    /* renamed from: c */
    private void m31958c() {
        if (this.f41396a == 0) {
            setBackgroundResource(R.drawable.cc0);
            this.f41398c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            if (this.f41400e != -1) {
                C17252a.m31844a(getContext(), this.f41397b, this.f41400e, R.color.bx);
                return;
            }
            return;
        }
        setBackgroundResource(R.drawable.cby);
        this.f41398c.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
        if (this.f41400e != -1) {
            C17252a.m31844a(getContext(), this.f41397b, this.f41400e, R.color.a_);
        }
    }

    public C17277f(Context context) {
        this(context, (byte) 0);
    }

    public final void setFontType(String str) {
        this.f41398c.setFontType(str);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
        if (this.f41396a != i) {
            this.f41396a = i;
            m31956a();
        }
    }

    private C17277f(Context context, byte b) {
        this(context, (char) 0);
    }

    private C17277f(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(10938);
        this.f41396a = C17175b.C17176a.f40922a.f40921a;
        this.f41399d = EnumC17270a.SOLID;
        this.f41400e = -1;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.afp, this, true);
        this.f41397b = (ImageView) a.findViewById(R.id.bwm);
        this.f41398c = (DmtTextView) a.findViewById(R.id.f5s);
        m31956a();
        MethodCollector.m26664o(10938);
    }

    /* renamed from: a */
    public final void mo27474a(EnumC17270a aVar, int i, String str) {
        this.f41400e = i;
        if (aVar == EnumC17270a.BORDER) {
            m31958c();
        } else {
            m31957b();
        }
        this.f41398c.setText(str);
    }
}
