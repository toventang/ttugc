package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

public final class LevelMetric extends Message<LevelMetric, Builder> {
    public static final ProtoAdapter<LevelMetric> ADAPTER = new ProtoAdapter_LevelMetric();
    public static final Long DEFAULT_LEVEL = 0L;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.Timestamp#ADAPTER", tag = 2)
    public final Timestamp timestamp;

    static final class ProtoAdapter_LevelMetric extends ProtoAdapter<LevelMetric> {
        static {
            Covode.recordClassIndex(35286);
        }

        public ProtoAdapter_LevelMetric() {
            super(FieldEncoding.LENGTH_DELIMITED, LevelMetric.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.snapchat.kit.sdk.core.metrics.model.LevelMetric$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snapchat.kit.sdk.core.metrics.model.LevelMetric redact(com.snapchat.kit.sdk.core.metrics.model.LevelMetric r4) {
            /*
                r3 = this;
                com.snapchat.kit.sdk.core.metrics.model.LevelMetric$Builder r2 = r4.newBuilder()
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.timestamp
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.snapchat.kit.sdk.core.metrics.model.Timestamp> r1 = com.snapchat.kit.sdk.core.metrics.model.Timestamp.ADAPTER
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = r2.timestamp
                java.lang.Object r0 = r1.redact(r0)
                com.snapchat.kit.sdk.core.metrics.model.Timestamp r0 = (com.snapchat.kit.sdk.core.metrics.model.Timestamp) r0
                r2.timestamp = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.snapchat.kit.sdk.core.metrics.model.LevelMetric r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.metrics.model.LevelMetric.ProtoAdapter_LevelMetric.redact(com.snapchat.kit.sdk.core.metrics.model.LevelMetric):com.snapchat.kit.sdk.core.metrics.model.LevelMetric");
        }

        public final int encodedSize(LevelMetric levelMetric) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, levelMetric.name) + Timestamp.ADAPTER.encodedSizeWithTag(2, levelMetric.timestamp) + ProtoAdapter.INT64.encodedSizeWithTag(3, levelMetric.level) + levelMetric.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LevelMetric decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.timestamp(Timestamp.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.level(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LevelMetric levelMetric) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, levelMetric.name);
            Timestamp.ADAPTER.encodeWithTag(protoWriter, 2, levelMetric.timestamp);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, levelMetric.level);
            protoWriter.writeBytes(levelMetric.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<LevelMetric, Builder> {
        public Long level;
        public String name;
        public Timestamp timestamp;

        static {
            Covode.recordClassIndex(35285);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LevelMetric build() {
            return new LevelMetric(this.name, this.timestamp, this.level, super.buildUnknownFields());
        }

        public final Builder level(Long l) {
            this.level = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder timestamp(Timestamp timestamp2) {
            this.timestamp = timestamp2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35284);
    }

    /* Return type fixed from 'com.snapchat.kit.sdk.core.metrics.model.LevelMetric$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LevelMetric, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.timestamp = this.timestamp;
        builder.level = this.level;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        Timestamp timestamp2 = this.timestamp;
        if (timestamp2 != null) {
            i2 = timestamp2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        Long l = this.level;
        if (l != null) {
            i4 = l.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=").append(this.name);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=").append(this.timestamp);
        }
        if (this.level != null) {
            sb.append(", level=").append(this.level);
        }
        return sb.replace(0, 2, "LevelMetric{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LevelMetric)) {
            return false;
        }
        LevelMetric levelMetric = (LevelMetric) obj;
        if (!unknownFields().equals(levelMetric.unknownFields()) || !Internal.equals(this.name, levelMetric.name) || !Internal.equals(this.timestamp, levelMetric.timestamp) || !Internal.equals(this.level, levelMetric.level)) {
            return false;
        }
        return true;
    }

    public LevelMetric(String str, Timestamp timestamp2, Long l) {
        this(str, timestamp2, l, C89427i.EMPTY);
    }

    public LevelMetric(String str, Timestamp timestamp2, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.name = str;
        this.timestamp = timestamp2;
        this.level = l;
    }
}
