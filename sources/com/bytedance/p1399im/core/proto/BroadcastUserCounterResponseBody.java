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

/* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterResponseBody */
public final class BroadcastUserCounterResponseBody extends Message<BroadcastUserCounterResponseBody, Builder> {
    public static final ProtoAdapter<BroadcastUserCounterResponseBody> ADAPTER = new ProtoAdapter_BroadcastUserCounterResponseBody();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "infos")
    public final List<BroadcastUserInfo> infos;

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterResponseBody$ProtoAdapter_BroadcastUserCounterResponseBody */
    static final class ProtoAdapter_BroadcastUserCounterResponseBody extends ProtoAdapter<BroadcastUserCounterResponseBody> {
        static {
            Covode.recordClassIndex(22967);
        }

        public ProtoAdapter_BroadcastUserCounterResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, BroadcastUserCounterResponseBody.class);
        }

        public final int encodedSize(BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
            return BroadcastUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterResponseBody.infos) + broadcastUserCounterResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.BroadcastUserCounterResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.BroadcastUserCounterResponseBody redact(com.bytedance.p1399im.core.proto.BroadcastUserCounterResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.BroadcastUserCounterResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.BroadcastUserInfo> r1 = r2.infos
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.BroadcastUserInfo> r0 = com.bytedance.p1399im.core.proto.BroadcastUserInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.BroadcastUserCounterResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.BroadcastUserCounterResponseBody.ProtoAdapter_BroadcastUserCounterResponseBody.redact(com.bytedance.im.core.proto.BroadcastUserCounterResponseBody):com.bytedance.im.core.proto.BroadcastUserCounterResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserCounterResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.infos.add(BroadcastUserInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
            BroadcastUserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastUserCounterResponseBody.infos);
            protoWriter.writeBytes(broadcastUserCounterResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.BroadcastUserCounterResponseBody$Builder */
    public static final class Builder extends Message.Builder<BroadcastUserCounterResponseBody, Builder> {
        public List<BroadcastUserInfo> infos = Internal.newMutableList();

        static {
            Covode.recordClassIndex(22966);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BroadcastUserCounterResponseBody build() {
            return new BroadcastUserCounterResponseBody(this.infos, super.buildUnknownFields());
        }

        public final Builder infos(List<BroadcastUserInfo> list) {
            Internal.checkElementsNotNull(list);
            this.infos = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(22965);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.BroadcastUserCounterResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BroadcastUserCounterResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.infos = Internal.copyOf("infos", this.infos);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "BroadcastUserCounterResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list) {
        this(list, C89427i.EMPTY);
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.infos = Internal.immutableCopyOf("infos", list);
    }
}
