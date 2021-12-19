package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.p383a.C5828a;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a.C14761a;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.network.f */
public final class C5806f extends AbstractC22043e.AbstractC22044a {

    /* renamed from: a */
    private ThreadLocal<C2730f> f14647a = new ThreadLocal<>();

    /* renamed from: b */
    private C14761a f14648b;

    static {
        Covode.recordClassIndex(6406);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0 A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo11576a(java.lang.Class r14, java.lang.Class[] r15, java.lang.String r16, java.lang.reflect.Type r17, java.lang.annotation.Annotation[] r18, com.bytedance.retrofit2.C22092q r19, com.bytedance.retrofit2.mime.TypedInput r20) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.network.C5806f.mo11576a(java.lang.Class, java.lang.Class[], java.lang.String, java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.q, com.bytedance.retrofit2.mime.TypedInput):java.lang.Object");
    }

    C5806f(C14761a aVar) {
        this.f14648b = aVar;
    }

    /* renamed from: a */
    private static RequestError m12721a(C5828a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f14688b;
        requestError.prompts = aVar.f14689c;
        requestError.alert = aVar.f14690d;
        return requestError;
    }

    /* renamed from: a */
    private static void m12726a(Extra extra, C5828a aVar) {
        extra.now = aVar.f14691e;
    }

    /* renamed from: a */
    private static <T extends Extra> T m12724a(C5828a aVar, Class<T> cls) {
        if (TextUtils.isEmpty(aVar.f14692f)) {
            return null;
        }
        return (T) ((Extra) C4139e.C4140a.f11575b.mo46670a(aVar.f14692f, (Class) cls));
    }

    /* renamed from: a */
    private static boolean m12727a(Class<?> cls, C2730f fVar) {
        if (cls != null && cls != Void.class) {
            return true;
        }
        long a = fVar.mo7307a();
        while (fVar.mo7310b() != -1) {
            C2731g.m7903c(fVar);
        }
        fVar.mo7309a(a);
        return false;
    }

    /* renamed from: b */
    private AbstractC22043e<TypedInput, ?> m12729b(Type type, Annotation[] annotationArr, C22092q qVar) {
        return this.f14648b.mo11574a(type, annotationArr, qVar);
    }

    /* renamed from: a */
    private static C5831c m12723a(Class cls, C2730f fVar, C5828a aVar) {
        C5831c cVar = new C5831c();
        cVar.f14683a = aVar.f14687a;
        Extra extra = new Extra();
        m12726a(extra, aVar);
        cVar.f14685c = extra;
        cVar.f14684b = new ArrayList();
        if (aVar.f14687a == 0) {
            long a = fVar.mo7307a();
            while (true) {
                int b = fVar.mo7310b();
                if (b == -1) {
                    break;
                } else if (b != 1) {
                    C2731g.m7903c(fVar);
                } else if (m12727a(cls, fVar)) {
                    cVar.f14684b.add(C5809h.m12739a().mo11582a(cls).mo7304a(fVar));
                }
            }
            fVar.mo7309a(a);
        } else {
            cVar.f14686d = m12721a(aVar);
        }
        return cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Class[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<TypedInput, ?> mo11574a(Type type, Annotation[] annotationArr, C22092q qVar) {
        if (!(type instanceof ParameterizedType)) {
            return m12729b(type, annotationArr, qVar);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            return m12729b(type, annotationArr, qVar);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        int i = 0;
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                return m12729b(type, annotationArr, qVar);
            }
            clsArr[0] = actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                return m12729b(type, annotationArr, qVar);
            }
            clsArr[1] = actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            return m12729b(type, annotationArr, qVar);
        }
        Class cls = (Class) rawType;
        if (cls != C5832d.class && cls != C5831c.class && cls != C5830b.class && cls != C5827a.class) {
            return m12729b(type, annotationArr, qVar);
        }
        String str = null;
        int length = annotationArr.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Annotation annotation = annotationArr[i];
            if (annotation instanceof AbstractC22000h) {
                str = ((AbstractC22000h) annotation).mo35789a();
                break;
            } else if (annotation instanceof AbstractC22012t) {
                str = ((AbstractC22012t) annotation).mo35799a();
                break;
            } else {
                i++;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "/";
        }
        return new C5808g(this, cls, clsArr, str, type, annotationArr, qVar);
    }

