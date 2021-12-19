package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.TicketType */
public enum TicketType implements WireEnum {
    TICKET_TYPE_APP(1),
    TICKET_TYPE_PC(2),
    TICKET_TYPE_WEB(3);
    
    public static final ProtoAdapter<TicketType> ADAPTER = new ProtoAdapter_TicketType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    /* renamed from: com.bytedance.im.core.proto.TicketType$ProtoAdapter_TicketType */
    static final class ProtoAdapter_TicketType extends EnumAdapter<TicketType> {
        static {
            Covode.recordClassIndex(23505);
        }

        ProtoAdapter_TicketType() {
            super(TicketType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final TicketType fromValue(int i) {
            return TicketType.fromValue(i);
        }
    }

    static {
        Covode.recordClassIndex(23504);
    }

    public static TicketType fromValue(int i) {
        if (i == 1) {
            return TICKET_TYPE_APP;
        }
        if (i == 2) {
            return TICKET_TYPE_PC;
        }
        if (i != 3) {
            return null;
        }
        return TICKET_TYPE_WEB;
    }

    private TicketType(int i) {
        this.value = i;
    }
}
