package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73844ad;
import com.p2082ss.ttuploader.TTImageUploader;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.n */
public final class C74119n extends AbstractC74096a {
    static {
        Covode.recordClassIndex(86872);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a
    /* renamed from: a */
    public final void mo116482a(TTImageUploader tTImageUploader, C65612d dVar) {
        C89219l.m154721d(tTImageUploader, "");
        C89219l.m154721d(dVar, "");
        C73844ad adVar = new C73844ad();
        adVar.mo116302a(dVar);
        tTImageUploader.setServerParameter(adVar.mo116301a());
    }
}
