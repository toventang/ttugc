package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ao */
public final class C72766ao implements AbstractC72769aq {

    /* renamed from: a */
    public static final C72767a f163150a = new C72767a((byte) 0);

    static {
        Covode.recordClassIndex(85452);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ao$a */
    public static final class C72767a {
        static {
            Covode.recordClassIndex(85453);
        }

        private C72767a() {
        }

        public /* synthetic */ C72767a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq
    /* renamed from: a */
    public final Integer mo115058a() {
        return Integer.valueOf(Keva.getRepo("DefaultCameraFacingStore").getInt("default_camera_facing", 1));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72769aq
    /* renamed from: a */
    public final void mo115059a(int i) {
        Keva.getRepo("DefaultCameraFacingStore").storeInt("default_camera_facing", i);
    }
}
