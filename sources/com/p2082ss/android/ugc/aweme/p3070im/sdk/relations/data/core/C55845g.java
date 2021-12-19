package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMServiceProvider;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55278b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55789b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55747a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55759c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55777g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55780h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b.C55798c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55731b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74712f;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g */
public class C55845g extends AbstractC55858h {

    /* renamed from: j */
    public static final C55846a f127297j = new C55846a((byte) 0);

    /* renamed from: e */
    final C55759c f127298e;

    /* renamed from: f */
    public List<String> f127299f;

    /* renamed from: g */
    final C55789b f127300g;

    /* renamed from: h */
    final C55789b f127301h;

    /* renamed from: i */
    final C55759c f127302i;

    /* renamed from: m */
    private final AbstractC89244h f127303m = C89250i.m154773a((AbstractC89171a) C55852g.f127320a);

    /* renamed from: n */
    private final AbstractC89244h f127304n = C89250i.m154773a((AbstractC89171a) C55853h.f127321a);

    /* renamed from: o */
    private final String f127305o;

    /* renamed from: p */
    private final C55731b f127306p;

    /* renamed from: q */
    private final String f127307q;

    /* renamed from: r */
    private List<IMContact> f127308r;

    /* renamed from: s */
    private List<IMContact> f127309s;

    /* renamed from: t */
    private final C55759c f127310t;

    /* renamed from: u */
    private final AbstractC89244h f127311u;

    /* renamed from: v */
    private final C55777g<IMContact> f127312v;

    /* renamed from: w */
    private C55747a<IMContact> f127313w;

    static {
        Covode.recordClassIndex(65635);
    }

    /* renamed from: i */
    public final List<Integer> mo92667i() {
        return (List) this.f127303m.getValue();
    }

