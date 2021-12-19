package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.b.h */
public final class C9642h {

    /* renamed from: d */
    public static final C9643a f23489d = new C9643a((byte) 0);
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: a */
    public long f23490a;
    @AbstractC27891c(mo46611a = "result")

    /* renamed from: b */
    public int f23491b;
    @AbstractC27891c(mo46611a = "score")

    /* renamed from: c */
    public long f23492c;

    static {
        Covode.recordClassIndex(11184);
    }

    /* renamed from: com.bytedance.android.livesdk.model.message.b.h$a */
    public static final class C9643a {
        static {
            Covode.recordClassIndex(11185);
        }

        private C9643a() {
        }

        public /* synthetic */ C9643a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "BattleResult{userId=" + this.f23490a + ", result=" + this.f23491b + ", score=" + this.f23492c + '}';
    }
}
