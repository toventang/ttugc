package com.bytedance.p1399im.core.proto;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ReferenceInfo */
public final class ReferenceInfo extends AndroidMessage<ReferenceInfo, Builder> {
    public static final ProtoAdapter<ReferenceInfo> ADAPTER;
    public static final Parcelable.Creator<ReferenceInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID = 0L;
    public static final MessageStatus DEFAULT_REFERENCED_MESSAGE_STATUS = MessageStatus.AVAILABLE;
    public static final Long DEFAULT_REF_MESSAGE_TYPE = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "hint")
    public final String hint;
    @AbstractC27891c(mo46611a = "ref_message_type")
    public final Long ref_message_type;
    @AbstractC27891c(mo46611a = "referenced_message_id")
    public final Long referenced_message_id;
    @AbstractC27891c(mo46611a = "referenced_message_status")
    public final MessageStatus referenced_message_status;
    @AbstractC27891c(mo46611a = "root_message_conv_index")
    public final Long root_message_conv_index;
    @AbstractC27891c(mo46611a = "root_message_id")
    public final Long root_message_id;

    /* renamed from: com.bytedance.im.core.proto.ReferenceInfo$ProtoAdapter_ReferenceInfo */
    static final class ProtoAdapter_ReferenceInfo extends ProtoAdapter<ReferenceInfo> {
        static {
            Covode.recordClassIndex(23432);
        }

        public ProtoAdapter_ReferenceInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ReferenceInfo.class);
        }

        public final ReferenceInfo redact(ReferenceInfo referenceInfo) {
            Builder newBuilder = referenceInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReferenceInfo referenceInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, referenceInfo.referenced_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referenceInfo.hint) + ProtoAdapter.INT64.encodedSizeWithTag(3, referenceInfo.ref_message_type) + MessageStatus.ADAPTER.encodedSizeWithTag(4, referenceInfo.referenced_message_status) + ProtoAdapter.INT64.encodedSizeWithTag(5, referenceInfo.root_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(6, referenceInfo.root_message_conv_index) + referenceInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReferenceInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.referenced_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.hint(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.ref_message_type(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.referenced_message_status(MessageStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.root_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.root_message_conv_index(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ReferenceInfo referenceInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, referenceInfo.referenced_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referenceInfo.hint);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, referenceInfo.ref_message_type);
            MessageStatus.ADAPTER.encodeWithTag(protoWriter, 4, referenceInfo.referenced_message_status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, referenceInfo.root_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, referenceInfo.root_message_conv_index);
            protoWriter.writeBytes(referenceInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReferenceInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    static {
        Covode.recordClassIndex(23430);
        ProtoAdapter_ReferenceInfo protoAdapter_ReferenceInfo = new ProtoAdapter_ReferenceInfo();
        ADAPTER = protoAdapter_ReferenceInfo;
        CREATOR = AndroidMessage.newCreator(protoAdapter_ReferenceInfo);
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.referenced_message_id = this.referenced_message_id;
        builder.hint = this.hint;
        builder.ref_message_type = this.ref_message_type;
        builder.referenced_message_status = this.referenced_message_status;
        builder.root_message_id = this.root_message_id;
        builder.root_message_conv_index = this.root_message_conv_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    /* renamed from: com.bytedance.im.core.proto.ReferenceInfo$Builder */
    public static final class Builder extends Message.Builder<ReferenceInfo, Builder> {
        public String hint;
        public Long ref_message_type;
        public Long referenced_message_id;
        public MessageStatus referenced_message_status;
        public Long root_message_conv_index;
        public Long root_message_id;

        static {
            Covode.recordClassIndex(23431);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReferenceInfo build() {
            Long l = this.referenced_message_id;
            if (l != null && this.hint != null && this.ref_message_type != null && this.referenced_message_status != null) {
                return new ReferenceInfo(this.referenced_message_id, this.hint, this.ref_message_type, this.referenced_message_status, this.root_message_id, this.root_message_conv_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "referenced_message_id", this.hint, "hint", this.ref_message_type, "ref_message_type", this.referenced_message_status, "referenced_message_status");
        }

        public final Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public final Builder ref_message_type(Long l) {
            this.ref_message_type = l;
            return this;
        }

        public final Builder referenced_message_id(Long l) {
            this.referenced_message_id = l;
            return this;
        }

        public final Builder referenced_message_status(MessageStatus messageStatus) {
            this.referenced_message_status = messageStatus;
            return this;
        }

        public final Builder root_message_conv_index(Long l) {
            this.root_message_conv_index = l;
            return this;
        }

        public final Builder root_message_id(Long l) {
            this.root_message_id = l;
            return this;
        }
    }

    public ReferenceInfo(Long l, String str, Long l2, MessageStatus messageStatus, Long l3, Long l4) {
        this(l, str, l2, messageStatus, l3, l4, C89427i.EMPTY);
    }

    public ReferenceInfo(Long l, String str, Long l2, MessageStatus messageStatus, Long l3, Long l4, C89427i iVar) {
        super(ADAPTER, iVar);
        this.referenced_message_id = l;
        this.hint = str;
        this.ref_message_type = l2;
        this.referenced_message_status = messageStatus;
        this.root_message_id = l3;
        this.root_message_conv_index = l4;
    }
}
