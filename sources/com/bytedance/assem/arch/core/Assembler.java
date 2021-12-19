package com.bytedance.assem.arch.core;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.assem.arch.p795b.C12651b;
import com.bytedance.assem.arch.p795b.EnumC12650a;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

public final class Assembler extends AbstractC1174ac {

    /* renamed from: c */
    public static final C12747a f30993c = new C12747a((byte) 0);

    /* renamed from: a */
    public final WeakHashMap<AbstractC1204m, AssemSupervisor> f30994a = new WeakHashMap<>();

    /* renamed from: b */
    public final WeakHashMap<AbstractC1204m, C12752d> f30995b = new WeakHashMap<>();

    /* renamed from: d */
    private final WeakHashMap<AbstractC1204m, C12753e> f30996d = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(14570);
    }

    /* renamed from: com.bytedance.assem.arch.core.Assembler$a */
    public static final class C12747a {
        static {
            Covode.recordClassIndex(14571);
        }

        private C12747a() {
        }

        public /* synthetic */ C12747a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Assembler m22936a(ActivityC0945e eVar) {
            C89219l.m154719c(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            return (Assembler) a;
        }
    }

    /* renamed from: a */
    public final void mo20581a(AbstractC12748a aVar, AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z> bVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        C12759i iVar = new C12759i();
        bVar.invoke(iVar);
        C89378p a = iVar.mo20616a();
        String str = (String) a.component1();
        AbstractC12779c cVar = (AbstractC12779c) a.component2();
        C12752d dVar = this.f30995b.get(aVar);
        if (dVar != null) {
            dVar.mo20605a(cVar, str);
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f30995b.clear();
        this.f30994a.clear();
        this.f30996d.clear();
    }

    /* renamed from: a */
    public final AssemSupervisor mo20573a(AbstractC1204m mVar) {
        return this.f30994a.get(mVar);
    }

    /* renamed from: b */
    public final C12752d mo20583b(AbstractC1204m mVar) {
        return this.f30995b.get(mVar);
    }

    /* renamed from: c */
    public final C12753e mo20584c(AbstractC1204m mVar) {
        return this.f30996d.get(mVar);
    }

    /* renamed from: d */
    public final void mo20585d(AbstractC1204m mVar) {
        if (mVar != null) {
            this.f30995b.remove(mVar);
            this.f30996d.remove(mVar);
            this.f30994a.remove(mVar);
        }
    }

    /* renamed from: a */
    public final void mo20577a(AbstractC1204m mVar, AssemSupervisor assemSupervisor) {
        if (mVar != null && assemSupervisor != null) {
            this.f30994a.put(mVar, assemSupervisor);
        }
    }

    /* renamed from: a */
    public final AssemSupervisor mo20574a(AbstractC1204m mVar, AbstractC89172b<? super C12751c, C89391z> bVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        AssemSupervisor assemSupervisor = this.f30994a.get(mVar);
        if (assemSupervisor == null) {
            return null;
        }
        C12751c cVar = new C12751c();
        bVar.invoke(cVar);
        AbstractC12748a a = cVar.mo20601a();
        m22922a(cVar.f31011c, a, assemSupervisor.f30985g);
        assemSupervisor.mo20569a(a);
        assemSupervisor.mo20570b();
        return assemSupervisor;
    }

    /* renamed from: b */
    public final AssemSupervisor mo20582b(AbstractC1204m mVar, AbstractC89172b<? super C12767q, C89391z> bVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(bVar, "");
        AssemSupervisor assemSupervisor = this.f30994a.get(mVar);
        if (assemSupervisor == null) {
            return null;
        }
        C12767q qVar = new C12767q();
        bVar.invoke(qVar);
        AbstractC12769a b = qVar.mo20601a();
        m22922a(qVar.f31051c, b, assemSupervisor.f30985g);
        assemSupervisor.mo20569a(b);
        assemSupervisor.mo20570b();
        return assemSupervisor;
    }

    /* renamed from: a */
    public final void mo20576a(Fragment fragment, AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z> bVar) {
        C89219l.m154719c(fragment, "");
        C89219l.m154719c(bVar, "");
        C12759i iVar = new C12759i();
        bVar.invoke(iVar);
        C89378p a = iVar.mo20616a();
        String str = (String) a.component1();
        AbstractC12779c cVar = (AbstractC12779c) a.component2();
        C12752d dVar = this.f30995b.get(fragment);
        if (dVar != null) {
            dVar.mo20605a(cVar, str);
        }
    }

    /* renamed from: a */
    public final <REUSED extends AbstractC12693u<? extends AbstractC22876d>> AssemSupervisor mo20575a(REUSED reused, AbstractC89172b<? super C12764n, C89391z> bVar) {
        AssemSupervisor assemSupervisor;
        C89219l.m154719c(reused, "");
        C89219l.m154719c(bVar, "");
        if (C12787j.f31107a || !C12787j.f31109c) {
            AssemSupervisor assemSupervisor2 = this.f30994a.get(reused);
            if (assemSupervisor2 != null) {
                assemSupervisor = assemSupervisor2;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            assemSupervisor = this.f30994a.get(reused);
        }
        if (assemSupervisor == null) {
            return null;
        }
        if (C12787j.f31109c) {
            AbstractC1196i lifecycle = assemSupervisor.f30982d.getLifecycle();
            C89219l.m154709a((Object) lifecycle, "");
            if (lifecycle.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.DESTROYED) <= 0) {
                return null;
            }
        }
        C12764n nVar = new C12764n();
        bVar.invoke(nVar);
        if (nVar.f31041c == EnumC12758h.LAZY) {
            Map<AbstractC89277c<? extends AbstractC12748a>, AbstractC12761k> map = assemSupervisor.f30980b;
            AbstractC89277c<? extends AbstractC12711w<? extends AbstractC22876d>> cVar = nVar.f31039a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            map.put(cVar, nVar);
            return reused.bD_();
        }
        AbstractC12711w<? extends AbstractC22876d> b = nVar.mo20601a();
        assemSupervisor.mo20569a(b);
        AbstractC12659j jVar = reused.f30901n;
        if (jVar != null) {
            jVar.mo20473a(b);
        }
        return reused.bD_();
    }

    /* renamed from: a */
    public final void mo20578a(AbstractC1204m mVar, C12752d dVar) {
        if (mVar != null && dVar != null) {
            this.f30995b.put(mVar, dVar);
        }
    }

    /* renamed from: a */
    public final void mo20579a(AbstractC1204m mVar, C12753e eVar) {
        if (mVar != null && eVar != null) {
            this.f30996d.put(mVar, eVar);
        }
    }

    /* renamed from: a */
    public final <REUSED extends AbstractC12693u<? extends AbstractC22876d>> void mo20580a(REUSED reused, AbstractC89277c<? extends AbstractC12693u<?>> cVar) {
        AbstractC12748a aVar;
        C88958b<C12651b> b;
        C89219l.m154719c(reused, "");
        C89219l.m154719c(cVar, "");
        AssemSupervisor assemSupervisor = this.f30994a.get(reused);
        if (assemSupervisor != null) {
            C89219l.m154709a((Object) assemSupervisor, "");
            if (C12787j.f31109c) {
                AbstractC1196i lifecycle = assemSupervisor.f30982d.getLifecycle();
                C89219l.m154709a((Object) lifecycle, "");
                if (lifecycle.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.DESTROYED) <= 0) {
                    return;
                }
            }
            if (assemSupervisor.f30980b.containsKey(cVar)) {
                AbstractC12761k remove = assemSupervisor.f30980b.remove(cVar);
                AbstractC12693u<? extends AbstractC22876d> uVar = null;
                if (remove != null) {
                    aVar = remove.mo20601a();
                } else {
                    aVar = null;
                }
                if (aVar instanceof AbstractC12693u) {
                    uVar = aVar;
                }
                AbstractC12693u<? extends AbstractC22876d> uVar2 = uVar;
                if (uVar2 != null) {
                    assemSupervisor.mo20569a(uVar2);
                    uVar2.mo20534z();
                    AbstractC12659j jVar = reused.f30901n;
                    if (jVar != null) {
                        jVar.mo20473a(uVar2);
                    }
                    AbstractC12659j jVar2 = uVar2.f30901n;
                    if (!(jVar2 == null || (b = jVar2.mo20475b()) == null)) {
                        b.onNext(new C12651b(EnumC12650a.HostAttach, uVar2));
                    }
                    assemSupervisor.mo20570b();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22922a(List<C12765o> list, AbstractC12748a aVar, C12753e eVar) {
        if (list != null && !list.isEmpty()) {
            for (C12765o oVar : list) {
                if (oVar.f31045a.isAssignableFrom(aVar.getClass())) {
                    eVar.mo20611a(oVar, (AbstractC12800c) aVar);
                } else {
                    throw new IllegalStateException("The serviceClazz must be super interface of this Assem".toString());
                }
            }
        } else if (aVar instanceof AbstractC12800c) {
            AbstractC12800c cVar = (AbstractC12800c) aVar;
            Class<?> cls = cVar.getClass();
            while (cls != Object.class) {
                Class<?>[] interfaces = cls.getInterfaces();
                C89219l.m154709a((Object) interfaces, "");
                ArrayList<Class<?>> arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces) {
                    if (AbstractC12800c.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
                for (Class<?> cls3 : arrayList) {
                    C89219l.m154709a((Object) cls3, "");
                    eVar.mo20612a(cls3, cVar);
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    return;
                }
            }
        }
    }
}
