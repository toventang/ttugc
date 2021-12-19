package com.p2082ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameAddCell */
public final class PlayListNameAddCell extends PowerCell<C59909a> {
    static {
        Covode.recordClassIndex(70317);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ao2, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameAddCell$a */
    static final class View$OnClickListenerC59906a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PlayListNameAddCell f136435a;

        static {
            Covode.recordClassIndex(70318);
        }

        View$OnClickListenerC59906a(PlayListNameAddCell playListNameAddCell) {
            this.f136435a = playListNameAddCell;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            if (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) {
                i = 2;
            } else {
                i = 1;
            }
            IMixFeedService k = MixFeedService.m109435k();
            View view2 = this.f136435a.itemView;
            C89219l.m154716b(view2, "");
            Context context = ((TuxButton) view2).getContext();
            C89219l.m154716b(context, "");
            k.mo97312a(context, new Bundle(), i, "personal_homepage", "profile");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C59909a aVar) {
        C89219l.m154721d(aVar, "");
        Objects.requireNonNull(this.itemView, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((TuxButton) this.itemView).setIconTintColor(((TuxButton) view).getResources().getColor(R.color.bx));
        this.itemView.setOnClickListener(new View$OnClickListenerC59906a(this));
    }
}
