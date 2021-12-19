package com.bytedance.android.live.design.app.p232b;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.bytedance.android.live.design.C4080c;
import com.bytedance.android.live.design.widget.p235b.AbstractC4125c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.app.b.a */
public final class C4063a extends AbstractC4125c<C4071g> {
    static {
        Covode.recordClassIndex(4607);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{16842804, 16842904, 16842964, 16842966, 16842968, R.attr.iq, R.attr.ir, R.attr.it};
    }

    public C4063a(C4071g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    public final void mo9511a(int i) {
        mo9631f(i);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index == 0) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    C0823h.m2907a((TextView) this.f11526h, resourceId);
                }
            } else if (index == 1) {
                ColorStateList a = C4080c.m9890a(((C4071g) this.f11526h).getContext(), typedArray, index);
                if (a != null) {
                    ((C4071g) this.f11526h).setTextColor(a);
                }
            } else if (index == 3) {
                ((C4071g) this.f11526h).setPadding(typedArray.getDimensionPixelSize(index, 0), 0, ((C4071g) this.f11526h).getPaddingRight(), 0);
            } else if (index == 4) {
                ((C4071g) this.f11526h).setPadding(((C4071g) this.f11526h).getPaddingLeft(), 0, typedArray.getDimensionPixelSize(index, 0), 0);
            } else if (index == 2) {
                C0792v.m2746a(this.f11526h, typedArray.getDrawable(index));
            } else if (index == 6) {
                i = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                i2 = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                i3 = typedArray.getDimensionPixelSize(index, 0);
            }
        }
        if (i > 0 && i2 > 0 && i3 > 0) {
            C0823h.m2908a((TextView) this.f11526h, i, i2, i3, 0);
        }
    }
}
