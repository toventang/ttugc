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

/* renamed from: com.ss.ugc.aweme.proto.ActivityButtonStructV2 */
public final class ActivityButtonStructV2 extends Message<ActivityButtonStructV2, Builder> {
    public static final ProtoAdapter<ActivityButtonStructV2> ADAPTER = new ProtoAdapter_ActivityButtonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String color;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String label;

    public ActivityButtonStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.ActivityButtonStructV2$ProtoAdapter_ActivityButtonStructV2 */
    static final class ProtoAdapter_ActivityButtonStructV2 extends ProtoAdapter<ActivityButtonStructV2> {
        static {
            Covode.recordClassIndex(101922);
        }

        public ProtoAdapter_ActivityButtonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ActivityButtonStructV2.class);
        }

        public final int encodedSize(ActivityButtonStructV2 activityButtonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, activityButtonStructV2.label) + ProtoAdapter.STRING.encodedSizeWithTag(2, activityButtonStructV2.color) + activityButtonStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ActivityButtonStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.label(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.color(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ActivityButtonStructV2 activityButtonStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activityButtonStructV2.label);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, activityButtonStructV2.color);
            protoWriter.writeBytes(activityButtonStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ActivityButtonStructV2$Builder */
    public static final class Builder extends Message.Builder<ActivityButtonStructV2, Builder> {
        public String color;
        public String label;

        static {
            Covode.recordClassIndex(101921);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ActivityButtonStructV2 build() {
            return new ActivityButtonStructV2(this.label, this.color, super.buildUnknownFields());
        }

        public final Builder color(String str) {
            this.color = str;
            return this;
        }

        public final Builder label(String str) {
            this.label = str;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(101920);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ActivityButtonStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ActivityButtonStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.label = this.label;
        builder.color = this.color;
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
        String str = this.label;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        String str2 = this.color;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.label != null) {
            sb.append(", label=").append(this.label);
        }
        if (this.color != null) {
            sb.append(", color=").append(this.color);
        }
        return sb.replace(0, 2, "ActivityButtonStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityButtonStructV2)) {
            return false;
        }
        ActivityButtonStructV2 activityButtonStructV2 = (ActivityButtonStructV2) obj;
        if (!unknownFields().equals(activityButtonStructV2.unknownFields()) || !Internal.equals(this.label, activityButtonStructV2.label) || !Internal.equals(this.color, activityButtonStructV2.color)) {
            return false;
        }
        return true;
    }

    public ActivityButtonStructV2(String str, String str2) {
        this(str, str2, C89427i.EMPTY);
    }

    public ActivityButtonStructV2(String str, String str2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.label = str;
        this.color = str2;
    }
}
