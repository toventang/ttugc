package com.p2082ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.g */
public final /* synthetic */ class C36427g implements AbstractC88433f {

    /* renamed from: a */
    private final C36274b f86111a;

    /* renamed from: b */
    private final MentionEditText f86112b;

    /* renamed from: c */
    private final String f86113c;

    /* renamed from: d */
    private final String f86114d;

    static {
        Covode.recordClassIndex(43722);
    }

    C36427g(C36274b bVar, MentionEditText mentionEditText, String str, String str2) {
        this.f86111a = bVar;
        this.f86112b = mentionEditText;
        this.f86113c = str;
        this.f86114d = str2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C36274b bVar = this.f86111a;
        MentionEditText mentionEditText = this.f86112b;
        String str = this.f86113c;
        String str2 = this.f86114d;
        if (!bVar.mo63515n()) {
            return;
        }
        if (!C31575b.m65865g().isLogin()) {
            C58957c.m108319a(bVar.f85731b.getActivity(), str2, "click_comment_emotion", new C80222ap().mo123649a("group_id", str).mo123649a("log_pb", C59208ac.m108768c(str)).f179700a);
        } else if (!bVar.mo63505e()) {
            bVar.mo63489b();
            bVar.mo63481a(mentionEditText.getHint(), true);
        }
    }
}
