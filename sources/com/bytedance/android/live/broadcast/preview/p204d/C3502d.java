package com.bytedance.android.live.broadcast.preview.p204d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.broadcast.p182a.AbstractC3007b;
import com.bytedance.android.live.core.p212b.C3853a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.api.BroadcastSubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.C7296f;
import com.bytedance.android.livesdk.chatroom.api.C7297g;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscribeAnchorFaqGBSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscribeAnchorFaqNonGBSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.live.broadcast.preview.d.d */
public final class C3502d extends AbstractC3007b implements AbstractC18511d {

    /* renamed from: b */
    public static final C3503a f9794b = new C3503a((byte) 0);

    /* renamed from: a */
    public C7296f f9795a;

    /* renamed from: c */
    private String f9796c = "";

    /* renamed from: d */
    private boolean f9797d;

    /* renamed from: e */
    private final AbstractC89244h f9798e = C11831d.m20835a(C3509g.f9805a);

    /* renamed from: f */
    private HashMap f9799f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$c */
    public static final class C3505c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3505c f9801a = new C3505c();

        static {
            Covode.recordClassIndex(3989);
        }

        C3505c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(3986);
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b
    /* renamed from: a */
    public final View mo8167a(int i) {
        if (this.f9799f == null) {
            this.f9799f = new HashMap();
        }
        View view = (View) this.f9799f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9799f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b
    /* renamed from: a */
    public final void mo8168a() {
        HashMap hashMap = this.f9799f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    public final LiveSubscribeLynxMap mo8796c() {
        return (LiveSubscribeLynxMap) this.f9798e.getValue();
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$a */
    public static final class C3503a {
        static {
            Covode.recordClassIndex(3987);
        }

        private C3503a() {
        }

        public /* synthetic */ C3503a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C3502d m8930a(String str) {
            C89219l.m154721d(str, "");
            C3502d dVar = new C3502d();
            Bundle bundle = new Bundle();
            bundle.putString("arg_enter_from", str);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$g */
    static final class C3509g extends AbstractC89220m implements AbstractC89171a<LiveSubscribeLynxMap> {

        /* renamed from: a */
        public static final C3509g f9805a = new C3509g();

        static {
            Covode.recordClassIndex(3993);
        }

        C3509g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveSubscribeLynxMap invoke() {
            return LiveSubscribeLynxUrl.INSTANCE.getValue();
        }
    }

    /* renamed from: g */
    private final void m8919g() {
        mo8793b(mo8795c(mo8797d(m8913a(C6501b.C6502a.m13948a("livesdk_subscribe_under_review"))))).mo12655b();
    }

    /* renamed from: b */
    public final boolean mo8794b() {
        return C89219l.m154714a((Object) this.f9796c, (Object) "live_take_page");
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3007b, com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C18494b.m34422b("anchor_subscribe_badge_status_change", this);
        C18494b.m34422b("anchor_subscribe_emotes_status_change", this);
        mo8168a();
    }

    /* renamed from: f */
    private final void m8918f() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        C89219l.m154716b(a, "");
        String secUid = a.getSecUid();
        C89219l.m154716b(secUid, "");
        ((BroadcastSubscribeApi) C5805e.m12718a().mo11572a(BroadcastSubscribeApi.class)).getSubscribeInfo(true, secUid).mo143271a(new C11191f()).mo143254a(new C3504b(this), C3505c.f9801a);
    }

    /* renamed from: d */
    public final void mo8798d() {
        C7296f fVar = this.f9795a;
        if (fVar != null) {
            m8916a(fVar);
            if (!this.f9797d) {
                m8917e();
                this.f9797d = true;
            }
        }
    }

    /* renamed from: e */
    private final void m8917e() {
        C18494b.m34417a("anchor_subscribe_badge_status_change", this);
        C18494b.m34417a("anchor_subscribe_emotes_status_change", this);
        ((LiveSwitch) mo8167a(R.id.eam)).setOnCheckedChangeListener(new C3506d(this));
        if (!mo8794b()) {
            C11279p.m20017b(mo8167a(R.id.eap));
            ((LinearLayout) mo8167a(R.id.eap)).setOnClickListener(new View$OnClickListenerC3507e(this));
        }
        C11279p.m20017b(mo8167a(R.id.adv));
        ((LiveAutoRtlImageView) mo8167a(R.id.eaw)).setOnClickListener(new View$OnClickListenerC3508f(this));
        m8919g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$e */
    public static final class View$OnClickListenerC3507e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9803a;

        static {
            Covode.recordClassIndex(3991);
        }

        View$OnClickListenerC3507e(C3502d dVar) {
            this.f9803a = dVar;
        }

        public final void onClick(View view) {
            C3502d dVar = this.f9803a;
            dVar.mo8792a(dVar.mo8796c().getAnchor_describe_management_page());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$h */
    static final class View$OnClickListenerC3510h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9806a;

        static {
            Covode.recordClassIndex(3994);
        }

        View$OnClickListenerC3510h(C3502d dVar) {
            this.f9806a = dVar;
        }

        public final void onClick(View view) {
            ActivityC0945e activity = this.f9806a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$k */
    public static final class View$OnClickListenerC3513k implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC3513k f9810a = new View$OnClickListenerC3513k();

        static {
            Covode.recordClassIndex(3997);
        }

        View$OnClickListenerC3513k() {
        }

        public final void onClick(View view) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.el0);
        }
    }

    /* renamed from: a */
    public final void mo8792a(String str) {
        C3501c.m8912a(getContext(), str, "sub_config", mo8794b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6501b mo8793b(C6501b bVar) {
        return bVar.mo12651a("click_position", this.f9796c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$b */
    public static final class C3504b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3502d f9800a;

        static {
            Covode.recordClassIndex(3988);
        }

        C3504b(C3502d dVar) {
            this.f9800a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f9800a.f9795a = (C7296f) ((C5832d) obj).data;
            if (this.f9800a.isViewValid()) {
                this.f9800a.mo8798d();
            }
        }
    }

    /* renamed from: a */
    static C6501b m8913a(C6501b bVar) {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        return bVar.mo12662g(String.valueOf(b.mo13161c()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6501b mo8795c(C6501b bVar) {
        Integer num;
        C7297g gVar;
        C7296f fVar = this.f9795a;
        if (fVar == null || (gVar = fVar.f18132c) == null) {
            num = null;
        } else {
            num = Integer.valueOf(gVar.f18134a);
        }
        return bVar.mo12651a("emote_status", m8914a(num));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C6501b mo8797d(C6501b bVar) {
        Integer num;
        C7297g gVar;
        C7296f fVar = this.f9795a;
        if (fVar == null || (gVar = fVar.f18131b) == null) {
            num = null;
        } else {
            num = Integer.valueOf(gVar.f18134a);
        }
        return bVar.mo12651a("badge_status", m8914a(num));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("arg_enter_from");
            if (string == null) {
                C89219l.m154715b();
            }
            this.f9796c = string;
        }
        m8918f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$j */
    public static final class View$OnClickListenerC3512j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9809a;

        static {
            Covode.recordClassIndex(3996);
        }

        View$OnClickListenerC3512j(C3502d dVar) {
            this.f9809a = dVar;
        }

        public final void onClick(View view) {
            String anchor_emotes_setting_page;
            C3502d dVar = this.f9809a;
            if (dVar.mo8794b()) {
                anchor_emotes_setting_page = this.f9809a.mo8796c().getAnchor_emotes_setting_popup();
            } else {
                anchor_emotes_setting_page = this.f9809a.mo8796c().getAnchor_emotes_setting_page();
            }
            dVar.mo8792a(anchor_emotes_setting_page);
            C3502d dVar2 = this.f9809a;
            dVar2.mo8795c(dVar2.mo8793b(C3502d.m8913a(C6501b.C6502a.m13948a("livesdk_emote_edit_click")))).mo12655b();
        }
    }

    /* renamed from: a */
    private static String m8914a(Integer num) {
        if (num == null) {
            return "null";
        }
        if (num.intValue() == 1) {
            return "pass";
        }
        if (num.intValue() == 2) {
            return "failed";
        }
        if (num.intValue() == 3) {
            return "under_review";
        }
        return "null";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$f */
    public static final class View$OnClickListenerC3508f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9804a;

        static {
            Covode.recordClassIndex(3992);
        }

        View$OnClickListenerC3508f(C3502d dVar) {
            this.f9804a = dVar;
        }

        public final void onClick(View view) {
            String value;
            String a = C3501c.m8911a();
            if (!TextUtils.isEmpty(a) && C89361p.m154872a("GB", a, true)) {
                value = LiveSubscribeAnchorFaqGBSetting.INSTANCE.getValue();
            } else {
                value = LiveSubscribeAnchorFaqNonGBSetting.INSTANCE.getValue();
            }
            if (!TextUtils.isEmpty(value)) {
                C9913b bVar = new C9913b(value);
                bVar.mo16614a("lang", C3853a.m9448a());
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                Context context = this.f9804a.getContext();
                AbstractC6956d.C6957a b = AbstractC6963e.m14872b(bVar.mo16611a());
                b.f17379c = true;
                webViewManager.mo13248a(context, b);
                C3502d dVar = this.f9804a;
                dVar.mo8795c(dVar.mo8793b(C3502d.m8913a(C6501b.C6502a.m13948a("livesdk_subscription_faq_click")))).mo12655b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$i */
    public static final class View$OnClickListenerC3511i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9807a;

        /* renamed from: b */
        final /* synthetic */ C7296f f9808b;

        static {
            Covode.recordClassIndex(3995);
        }

        View$OnClickListenerC3511i(C3502d dVar, C7296f fVar) {
            this.f9807a = dVar;
            this.f9808b = fVar;
        }

        public final void onClick(View view) {
            String anchor_badge_setting_page;
            String anchor_badge_preview_page;
            if (this.f9808b.f18131b.f18134a == 3) {
                C3502d dVar = this.f9807a;
                if (dVar.mo8794b()) {
                    anchor_badge_preview_page = this.f9807a.mo8796c().getAnchor_badge_preview_popup();
                } else {
                    anchor_badge_preview_page = this.f9807a.mo8796c().getAnchor_badge_preview_page();
                }
                dVar.mo8792a(anchor_badge_preview_page);
            } else {
                C3502d dVar2 = this.f9807a;
                if (dVar2.mo8794b()) {
                    anchor_badge_setting_page = this.f9807a.mo8796c().getAnchor_badge_setting_popup_android();
                } else {
                    anchor_badge_setting_page = this.f9807a.mo8796c().getAnchor_badge_setting_page();
                }
                dVar2.mo8792a(anchor_badge_setting_page);
            }
            C3502d dVar3 = this.f9807a;
            dVar3.mo8797d(dVar3.mo8793b(C3502d.m8913a(C6501b.C6502a.m13948a("livesdk_badge_edit_click")))).mo12655b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008a, code lost:
        if (r0.booleanValue() != false) goto L_0x008c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8916a(com.bytedance.android.livesdk.chatroom.api.C7296f r7) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p204d.C3502d.m8916a(com.bytedance.android.livesdk.chatroom.api.f):void");
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C89219l.m154721d(cVar, "");
        String str = cVar.f44153a;
        int hashCode = str.hashCode();
        if (hashCode != -1809547272) {
            if (hashCode != 1836714626 || !str.equals("anchor_subscribe_badge_status_change")) {
                return;
            }
        } else if (!str.equals("anchor_subscribe_emotes_status_change")) {
            return;
        }
        m8918f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.d$d */
    public static final class C3506d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3502d f9802a;

        static {
            Covode.recordClassIndex(3990);
        }

        C3506d(C3502d dVar) {
            this.f9802a = dVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            C6805b<Boolean> bVar = AbstractC6804a.f16953bB;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a(bVar, Boolean.valueOf(z));
            C6501b b = this.f9802a.mo8793b(C3502d.m8913a(C6501b.C6502a.m13948a("livesdk_sub_only_chat_button_click")));
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            b.mo12651a("sub_only_chat_status", str).mo12655b();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (!mo8794b()) {
            C11279p.m20017b(mo8167a(R.id.pf));
            ((FrameLayout) mo8167a(R.id.pf)).setOnClickListener(new View$OnClickListenerC3510h(this));
        }
        mo8798d();
    }

    /* renamed from: a */
    private final void m8915a(LiveTextView liveTextView, int i) {
        if (i == 1) {
            liveTextView.setText(R.string.el6);
            liveTextView.setTextColor(C4079b.m9889a(getView(), (int) R.attr.am8));
        } else if (i == 2) {
            liveTextView.setText(R.string.el7);
            liveTextView.setTextColor(C4079b.m9889a(getView(), (int) R.attr.am4));
        } else if (i != 3) {
            liveTextView.setText("");
        } else {
            liveTextView.setText(R.string.el8);
            liveTextView.setTextColor(C4079b.m9889a(getView(), (int) R.attr.amt));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b91, viewGroup, false);
    }
}
