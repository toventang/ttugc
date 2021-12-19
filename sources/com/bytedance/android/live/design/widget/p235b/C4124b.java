package com.bytedance.android.live.design.widget.p235b;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.b.b */
public final class C4124b extends AbstractC4125c<View> {

    /* renamed from: a */
    private float f11524a = 1.0f;

    /* renamed from: b */
    private float f11525b = 1.0f;

    static {
        Covode.recordClassIndex(4683);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{R.attr.rd, R.attr.a7n};
    }

    /* renamed from: a */
    public final void mo9629a(int i) {
        mo9631f(i);
    }

    public C4124b(View view) {
        super(view);
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 1) {
                TypedValue typedValue = new TypedValue();
                typedArray.getValue(1, typedValue);
                this.f11524a = typedValue.getFloat();
            } else if (index == 0) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(0, typedValue2);
                this.f11525b = typedValue2.getFloat();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9630a(Canvas canvas) {
        float f;
        if (!this.f11526h.isEnabled()) {
            f = this.f11525b;
        } else if (!this.f11526h.isPressed()) {
            return false;
        } else {
            f = this.f11524a;
        }
        int i = (int) (f * 255.0f);
        if (i >= 255) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) this.f11526h.getWidth(), (float) this.f11526h.getHeight(), i, 31);
        return true;
    }

    /* renamed from: a */
    public static void m10013a(Canvas canvas, boolean z) {
        if (z) {
            canvas.restore();
        }
    }
}
