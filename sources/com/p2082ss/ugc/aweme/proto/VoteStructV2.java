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

/* renamed from: com.ss.ugc.aweme.proto.VoteStructV2 */
public final class VoteStructV2 extends Message<VoteStructV2, Builder> {
    public static final ProtoAdapter<VoteStructV2> ADAPTER = new ProtoAdapter_VoteStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.VoteOptionStructV2#ADAPTER", label = WireField.Label.REPEATED, tag = ABRConfig.ABR_STARTUP_MODEL_KEY)
    public List<VoteOptionStructV2> options;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String question;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long ref_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer ref_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY)
    public Long select_option_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long vote_id;

    public VoteStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.VoteStructV2$ProtoAdapter_VoteStructV2 */
    static final class ProtoAdapter_VoteStructV2 extends ProtoAdapter<VoteStructV2> {
        static {
            Covode.recordClassIndex(102375);
        }

        public ProtoAdapter_VoteStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VoteStructV2.class);
        }

        public final int encodedSize(VoteStructV2 voteStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, voteStructV2.vote_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, voteStructV2.ref_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, voteStructV2.ref_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, voteStructV2.question) + VoteOptionStructV2.ADAPTER.asRepeated().encodedSizeWithTag(5, voteStructV2.options) + ProtoAdapter.INT64.encodedSizeWithTag(6, voteStructV2.select_option_id) + voteStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VoteStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.vote_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.ref_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.ref_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.question(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            builder.options.add(VoteOptionStructV2.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            builder.select_option_id(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VoteStructV2 voteStructV2) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, voteStructV2.vote_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, voteStructV2.ref_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, voteStructV2.ref_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, voteStructV2.question);
            VoteOptionStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, voteStructV2.options);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, voteStructV2.select_option_id);
            protoWriter.writeBytes(voteStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102373);
    }

    /* renamed from: com.ss.ugc.aweme.proto.VoteStructV2$Builder */
    public static final class Builder extends Message.Builder<VoteStructV2, Builder> {
        public List<VoteOptionStructV2> options = Internal.newMutableList();
        public String question;
        public Long ref_id;
        public Integer ref_type;
        public Long select_option_id;
        public Long vote_id;

        static {
            Covode.recordClassIndex(102374);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VoteStructV2 build() {
            return new VoteStructV2(this.vote_id, this.ref_id, this.ref_type, this.question, this.options, this.select_option_id, super.buildUnknownFields());
        }

        public final Builder question(String str) {
            this.question = str;
            return this;
        }

        public final Builder ref_id(Long l) {
            this.ref_id = l;
            return this;
        }

        public final Builder ref_type(Integer num) {
            this.ref_type = num;
            return this;
        }

        public final Builder select_option_id(Long l) {
            this.select_option_id = l;
            return this;
        }

        public final Builder vote_id(Long l) {
            this.vote_id = l;
            return this;
        }

        public final Builder options(List<VoteOptionStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.options = list;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.VoteStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VoteStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.vote_id = this.vote_id;
        builder.ref_id = this.ref_id;
        builder.ref_type = this.ref_type;
        builder.question = this.question;
        builder.options = Internal.copyOf("options", this.options);
        builder.select_option_id = this.select_option_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.vote_id;
        int i6 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        Long l2 = this.ref_id;
        if (l2 != null) {
            i2 = l2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        Integer num = this.ref_type;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        String str = this.question;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i9 + i4) * 37) + this.options.hashCode()) * 37;
        Long l3 = this.select_option_id;
        if (l3 != null) {
            i6 = l3.hashCode();
        }
        int i10 = hashCode2 + i6;
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vote_id != null) {
            sb.append(", vote_id=").append(this.vote_id);
        }
        if (this.ref_id != null) {
            sb.append(", ref_id=").append(this.ref_id);
        }
        if (this.ref_type != null) {
            sb.append(", ref_type=").append(this.ref_type);
        }
        if (this.question != null) {
            sb.append(", question=").append(this.question);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=").append(this.options);
        }
        if (this.select_option_id != null) {
            sb.append(", select_option_id=").append(this.select_option_id);
        }
        return sb.replace(0, 2, "VoteStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoteStructV2)) {
            return false;
        }
        VoteStructV2 voteStructV2 = (VoteStructV2) obj;
        if (!unknownFields().equals(voteStructV2.unknownFields()) || !Internal.equals(this.vote_id, voteStructV2.vote_id) || !Internal.equals(this.ref_id, voteStructV2.ref_id) || !Internal.equals(this.ref_type, voteStructV2.ref_type) || !Internal.equals(this.question, voteStructV2.question) || !this.options.equals(voteStructV2.options) || !Internal.equals(this.select_option_id, voteStructV2.select_option_id)) {
            return false;
        }
        return true;
    }

    public VoteStructV2(Long l, Long l2, Integer num, String str, List<VoteOptionStructV2> list, Long l3) {
        this(l, l2, num, str, list, l3, C89427i.EMPTY);
    }

    public VoteStructV2(Long l, Long l2, Integer num, String str, List<VoteOptionStructV2> list, Long l3, C89427i iVar) {
        super(ADAPTER, iVar);
        this.vote_id = l;
        this.ref_id = l2;
        this.ref_type = num;
        this.question = str;
        this.options = Internal.immutableCopyOf("options", list);
        this.select_option_id = l3;
    }
}
