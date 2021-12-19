package com.bytedance.android.live.design.widget.p235b;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.b.d */
public final class C4126d extends AbstractC4125c<TextView> {
    static {
        Covode.recordClassIndex(4685);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{16842901, R.attr.uo};
    }

    public C4126d(TextView textView) {
        super(textView);
    }

    /* renamed from: a */
    public final void mo9632a(int i) {
        mo9631f(i);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        int dimensionPixelSize;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 1) {
                Typeface a = C17300a.m32029a().mo27609a(typedArray.getInt(1, 1));
                if (a != null) {
                    ((TextView) this.f11526h).setTypeface(a);
                }
            } else if (index == 0 && (dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0)) > 0) {
                ((TextView) this.f11526h).setTextSize(0, (float) dimensionPixelSize);
            }
        }
    }
}
