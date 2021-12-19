package com.bytedance.android.livesdk.rank.impl.ranks.p616b.p618b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshWeeklyRankListSetting;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.p618b.C10539b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a */
public final class C10532a extends AbstractC10498a {

    /* renamed from: g */
    public final boolean f25341g;

    /* renamed from: h */
    public final C10539b f25342h;

    static {
        Covode.recordClassIndex(12107);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$d */
    public static final class C10536d extends AbstractC10498a.C10504e<C89391z> {
        static {
            Covode.recordClassIndex(12111);
        }

        public C10536d() {
            super(6, C89391z.f203057a);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: b */
    public final String mo17341b() {
        return EnumC10345i.WEEKLY_RANK.getRankName();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$e */
    public static final class C10537e implements CountDownTimerC10428m.AbstractC10429a {

        /* renamed from: a */
        final /* synthetic */ C10532a f25347a;

        /* renamed from: b */
        final /* synthetic */ CountDownTimerC10428m f25348b;

        static {
            Covode.recordClassIndex(12112);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m.AbstractC10429a
        /* renamed from: a */
        public final void mo17288a() {
            if (AutoRefreshWeeklyRankListSetting.INSTANCE.getValue()) {
                C10539b bVar = this.f25347a.f25342h;
                C10489c.AbstractC10490a c = bVar.mo17363c();
                RankPage rankPage = bVar.f25325f;
                if (rankPage == null) {
                    C89219l.m154715b();
                }
                c.mo17326a(rankPage.getRankType(), bVar, new C10539b.C10542c(bVar));
            }
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m.AbstractC10429a
        /* renamed from: a */
        public final void mo17289a(long j) {
            AbstractC10498a.C10504e<?> eVar = this.f25347a.f25274a.get(0);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.weekly.WeeklyRankListAdapter.WeeklyCountDownItem");
            T t = eVar.f25291b;
            t.f25288a = (int) (j / 1000);
            t.f25289b = false;
            this.f25347a.notifyItemChanged(0);
        }

        C10537e(C10532a aVar, CountDownTimerC10428m mVar) {
            this.f25347a = aVar;
            this.f25348b = mVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$a */
    public static final class C10533a extends AbstractC10498a.C10504e<AbstractC10498a.C10503d> {
        static {
            Covode.recordClassIndex(12108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10533a(AbstractC10498a.C10503d dVar) {
            super(4, dVar);
            C89219l.m154721d(dVar, "");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$f */
    public static final class C10538f<T> implements Comparator {
        static {
            Covode.recordClassIndex(12113);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.getRank()), Integer.valueOf(t2.getRank()));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$b */
    public final class C10534b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final LiveTextView f25343a;

        /* renamed from: b */
        final LiveTextView f25344b;

        /* renamed from: c */
        final /* synthetic */ C10532a f25345c;

        static {
            Covode.recordClassIndex(12109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10534b(C10532a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25345c = aVar;
            this.f25343a = (LiveTextView) view.findViewById(R.id.eun);
            this.f25344b = (LiveTextView) view.findViewById(R.id.eup);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.a$c */
    public final class C10535c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C10532a f25346a;

        static {
            Covode.recordClassIndex(12110);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10535c(C10532a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25346a = aVar;
            if (!aVar.f25341g) {
                view.findViewById(R.id.amo).setBackgroundColor(C3966y.m9663b((int) R.color.xj));
                C11279p.m20002a((TextView) view.findViewById(R.id.dfn), (int) R.color.xk);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo17337a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 4) {
            View a = C1764a.m5927a(from, R.layout.b_z, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C10534b(this, a);
        } else if (i != 6) {
            return super.mo17337a(viewGroup, i);
        } else {
            View a2 = C1764a.m5927a(from, R.layout.baa, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new C10535c(this, a2);
        }
    }

    /* renamed from: a */
    public final void mo17368a(List<Rank> list, CountDownTimerC10428m mVar) {
        List a;
        if (list != null && (a = C89070n.m154553a((Iterable) list, (Comparator) new C10538f())) != null) {
            this.f25274a.clear();
            if (mVar != null) {
                this.f25274a.add(new C10533a(new AbstractC10498a.C10503d()));
                mVar.f25141a = new C10537e(this, mVar);
            }
            int i = 0;
            if (a.size() > 3) {
                this.f25274a.add(new AbstractC10498a.C10505f(a.subList(0, Math.min(3, a.size()))));
            }
            if (a.size() > 3) {
                i = 3;
            }
            int size = a.size();
            while (i < size) {
                this.f25274a.add(new AbstractC10498a.C10499a((Rank) a.get(i)));
                if (i == 19) {
                    this.f25274a.add(new C10536d());
                }
                i++;
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: a */
    public final void mo17339a(RecyclerView.ViewHolder viewHolder, AbstractC10498a.C10504e<?> eVar) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(eVar, "");
        if (!(viewHolder instanceof C10534b)) {
            viewHolder = null;
        }
        C10534b bVar = (C10534b) viewHolder;
        if (bVar != null) {
            T t = eVar.f25291b;
            C89219l.m154721d(t, "");
            if (!bVar.f25345c.f25341g) {
                C11279p.m20002a((TextView) bVar.f25343a, (int) R.color.xm);
                C11279p.m20002a((TextView) bVar.f25344b, (int) R.color.xl);
            }
            LiveTextView liveTextView = bVar.f25343a;
            C89219l.m154716b(liveTextView, "");
            int i = t.f25288a;
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 % 3600;
            String a = C3966y.m9660a((int) R.string.drp, Integer.valueOf(i2), Integer.valueOf(i3 / 3600), Integer.valueOf(i4 / 60), Integer.valueOf(i4 % 60));
            C89219l.m154716b(a, "");
            liveTextView.setText(a);
            if (t.f25289b) {
                LiveTextView liveTextView2 = bVar.f25343a;
                LiveTextView liveTextView3 = bVar.f25344b;
                C89219l.m154716b(liveTextView3, "");
                liveTextView2.setTextColor(C4079b.m9888a(liveTextView3.getContext(), (int) R.attr.am9));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10532a(DataChannel dataChannel, boolean z, List<Rank> list, CountDownTimerC10428m mVar, C10539b bVar) {
        super(dataChannel, z);
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f25341g = z;
        this.f25342h = bVar;
        mo17368a(list, mVar);
    }
}
