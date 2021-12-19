package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class AbstractC25132g {
    static {
        Covode.recordClassIndex(30498);
    }

    /* renamed from: a */
    public abstract EnumC25133a mo41105a();

    /* renamed from: b */
    public abstract long mo41106b();

    /* renamed from: c */
    public static AbstractC25132g m48192c() {
        return new C25126b(EnumC25133a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: d */
    public static AbstractC25132g m48193d() {
        return new C25126b(EnumC25133a.FATAL_ERROR, -1);
    }

    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public enum EnumC25133a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR;

        static {
            Covode.recordClassIndex(30499);
        }
    }
}
