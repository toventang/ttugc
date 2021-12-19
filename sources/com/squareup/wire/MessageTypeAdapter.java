package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.C27919i;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class MessageTypeAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends AbstractC28031v<M> {
    private static final BigInteger POWER_64 = new BigInteger("18446744073709551616");
    private final Map<String, FieldBinding<M, B>> fieldBindings;
    private final C27910f gson;
    private final RuntimeMessageAdapter<M, B> messageAdapter;

    static {
        Covode.recordClassIndex(35682);
    }

    @Override // com.google.gson.AbstractC28031v
    public M read(C27897a aVar) {
        if (aVar.mo46627f() == EnumC27899b.NULL) {
            aVar.mo46631k();
            return null;
        }
        AbstractC28031v a = this.gson.mo46665a(AbstractC28019l.class);
        B newBuilder = this.messageAdapter.newBuilder();
        aVar.mo46623c();
        while (aVar.mo46627f() != EnumC27899b.END_OBJECT) {
            FieldBinding<M, B> fieldBinding = this.fieldBindings.get(aVar.mo46628h());
            if (fieldBinding == null) {
                aVar.mo46635o();
            } else {
                fieldBinding.set(newBuilder, parseValue(fieldBinding, (AbstractC28019l) a.read(aVar)));
            }
        }
        aVar.mo46625d();
        return (M) newBuilder.build();
    }

    private void emitUint64(Long l, C27900c cVar) {
        if (l.longValue() < 0) {
            cVar.mo46644a(POWER_64.add(BigInteger.valueOf(l.longValue())));
        } else {
            cVar.mo46644a(l);
        }
    }

    MessageTypeAdapter(C27910f fVar, C27895a<M> aVar) {
        this.gson = fVar;
        RuntimeMessageAdapter<M, B> create = WireFiledWorkaround.create(aVar.rawType);
        this.messageAdapter = create;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldBinding<M, B> fieldBinding : create.fieldBindings().values()) {
            linkedHashMap.put(fieldBinding.name, fieldBinding);
        }
        this.fieldBindings = Collections.unmodifiableMap(linkedHashMap);
    }

    public void write(C27900c cVar, M m) {
        if (m == null) {
            cVar.mo46654f();
            return;
        }
        cVar.mo46652d();
        for (FieldBinding<M, B> fieldBinding : this.messageAdapter.fieldBindings().values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                cVar.mo46645a(fieldBinding.name);
                emitJson(cVar, obj, fieldBinding.singleAdapter(), fieldBinding.label);
            }
        }
        cVar.mo46653e();
    }

    private Object parseValue(FieldBinding<?, ?> fieldBinding, AbstractC28019l lVar) {
        if (fieldBinding.label.isRepeated()) {
            if (lVar instanceof C28021n) {
                return Collections.emptyList();
            }
            Class<?> cls = fieldBinding.singleAdapter().javaType;
            C27919i k = lVar.mo46790k();
            ArrayList arrayList = new ArrayList(k.mo46684a());
            Iterator<AbstractC28019l> it = k.iterator();
            while (it.hasNext()) {
                arrayList.add(this.gson.mo46667a(it.next(), (Class) cls));
            }
            return arrayList;
        } else if (!fieldBinding.isMap()) {
            return this.gson.mo46667a(lVar, (Class) fieldBinding.singleAdapter().javaType);
        } else if (lVar instanceof C28021n) {
            return Collections.emptyMap();
        } else {
            Class<?> cls2 = fieldBinding.keyAdapter().javaType;
            Class<?> cls3 = fieldBinding.singleAdapter().javaType;
            C28022o j = lVar.mo46789j();
            LinkedHashMap linkedHashMap = new LinkedHashMap(j.f65804a.size());
            for (Map.Entry<String, AbstractC28019l> entry : j.f65804a.entrySet()) {
                linkedHashMap.put(this.gson.mo46670a(entry.getKey(), (Class) cls2), this.gson.mo46667a(entry.getValue(), (Class) cls3));
            }
            return linkedHashMap;
        }
    }

    private void emitJson(C27900c cVar, Object obj, ProtoAdapter<?> protoAdapter, WireField.Label label) {
        if (protoAdapter != ProtoAdapter.UINT64) {
            this.gson.mo46673a(obj, obj.getClass(), cVar);
        } else if (label.isRepeated()) {
            List list = (List) obj;
            cVar.mo46647b();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                emitUint64((Long) list.get(i), cVar);
            }
            cVar.mo46649c();
        } else {
            emitUint64((Long) obj, cVar);
        }
    }
}
