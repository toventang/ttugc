package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SortType */
public enum SortType implements WireEnum {
    JOIN_TIME(1),
    CREATED_TIME(2),
    GROUP_NAME(3),
    ACTIVE_TIME(4);
    
    public static final ProtoAdapter<SortType> ADAPTER = new ProtoAdapter_SortType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.SortType$ProtoAdapter_SortType */
    static final class ProtoAdapter_SortType extends EnumAdapter<SortType> {
        static {
            Covode.recordClassIndex(23495);
        }

        ProtoAdapter_SortType() {
            super(SortType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SortType fromValue(int i) {
            return SortType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23494);
    }

    public static SortType fromValue(int i) {
        if (i == 1) {
            return JOIN_TIME;
        }
        if (i == 2) {
            return CREATED_TIME;
        }
        if (i == 3) {
            return GROUP_NAME;
        }
        if (i != 4) {
            return null;
        }
        return ACTIVE_TIME;
    }

    private SortType(int i) {
        this.value = i;
    }
}
