package com.p2082ss.android.ugc.aweme.video.preload.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80929n;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.k */
public interface AbstractC80853k {

    /* renamed from: com.ss.android.ugc.aweme.video.preload.api.k$c */
    public enum EnumC80858c {
        Waiting,
        Loading,
        Success,
        Failed,
        Cancel;

        static {
            Covode.recordClassIndex(94156);
        }
    }

    static {
        Covode.recordClassIndex(94151);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.api.k$b */
    public static final class C80857b implements AbstractC80853k, AbstractC80859l {

        /* renamed from: a */
        public static final C80857b f180796a = new C80857b();

        /* renamed from: b */
        private static final ConcurrentHashMap<String, C80854a> f180797b = new ConcurrentHashMap<>();

        /* renamed from: c */
        private static final CopyOnWriteArrayList<Object> f180798c = new CopyOnWriteArrayList<>();

        /* renamed from: d */
        private static final CopyOnWriteArrayList<AbstractC89171a<C89391z>> f180799d = new CopyOnWriteArrayList<>();

        private C80857b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l
        /* renamed from: a */
        public final List<C80854a> mo124220a() {
            Collection<C80854a> values = f180797b.values();
            C89219l.m154709a((Object) values, "");
            return C89070n.m154590j(values);
        }

        static {
            Covode.recordClassIndex(94155);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l
        /* renamed from: a */
        public final void mo124221a(C80854a aVar) {
            C89219l.m154719c(aVar, "");
            Iterator<T> it = f180798c.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l
        /* renamed from: a */
        public final void mo124222a(AbstractC89171a<C89391z> aVar) {
            C89219l.m154719c(aVar, "");
            f180799d.add(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.api.k$a */
    public static final class C80854a {

        /* renamed from: a */
        public final C84241i f180789a;

        /* renamed from: b */
        public final int f180790b;

        /* renamed from: c */
        public final AbstractC80929n f180791c;

        /* renamed from: d */
        public final AbstractC89172b<C84241i, Boolean> f180792d;

        /* renamed from: e */
        public final AbstractC89183m<C80854a, EnumC80858c, C89391z> f180793e;

        static {
            Covode.recordClassIndex(94152);
        }

        public final String toString() {
            return "IdlePreloadTask(model=" + this.f180789a + ", size=" + this.f180790b + ", type=" + this.f180791c + ", enable=" + this.f180792d + ", listener=" + this.f180793e + ")";
        }

        public final int hashCode() {
            return (this.f180789a.hashCode() * 31) + this.f180790b;
        }

        public /* synthetic */ C80854a(C84241i iVar) {
            this(iVar, -1, AbstractC80929n.C80932c.f180959b, C808551.f180794a, C808562.f180795a);
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C89219l.m154714a(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                C80854a aVar = (C80854a) obj;
                if (!(!C89219l.m154714a(this.f180789a, aVar.f180789a)) && this.f180790b == aVar.f180790b && !(!C89219l.m154714a(this.f180791c, aVar.f180791c))) {
                    return true;
                }
                return false;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.playerkit.simapicommon.a.i, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.video.preload.api.k$a, ? super com.ss.android.ugc.aweme.video.preload.api.k$c, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        private C80854a(C84241i iVar, int i, AbstractC80929n nVar, AbstractC89172b<? super C84241i, Boolean> bVar, AbstractC89183m<? super C80854a, ? super EnumC80858c, C89391z> mVar) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(nVar, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(mVar, "");
            this.f180789a = iVar;
            this.f180790b = i;
            this.f180791c = nVar;
            this.f180792d = bVar;
            this.f180793e = mVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C80854a m140267a(C80854a aVar, C84241i iVar, int i, AbstractC80929n nVar, AbstractC89172b bVar, AbstractC89183m mVar, int i2) {
            AbstractC89183m mVar2 = mVar;
            C84241i iVar2 = iVar;
            int i3 = i;
            AbstractC80929n nVar2 = nVar;
            AbstractC89172b bVar2 = bVar;
            if ((i2 & 1) != 0) {
                iVar2 = aVar.f180789a;
            }
            if ((i2 & 2) != 0) {
                i3 = aVar.f180790b;
            }
            if ((i2 & 4) != 0) {
                nVar2 = aVar.f180791c;
            }
            if ((i2 & 8) != 0) {
                bVar2 = aVar.f180792d;
            }
            if ((i2 & 16) != 0) {
                mVar2 = aVar.f180793e;
            }
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(nVar2, "");
            C89219l.m154719c(bVar2, "");
            C89219l.m154719c(mVar2, "");
            return new C80854a(iVar2, i3, nVar2, bVar2, mVar2);
        }
    }
}
