package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.p033d.C0649c;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.chatroom.p490e.C7468a;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.banner.InteractEnsureLazyLoadBannerWebviewSetting;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9006a;
import com.bytedance.android.livesdk.p561j.C9033b;
import com.bytedance.android.livesdk.p561j.C9061c;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88404ac;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

public final class ActivityTopRightBannerWidget extends LiveRecyclableWidget implements C7468a.AbstractC7469a, AbstractC33974au {

    /* renamed from: g */
    public static final C7963a f19783g = new C7963a((byte) 0);

    /* renamed from: a */
    public Room f19784a;

    /* renamed from: b */
    public boolean f19785b;

    /* renamed from: c */
    C9695c f19786c;

    /* renamed from: d */
    public AbstractC6956d f19787d;

    /* renamed from: e */
    public AbstractC6956d.C6962f f19788e;

    /* renamed from: f */
    final boolean f19789f = LiveBannerExperiment.isNewBannerEnable();

    /* renamed from: h */
    private C7468a f19790h;

    /* renamed from: i */
    private boolean f19791i = true;

    /* renamed from: j */
    private boolean f19792j = true;

    /* renamed from: k */
    private boolean f19793k;

    static {
        Covode.recordClassIndex(8759);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bfn;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$a */
    public static final class C7963a {
        static {
            Covode.recordClassIndex(8760);
        }

        private C7963a() {
        }

        public /* synthetic */ C7963a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$c */
    static final class RunnableC7965c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityTopRightBannerWidget f19795a;

        /* renamed from: b */
        final /* synthetic */ C9695c f19796b;

        static {
            Covode.recordClassIndex(8762);
        }

        RunnableC7965c(ActivityTopRightBannerWidget activityTopRightBannerWidget, C9695c cVar) {
            this.f19795a = activityTopRightBannerWidget;
            this.f19796b = cVar;
        }

        public final void run() {
            this.f19795a.mo14253b(this.f19796b);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        this.f19792j = false;
        super.hide();
    }

    /* renamed from: b */
    private final void m16086b() {
        this.f19792j = false;
        View view = getView();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f19791i) {
            super.show();
        } else {
            this.f19792j = true;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        AbstractC6956d.C6962f fVar = this.f19788e;
        if (fVar != null) {
            fVar.mo13267a("container_disappear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        AbstractC6956d.C6962f fVar = this.f19788e;
        if (fVar != null) {
            fVar.mo13267a("container_appear", new JSONObject());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        resetAnim();
        C7468a aVar = this.f19790h;
        if (aVar == null) {
            C89219l.m154710a("mPresenter");
        }
        aVar.mo8577b();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9006a.class, (Object) false);
        }
        AbstractC6956d dVar = this.f19787d;
        if (dVar != null) {
            dVar.mo13250a(this.f19788e);
        }
        this.f19788e = null;
    }

    /* renamed from: a */
    private final void m16084a() {
        WebView webView;
        AbstractC6956d.C6962f fVar;
        MethodCollector.m26663i(2545);
        if (this.f19793k) {
            MethodCollector.m26664o(2545);
            return;
        }
        this.f19793k = true;
        this.f19787d = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
        ViewGroup viewGroup = null;
        try {
            ActivityC0945e a = C11279p.m20001a(this.context);
            if (a != null) {
                AbstractC6956d dVar = this.f19787d;
                if (dVar != null) {
                    fVar = dVar.mo13247a(a, new C7964b(this));
                } else {
                    fVar = null;
                }
                this.f19788e = fVar;
            }
        } catch (Throwable th) {
            C3854a.m9458a("MicRoomBannerWidget", th);
        }
        AbstractC6956d.C6962f fVar2 = this.f19788e;
        if (fVar2 == null || (webView = fVar2.f17423a) == null) {
            MethodCollector.m26664o(2545);
            return;
        }
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        View view = getView();
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        if (viewGroup2 != null) {
            if (viewGroup2.getChildCount() == 0) {
                View view2 = getView();
                if (view2 instanceof ViewGroup) {
                    viewGroup = view2;
                }
                ViewGroup viewGroup3 = viewGroup;
                if (viewGroup3 != null) {
                    viewGroup3.addView(webView);
                    MethodCollector.m26664o(2545);
                    return;
                }
            }
            MethodCollector.m26664o(2545);
            return;
        }
        MethodCollector.m26664o(2545);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$d */
    static final class C7966d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C7966d f19797a = new C7966d();

        static {
            Covode.recordClassIndex(8763);
        }

        C7966d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C28022o oVar = (C28022o) obj;
            C89219l.m154721d(oVar, "");
            return C4139e.C4140a.f11575b.mo46672a((AbstractC28019l) oVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$f */
    static final class C7968f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityTopRightBannerWidget f19799a;

        static {
            Covode.recordClassIndex(8765);
        }

        C7968f(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f19799a = activityTopRightBannerWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            AbstractC6956d dVar = this.f19799a.f19787d;
            if (dVar != null) {
                dVar.mo13252a(this.f19799a.f19788e, "H5_roomStatusChange", jSONObject);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7468a.AbstractC7469a
    /* renamed from: a */
    public final void mo13705a(int i) {
        if (i == 0) {
            this.f19791i = true;
            if (this.f19792j) {
                super.show();
                return;
            }
            return;
        }
        this.f19791i = false;
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (!InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() && !C6204h.m13484d()) {
            m16084a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        WebView webView;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f19784a = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f19785b = z;
        AbstractC6956d.C6962f fVar = this.f19788e;
        if (!(fVar == null || (webView = fVar.f17423a) == null)) {
            webView.setVisibility(4);
        }
        m16086b();
        C7468a aVar = new C7468a();
        this.f19790h = aVar;
        aVar.mo10297a((C7468a.AbstractC7469a) this);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$e */
    static final class C7967e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ ActivityTopRightBannerWidget f19798a;

        static {
            Covode.recordClassIndex(8764);
        }

        C7967e(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f19798a = activityTopRightBannerWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Long l;
            Long l2;
            String str2;
            C89219l.m154721d(obj, "");
            String a = C6544e.m13987a();
            String d = C6544e.m13990d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, "refresh");
            jSONObject.put("data", obj);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("enter_from_merge", a);
            jSONObject2.put("enter_method", d);
            if (this.f19798a.f19785b) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            jSONObject2.put("event_page", str);
            Room room = this.f19798a.f19784a;
            String str3 = null;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject2.put("room_id", String.valueOf(l));
            Room room2 = this.f19798a.f19784a;
            if (room2 != null) {
                l2 = Long.valueOf(room2.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject2.put("anchor_id", String.valueOf(l2));
            Room room3 = this.f19798a.f19784a;
            if (room3 != null) {
                str2 = room3.getRequestId();
            } else {
                str2 = null;
            }
            jSONObject2.put("request_id", str2);
            Room room4 = this.f19798a.f19784a;
            if (room4 != null) {
                str3 = room4.getLog_pb();
            }
            jSONObject2.put("log_pb", str3);
            jSONObject.put("log", jSONObject2);
            return jSONObject;
        }
    }

    /* renamed from: b */
    public final void mo14253b(C9695c cVar) {
        Long l;
        User owner;
        WebView webView;
        C9695c.C9696a aVar = cVar.f23632e;
        if (!this.isViewValid || aVar == null || C13617h.m24465a(aVar.f23636b)) {
            m16085a(false, 8);
            return;
        }
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || C6204h.m13484d()) {
            m16084a();
        }
        this.f19786c = cVar;
        m16085a(true, 0);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28320c(C9061c.class, true);
        }
        AbstractC6956d.C6962f fVar = this.f19788e;
        if (!(fVar == null || (webView = fVar.f17423a) == null)) {
            webView.setVisibility(4);
        }
        m16086b();
        C7468a aVar2 = this.f19790h;
        if (aVar2 == null) {
            C89219l.m154710a("mPresenter");
        }
        String str = aVar.f23635a;
        C89219l.m154716b(str, "");
        Uri.Builder buildUpon = Uri.parse(aVar2.mo13703a(str)).buildUpon();
        buildUpon.appendQueryParameter("request_page", "bottomright");
        Room room = this.f19784a;
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        buildUpon.appendQueryParameter("room_id", String.valueOf(l));
        Room room2 = this.f19784a;
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            l2 = Long.valueOf(owner.getId());
        }
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(l2));
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        buildUpon.appendQueryParameter("user_id", String.valueOf(b.mo13161c()));
        AbstractC6956d dVar = this.f19787d;
        if (dVar != null) {
            dVar.mo13251a(this.f19788e, buildUpon.toString());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7468a.AbstractC7469a
    /* renamed from: a */
    public final void mo13707a(C9603ag agVar) {
        if (InteractEnsureLazyLoadBannerWebviewSetting.INSTANCE.getValue() || C6204h.m13484d()) {
            m16084a();
        }
        if (this.isViewValid && agVar != null && this.f19788e != null) {
            ((AbstractC11137ac) AbstractC88403ab.m153602a(agVar.f23310a).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo142925c(C7966d.f19797a).mo142925c(new C7967e(this)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142916a((AbstractC88404ac) WidgetExtendsKt.autoDispose(this))).mo17936a(new C7968f(this));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7468a.AbstractC7469a
    /* renamed from: a */
    public final void mo13708a(C9695c cVar) {
        C89219l.m154721d(cVar, "");
        if (C6204h.m13484d()) {
            C0649c.m2386a(C3940j.m9594a(), new RunnableC7965c(this, cVar), this, 5000);
        } else {
            mo14253b(cVar);
        }
    }

    /* renamed from: a */
    private final void m16085a(boolean z, int i) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9006a.class, Boolean.valueOf(z));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mo28320c(C9033b.class, Boolean.valueOf(z));
        }
        if (i == 0) {
            show();
        } else {
            hide();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget$b */
    public static final class C7964b implements AbstractC6956d.AbstractC6961e {

        /* renamed from: a */
        final /* synthetic */ ActivityTopRightBannerWidget f19794a;

        static {
            Covode.recordClassIndex(8761);
        }

        C7964b(ActivityTopRightBannerWidget activityTopRightBannerWidget) {
            this.f19794a = activityTopRightBannerWidget;
        }

        @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6961e
        /* renamed from: a */
        public final void mo13231a(WebView webView, String str) {
            float f;
            float f2;
            ActivityTopRightBannerWidget activityTopRightBannerWidget = this.f19794a;
            if (activityTopRightBannerWidget.isViewValid()) {
                if (webView != null) {
                    webView.setVisibility(0);
                    if (activityTopRightBannerWidget.f19789f) {
                        f = 148.0f;
                    } else {
                        f = 168.0f;
                    }
                    int a = C3966y.m9653a(f);
                    if (activityTopRightBannerWidget.f19789f) {
                        f2 = 40.0f;
                    } else {
                        f2 = 54.0f;
                    }
                    webView.setLayoutParams(new FrameLayout.LayoutParams(a, C3966y.m9653a(f2)));
                }
                activityTopRightBannerWidget.show();
                try {
                    if (activityTopRightBannerWidget.f19786c != null) {
                        JSONObject jSONObject = new JSONObject();
                        C9695c cVar = activityTopRightBannerWidget.f19786c;
                        if (cVar == null) {
                            C89219l.m154715b();
                        }
                        C9695c.C9696a aVar = cVar.f23632e;
                        C89219l.m154716b(aVar, "");
                        jSONObject.put("data", C11116a.m19747a(aVar.f23636b));
                        jSONObject.put(StringSet.type, "init");
                        AbstractC6956d dVar = activityTopRightBannerWidget.f19787d;
                        if (dVar != null) {
                            dVar.mo13252a(activityTopRightBannerWidget.f19788e, "H5_roomStatusChange", jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7468a.AbstractC7469a
    /* renamed from: a */
    public final void mo13706a(SparseBooleanArray sparseBooleanArray, boolean z) {
        C89219l.m154721d(sparseBooleanArray, "");
        if (getView() != null) {
            boolean z2 = false;
            if (sparseBooleanArray.get(0) || sparseBooleanArray.get(2)) {
                z2 = true;
            }
            C7573e.m15564a(this.context, getView(), !z2, z);
        }
    }
}
