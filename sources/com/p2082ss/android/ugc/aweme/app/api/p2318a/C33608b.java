package com.p2082ss.android.ugc.aweme.app.api.p2318a;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.app.api.a.b */
public class C33608b<T> implements AbstractC22043e<TypedInput, T> {

    /* renamed from: g */
    private static volatile ExecutorService f79786g;

    /* renamed from: a */
    private Type f79787a;

    /* renamed from: b */
    private Annotation[] f79788b;

    /* renamed from: c */
    private C22092q f79789c;

    /* renamed from: d */
    private List<AbstractC22043e.AbstractC22044a> f79790d;

    /* renamed from: e */
    private AbstractC22043e.AbstractC22044a f79791e;

    /* renamed from: f */
    private volatile AbstractC22043e<TypedInput, T> f79792f;

    static {
        Covode.recordClassIndex(40501);
    }

    /* renamed from: a */
    public final void mo59945a() {
        MethodCollector.m26663i(9849);
        Log.getStackTraceString(new RuntimeException("ensure, mType:" + this.f79787a));
        if (this.f79792f == null) {
            synchronized (this) {
                try {
                    if (this.f79792f == null) {
                        this.f79792f = m68834a(this.f79791e, this.f79787a, this.f79788b);
                    }
                } finally {
                    MethodCollector.m26664o(9849);
                }
            }
            return;
        }
        MethodCollector.m26664o(9849);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo11580a(TypedInput typedInput) {
        mo59945a();
        return this.f79792f.mo11580a(typedInput);
    }

    /* renamed from: a */
    private static <T> T m68836a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    private <T> AbstractC22043e<TypedInput, T> m68834a(AbstractC22043e.AbstractC22044a aVar, Type type, Annotation[] annotationArr) {
        m68836a(type, "type == null");
        m68836a(annotationArr, "annotations == null");
        int indexOf = this.f79790d.indexOf(aVar) + 1;
        int size = this.f79790d.size();
        for (int i = indexOf; i < size; i++) {
            AbstractC22043e<TypedInput, T> eVar = (AbstractC22043e<TypedInput, T>) this.f79790d.get(i).mo11574a(type, annotationArr, this.f79789c);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate TypeInput converter for ").append(type).append(".\n");
        if (aVar != null) {
            append.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                append.append("\n   * ").append(this.f79790d.get(i2).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.f79790d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            append.append("\n   * ").append(this.f79790d.get(i3).getClass().getName());
        }
        throw new IllegalArgumentException(append.toString());
    }

    C33608b(Type type, Annotation[] annotationArr, C22092q qVar, List<AbstractC22043e.AbstractC22044a> list, AbstractC22043e.AbstractC22044a aVar) {
        MethodCollector.m26663i(9699);
        this.f79787a = type;
        this.f79788b = annotationArr;
        this.f79789c = qVar;
        this.f79790d = list;
        this.f79791e = aVar;
        if (f79786g == null) {
            synchronized (C33608b.class) {
                try {
                    if (f79786g == null) {
                        f79786g = C40780g.m82241a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9699);
                    throw th;
                }
            }
        }
        f79786g.submit(new RunnableC33609c(this));
        MethodCollector.m26664o(9699);
    }
}
