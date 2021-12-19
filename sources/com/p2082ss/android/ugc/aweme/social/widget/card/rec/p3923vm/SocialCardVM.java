package com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74752a;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74784f;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74755b;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74762g;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74764h;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74760e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74776b;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74777c;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74806a;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74807b;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74827d;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM */
public class SocialCardVM extends AbstractC1174ac implements AbstractC51499g {

    /* renamed from: A */
    private List<? extends AbstractC17641a> f168255A;

    /* renamed from: B */
    private List<? extends AbstractC17641a> f168256B;

    /* renamed from: C */
    private final List<AbstractC17641a> f168257C;

    /* renamed from: D */
    private final C33943c<List<AbstractC17641a>> f168258D;

    /* renamed from: E */
    private final C33943c<Integer> f168259E;

    /* renamed from: a */
    public final AbstractC89516am f168260a;

    /* renamed from: b */
    public final C88411a f168261b = new C88411a();

    /* renamed from: c */
    public C74827d.C74828a f168262c;

    /* renamed from: d */
    public final C74762g f168263d;

    /* renamed from: e */
    public final AbstractC74788j f168264e;

    /* renamed from: f */
    public final Map<String, String> f168265f;

    /* renamed from: g */
    public C17693c f168266g;

    /* renamed from: h */
    public int f168267h;

    /* renamed from: i */
    public int f168268i;

    /* renamed from: j */
    public final Set<String> f168269j;

    /* renamed from: k */
    public final Set<String> f168270k;

    /* renamed from: l */
    public List<? extends AbstractC17641a> f168271l;

    /* renamed from: m */
    public final LiveData<List<AbstractC17641a>> f168272m;

    /* renamed from: n */
    public final C33943c<Integer> f168273n;

    /* renamed from: o */
    public final LiveData<Integer> f168274o;

    /* renamed from: p */
    public final C33943c<C89378p<Boolean, Integer>> f168275p;

    /* renamed from: q */
    public final LiveData<C89378p<Boolean, Integer>> f168276q;

    /* renamed from: r */
    public final LiveData<Integer> f168277r;

    /* renamed from: s */
    public final C1213t<C74808c> f168278s;

    /* renamed from: t */
    public final LiveData<C74808c> f168279t;

    /* renamed from: u */
    public final AbstractC89244h f168280u;

    /* renamed from: v */
    public final C74765i f168281v;

    /* renamed from: w */
    private final AbstractC89703z f168282w;

    /* renamed from: x */
    private final AbstractC89244h f168283x = C89250i.m154773a((AbstractC89171a) new C74874n(this));

    /* renamed from: y */
    private final C74764h f168284y;

    /* renamed from: z */
    private final AbstractC89244h f168285z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$b */
    public static final class C74860b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168289a;

        /* renamed from: b */
        int f168290b;

        /* renamed from: c */
        final /* synthetic */ SocialCardVM f168291c;

        /* renamed from: d */
        Object f168292d;

