package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.BlockType */
public enum BlockType implements WireEnum {
    MEMBER(1),
    CONVERSATION_NOT_MANAGERS(2),
    CONVERSATION_ALL(3);
    
    public static final ProtoAdapter<BlockType> ADAPTER = new ProtoAdapter_BlockType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.BlockType$ProtoAdapter_BlockType */
    static final class ProtoAdapter_BlockType extends EnumAdapter<BlockType> {
        static {
            Covode.recordClassIndex(22958);
        }

        ProtoAdapter_BlockType() {
            super(BlockType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BlockType fromValue(int i) {
            return BlockType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22957);
    }

    public static BlockType fromValue(int i) {
        if (i == 1) {
            return MEMBER;
        }
        if (i == 2) {
            return CONVERSATION_NOT_MANAGERS;
        }
        if (i != 3) {
            return null;
        }
        return CONVERSATION_ALL;
    }

    private BlockType(int i) {
        this.value = i;
    }
}
