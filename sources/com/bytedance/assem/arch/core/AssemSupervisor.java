package com.bytedance.assem.arch.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

public final class AssemSupervisor implements AbstractC1202k {

    /* renamed from: h */
    public static final C12742a f30978h = new C12742a((byte) 0);

    /* renamed from: a */
    public final CopyOnWriteArrayList<AbstractC12748a> f30979a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final Map<AbstractC89277c<? extends AbstractC12748a>, AbstractC12761k> f30980b = new LinkedHashMap();

    /* renamed from: c */
    public View f30981c;

    /* renamed from: d */
    public final AbstractC1204m f30982d;

    /* renamed from: e */
    public final Context f30983e;

    /* renamed from: f */
    public final C12752d f30984f;

    /* renamed from: g */
    public final C12753e f30985g;

    /* renamed from: i */
    private final Map<AbstractC89277c<? extends AbstractC12748a>, AbstractC12748a> f30986i = new LinkedHashMap();

    /* renamed from: j */
    private final AbstractC89244h f30987j = C89250i.m154773a((AbstractC89171a) C12745d.f30990a);

    static {
        Covode.recordClassIndex(14564);
    }

    /* renamed from: com.bytedance.assem.arch.core.AssemSupervisor$a */
    public static final class C12742a {
        static {
            Covode.recordClassIndex(14565);
        }

        private C12742a() {
        }

