package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.measurement.gd */
public enum EnumC25975gd {
    DOUBLE(0, EnumC25977gf.SCALAR, EnumC25996gt.DOUBLE),
    FLOAT(1, EnumC25977gf.SCALAR, EnumC25996gt.FLOAT),
    INT64(2, EnumC25977gf.SCALAR, EnumC25996gt.LONG),
    UINT64(3, EnumC25977gf.SCALAR, EnumC25996gt.LONG),
    INT32(4, EnumC25977gf.SCALAR, EnumC25996gt.INT),
    FIXED64(5, EnumC25977gf.SCALAR, EnumC25996gt.LONG),
    FIXED32(6, EnumC25977gf.SCALAR, EnumC25996gt.INT),
    BOOL(7, EnumC25977gf.SCALAR, EnumC25996gt.BOOLEAN),
    STRING(8, EnumC25977gf.SCALAR, EnumC25996gt.STRING),
    MESSAGE(9, EnumC25977gf.SCALAR, EnumC25996gt.MESSAGE),
    BYTES(10, EnumC25977gf.SCALAR, EnumC25996gt.BYTE_STRING),
    UINT32(11, EnumC25977gf.SCALAR, EnumC25996gt.INT),
    ENUM(12, EnumC25977gf.SCALAR, EnumC25996gt.ENUM),
    SFIXED32(13, EnumC25977gf.SCALAR, EnumC25996gt.INT),
    SFIXED64(14, EnumC25977gf.SCALAR, EnumC25996gt.LONG),
    SINT32(15, EnumC25977gf.SCALAR, EnumC25996gt.INT),
    SINT64(16, EnumC25977gf.SCALAR, EnumC25996gt.LONG),
    GROUP(17, EnumC25977gf.SCALAR, EnumC25996gt.MESSAGE),
    DOUBLE_LIST(18, EnumC25977gf.VECTOR, EnumC25996gt.DOUBLE),
    FLOAT_LIST(19, EnumC25977gf.VECTOR, EnumC25996gt.FLOAT),
    INT64_LIST(20, EnumC25977gf.VECTOR, EnumC25996gt.LONG),
    UINT64_LIST(21, EnumC25977gf.VECTOR, EnumC25996gt.LONG),
    INT32_LIST(22, EnumC25977gf.VECTOR, EnumC25996gt.INT),
    FIXED64_LIST(23, EnumC25977gf.VECTOR, EnumC25996gt.LONG),
    FIXED32_LIST(24, EnumC25977gf.VECTOR, EnumC25996gt.INT),
    BOOL_LIST(25, EnumC25977gf.VECTOR, EnumC25996gt.BOOLEAN),
    STRING_LIST(26, EnumC25977gf.VECTOR, EnumC25996gt.STRING),
    MESSAGE_LIST(27, EnumC25977gf.VECTOR, EnumC25996gt.MESSAGE),
    BYTES_LIST(28, EnumC25977gf.VECTOR, EnumC25996gt.BYTE_STRING),
    UINT32_LIST(29, EnumC25977gf.VECTOR, EnumC25996gt.INT),
    ENUM_LIST(30, EnumC25977gf.VECTOR, EnumC25996gt.ENUM),
    SFIXED32_LIST(31, EnumC25977gf.VECTOR, EnumC25996gt.INT),
    SFIXED64_LIST(32, EnumC25977gf.VECTOR, EnumC25996gt.LONG),
    SINT32_LIST(33, EnumC25977gf.VECTOR, EnumC25996gt.INT),
    SINT64_LIST(34, EnumC25977gf.VECTOR, EnumC25996gt.LONG),
    DOUBLE_LIST_PACKED(35, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.DOUBLE),
    FLOAT_LIST_PACKED(36, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.FLOAT),
    INT64_LIST_PACKED(37, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.LONG),
    UINT64_LIST_PACKED(38, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.LONG),
    INT32_LIST_PACKED(39, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.INT),
    FIXED64_LIST_PACKED(40, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.LONG),
    FIXED32_LIST_PACKED(41, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.INT),
    BOOL_LIST_PACKED(42, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.BOOLEAN),
    UINT32_LIST_PACKED(43, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.INT),
    ENUM_LIST_PACKED(44, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.ENUM),
    SFIXED32_LIST_PACKED(45, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.INT),
    SFIXED64_LIST_PACKED(46, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.LONG),
    SINT32_LIST_PACKED(47, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.INT),
    SINT64_LIST_PACKED(48, EnumC25977gf.PACKED_VECTOR, EnumC25996gt.LONG),
    GROUP_LIST(49, EnumC25977gf.VECTOR, EnumC25996gt.MESSAGE),
    MAP(50, EnumC25977gf.MAP, EnumC25996gt.VOID);
    

    /* renamed from: ac */
    private static final EnumC25975gd[] f61192ac;

    /* renamed from: ad */
    private static final Type[] f61193ad = new Type[0];

    /* renamed from: X */
    private final EnumC25996gt f61220X;

    /* renamed from: Y */
    private final int f61221Y;

    /* renamed from: Z */
    private final EnumC25977gf f61222Z;

    /* renamed from: aa */
    private final Class<?> f61223aa;

    /* renamed from: ab */
    private final boolean f61224ab;

    public final int zza() {
        return this.f61221Y;
    }

    static {
        Covode.recordClassIndex(31390);
        EnumC25975gd[] values = values();
        f61192ac = new EnumC25975gd[values.length];
        for (EnumC25975gd gdVar : values) {
            f61192ac[gdVar.f61221Y] = gdVar;
        }
    }

    private EnumC25975gd(int i, EnumC25977gf gfVar, EnumC25996gt gtVar) {
        int i2;
        this.f61221Y = i;
        this.f61222Z = gfVar;
        this.f61220X = gtVar;
        int i3 = C25974gc.f61166a[gfVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.f61223aa = gtVar.zza();
        } else if (i3 != 2) {
            this.f61223aa = null;
        } else {
            this.f61223aa = gtVar.zza();
        }
        this.f61224ab = (gfVar != EnumC25977gf.SCALAR || (i2 = C25974gc.f61167b[gtVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }
}
