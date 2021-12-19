package com.bytedance.ies.powerpermissions.p1240c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.c.a */
public final class C17749a {

    /* renamed from: a */
    public final String f42425a;

    /* renamed from: b */
    public final EnumC17750a f42426b;

    /* renamed from: com.bytedance.ies.powerpermissions.c.a$a */
    public enum EnumC17750a {
        GRANTED,
        THIS_OPERATION_NOT_PERMITTED,
        DENIED_PERMANENT;

        static {
            Covode.recordClassIndex(20314);
        }
    }

    static {
        Covode.recordClassIndex(20313);
    }

    /* renamed from: a */
    public final boolean mo28231a() {
        if (this.f42426b == EnumC17750a.GRANTED) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "[" + this.f42425a + ':' + this.f42426b + ']';
    }

    public C17749a(String str, EnumC17750a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        this.f42425a = str;
        this.f42426b = aVar;
    }
}
