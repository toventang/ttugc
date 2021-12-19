package com.p2082ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.aweme.proto.StitchPermissionStructV2 */
public final class StitchPermissionStructV2 extends Message<StitchPermissionStructV2, Builder> {
    public static final ProtoAdapter<StitchPermissionStructV2> ADAPTER = new ProtoAdapter_StitchPermissionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String reason;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer status;

    /* renamed from: com.ss.ugc.aweme.proto.StitchPermissionStructV2$ProtoAdapter_StitchPermissionStructV2 */
    static final class ProtoAdapter_StitchPermissionStructV2 extends ProtoAdapter<StitchPermissionStructV2> {
        static {
            Covode.recordClassIndex(102303);
        }

        public ProtoAdapter_StitchPermissionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StitchPermissionStructV2.class);
        }

        public final int encodedSize(StitchPermissionStructV2 stitchPermissionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, stitchPermissionStructV2.status) + ProtoAdapter.STRING.encodedSizeWithTag(2, stitchPermissionStructV2.reason) + stitchPermissionStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StitchPermissionStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.reason(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, StitchPermissionStructV2 stitchPermissionStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, stitchPermissionStructV2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, stitchPermissionStructV2.reason);
            protoWriter.writeBytes(stitchPermissionStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.StitchPermissionStructV2$Builder */
    public static final class Builder extends Message.Builder<StitchPermissionStructV2, Builder> {
        public String reason;
        public Integer status;

        static {
            Covode.recordClassIndex(102302);
        }

        @Override // com.squareup.wire.Message.Builder
        public final StitchPermissionStructV2 build() {
            return new StitchPermissionStructV2(this.status, this.reason, super.buildUnknownFields());
        }

        public final Builder reason(String str) {
            this.reason = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102301);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.StitchPermissionStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<StitchPermissionStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.reason = this.reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.status;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        String str = this.reason;
        if (str != null) {
            i3 = str.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        if (this.reason != null) {
            sb.append(", reason=").append(this.reason);
        }
        return sb.replace(0, 2, "StitchPermissionStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StitchPermissionStructV2)) {
            return false;
        }
        StitchPermissionStructV2 stitchPermissionStructV2 = (StitchPermissionStructV2) obj;
        if (!unknownFields().equals(stitchPermissionStructV2.unknownFields()) || !Internal.equals(this.status, stitchPermissionStructV2.status) || !Internal.equals(this.reason, stitchPermissionStructV2.reason)) {
            return false;
        }
        return true;
    }

    public StitchPermissionStructV2(Integer num, String str) {
        this(num, str, C89427i.EMPTY);
    }

    public StitchPermissionStructV2(Integer num, String str, C89427i iVar) {
        super(ADAPTER, iVar);
        this.status = num;
        this.reason = str;
    }
}
