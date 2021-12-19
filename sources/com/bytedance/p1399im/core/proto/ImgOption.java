package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ImgOption */
public final class ImgOption extends Message<ImgOption, Builder> {
    public static final ProtoAdapter<ImgOption> ADAPTER = new ProtoAdapter_ImgOption();
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "format")
    public final String format;
    @AbstractC27891c(mo46611a = "params")
    public final List<String> params;
    @AbstractC27891c(mo46611a = "tplv")
    public final String tplv;
    @AbstractC27891c(mo46611a = "urls")
    public final List<String> urls;

    /* renamed from: com.bytedance.im.core.proto.ImgOption$ProtoAdapter_ImgOption */
    static final class ProtoAdapter_ImgOption extends ProtoAdapter<ImgOption> {
        static {
            Covode.recordClassIndex(23254);
        }

        public ProtoAdapter_ImgOption() {
            super(FieldEncoding.LENGTH_DELIMITED, ImgOption.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ImgOption$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ImgOption redact(com.bytedance.p1399im.core.proto.ImgOption r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ImgOption$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ImgOption r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ImgOption.ProtoAdapter_ImgOption.redact(com.bytedance.im.core.proto.ImgOption):com.bytedance.im.core.proto.ImgOption");
        }

        public final int encodedSize(ImgOption imgOption) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, imgOption.tplv) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, imgOption.params) + ProtoAdapter.STRING.encodedSizeWithTag(3, imgOption.format) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(100, imgOption.urls) + imgOption.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ImgOption decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.tplv(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.params.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.format(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 100) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.urls.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ImgOption imgOption) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imgOption.tplv);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, imgOption.params);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, imgOption.format);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 100, imgOption.urls);
            protoWriter.writeBytes(imgOption.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23252);
    }

    /* renamed from: com.bytedance.im.core.proto.ImgOption$Builder */
    public static final class Builder extends Message.Builder<ImgOption, Builder> {
        public String format;
        public List<String> params = Internal.newMutableList();
        public String tplv;
        public List<String> urls = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23253);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ImgOption build() {
            return new ImgOption(this.tplv, this.params, this.format, this.urls, super.buildUnknownFields());
        }

        public final Builder format(String str) {
            this.format = str;
            return this;
        }

        public final Builder tplv(String str) {
            this.tplv = str;
            return this;
        }

        public final Builder params(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.params = list;
            return this;
        }

        public final Builder urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.urls = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ImgOption" + C19999h.f47538a.mo46674b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ImgOption$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ImgOption, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.tplv = this.tplv;
        builder.params = Internal.copyOf("params", this.params);
        builder.format = this.format;
        builder.urls = Internal.copyOf("urls", this.urls);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ImgOption(String str, List<String> list, String str2, List<String> list2) {
        this(str, list, str2, list2, C89427i.EMPTY);
    }

    public ImgOption(String str, List<String> list, String str2, List<String> list2, C89427i iVar) {
        super(ADAPTER, iVar);
        this.tplv = str;
        this.params = Internal.immutableCopyOf("params", list);
        this.format = str2;
        this.urls = Internal.immutableCopyOf("urls", list2);
    }
}
