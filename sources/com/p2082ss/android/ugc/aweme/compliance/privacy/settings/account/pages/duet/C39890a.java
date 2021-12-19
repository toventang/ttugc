package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet.a */
public final class C39890a extends AbstractC39856a<DuetViewModel> {
    static {
        Covode.recordClassIndex(47631);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "duet";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: d */
    public final String mo69151d() {
        String d = super.mo69151d();
        if (d != null) {
            return d;
        }
        if (C39631a.m80486b()) {
            return this.f93566d.getString(R.string.c_c);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: b */
    public final void mo69149b(int i) {
        if (C39631a.m80486b() && i == 3) {
            C39745b.C39747b.m80627a(3);
        }
        super.mo69149b(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39890a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet.DuetViewModel r5, androidx.fragment.app.Fragment r6) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet.C39890a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.duet.DuetViewModel, androidx.fragment.app.Fragment):void");
    }
}
