package com.p2082ss.ugc.aweme.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ugc.aweme.proto.ImageConsumptionInfoV2 */
public final class ImageConsumptionInfoV2 extends Message<ImageConsumptionInfoV2, Builder> {
    public static final ProtoAdapter<ImageConsumptionInfoV2> ADAPTER = new ProtoAdapter_ImageConsumptionInfoV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ImagePostInfoV2#ADAPTER", tag = 2)
    public ImagePostInfoV2 image_post_cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ImagePostInfoV2#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<ImagePostInfoV2> images;

    /* renamed from: com.ss.ugc.aweme.proto.ImageConsumptionInfoV2$ProtoAdapter_ImageConsumptionInfoV2 */
    static final class ProtoAdapter_ImageConsumptionInfoV2 extends ProtoAdapter<ImageConsumptionInfoV2> {
        static {
            Covode.recordClassIndex(102126);
        }

        public ProtoAdapter_ImageConsumptionInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageConsumptionInfoV2.class);
        }

        public final int encodedSize(ImageConsumptionInfoV2 imageConsumptionInfoV2) {
            return ImagePostInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, imageConsumptionInfoV2.images) + ImagePostInfoV2.ADAPTER.encodedSizeWithTag(2, imageConsumptionInfoV2.image_post_cover) + imageConsumptionInfoV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ImageConsumptionInfoV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.images.add(ImagePostInfoV2.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.image_post_cover(ImagePostInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ImageConsumptionInfoV2 imageConsumptionInfoV2) {
            ImagePostInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, imageConsumptionInfoV2.images);
            ImagePostInfoV2.ADAPTER.encodeWithTag(protoWriter, 2, imageConsumptionInfoV2.image_post_cover);
            protoWriter.writeBytes(imageConsumptionInfoV2.unknownFields());
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ImageConsumptionInfoV2$Builder */
    public static final class Builder extends Message.Builder<ImageConsumptionInfoV2, Builder> {
        public ImagePostInfoV2 image_post_cover;
        public List<ImagePostInfoV2> images = Internal.newMutableList();

        static {
            Covode.recordClassIndex(102125);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ImageConsumptionInfoV2 build() {
            return new ImageConsumptionInfoV2(this.images, this.image_post_cover, super.buildUnknownFields());
        }

        public final Builder image_post_cover(ImagePostInfoV2 imagePostInfoV2) {
            this.image_post_cover = imagePostInfoV2;
            return this;
        }

        public final Builder images(List<ImagePostInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.images = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(102124);
    }

    /* Return type fixed from 'com.ss.ugc.aweme.proto.ImageConsumptionInfoV2$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ImageConsumptionInfoV2, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.images = Internal.copyOf("images", this.images);
        builder.image_post_cover = this.image_post_cover;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.images.hashCode()) * 37;
        ImagePostInfoV2 imagePostInfoV2 = this.image_post_cover;
        if (imagePostInfoV2 != null) {
            i = imagePostInfoV2.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.images.isEmpty()) {
            sb.append(", images=").append(this.images);
        }
        if (this.image_post_cover != null) {
            sb.append(", image_post_cover=").append(this.image_post_cover);
        }
        return sb.replace(0, 2, "ImageConsumptionInfoV2{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageConsumptionInfoV2)) {
            return false;
        }
        ImageConsumptionInfoV2 imageConsumptionInfoV2 = (ImageConsumptionInfoV2) obj;
        if (!unknownFields().equals(imageConsumptionInfoV2.unknownFields()) || !this.images.equals(imageConsumptionInfoV2.images) || !Internal.equals(this.image_post_cover, imageConsumptionInfoV2.image_post_cover)) {
            return false;
        }
        return true;
    }

    public ImageConsumptionInfoV2(List<ImagePostInfoV2> list, ImagePostInfoV2 imagePostInfoV2) {
        this(list, imagePostInfoV2, C89427i.EMPTY);
    }

    public ImageConsumptionInfoV2(List<ImagePostInfoV2> list, ImagePostInfoV2 imagePostInfoV2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.images = Internal.immutableCopyOf("images", list);
        this.image_post_cover = imagePostInfoV2;
    }
}
