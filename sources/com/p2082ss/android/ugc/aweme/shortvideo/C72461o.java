package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74163b;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.o */
public final class C72461o {

    /* renamed from: a */
    private final AbstractC14193m f162443a;

    /* renamed from: b */
    private final CameraComponentModel f162444b;

    /* renamed from: c */
    private final AbstractC74163b f162445c;

    static {
        Covode.recordClassIndex(85136);
    }

    /* renamed from: a */
    public final void mo114729a() {
        C75439a aVar;
        C75439a aVar2 = this.f162444b.f155662r;
        if (aVar2 != null) {
            long maxDuration = aVar2.getMaxDuration();
            if (maxDuration > 0 && (aVar = this.f162444b.f155662r) != null && !aVar.isMultiBgVideo()) {
                long a = this.f162445c.mo116636a(this.f162444b);
                if (maxDuration > 0) {
                    a = Math.min(a, maxDuration);
                }
                long j = this.f162444b.f155651g + a;
                this.f162444b.f155646b = j;
                this.f162443a.mo22875a(new C14190j(j));
            }
        }
    }

    public C72461o(AbstractC14193m mVar, CameraComponentModel cameraComponentModel, AbstractC74163b bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(cameraComponentModel, "");
        C89219l.m154721d(bVar, "");
        this.f162443a = mVar;
        this.f162444b = cameraComponentModel;
        this.f162445c = bVar;
    }
}
