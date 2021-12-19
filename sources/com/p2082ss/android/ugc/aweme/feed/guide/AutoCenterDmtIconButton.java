package com.p2082ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1203b.C17252a;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.AutoCenterDmtIconButton */
public class AutoCenterDmtIconButton extends FrameLayout implements AbstractC17178d {

    /* renamed from: a */
    private int f114029a;

    /* renamed from: b */
    private ImageView f114030b;

    /* renamed from: c */
    private TextView f114031c;

    /* renamed from: d */
    private EnumC17270a f114032d;

    /* renamed from: e */
    private int f114033e;

    static {
        Covode.recordClassIndex(58411);
    }

    /* renamed from: a */
    private void m92903a() {
        if (this.f114032d == EnumC17270a.SOLID) {
            m92904b();
        } else {
            m92905c();
        }
    }

    /* renamed from: b */
    private void m92904b() {
        if (this.f114029a == 0) {
            setBackgroundResource(R.drawable.cc2);
        } else {
            setBackgroundResource(R.drawable.cc1);
        }
        this.f114031c.setTextColor(C0643b.m2378c(getContext(), R.color.a9));
        if (this.f114033e != -1) {
            this.f114030b.setVisibility(0);
            C17252a.m31844a(getContext(), this.f114030b, this.f114033e, R.color.a9);
            return;
        }
        this.f114030b.setVisibility(8);
    }

    /* renamed from: c */
    private void m92905c() {
        if (this.f114029a == 0) {
            setBackgroundResource(R.drawable.cc0);
            this.f114031c.setTextColor(C0643b.m2378c(getContext(), R.color.bx));
            if (this.f114033e != -1) {
                this.f114030b.setVisibility(0);
                C17252a.m31844a(getContext(), this.f114030b, this.f114033e, R.color.bx);
                return;
            }
            this.f114030b.setVisibility(8);
            return;
        }
        setBackgroundResource(R.drawable.cby);
        this.f114031c.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
        if (this.f114033e != -1) {
            this.f114030b.setVisibility(0);
            C17252a.m31844a(getContext(), this.f114030b, this.f114033e, R.color.a_);
            return;
        }
        this.f114030b.setVisibility(8);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
        if (this.f114029a != i) {
            this.f114029a = i;
            m92903a();
        }
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AutoCenterDmtIconButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7004);
        this.f114029a = C17175b.C17176a.f40922a.f40921a;
        this.f114032d = EnumC17270a.SOLID;
        this.f114033e = -1;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.afq, this, true);
        this.f114030b = (ImageView) a.findViewById(R.id.bwm);
        this.f114031c = (TextView) a.findViewById(R.id.f5s);
        m92903a();
        MethodCollector.m26664o(7004);
    }

    /* renamed from: a */
    public final void mo81322a(EnumC17270a aVar, int i, int i2) {
        mo81323a(aVar, i, getContext().getString(i2));
    }

    /* renamed from: a */
    public final void mo81323a(EnumC17270a aVar, int i, String str) {
        this.f114033e = i;
        if (aVar == EnumC17270a.BORDER) {
            m92905c();
        } else {
            m92904b();
        }
        this.f114031c.setText(str);
    }
}
