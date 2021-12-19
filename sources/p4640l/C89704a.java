package p4640l;

import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89744e;
import p4640l.p4644b.AbstractC89739w;

/* access modifiers changed from: package-private */
/* renamed from: l.a */
public final class C89704a extends AbstractC89744e.AbstractC89745a {
    static {
        Covode.recordClassIndex(105798);
    }

    /* renamed from: l.a$a */
    static final class C89705a implements AbstractC89744e<AbstractC90031ad, AbstractC90031ad> {

        /* renamed from: a */
        static final C89705a f203477a = new C89705a();

        C89705a() {
        }

        static {
            Covode.recordClassIndex(105799);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4640l.AbstractC89744e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC90031ad mo144266a(AbstractC90031ad adVar) {
            return m155740a(adVar);
        }

        /* renamed from: a */
        private static AbstractC90031ad m155740a(AbstractC90031ad adVar) {
            try {
                return C89787o.m155877a(adVar);
            } finally {
                adVar.close();
            }
        }
    }

    /* renamed from: l.a$b */
    static final class C89706b implements AbstractC89744e<AbstractC90025ab, AbstractC90025ab> {

        /* renamed from: a */
        static final C89706b f203478a = new C89706b();

        C89706b() {
        }

        static {
            Covode.recordClassIndex(105800);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4640l.AbstractC89744e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC90025ab mo144266a(AbstractC90025ab abVar) {
            return abVar;
        }
    }

    /* renamed from: l.a$c */
    static final class C89707c implements AbstractC89744e<AbstractC90031ad, AbstractC90031ad> {

        /* renamed from: a */
        static final C89707c f203479a = new C89707c();

        C89707c() {
        }

        static {
            Covode.recordClassIndex(105801);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4640l.AbstractC89744e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC90031ad mo144266a(AbstractC90031ad adVar) {
            return adVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.a$d */
    public static final class C89708d implements AbstractC89744e<Object, String> {

        /* renamed from: a */
        static final C89708d f203480a = new C89708d();

        C89708d() {
        }

        static {
            Covode.recordClassIndex(105802);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4640l.AbstractC89744e
        /* renamed from: a */
        public final /* synthetic */ String mo144266a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: l.a$e */
    static final class C89709e implements AbstractC89744e<AbstractC90031ad, Void> {

        /* renamed from: a */
        static final C89709e f203481a = new C89709e();

        C89709e() {
        }

        static {
            Covode.recordClassIndex(105803);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4640l.AbstractC89744e
        /* renamed from: a */
        public final /* synthetic */ Void mo144266a(AbstractC90031ad adVar) {
            adVar.close();
            return null;
        }
    }

    C89704a() {
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<?, AbstractC90025ab> mo144264a(Type type) {
        if (AbstractC90025ab.class.isAssignableFrom(C89787o.m155872a(type))) {
            return C89706b.f203478a;
        }
        return null;
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<AbstractC90031ad, ?> mo144265a(Type type, Annotation[] annotationArr) {
        if (type == AbstractC90031ad.class) {
            for (Annotation annotation : annotationArr) {
                if (AbstractC89739w.class.isInstance(annotation)) {
                    return C89707c.f203479a;
                }
            }
            return C89705a.f203477a;
        } else if (type == Void.class) {
            return C89709e.f203481a;
        } else {
            return null;
        }
    }
}
