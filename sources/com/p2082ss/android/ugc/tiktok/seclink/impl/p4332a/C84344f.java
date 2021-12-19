package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.f */
public final class C84344f {

    /* renamed from: a */
    public static final C84345a f188583a = new C84345a();

    /* renamed from: b */
    public static final C84344f f188584b = new C84344f();

    private C84344f() {
    }

    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.f$a */
    public static final class C84345a {
        @AbstractC27891c(mo46611a = "sync_firstjump_switch")

        /* renamed from: a */
        public final boolean f188585a;
        @AbstractC27891c(mo46611a = "sync_timeout")

        /* renamed from: b */
        public final long f188586b;
        @AbstractC27891c(mo46611a = "sync_white_list")

        /* renamed from: c */
        public final List<String> f188587c;

        static {
            Covode.recordClassIndex(98296);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84345a)) {
                return false;
            }
            C84345a aVar = (C84345a) obj;
            return this.f188585a == aVar.f188585a && this.f188586b == aVar.f188586b && C89219l.m154714a(this.f188587c, aVar.f188587c);
        }

        public final String toString() {
            return "SeclinkSwitch(enable=" + this.f188585a + ", timeout=" + this.f188586b + ", white_list=" + this.f188587c + ")";
        }

        public /* synthetic */ C84345a() {
            this(new ArrayList());
        }

        public final int hashCode() {
            int i;
            boolean z = this.f188585a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            long j = this.f188586b;
            int i5 = ((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            List<String> list = this.f188587c;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            return i5 + i;
        }

        private C84345a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f188585a = false;
            this.f188586b = 1000;
            this.f188587c = list;
        }
    }

    static {
        Covode.recordClassIndex(98295);
    }

    /* renamed from: a */
    public static C84345a m145090a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C84345a aVar = f188583a;
            C84345a aVar2 = (C84345a) a.mo25397a("force_seclink_sync_firstjump", C84345a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f188583a;
        }
    }
}
