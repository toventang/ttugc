package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody */
public final class ReportClientMetricsResponseBody extends Message<ReportClientMetricsResponseBody, Builder> {
    public static final ProtoAdapter<ReportClientMetricsResponseBody> ADAPTER = new ProtoAdapter_ReportClientMetricsResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody$ProtoAdapter_ReportClientMetricsResponseBody */
    static final class ProtoAdapter_ReportClientMetricsResponseBody extends ProtoAdapter<ReportClientMetricsResponseBody> {
        static {
            Covode.recordClassIndex(23441);
        }

        public ProtoAdapter_ReportClientMetricsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ReportClientMetricsResponseBody.class);
        }

        public final int encodedSize(ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            return reportClientMetricsResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ReportClientMetricsResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ReportClientMetricsResponseBody redact(com.bytedance.p1399im.core.proto.ReportClientMetricsResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ReportClientMetricsResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ReportClientMetricsResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ReportClientMetricsResponseBody.ProtoAdapter_ReportClientMetricsResponseBody.redact(com.bytedance.im.core.proto.ReportClientMetricsResponseBody):com.bytedance.im.core.proto.ReportClientMetricsResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReportClientMetricsResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ReportClientMetricsResponseBody reportClientMetricsResponseBody) {
            protoWriter.writeBytes(reportClientMetricsResponseBody.unknownFields());
        }
    }

    public ReportClientMetricsResponseBody() {
        this(C89427i.EMPTY);
    }

    /* renamed from: com.bytedance.im.core.proto.ReportClientMetricsResponseBody$Builder */
    public static final class Builder extends Message.Builder<ReportClientMetricsResponseBody, Builder> {
        static {
            Covode.recordClassIndex(23440);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ReportClientMetricsResponseBody build() {
            return new ReportClientMetricsResponseBody(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23439);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ReportClientMetricsResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ReportClientMetricsResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ReportClientMetricsResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ReportClientMetricsResponseBody(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
