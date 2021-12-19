package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78241l;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.g */
public final class C78450g extends AbstractC78442a<C78241l> {

    /* renamed from: a */
    public Context f176279a;

    /* renamed from: b */
    public final AbstractC78249a f176280b;

    /* renamed from: c */
    private TextView f176281c;

    /* renamed from: d */
    private TextView f176282d;

    /* renamed from: e */
    private C78241l f176283e;

    static {
        Covode.recordClassIndex(91578);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.g$a */
    static final class View$OnClickListenerC78451a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78450g f176284a;

        /* renamed from: b */
        final /* synthetic */ C78241l f176285b;

        static {
            Covode.recordClassIndex(91579);
        }

        View$OnClickListenerC78451a(C78450g gVar, C78241l lVar) {
            this.f176284a = gVar;
            this.f176285b = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154721d(view, "");
            this.f176284a.f176280b.mo122084a(view, this.f176284a.f176279a, this.f176285b.f175736d);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78442a
    /* renamed from: a */
    public final /* synthetic */ void mo122361a(C78241l lVar) {
        TextView textView;
        C78241l lVar2 = lVar;
        C89219l.m154721d(lVar2, "");
        this.f176283e = lVar2;
        if (lVar2 == null) {
            C89219l.m154710a("mData");
        }
        int i = 4;
        if (lVar2.f175703b) {
            textView = this.f176282d;
            if (textView == null) {
                C89219l.m154710a("mNext");
            }
        } else {
            textView = this.f176282d;
            if (textView == null) {
                C89219l.m154710a("mNext");
            }
            C78241l lVar3 = this.f176283e;
            if (lVar3 == null) {
                C89219l.m154710a("mData");
            }
            if (!lVar3.f175702a) {
                i = 0;
            }
        }
        textView.setVisibility(i);
        TextView textView2 = this.f176281c;
        if (textView2 == null) {
            C89219l.m154710a("mMusicName");
        }
        textView2.setText(lVar2.f175735c);
        TextView textView3 = this.f176282d;
        if (textView3 == null) {
            C89219l.m154710a("mNext");
        }
        textView3.setOnClickListener(new View$OnClickListenerC78451a(this, lVar2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78450g(View view, AbstractC78249a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f176280b = aVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f176279a = context;
        View c = C0792v.m2762c(view, (int) R.id.ezt);
        C89219l.m154716b(c, "");
        this.f176281c = (TextView) c;
        View c2 = C0792v.m2762c(view, (int) R.id.es1);
        C89219l.m154716b(c2, "");
        this.f176282d = (TextView) c2;
    }
}
