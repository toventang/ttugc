package com.bytedance.android.live.publicscreen.impl.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4339o;
import com.bytedance.android.live.liveinteract.api.C4405as;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.liveinteract.api.p261b.C4421j;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.model.C6030p;
import com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a;
import com.bytedance.android.live.publicscreen.impl.p399e.C5953h;
import com.bytedance.android.live.publicscreen.impl.p400f.C5966a;
import com.bytedance.android.live.publicscreen.impl.view.WarningInfoView;
import com.bytedance.android.live.publicscreen.impl.widget.p401a.C6051a;
import com.bytedance.android.live.publicscreen.impl.widget.p401a.C6052b;
import com.bytedance.android.live.publicscreen.impl.widget.p401a.C6053c;
import com.bytedance.android.live.publicscreen.impl.widget.p401a.C6054d;
import com.bytedance.android.live.publicscreen.impl.widget.p402b.C6064c;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.C5891i;
import com.bytedance.android.live.publicscreen.p386a.C5892j;
import com.bytedance.android.live.publicscreen.p386a.p387a.AbstractC5858a;
import com.bytedance.android.live.publicscreen.p386a.p388b.C5860a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.p488c.C7378ak;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p499ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.event.C8451d;
import com.bytedance.android.livesdk.event.C8460m;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenDebugEnabledSetting;
import com.bytedance.android.livesdk.model.message.C9689bu;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p453ap.C6812e;
import com.bytedance.android.livesdk.p561j.C9008ab;
import com.bytedance.android.livesdk.p561j.C9014ah;
import com.bytedance.android.livesdk.p561j.C9030ax;
import com.bytedance.android.livesdk.p561j.C9032az;
import com.bytedance.android.livesdk.p561j.C9039be;
import com.bytedance.android.livesdk.p561j.C9063cb;
import com.bytedance.android.livesdk.p561j.C9077cp;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9112dx;
import com.bytedance.android.livesdk.p561j.C9118ec;
import com.bytedance.android.livesdk.p561j.C9134p;
import com.bytedance.android.livesdk.p561j.C9138t;
import com.bytedance.android.livesdk.utils.C11209ac;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public abstract class PublicScreenWidget extends LiveRecyclableWidget implements C5953h.AbstractC5956a, AbstractC33974au {

    /* renamed from: a */
    private TextView f15133a;

    /* renamed from: b */
    private View f15134b;

    /* renamed from: c */
    private final boolean f15135c = LivePublicScreenDebugEnabledSetting.INSTANCE.getValue();

    /* renamed from: d */
    protected LiveMessageRecyclerView f15136d;

    /* renamed from: e */
    WarningInfoView f15137e;

    /* renamed from: f */
    protected SmoothLinearLayoutManager f15138f;

    /* renamed from: g */
    C5953h f15139g;

    /* renamed from: h */
    public int f15140h = 0;

    /* renamed from: i */
    public int f15141i = 0;

    /* renamed from: j */
    public boolean f15142j = false;

    /* renamed from: k */
    boolean f15143k;

    /* renamed from: l */
    boolean f15144l;

    /* renamed from: m */
    boolean f15145m;

    /* renamed from: n */
    C6050a f15146n;

    /* renamed from: o */
    C7398o f15147o;

    /* renamed from: p */
    String f15148p;

    /* renamed from: q */
    public C5966a f15149q;

    /* renamed from: r */
    public Room f15150r;

    /* renamed from: s */
    C6064c f15151s;

    /* renamed from: t */
    C7398o f15152t;

    /* renamed from: u */
    private EnumC6049a f15153u = EnumC6049a.NORMAL;

    /* renamed from: v */
    private boolean f15154v = false;

    /* renamed from: w */
    private boolean f15155w;

    /* renamed from: x */
    private View f15156x;

    /* renamed from: y */
    private AbstractC88412b f15157y;

    /* renamed from: z */
    private C6053c f15158z;

    static {
        Covode.recordClassIndex(6662);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bb4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo11911i() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo11923a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            m13247a(EnumC6049a.FOCUS, false);
            this.f15142j = false;
            int m = this.f15138f.mo4373m();
            int i = this.f15141i;
            if (m > i) {
                mo11926g(this.f15140h - (m - i));
                this.f15141i = m;
            }
        }
        if (motionEvent.getAction() == 1 && (!this.f15136d.canScrollVertically(1))) {
            m13247a(EnumC6049a.NORMAL, false);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11922a(C7398o oVar) {
        if (getView() == null || !isViewValid() || getContext() == null) {
            this.f15152t = oVar;
            return;
        }
        int dimension = (int) getContext().getResources().getDimension(R.dimen.vz);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
        if (oVar.f18328a == 0) {
            this.f15147o = oVar;
            if (oVar.f18329b instanceof Integer) {
                int intValue = ((Integer) oVar.f18329b).intValue();
                if (oVar.f18330c) {
                    int dimension2 = (int) getContext().getResources().getDimension(R.dimen.ws);
                    intValue += dimension2;
                    dimension += dimension2;
                }
                int intValue2 = ((Integer) this.dataChannel.mo28318b(C9030ax.class)).intValue();
                if (intValue2 <= 0) {
                    intValue2 = C13628n.m24521b(getContext());
                    C3854a.m9453a(5, "AbsInteractionFragment.adjustTextMessage", "failed to obtain iaHeight");
                }
                int i = (intValue2 - intValue) - layoutParams.bottomMargin;
                String str = "iaHeight:" + intValue2 + " height:" + i + " topMargin:" + intValue + " bottomMargin:" + layoutParams.bottomMargin;
                if (i < 200) {
                    i = Math.max((int) C13628n.m24520b(getContext(), 160.0f), 200);
                    str = str + " fallback_height: " + i;
                }
                layoutParams.height = i;
                m13250a("pk_on", str);
                this.dataChannel.mo28315b(C9138t.class, Integer.valueOf(i));
            }
        } else if (oVar.f18328a == 1) {
            this.f15147o = null;
            layoutParams.height = (int) C13628n.m24520b(getContext(), 220.0f);
            m13250a("pk_off", "height:" + layoutParams.height);
            this.dataChannel.mo28315b(C9138t.class, (Object) 0);
            this.dataChannel.mo28315b(C9008ab.class, (Object) true);
        }
        mo11928l();
        getView().setLayoutParams(layoutParams);
        C9039be beVar = new C9039be();
        beVar.f22140a = layoutParams.height + layoutParams.bottomMargin + dimension;
        this.dataChannel.mo28320c(C4339o.class, Integer.valueOf(beVar.f22140a));
        this.dataChannel.mo28320c(C9118ec.class, new C7378ak(layoutParams.height + layoutParams.bottomMargin));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: a */
    public final void mo11843a(AbstractC5873h hVar) {
        if (hVar instanceof AbstractC5877k) {
            if (this.f15151s.itemView.getTranslationY() == 0.0f && this.f15151s.itemView.getVisibility() == 0) {
                this.f15151s.mo11739a(this.f15139g.f14930m, hVar, Collections.EMPTY_LIST);
            } else {
                this.f15158z.mo11657a((AbstractC5887a) this.f15151s, hVar, Collections.EMPTY_LIST);
            }
        }
        if (this.f15151s.itemView.getVisibility() != 0) {
            this.f15151s.itemView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: c */
    public final void mo11846c() {
        this.f15156x.setVisibility(0);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: d */
    public final void mo11848d() {
        this.f15156x.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ C89391z mo11930n() {
        this.f15136d.clearFocus();
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: h */
    public final void mo11852h() {
        WarningInfoView warningInfoView = this.f15137e;
        if (warningInfoView != null) {
            warningInfoView.setVisibility(8);
            this.f15148p = "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo11927k() {
        if (this.f15153u == EnumC6049a.NORMAL) {
            m13247a(EnumC6049a.NORMAL, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo11929m() {
        mo11849d(this.f15146n.getItemCount() - 1);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        C7398o oVar = this.f15152t;
        if (oVar != null) {
            mo11922a(oVar);
        }
    }

    /* renamed from: j */
    private int mo11912j() {
        C5953h hVar = this.f15139g;
        if (hVar == null || hVar.f14921d == null) {
            return 1;
        }
        return this.f15139g.f14921d.f19068d;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.dataChannel.mo28316b(this);
        m13249a("onUnload");
        C5953h hVar = this.f15139g;
        if (hVar != null) {
            hVar.mo8577b();
        }
        AbstractC88412b bVar = this.f15157y;
        if (bVar != null) {
            bVar.dispose();
            this.f15157y = null;
        }
        this.f15152t = null;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget$3 */
    static /* synthetic */ class C60483 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15161a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 6665(0x1a09, float:9.34E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.live.liveinteract.api.b.k[] r0 = com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.C60483.f15161a = r2
                com.bytedance.android.live.liveinteract.api.b.k r0 = com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k.GRID_FIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.C60483.f15161a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.live.liveinteract.api.b.k r0 = com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k.GRID     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.C60483.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget$a */
    public enum EnumC6049a {
        NORMAL,
        FOCUS;

        static {
            Covode.recordClassIndex(6666);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: f */
    public final void mo11851f() {
        if (this.f15139g.mo11671c()) {
            this.f15134b.animate().alpha(1.0f).start();
        } else {
            this.f15134b.animate().alpha(0.0f).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo11932o() {
        C6501b.C6502a.m13948a("livesdk_new_message_click").mo12661f("click").mo12643a(this.dataChannel).mo12651a("admin_type", C11209ac.m19866a(this.f15150r, this.dataChannel)).mo12655b();
        if (isViewValid()) {
            m13247a(EnumC6049a.NORMAL, false);
            this.f15151s.itemView.animate().withLayer().translationY((float) (-this.f15151s.itemView.getHeight())).setDuration(50).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo11928l() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
        if (this.f15145m) {
            C4421j jVar = (C4421j) this.dataChannel.mo28318b(C4405as.class);
            if (jVar == null || (jVar.f12020a != EnumC4422k.FLOATING_FIX && (jVar.f12020a != EnumC4422k.FLOATING || jVar.f12021b <= 0))) {
                if (mo11850e()) {
                    marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wv);
                } else {
                    marginLayoutParams.rightMargin = C3966y.m9653a(8.0f);
                }
                this.dataChannel.mo28311a(C9032az.class, (Object) false);
            } else {
                if (jVar.f12020a == EnumC4422k.FLOATING_FIX) {
                    marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wy);
                } else {
                    marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wx);
                }
                this.dataChannel.mo28311a(C9032az.class, (Object) true);
            }
        } else if (this.f15155w) {
            marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wx);
            this.dataChannel.mo28311a(C9032az.class, (Object) true);
        } else if (this.f15143k || this.f15144l) {
            marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.ww);
            this.dataChannel.mo28311a(C9032az.class, (Object) true);
        } else if (mo11850e()) {
            marginLayoutParams.rightMargin = C3966y.m9667d(R.dimen.wv);
            this.dataChannel.mo28311a(C9032az.class, (Object) false);
        } else {
            marginLayoutParams.rightMargin = C3966y.m9653a(8.0f);
            this.dataChannel.mo28311a(C9032az.class, (Object) false);
        }
        getView().setLayoutParams(marginLayoutParams);
        C6779a.m14563a().mo13053a(new C8460m(marginLayoutParams.rightMargin));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if (r1.getLinkMicInfo() != null) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114  */
    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11844b() {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.mo11844b():void");
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: a */
    public final void mo11841a() {
        this.f15146n.notifyItemRangeRemoved(0, 70);
    }

    /* renamed from: a */
    public final void mo11921a(EnumC6049a aVar) {
        m13247a(aVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo11920a(Integer num) {
        mo11925f(num.intValue());
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: d */
    public final void mo11849d(int i) {
        this.f15136d.mo4435d(i);
        this.f15141i = i;
    }

    /* renamed from: a */
    private <T> void m13248a(Class<T> cls) {
        C6779a.m14563a().mo13052a((Class) cls).mo143271a(getAutoUnbindTransformer()).mo143289d(new C6078h(this));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: c */
    public final void mo11847c(int i) {
        this.f15146n.notifyItemRemoved(i);
        if (i != this.f15146n.getItemCount()) {
            C6050a aVar = this.f15146n;
            aVar.notifyItemRangeChanged(i, aVar.getItemCount() - i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo11925f(int i) {
        if (getView() != null) {
            ((ViewGroup.MarginLayoutParams) getView().getLayoutParams()).height = i;
        }
    }

    public void onEvent(C4419h hVar) {
        this.f15153u = EnumC6049a.NORMAL;
        m13247a(EnumC6049a.NORMAL, false);
        this.f15146n.notifyDataSetChanged();
        this.f15155w = hVar.f12018a;
        this.f15145m = hVar.f12019b;
        mo11928l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo11924e(int i) {
        int a;
        if (getView() != null) {
            int d = C3966y.m9667d(R.dimen.yy);
            if (i <= 0) {
                a = 0;
            } else {
                a = C3966y.m9653a(8.0f) + i;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getView().getLayoutParams();
            layoutParams.bottomMargin = d + a;
            if (i != -1) {
                layoutParams.height = C3966y.m9667d(R.dimen.x_) - i;
            }
            getView().setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m13249a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        hashMap.put("reason", str);
        if (isShowing()) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        hashMap.put("view_status", str2);
        C6555i.m14021b().mo9217b("ttlive_msg", hashMap);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: b */
    public final void mo11845b(int i) {
        this.f15138f.f19092a = (float) mo11912j();
        this.f15146n.notifyItemInserted(i);
        mo11926g(this.f15140h + 1);
        if (this.f15140h >= 300) {
            this.f15153u = EnumC6049a.NORMAL;
            mo11926g(0);
            this.f15138f.f19092a = 1.0f;
            mo11849d(this.f15146n.getItemCount() - 1);
        }
        if (EnumC6049a.NORMAL == this.f15153u || this.f15142j) {
            this.f15142j = true;
            mo11849d(this.f15146n.getItemCount() - 1);
        }
    }

    /* renamed from: g */
    public final void mo11926g(int i) {
        String str;
        if (isViewValid()) {
            if (EnumC6049a.NORMAL == this.f15153u || i <= 0) {
                this.f15133a.setVisibility(4);
                this.f15140h = 0;
                return;
            }
            this.f15140h = i;
            if (i < 100) {
                str = String.valueOf(i);
            } else {
                str = "99+";
            }
            this.f15133a.setText(this.context.getResources().getString(R.string.gig, str));
            if (this.f15133a.getVisibility() != 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100);
                this.f15133a.startAnimation(translateAnimation);
            }
            this.f15133a.setVisibility(0);
        }
    }

    public void onEvent(C5860a aVar) {
        C9689bu buVar = aVar.f14721a;
        if (buVar != null && "6".equals(buVar.f23593j)) {
            this.dataChannel.mo28320c(C9014ah.class, new C8451d(buVar.f23592i));
            C5953h hVar = this.f15139g;
            if (!(hVar == null || hVar.f38654y == null)) {
                for (int i = 0; i < hVar.f14927j.size(); i++) {
                    AbstractC5873h hVar2 = hVar.f14927j.get(i);
                    if ((hVar2 instanceof AbstractC5877k) && buVar == ((AbstractC5877k) hVar2).f14737d) {
                        hVar.mo11835b(i);
                        ((C5953h.AbstractC5956a) hVar.f38654y).mo11849d(hVar.f14927j.size() - 1);
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo11919a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f15136d.mo4413b(this.f15146n.getItemCount() - 1);
            this.dataChannel.mo28315b(C9008ab.class, (Object) false);
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        C5966a aVar = new C5966a();
        this.f15149q = aVar;
        DataChannel dataChannel = this.dataChannel;
        C89219l.m154721d(dataChannel, "");
        aVar.f14982c = dataChannel;
        this.f15146n = new C6050a();
        this.f15156x = findViewById(R.id.egg);
        this.f15136d = (LiveMessageRecyclerView) findViewById(R.id.cjp);
        this.f15133a = (TextView) findViewById(R.id.cjo);
        this.f15137e = (WarningInfoView) findViewById(R.id.fi7);
        this.f15134b = findViewById(R.id.bfv);
        this.f15158z = new C6053c();
        View findViewById = findViewById(R.id.b6_);
        this.f15151s = new C6064c(findViewById);
        ScrollHeaderBehavior scrollHeaderBehavior = (ScrollHeaderBehavior) ((CoordinatorLayout.C0560e) this.f15136d.getLayoutParams()).f2416a;
        if (scrollHeaderBehavior != null) {
            scrollHeaderBehavior.f18250a = new C6055b(this);
        }
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((CoordinatorLayout.C0560e) findViewById.getLayoutParams()).f2416a;
        if (suctionBottomBehavior != null) {
            if (LivePublicScreenConfigSetting.getValue().f19067c == 1) {
                suctionBottomBehavior.f18254b = true;
            } else if (LivePublicScreenConfigSetting.getValue().f19067c == 2) {
                suctionBottomBehavior.f18254b = false;
            }
        }
        if (this.f15135c) {
            this.f15134b.setVisibility(0);
            this.f15134b.setAlpha(0.0f);
        } else {
            this.f15134b.setVisibility(8);
        }
        this.f15138f = new SmoothLinearLayoutManager();
        if (LivePublicScreenConfigSetting.getValue().f19067c != 0) {
            this.f15138f.mo4329a(true);
        }
        this.f15138f.f19092a = 1.0f;
        this.f15138f.f19093b = true;
        this.f15136d.setLayoutManager(this.f15138f);
        this.f15136d.setItemAnimator(null);
        this.f15136d.mo4402a(new C6090t((int) C13628n.m24520b(this.context, 4.0f)));
        this.f15136d.setDisableAllowIntercept(false);
        this.f15136d.setAdapter(this.f15146n);
        C89219l.m154721d(this.f15136d, "");
        this.f15136d.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.C60461 */

            static {
                Covode.recordClassIndex(6663);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                if (i == 1) {
                    PublicScreenWidget.this.f15142j = false;
                } else if (i == 0 && PublicScreenWidget.this.f15142j) {
                    PublicScreenWidget.this.mo11921a(EnumC6049a.NORMAL);
                }
                C5966a aVar = PublicScreenWidget.this.f15149q;
                String a = C11209ac.m19866a(PublicScreenWidget.this.f15150r, PublicScreenWidget.this.dataChannel);
                C89219l.m154721d(a, "");
                if (i == 1) {
                    aVar.mo11855a(true, a);
                } else {
                    aVar.mo11855a(false, a);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                if (!recyclerView.canScrollVertically(1)) {
                    PublicScreenWidget.this.mo11921a(EnumC6049a.NORMAL);
                } else if (!PublicScreenWidget.this.f15142j) {
                    int m = PublicScreenWidget.this.f15138f.mo4373m();
                    if (m > PublicScreenWidget.this.f15141i) {
                        PublicScreenWidget publicScreenWidget = PublicScreenWidget.this;
                        publicScreenWidget.mo11926g(publicScreenWidget.f15140h - (m - PublicScreenWidget.this.f15141i));
                        PublicScreenWidget.this.f15141i = m;
                    }
                } else {
                    return;
                }
                C5966a aVar = PublicScreenWidget.this.f15149q;
                if (aVar.f14981b) {
                    aVar.f14980a += i2;
                }
            }
        });
        this.f15136d.setOnTouchListener(new View$OnTouchListenerC6073c(this));
        this.f15136d.setOnFlingListener(new RecyclerView.AbstractC1369l() {
            /* class com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.C60472 */

            static {
                Covode.recordClassIndex(6664);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1369l
            /* renamed from: a */
            public final boolean mo4749a(int i, int i2) {
                if (i2 != 0) {
                    return false;
                }
                if (!PublicScreenWidget.this.f15136d.canScrollVertically(1)) {
                    PublicScreenWidget.this.mo11921a(EnumC6049a.NORMAL);
                    return false;
                }
                PublicScreenWidget.this.mo11921a(EnumC6049a.FOCUS);
                int m = PublicScreenWidget.this.f15138f.mo4373m();
                if (m <= PublicScreenWidget.this.f15141i) {
                    return false;
                }
                PublicScreenWidget publicScreenWidget = PublicScreenWidget.this;
                publicScreenWidget.mo11926g(publicScreenWidget.f15140h - (m - PublicScreenWidget.this.f15141i));
                PublicScreenWidget.this.f15141i = m;
                return false;
            }
        });
        this.f15133a.setOnClickListener(new View$OnClickListenerC6082l(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        boolean z;
        this.f15137e.setVisibility(8);
        mo11911i();
        if (this.dataChannel.mo28318b(C5891i.class) != null) {
            this.f15139g = (C5953h) this.dataChannel.mo28318b(C5891i.class);
        } else if (this.dataChannel.mo28318b(C9096dh.class) != null) {
            this.f15139g = new C5953h();
        } else {
            return;
        }
        this.f15139g.mo10297a((C5953h.AbstractC5956a) this);
        this.dataChannel.mo28311a(C5891i.class, this.f15139g);
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f15150r = room;
        if (room != null) {
            if (room.getStreamType() == EnumC11728i.THIRD_PARTY) {
                z = true;
            } else {
                z = false;
            }
            this.f15154v = z;
            if (this.f15139g.f14930m.f14750g) {
                mo11924e(((Integer) this.dataChannel.mo28318b(C6812e.class)).intValue());
                this.dataChannel.mo28309a((AbstractC1204m) this, C6812e.class, (AbstractC89172b) new C6083m(this));
            }
        }
        m13248a(C5860a.class);
        m13248a(C4419h.class);
        this.dataChannel.mo28312a((Object) this, C9008ab.class, (AbstractC89172b) new C6084n(this)).mo28313b((AbstractC1204m) this, C9134p.class, (AbstractC89172b) new C6085o(this)).mo28313b((AbstractC1204m) this, C6810c.class, (AbstractC89172b) new C6086p(this)).mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C6087q(this)).mo28309a((AbstractC1204m) this, C4437h.class, (AbstractC89172b) new C6088r(this)).mo28309a((AbstractC1204m) this, C9077cp.class, (AbstractC89172b) new C6089s(this)).mo28310a(C9112dx.class, (AbstractC89172b) new C6074d(this)).mo28310a(C9063cb.class, (AbstractC89172b) new C6075e(this)).mo28310a(C4405as.class, (AbstractC89172b) new C6076f(this));
        mo11926g(0);
        m13249a("onLoad");
        this.dataChannel.mo28319c(C5892j.class);
        this.f15146n.f15165a = this.f15139g.f14930m;
        this.f15158z.f14720a = this.f15139g.f14930m;
        C6050a aVar = this.f15146n;
        aVar.mo11737a(C6030p.class, (AbstractC5858a) new C6054d());
        aVar.mo11737a(AbstractC5988a.class, (AbstractC5858a) new C6052b());
        aVar.mo11737a(AbstractC5876j.class, (AbstractC5858a) new C6051a());
        aVar.mo11737a(AbstractC5877k.class, (AbstractC5858a) new C6053c());
        List<AbstractC5885e> onRegistryReadyListeners = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).getOnRegistryReadyListeners();
        if (!onRegistryReadyListeners.isEmpty()) {
            for (AbstractC5885e eVar : onRegistryReadyListeners) {
                eVar.mo10598a(this.f15146n);
            }
        }
        this.f15146n.mo17153a(this.f15139g.f14927j);
        this.f15146n.notifyDataSetChanged();
        this.f15136d.postDelayed(new RunnableC6077g(this), 100);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5953h.AbstractC5956a
    /* renamed from: a */
    public final void mo11842a(int i) {
        this.f15138f.f19092a = (float) mo11912j();
        this.f15146n.notifyItemChanged(i);
        if (EnumC6049a.NORMAL == this.f15153u || this.f15142j) {
            this.f15142j = true;
            mo11849d(this.f15146n.getItemCount() - 1);
        }
    }

    /* renamed from: a */
    private void m13247a(EnumC6049a aVar, boolean z) {
        if (this.f15153u != aVar || z) {
            this.f15153u = aVar;
            if (EnumC6049a.NORMAL == aVar) {
                mo11926g(0);
                this.f15138f.f19092a = 1.0f;
                mo11849d(this.f15146n.getItemCount() - 1);
            }
        }
    }

    /* renamed from: a */
    public static void m13250a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "on_adjust_text_message_widget");
        hashMap.put("adjust_reason", str);
        if (str2 != null) {
            hashMap.put("adjust_param", str2);
        }
        C6555i.m14021b().mo9215a("ttlive_room", hashMap);
    }
}
