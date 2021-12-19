package com.p2082ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45871d;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.text.j */
public final class C75904j implements AbstractC45871d {

    /* renamed from: a */
    public static final C75904j f170479a = new C75904j();

    private C75904j() {
    }

    static {
        Covode.recordClassIndex(88844);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45871d
    /* renamed from: a */
    public final void mo77231a(C45995c cVar, boolean z, Exception exc) {
        int i;
        C69840ar a;
        String c;
        String str = "font_name";
        if (z) {
            i = 0;
            C69840ar arVar = new C69840ar();
            if (cVar == null) {
                C89219l.m154715b();
            }
            a = arVar.mo110189a("font_title", cVar.f107118b);
            c = cVar.f107121e;
        } else {
            i = 1;
            C69840ar arVar2 = new C69840ar();
            if (cVar == null) {
                C89219l.m154715b();
            }
            a = arVar2.mo110189a("font_title", cVar.f107118b).mo110189a(str, cVar.f107121e);
            if (exc == null) {
                c = "";
            } else {
                c = C24098m.m45633c(exc);
            }
            str = "exception";
        }
        C40982q.m82520a("font_resource_download_error_state", i, a.mo110189a(str, c).mo110191a());
    }
}
