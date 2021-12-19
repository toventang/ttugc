package com.bytedance.ies.xbridge.base.runtime.p1292a;

import com.bytedance.covode.number.Covode;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.a.c */
public enum EnumC18421c {
    STRING("string"),
    BOOL("bool"),
    NUMBER("number"),
    OBJECT("object"),
    ARRAY("array"),
    INT32("int32"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    UNSUPPORTED;
    
    public static final C18422a Companion = new C18422a((byte) 0);

    /* renamed from: b */
    private final String f44012b;

    public static final EnumC18421c getValueByType(String str) {
        return C18422a.m34276a(str);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.a.c$a */
    public static final class C18422a {
        static {
            Covode.recordClassIndex(21095);
        }

        private C18422a() {
        }

        public /* synthetic */ C18422a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC18421c m34276a(String str) {
            C89219l.m154719c(str, "");
            try {
                Locale locale = Locale.getDefault();
                C89219l.m154709a((Object) locale, "");
                String upperCase = str.toUpperCase(locale);
                C89219l.m154709a((Object) upperCase, "");
                return EnumC18421c.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return EnumC18421c.UNSUPPORTED;
            }
        }
    }

    public final String getType() {
        return this.f44012b;
    }

    static {
        Covode.recordClassIndex(21094);
    }

    private /* synthetic */ EnumC18421c(String str) {
        this(null);
    }

    private EnumC18421c(String str) {
        this.f44012b = str;
    }
}
