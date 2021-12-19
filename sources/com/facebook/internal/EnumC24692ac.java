package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.ac */
public enum EnumC24692ac {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<EnumC24692ac> ALL = EnumSet.allOf(EnumC24692ac.class);

    /* renamed from: a */
    private final long f58623a;

    public final long getValue() {
        return this.f58623a;
    }

    static {
        Covode.recordClassIndex(28845);
    }

    public static EnumSet<EnumC24692ac> parseOptions(long j) {
        EnumSet<EnumC24692ac> noneOf = EnumSet.noneOf(EnumC24692ac.class);
        Iterator it = ALL.iterator();
        while (it.hasNext()) {
            EnumC24692ac acVar = (EnumC24692ac) it.next();
            if ((acVar.getValue() & j) != 0) {
                noneOf.add(acVar);
            }
        }
        return noneOf;
    }

    private EnumC24692ac(long j) {
        this.f58623a = j;
    }
}
