package com.google.firebase.p2008a.p2009a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2008a.AbstractC27673a;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27684f;
import com.google.firebase.p2008a.AbstractC27685g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.firebase.a.a.a */
public final class C27674a {

    /* renamed from: c */
    private static final AbstractC27684f<String> f65066c = C27677b.f65073a;

    /* renamed from: d */
    private static final AbstractC27684f<Boolean> f65067d = C27678c.f65074a;

    /* renamed from: e */
    private static final C27676a f65068e = new C27676a((byte) 0);

    /* renamed from: a */
    public final Map<Class<?>, AbstractC27682d<?>> f65069a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, AbstractC27684f<?>> f65070b = new HashMap();

    /* renamed from: com.google.firebase.a.a.a$a */
    static final class C27676a implements AbstractC27684f<Date> {

        /* renamed from: a */
        private static final DateFormat f65072a;

        private C27676a() {
        }

        static {
            Covode.recordClassIndex(33256);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f65072a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        /* synthetic */ C27676a(byte b) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.google.firebase.p2008a.AbstractC27680b
        /* renamed from: a */
        public final /* synthetic */ void mo41005a(Object obj, AbstractC27685g gVar) {
            gVar.mo46306a(f65072a.format((Date) obj));
        }
    }

    /* renamed from: a */
    public final AbstractC27673a mo46301a() {
        return new AbstractC27673a() {
            /* class com.google.firebase.p2008a.p2009a.C27674a.C276751 */

            static {
                Covode.recordClassIndex(33255);
            }

            @Override // com.google.firebase.p2008a.AbstractC27673a
            /* renamed from: a */
            public final String mo46298a(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    mo46299a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }

            @Override // com.google.firebase.p2008a.AbstractC27673a
            /* renamed from: a */
            public final void mo46299a(Object obj, Writer writer) {
                C27679d dVar = new C27679d(writer, C27674a.this.f65069a, C27674a.this.f65070b);
                dVar.mo46302a(obj);
                dVar.mo46308a();
                dVar.f65075a.flush();
            }
        };
    }

    static {
        Covode.recordClassIndex(33254);
    }

    public C27674a() {
        m55322a(String.class, f65066c);
        m55322a(Boolean.class, f65067d);
        m55322a(Date.class, f65068e);
    }

    /* renamed from: a */
    private <T> C27674a m55322a(Class<T> cls, AbstractC27684f<? super T> fVar) {
        if (!this.f65070b.containsKey(cls)) {
            this.f65070b.put(cls, fVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }

    /* renamed from: a */
    public final <T> C27674a mo46300a(Class<T> cls, AbstractC27682d<? super T> dVar) {
        if (!this.f65069a.containsKey(cls)) {
            this.f65069a.put(cls, dVar);
            return this;
        }
        throw new IllegalArgumentException("Encoder already registered for " + cls.getName());
    }
}
