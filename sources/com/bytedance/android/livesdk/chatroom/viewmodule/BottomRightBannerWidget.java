package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.p033d.C0649c;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4437h;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p379n.C5794z;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.chatroom.p490e.C7475b;
import com.bytedance.android.livesdk.event.C8449c;
import com.bytedance.android.livesdk.livesetting.banner.InteractEnsureLazyLoadBannerWebviewSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.model.C9589i;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.C9675bh;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p561j.C9006a;
import com.bytedance.android.livesdk.p561j.C9033b;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9046bl;
import com.bytedance.android.livesdk.p561j.C9061c;
import com.bytedance.android.livesdk.p561j.C9077cp;
import com.bytedance.android.livesdk.p561j.C9086cy;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9116ea;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9133o;
import com.bytedance.android.livesdk.p561j.C9134p;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11180y;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88404ac;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class BottomRightBannerWidget extends LiveRecyclableWidget implements C7475b.AbstractC7476a, AbstractC33974au {

    /* renamed from: a */
    AbstractC6956d.C6962f f19803a;

    /* renamed from: b */
    Room f19804b;

    /* renamed from: c */
    boolean f19805c;

    /* renamed from: d */
    AbstractC6956d f19806d;

    /* renamed from: e */
    C9695c f19807e;

    /* renamed from: f */
    public boolean f19808f;

    /* renamed from: g */
    boolean f19809g;

    /* renamed from: h */
    boolean f19810h;

    /* renamed from: i */
    boolean f19811i = false;

    /* renamed from: j */
    private C7475b f19812j;

    /* renamed from: k */
    private AbstractC8093bp f19813k;

    /* renamed from: l */
    private final C88411a f19814l = new C88411a();

    /* renamed from: m */
    private boolean f19815m;

    /* renamed from: n */
    private boolean f19816n = false;

    static {
        Covode.recordClassIndex(8770);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget$2 */
    static /* synthetic */ class C79732 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19818a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 8772(0x2244, float:1.2292E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.live.base.model.user.b$a[] r0 = com.bytedance.android.live.base.model.user.AbstractC2994b.EnumC2995a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.C79732.f19818a = r2
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.AbstractC2994b.EnumC2995a.Login     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.C79732.f19818a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.AbstractC2994b.EnumC2995a.Logout     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.C79732.f19818a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.live.base.model.user.b$a r0 = com.bytedance.android.live.base.model.user.AbstractC2994b.EnumC2995a.Update     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.C79732.<clinit>():void");
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        if (this.f19806d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", false);
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", jSONObject2);
                this.f19806d.mo13252a(this.f19803a, "H5_appStateChange", jSONObject);
                this.f19806d.mo13252a(this.f19803a, "container_disappear", new JSONObject());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        if (this.f19806d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", true);
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", jSONObject2);
                this.f19806d.mo13252a(this.f19803a, "H5_appStateChange", jSONObject);
                this.f19806d.mo13252a(this.f19803a, "container_appear", new JSONObject());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f19812j.mo8577b();
        C88411a aVar = this.f19814l;
        if (aVar != null) {
            aVar.mo142944a();
        }
        this.dataChannel.mo28315b(C9133o.class, (Object) false);
        this.dataChannel.mo28315b(C9134p.class, (Object) false);
        this.f19813k = null;
        AbstractC6956d dVar = this.f19806d;
        if (dVar != null) {
            dVar.mo13250a(this.f19803a);
        }
        this.f19803a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14259b() {
        boolean a = mo14258a();
        if (getView() != null && (getView().getLayoutParams() instanceof RelativeLayout.LayoutParams) && ((RelativeLayout.LayoutParams) getView().getLayoutParams()).getRules()[10] == -1) {
            if (a) {
                hide();
                C3227a.m8722b("task_banner");
            } else {
                AbstractC6956d.C6962f fVar = this.f19803a;
                if (!(fVar == null || fVar.f17423a == null || this.f19803a.f17423a.getVisibility() != 0)) {
                    show();
                }
            }
            this.dataChannel.mo28315b(C9134p.class, Boolean.valueOf(isShowing()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo14261c() {
        boolean z;
        AbstractC6956d.C6962f fVar;
        if (this.f19809g || this.f19810h || this.f19815m) {
            z = false;
        } else {
            z = true;
        }
        if (getView() != null) {
            if (!z || (fVar = this.f19803a) == null || fVar.f17423a == null || this.f19803a.f17423a.getVisibility() != 0) {
                hide();
            } else {
                show();
            }
            AbstractC6956d.C6962f fVar2 = this.f19803a;
            if (fVar2 != null && fVar2.f17423a != null && this.f19803a.f17423a.getVisibility() == 0) {
                this.dataChannel.mo28315b(C9134p.class, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: d */
    private void m16096d() {
        MethodCollector.m26663i(3525);
        if (this.f19816n) {
            MethodCollector.m26664o(3525);
            return;
        }
        this.f19816n = true;
        AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
        this.f19806d = webViewManager;
        try {
            this.f19803a = webViewManager.mo13247a(C11279p.m20001a(this.context), new AbstractC6956d.AbstractC6961e() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.C79721 */

                static {
                    Covode.recordClassIndex(8771);
                }

                @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6961e
                /* renamed from: a */
                public final void mo13231a(WebView webView, String str) {
                    String str2;
                    BottomRightBannerWidget bottomRightBannerWidget = BottomRightBannerWidget.this;
                    if (bottomRightBannerWidget.isViewValid() && webView != null) {
                        bottomRightBannerWidget.show();
                        bottomRightBannerWidget.mo14259b();
                        webView.setVisibility(0);
                        if (bottomRightBannerWidget.isShowing()) {
                            bottomRightBannerWidget.dataChannel.mo28315b(C9134p.class, (Object) true);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (bottomRightBannerWidget.f19807e != null) {
                                jSONObject.put("data", C11116a.m19747a(bottomRightBannerWidget.f19807e.f23628a.f23636b));
                                jSONObject.put(StringSet.type, "init");
                                bottomRightBannerWidget.f19806d.mo13252a(bottomRightBannerWidget.f19803a, "H5_roomStatusChange", jSONObject);
                                for (C9589i iVar : bottomRightBannerWidget.f19807e.f23628a.f23636b) {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("banner_id", String.valueOf(iVar.f23244a));
                                    hashMap.put("request_page", "bottomright");
                                    C6501b a = C6501b.C6502a.m13948a("livesdk_live_banner_show").mo12652a((Map<String, String>) hashMap).mo12643a(bottomRightBannerWidget.dataChannel);
                                    if (bottomRightBannerWidget.f19805c) {
                                        str2 = "live_take_detail";
                                    } else {
                                        str2 = "live_detail";
                                    }
                                    a.mo12658d(str2).mo12655b();
                                }
                                if (!bottomRightBannerWidget.f19811i) {
                                    bottomRightBannerWidget.dataChannel.mo28320c(C9046bl.class, false);
                                } else if (bottomRightBannerWidget.isShowing()) {
                                    bottomRightBannerWidget.dataChannel.mo28320c(C9046bl.class, true);
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    C3227a.m8721a("activity_banner");
                }
            });
        } catch (Throwable th) {
            C3854a.m9458a("BottomRightBannerWidget", th);
        }
        if (this.f19803a != null) {
            if (Build.VERSION.SDK_INT <= 19) {
                this.f19803a.f17423a.setLayerType(1, null);
            }
            this.f19803a.f17423a.setBackgroundColor(0);
            this.f19803a.f17423a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (((ViewGroup) getView()).getChildCount() == 0) {
                ((ViewGroup) Objects.requireNonNull(getView())).addView(this.f19803a.f17423a);
            }
            this.f19803a.f17423a.setVisibility(4);
        }
        MethodCollector.m26664o(3525);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14258a() {
        if (this.dataChannel == null) {
            return false;
        }
        Boolean bool = (Boolean) this.dataChannel.mo28318b(C9006a.class);
        Boolean bool2 = (Boolean) this.dataChannel.mo28318b(C9116ea.class);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        if (bool2 == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7475b.AbstractC7476a
    /* renamed from: a */
    public final void mo13713a(C9695c cVar) {
        if (C6204h.m13484d()) {
            C0649c.m2386a(C3940j.m9594a(), new RunnableC8104g(this, cVar), this, 3000);
        } else {
            mo14260b(cVar);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        if (!InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() && !C6204h.m13484d()) {
            m16096d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14257a(boolean z) {
        AbstractC6956d.C6962f fVar = this.f19803a;
        if (fVar != null && fVar.f17423a != null) {
            this.f19803a.f17423a.setFocusable(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo14256a(C4415e eVar) {
        C3854a.m9453a(3, "BottomRightBannerWidget", "notify H5 link status , " + eVar.f12015a);
        AbstractC6956d.C6962f fVar = this.f19803a;
        if (fVar == null || fVar.f17424b == null || this.f19803a.f17424b.mo13236a() == null) {
            C3854a.m9453a(6, "BottomRightBannerWidget", "notify H5 link status ,but web not available");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", eVar.f12015a);
                this.f19803a.f17424b.mo13236a().mo29404a("H5_linkMicStatusChanged", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                C3854a.m9460b("BottomRightBannerWidget", "notify H5 link status error", e);
            }
        }
        return C89391z.f203057a;
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7475b.AbstractC7476a
    /* renamed from: a */
    public final void mo13711a(C9603ag agVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || C6204h.m13484d()) {
            m16096d();
        }
        if (isViewValid() && agVar != null && this.f19803a != null) {
            ((AbstractC11137ac) AbstractC88403ab.m153602a(agVar.f23310a).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo142925c(C8106i.f20118a).mo142925c(new C8107j(this)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142916a((AbstractC88404ac) WidgetExtendsKt.autoDispose(this))).mo17936a(new C8108k(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14260b(C9695c cVar) {
        if (!isViewValid() || cVar == null || cVar.f23628a == null || C13617h.m24465a(cVar.f23628a.f23636b)) {
            this.dataChannel.mo28315b(C9133o.class, (Object) false);
            AbstractC6956d.C6962f fVar = this.f19803a;
            if (fVar != null) {
                fVar.f17423a.setVisibility(8);
                return;
            }
            return;
        }
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || C6204h.m13484d()) {
            m16096d();
        }
        this.dataChannel.mo28315b(C9133o.class, (Object) true);
        AbstractC6956d.C6962f fVar2 = this.f19803a;
        if (fVar2 != null) {
            fVar2.f17423a.setVisibility(4);
        }
        this.f19807e = cVar;
        Uri.Builder appendQueryParameter = Uri.parse(this.f19812j.mo13709a(cVar.f23628a.f23635a)).buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f19804b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f19804b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
        if (this.f19806d != null) {
            C6203g.m13463a(new RunnableC8105h(this, appendQueryParameter), this);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7475b.AbstractC7476a
    /* renamed from: a */
    public final void mo13712a(C9675bh bhVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || C6204h.m13484d()) {
            m16096d();
        }
        Boolean bool = (Boolean) this.dataChannel.mo28318b(C9133o.class);
        if (bool == null || !bool.booleanValue()) {
            AbstractC6956d.C6962f fVar = this.f19803a;
            if (fVar != null) {
                fVar.f17423a.setVisibility(4);
                if (isShowing()) {
                    this.dataChannel.mo28315b(C9134p.class, (Object) true);
                }
            }
            this.dataChannel.mo28315b(C9133o.class, (Object) true);
        }
        Uri parse = Uri.parse(bhVar.f23545f);
        if (this.f19806d != null && this.f19803a != null && parse != null) {
            this.f19806d.mo13251a(this.f19803a, parse.buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f19804b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f19804b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c())).toString());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (this.f19808f) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = C3966y.m9667d(R.dimen.zi);
            layoutParams.height = C3966y.m9667d(R.dimen.zh);
        }
        getView().setLayoutParams(layoutParams);
        AbstractC6956d.C6962f fVar = this.f19803a;
        if (fVar != null) {
            fVar.f17423a.setVisibility(4);
        }
        this.dataChannel.mo28315b(C9134p.class, (Object) false);
        this.f19805c = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        if (this.dataChannel.mo28318b(C9093de.class) != null) {
            this.f19804b = (Room) this.dataChannel.mo28318b(C9093de.class);
            C88411a aVar = this.f19814l;
            if (aVar != null) {
                aVar.mo142944a();
            }
            if ((getView().getLayoutParams() instanceof RelativeLayout.LayoutParams) && !LiveMtMockLandscapeSetting.INSTANCE.getValue()) {
                this.dataChannel.mo28313b((AbstractC1204m) this, C9086cy.class, (AbstractC89172b) new C8005a(this));
            }
            this.dataChannel.mo28313b((AbstractC1204m) this, C6810c.class, (AbstractC89172b) new C8077b(this));
            this.dataChannel.mo28313b((AbstractC1204m) this, C6808a.class, (AbstractC89172b) new C8110m(this));
            this.dataChannel.mo28309a((AbstractC1204m) this, C5794z.class, (AbstractC89172b) new C8111n(this));
            C7475b bVar = new C7475b(this.f19804b, this.f19805c);
            this.f19812j = bVar;
            bVar.mo10297a((C7475b.AbstractC7476a) this);
            ((AbstractC11181z) InRoomBannerManager.m8277a(Long.valueOf(this.f19804b.getId())).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17950a(new C8112o(this), new C8113p(this));
            this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C8114q(this)).mo28309a((AbstractC1204m) this, C9077cp.class, (AbstractC89172b) new C8115r(this)).mo28309a((AbstractC1204m) this, C4437h.class, (AbstractC89172b) new C8116s(this)).mo28309a((AbstractC1204m) this, C9033b.class, (AbstractC89172b) new C8117t(this)).mo28309a((AbstractC1204m) this, C9061c.class, (AbstractC89172b) new C8100c(this)).mo28309a((AbstractC1204m) this, C4417f.class, (AbstractC89172b) new C8101d(this));
            this.f19814l.mo142945a(C6779a.m14563a().mo13052a(C8449c.class).mo143289d(new C8109l(this)));
            ((AbstractC11180y) C11115u.m19743a().mo17915b().mo13168h().mo143206c().mo143199a(C8102e.f20112a).mo143200a(C11152e.m19790a(this))).mo17947a(new C8103f(this));
        }
    }
}
