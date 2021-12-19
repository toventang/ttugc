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
/* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2 */
public final class BranchBillboardWeeklyStructV2 extends Message<BranchBillboardWeeklyStructV2, Builder> {
    public static final ProtoAdapter<BranchBillboardWeeklyStructV2> ADAPTER = new ProtoAdapter_BranchBillboardWeeklyStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer edition_no;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uid;

    /* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2$ProtoAdapter_BranchBillboardWeeklyStructV2 */
    static final class ProtoAdapter_BranchBillboardWeeklyStructV2 extends ProtoAdapter<BranchBillboardWeeklyStructV2> {
        static {
            Covode.recordClassIndex(102021);
        }

        public ProtoAdapter_BranchBillboardWeeklyStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, BranchBillboardWeeklyStructV2.class);
        }

        public final int encodedSize(BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, branchBillboardWeeklyStructV2.uid) + ProtoAdapter.INT32.encodedSizeWithTag(2, branchBillboardWeeklyStructV2.edition_no) + ProtoAdapter.INT64.encodedSizeWithTag(3, branchBillboardWeeklyStructV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, branchBillboardWeeklyStructV2.end_time) + branchBillboardWeeklyStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BranchBillboardWeeklyStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.uid(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.edition_no(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.start_time(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.end_time(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, branchBillboardWeeklyStructV2.uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, branchBillboardWeeklyStructV2.edition_no);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, branchBillboardWeeklyStructV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, branchBillboardWeeklyStructV2.end_time);
            protoWriter.writeBytes(branchBillboardWeeklyStructV2.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(102019);
    }

    /* renamed from: com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2$Builder */
    public static final class Builder extends Message.Builder<BranchBillboardWeeklyStructV2, Builder> {
        public Integer edition_no;
        public Long end_time;
        public Long start_time;
        public String uid;

        static {
            Covode.recordClassIndex(102020);
        }

        @Override // com.squareup.wire.Message.Builder
        public final BranchBillboardWeeklyStructV2 build() {
            return new BranchBillboardWeeklyStructV2(this.uid, this.edition_no, this.start_time, this.end_time, super.buildUnknownFields());
        }

        public final Builder edition_no(Integer num) {
            this.edition_no = num;
            return this;
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder uid(String str) {
            this.uid = str;
            return this;
        }
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.BranchBillboardWeeklyStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<BranchBillboardWeeklyStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.uid = this.uid;
        builder.edition_no = this.edition_no;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.uid;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        Integer num = this.edition_no;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        Long l = this.start_time;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        Long l2 = this.end_time;
        if (l2 != null) {
            i5 = l2.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uid != null) {
            sb.append(", uid=").append(this.uid);
        }
        if (this.edition_no != null) {
            sb.append(", edition_no=").append(this.edition_no);
        }
        if (this.start_time != null) {
            sb.append(", start_time=").append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=").append(this.end_time);
        }
        return sb.replace(0, 2, "BranchBillboardWeeklyStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BranchBillboardWeeklyStructV2)) {
            return false;
        }
        BranchBillboardWeeklyStructV2 branchBillboardWeeklyStructV2 = (BranchBillboardWeeklyStructV2) obj;
        if (!unknownFields().equals(branchBillboardWeeklyStructV2.unknownFields()) || !Internal.equals(this.uid, branchBillboardWeeklyStructV2.uid) || !Internal.equals(this.edition_no, branchBillboardWeeklyStructV2.edition_no) || !Internal.equals(this.start_time, branchBillboardWeeklyStructV2.start_time) || !Internal.equals(this.end_time, branchBillboardWeeklyStructV2.end_time)) {
            return false;
        }
        return true;
    }

    public BranchBillboardWeeklyStructV2(String str, Integer num, Long l, Long l2) {
        this(str, num, l, l2, C89427i.EMPTY);
    }

    public BranchBillboardWeeklyStructV2(String str, Integer num, Long l, Long l2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.uid = str;
        this.edition_no = num;
        this.start_time = l;
        this.end_time = l2;
    }
}
