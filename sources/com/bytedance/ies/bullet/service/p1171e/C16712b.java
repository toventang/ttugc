package com.bytedance.ies.bullet.service.p1171e;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16590ab;
import com.bytedance.ies.bullet.service.base.AbstractC16593ad;
import com.bytedance.ies.bullet.service.base.AbstractC16670u;
import com.bytedance.ies.bullet.service.base.EnumC16606am;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16631a;
import com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16633c;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.ies.bullet.service.e.b */
public final class C16712b extends C16616a implements AbstractC16593ad {

    /* renamed from: a */
    public static final C16713a f39898a = new C16713a((byte) 0);

    static {
        Covode.recordClassIndex(19152);
    }

    /* renamed from: com.bytedance.ies.bullet.service.e.b$a */
    public static final class C16713a {
        static {
            Covode.recordClassIndex(19153);
        }

        private C16713a() {
        }

        public /* synthetic */ C16713a(byte b) {
            this();
        }
    }

    public C16712b(Application application) {
        C89219l.m154719c(application, "");
    }

    /* renamed from: com.bytedance.ies.bullet.service.e.b$b */
    static final class C16714b extends AbstractC89220m implements AbstractC89172b<AbstractC16590ab, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16712b f39899a;

        /* renamed from: b */
        final /* synthetic */ long f39900b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f39901c;

        static {
            Covode.recordClassIndex(19154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16714b(C16712b bVar, long j, C89233z.C89234a aVar) {
            super(1);
            this.f39899a = bVar;
            this.f39900b = j;
            this.f39901c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC16590ab abVar) {
            AbstractC16590ab abVar2 = abVar;
            if (abVar2 != null) {
                C16712b bVar = this.f39899a;
                C16711a.m31019a(bVar.f39774d, abVar2.mo26357f(), "page", "success", (String) null, System.currentTimeMillis() - this.f39900b, 162);
                this.f39901c.element = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.e.b$c */
    static final class C16715c extends AbstractC89220m implements AbstractC89172b<AbstractC16590ab, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16712b f39902a;

        /* renamed from: b */
        final /* synthetic */ long f39903b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f39904c;

        static {
            Covode.recordClassIndex(19155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16715c(C16712b bVar, long j, C89233z.C89234a aVar) {
            super(1);
            this.f39902a = bVar;
            this.f39903b = j;
            this.f39904c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC16590ab abVar) {
            AbstractC16590ab abVar2 = abVar;
            if (abVar2 != null) {
                C16712b bVar = this.f39902a;
                C16711a.m31019a(bVar.f39774d, abVar2.mo26357f(), "popup", "success", (String) null, System.currentTimeMillis() - this.f39903b, 162);
                this.f39904c.element = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.e.b$d */
    static final class C16716d extends AbstractC89220m implements AbstractC89183m<Boolean, EnumC16606am, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16712b f39905a;

        static {
            Covode.recordClassIndex(19156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16716d(C16712b bVar) {
            super(2);
            this.f39905a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, EnumC16606am amVar) {
            boolean booleanValue = bool.booleanValue();
            EnumC16606am amVar2 = amVar;
            C89219l.m154719c(amVar2, "");
            AbstractC16576j.C16578b.m30778a(this.f39905a, "preload finish, success: " + booleanValue + ", code: " + amVar2.name(), null, null, 6);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final boolean m31021a(String str, String str2) {
        boolean z = false;
        for (T t : C16633c.C16634a.m30876a().mo26399a()) {
            if (C89219l.m154714a((Object) t.mo26352a(), (Object) this.f39774d) && C89219l.m154714a((Object) t.mo26353b(), (Object) str) && C89219l.m154714a((Object) t.mo26354c(), (Object) str2)) {
                t.mo26355d();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private final boolean m31022b(String str, String str2) {
        List<AbstractC16590ab> b;
        AbstractC16670u uVar = (AbstractC16670u) mo26380a(AbstractC16670u.class);
        boolean z = false;
        if (!(uVar == null || (b = uVar.mo26458b()) == null)) {
            z = false;
            for (T t : b) {
                if (C89219l.m154714a((Object) t.mo26352a(), (Object) this.f39774d) && C89219l.m154714a((Object) t.mo26353b(), (Object) str) && C89219l.m154714a((Object) t.mo26354c(), (Object) str2)) {
                    t.mo26355d();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16593ad
    /* renamed from: a */
    public final boolean mo26361a(String str, C16631a aVar) {
        List<AbstractC16590ab> b;
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        C89233z.C89234a aVar2 = new C89233z.C89234a();
        aVar2.element = false;
        if (str.length() == 0) {
            C16711a.m31019a(this.f39774d, (Uri) null, "unknown", "fail", "container id is empty", System.currentTimeMillis() - currentTimeMillis, 134);
            return false;
        }
        C16714b bVar = new C16714b(this, currentTimeMillis, aVar2);
        Iterator<T> it = C16633c.C16634a.m30876a().mo26399a().iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar.invoke(null);
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.mo26356e(), (Object) str)) {
                bVar.invoke(next);
                next.mo26355d();
                break;
            }
        }
        C16715c cVar = new C16715c(this, currentTimeMillis, aVar2);
        AbstractC16670u uVar = (AbstractC16670u) mo26380a(AbstractC16670u.class);
        if (uVar != null && (b = uVar.mo26458b()) != null) {
            Iterator<T> it2 = b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (C89219l.m154714a((Object) next2.mo26356e(), (Object) str)) {
                    cVar.invoke(next2);
                    next2.mo26355d();
                    break;
                }
            }
        }
        cVar.invoke(null);
        if (!aVar2.element) {
            C16711a.m31019a(this.f39774d, (Uri) null, "unknown", "fail", "container not found", System.currentTimeMillis() - currentTimeMillis, 134);
        }
        return aVar2.element;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3 A[ADDED_TO_REGION] */
    @Override // com.bytedance.ies.bullet.service.base.AbstractC16593ad
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo26360a(android.content.Context r26, android.net.Uri r27, com.bytedance.ies.bullet.service.base.p1166d.p1167a.C16632b r28) {
        /*
        // Method dump skipped, instructions count: 527
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.p1171e.C16712b.mo26360a(android.content.Context, android.net.Uri, com.bytedance.ies.bullet.service.base.d.a.b):boolean");
    }
}
