package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.b */
public final class C39866b extends AbstractC39720f {

    /* renamed from: a */
    public final int f93817a = R.string.erm;

    static {
        Covode.recordClassIndex(47599);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.uo;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        ((TuxTextView) view.findViewById(R.id.afz)).setText(this.f93817a);
    }
}
