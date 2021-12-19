package com.bytedance.android.live.p176b;

import android.net.Uri;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27919i;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.b.n */
public final class C2940n {

    /* renamed from: a */
    private static final AbstractC89244h f8682a = C89250i.m154773a((AbstractC89171a) C2941a.f8683a);

    /* renamed from: com.bytedance.android.live.b.n$a */
    static final class C2941a extends AbstractC89220m implements AbstractC89171a<C29421> {

        /* renamed from: a */
        public static final C2941a f8683a = new C2941a();

        static {
            Covode.recordClassIndex(3380);
        }

        C2941a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C29421 invoke() {
            return new AbstractC28031v<AbstractC28019l>() {
                /* class com.bytedance.android.live.p176b.C2940n.C2941a.C29421 */

                static {
                    Covode.recordClassIndex(3381);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.gson.AbstractC28031v
                public final /* synthetic */ AbstractC28019l read(C27897a aVar) {
                    AbstractC28019l read = C27949i.f65708X.read(aVar);
                    C89219l.m154716b(read, "");
                    return read;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void write(C27900c cVar, AbstractC28019l lVar) {
                    C89219l.m154721d(cVar, "");
                    if (lVar == null || (lVar instanceof C28021n)) {
                        cVar.mo46654f();
                        return;
                    }
                    if (lVar instanceof C28025r) {
                        C28025r l = lVar.mo46791l();
                        C89219l.m154716b(l, "");
                        if (l.f65806a instanceof Number) {
                            long f = lVar.mo46693f();
                            if (f >= 2147483647L || f <= -2147483648L) {
                                cVar.mo46648b(lVar.mo46689c());
                                return;
                            }
                        }
                    }
                    if (lVar instanceof C27919i) {
                        cVar.mo46647b();
                        C27919i<AbstractC28019l> k = lVar.mo46790k();
                        C89219l.m154716b(k, "");
                        for (AbstractC28019l lVar2 : k) {
                            write(cVar, lVar2);
                        }
                        cVar.mo46649c();
                    } else if (lVar instanceof C28022o) {
                        cVar.mo46652d();
                        Set<Map.Entry<String, AbstractC28019l>> entrySet = lVar.mo46789j().f65804a.entrySet();
                        C89219l.m154716b(entrySet, "");
                        for (T t : entrySet) {
                            cVar.mo46645a((String) t.getKey());
                            write(cVar, (AbstractC28019l) t.getValue());
                        }
                        cVar.mo46653e();
                    } else {
                        C27949i.f65708X.write(cVar, lVar);
                    }
                }
            };
        }
    }

    static {
        Covode.recordClassIndex(3379);
    }

    /* renamed from: a */
    private static List<Object> m8268a(C27919i iVar) {
        C89219l.m154721d(iVar, "");
        return new C2920c(iVar);
    }

    /* renamed from: a */
    public static final Map<String, Object> m8269a(C28022o oVar) {
        C89219l.m154721d(oVar, "");
        return new C2925d(oVar);
    }

    /* renamed from: a */
    public static final <T extends AbstractC28019l> String m8267a(T t) {
        C89219l.m154721d(t, "");
        StringWriter stringWriter = new StringWriter();
        C27900c cVar = new C27900c(stringWriter);
        cVar.f65525b = true;
        ((AbstractC28031v) f8682a.getValue()).write(cVar, t);
        String stringWriter2 = stringWriter.toString();
        C89219l.m154716b(stringWriter2, "");
        return stringWriter2;
    }

    /* renamed from: b */
    public static final Object m8270b(AbstractC28019l lVar) {
        if (lVar instanceof C28021n) {
            return null;
        }
        if (lVar instanceof C28022o) {
            return m8269a((C28022o) lVar);
        }
        if (lVar instanceof C27919i) {
            return m8268a((C27919i) lVar);
        }
        if (lVar instanceof C28025r) {
            C28025r rVar = (C28025r) lVar;
            if (rVar.f65806a instanceof Number) {
                return rVar.mo46688b();
            }
            if (rVar.f65806a instanceof String) {
                return rVar.mo46689c();
            }
            if (rVar.f65806a instanceof Boolean) {
                return Boolean.valueOf(rVar.mo46695h());
            }
            throw new IllegalStateException("Unknown JsonPrimitive type: " + rVar.getClass().getCanonicalName());
        }
        throw new IllegalStateException("Unknown JsonElement type: " + lVar.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static final int m8266a(Uri uri, String str, String str2) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        if (str2 == null) {
            return 0;
        }
        if (C89361p.m154876c(str2, "rpx", false)) {
            return (int) ((Float.parseFloat(C89361p.m154913b(str2, (CharSequence) "rpx")) / 750.0f) * ((float) C3966y.m9664c()));
        }
        if (!C89361p.m154876c(str2, "%", false)) {
            return C3966y.m9653a(Float.parseFloat(str2));
        }
        float parseFloat = Float.parseFloat(C89361p.m154913b(str2, (CharSequence) "%")) / 100.0f;
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "width", false)) {
            return (int) (((float) C3966y.m9664c()) * parseFloat);
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "height", false)) {
            return (int) (((float) C3966y.m9662b()) * parseFloat);
        }
        return (int) (((float) C3966y.m9664c()) * parseFloat);
    }
}
