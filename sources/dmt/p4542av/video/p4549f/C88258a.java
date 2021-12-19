package dmt.p4542av.video.p4549f;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.property.C65398ck;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import dmt.p4542av.video.p4544a.C88152a;

/* renamed from: dmt.av.video.f.a */
public final class C88258a implements AbstractC73799a {

    /* renamed from: a */
    public static final C88259a f200298a = new C88259a((byte) 0);

    static {
        Covode.recordClassIndex(104293);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    /* renamed from: dmt.av.video.f.a$a */
    public static final class C88259a {
        static {
            Covode.recordClassIndex(104294);
        }

        private C88259a() {
        }

        public /* synthetic */ C88259a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        Keva repo = Keva.getRepo("clean_synthetic_video");
        if (C65398ck.m117098a() && !repo.getBoolean("key_clean_synthetic_video_only_once", false)) {
            repo.storeBoolean("key_clean_synthetic_video_only_once", true);
            C88152a.m153232a("record_page");
        }
    }
}
