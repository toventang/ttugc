package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3358d;

import android.content.Context;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.C57635a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.api.PolicyNoticeApi;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57665c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a */
public final class C57659a {

    /* renamed from: a */
    private final AbstractC89244h f131592a = C89250i.m154773a((AbstractC89171a) C57661b.f131595a);

    static {
        Covode.recordClassIndex(67625);
    }

    /* renamed from: a */
    public final PolicyNoticeApi.API mo94959a() {
        return (PolicyNoticeApi.API) this.f131592a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a$b */
    static final class C57661b extends AbstractC89220m implements AbstractC89171a<PolicyNoticeApi.API> {

        /* renamed from: a */
        public static final C57661b f131595a = new C57661b();

        static {
            Covode.recordClassIndex(67627);
        }

        C57661b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ PolicyNoticeApi.API invoke() {
            return PolicyNoticeApi.f131586a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a$c */
    public static final class C57662c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f131596a;

        /* renamed from: b */
        final /* synthetic */ long f131597b;

        static {
            Covode.recordClassIndex(67628);
        }

        public C57662c(AbstractC89171a aVar, long j) {
            this.f131596a = aVar;
            this.f131597b = j;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f131596a.invoke();
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                C57354e.m103957a("kids_api_policy_notice_approve", -1, -1, this.f131597b);
            } else if (iVar.mo5535a()) {
                C57354e.m103957a("kids_api_policy_notice_approve", -1, 0, this.f131597b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.d.a$a */
    public static final class C57660a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ long f131593a;

        /* renamed from: b */
        final /* synthetic */ Context f131594b;

        static {
            Covode.recordClassIndex(67626);
        }

        public C57660a(long j, Context context) {
            this.f131593a = j;
            this.f131594b = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5544c()) {
                C57354e.m103957a("kids_api_policy_notice", -1, -1, this.f131593a);
            } else if (!iVar.mo5539b() && iVar.mo5535a()) {
                List<C57663a> list = ((C57665c) iVar.mo5545d()).f131619a;
                if (!C13603b.m24435a((Collection) list)) {
                    C57635a.f131551d = true;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        if (C89219l.m154714a((Object) t2.getStyle(), (Object) "pop") && (!C89219l.m154714a((Object) t2.isSubPopUp(), (Object) true))) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList();
                    for (T t3 : list) {
                        T t4 = t3;
                        if (C89219l.m154714a((Object) t4.getStyle(), (Object) "float") && (!C89219l.m154714a((Object) t4.isSubPopUp(), (Object) true))) {
                            arrayList3.add(t3);
                        }
                    }
                    ArrayList arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList();
                    for (T t5 : list) {
                        T t6 = t5;
                        if (C89219l.m154714a((Object) t6.getStyle(), (Object) "bottom") && (!C89219l.m154714a((Object) t6.isSubPopUp(), (Object) true))) {
                            arrayList5.add(t5);
                        }
                    }
                    ArrayList arrayList6 = arrayList5;
                    ArrayList arrayList7 = new ArrayList();
                    for (T t7 : list) {
                        T t8 = t7;
                        if (C89219l.m154714a((Object) t8.getStyle(), (Object) "fullscreen") && (!C89219l.m154714a((Object) t8.isSubPopUp(), (Object) true))) {
                            arrayList7.add(t7);
                        }
                    }
                    ArrayList arrayList8 = arrayList7;
                    ArrayList arrayList9 = new ArrayList();
                    for (T t9 : list) {
                        if (C89219l.m154714a((Object) t9.isSubPopUp(), (Object) true)) {
                            arrayList9.add(t9);
                        }
                    }
                    ArrayList arrayList10 = arrayList9;
                    C89219l.m154721d(arrayList10, "");
                    C57646a.f131569e = arrayList10;
                    if (!arrayList6.isEmpty()) {
                        C57646a.f131566b = (C57663a) C89070n.m154579f((List) arrayList6);
                    }
                    if (!arrayList8.isEmpty()) {
                        C57646a.f131568d = (C57663a) C89070n.m154579f((List) arrayList8);
                    }
                    if (!arrayList4.isEmpty()) {
                        C57646a.f131565a = (C57663a) C89070n.m154579f((List) arrayList4);
                    }
                    if (!arrayList2.isEmpty()) {
                        C57646a.f131567c = (C57663a) C89070n.m154579f((List) arrayList2);
                    }
                }
                C57354e.m103957a("kids_api_policy_notice", -1, 0, this.f131593a);
            }
            C57646a.m104375a(this.f131594b);
            return null;
        }
    }
}
