package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42435q;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42436r;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.c */
public abstract class AbstractC34120c implements AbstractC34121d {

    /* renamed from: a */
    private C67568r f80667a;

    /* renamed from: d */
    public C42436r f80668d;

    /* renamed from: e */
    public C42435q f80669e;

    static {
        Covode.recordClassIndex(41054);
    }

    /* renamed from: a */
    private final String mo60408a() {
        String str;
        C42435q qVar = this.f80669e;
        if (qVar == null || (str = qVar.f98896d) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.AbstractC34121d
    /* renamed from: a */
    public void mo60409a(C42411h hVar, C67568r rVar) {
        C42436r rVar2;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(rVar, "");
        C42435q qVar = hVar.f98804n;
        if (qVar != null) {
            this.f80669e = qVar;
            C42435q qVar2 = hVar.f98804n;
            if (qVar2 != null && (rVar2 = qVar2.f98894b) != null) {
                this.f80668d = rVar2;
                this.f80667a = rVar;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.AbstractC34121d
    /* renamed from: a */
    public final void mo60411a(String str, C42435q qVar) {
        String str2;
        int i;
        String str3 = "";
        C89219l.m154721d(str, str3);
        C89219l.m154721d(qVar, str3);
        C67568r rVar = this.f80667a;
        if (rVar != null) {
            if (TextUtils.equals(str, "search_result_show")) {
                C67540c g = C42317b.m84679a(rVar).mo106497x(qVar.f98895c).mo106487g(mo60408a());
                List<? extends Aweme> list = qVar.f98893a;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                g.mo106452c("item_num", String.valueOf(i)).mo96792f();
            } else if (TextUtils.equals(str, "search_result_click")) {
                C67496as B = ((C67496as) C42317b.m84680b(rVar).mo106497x(qVar.f98895c)).mo106440B("click_more_button");
                C42436r rVar2 = this.f80668d;
                if (!(rVar2 == null || (str2 = rVar2.f98898b) == null)) {
                    str3 = str2;
                }
                B.mo106492s(str3).mo106487g(mo60408a()).mo96792f();
            }
        }
    }
}
