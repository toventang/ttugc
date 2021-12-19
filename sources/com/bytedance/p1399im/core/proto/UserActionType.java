package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.UserActionType */
public enum UserActionType implements WireEnum {
    ENTER_CONVERSATION(1),
    EXIT_CONVERSATION(2);
    
    public static final ProtoAdapter<UserActionType> ADAPTER = new ProtoAdapter_UserActionType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.UserActionType$ProtoAdapter_UserActionType */
    static final class ProtoAdapter_UserActionType extends EnumAdapter<UserActionType> {
        static {
            Covode.recordClassIndex(23542);
        }

        ProtoAdapter_UserActionType() {
            super(UserActionType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final UserActionType fromValue(int i) {
            return UserActionType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23541);
    }

    public static UserActionType fromValue(int i) {
        if (i == 1) {
            return ENTER_CONVERSATION;
        }
        if (i != 2) {
            return null;
        }
        return EXIT_CONVERSATION;
    }

    private UserActionType(int i) {
        this.value = i;
    }
}
