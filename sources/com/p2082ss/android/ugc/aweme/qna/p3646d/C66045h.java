package com.p2082ss.android.ugc.aweme.qna.p3646d;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.qna.api.C66012i;
import com.p2082ss.android.ugc.aweme.qna.api.C66013j;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66291d;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66060a;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66062c;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66339o;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qna.d.h */
public final class C66045h implements AbstractC66053i {

    /* renamed from: a */
    public C1213t<C66278b<List<C66293f>>> f148706a;

    /* renamed from: b */
    public LiveData<C66278b<List<C66293f>>> f148707b;

    /* renamed from: c */
    public final C1213t<C66278b<EnumC66276w>> f148708c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<C66278b<EnumC66276w>> f148709d = new C1213t<>();

    /* renamed from: e */
    public final LiveData<C66278b<C66297i>> f148710e;

    /* renamed from: f */
    public C1213t<C66278b<Long>> f148711f;

    /* renamed from: g */
    public LiveData<C66278b<Long>> f148712g;

    /* renamed from: h */
    public List<C66504c> f148713h;

    /* renamed from: i */
    public Map<String, String> f148714i;

    /* renamed from: j */
    public Set<String> f148715j;

    /* renamed from: k */
    public C66054j f148716k;

    /* renamed from: l */
    public final int f148717l;

    /* renamed from: m */
    public int f148718m;

    /* renamed from: n */
    public final C88411a f148719n;

    /* renamed from: o */
    public final Object f148720o;

    /* renamed from: p */
    public AtomicBoolean f148721p;

    /* renamed from: q */
    public final AtomicBoolean f148722q;

    /* renamed from: r */
    private final C1213t<C66278b<C66297i>> f148723r;

    /* renamed from: s */
    private long f148724s;

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$b */
    public static final class C66047b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66047b f148726a = new C66047b();

        static {
            Covode.recordClassIndex(77553);
        }

