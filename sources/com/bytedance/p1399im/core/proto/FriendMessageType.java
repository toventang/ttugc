package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.FriendMessageType */
public enum FriendMessageType implements WireEnum {
    SendApply(1),
    DeleteFriend(2),
    AddFriend(3);
    
    public static final ProtoAdapter<FriendMessageType> ADAPTER = new ProtoAdapter_FriendMessageType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.FriendMessageType$ProtoAdapter_FriendMessageType */
    static final class ProtoAdapter_FriendMessageType extends EnumAdapter<FriendMessageType> {
        static {
            Covode.recordClassIndex(23115);
        }

        ProtoAdapter_FriendMessageType() {
            super(FriendMessageType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final FriendMessageType fromValue(int i) {
            return FriendMessageType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23114);
    }

    public static FriendMessageType fromValue(int i) {
        if (i == 1) {
            return SendApply;
        }
        if (i == 2) {
            return DeleteFriend;
        }
        if (i != 3) {
            return null;
        }
        return AddFriend;
    }

    private FriendMessageType(int i) {
        this.value = i;
    }
}
