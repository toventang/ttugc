package com.p2082ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.ss.ugc.aweme.proto.CommerceActivityStructV2 */
public final class CommerceActivityStructV2 extends Message<CommerceActivityStructV2, Builder> {
    public static final ProtoAdapter<CommerceActivityStructV2> ADAPTER = new ProtoAdapter_CommerceActivityStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer act_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY)
    public UrlStructV2 click_track_url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY)
    public Long end_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 image;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String jump_open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String jump_web_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long start_time;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ActivityTimeRangeV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
    public List<ActivityTimeRangeV2> time_range;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public String title;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY)
    public UrlStructV2 track_url_list;

    public CommerceActivityStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceActivityStructV2$ProtoAdapter_CommerceActivityStructV2 */
    static final class ProtoAdapter_CommerceActivityStructV2 extends ProtoAdapter<CommerceActivityStructV2> {
        static {
            Covode.recordClassIndex(102045);
        }

        public ProtoAdapter_CommerceActivityStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceActivityStructV2.class);
        }

        public final int encodedSize(CommerceActivityStructV2 commerceActivityStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commerceActivityStructV2.act_type) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, commerceActivityStructV2.image) + ProtoAdapter.STRING.encodedSizeWithTag(3, commerceActivityStructV2.jump_web_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, commerceActivityStructV2.jump_open_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, commerceActivityStructV2.title) + ProtoAdapter.INT64.encodedSizeWithTag(6, commerceActivityStructV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(7, commerceActivityStructV2.end_time) + ActivityTimeRangeV2.ADAPTER.asRepeated().encodedSizeWithTag(8, commerceActivityStructV2.time_range) + UrlStructV2.ADAPTER.encodedSizeWithTag(9, commerceActivityStructV2.track_url_list) + UrlStructV2.ADAPTER.encodedSizeWithTag(10, commerceActivityStructV2.click_track_url_list) + commerceActivityStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CommerceActivityStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.act_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.image(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.jump_web_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.jump_open_url(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.title(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            builder.time_range.add(ActivityTimeRangeV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            builder.track_url_list(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            builder.click_track_url_list(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CommerceActivityStructV2 commerceActivityStructV2) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commerceActivityStructV2.act_type);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, commerceActivityStructV2.image);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commerceActivityStructV2.jump_web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, commerceActivityStructV2.jump_open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, commerceActivityStructV2.title);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, commerceActivityStructV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, commerceActivityStructV2.end_time);
            ActivityTimeRangeV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, commerceActivityStructV2.time_range);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 9, commerceActivityStructV2.track_url_list);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 10, commerceActivityStructV2.click_track_url_list);
            protoWriter.writeBytes(commerceActivityStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102043);
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceActivityStructV2$Builder */
    public static final class Builder extends Message.Builder<CommerceActivityStructV2, Builder> {
        public Integer act_type;
        public UrlStructV2 click_track_url_list;
        public Long end_time;
        public UrlStructV2 image;
        public String jump_open_url;
        public String jump_web_url;
        public Long start_time;
        public List<ActivityTimeRangeV2> time_range = Internal.newMutableList();
        public String title;
        public UrlStructV2 track_url_list;

        static {
            Covode.recordClassIndex(102044);
        }

        @Override // com.squareup.wire.Message.Builder
        public final CommerceActivityStructV2 build() {
            return new CommerceActivityStructV2(this.act_type, this.image, this.jump_web_url, this.jump_open_url, this.title, this.start_time, this.end_time, this.time_range, this.track_url_list, this.click_track_url_list, super.buildUnknownFields());
        }

        public final Builder act_type(Integer num) {
            this.act_type = num;
            return this;
        }

        public final Builder click_track_url_list(UrlStructV2 urlStructV2) {
            this.click_track_url_list = urlStructV2;
            return this;
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder image(UrlStructV2 urlStructV2) {
            this.image = urlStructV2;
            return this;
        }

        public final Builder jump_open_url(String str) {
            this.jump_open_url = str;
            return this;
        }

        public final Builder jump_web_url(String str) {
            this.jump_web_url = str;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder track_url_list(UrlStructV2 urlStructV2) {
            this.track_url_list = urlStructV2;
            return this;
        }

        public final Builder time_range(List<ActivityTimeRangeV2> list) {
            Internal.checkElementsNotNull(list);
            this.time_range = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.CommerceActivityStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<CommerceActivityStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.act_type = this.act_type;
        builder.image = this.image;
        builder.jump_web_url = this.jump_web_url;
        builder.jump_open_url = this.jump_open_url;
        builder.title = this.title;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.time_range = Internal.copyOf("time_range", this.time_range);
        builder.track_url_list = this.track_url_list;
        builder.click_track_url_list = this.click_track_url_list;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.act_type;
        int i10 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        UrlStructV2 urlStructV2 = this.image;
        if (urlStructV2 != null) {
            i2 = urlStructV2.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        String str = this.jump_web_url;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        String str2 = this.jump_open_url;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        String str3 = this.title;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        Long l = this.start_time;
        if (l != null) {
            i6 = l.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        Long l2 = this.end_time;
        if (l2 != null) {
            i7 = l2.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = (((i16 + i7) * 37) + this.time_range.hashCode()) * 37;
        UrlStructV2 urlStructV22 = this.track_url_list;
        if (urlStructV22 != null) {
            i8 = urlStructV22.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (hashCode2 + i8) * 37;
        UrlStructV2 urlStructV23 = this.click_track_url_list;
        if (urlStructV23 != null) {
            i10 = urlStructV23.hashCode();
        }
        int i18 = i17 + i10;
        this.hashCode = i18;
        return i18;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.act_type != null) {
            sb.append(", act_type=").append(this.act_type);
        }
        if (this.image != null) {
            sb.append(", image=").append(this.image);
        }
        if (this.jump_web_url != null) {
            sb.append(", jump_web_url=").append(this.jump_web_url);
        }
        if (this.jump_open_url != null) {
            sb.append(", jump_open_url=").append(this.jump_open_url);
        }
        if (this.title != null) {
            sb.append(", title=").append(this.title);
        }
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        if (!this.time_range.isEmpty()) {
            sb.append(", time_range=").append(this.time_range);
        }
        if (this.track_url_list != null) {
            sb.append(", track_url_list=").append(this.track_url_list);
        }
        if (this.click_track_url_list != null) {
            sb.append(", click_track_url_list=").append(this.click_track_url_list);
        }
        return sb.replace(0, 2, "CommerceActivityStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceActivityStructV2)) {
            return false;
        }
        CommerceActivityStructV2 commerceActivityStructV2 = (CommerceActivityStructV2) obj;
        if (!unknownFields().equals(commerceActivityStructV2.unknownFields()) || !Internal.equals(this.act_type, commerceActivityStructV2.act_type) || !Internal.equals(this.image, commerceActivityStructV2.image) || !Internal.equals(this.jump_web_url, commerceActivityStructV2.jump_web_url) || !Internal.equals(this.jump_open_url, commerceActivityStructV2.jump_open_url) || !Internal.equals(this.title, commerceActivityStructV2.title) || !Internal.equals(this.start_time, commerceActivityStructV2.start_time) || !Internal.equals(this.end_time, commerceActivityStructV2.end_time) || !this.time_range.equals(commerceActivityStructV2.time_range) || !Internal.equals(this.track_url_list, commerceActivityStructV2.track_url_list) || !Internal.equals(this.click_track_url_list, commerceActivityStructV2.click_track_url_list)) {
            return false;
        }
        return true;
    }

    public CommerceActivityStructV2(Integer num, UrlStructV2 urlStructV2, String str, String str2, String str3, Long l, Long l2, List<ActivityTimeRangeV2> list, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23) {
        this(num, urlStructV2, str, str2, str3, l, l2, list, urlStructV22, urlStructV23, C89427i.EMPTY);
    }

    public CommerceActivityStructV2(Integer num, UrlStructV2 urlStructV2, String str, String str2, String str3, Long l, Long l2, List<ActivityTimeRangeV2> list, UrlStructV2 urlStructV22, UrlStructV2 urlStructV23, C89427i iVar) {
        super(ADAPTER, iVar);
        this.act_type = num;
        this.image = urlStructV2;
        this.jump_web_url = str;
        this.jump_open_url = str2;
        this.title = str3;
        this.start_time = l;
        this.end_time = l2;
        this.time_range = Internal.immutableCopyOf("time_range", list);
        this.track_url_list = urlStructV22;
        this.click_track_url_list = urlStructV23;
    }
}
