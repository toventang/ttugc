package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.di */
public final /* synthetic */ class C73612di implements AbstractC89183m {

    /* renamed from: a */
    private final C73560cj f165432a;

    /* renamed from: b */
    private final C72683v f165433b;

    static {
        Covode.recordClassIndex(86350);
    }

    C73612di(C73560cj cjVar, C72683v vVar) {
        this.f165432a = cjVar;
        this.f165433b = vVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C73560cj cjVar = this.f165432a;
        cjVar.mo116146a(new C72631i.AbstractC72633b((View) obj, this.f165433b) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356816 */

            /* renamed from: a */
            final /* synthetic */ View f165362a;

            /* renamed from: b */
            final /* synthetic */ C72683v f165363b;

            static {
                Covode.recordClassIndex(86305);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
            /* renamed from: b */
            public final void mo114917b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
            /* renamed from: a */
            public final void mo114916a() {
                this.f165362a.setAlpha(1.0f);
                C65687t.m117578a(1);
                this.f165363b.f162951d = false;
                this.f165362a.callOnClick();
                C73560cj.this.f165264G = false;
            }

            {
                this.f165362a = r2;
                this.f165363b = r3;
            }
        });
        return null;
    }
}
