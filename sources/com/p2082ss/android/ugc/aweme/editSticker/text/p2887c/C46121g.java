package com.p2082ss.android.ugc.aweme.editSticker.text.p2887c;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.c.g */
public final class C46121g extends AbstractC14537a {

    /* renamed from: a */
    private final EditTextStickerViewModel f107374a;

    static {
        Covode.recordClassIndex(54679);
    }

    public C46121g(EditTextStickerViewModel editTextStickerViewModel) {
        C89219l.m154721d(editTextStickerViewModel, "");
        this.f107374a = editTextStickerViewModel;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23390a(float f) {
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78538a(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: c */
    public final boolean mo23403c(float f) {
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        if (editTextStickerViewModel.f107133f) {
            for (C46239q qVar : editTextStickerViewModel.f107132e) {
                Float.valueOf(f);
                if (qVar.mo78552f()) {
                    qVar.f107766z = false;
                    qVar.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: f */
    public final boolean mo23406f(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(motionEvent, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78546b(motionEvent)) {
                editTextStickerViewModel.mo33689c(EditTextStickerViewModel.C46029t.f107177a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: b */
    public final boolean mo23400b(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(motionEvent, "");
        editTextStickerViewModel.f107134g = false;
        if (editTextStickerViewModel.f107133f) {
            for (C46239q qVar : editTextStickerViewModel.f107132e) {
                qVar.mo78579m();
            }
            for (C46239q qVar2 : editTextStickerViewModel.f107132e) {
                if (qVar2.mo78540a(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: c */
    public final boolean mo23404c(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(motionEvent, "");
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78573h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23393a(ScaleGestureDetector scaleGestureDetector) {
        C89219l.m154721d(scaleGestureDetector, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(scaleGestureDetector, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(scaleGestureDetector, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78541a(scaleGestureDetector)) {
                editTextStickerViewModel.mo33689c(new EditTextStickerViewModel.C46028s(qVar));
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23394a(C84882b bVar) {
        C89219l.m154721d(bVar, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(bVar, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78542a(bVar)) {
                editTextStickerViewModel.mo33689c(EditTextStickerViewModel.C46027r.f107175a);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: a */
    public final boolean mo23396a(C84885c cVar) {
        C89219l.m154721d(cVar, "");
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(cVar, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(bVar, "");
        if (!editTextStickerViewModel.f107133f) {
            return false;
        }
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
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
        EditTextStickerViewModel editTextStickerViewModel = this.f107374a;
        C89219l.m154721d(motionEvent, "");
        C89219l.m154721d(motionEvent2, "");
        for (C46239q qVar : editTextStickerViewModel.f107132e) {
            if (qVar.mo78574i()) {
                return true;
            }
        }
        if (!editTextStickerViewModel.f107134g) {
            return false;
        }
        editTextStickerViewModel.f107134g = false;
        return true;
    }
}
