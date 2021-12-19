package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.p1611a.AbstractC21986b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.AbstractC90025ab;
import okhttp3.C90198s;
import okhttp3.C90205x;

/* renamed from: com.bytedance.retrofit2.o */
public abstract class AbstractC22061o<T> {
    static {
        Covode.recordClassIndex(25761);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo35874a(RequestBuilder requestBuilder, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$c */
    public static final class C22066c extends AbstractC22061o<AbstractC90025ab> {

        /* renamed from: a */
        static final C22066c f52096a = new C22066c();

        C22066c() {
        }

        static {
            Covode.recordClassIndex(25766);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, AbstractC90025ab abVar) {
            AbstractC90025ab abVar2 = abVar;
            if (abVar2 != null) {
                requestBuilder.f51989o = abVar2;
                requestBuilder.f51990p = true;
                return;
            }
            throw new IllegalArgumentException("Body parameter value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$f */
    public static final class C22069f extends AbstractC22061o<C90205x.C90207b> {

        /* renamed from: a */
        static final C22069f f52099a = new C22069f();

        C22069f() {
        }

        static {
            Covode.recordClassIndex(25769);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo35874a(RequestBuilder requestBuilder, C90205x.C90207b bVar) {
            C90205x.C90207b bVar2 = bVar;
            if (bVar2 != null) {
                requestBuilder.f51988n.mo145082a(bVar2);
            }
            requestBuilder.f51990p = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$u */
    public static final class C22084u<T> extends AbstractC22061o<T> {
        static {
            Covode.recordClassIndex(25784);
        }

        C22084u() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                if (t instanceof AbstractC21986b) {
                    requestBuilder.f51978d = t.mo35780a();
                    return;
                }
                throw new RuntimeException("wrong type:" + t.getClass() + ",not implement QueryParamObject");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$v */
    public static final class C22085v extends AbstractC22061o<Object> {
        static {
            Covode.recordClassIndex(25785);
        }

        C22085v() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, Object obj) {
            Objects.requireNonNull(obj, "@Url parameter is null.");
            requestBuilder.f51977c = obj.toString();
        }
    }

    AbstractC22061o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC22061o<Iterable<T>> mo35873a() {
        return new AbstractC22061o<Iterable<T>>() {
            /* class com.bytedance.retrofit2.AbstractC22061o.C220621 */

            static {
                Covode.recordClassIndex(25762);
            }

            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.AbstractC22061o
            /* renamed from: a */
            public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
                Iterable<T> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (T t : iterable) {
                        AbstractC22061o.this.mo35874a(requestBuilder, t);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC22061o<Object> mo35875b() {
        return new AbstractC22061o<Object>() {
            /* class com.bytedance.retrofit2.AbstractC22061o.C220632 */

            static {
                Covode.recordClassIndex(25763);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.retrofit2.o */
            /* JADX WARN: Multi-variable type inference failed */
            /* access modifiers changed from: package-private */
            @Override // com.bytedance.retrofit2.AbstractC22061o
            /* renamed from: a */
            public final void mo35874a(RequestBuilder requestBuilder, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        AbstractC22061o.this.mo35874a(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$d */
    public static final class C22067d extends AbstractC22061o<AbstractC90025ab> {

        /* renamed from: a */
        private final C90198s f52097a;

        static {
            Covode.recordClassIndex(25767);
        }

        C22067d(C90198s sVar) {
            this.f52097a = sVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo35874a(RequestBuilder requestBuilder, AbstractC90025ab abVar) {
            AbstractC90025ab abVar2 = abVar;
            if (abVar2 != null) {
                requestBuilder.mo35751a(this.f52097a, abVar2);
                requestBuilder.f51990p = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$e */
    public static final class C22068e extends AbstractC22061o<Map<String, AbstractC90025ab>> {

        /* renamed from: a */
        private final String f52098a;

        static {
            Covode.recordClassIndex(25768);
        }

        C22068e(String str) {
            this.f52098a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.retrofit2.RequestBuilder, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Map<String, AbstractC90025ab> map) {
            Map<String, AbstractC90025ab> map2 = map;
            if (map2 != null) {
                for (Map.Entry<String, AbstractC90025ab> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        AbstractC90025ab value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo35751a(C90198s.m156771a("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f52098a), value);
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                requestBuilder.f51990p = true;
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$k */
    public static final class C22074k<T> extends AbstractC22061o<List<T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, C22027b> f52108a;

        static {
            Covode.recordClassIndex(25774);
        }

        C22074k(AbstractC22043e<T, C22027b> eVar) {
            this.f52108a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.bytedance.retrofit2.e<T, com.bytedance.retrofit2.client.b> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
            List<Object> list = (List) obj;
            if (list != null) {
                for (Object obj2 : list) {
                    C22027b bVar = (C22027b) this.f52108a.mo11580a(obj2);
                    requestBuilder.mo35749a(bVar.f52037a, bVar.f52038b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$l */
    public static final class C22075l<T> extends AbstractC22061o<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52109a;

        static {
            Covode.recordClassIndex(25775);
        }

        C22075l(AbstractC22043e<T, String> eVar) {
            this.f52109a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo35749a(str, (String) this.f52109a.mo11580a(value));
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
    /* renamed from: com.bytedance.retrofit2.o$w */
    public static final class C22086w<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        final Class<T> f52127a;

        static {
            Covode.recordClassIndex(25786);
        }

        C22086w(Class<T> cls) {
            this.f52127a = cls;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            requestBuilder.mo35748a(this.f52127a, t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$a */
    public static final class C22064a<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52093a;

        static {
            Covode.recordClassIndex(25764);
        }

        C22064a(AbstractC22043e<T, String> eVar) {
            this.f52093a = (AbstractC22043e) C22101w.m41535a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f51986l = Boolean.parseBoolean(this.f52093a.mo11580a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to AddCommonParam", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$g */
    public static final class C22070g<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final AbstractC22043e<T, Object> f52100a;

        static {
            Covode.recordClassIndex(25770);
        }

        C22070g(AbstractC22043e<T, Object> eVar) {
            this.f52100a = (AbstractC22043e) C22101w.m41535a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f51987m = this.f52100a.mo11580a(t);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to ExtraInfo", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$m */
    public static final class C22076m<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52110a;

        static {
            Covode.recordClassIndex(25776);
        }

        C22076m(AbstractC22043e<T, String> eVar) {
            this.f52110a = (AbstractC22043e) C22101w.m41535a(eVar, "converter == null");
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f51985k = Integer.parseInt(this.f52110a.mo11580a(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to MaxLength", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$b */
    public static final class C22065b<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final boolean f52094a;

        /* renamed from: b */
        private final AbstractC22043e<T, TypedOutput> f52095b;

        static {
            Covode.recordClassIndex(25765);
        }

        C22065b(boolean z, AbstractC22043e<T, TypedOutput> eVar) {
            this.f52094a = z;
            this.f52095b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f51981g = this.f52095b.mo11580a(t);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to TypedOutput", e);
                }
            } else if (!this.f52094a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$i */
    public static final class C22072i<T> extends AbstractC22061o<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52104a;

        /* renamed from: b */
        private final boolean f52105b;

        static {
            Covode.recordClassIndex(25772);
        }

        C22072i(AbstractC22043e<T, String> eVar, boolean z) {
            this.f52104a = eVar;
            this.f52105b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo35752b(str, (String) this.f52104a.mo11580a(value), this.f52105b);
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
    /* renamed from: com.bytedance.retrofit2.o$o */
    public static final class C22078o<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52113a;

        /* renamed from: b */
        private final AbstractC22043e<T, TypedOutput> f52114b;

        static {
            Covode.recordClassIndex(25778);
        }

        C22078o(String str, AbstractC22043e<T, TypedOutput> eVar) {
            this.f52113a = str;
            this.f52114b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    TypedOutput a = this.f52114b.mo11580a(t);
                    requestBuilder.f51980f.addPart(this.f52113a, a);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$p */
    public static final class C22079p<T> extends AbstractC22061o<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, TypedOutput> f52115a;

        /* renamed from: b */
        private final String f52116b;

        static {
            Covode.recordClassIndex(25779);
        }

        C22079p(AbstractC22043e<T, TypedOutput> eVar, String str) {
            this.f52115a = eVar;
            this.f52116b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.bytedance.retrofit2.e<T, com.bytedance.retrofit2.mime.TypedOutput> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.f51980f.addPart(str, this.f52116b, (TypedOutput) this.f52115a.mo11580a(value));
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
    /* renamed from: com.bytedance.retrofit2.o$s */
    public static final class C22082s<T> extends AbstractC22061o<Map<String, T>> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52123a;

        /* renamed from: b */
        private final boolean f52124b;

        static {
            Covode.recordClassIndex(25782);
        }

        C22082s(AbstractC22043e<T, String> eVar, boolean z) {
            this.f52123a = eVar;
            this.f52124b = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.bytedance.retrofit2.e<T, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final /* synthetic */ void mo35874a(RequestBuilder requestBuilder, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo35750a(str, (String) this.f52123a.mo11580a(value), this.f52124b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$t */
    public static final class C22083t<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final AbstractC22043e<T, String> f52125a;

        /* renamed from: b */
        private final boolean f52126b;

        static {
            Covode.recordClassIndex(25783);
        }

        C22083t(AbstractC22043e<T, String> eVar, boolean z) {
            this.f52125a = eVar;
            this.f52126b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.mo35750a(this.f52125a.mo11580a(t), null, this.f52126b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$j */
    public static final class C22073j<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52106a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f52107b;

        static {
            Covode.recordClassIndex(25773);
        }

        C22073j(String str, AbstractC22043e<T, String> eVar) {
            this.f52106a = (String) C22101w.m41535a(str, "name == null");
            this.f52107b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.mo35749a(this.f52106a, this.f52107b.mo11580a(t));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$n */
    public static final class C22077n<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52111a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f52112b;

        static {
            Covode.recordClassIndex(25777);
        }

        C22077n(String str, AbstractC22043e<T, String> eVar) {
            this.f52111a = (String) C22101w.m41535a(str, "name == null");
            this.f52112b = eVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                String str = this.f52111a;
                String a = this.f52112b.mo11580a(t);
                if (requestBuilder.f51975a != null) {
                    requestBuilder.f51975a = requestBuilder.f51975a.replace("{" + str + "}", a);
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Method parameter \"" + this.f52111a + "\" value must not be null.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$h */
    public static final class C22071h<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52101a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f52102b;

        /* renamed from: c */
        private final boolean f52103c;

        static {
            Covode.recordClassIndex(25771);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.mo35752b(this.f52101a, this.f52102b.mo11580a(t), this.f52103c);
            }
        }

        C22071h(String str, AbstractC22043e<T, String> eVar, boolean z) {
            this.f52101a = (String) C22101w.m41535a(str, "name == null");
            this.f52102b = eVar;
            this.f52103c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$r */
    public static final class C22081r<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52120a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f52121b;

        /* renamed from: c */
        private final boolean f52122c;

        static {
            Covode.recordClassIndex(25781);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                requestBuilder.mo35750a(this.f52120a, this.f52121b.mo11580a(t), this.f52122c);
            }
        }

        C22081r(String str, AbstractC22043e<T, String> eVar, boolean z) {
            this.f52120a = (String) C22101w.m41535a(str, "name == null");
            this.f52121b = eVar;
            this.f52122c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.retrofit2.o$q */
    public static final class C22080q<T> extends AbstractC22061o<T> {

        /* renamed from: a */
        private final String f52117a;

        /* renamed from: b */
        private final AbstractC22043e<T, String> f52118b;

        /* renamed from: c */
        private final boolean f52119c;

        static {
            Covode.recordClassIndex(25780);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.retrofit2.AbstractC22061o
        /* renamed from: a */
        public final void mo35874a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                String str = this.f52117a;
                String a = this.f52118b.mo11580a(t);
                boolean z = this.f52119c;
                if (requestBuilder.f51977c == null) {
                    throw new AssertionError();
                } else if (str == null) {
                    throw new IllegalArgumentException("Path replacement name must not be null.");
                } else if (a == null) {
                    throw new IllegalArgumentException("Path replacement \"" + str + "\" value must not be null.");
                } else if (z) {
                    try {
                        requestBuilder.f51977c = requestBuilder.f51977c.replace("{" + str + "}", URLEncoder.encode(String.valueOf(a), "UTF-8").replace("+", "%20"));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException("Unable to convert path parameter \"" + str + "\" value to UTF-8:" + a, e);
                    }
                } else {
                    requestBuilder.f51977c = requestBuilder.f51977c.replace("{" + str + "}", String.valueOf(a));
                }
            } else {
                throw new IllegalArgumentException("Path parameter \"" + this.f52117a + "\" value must not be null.");
            }
        }

        C22080q(String str, AbstractC22043e<T, String> eVar, boolean z) {
            this.f52117a = (String) C22101w.m41535a(str, "name == null");
            this.f52118b = eVar;
            this.f52119c = z;
        }
    }
}
