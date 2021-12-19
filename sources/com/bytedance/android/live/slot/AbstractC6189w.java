package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1203l;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: com.bytedance.android.live.slot.w */
public interface AbstractC6189w extends AbstractC1203l, AbstractC6192z, WeakHandler.IHandler, OnMessageListener {
    static {
        Covode.recordClassIndex(6895);
    }

    /* renamed from: a */
    AbstractC6189w mo12058a(DataChannel dataChannel);

    /* renamed from: a */
    void mo12059a(ActivityC0945e eVar, IIconSlot.EnumC6149b bVar);

    /* renamed from: a */
    void mo12060a(String str, Object obj);
}
