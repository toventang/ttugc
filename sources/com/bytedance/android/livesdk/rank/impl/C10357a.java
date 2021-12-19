package com.bytedance.android.livesdk.rank.impl;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.gift.p544b.C8789a;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.C10342f;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.api.model.C10349c;
import com.bytedance.android.livesdk.rank.api.model.C10350d;
import com.bytedance.android.livesdk.rank.api.model.C10352f;
import com.bytedance.android.livesdk.rank.impl.p608a.C10361b;
import com.bytedance.android.livesdk.rank.impl.p609b.C10379b;
import com.bytedance.android.livesdk.rank.impl.p612e.C10389a;
import com.bytedance.android.livesdk.rank.impl.p613f.C10424l;
import com.bytedance.android.livesdk.rank.impl.p614g.C10431a;
import com.bytedance.android.livesdk.rank.impl.p614g.C10433b;
import com.bytedance.android.livesdk.rank.impl.p614g.C10444d;
import com.bytedance.android.livesdk.rank.impl.p614g.C10454e;
import com.bytedance.android.livesdk.rank.impl.view.C10583a;
import com.bytedance.android.livesdk.rank.impl.view.NoAudienceView;
import com.bytedance.android.livesdk.rank.impl.view.NoNetworkView;
import com.bytedance.android.livesdk.rank.impl.view.SelfRankInfoView;
import com.bytedance.android.livesdk.rank.impl.view.ServerFailView;
import com.bytedance.android.livesdk.rank.impl.view.View$OnClickListenerC10589c;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89397d;

/* renamed from: com.bytedance.android.livesdk.rank.impl.a */
public final class C10357a extends AbstractC11293v implements C10379b.AbstractC10380a, C10379b.AbstractC10382c {

    /* renamed from: b */
    public static final C10358a f25024b = new C10358a((byte) 0);

    /* renamed from: a */
    public C10379b.AbstractC10381b f25025a;

    /* renamed from: c */
    private View f25026c;

    /* renamed from: d */
    private LiveTextView f25027d;

    /* renamed from: e */
    private NoNetworkView f25028e;

    /* renamed from: f */
    private LiveLoadingView f25029f;

    /* renamed from: g */
    private ServerFailView f25030g;

    /* renamed from: h */
    private NoAudienceView f25031h;

    /* renamed from: i */
    private SelfRankInfoView f25032i;

    /* renamed from: j */
    private RecyclerView f25033j;

    /* renamed from: k */
    private EnumC10608a f25034k;

    /* renamed from: l */
    private final long f25035l;

    /* renamed from: m */
    private HashMap f25036m;

    static {
        Covode.recordClassIndex(11925);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f25036m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f25036m == null) {
            this.f25036m = new HashMap();
        }
        View view = (View) this.f25036m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25036m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.a$a */
    public static final class C10358a {
        static {
            Covode.recordClassIndex(11926);
        }

        private C10358a() {
        }

        public /* synthetic */ C10358a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10357a m18851a(EnumC10608a aVar, int i) {
            C89219l.m154721d(aVar, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable(StringSet.type, aVar);
            bundle.putInt("online_count", i);
            C10357a aVar2 = new C10357a((byte) 0);
            aVar2.setArguments(bundle);
            return aVar2;
        }
    }

