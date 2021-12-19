package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.C76275g;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.C84383b;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.a */
public final class C76243a implements AbstractC76114a<C84984j, Fragment> {
    static {
        Covode.recordClassIndex(89193);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.a$a */
    static final class View$OnClickListenerC76244a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76243a f171278a;

        /* renamed from: b */
        final /* synthetic */ EffectCategoryModel f171279b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f171280c;

        static {
            Covode.recordClassIndex(89194);
        }

        View$OnClickListenerC76244a(C76243a aVar, EffectCategoryModel effectCategoryModel, AbstractC89171a aVar2) {
            this.f171278a = aVar;
            this.f171279b = effectCategoryModel;
            this.f171280c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171280c.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    public final AbstractC76268d<Fragment> mo119856a(int i, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(recycledViewPool, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C76275g gVar = new C76275g();
        gVar.mo119972a(i, bVar, aVar, recycledViewPool);
        return gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a
    /* renamed from: a */
    public final /* synthetic */ C84984j mo119857a(ActivityC0945e eVar, EffectCategoryModel effectCategoryModel, TabLayout tabLayout, AbstractC89171a aVar) {
        boolean z;
        List<String> list;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(effectCategoryModel, "");
        C89219l.m154721d(tabLayout, "");
        C89219l.m154721d(aVar, "");
        C84984j a = C84383b.m145134a(eVar);
        String extra = effectCategoryModel.getExtra();
        if (extra == null || C89361p.m154870a((CharSequence) extra)) {
            z = false;
        } else {
            z = new JSONObject(extra).optBoolean("is_show_icon_only");
        }
        UrlModel icon_selected = effectCategoryModel.getIcon_selected();
        if (icon_selected != null) {
            list = icon_selected.getUrl_list();
        } else {
            list = null;
        }
        if (!C84892d.m145850a(list)) {
            com.p2082ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.p2082ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(list);
            a.setImage(urlModel);
        } else {
            a.setImageVisibility(false);
        }
        if (z) {
            a.setTextVisibility(false);
        } else {
            a.setText(effectCategoryModel.getName());
        }
        a.setOnClickListener(new View$OnClickListenerC76244a(this, effectCategoryModel, aVar));
        return a;
    }
}
