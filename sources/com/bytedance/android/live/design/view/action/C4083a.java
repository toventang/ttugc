package com.bytedance.android.live.design.view.action;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0820e;
import androidx.core.widget.C0823h;
import com.bytedance.android.live.design.C4080c;
import com.bytedance.android.live.design.widget.p235b.AbstractC4125c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.view.action.a */
final class C4083a extends AbstractC4125c<LiveActionButton> {
    static {
        Covode.recordClassIndex(4628);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{16842804, 16842948, 16842964, 16842965, 16843087, R.attr.vu, R.attr.a2e, R.attr.a2x};
    }

    public C4083a(LiveActionButton liveActionButton) {
        super(liveActionButton);
    }

    /* renamed from: a */
    public final void mo9536a(int i) {
        mo9631f(i);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 0) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    C0823h.m2907a(((LiveActionButton) this.f11526h).f11290b, resourceId);
                }
            } else if (index == 6) {
                C0823h.m2917e(((LiveActionButton) this.f11526h).f11290b, typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 7) {
                ColorStateList a = C4080c.m9890a(((LiveActionButton) this.f11526h).getContext(), typedArray, index);
                if (a != null) {
                    C0820e.m2895a(((LiveActionButton) this.f11526h).f11289a, a);
                    ((LiveActionButton) this.f11526h).f11290b.setTextColor(a);
                }
            } else if (index == 3) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(index, 0);
                ((LiveActionButton) this.f11526h).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            } else if (index == 1) {
                ((LiveActionButton) this.f11526h).setOrientation(typedArray.getInt(index, -1));
            } else if (index == 2) {
                C0792v.m2746a(this.f11526h, typedArray.getDrawable(index));
            } else if (index == 5) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    ((LiveActionButton) this.f11526h).setIcon(C0196a.m619b(((LiveActionButton) this.f11526h).getContext(), resourceId2));
                } else {
                    ((LiveActionButton) this.f11526h).setIcon((Drawable) null);
                }
            } else if (index == 4) {
                ((LiveActionButton) this.f11526h).setText(typedArray.getText(index));
            }
        }
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9537a(AttributeSet attributeSet, int i, int i2) {
        super.mo9537a(attributeSet, i, i2);
    }
}
