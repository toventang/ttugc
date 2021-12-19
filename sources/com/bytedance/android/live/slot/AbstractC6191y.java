package com.bytedance.android.live.slot;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.live.slot.y */
public interface AbstractC6191y {
    static {
        Covode.recordClassIndex(6897);
    }

    /* renamed from: a */
    AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> mo12097a(Context context, IFrameSlot.EnumC6146b bVar);

    /* renamed from: a */
    AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> mo12098a(Context context, IIconSlot.EnumC6149b bVar);

    /* renamed from: a */
    List<IIconSlot.EnumC6149b> mo12099a();

    /* renamed from: b */
    List<IFrameSlot.EnumC6146b> mo12100b();

    /* renamed from: c */
    String mo12101c();
}
