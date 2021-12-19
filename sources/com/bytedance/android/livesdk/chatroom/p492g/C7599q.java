package com.bytedance.android.livesdk.chatroom.p492g;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.q */
public final class C7599q implements HandlerC11626a.AbstractC11627a {

    /* renamed from: a */
    public static long f18841a = 10000;

    /* renamed from: b */
    public long f18842b;

    /* renamed from: c */
    public HandlerC11626a f18843c = new HandlerC11626a(this);

    /* renamed from: d */
    public boolean f18844d;

    /* renamed from: e */
    public boolean f18845e;

    /* renamed from: f */
    private boolean f18846f;

    /* renamed from: g */
    private boolean f18847g = true;

    static {
        Covode.recordClassIndex(8372);
    }

    /* renamed from: a */
    public final void mo13836a() {
        if (this.f18844d && !this.f18845e) {
            this.f18844d = false;
            this.f18846f = true;
            this.f18843c.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public final void mo13837b() {
        this.f18844d = false;
        this.f18846f = false;
        this.f18845e = false;
        this.f18847g = true;
        this.f18843c.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        if (!this.f18846f && message.what == 100) {
            if (this.f18847g) {
                this.f18847g = false;
            }
            this.f18842b = SystemClock.elapsedRealtime();
            this.f18843c.sendEmptyMessageDelayed(100, f18841a);
        }
    }
}
