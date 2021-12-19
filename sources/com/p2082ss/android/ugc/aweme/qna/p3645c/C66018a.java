package com.p2082ss.android.ugc.aweme.qna.p3645c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.c.a */
public final class C66018a {

    /* renamed from: a */
    public final Set<String> f148634a = new HashSet();

    static {
        Covode.recordClassIndex(77524);
    }

    /* renamed from: a */
    public final void mo105077a(C66296h hVar) {
        String str;
        Integer num;
        if (hVar != null && (str = hVar.f149044h) != null && hVar.f149065n && this.f148634a.add(str)) {
            List<String> list = hVar.f149066o;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            C89219l.m154721d(str, "");
            C39162r.m79460a("qa_invitation_show", new C33744d().mo59983a("enter_from", "qa_personal_profile").mo59983a("question_id", str).mo59982a("inviter_cnt", num).f79943a);
        }
    }
}
