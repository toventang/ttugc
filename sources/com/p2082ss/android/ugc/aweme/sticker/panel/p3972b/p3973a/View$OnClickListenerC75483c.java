package com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.p3973a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.C76401f;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.c */
public final class View$OnClickListenerC75483c extends C76210a<Effect> implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC75474b f169615a;

    /* renamed from: b */
    public final ImageView f169616b;

    /* renamed from: c */
    public AbstractC76397b<Effect> f169617c;

    /* renamed from: d */
    private ObjectAnimator f169618d;

    /* renamed from: e */
    private final SimpleDraweeView f169619e;

    /* renamed from: i */
    private final ImageView f169620i;

    /* renamed from: j */
    private final AbstractC76085a f169621j;

    /* renamed from: k */
    private final AbstractC75655o f169622k;

    /* renamed from: l */
    private final AbstractC76151g f169623l;

    static {
        Covode.recordClassIndex(88405);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.c$b */
    public static final class C75485b implements IIsTagNeedUpdatedListener {
        static {
            Covode.recordClassIndex(88407);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
        }

        C75485b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.c$a */
    static final class RunnableC75484a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75483c f169624a;

        /* renamed from: b */
        final /* synthetic */ Effect f169625b;

        /* renamed from: c */
        final /* synthetic */ int f169626c;

        /* renamed from: d */
        final /* synthetic */ int f169627d;

        static {
            Covode.recordClassIndex(88406);
        }

        RunnableC75484a(View$OnClickListenerC75483c cVar, Effect effect, int i, int i2) {
            this.f169624a = cVar;
            this.f169625b = effect;
            this.f169626c = i;
            this.f169627d = i2;
        }

        public final void run() {
            View view = this.f169624a.itemView;
            C89219l.m154716b(view, "");
            if (view.getParent() != null) {
                this.f169624a.itemView.performClick();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a.c$c */
    static final class C75486c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC75483c f169628a;

        static {
            Covode.recordClassIndex(88408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75486c(View$OnClickListenerC75483c cVar) {
            super(0);
            this.f169628a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f169628a.f169616b.setAlpha(1.0f);
            this.f169628a.f169616b.animate().alpha(0.0f).setDuration(150).start();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m132412a() {
        ObjectAnimator objectAnimator = this.f169618d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f169620i.setRotation(0.0f);
        ImageView imageView = this.f169620i;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        imageView.setImageDrawable(C0643b.m2369a(view.getContext(), 2131231010));
    }

    /* renamed from: a */
    public final void mo119157a(AbstractC76397b<Effect> bVar) {
        C89219l.m154721d(bVar, "");
        this.f169617c = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
    /* renamed from: a */
    public final void mo119158a(boolean z) {
        if (z) {
            this.itemView.setOnTouchListener(new View$OnTouchListenerC75885t(1.1f, 100, this.f169619e));
        } else {
            this.itemView.setOnTouchListener(null);
        }
    }

    public final void onClick(View view) {
        int adapterPosition;
        ClickAgent.onClick(view);
        DATA data = this.f171207f;
        if (data != null && -1 != (adapterPosition = getAdapterPosition())) {
            this.f169617c.mo120098b(new C76401f<>(data, adapterPosition, this.f171209h, false, false, false, null, null, new C75486c(this), 760));
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
        this.f169616b.setAlpha(0.0f);
        if (C75466g.m132364p(effect2)) {
            UrlModel iconUrl = effect2.getIconUrl();
            if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || (str = (String) C89070n.m154583g((List) urlList)) == null)) {
                this.f169619e.setImageAlpha(128);
                C84402a.m145173a(this.f169619e, str);
            }
        } else {
            this.f169619e.setImageResource(2131232474);
        }
        this.f169623l.mo119909a(effect2, new C75485b());
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setContentDescription(effect2.getName());
        int i2 = this.f171209h;
        AbstractC75474b bVar = this.f169615a;
        if (bVar != null && bVar.mo119149a(effect2, i2, i)) {
            this.itemView.post(new RunnableC75484a(this, effect2, i2, i));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.c, java.lang.Integer] */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76210a
    /* renamed from: a */
    public final /* synthetic */ void mo119153a(Effect effect, EnumC84444c cVar, Integer num) {
        String str;
        Effect effect2 = effect;
        C89219l.m154721d(effect2, "");
        C89219l.m154721d(cVar, "");
        String effectId = effect2.getEffectId();
        DATA data = this.f171207f;
        if (data != null) {
            str = data.getEffectId();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) effectId, (Object) str))) {
            int i = C75487d.f169629a[cVar.ordinal()];
            if (i == 1 || i == 2) {
                this.f169620i.setVisibility(0);
            } else if (i == 3) {
                m132412a();
            } else if (i == 4) {
                m132412a();
                AbstractC76085a aVar = this.f169621j;
                if (aVar != null && !aVar.reallyLockedSticker(this.f171207f)) {
                    this.f169616b.setAlpha(0.0f);
                    this.f169616b.animate().alpha(1.0f).setDuration(150).start();
                }
            } else if (i == 5) {
                this.f169620i.setVisibility(0);
                ImageView imageView = this.f169620i;
                View view = this.itemView;
                C89219l.m154716b(view, "");
                imageView.setImageDrawable(C0643b.m2369a(view.getContext(), 2131231011));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f169620i, "rotation", 0.0f, 360.0f);
                ofFloat.setDuration(800L);
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
                this.f169618d = ofFloat;
            }
            if (C75344c.m132149b(this.f169622k, effect2)) {
                this.f169616b.animate().alpha(1.0f).setDuration(150).start();
            } else {
                this.f169616b.animate().alpha(0.0f).setDuration(150).start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC75483c(View view, AbstractC76085a aVar, AbstractC75655o oVar, AbstractC76151g gVar, AbstractC76397b<Effect> bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        this.f169621j = aVar;
        this.f169622k = oVar;
        this.f169623l = gVar;
        this.f169617c = bVar;
        View findViewById = view.findViewById(R.id.bm_);
        C89219l.m154716b(findViewById, "");
        this.f169619e = (SimpleDraweeView) findViewById;
        View findViewById2 = view.findViewById(R.id.bmb);
        C89219l.m154716b(findViewById2, "");
        this.f169620i = (ImageView) findViewById2;
        view.setOnClickListener(this);
        View findViewById3 = view.findViewById(R.id.bm9);
        C89219l.m154716b(findViewById3, "");
        this.f169616b = (ImageView) findViewById3;
    }
}
