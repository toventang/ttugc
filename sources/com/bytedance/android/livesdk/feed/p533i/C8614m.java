package com.bytedance.android.livesdk.feed.p533i;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.feed.C8584c;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p691g.AbstractC11763d;
import com.bytedance.android.livesdkapi.p691g.AbstractC11764e;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.i.m */
public final class C8614m extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    RecyclerView f21301a;

    /* renamed from: b */
    public List<FeedItem> f21302b;

    /* renamed from: c */
    public Context f21303c;

    /* renamed from: d */
    private BannerSwipeRefreshLayout.AbstractC8469a f21304d;

    static {
        Covode.recordClassIndex(9471);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.feed.i.m$b */
    public class C8616b extends AbstractC10937b<FeedItem> {

        /* renamed from: b */
        private HSImageView f21307b = ((HSImageView) this.itemView.findViewById(R.id.eov));

        /* renamed from: c */
        private TextView f21308c = ((TextView) this.itemView.findViewById(R.id.eoz));

        /* renamed from: d */
        private View f21309d;

        /* renamed from: e */
        private AbstractC11763d f21310e;

        /* renamed from: f */
        private View.OnAttachStateChangeListener f21311f = new View.OnAttachStateChangeListener() {
            /* class com.bytedance.android.livesdk.feed.p533i.C8614m.C8616b.View$OnAttachStateChangeListenerC86171 */

            static {
                Covode.recordClassIndex(9474);
            }

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
            }
        };

        static {
            Covode.recordClassIndex(9473);
        }

        @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
        /* renamed from: a */
        public final void mo14823a() {
            super.mo14823a();
        }

        @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
        /* renamed from: b */
        public final void mo14824b() {
            super.mo14824b();
        }

        /* renamed from: d */
        public static boolean m16873d() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
        /* renamed from: a */
        public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
            FeedItem feedItem2 = feedItem;
            if (feedItem2 != null && (feedItem2.item instanceof Room)) {
                User owner = ((Room) feedItem2.item).getOwner();
                if (owner != null) {
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null && !C13617h.m24465a(avatarThumb.getUrls())) {
                        this.f21307b.setImageURI(avatarThumb.getUrls().get(0));
                    }
                    this.f21308c.setText(owner.getNickName());
                }
                this.f21307b.setVisibility(8);
                this.f21307b.setVisibility(0);
                AbstractC11763d avatarBorderController = ((IHostApp) C6193a.m13435a(IHostApp.class)).avatarBorderController();
                this.f21310e = avatarBorderController;
                if (avatarBorderController != null) {
                    this.f21307b.addOnAttachStateChangeListener(this.f21311f);
                }
                this.itemView.setOnClickListener(new View$OnClickListenerC8619o(this, feedItem2));
            }
        }

        C8616b(ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b80, viewGroup, false));
            MethodCollector.m26663i(1190);
            AbstractC11764e liveCircleView = ((IHostApp) C6193a.m13435a(IHostApp.class)).liveCircleView(viewGroup.getContext());
            if (liveCircleView instanceof View) {
                View view = (View) liveCircleView;
                this.f21309d = view;
                view.setLayoutParams(this.itemView.findViewById(R.id.eow).getLayoutParams());
                int b = (int) C13628n.m24520b(viewGroup.getContext(), 3.0f);
                this.f21309d.setPadding(b, b, b, b);
                ((FrameLayout) this.itemView.findViewById(R.id.eoc)).addView(this.f21309d, 0);
                this.itemView.findViewById(R.id.bia).setVisibility(0);
            }
            MethodCollector.m26664o(1190);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.i.m$a */
    class C8615a extends RecyclerView.AbstractC1350a<AbstractC10937b> {
        static {
            Covode.recordClassIndex(9472);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ AbstractC10937b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m16872a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return C8614m.this.f21302b.size();
        }

        private C8615a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewAttachedToWindow(AbstractC10937b bVar) {
            long id;
            String str;
            super.onViewAttachedToWindow(bVar);
            int position = bVar.getPosition();
            if (position >= 0 && position < C8614m.this.f21302b.size() && C8614m.this.f21302b.get(position) != null && (C8614m.this.f21302b.get(position).item instanceof Room)) {
                Room room = (Room) C8614m.this.f21302b.get(position).item;
                if (room.getOwner() == null) {
                    id = 0;
                } else {
                    id = room.getOwner().getId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(id));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("show_type", "stay");
                hashMap.put("live_type", C11729j.m20684a(room.getStreamType()));
                if (room.isThirdParty) {
                    str = "thirdparty";
                } else {
                    str = "general";
                }
                hashMap.put("streaming_type", str);
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "follow_live");
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", "live");
                hashMap.put("action_type", "click");
                if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                    hashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                }
                String g = C6544e.m13993g();
                if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                    hashMap.put("is_subscribe", "0");
                } else {
                    hashMap.put("is_subscribe", "1");
                }
                hashMap.put("is_return", "0");
                C6501b.C6502a.m13948a("live_show").mo12652a((Map<String, String>) hashMap).mo12655b();
            }
        }

        /* synthetic */ C8615a(C8614m mVar, byte b) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(AbstractC10937b bVar, int i) {
            AbstractC10937b bVar2 = bVar;
            if (i >= 0 && i < C8614m.this.f21302b.size() && C8614m.this.f21302b.get(i) != null) {
                bVar2.mo9329a(C8614m.this.f21302b.get(i), i);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m16872a(C8615a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(2444);
            C8616b bVar = new C8616b(viewGroup);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = bVar.getClass().getName();
            MethodCollector.m26664o(2444);
            return bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 instanceof C8584c) {
            this.f21302b = ((C8584c) feedItem2).f21214a;
            this.f21301a.setAdapter(new C8615a(this, (byte) 0));
        }
    }

    public C8614m(View view, BannerSwipeRefreshLayout.AbstractC8469a aVar) {
        super(view);
        this.f21303c = view.getContext();
        this.f21304d = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.eoy);
        this.f21301a = recyclerView;
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        this.f21301a.setOnTouchListener(new View$OnTouchListenerC8618n(this));
    }
}
