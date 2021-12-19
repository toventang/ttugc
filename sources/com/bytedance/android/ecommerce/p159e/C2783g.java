package com.bytedance.android.ecommerce.p159e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.ecommerce.p153a.p154a.C2737d;
import com.bytedance.android.ecommerce.p153a.p155b.C2742d;
import com.bytedance.android.ecommerce.p157c.AbstractC2771f;
import com.bytedance.android.ecommerce.p161g.EnumC2798a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.e.g */
public final class C2783g {

    /* renamed from: a */
    public final HandlerC2785a f8377a;

    /* renamed from: b */
    public final C2737d f8378b;

    /* renamed from: c */
    public final AbstractC2771f f8379c;

    /* renamed from: d */
    public int f8380d;

    /* renamed from: e */
    long f8381e;

    /* renamed from: f */
    final AbstractC2771f f8382f = new AbstractC2771f() {
        /* class com.bytedance.android.ecommerce.p159e.C2783g.C27841 */

        static {
            Covode.recordClassIndex(3210);
        }

        @Override // com.bytedance.android.ecommerce.p157c.AbstractC2771f
        /* renamed from: a */
        public final void mo7353a(C2742d dVar) {
            if (dVar.f8212h != EnumC2798a.INIT) {
                C2783g gVar = C2783g.this;
                gVar.mo7381a(gVar.f8378b, dVar);
                C2783g.this.f8379c.mo7353a(dVar);
            } else if (C2783g.this.f8380d <= 10) {
                C2783g.this.f8377a.sendEmptyMessageDelayed(1, 500);
            } else {
                C2783g gVar2 = C2783g.this;
                gVar2.mo7381a(gVar2.f8378b, dVar);
                C2783g.this.f8379c.mo7353a(new C2742d("time_out", "query failed because query order state retry count is to maxRetryCount."));
            }
        }
    };

    /* renamed from: g */
    private final int f8383g = 10;

    static {
        Covode.recordClassIndex(3209);
    }

    /* renamed from: com.bytedance.android.ecommerce.e.g$a */
    static class HandlerC2785a extends Handler {

        /* renamed from: a */
        private C2783g f8385a;

        static {
            Covode.recordClassIndex(3211);
        }

        public HandlerC2785a(C2783g gVar) {
            super(Looper.getMainLooper());
            this.f8385a = gVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C2783g gVar = this.f8385a;
                gVar.f8380d++;
                C2778c.f8362a.mo7371c().mo7398a(gVar.f8378b, gVar.f8382f);
            }
        }
    }

    public C2783g(C2737d dVar, AbstractC2771f fVar) {
        this.f8378b = dVar;
        this.f8379c = fVar;
        this.f8377a = new HandlerC2785a(this);
    }

    /* renamed from: a */
    public final void mo7381a(C2737d dVar, C2742d dVar2) {
        C2778c.f8362a.mo7374f().mo7390a(dVar.f8179k, dVar.f8176h, dVar2.f8212h, dVar2.f8210f, dVar2.f8211g, this.f8380d, System.currentTimeMillis() - this.f8381e, dVar2.toString());
    }
}
