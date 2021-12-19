package com.p2082ss.android.ugc.aweme.share.p3747e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.share.e.a */
public final class C68919a implements AbstractC81914b {

    /* renamed from: b */
    public static final C68920a f154177b = new C68920a((byte) 0);

    /* renamed from: a */
    public final int f154178a;

    static {
        Covode.recordClassIndex(81225);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C68919a) && this.f154178a == ((C68919a) obj).f154178a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f154178a;
    }

    public final String toString() {
        return "ShareFinishedEvent(type=" + this.f154178a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.share.e.a$a */
    public static final class C68920a {
        static {
            Covode.recordClassIndex(81226);
        }

        private C68920a() {
        }

        public /* synthetic */ C68920a(byte b) {
            this();
        }
    }

    public C68919a(int i) {
        this.f154178a = i;
    }
}
