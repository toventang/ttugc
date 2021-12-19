package com.bytedance.p1399im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
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
import java.util.Map;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.MessageBody */
public final class MessageBody extends Message<MessageBody, Builder> {
    public static final ProtoAdapter<MessageBody> ADAPTER = new ProtoAdapter_MessageBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V1 = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_ORDER_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "content")
    public final String content;
    @AbstractC27891c(mo46611a = "conversation_id")
    public final String conversation_id;
    @AbstractC27891c(mo46611a = "conversation_short_id")
    public final Long conversation_short_id;
    @AbstractC27891c(mo46611a = "conversation_type")
    public final Integer conversation_type;
    @AbstractC27891c(mo46611a = "create_time")
    public final Long create_time;
    @AbstractC27891c(mo46611a = "ext")
    public final Map<String, String> ext;
    @AbstractC27891c(mo46611a = "index_in_conversation")
    public final Long index_in_conversation;
    @AbstractC27891c(mo46611a = "index_in_conversation_v1")
    public final Long index_in_conversation_v1;
    @AbstractC27891c(mo46611a = "index_in_conversation_v2")
    public final Long index_in_conversation_v2;
    @AbstractC27891c(mo46611a = "message_type")
    public final Integer message_type;
    @AbstractC27891c(mo46611a = "order_in_conversation")
    public final Long order_in_conversation;
    @AbstractC27891c(mo46611a = "property_list")
    public final Map<String, PropertyItemList> property_list;
    @AbstractC27891c(mo46611a = "reference_info")
    public final ReferenceInfo reference_info;
    @AbstractC27891c(mo46611a = "sec_sender")
    public final String sec_sender;
    @AbstractC27891c(mo46611a = "sender")
    public final Long sender;
    @AbstractC27891c(mo46611a = "server_message_id")
    public final Long server_message_id;
    @AbstractC27891c(mo46611a = "status")
    public final Integer status;
    @AbstractC27891c(mo46611a = "user_profile")
    public final Map<String, String> user_profile;
    @AbstractC27891c(mo46611a = "version")
    public final Long version;

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.MessageBody$ProtoAdapter_MessageBody */
    static final class ProtoAdapter_MessageBody extends ProtoAdapter<MessageBody> {
        private final ProtoAdapter<Map<String, String>> ext;
        private final ProtoAdapter<Map<String, PropertyItemList>> property_list = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PropertyItemList.ADAPTER);
        private final ProtoAdapter<Map<String, String>> user_profile;

        static {
            Covode.recordClassIndex(23305);
        }

        public ProtoAdapter_MessageBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.user_profile = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MessageBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MessageBody redact(com.bytedance.p1399im.core.proto.MessageBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessageBody$Builder r2 = r4.newBuilder()
                java.util.Map<java.lang.String, com.bytedance.im.core.proto.PropertyItemList> r1 = r2.property_list
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.PropertyItemList> r0 = com.bytedance.p1399im.core.proto.PropertyItemList.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                com.bytedance.im.core.proto.ReferenceInfo r0 = r2.reference_info
                if (r0 == 0) goto L_0x001b
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ReferenceInfo> r1 = com.bytedance.p1399im.core.proto.ReferenceInfo.ADAPTER
                com.bytedance.im.core.proto.ReferenceInfo r0 = r2.reference_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ReferenceInfo r0 = (com.bytedance.p1399im.core.proto.ReferenceInfo) r0
                r2.reference_info = r0
            L_0x001b:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessageBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MessageBody.ProtoAdapter_MessageBody.redact(com.bytedance.im.core.proto.MessageBody):com.bytedance.im.core.proto.MessageBody");
        }

        public final int encodedSize(MessageBody messageBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, messageBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, messageBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, messageBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, messageBody.index_in_conversation) + ProtoAdapter.INT64.encodedSizeWithTag(5, messageBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, messageBody.message_type) + ProtoAdapter.INT64.encodedSizeWithTag(7, messageBody.sender) + ProtoAdapter.STRING.encodedSizeWithTag(8, messageBody.content) + this.ext.encodedSizeWithTag(9, messageBody.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, messageBody.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(11, messageBody.version) + ProtoAdapter.INT32.encodedSizeWithTag(12, messageBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(13, messageBody.order_in_conversation) + ProtoAdapter.STRING.encodedSizeWithTag(14, messageBody.sec_sender) + this.property_list.encodedSizeWithTag(15, messageBody.property_list) + this.user_profile.encodedSizeWithTag(16, messageBody.user_profile) + ProtoAdapter.INT64.encodedSizeWithTag(17, messageBody.index_in_conversation_v2) + ReferenceInfo.ADAPTER.encodedSizeWithTag(18, messageBody.reference_info) + ProtoAdapter.INT64.encodedSizeWithTag(19, messageBody.index_in_conversation_v1) + messageBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageBody decode(ProtoReader protoReader) {
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
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.index_in_conversation(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.message_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.sender(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.order_in_conversation(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            builder.sec_sender(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.property_list.putAll(this.property_list.decode(protoReader));
                            break;
                        case 16:
                            builder.user_profile.putAll(this.user_profile.decode(protoReader));
                            break;
                        case 17:
                            builder.index_in_conversation_v2(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            builder.reference_info(ReferenceInfo.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.index_in_conversation_v1(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessageBody messageBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageBody.index_in_conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messageBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messageBody.message_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, messageBody.sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messageBody.content);
            this.ext.encodeWithTag(protoWriter, 9, messageBody.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, messageBody.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, messageBody.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, messageBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, messageBody.order_in_conversation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, messageBody.sec_sender);
            this.property_list.encodeWithTag(protoWriter, 15, messageBody.property_list);
            this.user_profile.encodeWithTag(protoWriter, 16, messageBody.user_profile);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, messageBody.index_in_conversation_v2);
            ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 18, messageBody.reference_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 19, messageBody.index_in_conversation_v1);
            protoWriter.writeBytes(messageBody.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23303);
    }

    /* renamed from: com.bytedance.im.core.proto.MessageBody$Builder */
    public static final class Builder extends Message.Builder<MessageBody, Builder> {
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long create_time;
        public Map<String, String> ext = Internal.newMutableMap();
        public Long index_in_conversation;
        public Long index_in_conversation_v1;
        public Long index_in_conversation_v2;
        public Integer message_type;
        public Long order_in_conversation;
        public Map<String, PropertyItemList> property_list = Internal.newMutableMap();
        public ReferenceInfo reference_info;
        public String sec_sender;
        public Long sender;
        public Long server_message_id;
        public Integer status;
        public Map<String, String> user_profile = Internal.newMutableMap();
        public Long version;

        static {
            Covode.recordClassIndex(23304);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageBody build() {
            return new MessageBody(this.conversation_id, this.conversation_type, this.server_message_id, this.index_in_conversation, this.conversation_short_id, this.message_type, this.sender, this.content, this.ext, this.create_time, this.version, this.status, this.order_in_conversation, this.sec_sender, this.property_list, this.user_profile, this.index_in_conversation_v2, this.reference_info, this.index_in_conversation_v1, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
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

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder index_in_conversation(Long l) {
            this.index_in_conversation = l;
            return this;
        }

        public final Builder index_in_conversation_v1(Long l) {
            this.index_in_conversation_v1 = l;
            return this;
        }

        public final Builder index_in_conversation_v2(Long l) {
            this.index_in_conversation_v2 = l;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder order_in_conversation(Long l) {
            this.order_in_conversation = l;
            return this;
        }

        public final Builder reference_info(ReferenceInfo referenceInfo) {
            this.reference_info = referenceInfo;
            return this;
        }

        public final Builder sec_sender(String str) {
            this.sec_sender = str;
            return this;
        }

        public final Builder sender(Long l) {
            this.sender = l;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder property_list(Map<String, PropertyItemList> map) {
            Internal.checkElementsNotNull(map);
            this.property_list = map;
            return this;
        }

        public final Builder user_profile(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.user_profile = map;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.server_message_id = this.server_message_id;
        builder.index_in_conversation = this.index_in_conversation;
        builder.conversation_short_id = this.conversation_short_id;
        builder.message_type = this.message_type;
        builder.sender = this.sender;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.create_time = this.create_time;
        builder.version = this.version;
        builder.status = this.status;
        builder.order_in_conversation = this.order_in_conversation;
        builder.sec_sender = this.sec_sender;
        builder.property_list = Internal.copyOf("property_list", this.property_list);
        builder.user_profile = Internal.copyOf("user_profile", this.user_profile);
        builder.index_in_conversation_v2 = this.index_in_conversation_v2;
        builder.reference_info = this.reference_info;
        builder.index_in_conversation_v1 = this.index_in_conversation_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9) {
        this(str, num, l, l2, l3, num2, l4, str2, map, l5, l6, num3, l7, str3, map2, map3, l8, referenceInfo, l9, C89427i.EMPTY);
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.server_message_id = l;
        this.index_in_conversation = l2;
        this.conversation_short_id = l3;
        this.message_type = num2;
        this.sender = l4;
        this.content = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.create_time = l5;
        this.version = l6;
        this.status = num3;
        this.order_in_conversation = l7;
        this.sec_sender = str3;
        this.property_list = Internal.immutableCopyOf("property_list", map2);
        this.user_profile = Internal.immutableCopyOf("user_profile", map3);
        this.index_in_conversation_v2 = l8;
        this.reference_info = referenceInfo;
        this.index_in_conversation_v1 = l9;
    }
}
