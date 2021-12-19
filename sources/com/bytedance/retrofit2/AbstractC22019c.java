package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.c */
public interface AbstractC22019c<T> {

    /* renamed from: com.bytedance.retrofit2.c$a */
    public static abstract class AbstractC22020a {
        static {
            Covode.recordClassIndex(25709);
        }

        /* renamed from: a */
        public abstract AbstractC22019c<?> mo11589a(Type type, Annotation[] annotationArr, C22092q qVar);
    }

    static {
        Covode.recordClassIndex(25708);
    }

    /* renamed from: a */
    <R> T mo11590a(AbstractC21983b<R> bVar);

    /* renamed from: a */
    Type mo11591a();
}
