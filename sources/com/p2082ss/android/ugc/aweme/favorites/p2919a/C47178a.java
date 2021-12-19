package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.View$OnClickListenerC47439a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.a */
public final class C47178a extends AbstractC39060f<Challenge> {

    /* renamed from: a */
    private Activity f109809a;

    static {
        Covode.recordClassIndex(55782);
    }

    public C47178a(Activity activity) {
        this.f109809a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC47439a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zt, viewGroup, false));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Challenge challenge = (Challenge) mo63369e().get(i);
        View$OnClickListenerC47439a aVar = (View$OnClickListenerC47439a) viewHolder;
        Activity activity = this.f109809a;
        if (challenge != null) {
            aVar.f110174h = activity;
            aVar.f110173g = challenge;
            if (challenge.getCoverItem() != null) {
                C34577e.m70592a(aVar.f110168b, challenge.getCoverItem());
            } else {
                C34577e.m70591a(aVar.f110168b, 2131232031);
            }
            if (CommerceChallengeServiceImpl.m75741e().mo65376a(aVar.f110173g.getChallengeName(), aVar.f110173g.isCommerce(), false) != null) {
                aVar.f110175i = true;
                CommerceChallengeServiceImpl.m75741e().mo65389a(aVar.f110167a.getContext(), aVar.itemView.getResources().getString(R.string.fo5, aVar.f110173g.getChallengeName()), aVar.f110173g.isCommerce(), aVar.f110167a, true, "favorite_hashtag");
            } else {
                aVar.f110175i = false;
                aVar.f110167a.setText(aVar.itemView.getResources().getString(R.string.fo5, aVar.f110173g.getChallengeName()));
            }
            if (challenge.getViewCount() >= 0) {
                i2 = R.string.aac;
            } else {
                i2 = R.string.cp7;
            }
            aVar.f110172f.setText(new C17191a.C17192a().mo27176a(aVar.itemView.getResources(), i2, C53437b.m98615a(challenge.getDisplayCount())).f40973a);
            aVar.mo79706c();
        }
    }
}
