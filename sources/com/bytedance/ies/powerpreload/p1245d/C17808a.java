package com.bytedance.ies.powerpreload.p1245d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17776a;
import com.bytedance.ies.powerpreload.C17782b;
import com.bytedance.ies.powerpreload.C17796c;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f;
import com.bytedance.ies.powerpreload.task.C17834g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.d.a */
public final class C17808a {

    /* renamed from: b */
    public static final AbstractC89244h f42499b = C89250i.m154773a((AbstractC89171a) C17810b.f42502a);

    /* renamed from: c */
    public static final C17809a f42500c = new C17809a((byte) 0);

    /* renamed from: a */
    public final C17811b f42501a;

    /* renamed from: com.bytedance.ies.powerpreload.d.a$a */
    public static final class C17809a {
        static {
            Covode.recordClassIndex(20373);
        }

        /* renamed from: a */
        public static C17808a m32999a() {
            return (C17808a) C17808a.f42499b.getValue();
        }

        private C17809a() {
        }

        public /* synthetic */ C17809a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.d.a$b */
    static final class C17810b extends AbstractC89220m implements AbstractC89171a<C17808a> {

        /* renamed from: a */
        public static final C17810b f42502a = new C17810b();

        static {
            Covode.recordClassIndex(20374);
        }

        C17810b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17808a invoke() {
            return new C17808a(new C17811b(), (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(20372);
    }

    private C17808a(C17811b bVar) {
        this.f42501a = bVar;
    }

    public /* synthetic */ C17808a(C17811b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: a */
    public final void mo28276a(Bundle bundle, Class<? extends AbstractC17789d> cls) {
        C89219l.m154719c(cls, "");
        C17811b bVar = this.f42501a;
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cls, "");
        if (C17796c.C17797a.m32994a()) {
            try {
                C17782b bVar2 = bVar.f42504a;
                if (bVar2 == null) {
                    C89219l.m154710a("preloadProxy");
                }
                Object newInstance = cls.newInstance();
                C89219l.m154709a(newInstance, "");
                AbstractC17789d dVar = (AbstractC17789d) newInstance;
                C89219l.m154719c(dVar, "");
                C17807d dVar2 = new C17807d(C89086z.INSTANCE, C89086z.INSTANCE);
                dVar2.f42494c = C89070n.m154516a(dVar);
                if (dVar.enable(bundle)) {
                    AbstractRunnableC17828f<AbstractC17789d> a = C17778a.m32986c().mo28269a(dVar, dVar2, bundle);
                    String str = null;
                    if (a != null) {
                        a.mo28292a((AbstractRunnableC17828f.AbstractC17829a) null);
                    }
                    C17834g a2 = bVar2.mo28251a();
                    if (a == null) {
                        C89219l.m154707a();
                    }
                    if (bundle != null) {
                        str = C17776a.m32982b(bundle);
                    }
                    a2.mo28297a(dVar2, dVar, a, str);
                }
            } catch (Exception e) {
                C17778a.m32984a(e);
            }
        }
    }
}
