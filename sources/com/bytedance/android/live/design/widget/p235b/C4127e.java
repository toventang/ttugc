package com.bytedance.android.live.design.widget.p235b;

import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.b.e */
public class C4127e extends AbstractC4125c<TextView> {

    /* renamed from: a */
    private final C4126d f11527a;

    static {
        Covode.recordClassIndex(4686);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{16842804, 16842901, R.attr.uo, R.attr.a2e};
    }

    /* renamed from: b */
    public final void mo9634b(int i) {
        mo9631f(i);
    }

    /* renamed from: a */
    public final void mo9633a(int i) {
        this.f11527a.mo9632a(i);
    }

    public C4127e(TextView textView) {
        super(textView);
        this.f11527a = new C4126d(textView);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        int dimensionPixelSize;
        int resourceId;
        ((TextView) this.f11526h).setTypeface(C17300a.m32029a().mo27609a(typedArray.getInteger(2, 1)));
        if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
            this.f11527a.mo9632a(resourceId);
        }
        if (typedArray.hasValue(3)) {
            C0823h.m2917e((TextView) this.f11526h, typedArray.getDimensionPixelSize(3, 0));
        }
        if (typedArray.hasValue(1) && (dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1)) != -1) {
            ((TextView) this.f11526h).setTextSize(0, (float) dimensionPixelSize);
        }
    }
}
