package com.p2082ss.android.ugc.aweme.sticker.types.multi.p4012a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75658r;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85040c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.b */
public final class C76093b extends AbstractView$OnClickListenerC75488e {

    /* renamed from: e */
    private final AbstractC76151g f170969e;

    static {
        Covode.recordClassIndex(89040);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.b$a */
    public static final class C76094a implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(89041);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
        }

        C76094a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.a.b$b */
    static final class RunnableC76095b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76093b f170970a;

        static {
            Covode.recordClassIndex(89042);
        }

        RunnableC76095b(C76093b bVar) {
            this.f170970a = bVar;
        }

        public final void run() {
            View view = this.f170970a.itemView;
            C89219l.m154716b(view, "");
            if (view.getParent() != null) {
                this.f170970a.itemView.performClick();
            }
        }
    }

    public final void onClick(View view) {
        int adapterPosition;
        int i;
        C89219l.m154721d(view, "");
        DATA data = this.f171207f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            C75658r value = this.f169632c.mo119302n().mo119329f().getValue();
            if (value != null) {
                i = value.f170073a;
            } else {
                i = -1;
            }
            this.f169633d.mo120098b(new C76401f<>(data, adapterPosition, i, false, true, true, null, null, null, 960));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
    /* renamed from: a */
    public final /* synthetic */ void mo119155a(Effect effect, int i) {
        String str;
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        C85037b bVar = this.f169631b;
        List<String> urlList = effect2.getIconUrl().getUrlList();
        if (urlList != null) {
            str = urlList.get(0);
        } else {
            str = null;
        }
        C85040c.m146217a(bVar, str);
        this.f170969e.mo119909a(effect2, new C76094a());
        AbstractC75473a aVar = this.f169630a;
        if (aVar != null && aVar.mo119149a(effect2, this.f171209h, i)) {
            this.itemView.post(new RunnableC76095b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a.AbstractView$OnClickListenerC75488e
    /* renamed from: a */
    public final void mo119153a(Effect effect, EnumC84444c cVar, Integer num) {
        String str;
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        String effectId = effect.getEffectId();
        DATA data = this.f171207f;
        if (data != null) {
            str = data.getEffectId();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) effectId, (Object) str))) {
            mo119162a(cVar, num);
            if (C75344c.m132150c(this.f169632c, effect)) {
                effect.getName();
                getLayoutPosition();
                mo119163b(true);
                return;
            }
            mo119163b(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76093b(View view, C85037b bVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar2) {
        super(view, bVar, oVar, bVar2);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar2, "");
        this.f170969e = gVar;
    }
}
