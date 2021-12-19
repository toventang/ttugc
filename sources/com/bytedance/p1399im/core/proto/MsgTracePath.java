package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MsgTracePath */
public enum MsgTracePath implements WireEnum {
    FROM_UNKNOWN(0),
    FROM_FRONTIER(1),
    FROM_HTTP(2),
    FROM_SERVER(3);
    
    public static final ProtoAdapter<MsgTracePath> ADAPTER = new ProtoAdapter_MsgTracePath();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.MsgTracePath$ProtoAdapter_MsgTracePath */
    static final class ProtoAdapter_MsgTracePath extends EnumAdapter<MsgTracePath> {
        static {
            Covode.recordClassIndex(23364);
        }

        ProtoAdapter_MsgTracePath() {
            super(MsgTracePath.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MsgTracePath fromValue(int i) {
            return MsgTracePath.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23363);
    }

    public static MsgTracePath fromValue(int i) {
        if (i == 0) {
            return FROM_UNKNOWN;
        }
        if (i == 1) {
            return FROM_FRONTIER;
        }
        if (i == 2) {
            return FROM_HTTP;
        }
        if (i != 3) {
            return null;
        }
        return FROM_SERVER;
    }

    private MsgTracePath(int i) {
        this.value = i;
    }
}
