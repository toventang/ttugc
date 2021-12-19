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

/* renamed from: com.ss.ugc.aweme.proto.ActivityTimeRangeV2 */
public final class ActivityTimeRangeV2 extends Message<ActivityTimeRangeV2, Builder> {
    public static final ProtoAdapter<ActivityTimeRangeV2> ADAPTER = new ProtoAdapter_ActivityTimeRangeV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public Double duration;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 2)
    public Double end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 1)
    public Double start;

    public ActivityTimeRangeV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.ActivityTimeRangeV2$ProtoAdapter_ActivityTimeRangeV2 */
    static final class ProtoAdapter_ActivityTimeRangeV2 extends ProtoAdapter<ActivityTimeRangeV2> {
        static {
            Covode.recordClassIndex(101925);
        }

        public ProtoAdapter_ActivityTimeRangeV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ActivityTimeRangeV2.class);
        }

        public final int encodedSize(ActivityTimeRangeV2 activityTimeRangeV2) {
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, activityTimeRangeV2.start) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, activityTimeRangeV2.end) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, activityTimeRangeV2.duration) + activityTimeRangeV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ActivityTimeRangeV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.start(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.end(ProtoAdapter.DOUBLE.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.duration(ProtoAdapter.DOUBLE.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ActivityTimeRangeV2 activityTimeRangeV2) {
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, activityTimeRangeV2.start);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, activityTimeRangeV2.end);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, activityTimeRangeV2.duration);
            protoWriter.writeBytes(activityTimeRangeV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ActivityTimeRangeV2$Builder */
    public static final class Builder extends Message.Builder<ActivityTimeRangeV2, Builder> {
        public Double duration;
        public Double end;
        public Double start;

        static {
            Covode.recordClassIndex(101924);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ActivityTimeRangeV2 build() {
            return new ActivityTimeRangeV2(this.start, this.end, this.duration, super.buildUnknownFields());
        }

        public final Builder duration(Double d) {
            this.duration = d;
            return this;
        }

        public final Builder end(Double d) {
            this.end = d;
            return this;
        }

        public final Builder start(Double d) {
            this.start = d;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101923);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ActivityTimeRangeV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ActivityTimeRangeV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.start = this.start;
        builder.end = this.end;
        builder.duration = this.duration;
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
        Double d = this.start;
        int i4 = 0;
        if (d != null) {
            i = d.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        Double d2 = this.end;
        if (d2 != null) {
            i2 = d2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        Double d3 = this.duration;
        if (d3 != null) {
            i4 = d3.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start != null) {
            sb.append(", start=").append(this.start);
        }
        if (this.end != null) {
            sb.append(", end=").append(this.end);
        }
        if (this.duration != null) {
            sb.append(", duration=").append(this.duration);
        }
        return sb.replace(0, 2, "ActivityTimeRangeV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityTimeRangeV2)) {
            return false;
        }
        ActivityTimeRangeV2 activityTimeRangeV2 = (ActivityTimeRangeV2) obj;
        if (!unknownFields().equals(activityTimeRangeV2.unknownFields()) || !Internal.equals(this.start, activityTimeRangeV2.start) || !Internal.equals(this.end, activityTimeRangeV2.end) || !Internal.equals(this.duration, activityTimeRangeV2.duration)) {
            return false;
        }
        return true;
    }

    public ActivityTimeRangeV2(Double d, Double d2, Double d3) {
        this(d, d2, d3, C89427i.EMPTY);
    }

    public ActivityTimeRangeV2(Double d, Double d2, Double d3, C89427i iVar) {
        super(ADAPTER, iVar);
        this.start = d;
        this.end = d2;
        this.duration = d3;
    }
}
