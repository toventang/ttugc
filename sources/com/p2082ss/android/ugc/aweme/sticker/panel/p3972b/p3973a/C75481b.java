package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.C85058m;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85040c;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.b */
public class C75481b extends AbstractView$OnClickListenerC75488e {

    /* renamed from: e */
    private final AbstractC76151g f169614e;

    static {
        Covode.recordClassIndex(88403);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.b$a */
    public static final class C75482a implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(88404);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
        }

        C75482a() {
        }
    }

    public void onClick(View view) {
        int adapterPosition;
        C89219l.m154721d(view, "");
        DATA data = this.f171207f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            AbstractC76397b<Effect> bVar = this.f169633d;
            C89219l.m154721d(data, "");
            bVar.mo120098b(new C76401f<>(data, adapterPosition, this.f171209h, false, false, false, null, null, null, 1008));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
    /* renamed from: a */
    public final /* synthetic */ void mo119155a(Effect effect, int i) {
        List<String> urlList;
        String str;
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        this.f169631b.setText(effect2.getName());
        TextView textView = this.f169631b.getTextView();
        if (!C75344c.m132149b(this.f169632c, effect2) || C75466g.m132368t(effect2)) {
            if (textView instanceof C85058m) {
                ((C85058m) textView).setMarqueeEnable(false);
            }
        } else if (textView instanceof C85058m) {
            ((C85058m) textView).setMarqueeEnable(true);
        }
        UrlModel iconUrl = effect2.getIconUrl();
        if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) C89070n.m154583g((List) urlList)) == null)) {
            C85040c.m146217a(this.f169631b, str);
        }
        this.f169614e.mo119909a(effect2, new C75482a());
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setContentDescription(effect2.getName());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
    /* renamed from: a */
    public final void mo119153a(Effect effect, EnumC84444c cVar, Integer num) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        mo119163b(false);
        mo119162a(cVar, num);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75481b(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar2, "");
        this.f169614e = gVar;
    }
}
