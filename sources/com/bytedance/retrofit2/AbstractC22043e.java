package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.e */
public interface AbstractC22043e<F, T> {

    /* renamed from: com.bytedance.retrofit2.e$a */
    public static abstract class AbstractC22044a {
        static {
            Covode.recordClassIndex(25734);
        }

        /* renamed from: a */
        public AbstractC22043e<?, Object> mo35775a(Type type) {
            return null;
        }

        /* renamed from: a */
        public AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
            return null;
        }

        /* renamed from: a */
        public AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
            return null;
        }

        /* renamed from: b */
        public AbstractC22043e<?, String> mo35776b(Type type) {
            return null;
        }

        /* renamed from: c */
        public AbstractC22043e<?, C22027b> mo35777c(Type type) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(25733);
    }

    /* renamed from: a */
    T mo11580a(F f);
}
