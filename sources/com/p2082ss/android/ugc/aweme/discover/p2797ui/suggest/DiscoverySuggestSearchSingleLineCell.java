package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchSingleLineCell */
public final class DiscoverySuggestSearchSingleLineCell extends PowerCell<C42963b> {

    /* renamed from: a */
    private final int f100170a = ((C34723i.m70928b(GlobalContext.getContext()) * 2) / 3);

    static {
        Covode.recordClassIndex(51087);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.DiscoverySuggestSearchSingleLineCell$a */
    static final class View$OnClickListenerC42957a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverySuggestSearchSingleLineCell f100171a;

        /* renamed from: b */
        final /* synthetic */ C42963b f100172b;

        static {
            Covode.recordClassIndex(51088);
        }

        View$OnClickListenerC42957a(DiscoverySuggestSearchSingleLineCell discoverySuggestSearchSingleLineCell, C42963b bVar) {
            this.f100171a = discoverySuggestSearchSingleLineCell;
            this.f100172b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100172b.f100187c.mo72860a(this.f100171a.getLayoutPosition(), this.f100172b.f100185a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.auf, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C42963b bVar) {
        boolean z;
        int i;
        int i2;
        C42963b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aly);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(bVar2.f100185a.getWord());
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int i3 = 0;
        if (bVar2.f100186b != 0) {
            i2 = -1;
        } else {
            String word = bVar2.f100185a.getWord();
            if (word == null) {
                word = "";
            }
            int i4 = this.f100170a;
            if (bVar2.f100185a.getWordType() != null) {
                z = true;
            } else {
                z = false;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(C80284by.m139183a(13));
            textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41567a));
            if (z) {
                i = 18;
            } else {
                i = 0;
            }
            if (textPaint.measureText(word) + C80284by.m139183a(i + 20) > ((float) i4)) {
                i2 = this.f100170a;
            } else {
                i2 = -2;
            }
        }
        layoutParams.width = i2;
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxIconView tuxIconView = (TuxIconView) view3.findViewById(R.id.am0);
        C89219l.m154716b(tuxIconView, "");
        if (bVar2.f100185a.getWordType() == null) {
            i3 = 8;
        }
        tuxIconView.setVisibility(i3);
        this.itemView.setOnClickListener(new View$OnClickListenerC42957a(this, bVar2));
        this.itemView.setBackgroundResource(R.drawable.bcw);
        bVar2.f100187c.mo72861b(getLayoutPosition(), bVar2.f100185a);
    }
}
