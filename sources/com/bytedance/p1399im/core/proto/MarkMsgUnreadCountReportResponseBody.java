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

/* renamed from: com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody */
public final class MarkMsgUnreadCountReportResponseBody extends Message<MarkMsgUnreadCountReportResponseBody, Builder> {
    public static final ProtoAdapter<MarkMsgUnreadCountReportResponseBody> ADAPTER = new ProtoAdapter_MarkMsgUnreadCountReportResponseBody();
    public static final Boolean DEFAULT_SET_TOTAL_STATUS = false;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "failed_tag_list")
    public final List<Long> failed_tag_list;
    @AbstractC27891c(mo46611a = "set_total_status")
    public final Boolean set_total_status;

    /* renamed from: com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody$ProtoAdapter_MarkMsgUnreadCountReportResponseBody */
    static final class ProtoAdapter_MarkMsgUnreadCountReportResponseBody extends ProtoAdapter<MarkMsgUnreadCountReportResponseBody> {
        static {
            Covode.recordClassIndex(23286);
        }

        public ProtoAdapter_MarkMsgUnreadCountReportResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMsgUnreadCountReportResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.MarkMsgUnreadCountReportResponseBody redact(com.bytedance.p1399im.core.proto.MarkMsgUnreadCountReportResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.MarkMsgUnreadCountReportResponseBody.ProtoAdapter_MarkMsgUnreadCountReportResponseBody.redact(com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody):com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody");
        }

        public final int encodedSize(MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, markMsgUnreadCountReportResponseBody.set_total_status) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, markMsgUnreadCountReportResponseBody.failed_tag_list) + markMsgUnreadCountReportResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgUnreadCountReportResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.set_total_status(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.failed_tag_list.add(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, markMsgUnreadCountReportResponseBody.set_total_status);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, markMsgUnreadCountReportResponseBody.failed_tag_list);
            protoWriter.writeBytes(markMsgUnreadCountReportResponseBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody$Builder */
    public static final class Builder extends Message.Builder<MarkMsgUnreadCountReportResponseBody, Builder> {
        public List<Long> failed_tag_list = Internal.newMutableList();
        public Boolean set_total_status;

        static {
            Covode.recordClassIndex(23285);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MarkMsgUnreadCountReportResponseBody build() {
            return new MarkMsgUnreadCountReportResponseBody(this.set_total_status, this.failed_tag_list, super.buildUnknownFields());
        }

        public final Builder set_total_status(Boolean bool) {
            this.set_total_status = bool;
            return this;
        }

        public final Builder failed_tag_list(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_tag_list = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23284);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MarkMsgUnreadCountReportResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.set_total_status = this.set_total_status;
        builder.failed_tag_list = Internal.copyOf("failed_tag_list", this.failed_tag_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MarkMsgUnreadCountReportResponseBody" + C19999h.f47538a.mo46674b(this).toString();
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list) {
        this(bool, list, C89427i.EMPTY);
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list, C89427i iVar) {
        super(ADAPTER, iVar);
        this.set_total_status = bool;
        this.failed_tag_list = Internal.immutableCopyOf("failed_tag_list", list);
    }
}
