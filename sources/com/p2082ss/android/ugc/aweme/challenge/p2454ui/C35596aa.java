package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.aa */
public final class C35596aa extends RecyclerView.AbstractC1350a<C35597a> {

    /* renamed from: a */
    Context f83949a;

    /* renamed from: b */
    String f83950b;

    /* renamed from: c */
    String f83951c;

    /* renamed from: d */
    private List<RelatedChallengeMusic> f83952d;

    static {
        Covode.recordClassIndex(42820);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C35597a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m72704a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (C13603b.m24435a((Collection) this.f83952d)) {
            return 0;
        }
        return this.f83952d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.aa$a */
    public static class C35597a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f83953a;

        /* renamed from: b */
        LinearLayout f83954b;

        static {
            Covode.recordClassIndex(42821);
        }

        C35597a(View view) {
            super(view);
            this.f83953a = (TextView) view.findViewById(R.id.cpq);
            this.f83954b = (LinearLayout) view.findViewById(R.id.dhf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = this.f83952d.get(i);
        if (relatedChallengeMusic == null) {
            return super.getItemViewType(i);
        }
        int i2 = relatedChallengeMusic.categoryType;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m72706a(C35597a aVar, Music music) {
        if (music != null) {
            aVar.f83953a.setText(music.getMusicName());
            Context context = this.f83949a;
            if (!MusicService.m81198m().mo69308a(music.convertToMusicModel(), context, true)) {
                aVar.f83954b.setOnClickListener(new View$OnClickListenerC35598ab(this, music));
            } else {
                aVar.f83954b.setOnClickListener(null);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C35597a aVar, int i) {
        C35597a aVar2 = aVar;
        RelatedChallengeMusic relatedChallengeMusic = this.f83952d.get(i);
        if (relatedChallengeMusic != null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 1) {
                m72706a(aVar2, relatedChallengeMusic.music);
            } else if (itemViewType != 2) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    m72706a(aVar2, music);
                    return;
                }
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    m72705a(aVar2, challenge);
                }
            } else {
                m72705a(aVar2, relatedChallengeMusic.challenge);
            }
        }
    }

    /* renamed from: a */
    private void m72705a(C35597a aVar, Challenge challenge) {
        if (challenge != null) {
            aVar.f83953a.setText("#" + challenge.getChallengeName());
            aVar.f83954b.setOnClickListener(new View$OnClickListenerC35599ac(this, challenge));
            C39162r.m79460a("related_tag_show", new C33744d().mo59983a("related_tag_id", challenge.getCid()).mo59983a("tag_id", this.f83950b).f79943a);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m72704a(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(2363);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.layout.w0;
        boolean z = true;
        if (i == 1) {
            i2 = R.layout.w6;
        }
        C35597a aVar = new C35597a(C1764a.m5927a(from, i2, viewGroup, false));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(2363);
        return aVar;
    }

    public C35596aa(Context context, List<RelatedChallengeMusic> list, String str, String str2) {
        this.f83949a = context;
        this.f83952d = list;
        this.f83950b = str;
        this.f83951c = str2;
    }
}
