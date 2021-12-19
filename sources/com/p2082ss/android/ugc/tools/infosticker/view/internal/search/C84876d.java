package com.p2082ss.android.ugc.tools.infosticker.view.internal.search;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.p4340c.C84407b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.search.d */
public final class C84876d extends AbstractC84686f<InfoStickerEffect> {
    static {
        Covode.recordClassIndex(98867);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f
    /* renamed from: a */
    public final /* synthetic */ void mo114483a(InfoStickerEffect infoStickerEffect) {
        ProviderEffect.StickerBean sticker_info;
        String url;
        UrlModel icon_url;
        List<String> url_list;
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        C89219l.m154721d(infoStickerEffect2, "");
        Integer source = infoStickerEffect2.getSource();
        if (source != null) {
            if (source.intValue() == 1) {
                Effect loki_effect = infoStickerEffect2.getLoki_effect();
                if (loki_effect != null && (icon_url = loki_effect.getIcon_url()) != null && (url_list = icon_url.getUrl_list()) != null && (!url_list.isEmpty())) {
                    C24246a aVar = (C24246a) this.f189208g.getImageView().getHierarchy();
                    C89219l.m154716b(aVar, "");
                    aVar.mo39958a(C24229q.AbstractC24231b.f57454d);
                    CircleDraweeView imageView = this.f189208g.getImageView();
                    com.p2082ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.p2082ss.android.ugc.aweme.base.model.UrlModel();
                    urlModel.setUrlList(url_list);
                    C84407b.m145190a(imageView, urlModel, Bitmap.Config.ARGB_8888);
                }
            } else if (source.intValue() == 2 && (sticker_info = infoStickerEffect2.getSticker().getSticker_info()) != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
                C24246a aVar2 = (C24246a) this.f189208g.getImageView().getHierarchy();
                C89219l.m154716b(aVar2, "");
                aVar2.mo39958a(C24229q.AbstractC24231b.f57454d);
                C84407b.m145191a(this.f189208g.getImageView(), url, Bitmap.Config.ARGB_8888);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84876d(View view, C85037b bVar, AbstractC89187q<? super InfoStickerEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        super(view, bVar, qVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
    }
}
