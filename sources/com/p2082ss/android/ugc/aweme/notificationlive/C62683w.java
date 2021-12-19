package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.w */
public final class C62683w {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public final C62684a f142112a;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: b */
    public final C62685b f142113b;
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: c */
    public final int f142114c;

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.w$a */
    public static final class C62684a {
        @AbstractC27891c(mo46611a = "push_status")

        /* renamed from: a */
        public final int f142115a = 2;

        static {
            Covode.recordClassIndex(73487);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C62684a) && this.f142115a == ((C62684a) obj).f142115a;
            }
            return true;
        }

        public final int hashCode() {
            return this.f142115a;
        }

        public final String toString() {
            return "DataBean(pushStatus=" + this.f142115a + ")";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.w$b */
    public static final class C62685b {
        @AbstractC27891c(mo46611a = "now")

        /* renamed from: a */
        public final String f142116a;

        static {
            Covode.recordClassIndex(73488);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C62685b) && C89219l.m154714a(this.f142116a, ((C62685b) obj).f142116a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f142116a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ExtraBean(now=" + this.f142116a + ")";
        }
    }

    static {
        Covode.recordClassIndex(73486);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62683w)) {
            return false;
        }
        C62683w wVar = (C62683w) obj;
        return C89219l.m154714a(this.f142112a, wVar.f142112a) && C89219l.m154714a(this.f142113b, wVar.f142113b) && this.f142114c == wVar.f142114c;
    }

    public final int hashCode() {
        C62684a aVar = this.f142112a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C62685b bVar = this.f142113b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.f142114c;
    }

    public final String toString() {
        return "NotificationLiveStatus(data=" + this.f142112a + ", extra=" + this.f142113b + ", statusCode=" + this.f142114c + ")";
    }

    private C62683w(C62684a aVar) {
        C89219l.m154721d(aVar, "");
        this.f142112a = aVar;
        this.f142113b = null;
        this.f142114c = 0;
    }

    public /* synthetic */ C62683w(C62684a aVar, byte b) {
        this(aVar);
    }
}
