package com.p2082ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28027t;
import com.google.gson.internal.C27925b;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.discover.model.LazyDeserializeItem;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopic;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.TrendingTopicListTypeAdapterFactory */
public final class TrendingTopicListTypeAdapterFactory implements AbstractC28033w {

    /* renamed from: a */
    private int f99131a = Integer.MAX_VALUE;

    /* renamed from: b */
    private Boolean f99132b = false;

    static {
        Covode.recordClassIndex(50607);
    }

    public TrendingTopicListTypeAdapterFactory(int i) {
        this.f99131a = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.TrendingTopicListTypeAdapterFactory$a */
    static final class C42518a<E> extends AbstractC28031v<Collection<E>> {

        /* renamed from: a */
        private final AbstractC28031v<E> f99133a;

        /* renamed from: b */
        private Boolean f99134b = false;

        /* renamed from: c */
        private int f99135c = Integer.MAX_VALUE;

        static {
            Covode.recordClassIndex(50608);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<E> read(C27897a aVar) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (aVar.mo46627f() == EnumC27899b.NULL) {
                aVar.mo46631k();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            aVar.mo46621a();
            int i = 0;
            Boolean bool = false;
            if (this.f99134b.booleanValue()) {
                while (aVar.mo46626e()) {
                    int i2 = this.f99135c;
                    if (i2 == Integer.MAX_VALUE) {
                        aVar.mo46635o();
                    } else {
                        if (i2 > i) {
                            aVar.mo46635o();
                            i++;
                        }
                        arrayList.add(this.f99133a.read(aVar));
                    }
                }
            } else {
                E read = this.f99133a.read(aVar);
                if (read instanceof TrendingTopic) {
                    bool = true;
                    i = 1;
                }
                arrayList.add(read);
                while (aVar.mo46626e()) {
                    if (!bool.booleanValue()) {
                        read = this.f99133a.read(aVar);
                        arrayList.add(read);
                    } else if (this.f99135c <= i) {
                        aVar.mo46635o();
                    } else {
                        try {
                            read = this.f99133a.read(aVar);
                            if (i == this.f99135c - 1 && aVar.mo46626e() && (read instanceof LazyDeserializeItem)) {
                                read.setNeedToBeSupplied(true);
                            }
                        } catch (C28027t e) {
                            e.printStackTrace();
                        }
                        arrayList.add(read);
                        i++;
                    }
                }
            }
            aVar.mo46622b();
            System.currentTimeMillis();
            valueOf.longValue();
            return arrayList;
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
                this.f99133a.write(cVar, e);
            }
            cVar.mo46649c();
        }

        public C42518a(C27910f fVar, Type type, AbstractC28031v<E> vVar, int i) {
            this.f99135c = i;
            this.f99133a = new C42523b(fVar, vVar, type);
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        System.currentTimeMillis();
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a = C27925b.m55978a(type, (Class<?>) cls);
        if (!TrendingTopic.class.equals(a)) {
            return null;
        }
        C42518a aVar2 = new C42518a(fVar, a, fVar.mo46663a((C27895a) C27895a.get(a)), this.f99131a);
        System.currentTimeMillis();
        return aVar2;
    }
}
