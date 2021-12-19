package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84533a;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84542j;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerStateNewViewModel */
public final class InfoStickerStateNewViewModel extends BaseInfoStickerStateViewModel<InfoStickerEffect> implements AbstractC33974au {

    /* renamed from: d */
    private final AbstractC84533a f189544d;

    static {
        Covode.recordClassIndex(98806);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    /* renamed from: b */
    public final /* synthetic */ AbstractC88979t<C20375am<InfoStickerEffect, EnumC84444c, Integer>> mo129568b(InfoStickerEffect infoStickerEffect) {
        C89219l.m154721d(infoStickerEffect, "");
        AbstractC88979t<R> d = this.f189544d.mo129475a().mo143292d(C84824a.f189545a);
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerStateNewViewModel$a */
    static final class C84824a<T, R> implements AbstractC88434g<C84542j, C20375am<InfoStickerEffect, EnumC84444c, Integer>> {

        /* renamed from: a */
        public static final C84824a f189545a = new C84824a();

        static {
            Covode.recordClassIndex(98807);
        }

        C84824a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C20375am<InfoStickerEffect, EnumC84444c, Integer> apply(C84542j jVar) {
            EnumC84444c cVar;
            C84542j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            InfoStickerEffect infoStickerEffect = jVar2.f188944a;
            int i = C84828c.f189549a[jVar2.f188945b.f188960a.ordinal()];
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
            return new C20375am(infoStickerEffect, cVar, jVar2.f188946c);
        }
    }
}
