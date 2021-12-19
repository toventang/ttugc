package com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.notification.e.a.a */
public final class C61961a {

    /* renamed from: a */
    public static final C61962a f140643a = new C61962a((byte) 0);

    /* renamed from: b */
    public static final C61961a f140644b = new C61961a();

    /* renamed from: c */
    private static final AbstractC89244h f140645c = C89250i.m154773a((AbstractC89171a) C61963b.f140648a);

    /* renamed from: a */
    public static C61962a m112084a() {
        return (C61962a) f140645c.getValue();
    }

    private C61961a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a.a$a */
    public static final class C61962a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f140646a;
        @AbstractC27891c(mo46611a = "enable_slardar")

        /* renamed from: b */
        public final boolean f140647b;

        static {
            Covode.recordClassIndex(72711);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61962a)) {
                return false;
            }
            C61962a aVar = (C61962a) obj;
            return this.f140646a == aVar.f140646a && this.f140647b == aVar.f140647b;
        }

        public final int hashCode() {
            boolean z = this.f140646a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            if (!this.f140647b) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "Meta(enable=" + this.f140646a + ", enableSlardar=" + this.f140647b + ")";
        }

        private C61962a() {
            this.f140646a = true;
            this.f140647b = false;
        }

        public /* synthetic */ C61962a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a.a$b */
    static final class C61963b extends AbstractC89220m implements AbstractC89171a<C61962a> {

        /* renamed from: a */
        public static final C61963b f140648a = new C61963b();

        static {
            Covode.recordClassIndex(72712);
        }

        C61963b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61962a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("inbox_adapter_notify_fixer", C61962a.class, C61961a.f140643a);
            if (a == null) {
                return new C61962a((byte) 0);
            }
            return a;
        }
    }

    static {
        Covode.recordClassIndex(72710);
    }
}
