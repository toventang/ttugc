package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.p379n.AbstractC5780m;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.widget.ObsKeyCreatedPromptWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.db */
public final class C7888db extends AbstractC7725al implements AbstractC5780m {

    /* renamed from: n */
    private final EnumC11728i f19623n = EnumC11728i.THIRD_PARTY;

    /* renamed from: o */
    private LiveWidget f19624o;

    /* renamed from: p */
    private HashMap f19625p;

    static {
        Covode.recordClassIndex(8683);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: b */
    public final View mo13999b(int i) {
        if (this.f19625p == null) {
            this.f19625p = new HashMap();
        }
        View view = (View) this.f19625p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19625p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: o */
    public final void mo14009o() {
        HashMap hashMap = this.f19625p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo14009o();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: h */
    public final EnumC11728i mo14002h() {
        return this.f19623n;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: k */
    public final Object[] mo14005k() {
        return new Object[]{C89070n.m154525d(EnumC5847l.SLOT, EnumC5847l.CLOSE_ROOM, EnumC5847l.MORE)};
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: a */
    public final void mo13994a(View view, Bundle bundle) {
        Boolean bool;
        mo14000f().load(R.id.cvq, ObsKeyCreatedPromptWidget.class);
        LiveWidget liveWidget = this.f19624o;
        if (liveWidget != null) {
            bool = Boolean.valueOf(liveWidget.isShowing());
        } else {
            bool = null;
        }
        if (C11279p.m20012a(bool)) {
            C6501b.C6502a.m13948a("livesdk_live_center_icon").mo12639a().mo12661f("click").mo12655b();
        }
        super.mo13994a(view, bundle);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 2) {
            WidgetContainer widgetContainer = (WidgetContainer) mo13999b(R.id.cvq);
            C89219l.m154716b(widgetContainer, "");
            widgetContainer.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b8w, viewGroup, false);
    }
}
