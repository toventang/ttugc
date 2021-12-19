package p4640l;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import okhttp3.C90198s;
import okhttp3.C90205x;

/* renamed from: l.i */
public abstract class AbstractC89759i<T> {
    static {
        Covode.recordClassIndex(105853);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo144305a(C89779k kVar, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$l */
    public static final class C89773l extends AbstractC89759i<C90205x.C90207b> {

        /* renamed from: a */
        static final C89773l f203544a = new C89773l();

        private C89773l() {
        }

        static {
            Covode.recordClassIndex(105867);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [l.k, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo144305a(C89779k kVar, C90205x.C90207b bVar) {
            C90205x.C90207b bVar2 = bVar;
            if (bVar2 != null) {
                kVar.f203549b.mo145082a(bVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$m */
    public static final class C89774m extends AbstractC89759i<Object> {
        static {
            Covode.recordClassIndex(105868);
        }

        C89774m() {
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, Object obj) {
            C89787o.m155873a(obj, "@Url parameter is null.");
            kVar.f203548a = obj.toString();
        }
    }

    AbstractC89759i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC89759i<Iterable<T>> mo144304a() {
        return new AbstractC89759i<Iterable<T>>() {
            /* class p4640l.AbstractC89759i.C897601 */

            static {
                Covode.recordClassIndex(105854);
            }

            /* access modifiers changed from: package-private */
            @Override // p4640l.AbstractC89759i
            /* renamed from: a */
            public final /* synthetic */ void mo144305a(C89779k kVar, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        AbstractC89759i.this.mo144305a(kVar, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC89759i<Object> mo144306b() {
        return new AbstractC89759i<Object>() {
            /* class p4640l.AbstractC89759i.C897612 */

            static {
                Covode.recordClassIndex(105855);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: l.i */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // p4640l.AbstractC89759i
            /* renamed from: a */
            public final void mo144305a(C89779k kVar, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        AbstractC89759i.this.mo144305a(kVar, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$a */
    public static final class C89762a<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final AbstractC89744e<T, AbstractC90025ab> f203521a;

        static {
            Covode.recordClassIndex(105856);
        }

        C89762a(AbstractC89744e<T, AbstractC90025ab> eVar) {
            this.f203521a = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            if (t != null) {
                try {
                    kVar.f203550c = this.f203521a.mo144266a(t);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$e */
    public static final class C89766e<T> extends AbstractC89759i<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC89744e<T, String> f203529a;

        static {
            Covode.recordClassIndex(105860);
        }

        C89766e(AbstractC89744e<T, String> eVar) {
            this.f203529a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final /* synthetic */ void mo144305a(C89779k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.mo144313a(str, (String) this.f203529a.mo144266a(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$c */
    public static final class C89764c<T> extends AbstractC89759i<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC89744e<T, String> f203525a;

        /* renamed from: b */
        private final boolean f203526b;

        static {
            Covode.recordClassIndex(105858);
        }

        C89764c(AbstractC89744e<T, String> eVar, boolean z) {
            this.f203525a = eVar;
            this.f203526b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final /* synthetic */ void mo144305a(C89779k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f203525a.mo144266a(value);
                            if (str2 != null) {
                                kVar.mo144316b(str, str2, this.f203526b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f203525a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$f */
    public static final class C89767f<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final C90198s f203530a;

        /* renamed from: b */
        private final AbstractC89744e<T, AbstractC90025ab> f203531b;

        static {
            Covode.recordClassIndex(105861);
        }

        C89767f(C90198s sVar, AbstractC89744e<T, AbstractC90025ab> eVar) {
            this.f203530a = sVar;
            this.f203531b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            if (t != null) {
                try {
                    kVar.mo144315a(this.f203530a, this.f203531b.mo144266a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$g */
    public static final class C89768g<T> extends AbstractC89759i<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC89744e<T, AbstractC90025ab> f203532a;

        /* renamed from: b */
        private final String f203533b;

        static {
            Covode.recordClassIndex(105862);
        }

        C89768g(AbstractC89744e<T, AbstractC90025ab> eVar, String str) {
            this.f203532a = eVar;
            this.f203533b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: l.e<T, okhttp3.ab> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final /* synthetic */ void mo144305a(C89779k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.mo144315a(C90198s.m156771a("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f203533b), (AbstractC90025ab) this.f203532a.mo144266a(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$j */
    public static final class C89771j<T> extends AbstractC89759i<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC89744e<T, String> f203540a;

        /* renamed from: b */
        private final boolean f203541b;

        static {
            Covode.recordClassIndex(105865);
        }

        C89771j(AbstractC89744e<T, String> eVar, boolean z) {
            this.f203540a = eVar;
            this.f203541b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: l.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final /* synthetic */ void mo144305a(C89779k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f203540a.mo144266a(value);
                            if (str2 != null) {
                                kVar.mo144314a(str, str2, this.f203541b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f203540a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$k */
    public static final class C89772k<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final AbstractC89744e<T, String> f203542a;

        /* renamed from: b */
        private final boolean f203543b;

        static {
            Covode.recordClassIndex(105866);
        }

        C89772k(AbstractC89744e<T, String> eVar, boolean z) {
            this.f203542a = eVar;
            this.f203543b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            if (t != null) {
                kVar.mo144314a(this.f203542a.mo144266a(t), null, this.f203543b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$d */
    public static final class C89765d<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final String f203527a;

        /* renamed from: b */
        private final AbstractC89744e<T, String> f203528b;

        static {
            Covode.recordClassIndex(105859);
        }

        C89765d(String str, AbstractC89744e<T, String> eVar) {
            this.f203527a = (String) C89787o.m155873a(str, "name == null");
            this.f203528b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            String a;
            if (t != null && (a = this.f203528b.mo144266a(t)) != null) {
                kVar.mo144313a(this.f203527a, a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$b */
    public static final class C89763b<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final String f203522a;

        /* renamed from: b */
        private final AbstractC89744e<T, String> f203523b;

        /* renamed from: c */
        private final boolean f203524c;

        static {
            Covode.recordClassIndex(105857);
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            String a;
            if (t != null && (a = this.f203523b.mo144266a(t)) != null) {
                kVar.mo144316b(this.f203522a, a, this.f203524c);
            }
        }

        C89763b(String str, AbstractC89744e<T, String> eVar, boolean z) {
            this.f203522a = (String) C89787o.m155873a(str, "name == null");
            this.f203523b = eVar;
            this.f203524c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$i */
    public static final class C89770i<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final String f203537a;

        /* renamed from: b */
        private final AbstractC89744e<T, String> f203538b;

        /* renamed from: c */
        private final boolean f203539c;

        static {
            Covode.recordClassIndex(105864);
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            String a;
            if (t != null && (a = this.f203538b.mo144266a(t)) != null) {
                kVar.mo144314a(this.f203537a, a, this.f203539c);
            }
        }

        C89770i(String str, AbstractC89744e<T, String> eVar, boolean z) {
            this.f203537a = (String) C89787o.m155873a(str, "name == null");
            this.f203538b = eVar;
            this.f203539c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.i$h */
    public static final class C89769h<T> extends AbstractC89759i<T> {

        /* renamed from: a */
        private final String f203534a;

        /* renamed from: b */
        private final AbstractC89744e<T, String> f203535b;

        /* renamed from: c */
        private final boolean f203536c;

        static {
            Covode.recordClassIndex(105863);
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.AbstractC89759i
        /* renamed from: a */
        public final void mo144305a(C89779k kVar, T t) {
            if (t != null) {
                String str = this.f203534a;
                String a = this.f203535b.mo144266a(t);
                boolean z = this.f203536c;
                if (kVar.f203548a != null) {
                    kVar.f203548a = kVar.f203548a.replace("{" + str + "}", C89779k.m155843a(a, z));
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f203534a + "\" value must not be null.");
        }

        C89769h(String str, AbstractC89744e<T, String> eVar, boolean z) {
            this.f203534a = (String) C89787o.m155873a(str, "name == null");
            this.f203535b = eVar;
            this.f203536c = z;
        }
    }
}
