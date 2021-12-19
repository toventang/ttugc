package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p379n.AbstractC5772f;
import com.bytedance.android.live.p379n.C5794z;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p518e.p519a.C8424a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.p700m.C11832e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ap */
public final class C7762ap extends AbstractC7725al implements AbstractC5772f {

    /* renamed from: n */
    ScreenRecordStatusWidget f19275n;

    /* renamed from: o */
    private final EnumC11728i f19276o = EnumC11728i.SCREEN_RECORD;

    /* renamed from: p */
    private int f19277p = -1;

    /* renamed from: q */
    private LiveWidget f19278q;

    /* renamed from: r */
    private HashMap f19279r;

    static {
        Covode.recordClassIndex(8557);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: b */
    public final View mo13999b(int i) {
        if (this.f19279r == null) {
            this.f19279r = new HashMap();
        }
        View view = (View) this.f19279r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19279r.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: o */
    public final void mo14009o() {
        HashMap hashMap = this.f19279r;
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
        return this.f19276o;
    }

    /* renamed from: c */
    private final void m15806c() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) mo13999b(R.id.cfq);
        C89219l.m154716b(liveLoadingView, "");
        liveLoadingView.setVisibility(0);
    }

    /* renamed from: d */
    private final void m15807d() {
        LiveLoadingView liveLoadingView = (LiveLoadingView) mo13999b(R.id.cfq);
        C89219l.m154716b(liveLoadingView, "");
        liveLoadingView.setVisibility(8);
    }

    /* renamed from: p */
    private final void m15808p() {
        ScreenRecordStatusWidget screenRecordStatusWidget = this.f19275n;
        if (screenRecordStatusWidget != null) {
            screenRecordStatusWidget.mo14388a(true);
        } else {
            C11279p.m20017b(mo13999b(R.id.cbw));
        }
    }

    /* renamed from: q */
    private final void m15809q() {
        ScreenRecordStatusWidget screenRecordStatusWidget = this.f19275n;
        if (screenRecordStatusWidget != null) {
            screenRecordStatusWidget.mo14388a(false);
        } else {
            C11279p.m20006a(mo13999b(R.id.cbw));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: k */
    public final Object[] mo14005k() {
        return new Object[]{C89070n.m154525d(EnumC5847l.SLOT, EnumC5847l.CLOSE_ROOM, EnumC5847l.MORE)};
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ap$a */
    static final class C7763a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7762ap f19280a;

        static {
            Covode.recordClassIndex(8558);
        }

        C7763a(C7762ap apVar) {
            this.f19280a = apVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8424a aVar = (C8424a) obj;
            C7762ap apVar = this.f19280a;
            C89219l.m154716b(aVar, "");
            apVar.onEvent(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo14003i().mo28309a((AbstractC1204m) this, C5794z.class, (AbstractC89172b) new C7764b(this));
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ap$b */
    static final class C7764b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7762ap f19281a;

        static {
            Covode.recordClassIndex(8559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7764b(C7762ap apVar) {
            super(1);
            this.f19281a = apVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            ViewGroup.LayoutParams layoutParams;
            View view;
            boolean booleanValue = bool.booleanValue();
            ScreenRecordStatusWidget screenRecordStatusWidget = this.f19281a.f19275n;
            RelativeLayout.LayoutParams layoutParams2 = null;
            if (screenRecordStatusWidget == null || (view = screenRecordStatusWidget.getView()) == null) {
                layoutParams = null;
            } else {
                layoutParams = view.getLayoutParams();
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                layoutParams2 = layoutParams;
            }
            RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
            if (layoutParams3 != null) {
                if (booleanValue) {
                    layoutParams3.addRule(3, R.id.qj);
                } else {
                    layoutParams3.addRule(3, R.id.elg);
                }
            }
            return C89391z.f203057a;
        }
    }

    public final void onEvent(C8424a aVar) {
        int i = aVar.f20838a;
        if (i == 0) {
            m15809q();
            m15806c();
        } else if (i == 1) {
            m15807d();
            m15808p();
        } else if (i == 2) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eip);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al
    /* renamed from: a */
    public final void mo13994a(View view, Bundle bundle) {
        Boolean bool;
        super.mo13994a(view, bundle);
        this.f19275n = new ScreenRecordStatusWidget();
        mo14000f().load(R.id.cbw, this.f19275n);
        LiveWidget liveWidget = this.f19278q;
        if (liveWidget != null) {
            bool = Boolean.valueOf(liveWidget.isShowing());
        } else {
            bool = null;
        }
        if (C11279p.m20012a(bool)) {
            C6501b.C6502a.m13948a("livesdk_live_center_icon").mo12639a().mo12661f("show").mo12655b();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7725al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((IGiftService) C6193a.m13435a(IGiftService.class)).initGiftResourceManager(getContext());
        int i = C11832e.f28190a;
        this.f19277p = i;
        if (i == 1) {
            m15807d();
            m15808p();
        } else {
            m15809q();
            m15806c();
        }
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8424a.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C7763a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b85, viewGroup, false);
    }
}
