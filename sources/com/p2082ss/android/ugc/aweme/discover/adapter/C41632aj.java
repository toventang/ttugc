package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67550h;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aj */
public final class C41632aj extends AbstractView$OnAttachStateChangeListenerC41671b implements AbstractC41728j {

    /* renamed from: h */
    public static final C41634a f97099h = new C41634a((byte) 0);

    /* renamed from: a */
    final TextView f97100a;

    /* renamed from: b */
    final ViewGroup f97101b;

    /* renamed from: c */
    final View f97102c;

    /* renamed from: d */
    final View f97103d;

    /* renamed from: e */
    final Space f97104e;

    /* renamed from: f */
    public SearchMusic f97105f;

    /* renamed from: g */
    String f97106g;

    /* renamed from: i */
    private final AbstractC41728j f97107i;

    static {
        Covode.recordClassIndex(49545);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aj$a */
    public static final class C41634a {
        static {
            Covode.recordClassIndex(49547);
        }

        private C41634a() {
        }

        public /* synthetic */ C41634a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo60336a() {
        String str;
        C67511b o = new C67550h().mo106459o("search_result");
        SearchMusic searchMusic = this.f97105f;
        if (searchMusic == null) {
            C89219l.m154715b();
        }
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C89219l.m154715b();
        }
        C67511b c = o.mo106452c("music_num", String.valueOf(musicList.size()));
        SearchMusic searchMusic2 = this.f97105f;
        if (searchMusic2 == null) {
            C89219l.m154715b();
        }
        C67511b c2 = c.mo106452c("music_list", m83585a(searchMusic2));
        SearchMusic searchMusic3 = this.f97105f;
        if (searchMusic3 == null) {
            C89219l.m154715b();
        }
        if (searchMusic3.getHasMore()) {
            str = "1";
        } else {
            str = "0";
        }
        C67540c b = ((C67540c) c2.mo106452c("is_more_sounds", str)).mo106482b(this.f97106g);
        C48027ac acVar = C48027ac.C48028a.f111257a;
        SearchMusic searchMusic4 = this.f97105f;
        if (searchMusic4 == null) {
            C89219l.m154715b();
        }
        List<Music> musicList2 = searchMusic4.getMusicList();
        if (musicList2 == null) {
            C89219l.m154715b();
        }
        b.mo106483c(acVar.mo80055a(musicList2.get(0).getRequestId())).mo96792f();
    }

    /* renamed from: a */
    static String m83585a(SearchMusic searchMusic) {
        StringBuilder sb = new StringBuilder();
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C89219l.m154715b();
        }
        Iterator<T> it = musicList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMid()).append(",");
        }
        C89361p.m154894a((CharSequence) sb, (CharSequence) ",");
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41728j
    /* renamed from: a */
    public final int mo70825a(Music music) {
        C89219l.m154721d(music, "");
        AbstractC41728j jVar = this.f97107i;
        SearchMusic searchMusic = this.f97105f;
        if (searchMusic == null) {
            C89219l.m154715b();
        }
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C89219l.m154715b();
        }
        int a = jVar.mo70825a((Music) C89070n.m154579f((List) musicList));
        SearchMusic searchMusic2 = this.f97105f;
        if (searchMusic2 == null) {
            C89219l.m154715b();
        }
        List<Music> musicList2 = searchMusic2.getMusicList();
        if (musicList2 == null) {
            C89219l.m154715b();
        }
        return a + musicList2.indexOf(music);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41632aj(View view, AbstractC41728j jVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(jVar, "");
        this.f97107i = jVar;
        View findViewById = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById, "");
        this.f97100a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById2, "");
        this.f97101b = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.fei);
        C89219l.m154716b(findViewById3, "");
        this.f97102c = findViewById3;
        View findViewById4 = view.findViewById(R.id.ekp);
        C89219l.m154716b(findViewById4, "");
        this.f97103d = findViewById4;
        View findViewById5 = view.findViewById(R.id.u6);
        C89219l.m154716b(findViewById5, "");
        this.f97104e = (Space) findViewById5;
        findViewById3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41632aj.View$OnClickListenerC416331 */

            /* renamed from: a */
            final /* synthetic */ C41632aj f97108a;

            static {
                Covode.recordClassIndex(49546);
            }

            {
                this.f97108a = r1;
            }

            public final void onClick(View view) {
                List<Music> musicList;
                ClickAgent.onClick(view);
                SearchMusic searchMusic = this.f97108a.f97105f;
                if (searchMusic != null && (musicList = searchMusic.getMusicList()) != null && !C13603b.m24435a((Collection) musicList)) {
                    int a = this.f97108a.mo70825a((Music) C89070n.m154586h((List) musicList)) + 1;
                    Context G = this.f97108a.mo70878G();
                    String authorName = ((Music) C89070n.m154579f((List) musicList)).getAuthorName();
                    C89219l.m154716b(authorName, "");
                    C89219l.m154721d(G, "");
                    C89219l.m154721d(authorName, "");
                    Intent intent = new Intent(G, MusicianMusicListActivity.class);
                    intent.putExtra("param_music_author", authorName);
                    intent.putExtra("param_holder_postion", a);
                    C84349a.m145093a(intent, G);
                    G.startActivity(intent);
                    this.f97108a.mo60336a();
                }
            }
        });
    }
}
