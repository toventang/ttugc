package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.slot.ab */
public interface AbstractC6157ab<W, VM extends AbstractC1174ac, T extends Enum<T>> {

    /* renamed from: com.bytedance.android.live.slot.ab$a */
    public interface AbstractC6158a {
        static {
            Covode.recordClassIndex(6864);
        }

        /* renamed from: a */
        Context mo12042a();

        /* renamed from: a */
        boolean mo12043a(AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar, IIconSlot.SlotViewModel slotViewModel);
    }

    /* renamed from: com.bytedance.android.live.slot.ab$b */
    public interface AbstractC6159b {
        static {
            Covode.recordClassIndex(6865);
        }

        /* renamed from: a */
        void mo12045a(boolean z);
    }

    static {
        Covode.recordClassIndex(6863);
    }

    /* renamed from: a */
    List<Integer> mo12069a();

    /* renamed from: a */
    void mo12070a(Bundle bundle);

    /* renamed from: a */
    void mo12071a(VM vm, AbstractC6158a aVar);

    /* renamed from: a */
    void mo12072a(IMessage iMessage);

    /* renamed from: a */
    void mo12073a(String str);

    /* renamed from: a */
    void mo12074a(Map<String, Object> map, AbstractC6159b bVar);

    /* renamed from: b */
    void mo12075b();

    /* renamed from: c */
    void mo12076c();

    /* renamed from: d */
    void mo12077d();

    /* renamed from: e */
    T mo12078e();

    /* renamed from: f */
    W mo12079f();

    /* renamed from: g */
    String mo12080g();
}
