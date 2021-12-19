package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73844ad;
import com.p2082ss.ttuploader.TTImageUploader;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.a */
public final class C78565a {

    /* renamed from: a */
    public static final C78566a f176560a = new C78566a((byte) 0);

    static {
        Covode.recordClassIndex(91699);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.video.a$a */
    public static final class C78566a {
        static {
            Covode.recordClassIndex(91700);
        }

        private C78566a() {
        }

        public /* synthetic */ C78566a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m137180a(TTImageUploader tTImageUploader, C65612d dVar) {
            C89219l.m154721d(tTImageUploader, "");
            C89219l.m154721d(dVar, "");
            C73844ad adVar = new C73844ad();
            adVar.mo116302a(dVar);
            tTImageUploader.setServerParameter(adVar.mo116301a());
        }
    }
}
