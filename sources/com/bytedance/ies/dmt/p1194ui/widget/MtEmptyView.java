package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.MtEmptyView */
public class MtEmptyView extends LinearLayout implements AbstractC17178d, AbstractC17278g {

    /* renamed from: a */
    public static final Float f41327a = Float.valueOf(24.0f);

    /* renamed from: b */
    private LinearLayout f41328b;

    /* renamed from: c */
    private FrameLayout f41329c;

    /* renamed from: d */
    private ImageView f41330d;

    /* renamed from: e */
    private DmtTextView f41331e;

    /* renamed from: f */
    private DmtTextView f41332f;

    /* renamed from: g */
    private int f41333g = C17175b.C17176a.f40922a.f40921a;

    /* renamed from: h */
    private C17273d f41334h;

    /* renamed from: i */
    private FrameLayout f41335i;

    /* renamed from: j */
    private DmtTextView f41336j;

    /* renamed from: k */
    private RelativeLayout f41337k;

    static {
        Covode.recordClassIndex(19746);
    }

    /* renamed from: a */
    private void m31927a() {
        int color;
        int i;
        int color2;
        if (this.f41328b != null && this.f41334h != null) {
            Resources resources = getResources();
            if (this.f41331e != null) {
                if (this.f41334h.f41359r) {
                    DmtTextView dmtTextView = this.f41331e;
                    if (this.f41333g == 0) {
                        color2 = resources.getColor(R.color.c4);
                    } else {
                        color2 = resources.getColor(R.color.aa);
                    }
                    dmtTextView.setTextColor(color2);
                } else {
                    DmtTextView dmtTextView2 = this.f41331e;
                    if (this.f41333g == 0) {
                        i = R.color.bx;
                    } else {
                        i = R.color.a_;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i));
                }
            }
            DmtTextView dmtTextView3 = this.f41332f;
            if (dmtTextView3 != null) {
                if (this.f41333g == 0) {
                    color = resources.getColor(R.color.c4);
                } else {
                    color = resources.getColor(R.color.aa);
                }
                dmtTextView3.setTextColor(color);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f41328b = (LinearLayout) findViewById(R.id.c57);
        this.f41329c = (FrameLayout) findViewById(R.id.c4i);
        this.f41330d = (ImageView) findViewById(R.id.bvb);
        this.f41331e = (DmtTextView) findViewById(R.id.f63);
        this.f41332f = (DmtTextView) findViewById(R.id.ev0);
        this.f41335i = (FrameLayout) findViewById(R.id.b4d);
        this.f41336j = (DmtTextView) findViewById(R.id.auz);
        this.f41337k = (RelativeLayout) findViewById(R.id.dld);
        if (C0792v.m2768e(this) == 1) {
            int i = Build.VERSION.SDK_INT;
            setLayoutDirection(0);
            this.f41328b.setLayoutDirection(1);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
        if (this.f41333g != i) {
            this.f41333g = i;
            m31927a();
        }
    }

    /* renamed from: a */
    public static MtEmptyView m31926a(Context context) {
        MethodCollector.m26663i(9265);
        MtEmptyView mtEmptyView = (MtEmptyView) LayoutInflater.from(context).inflate(R.layout.aga, (ViewGroup) null);
        MethodCollector.m26664o(9265);
        return mtEmptyView;
    }

    public void setTopUsedHeight(int i) {
        C17273d dVar = this.f41334h;
        if (dVar != null && dVar.f41360s) {
            this.f41335i.setPadding(0, 0, 0, ((int) C13628n.m24520b(getContext(), f41327a.floatValue())) + i);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17278g
    public void setStatus(C17273d dVar) {
        if (dVar != null) {
            this.f41334h = dVar;
            if (dVar.f41355n) {
                this.f41329c.setVisibility(0);
                this.f41330d.setImageDrawable(this.f41334h.f41343b);
            } else {
                this.f41329c.setVisibility(8);
            }
            if (this.f41334h.f41356o) {
                this.f41331e.setText(this.f41334h.f41346e);
            }
            if (this.f41334h.f41359r) {
                C0823h.m2907a(this.f41331e, (int) R.style.w9);
            }
            if (this.f41334h.f41357p) {
                this.f41332f.setText(this.f41334h.f41347f);
                if (this.f41334h.f41358q) {
                    this.f41332f.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (this.f41334h.f41360s) {
                this.f41336j.setText(this.f41334h.f41350i);
                this.f41335i.setVisibility(0);
                this.f41336j.setVisibility(0);
                this.f41336j.setOnClickListener(this.f41334h.f41351j);
            }
            m31927a();
        }
    }

    public MtEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9266);
        MethodCollector.m26664o(9266);
    }

    /* renamed from: a */
    public final void mo27428a(int i, Drawable drawable, int i2, int i3) {
        C17273d dVar = this.f41334h;
        if (dVar != null && dVar.f41360s) {
            this.f41336j.setTextColor(i);
            this.f41336j.setAlpha(1.0f);
            this.f41336j.setFontSize(4);
            this.f41336j.setFontWeight(3);
            this.f41336j.setBackgroundDrawable(drawable);
            this.f41335i.setPadding(i2, 0, i2, i3);
        }
    }
}
