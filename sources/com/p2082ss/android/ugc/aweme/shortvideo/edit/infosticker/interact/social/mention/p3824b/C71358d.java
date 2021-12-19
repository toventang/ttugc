package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAvSearchUserService;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71289a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.d */
public final class C71358d extends AbstractC71289a<C67683h> {

    /* renamed from: i */
    private static final C71359a f159930i = new C71359a((byte) 0);

    /* renamed from: a */
    public boolean f159931a;

    /* renamed from: b */
    final AbstractC89244h f159932b = C89250i.m154773a((AbstractC89171a) C71360b.f159934a);

    /* renamed from: h */
    private C67681g f159933h;

    static {
        Covode.recordClassIndex(83881);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.d$a */
    static final class C71359a {
        static {
            Covode.recordClassIndex(83882);
        }

        private C71359a() {
        }

        public /* synthetic */ C71359a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.d$b */
    static final class C71360b extends AbstractC89220m implements AbstractC89171a<IAvSearchUserService> {

        /* renamed from: a */
        public static final C71360b f159934a = new C71360b();

        static {
            Covode.recordClassIndex(83883);
        }

        C71360b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAvSearchUserService invoke() {
            return AvSearchUserServiceImpl.m120137a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b.d$c */
    static final class CallableC71361c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71358d f159935a;

        /* renamed from: b */
        final /* synthetic */ C67681g f159936b;

        static {
            Covode.recordClassIndex(83884);
        }

        CallableC71361c(C71358d dVar, C67681g gVar) {
            this.f159935a = dVar;
            this.f159936b = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((IAvSearchUserService) this.f159935a.f159932b.getValue()).mo101498a(this.f159936b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71289a
    /* renamed from: a */
    public final boolean mo112782a(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71289a
    /* renamed from: a */
    public final /* synthetic */ void mo112781a(C67683h hVar) {
        T t;
        List<? extends C67679e> list;
        List<String> list2;
        T t2 = (T) hVar;
        C89219l.m154721d(t2, "");
        if (this.f159788e == null) {
            this.f159788e = t2;
        } else {
            T t3 = this.f159788e;
            if (t3 != null) {
                t3.f151689b = t2.f151689b;
                t3.f151690c = t2.f151690c;
                t3.f151691d = t2.f151691d;
            }
        }
        C67681g gVar = this.f159933h;
        if (gVar == null || (list2 = gVar.f151687f) == null || !list2.isEmpty()) {
            List<? extends C67679e> list3 = t2.f151688a;
            if (list3 != null) {
                List<? extends C67679e> list4 = null;
                if ((!list3.isEmpty()) && (t = this.f159788e) != null) {
                    T t4 = this.f159788e;
                    if (!(t4 == null || (list = t4.f151688a) == null)) {
                        list4 = C89070n.m154572d((Collection) list, (Iterable) list3);
                    }
                    t.f151688a = list4;
                    return;
                }
                return;
            }
            return;
        }
        T t5 = this.f159788e;
        if (t5 != null) {
            t5.f151688a = t2.f151688a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3821b.AbstractC71289a
    /* renamed from: b */
    public final boolean mo112783b(Object... objArr) {
        boolean z;
        C89219l.m154721d(objArr, "");
        if (!super.mo112783b(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        Object a = m126064a(objArr, 0);
        C67681g gVar = null;
        if (!(a instanceof Boolean)) {
            a = null;
        }
        Boolean bool = (Boolean) a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f159931a = z;
        Object a2 = m126064a(objArr, 1);
        if (a2 instanceof C67681g) {
            gVar = a2;
        }
        C67681g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.f159931a) {
            this.f159787d = false;
        }
        this.f159933h = gVar2;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        createIAVServiceProxybyMonsterPlugin.getSchedulerService().schedule(this.f159786c, new CallableC71361c(this, gVar2), 0);
        return true;
    }

    /* renamed from: a */
    private static <T> Object m126064a(T[] tArr, int i) {
        if (i < tArr.length) {
            return tArr[i];
        }
        return null;
    }
}
