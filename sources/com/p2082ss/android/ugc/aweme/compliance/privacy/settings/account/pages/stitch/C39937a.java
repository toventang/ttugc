package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.C39745b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.a */
public final class C39937a extends AbstractC39856a<StitchViewModel> {
    static {
        Covode.recordClassIndex(47691);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: c */
    public final String mo69150c() {
        return "stitch";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: d */
    public final String mo69151d() {
        String d = super.mo69151d();
        if (d != null) {
            return d;
        }
        if (C39631a.m80486b()) {
            return this.f93566d.getString(R.string.c_k);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.AbstractC39856a
    /* renamed from: b */
    public final void mo69149b(int i) {
        if (C39631a.m80486b() && i == 3) {
            C39745b.C39749d.m80629a(3);
        }
        super.mo69149b(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39937a(com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchViewModel r5, androidx.fragment.app.Fragment r6) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.C39937a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.stitch.StitchViewModel, androidx.fragment.app.Fragment):void");
    }
}
