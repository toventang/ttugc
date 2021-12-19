package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84540h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel */
public final class InfoStickerStateViewModel extends BaseInfoStickerStateViewModel<Effect> implements AbstractC33974au {

    /* renamed from: d */
    private final AbstractC84536d f189268d;

    static {
        Covode.recordClassIndex(98689);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    /* renamed from: b */
    public final /* synthetic */ AbstractC88979t<C20375am<Effect, EnumC84444c, Integer>> mo129568b(Effect effect) {
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        AbstractC88979t d = this.f189268d.mo129422a(effect2, true).mo143292d(C84716a.f189269a);
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerStateViewModel$a */
    static final class C84716a<T, R> implements AbstractC88434g<C84540h, C20375am<Effect, EnumC84444c, Integer>> {

        /* renamed from: a */
        public static final C84716a f189269a = new C84716a();

        static {
            Covode.recordClassIndex(98690);
        }

        C84716a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C20375am<Effect, EnumC84444c, Integer> apply(C84540h hVar) {
            EnumC84444c cVar;
            C84540h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            Effect effect = hVar2.f188936a;
            int i = C84749i.f189376a[hVar2.f188937b.f188959a.ordinal()];
            if (i == 1) {
                cVar = EnumC84444c.UNKNOWN;
            } else if (i == 2) {
                cVar = EnumC84444c.DOWNLOADING;
            } else if (i == 3) {
                cVar = EnumC84444c.NOT_DOWNLOAD;
            } else if (i == 4) {
                cVar = EnumC84444c.DOWNLOAD_SUCCESS;
            } else if (i != 5) {
                cVar = EnumC84444c.UNKNOWN;
            } else {
                cVar = EnumC84444c.DOWNLOAD_FAILED;
            }
            return new C20375am(effect, cVar, hVar2.f188938c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerStateViewModel(AbstractC1204m mVar, AbstractC84536d dVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        this.f189268d = dVar;
    }
}
