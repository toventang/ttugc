package com.squareup.wire;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89436q;

public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL = new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Boolean.class) {
        /* class com.squareup.wire.ProtoAdapter.C293191 */

        static {
            Covode.recordClassIndex(35685);
        }

        public final int encodedSize(Boolean bool) {
            return 1;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Boolean decode(ProtoReader protoReader) {
            int readVarint32 = protoReader.readVarint32();
            if (readVarint32 == 0) {
                return Boolean.FALSE;
            }
            if (readVarint32 == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(C1764a.m5928a("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(readVarint32)}));
        }

        public final void encode(ProtoWriter protoWriter, Boolean bool) {
            protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
        }
    };
    public static final ProtoAdapter<C89427i> BYTES = new ProtoAdapter<C89427i>(FieldEncoding.LENGTH_DELIMITED, C89427i.class) {
        /* class com.squareup.wire.ProtoAdapter.C2932313 */

        static {
            Covode.recordClassIndex(35689);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C89427i decode(ProtoReader protoReader) {
            return protoReader.readBytes();
        }

        public final int encodedSize(C89427i iVar) {
            return iVar.size();
        }

        public final void encode(ProtoWriter protoWriter, C89427i iVar) {
            protoWriter.writeBytes(iVar);
        }
    };
    public static final ProtoAdapter<Double> DOUBLE = new ProtoAdapter<Double>(FieldEncoding.FIXED64, Double.class) {
        /* class com.squareup.wire.ProtoAdapter.C2932111 */

        static {
            Covode.recordClassIndex(35687);
        }

        public final int encodedSize(Double d) {
            return 8;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Double decode(ProtoReader protoReader) {
            return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
        }

        public final void encode(ProtoWriter protoWriter, Double d) {
            protoWriter.writeFixed64(Double.doubleToLongBits(d.doubleValue()));
        }
    };
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT = new ProtoAdapter<Float>(FieldEncoding.FIXED32, Float.class) {
        /* class com.squareup.wire.ProtoAdapter.C2932010 */

        static {
            Covode.recordClassIndex(35686);
        }

        public final int encodedSize(Float f) {
            return 4;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Float decode(ProtoReader protoReader) {
            return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
        }

        public final void encode(ProtoWriter protoWriter, Float f) {
            protoWriter.writeFixed32(Float.floatToIntBits(f.floatValue()));
        }
    };
    public static final ProtoAdapter<Integer> INT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        /* class com.squareup.wire.ProtoAdapter.C293262 */

        static {
            Covode.recordClassIndex(35692);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Integer decode(ProtoReader protoReader) {
            return Integer.valueOf(protoReader.readVarint32());
        }

        public final int encodedSize(Integer num) {
            return ProtoWriter.int32Size(num.intValue());
        }

        public final void encode(ProtoWriter protoWriter, Integer num) {
            protoWriter.writeSignedVarint32(num.intValue());
        }
    };
    public static final ProtoAdapter<Long> INT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        /* class com.squareup.wire.ProtoAdapter.C293306 */

        static {
            Covode.recordClassIndex(35696);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Long decode(ProtoReader protoReader) {
            return Long.valueOf(protoReader.readVarint64());
        }

        public final int encodedSize(Long l) {
            return ProtoWriter.varint64Size(l.longValue());
        }

        public final void encode(ProtoWriter protoWriter, Long l) {
            protoWriter.writeVarint64(l.longValue());
        }
    };
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        /* class com.squareup.wire.ProtoAdapter.C293284 */

        static {
            Covode.recordClassIndex(35694);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Integer decode(ProtoReader protoReader) {
            return Integer.valueOf(ProtoWriter.decodeZigZag32(protoReader.readVarint32()));
        }

        public final int encodedSize(Integer num) {
            return ProtoWriter.varint32Size(ProtoWriter.encodeZigZag32(num.intValue()));
        }

        public final void encode(ProtoWriter protoWriter, Integer num) {
            protoWriter.writeVarint32(ProtoWriter.encodeZigZag32(num.intValue()));
        }
    };
    public static final ProtoAdapter<Long> SINT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        /* class com.squareup.wire.ProtoAdapter.C293328 */

        static {
            Covode.recordClassIndex(35698);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Long decode(ProtoReader protoReader) {
            return Long.valueOf(ProtoWriter.decodeZigZag64(protoReader.readVarint64()));
        }

        public final int encodedSize(Long l) {
            return ProtoWriter.varint64Size(ProtoWriter.encodeZigZag64(l.longValue()));
        }

        public final void encode(ProtoWriter protoWriter, Long l) {
            protoWriter.writeVarint64(ProtoWriter.encodeZigZag64(l.longValue()));
        }
    };
    public static final ProtoAdapter<String> STRING = new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, String.class) {
        /* class com.squareup.wire.ProtoAdapter.C2932212 */

        static {
            Covode.recordClassIndex(35688);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final String decode(ProtoReader protoReader) {
            return protoReader.readString();
        }

        public final int encodedSize(String str) {
            return ProtoWriter.utf8Length(str);
        }

        public final void encode(ProtoWriter protoWriter, String str) {
            protoWriter.writeString(str);
        }
    };
    public static final ProtoAdapter<Integer> UINT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        /* class com.squareup.wire.ProtoAdapter.C293273 */

        static {
            Covode.recordClassIndex(35693);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Integer decode(ProtoReader protoReader) {
            return Integer.valueOf(protoReader.readVarint32());
        }

        public final int encodedSize(Integer num) {
            return ProtoWriter.varint32Size(num.intValue());
        }

        public final void encode(ProtoWriter protoWriter, Integer num) {
            protoWriter.writeVarint32(num.intValue());
        }
    };
    public static final ProtoAdapter<Long> UINT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        /* class com.squareup.wire.ProtoAdapter.C293317 */

        static {
            Covode.recordClassIndex(35697);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Long decode(ProtoReader protoReader) {
            return Long.valueOf(protoReader.readVarint64());
        }

        public final int encodedSize(Long l) {
            return ProtoWriter.varint64Size(l.longValue());
        }

        public final void encode(ProtoWriter protoWriter, Long l) {
            protoWriter.writeVarint64(l.longValue());
        }
    };
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public abstract E decode(ProtoReader protoReader);

    public abstract void encode(ProtoWriter protoWriter, E e);

    public abstract int encodedSize(E e);

    public E redact(E e) {
        return null;
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) {
            /* class com.squareup.wire.ProtoAdapter.C2932515 */

            static {
                Covode.recordClassIndex(35691);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return encodedSize((List) ((List) obj));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ Object redact(Object obj) {
                return redact((List) ((List) obj));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public List<E> decode(ProtoReader protoReader) {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            public List<E> redact(List<E> list) {
                return Collections.emptyList();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) {
                encode(protoWriter, (List) ((List) obj));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSizeWithTag(int i, Object obj) {
                return encodedSizeWithTag(i, (List) ((List) obj));
            }

            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            public int encodedSizeWithTag(int i, List<E> list) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ProtoAdapter.this.encodedSizeWithTag(i, list.get(i3));
                }
                return i2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
                encodeWithTag(protoWriter, i, (List) ((List) obj));
            }

            public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, list.get(i2));
                }
            }
        };
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createPacked = createPacked();
        this.packedAdapter = createPacked;
        return createPacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createRepeated = createRepeated();
        this.repeatedAdapter = createRepeated;
        return createRepeated;
    }

    private ProtoAdapter<List<E>> createPacked() {
        if (this.fieldEncoding != FieldEncoding.LENGTH_DELIMITED) {
            return new ProtoAdapter<List<E>>(FieldEncoding.LENGTH_DELIMITED, List.class) {
                /* class com.squareup.wire.ProtoAdapter.C2932414 */

                static {
                    Covode.recordClassIndex(35690);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                    return encodedSize((List) ((List) obj));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ Object redact(Object obj) {
                    return redact((List) ((List) obj));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public List<E> decode(ProtoReader protoReader) {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                public List<E> redact(List<E> list) {
                    return Collections.emptyList();
                }

                public int encodedSize(List<E> list) {
                    int size = list.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i += ProtoAdapter.this.encodedSize(list.get(i2));
                    }
                    return i;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) {
                    encode(protoWriter, (List) ((List) obj));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ int encodedSizeWithTag(int i, Object obj) {
                    return encodedSizeWithTag(i, (List) ((List) obj));
                }

                public int encodedSizeWithTag(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return ProtoAdapter.super.encodedSizeWithTag(i, (Object) list);
                }

                public void encode(ProtoWriter protoWriter, List<E> list) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, list.get(i));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public /* bridge */ /* synthetic */ void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
                    encodeWithTag(protoWriter, i, (List) ((List) obj));
                }

                public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) {
                    if (!list.isEmpty()) {
                        ProtoAdapter.super.encodeWithTag(protoWriter, i, (Object) list);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    static {
        Covode.recordClassIndex(35684);
        C293295 r2 = new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Integer.class) {
            /* class com.squareup.wire.ProtoAdapter.C293295 */

            static {
                Covode.recordClassIndex(35695);
            }

            public final int encodedSize(Integer num) {
                return 4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Integer decode(ProtoReader protoReader) {
                return Integer.valueOf(protoReader.readFixed32());
            }

            public final void encode(ProtoWriter protoWriter, Integer num) {
                protoWriter.writeFixed32(num.intValue());
            }
        };
        FIXED32 = r2;
        SFIXED32 = r2;
        C293339 r22 = new ProtoAdapter<Long>(FieldEncoding.FIXED64, Long.class) {
            /* class com.squareup.wire.ProtoAdapter.C293339 */

            static {
                Covode.recordClassIndex(35699);
            }

            public final int encodedSize(Long l) {
                return 8;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Long decode(ProtoReader protoReader) {
                return Long.valueOf(protoReader.readFixed64());
            }

            public final void encode(ProtoWriter protoWriter, Long l) {
                protoWriter.writeFixed64(l.longValue());
            }
        };
        FIXED64 = r22;
        SFIXED64 = r22;
    }

    /* access modifiers changed from: package-private */
    public static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<K, V>> {
        final ProtoAdapter<K> keyAdapter;
        final ProtoAdapter<V> valueAdapter;

        static {
            Covode.recordClassIndex(35701);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ int encodedSize(Object obj) {
            return encodedSize((Map.Entry) ((Map.Entry) obj));
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Map.Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        public final int encodedSize(Map.Entry<K, V> entry) {
            return this.keyAdapter.encodedSizeWithTag(1, entry.getKey()) + this.valueAdapter.encodedSizeWithTag(2, entry.getValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) {
            encode(protoWriter, (Map.Entry) ((Map.Entry) obj));
        }

        MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.keyAdapter = protoAdapter;
            this.valueAdapter = protoAdapter2;
        }

        public final void encode(ProtoWriter protoWriter, Map.Entry<K, V> entry) {
            this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
            this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
        }
    }

    static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        private final MapEntryProtoAdapter<K, V> entryAdapter;

        static {
            Covode.recordClassIndex(35702);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ int encodedSize(Object obj) {
            return encodedSize((Map) ((Map) obj));
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ Object redact(Object obj) {
            return redact((Map) ((Map) obj));
        }

        public final int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        public final Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final Map<K, V> decode(ProtoReader protoReader) {
            long beginMessage = protoReader.beginMessage();
            K k = null;
            V v = null;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    break;
                } else if (nextTag == 1) {
                    k = this.entryAdapter.keyAdapter.decode(protoReader);
                } else if (nextTag == 2) {
                    v = this.entryAdapter.valueAdapter.decode(protoReader);
                }
            }
            protoReader.endMessage(beginMessage);
            if (k == null) {
                throw new IllegalStateException("Map entry with null key");
            } else if (v != null) {
                return Collections.singletonMap(k, v);
            } else {
                throw new IllegalStateException("Map entry with null value");
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Object obj) {
            encode(protoWriter, (Map) ((Map) obj));
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ int encodedSizeWithTag(int i, Object obj) {
            return encodedSizeWithTag(i, (Map) ((Map) obj));
        }

        MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        public final void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        public final int encodedSizeWithTag(int i, Map<K, V> map) {
            int i2 = 0;
            for (Map.Entry<K, V> entry : map.entrySet()) {
                i2 += this.entryAdapter.encodedSizeWithTag(i, entry);
            }
            return i2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
            encodeWithTag(protoWriter, i, (Map) ((Map) obj));
        }

        public final void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                this.entryAdapter.encodeWithTag(protoWriter, i, entry);
            }
        }
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return RuntimeMessageAdapter.create(cls);
    }

    public String toString(E e) {
        return e.toString();
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public final E decode(AbstractC89426h hVar) {
        Preconditions.checkNotNull(hVar, "source == null");
        return decode(new ProtoReader(hVar));
    }

    public final E decode(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream, "stream == null");
        return decode(C89436q.m155160a(C89436q.m155158a(inputStream)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.squareup.wire.ProtoAdapter<E> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public ProtoAdapter<?> withLabel(WireField.Label label) {
        if (!label.isRepeated()) {
            return this;
        }
        if (label.isPacked()) {
            return asPacked();
        }
        return asRepeated();
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e);
        }
    }

    public final E decode(C89427i iVar) {
        Preconditions.checkNotNull(iVar, "bytes == null");
        return decode(new C89420f().mo68850a(iVar));
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int indexOf = str.indexOf(35);
            String substring = str.substring(0, indexOf);
            return (ProtoAdapter) Class.forName(substring).getField(str.substring(indexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            throw new IllegalArgumentException("failed to access ".concat(String.valueOf(str)), e);
        }
    }

    public final E decode(byte[] bArr) {
        Preconditions.checkNotNull(bArr, "bytes == null");
        return decode(new C89420f().mo68851a(bArr));
    }

    public final byte[] encode(E e) {
        Preconditions.checkNotNull(e, "value == null");
        C89420f fVar = new C89420f();
        try {
            encode(fVar, e);
            return fVar.mo143853u();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public ProtoAdapter(FieldEncoding fieldEncoding2, Class<?> cls) {
        this.fieldEncoding = fieldEncoding2;
        this.javaType = cls;
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public final void encode(OutputStream outputStream, E e) {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(outputStream, "stream == null");
        AbstractC89425g a = C89436q.m155159a(C89436q.m155163a(outputStream));
        encode(a, e);
        a.mo68856c();
    }

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = encodedSize(e);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.varint32Size(encodedSize);
        }
        return encodedSize + ProtoWriter.tagSize(i);
    }

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        static {
            Covode.recordClassIndex(35700);
        }

        EnumConstantNotFoundException(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.value = i;
        }
    }

    public final void encode(AbstractC89425g gVar, E e) {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(gVar, "sink == null");
        encode(new ProtoWriter(gVar), e);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) {
        if (e != null) {
            protoWriter.writeTag(i, this.fieldEncoding);
            if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
                protoWriter.writeVarint32(encodedSize(e));
            }
            encode(protoWriter, e);
        }
    }
}
