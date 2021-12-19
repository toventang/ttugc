package com.p2082ss.android.ugc.aweme.challenge.recommend;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi;
import com.p2082ss.android.ugc.aweme.challenge.recommend.p2453a.C35540b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel */
public class RecommendHashTagViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private C1213t<C35540b> f83805a;

    static {
        Covode.recordClassIndex(42755);
    }

    /* renamed from: a */
    public final C1213t<C35540b> mo62515a() {
        if (this.f83805a == null) {
            this.f83805a = new C1213t<>();
        }
        return this.f83805a;
    }

    /* renamed from: a */
    public final void mo62516a(AbstractC63178ak.C63184f fVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f83805a == null) {
            this.f83805a = new C1213t<>();
        }
        C1213t<C35540b> tVar = this.f83805a;
        C89219l.m154721d(tVar, "");
        if (!C80580in.m139687c()) {
            RecommendHashTagApi.HashTagApi hashTagApi = RecommendHashTagApi.f83799a;
            if (hashTagApi == null) {
                C89219l.m154715b();
            }
            if (fVar != null) {
                str = fVar.f143525d;
                str2 = fVar.f143523b;
                str3 = fVar.f143522a;
                str4 = fVar.f143524c;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            hashTagApi.fetchRecommendHashTagsMT(str, str2, str3, str4).mo5534a(new RecommendHashTagApi.C35536a(tVar), C1731i.f5564c, null);
        }
    }
}
