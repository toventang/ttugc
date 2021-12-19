package com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
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

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.c */
public final class C65814c extends AbstractC39085b<C67683h> {

    /* renamed from: d */
    private static final C65815a f148300d = new C65815a((byte) 0);

    /* renamed from: a */
    public boolean f148301a;

    /* renamed from: b */
    C67681g f148302b;

    /* renamed from: c */
    final AbstractC89244h f148303c = C89250i.m154773a((AbstractC89171a) C65816b.f148304a);

    static {
        Covode.recordClassIndex(77315);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.c$a */
    static final class C65815a {
        static {
            Covode.recordClassIndex(77316);
        }

        private C65815a() {
        }

        public /* synthetic */ C65815a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.c$b */
    static final class C65816b extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C65816b f148304a = new C65816b();

        static {
            Covode.recordClassIndex(77317);
        }

        C65816b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.c$c */
    static final class CallableC65817c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C65814c f148305a;

        /* renamed from: b */
        final /* synthetic */ C67681g f148306b;

        static {
            Covode.recordClassIndex(77318);
        }

        CallableC65817c(C65814c cVar, C67681g gVar) {
            this.f148305a = cVar;
            this.f148306b = gVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((ISearchUserService) this.f148305a.f148303c.getValue()).mo106818b(this.f148306b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(C67683h hVar) {
        C67683h hVar2;
        List<? extends C67679e> list;
        List<String> list2;
        C67683h hVar3 = hVar;
        if (hVar3 != null) {
            if (this.mData == null) {
                this.mData = hVar3;
            } else {
                C67683h hVar4 = (C67683h) this.mData;
                hVar4.f151689b = hVar3.f151689b;
                hVar4.f151690c = hVar3.f151690c;
                hVar4.f151691d = hVar3.f151691d;
            }
            C67681g gVar = this.f148302b;
            if (gVar == null || (list2 = gVar.f151687f) == null || !list2.isEmpty()) {
                List<? extends C67679e> list3 = hVar3.f151688a;
                if (list3 != null) {
                    List<? extends C67679e> list4 = null;
                    if ((!list3.isEmpty()) && (hVar2 = (C67683h) this.mData) != null) {
                        C67683h hVar5 = (C67683h) this.mData;
                        if (!(hVar5 == null || (list = hVar5.f151688a) == null)) {
                            list4 = C89070n.m154572d((Collection) list, (Iterable) list3);
                        }
                        hVar2.f151688a = list4;
                        return;
                    }
                    return;
                }
                return;
            }
            C67683h hVar6 = (C67683h) this.mData;
            if (hVar6 != null) {
                hVar6.f151688a = hVar3.f151688a;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        C89219l.m154721d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        Object a = m117741a(objArr, 0);
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
        this.f148301a = z;
        Object a2 = m117741a(objArr, 1);
        if (a2 instanceof C67681g) {
            gVar = a2;
        }
        C67681g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.f148301a) {
            this.mIsLoading = false;
        }
        this.f148302b = gVar2;
        C17305a.m32043a().mo27615a(this.mHandler, new CallableC65817c(this, gVar2), 0);
        return true;
    }

    /* renamed from: a */
    private static <T> Object m117741a(T[] tArr, int i) {
        if (i < tArr.length) {
            return tArr[i];
        }
        return null;
    }
}
