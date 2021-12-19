package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ConvCountReport */
public final class ConvCountReport extends Message<ConvCountReport, Builder> {
    public static final ProtoAdapter<ConvCountReport> ADAPTER = new ProtoAdapter_ConvCountReport();
    public static final ConversationType DEFAULT_CONVERSATION_TYPE = ConversationType.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Integer DEFAULT_CUSTOMED_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final ConversationType conversation_type;
    @AbstractC27891c(mo46611a = "customed_conversation_type")
    public final Integer customed_conversation_type;
    @AbstractC27891c(mo46611a = "unread_count")
    public final Long unread_count;

    /* renamed from: com.bytedance.im.core.proto.ConvCountReport$ProtoAdapter_ConvCountReport */
    static final class ProtoAdapter_ConvCountReport extends ProtoAdapter<ConvCountReport> {
        static {
            Covode.recordClassIndex(23002);
        }

        public ProtoAdapter_ConvCountReport() {
            super(FieldEncoding.LENGTH_DELIMITED, ConvCountReport.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConvCountReport$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ConvCountReport redact(com.bytedance.p1399im.core.proto.ConvCountReport r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConvCountReport$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConvCountReport r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ConvCountReport.ProtoAdapter_ConvCountReport.redact(com.bytedance.im.core.proto.ConvCountReport):com.bytedance.im.core.proto.ConvCountReport");
        }

        public final int encodedSize(ConvCountReport convCountReport) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, convCountReport.conv_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, convCountReport.unread_count) + ConversationType.ADAPTER.encodedSizeWithTag(3, convCountReport.conversation_type) + ProtoAdapter.INT32.encodedSizeWithTag(4, convCountReport.customed_conversation_type) + convCountReport.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConvCountReport decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.unread_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 3) {
                    try {
                        builder.conversation_type(ConversationType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.customed_conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConvCountReport convCountReport) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, convCountReport.conv_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, convCountReport.unread_count);
            ConversationType.ADAPTER.encodeWithTag(protoWriter, 3, convCountReport.conversation_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, convCountReport.customed_conversation_type);
            protoWriter.writeBytes(convCountReport.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConvCountReport$Builder */
    public static final class Builder extends Message.Builder<ConvCountReport, Builder> {
        public Long conv_short_id;
        public ConversationType conversation_type;
        public Integer customed_conversation_type;
        public Long unread_count;

        static {
            Covode.recordClassIndex(23001);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConvCountReport build() {
            return new ConvCountReport(this.conv_short_id, this.unread_count, this.conversation_type, this.customed_conversation_type, super.buildUnknownFields());
        }

        public final Builder conv_short_id(Long l) {
            this.conv_short_id = l;
            return this;
        }

        public final Builder conversation_type(ConversationType conversationType) {
            this.conversation_type = conversationType;
            return this;
        }

        public final Builder customed_conversation_type(Integer num) {
            this.customed_conversation_type = num;
            return this;
        }

        public final Builder unread_count(Long l) {
            this.unread_count = l;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConvCountReport$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConvCountReport, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.unread_count = this.unread_count;
        builder.conversation_type = this.conversation_type;
        builder.customed_conversation_type = this.customed_conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConvCountReport" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23000);
    }

    public ConvCountReport(Long l, Long l2, ConversationType conversationType, Integer num) {
        this(l, l2, conversationType, num, C89427i.EMPTY);
    }

    public ConvCountReport(Long l, Long l2, ConversationType conversationType, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l;
        this.unread_count = l2;
        this.conversation_type = conversationType;
        this.customed_conversation_type = num;
    }
}
