package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import dmt.p4542av.video.C88303z;
import dmt.p4542av.video.p4545b.AbstractC88176f;

/* renamed from: dmt.av.video.ai */
final /* synthetic */ class C88167ai implements AbstractC88176f.AbstractC88177a {

    /* renamed from: a */
    private final C88303z.C883041 f200123a;

    static {
        Covode.recordClassIndex(104202);
    }

    C88167ai(C88303z.C883041 r1) {
        this.f200123a = r1;
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88176f.AbstractC88177a
    /* renamed from: a */
    public final void mo114869a() {
        C88303z.C883041 r2 = this.f200123a;
        if (!C88303z.this.f200425y) {
            C88303z.this.f200425y = true;
            C40970e.m82485a("receive prepare done event");
            C88303z.this.f200426z.postValue(null);
        }
    }
}
