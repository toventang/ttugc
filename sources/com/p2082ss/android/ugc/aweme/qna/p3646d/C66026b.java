package com.p2082ss.android.ugc.aweme.qna.p3646d;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.qna.api.C66007d;
import com.p2082ss.android.ugc.aweme.qna.api.C66008e;
import com.p2082ss.android.ugc.aweme.qna.api.C66014k;
import com.p2082ss.android.ugc.aweme.qna.api.EnumC66005b;
import com.p2082ss.android.ugc.aweme.qna.api.EnumC66009f;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66288a;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import com.p2082ss.android.ugc.aweme.qna.model.C66297i;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66060a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66339o;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.qna.d.b */
public final class C66026b {

    /* renamed from: o */
    public static final C66027a f148642o = new C66027a((byte) 0);

    /* renamed from: a */
    public List<C66504c> f148643a = new ArrayList();

    /* renamed from: b */
    public List<C66504c> f148644b = new ArrayList();

    /* renamed from: c */
    public int f148645c;

    /* renamed from: d */
    public int f148646d;

    /* renamed from: e */
    public boolean f148647e = true;

    /* renamed from: f */
    public Integer f148648f;

    /* renamed from: g */
    public Object f148649g = new Object();

    /* renamed from: h */
    public final C88411a f148650h = new C88411a();

    /* renamed from: i */
    public final C1213t<C66278b<List<C66293f>>> f148651i = new C1213t<>();

    /* renamed from: j */
    public C1213t<C66278b<C66288a>> f148652j = new C1213t<>();

    /* renamed from: k */
    public final C1213t<C66278b<EnumC66276w>> f148653k = new C1213t<>();

    /* renamed from: l */
    public final C1213t<C66278b<String>> f148654l = new C1213t<>();

    /* renamed from: m */
    public final LiveData<C66278b<C66297i>> f148655m;

    /* renamed from: n */
    public AtomicBoolean f148656n;

    /* renamed from: p */
    private final int f148657p = C66060a.m117870a();

    /* renamed from: q */
    private final C1213t<C66278b<C66297i>> f148658q;

    /* renamed from: r */
    private AtomicBoolean f148659r;

    /* renamed from: s */
    private AtomicBoolean f148660s;

    /* renamed from: t */
    private AtomicBoolean f148661t;

    /* renamed from: u */
    private int f148662u;

    /* renamed from: v */
    private int f148663v;

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$c */
    static final class C66029c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66029c f148666a = new C66029c();

        static {
            Covode.recordClassIndex(77535);
        }

        C66029c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(77532);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$a */
    public static final class C66027a {
        static {
            Covode.recordClassIndex(77533);
        }

        private C66027a() {
        }

