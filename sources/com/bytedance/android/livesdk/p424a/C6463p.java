package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p405s.AbstractC6100b;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.recyclerview.AbstractC6235a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.p499ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.event.C8462o;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.p643ui.C10938c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.p */
public final class C6463p extends C10935a {

    /* renamed from: e */
    public static final C6464a f16080e = new C6464a((byte) 0);

    /* renamed from: a */
    public int f16081a;

    /* renamed from: b */
    public int f16082b;

    /* renamed from: c */
    public boolean f16083c;

    /* renamed from: d */
    public C6421d f16084d;

    /* renamed from: f */
    private int f16085f;

    /* renamed from: g */
    private int f16086g;

    /* renamed from: h */
    private String f16087h;

    /* renamed from: i */
    private String f16088i;

    /* renamed from: j */
    private long f16089j;

    /* renamed from: k */
    private final C6468e f16090k = new C6468e(this);

    /* renamed from: l */
    private final AbstractC6235a.AbstractC6237a f16091l = new C6469f(this);

    /* renamed from: m */
    private HashMap f16092m;

    static {
        Covode.recordClassIndex(7199);
    }

    /* renamed from: a */
    public final View mo12601a(int i) {
        if (this.f16092m == null) {
            this.f16092m = new HashMap();
        }
        View view = (View) this.f16092m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16092m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$a */
    public static final class C6464a {
        static {
            Covode.recordClassIndex(7200);
        }

        private C6464a() {
        }

        public /* synthetic */ C6464a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$e */
    public static final class C6468e implements AbstractC6100b, AbstractC6101c {

        /* renamed from: a */
        final /* synthetic */ C6463p f16096a;

        static {
            Covode.recordClassIndex(7204);
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6100b
        /* renamed from: a */
        public final void mo11963a(boolean z, Exception exc) {
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6100b
        /* renamed from: b */
        public final void mo11965b(boolean z) {
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6100b
        /* renamed from: a */
        public final void mo11962a() {
            m13859e();
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6101c
        /* renamed from: c */
        public final void mo11762c() {
            m13859e();
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6100b
        /* renamed from: d */
        public final void mo11966d() {
            m13860f();
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6101c
        /* renamed from: k_ */
        public final void mo11763k_() {
            m13860f();
        }

        /* renamed from: e */
        private final void m13859e() {
            C6421d dVar;
            if (!this.f16096a.isViewValid() || (dVar = this.f16096a.f16084d) == null) {
                return;
            }
            if (dVar.mo12221c() == 0) {
                ((LoadingStatusView) this.f16096a.mo12601a(R.id.dn5)).setStatus(0);
            } else {
                dVar.mo12213a();
            }
        }

        /* renamed from: f */
        private final void m13860f() {
            C6421d dVar;
            if (!this.f16096a.isViewValid() || (dVar = this.f16096a.f16084d) == null) {
                return;
            }
            if (dVar.mo12221c() == 0) {
                ((LoadingStatusView) this.f16096a.mo12601a(R.id.dn5)).mo12206a();
            } else {
                dVar.mo12215b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6468e(C6463p pVar) {
            this.f16096a = pVar;
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6100b
        /* renamed from: b */
        public final void mo11964b(C6099c cVar, Exception exc) {
            m13858c(cVar, exc);
        }

        @Override // com.bytedance.android.live.p405s.AbstractC6101c
        /* renamed from: a */
        public final void mo11758a(C6099c cVar, Exception exc) {
            m13858c(cVar, exc);
        }

        /* renamed from: c */
        private final void m13858c(C6099c cVar, Exception exc) {
            if (!this.f16096a.isViewValid() || this.f16096a.f16084d == null) {
                return;
            }
            if (exc != null || cVar == null || cVar.f14684b == null) {
                C6421d dVar = this.f16096a.f16084d;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                if (dVar.getItemCount() == 0) {
                    ((LoadingStatusView) this.f16096a.mo12601a(R.id.dn5)).setStatus(2);
                    this.f16096a.f16082b = 0;
                }
                C11264f.m19957a(this.f16096a.getContext(), exc);
                return;
            }
            this.f16096a.f16083c = cVar.f14685c.hasMore;
            if (!this.f16096a.f16083c) {
                C6421d dVar2 = this.f16096a.f16084d;
                if (dVar2 == null) {
                    C89219l.m154715b();
                }
                dVar2.f15998d = false;
                C6421d dVar3 = this.f16096a.f16084d;
                if (dVar3 == null) {
                    C89219l.m154715b();
                }
                dVar3.f15608b = false;
            }
            List list = cVar.f14684b;
            if (list == null || list.size() <= 0) {
                ((LoadingStatusView) this.f16096a.mo12601a(R.id.dn5)).setStatus(1);
                return;
            }
            C6421d dVar4 = this.f16096a.f16084d;
            if (dVar4 == null) {
                C89219l.m154715b();
            }
            dVar4.mo12580a(list);
            C6421d dVar5 = this.f16096a.f16084d;
            if (dVar5 == null) {
                C89219l.m154715b();
            }
            dVar5.notifyDataSetChanged();
            if (2 == this.f16096a.f16081a) {
                LiveTextView liveTextView = (LiveTextView) this.f16096a.mo12601a(R.id.dn4);
                if (liveTextView != null) {
                    C11279p.m20017b(liveTextView);
                    return;
                }
                return;
            }
            LiveTextView liveTextView2 = (LiveTextView) this.f16096a.mo12601a(R.id.dn4);
            if (liveTextView2 != null) {
                C11279p.m20006a(liveTextView2);
            }
        }
    }

    /* renamed from: c */
    private static boolean m13851c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16092m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$f */
    static final class C6469f implements AbstractC6235a.AbstractC6237a {

        /* renamed from: a */
        final /* synthetic */ C6463p f16097a;

        static {
            Covode.recordClassIndex(7205);
        }

        C6469f(C6463p pVar) {
            this.f16097a = pVar;
        }

        @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6235a.AbstractC6237a
        /* renamed from: a */
        public final void mo12217a() {
            if (this.f16097a.f16083c) {
                this.f16097a.f16082b++;
                this.f16097a.mo12603b();
            }
        }
    }

    /* renamed from: d */
    private static boolean m13852d() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean c = m13851c();
        C58029j.f132253e = c;
        return c;
    }

    /* renamed from: b */
    public final void mo12603b() {
        if (TextUtils.equals("activity_kick_out", this.f16088i)) {
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).fetchKickOutList(this.f16090k, this.f16089j, this.f16082b, 20);
        } else {
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).fetchMuteList(this.f16090k, this.f16089j, this.f16082b, 20);
        }
    }

    /* renamed from: a */
    public final void mo12602a() {
        getContext();
        if (!m13852d()) {
            C11226ao.m19882a(getContext(), (int) R.string.edd);
            ((LoadingStatusView) mo12601a(R.id.dn5)).setStatus(2);
            return;
        }
        mo12603b();
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$b */
    static final class View$OnClickListenerC6465b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6463p f16093a;

        static {
            Covode.recordClassIndex(7201);
        }

        View$OnClickListenerC6465b(C6463p pVar) {
            this.f16093a = pVar;
        }

        public final void onClick(View view) {
            this.f16093a.mo12602a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$d */
    public static final class C6467d implements AbstractC6419b {

        /* renamed from: a */
        final /* synthetic */ C6463p f16095a;

        static {
            Covode.recordClassIndex(7203);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6467d(C6463p pVar) {
            this.f16095a = pVar;
        }

        @Override // com.bytedance.android.livesdk.p424a.AbstractC6419b
        /* renamed from: a */
        public final void mo12577a(C6420c cVar) {
            this.f16095a.onEvent(cVar);
        }

        @Override // com.bytedance.android.livesdk.p424a.AbstractC6419b
        /* renamed from: a */
        public final void mo12578a(C8462o oVar) {
            this.f16095a.onEvent(oVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.p$c */
    static final class View$OnClickListenerC6466c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6463p f16094a;

        static {
            Covode.recordClassIndex(7202);
        }

        View$OnClickListenerC6466c(C6463p pVar) {
            this.f16094a = pVar;
        }

        public final void onClick(View view) {
            DataChannel a = C17846f.m33055a(this.f16094a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.GUIDE));
            }
        }
    }

    public final void onEvent(C6420c cVar) {
        if (isViewValid() && cVar != null && !cVar.f15995a) {
            C6421d dVar = this.f16084d;
            if (dVar != null) {
                dVar.mo12579a(cVar.f15996b);
            }
            C6421d dVar2 = this.f16084d;
            if (dVar2 != null && dVar2.getItemCount() == 0) {
                ((LoadingStatusView) mo12601a(R.id.dn5)).setStatus(1);
                LiveTextView liveTextView = (LiveTextView) mo12601a(R.id.dn4);
                if (liveTextView != null) {
                    C11279p.m20006a(liveTextView);
                }
            }
        }
    }

    public final void onEvent(C8462o oVar) {
        if (isViewValid() && oVar != null && !oVar.f20917a) {
            C6421d dVar = this.f16084d;
            if (dVar != null) {
                dVar.mo12579a(oVar.f20918b);
            }
            C6421d dVar2 = this.f16084d;
            if (dVar2 != null && dVar2.getItemCount() == 0) {
                ((LoadingStatusView) mo12601a(R.id.dn5)).setStatus(1);
                LiveTextView liveTextView = (LiveTextView) mo12601a(R.id.dn4);
                if (liveTextView != null) {
                    C11279p.m20006a(liveTextView);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        MethodCollector.m26663i(425);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() == null) {
            MethodCollector.m26664o(425);
            return;
        }
        DataChannel a = C17846f.m33055a(this);
        if (a == null || (room = (Room) a.mo28318b(C9093de.class)) == null) {
            MethodCollector.m26664o(425);
            return;
        }
        User owner = room.getOwner();
        if (owner != null) {
            long id = owner.getId();
            long id2 = room.getId();
            ((LinearLayout) mo12601a(R.id.dn8)).setOnClickListener(new View$OnClickListenerC6466c(this));
            RecyclerView recyclerView = (RecyclerView) mo12601a(R.id.dn3);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) mo12601a(R.id.dn3);
            C89219l.m154716b(recyclerView2, "");
            getContext();
            recyclerView2.setLayoutManager(new SSLinearLayoutManager(1));
            this.f16086g = R.string.e_m;
            int i = this.f16081a;
            if (2 == i) {
                this.f16088i = "activity_banned_talk";
                this.f16085f = R.string.e_l;
                this.f16087h = getString(R.string.e_h);
                C6501b.C6502a.m13948a("livesdk_anchor_mute_list_show").mo12639a().mo12655b();
            } else if (3 == i) {
                this.f16088i = "activity_kick_out";
                this.f16085f = R.string.e_j;
                this.f16087h = getString(R.string.e_a);
                C6501b.C6502a.m13948a("livesdk_anchor_blocked_list_show").mo12639a().mo12655b();
            }
            this.f16084d = new C6421d(getContext(), this.f16088i, id2, id);
            RecyclerView recyclerView3 = (RecyclerView) mo12601a(R.id.dn3);
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setAdapter(this.f16084d);
            C6421d dVar = this.f16084d;
            if (dVar != null) {
                dVar.f15997c = new C6467d(this);
            }
            C6421d dVar2 = this.f16084d;
            if (dVar2 != null) {
                dVar2.f15604a = this.f16091l;
            }
            this.f16082b = 0;
            this.f16089j = id2;
            mo12602a();
            LoadingStatusView loadingStatusView = (LoadingStatusView) mo12601a(R.id.dn5);
            C89219l.m154716b(loadingStatusView, "");
            loadingStatusView.setVisibility(0);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b4f, (ViewGroup) null);
            inflate.setOnClickListener(new View$OnClickListenerC6465b(this));
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C10938c b = new C10938c(context, (byte) 0).mo17798a().mo17799a(getString(this.f16086g)).mo17800b(getString(this.f16085f));
            b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            LoadingStatusView loadingStatusView2 = (LoadingStatusView) mo12601a(R.id.dn5);
            LoadingStatusView.C6234a a2 = LoadingStatusView.C6234a.m13528a(getContext());
            a2.f15602c = b;
            a2.f15603d = inflate;
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            a2.f15601b = new LiveLoadingView(context2);
            loadingStatusView2.setBuilder(a2);
            LiveTextView liveTextView = (LiveTextView) mo12601a(R.id.dn6);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(this.f16087h);
            MethodCollector.m26664o(425);
            return;
        }
        MethodCollector.m26664o(425);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b7_, viewGroup, false);
    }
}
