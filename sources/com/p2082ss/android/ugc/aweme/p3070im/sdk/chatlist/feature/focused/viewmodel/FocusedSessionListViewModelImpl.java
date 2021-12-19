package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3151a.C54886a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.AbstractC54902b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.C54903c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.p3153a.C54899b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.AbstractC55101k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55097i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55255b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl */
public final class FocusedSessionListViewModelImpl extends AbstractC1174ac implements AbstractC54913a, AbstractC55101k<AbstractC56237a> {

    /* renamed from: a */
    public final AbstractC89172b<List<AbstractC56237a>, C89391z> f125701a;

    /* renamed from: b */
    private final C55255b<Boolean> f125702b;

    /* renamed from: c */
    private final C88958b<List<AbstractC56237a>> f125703c;

    /* renamed from: d */
    private final AbstractC89516am f125704d;

    /* renamed from: e */
    private boolean f125705e;

    /* renamed from: f */
    private C54910a f125706f;

    /* renamed from: g */
    private final AbstractC54902b f125707g;

    /* renamed from: h */
    private final C55102l f125708h;

    static {
        Covode.recordClassIndex(64630);
    }

    public FocusedSessionListViewModelImpl() {
        this((byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: a */
    public final C55255b<Boolean> mo91908a() {
        return this.f125702b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: b */
    public final void mo91912b() {
        this.f125708h.mo92017f();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: d */
    public final void mo91914d() {
        C54823a.m100424a(this.f125706f.f125709a, this.f125706f.f125710b);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f125708h.mo92013b(this);
        C89517an.m155450b(this.f125704d);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: c */
    public final AbstractC88979t<List<AbstractC56237a>> mo91913c() {
        AbstractC88979t<List<AbstractC56237a>> a = this.f125703c.mo143283c().mo143266a(C88446a.f200695a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl$b */
    static final class C54911b extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C54911b f125711a = new C54911b();

        static {
            Covode.recordClassIndex(64633);
        }

        C54911b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93390c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl$c */
    static final class C54912c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125712a;

        /* renamed from: b */
        final /* synthetic */ FocusedSessionListViewModelImpl f125713b;

        /* renamed from: c */
        final /* synthetic */ List f125714c;

        static {
            Covode.recordClassIndex(64634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54912c(FocusedSessionListViewModelImpl focusedSessionListViewModelImpl, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125713b = focusedSessionListViewModelImpl;
            this.f125714c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54912c(this.f125713b, this.f125714c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54912c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f125712a == 0) {
                C89382r.m154942a(obj);
                this.f125713b.f125701a.invoke(this.f125714c);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private /* synthetic */ FocusedSessionListViewModelImpl(byte b) {
        this(new C54903c(), C55102l.C55104a.m100801a(), new AbstractC89172b<List<? extends AbstractC56237a>, C89391z>(C55097i.f126090b) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl.C549091 */

            static {
                Covode.recordClassIndex(64631);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends AbstractC56237a> list) {
                C55097i.m100771a(list);
                return C89391z.f203057a;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: b */
    public final int mo91911b(int i) {
        List<AbstractC56237a> i2;
        if (i < 0 || (i2 = this.f125703c.mo143221i()) == null) {
            return -1;
        }
        C89219l.m154716b(i2, "");
        int size = i2.size();
        while (i < size) {
            if (i2.get(i).f128238q > 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a
    /* renamed from: a */
    public final void mo91909a(int i) {
        this.f125702b.setValue(true);
        C56407f.m102373a(C54911b.f125711a);
        C54886a.C54887a aVar = C54886a.C54887a.f125662a;
        C89219l.m154721d(aVar, "");
        aVar.invoke("click_see_all_activities", C89041ag.m154421a(C89387v.m154943a("tab_name", "chat"), C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("notice_type", "previous"), C89387v.m154943a("show_cnt", String.valueOf(i))));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.AbstractC55101k
    /* renamed from: a */
    public final void mo91910a(List<AbstractC56237a> list) {
        C89219l.m154721d(list, "");
        boolean z = false;
        if (this.f125705e) {
            this.f125705e = false;
            AbstractC89568bz unused = C89624i.m155555a(this.f125704d, C89546bf.f203267b, null, new C54912c(this, list, null), 2);
        }
        if (C89219l.m154714a((Object) this.f125702b.getValue(), (Object) true)) {
            this.f125706f = new C54910a(list.size(), list.size());
        } else {
            List<AbstractC56237a> g = C89070n.m154585g((Collection) this.f125707g.mo91907a(list));
            this.f125706f = new C54910a(list.size(), g.size());
            if (g.size() < list.size()) {
                C54899b bVar = new C54899b();
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (!g.contains(t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList<AbstractC56237a> arrayList2 = arrayList;
                ArrayList<Number> arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (AbstractC56237a aVar : arrayList2) {
                    arrayList3.add(Integer.valueOf(aVar.f128238q));
                }
                int i = 0;
                for (Number number : arrayList3) {
                    i += number.intValue();
                }
                bVar.f128238q = i;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((AbstractC56237a) next).f128239r) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
                bVar.f128239r = z;
                g.add(bVar);
            }
            list = g;
        }
        this.f125703c.onNext(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl$a */
    static final class C54910a {

        /* renamed from: a */
        public final int f125709a;

        /* renamed from: b */
        public final int f125710b;

        static {
            Covode.recordClassIndex(64632);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54910a)) {
                return false;
            }
            C54910a aVar = (C54910a) obj;
            return this.f125709a == aVar.f125709a && this.f125710b == aVar.f125710b;
        }

        public final int hashCode() {
            return (this.f125709a * 31) + this.f125710b;
        }

        public final String toString() {
            return "SessionListCount(totalChatCount=" + this.f125709a + ", showChatCount=" + this.f125710b + ")";
        }

        public C54910a(int i, int i2) {
            this.f125709a = i;
            this.f125710b = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.im.service.k.a>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private FocusedSessionListViewModelImpl(AbstractC54902b bVar, C55102l lVar, AbstractC89172b<? super List<AbstractC56237a>, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(bVar2, "");
        this.f125707g = bVar;
        this.f125708h = lVar;
        this.f125701a = bVar2;
        C55255b<Boolean> bVar3 = new C55255b<>();
        this.f125702b = bVar3;
        C88958b<List<AbstractC56237a>> a = C88958b.m154214a((Object) C89086z.INSTANCE);
        C89219l.m154716b(a, "");
        this.f125703c = a;
        this.f125704d = C89517an.m155448a(C89546bf.f203266a);
        this.f125705e = true;
        this.f125706f = new C54910a(0, 0);
        bVar3.setValue(false);
        lVar.mo92009a(this);
    }
}
