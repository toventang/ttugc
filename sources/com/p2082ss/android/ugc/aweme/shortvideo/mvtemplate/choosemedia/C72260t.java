package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.p4340c.C84407b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.t */
public final class C72260t extends AbstractC84686f<ProviderEffect> {

    /* renamed from: c */
    public static final C72261a f161997c = new C72261a((byte) 0);

    /* renamed from: a */
    public final int f161998a;

    /* renamed from: b */
    public final int f161999b;

    static {
        Covode.recordClassIndex(84925);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.t$a */
    public static final class C72261a {
        static {
            Covode.recordClassIndex(84926);
        }

        private C72261a() {
        }

        public /* synthetic */ C72261a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f
    /* renamed from: a */
    public final /* synthetic */ void mo114483a(ProviderEffect providerEffect) {
        String url;
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(providerEffect2, "");
        ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
            C84407b.m145191a(this.f189208g.getImageView(), url, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72260t(View view, C85037b bVar, AbstractC89187q<? super com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        super(view, bVar, qVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        int a = (int) C84912r.m145930a(context, 1.0f);
        this.f161998a = a;
        this.f161999b = ((C84912r.m145931a(view.getContext()) + 0) / 2) - (a * 2);
    }
}
