package com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.p3031a;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.text.a.a */
public final class C52310a extends AbstractC14537a {

    /* renamed from: a */
    private final FTCEditTextStickerViewModel f120522a;

    static {
        Covode.recordClassIndex(61700);
    }

    public C52310a(FTCEditTextStickerViewModel fTCEditTextStickerViewModel) {
        C89219l.m154721d(fTCEditTextStickerViewModel, "");
        this.f120522a = fTCEditTextStickerViewModel;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23390a(float f) {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78538a(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: c */
    public final boolean mo23404c(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(motionEvent, "");
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78573h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: f */
    public final boolean mo23406f(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(motionEvent, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78546b(motionEvent)) {
                fTCEditTextStickerViewModel.mo33689c(FTCEditTextStickerViewModel.C52296i.f120508a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23400b(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(motionEvent, "");
        fTCEditTextStickerViewModel.f120489c = false;
        if (fTCEditTextStickerViewModel.f120488b) {
            for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
                qVar.mo78579m();
            }
            for (C46239q qVar2 : fTCEditTextStickerViewModel.f120487a) {
                if (qVar2.mo78540a(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
        C89219l.m154721d(scaleGestureDetector, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(scaleGestureDetector, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78547b(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23402b(ScaleGestureDetector scaleGestureDetector) {
        C89219l.m154721d(scaleGestureDetector, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(scaleGestureDetector, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78541a(scaleGestureDetector)) {
                fTCEditTextStickerViewModel.mo33689c(new FTCEditTextStickerViewModel.C52295h(qVar));
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23394a(C84882b bVar) {
        C89219l.m154721d(bVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(bVar, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78542a(bVar)) {
                fTCEditTextStickerViewModel.mo33689c(FTCEditTextStickerViewModel.C52294g.f120506a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23396a(C84885c cVar) {
        C89219l.m154721d(cVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(cVar, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78543a(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23395a(C84882b bVar, float f, float f2) {
        C89219l.m154721d(bVar, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(bVar, "");
        if (!fTCEditTextStickerViewModel.f120488b) {
            return false;
        }
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78549d(f, f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23401b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78576j()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23392a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.f120522a;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        for (C46239q qVar : fTCEditTextStickerViewModel.f120487a) {
            if (qVar.mo78574i()) {
                return true;
            }
        }
        if (!fTCEditTextStickerViewModel.f120489c) {
            return false;
        }
        fTCEditTextStickerViewModel.f120489c = false;
        return true;
    }
}
