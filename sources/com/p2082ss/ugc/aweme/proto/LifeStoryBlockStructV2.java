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

/* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2 */
public final class LifeStoryBlockStructV2 extends Message<LifeStoryBlockStructV2, Builder> {
    public static final ProtoAdapter<LifeStoryBlockStructV2> ADAPTER = new ProtoAdapter_LifeStoryBlockStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean life_story_block;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean life_story_blocked;

    public LifeStoryBlockStructV2() {
    }

    /* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2$ProtoAdapter_LifeStoryBlockStructV2 */
    static final class ProtoAdapter_LifeStoryBlockStructV2 extends ProtoAdapter<LifeStoryBlockStructV2> {
        static {
            Covode.recordClassIndex(102150);
        }

        public ProtoAdapter_LifeStoryBlockStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LifeStoryBlockStructV2.class);
        }

        public final int encodedSize(LifeStoryBlockStructV2 lifeStoryBlockStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, lifeStoryBlockStructV2.life_story_block) + ProtoAdapter.BOOL.encodedSizeWithTag(2, lifeStoryBlockStructV2.life_story_blocked) + lifeStoryBlockStructV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final LifeStoryBlockStructV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.life_story_block(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.life_story_blocked(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LifeStoryBlockStructV2 lifeStoryBlockStructV2) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, lifeStoryBlockStructV2.life_story_block);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, lifeStoryBlockStructV2.life_story_blocked);
            protoWriter.writeBytes(lifeStoryBlockStructV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LifeStoryBlockStructV2$Builder */
    public static final class Builder extends Message.Builder<LifeStoryBlockStructV2, Builder> {
        public Boolean life_story_block;
        public Boolean life_story_blocked;

        static {
            Covode.recordClassIndex(102149);
        }

        @Override // com.squareup.wire.Message.Builder
        public final LifeStoryBlockStructV2 build() {
            return new LifeStoryBlockStructV2(this.life_story_block, this.life_story_blocked, super.buildUnknownFields());
        }

        public final Builder life_story_block(Boolean bool) {
            this.life_story_block = bool;
            return this;
        }

        public final Builder life_story_blocked(Boolean bool) {
            this.life_story_blocked = bool;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102148);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.LifeStoryBlockStructV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<LifeStoryBlockStructV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.life_story_block = this.life_story_block;
        builder.life_story_blocked = this.life_story_blocked;
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
        Boolean bool = this.life_story_block;
        int i3 = 0;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        Boolean bool2 = this.life_story_blocked;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.life_story_block != null) {
            sb.append(", life_story_block=").append(this.life_story_block);
        }
        if (this.life_story_blocked != null) {
            sb.append(", life_story_blocked=").append(this.life_story_blocked);
        }
        return sb.replace(0, 2, "LifeStoryBlockStructV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifeStoryBlockStructV2)) {
            return false;
        }
        LifeStoryBlockStructV2 lifeStoryBlockStructV2 = (LifeStoryBlockStructV2) obj;
        if (!unknownFields().equals(lifeStoryBlockStructV2.unknownFields()) || !Internal.equals(this.life_story_block, lifeStoryBlockStructV2.life_story_block) || !Internal.equals(this.life_story_blocked, lifeStoryBlockStructV2.life_story_blocked)) {
            return false;
        }
        return true;
    }

    public LifeStoryBlockStructV2(Boolean bool, Boolean bool2) {
        this(bool, bool2, C89427i.EMPTY);
    }

    public LifeStoryBlockStructV2(Boolean bool, Boolean bool2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.life_story_block = bool;
        this.life_story_blocked = bool2;
    }
}
