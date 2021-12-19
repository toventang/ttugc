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

/* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2 */
public final class VideoUnreadStructV2 extends Message<VideoUnreadStructV2, Builder> {
    public static final ProtoAdapter<VideoUnreadStructV2> ADAPTER = new ProtoAdapter_VideoUnreadStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long latest_unread_video_created_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer unread_count;

    public VideoUnreadStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2$ProtoAdapter_VideoUnreadStructV2 */
    static final class ProtoAdapter_VideoUnreadStructV2 extends ProtoAdapter<VideoUnreadStructV2> {
        static {
            Covode.recordClassIndex(102366);
        }

        public ProtoAdapter_VideoUnreadStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoUnreadStructV2.class);
        }

        public final int encodedSize(VideoUnreadStructV2 videoUnreadStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, videoUnreadStructV2.unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(2, videoUnreadStructV2.latest_unread_video_created_time) + videoUnreadStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VideoUnreadStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.unread_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.latest_unread_video_created_time(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoUnreadStructV2 videoUnreadStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, videoUnreadStructV2.unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, videoUnreadStructV2.latest_unread_video_created_time);
            protoWriter.writeBytes(videoUnreadStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2$Builder */
    public static final class Builder extends Message.Builder<VideoUnreadStructV2, Builder> {
        public Long latest_unread_video_created_time;
        public Integer unread_count;

        static {
            Covode.recordClassIndex(102365);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VideoUnreadStructV2 build() {
            return new VideoUnreadStructV2(this.unread_count, this.latest_unread_video_created_time, super.buildUnknownFields());
        }

        public final Builder latest_unread_video_created_time(Long l) {
            this.latest_unread_video_created_time = l;
            return this;
        }

        public final Builder unread_count(Integer num) {
            this.unread_count = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102364);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VideoUnreadStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VideoUnreadStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.unread_count = this.unread_count;
        builder.latest_unread_video_created_time = this.latest_unread_video_created_time;
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
        Integer num = this.unread_count;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        Long l = this.latest_unread_video_created_time;
        if (l != null) {
            i3 = l.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.unread_count != null) {
            sb.append(", unread_count=").append(this.unread_count);
        }
        if (this.latest_unread_video_created_time != null) {
            sb.append(", latest_unread_video_created_time=").append(this.latest_unread_video_created_time);
        }
        return sb.replace(0, 2, "VideoUnreadStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoUnreadStructV2)) {
            return false;
        }
        VideoUnreadStructV2 videoUnreadStructV2 = (VideoUnreadStructV2) obj;
        if (!unknownFields().equals(videoUnreadStructV2.unknownFields()) || !Internal.equals(this.unread_count, videoUnreadStructV2.unread_count) || !Internal.equals(this.latest_unread_video_created_time, videoUnreadStructV2.latest_unread_video_created_time)) {
            return false;
        }
        return true;
    }

    public VideoUnreadStructV2(Integer num, Long l) {
        this(num, l, C89427i.EMPTY);
    }

    public VideoUnreadStructV2(Integer num, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.unread_count = num;
        this.latest_unread_video_created_time = l;
    }
}
