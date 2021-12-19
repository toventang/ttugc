package com.bytedance.android.live.liveinteract.platform.common.p375f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.f.a */
public final class C5701a {

    /* renamed from: a */
    public boolean f14453a;

    /* renamed from: b */
    public boolean f14454b;

    /* renamed from: c */
    public boolean f14455c;

    /* renamed from: d */
    public Boolean f14456d;

    /* renamed from: e */
    public Boolean f14457e;

    static {
        Covode.recordClassIndex(6299);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5701a)) {
            return false;
        }
        C5701a aVar = (C5701a) obj;
        return C89219l.m154714a(this.f14456d, aVar.f14456d) && C89219l.m154714a(this.f14457e, aVar.f14457e);
    }

    public final int hashCode() {
        Boolean bool = this.f14456d;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.f14457e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PermissionStatus(coHost=" + this.f14456d + ", multiGuest=" + this.f14457e + ")";
    }

    private C5701a() {
        this.f14456d = null;
        this.f14457e = null;
    }

    /* renamed from: a */
    public final boolean mo11467a() {
        if (this.f14456d == null || this.f14457e == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo11468b() {
        if (!mo11467a()) {
            return -1;
        }
        Boolean bool = this.f14456d;
        if (bool == null) {
            C89219l.m154715b();
        }
        if (bool.booleanValue()) {
            Boolean bool2 = this.f14457e;
            if (bool2 == null) {
                C89219l.m154715b();
            }
            if (bool2.booleanValue()) {
                return 3;
            }
        }
        Boolean bool3 = this.f14456d;
        if (bool3 == null) {
            C89219l.m154715b();
        }
        if (bool3.booleanValue()) {
            Boolean bool4 = this.f14457e;
            if (bool4 == null) {
                C89219l.m154715b();
            }
            if (!bool4.booleanValue()) {
                return 1;
            }
        }
        Boolean bool5 = this.f14457e;
        if (bool5 == null) {
            C89219l.m154715b();
        }
        if (!bool5.booleanValue()) {
            return 0;
        }
        Boolean bool6 = this.f14456d;
        if (bool6 == null) {
            C89219l.m154715b();
        }
        if (!bool6.booleanValue()) {
            return 2;
        }
        return 0;
    }

    public /* synthetic */ C5701a(byte b) {
        this();
    }
}
