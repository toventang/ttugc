package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35756b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.t */
public final class C36052t extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TuxTextView f85161a;

    /* renamed from: b */
    public TuxIconView f85162b;

    static {
        Covode.recordClassIndex(43300);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.t$a */
    public static final class View$OnClickListenerC36053a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicSearchHistory f85163a;

        static {
            Covode.recordClassIndex(43301);
        }

        public View$OnClickListenerC36053a(MusicSearchHistory musicSearchHistory) {
            this.f85163a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C35836c.m73228g().mo62938a(this.f85163a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.t$b */
    public static final class View$OnClickListenerC36054b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicSearchHistory f85164a;

        static {
            Covode.recordClassIndex(43302);
        }

        public View$OnClickListenerC36054b(MusicSearchHistory musicSearchHistory) {
            this.f85164a = musicSearchHistory;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C35890aj ajVar = new C35890aj();
            ajVar.f84697b = 2;
            ajVar.f84696a = "search_history";
            ajVar.f84698c = this.f85164a.keyword;
            C89219l.m154716b(ajVar, "");
            AbstractC81915c.m141874a(new C35756b(ajVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36052t(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ex0);
        C89219l.m154716b(findViewById, "");
        this.f85161a = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bu2);
        C89219l.m154716b(findViewById2, "");
        this.f85162b = (TuxIconView) findViewById2;
    }
}
