package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47436b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.a */
public final class View$OnClickListenerC47439a extends RecyclerView.ViewHolder implements View.OnClickListener, C47434a.AbstractC47435a {

    /* renamed from: a */
    public TextView f110167a;

    /* renamed from: b */
    public RemoteImageView f110168b;

    /* renamed from: c */
    RelativeLayout f110169c;

    /* renamed from: d */
    LinearLayout f110170d;

    /* renamed from: e */
    LinearLayout f110171e;

    /* renamed from: f */
    public TextView f110172f;

    /* renamed from: g */
    public Challenge f110173g;

    /* renamed from: h */
    public Activity f110174h;

    /* renamed from: i */
    public boolean f110175i;

    static {
        Covode.recordClassIndex(56052);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a.AbstractC47435a
    /* renamed from: c */
    public final void mo79706c() {
        Challenge challenge = this.f110173g;
        if (challenge != null) {
            C47434a.m90446a(challenge.getCid());
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view.getId() == R.id.ceu) {
            C47436b.m90456a(this.f110174h, this.f110173g, "collection_tag", "");
            CommerceChallengeServiceImpl.m75741e().mo65391b("favorite_hashtag", this.f110173g.getChallengeName());
        }
    }

    public View$OnClickListenerC47439a(View view) {
        super(view);
        this.f110167a = (TextView) view.findViewById(R.id.a3j);
        this.f110168b = (RemoteImageView) view.findViewById(R.id.dqg);
        this.f110169c = (RelativeLayout) view.findViewById(R.id.dlv);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ceu);
        this.f110170d = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f110171e = (LinearLayout) view.findViewById(R.id.a3i);
        this.f110172f = (TextView) view.findViewById(R.id.f6s);
    }
}