    @Override // com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a
    /* renamed from: a */
    public final AbstractC22043e<?, TypedOutput> mo11575a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C22092q qVar) {
        return this.f14648b.mo11575a(type, annotationArr, annotationArr2, qVar);
    }

    /* renamed from: a */
    private static C5830b m12722a(Class cls, Class cls2, C2730f fVar, C5828a aVar) {
        C5830b bVar = new C5830b();
        bVar.statusCode = aVar.f14687a;
        if (aVar.f14687a == 0) {
            long a = fVar.mo7307a();
            while (true) {
                int b = fVar.mo7310b();
                if (b == -1) {
                    break;
                } else if (b != 1) {
                    if (b != 2) {
                        C2731g.m7903c(fVar);
                    } else {
                        bVar.extra = (R) ((Extra) C5809h.m12739a().mo11582a(cls2).mo7304a(fVar));
                        m12726a(bVar.extra, aVar);
                    }
                } else if (m12727a(cls, fVar)) {
                    bVar.data = (T) C5809h.m12739a().mo11582a(cls).mo7304a(fVar);
                } else {
                    bVar.data = (T) new Object();
                }
            }
            fVar.mo7309a(a);
        } else {
            bVar.error = m12721a(aVar);
            bVar.extra = (R) m12724a(aVar, cls2);
        }
        return bVar;
    }

    /* renamed from: b */
    private static C5827a m12728b(Class cls, Class cls2, C2730f fVar, C5828a aVar) {
        C5827a aVar2 = new C5827a();
        aVar2.f14683a = aVar.f14687a;
        if (aVar.f14687a == 0) {
            aVar2.f14684b = new ArrayList();
            long a = fVar.mo7307a();
            while (true) {
                int b = fVar.mo7310b();
                if (b == -1) {
                    break;
                } else if (b != 1) {
                    if (b != 2) {
                        C2731g.m7903c(fVar);
                    } else {
                        aVar2.f14685c = (R) ((Extra) C5809h.m12739a().mo11582a(cls2).mo7304a(fVar));
                        m12726a(aVar2.f14685c, aVar);
                    }
                } else if (m12727a(cls, fVar)) {
                    aVar2.f14684b.add((T) C5809h.m12739a().mo11582a(cls).mo7304a(fVar));
                }
            }
            fVar.mo7309a(a);
        } else {
            aVar2.f14686d = m12721a(aVar);
            aVar2.f14685c = (R) m12724a(aVar, cls2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private <T, S> Object m12725a(int i, T t, S s, String str, Type type, Annotation[] annotationArr, C22092q qVar) {
        MethodCollector.m26663i(13574);
        C28022o oVar = new C28022o();
        oVar.mo46800a("status_code", Integer.valueOf(i));
        oVar.mo46797a("data", C5810i.m12748a().mo46661a((Object) t));
        oVar.mo46797a("extra", C5810i.m12748a().mo46661a((Object) s));
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new String(C5809h.m12739a().mo11585a(LiveMtPbRequestsSetting.INSTANCE.getValue().getPassThroughApi() + str, new ArrayList(), "application/json", C5810i.m12748a().mo46672a((AbstractC28019l) oVar).getBytes()).mo18908a().f28196e).getBytes(Charset.forName("UTF-8")));
        Object a = m12729b(type, annotationArr, qVar).mo11580a(new TypedInput() {
            /* class com.bytedance.android.live.network.C5806f.C58071 */

            static {
                Covode.recordClassIndex(6407);
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final String mimeType() {
                return "application/json";
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            /* renamed from: in */
            public final InputStream mo11577in() {
                return byteArrayInputStream;
            }

            @Override // com.bytedance.retrofit2.mime.TypedInput
            public final long length() {
                return (long) byteArrayInputStream.available();
            }
        });
        MethodCollector.m26664o(13574);
        return a;
    }
}
