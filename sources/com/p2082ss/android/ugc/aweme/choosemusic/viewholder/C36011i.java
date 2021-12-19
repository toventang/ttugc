package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.i */
public final class C36011i extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public View f85042a;

    static {
        Covode.recordClassIndex(43257);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.i$a */
    public static final class View$OnClickListenerC36012a implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC36012a f85043a = new View$OnClickListenerC36012a();

        static {
            Covode.recordClassIndex(43258);
        }

        View$OnClickListenerC36012a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C35836c g = C35836c.m73228g();
            g.f84593b.clear();
            g.mo62940b();
            g.mo62937a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36011i(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.etq);
        C89219l.m154716b(findViewById, "");
        this.f85042a = findViewById;
    }
}
