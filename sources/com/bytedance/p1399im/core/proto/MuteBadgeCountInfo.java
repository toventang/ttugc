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
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.MuteBadgeCountInfo */
public final class MuteBadgeCountInfo extends Message<MuteBadgeCountInfo, Builder> {
    public static final ProtoAdapter<MuteBadgeCountInfo> ADAPTER = new ProtoAdapter_MuteBadgeCountInfo();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final MuteMessageType DEFAULT_MESSAGE_TYPE = MuteMessageType.TYPE_MENTION;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "badge_count")
    public final Integer badge_count;
    @AbstractC27891c(mo46611a = "message_type")
    public final MuteMessageType message_type;

    /* renamed from: com.bytedance.im.core.proto.MuteBadgeCountInfo$ProtoAdapter_MuteBadgeCountInfo */
    static final class ProtoAdapter_MuteBadgeCountInfo extends ProtoAdapter<MuteBadgeCountInfo> {
        static {
            Covode.recordClassIndex(23367);
        }

        public ProtoAdapter_MuteBadgeCountInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, MuteBadgeCountInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MuteBadgeCountInfo$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MuteBadgeCountInfo redact(com.bytedance.p1399im.core.proto.MuteBadgeCountInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MuteBadgeCountInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MuteBadgeCountInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MuteBadgeCountInfo.ProtoAdapter_MuteBadgeCountInfo.redact(com.bytedance.im.core.proto.MuteBadgeCountInfo):com.bytedance.im.core.proto.MuteBadgeCountInfo");
        }

        public final int encodedSize(MuteBadgeCountInfo muteBadgeCountInfo) {
            return MuteMessageType.ADAPTER.encodedSizeWithTag(1, muteBadgeCountInfo.message_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, muteBadgeCountInfo.badge_count) + muteBadgeCountInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MuteBadgeCountInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.message_type(MuteMessageType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MuteBadgeCountInfo muteBadgeCountInfo) {
            MuteMessageType.ADAPTER.encodeWithTag(protoWriter, 1, muteBadgeCountInfo.message_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, muteBadgeCountInfo.badge_count);
            protoWriter.writeBytes(muteBadgeCountInfo.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23365);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MuteBadgeCountInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MuteBadgeCountInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.message_type = this.message_type;
        builder.badge_count = this.badge_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MuteBadgeCountInfo" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* renamed from: com.bytedance.im.core.proto.MuteBadgeCountInfo$Builder */
    public static final class Builder extends Message.Builder<MuteBadgeCountInfo, Builder> {
        public Integer badge_count;
        public MuteMessageType message_type;

        static {
            Covode.recordClassIndex(23366);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MuteBadgeCountInfo build() {
            MuteMessageType muteMessageType = this.message_type;
            if (muteMessageType != null && this.badge_count != null) {
                return new MuteBadgeCountInfo(this.message_type, this.badge_count, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(muteMessageType, "message_type", this.badge_count, "badge_count");
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
        }

        public final Builder message_type(MuteMessageType muteMessageType) {
            this.message_type = muteMessageType;
            return this;
        }
    }

    public MuteBadgeCountInfo(MuteMessageType muteMessageType, Integer num) {
        this(muteMessageType, num, C89427i.EMPTY);
    }

    public MuteBadgeCountInfo(MuteMessageType muteMessageType, Integer num, C89427i iVar) {
        super(ADAPTER, iVar);
        this.message_type = muteMessageType;
        this.badge_count = num;
    }
}
