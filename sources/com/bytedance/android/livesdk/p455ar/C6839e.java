package com.bytedance.android.livesdk.p455ar;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.p383a.C5828a;
import com.bytedance.android.live.network.response.p383a.C5829b;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87086h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.ar.e */
public final class C6839e implements AbstractC87086h {

    /* renamed from: a */
    private final Type f17135a;

    static {
        Covode.recordClassIndex(7577);
    }

    public C6839e(Type type) {
        this.f17135a = type;
    }

    /* renamed from: a */
    private static <T> T m14630a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static RequestError m14626a(C5828a aVar) {
        RequestError requestError = new RequestError();
        requestError.message = aVar.f14688b;
        requestError.prompts = aVar.f14689c;
        requestError.alert = aVar.f14690d;
        return requestError;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Class[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87086h
    /* renamed from: a */
    public final Object mo13094a(byte[] bArr) {
        Object obj;
        MethodCollector.m26663i(9938);
        Type type = this.f17135a;
        Object obj2 = null;
        if (!(type instanceof ParameterizedType)) {
            MethodCollector.m26664o(9938);
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class)) {
            MethodCollector.m26664o(9938);
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[2];
        if (actualTypeArguments.length > 0) {
            if (!(actualTypeArguments[0] instanceof Class)) {
                MethodCollector.m26664o(9938);
                return null;
            }
            clsArr[0] = actualTypeArguments[0];
        }
        if (actualTypeArguments.length == 2) {
            if (!(actualTypeArguments[1] instanceof Class)) {
                MethodCollector.m26664o(9938);
                return null;
            }
            clsArr[1] = actualTypeArguments[1];
        } else if (actualTypeArguments.length > 2) {
            MethodCollector.m26664o(9938);
            return null;
        }
        if (rawType == C5832d.class || rawType == C5831c.class || rawType == C5830b.class || rawType == C5827a.class) {
            C2730f fVar = new C2730f();
            fVar.mo7308a(C2726d.m7875a(new ByteArrayInputStream(bArr)));
            try {
                C5829b a = C5829b.m12765a(fVar);
                if (a.f14694b != null) {
                    fVar.mo7308a(C2726d.m7876a(a.f14694b));
                }
                if (a.f14694b == null) {
                    fVar = null;
                }
                if (rawType == C5832d.class) {
                    obj = m14628a(clsArr[0], fVar, a.f14693a);
                } else {
                    if (rawType == C5831c.class) {
                        obj2 = m14633b(clsArr[0], fVar, a.f14693a);
                    } else if (rawType == C5830b.class) {
                        obj = m14627a(clsArr[0], clsArr[1], fVar, a.f14693a);
                    } else {
                        obj2 = m14632b(clsArr[0], clsArr[1], fVar, a.f14693a);
                    }
                    MethodCollector.m26664o(9938);
                    return obj2;
                }
                if (obj != null) {
                    MethodCollector.m26664o(9938);
                    return obj;
                }
                MethodCollector.m26664o(9938);
                return obj2;
            } catch (IOException unused) {
                MethodCollector.m26664o(9938);
                return null;
            } catch (Exception unused2) {
                MethodCollector.m26664o(9938);
                return null;
            }
        } else {
            MethodCollector.m26664o(9938);
            return null;
        }
    }

    /* renamed from: a */
    private static void m14631a(Extra extra, C5828a aVar) {
        extra.now = aVar.f14691e;
    }

    /* renamed from: a */
    private static <T extends Extra> T m14629a(C5828a aVar, Class<T> cls) {
        if (TextUtils.isEmpty(aVar.f14692f)) {
            return null;
        }
        return (T) ((Extra) C4139e.C4140a.f11575b.mo46670a(aVar.f14692f, (Class) cls));
    }

    /* renamed from: a */
    private static C5832d m14628a(Class cls, C2730f fVar, C5828a aVar) {
        C5832d dVar = new C5832d();
        dVar.statusCode = aVar.f14687a;
        Extra extra = new Extra();
        m14631a(extra, aVar);
        dVar.extra = extra;
        if (aVar.f14687a != 0) {
            dVar.error = m14626a(aVar);
        } else if (fVar != null) {
            long a = fVar.mo7307a();
            while (true) {
                int b = fVar.mo7310b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    dVar.data = C5809h.m12739a().mo11582a(cls).mo7304a(fVar);
                } else {
                    C2731g.m7903c(fVar);
                }
            }
            fVar.mo7309a(a);
            if (dVar.data == null) {
                dVar.data = m14630a(cls);
            }
        } else {
            dVar.data = m14630a(cls);
        }
        return dVar;
    }

    /* renamed from: b */
    private static C5831c m14633b(Class cls, C2730f fVar, C5828a aVar) {
        C5831c cVar = new C5831c();
        cVar.f14683a = aVar.f14687a;
        Extra extra = new Extra();
        m14631a(extra, aVar);
        cVar.f14685c = extra;
        if (aVar.f14687a == 0) {
            cVar.f14684b = new ArrayList();
            if (fVar != null) {
                long a = fVar.mo7307a();
                while (true) {
                    int b = fVar.mo7310b();
                    if (b == -1) {
                        break;
                    } else if (b == 1) {
                        cVar.f14684b.add(C5809h.m12739a().mo11582a(cls).mo7304a(fVar));
                    } else {
                        C2731g.m7903c(fVar);
                    }
                }
                fVar.mo7309a(a);
            }
        } else {
            cVar.f14686d = m14626a(aVar);
        }
        return cVar;
    }

    /* renamed from: a */
    private static C5830b m14627a(Class cls, Class cls2, C2730f fVar, C5828a aVar) {
        C5830b bVar = new C5830b();
        bVar.statusCode = aVar.f14687a;
        if (aVar.f14687a != 0) {
            bVar.error = m14626a(aVar);
            bVar.extra = (R) m14629a(aVar, cls2);
        } else if (fVar != null) {
            long a = fVar.mo7307a();
            while (true) {
                int b = fVar.mo7310b();
                if (b == -1) {
                    break;
                } else if (b == 1) {
                    bVar.data = (T) C5809h.m12739a().mo11582a(cls).mo7304a(fVar);
                } else if (b != 2) {
                    C2731g.m7903c(fVar);
                } else {
                    bVar.extra = (R) ((Extra) C5809h.m12739a().mo11582a(cls2).mo7304a(fVar));
                    m14631a(bVar.extra, aVar);
                }
            }
            fVar.mo7309a(a);
            if (bVar.data == null) {
                bVar.data = (T) m14630a(cls);
            }
            if (bVar.extra == null) {
                bVar.extra = (R) ((Extra) m14630a(cls2));
            }
        } else {
            bVar.data = (T) m14630a(cls);
            bVar.extra = (R) ((Extra) m14630a(cls2));
        }
        return bVar;
    }

    /* renamed from: b */
    private static C5827a m14632b(Class cls, Class cls2, C2730f fVar, C5828a aVar) {
        C5827a aVar2 = new C5827a();
        aVar2.f14683a = aVar.f14687a;
        if (aVar.f14687a == 0) {
            aVar2.f14684b = new ArrayList();
            if (fVar != null) {
                long a = fVar.mo7307a();
                while (true) {
                    int b = fVar.mo7310b();
                    if (b == -1) {
                        break;
                    } else if (b == 1) {
                        aVar2.f14684b.add((T) C5809h.m12739a().mo11582a(cls).mo7304a(fVar));
                    } else if (b != 2) {
                        C2731g.m7903c(fVar);
                    } else {
                        aVar2.f14685c = (R) ((Extra) C5809h.m12739a().mo11582a(cls2).mo7304a(fVar));
                        m14631a(aVar2.f14685c, aVar);
                    }
                }
                fVar.mo7309a(a);
                if (aVar2.f14685c == null) {
                    aVar2.f14685c = (R) ((Extra) m14630a(cls2));
                }
            } else {
                aVar2.f14685c = (R) ((Extra) m14630a(cls2));
            }
        } else {
            aVar2.f14686d = m14626a(aVar);
            aVar2.f14685c = (R) m14629a(aVar, cls2);
        }
        return aVar2;
    }
}
