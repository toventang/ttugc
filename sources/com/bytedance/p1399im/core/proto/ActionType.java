package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ActionType */
public enum ActionType implements WireEnum {
    UNKNOWN_ACTION(0),
    FAVORITE(1),
    PIN(2),
    UNREAD(3);
    
    public static final ProtoAdapter<ActionType> ADAPTER = new ProtoAdapter_ActionType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.ActionType$ProtoAdapter_ActionType */
    static final class ProtoAdapter_ActionType extends EnumAdapter<ActionType> {
        static {
            Covode.recordClassIndex(22903);
        }

        ProtoAdapter_ActionType() {
            super(ActionType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ActionType fromValue(int i) {
            return ActionType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(22902);
    }

    public static ActionType fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i == 1) {
            return FAVORITE;
        }
        if (i == 2) {
            return PIN;
        }
        if (i != 3) {
            return null;
        }
        return UNREAD;
    }

    private ActionType(int i) {
        this.value = i;
    }
}
