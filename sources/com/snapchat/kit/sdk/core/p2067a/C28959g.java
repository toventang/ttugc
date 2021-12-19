package com.snapchat.kit.sdk.core.p2067a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.a.g */
public class C28959g {
    @AbstractC27891c(mo46611a = "error")

    /* renamed from: a */
    public String f68425a;
    @AbstractC27891c(mo46611a = "error_description")

    /* renamed from: b */
    public String f68426b;
    @AbstractC27891c(mo46611a = "message")

    /* renamed from: c */
    public String f68427c;

    static {
        Covode.recordClassIndex(35143);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f68425a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode() * 37;
        }
        int i2 = hashCode + 17;
        String str2 = this.f68426b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode() * 37;
        }
        int i3 = i2 + hashCode2;
        String str3 = this.f68427c;
        if (str3 != null) {
            i = str3.hashCode() * 37;
        }
        return i3 + i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C28959g)) {
            C28959g gVar = (C28959g) obj;
            if (!Objects.equals(this.f68425a, gVar.f68425a) || !Objects.equals(this.f68426b, gVar.f68426b) || !Objects.equals(this.f68427c, gVar.f68427c)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
