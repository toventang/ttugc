package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g */
public final class C55777g<R> {

    /* renamed from: a */
    public static final C55778a f127200a = new C55778a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f127201b;

    static {
        Covode.recordClassIndex(65563);
    }

    /* renamed from: d */
    private final List<AbstractC55766f<?, R>> m101554d() {
        return (List) this.f127201b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g$a */
    public static final class C55778a {
        static {
            Covode.recordClassIndex(65564);
        }

        private C55778a() {
        }

        /* renamed from: a */
        public static <R> C55777g<R> m101559a() {
            return new C55777g<>((byte) 0);
        }

        public /* synthetic */ C55778a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.g$b */
    static final class C55779b extends AbstractC89220m implements AbstractC89171a<List<AbstractC55766f<?, R>>> {

        /* renamed from: a */
        public static final C55779b f127202a = new C55779b();

        static {
            Covode.recordClassIndex(65565);
        }

        C55779b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private C55777g() {
        this.f127201b = C89250i.m154773a((AbstractC89171a) C55779b.f127202a);
    }

    /* renamed from: a */
    public final List<AbstractC55766f<?, R>> mo92651a() {
        return C89070n.m154585g((Collection) m101554d());
    }

    /* renamed from: c */
    public final AbstractC55766f<?, R> mo92653c() {
        for (AbstractC55766f<?, R> fVar : m101554d()) {
            if (fVar.f127190o) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo92652b() {
        for (T t : m101554d()) {
            t.f127191p = false;
            t.mo92644f().mo142944a();
            t.f127190o = true;
        }
    }

    public /* synthetic */ C55777g(byte b) {
        this();
    }

    /* renamed from: a */
    public final C55777g<R> mo92650a(AbstractC55766f<?, R> fVar) {
        C89219l.m154721d(fVar, "");
        m101554d().add(fVar);
        return this;
    }
}