        C66047b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(77551);
    }

    public C66045h() {
        int a;
        C1213t<C66278b<List<C66293f>>> tVar = new C1213t<>();
        this.f148706a = tVar;
        this.f148707b = tVar;
        C1213t<C66278b<C66297i>> tVar2 = new C1213t<>();
        this.f148723r = tVar2;
        this.f148710e = tVar2;
        C1213t<C66278b<Long>> tVar3 = new C1213t<>();
        this.f148711f = tVar3;
        this.f148712g = tVar3;
        this.f148713h = new ArrayList();
        this.f148714i = new HashMap();
        this.f148715j = new HashSet();
        this.f148716k = new C66054j();
        if (C66062c.m117873a()) {
            a = 1;
        } else {
            a = C66060a.m117870a();
        }
        this.f148717l = a;
        this.f148719n = new C88411a();
        this.f148720o = new Object();
        this.f148721p = new AtomicBoolean(false);
        this.f148722q = new AtomicBoolean(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$d */
    public static final class C66049d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66045h f148731a;

        /* renamed from: b */
        final /* synthetic */ boolean f148732b;

        /* renamed from: c */
        final /* synthetic */ String f148733c;

        /* renamed from: d */
        final /* synthetic */ boolean f148734d;

        static {
            Covode.recordClassIndex(77555);
        }

        public C66049d(C66045h hVar, boolean z, String str, boolean z2) {
            this.f148731a = hVar;
            this.f148732b = z;
            this.f148733c = str;
            this.f148734d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148731a.mo105103a(this.f148733c, this.f148732b);
            this.f148731a.f148709d.setValue(new C66278b<>(EnumC66276w.FAILURE));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$f */
    static final class C66051f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66045h f148739a;

        /* renamed from: b */
        final /* synthetic */ boolean f148740b;

        /* renamed from: c */
        final /* synthetic */ String f148741c;

        /* renamed from: d */
        final /* synthetic */ boolean f148742d;

        static {
            Covode.recordClassIndex(77557);
        }

        C66051f(C66045h hVar, boolean z, String str, boolean z2) {
            this.f148739a = hVar;
            this.f148740b = z;
            this.f148741c = str;
            this.f148742d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148739a.mo105103a(this.f148741c, this.f148740b);
            this.f148739a.f148708c.setValue(new C66278b<>(EnumC66276w.FAILURE));
            this.f148739a.f148721p.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$g */
    public static final class C66052g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f148743a;

        /* renamed from: b */
        final /* synthetic */ C66045h f148744b;

        /* renamed from: c */
        final /* synthetic */ List f148745c;

        static {
            Covode.recordClassIndex(77558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66052g(C66045h hVar, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f148744b = hVar;
            this.f148745c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C66052g(this.f148744b, this.f148745c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C66052g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f148743a == 0) {
                C89382r.m154942a(obj);
                this.f148744b.f148706a.setValue(new C66278b<>(this.f148745c));
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$a */
    public static final class C66046a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66045h f148725a;

        static {
            Covode.recordClassIndex(77552);
        }

        public C66046a(C66045h hVar) {
            this.f148725a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148725a.f148711f.postValue(new C66278b<>(Long.valueOf(((C66013j) obj).f148627d)));
            this.f148725a.f148708c.setValue(new C66278b<>(C66339o.m117989a((C66012i) null, this.f148725a.f148713h)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$e */
    static final class C66050e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66045h f148735a;

        /* renamed from: b */
        final /* synthetic */ boolean f148736b;

        /* renamed from: c */
        final /* synthetic */ String f148737c;

        /* renamed from: d */
        final /* synthetic */ boolean f148738d;

        static {
            Covode.recordClassIndex(77556);
        }

        C66050e(C66045h hVar, boolean z, String str, boolean z2) {
            this.f148735a = hVar;
            this.f148736b = z;
            this.f148737c = str;
            this.f148738d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C66012i iVar = (C66012i) obj;
            this.f148735a.f148722q.set(iVar.f148623e);
            this.f148735a.f148718m = iVar.f148622d;
            C66045h hVar = this.f148735a;
            List list = iVar.f148621c;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            C66045h.m117862a(hVar, list, this.f148737c, this.f148736b, false, 16);
            this.f148735a.f148708c.setValue(new C66278b<>(C66339o.m117989a(iVar, this.f148735a.f148713h)));
            this.f148735a.f148721p.set(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66053i
    /* renamed from: a */
    public final void mo105095a(C66059m mVar) {
        MethodCollector.m26663i(12002);
        C89219l.m154721d(mVar, "");
        if (mVar.f148759a) {
            String str = mVar.f148762d;
            if (str != null) {
                synchronized (this.f148720o) {
                    try {
                        this.f148714i.put(mVar.f148760b, str);
                        this.f148715j.remove(mVar.f148760b);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(12002);
                        throw th;
                    }
                }
                m117862a(this, C89086z.INSTANCE, null, false, false, 30);
                MethodCollector.m26664o(12002);
                return;
            }
            MethodCollector.m26664o(12002);
            return;
        }
        synchronized (this.f148720o) {
            try {
                this.f148715j.remove(mVar.f148760b);
            } finally {
                MethodCollector.m26664o(12002);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.h$c */
    public static final class C66048c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66045h f148727a;

        /* renamed from: b */
        final /* synthetic */ boolean f148728b;

        /* renamed from: c */
        final /* synthetic */ String f148729c;

        /* renamed from: d */
        final /* synthetic */ boolean f148730d;

        static {
            Covode.recordClassIndex(77554);
        }

        public C66048c(C66045h hVar, boolean z, String str, boolean z2) {
            this.f148727a = hVar;
            this.f148728b = z;
            this.f148729c = str;
            this.f148730d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.m26663i(11369);
            C66012i iVar = (C66012i) obj;
            C66045h hVar = this.f148727a;
            List<C66504c> list = iVar.f148621c;
            if (list != null) {
                synchronized (hVar.f148720o) {
                    try {
                        List<C66504c> list2 = hVar.f148713h;
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getId());
                        }
                        HashSet i = C89070n.m154589i((Iterable) arrayList);
                        for (T t : list) {
                            if (!i.contains(t.getId())) {
                                hVar.f148713h.add(0, t);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(11369);
                        throw th;
                    }
                }
            }
            this.f148727a.mo105104a(C89086z.INSTANCE, this.f148729c, this.f148728b, false);
            this.f148727a.f148709d.setValue(new C66278b<>(C66339o.m117989a(iVar, this.f148727a.f148713h)));
            MethodCollector.m26664o(11369);
        }
    }

    /* renamed from: a */
    public final void mo105103a(String str, boolean z) {
        m117862a(this, C89086z.INSTANCE, str, z, false, 16);
    }

    /* renamed from: a */
    public final void mo105104a(List<C66504c> list, String str, boolean z, boolean z2) {
        MethodCollector.m26663i(11857);
        ArrayList<C66293f> arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C66291d("privacyBanner", str));
        }
        synchronized (this.f148720o) {
            try {
                List<C66504c> list2 = this.f148713h;
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    boolean contains = this.f148715j.contains(String.valueOf(next.getId()));
                    if (this.f148714i.keySet().contains(String.valueOf(next.getId()))) {
                        str2 = this.f148714i.get(String.valueOf(next.getId()));
                    }
                    arrayList2.add(C66293f.C66294a.m117961a((C66504c) next, str2, contains));
                }
                arrayList.addAll(C89070n.m154585g((Collection) arrayList2));
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                for (C66293f fVar : arrayList) {
                    arrayList3.add(fVar.f149044h);
                }
                Set o = C89070n.m154595o(arrayList3);
                for (T t : list) {
                    if (!o.contains(String.valueOf(t.getId()))) {
                        o.add(String.valueOf(t.getId()));
                        this.f148713h = C89070n.m154585g((Collection) C89070n.m154554a((Collection) this.f148713h, (Object) t));
                        arrayList.add(C66293f.C66294a.m117961a((C66504c) t, (String) null, false));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11857);
                throw th;
            }
        }
        if (z2) {
            this.f148724s++;
        }
        arrayList.add(new C66293f(0, String.valueOf(this.f148724s)));
        if (arrayList.size() > 1) {
            arrayList.add(new C66293f(6, "void"));
        }
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C66052g(this, arrayList, null), 3);
        MethodCollector.m26664o(11857);
    }

    /* renamed from: a */
    public final void mo105102a(String str, String str2, String str3, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!this.f148721p.get()) {
            this.f148721p.set(true);
            this.f148719n.mo142945a(QnaApiV2.C66002a.m117822a().getQuestionsTabData(C89361p.m154865g(str), this.f148717l, this.f148718m, str2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66050e(this, z, str3, z2), new C66051f(this, z, str3, z2)));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m117862a(C66045h hVar, List list, String str, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        hVar.mo105104a(list, str, z, z2);
    }
}
