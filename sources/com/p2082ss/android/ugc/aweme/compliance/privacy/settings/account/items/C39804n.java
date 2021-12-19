package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.Divider;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.n */
public final class C39804n extends AbstractC39720f {

    /* renamed from: a */
    public final int f93711a;

    static {
        Covode.recordClassIndex(47534);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.uq;
    }

    public C39804n(int i) {
        this.f93711a = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        String string = view.getContext().getString(this.f93711a);
        C89219l.m154716b(string, "");
        ((Divider) view.findViewById(R.id.bcb)).setLeftText(string);
    }
}
