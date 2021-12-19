package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cp */
public final /* synthetic */ class C73583cp implements AbstractC63220bg.AbstractC63222b {

    /* renamed from: a */
    private final C73560cj f165387a;

    static {
        Covode.recordClassIndex(86320);
    }

    C73583cp(C73560cj cjVar) {
        this.f165387a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63222b
    /* renamed from: a */
    public final boolean mo101701a(View view) {
        C73560cj cjVar = this.f165387a;
        if (cjVar.f165265H.f162448a.mo101698b() == 1) {
            cjVar.f165265H.f162448a.mo101697a(false);
        } else {
            cjVar.mo116146a(new C72631i.AbstractC72633b() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356614 */

                static {
                    Covode.recordClassIndex(86303);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                /* renamed from: b */
                public final void mo114917b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                /* renamed from: a */
                public final void mo114916a() {
                    C73560cj.this.f165265H.f162448a.mo101697a(true);
                }
            });
        }
        return false;
    }
}
