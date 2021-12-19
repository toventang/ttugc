package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody */
public final class BatchUnmarkMessageRequestBody extends Message<BatchUnmarkMessageRequestBody, Builder> {
    public static final ProtoAdapter<BatchUnmarkMessageRequestBody> ADAPTER = new ProtoAdapter_BatchUnmarkMessageRequestBody();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_TAG = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "action_type")
    public final ActionType action_type;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "server_message_ids")
    public final List<Long> server_message_ids;
    @AbstractC27891c(mo46611a = "tag")
    public final Long tag;

    /* renamed from: com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody$ProtoAdapter_BatchUnmarkMessageRequestBody */
    static final class ProtoAdapter_BatchUnmarkMessageRequestBody extends ProtoAdapter<BatchUnmarkMessageRequestBody> {
        static {
            Covode.recordClassIndex(22933);
        }

        public ProtoAdapter_BatchUnmarkMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BatchUnmarkMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BatchUnmarkMessageRequestBody redact(com.bytedance.p1399im.core.proto.BatchUnmarkMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BatchUnmarkMessageRequestBody.ProtoAdapter_BatchUnmarkMessageRequestBody.redact(com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody):com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody");
        }

        public final int encodedSize(BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, batchUnmarkMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, batchUnmarkMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, batchUnmarkMessageRequestBody.conversation_short_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, batchUnmarkMessageRequestBody.server_message_ids) + ActionType.ADAPTER.encodedSizeWithTag(5, batchUnmarkMessageRequestBody.action_type) + ProtoAdapter.INT64.encodedSizeWithTag(6, batchUnmarkMessageRequestBody.tag) + batchUnmarkMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUnmarkMessageRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.server_message_ids.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            try {
                                builder.action_type(ActionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.tag(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BatchUnmarkMessageRequestBody batchUnmarkMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUnmarkMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, batchUnmarkMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, batchUnmarkMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, batchUnmarkMessageRequestBody.server_message_ids);
            ActionType.ADAPTER.encodeWithTag(protoWriter, 5, batchUnmarkMessageRequestBody.action_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, batchUnmarkMessageRequestBody.tag);
            protoWriter.writeBytes(batchUnmarkMessageRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody$Builder */
    public static final class Builder extends Message.Builder<BatchUnmarkMessageRequestBody, Builder> {
        public ActionType action_type;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> server_message_ids = Internal.newMutableList();
        public Long tag;

        static {
            Covode.recordClassIndex(22932);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BatchUnmarkMessageRequestBody build() {
            return new BatchUnmarkMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_ids, this.action_type, this.tag, super.buildUnknownFields());
        }

        public final Builder action_type(ActionType actionType) {
            this.action_type = actionType;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder tag(Long l) {
            this.tag = l;
            return this;
        }

        public final Builder server_message_ids(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.server_message_ids = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BatchUnmarkMessageRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(22931);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BatchUnmarkMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_ids = Internal.copyOf("server_message_ids", this.server_message_ids);
        builder.action_type = this.action_type;
        builder.tag = this.tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, ActionType actionType, Long l2) {
        this(str, num, l, list, actionType, l2, C89427i.EMPTY);
    }

    public BatchUnmarkMessageRequestBody(String str, Integer num, Long l, List<Long> list, ActionType actionType, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_ids = Internal.immutableCopyOf("server_message_ids", list);
        this.action_type = actionType;
        this.tag = l2;
    }
}
