package com.bytedance.android.live.liveinteract.multilive.p361d;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5600m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.d.a */
public final class C5607a {

    /* renamed from: b */
    public static final C5608a f14249b = new C5608a((byte) 0);

    /* renamed from: a */
    public final DataChannel f14250a;

    static {
        Covode.recordClassIndex(6204);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.d.a$a */
    public static final class C5608a {
        static {
            Covode.recordClassIndex(6205);
        }

        private C5608a() {
        }

        public /* synthetic */ C5608a(byte b) {
            this();
        }
    }

    public C5607a(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14250a = dataChannel;
    }

    /* renamed from: a */
    public static C5600m m12149a(String str) {
        C89219l.m154721d(str, "");
        try {
            return (C5600m) C4139e.C4140a.f11575b.mo46670a(str, C5600m.class);
        } catch (Exception e) {
            C3854a.m9458a("RtcMessageReader", e);
            return null;
        }
    }
}
