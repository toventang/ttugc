package com.bytedance.helios.api.p1090c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15308f;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.c.b */
public final class C15326b implements AbstractC15308f {

    /* renamed from: a */
    public final Thread f37402a;

    /* renamed from: b */
    public final Throwable f37403b;

    /* renamed from: c */
    public final String f37404c;

    /* renamed from: d */
    public final Map<String, String> f37405d;

    static {
        Covode.recordClassIndex(17556);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15326b)) {
            return false;
        }
        C15326b bVar = (C15326b) obj;
        return C89219l.m154714a(this.f37402a, bVar.f37402a) && C89219l.m154714a(this.f37403b, bVar.f37403b) && C89219l.m154714a(this.f37404c, bVar.f37404c) && C89219l.m154714a(this.f37405d, bVar.f37405d);
    }

    public final int hashCode() {
        Thread thread = this.f37402a;
        int i = 0;
        int hashCode = (thread != null ? thread.hashCode() : 0) * 31;
        Throwable th = this.f37403b;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str = this.f37404c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.f37405d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ExceptionEvent(thread=" + this.f37402a + ", e=" + this.f37403b + ", label=" + this.f37404c + ", data=" + this.f37405d + ")";
    }

    public C15326b(Thread thread, Throwable th, String str, Map<String, String> map) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        this.f37402a = thread;
        this.f37403b = th;
        this.f37404c = str;
        this.f37405d = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15326b(Thread thread, Throwable th, String str, Map map, int i) {
        this((i & 1) != 0 ? null : thread, th, str, (i & 8) != 0 ? null : map);
    }
}
