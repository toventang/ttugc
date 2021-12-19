package com.p2082ss.android.ugc.aweme.p2917f.p2918a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.f.a.b */
public final class C47177b {

    /* renamed from: a */
    public String f109806a;

    /* renamed from: b */
    public String f109807b;

    /* renamed from: c */
    public List<C22027b> f109808c;

    static {
        Covode.recordClassIndex(55781);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47177b)) {
            return false;
        }
        C47177b bVar = (C47177b) obj;
        return C89219l.m154714a(this.f109806a, bVar.f109806a) && C89219l.m154714a(this.f109807b, bVar.f109807b) && C89219l.m154714a(this.f109808c, bVar.f109808c);
    }

    public final int hashCode() {
        String str = this.f109806a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f109807b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C22027b> list = this.f109808c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("URL:         ").append(this.f109806a).append("\r\n\r\nHEADERS:          ");
        List<C22027b> list = this.f109808c;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        return append.append(str).append("\r\n\r\nRESPONSE:         ").append(this.f109807b).append("\r\n\r\n").toString();
    }
}
