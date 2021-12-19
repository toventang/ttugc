package com.bytedance.android.livesdk.rank.impl.ranks.p616b.p617a;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.p613f.C10413b;
import com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a;
import com.bytedance.android.livesdk.rank.impl.view.StarHostView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a */
public final class C10507a extends AbstractC10498a {

    /* renamed from: g */
    public boolean f25296g;

    /* renamed from: h */
    public final boolean f25297h;

    static {
        Covode.recordClassIndex(12082);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$h */
    public final class C10515h extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final LiveTextView f25306a;

        /* renamed from: b */
        public final LiveTextView f25307b;

        /* renamed from: c */
        final StarHostView f25308c;

        /* renamed from: d */
        final StarHostView f25309d;

        /* renamed from: e */
        final StarHostView f25310e;

        /* renamed from: f */
        final /* synthetic */ C10507a f25311f;

        static {
            Covode.recordClassIndex(12090);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$h$b */
        static final class C10518b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C10515h f25315a;

            static {
                Covode.recordClassIndex(12093);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10518b(C10515h hVar) {
                super(0);
                this.f25315a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                mo17350a();
                return C89391z.f203057a;
            }

            /* renamed from: a */
            public final void mo17350a() {
                String str;
                String str2;
                LiveTextView liveTextView = this.f25315a.f25306a;
                if (this.f25315a.f25311f.f25297h) {
                    str = "#161823";
                } else {
                    str = "#E6FFFFFF";
                }
                liveTextView.setTextColor(Color.parseColor(str));
                LiveTextView liveTextView2 = this.f25315a.f25307b;
                if (this.f25315a.f25311f.f25297h) {
                    str2 = "#80161823";
                } else {
                    str2 = "#B3FFFFFF";
                }
                liveTextView2.setTextColor(Color.parseColor(str2));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$h$a */
        static final class C10516a extends AbstractC89220m implements AbstractC89183m<View, Rank, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C10515h f25312a;

            static {
                Covode.recordClassIndex(12091);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10516a(C10515h hVar) {
                super(2);
                this.f25312a = hVar;
            }

            /* renamed from: a */
            public final void mo17348a(View view, final Rank rank) {
                C89219l.m154721d(view, "");
                view.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.bytedance.android.livesdk.rank.impl.ranks.p616b.p617a.C10507a.C10515h.C10516a.View$OnClickListenerC105171 */

                    /* renamed from: a */
                    final /* synthetic */ C10516a f25313a;

                    static {
                        Covode.recordClassIndex(12092);
                    }

                    {
                        this.f25313a = r1;
                    }

                    public final void onClick(View view) {
                        if (rank != null) {
                            this.f25313a.f25312a.f25311f.mo17338a().invoke(rank);
                        }
                    }
                });
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(View view, Rank rank) {
                mo17348a(view, rank);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$h$c */
        static final class C10519c extends AbstractC89220m implements AbstractC89183m<StarHostView, Integer, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C10515h f25316a;

            static {
                Covode.recordClassIndex(12094);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10519c(C10515h hVar) {
                super(2);
                this.f25316a = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(StarHostView starHostView, Integer num) {
                mo17351a(starHostView, num.intValue());
                return C89391z.f203057a;
            }

            /* renamed from: a */
            public final void mo17351a(StarHostView starHostView, int i) {
                C89219l.m154721d(starHostView, "");
                if (this.f25316a.f25311f.f25297h) {
                    if (i == 1) {
                        starHostView.setBackgroundResource(2131234269);
                    } else if (i != 2) {
                        starHostView.setBackgroundResource(2131234273);
                    } else {
                        starHostView.setBackgroundResource(2131234271);
                    }
                } else if (i == 1) {
                    starHostView.setBackgroundResource(2131234270);
                } else if (i != 2) {
                    starHostView.setBackgroundResource(2131234274);
                } else {
                    starHostView.setBackgroundResource(2131234272);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10515h(C10507a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25311f = aVar;
            this.f25306a = (LiveTextView) view.findViewById(R.id.f48);
            this.f25307b = (LiveTextView) view.findViewById(R.id.f47);
            this.f25308c = (StarHostView) view.findViewById(R.id.e6b);
            this.f25309d = (StarHostView) view.findViewById(R.id.e6c);
            this.f25310e = (StarHostView) view.findViewById(R.id.e6d);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$f */
    public static final class C10513f extends AbstractC10498a.C10504e<C89391z> {
        static {
            Covode.recordClassIndex(12088);
        }

        public C10513f() {
            super(5, C89391z.f203057a);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: b */
    public final String mo17341b() {
        return EnumC10345i.HOURLY_RANK.getRankName();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$c */
    public static final class C10510c extends AbstractC10498a.C10504e<AbstractC10498a.C10503d> {
        static {
            Covode.recordClassIndex(12085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10510c(AbstractC10498a.C10503d dVar) {
            super(3, dVar);
            C89219l.m154721d(dVar, "");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$g */
    public static final class C10514g extends AbstractC10498a.C10504e<List<? extends Rank>> {
        static {
            Covode.recordClassIndex(12089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10514g(List<Rank> list) {
            super(7, list);
            C89219l.m154721d(list, "");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$a */
    public static final class C10508a implements CountDownTimerC10428m.AbstractC10429a {

        /* renamed from: a */
        final /* synthetic */ int f25298a;

        /* renamed from: b */
        final /* synthetic */ C10507a f25299b;

        /* renamed from: c */
        final /* synthetic */ CountDownTimerC10428m f25300c;

        static {
            Covode.recordClassIndex(12083);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m.AbstractC10429a
        /* renamed from: a */
        public final void mo17288a() {
        }

        @Override // com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m.AbstractC10429a
        /* renamed from: a */
        public final void mo17289a(long j) {
            boolean z;
            AbstractC10498a.C10504e<?> eVar = this.f25299b.f25274a.get(this.f25298a);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.hourly.HourlyRankListAdapter.HourlyCountDownItem");
            T t = eVar.f25291b;
            int i = (int) (j / 1000);
            t.f25288a = i;
            if (i <= 180) {
                z = true;
            } else {
                z = false;
            }
            t.f25289b = z;
            this.f25299b.notifyItemChanged(this.f25298a);
        }

        C10508a(int i, C10507a aVar, CountDownTimerC10428m mVar) {
            this.f25298a = i;
            this.f25299b = aVar;
            this.f25300c = mVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$b */
    public static final class C10509b<T> implements Comparator {
        static {
            Covode.recordClassIndex(12084);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.getRank()), Integer.valueOf(t2.getRank()));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$d */
    public final class C10511d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final LiveTextView f25301a;

        /* renamed from: b */
        final LiveTextView f25302b;

        /* renamed from: c */
        public final View f25303c;

        /* renamed from: d */
        final /* synthetic */ C10507a f25304d;

        static {
            Covode.recordClassIndex(12086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10511d(C10507a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25304d = aVar;
            this.f25303c = view;
            this.f25301a = (LiveTextView) view.findViewById(R.id.eun);
            this.f25302b = (LiveTextView) view.findViewById(R.id.eup);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.a$e */
    public final class C10512e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C10507a f25305a;

        static {
            Covode.recordClassIndex(12087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10512e(C10507a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25305a = aVar;
            if (!aVar.f25297h) {
                view.findViewById(R.id.amo).setBackgroundColor(C3966y.m9663b((int) R.color.xj));
                C11279p.m20002a((TextView) view.findViewById(R.id.dfn), (int) R.color.xk);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo17337a(ViewGroup viewGroup, int i) {
        int i2;
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            if (this.f25296g) {
                i2 = R.layout.b_5;
            } else {
                i2 = R.layout.b_z;
            }
            View a = C1764a.m5927a(from, i2, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C10511d(this, a);
        } else if (i == 5) {
            View a2 = C1764a.m5927a(from, R.layout.b_6, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new C10512e(this, a2);
        } else if (i != 7) {
            return super.mo17337a(viewGroup, i);
        } else {
            View a3 = C1764a.m5927a(from, R.layout.b_7, viewGroup, false);
            C89219l.m154716b(a3, "");
            return new C10515h(this, a3);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a
    /* renamed from: a */
    public final void mo17339a(RecyclerView.ViewHolder viewHolder, AbstractC10498a.C10504e<?> eVar) {
        Rank rank;
        Rank rank2;
        String valueOf;
        String valueOf2;
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(eVar, "");
        if (viewHolder instanceof C10511d) {
            C10511d dVar = (C10511d) viewHolder;
            T t = eVar.f25291b;
            C89219l.m154721d(t, "");
            if (dVar.f25304d.f25297h) {
                dVar.f25301a.setTextColor(Color.parseColor("#161823"));
                dVar.f25302b.setTextColor(Color.parseColor("#80161823"));
                if (dVar.f25304d.f25296g) {
                    ((LiveTextView) dVar.f25303c.findViewById(R.id.f6b)).setTextColor(Color.parseColor("#161823"));
                }
            } else {
                dVar.f25301a.setTextColor(Color.parseColor("#E6FFFFFF"));
                dVar.f25302b.setTextColor(Color.parseColor("#BFFFFFFF"));
                if (dVar.f25304d.f25296g) {
                    ((LiveTextView) dVar.f25303c.findViewById(R.id.f6b)).setTextColor(Color.parseColor("#E6FFFFFF"));
                }
            }
            LiveTextView liveTextView = dVar.f25301a;
            C89219l.m154716b(liveTextView, "");
            int i = t.f25288a % 3600;
            int i2 = i / 60;
            int i3 = i % 60;
            StringBuilder sb = new StringBuilder();
            if (i2 < 10) {
                valueOf = "0".concat(String.valueOf(i2));
            } else {
                valueOf = String.valueOf(i2);
            }
            StringBuilder append = sb.append(valueOf).append(":");
            if (i3 < 10) {
                valueOf2 = "0".concat(String.valueOf(i3));
            } else {
                valueOf2 = String.valueOf(i3);
            }
            liveTextView.setText(append.append(valueOf2).toString());
            if (t.f25289b) {
                LiveTextView liveTextView2 = dVar.f25301a;
                LiveTextView liveTextView3 = dVar.f25302b;
                C89219l.m154716b(liveTextView3, "");
                liveTextView2.setTextColor(C4079b.m9888a(liveTextView3.getContext(), (int) R.attr.am9));
            }
        } else if (viewHolder instanceof C10515h) {
            C10515h hVar = (C10515h) viewHolder;
            T t2 = eVar.f25291b;
            C89219l.m154721d(t2, "");
            C10515h.C10516a aVar = new C10515h.C10516a(hVar);
            C10515h.C10518b bVar = new C10515h.C10518b(hVar);
            C10515h.C10519c cVar = new C10515h.C10519c(hVar);
            bVar.mo17350a();
            Rank rank3 = null;
            if (!t2.isEmpty()) {
                rank = (Rank) t2.get(0);
            } else {
                rank = null;
            }
            hVar.f25308c.mo17488a(C10413b.m18928a(rank, 1, hVar.f25311f.f25297h));
            StarHostView starHostView = hVar.f25308c;
            C89219l.m154716b(starHostView, "");
            aVar.mo17348a(starHostView, rank);
            StarHostView starHostView2 = hVar.f25308c;
            C89219l.m154716b(starHostView2, "");
            cVar.mo17351a(starHostView2, 1);
            if (t2.size() > 1) {
                rank2 = (Rank) t2.get(1);
            } else {
                rank2 = null;
            }
            hVar.f25309d.mo17488a(C10413b.m18928a(rank2, 2, hVar.f25311f.f25297h));
            StarHostView starHostView3 = hVar.f25309d;
            C89219l.m154716b(starHostView3, "");
            aVar.mo17348a(starHostView3, rank2);
            StarHostView starHostView4 = hVar.f25309d;
            C89219l.m154716b(starHostView4, "");
            cVar.mo17351a(starHostView4, 2);
            if (t2.size() > 2) {
                rank3 = (Rank) t2.get(2);
            }
            hVar.f25310e.mo17488a(C10413b.m18928a(rank3, 3, hVar.f25311f.f25297h));
            StarHostView starHostView5 = hVar.f25310e;
            C89219l.m154716b(starHostView5, "");
            aVar.mo17348a(starHostView5, rank3);
            StarHostView starHostView6 = hVar.f25310e;
            C89219l.m154716b(starHostView6, "");
            cVar.mo17351a(starHostView6, 3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10507a(DataChannel dataChannel, boolean z, List<Rank> list, CountDownTimerC10428m mVar, List<Rank> list2) {
        super(dataChannel, z);
        boolean z2;
        C89219l.m154721d(list, "");
        this.f25297h = z;
        int i = 0;
        if (list2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f25296g = z2;
        if (z2) {
            ArrayList<AbstractC10498a.C10504e<?>> arrayList = this.f25274a;
            if (list2 == null) {
                C89219l.m154715b();
            }
            arrayList.add(new C10514g(C89070n.m154571d((Iterable) list2, 3)));
        }
        List a = C89070n.m154553a((Iterable) list, (Comparator) new C10509b());
        if (mVar != null) {
            int size = this.f25274a.size();
            this.f25274a.add(new C10510c(new AbstractC10498a.C10503d()));
            mVar.f25141a = new C10508a(size, this, mVar);
        }
        if (a.size() > 3 && !this.f25296g) {
            this.f25274a.add(new AbstractC10498a.C10505f(a.subList(0, Math.min(3, a.size()))));
        }
        if (a.size() > 3 && !this.f25296g) {
            i = 3;
        }
        int size2 = a.size();
        while (i < size2) {
            this.f25274a.add(new AbstractC10498a.C10499a((Rank) a.get(i)));
            if (i == 9) {
                this.f25274a.add(new C10513f());
            }
            i++;
        }
    }
}
