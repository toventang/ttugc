package com.bytedance.android.live.slot;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.slot.f */
public final /* synthetic */ class C6170f implements AbstractC1214u {

    /* renamed from: a */
    private final BottomLeftSlotWidget f15408a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f15409b;

    static {
        Covode.recordClassIndex(6876);
    }

    C6170f(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel) {
        this.f15408a = bottomLeftSlotWidget;
        this.f15409b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = this.f15408a;
        String str = (String) obj;
        if (Boolean.TRUE.equals(this.f15409b.f15350a.getValue()) && bottomLeftSlotWidget.f15261j != null) {
            bottomLeftSlotWidget.f15261j.setText(str);
        }
    }
}
