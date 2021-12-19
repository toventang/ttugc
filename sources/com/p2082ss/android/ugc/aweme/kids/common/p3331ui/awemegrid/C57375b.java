package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.C57364c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.b */
public final class C57375b extends AbstractC39058d {

    /* renamed from: d */
    public View f130776d;

    /* renamed from: e */
    private RecyclerView.ViewHolder f130777e;

    /* renamed from: f */
    private AbstractC39063h.AbstractC39067a f130778f;

    /* renamed from: g */
    private final String f130779g;

    /* renamed from: h */
    private final AbstractC57367d f130780h;

    /* renamed from: i */
    private final boolean f130781i;

    static {
        Covode.recordClassIndex(67294);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo67813a(AbstractC39063h.AbstractC39067a aVar) {
        super.mo67813a(aVar);
        this.f130778f = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.awemegrid.b$a */
    public static final class C57376a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(67295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57376a(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<? extends Aweme> list) {
        if (list != null) {
            this.f92236l = list;
            notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        MethodCollector.m26663i(8944);
        C89219l.m154721d(viewGroup, "");
        if (this.f130776d != null) {
            if (this.f130777e == null) {
                View view = this.f130776d;
                if (view == null) {
                    C89219l.m154715b();
                }
                View a = C1764a.m5927a(LayoutInflater.from(view.getContext()), R.layout.abq, null, false);
                C89219l.m154716b(a, "");
                FrameLayout frameLayout = (FrameLayout) a.findViewById(R.id.c1z);
                if (frameLayout != null) {
                    frameLayout.addView(view);
                }
                a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.f130777e = new C57376a(a);
            }
            RecyclerView.ViewHolder viewHolder = this.f130777e;
            MethodCollector.m26664o(8944);
            return viewHolder;
        }
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        MethodCollector.m26664o(8944);
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
        if (this.f130776d == null || !(viewHolder instanceof C57376a)) {
            super.mo63355a(viewHolder);
            return;
        }
        AbstractC39063h.C39068b bVar = this.f92249u;
        C89219l.m154716b(bVar, "");
        int i = bVar.f92255b;
        if (i == 0) {
            C57376a aVar = (C57376a) viewHolder;
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            ((TuxStatusView) view.findViewById(R.id.c20)).mo37867a();
            View view2 = aVar.itemView;
            C89219l.m154716b(view2, "");
            TuxStatusView tuxStatusView = (TuxStatusView) view2.findViewById(R.id.c20);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            View view3 = aVar.itemView;
            C89219l.m154716b(view3, "");
            FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.c1z);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(8);
            aVar.itemView.invalidate();
        } else if (i != 1) {
            C57376a aVar2 = (C57376a) viewHolder;
            View view4 = aVar2.itemView;
            C89219l.m154716b(view4, "");
            TuxStatusView tuxStatusView2 = (TuxStatusView) view4.findViewById(R.id.c20);
            C89219l.m154716b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(8);
            View view5 = aVar2.itemView;
            C89219l.m154716b(view5, "");
            FrameLayout frameLayout2 = (FrameLayout) view5.findViewById(R.id.c1z);
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(8);
            aVar2.itemView.invalidate();
            AbstractC39063h.AbstractC39067a aVar3 = this.f130778f;
            if (aVar3 != null) {
                aVar3.mo62679l();
            }
        } else {
            C57376a aVar4 = (C57376a) viewHolder;
            View view6 = aVar4.itemView;
            C89219l.m154716b(view6, "");
            ((TuxStatusView) view6.findViewById(R.id.c20)).setStatus(C79440a.m138170b(new TuxStatusView.C23263c()));
            View view7 = aVar4.itemView;
            C89219l.m154716b(view7, "");
            TuxStatusView tuxStatusView3 = (TuxStatusView) view7.findViewById(R.id.c20);
            C89219l.m154716b(tuxStatusView3, "");
            tuxStatusView3.setVisibility(8);
            View view8 = aVar4.itemView;
            C89219l.m154716b(view8, "");
            FrameLayout frameLayout3 = (FrameLayout) view8.findViewById(R.id.c1z);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            aVar4.itemView.invalidate();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        return C57364c.C57366a.m103977a(viewGroup, this.f130779g, this.f130780h, this.f130781i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C57364c) {
            Aweme aweme = null;
            if (this.f92236l != null && i >= 0) {
                List list = this.f92236l;
                if (list == null) {
                    C89219l.m154715b();
                }
                if (i < list.size()) {
                    List list2 = this.f92236l;
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    aweme = (Aweme) list2.get(i);
                }
            }
            C57364c cVar = (C57364c) viewHolder;
            cVar.mo94629a(aweme);
            cVar.f92234p = true;
        }
    }

    public C57375b(String str, AbstractC57367d dVar, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f130779g = str;
        this.f130780h = dVar;
        this.f130781i = z;
    }
}
