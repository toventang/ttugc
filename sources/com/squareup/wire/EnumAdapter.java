package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    static {
        Covode.recordClassIndex(35675);
    }

    /* access modifiers changed from: protected */
    public abstract E fromValue(int i);

    public EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    public final int encodedSize(E e) {
        return ProtoWriter.varint32Size(e.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) {
        int readVarint32 = protoReader.readVarint32();
        E fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, this.javaType);
    }

    public final void encode(ProtoWriter protoWriter, E e) {
        protoWriter.writeVarint32(e.getValue());
    }
}
