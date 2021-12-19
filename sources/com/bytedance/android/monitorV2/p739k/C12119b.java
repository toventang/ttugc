package com.bytedance.android.monitorV2.p739k;

import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.covode.number.Covode;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.k.b */
public final class C12119b {

    /* renamed from: a */
    public final int f29144a;

    /* renamed from: b */
    public final String f29145b;

    /* renamed from: c */
    public final String f29146c;

    /* renamed from: d */
    public final String f29147d;

    static {
        Covode.recordClassIndex(13848);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12119b) {
                C12119b bVar = (C12119b) obj;
                if (this.f29144a != bVar.f29144a || !C89219l.m154714a((Object) this.f29145b, (Object) bVar.f29145b) || !C89219l.m154714a((Object) this.f29146c, (Object) bVar.f29146c) || !C89219l.m154714a((Object) this.f29147d, (Object) bVar.f29147d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f29144a * 31;
        String str = this.f29145b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29146c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29147d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ContainerError(errCode=" + this.f29144a + ", errorMsg=" + this.f29145b + ", virtualAid=" + this.f29146c + ", biz=" + this.f29147d + ")";
    }

    /* renamed from: a */
    public final C12082b mo19490a() {
        return new C12082b(C89041ag.m154421a(C89387v.m154943a("container_load_error_code", Integer.valueOf(this.f29144a)), C89387v.m154943a("container_load_error_msg", this.f29145b)));
    }

    public /* synthetic */ C12119b(String str) {
        this(str, "", "");
    }

    private C12119b(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f29144a = 100;
        this.f29145b = str;
        this.f29146c = str2;
        this.f29147d = str3;
    }
}
