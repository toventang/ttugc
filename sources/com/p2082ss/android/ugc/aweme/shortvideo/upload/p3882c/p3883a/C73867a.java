package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a.a */
public final class C73867a {

    /* renamed from: a */
    public static final C73868a f165844a = new C73868a((byte) 0);

    /* renamed from: b */
    private final int f165845b = C16048b.m29633a().mo25412a(true, "studio_synthesis_enable_ending_watermark", 0);

    /* renamed from: c */
    private final AbstractC89244h f165846c = C89250i.m154773a((AbstractC89171a) C73869b.f165847a);

    static {
        Covode.recordClassIndex(86613);
    }

    /* renamed from: a */
    public final String mo116328a() {
        return (String) this.f165846c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a.a$a */
    public static final class C73868a {
        static {
            Covode.recordClassIndex(86614);
        }

        private C73868a() {
        }

        public /* synthetic */ C73868a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo116330c() {
        int i = this.f165845b;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo116331d() {
        if (2 == this.f165845b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.a.a$b */
    static final class C73869b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C73869b f165847a = new C73869b();

        static {
            Covode.recordClassIndex(86615);
        }

        C73869b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String c = C63244g.m114602a().mo73279g().mo69470c().mo69477c("ending_watermark");
            File g = C63244g.m114602a().mo73279g().mo69470c().mo69481g(c);
            if (!g.exists() && !g.mkdirs()) {
                C84911q.m145923a("EndingWatermarkConfig", new Throwable("create watermark resource root dir failed!"));
            }
            return c;
        }
    }

    /* renamed from: b */
    public final File mo116329b() {
        return C63244g.m114602a().mo73279g().mo69470c().mo69474a(C63244g.m114602a().mo73279g().mo69470c().mo69481g(mo116328a()), "watermark_video.mp4");
    }
}
