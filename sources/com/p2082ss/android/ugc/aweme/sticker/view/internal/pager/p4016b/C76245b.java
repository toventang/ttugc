package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75726a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76264b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b */
public final class C76245b implements AbstractC76114a<C84984j, Fragment> {

    /* renamed from: a */
    public final AbstractC75361b f171281a;

    /* renamed from: b */
    public final AbstractC75655o f171282b;

    /* renamed from: c */
    private final C76248c f171283c;

    /* renamed from: d */
    private final AbstractC1204m f171284d;

    static {
        Covode.recordClassIndex(89195);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b$a */
    static final class View$OnClickListenerC76246a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76245b f171285a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryModel f171286b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f171287c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f171288d;

        static {
            Covode.recordClassIndex(89196);
        }

        View$OnClickListenerC76246a(C76245b bVar, EffectCategoryModel effectCategoryModel, ActivityC0945e eVar, AbstractC89171a aVar) {
            this.f171285a = bVar;
            this.f171286b = effectCategoryModel;
            this.f171287c = eVar;
            this.f171288d = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f171285a.f171281a.mo118930b()) {
                this.f171285a.f171281a.mo118928a(this.f171287c, "", 241, this.f171285a.f171281a.mo118927a(), new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b.View$OnClickListenerC76246a.C762471 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC76246a f171289a;

                    static {
                        Covode.recordClassIndex(89197);
                    }

                    {
                        this.f171289a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f171289a.f171285a.f171282b.mo119291c().mo119452a(new C75726a("sticker_category:favorite", null, false, 62));
                        return C89391z.f203057a;
                    }
                });
            } else {
                this.f171288d.invoke();
            }
        }
    }

    public C76245b(AbstractC1204m mVar, AbstractC75361b bVar, AbstractC75655o oVar, StickerPreferences stickerPreferences) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(stickerPreferences, "");
        this.f171284d = mVar;
        this.f171281a = bVar;
        this.f171282b = oVar;
        this.f171283c = new C76248c(mVar, bVar, oVar, stickerPreferences);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    public final AbstractC76268d<Fragment> mo119856a(int i, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(recycledViewPool, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C76264b bVar2 = new C76264b();
        bVar2.mo119972a(i, bVar, aVar, recycledViewPool);
        return bVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.p2082ss.android.ugc.tools.view.style.C84984j mo119857a(androidx.fragment.app.ActivityC0945e r9, com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r10, com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r11, p4600h.p4611f.p4612a.AbstractC89171a r12) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b.mo119857a(androidx.fragment.app.e, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout, h.f.a.a):java.lang.Object");
    }
}
