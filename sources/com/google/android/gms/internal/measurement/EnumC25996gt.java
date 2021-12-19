package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.gt */
public enum EnumC25996gt {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(AbstractC25943fb.class, AbstractC25943fb.class, AbstractC25943fb.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: a */
    private final Class<?> f61266a;

    /* renamed from: b */
    private final Class<?> f61267b;

    /* renamed from: c */
    private final Object f61268c;

    public final Class<?> zza() {
        return this.f61267b;
    }

    static {
        Covode.recordClassIndex(31411);
    }

    private EnumC25996gt(Class cls, Class cls2, Object obj) {
        this.f61266a = cls;
        this.f61267b = cls2;
        this.f61268c = obj;
    }
}
