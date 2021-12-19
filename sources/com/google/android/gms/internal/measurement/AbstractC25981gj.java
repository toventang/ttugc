package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.gj */
public abstract class AbstractC25981gj<MessageType extends AbstractC25981gj<MessageType, BuilderType>, BuilderType extends AbstractC25982a<MessageType, BuilderType>> extends AbstractC25931es<MessageType, BuilderType> {
    private static Map<Object, AbstractC25981gj<?, ?>> zzd = new ConcurrentHashMap();
    protected C26058ja zzb = C26058ja.f61368a;
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.measurement.gj$d */
    public static class C25985d<ContainingType extends AbstractC26020hq, Type> extends C25963ft<ContainingType, Type> {
        static {
            Covode.recordClassIndex(31400);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo42005a(int i);

    /* renamed from: com.google.android.gms.internal.measurement.gj$a */
    public static abstract class AbstractC25982a<MessageType extends AbstractC25981gj<MessageType, BuilderType>, BuilderType extends AbstractC25982a<MessageType, BuilderType>> extends AbstractC25930er<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f61239a;

        /* renamed from: b */
        protected boolean f61240b = false;

        /* renamed from: c */
        private final MessageType f61241c;

        static {
            Covode.recordClassIndex(31397);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC26022hs
        /* renamed from: H_ */
        public final /* synthetic */ AbstractC26020hq mo42615H_() {
            return this.f61241c;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC26022hs
        /* renamed from: G_ */
        public final boolean mo42614G_() {
            return AbstractC25981gj.m50561a((AbstractC25981gj) this.f61239a, false);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25930er
        /* renamed from: s */
        public final /* synthetic */ AbstractC25930er mo42361s() {
            return (AbstractC25930er) clone();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageType mo42628v() {
            if (this.f61240b) {
                return this.f61239a;
            }
            MessageType messagetype = this.f61239a;
            C26036if.f61331a.mo42708a(messagetype).mo42701c(messagetype);
            this.f61240b = true;
            return this.f61239a;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25930er, java.lang.Object
        public /* synthetic */ Object clone() {
            AbstractC25982a aVar = (AbstractC25982a) this.f61241c.mo42005a(C25986e.f61247e);
            aVar.mo42353a((AbstractC25981gj) mo42628v());
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public final void mo42626t() {
            MessageType messagetype = (MessageType) ((AbstractC25981gj) this.f61239a.mo42005a(C25986e.f61246d));
            m50574a(messagetype, this.f61239a);
            this.f61239a = messagetype;
        }

        /* renamed from: u */
        public final MessageType mo42629w() {
            MessageType a = mo42628v();
            if (a.mo42614G_()) {
                return a;
            }
            throw new C26055iy(a);
        }

        protected AbstractC25982a(MessageType messagetype) {
            this.f61241c = messagetype;
            this.f61239a = (MessageType) ((AbstractC25981gj) messagetype.mo42005a(C25986e.f61246d));
        }

        /* renamed from: a */
        public final BuilderType mo42353a(MessageType messagetype) {
            if (this.f61240b) {
                mo42626t();
                this.f61240b = false;
            }
            m50574a(this.f61239a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m50574a(MessageType messagetype, MessageType messagetype2) {
            C26036if.f61331a.mo42708a(messagetype).mo42700b(messagetype, messagetype2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType mo42354a(AbstractC25955fn fnVar, C25965fv fvVar) {
            C25956fo foVar;
            if (this.f61240b) {
                mo42626t();
                this.f61240b = false;
            }
            try {
                AbstractC26041ik a = C26036if.f61331a.mo42708a(this.f61239a);
                MessageType messagetype = this.f61239a;
                if (fnVar.f61125c != null) {
                    foVar = fnVar.f61125c;
                } else {
                    foVar = new C25956fo(fnVar);
                }
                a.mo42695a(messagetype, foVar, fvVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw e.getCause();
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25930er
        /* renamed from: a */
        public final /* synthetic */ AbstractC25930er mo42355a(byte[] bArr, int i) {
            return mo42356a(bArr, i, C25965fv.m50500a());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType mo42356a(byte[] bArr, int i, C25965fv fvVar) {
            if (this.f61240b) {
                mo42626t();
                this.f61240b = false;
            }
            try {
                C26036if.f61331a.mo42708a(this.f61239a).mo42697a(this.f61239a, bArr, 0, i + 0, new C25935ew(fvVar));
                return this;
            } catch (C25994gr e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C25994gr.m50607a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25931es
    /* renamed from: i */
    public final int mo42365i() {
        return this.zzc;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.measurement.gj$e */
    public static final class C25986e {

        /* renamed from: a */
        public static final int f61243a = 1;

        /* renamed from: b */
        public static final int f61244b = 2;

        /* renamed from: c */
        public static final int f61245c = 3;

        /* renamed from: d */
        public static final int f61246d = 4;

        /* renamed from: e */
        public static final int f61247e = 5;

        /* renamed from: f */
        public static final int f61248f = 6;

        /* renamed from: g */
        public static final int f61249g = 7;

        /* renamed from: h */
        public static final int f61250h = 1;

        /* renamed from: i */
        public static final int f61251i = 2;

        /* renamed from: j */
        public static final int f61252j = 1;

        /* renamed from: k */
        public static final int f61253k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f61254l = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: m */
        private static final /* synthetic */ int[] f61255m = {1, 2};

        /* renamed from: n */
        private static final /* synthetic */ int[] f61256n = {1, 2};

        static {
            Covode.recordClassIndex(31401);
        }

        /* renamed from: a */
        public static int[] m50590a() {
            return (int[]) f61254l.clone();
        }
    }

    static {
        Covode.recordClassIndex(31396);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26022hs
    /* renamed from: G_ */
    public final boolean mo42614G_() {
        return m50561a(this, Boolean.TRUE.booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26022hs
    /* renamed from: H_ */
    public final /* synthetic */ AbstractC26020hq mo42615H_() {
        return (AbstractC25931es) mo42005a(C25986e.f61248f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final <MessageType extends AbstractC25981gj<MessageType, BuilderType>, BuilderType extends AbstractC25982a<MessageType, BuilderType>> BuilderType mo42619j() {
        return (BuilderType) ((AbstractC25982a) mo42005a(C25986e.f61247e));
    }

    /* renamed from: l */
    public final BuilderType mo42620l() {
        BuilderType buildertype = (BuilderType) ((AbstractC25982a) mo42005a(C25986e.f61247e));
        buildertype.mo42353a(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26020hq
    /* renamed from: n */
    public final /* synthetic */ AbstractC26023ht mo42622n() {
        AbstractC25982a aVar = (AbstractC25982a) mo42005a(C25986e.f61247e);
        aVar.mo42353a((AbstractC25981gj) this);
        return aVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26020hq
    /* renamed from: o */
    public final /* synthetic */ AbstractC26023ht mo42623o() {
        return (AbstractC25930er) mo42005a(C25986e.f61247e);
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$b */
    public static abstract class AbstractC25983b<MessageType extends AbstractC25983b<MessageType, BuilderType>, BuilderType> extends AbstractC25981gj<MessageType, BuilderType> {
        protected C25969fy<Object> zzc = C25969fy.f61158d;

        static {
            Covode.recordClassIndex(31398);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C25969fy<Object> mo42630a() {
            if (this.zzc.f61160b) {
                this.zzc = (C25969fy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = C26036if.f61331a.mo42708a(this).mo42692a(this);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26020hq
    /* renamed from: m */
    public final int mo42621m() {
        if (this.zzc == -1) {
            this.zzc = C26036if.f61331a.mo42708a(this).mo42699b(this);
        }
        return this.zzc;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(obj);
        C26025hv.m50748a(this, sb, 0);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25931es
    /* renamed from: b */
    public final void mo42362b(int i) {
        this.zzc = i;
    }

    /* renamed from: com.google.android.gms.internal.measurement.gj$c */
    public static class C25984c<T extends AbstractC25981gj<T, ?>> extends C25932et<T> {

        /* renamed from: a */
        private final T f61242a;

        static {
            Covode.recordClassIndex(31399);
        }

        public C25984c(T t) {
            this.f61242a = t;
        }
    }

    /* renamed from: a */
    protected static AbstractC25992gp m50556a(AbstractC25992gp gpVar) {
        int i;
        int size = gpVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return gpVar.mo42640c(i);
    }

    /* renamed from: a */
    protected static <E> AbstractC25995gs<E> m50557a(AbstractC25995gs<E> gsVar) {
        int i;
        int size = gsVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return gsVar.mo42382a(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C26036if.f61331a.mo42708a(this).mo42698a(this, obj);
        }
        return false;
    }

    /* renamed from: a */
    static <T extends AbstractC25981gj<?, ?>> T m50555a(Class<T> cls) {
        T t = (T) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzd.get(cls);
                if (t == null) {
                    t = (T) ((AbstractC25981gj) ((AbstractC25981gj) C26065jh.m50947a(cls)).mo42005a(C25986e.f61248f));
                    if (t != null) {
                        zzd.put(cls, t);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26020hq
    /* renamed from: a */
    public final void mo42616a(AbstractC25958fq fqVar) {
        C25962fs fsVar;
        AbstractC26041ik a = C26036if.f61331a.mo42708a(this);
        if (fqVar.f61141a != null) {
            fsVar = fqVar.f61141a;
        } else {
            fsVar = new C25962fs(fqVar);
        }
        a.mo42696a((Object) this, (AbstractC26081jt) fsVar);
    }

    /* renamed from: a */
    protected static <T extends AbstractC25981gj<?, ?>> void m50560a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends AbstractC25981gj<T, ?>> boolean m50561a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo42005a(C25986e.f61243a)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C26036if.f61331a.mo42708a(t).mo42702d(t);
        if (z) {
            t.mo42005a(C25986e.f61244b);
        }
        return d;
    }

    /* renamed from: a */
    protected static Object m50558a(AbstractC26020hq hqVar, String str, Object[] objArr) {
        return new C26039ii(hqVar, str, objArr);
    }

    /* renamed from: a */
    static Object m50559a(Method method, Object obj, Object... objArr) {
        try {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_gms_internal_measurement_zzib_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_google_android_gms_internal_measurement_zzib_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            } else if (cause instanceof Error) {
                throw cause;
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}
