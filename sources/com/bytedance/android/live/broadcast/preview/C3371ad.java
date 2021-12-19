package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.ad */
public final /* synthetic */ class C3371ad implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9590a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9591b;

    static {
        Covode.recordClassIndex(3855);
    }

    C3371ad(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f9590a = aVar;
        this.f9591b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9590a;
        IIconSlot.SlotViewModel slotViewModel = this.f9591b;
        String str = (String) obj;
        if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue()) && slotViewModel.f15357h.getValue() == null) {
            aVar.f9880c.mo9139b();
            aVar.f9880c.getAlertText().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            aVar.f9880c.getAlertText().setText(str);
        }
    }
}
