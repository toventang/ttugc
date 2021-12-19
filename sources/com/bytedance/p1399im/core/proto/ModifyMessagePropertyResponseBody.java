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

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody */
public final class ModifyMessagePropertyResponseBody extends Message<ModifyMessagePropertyResponseBody, Builder> {
    public static final ProtoAdapter<ModifyMessagePropertyResponseBody> ADAPTER = new ProtoAdapter_ModifyMessagePropertyResponseBody();
    public static final ModifyMessagePropertyStatus DEFAULT_STATUS = ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "status")
    public final ModifyMessagePropertyStatus status;
    @AbstractC27891c(mo46611a = "version")
    public final Long version;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$ProtoAdapter_ModifyMessagePropertyResponseBody */
    static final class ProtoAdapter_ModifyMessagePropertyResponseBody extends ProtoAdapter<ModifyMessagePropertyResponseBody> {
        static {
            Covode.recordClassIndex(23347);
        }

        public ProtoAdapter_ModifyMessagePropertyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ModifyMessagePropertyResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ModifyMessagePropertyResponseBody redact(com.bytedance.p1399im.core.proto.ModifyMessagePropertyResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ModifyMessagePropertyResponseBody.ProtoAdapter_ModifyMessagePropertyResponseBody.redact(com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody):com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody");
        }

        public final int encodedSize(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            return ModifyMessagePropertyStatus.ADAPTER.encodedSizeWithTag(1, modifyMessagePropertyResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(2, modifyMessagePropertyResponseBody.version) + modifyMessagePropertyResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ModifyMessagePropertyResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.status(ModifyMessagePropertyStatus.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.version(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            ModifyMessagePropertyStatus.ADAPTER.encodeWithTag(protoWriter, 1, modifyMessagePropertyResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, modifyMessagePropertyResponseBody.version);
            protoWriter.writeBytes(modifyMessagePropertyResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder */
    public static final class Builder extends Message.Builder<ModifyMessagePropertyResponseBody, Builder> {
        public ModifyMessagePropertyStatus status;
        public Long version;

        static {
            Covode.recordClassIndex(23346);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ModifyMessagePropertyResponseBody build() {
            return new ModifyMessagePropertyResponseBody(this.status, this.version, super.buildUnknownFields());
        }

        public final Builder status(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
            this.status = modifyMessagePropertyStatus;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23345);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ModifyMessagePropertyResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ModifyMessagePropertyResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l) {
        this(modifyMessagePropertyStatus, l, C89427i.EMPTY);
    }

    public ModifyMessagePropertyResponseBody(ModifyMessagePropertyStatus modifyMessagePropertyStatus, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.status = modifyMessagePropertyStatus;
        this.version = l;
    }
}
