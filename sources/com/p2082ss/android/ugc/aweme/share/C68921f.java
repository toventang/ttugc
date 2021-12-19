package com.p2082ss.android.ugc.aweme.share;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.f */
public final /* synthetic */ class C68921f implements PullUpLayout.AbstractC17241b {

    /* renamed from: a */
    private final AbstractC68904d f154179a;

    static {
        Covode.recordClassIndex(81230);
    }

    C68921f(AbstractC68904d dVar) {
        this.f154179a = dVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout.AbstractC17241b
    /* renamed from: a */
    public final void mo27277a(MotionEvent motionEvent) {
        AbstractC68904d dVar = this.f154179a;
        int action = motionEvent.getAction();
        if (action == 0) {
            dVar.f154127h = true;
            if (dVar.f154124e != null) {
                dVar.f154124e.f154141a = true;
            }
        } else if (action == 1) {
            dVar.f154127h = false;
            dVar.f154132m = System.currentTimeMillis() + ((long) dVar.f154125f);
            dVar.f154124e.f154141a = false;
            dVar.f154123d.postDelayed(dVar.f154124e, (long) dVar.f154125f);
        } else if (action == 2) {
            dVar.f154127h = true;
        }
    }
}
