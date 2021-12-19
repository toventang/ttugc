package com.p2082ss.android.ugc.aweme.commercialize.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.event.a */
public final class C37830a implements AbstractC81914b {

    /* renamed from: b */
    public static final C37831a f89321b = new C37831a((byte) 0);

    /* renamed from: a */
    public final int f89322a;

    static {
        Covode.recordClassIndex(45282);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C37830a) && this.f89322a == ((C37830a) obj).f89322a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f89322a;
    }

    public final String toString() {
        return "AdCommentListEvent(type=" + this.f89322a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.event.a$a */
    public static final class C37831a {
        static {
            Covode.recordClassIndex(45283);
        }

        private C37831a() {
        }

        public /* synthetic */ C37831a(byte b) {
            this();
        }
    }

    public C37830a(int i) {
        this.f89322a = i;
    }
}