    /* renamed from: j */
    public final List<String> mo92707j() {
        return (List) this.f127304n.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C55780h mo92708k() {
        return (C55780h) this.f127311u.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$a */
    public static final class C55846a {
        static {
            Covode.recordClassIndex(65636);
        }

        private C55846a() {
        }

        public /* synthetic */ C55846a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: a */
    public final C55759c mo92614a() {
        return this.f127310t;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: b */
    public final C55759c mo92616b() {
        return this.f127302i;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$b */
    static final class C55847b extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C55845g f127314a;

        static {
            Covode.recordClassIndex(65637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55847b(C55845g gVar) {
            super(0);
            this.f127314a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.f127314a.f127128c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$c */
    static final class C55848c extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C55845g f127315a;

        static {
            Covode.recordClassIndex(65638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55848c(C55845g gVar) {
            super(0);
            this.f127315a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.f127315a.f127299f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$d */
    static final class C55849d extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C55845g f127316a;

        static {
            Covode.recordClassIndex(65639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55849d(C55845g gVar) {
            super(0);
            this.f127316a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<String> invoke() {
            return this.f127316a.f127128c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$g */
    static final class C55852g extends AbstractC89220m implements AbstractC89171a<List<Integer>> {

        /* renamed from: a */
        public static final C55852g f127320a = new C55852g();

        static {
            Covode.recordClassIndex(65642);
        }

        C55852g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<Integer> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$h */
    static final class C55853h extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        public static final C55853h f127321a = new C55853h();

        static {
            Covode.recordClassIndex(65643);
        }

        C55853h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$i */
    static final class C55854i extends AbstractC89220m implements AbstractC89171a<C55780h> {

        /* renamed from: a */
        public static final C55854i f127322a = new C55854i();

        static {
            Covode.recordClassIndex(65644);
        }

        C55854i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55780h invoke() {
            return new C55780h.C55781a().f127204a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$e */
    static final class C55850e extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C55845g f127317a;

        /* renamed from: b */
        final /* synthetic */ C55732c f127318b;

        static {
            Covode.recordClassIndex(65640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55850e(C55845g gVar, C55732c cVar) {
            super(0);
            this.f127317a = gVar;
            this.f127318b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<String> invoke() {
            if (this.f127318b.f127119j) {
                return this.f127317a.f127299f;
            }
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: g */
    public final C89391z mo92621g() {
        mo92707j().clear();
        mo92667i().clear();
        return super.mo92621g();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: c */
    public final /* synthetic */ AbstractC55765e mo92617c() {
        C55747a<R> aVar = (C55747a<R>) this.f127313w;
        if (aVar == null) {
            aVar = new C55747a.C55748a().mo92629a(this.f127312v).mo92630a(new C55855j(this)).mo92631b(new C55856k(this)).mo92628a(this).f127157a;
            this.f127313w = aVar;
            if (aVar == null) {
                C89219l.m154715b();
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo92709l() {
        if (!C74712f.f167936a || !C89219l.m154714a((Object) this.f127129d.f127110a, (Object) true) || !C89219l.m154714a((Object) this.f127129d.f127111b, (Object) "aweme")) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$f */
    static final class C55851f extends AbstractC89220m implements AbstractC89172b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C55732c f127319a;

        static {
            Covode.recordClassIndex(65641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55851f(C55732c cVar) {
            super(1);
            this.f127319a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(IMContact iMContact) {
            IMContact iMContact2 = iMContact;
            C89219l.m154721d(iMContact2, "");
            return Boolean.valueOf(C55798c.C55799a.m101582a(this.f127319a).mo92659a(iMContact2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$l */
    static final class C55857l extends AbstractC89220m implements AbstractC89172b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C55732c f127323a;

        static {
            Covode.recordClassIndex(65647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55857l(C55732c cVar) {
            super(1);
            this.f127323a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(IMContact iMContact) {
            IMContact iMContact2 = iMContact;
            C89219l.m154721d(iMContact2, "");
            return Boolean.valueOf(C55798c.C55799a.m101582a(this.f127323a).mo92659a(iMContact2));
        }
    }

    /* renamed from: b */
    static void m101618b(C55747a.C55750c<IMContact> cVar) {
        for (R r : cVar.f127159b) {
            r.setType(16);
        }
        cVar.f127158a.put(cVar.f127160c, cVar.f127159b);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$k */
    static final /* synthetic */ class C55856k extends C89217j implements AbstractC89172b<List<IMContact>, List<IMContact>> {
        static {
            Covode.recordClassIndex(65646);
        }

        C55856k(C55845g gVar) {
            super(1, gVar, C55845g.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<IMContact> invoke(List<IMContact> list) {
            List<IMContact> list2 = list;
            C89219l.m154721d(list2, "");
            C56244a.m102191c("SortWeightRelationModel", "interceptFinish, before list size: " + list2.size());
            if (((C55845g) this.receiver).mo92709l()) {
                list2 = C55807a.m101588a(C55845g.m101617b(list2));
            }
            C56244a.m102191c("SortWeightRelationModel", "interceptFinish, after list size: " + list2.size());
            return list2;
        }
    }

    /* renamed from: c */
    static List<IMContact> m101619c(List<IMContact> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IMContact iMContact = list.get(i2);
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser.getFollowStatus() == 2) {
                IMUser clone = iMUser.clone();
                if (arrayList.isEmpty()) {
                    C89219l.m154716b(clone, "");
                    clone.setType(5);
                } else {
                    C89219l.m154716b(clone, "");
                    clone.setType(6);
                }
                arrayList.add(clone);
            }
            if (i2 == 0) {
                i = 3;
            } else {
                i = 0;
            }
            iMUser.setType(i);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo92705a(C55747a.C55750c<IMContact> cVar) {
        int size = cVar.f127159b.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                cVar.f127159b.get(i).setType(2);
            } else {
                cVar.f127159b.get(i).setType(1);
                if (i >= 5) {
                }
            }
            cVar.f127159b.get(i).setIsRecentTop5Contact(1);
        }
        LinkedHashMap<AbstractC55765e<R>, List<R>> linkedHashMap = cVar.f127158a;
        AbstractC55765e<R> eVar = cVar.f127160c;
        int size2 = cVar.f127159b.size();
        List<R> list = cVar.f127159b;
        if (size2 > 15) {
            list = list.subList(0, 15);
        }
        linkedHashMap.put(eVar, list);
        C55807a.m101589a();
        this.f127308r.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo92706d(List<IMContact> list) {
        int size = list.size();
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            IMContact iMContact = list.get(i2);
            Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            String initialLetter = ((IMUser) iMContact).getInitialLetter();
            if (!TextUtils.isEmpty(initialLetter)) {
                if (str == null || TextUtils.equals(initialLetter, str)) {
                    i++;
                } else {
                    mo92707j().add(str);
                    mo92667i().add(Integer.valueOf(i));
                    i = 1;
                }
                if (i2 == list.size() - 1) {
                    List<String> j = mo92707j();
                    C89219l.m154716b(initialLetter, "");
                    j.add(initialLetter);
                    mo92667i().add(Integer.valueOf(i));
                }
                str = initialLetter;
            }
        }
    }

    /* renamed from: b */
    static List<IMContact> m101617b(List<IMContact> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (true ^ (t instanceof C74721a)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : list) {
            if (t2 instanceof C74721a) {
                arrayList3.add(t2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            return list;
        }
        ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            IMContact iMContact = (IMContact) listIterator.previous();
            if (iMContact.getType() == 6 || iMContact.getType() == 5 || iMContact.getType() == 1 || iMContact.getType() == 2) {
                z = true;
            } else {
                z = false;
            }
            if ((iMContact instanceof IMUser) && z) {
                int nextIndex = listIterator.nextIndex();
                if (nextIndex != -1) {
                    int size = arrayList2.size();
                    int i = nextIndex + 1;
                    if (i < 0 || size <= i) {
                        return list;
                    }
                    List<IMContact> g = C89070n.m154585g((Collection) arrayList2);
                    g.addAll(i, arrayList4);
                    return g;
                }
            }
        }
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.g$j */
    static final /* synthetic */ class C55855j extends C89217j implements AbstractC89172b<C55747a.C55750c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(65645);
        }

        C55855j(C55845g gVar) {
            super(1, gVar, C55845g.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C55747a.C55750c<IMContact> cVar) {
            C55747a.C55750c<IMContact> cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C55845g gVar = (C55845g) this.receiver;
            boolean z = true;
            if ((!C89219l.m154714a(cVar2.f127160c, gVar.f127300g)) && (!C89219l.m154714a(cVar2.f127160c, gVar.f127301h))) {
                List<R> list = cVar2.f127159b;
                ArrayList arrayList = new ArrayList(C89070n.m154526a(list, 10));
                for (T t : list) {
                    if (!(t instanceof C74721a) && (t instanceof IMUser)) {
                        T t2 = t;
                        C55278b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
                        String uid = t2.getUid();
                        C89219l.m154716b(uid, "");
                        t2.setRecType(familiarService.mo92287a(uid, t2.getSecUid(), t2));
                    }
                    arrayList.add(C89391z.f203057a);
                }
            }
            if (cVar2.f127160c == gVar.f127127b) {
                gVar.mo92705a(cVar2);
            } else if (C89219l.m154714a(cVar2.f127160c, gVar.mo92708k())) {
                C55845g.m101618b(cVar2);
            } else {
                if (gVar.f127129d.mo92610b()) {
                    List<R> list2 = cVar2.f127158a.get(gVar.f127127b);
                    if (list2 != null && !list2.isEmpty()) {
                        gVar.mo92707j().add("recent");
                        gVar.mo92667i().add(Integer.valueOf(list2.size()));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<IMContact> c = C55845g.m101619c(cVar2.f127159b);
                    if (!c.isEmpty()) {
                        if (gVar.f127129d.f127122m) {
                            gVar.mo92706d(c);
                        } else {
                            gVar.mo92707j().add("Friend");
                            gVar.mo92667i().add(Integer.valueOf(c.size()));
                        }
                        arrayList2.addAll(c);
                    }
                    if (!gVar.f127129d.f127122m && (!cVar2.f127159b.isEmpty())) {
                        gVar.mo92706d(cVar2.f127159b);
                        arrayList2.addAll(cVar2.f127159b);
                    }
                    cVar2.f127158a.put(cVar2.f127160c, arrayList2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    List<IMContact> c2 = C55845g.m101619c(cVar2.f127159b);
                    if (!c2.isEmpty()) {
                        gVar.mo92707j().add("Friend");
                        gVar.mo92667i().add(Integer.valueOf(c2.size()));
                        arrayList3.addAll(c2);
                    }
                    if (!gVar.f127129d.f127122m && (!cVar2.f127159b.isEmpty())) {
                        gVar.mo92706d(cVar2.f127159b);
                        arrayList3.addAll(cVar2.f127159b);
                    }
                    cVar2.f127158a.put(cVar2.f127160c, arrayList3);
                }
                if (C89219l.m154714a(cVar2.f127160c, gVar.f127302i) || C89219l.m154714a(cVar2.f127160c, gVar.f127298e)) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55845g(C55732c cVar) {
        super(cVar);
        String f;
        C89219l.m154721d(cVar, "");
        if (cVar.f127122m) {
            f = C55273c.m101053c();
        } else {
            f = C55273c.m101059f();
        }
        this.f127305o = f;
        C55759c.C55760a a = new C55759c.C55760a().mo92637a(true);
        C89219l.m154716b(f, "");
        C55759c cVar2 = (C55759c) a.mo92636a(f).mo92647a(-1).mo92649b(new C55857l(cVar)).mo92639b();
        this.f127298e = cVar2;
        this.f127306p = C55731b.f127107c;
        String d = C55273c.m101056d();
        this.f127307q = d;
        this.f127299f = new ArrayList();
        this.f127308r = new ArrayList();
        this.f127309s = new ArrayList();
        C55789b.C55790a a2 = new C55789b.C55790a().mo92654a(new C55847b(this)).mo92656a(C55731b.f127106b);
        String d2 = C55273c.m101056d();
        C89219l.m154716b(d2, "");
        this.f127300g = (C55789b) a2.mo92655a(d2).mo92647a(-1).mo92639b();
        C55789b.C55790a aVar = new C55789b.C55790a();
        String e = C55273c.m101058e();
        C89219l.m154716b(e, "");
        this.f127301h = (C55789b) aVar.mo92655a(e).mo92654a(new C55849d(this)).mo92656a(C55731b.f127106b).mo92647a(-1).mo92639b();
        C55759c.C55760a aVar2 = new C55759c.C55760a();
        C89219l.m154716b(d, "");
        this.f127310t = (C55759c) aVar2.mo92636a(d).mo92637a(false).mo92635a(new C55848c(this)).mo92647a(-1).mo92639b();
        C55759c.C55760a aVar3 = new C55759c.C55760a();
        String f2 = C55273c.m101059f();
        C89219l.m154716b(f2, "");
        this.f127302i = (C55759c) aVar3.mo92636a(f2).mo92637a(false).mo92635a(new C55850e(this, cVar)).mo92649b(new C55851f(cVar)).mo92647a(-1).mo92639b();
        this.f127311u = C89250i.m154773a((AbstractC89171a) C55854i.f127322a);
        C55777g a3 = C55777g.C55778a.m101559a();
        if (cVar.mo92610b() && a3 != null) {
            a3.mo92650a(this.f127127b);
        }
        if (mo92709l() && a3 != null) {
            a3.mo92650a(mo92708k());
        }
        this.f127312v = a3.mo92650a(cVar2);
    }
}
