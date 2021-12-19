package com.p2082ss.android.ugc.aweme.qna.p3646d;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qna.api.C66004a;
import com.p2082ss.android.ugc.aweme.qna.api.C66010g;
import com.p2082ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.p2082ss.android.ugc.aweme.qna.fragment.EnumC66276w;
import com.p2082ss.android.ugc.aweme.qna.model.C66291d;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66060a;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66278b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qna.d.c */
public final class C66035c implements AbstractC66053i {

    /* renamed from: a */
    public LiveData<C66278b<List<C66293f>>> f148682a;

    /* renamed from: b */
    public final C1213t<C66278b<EnumC66276w>> f148683b = new C1213t<>();

    /* renamed from: c */
    public List<C66004a> f148684c = new ArrayList();

    /* renamed from: d */
    public Map<String, String> f148685d = new HashMap();

    /* renamed from: e */
    public Set<String> f148686e = new HashSet();

    /* renamed from: f */
    public C66054j f148687f = new C66054j();

    /* renamed from: g */
    public int f148688g;

    /* renamed from: h */
    public final C88411a f148689h = new C88411a();

    /* renamed from: i */
    public AtomicBoolean f148690i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f148691j = new AtomicBoolean(true);

    /* renamed from: k */
    private C1213t<C66278b<List<C66293f>>> f148692k;

    /* renamed from: l */
    private final int f148693l = C66060a.m117870a();

    /* renamed from: m */
    private final Object f148694m = new Object();

    /* renamed from: n */
    private long f148695n;

    static {
        Covode.recordClassIndex(77541);
    }

    /* renamed from: a */
    public final void mo105094a() {
        mo105098a(C89086z.INSTANCE, false, null);
    }

    public C66035c() {
        C1213t<C66278b<List<C66293f>>> tVar = new C1213t<>();
        this.f148692k = tVar;
        this.f148682a = tVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.c$b */
    static final class C66037b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66035c f148699a;

        static {
            Covode.recordClassIndex(77543);
        }

        C66037b(C66035c cVar) {
            this.f148699a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f148699a.mo105094a();
            this.f148699a.f148683b.setValue(new C66278b<>(EnumC66276w.FAILURE));
            this.f148699a.f148690i.set(false);
        }
    }

