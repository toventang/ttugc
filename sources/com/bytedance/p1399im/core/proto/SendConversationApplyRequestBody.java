package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.SendConversationApplyRequestBody */
public final class SendConversationApplyRequestBody extends Message<SendConversationApplyRequestBody, Builder> {
    public static final ProtoAdapter<SendConversationApplyRequestBody> ADAPTER;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_INVITE_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "apply_reason")
    public final String apply_reason;
    @AbstractC27891c(mo46611a = "bizExt")
    public final Map<String, String> bizExt;
    @AbstractC27891c(mo46611a = "conv_short_id")
    public final Long conv_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "invite_user_id")
    public final Long invite_user_id;
    @AbstractC27891c(mo46611a = "invited_user_ids")
    public final List<Long> invited_user_ids;

    /* renamed from: com.bytedance.im.core.proto.SendConversationApplyRequestBody$ProtoAdapter_SendConversationApplyRequestBody */
    static final class ProtoAdapter_SendConversationApplyRequestBody extends ProtoAdapter<SendConversationApplyRequestBody> {
        private final ProtoAdapter<Map<String, String>> bizExt;

        static {
            Covode.recordClassIndex(23459);
        }

        public ProtoAdapter_SendConversationApplyRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendConversationApplyRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.bizExt = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.SendConversationApplyRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.SendConversationApplyRequestBody redact(com.bytedance.p1399im.core.proto.SendConversationApplyRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SendConversationApplyRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SendConversationApplyRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.SendConversationApplyRequestBody.ProtoAdapter_SendConversationApplyRequestBody.redact(com.bytedance.im.core.proto.SendConversationApplyRequestBody):com.bytedance.im.core.proto.SendConversationApplyRequestBody");
        }

        public final int encodedSize(SendConversationApplyRequestBody sendConversationApplyRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, sendConversationApplyRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendConversationApplyRequestBody.conversation_type) + this.bizExt.encodedSizeWithTag(3, sendConversationApplyRequestBody.bizExt) + ProtoAdapter.INT64.encodedSizeWithTag(4, sendConversationApplyRequestBody.invite_user_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(5, sendConversationApplyRequestBody.invited_user_ids) + ProtoAdapter.STRING.encodedSizeWithTag(6, sendConversationApplyRequestBody.apply_reason) + sendConversationApplyRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendConversationApplyRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.bizExt.putAll(this.bizExt.decode(protoReader));
                            break;
                        case 4:
                            builder.invite_user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.invited_user_ids.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.apply_reason(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendConversationApplyRequestBody sendConversationApplyRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sendConversationApplyRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendConversationApplyRequestBody.conversation_type);
            this.bizExt.encodeWithTag(protoWriter, 3, sendConversationApplyRequestBody.bizExt);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, sendConversationApplyRequestBody.invite_user_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 5, sendConversationApplyRequestBody.invited_user_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendConversationApplyRequestBody.apply_reason);
            protoWriter.writeBytes(sendConversationApplyRequestBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2024, ADAPTER);
    }

    /* renamed from: com.bytedance.im.core.proto.SendConversationApplyRequestBody$Builder */
    public static final class Builder extends Message.Builder<SendConversationApplyRequestBody, Builder> {
        public String apply_reason;
        public Map<String, String> bizExt = Internal.newMutableMap();
        public Long conv_short_id;
        public Integer conversation_type;
        public Long invite_user_id;
        public List<Long> invited_user_ids = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23458);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendConversationApplyRequestBody build() {
            return new SendConversationApplyRequestBody(this.conv_short_id, this.conversation_type, this.bizExt, this.invite_user_id, this.invited_user_ids, this.apply_reason, super.buildUnknownFields());
        }

        public final Builder apply_reason(String str) {
            this.apply_reason = str;
            return this;
        }

        public final Builder conv_short_id(Long l) {
            this.conv_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder invite_user_id(Long l) {
            this.invite_user_id = l;
            return this;
        }

        public final Builder bizExt(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.bizExt = map;
            return this;
        }

        public final Builder invited_user_ids(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.invited_user_ids = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendConversationApplyRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23457);
        ProtoAdapter_SendConversationApplyRequestBody protoAdapter_SendConversationApplyRequestBody = new ProtoAdapter_SendConversationApplyRequestBody();
        ADAPTER = protoAdapter_SendConversationApplyRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2024, protoAdapter_SendConversationApplyRequestBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendConversationApplyRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendConversationApplyRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.bizExt = Internal.copyOf("bizExt", this.bizExt);
        builder.invite_user_id = this.invite_user_id;
        builder.invited_user_ids = Internal.copyOf("invited_user_ids", this.invited_user_ids);
        builder.apply_reason = this.apply_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SendConversationApplyRequestBody(Long l, Integer num, Map<String, String> map, Long l2, List<Long> list, String str) {
        this(l, num, map, l2, list, str, C89427i.EMPTY);
    }

    public SendConversationApplyRequestBody(Long l, Integer num, Map<String, String> map, Long l2, List<Long> list, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l;
        this.conversation_type = num;
        this.bizExt = Internal.immutableCopyOf("bizExt", map);
        this.invite_user_id = l2;
        this.invited_user_ids = Internal.immutableCopyOf("invited_user_ids", list);
        this.apply_reason = str;
    }
}
