package com.p2082ss.android.ugc.aweme.favorites.p2919a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47432f;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.View$OnClickListenerC47450e;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60826d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.c */
public final class C47180c extends AbstractC39060f<Music> {

    /* renamed from: a */
    public AbstractC47432f f109812a;

    /* renamed from: b */
    public int f109813b = -1;

    /* renamed from: c */
    private RecyclerView f109814c;

    /* renamed from: d */
    private int f109815d = -1;

    /* renamed from: e */
    private AbstractC47431e f109816e = new AbstractC47431e() {
        /* class com.p2082ss.android.ugc.aweme.favorites.p2919a.C47180c.C471811 */

        static {
            Covode.recordClassIndex(55785);
        }

        /* renamed from: a */
        private static boolean m90358a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47431e
        /* renamed from: a */
        public final void mo79580a(final RecyclerView.ViewHolder viewHolder, View view, final MusicModel musicModel) {
            MethodCollector.m26663i(5686);
            if (musicModel == null || view == null || view.getContext() == null) {
                MethodCollector.m26664o(5686);
                return;
            }
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m90358a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                MethodCollector.m26664o(5686);
                return;
            }
            int id = view.getId();
            if (id != R.id.dlk && id != R.id.dzv) {
                if (id == R.id.ceu) {
                    if (C47180c.this.f109813b == viewHolder.getAdapterPosition()) {
                        if (C47180c.this.f109812a != null) {
                            C47180c.this.mo79579l();
                        }
                    } else if (C47180c.this.f109812a != null) {
                        C47180c.this.mo79579l();
                        if (C60826d.m110428a(musicModel, view.getContext(), true)) {
                            C47180c.this.f109813b = viewHolder.getAdapterPosition();
                            C47180c.this.f109812a.mo79704a(musicModel);
                            View$OnClickListenerC47450e eVar = (View$OnClickListenerC47450e) viewHolder;
                            Animation loadAnimation = AnimationUtils.loadAnimation(eVar.itemView.getContext(), R.anim.da);
                            loadAnimation.setInterpolator(new LinearInterpolator());
                            eVar.f110215f.setImageResource(2131232030);
                            eVar.f110215f.startAnimation(loadAnimation);
                        }
                        C47180c.this.notifyDataSetChanged();
                    }
                    C39162r.m79460a("click_music", new C33744d().mo59983a("enter_from", "collection_music").mo59983a("music_id", musicModel.getMusicId()).f79943a);
                }
                MethodCollector.m26664o(5686);
            } else if (!MusicService.m81198m().mo69308a(musicModel, view.getContext(), true)) {
                MethodCollector.m26664o(5686);
            } else {
                Activity j = C17873f.m33102j();
                if (j == null || j.isFinishing()) {
                    C17867d.m33078a();
                }
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService().mo101685a(new AbstractC63212bb.AbstractC63213a() {
                    /* class com.p2082ss.android.ugc.aweme.favorites.p2919a.C47180c.C471811.C471821 */

                    static {
                        Covode.recordClassIndex(55786);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
                    public final void onSuccess() {
                        if (C47180c.this.f109812a != null && viewHolder != null) {
                            C47180c.this.f109812a.mo79705a(musicModel, viewHolder.getLayoutPosition(), AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                        }
                    }
                });
                MethodCollector.m26664o(5686);
            }
        }
    };

    static {
        Covode.recordClassIndex(55784);
    }

    /* renamed from: l */
    public final void mo79579l() {
        int i = this.f109813b;
        if (i != -1) {
            RecyclerView.ViewHolder f = this.f109814c.mo4451f(i);
            if (f instanceof View$OnClickListenerC47450e) {
                ((View$OnClickListenerC47450e) f).mo79720a(false);
            }
            this.f109813b = -1;
        }
        this.f109812a.mo79703a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f109814c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f109814c = null;
    }

    public C47180c(AbstractC47432f fVar) {
        this.f109812a = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC47450e(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.zv, viewGroup, false), this.f109816e);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        TextView textView;
        String authorName;
        Music music = (Music) mo63369e().get(i);
        View$OnClickListenerC47450e eVar = (View$OnClickListenerC47450e) viewHolder;
        if (i == this.f109813b) {
            z = true;
        } else {
            z = false;
        }
        if (music != null) {
            eVar.f110221l = music;
            if (music.getCoverMedium() != null && music.getCoverMedium().getUrlList() != null && music.getCoverMedium().getUrlList().size() > 0) {
                C34577e.m70608b(eVar.f110213d, eVar.f110221l.getCoverMedium().getUrlList().get(0), -1, -1);
            } else if (music.getCoverThumb() != null && music.getCoverThumb().getUrlList() != null && music.getCoverThumb().getUrlList().size() > 0) {
                C34577e.m70608b(eVar.f110213d, eVar.f110221l.getCoverThumb().getUrlList().get(0), -1, -1);
            } else if (music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0) {
                C34577e.m70591a(eVar.f110213d, 2131232032);
            } else {
                C34577e.m70608b(eVar.f110213d, eVar.f110221l.getCoverLarge().getUrlList().get(0), -1, -1);
            }
            if (eVar.f110221l.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(eVar.f110221l.getMatchedPGCSoundInfo().getMixedAuthor())) {
                textView = eVar.f110212c;
                if (TextUtils.isEmpty(eVar.f110221l.getAuthorName())) {
                    authorName = eVar.itemView.getResources().getString(R.string.h1c);
                } else {
                    authorName = eVar.f110221l.getAuthorName();
                }
            } else {
                textView = eVar.f110212c;
                authorName = eVar.f110221l.getMatchedPGCSoundInfo().getMixedAuthor();
            }
            textView.setText(authorName);
            eVar.f110210a.setText(eVar.f110221l.getMusicName());
            if (TextUtils.isEmpty(eVar.f110221l.getMusicName()) || (!music.isOriginMusic() && !music.isArtistMusic())) {
                eVar.f110211b.setVisibility(8);
            } else {
                eVar.f110211b.setVisibility(0);
            }
            MusicService.m81198m().mo69304a(eVar.f110210a, music);
            if (C16048b.m29633a().mo25421a(true, "remove_15s_cap_music", true)) {
                eVar.f110219j.setText(C60826d.m110423a(eVar.f110221l.getPresenterDuration() * 1000));
            } else {
                eVar.f110219j.setText(C60826d.m110423a(eVar.f110221l.getDuration() * 1000));
            }
            eVar.f110217h.setVisibility(8);
            eVar.mo79720a(z);
            eVar.mo79706c();
        }
    }
}
