package com.bytedance.ies.p1208im.core.api.p1220j;

import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.api.j.b */
public final class C17470b {

    /* renamed from: d */
    public static final C17470b f41825d = new C17470b(EnumC13655c.CONNECTION_UNKNOWN, null);

    /* renamed from: e */
    public static final C17471a f41826e = new C17471a((byte) 0);

    /* renamed from: a */
    public final EnumC13655c f41827a;

    /* renamed from: b */
    public final String f41828b;

    /* renamed from: c */
    public final String f41829c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17470b)) {
            return false;
        }
        C17470b bVar = (C17470b) obj;
        return C89219l.m154714a(this.f41827a, bVar.f41827a) && C89219l.m154714a(this.f41828b, bVar.f41828b) && C89219l.m154714a(this.f41829c, bVar.f41829c);
    }

    public final int hashCode() {
        EnumC13655c cVar = this.f41827a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f41828b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41829c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "WsStateInfo(state=" + this.f41827a + ", url=" + this.f41828b + ", sessionId=" + this.f41829c + ")";
    }

    /* renamed from: com.bytedance.ies.im.core.api.j.b$a */
    public static final class C17471a {
        static {
            Covode.recordClassIndex(19958);
        }

        private C17471a() {
        }

        public /* synthetic */ C17471a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(19957);
    }

    public C17470b(EnumC13655c cVar, String str) {
        C89219l.m154721d(cVar, "");
        this.f41827a = cVar;
        this.f41828b = str;
    }
}
