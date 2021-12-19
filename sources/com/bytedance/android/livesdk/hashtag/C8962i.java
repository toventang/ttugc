package com.bytedance.android.livesdk.hashtag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3910b;
import com.bytedance.android.live.core.p218f.C3934g;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.hashtag.C8964j;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.i */
public final class C8962i extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public int f22056a = 2;

    /* renamed from: b */
    public AbstractC89172b<? super Room, C89391z> f22057b;

    /* renamed from: c */
    public final DataChannel f22058c;

    /* renamed from: d */
    private List<FeedItem> f22059d = new ArrayList();

    static {
        Covode.recordClassIndex(9854);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m17303a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f22059d.size() + 1;
    }

    public C8962i(DataChannel dataChannel) {
        this.f22058c = dataChannel;
    }

    /* renamed from: a */
    public final void mo15198a(List<? extends FeedItem> list) {
        C89219l.m154721d(list, "");
        this.f22059d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i + 1 == getItemCount()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.i$a */
    public static final class C8963a extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ RecyclerView.AbstractC1362i f22060e;

        /* renamed from: f */
        final /* synthetic */ C8962i f22061f;

        static {
            Covode.recordClassIndex(9855);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (this.f22061f.getItemViewType(i) == 1) {
                return ((GridLayoutManager) this.f22060e).f4316b;
            }
            return 1;
        }

        C8963a(RecyclerView.AbstractC1362i iVar, C8962i iVar2) {
            this.f22060e = iVar;
            this.f22061f = iVar2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo4320a(new C8963a(layoutManager, this));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m17303a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(1318);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b62, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C8964j(a2);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b97, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C8932c(a3);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
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
        MethodCollector.m26664o(1318);
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        long userCount;
        List<String> urls;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C8964j) {
            C8964j jVar = (C8964j) viewHolder;
            Room room = this.f22059d.get(i).getRoom();
            AbstractC89172b<? super Room, C89391z> bVar = this.f22057b;
            if (bVar == null) {
                C89219l.m154710a("onClickListener");
            }
            C89219l.m154721d(bVar, "");
            if (room != null) {
                ImageModel cover = room.getCover();
                if (cover == null) {
                    z = true;
                } else {
                    z = false;
                }
                String str = null;
                if (z || cover == null || (urls = cover.getUrls()) == null || urls.isEmpty()) {
                    jVar.f22062a.setActualImageResource(2131234388);
                    jVar.f22065d.setVisibility(8);
                    jVar.f22066e.setVisibility(8);
                } else {
                    C3951p.m9631b(jVar.f22062a, cover, 2131234388, 0);
                }
                String title = room.getTitle();
                if (title != null) {
                    jVar.f22063b.setText(C3934g.m9583a("%s", title));
                }
                LiveTextView liveTextView = jVar.f22064c;
                if (room.getStatus() == 4) {
                    userCount = 0;
                } else {
                    userCount = (long) room.getUserCount();
                }
                liveTextView.setText(C3910b.m9544b(userCount));
                jVar.itemView.setOnClickListener(new C8964j.View$OnClickListenerC8965a(room, jVar, bVar));
                C89219l.m154721d(room, "");
                C6501b a = C6501b.C6502a.m13948a("livesdk_live_show").mo12639a().mo12661f("click").mo12651a("enter_from_merge", "live_detail").mo12651a("enter_method", "hashtag");
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    str = hashtag.title;
                }
                a.mo12651a("hash_type", str).mo12651a("is_return", "0").mo12655b();
            }
        } else if (viewHolder instanceof C8932c) {
            C8932c cVar = (C8932c) viewHolder;
            int i2 = this.f22056a;
            if (i2 == 1) {
                cVar.f22008a.setVisibility(0);
            } else if (i2 == 2) {
                cVar.f22008a.setVisibility(4);
            } else if (i2 == 3) {
                cVar.f22008a.setVisibility(8);
            }
        }
    }
}
