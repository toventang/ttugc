package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.e */
public final class C75899e implements AbstractC45870c {

    /* renamed from: a */
    public static final C75899e f170475a = new C75899e();

    private C75899e() {
    }

    static {
        Covode.recordClassIndex(88839);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c
    /* renamed from: a */
    public final void mo77227a() {
        C63244g.m114602a().mo73263I().mo101629a("effect_text_res_download_suc_rate", 0, new C69840ar().mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c
    /* renamed from: b */
    public final void mo77229b() {
        C63244g.m114602a().mo73263I().mo101629a("effect_text_font_download_suc_rate", 0, new C69840ar().mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c
    /* renamed from: a */
    public final void mo77228a(Throwable th, String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        if (th != null) {
            str2 = C27258s.m54268b(th);
        }
        C63244g.m114602a().mo73263I().mo101629a("effect_text_res_download_suc_rate", 1, new C69840ar().mo110189a("effectId", str).mo110189a("exception", str2).mo110191a());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45870c
    /* renamed from: b */
    public final void mo77230b(Throwable th, String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        if (th != null) {
            str2 = C27258s.m54268b(th);
        }
        C63244g.m114602a().mo73263I().mo101629a("effect_text_font_download_suc_rate", 1, new C69840ar().mo110189a("effectId", str).mo110189a("exception", str2).mo110191a());
    }
}