        static {
            Covode.recordClassIndex(87720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74860b(SocialCardVM socialCardVM, AbstractC89124d dVar) {
            super(dVar);
            this.f168291c = socialCardVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168289a = obj;
            this.f168290b |= Integer.MIN_VALUE;
            return this.f168291c.mo117918d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$c */
    public static final class C74861c extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168293a;

        /* renamed from: b */
        int f168294b;

        /* renamed from: c */
        final /* synthetic */ SocialCardVM f168295c;

        /* renamed from: d */
        Object f168296d;

        static {
            Covode.recordClassIndex(87721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74861c(SocialCardVM socialCardVM, AbstractC89124d dVar) {
            super(dVar);
            this.f168295c = socialCardVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168293a = obj;
            this.f168294b |= Integer.MIN_VALUE;
            return this.f168295c.mo117917c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d */
    public static final class C74862d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168297a;

        /* renamed from: b */
        int f168298b;

        /* renamed from: c */
        final /* synthetic */ SocialCardVM f168299c;

        /* renamed from: d */
        Object f168300d;

        static {
            Covode.recordClassIndex(87722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74862d(SocialCardVM socialCardVM, AbstractC89124d dVar) {
            super(dVar);
            this.f168299c = socialCardVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168297a = obj;
            this.f168298b |= Integer.MIN_VALUE;
            return this.f168299c.mo117908a((EnumC74761f) null, this);
        }
    }

    static {
        Covode.recordClassIndex(87718);
    }

    /* renamed from: a */
    public final C74827d mo117907a() {
        return (C74827d) this.f168283x.getValue();
    }

    /* renamed from: b */
    public final C74755b mo117914b() {
        return (C74755b) this.f168285z.getValue();
    }

    /* renamed from: a */
    public final boolean mo117913a(User user) {
        if (this.f168269j.contains(user.getUid())) {
            return false;
        }
        Set<String> set = this.f168269j;
        String uid = user.getUid();
        C89219l.m154716b(uid, "");
        set.add(uid);
        return true;
    }

    /* renamed from: a */
    public final void mo117912a(Integer num, Integer num2) {
        if (num != null) {
            int intValue = num.intValue();
            int i = this.f168267h;
            if (intValue >= 0 && i > intValue) {
                this.f168267h = num.intValue();
            }
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            int i2 = this.f168268i;
            if (intValue2 >= 0 && i2 > intValue2 && i2 > 0) {
                this.f168268i = num2.intValue();
            }
        }
    }

    /* renamed from: a */
    public final void mo117911a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C74808c) {
            C74808c cVar = (C74808c) aVar;
            String name = cVar.f168131a.name();
            if (!this.f168270k.contains(name)) {
                this.f168270k.add(name);
                mo117914b().mo117808a(cVar.f168131a);
                C74776b.m131283a(cVar.f168131a, this.f168265f);
            }
        } else if (aVar instanceof C74825a) {
            C74825a aVar2 = (C74825a) aVar;
            User user = aVar2.f168175a;
            if (!this.f168270k.contains(user.getUid()) && user.isShould_write_impr()) {
                Set<String> set = this.f168270k;
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                set.add(uid);
                C74777c.m131289b(aVar2.f168175a, this.f168257C.indexOf(aVar), this.f168265f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51499g
    /* renamed from: a */
    public final void mo86981a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        Object obj = null;
        if (fVar == EnumC66622f.CONTACT && C51648a.f118980a.mo87322d().mo86984c()) {
            List<? extends AbstractC17641a> list = this.f168255A;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t instanceof C74808c) {
                    arrayList.add(t);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C74808c) next).f168131a == EnumC74761f.CONTACT) {
                    obj = next;
                    break;
                }
            }
            C74808c cVar = (C74808c) obj;
            if (cVar != null) {
                m131427a(cVar);
            }
        } else if (fVar == EnumC66622f.FACEBOOK && C51648a.f118980a.mo87327g().mo86993b()) {
            List<? extends AbstractC17641a> list2 = this.f168255A;
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : list2) {
                if (t2 instanceof C74808c) {
                    arrayList2.add(t2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((C74808c) next2).f168131a == EnumC74761f.FACEBOOK) {
                    obj = next2;
                    break;
                }
            }
            C74808c cVar2 = (C74808c) obj;
            if (cVar2 != null) {
                m131427a(cVar2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$l */
    static final class C74871l extends AbstractC89220m implements AbstractC89171a<C74755b> {

        /* renamed from: a */
        final /* synthetic */ SocialCardVM f168323a;

        static {
            Covode.recordClassIndex(87731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74871l(SocialCardVM socialCardVM) {
            super(0);
            this.f168323a = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74755b invoke() {
            return C74755b.C74756a.m131266a(this.f168323a.f168281v.f168052a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$n */
    static final class C74874n extends AbstractC89220m implements AbstractC89171a<C74827d> {

        /* renamed from: a */
        final /* synthetic */ SocialCardVM f168326a;

        static {
            Covode.recordClassIndex(87734);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74874n(SocialCardVM socialCardVM) {
            super(0);
            this.f168326a = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74827d invoke() {
            return new C74827d(this.f168326a.f168281v.f168052a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$m */
    static final class C74872m extends AbstractC89220m implements AbstractC89171a<C748731> {

        /* renamed from: a */
        final /* synthetic */ SocialCardVM f168324a;

        static {
            Covode.recordClassIndex(87732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74872m(SocialCardVM socialCardVM) {
            super(0);
            this.f168324a = socialCardVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C748731 invoke() {
            C17693c cVar = this.f168324a.f168266g;
            if (cVar == null) {
                C89219l.m154710a("pageConfigBuilder");
            }
            return new AbstractC17692b<Integer>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.C74872m.C748731 */

                /* renamed from: a */
                final /* synthetic */ C74872m f168325a;

                static {
                    Covode.recordClassIndex(87733);
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
                    C89219l.m154721d(dVar, "");
                    this.f168325a.f168324a.mo117909a(dVar);
                }

                {
                    this.f168325a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    ((Number) obj).intValue();
                    C89219l.m154721d(dVar, "");
                    SocialCardVM socialCardVM = this.f168325a.f168324a;
                    AbstractC89568bz unused = C89624i.m155555a(socialCardVM.f168260a, null, null, new C74868j(socialCardVM, dVar, null), 3);
                }
            };
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        this.f168282w.mo143985a((CancellationException) null);
        this.f168261b.dispose();
        C51648a.f118980a.mo87315b(this);
    }

    /* renamed from: c */
    private final void m131430c() {
        List<C74808c> list;
        boolean z;
        AbstractC17641a aVar;
        boolean z2;
        C74755b b = mo117914b();
        EnumC74761f[] values = EnumC74761f.values();
        boolean z3 = false;
        for (EnumC74761f fVar : values) {
            Boolean bool = b.f168032d.get(fVar);
            if (C74783e.m131300b(fVar) || !b.mo117811c(fVar)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bool != null && (!C89219l.m154714a(bool, Boolean.valueOf(z2)))) {
                b.f168032d.put(fVar, Boolean.valueOf(z2));
                z3 = true;
            }
        }
        if (z3) {
            Iterator<T> it = b.f168031c.iterator();
            while (it.hasNext()) {
                it.next().get();
            }
        }
        C74762g gVar = this.f168263d;
        if (gVar != null) {
            Set<EnumC74761f> keySet = gVar.f168044a.keySet();
            ArrayList arrayList = new ArrayList();
            for (T t : keySet) {
                Boolean bool2 = mo117914b().f168032d.get(t);
                if (bool2 != null && bool2.booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList<EnumC74761f> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (EnumC74761f fVar2 : arrayList2) {
                EnumC74754a aVar2 = gVar.f168044a.get(fVar2);
                if (aVar2 == null) {
                    C89219l.m154715b();
                }
                EnumC74754a aVar3 = aVar2;
                C89219l.m154721d(fVar2, "");
                C89219l.m154721d(aVar3, "");
                int i = C74784f.f168093d[fVar2.ordinal()];
                if (i == 1) {
                    aVar = new C74806a(aVar3);
                } else if (i == 2) {
                    aVar = new C74807b(aVar3);
                } else {
                    throw new C89376n();
                }
                arrayList3.add(aVar);
            }
            list = arrayList3;
        } else {
            list = C89086z.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (C74808c cVar : list) {
            arrayList4.add(cVar.f168131a);
        }
        if (this.f168284y == null) {
            z = true;
        } else {
            z = false;
        }
        m131428a(this, null, list, null, z, 5);
        C51648a.f118980a.mo87307a(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ C74827d.C74828a m131425a(SocialCardVM socialCardVM) {
        C74827d.C74828a aVar = socialCardVM.f168262c;
        if (aVar == null) {
            C89219l.m154710a("queryParams");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$k */
    public static final class C74869k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f168318a;

        /* renamed from: b */
        final /* synthetic */ SocialCardVM f168319b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89124d f168320c;

        static {
            Covode.recordClassIndex(87729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74869k(SocialCardVM socialCardVM, AbstractC89124d dVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f168319b = socialCardVM;
            this.f168320c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C74869k(this.f168319b, this.f168320c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C74869k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f168318a == 0) {
                C89382r.m154942a(obj);
                AbstractC89568bz unused = C89624i.m155555a(this.f168319b.f168260a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.C74869k.C748701 */

                    /* renamed from: a */
                    int f168321a;

                    /* renamed from: b */
                    final /* synthetic */ C74869k f168322b;

                    static {
                        Covode.recordClassIndex(87730);
                    }

                    {
                        this.f168322b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: b */
                        public final Object mo117915b(AbstractC89124d<? super C89378p<? extends AbstractC17700f<Integer>, ? extends List<? extends AbstractC17641a>>> dVar) {
                            C74827d.C74828a aVar = this.f168262c;
                            if (aVar == null) {
                                C89219l.m154710a("queryParams");
                            }
                            if (aVar.f168179a < aVar.f168181c && aVar.f168182d) {
                                return C89624i.m155554a(C89546bf.f203267b, new C74859a(this, null), dVar);
                            }
                            if (this.f168262c == null) {
                                C89219l.m154710a("queryParams");
                            }
                            return C89387v.m154943a(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE), this.f168271l);
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$e */
                        public static final class C74863e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super List<? extends User>>, Object> {

                            /* renamed from: a */
                            int f168301a;

                            /* renamed from: b */
                            final /* synthetic */ SocialCardVM f168302b;

                            /* renamed from: c */
                            final /* synthetic */ EnumC74761f f168303c;

                            static {
                                Covode.recordClassIndex(87723);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74863e(SocialCardVM socialCardVM, EnumC74761f fVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f168302b = socialCardVM;
                                this.f168303c = fVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C74863e(this.f168302b, this.f168303c, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super List<? extends User>> dVar) {
                                return ((C74863e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f168301a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    int i2 = C74876b.f168328a[this.f168303c.ordinal()];
                                    if (i2 == 1) {
                                        SocialCardVM socialCardVM = this.f168302b;
                                        this.f168301a = 1;
                                        obj = socialCardVM.mo117917c(this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        return obj;
                                    } else if (i2 == 2) {
                                        SocialCardVM socialCardVM2 = this.f168302b;
                                        this.f168301a = 2;
                                        obj = socialCardVM2.mo117918d(this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        throw new C89376n();
                                    }
                                } else if (i == 1) {
                                    C89382r.m154942a(obj);
                                    return obj;
                                } else if (i == 2) {
                                    C89382r.m154942a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                return obj;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$j */
                        static final class C74868j extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f168315a;

                            /* renamed from: b */
                            final /* synthetic */ SocialCardVM f168316b;

                            /* renamed from: c */
                            final /* synthetic */ AbstractC89124d f168317c;

                            static {
                                Covode.recordClassIndex(87728);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74868j(SocialCardVM socialCardVM, AbstractC89124d dVar, AbstractC89124d dVar2) {
                                super(2, dVar2);
                                this.f168316b = socialCardVM;
                                this.f168317c = dVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C74868j(this.f168316b, this.f168317c, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C74868j) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f168315a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    SocialCardVM socialCardVM = this.f168316b;
                                    this.f168315a = 1;
                                    obj = socialCardVM.mo117915b(this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } else if (i == 1) {
                                    C89382r.m154942a(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C89378p pVar = (C89378p) obj;
                                Object component1 = pVar.component1();
                                List list = (List) pVar.component2();
                                AbstractC89124d dVar = this.f168317c;
                                if (dVar != null) {
                                    dVar.resumeWith(C89379q.m157068constructorimpl(component1));
                                }
                                SocialCardVM.m131428a(this.f168316b, list, null, null, false, 14);
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: a */
                        private void m131427a(C74808c cVar) {
                            boolean z;
                            boolean z2;
                            C89219l.m154721d(cVar, "");
                            C74762g gVar = this.f168263d;
                            if (gVar != null) {
                                z = gVar.f168045b;
                            } else {
                                z = false;
                            }
                            C74762g gVar2 = this.f168263d;
                            if (gVar2 != null) {
                                z2 = gVar2.f168046c;
                            } else {
                                z2 = false;
                            }
                            List g = C89070n.m154585g((Collection) this.f168255A);
                            List g2 = C89070n.m154585g((Collection) this.f168256B);
                            int indexOf = g.indexOf(cVar);
                            int size = g.size();
                            if (indexOf >= 0 && size > indexOf) {
                                if (z) {
                                    AbstractC89568bz unused = C89624i.m155555a(this.f168260a, null, null, new C74864f(this, cVar, g, indexOf, z2, g2, null), 3);
                                    return;
                                }
                                g.remove(indexOf);
                                AbstractC74788j jVar = this.f168264e;
                                if (jVar != null) {
                                    jVar.mo86628a(cVar.f168131a, EnumC74760e.ON_AUTHORIZE, null);
                                }
                                m131428a(this, null, g, null, false, 13);
                            }
                        }

                        /* renamed from: b */
                        public final void mo117916b(AbstractC17641a aVar) {
                            C89219l.m154721d(aVar, "");
                            if (aVar instanceof C74808c) {
                                C74808c cVar = (C74808c) aVar;
                                mo117914b().mo117810b(cVar.f168131a);
                                AbstractC74788j jVar = this.f168264e;
                                if (jVar != null) {
                                    jVar.mo86628a(cVar.f168131a, EnumC74760e.ON_DELETE, null);
                                }
                                C74776b.m131284b(cVar.f168131a, this.f168265f);
                                m131426a(aVar, this.f168255A, new C74865g(this));
                            } else if (aVar instanceof C74825a) {
                                if (m131426a(aVar, this.f168271l, new C74866h(this)) == null) {
                                    m131426a(aVar, this.f168256B, new C74867i(this));
                                }
                                C74777c.m131286a(((C74825a) aVar).f168175a, this.f168257C.indexOf(aVar), this.f168265f);
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* renamed from: c */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo117917c(p4600h.p4603c.AbstractC89124d<? super java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User>> r7) {
                            /*
                            // Method dump skipped, instructions count: 126
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.mo117917c(h.c.d):java.lang.Object");
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* renamed from: d */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo117918d(p4600h.p4603c.AbstractC89124d<? super java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User>> r6) {
                            /*
                            // Method dump skipped, instructions count: 122
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.mo117918d(h.c.d):java.lang.Object");
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$f */
                        public static final class C74864f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f168304a;

                            /* renamed from: b */
                            final /* synthetic */ SocialCardVM f168305b;

                            /* renamed from: c */
                            final /* synthetic */ C74808c f168306c;

                            /* renamed from: d */
                            final /* synthetic */ List f168307d;

                            /* renamed from: e */
                            final /* synthetic */ int f168308e;

                            /* renamed from: f */
                            final /* synthetic */ boolean f168309f;

                            /* renamed from: g */
                            final /* synthetic */ List f168310g;

                            /* renamed from: h */
                            private /* synthetic */ Object f168311h;

                            static {
                                Covode.recordClassIndex(87724);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74864f(SocialCardVM socialCardVM, C74808c cVar, List list, int i, boolean z, List list2, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f168305b = socialCardVM;
                                this.f168306c = cVar;
                                this.f168307d = list;
                                this.f168308e = i;
                                this.f168309f = z;
                                this.f168310g = list2;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                C74864f fVar = new C74864f(this.f168305b, this.f168306c, this.f168307d, this.f168308e, this.f168309f, this.f168310g, dVar);
                                fVar.f168311h = obj;
                                return fVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C74864f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9 A[Catch:{ all -> 0x00df }] */
                            /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                /*
                                // Method dump skipped, instructions count: 252
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.C74864f.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$a */
                        public static final class C74859a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends AbstractC17700f<Integer>, ? extends List<? extends AbstractC17641a>>>, Object> {

                            /* renamed from: a */
                            Object f168286a;

                            /* renamed from: b */
                            int f168287b;

                            /* renamed from: c */
                            final /* synthetic */ SocialCardVM f168288c;

                            static {
                                Covode.recordClassIndex(87719);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74859a(SocialCardVM socialCardVM, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f168288c = socialCardVM;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C74859a(this.f168288c, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends AbstractC17700f<Integer>, ? extends List<? extends AbstractC17641a>>> dVar) {
                                return ((C74859a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                C89378p pVar;
                                List<? extends AbstractC17641a> list;
                                Exception e;
                                Object obj2 = obj;
                                MethodCollector.m26663i(7155);
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f168287b;
                                if (i == 0) {
                                    C89382r.m154942a(obj2);
                                    synchronized (this.f168288c) {
                                        try {
                                            list = this.f168288c.f168271l;
                                        } finally {
                                            MethodCollector.m26664o(7155);
                                        }
                                    }
                                    try {
                                        C74827d a = this.f168288c.mo117907a();
                                        C74827d.C74828a a2 = SocialCardVM.m131425a(this.f168288c);
                                        this.f168286a = list;
                                        this.f168287b = 1;
                                        obj2 = a.mo117888a(a2, this);
                                        if (obj2 == aVar) {
                                            return aVar;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        this.f168288c.mo117910a(R.string.mh);
                                        pVar = C89387v.m154943a(AbstractC17700f.C17701a.m32839a(e), list);
                                        MethodCollector.m26664o(7155);
                                        return pVar;
                                    }
                                } else if (i == 1) {
                                    list = (List) this.f168286a;
                                    try {
                                        C89382r.m154942a(obj2);
                                    } catch (Exception e3) {
                                        e = e3;
                                        this.f168288c.mo117910a(R.string.mh);
                                        pVar = C89387v.m154943a(AbstractC17700f.C17701a.m32839a(e), list);
                                        MethodCollector.m26664o(7155);
                                        return pVar;
                                    }
                                } else {
                                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    MethodCollector.m26664o(7155);
                                    throw illegalStateException;
                                }
                                RecommendList recommendList = (RecommendList) ((RecommendList) obj2).checkValid();
                                C89219l.m154716b(recommendList, "");
                                recommendList.getUserList().size();
                                List<User> userList = recommendList.getUserList();
                                C89219l.m154716b(userList, "");
                                ArrayList arrayList = new ArrayList();
                                for (T t : userList) {
                                    T t2 = t;
                                    SocialCardVM socialCardVM = this.f168288c;
                                    C89219l.m154716b(t2, "");
                                    if (socialCardVM.mo117913a((User) t2)) {
                                        arrayList.add(t);
                                    }
                                }
                                ArrayList<User> arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                                for (User user : arrayList2) {
                                    C89219l.m154716b(user, "");
                                    arrayList3.add(new C74825a(user));
                                }
                                List g = C89070n.m154585g((Collection) list);
                                g.addAll(arrayList3);
                                SocialCardVM socialCardVM2 = this.f168288c;
                                C74827d.C74828a a3 = SocialCardVM.m131425a(socialCardVM2);
                                int cursor = recommendList.getCursor();
                                boolean hasMore = recommendList.hasMore();
                                int i2 = a3.f168180b;
                                int i3 = a3.f168181c;
                                String str = a3.f168183e;
                                String str2 = a3.f168184f;
                                int i4 = a3.f168185g;
                                C89219l.m154721d(str, "");
                                socialCardVM2.f168262c = new C74827d.C74828a(cursor, i2, i3, hasMore, str, str2, i4);
                                if (!recommendList.hasMore()) {
                                    pVar = C89387v.m154943a(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE), g);
                                } else {
                                    pVar = C89387v.m154943a(AbstractC17700f.C17701a.m32841a(null, C89108b.m154610a(recommendList.getCursor()), null, 5), g);
                                }
                                MethodCollector.m26664o(7155);
                                return pVar;
                            }
                        }

                        public SocialCardVM(C74765i iVar) {
                            int i;
                            int i2;
                            Map<EnumC74761f, EnumC74754a> map;
                            C89219l.m154721d(iVar, "");
                            this.f168281v = iVar;
                            AbstractC89703z a = C89599cu.m155531a();
                            this.f168282w = a;
                            this.f168260a = C89517an.m155448a(C89652o.f203399a.plus(a));
                            C74764h hVar = iVar.f168054c;
                            this.f168284y = hVar;
                            C74762g gVar = iVar.f168053b;
                            this.f168263d = gVar;
                            this.f168264e = iVar.f168056e;
                            this.f168265f = iVar.f168055d;
                            this.f168285z = C89250i.m154773a((AbstractC89171a) new C74871l(this));
                            if (gVar != null) {
                                i = gVar.f168047d;
                            } else {
                                i = 0;
                            }
                            this.f168267h = i;
                            this.f168269j = new LinkedHashSet();
                            this.f168270k = new LinkedHashSet();
                            this.f168271l = C89086z.INSTANCE;
                            this.f168255A = C89086z.INSTANCE;
                            this.f168256B = C89086z.INSTANCE;
                            this.f168257C = new ArrayList();
                            C33943c<List<AbstractC17641a>> cVar = new C33943c<>();
                            this.f168258D = cVar;
                            this.f168272m = cVar;
                            C33943c<Integer> cVar2 = new C33943c<>();
                            this.f168273n = cVar2;
                            this.f168274o = cVar2;
                            C33943c<C89378p<Boolean, Integer>> cVar3 = new C33943c<>();
                            this.f168275p = cVar3;
                            this.f168276q = cVar3;
                            C33943c<Integer> cVar4 = new C33943c<>();
                            this.f168259E = cVar4;
                            this.f168277r = cVar4;
                            C33943c cVar5 = new C33943c();
                            this.f168278s = cVar5;
                            this.f168279t = cVar5;
                            m131430c();
                            if (hVar != null) {
                                int i3 = hVar.f168050c;
                                if (gVar == null || (map = gVar.f168044a) == null) {
                                    i2 = 0;
                                } else {
                                    i2 = map.size();
                                }
                                int size = (i3 - i2) - this.f168255A.size();
                                this.f168262c = new C74827d.C74828a(Math.min(size, hVar.f168049b), size, false, (String) null, (String) null, iVar.f168052a, 57);
                            } else {
                                this.f168262c = new C74827d.C74828a(0, 0, false, (String) null, (String) null, 0, 122);
                            }
                            this.f168266g = new C17693c();
                            if (hVar != null && hVar.f168048a == EnumC74754a.RECTANGLE) {
                                C17693c cVar6 = this.f168266g;
                                if (cVar6 == null) {
                                    C89219l.m154710a("pageConfigBuilder");
                                }
                                cVar6.mo28182a(LoadingFooterCell.class);
                            }
                            this.f168280u = C89250i.m154773a((AbstractC89171a) new C74872m(this));
                        }

                        /* renamed from: a */
                        public final AbstractC89568bz mo117909a(AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
                            return C89624i.m155555a(this.f168260a, null, null, new C74869k(this, dVar, null), 3);
                        }

                        /* renamed from: a */
                        public final void mo117910a(int i) {
                            this.f168259E.postValue(Integer.valueOf(i));
                        }

                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$g */
                        static final class C74865g extends AbstractC89220m implements AbstractC89183m<Integer, List<AbstractC17641a>, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ SocialCardVM f168312a;

                            static {
                                Covode.recordClassIndex(87725);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74865g(SocialCardVM socialCardVM) {
                                super(2);
                                this.f168312a = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(Integer num, List<AbstractC17641a> list) {
                                int intValue = num.intValue();
                                List<AbstractC17641a> list2 = list;
                                C89219l.m154721d(list2, "");
                                list2.remove(intValue);
                                SocialCardVM.m131428a(this.f168312a, null, list2, null, false, 13);
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$h */
                        static final class C74866h extends AbstractC89220m implements AbstractC89183m<Integer, List<AbstractC17641a>, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ SocialCardVM f168313a;

                            static {
                                Covode.recordClassIndex(87726);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74866h(SocialCardVM socialCardVM) {
                                super(2);
                                this.f168313a = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(Integer num, List<AbstractC17641a> list) {
                                User user;
                                int intValue = num.intValue();
                                List<AbstractC17641a> list2 = list;
                                C89219l.m154721d(list2, "");
                                SocialCardVM socialCardVM = this.f168313a;
                                socialCardVM.mo117912a(Integer.valueOf(socialCardVM.f168267h - 1), Integer.valueOf(this.f168313a.f168268i - 1));
                                AbstractC17641a remove = list2.remove(intValue);
                                if (!(remove instanceof C74825a)) {
                                    remove = null;
                                }
                                C74825a aVar = (C74825a) remove;
                                if (!(aVar == null || (user = aVar.f168175a) == null)) {
                                    this.f168313a.mo117907a();
                                    String uid = user.getUid();
                                    C89219l.m154716b(uid, "");
                                    String secUid = user.getSecUid();
                                    C89219l.m154716b(secUid, "");
                                    C74827d.m131398a(uid, secUid);
                                }
                                SocialCardVM.m131428a(this.f168313a, list2, null, null, false, 14);
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$i */
                        static final class C74867i extends AbstractC89220m implements AbstractC89183m<Integer, List<AbstractC17641a>, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ SocialCardVM f168314a;

                            static {
                                Covode.recordClassIndex(87727);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C74867i(SocialCardVM socialCardVM) {
                                super(2);
                                this.f168314a = socialCardVM;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(Integer num, List<AbstractC17641a> list) {
                                User user;
                                int intValue = num.intValue();
                                List<AbstractC17641a> list2 = list;
                                C89219l.m154721d(list2, "");
                                AbstractC17641a remove = list2.remove(intValue);
                                if (!(remove instanceof C74825a)) {
                                    remove = null;
                                }
                                C74825a aVar = (C74825a) remove;
                                if (!(aVar == null || (user = aVar.f168175a) == null)) {
                                    this.f168314a.mo117907a();
                                    String uid = user.getUid();
                                    C89219l.m154716b(uid, "");
                                    String secUid = user.getSecUid();
                                    C89219l.m154716b(secUid, "");
                                    C74827d.m131398a(uid, secUid);
                                }
                                SocialCardVM.m131428a(this.f168314a, null, null, list2, false, 11);
                                return C89391z.f203057a;
                            }
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
                        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
                        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo117908a(com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f r7, p4600h.p4603c.AbstractC89124d<? super java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User>> r8) {
                            /*
                                r6 = this;
                                boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.C74862d
                                if (r0 == 0) goto L_0x0050
                                r5 = r8
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d r5 = (com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.C74862d) r5
                                int r0 = r5.f168298b
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L_0x0050
                                int r0 = r5.f168298b
                                int r0 = r0 - r1
                                r5.f168298b = r0
                            L_0x0013:
                                java.lang.Object r2 = r5.f168297a
                                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                                int r0 = r5.f168298b
                                r3 = 1
                                if (r0 == 0) goto L_0x002f
                                if (r0 != r3) goto L_0x0056
                                java.lang.Object r0 = r5.f168300d
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM r0 = (com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM) r0
                                p4600h.C89382r.m154942a(r2)
                            L_0x0025:
                                com.ss.android.ugc.aweme.social.widget.card.j r1 = r0.f168264e
                                if (r1 == 0) goto L_0x002e
                                com.ss.android.ugc.aweme.social.widget.card.k r0 = com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k.NORMAL
                                r1.mo86629a(r0)
                            L_0x002e:
                                return r2
                            L_0x002f:
                                p4600h.C89382r.m154942a(r2)
                                com.ss.android.ugc.aweme.social.widget.card.j r1 = r6.f168264e
                                if (r1 == 0) goto L_0x003b
                                com.ss.android.ugc.aweme.social.widget.card.k r0 = com.p2082ss.android.ugc.aweme.social.widget.card.EnumC74790k.LOADING
                                r1.mo86629a(r0)
                            L_0x003b:
                                kotlinx.coroutines.ah r2 = kotlinx.coroutines.C89546bf.f203267b
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$e r1 = new com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$e
                                r0 = 0
                                r1.<init>(r6, r7, r0)
                                r5.f168300d = r6
                                r5.f168298b = r3
                                java.lang.Object r2 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                                if (r2 != r4) goto L_0x004e
                                return r4
                            L_0x004e:
                                r0 = r6
                                goto L_0x0025
                            L_0x0050:
                                com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d r5 = new com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM$d
                                r5.<init>(r6, r8)
                                goto L_0x0013
                            L_0x0056:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM.mo117908a(com.ss.android.ugc.aweme.social.widget.card.a.f, h.c.d):java.lang.Object");
                        }

                        /* renamed from: a */
                        private static C89391z m131426a(AbstractC17641a aVar, List<? extends AbstractC17641a> list, AbstractC89183m<? super Integer, ? super List<AbstractC17641a>, C89391z> mVar) {
                            int indexOf = list.indexOf(aVar);
                            if (indexOf == -1) {
                                return null;
                            }
                            mVar.invoke(Integer.valueOf(indexOf), C89070n.m154585g((Collection) list));
                            return C89391z.f203057a;
                        }

                        /* renamed from: a */
                        private final void m131429a(List<? extends AbstractC17641a> list, List<? extends AbstractC17641a> list2, List<? extends AbstractC17641a> list3, boolean z) {
                            if (list != null) {
                                this.f168271l = C89070n.m154590j(list);
                            }
                            if (list2 != null) {
                                this.f168255A = C89070n.m154590j(list2);
                            }
                            if (list3 != null) {
                                this.f168256B = C89070n.m154590j(list3);
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(this.f168271l);
                            int size = arrayList.size();
                            int i = this.f168267h;
                            if (i >= 0 && size > i) {
                                arrayList.addAll(i, this.f168255A);
                            } else {
                                arrayList.addAll(this.f168255A);
                            }
                            int size2 = arrayList.size();
                            int i2 = this.f168268i;
                            if (i2 >= 0 && size2 > i2) {
                                arrayList.addAll(i2, this.f168256B);
                            } else {
                                arrayList.addAll(this.f168256B);
                            }
                            if (this.f168281v.f168057f && arrayList.size() > 0) {
                                arrayList.add(0, new C74752a(-1));
                            }
                            this.f168257C.clear();
                            this.f168257C.addAll(arrayList);
                            arrayList.size();
                            if (z) {
                                this.f168257C.size();
                                AbstractC74788j jVar = this.f168264e;
                                if (jVar != null) {
                                    jVar.mo86630d(this.f168257C.size());
                                }
                                this.f168258D.postValue(this.f168257C);
                            }
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.social.widget.card.rec.vm.SocialCardVM */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* renamed from: a */
                        static /* synthetic */ void m131428a(SocialCardVM socialCardVM, List list, List list2, List list3, boolean z, int i) {
                            if ((i & 1) != 0) {
                                list = null;
                            }
                            if ((i & 2) != 0) {
                                list2 = null;
                            }
                            if ((i & 4) != 0) {
                                list3 = null;
                            }
                            if ((i & 8) != 0) {
                                z = true;
                            }
                            socialCardVM.m131429a(list, list2, list3, z);
                        }
                    }
