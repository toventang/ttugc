package com.bytedance.android.livesdk.p455ar;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.reflect.Array;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ar.g */
public abstract class AbstractC6841g<T> {
    static {
        Covode.recordClassIndex(7579);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13096a(C6855k kVar, T t);

    /* renamed from: com.bytedance.android.livesdk.ar.g$f */
    static final class C6849f extends AbstractC6841g<Object> {
        static {
            Covode.recordClassIndex(7587);
        }

        C6849f() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final void mo13096a(C6855k kVar, Object obj) {
            kVar.mo13102a((Object) obj.toString());
        }
    }

    AbstractC6841g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC6841g<Iterable<T>> mo13095a() {
        return new AbstractC6841g<Iterable<T>>() {
            /* class com.bytedance.android.livesdk.p455ar.AbstractC6841g.C68421 */

            static {
                Covode.recordClassIndex(7580);
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
            /* renamed from: a */
            public final /* synthetic */ void mo13096a(C6855k kVar, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        AbstractC6841g.this.mo13096a(kVar, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC6841g<Object> mo13097b() {
        return new AbstractC6841g<Object>() {
            /* class com.bytedance.android.livesdk.p455ar.AbstractC6841g.C68432 */

            static {
                Covode.recordClassIndex(7581);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.ar.g */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
            /* renamed from: a */
            public final void mo13096a(C6855k kVar, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        AbstractC6841g.this.mo13096a(kVar, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ar.g$a */
    public static final class C6844a<T> extends AbstractC6841g<T> {

        /* renamed from: a */
        private final boolean f17139a = false;

        /* renamed from: b */
        private final AbstractC22043e<T, TypedOutput> f17140b;

        static {
            Covode.recordClassIndex(7582);
        }

        C6844a(AbstractC22043e<T, TypedOutput> eVar) {
            this.f17140b = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ byte[] mo13098a(Object obj) {
            try {
                return ((TypedByteArray) this.f17140b.mo11580a(obj)).getBytes();
            } catch (Exception e) {
                throw new RuntimeException("Unable to convert " + obj + " to TypedOutput", e);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final void mo13096a(C6855k kVar, T t) {
            if (t != null) {
                kVar.f17190b = "application/json; charset=UTF-8";
                kVar.f17194f = new C6850h(this, t);
            } else if (!this.f17139a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ar.g$c */
    static final class C6846c<T> extends AbstractC6841g<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f17144a;

        /* renamed from: b */
        private final boolean f17145b;

        static {
            Covode.recordClassIndex(7584);
        }

        C6846c(AbstractC22043e<T, String> eVar, boolean z) {
            this.f17144a = eVar;
            this.f17145b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final /* synthetic */ void mo13096a(C6855k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.mo13105b(str, (String) this.f17144a.mo11580a(value), this.f17145b);
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

    /* renamed from: com.bytedance.android.livesdk.ar.g$e */
    static final class C6848e<T> extends AbstractC6841g<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f17149a;

        /* renamed from: b */
        private final boolean f17150b;

        static {
            Covode.recordClassIndex(7586);
        }

        C6848e(AbstractC22043e<T, String> eVar, boolean z) {
            this.f17149a = eVar;
            this.f17150b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final /* synthetic */ void mo13096a(C6855k kVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar.mo13104a(str, (String) this.f17149a.mo11580a(value), this.f17150b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ar.g$b */
    static final class C6845b<T> extends AbstractC6841g<T> {

        /* renamed from: a */
        private final String f17141a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f17142b;

        /* renamed from: c */
        private final boolean f17143c;

        static {
            Covode.recordClassIndex(7583);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final void mo13096a(C6855k kVar, T t) {
            if (t != null) {
                kVar.mo13105b(this.f17141a, this.f17142b.mo11580a(t), this.f17143c);
            }
        }

        C6845b(String str, AbstractC22043e<T, String> eVar, boolean z) {
            this.f17141a = (String) C6856l.m14666a(str, "name == null");
            this.f17142b = eVar;
            this.f17143c = z;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ar.g$d */
    static final class C6847d<T> extends AbstractC6841g<T> {

        /* renamed from: a */
        private final String f17146a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f17147b;

        /* renamed from: c */
        private final boolean f17148c;

        static {
            Covode.recordClassIndex(7585);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.p455ar.AbstractC6841g
        /* renamed from: a */
        public final void mo13096a(C6855k kVar, T t) {
            if (t != null) {
                kVar.mo13104a(this.f17146a, this.f17147b.mo11580a(t), this.f17148c);
            }
        }

        C6847d(String str, AbstractC22043e<T, String> eVar, boolean z) {
            this.f17146a = (String) C6856l.m14666a(str, "name == null");
            this.f17147b = eVar;
            this.f17148c = z;
        }
    }
}
