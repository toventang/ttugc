package com.p2082ss.android.ugc.aweme.social.widget.card;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74755b;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3921b.C74769a;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.AbstractC74890a;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.C74903c;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.h */
public final class C74786h implements AbstractC74785g {

    /* renamed from: a */
    public static final C74786h f168101a = new C74786h();

    private C74786h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74785g
    /* renamed from: a */
    public final RecyclerView.AbstractC1361h mo117844a() {
        return new C74769a();
    }

    static {
        Covode.recordClassIndex(87631);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74785g
    /* renamed from: b */
    public final boolean mo117846b() {
        Map<EnumC74761f, Boolean> map = C74755b.C74756a.m131266a(7).f168032d;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<EnumC74761f, Boolean> entry : map.entrySet()) {
            if (entry.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74785g
    /* renamed from: a */
    public final AbstractC74890a mo117845a(C74743a aVar, AbstractC89172b<? super AbstractC74890a, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C74903c cVar = new C74903c(aVar);
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        return cVar;
    }
}
