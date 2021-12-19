package com.bytedance.lynx.hybrid;

import android.app.Application;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.bytedance.lynx.hybrid.p1518d.AbstractC21173a;
import com.bytedance.lynx.hybrid.p1518d.C21174b;
import com.bytedance.lynx.hybrid.p1519e.AbstractC21181a;
import com.bytedance.lynx.hybrid.p1519e.C21182b;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.bytedance.lynx.hybrid.p1520f.C21189a;
import com.bytedance.lynx.hybrid.p1521g.C21194b;
import com.bytedance.lynx.hybrid.resource.C21265c;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.C28438b;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28465b;
import com.lynx.tasm.p2062ui.image.C28876b;
import com.lynx.tasm.p2062ui.image.C28896i;
import com.lynx.tasm.provider.AbstractC28843b;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.lynx.hybrid.k */
public final class C21214k {

    /* renamed from: a */
    public static final C21214k f50336a = new C21214k();

    private C21214k() {
    }

    static {
        Covode.recordClassIndex(24830);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.k$b */
    public static final class C21216b implements AbstractC28465b {

        /* renamed from: a */
        final /* synthetic */ C21182b f50338a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f50339b;

        static {
            Covode.recordClassIndex(24832);
        }

        C21216b(C21182b bVar, C89233z.C89234a aVar) {
            this.f50338a = bVar;
            this.f50339b = aVar;
        }

        @Override // com.lynx.tasm.behavior.AbstractC28465b
        /* renamed from: a */
        public final /* synthetic */ List mo33432a() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f50338a.f50248e);
            if (this.f50339b.element) {
                arrayList.addAll(C28896i.m57883a().mo33432a());
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.k$a */
    public static final class C21215a implements AbstractC28773f {

        /* renamed from: a */
        public static final C21215a f50337a = new C21215a();

        static {
            Covode.recordClassIndex(24831);
        }

        C21215a() {
        }

        @Override // com.lynx.tasm.AbstractC28773f
        /* renamed from: a */
        public final void mo33431a(String str) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                Librarian.m38962a(str);
                C58032m.m104852a(uptimeMillis, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m39932a(C21182b bVar) {
        C89219l.m154719c(bVar, "");
        C28438b.m56840a();
        AbstractC28773f fVar = bVar.f50246c;
        if (fVar == null) {
            fVar = C21215a.f50337a;
        }
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        LynxEnv b = LynxEnv.m56706b();
        try {
            aVar.element = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Fresco Not Found, Image will not work normally").printStackTrace();
        }
        if (aVar.element) {
            if (!C24182c.m45846d()) {
                C24182c.m45840a(C21187d.m39885a());
            }
            b.f66649p = new C28876b();
        }
        C21216b bVar2 = new C21216b(bVar, aVar);
        LynxEnv b2 = LynxEnv.m56706b();
        C89219l.m154709a((Object) b2, "");
        b2.f66636c = new C21265c();
        LynxEnv b3 = LynxEnv.m56706b();
        C89219l.m154709a((Object) b3, "");
        b3.f66652s = bVar.f50244a;
        LynxEnv b4 = LynxEnv.m56706b();
        Application a = C21187d.m39885a();
        AbstractC28843b bVar3 = bVar.f50247d;
        if (bVar3 == null) {
            bVar3 = new C21226o();
        }
        b4.mo48563a(a, fVar, bVar3, bVar2);
        LynxEnv b5 = LynxEnv.m56706b();
        C89219l.m154709a((Object) b5, "");
        if (b5.mo48573f()) {
            LLog.m56858a(C21189a.f50273c);
            LLog.m56853a(new C21189a());
            AbstractC21181a aVar2 = bVar.f50250g;
            if (aVar2 != null) {
                aVar2.mo34741a(C21187d.m39885a(), fVar);
            }
        }
        for (T t : bVar.f50249f.entrySet()) {
            LynxEnv.m56706b().mo48564a((String) t.getKey(), ((C21194b) t.getValue()).f50278a, ((C21194b) t.getValue()).f50279b);
        }
        AbstractC89172b<LynxEnv, C89391z> bVar4 = bVar.f50251h;
        LynxEnv b6 = LynxEnv.m56706b();
        C89219l.m154709a((Object) b6, "");
        bVar4.invoke(b6);
        if (!C21187d.f50266b) {
            LynxEnv.m56706b().mo48570c(false);
            LynxEnv.m56706b().mo48566a(false);
            return;
        }
        List<AbstractC21173a> list = bVar.f50245b;
        if (list.size() > 0) {
            C21174b.m39869a();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C21174b.m39870a(it.next());
            }
        }
    }
}
