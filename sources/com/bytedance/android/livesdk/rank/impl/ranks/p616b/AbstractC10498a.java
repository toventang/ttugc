package com.bytedance.android.livesdk.rank.impl.ranks.p616b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10430g;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.view.SinglePrimaryTopView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a */
public abstract class AbstractC10498a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: f */
    public static final C10502c f25273f = new C10502c((byte) 0);

    /* renamed from: a */
    public final ArrayList<C10504e<?>> f25274a = new ArrayList<>();

    /* renamed from: b */
    public int f25275b;

    /* renamed from: c */
    public AbstractC89172b<? super Rank, C89391z> f25276c;

    /* renamed from: d */
    public final DataChannel f25277d;

    /* renamed from: e */
    public final boolean f25278e;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$d */
    public static final class C10503d {

        /* renamed from: a */
        public int f25288a = 0;

        /* renamed from: b */
        public boolean f25289b = false;

        static {
            Covode.recordClassIndex(12078);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10503d)) {
                return false;
            }
            C10503d dVar = (C10503d) obj;
            return this.f25288a == dVar.f25288a && this.f25289b == dVar.f25289b;
        }

        public final int hashCode() {
            int i = this.f25288a * 31;
            boolean z = this.f25289b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public final String toString() {
            return "CountDownData(countdown=" + this.f25288a + ", highlight=" + this.f25289b + ")";
        }
    }

    static {
        Covode.recordClassIndex(12073);
    }

    /* renamed from: a */
    public abstract void mo17339a(RecyclerView.ViewHolder viewHolder, C10504e<?> eVar);

    /* renamed from: b */
    public abstract String mo17341b();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m19033a(this, viewGroup, i);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$c */
    public static final class C10502c {
        static {
            Covode.recordClassIndex(12077);
        }

        private C10502c() {
        }

        public /* synthetic */ C10502c(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f25274a.size();
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: h.f.a.b<? super com.bytedance.android.livesdk.rank.impl.api.model.Rank, h.z>, h.f.a.b<com.bytedance.android.livesdk.rank.impl.api.model.Rank, h.z> */
    /* renamed from: a */
    public final AbstractC89172b<Rank, C89391z> mo17338a() {
        AbstractC89172b bVar = this.f25276c;
        if (bVar == null) {
            C89219l.m154710a("itemClickListener");
        }
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$b */
    public final class C10500b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final LiveTextView f25279a;

        /* renamed from: b */
        final LiveTextView f25280b;

        /* renamed from: c */
        final LiveTextView f25281c;

        /* renamed from: d */
        final ImageView f25282d;

        /* renamed from: e */
        final HSImageView f25283e;

        /* renamed from: f */
        final HSImageView f25284f;

        /* renamed from: g */
        final /* synthetic */ AbstractC10498a f25285g;

        static {
            Covode.recordClassIndex(12075);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$b$a */
        static final class View$OnClickListenerC10501a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Rank f25286a;

            /* renamed from: b */
            final /* synthetic */ C10500b f25287b;

            static {
                Covode.recordClassIndex(12076);
            }

            View$OnClickListenerC10501a(Rank rank, C10500b bVar) {
                this.f25286a = rank;
                this.f25287b = bVar;
            }

            public final void onClick(View view) {
                this.f25287b.f25285g.mo17338a().invoke(this.f25286a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10500b(AbstractC10498a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25285g = aVar;
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.fa1);
            C89219l.m154716b(liveTextView, "");
            this.f25279a = liveTextView;
            LiveTextView liveTextView2 = (LiveTextView) view.findViewById(R.id.de8);
            C89219l.m154716b(liveTextView2, "");
            this.f25280b = liveTextView2;
            LiveTextView liveTextView3 = (LiveTextView) view.findViewById(R.id.ehj);
            C89219l.m154716b(liveTextView3, "");
            this.f25281c = liveTextView3;
            ImageView imageView = (ImageView) view.findViewById(R.id.f__);
            C89219l.m154716b(imageView, "");
            this.f25282d = imageView;
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.by4);
            C89219l.m154716b(hSImageView, "");
            this.f25283e = hSImageView;
            HSImageView hSImageView2 = (HSImageView) view.findViewById(R.id.bss);
            C89219l.m154716b(hSImageView2, "");
            this.f25284f = hSImageView2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$a */
    public static final class C10499a extends C10504e<Rank> {
        static {
            Covode.recordClassIndex(12074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10499a(Rank rank) {
            super(2, rank);
            C89219l.m154721d(rank, "");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$f */
    public static final class C10505f extends C10504e<List<? extends Rank>> {
        static {
            Covode.recordClassIndex(12080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10505f(List<Rank> list) {
            super(1, list);
            C89219l.m154721d(list, "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        return this.f25274a.get(i).f25290a;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$g */
    public final class C10506g extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AbstractC10498a f25292a;

        /* renamed from: b */
        private final SinglePrimaryTopView f25293b;

        /* renamed from: c */
        private final SinglePrimaryTopView f25294c;

        /* renamed from: d */
        private final SinglePrimaryTopView f25295d;

        static {
            Covode.recordClassIndex(12081);
        }

        /* renamed from: a */
        public final void mo17346a(List<Rank> list) {
            int i;
            int i2;
            int i3;
            C89219l.m154721d(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f25292a.mo17340a(it.next());
            }
            SinglePrimaryTopView singlePrimaryTopView = this.f25293b;
            if (this.f25292a.f25278e) {
                i = 2131234402;
            } else {
                i = 2131234403;
            }
            singlePrimaryTopView.setBackground(C3966y.m9665c(i));
            SinglePrimaryTopView singlePrimaryTopView2 = this.f25294c;
            if (this.f25292a.f25278e) {
                i2 = 2131234404;
            } else {
                i2 = 2131234405;
            }
            singlePrimaryTopView2.setBackground(C3966y.m9665c(i2));
            SinglePrimaryTopView singlePrimaryTopView3 = this.f25295d;
            if (this.f25292a.f25278e) {
                i3 = 2131234406;
            } else {
                i3 = 2131234407;
            }
            singlePrimaryTopView3.setBackground(C3966y.m9665c(i3));
            this.f25293b.mo17485a(this.f25292a.mo17341b(), this.f25292a.f25277d, list.get(0), true, this.f25292a.f25278e, this.f25292a.mo17338a());
            this.f25294c.mo17485a(this.f25292a.mo17341b(), this.f25292a.f25277d, list.get(1), false, this.f25292a.f25278e, this.f25292a.mo17338a());
            this.f25295d.mo17485a(this.f25292a.mo17341b(), this.f25292a.f25277d, list.get(2), false, this.f25292a.f25278e, this.f25292a.mo17338a());
            if (this.f25292a.f25278e && list.get(0).getComboBadge() != null && list.get(0).getComboCount() > 1) {
                ViewGroup.LayoutParams layoutParams = this.f25294c.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = null;
                if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                    layoutParams = null;
                }
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    layoutParams3.gravity = 16;
                }
                ViewGroup.LayoutParams layoutParams4 = this.f25295d.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    layoutParams2 = layoutParams4;
                }
                LinearLayout.LayoutParams layoutParams5 = layoutParams2;
                if (layoutParams5 != null) {
                    layoutParams5.gravity = 16;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10506g(AbstractC10498a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25292a = aVar;
            SinglePrimaryTopView singlePrimaryTopView = (SinglePrimaryTopView) view.findViewById(R.id.epf);
            C89219l.m154716b(singlePrimaryTopView, "");
            this.f25293b = singlePrimaryTopView;
            SinglePrimaryTopView singlePrimaryTopView2 = (SinglePrimaryTopView) view.findViewById(R.id.epg);
            C89219l.m154716b(singlePrimaryTopView2, "");
            this.f25294c = singlePrimaryTopView2;
            SinglePrimaryTopView singlePrimaryTopView3 = (SinglePrimaryTopView) view.findViewById(R.id.eph);
            C89219l.m154716b(singlePrimaryTopView3, "");
            this.f25295d = singlePrimaryTopView3;
        }
    }

    /* renamed from: a */
    public final void mo17340a(Rank rank) {
        WeeklyRankRegionInfo weeklyRankRegionInfo;
        String str;
        if (rank.getRoomId() > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "live_detail");
            hashMap.put("enter_method", mo17341b());
            hashMap.put("anchor_id", String.valueOf(rank.getUser().getId()));
            hashMap.put("room_id", String.valueOf(rank.getRoomId()));
            hashMap.put("action_type", "draw");
            hashMap.put("is_return", "0");
            DataChannel dataChannel = this.f25277d;
            if (!(dataChannel == null || (weeklyRankRegionInfo = (WeeklyRankRegionInfo) dataChannel.mo28318b(C10430g.class)) == null)) {
                if (weeklyRankRegionInfo.getCurrentType() == EnumC10367d.VIEWER.getValue()) {
                    str = "user_live_area";
                } else {
                    str = "anchor_live_area";
                }
                hashMap.put("rank_area", str);
            }
            C6501b.C6502a.m13948a("livesdk_live_show").mo12643a(this.f25277d).mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a$e */
    public static class C10504e<T> {

        /* renamed from: a */
        public final int f25290a;

        /* renamed from: b */
        public final T f25291b;

        static {
            Covode.recordClassIndex(12079);
        }

        public C10504e(int i, T t) {
            this.f25290a = i;
            this.f25291b = t;
        }
    }

    public AbstractC10498a(DataChannel dataChannel, boolean z) {
        this.f25277d = dataChannel;
        this.f25278e = z;
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo17337a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_3, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C10500b(this, a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2;
        RecyclerView.ViewHolder viewHolder3;
        int i2;
        long j;
        String scoreDescription;
        Room room;
        C89219l.m154721d(viewHolder, "");
        C10504e<?> eVar = this.f25274a.get(i);
        if (!(viewHolder instanceof C10506g)) {
            viewHolder2 = null;
        } else {
            viewHolder2 = viewHolder;
        }
        C10506g gVar = (C10506g) viewHolder2;
        if (gVar != null) {
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.BaseRankListAdapter.TopItem");
            gVar.mo17346a(eVar.f25291b);
            return;
        }
        if (!(viewHolder instanceof C10500b)) {
            viewHolder3 = null;
        } else {
            viewHolder3 = viewHolder;
        }
        C10500b bVar = (C10500b) viewHolder3;
        if (bVar != null) {
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.ranks.ranklist.BaseRankListAdapter.CommonItem");
            T t = eVar.f25291b;
            C89219l.m154721d(t, "");
            bVar.f25285g.f25275b = Math.max(bVar.f25285g.f25275b, t.getRank());
            bVar.f25285g.mo17340a(t);
            bVar.itemView.setOnClickListener(new C10500b.View$OnClickListenerC10501a(t, bVar));
            LiveTextView liveTextView = bVar.f25280b;
            int rank = t.getRank();
            if (rank == 1) {
                i2 = R.color.xg;
            } else if (rank == 2) {
                i2 = R.color.xh;
            } else if (rank != 3) {
                i2 = R.color.wx;
            } else {
                i2 = R.color.xi;
            }
            liveTextView.setTextColor(C3966y.m9663b(i2));
            liveTextView.setText(String.valueOf(t.getRank()));
            bVar.f25279a.setText(t.getUser().displayId);
            DataChannel dataChannel = bVar.f25285g.f25277d;
            if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
                j = 0;
            } else {
                j = room.getOwnerUserId();
            }
            LiveTextView liveTextView2 = bVar.f25281c;
            if (C89219l.m154714a((Object) bVar.f25285g.mo17341b(), (Object) EnumC10345i.HOURLY_RANK.getRankName())) {
                scoreDescription = C10387b.m18895a().mo17278a(j, t.getScore(), t.getScoreDescription());
            } else {
                scoreDescription = t.getScoreDescription();
            }
            liveTextView2.setText(scoreDescription);
            if (!bVar.f25285g.f25278e) {
                C11279p.m20002a((TextView) bVar.f25279a, (int) R.color.xm);
                C11279p.m20002a((TextView) bVar.f25281c, (int) R.color.xl);
            }
            C7577g.m15571a(bVar.f25282d, t.getUser().getAvatarThumb(), bVar.f25282d.getWidth(), bVar.f25282d.getHeight(), 2131234742);
            if (t.getRoomId() > 0) {
                C3941k.m9600a(bVar.f25284f, 2131234853);
                C3941k.m9607a(bVar.f25283e, "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
                return;
            }
            bVar.f25284f.setImageDrawable(null);
            bVar.f25283e.setImageDrawable(null);
            return;
        }
        C89219l.m154716b(eVar, "");
        mo17339a(viewHolder, eVar);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m19033a(AbstractC10498a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        boolean z = true;
        if (i != 1) {
            viewHolder = aVar.mo17337a(viewGroup, i);
        } else {
            View a = C1764a.m5927a(from, R.layout.b_4, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C10506g(aVar, a);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
