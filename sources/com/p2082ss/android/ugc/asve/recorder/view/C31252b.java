package com.p2082ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.camera.p2223b.C31166a;
import com.p2082ss.android.ugc.asve.recorder.reaction.p2225a.C31219a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.view.b */
public final class C31252b implements AbstractC31254d {

    /* renamed from: a */
    public final AbstractC31257g f74937a;

    /* renamed from: b */
    private AbstractC31254d f74938b;

    static {
        Covode.recordClassIndex(37900);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56710a(boolean z) {
        this.f74938b.mo56710a(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.view.AbstractC31254d
    /* renamed from: a */
    public final void mo56709a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        this.f74938b.mo56709a(motionEvent);
    }

    public C31252b(Context context, ASCameraView aSCameraView, C31117a aVar) {
        AbstractC31254d aVar2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(aSCameraView, "");
        C89219l.m154721d(aVar, "");
        if (C31253c.f74939a[aVar.f74566a.ordinal()] != 1) {
            aVar2 = new C31166a(context, aSCameraView, aVar);
        } else {
            aVar2 = new C31219a(context, aSCameraView, aVar.mo56549g(), aVar.mo56545c(), aSCameraView.getReactionViewHelper$lib_asve_release());
        }
        this.f74938b = aVar2;
        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.view.GestureDispatcher");
        this.f74937a = (AbstractC31257g) aVar2;
    }
}
