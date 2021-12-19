package com.bytedance.android.live.liveinteract.multiguest.p316a.p321e;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.d */
public final class C5178d {

    /* renamed from: c */
    public static final C5179a f13395c = new C5179a((byte) 0);

    /* renamed from: a */
    public AbstractC5174a f13396a;

    /* renamed from: b */
    public final AbstractC5175b f13397b;

    static {
        Covode.recordClassIndex(5770);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.e.d$a */
    public static final class C5179a {
        static {
            Covode.recordClassIndex(5771);
        }

        private C5179a() {
        }

        public /* synthetic */ C5179a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo10937a() {
        this.f13396a.mo10931f();
    }

    public C5178d(AbstractC5175b bVar) {
        AbstractC5174a cVar;
        C89219l.m154721d(bVar, "");
        this.f13397b = bVar;
        if (LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()) {
            cVar = new C5180e(bVar);
        } else {
            cVar = new C5176c(bVar);
        }
        this.f13396a = cVar;
    }
}
