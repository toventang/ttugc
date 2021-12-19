package com.snap.kit.common.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import p4632k.C89427i;

public final class OsType extends Message<OsType, Builder> {
    public static final ProtoAdapter<OsType> ADAPTER = new ProtoAdapter_OsType();
    private static final long serialVersionUID = 0;

    public enum Enum implements WireEnum {
        NONE(0, "None"),
        IOS(1, "iOS"),
        ANDROID(2, "Android");
        
        public static final ProtoAdapter<Enum> ADAPTER = new ProtoAdapter_Enum();
        public final String name;
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }

        static final class ProtoAdapter_Enum extends EnumAdapter<Enum> {
            static {
                Covode.recordClassIndex(35098);
            }

            ProtoAdapter_Enum() {
                super(Enum.class);
            }

            /* access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public final Enum fromValue(int i) {
                return Enum.fromValue(i);
            }
        }

        static {
            Covode.recordClassIndex(35097);
        }

        public static Enum fromValue(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return IOS;
            }
            if (i != 2) {
                return null;
            }
            return ANDROID;
        }

        private Enum(int i, String str) {
            this.value = i;
            this.name = str;
        }
    }

    static final class ProtoAdapter_OsType extends ProtoAdapter<OsType> {
        static {
            Covode.recordClassIndex(35099);
        }

        public ProtoAdapter_OsType() {
            super(FieldEncoding.LENGTH_DELIMITED, OsType.class);
        }

        public final int encodedSize(OsType osType) {
            return osType.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.snap.kit.common.model.OsType$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.snap.kit.common.model.OsType redact(com.snap.kit.common.model.OsType r2) {
            /*
                r1 = this;
                com.snap.kit.common.model.OsType$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.snap.kit.common.model.OsType r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.kit.common.model.OsType.ProtoAdapter_OsType.redact(com.snap.kit.common.model.OsType):com.snap.kit.common.model.OsType");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final OsType decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, OsType osType) {
            protoWriter.writeBytes(osType.unknownFields());
        }
    }

    public OsType() {
        this(C89427i.EMPTY);
    }

    public static final class Builder extends Message.Builder<OsType, Builder> {
        static {
            Covode.recordClassIndex(35096);
        }

        @Override // com.squareup.wire.Message.Builder
        public final OsType build() {
            return new OsType(super.buildUnknownFields());
        }
    }

    static {
        Covode.recordClassIndex(35095);
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    /* Return type fixed from 'com.snap.kit.common.model.OsType$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<OsType, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return new StringBuilder().replace(0, 2, "OsType{").append('}').toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof OsType;
    }

    public OsType(C89427i iVar) {
        super(ADAPTER, iVar);
    }
}
