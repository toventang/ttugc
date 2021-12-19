package com.p2082ss.android.ugc.tools.view.style;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.StyleRecyclerView */
public final class StyleRecyclerView extends RecyclerView {

    /* renamed from: O */
    public int f189876O;

    /* renamed from: P */
    public int f189877P;

    /* renamed from: Q */
    public int f189878Q;

    /* renamed from: R */
    private int f189879R;

    /* renamed from: S */
    private boolean f189880S;

    /* renamed from: T */
    private RecyclerView.AbstractC1361h f189881T;

    static {
        Covode.recordClassIndex(98962);
    }

    public StyleRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: q */
    private final void m146026q() {
        RecyclerView.AbstractC1361h hVar = this.f189881T;
        if (hVar != null) {
            mo4425c(hVar);
        }
        if (this.f189880S) {
            int i = this.f189876O;
            if (i > 0) {
                this.f189876O = i - (this.f189879R * 2);
            }
            int i2 = this.f189877P;
            if (i2 > 0) {
                this.f189877P = i2 - this.f189879R;
            }
            int i3 = this.f189878Q;
            if (i3 > 0) {
                this.f189878Q = i3 - this.f189879R;
            }
        }
        if (this.f189876O != 0 || this.f189877P != 0 || this.f189878Q != 0) {
            C84962a aVar = new C84962a(this);
            mo4415b(aVar);
            this.f189881T = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.style.StyleRecyclerView$a */
    public static final class C84962a extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        final /* synthetic */ StyleRecyclerView f189882a;

        static {
            Covode.recordClassIndex(98963);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84962a(StyleRecyclerView styleRecyclerView) {
            this.f189882a = styleRecyclerView;
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
                    if (C84912r.m145932a(this.f189882a)) {
                        rect.right = this.f189882a.f189877P;
                    } else {
                        rect.left = this.f189882a.f189877P;
                    }
                }
                RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                if (adapter == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(adapter, "");
                if (d == adapter.getItemCount() - 1) {
                    if (C84912r.m145932a(this.f189882a)) {
                        rect.left = this.f189882a.f189878Q;
                    } else {
                        rect.right = this.f189882a.f189878Q;
                    }
                } else if (C84912r.m145932a(this.f189882a)) {
                    rect.left = this.f189882a.f189876O;
                } else {
                    rect.right = this.f189882a.f189876O;
                }
            }
        }
    }

    public final void setItemMargin(int i) {
        this.f189876O = i;
        m146026q();
    }

    public final void setItemShowBorder(boolean z) {
        this.f189880S = z;
        m146026q();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StyleRecyclerView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StyleRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f189879R = (int) C84912r.m145930a(context, 2.0f);
        this.f189880S = true;
        GradientDrawable a = C84981g.m146054a(context, attributeSet, false);
        if (a != null) {
            setBackground(a);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ak7, R.attr.ak8, R.attr.ak9, R.attr.ak_, R.attr.aka, R.attr.akb, R.attr.akc, R.attr.akd, R.attr.ake, R.attr.akf, R.attr.akg, R.attr.akh, R.attr.aki, R.attr.akj, R.attr.akk, R.attr.akl, R.attr.akm, R.attr.akn, R.attr.ako, R.attr.akp, R.attr.akq, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.akv});
            C89219l.m154716b(obtainStyledAttributes, "");
            this.f189876O = (int) obtainStyledAttributes.getDimension(10, 0.0f);
            this.f189877P = (int) obtainStyledAttributes.getDimension(6, 0.0f);
            this.f189878Q = (int) obtainStyledAttributes.getDimension(12, 0.0f);
            this.f189879R = (int) obtainStyledAttributes.getDimension(14, C84912r.m145930a(context, 2.0f));
            this.f189880S = obtainStyledAttributes.getBoolean(11, true);
            obtainStyledAttributes.recycle();
        }
        m146026q();
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
