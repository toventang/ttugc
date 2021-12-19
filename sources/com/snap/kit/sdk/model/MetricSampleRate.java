package com.snap.kit.sdk.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import p4632k.C89427i;

public final class MetricSampleRate extends Message<MetricSampleRate, Builder> {
    public static final ProtoAdapter<MetricSampleRate> ADAPTER = new ProtoAdapter_MetricSampleRate();
    public static final Double DEFAULT_RATE = Double.valueOf(0.0d);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public final Double rate;

    static final class ProtoAdapter_MetricSampleRate extends ProtoAdapter<MetricSampleRate> {
        static {
            Covode.recordClassIndex(35107);
        }

        public ProtoAdapter_MetricSampleRate() {
            super(FieldEncoding.LENGTH_DELIMITED, MetricSampleRate.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.snap.kit.sdk.model.MetricSampleRate$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.sdk.model.MetricSampleRate redact(com.snap.kit.sdk.model.MetricSampleRate r2) {
            /*
                r1 = this;
                com.snap.kit.sdk.model.MetricSampleRate$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snap.kit.sdk.model.MetricSampleRate r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.sdk.model.MetricSampleRate.ProtoAdapter_MetricSampleRate.redact(com.snap.kit.sdk.model.MetricSampleRate):com.snap.kit.sdk.model.MetricSampleRate");
        }

        public final int encodedSize(MetricSampleRate metricSampleRate) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, metricSampleRate.rate) + metricSampleRate.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MetricSampleRate decode(ProtoReader protoReader) {
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
                    builder.rate(ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MetricSampleRate metricSampleRate) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, metricSampleRate.rate);
            protoWriter.writeBytes(metricSampleRate.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MetricSampleRate, Builder> {
        public Double rate;

        static {
            Covode.recordClassIndex(35106);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MetricSampleRate build() {
            return new MetricSampleRate(this.rate, super.buildUnknownFields());
        }

        public final Builder rate(Double d) {
            this.rate = d;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(35105);
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.rate;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    /* Return type fixed from 'com.snap.kit.sdk.model.MetricSampleRate$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MetricSampleRate, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.rate = this.rate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rate != null) {
            sb.append(", rate=").append(this.rate);
        }
        return sb.replace(0, 2, "MetricSampleRate{").append('}').toString();
    }

    public MetricSampleRate(Double d) {
        this(d, C89427i.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricSampleRate)) {
            return false;
        }
        MetricSampleRate metricSampleRate = (MetricSampleRate) obj;
        if (!unknownFields().equals(metricSampleRate.unknownFields()) || !Internal.equals(this.rate, metricSampleRate.rate)) {
            return false;
        }
        return true;
    }

    public MetricSampleRate(Double d, C89427i iVar) {
        super(ADAPTER, iVar);
        this.rate = d;
    }
}
