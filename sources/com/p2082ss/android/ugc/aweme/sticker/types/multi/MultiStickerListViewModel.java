package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76192k;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel */
public final class MultiStickerListViewModel extends StickerListViewModel implements AbstractC33974au, AbstractC76096b {
    static {
        Covode.recordClassIndex(89037);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    /* renamed from: a */
    public final void mo119126a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    /* renamed from: a */
    public final Effect mo119825a(C76401f<Effect> fVar) {
        C89219l.m154721d(fVar, "");
        List<Effect> value = this.f171590l.getValue();
        if (value != null) {
            AbstractC75655o oVar = this.f171593o;
            C89219l.m154716b(value, "");
            int i = fVar.f171623b;
            C89219l.m154721d(oVar, "");
            C89219l.m154721d(value, "");
            if (value.size() >= i) {
                if (i < 0) {
                    i = 0;
                }
                int size = value.size();
                for (int i2 = i + 1; i2 < size; i2++) {
                    if (C75344c.m132151d(oVar, value.get(i2))) {
                        return value.get(i2);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.multi.AbstractC76096b
    /* renamed from: a */
    public final void mo119826a(Effect effect) {
        C89219l.m154721d(effect, "");
        List<String> children = effect.getChildren();
        if (children == null || children.isEmpty()) {
            this.f171591m.setValue(EnumC85026a.EMPTY);
            this.f171590l.setValue(C89086z.INSTANCE);
            return;
        }
        this.f171591m.setValue(EnumC85026a.NONE);
        Map<String, Effect> a = this.f171593o.mo119291c().mo119464j().mo119466a();
        ArrayList arrayList = new ArrayList();
        for (String str : children) {
            Effect effect2 = a.get(str);
            if (effect2 != null) {
                arrayList.add(effect2);
            }
        }
        mo120112a((List<? extends Effect>) arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    /* renamed from: a */
    public final boolean mo119827a(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        if (!z) {
            return C75344c.m132149b(this.f171593o, effect);
        }
        return C75344c.m132150c(this.f171593o, effect);
    }

    public /* synthetic */ MultiStickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar) {
        this(mVar, oVar, dVar, gVar, new C76192k(oVar.mo119291c().mo119459e()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiStickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar, AbstractC76150f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
    }
}
