package com.bytedance.p1436j.p1437a;

import android.app.Application;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16627a;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.p1436j.p1437a.p1439b.AbstractC20069a;
import com.bytedance.p1436j.p1437a.p1439b.C20070b;
import com.bytedance.p1436j.p1437a.p1440c.AbstractC20073a;
import com.bytedance.p1436j.p1437a.p1440c.C20074b;
import com.bytedance.p1436j.p1437a.p1440c.C20078d;
import com.bytedance.p1436j.p1437a.p1440c.C20083e;
import com.bytedance.p1436j.p1437a.p1440c.C20084f;
import com.bytedance.p1436j.p1437a.p1441d.C20089a;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.bytedance.p1436j.p1437a.p1443f.C20107b;
import com.bytedance.p1436j.p1437a.p1443f.C20110c;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.AbstractC28773f;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.p2056e.C28770c;
import com.lynx.tasm.p2062ui.image.C28876b;
import com.lynx.tasm.provider.AbstractC28843b;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.j.a.d */
public final class C20087d extends C16616a implements AbstractC16628b {

    /* renamed from: a */
    private AbstractC16627a f47815a;

    static {
        Covode.recordClassIndex(23595);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b
    /* renamed from: b */
    public final boolean mo26388b() {
        return C20078d.f47798b;
    }

    public C20087d() {
        this(new AbstractC16627a() {
            /* class com.bytedance.p1436j.p1437a.C20087d.C200881 */

            static {
                Covode.recordClassIndex(23596);
            }
        });
    }

    @Override // com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b
    /* renamed from: b */
    public final AbstractC16629c mo26387b(AbstractC16584o oVar) {
        C89219l.m154719c(oVar, "");
        return new C20091e(oVar, this);
    }

    public C20087d(AbstractC16627a aVar) {
        C89219l.m154719c(aVar, "");
        this.f47815a = aVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b
    /* renamed from: a */
    public final void mo26386a(AbstractC16584o oVar) {
        AbstractC28773f fVar;
        C89219l.m154719c(oVar, "");
        AbstractC16627a aVar = this.f47815a;
        if (!(aVar instanceof C20074b) || aVar == null) {
            throw new C89388w("null cannot be cast to non-null type");
        }
        C20074b bVar = (C20074b) aVar;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(oVar, "");
        if (C20078d.f47798b || C20078d.f47797a.compareAndSet(false, true)) {
            C20078d.f47801e = oVar;
            try {
                C20078d.C20079a aVar2 = new C20078d.C20079a();
                C20078d.f47799c = aVar2;
                C28770c.m57583a(aVar2);
                C28573r.m57143a(C20078d.C20082b.f47805a);
                C89219l.m154719c(bVar, "");
                C89219l.m154719c(oVar, "");
                LynxEnv.m56706b();
                if (bVar.f47783a.f47786c == null) {
                    fVar = C20084f.C20085a.f47812a;
                } else {
                    fVar = bVar.f47783a.f47786c;
                }
                C89233z.C89234a aVar3 = new C89233z.C89234a();
                aVar3.element = false;
                LynxEnv b = LynxEnv.m56706b();
                try {
                    aVar3.element = true;
                } catch (Throwable unused) {
                    new AndroidRuntimeException("Fresco Not Found, Image will not work normally").printStackTrace();
                }
                if (aVar3.element) {
                    if (!C24182c.m45846d()) {
                        C24182c.m45840a(C20083e.m38036a());
                    }
                    b.f66649p = new C28876b();
                }
                C20084f.C20086b bVar2 = new C20084f.C20086b(bVar, aVar3);
                LynxEnv b2 = LynxEnv.m56706b();
                C89219l.m154709a((Object) b2, "");
                b2.f66636c = new C20107b(oVar);
                LynxEnv b3 = LynxEnv.m56706b();
                C89219l.m154709a((Object) b3, "");
                b3.f66652s = bVar.f47783a.f47784a;
                LynxEnv b4 = LynxEnv.m56706b();
                Application a = C20083e.m38036a();
                AbstractC28843b bVar3 = bVar.f47783a.f47787d;
                if (bVar3 == null) {
                    bVar3 = new C20110c(oVar);
                }
                b4.mo48563a(a, fVar, bVar3, bVar2);
                LynxEnv b5 = LynxEnv.m56706b();
                C89219l.m154709a((Object) b5, "");
                if (b5.mo48573f()) {
                    LLog.m56858a(C20089a.f47817e);
                    LLog.m56853a(new C20089a(oVar));
                    AbstractC20073a aVar4 = bVar.f47783a.f47790g;
                    if (aVar4 != null) {
                        aVar4.mo33428a(C20083e.m38036a(), fVar);
                    }
                }
                for (T t : bVar.f47783a.f47789f.entrySet()) {
                    LynxEnv.m56706b().mo48564a((String) t.getKey(), ((C20100b) t.getValue()).f47847a, ((C20100b) t.getValue()).f47848b);
                }
                AbstractC89172b<? super LynxEnv, C89391z> bVar4 = bVar.f47783a.f47791h;
                LynxEnv b6 = LynxEnv.m56706b();
                C89219l.m154709a((Object) b6, "");
                bVar4.invoke(b6);
                if (!C20083e.f47807b) {
                    LynxEnv.m56706b().mo48570c(false);
                    LynxEnv.m56706b().mo48566a(false);
                } else {
                    List<AbstractC20069a> list = bVar.f47783a.f47785b;
                    if (list.size() > 0) {
                        if (C20070b.f47761a) {
                            LynxEnv.m56706b().mo48566a(true);
                            if (!C20083e.f47808c) {
                                LynxEnv.m56706b().mo48567b(true);
                            }
                            LynxDevtoolGlobalHelper.getInstance().registerCardListener(C20070b.f47763c);
                        }
                        for (T t2 : list) {
                            C89219l.m154719c(t2, "");
                            C20070b.f47762b.add(t2);
                        }
                    }
                }
                LynxEnv b7 = LynxEnv.m56706b();
                C89219l.m154709a((Object) b7, "");
                if (b7.mo48573f()) {
                    C20078d.f47798b = true;
                } else {
                    C20078d.f47797a.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                C20078d.f47797a.set(false);
                oVar.printReject(th, "LynxKit Init Failed");
            }
        }
    }
}
