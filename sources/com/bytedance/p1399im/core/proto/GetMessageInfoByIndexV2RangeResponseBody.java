package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody */
public final class GetMessageInfoByIndexV2RangeResponseBody extends Message<GetMessageInfoByIndexV2RangeResponseBody, Builder> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody> ADAPTER = new ProtoAdapter_GetMessageInfoByIndexV2RangeResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_INDEX_IN_CONVERSATION_V2 = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "infos")
    public final List<MessageInfo> infos;
    @AbstractC27891c(mo46611a = "next_index_in_conversation_v2")
    public final Long next_index_in_conversation_v2;

    /* renamed from: com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody$ProtoAdapter_GetMessageInfoByIndexV2RangeResponseBody */
    static final class ProtoAdapter_GetMessageInfoByIndexV2RangeResponseBody extends ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody> {
        static {
            Covode.recordClassIndex(23199);
        }

        public ProtoAdapter_GetMessageInfoByIndexV2RangeResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageInfoByIndexV2RangeResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.GetMessageInfoByIndexV2RangeResponseBody redact(com.bytedance.p1399im.core.proto.GetMessageInfoByIndexV2RangeResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageInfo> r1 = r2.infos
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageInfo> r0 = com.bytedance.p1399im.core.proto.MessageInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.GetMessageInfoByIndexV2RangeResponseBody.ProtoAdapter_GetMessageInfoByIndexV2RangeResponseBody.redact(com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody):com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody");
        }

        public final int encodedSize(GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
            return MessageInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessageInfoByIndexV2RangeResponseBody.infos) + ProtoAdapter.INT64.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeResponseBody.next_index_in_conversation_v2) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeResponseBody.has_more) + getMessageInfoByIndexV2RangeResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RangeResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.infos.add(MessageInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.next_index_in_conversation_v2(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
            MessageInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RangeResponseBody.infos);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RangeResponseBody.next_index_in_conversation_v2);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RangeResponseBody.has_more);
            protoWriter.writeBytes(getMessageInfoByIndexV2RangeResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody$Builder */
    public static final class Builder extends Message.Builder<GetMessageInfoByIndexV2RangeResponseBody, Builder> {
        public Boolean has_more;
        public List<MessageInfo> infos = Internal.newMutableList();
        public Long next_index_in_conversation_v2;

        static {
            Covode.recordClassIndex(23198);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetMessageInfoByIndexV2RangeResponseBody build() {
            return new GetMessageInfoByIndexV2RangeResponseBody(this.infos, this.next_index_in_conversation_v2, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_index_in_conversation_v2(Long l) {
            this.next_index_in_conversation_v2 = l;
            return this;
        }

        public final Builder infos(List<MessageInfo> list) {
            Internal.checkElementsNotNull(list);
            this.infos = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23197);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetMessageInfoByIndexV2RangeResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.infos = Internal.copyOf("infos", this.infos);
        builder.next_index_in_conversation_v2 = this.next_index_in_conversation_v2;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetMessageInfoByIndexV2RangeResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool) {
        this(list, l, bool, C89427i.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool, C89427i iVar) {
        super(ADAPTER, iVar);
        this.infos = Internal.immutableCopyOf("infos", list);
        this.next_index_in_conversation_v2 = l;
        this.has_more = bool;
    }
}