    /* renamed from: h */
    private static boolean m18839h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: d */
    public final void mo9929d() {
        NoAudienceView noAudienceView = this.f25031h;
        if (noAudienceView != null) {
            noAudienceView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: e */
    public final void mo17149e() {
        ServerFailView serverFailView = this.f25030g;
        if (serverFailView != null) {
            serverFailView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10380a
    /* renamed from: f */
    public final void mo17150f() {
        View view = this.f25026c;
        if (view == null) {
            C89219l.m154710a("mRootView");
        }
        m18838a(view);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: g */
    public final void mo17151g() {
        LiveLoadingView liveLoadingView = this.f25029f;
        if (liveLoadingView != null) {
            liveLoadingView.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C10379b.AbstractC10381b bVar = this.f25025a;
        if (bVar != null) {
            bVar.mo17271b();
        }
        mo8165a();
    }

    private C10357a() {
        this.f25035l = new Date(System.currentTimeMillis()).getTime();
    }

    /* renamed from: j */
    private static boolean m18840j() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean h = m18839h();
        C58029j.f132253e = h;
        return h;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C10342f.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28315b(C10342f.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        boolean z;
        int i;
        int i2;
        Boolean bool;
        int a = C11227ap.m19886a(getContext());
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b83);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        int i3 = 80;
        if (z) {
            i = 80;
        } else {
            i = 8388629;
        }
        bVar.f27020g = i;
        bVar.f27019f = 0.0f;
        if (z) {
            i2 = -1;
        } else {
            i2 = a;
        }
        bVar.f27021h = i2;
        if (z) {
            a = -2;
        }
        bVar.f27022i = a;
        if (!z) {
            i3 = 8388629;
        }
        bVar.f27020g = i3;
        return bVar;
    }

    public /* synthetic */ C10357a(byte b) {
        this();
    }

    /* renamed from: a */
    private final void m18838a(View view) {
        RecyclerView recyclerView = this.f25033j;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        NoNetworkView noNetworkView = this.f25028e;
        if (noNetworkView != null) {
            noNetworkView.setVisibility(8);
        }
        SelfRankInfoView selfRankInfoView = this.f25032i;
        if (selfRankInfoView != null) {
            selfRankInfoView.setVisibility(8);
        }
        ServerFailView serverFailView = this.f25030g;
        if (serverFailView != null) {
            serverFailView.setContainer(this);
            serverFailView.setVisibility(8);
        }
        NoNetworkView noNetworkView2 = this.f25028e;
        if (noNetworkView2 != null) {
            noNetworkView2.getContext();
            if (m18840j()) {
                LiveLoadingView liveLoadingView = (LiveLoadingView) view.findViewById(R.id.cg3);
                liveLoadingView.setVisibility(0);
                this.f25029f = liveLoadingView;
                C10379b.AbstractC10381b bVar = this.f25025a;
                if (bVar != null) {
                    bVar.mo17269a();
                }
            } else {
                noNetworkView2.setContainer(this);
                noNetworkView2.setVisibility(0);
            }
        }
        ((ImageView) view.findViewById(R.id.dbb)).setOnClickListener(new View$OnClickListenerC10359b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.a$b */
    public static final class View$OnClickListenerC10359b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10357a f25037a;

        static {
            Covode.recordClassIndex(11927);
        }

        View$OnClickListenerC10359b(C10357a aVar) {
            this.f25037a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.C10357a.View$OnClickListenerC10359b.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: a */
    public final void mo17147a(List<C10348b> list) {
        C89219l.m154721d(list, "");
        try {
            if (!this.f27009o) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (getContext() != null) {
                C10361b bVar = new C10361b();
                bVar.mo143771a(C10352f.class, new C10583a());
                bVar.mo143771a(C10350d.class, new C10433b(this.f25034k));
                bVar.mo143771a(C10348b.class, new C10444d());
                bVar.mo143771a(C10349c.class, new C10431a());
                C89397d dVar = new C89397d();
                dVar.add(new C10352f());
                dVar.add(new C10350d(list.size(), ""));
                dVar.addAll(list);
                dVar.add(new C10349c());
                bVar.mo17153a(dVar);
                RecyclerView recyclerView = this.f25033j;
                if (recyclerView != null) {
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                }
                RecyclerView recyclerView2 = this.f25033j;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(bVar);
                }
                RecyclerView recyclerView3 = this.f25033j;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                LiveTextView liveTextView = this.f25027d;
                if (liveTextView != null) {
                    liveTextView.setText(C3966y.m9658a((int) R.plurals.gl, list.size()));
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rank_position", "active_user_rank_detail");
        linkedHashMap.put("last_user_rank", String.valueOf(C10424l.f25137a));
        C6501b.C6502a.m13948a("active_user_rank_swipe_to_end").mo12639a().mo12652a((Map<String, String>) linkedHashMap).mo12655b();
        DataChannel dataChannel = this.f27010p;
        long j = this.f25035l;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("duration", String.valueOf(new Date(System.currentTimeMillis()).getTime() - j));
        linkedHashMap2.put("show_user_position", "top_active_user_rank");
        linkedHashMap2.put("rank_position", "active_user_rank_detail");
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C9119ed.class);
        } else {
            obj = null;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap2.put("user_type", str);
        C6501b.C6502a.m13948a("livesdk_active_user_rank_duration").mo12643a(dataChannel).mo12652a((Map<String, String>) linkedHashMap2).mo12655b();
        long time = new Date(System.currentTimeMillis()).getTime() - this.f25035l;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            long id = room.getId();
            long ownerUserId = room.getOwnerUserId();
            if (id > 0 && ownerUserId > 0) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("duration", String.valueOf(time));
                linkedHashMap3.put("room_id", String.valueOf(id));
                linkedHashMap3.put("anchor_id", String.valueOf(ownerUserId));
                C6501b.C6502a.m13948a("anchor_active_user_rank_duration").mo12639a().mo12652a((Map<String, String>) linkedHashMap3).mo12655b();
            }
        }
    }

    /* renamed from: a */
    private static Object m18837a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        try {
            if (this.f27010p != null) {
                this.f25026c = view;
                Bundle arguments = getArguments();
                if (arguments == null || (obj = m18837a(arguments, StringSet.type)) == null) {
                    obj = EnumC10608a.BOTH_REVENUE;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceType");
                this.f25034k = (EnumC10608a) obj;
                EnumC10608a aVar = this.f25034k;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                C10389a aVar2 = new C10389a(aVar);
                this.f25025a = aVar2;
                aVar2.mo17270a(this);
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    i = arguments2.getInt("online_count");
                } else {
                    i = 0;
                }
                LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f24);
                liveTextView.setText(C3966y.m9658a((int) R.plurals.gl, i));
                this.f25027d = liveTextView;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.me);
                DataChannel dataChannel = this.f27010p;
                C10424l.f25137a = -1;
                recyclerView.mo4405a(new C10424l.C10426b(dataChannel));
                this.f25033j = recyclerView;
                this.f25031h = (NoAudienceView) view.findViewById(R.id.csp);
                this.f25032i = (SelfRankInfoView) view.findViewById(R.id.dv3);
                this.f25030g = (ServerFailView) view.findViewById(R.id.dvy);
                this.f25028e = (NoNetworkView) view.findViewById(R.id.ct3);
                m18838a(view);
                C10424l.m18945a(this.f27010p, "active_user_rank_detail");
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: a */
    public final void mo17146a(C10348b bVar, String str) {
        boolean z;
        String str2 = "";
        C89219l.m154721d(bVar, str2);
        C89219l.m154721d(str, str2);
        try {
            if (this.f27010p == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (this.f27009o) {
                SelfRankInfoView selfRankInfoView = this.f25032i;
                if (selfRankInfoView != null) {
                    selfRankInfoView.setVisibility(0);
                }
                SelfRankInfoView selfRankInfoView2 = this.f25032i;
                if (selfRankInfoView2 != null) {
                    DataChannel dataChannel = this.f27010p;
                    EnumC10608a aVar = this.f25034k;
                    selfRankInfoView2.f25508m = dataChannel;
                    selfRankInfoView2.f25509n = this;
                    selfRankInfoView2.f25510o = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                    selfRankInfoView2.f25511p = bVar;
                    selfRankInfoView2.f25512q = str;
                    selfRankInfoView2.f25513r = aVar;
                }
                SelfRankInfoView selfRankInfoView3 = this.f25032i;
                if (selfRankInfoView3 != null) {
                    C7577g.m15571a(selfRankInfoView3.f25504i, selfRankInfoView3.f25511p.f25001a.getAvatarThumb(), selfRankInfoView3.f25504i.getWidth(), selfRankInfoView3.f25504i.getHeight(), 2131234441);
                    C9591j a = C8313a.m16463a(selfRankInfoView3.f25511p.f25001a);
                    if (a != null) {
                        C3941k.m9601a((HSImageView) selfRankInfoView3.findViewById(R.id.bss), a.f23265a);
                    }
                    if (selfRankInfoView3.f25513r == EnumC10608a.BOTH_REVENUE) {
                        selfRankInfoView3.f25505j.setVisibility(0);
                        selfRankInfoView3.f25505j.setText(C11207aa.m19863a(selfRankInfoView3.f25511p.f25003c).toUpperCase(Locale.US) + " " + selfRankInfoView3.f25512q);
                    } else {
                        selfRankInfoView3.f25505j.setVisibility(8);
                    }
                    String str3 = selfRankInfoView3.f25511p.f25001a.displayId;
                    LiveTextView liveTextView = selfRankInfoView3.f25503h;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    liveTextView.setText(str2);
                    int i = selfRankInfoView3.f25511p.f25002b;
                    boolean z2 = true;
                    if (i > 99 || selfRankInfoView3.f25511p.f25003c <= 0) {
                        selfRankInfoView3.f25502g.setText("-");
                    } else {
                        if (i == 1) {
                            selfRankInfoView3.f25502g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uw));
                        } else if (i == 2) {
                            selfRankInfoView3.f25502g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.ux));
                        } else if (i != 3) {
                            selfRankInfoView3.f25502g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uv));
                        } else {
                            selfRankInfoView3.f25502g.setTextColor(selfRankInfoView3.getResources().getColor(R.color.uy));
                        }
                        selfRankInfoView3.f25502g.setText(String.valueOf(i));
                    }
                    if (selfRankInfoView3.f25513r == EnumC10608a.BOTH_REVENUE) {
                        selfRankInfoView3.f25506k.setVisibility(0);
                        selfRankInfoView3.f25506k.setText(selfRankInfoView3.f25511p.f25005e);
                    } else {
                        selfRankInfoView3.f25506k.setVisibility(8);
                    }
                    if (selfRankInfoView3.f25513r != EnumC10608a.BOTH_REVENUE) {
                        selfRankInfoView3.f25507l.setVisibility(8);
                    }
                    selfRankInfoView3.f25507l.setVisibility(0);
                    if (selfRankInfoView3.f25510o.getRoomAuthStatus() == null || !selfRankInfoView3.f25510o.getRoomAuthStatus().isEnableGift()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12373b() <= 0) {
                        z2 = false;
                    }
                    C8789a.EnumC8790a a2 = C8789a.m17098a(false, z2, z);
                    if (a2 == C8789a.EnumC8790a.GREY) {
                        selfRankInfoView3.f25507l.setAlpha(0.34f);
                    }
                    selfRankInfoView3.f25507l.setOnClickListener(new View$OnClickListenerC10589c(selfRankInfoView3, a2));
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10382c
    /* renamed from: a */
    public final void mo17148a(List<C10348b> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        try {
            if (!this.f27009o) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (getContext() != null) {
                C10361b bVar = new C10361b();
                bVar.mo143771a(C10352f.class, new C10583a());
                bVar.mo143771a(C10350d.class, new C10433b(this.f25034k));
                bVar.mo143771a(C10348b.class, new C10454e(this.f27010p));
                bVar.mo143771a(C10349c.class, new C10431a());
                C89397d dVar = new C89397d();
                dVar.add(new C10352f());
                dVar.add(new C10350d(list.size(), str));
                dVar.addAll(list);
                dVar.add(new C10349c());
                bVar.mo17153a(dVar);
                RecyclerView recyclerView = this.f25033j;
                if (recyclerView != null) {
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                }
                RecyclerView recyclerView2 = this.f25033j;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(bVar);
                }
                RecyclerView recyclerView3 = this.f25033j;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                LiveTextView liveTextView = this.f25027d;
                if (liveTextView != null) {
                    liveTextView.setText(C3966y.m9658a((int) R.plurals.gl, list.size()));
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }
}
