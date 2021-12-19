package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e */
public final class C32186e implements Serializable {
    @AbstractC27891c(mo46611a = "device_name")

    /* renamed from: a */
    private final String f76821a;
    @AbstractC27891c(mo46611a = "device_id")

    /* renamed from: b */
    private final Long f76822b;

    static {
        Covode.recordClassIndex(38951);
    }

    public static /* synthetic */ C32186e copy$default(C32186e eVar, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f76821a;
        }
        if ((i & 2) != 0) {
            l = eVar.f76822b;
        }
        return eVar.copy(str, l);
    }

    public final String component1() {
        return this.f76821a;
    }

    public final Long component2() {
        return this.f76822b;
    }

    public final C32186e copy(String str, Long l) {
        return new C32186e(str, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32186e)) {
            return false;
        }
        C32186e eVar = (C32186e) obj;
        return C89219l.m154714a(this.f76821a, eVar.f76821a) && C89219l.m154714a(this.f76822b, eVar.f76822b);
    }

    public final int hashCode() {
        String str = this.f76821a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f76822b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Device(device_name=" + this.f76821a + ", device_id=" + this.f76822b + ")";
    }

    public final Long getDevice_id() {
        return this.f76822b;
    }

    public final String getDevice_name() {
        return this.f76821a;
    }

    public C32186e(String str, Long l) {
        this.f76821a = str;
        this.f76822b = l;
    }
}
