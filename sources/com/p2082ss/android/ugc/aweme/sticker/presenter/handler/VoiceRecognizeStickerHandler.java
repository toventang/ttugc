package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75640p;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler */
public final class VoiceRecognizeStickerHandler extends AbstractC75614b implements AbstractC33974au {

    /* renamed from: a */
    public volatile Effect f169981a;

    /* renamed from: b */
    public volatile boolean f169982b;

    /* renamed from: c */
    public final String f169983c;

    /* renamed from: d */
    private final AbstractC1204m f169984d;

    /* renamed from: e */
    private final AbstractC75640p f169985e;

    /* renamed from: f */
    private final C2560h<Boolean> f169986f;

    /* renamed from: g */
    private final Context f169987g;

    /* renamed from: h */
    private final AbstractC89171a<C89391z> f169988h;

    /* renamed from: i */
    private final AbstractC89171a<Boolean> f169989i;

    /* renamed from: j */
    private final AbstractC89171a<Boolean> f169990j;

    static {
        Covode.recordClassIndex(88535);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        this.f169981a = null;
        C84401c.f188722f.mo123662d(this.f169983c + " cancelSticker isStop " + this.f169986f);
        if (C89219l.m154714a((Object) this.f169986f.mo7034a(), (Object) true)) {
            mo119343b(AbstractC75640p.AbstractC75641a.C75643b.f170058a);
        } else {
            this.f169982b = true;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        C84401c.f188722f.mo123662d(this.f169983c + " onStop currentSticker " + this.f169981a);
        if (this.f169981a != null) {
            mo119343b(AbstractC75640p.AbstractC75641a.C75644c.f170059a);
        }
    }

    /* renamed from: b */
    public final void mo119343b(AbstractC75640p.AbstractC75641a aVar) {
        this.f169985e.mo119370b(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132357i(aVar.f170022a);
    }

    /* renamed from: c */
    private final void m132639c(AbstractC75640p.AbstractC75641a aVar) {
        AbstractC1196i lifecycle = this.f169984d.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED) && this.f169990j.invoke().booleanValue()) {
            this.f169985e.mo119369a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo119342a(AbstractC75640p.AbstractC75641a aVar) {
        C84401c.f188722f.mo123662d(this.f169983c + " reopenAudioRecorder lifecycleOwner isActive: currentSticker " + this.f169981a);
        if (this.f169981a == null) {
            return;
        }
        if (this.f169989i.invoke().booleanValue()) {
            m132639c(aVar);
        } else {
            mo119343b(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C84401c.f188722f.mo123662d(this.f169983c + " useSticker lifecycleOwner isActive: sticker " + aVar.f170022a);
        AbstractC89171a<C89391z> aVar2 = this.f169988h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        this.f169981a = aVar.f170022a;
        if (this.f169989i.invoke().booleanValue()) {
            this.f169982b = false;
            m132639c(AbstractC75640p.AbstractC75641a.C75647f.f170062a);
            return;
        }
        C85052j.C85053a.m146247b(this.f169987g, (int) R.string.gww, 1).mo129996a();
    }

    public /* synthetic */ VoiceRecognizeStickerHandler(AbstractC1204m mVar, AbstractC75640p pVar, C2560h hVar, Context context, AbstractC89171a aVar) {
        this(mVar, pVar, hVar, context, C756051.f169991a, aVar);
    }

    private VoiceRecognizeStickerHandler(AbstractC1204m mVar, AbstractC75640p pVar, C2560h<Boolean> hVar, Context context, AbstractC89171a<Boolean> aVar, AbstractC89171a<Boolean> aVar2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f169984d = mVar;
        this.f169985e = pVar;
        this.f169986f = hVar;
        this.f169987g = context;
        this.f169988h = null;
        this.f169989i = aVar;
        this.f169990j = aVar2;
        this.f169983c = "VoiceRecognizeStickerHandler";
        mVar.getLifecycle().mo4012a(this);
        hVar.mo7036a(mVar, new AbstractC2565m<Boolean>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler.C756062 */

            /* renamed from: a */
            final /* synthetic */ VoiceRecognizeStickerHandler f169992a;

            static {
                Covode.recordClassIndex(88537);
            }

            {
                this.f169992a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                C84401c.f188722f.mo123662d(this.f169992a.f169983c + " observe isStop " + bool2 + " currentSticker " + this.f169992a.f169981a + " needStopAudioRecorderAfter " + this.f169992a.f169982b);
                C89219l.m154716b(bool2, "");
                if (bool2.booleanValue() && this.f169992a.f169981a == null && this.f169992a.f169982b) {
                    this.f169992a.mo119343b(AbstractC75640p.AbstractC75641a.C75642a.f170057a);
                    this.f169992a.f169982b = false;
                }
            }
        });
    }
}
