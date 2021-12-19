package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.discover.e.c */
public final class C41923c implements AbstractC81914b {

    /* renamed from: b */
    public static final C41924a f97794b = new C41924a((byte) 0);

    /* renamed from: a */
    public final int f97795a;

    static {
        Covode.recordClassIndex(49849);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41923c) && this.f97795a == ((C41923c) obj).f97795a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f97795a;
    }

    public final String toString() {
        return "ContainerStatusChangedEvent(status=" + this.f97795a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.e.c$a */
    public static final class C41924a {
        static {
            Covode.recordClassIndex(49850);
        }

        private C41924a() {
        }

        public /* synthetic */ C41924a(byte b) {
            this();
        }
    }

    public C41923c(int i) {
        this.f97795a = i;
    }
}