        public /* synthetic */ C66027a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo105090a(List<C66504c> list, int i) {
        List<C66504c> list2 = this.f148643a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Long id = it.next().getId();
            if (id != null) {
                arrayList.add(id);
            }
        }
        Set l = C89070n.m154592l(arrayList);
        List<C66504c> list3 = this.f148644b;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Long id2 = it2.next().getId();
            if (id2 != null) {
                arrayList2.add(id2);
            }
        }
        Set l2 = C89070n.m154592l(arrayList2);
        for (T t : list) {
            Long id3 = t.getId();
            if (id3 != null) {
                long longValue = id3.longValue();
                if (i == EnumC66009f.RECOMMEND.getValue() && !l2.contains(Long.valueOf(longValue))) {
                    this.f148644b.add(t);
                } else if (i == EnumC66009f.INVITATION.getValue() && !l.contains(Long.valueOf(longValue))) {
                    this.f148643a.add(t);
                }
            }
        }
    }

    /* renamed from: c */
    private final int m117836c() {
        if (this.f148647e) {
            return 3;
        }
        return 6;
    }

    /* renamed from: a */
    public final void mo105083a() {
        if (!this.f148659r.getAndSet(true)) {
            this.f148662u++;
            if (!this.f148647e) {
                mo105085a((Boolean) true);
            }
            String b = C80342dg.m139300a().mo46674b(C89070n.m154516a(mo105082a(this.f148645c)));
            C89219l.m154716b(b, "");
            mo105088a(b, C89070n.m154516a(EnumC66009f.INVITATION), false);
        }
    }

    /* renamed from: b */
    public final void mo105092b() {
        if (!this.f148660s.getAndSet(true)) {
            String b = C80342dg.m139300a().mo46674b(C89070n.m154516a(mo105091b(this.f148646d)));
            C89219l.m154716b(b, "");
            mo105088a(b, C89070n.m154516a(EnumC66009f.RECOMMEND), null);
        }
    }

    public C66026b() {
        C1213t<C66278b<C66297i>> tVar = new C1213t<>();
        this.f148658q = tVar;
        this.f148655m = tVar;
        this.f148659r = new AtomicBoolean(false);
        this.f148660s = new AtomicBoolean(false);
        this.f148661t = new AtomicBoolean(false);
        this.f148656n = new AtomicBoolean(true);
    }

    /* renamed from: d */
    private final List<C66293f> m117837d() {
        ArrayList arrayList = new ArrayList();
        List<C66504c> list = this.f148643a;
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C66293f.C66294a.m117962a((C66504c) it.next(), true));
        }
        List<C66296h> g = C89070n.m154585g((Collection) arrayList2);
        List<C66504c> list2 = this.f148644b;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C66293f.C66294a.m117962a((C66504c) it2.next(), false));
        }
        List g2 = C89070n.m154585g((Collection) arrayList3);
        if (!g.isEmpty()) {
            arrayList.add(new C66296h(1, "invitesTitle", null, null, null, null, null, null, C17867d.m33078a().getString(R.string.f3o), null, false, null, 16124));
            for (C66296h hVar : g) {
                hVar.f149063l = false;
                hVar.f149064m = false;
            }
            C89070n.m154535a((Collection) arrayList, (Iterable) g);
            if (g2.isEmpty()) {
                int i = this.f148662u + 1;
                this.f148662u = i;
                return C89070n.m154554a((Collection) arrayList, (Object) new C66293f(0, String.valueOf(i)));
            } else if (this.f148661t.get()) {
                ((C66296h) arrayList.get(arrayList.size() - 1)).f149063l = false;
                ((C66296h) arrayList.get(arrayList.size() - 1)).f149064m = true;
            } else {
                ((C66296h) arrayList.get(arrayList.size() - 1)).f149063l = this.f148656n.get();
            }
        }
        if (!(!g2.isEmpty())) {
            return arrayList;
        }
        arrayList.add(new C66296h(1, "suggestedTitle", null, null, null, null, null, null, C17867d.m33078a().getString(R.string.f3p), null, false, null, 16124));
        C89070n.m154535a((Collection) arrayList, (Iterable) g2);
        int i2 = this.f148663v + 1;
        this.f148663v = i2;
        return C89070n.m154554a((Collection) arrayList, (Object) new C66293f(0, String.valueOf(i2)));
    }

    /* renamed from: a */
    public final void mo105084a(EnumC66276w wVar) {
        this.f148653k.postValue(new C66278b<>(wVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$e */
    public static final class C66031e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66026b f148670a;

        /* renamed from: b */
        final /* synthetic */ Boolean f148671b;

        /* renamed from: c */
        final /* synthetic */ List f148672c;

        static {
            Covode.recordClassIndex(77537);
        }

        C66031e(C66026b bVar, Boolean bool, List list) {
            this.f148670a = bVar;
            this.f148671b = bool;
            this.f148672c = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148670a.mo105085a(this.f148671b);
            this.f148670a.mo105084a(EnumC66276w.FAILURE);
            this.f148670a.mo105089a(this.f148672c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$f */
    public static final class C66032f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66026b f148673a;

        /* renamed from: b */
        final /* synthetic */ String f148674b;

        /* renamed from: c */
        final /* synthetic */ int f148675c;

        static {
            Covode.recordClassIndex(77538);
        }

        public C66032f(C66026b bVar, String str, int i) {
            this.f148673a = bVar;
            this.f148674b = str;
            this.f148675c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148673a.f148652j.postValue(new C66278b<>(new C66288a(this.f148674b, true, this.f148675c)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$g */
    public static final class C66033g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66026b f148676a;

        /* renamed from: b */
        final /* synthetic */ String f148677b;

        /* renamed from: c */
        final /* synthetic */ int f148678c;

        static {
            Covode.recordClassIndex(77539);
        }

        public C66033g(C66026b bVar, String str, int i) {
            this.f148676a = bVar;
            this.f148677b = str;
            this.f148678c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148676a.f148652j.postValue(new C66278b<>(new C66288a(this.f148677b, false, -1)));
            this.f148676a.mo105087a(this.f148677b, this.f148678c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$h */
    public static final class C66034h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f148679a;

        /* renamed from: b */
        final /* synthetic */ C66026b f148680b;

        /* renamed from: c */
        final /* synthetic */ List f148681c;

        static {
            Covode.recordClassIndex(77540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66034h(C66026b bVar, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f148680b = bVar;
            this.f148681c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C66034h(this.f148680b, this.f148681c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C66034h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f148679a == 0) {
                C89382r.m154942a(obj);
                this.f148680b.f148651i.setValue(new C66278b<>(this.f148681c));
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final C66008e mo105082a(int i) {
        return new C66008e(i, m117836c(), EnumC66009f.INVITATION.getValue(), EnumC66005b.SUGGEST.getValue());
    }

    /* renamed from: b */
    public final C66008e mo105091b(int i) {
        return new C66008e(i, this.f148657p, EnumC66009f.RECOMMEND.getValue(), EnumC66005b.SUGGEST.getValue());
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$b */
    static final class C66028b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66026b f148664a;

        /* renamed from: b */
        final /* synthetic */ String f148665b;

        static {
            Covode.recordClassIndex(77534);
        }

        C66028b(C66026b bVar, String str) {
            this.f148664a = bVar;
            this.f148665b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.m26663i(11533);
            synchronized (this.f148664a.f148649g) {
                try {
                    C66026b bVar = this.f148664a;
                    List<C66504c> list = bVar.f148643a;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (!C89219l.m154714a((Object) String.valueOf(t.getId()), (Object) this.f148665b)) {
                            arrayList.add(t);
                        }
                    }
                    bVar.f148643a = C89070n.m154585g((Collection) arrayList);
                } catch (Throwable th) {
                    MethodCollector.m26664o(11533);
                    throw th;
                }
            }
            this.f148664a.mo105085a((C66026b) null);
            C66026b bVar2 = this.f148664a;
            bVar2.mo105084a(C66339o.m117990a((C66014k) null, C89070n.m154572d((Collection) bVar2.f148643a, (Iterable) this.f148664a.f148644b)));
            MethodCollector.m26664o(11533);
        }
    }

    /* renamed from: a */
    public final void mo105085a(Boolean bool) {
        MethodCollector.m26663i(12418);
        synchronized (this.f148649g) {
            try {
                mo105090a(C89086z.INSTANCE, -1);
                mo105093b(bool);
            } finally {
                MethodCollector.m26664o(12418);
            }
        }
    }

    /* renamed from: b */
    public final void mo105093b(Boolean bool) {
        if (bool != null) {
            this.f148661t.set(bool.booleanValue());
        }
        ArrayList arrayList = new ArrayList();
        C89070n.m154535a((Collection) arrayList, (Iterable) m117837d());
        if (arrayList.size() > 1) {
            arrayList.add(new C66293f(6, "void"));
        }
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C66034h(this, arrayList, null), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.d.b$d */
    public static final class C66030d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66026b f148667a;

        /* renamed from: b */
        final /* synthetic */ Boolean f148668b;

        /* renamed from: c */
        final /* synthetic */ List f148669c;

        static {
            Covode.recordClassIndex(77536);
        }

        C66030d(C66026b bVar, Boolean bool, List list) {
            this.f148667a = bVar;
            this.f148668b = bool;
            this.f148669c = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            MethodCollector.m26663i(11689);
            C66014k kVar = (C66014k) obj;
            synchronized (this.f148667a.f148649g) {
                try {
                    List<C66007d> list = kVar.f148630c;
                    if (list != null) {
                        for (T t : list) {
                            if (t.f148595a == EnumC66009f.RECOMMEND.getValue()) {
                                this.f148667a.f148646d = t.f148597c;
                            }
                            if (t.f148595a == EnumC66009f.INVITATION.getValue()) {
                                this.f148667a.f148645c = t.f148597c;
                                this.f148667a.f148647e = false;
                                if (t.f148598d == 0) {
                                    this.f148667a.f148656n.set(false);
                                }
                                Integer num = t.f148599e;
                                if (num != null) {
                                    int intValue = num.intValue();
                                    this.f148667a.f148648f = Integer.valueOf(intValue);
                                }
                            }
                            C66026b bVar = this.f148667a;
                            List<C66504c> list2 = t.f148596b;
                            if (list2 == null) {
                                list2 = C89086z.INSTANCE;
                            }
                            bVar.mo105090a(list2, t.f148595a);
                        }
                    }
                    this.f148667a.mo105093b(this.f148668b);
                } catch (Throwable th) {
                    MethodCollector.m26664o(11689);
                    throw th;
                }
            }
            C66026b bVar2 = this.f148667a;
            bVar2.mo105084a(C66339o.m117990a(kVar, C89070n.m154572d((Collection) bVar2.f148643a, (Iterable) this.f148667a.f148644b)));
            this.f148667a.mo105089a(this.f148669c);
            MethodCollector.m26664o(11689);
        }
    }

    /* renamed from: a */
    public final void mo105086a(String str) {
        C89219l.m154721d(str, "");
        Keva repo = Keva.getRepo("qna_suggested_repo", 0);
        C89219l.m154716b(repo, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (repo.getBoolean("first_time_delete_invite".concat(String.valueOf(curUserId)), true)) {
            this.f148654l.postValue(new C66278b<>(str));
            repo.storeBoolean("first_time_delete_invite".concat(String.valueOf(curUserId)), false);
            return;
        }
        this.f148650h.mo142945a(QnaApiV2.C66002a.m117822a().deleteInviteQuestion(Long.parseLong(str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66028b(this, str), C66029c.f148666a));
    }

    /* renamed from: a */
    public final void mo105089a(List<? extends EnumC66009f> list) {
        for (T t : list) {
            if (t == EnumC66009f.RECOMMEND) {
                this.f148660s.set(false);
            }
            if (t == EnumC66009f.INVITATION) {
                this.f148659r.set(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo105087a(String str, int i) {
        C89219l.m154721d(str, "");
        for (T t : this.f148643a) {
            if (C89219l.m154714a((Object) String.valueOf(t.getId()), (Object) str)) {
                t.setCollectStatus(Integer.valueOf(i));
            }
        }
        for (T t2 : this.f148644b) {
            if (C89219l.m154714a((Object) String.valueOf(t2.getId()), (Object) str)) {
                t2.setCollectStatus(Integer.valueOf(i));
            }
        }
        mo105085a((Boolean) null);
    }

    /* renamed from: a */
    public final void mo105088a(String str, List<? extends EnumC66009f> list, Boolean bool) {
        this.f148650h.mo142945a(QnaApiV2.C66002a.m117822a().getSuggestedTabData(null, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C66030d(this, bool, list), new C66031e(this, bool, list)));
    }
}
