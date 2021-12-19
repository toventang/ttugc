package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.d */
public final class C39881d extends AbstractC39720f {

    /* renamed from: a */
    public final int f93835a;

    /* renamed from: b */
    public final Integer f93836b;

    static {
        Covode.recordClassIndex(47618);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39720f
    /* renamed from: b */
    public final int mo69101b() {
        return R.layout.us;
    }

    public /* synthetic */ C39881d(int i) {
        this(i, null);
    }

    public C39881d(int i, Integer num) {
        this.f93835a = i;
        this.f93836b = num;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        int i2;
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        ((TuxTextView) view.findViewById(R.id.f63)).setText(this.f93835a);
        View view2 = hVar.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.f4y);
        Integer num = this.f93836b;
        if (num != null) {
            tuxTextView.setText(num.intValue());
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
    }
}
