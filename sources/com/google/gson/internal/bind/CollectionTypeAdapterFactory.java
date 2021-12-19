package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.internal.AbstractC28006h;
import com.google.gson.internal.C27925b;
import com.google.gson.internal.C27980c;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    private final C27980c f65602a;

    static {
        Covode.recordClassIndex(33525);
    }

    public CollectionTypeAdapterFactory(C27980c cVar) {
        this.f65602a = cVar;
    }

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    static final class C27929a<E> extends AbstractC28031v<Collection<E>> {

        /* renamed from: a */
        private final AbstractC28031v<E> f65603a;

        /* renamed from: b */
        private final AbstractC28006h<? extends Collection<E>> f65604b;

        static {
            Covode.recordClassIndex(33526);
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ Object read(C27897a aVar) {
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            Collection collection = (Collection) this.f65604b.mo46740a();
            aVar.mo46621a();
            while (aVar.mo46626e()) {
                collection.add(this.f65603a.read(aVar));
            }
            aVar.mo46622b();
            return collection;
        }

        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.mo46654f();
                return;
            }
            cVar.mo46647b();
            for (E e : collection) {
                this.f65603a.write(cVar, e);
            }
            cVar.mo46649c();
        }

        public C27929a(C27910f fVar, Type type, AbstractC28031v<E> vVar, AbstractC28006h<? extends Collection<E>> hVar) {
            this.f65603a = new C27948h(fVar, vVar, type);
            this.f65604b = hVar;
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C27925b.m55978a(type, (Class<?>) cls);
        return new C27929a(fVar, a, fVar.mo46663a((C27895a) C27895a.get(a)), this.f65602a.mo46738a(aVar));
    }
}
