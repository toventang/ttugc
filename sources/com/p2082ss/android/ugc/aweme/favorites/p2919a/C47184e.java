package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.C47464j;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.e */
public final class C47184e extends AbstractC39060f<C75445g> {
    static {
        Covode.recordClassIndex(55788);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C47464j(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9j, viewGroup, false));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C75445g gVar = (C75445g) mo63369e().get(i);
        C47464j jVar = (C47464j) viewHolder;
        jVar.f110265h = gVar;
        jVar.f110259b.setText(gVar.name);
        jVar.f110260c.setText(gVar.ownerName);
        if (gVar.effectSource == 1) {
            C34729o.m70959b(true, jVar.f110261d);
            if (jVar.f110261d != null) {
                jVar.f110261d.setText(R.string.euo);
            }
        } else {
            C34729o.m70959b(false, jVar.f110261d);
        }
        jVar.f110262e.setText(jVar.f110262e.getContext().getString(R.string.dbm, C53437b.m98615a(gVar.userCount)));
        if (gVar.iconUrl == null || gVar.iconUrl.getUrlList() == null || gVar.iconUrl.getUrlList().isEmpty()) {
            C34577e.m70591a(jVar.f110258a, 2131232948);
        } else {
            C34577e.m70608b(jVar.f110258a, gVar.iconUrl.getUrlList().get(0), -1, -1);
        }
        jVar.f110264g.setOnClickListener(new AbstractView$OnClickListenerC80259bp(gVar) {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2927i.C47464j.C474651 */

            /* renamed from: a */
            final /* synthetic */ C75445g f110266a;

            static {
                Covode.recordClassIndex(56078);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                Context context = C47464j.this.f110264g.getContext();
                C75445g gVar = this.f110266a;
                String str = gVar.f169545id;
                C33744d dVar = new C33744d();
                if (!TextUtils.isEmpty("")) {
                    dVar.mo59983a("tab_name", "");
                }
                C39162r.m79460a("click_personal_collection", dVar.mo59983a("enter_from", "collection_prop").mo59983a("content", "prop").mo59983a("prop_id", str).f79943a);
                String str2 = gVar.f169545id;
                C33744d dVar2 = new C33744d();
                if (!TextUtils.isEmpty("")) {
                    dVar2.mo59983a("tab_name", "");
                }
                C39162r.m79460a("enter_prop_detail", dVar2.mo59983a("enter_from", "collection_prop").mo59983a("enter_method", "click_collection_prop").mo59983a("prop_id", str2).f79943a);
                SmartRouter.buildRoute(context, "aweme://stickers/detail").withParam("extra_stickers", C27404ap.m54809a(gVar.f169545id)).open();
            }

            {
                this.f110266a = r2;
            }
        });
        jVar.f110263f.setOnClickListener(new AbstractView$OnClickListenerC80259bp(gVar) {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2927i.C47464j.C474662 */

            /* renamed from: a */
            final /* synthetic */ C75445g f110268a;

            static {
                Covode.recordClassIndex(56079);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                Context context;
                List<String> a;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                if (context == null || !MSAdaptionService.m97895c().mo89375b(context)) {
                    FaceStickerBean.sCurPropSource = "favorite_prop";
                    C60104a.C60105a b = new C60104a.C60105a().mo97710a("prop_page").mo97712b("prop_auto");
                    C89219l.m154721d("prop_collection", "");
                    b.f136993c = "prop_collection";
                    C60104a a2 = b.mo97709a(C47467k.f110270a).mo97711a();
                    if (this.f110268a.children == null || this.f110268a.children.isEmpty()) {
                        a = C27404ap.m54809a(this.f110268a.f169545id);
                    } else {
                        a = this.f110268a.children;
                    }
                    PropReuseServiceImpl.m116994c().mo104484a(C47464j.this.f110263f.getContext(), a, a2, AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                    C47434a.m90445a(2, this.f110268a.f169545id);
                    return;
                }
                Toast makeText = Toast.makeText(context, context.getString(R.string.bed), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }

            {
                this.f110268a = r2;
            }
        });
        jVar.mo79706c();
    }
}
