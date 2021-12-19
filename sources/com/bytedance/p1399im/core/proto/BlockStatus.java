package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.BlockStatus */
public enum BlockStatus implements WireEnum {
    UNBLOCK(0),
    BLOCK(1);
    
    public static final ProtoAdapter<BlockStatus> ADAPTER = new ProtoAdapter_BlockStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.BlockStatus$ProtoAdapter_BlockStatus */
    static final class ProtoAdapter_BlockStatus extends EnumAdapter<BlockStatus> {
        static {
            Covode.recordClassIndex(22956);
        }

        ProtoAdapter_BlockStatus() {
            super(BlockStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BlockStatus fromValue(int i) {
            return BlockStatus.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22955);
    }

    public static BlockStatus fromValue(int i) {
        if (i == 0) {
            return UNBLOCK;
        }
        if (i != 1) {
            return null;
        }
        return BLOCK;
    }

    private BlockStatus(int i) {
        this.value = i;
    }
}
