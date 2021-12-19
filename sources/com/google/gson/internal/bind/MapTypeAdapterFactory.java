package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C27919i;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.C28027t;
import com.google.gson.internal.AbstractC27996e;
import com.google.gson.internal.AbstractC28006h;
import com.google.gson.internal.C27925b;
import com.google.gson.internal.C27980c;
import com.google.gson.internal.C28009k;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public final class MapTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    final boolean f65606a;

    /* renamed from: b */
    private final C27980c f65607b;

    static {
        Covode.recordClassIndex(33529);
    }

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    final class C27930a<K, V> extends AbstractC28031v<Map<K, V>> {

        /* renamed from: b */
        private final AbstractC28031v<K> f65609b;

        /* renamed from: c */
        private final AbstractC28031v<V> f65610c;

        /* renamed from: d */
        private final AbstractC28006h<? extends Map<K, V>> f65611d;

        static {
            Covode.recordClassIndex(33530);
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Object read(C27897a aVar) {
            EnumC27899b f = aVar.mo46627f();
            if (f == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            Map map = (Map) this.f65611d.mo46740a();
            if (f == EnumC27899b.BEGIN_ARRAY) {
                aVar.mo46621a();
                while (aVar.mo46626e()) {
                    aVar.mo46621a();
                    K read = this.f65609b.read(aVar);
                    if (map.put(read, this.f65610c.read(aVar)) == null) {
                        aVar.mo46622b();
                    } else {
                        throw new C28027t("duplicate key: ".concat(String.valueOf(read)));
                    }
                }
                aVar.mo46622b();
            } else {
                aVar.mo46623c();
                while (aVar.mo46626e()) {
                    AbstractC27996e.f65766a.mo46640a(aVar);
                    K read2 = this.f65609b.read(aVar);
                    if (map.put(read2, this.f65610c.read(aVar)) != null) {
                        throw new C28027t("duplicate key: ".concat(String.valueOf(read2)));
                    }
                }
                aVar.mo46625d();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.gson.v<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.google.gson.v<V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                cVar.mo46654f();
            } else if (!MapTypeAdapterFactory.this.f65606a) {
                cVar.mo46652d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.mo46645a(String.valueOf(entry.getKey()));
                    this.f65610c.write(cVar, entry.getValue());
                }
                cVar.mo46653e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC28019l jsonTree = this.f65609b.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if ((jsonTree instanceof C27919i) || (jsonTree instanceof C28022o)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    cVar.mo46647b();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo46647b();
                        C28009k.m56101a((AbstractC28019l) arrayList.get(i), cVar);
                        this.f65610c.write(cVar, arrayList2.get(i));
                        cVar.mo46649c();
                        i++;
                    }
                    cVar.mo46649c();
                    return;
                }
                cVar.mo46652d();
                int size2 = arrayList.size();
                while (i < size2) {
                    AbstractC28019l lVar = (AbstractC28019l) arrayList.get(i);
                    if (lVar instanceof C28025r) {
                        C28025r l = lVar.mo46791l();
                        if (l.f65806a instanceof Number) {
                            str = String.valueOf(l.mo46688b());
                        } else if (l.f65806a instanceof Boolean) {
                            str = Boolean.toString(l.mo46695h());
                        } else if (l.f65806a instanceof String) {
                            str = l.mo46689c();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar instanceof C28021n) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.mo46645a(str);
                    this.f65610c.write(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo46653e();
            }
        }

        public C27930a(C27910f fVar, Type type, AbstractC28031v<K> vVar, Type type2, AbstractC28031v<V> vVar2, AbstractC28006h<? extends Map<K, V>> hVar) {
            this.f65609b = new C27948h(fVar, vVar, type);
            this.f65610c = new C27948h(fVar, vVar2, type2);
            this.f65611d = hVar;
        }
    }

    public MapTypeAdapterFactory(C27980c cVar, boolean z) {
        this.f65607b = cVar;
        this.f65606a = z;
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Type[] actualTypeArguments;
        AbstractC28031v<Boolean> vVar;
        Type type = aVar.type;
        if (!Map.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        Class<?> c = C27925b.m55985c(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type a = C27925b.m55979a(type, c, (Class<?>) Map.class);
            actualTypeArguments = a instanceof ParameterizedType ? ((ParameterizedType) a).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            vVar = C27949i.f65716f;
        } else {
            vVar = fVar.mo46663a((C27895a) C27895a.get(type2));
        }
        return new C27930a(fVar, actualTypeArguments[0], vVar, actualTypeArguments[1], fVar.mo46663a((C27895a) C27895a.get(actualTypeArguments[1])), this.f65607b.mo46738a(aVar));
    }
}
