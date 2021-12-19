package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ab */
public final class C73357ab implements AbstractC72769aq {

    /* renamed from: a */
    public static final C73358a f164848a = new C73358a((byte) 0);

    static {
        Covode.recordClassIndex(86094);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ab$a */
    public static final class C73358a {
        static {
            Covode.recordClassIndex(86095);
        }

        private C73358a() {
        }

        public /* synthetic */ C73358a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq
    /* renamed from: a */
    public final Integer mo115058a() {
        return Integer.valueOf(C63244g.m114602a().mo73277e().getCameraPosition(1));
    }

    public C73357ab() {
        if (C63238c.f143586m.mo93852a("key_first_use_camera", true)) {
            C63238c.f143586m.mo93855b("key_first_use_camera", false);
            if (C16048b.m29633a().mo25421a(true, "rear_camera", false)) {
                mo115059a(0);
            } else {
                mo115059a(1);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq
    /* renamed from: a */
    public final void mo115059a(int i) {
        C63244g.m114602a().mo73277e().setCameraPosition(i);
    }
}
