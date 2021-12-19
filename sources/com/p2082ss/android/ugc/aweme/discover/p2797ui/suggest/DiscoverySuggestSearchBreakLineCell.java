package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67724d;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80554hv;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchBreakLineCell */
public final class DiscoverySuggestSearchBreakLineCell extends PowerCell<C42962a> {

    /* renamed from: a */
    private boolean f100164a;

    /* renamed from: b */
    private boolean f100165b;

    /* renamed from: j */
    private final int f100166j = ((int) ((((float) C34723i.m70928b(GlobalContext.getContext())) - C80284by.m139183a(40)) / 2.0f));

    static {
        Covode.recordClassIndex(51084);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchBreakLineCell$a */
    static final class C42955a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f100167a;

        static {
            Covode.recordClassIndex(51085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42955a(int i) {
            super(1);
            this.f100167a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f100167a;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchBreakLineCell$b */
    static final class View$OnClickListenerC42956b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverySuggestSearchBreakLineCell f100168a;

        /* renamed from: b */
        final /* synthetic */ C42962a f100169b;

        static {
            Covode.recordClassIndex(51086);
        }

        View$OnClickListenerC42956b(DiscoverySuggestSearchBreakLineCell discoverySuggestSearchBreakLineCell, C42962a aVar) {
            this.f100168a = discoverySuggestSearchBreakLineCell;
            this.f100169b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100169b.f100184b.mo72860a(this.f100168a.getLayoutPosition(), this.f100169b.f100183a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aue, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C42962a aVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        C42962a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        String word = aVar2.f100183a.getWord();
        if (word == null) {
            word = "";
        }
        int i3 = this.f100166j;
        boolean z3 = true;
        if (aVar2.f100183a.getWordType() != null) {
            z = true;
        } else {
            z = false;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(C80284by.m139183a(13));
        textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41567a));
        StaticLayout staticLayout = new StaticLayout(word, textPaint, i3 - ((int) C80284by.m139183a(20)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = staticLayout.getLineCount();
        float lineWidth = staticLayout.getLineWidth(0);
        float lineWidth2 = staticLayout.getLineWidth(lineCount - 1);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        int a = (int) C80284by.m139183a(i + 20);
        if (lineCount > 1 || lineWidth > ((float) (i3 - a))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f100165b = z2;
        if (lineCount <= 2 && (lineCount <= 1 || lineWidth2 <= ((float) (i3 - a)))) {
            z3 = false;
        }
        this.f100164a = z3;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.alz);
        if (aVar2.f100183a.getWordType() == null || this.f100164a) {
            tuxTextView.setText(aVar2.f100183a.getWord());
        } else {
            C22999a a2 = C23005c.m43393a(new C42955a(C67724d.m119891a(aVar2.f100183a)));
            Context context = tuxTextView.getContext();
            C89219l.m154716b(context, "");
            C23001b a3 = a2.mo37368a(context);
            a3.setBounds(0, 0, (int) C80284by.m139183a(16), (int) C80284by.m139183a(16));
            C80554hv.m139639a(tuxTextView, aVar2.f100183a.getWord(), a3);
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (this.f100165b) {
            i2 = this.f100166j;
        } else {
            i2 = -2;
        }
        layoutParams.width = i2;
        this.itemView.setOnClickListener(new View$OnClickListenerC42956b(this, aVar2));
        this.itemView.setBackgroundResource(R.drawable.bcw);
        aVar2.f100184b.mo72861b(getLayoutPosition(), aVar2.f100183a);
    }
}
