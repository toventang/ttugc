package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.ac */
public final /* synthetic */ class C3370ac implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9588a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9589b;

    static {
        Covode.recordClassIndex(3854);
    }

    C3370ac(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f9588a = aVar;
        this.f9589b = slotViewModel;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9588a;
        IIconSlot.SlotViewModel slotViewModel = this.f9589b;
        Boolean bool = (Boolean) obj;
        if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
            int i = 0;
            if (bool == null) {
                bool = false;
            }
            if (slotViewModel.f15357h.getValue() == null && TextUtils.isEmpty(slotViewModel.f15352c.getValue())) {
                aVar.f9880c.mo9139b();
                View redDotView = aVar.f9880c.getRedDotView();
                if (!bool.booleanValue()) {
                    i = 8;
                }
                redDotView.setVisibility(i);
            }
        }
    }
}
