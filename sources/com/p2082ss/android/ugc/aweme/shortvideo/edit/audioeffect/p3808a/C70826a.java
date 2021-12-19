package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75544f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a */
public final class C70826a implements AbstractC70830d {

    /* renamed from: a */
    private AbstractC75544f f158577a;

    /* renamed from: b */
    private Effect f158578b;

    /* renamed from: c */
    private final FrameLayout f158579c;

    /* renamed from: d */
    private final AbstractC70829c f158580d;

    static {
        Covode.recordClassIndex(83317);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.AbstractC70830d
    /* renamed from: a */
    public final void mo112000a() {
        AbstractC75544f fVar = this.f158577a;
        if (fVar != null) {
            fVar.mo112003a();
        }
    }

    public C70826a(FrameLayout frameLayout) {
        this(frameLayout, new C70827b((byte) 0));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.p3808a.AbstractC70830d
    /* renamed from: a */
    public final void mo112001a(Effect effect) {
        AbstractC75544f fVar = this.f158577a;
        if (fVar != null) {
            fVar.mo112003a();
        }
        if (effect != null && !C89219l.m154714a(effect, this.f158578b)) {
            this.f158578b = effect;
            AbstractC75544f a = this.f158580d.mo112002a(effect);
            this.f158577a = a;
            if (a != null) {
                a.mo112004a(this.f158579c);
            }
        }
    }

    private C70826a(FrameLayout frameLayout, AbstractC70829c cVar) {
        C89219l.m154721d(cVar, "");
        this.f158579c = frameLayout;
        this.f158580d = cVar;
    }
}
