package com.p2082ss.android.ugc.aweme.sticker.p3965m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;

/* renamed from: com.ss.android.ugc.aweme.sticker.m.d */
public final class C75425d implements AbstractC75432j {

    /* renamed from: a */
    private boolean f169509a;

    static {
        Covode.recordClassIndex(88344);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75432j
    /* renamed from: a */
    public final void mo118972a(String str, String str2) {
        C73975b.C73976a.f166071a.start(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75432j
    /* renamed from: b */
    public final void mo118973b(String str, String str2) {
        C73975b.C73976a.f166071a.step(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75432j
    /* renamed from: c */
    public final void mo118974c(String str, String str2) {
        boolean z;
        if (!this.f169509a) {
            C73975b.C73976a.f166071a.step(str, str2);
            z = true;
        } else {
            C73975b.C73976a.f166071a.end(str, str2);
            z = false;
        }
        this.f169509a = z;
    }
}
