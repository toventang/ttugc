package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35898ar;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35756b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35855a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u */
public final class C36055u extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C36056a f85165b = new C36056a((byte) 0);

    /* renamed from: d */
    private static final int f85166d = C34728n.m70946a(48.0d);

    /* renamed from: a */
    public final AbstractC89244h f85167a = C89250i.m154773a((AbstractC89171a) C36060e.f85176a);

    /* renamed from: c */
    private Integer f85168c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u$b */
    public interface AbstractC36057b {
        static {
            Covode.recordClassIndex(43305);
        }

        /* renamed from: a */
        void mo62954a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u$a */
    public static final class C36056a {
        static {
            Covode.recordClassIndex(43304);
        }

        private C36056a() {
        }

        public /* synthetic */ C36056a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u$e */
    static final class C36060e extends AbstractC89220m implements AbstractC89171a<AbstractC41955b> {

        /* renamed from: a */
        public static final C36060e f85176a = new C36060e();

        static {
            Covode.recordClassIndex(43308);
        }

        C36060e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC41955b invoke() {
            return SearchServiceImpl.m119336t().mo106217f();
        }
    }

    static {
        Covode.recordClassIndex(43303);
    }

    /* renamed from: a */
    public final void mo63213a() {
        int i = f85166d;
        Integer num = this.f85168c;
        if (num == null || num.intValue() != i) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            this.f85168c = Integer.valueOf(i);
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36055u(View view) {
        super(view);
        C89219l.m154721d(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eu6);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setMaxLines(2);
        mo63213a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u$d */
    public static final class View$OnClickListenerC36059d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36055u f85172a;

        /* renamed from: b */
        final /* synthetic */ C35894an f85173b;

        /* renamed from: c */
        final /* synthetic */ int f85174c;

        /* renamed from: d */
        final /* synthetic */ AbstractC36057b f85175d;

        static {
            Covode.recordClassIndex(43307);
        }

        public View$OnClickListenerC36059d(C36055u uVar, C35894an anVar, int i, AbstractC36057b bVar) {
            this.f85172a = uVar;
            this.f85173b = anVar;
            this.f85174c = i;
            this.f85175d = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            C36055u uVar = this.f85172a;
            C35894an anVar = this.f85173b;
            int i = this.f85174c;
            this.f85175d.mo62954a(uVar.getAdapterPosition());
            C35836c.m73228g().mo62938a(new MusicSearchHistory(anVar.getContent(), 1));
            C35855a a = new C35855a().mo62963a("action_type", "clear").mo62963a("enter_method", "sug");
            if (anVar.getWordRecord() != null) {
                C35898ar wordRecord = anVar.getWordRecord();
                if (wordRecord == null) {
                    C89219l.m154715b();
                }
                str = wordRecord.getId();
            } else {
                str = "";
            }
            C35855a a2 = a.mo62963a("group_id", str);
            Map<String, String> extraParam = anVar.getExtraParam();
            String str3 = null;
            if (extraParam != null) {
                str2 = extraParam.get("raw_query");
            } else {
                str2 = null;
            }
            C35855a a3 = a2.mo62963a("input_keyword", str2).mo62961a("order", i);
            Map<String, String> extraParam2 = anVar.getExtraParam();
            if (extraParam2 != null) {
                str3 = extraParam2.get("impr_id");
            }
            C39162r.m79460a("search_trending_click", a3.mo62963a("query_id", str3).mo62963a("search_keyword", anVar.getContent()).mo62963a("search_type", "video_music").mo62963a("words_type", "history").mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.u$c */
    public static final class View$OnClickListenerC36058c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36055u f85169a;

        /* renamed from: b */
        final /* synthetic */ C35894an f85170b;

        /* renamed from: c */
        final /* synthetic */ int f85171c;

        static {
            Covode.recordClassIndex(43306);
        }

        public View$OnClickListenerC36058c(C36055u uVar, C35894an anVar, int i) {
            this.f85169a = uVar;
            this.f85170b = anVar;
            this.f85171c = i;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            C35890aj ajVar = new C35890aj();
            ajVar.f84697b = 3;
            ajVar.f84696a = "search_sug";
            ajVar.f84698c = this.f85170b.getContent();
            String str3 = "";
            C89219l.m154716b(ajVar, str3);
            AbstractC81915c.m141874a(new C35756b(ajVar));
            int i = this.f85171c;
            C35894an anVar = this.f85170b;
            C35855a a = new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "video_music").mo62961a("words_position", i).mo62963a("words_content", anVar.getContent());
            if (anVar.getWordRecord() != null) {
                C35898ar wordRecord = anVar.getWordRecord();
                if (wordRecord == null) {
                    C89219l.m154715b();
                }
                str = wordRecord.getId();
            } else {
                str = str3;
            }
            C39162r.m79460a("trending_words_click", a.mo62963a("group_id", str).mo62963a("creation_id", C35936b.f84815d).mo62964a(anVar.getExtraParam()).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
            C35855a a2 = new C35855a().mo62963a("action_type", "search").mo62963a("enter_method", "sug");
            if (anVar.getWordRecord() != null) {
                C35898ar wordRecord2 = anVar.getWordRecord();
                if (wordRecord2 == null) {
                    C89219l.m154715b();
                }
                str3 = wordRecord2.getId();
            }
            C35855a a3 = a2.mo62963a("group_id", str3);
            Map<String, String> extraParam = anVar.getExtraParam();
            String str4 = null;
            if (extraParam != null) {
                str2 = extraParam.get("raw_query");
            } else {
                str2 = null;
            }
            C35855a a4 = a3.mo62963a("input_keyword", str2).mo62961a("order", i);
            Map<String, String> extraParam2 = anVar.getExtraParam();
            if (extraParam2 != null) {
                str4 = extraParam2.get("impr_id");
            }
            C39162r.m79460a("search_trending_click", a4.mo62963a("query_id", str4).mo62963a("search_keyword", anVar.getContent()).mo62963a("search_type", "video_music").mo62963a("words_type", "history").mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
        }
    }
}