    /* renamed from: a */
    private static String m117850a(C66004a aVar) {
        String str = "";
        C89219l.m154721d(aVar, str);
        Iterator it = C89070n.m154553a((Iterable) aVar.f148589e, (Comparator) new C66038c()).iterator();
        while (it.hasNext()) {
            str = str + ((Aweme) it.next()).getAid();
        }
        String.valueOf(aVar.f148585a);
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.c$a */
    static final class C66036a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C66035c f148696a;

        /* renamed from: b */
        final /* synthetic */ boolean f148697b;

        /* renamed from: c */
        final /* synthetic */ String f148698c;

        static {
            Covode.recordClassIndex(77542);
        }

        C66036a(C66035c cVar, boolean z, String str) {
            this.f148696a = cVar;
            this.f148697b = z;
            this.f148698c = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            EnumC66276w wVar;
            C66010g gVar = (C66010g) obj;
            this.f148696a.f148688g = gVar.f148609d;
            C66035c cVar = this.f148696a;
            List<C66004a> list = gVar.f148608c;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            cVar.mo105098a(list, this.f148697b, this.f148698c);
            this.f148696a.f148691j.set(gVar.f148610e);
            C1213t<C66278b<EnumC66276w>> tVar = this.f148696a.f148683b;
            List<C66004a> list2 = this.f148696a.f148684c;
            C89219l.m154721d(list2, "");
            if (gVar.f148606a != 0) {
                wVar = EnumC66276w.FAILURE;
            } else if (!list2.isEmpty()) {
                wVar = EnumC66276w.SUCCESS;
            } else {
                wVar = EnumC66276w.SUCCESS_EMPTY;
            }
            tVar.setValue(new C66278b<>(wVar));
            this.f148696a.f148690i.set(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66053i
    /* renamed from: a */
    public final void mo105095a(C66059m mVar) {
        String str;
        MethodCollector.m26663i(12293);
        C89219l.m154721d(mVar, "");
        if (!mVar.f148759a || (str = mVar.f148762d) == null) {
            MethodCollector.m26664o(12293);
            return;
        }
        synchronized (this.f148694m) {
            try {
                this.f148685d.put(mVar.f148760b, str);
                this.f148686e.remove(mVar.f148760b);
            } catch (Throwable th) {
                MethodCollector.m26664o(12293);
                throw th;
            }
        }
        mo105098a(C89086z.INSTANCE, false, null);
        MethodCollector.m26664o(12293);
    }

    /* renamed from: a */
    public final void mo105096a(String str) {
        EnumC66276w wVar;
        MethodCollector.m26663i(12007);
        C89219l.m154721d(str, "");
        synchronized (this.f148694m) {
            try {
                Long l = null;
                for (T t : this.f148684c) {
                    Iterator<T> it = t.f148589e.iterator();
                    while (it.hasNext()) {
                        String aid = it.next().getAid();
                        if (C89219l.m154714a((Object) (aid != null ? aid.toString() : null), (Object) str)) {
                            l = Long.valueOf(t.f148585a);
                        }
                    }
                }
                List<C66004a> list = this.f148684c;
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    long j = t2.f148585a;
                    if (l != null) {
                        if (j != l.longValue()) {
                        }
                    }
                    arrayList.add(t2);
                }
                this.f148684c = C89070n.m154585g((Collection) arrayList);
            } catch (Throwable th) {
                MethodCollector.m26664o(12007);
                throw th;
            }
        }
        mo105094a();
        if (!this.f148684c.isEmpty()) {
            wVar = EnumC66276w.SUCCESS;
        } else {
            wVar = EnumC66276w.SUCCESS_EMPTY;
        }
        this.f148683b.setValue(new C66278b<>(wVar));
        MethodCollector.m26664o(12007);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.d.c$c */
    public static final class C66038c<T> implements Comparator {
        static {
            Covode.recordClassIndex(77544);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(t.getAid(), t2.getAid());
        }
    }

    /* renamed from: a */
    public final void mo105098a(List<C66004a> list, boolean z, String str) {
        MethodCollector.m26663i(12146);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C66291d("privacyBanner", str));
        }
        synchronized (this.f148694m) {
            try {
                List<C66004a> list2 = this.f148684c;
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    String str2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    boolean contains = this.f148686e.contains(String.valueOf(next.f148585a));
                    if (this.f148685d.keySet().contains(String.valueOf(next.f148585a))) {
                        str2 = this.f148685d.get(String.valueOf(next.f148585a));
                    }
                    arrayList2.add(C66293f.C66294a.m117960a((C66004a) next, str2, contains));
                }
                arrayList.addAll(C89070n.m154585g((Collection) arrayList2));
                List<C66004a> list3 = this.f148684c;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(m117850a((C66004a) it2.next()));
                }
                Set o = C89070n.m154595o(arrayList3);
                for (T t : list) {
                    String a = m117850a((C66004a) t);
                    if (!o.contains(a)) {
                        o.add(a);
                        this.f148684c = C89070n.m154554a((Collection) this.f148684c, (Object) t);
                        arrayList.add(C66293f.C66294a.m117960a((C66004a) t, (String) null, false));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(12146);
                throw th;
            }
        }
        long j = this.f148695n + 1;
        this.f148695n = j;
        arrayList.add(new C66293f(0, String.valueOf(j)));
        if (arrayList.size() > 1) {
            arrayList.add(new C66293f(6, "void"));
        }
        this.f148692k.postValue(new C66278b<>(arrayList));
        MethodCollector.m26664o(12146);
    }

    /* renamed from: a */
    public final void mo105097a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!this.f148690i.get()) {
            this.f148690i.set(true);
            this.f148689h.mo142945a(QnaApiV2.C66002a.m117822a().getAnswersTabData(C89361p.m154865g(str), this.f148693l, this.f148688g, str2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C66036a(this, z, str3), new C66037b(this)));
        }
    }
}