        public /* synthetic */ C12742a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AssemSupervisor m22921a(AbstractC1204m mVar, Context context, C12752d dVar, C12753e eVar) {
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(dVar, "");
            C89219l.m154719c(eVar, "");
            return new AssemSupervisor(mVar, context, dVar, eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.core.AssemSupervisor$b */
    public static final class RunnableC12743b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f30988a;

        static {
            Covode.recordClassIndex(14566);
        }

        RunnableC12743b(AbstractC89171a aVar) {
            this.f30988a = aVar;
        }

        public final void run() {
            this.f30988a.invoke();
        }
    }

    /* renamed from: com.bytedance.assem.arch.core.AssemSupervisor$d */
    static final class C12745d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C12745d f30990a = new C12745d();

        static {
            Covode.recordClassIndex(14568);
        }

        C12745d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public final AbstractC1196i mo20567a() {
        AbstractC1196i lifecycle = this.f30982d.getLifecycle();
        C89219l.m154709a((Object) lifecycle, "");
        return lifecycle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.assem.arch.core.AssemSupervisor$c */
    public static final class C12744c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemSupervisor f30989a;

        static {
            Covode.recordClassIndex(14567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12744c(AssemSupervisor assemSupervisor) {
            super(0);
            this.f30989a = assemSupervisor;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f30989a.mo20567a().mo4013b(this.f30989a);
            this.f30989a.mo20567a().mo4012a(this.f30989a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.core.AssemSupervisor$e */
    static final class C12746e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AssemSupervisor f30991a;

        /* renamed from: b */
        final /* synthetic */ AbstractC12748a f30992b;

        static {
            Covode.recordClassIndex(14569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12746e(AssemSupervisor assemSupervisor, AbstractC12748a aVar) {
            super(0);
            this.f30991a = assemSupervisor;
            this.f30992b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC1196i.EnumC1199b a = this.f30991a.mo20567a().mo4011a();
            C89219l.m154709a((Object) a, "");
            AssemSupervisor.m22911a(a, this.f30992b);
            this.f30992b.f30998b = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo20570b() {
        C12744c cVar = new C12744c(this);
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154709a((Object) mainLooper, "");
        if (C89219l.m154714a(currentThread, mainLooper.getThread())) {
            cVar.invoke();
        } else {
            ((Handler) this.f30987j.getValue()).post(new RunnableC12743b(cVar));
        }
    }

    /* renamed from: d */
    private final void m22912d() {
        CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList = this.f30979a;
        ArrayList<AbstractC12748a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f30999c || t2.f30998b) {
                arrayList.add(t);
            }
        }
        for (AbstractC12748a aVar : arrayList) {
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.STARTED;
            C89219l.m154709a((Object) aVar, "");
            m22911a(bVar, aVar);
        }
    }

    /* renamed from: e */
    private final void m22913e() {
        CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList = this.f30979a;
        ArrayList<AbstractC12748a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f30999c || t2.f30998b) {
                arrayList.add(t);
            }
        }
        for (AbstractC12748a aVar : arrayList) {
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.RESUMED;
            C89219l.m154709a((Object) aVar, "");
            m22911a(bVar, aVar);
        }
    }

    /* renamed from: f */
    private final void m22914f() {
        CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList = this.f30979a;
        ArrayList<AbstractC12748a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f30999c || t2.f30998b) {
                arrayList.add(t);
            }
        }
        for (AbstractC12748a aVar : arrayList) {
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.STARTED;
            C89219l.m154709a((Object) aVar, "");
            m22911a(bVar, aVar);
        }
    }

    /* renamed from: g */
    private final void m22915g() {
        CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList = this.f30979a;
        ArrayList<AbstractC12748a> arrayList = new ArrayList();
        for (T t : copyOnWriteArrayList) {
            T t2 = t;
            if (!t2.f30999c || t2.f30998b) {
                arrayList.add(t);
            }
        }
        for (AbstractC12748a aVar : arrayList) {
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.CREATED;
            C89219l.m154709a((Object) aVar, "");
            m22911a(bVar, aVar);
        }
    }

    /* renamed from: c */
    public final void mo20571c() {
        for (T t : this.f30979a) {
            AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.DESTROYED;
            C89219l.m154709a((Object) t, "");
            m22911a(bVar, t);
        }
        this.f30984f.mo20604a();
        this.f30985g.mo20609a();
        this.f30979a.clear();
        this.f30986i.clear();
        this.f30980b.clear();
        mo20567a().mo4013b(this);
        mo20568a((View) null);
    }

    /* renamed from: a */
    public final void mo20568a(View view) {
        if (view == null) {
            view = null;
        } else if (this.f30981c != null) {
            throw new IllegalArgumentException("Duplicate attach the assems to root view on the same layer.".toString());
        }
        this.f30981c = view;
    }

    /* renamed from: a */
    public final void mo20569a(AbstractC12748a aVar) {
        C89219l.m154719c(aVar, "");
        if (mo20567a().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.DESTROYED) > 0) {
            if (!this.f30979a.contains(aVar)) {
                this.f30979a.add(aVar);
                aVar.mo20587a(this);
                aVar.mo20586a(this.f30982d);
                this.f30986i.put(C89204ab.m154669a(aVar.getClass()), aVar);
                if (!aVar.f30999c) {
                    C89219l.m154719c(new C12746e(this, aVar), "");
                } else {
                    aVar.f30998b = true;
                }
            } else {
                throw new IllegalStateException("This assem has already existed.".toString());
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        switch (C12757g.f31024b[aVar.ordinal()]) {
            case 1:
                CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList = this.f30979a;
                ArrayList<AbstractC12748a> arrayList = new ArrayList();
                for (T t : copyOnWriteArrayList) {
                    if (!t.f30999c) {
                        arrayList.add(t);
                    }
                }
                for (AbstractC12748a aVar2 : arrayList) {
                    AbstractC1196i.EnumC1199b bVar = AbstractC1196i.EnumC1199b.CREATED;
                    C89219l.m154709a((Object) aVar2, "");
                    m22911a(bVar, aVar2);
                }
                return;
            case 2:
                m22912d();
                return;
            case 3:
                m22913e();
                return;
            case 4:
                m22914f();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                m22915g();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                mo20571c();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m22911a(AbstractC1196i.EnumC1199b bVar, AbstractC12748a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        int i = C12757g.f31023a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) >= 0) {
                            aVar.mo20595k();
                        }
                        if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) >= 0) {
                            aVar.mo20596m();
                        }
                        if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0) {
                            aVar.mo20597o();
                        }
                    }
                } else if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                    if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        aVar.aA_();
                    }
                    if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                        aVar.mo20594g();
                    }
                    aVar.bV_();
                }
            } else if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                    aVar.aA_();
                }
                aVar.mo20594g();
            } else if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                aVar.mo20595k();
            }
        } else if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            aVar.aA_();
        } else {
            if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                aVar.mo20595k();
            }
            if (aVar.f31000d.mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                aVar.mo20596m();
            }
        }
    }

    public AssemSupervisor(AbstractC1204m mVar, Context context, C12752d dVar, C12753e eVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(eVar, "");
        this.f30982d = mVar;
        this.f30983e = context;
        this.f30984f = dVar;
        this.f30985g = eVar;
    }
}
