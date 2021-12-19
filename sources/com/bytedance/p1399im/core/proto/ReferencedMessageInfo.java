package com.bytedance.p1399im.core.proto;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ReferencedMessageInfo */
public final class ReferencedMessageInfo extends AndroidMessage<ReferencedMessageInfo, Builder> {
    public static final ProtoAdapter<ReferencedMessageInfo> ADAPTER;
    public static final Parcelable.Creator<ReferencedMessageInfo> CREATOR;
    public static final Long DEFAULT_REFERENCED_MESSAGE_ID = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_CONV_INDEX = 0L;
    public static final Long DEFAULT_ROOT_MESSAGE_ID = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "hint")
    public final String hint;
    @AbstractC27891c(mo46611a = "referenced_message_id")
    public final Long referenced_message_id;
    @AbstractC27891c(mo46611a = "root_message_conv_index")
    public final Long root_message_conv_index;
    @AbstractC27891c(mo46611a = "root_message_id")
    public final Long root_message_id;

    /* renamed from: com.bytedance.im.core.proto.ReferencedMessageInfo$ProtoAdapter_ReferencedMessageInfo */
    static final class ProtoAdapter_ReferencedMessageInfo extends ProtoAdapter<ReferencedMessageInfo> {
        static {
            Covode.recordClassIndex(23435);
        }

        public ProtoAdapter_ReferencedMessageInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ReferencedMessageInfo.class);
        }

        public final ReferencedMessageInfo redact(ReferencedMessageInfo referencedMessageInfo) {
            Builder newBuilder = referencedMessageInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ReferencedMessageInfo referencedMessageInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, referencedMessageInfo.referenced_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, referencedMessageInfo.hint) + ProtoAdapter.INT64.encodedSizeWithTag(3, referencedMessageInfo.root_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, referencedMessageInfo.root_message_conv_index) + referencedMessageInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReferencedMessageInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.referenced_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.hint(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.root_message_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.root_message_conv_index(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReferencedMessageInfo referencedMessageInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, referencedMessageInfo.referenced_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, referencedMessageInfo.hint);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, referencedMessageInfo.root_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, referencedMessageInfo.root_message_conv_index);
            protoWriter.writeBytes(referencedMessageInfo.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23433);
        ProtoAdapter_ReferencedMessageInfo protoAdapter_ReferencedMessageInfo = new ProtoAdapter_ReferencedMessageInfo();
        ADAPTER = protoAdapter_ReferencedMessageInfo;
        CREATOR = AndroidMessage.newCreator(protoAdapter_ReferencedMessageInfo);
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.referenced_message_id = this.referenced_message_id;
        builder.hint = this.hint;
        builder.root_message_id = this.root_message_id;
        builder.root_message_conv_index = this.root_message_conv_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReferencedMessageInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.ReferencedMessageInfo$Builder */
    public static final class Builder extends Message.Builder<ReferencedMessageInfo, Builder> {
        public String hint;
        public Long referenced_message_id;
        public Long root_message_conv_index;
        public Long root_message_id;

        static {
            Covode.recordClassIndex(23434);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReferencedMessageInfo build() {
            Long l = this.referenced_message_id;
            if (l != null && this.hint != null) {
                return new ReferencedMessageInfo(this.referenced_message_id, this.hint, this.root_message_id, this.root_message_conv_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l, "referenced_message_id", this.hint, "hint");
        }

        public final Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public final Builder referenced_message_id(Long l) {
            this.referenced_message_id = l;
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

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3) {
        this(l, str, l2, l3, C89427i.EMPTY);
    }

    public ReferencedMessageInfo(Long l, String str, Long l2, Long l3, C89427i iVar) {
        super(ADAPTER, iVar);
        this.referenced_message_id = l;
        this.hint = str;
        this.root_message_id = l2;
        this.root_message_conv_index = l3;
    }
}
