package com.bytedance.android.livesdk.chatroom.end;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEndUseLynx;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9037bd;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.f */
public final class C7520f extends C10935a implements AbstractC5776i {

    /* renamed from: a */
    public long f18684a;

    /* renamed from: b */
    public long f18685b;

    /* renamed from: c */
    private Room f18686c;

    /* renamed from: d */
    private long f18687d;

    /* renamed from: e */
    private long f18688e;

    /* renamed from: f */
    private final AbstractC2932i f18689f;

    /* renamed from: g */
    private boolean f18690g = LiveEndUseLynx.INSTANCE.getValue();

    /* renamed from: h */
    private HashMap f18691h;

    static {
        Covode.recordClassIndex(8292);
    }

    /* renamed from: a */
    public final View mo13775a(int i) {
        if (this.f18691h == null) {
            this.f18691h = new HashMap();
        }
        View view = (View) this.f18691h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f18691h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5776i
    /* renamed from: a */
    public final Fragment mo11521a() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f18691h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.f$b */
    public static final class C7522b implements AbstractC2932i.AbstractC2935c {

        /* renamed from: a */
        final /* synthetic */ C7520f f18693a;

        static {
            Covode.recordClassIndex(8294);
        }

        @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
        /* renamed from: a */
        public final void mo7660a() {
            ImageView imageView = (ImageView) this.f18693a.mo13775a(R.id.pr);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7522b(C7520f fVar) {
            this.f18693a = fVar;
        }

        @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
        /* renamed from: a */
        public final void mo7661a(String str) {
            C89219l.m154721d(str, "");
            this.f18693a.f18684a = System.currentTimeMillis();
        }

        @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
        /* renamed from: c */
        public final void mo7663c(String str) {
            C89219l.m154721d(str, "");
            C3868c.m9488a("ttlive_anchor_finish_page_load_status_all", 1, 0);
        }

        @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
        /* renamed from: b */
        public final void mo7662b(String str) {
            C89219l.m154721d(str, "");
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f18693a.mo13775a(R.id.cg3);
            C89219l.m154716b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (this.f18693a.f18684a > -1) {
                this.f18693a.f18685b = System.currentTimeMillis();
                C3868c.m9488a("ttlive_anchor_finish_page_load_duration", 0, this.f18693a.f18685b - this.f18693a.f18684a);
                this.f18693a.f18684a = -1;
                C3868c.m9488a("ttlive_anchor_finish_page_load_status_all", 0, 0);
            }
        }
    }

    public C7520f() {
        AbstractC2953a a = C6193a.m13435a(AbstractC2928f.class);
        C89219l.m154716b(a, "");
        this.f18689f = ((AbstractC2928f) a).getHybridContainerManager();
    }

    /* renamed from: b */
    private static String m15485b() {
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        if (iHostContext != null) {
            return String.valueOf(iHostContext.appId());
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f18688e += SystemClock.elapsedRealtime() - this.f18687d;
        AbstractC2932i iVar = this.f18689f;
        if (iVar != null) {
            iVar.mo7671a("container_disappear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f18687d = SystemClock.elapsedRealtime();
        AbstractC2932i iVar = this.f18689f;
        if (iVar != null) {
            iVar.mo7671a("container_appear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC2932i iVar = this.f18689f;
        if (iVar != null) {
            iVar.mo7669a();
        }
        C6501b.C6502a.m13948a("live_end_duration").mo12639a().mo12656c("video_type").mo12658d("live_detail").mo12651a("duration", String.valueOf(this.f18688e)).mo12655b();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.f$a */
    static final class View$OnClickListenerC7521a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7520f f18692a;

        static {
            Covode.recordClassIndex(8293);
        }

        View$OnClickListenerC7521a(C7520f fVar) {
            this.f18692a = fVar;
        }

        public final void onClick(View view) {
            ActivityC0945e activity = this.f18692a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private static String m15483a(Room room) {
        ImageModel avatarLarge;
        List<String> urls;
        String str;
        User owner = room.getOwner();
        if (owner == null || (avatarLarge = owner.getAvatarLarge()) == null || (urls = avatarLarge.getUrls()) == null || urls.isEmpty() || urls == null || (str = urls.get(0)) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    private static String m15486b(Room room) {
        String valueOf;
        User owner = room.getOwner();
        if (owner == null || (valueOf = String.valueOf(owner.getId())) == null) {
            return "";
        }
        return valueOf;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        AbstractC89172b bVar = (AbstractC89172b) DataChannelGlobal.f42558d.mo28324b(C9037bd.class);
        if (bVar != null) {
            bVar.invoke(0);
        }
        super.onCreate(bundle);
        EnumC9592k.END.config();
        this.f18686c = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
    }

    /* renamed from: a */
    private final String m15484a(String str) {
        Room room = this.f18686c;
        if (room == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        String a = m15483a(room);
        String b = m15486b(room);
        String valueOf = String.valueOf(room.getId());
        String b2 = m15485b();
        buildUpon.appendQueryParameter("live_enter_from", "");
        if (!TextUtils.isEmpty(a)) {
            buildUpon.appendQueryParameter("anchor_avatar", a);
        }
        if (!TextUtils.isEmpty(b)) {
            buildUpon.appendQueryParameter("user_id", b);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            buildUpon.appendQueryParameter("room_id", valueOf);
        }
        if (!TextUtils.isEmpty(b2)) {
            buildUpon.appendQueryParameter("aid", b2);
        }
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        return builder;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Room room = this.f18686c;
        String str4 = null;
        if (room != null) {
            str = room.finish_url;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Room room2 = this.f18686c;
            if (room2 != null) {
                str2 = room2.finish_url;
            } else {
                str2 = null;
            }
            Room room3 = this.f18686c;
            if (room3 != null) {
                str4 = room3.finishUrlLynx;
            }
            if (str4 == null || str4.length() == 0) {
                this.f18690g = false;
            }
            if (!this.f18690g) {
                str4 = str2;
            }
            String a = m15484a(str4);
            String a2 = m15484a(str2);
            AbstractC2932i iVar = this.f18689f;
            if (iVar != null) {
                if (this.f18690g) {
                    str3 = "lynx";
                } else {
                    str3 = "h5";
                }
                FrameLayout frameLayout = (FrameLayout) mo13775a(R.id.ge);
                C89219l.m154716b(frameLayout, "");
                iVar.mo7670a(str3, a, a2, frameLayout, new C7522b(this));
            }
            C3051c.C3052a.m8359a("ttlive_end_url").mo12629a("end_url", a).mo12632a();
            ((ImageView) mo13775a(R.id.pr)).setOnClickListener(new View$OnClickListenerC7521a(this));
            if (this.f18690g) {
                ImageView imageView = (ImageView) mo13775a(R.id.pr);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b8n, viewGroup, false);
    }
}
