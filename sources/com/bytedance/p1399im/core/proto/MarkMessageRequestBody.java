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
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.MarkMessageRequestBody */
public final class MarkMessageRequestBody extends Message<MarkMessageRequestBody, Builder> {
    public static final ProtoAdapter<MarkMessageRequestBody> ADAPTER = new ProtoAdapter_MarkMessageRequestBody();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_DO_ACTION = false;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_SORT_TIME = 0L;
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
    @AbstractC27891c(mo46611a = "do_action")
    public final Boolean do_action;
    @AbstractC27891c(mo46611a = "server_message_id")
    public final Long server_message_id;
    @AbstractC27891c(mo46611a = "sort_time")
    public final Long sort_time;
    @AbstractC27891c(mo46611a = "tag")
    public final Long tag;

    /* renamed from: com.bytedance.im.core.proto.MarkMessageRequestBody$ProtoAdapter_MarkMessageRequestBody */
    static final class ProtoAdapter_MarkMessageRequestBody extends ProtoAdapter<MarkMessageRequestBody> {
        static {
            Covode.recordClassIndex(23271);
        }

        public ProtoAdapter_MarkMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMessageRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.MarkMessageRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MarkMessageRequestBody redact(com.bytedance.p1399im.core.proto.MarkMessageRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMessageRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMessageRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MarkMessageRequestBody.ProtoAdapter_MarkMessageRequestBody.redact(com.bytedance.im.core.proto.MarkMessageRequestBody):com.bytedance.im.core.proto.MarkMessageRequestBody");
        }

        public final int encodedSize(MarkMessageRequestBody markMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, markMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, markMessageRequestBody.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, markMessageRequestBody.server_message_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, markMessageRequestBody.do_action) + ActionType.ADAPTER.encodedSizeWithTag(6, markMessageRequestBody.action_type) + ProtoAdapter.INT64.encodedSizeWithTag(7, markMessageRequestBody.sort_time) + ProtoAdapter.INT64.encodedSizeWithTag(8, markMessageRequestBody.tag) + markMessageRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMessageRequestBody decode(ProtoReader protoReader) {
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
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.do_action(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            try {
                                builder.action_type(ActionType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.sort_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
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

        public final void encode(ProtoWriter protoWriter, MarkMessageRequestBody markMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, markMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, markMessageRequestBody.server_message_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, markMessageRequestBody.do_action);
            ActionType.ADAPTER.encodeWithTag(protoWriter, 6, markMessageRequestBody.action_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, markMessageRequestBody.sort_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, markMessageRequestBody.tag);
            protoWriter.writeBytes(markMessageRequestBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkMessageRequestBody$Builder */
    public static final class Builder extends Message.Builder<MarkMessageRequestBody, Builder> {
        public ActionType action_type;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean do_action;
        public Long server_message_id;
        public Long sort_time;
        public Long tag;

        static {
            Covode.recordClassIndex(23270);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMessageRequestBody build() {
            return new MarkMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.server_message_id, this.do_action, this.action_type, this.sort_time, this.tag, super.buildUnknownFields());
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

        public final Builder do_action(Boolean bool) {
            this.do_action = bool;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder sort_time(Long l) {
            this.sort_time = l;
            return this;
        }

        public final Builder tag(Long l) {
            this.tag = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMessageRequestBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23269);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.server_message_id = this.server_message_id;
        builder.do_action = this.do_action;
        builder.action_type = this.action_type;
        builder.sort_time = this.sort_time;
        builder.tag = this.tag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, ActionType actionType, Long l3, Long l4) {
        this(str, num, l, l2, bool, actionType, l3, l4, C89427i.EMPTY);
    }

    public MarkMessageRequestBody(String str, Integer num, Long l, Long l2, Boolean bool, ActionType actionType, Long l3, Long l4, C89427i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
        this.do_action = bool;
        this.action_type = actionType;
        this.sort_time = l3;
        this.tag = l4;
    }
}
