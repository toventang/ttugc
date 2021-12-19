package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.b.c */
public final class C60714c extends RecyclerView.AbstractC1350a<C60716a> {

    /* renamed from: a */
    List<RelatedChallengeMusic> f137952a;

    /* renamed from: b */
    public String f137953b;

    /* renamed from: c */
    public Context f137954c;

    /* renamed from: d */
    public String f137955d;

    static {
        Covode.recordClassIndex(71270);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C60716a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m110240a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (C13603b.m24435a((Collection) this.f137952a)) {
            return 0;
        }
        return this.f137952a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.b.c$a */
    public static class C60716a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f137959a;

        /* renamed from: b */
        LinearLayout f137960b;

        static {
            Covode.recordClassIndex(71272);
        }

        C60716a(View view) {
            super(view);
            this.f137959a = (TextView) view.findViewById(R.id.cpq);
            this.f137960b = (LinearLayout) view.findViewById(R.id.dhf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = this.f137952a.get(i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
        }
        return super.getItemViewType(i);
    }

    public C60714c(List<RelatedChallengeMusic> list, Context context) {
        this.f137952a = list;
        this.f137954c = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C60716a aVar, int i) {
        Music music;
        C60716a aVar2 = aVar;
        final int itemViewType = getItemViewType(i);
        final RelatedChallengeMusic relatedChallengeMusic = this.f137952a.get(i);
        if (relatedChallengeMusic != null) {
            if (itemViewType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    aVar2.f137959a.setText(challenge.getChallengeName());
                }
            } else if (itemViewType == 1 && (music = relatedChallengeMusic.music) != null) {
                aVar2.f137959a.setText(music.getMusicName());
            }
            aVar2.f137960b.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60714c.View$OnClickListenerC607151 */

                static {
                    Covode.recordClassIndex(71271);
                }

                public final void onClick(View view) {
                    Challenge challenge;
                    ClickAgent.onClick(view);
                    int i = itemViewType;
                    if (i == 1) {
                        Music music = relatedChallengeMusic.music;
                        if (music == null) {
                            return;
                        }
                        if (MusicService.m81198m().mo69308a(music.convertToMusicModel(), C60714c.this.f137954c, true)) {
                            C39162r.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(C60714c.this.f137955d).setValue(music.getMid()).setJsonObject(new C33743c().mo59976a("host", C60714c.this.f137953b).mo59977a()));
                            SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
                        }
                    } else if (i == 2 && (challenge = relatedChallengeMusic.challenge) != null) {
                        CommerceChallengeServiceImpl.m75741e().mo65383a(challenge);
                        C39162r.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(C60714c.this.f137955d).setValue(challenge.getCid()).setJsonObject(new C33743c().mo59976a("host", C60714c.this.f137953b).mo59977a()));
                        SmartRouter.buildRoute(C60714c.this.f137954c, "//challenge/detail").withParam("aweme_id", "").withParam("id", challenge.getCid()).withParam("extra_challenge_from", "from_related_tag").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", false).open();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m110240a(ViewGroup viewGroup, int i) {
        View a;
        boolean a2;
        MethodCollector.m26663i(4430);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            a = C1764a.m5927a(from, R.layout.vz, viewGroup, false);
        } else {
            a = C1764a.m5927a(from, R.layout.w6, viewGroup, false);
        }
        C60716a aVar = new C60716a(a);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.m26664o(4430);
        return aVar;
    }
}
