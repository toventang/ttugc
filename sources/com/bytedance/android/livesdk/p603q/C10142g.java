package com.bytedance.android.livesdk.p603q;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.q.g */
public final class C10142g {

    /* renamed from: a */
    final DataChannel f24600a;

    /* renamed from: b */
    C9904t f24601b;

    /* renamed from: c */
    final C88411a f24602c = new C88411a();

    /* renamed from: d */
    AbstractC10143a f24603d;

    /* renamed from: com.bytedance.android.livesdk.q.g$a */
    public interface AbstractC10143a {
        static {
            Covode.recordClassIndex(11706);
        }

        /* renamed from: a */
        void mo16986a(C9904t tVar);
    }

    static {
        Covode.recordClassIndex(11705);
    }

    public C10142g(DataChannel dataChannel) {
        this.f24600a = dataChannel;
        EnumC5847l.DUMMY_FAST_GIFT.hide(dataChannel);
        this.f24601b = null;
    }
}
