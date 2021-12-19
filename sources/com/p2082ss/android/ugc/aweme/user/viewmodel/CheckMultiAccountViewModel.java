package com.p2082ss.android.ugc.aweme.user.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.viewmodel.CheckMultiAccountViewModel */
public final class CheckMultiAccountViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C1213t<List<C80053c>> f179477a;

    static {
        Covode.recordClassIndex(93333);
    }

    public CheckMultiAccountViewModel() {
        C1213t<List<C80053c>> tVar = new C1213t<>();
        tVar.postValue(C89070n.m154522b(C80061e.m138801e(C80061e.f179403k.mo123517e()), new C80053c("-1", null, null, null, null, null, 0, 126)));
        this.f179477a = tVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.user.viewmodel.CheckMultiAccountViewModel$a */
    public static final class C80100a<I, O> implements AbstractC0189a {

        /* renamed from: a */
        public static final C80100a f179478a = new C80100a();

        static {
            Covode.recordClassIndex(93334);
        }

        C80100a() {
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            List list = (List) obj;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }
}
