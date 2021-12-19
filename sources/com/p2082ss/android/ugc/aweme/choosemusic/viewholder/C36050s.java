package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.C35754b;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.model.MusicTag;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.s */
public final class C36050s extends AbstractC35998a {
    static {
        Covode.recordClassIndex(43298);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a
    /* renamed from: a */
    public final void mo63151a() {
        this.f85014j.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.viewholder.AbstractC35998a
    /* renamed from: c */
    public final void mo63157c() {
        C35754b bVar = this.f85029y;
        C89219l.m154716b(bVar, "");
        if (TextUtils.equals("search_music", bVar.f84347a)) {
            if (this.f85027w != null) {
                MusicModel musicModel = this.f85027w;
                C89219l.m154716b(musicModel, "");
                if (musicModel.getMusic() != null) {
                    MusicModel musicModel2 = this.f85027w;
                    C89219l.m154716b(musicModel2, "");
                    Music music = musicModel2.getMusic();
                    C89219l.m154716b(music, "");
                    if (music.getMusicTags() != null) {
                        MusicModel musicModel3 = this.f85027w;
                        C89219l.m154716b(musicModel3, "");
                        Music music2 = musicModel3.getMusic();
                        C89219l.m154716b(music2, "");
                        if (music2.getMusicTags().size() > 0) {
                            AbstractC41955b f = SearchServiceImpl.m119336t().mo106217f();
                            RecyclerView recyclerView = this.f85024t;
                            C89219l.m154716b(recyclerView, "");
                            MusicModel musicModel4 = this.f85027w;
                            C89219l.m154716b(musicModel4, "");
                            Music music3 = musicModel4.getMusic();
                            C89219l.m154716b(music3, "");
                            List<MusicTag> musicTags = music3.getMusicTags();
                            C89219l.m154716b(musicTags, "");
                            f.mo71111a(recyclerView, musicTags, new View$OnClickListenerC36051a(this));
                            AbstractC41955b f2 = SearchServiceImpl.m119336t().mo106217f();
                            C35754b bVar2 = this.f85029y;
                            C89219l.m154716b(bVar2, "");
                            String str = bVar2.f84347a;
                            C89219l.m154716b(str, "");
                            f2.mo71115a(str, this.f85027w, getAdapterPosition());
                        }
                    }
                }
            }
            if (this.f85024t != null) {
                RecyclerView recyclerView2 = this.f85024t;
                C89219l.m154716b(recyclerView2, "");
                recyclerView2.setVisibility(8);
                this.f85024t.removeAllViews();
            }
            AbstractC41955b f22 = SearchServiceImpl.m119336t().mo106217f();
            C35754b bVar22 = this.f85029y;
            C89219l.m154716b(bVar22, "");
            String str2 = bVar22.f84347a;
            C89219l.m154716b(str2, "");
            f22.mo71115a(str2, this.f85027w, getAdapterPosition());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.s$a */
    public static final class View$OnClickListenerC36051a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36050s f85160a;

        static {
            Covode.recordClassIndex(43299);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC36051a(C36050s sVar) {
            this.f85160a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C36050s sVar = this.f85160a;
            sVar.mo63152a(sVar.f85019o);
        }
    }

    public C36050s(View view, int i) {
        super(view, i);
    }
}
