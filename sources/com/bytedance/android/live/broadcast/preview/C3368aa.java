package com.bytedance.android.live.broadcast.preview;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.aa */
public final /* synthetic */ class C3368aa implements AbstractC1214u {

    /* renamed from: a */
    private final C3561v.C3562a f9583a;

    /* renamed from: b */
    private final IIconSlot.SlotViewModel f9584b;

    /* renamed from: c */
    private final AbstractC6157ab f9585c;

    static {
        Covode.recordClassIndex(3852);
    }

    C3368aa(C3561v.C3562a aVar, IIconSlot.SlotViewModel slotViewModel, AbstractC6157ab abVar) {
        this.f9583a = aVar;
        this.f9584b = slotViewModel;
        this.f9585c = abVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C3561v.C3562a aVar = this.f9583a;
        IIconSlot.SlotViewModel slotViewModel = this.f9584b;
        AbstractC6157ab abVar = this.f9585c;
        if (!Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
            return;
        }
        if (aVar.f9879b.mo28318b(C3802x.class) == EnumC11728i.SCREEN_RECORD || !Boolean.TRUE.equals(obj)) {
            aVar.f9880c.setVisibility(8);
            return;
        }
        aVar.f9880c.setVisibility(0);
        abVar.mo12073a("before_live");
    }
}
