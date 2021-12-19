package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.jo */
public enum EnumC26076jo {
    DOUBLE(EnumC26082ju.DOUBLE, 1),
    FLOAT(EnumC26082ju.FLOAT, 5),
    INT64(EnumC26082ju.LONG, 0),
    UINT64(EnumC26082ju.LONG, 0),
    INT32(EnumC26082ju.INT, 0),
    FIXED64(EnumC26082ju.LONG, 1),
    FIXED32(EnumC26082ju.INT, 5),
    BOOL(EnumC26082ju.BOOLEAN, 0),
    STRING {
    },
    GROUP {
    },
    MESSAGE {
    },
    BYTES {
    },
    UINT32(EnumC26082ju.INT, 0),
    ENUM(EnumC26082ju.ENUM, 0),
    SFIXED32(EnumC26082ju.INT, 5),
    SFIXED64(EnumC26082ju.LONG, 1),
    SINT32(EnumC26082ju.INT, 0),
    SINT64(EnumC26082ju.LONG, 0);
    

    /* renamed from: a */
    private final EnumC26082ju f61407a;

    /* renamed from: b */
    private final int f61408b;

    public final EnumC26082ju zza() {
        return this.f61407a;
    }

    public final int zzb() {
        return this.f61408b;
    }

    static {
        Covode.recordClassIndex(31491);
    }

    private EnumC26076jo(EnumC26082ju juVar, int i) {
        this.f61407a = juVar;
        this.f61408b = i;
    }

    /* synthetic */ EnumC26076jo(EnumC26082ju juVar, int i, byte b) {
        this(juVar, i);
    }
}
