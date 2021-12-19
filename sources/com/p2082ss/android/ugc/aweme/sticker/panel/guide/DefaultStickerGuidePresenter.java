package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.DefaultStickerGuidePresenter */
public class DefaultStickerGuidePresenter implements AbstractC75549i {

    /* renamed from: a */
    private FrameLayout f169735a;

    /* renamed from: b */
    private AbstractC75544f f169736b;

    /* renamed from: c */
    private AbstractC75546g f169737c;

    /* renamed from: d */
    private AbstractC75544f f169738d;

    /* renamed from: e */
    private AbstractC75546g f169739e;

    /* renamed from: f */
    private Effect f169740f;

    static {
        Covode.recordClassIndex(88445);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    /* renamed from: a */
    public final void mo119214a() {
        this.f169740f = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void hide() {
        AbstractC75544f fVar = this.f169736b;
        if (fVar != null) {
            fVar.mo112003a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void hideNotice() {
        AbstractC75544f fVar = this.f169738d;
        if (fVar != null) {
            fVar.mo112003a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    /* renamed from: a */
    public final void mo119215a(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    /* renamed from: b */
    public final void mo119217b(Effect effect) {
        AbstractC75544f fVar = this.f169738d;
        if (fVar != null) {
            fVar.mo112003a();
        }
        if (effect != null) {
            this.f169740f = effect;
            AbstractC75544f a = this.f169739e.mo119247a(effect);
            this.f169738d = a;
            a.mo112004a(this.f169735a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75549i
    /* renamed from: a */
    public final void mo119216a(Effect effect) {
        AbstractC75544f fVar;
        if (effect == null || !effect.equals(this.f169740f) || (fVar = this.f169736b) == null || !fVar.mo112005b()) {
            AbstractC75544f fVar2 = this.f169736b;
            if (fVar2 != null) {
                fVar2.mo112003a();
            }
            if (effect == null || (!C75466g.m132340D(effect) && effect.equals(this.f169740f) && !effect.getTypes().contains("Game2DV2"))) {
                this.f169740f = effect;
                return;
            }
            this.f169740f = effect;
            AbstractC75544f a = this.f169737c.mo119247a(effect);
            this.f169736b = a;
            a.mo112004a(this.f169735a);
        }
    }

    public DefaultStickerGuidePresenter(AbstractC75546g gVar, FrameLayout frameLayout) {
        this(gVar, new C75570o(), frameLayout);
    }

    private DefaultStickerGuidePresenter(AbstractC75546g gVar, AbstractC75546g gVar2, FrameLayout frameLayout) {
        this.f169735a = frameLayout;
        this.f169737c = gVar;
        this.f169739e = gVar2;
    }
}
