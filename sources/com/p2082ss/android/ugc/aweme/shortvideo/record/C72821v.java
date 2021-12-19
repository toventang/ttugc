package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71978c;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.vesdk.lens.VEModelDownload;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.v */
public final /* synthetic */ class C72821v implements VEModelDownload.AbstractC85523a {

    /* renamed from: a */
    private final C72809t f163407a;

    static {
        Covode.recordClassIndex(85507);
    }

    C72821v(C72809t tVar) {
        this.f163407a = tVar;
    }

    @Override // com.p2082ss.android.vesdk.lens.VEModelDownload.AbstractC85523a
    /* renamed from: a */
    public final void mo115159a(String str, String str2, VEModelDownload.AbstractC85524b bVar) {
        C72809t tVar = this.f163407a;
        if (str.isEmpty() || str2.isEmpty()) {
            bVar.mo130840a();
            return;
        }
        C72809t.C728101 r5 = new C71978c.AbstractC71979a(bVar) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t.C728101 */

            /* renamed from: a */
            final /* synthetic */ VEModelDownload.AbstractC85524b f163393a;

            static {
                Covode.recordClassIndex(85496);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71978c.AbstractC71979a
            /* renamed from: a */
            public final void mo113625a() {
                this.f163393a.mo130840a();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71978c.AbstractC71979a
            /* renamed from: a */
            public final void mo113626a(String str) {
                this.f163393a.mo130841a(str);
            }

            {
                this.f163393a = r2;
            }
        };
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(r5, "");
        String[] strArr = {str2};
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr, C89041ag.m154427b(new C89378p(str2, C89070n.m154524c(str))), new C71978c.C71980b(str, r5));
    }
}
