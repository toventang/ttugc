package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import p4632k.AbstractC89425g;
import p4632k.C89420f;
import p4632k.C89427i;

public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize;
    public transient int hashCode;
    private final transient C89427i unknownFields;

    static {
        Covode.recordClassIndex(35679);
    }

    public abstract Builder<M, B> newBuilder();

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final C89427i unknownFields() {
        C89427i iVar = this.unknownFields;
        if (iVar != null) {
            return iVar;
        }
        return C89427i.EMPTY;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient C89420f unknownFieldsBuffer;
        transient C89427i unknownFieldsByteString = C89427i.EMPTY;
        transient ProtoWriter unknownFieldsWriter;

        static {
            Covode.recordClassIndex(35680);
        }

        public abstract M build();

        public final C89427i buildUnknownFields() {
            C89420f fVar = this.unknownFieldsBuffer;
            if (fVar != null) {
                this.unknownFieldsByteString = fVar.mo143847q();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = C89427i.EMPTY;
            C89420f fVar = this.unknownFieldsBuffer;
            if (fVar != null) {
                fVar.mo143854v();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new C89420f();
                ProtoWriter protoWriter = new ProtoWriter(this.unknownFieldsBuffer);
                this.unknownFieldsWriter = protoWriter;
                try {
                    protoWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = C89427i.EMPTY;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownFields(C89427i iVar) {
            if (iVar.size() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(iVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) {
        this.adapter.encode(outputStream, this);
    }

    public final void encode(AbstractC89425g gVar) {
        this.adapter.encode(gVar, this);
    }

    public Message(ProtoAdapter<M> protoAdapter, C89427i iVar) {
        Objects.requireNonNull(protoAdapter, "adapter == null");
        Objects.requireNonNull(iVar, "unknownFields == null");
        this.adapter = protoAdapter;
        this.unknownFields = iVar;
    }
}
