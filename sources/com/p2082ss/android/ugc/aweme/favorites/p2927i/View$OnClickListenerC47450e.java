package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47436b;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.e */
public final class View$OnClickListenerC47450e extends RecyclerView.ViewHolder implements View.OnClickListener, C47434a.AbstractC47435a {

    /* renamed from: a */
    public TextView f110210a;

    /* renamed from: b */
    public ImageView f110211b;

    /* renamed from: c */
    public TextView f110212c;

    /* renamed from: d */
    public RemoteImageView f110213d;

    /* renamed from: e */
    RelativeLayout f110214e;

    /* renamed from: f */
    public ImageView f110215f;

    /* renamed from: g */
    LinearLayout f110216g;

    /* renamed from: h */
    public ProgressBar f110217h;

    /* renamed from: i */
    LinearLayout f110218i;

    /* renamed from: j */
    public TextView f110219j;

    /* renamed from: k */
    RelativeLayout f110220k;

    /* renamed from: l */
    public Music f110221l;

    /* renamed from: m */
    private AbstractC47431e f110222m;

    /* renamed from: n */
    private Context f110223n;

    static {
        Covode.recordClassIndex(56063);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a.AbstractC47435a
    /* renamed from: c */
    public final void mo79706c() {
        boolean z;
        Music music = this.f110221l;
        if (music != null) {
            String mid = music.getMid();
            if (this.f110221l.getMatchedPGCSoundInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            C47434a.m90451a(mid, z);
        }
    }

    /* renamed from: a */
    public final void mo79720a(boolean z) {
        if (z) {
            this.f110220k.setVisibility(0);
            this.f110215f.setImageResource(2131232026);
            this.f110215f.clearAnimation();
            this.f110217h.setVisibility(8);
            return;
        }
        this.f110220k.setVisibility(8);
        this.f110217h.setVisibility(8);
        this.f110215f.setVisibility(0);
        this.f110215f.setImageResource(2131232027);
        this.f110215f.clearAnimation();
    }

    public final void onClick(View view) {
        Music music;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.cno && this.f110221l != null) {
            Context context = view.getContext();
            Music music2 = this.f110221l;
            C47436b.m90457a(context, view, music2, "collection_music", "", C60826d.m110428a(music2.convertToMusicModel(), context, true));
        }
        AbstractC47431e eVar = this.f110222m;
        if (!(eVar == null || (music = this.f110221l) == null)) {
            eVar.mo79580a(this, view, music.convertToMusicModel());
        }
        Music music3 = this.f110221l;
        if (music3 != null) {
            C47434a.m90448a(music3.getMid(), "collection_music", "");
        }
    }

    public View$OnClickListenerC47450e(View view, AbstractC47431e eVar) {
        super(view);
        this.f110210a = (TextView) view.findViewById(R.id.ezz);
        this.f110211b = (ImageView) view.findViewById(R.id.by7);
        this.f110212c = (TextView) view.findViewById(R.id.f3z);
        this.f110213d = (RemoteImageView) view.findViewById(R.id.dqg);
        this.f110214e = (RelativeLayout) view.findViewById(R.id.dlv);
        this.f110215f = (ImageView) view.findViewById(R.id.bzx);
        this.f110216g = (LinearLayout) view.findViewById(R.id.ceu);
        this.f110217h = (ProgressBar) view.findViewById(R.id.d01);
        this.f110218i = (LinearLayout) view.findViewById(R.id.cns);
        this.f110219j = (TextView) view.findViewById(R.id.a7t);
        this.f110220k = (RelativeLayout) view.findViewById(R.id.dlk);
        View findViewById = view.findViewById(R.id.ceu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC47451f(this));
        }
        View findViewById2 = view.findViewById(R.id.dlk);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC47452g(this));
        }
        View findViewById3 = view.findViewById(R.id.cno);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC47453h(this));
        }
        this.f110223n = view.getContext();
        this.f110222m = eVar;
    }
}
