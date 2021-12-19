package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.GroupRole */
public enum GroupRole implements WireEnum {
    ORDINARY(0),
    OWNER(1),
    MANAGER(2),
    VISITOR(3),
    SYSTEM(4);
    
    public static final ProtoAdapter<GroupRole> ADAPTER = new ProtoAdapter_GroupRole();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.GroupRole$ProtoAdapter_GroupRole */
    static final class ProtoAdapter_GroupRole extends EnumAdapter<GroupRole> {
        static {
            Covode.recordClassIndex(23249);
        }

        ProtoAdapter_GroupRole() {
            super(GroupRole.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final GroupRole fromValue(int i) {
            return GroupRole.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23248);
    }

    public static GroupRole fromValue(int i) {
        if (i == 0) {
            return ORDINARY;
        }
        if (i == 1) {
            return OWNER;
        }
        if (i == 2) {
            return MANAGER;
        }
        if (i == 3) {
            return VISITOR;
        }
        if (i != 4) {
            return null;
        }
        return SYSTEM;
    }

    private GroupRole(int i) {
        this.value = i;
    }
}
