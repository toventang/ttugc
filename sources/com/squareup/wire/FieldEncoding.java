package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import java.net.ProtocolException;

public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);
    
    final int value;

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.wire.FieldEncoding$1 */
    public static /* synthetic */ class C293181 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$FieldEncoding;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 35678(0x8b5e, float:4.9996E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.squareup.wire.FieldEncoding[] r0 = com.squareup.wire.FieldEncoding.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.squareup.wire.FieldEncoding.C293181.$SwitchMap$com$squareup$wire$FieldEncoding = r2
                com.squareup.wire.FieldEncoding r0 = com.squareup.wire.FieldEncoding.VARINT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.squareup.wire.FieldEncoding.C293181.$SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.squareup.wire.FieldEncoding r0 = com.squareup.wire.FieldEncoding.FIXED32     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.squareup.wire.FieldEncoding.C293181.$SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x002e }
                com.squareup.wire.FieldEncoding r0 = com.squareup.wire.FieldEncoding.FIXED64     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.squareup.wire.FieldEncoding.C293181.$SwitchMap$com$squareup$wire$FieldEncoding     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.squareup.wire.FieldEncoding r0 = com.squareup.wire.FieldEncoding.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.FieldEncoding.C293181.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(35677);
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i = C293181.$SwitchMap$com$squareup$wire$FieldEncoding[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new AssertionError();
    }

    static FieldEncoding get(int i) {
        if (i == 0) {
            return VARINT;
        }
        if (i == 1) {
            return FIXED64;
        }
        if (i == 2) {
            return LENGTH_DELIMITED;
        }
        if (i == 5) {
            return FIXED32;
        }
        throw new ProtocolException("Unexpected FieldEncoding: ".concat(String.valueOf(i)));
    }

    private FieldEncoding(int i) {
        this.value = i;
    }
}
