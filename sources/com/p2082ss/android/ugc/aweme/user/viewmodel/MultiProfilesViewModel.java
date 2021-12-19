package com.p2082ss.android.ugc.aweme.user.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1169aa;
import androidx.lifecycle.LiveData;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel */
public final class MultiProfilesViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C80061e f179479a = C80061e.f179403k;

    /* renamed from: b */
    public final LiveData<List<C80053c>> f179480b;

    static {
        Covode.recordClassIndex(93335);
    }

    public MultiProfilesViewModel() {
        LiveData<List<C80053c>> a = C1169aa.m3869a(C80064f.f179417c, C80101a.f179481a);
        C89219l.m154716b(a, "");
        this.f179480b = a;
    }

    /* renamed from: com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel$a */
    static final class C80101a<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C80101a f179481a = new C80101a();

        static {
            Covode.recordClassIndex(93336);
        }

        C80101a() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            List<String> list = (List) obj;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C80053c e = C80061e.m138801e(str);
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel$b */
    public static final class C80102b<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ MultiProfilesViewModel f179482a;

        static {
            Covode.recordClassIndex(93337);
        }

        public C80102b(MultiProfilesViewModel multiProfilesViewModel) {
            this.f179482a = multiProfilesViewModel;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            String e = this.f179482a.f179479a.mo123517e();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C89219l.m154714a((Object) ((C80053c) next).f179384a, (Object) e)) {
                        if (next != null) {
                            List a = C89070n.m154516a(next);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (!C89219l.m154714a((Object) ((C80053c) obj2).f179384a, (Object) e)) {
                                    arrayList.add(obj2);
                                }
                            }
                            list = C89070n.m154572d((Collection) a, (Iterable) arrayList);
                        }
                    }
                }
            }
            MultiAccountService.m65945c();
            if (list.size() < 8) {
                return C89070n.m154572d((Collection) list, (Iterable) C89070n.m154516a(new C80053c("-1", null, null, null, null, null, 0, 126)));
            }
            return list;
        }
    }
}
