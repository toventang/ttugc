package com.p2082ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView */
public final class AVDmtPanelRecycleView extends RecyclerView {

    /* renamed from: O */
    public int f174481O;

    /* renamed from: P */
    public int f174482P;

    /* renamed from: Q */
    public int f174483Q;

    static {
        Covode.recordClassIndex(90861);
    }

    public AVDmtPanelRecycleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: q */
    public final boolean mo5599q() {
        if (C0792v.m2768e(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView$a */
    public static final class C77789a extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecycleView f174484a;

        static {
            Covode.recordClassIndex(90862);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77789a(AVDmtPanelRecycleView aVDmtPanelRecycleView) {
            this.f174484a = aVDmtPanelRecycleView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (d != -1) {
                if (d == 0) {
                    if (this.f174484a.mo5599q()) {
                        rect.right = this.f174484a.f174482P;
                    } else {
                        rect.left = this.f174484a.f174482P;
                    }
                }
                RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(adapter, "");
                if (d == adapter.getItemCount() - 1) {
                    if (this.f174484a.mo5599q()) {
                        rect.left = this.f174484a.f174483Q;
                    } else {
                        rect.right = this.f174484a.f174483Q;
                    }
                } else if (this.f174484a.mo5599q()) {
                    rect.left = this.f174484a.f174481O;
                } else {
                    rect.right = this.f174484a.f174481O;
                }
            }
        }
    }

    public final void setSecondPanel(boolean z) {
        if (z) {
            int a = C77795c.m135910a(false, z, false, false);
            setBackground(C84916a.m145947a(a, a, 0, 0));
        }
    }

    private /* synthetic */ AVDmtPanelRecycleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtPanelRecycleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        Drawable a;
        C89219l.m154721d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ke, R.attr.kp, R.attr.nr, R.attr.se, R.attr.u1, R.attr.uz, R.attr.x6, R.attr.x7, R.attr.x8, R.attr.x9, R.attr.xb, R.attr.xc, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xy, R.attr.xz, R.attr.y0, R.attr.y2, R.attr.z8, R.attr.a2i, R.attr.a3o, R.attr.a5z, R.attr.a6_, R.attr.a6i, R.attr.a6n, R.attr.a7c, R.attr.a7d, R.attr.a_t, R.attr.ab2, R.attr.ab6, R.attr.abr, R.attr.abs, R.attr.aft, R.attr.ai7, R.attr.aid, R.attr.aih, R.attr.aim, R.attr.aiq, R.attr.aj5, R.attr.ajp, R.attr.asg, R.attr.aso, R.attr.asq});
            C89219l.m154716b(obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            this.f174481O = (int) obtainStyledAttributes.getDimension(20, 0.0f);
            this.f174482P = (int) obtainStyledAttributes.getDimension(4, 0.0f);
            this.f174483Q = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            boolean z2 = obtainStyledAttributes.getBoolean(21, true);
            int b = (int) C13628n.m24520b(context, 2.0f);
            if (z2) {
                int i = this.f174481O;
                if (i > 0) {
                    this.f174481O = i - (b * 2);
                }
                int i2 = this.f174482P;
                if (i2 > 0) {
                    this.f174482P = i2 - b;
                }
                int i3 = this.f174483Q;
                if (i3 > 0) {
                    this.f174483Q = i3 - b;
                }
            }
            if (z && (a = C77795c.f174521d.mo121373a(context, attributeSet)) != null) {
                setBackground(a);
            }
            mo4402a(new C77789a(this));
        }
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
