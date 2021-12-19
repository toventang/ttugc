package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h */
public abstract class AbstractC55858h extends AbstractC55736a {

    /* renamed from: e */
    private String f127324e;

    /* renamed from: f */
    private boolean f127325f;

    /* renamed from: g */
    private final AbstractC89244h f127326g = C89250i.m154773a((AbstractC89171a) C55859a.f127329a);

    /* renamed from: k */
    public AbstractC55815d f127327k;

    /* renamed from: l */
    public final boolean f127328l;

    static {
        Covode.recordClassIndex(65648);
    }

    /* renamed from: i */
    private final C88411a mo92667i() {
        return (C88411a) this.f127326g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$a */
    static final class C55859a extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C55859a f127329a = new C55859a();

        static {
            Covode.recordClassIndex(65649);
        }

        C55859a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: m */
    public final void mo92712m() {
        this.f127327k = null;
        mo92667i().mo142944a();
    }

    /* renamed from: j */
    private final void mo92707j() {
        String str = this.f127324e;
        if (str != null && str.length() != 0) {
            List<IMContact> e = mo92619e();
            String str2 = this.f127324e;
            if (str2 == null) {
                C89219l.m154715b();
            }
            this.f127324e = null;
            mo92667i().mo142944a();
            AbstractC88403ab b = AbstractC88403ab.m153596a((AbstractC88407af) new C55863e(this, e, str2)).mo142918b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            AbstractC88403ab b2 = AbstractC88403ab.m153596a((AbstractC88407af) new C55864f(e, str2)).mo142918b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b2, "");
            AbstractC88412b a = AbstractC88403ab.m153598a(b, b2, C55862d.f127333a).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C55860b(this, str2), new C55861c(this));
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, mo92667i());
        }
    }

    /* renamed from: a */
    public final void mo92710a(AbstractC55815d dVar) {
        C89219l.m154721d(dVar, "");
        this.f127327k = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$b */
    public static final class C55860b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC55858h f127330a;

        /* renamed from: b */
        final /* synthetic */ String f127331b;

        static {
            Covode.recordClassIndex(65650);
        }

        C55860b(AbstractC55858h hVar, String str) {
            this.f127330a = hVar;
            this.f127331b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<IMContact> list = (List) obj;
            AbstractC55815d dVar = this.f127330a.f127327k;
            if (dVar != null) {
                C89219l.m154716b(list, "");
                dVar.mo92511a(list, this.f127331b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$c */
    public static final class C55861c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC55858h f127332a;

        static {
            Covode.recordClassIndex(65651);
        }

        C55861c(AbstractC55858h hVar) {
            this.f127332a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC55815d dVar = this.f127332a.f127327k;
            if (dVar != null) {
                C89219l.m154716b(th, "");
                dVar.mo92514b(th);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC55858h(C55732c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
        this.f127328l = cVar.f127118i;
    }

    /* renamed from: a */
    public final void mo92711a(String str) {
        if (str != null && str.length() != 0) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            this.f127324e = C89361p.m154910b((CharSequence) str).toString();
            if (!this.f127325f) {
                mo92707j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$e */
    public static final class C55863e<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ AbstractC55858h f127334a;

        /* renamed from: b */
        final /* synthetic */ List f127335b;

        /* renamed from: c */
        final /* synthetic */ String f127336c;

        static {
            Covode.recordClassIndex(65653);
        }

        C55863e(AbstractC55858h hVar, List list, String str) {
            this.f127334a = hVar;
            this.f127335b = list;
            this.f127336c = str;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<List<IMConversation>> adVar) {
            List<IMConversation> list;
            C89219l.m154721d(adVar, "");
            if (this.f127334a.f127328l) {
                List list2 = this.f127335b;
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if (t instanceof IMConversation) {
                        arrayList.add(t);
                    }
                }
                list = new ArrayList<>();
                for (IMConversation iMConversation : arrayList) {
                    String displayName = iMConversation.getDisplayName();
                    C89219l.m154716b(displayName, "");
                    Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = displayName.toLowerCase();
                    C89219l.m154716b(lowerCase, "");
                    String str = this.f127336c;
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase2 = str.toLowerCase();
                    C89219l.m154716b(lowerCase2, "");
                    if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) lowerCase2)) {
                        list.add(iMConversation);
                    }
                }
            } else {
                list = C89086z.INSTANCE;
            }
            adVar.mo142931a(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$f */
    public static final class C55864f<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ List f127337a;

        /* renamed from: b */
        final /* synthetic */ String f127338b;

        static {
            Covode.recordClassIndex(65654);
        }

        C55864f(List list, String str) {
            this.f127337a = list;
            this.f127338b = str;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(AbstractC88405ad<List<IMUser>> adVar) {
            C89219l.m154721d(adVar, "");
            C55083f a = C55083f.m100744a();
            List list = this.f127337a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t instanceof IMUser) {
                    arrayList.add(t);
                }
            }
            List<IMUser> a2 = a.mo92004a(arrayList, this.f127338b, true);
            List<IMUser> arrayList2 = new ArrayList<>();
            for (IMUser iMUser : a2) {
                if (!arrayList2.contains(iMUser)) {
                    C89219l.m154716b(iMUser, "");
                    arrayList2.add(iMUser);
                }
            }
            adVar.mo142931a(arrayList2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.h$d */
    public static final class C55862d<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C55862d f127333a = new C55862d();

        static {
            Covode.recordClassIndex(65652);
        }

        C55862d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.addAll(list2);
            return arrayList;
        }
    }
}
