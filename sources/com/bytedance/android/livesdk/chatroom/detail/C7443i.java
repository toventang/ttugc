package com.bytedance.android.livesdk.chatroom.detail;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.i */
public final class C7443i implements WeakHandler.IHandler {

    /* renamed from: a */
    public boolean f18465a = false;

    /* renamed from: b */
    private final Handler f18466b = new WeakHandler(this);

    /* renamed from: c */
    private final long f18467c;

    /* renamed from: d */
    private final long f18468d;

    /* renamed from: e */
    private final String f18469e;

    /* renamed from: f */
    private final boolean f18470f;

    /* renamed from: g */
    private final AbstractC7444a f18471g;

    /* renamed from: h */
    private C27910f f18472h;

    /* renamed from: i */
    private long f18473i = ((long) AudiencePingIntervalSetting.INSTANCE.getValue());

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.i$a */
    public interface AbstractC7444a {
        static {
            Covode.recordClassIndex(8214);
        }

        /* renamed from: a */
        void mo13664a(int i);

        /* renamed from: a */
        void mo13665a(long j);

        /* renamed from: a */
        boolean mo13666a();

        /* renamed from: b */
        void mo13667b();

        /* renamed from: c */
        void mo13668c();
    }

    static {
        Covode.recordClassIndex(8213);
    }

    /* renamed from: a */
    public final void mo13662a() {
        if (this.f18465a) {
            this.f18465a = false;
            this.f18466b.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public final void mo13663b() {
        if (!this.f18465a || !this.f18471g.mo13666a()) {
            mo13662a();
            return;
        }
        C7307f.m15218a(this.f18466b, this.f18467c, this.f18470f);
        long j = this.f18473i;
        if (j > 0 && j >= ((long) AudiencePingIntervalSetting.INSTANCE.getValue())) {
            this.f18466b.sendMessageDelayed(this.f18466b.obtainMessage(8), this.f18473i * 1000);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (this.f18465a) {
            int i = message.what;
            if (i == 7) {
                Object obj = message.obj;
                if (!this.f18465a) {
                    return;
                }
                if (obj instanceof C2912a) {
                    int errorCode = ((C2908a) obj).getErrorCode();
                    C3854a.m9453a(3, "LivePingController", "ping replay api exception, error code: ".concat(String.valueOf(errorCode)));
                    if (30001 == errorCode || 30003 == errorCode || 30004 == errorCode) {
                        this.f18471g.mo13664a(errorCode);
                    } else if (50002 == errorCode) {
                        this.f18471g.mo13668c();
                    }
                } else if (obj instanceof PingResult) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String b = this.f18472h.mo46674b(obj);
                    if (LiveEnableALogSetting.INSTANCE.isEnable()) {
                        AbstractC29335a.m58738f("pingresult", b);
                    }
                    C3854a.m9453a(2, "pingresultCostTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    PingResult pingResult = (PingResult) obj;
                    this.f18473i = pingResult.getNextPingInterval();
                    if (4 == pingResult.getRoomStatus() && pingResult.getRoomId() == this.f18467c) {
                        this.f18471g.mo13667b();
                    } else if (pingResult.getMosaicStatus() != 0) {
                        AbstractC7444a aVar = this.f18471g;
                        pingResult.getRoomId();
                        aVar.mo13665a((long) pingResult.getMosaicStatus());
                    }
                }
            } else if (i == 8) {
                mo13663b();
            }
        }
    }

    public C7443i(long j, long j2, String str, AbstractC7444a aVar) {
        this.f18467c = j;
        this.f18468d = j2;
        this.f18469e = str;
        this.f18470f = false;
        this.f18471g = aVar;
        this.f18472h = C4139e.C4140a.f11575b;
    }
}
