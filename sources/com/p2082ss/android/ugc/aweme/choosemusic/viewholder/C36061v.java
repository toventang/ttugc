package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35756b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2470b.AbstractView$OnTouchListenerC35846a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35855a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d.C35857c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2473e.AbstractC35859a;
import com.p2082ss.android.ugc.aweme.choosemusic.utils.C35936b;
import com.p2082ss.android.ugc.aweme.choosemusic.view.SugCompletionView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.v */
public final class C36061v extends RecyclerView.ViewHolder implements AbstractC35859a {

    /* renamed from: a */
    TextView f85177a;

    /* renamed from: b */
    SugCompletionView f85178b;

    /* renamed from: c */
    TuxIconView f85179c;

    /* renamed from: d */
    public C35894an f85180d;

    /* renamed from: e */
    public int f85181e;

    static {
        Covode.recordClassIndex(43309);
    }

    public C36061v(View view, SugCompletionView.AbstractC35955a aVar) {
        super(view);
        this.f85177a = (TextView) view.findViewById(R.id.f4z);
        this.f85178b = (SugCompletionView) view.findViewById(R.id.c06);
        this.f85179c = (TuxIconView) view.findViewById(R.id.bzj);
        this.f85178b.setImageDrawable(C23005c.m43393a(C36063w.f85183a).mo37368a(view.getContext()));
        view.setOnTouchListener(new AbstractView$OnTouchListenerC35846a() {
            /* class com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36061v.C360621 */

            static {
                Covode.recordClassIndex(43310);
            }

            @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2470b.AbstractView$OnTouchListenerC35846a
            /* renamed from: a */
            public final void mo62955a(View view) {
                String str;
                if (!C58001a.m104815a(view, 1200) && C36061v.this.f85180d != null && !TextUtils.isEmpty(C36061v.this.f85180d.getContent())) {
                    int i = C36061v.this.f85181e;
                    C35894an anVar = C36061v.this.f85180d;
                    C35855a a = new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "video_music").mo62961a("words_position", i).mo62963a("words_content", anVar.getContent());
                    if (anVar.getWordRecord() != null) {
                        str = anVar.getWordRecord().getId();
                    } else {
                        str = "";
                    }
                    C39162r.m79460a("trending_words_click", a.mo62963a("group_id", str).mo62963a("creation_id", C35936b.f84815d).mo62964a(anVar.getExtraParam()).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
                    C35890aj ajVar = new C35890aj();
                    ajVar.f84699d = false;
                    ajVar.f84700e = C36061v.this.f85181e;
                    ajVar.f84698c = C36061v.this.f85180d.getContent();
                    ajVar.f84696a = "search_sug";
                    ajVar.f84697b = 3;
                    AbstractC81915c.m141874a(new C35756b(ajVar));
                }
            }
        });
        this.f85178b.setKeyboardDismissHandler(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2473e.AbstractC35859a
    /* renamed from: a */
    public final void mo62966a(C35894an anVar, int i) {
        String str;
        if (anVar != null) {
            this.f85178b.setOnClickListener(new View$OnClickListenerC36064x(this, anVar, i));
            this.f85180d = anVar;
            this.f85181e = i;
            this.f85177a.setText(SearchServiceImpl.m119336t().mo106217f().mo71105a(this.itemView.getContext(), anVar.getContent(), anVar.getHignLightPositions()));
            if (!anVar.isMobShow()) {
                anVar.setMobShow(true);
                C35855a a = new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "video_music").mo62961a("words_position", i).mo62963a("words_content", anVar.getContent());
                if (anVar.getWordRecord() != null) {
                    str = anVar.getWordRecord().getId();
                } else {
                    str = "";
                }
                C39162r.m79460a("trending_words_show", a.mo62963a("group_id", str).mo62963a("creation_id", C35936b.f84815d).mo62964a(anVar.getExtraParam()).mo62963a("new_sug_session_id", C35857c.f84637d).f84633a);
            }
        }
    }
}
