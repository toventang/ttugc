package com.p2082ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80929n;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80853k;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80859l;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.g */
public final class C80898g implements AbstractC80897f {

    /* renamed from: a */
    private final ConcurrentHashMap<C84241i, AbstractC80853k.C80854a> f180887a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<C84241i, AbstractC80853k.C80854a> f180888b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private boolean f180889c;

    /* renamed from: d */
    private final AbstractC80859l f180890d;

    static {
        Covode.recordClassIndex(94197);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124294a() {
    }

    /* renamed from: b */
    public final void mo124298b() {
        if (!this.f180889c) {
            m140372e();
        }
    }

    /* renamed from: d */
    private final void m140371d() {
        List<AbstractC80853k.C80854a> list;
        this.f180887a.clear();
        AbstractC80859l lVar = this.f180890d;
        if (lVar == null || (list = lVar.mo124220a()) == null) {
            list = C89086z.INSTANCE;
        }
        for (T t : list) {
            if (!this.f180888b.containsKey(t.f180789a)) {
                this.f180887a.put(t.f180789a, t);
            }
        }
        list.size();
        this.f180887a.size();
    }

    /* renamed from: c */
    public final void mo124299c() {
        for (Map.Entry<C84241i, AbstractC80853k.C80854a> entry : this.f180887a.entrySet()) {
            C80937s.m140453b().mo124089i(entry.getKey());
        }
        this.f180889c = false;
    }

    /* renamed from: e */
    private final void m140372e() {
        T t;
        boolean booleanValue;
        m140371d();
        Collection<AbstractC80853k.C80854a> values = this.f180887a.values();
        C89219l.m154709a((Object) values, "");
        Iterator<T> it = values.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
            T t2 = t;
            booleanValue = t2.f180792d.invoke(t2.f180789a).booleanValue();
            t2.f180789a.getSourceId();
        } while (!booleanValue);
        T t3 = t;
        if (t3 != null) {
            t3.f180789a.getSourceId();
            C80937s.m140453b().mo124070a(t3.f180789a, t3.f180790b, AbstractC80929n.C80930a.f180957b);
            AbstractC89183m<AbstractC80853k.C80854a, AbstractC80853k.EnumC80858c, C89391z> mVar = t3.f180793e;
            C89219l.m154709a((Object) t3, "");
            mVar.invoke(t3, AbstractC80853k.EnumC80858c.Loading);
            this.f180889c = true;
            return;
        }
        this.f180889c = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.g$a */
    static final class C80899a extends AbstractC89220m implements AbstractC89172b<C84241i, Boolean> {

        /* renamed from: a */
        public static final C80899a f180891a = new C80899a();

        static {
            Covode.recordClassIndex(94198);
        }

        C80899a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C84241i iVar) {
            C89219l.m154719c(iVar, "");
            return true;
        }
    }

    public C80898g(AbstractC80859l lVar) {
        this.f180890d = lVar;
    }

    /* renamed from: a */
    public final boolean mo124297a(C84241i iVar) {
        C89219l.m154719c(iVar, "");
        boolean containsKey = this.f180887a.containsKey(iVar);
        boolean containsKey2 = this.f180888b.containsKey(iVar);
        if (containsKey || containsKey2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.g$b */
    static final class C80900b extends AbstractC89220m implements AbstractC89183m<AbstractC80853k.C80854a, AbstractC80853k.EnumC80858c, C89391z> {

        /* renamed from: a */
        public static final C80900b f180892a = new C80900b();

        static {
            Covode.recordClassIndex(94199);
        }

        C80900b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC80853k.C80854a aVar, AbstractC80853k.EnumC80858c cVar) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(cVar, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124295a(C84241i iVar, int i) {
        C89219l.m154719c(iVar, "");
        iVar.getSourceId();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.enginepreloader.AbstractC80897f
    /* renamed from: a */
    public final void mo124296a(C84241i iVar, EnumC80893b bVar) {
        AbstractC80853k.EnumC80858c cVar;
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(bVar, "");
        AbstractC80853k.C80854a remove = this.f180887a.remove(iVar);
        if (remove == null) {
            remove = new AbstractC80853k.C80854a(iVar);
        }
        C89219l.m154709a((Object) remove, "");
        if (bVar != EnumC80893b.Success) {
            remove = AbstractC80853k.C80854a.m140267a(remove, null, -1, null, null, null, 29);
        }
        iVar.getSourceId();
        int i = C80901h.f180893a[bVar.ordinal()];
        if (i == 1) {
            cVar = AbstractC80853k.EnumC80858c.Success;
        } else if (i == 2) {
            cVar = AbstractC80853k.EnumC80858c.Cancel;
        } else if (i == 3) {
            cVar = AbstractC80853k.EnumC80858c.Failed;
        } else {
            throw new C89376n();
        }
        remove.f180793e.invoke(remove, cVar);
        AbstractC80859l lVar = this.f180890d;
        if (lVar != null) {
            lVar.mo124221a(remove);
        }
        if (cVar == AbstractC80853k.EnumC80858c.Success) {
            this.f180888b.put(remove.f180789a, AbstractC80853k.C80854a.m140267a(remove, null, 0, null, C80899a.f180891a, C80900b.f180892a, 7));
        }
        m140372e();
    }
}
