package com.bytedance.android.livesdk.chatroom.p499ui;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4326b;
import com.bytedance.android.live.gift.C4339o;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.livesdk.C10609s;
import com.bytedance.android.livesdk.C10889t;
import com.bytedance.android.livesdk.C6781an;
import com.bytedance.android.livesdk.C6884au;
import com.bytedance.android.livesdk.C7249c;
import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.MessageBlockWidget;
import com.bytedance.android.livesdk.chatroom.widget.OrientationChangeWidget;
import com.bytedance.android.livesdk.chatroom.widget.SplitScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9007aa;
import com.bytedance.android.livesdk.p561j.C9018al;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9036bc;
import com.bytedance.android.livesdk.p561j.C9039be;
import com.bytedance.android.livesdk.p561j.C9129k;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.at */
public final class C7770at extends AbstractC7703a {

    /* renamed from: N */
    private static final int f19283N = C3966y.m9653a(48.0f);

    /* renamed from: H */
    View f19284H;

    /* renamed from: I */
    boolean f19285I;

    /* renamed from: J */
    boolean f19286J;

    /* renamed from: K */
    boolean f19287K;

    /* renamed from: L */
    private long f19288L;

    /* renamed from: M */
    private AbstractC88412b f19289M;

    /* renamed from: O */
    private C7298b f19290O;

    /* renamed from: P */
    private SwitchDefinitionTipsWidget f19291P;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: a */
    public final boolean mo13948a(MotionEvent motionEvent, MotionEvent motionEvent2, float f) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: h */
    public final boolean mo13957h() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: d */
    public final C7298b mo13954d() {
        return this.f19290O;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: f */
    public final boolean mo13955f() {
        mo14050E();
        return true;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        mo14049D();
        super.onPause();
    }

    static {
        Covode.recordClassIndex(8565);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo14049D() {
        AbstractC88412b bVar = this.f19289M;
        if (bVar != null && !bVar.isDisposed()) {
            this.f19289M.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo14050E() {
        boolean z = !this.f19285I;
        this.f19285I = z;
        if (!z) {
            mo14054e();
        } else {
            mo14049D();
        }
        mo14052a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ C89391z mo14051F() {
        if (this.f19291P == null) {
            this.f19291P = (SwitchDefinitionTipsWidget) this.f19150m.load(R.id.edl, SwitchDefinitionTipsWidget.class);
        }
        this.f19291P.show();
        return C89391z.f203057a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: c */
    public final void mo13953c() {
        super.mo13953c();
        C6779a.m14563a().mo13052a(C8454g.class).mo143289d(new C7775ay(this));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onResume() {
        mo14054e();
        mo14052a(1);
        View view = this.f19284H;
        if (view != null) {
            view.postDelayed(new RunnableC7774ax(this), 300);
        }
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14054e() {
        mo14049D();
        this.f19289M = AbstractC88979t.m154307b(5000, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7793bf(this), C7773aw.f19294a);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onDestroy() {
        mo14049D();
        super.onDestroy();
        HashMap hashMap = new HashMap();
        hashMap.put("room_orientation", "landscape");
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f19288L));
        C6501b.C6502a.m13948a("livesdk_transverse_screen_duration").mo12652a((Map<String, String>) hashMap).mo12654b("live").mo12656c("click").mo12658d("live_landscape").mo12643a(this.f19145h).mo12655b();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14053a(C11756a aVar) {
        if (isViewValid() && aVar.f28121b == 3) {
            this.f19145h.mo28319c(C4326b.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14052a(int i) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(3);
        boolean z = false;
        sparseBooleanArray.put(0, this.f19285I);
        sparseBooleanArray.put(1, this.f19286J);
        sparseBooleanArray.put(2, this.f19287K);
        C8454g gVar = new C8454g();
        gVar.f20901a = sparseBooleanArray;
        gVar.f20902b = i;
        if (i == 1 && this.f19286J) {
            z = true;
        }
        gVar.f20903c = z;
        C6779a.m14563a().mo13053a(gVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: a */
    public final void mo13946a(boolean z) {
        if (z && !this.f19285I) {
            this.f19285I = true;
            mo14049D();
            mo14052a(0);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getContext() != null) {
            if (this.f19145h != null && !((Boolean) this.f19145h.mo28318b(C9036bc.class)).booleanValue()) {
                C9039be beVar = new C9039be();
                if (this.f19285I || this.f19286J || this.f19287K) {
                    beVar.f22140a = C3966y.m9653a(124.0f);
                } else {
                    beVar.f22140a = C3966y.m9653a(168.0f);
                }
                if (this.f19145h != null) {
                    this.f19145h.mo28320c(C4339o.class, Integer.valueOf(beVar.f22140a));
                }
            }
            C9039be beVar2 = new C9039be();
            beVar2.f22140a = (int) getResources().getDimension(R.dimen.x8);
            if (this.f19145h != null) {
                this.f19145h.mo28320c(C9018al.class, beVar2);
            }
        }
        mo14054e();
        this.f19288L = System.currentTimeMillis();
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C11756a.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C7776az(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7703a
    /* renamed from: a */
    public final void mo13941a(View view, Bundle bundle) {
        super.mo13941a(view, bundle);
        this.f19150m.load(R.id.a3s, (Widget) new OrientationChangeWidget(), false);
        this.f19150m.load(R.id.cgg, (Widget) new LockScreenWidget(), false);
        if (ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
            this.f19150m.load(R.id.edk, (Widget) new DefinitionSelectionWidget(), false);
        }
        if (this.f19145h != null && ((Boolean) this.f19145h.mo28318b(C9007aa.class)).booleanValue()) {
            this.f19150m.load(R.id.sy, (Widget) new MessageBlockWidget(), false);
        }
        this.f19150m.load(SplitScreenWidget.class);
        if (this.f19145h != null) {
            this.f19145h.mo28309a((AbstractC1204m) this, C4343s.class, (AbstractC89172b) new C7788ba(this));
        }
        if (this.f19145h != null) {
            this.f19145h.mo28309a((AbstractC1204m) this, C6884au.class, C7789bb.f19315a).mo28309a((AbstractC1204m) this, C6781an.class, (AbstractC89172b) new C7790bc(this)).mo28309a((AbstractC1204m) this, C7249c.class, (AbstractC89172b) new C7791bd(this)).mo28309a((AbstractC1204m) this, C9129k.class, (AbstractC89172b) new C7792be(this));
        }
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 1) {
            this.f19153p = new EndWidget();
            this.f19150m.load(R.id.avr, this.f19153p);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(5327);
        this.f19284H = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b8i, viewGroup, false);
        C7298b bVar = new C7298b(this.f19284H);
        this.f19290O = bVar;
        bVar.f18137b.addView(bVar.f18143h, new ViewGroup.LayoutParams(-1, -1));
        int d = C3966y.m9667d(R.dimen.wo);
        bVar.f18137b.addView(bVar.f18138c, new FrameLayout.LayoutParams(d, -1, 5));
        bVar.f18138c.setTranslationX((float) d);
        bVar.f18138c.setVisibility(8);
        bVar.f18142g.setBackgroundColor(Color.parseColor("#003B4050"));
        this.f19284H = this.f19290O.f18136a;
        if (this.f19145h != null) {
            this.f19145h.mo28311a(C10889t.class, this.f19290O);
            this.f19145h.mo28313b((AbstractC1204m) this, C10609s.class, (AbstractC89172b) new C7771au(this)).mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C7772av(this));
        }
        View view = this.f19284H;
        MethodCollector.m26664o(5327);
        return view;
    }
}
