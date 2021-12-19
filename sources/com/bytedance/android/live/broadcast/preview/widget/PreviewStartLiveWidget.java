package com.bytedance.android.live.broadcast.preview.widget;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3005a;
import com.bytedance.android.live.broadcast.C3010ab;
import com.bytedance.android.live.broadcast.C3249k;
import com.bytedance.android.live.broadcast.C3738v;
import com.bytedance.android.live.broadcast.C3752w;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.C3804z;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p185c.C3047a;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.live.broadcast.model.C3269m;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.broadcast.preview.C3558t;
import com.bytedance.android.live.broadcast.preview.p202c.AbstractC3411a;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3413a;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3414b;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3415c;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3416d;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3417e;
import com.bytedance.android.live.broadcast.preview.p202c.p203a.C3418f;
import com.bytedance.android.live.broadcast.utils.C3723e;
import com.bytedance.android.live.broadcast.utils.C3730i;
import com.bytedance.android.live.broadcast.widget.View$OnClickListenerC3783e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.live.design.view.C4081a;
import com.bytedance.android.live.design.view.C4097j;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p558h.EnumC8917a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9079cr;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.p620s.C10610a;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.util.C11118c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewStartLiveWidget extends LiveWidget implements HandlerC11626a.AbstractC11627a, AbstractC18511d, AbstractC33974au {

    /* renamed from: k */
    public static final C3617a f9998k = new C3617a((byte) 0);

    /* renamed from: a */
    final C11826b f9999a = ((C11826b) DataChannelGlobal.f42558d.mo28324b(C9012af.class));

    /* renamed from: b */
    final C11825a f10000b = ((C11825a) DataChannelGlobal.f42558d.mo28324b(C9115e.class));

    /* renamed from: c */
    public Intent f10001c;

    /* renamed from: d */
    public LiveButton f10002d;

    /* renamed from: e */
    public boolean f10003e;

    /* renamed from: f */
    public long f10004f;

    /* renamed from: g */
    public DialogInterface$OnCancelListenerC0944d f10005g;

    /* renamed from: h */
    public Map<String, Boolean> f10006h = new LinkedHashMap();

    /* renamed from: i */
    public boolean f10007i;

    /* renamed from: j */
    public boolean f10008j = true;

    /* renamed from: l */
    private final AbstractC89244h f10009l = C11831d.m20835a(new C3618b(this));

    /* renamed from: m */
    private Dialog f10010m;

    /* renamed from: n */
    private final AbstractC89244h f10011n = C11831d.m20835a(C3619c.f10018a);

    /* renamed from: o */
    private final AbstractC89244h f10012o = C11831d.m20835a(new C3620d(this));

    /* renamed from: p */
    private boolean f10013p = true;

    /* renamed from: q */
    private final User f10014q;

    /* renamed from: r */
    private final AbstractC89172b<Boolean, C89391z> f10015r;

    /* renamed from: s */
    private final AbstractC89171a<AbstractC11683e> f10016s;

    static {
        Covode.recordClassIndex(4124);
    }

    /* renamed from: a */
    private static Intent m9053a(MediaProjectionManager mediaProjectionManager) {
        Pair<Boolean, Object> a = C15346a.m28238a(mediaProjectionManager, new Object[0], 102100, "android.content.Intent", false, null);
        if (((Boolean) a.first).booleanValue()) {
            return (Intent) a.second;
        }
        Intent createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
        C15346a.m28240a(createScreenCaptureIntent, mediaProjectionManager, new Object[0], 102100, "com_bytedance_android_live_broadcast_preview_widget_PreviewStartLiveWidget_android_media_projection_MediaProjectionManager_createScreenCaptureIntent(Landroid/media/projection/MediaProjectionManager;)Landroid/content/Intent;");
        return createScreenCaptureIntent;
    }

    /* renamed from: f */
    private final HandlerC11626a m9059f() {
        return (HandlerC11626a) this.f10009l.getValue();
    }

    /* renamed from: g */
    private final AbstractC3411a[] m9060g() {
        return (AbstractC3411a[]) this.f10011n.getValue();
    }

    /* renamed from: h */
    private final AbstractC3411a.C3412a m9061h() {
        return (AbstractC3411a.C3412a) this.f10012o.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$a */
    public static final class C3617a {
        static {
            Covode.recordClassIndex(4125);
        }

        private C3617a() {
        }

        public /* synthetic */ C3617a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo8908a(String str) {
        C3854a.m9453a(4, "PreviewStartLiveWidget", "updateStartLiveButtonEnable(). scene=" + str + ", selectedGame=" + this.f10013p + ',' + ", startLiveAccess=" + this.f10008j);
        if (!this.f10013p || !this.f10008j) {
            LiveButton liveButton = this.f10002d;
            if (liveButton == null) {
                C89219l.m154710a("mStartButton");
            }
            liveButton.mo9603b(R.style.sl);
            LiveButton liveButton2 = this.f10002d;
            if (liveButton2 == null) {
                C89219l.m154710a("mStartButton");
            }
            liveButton2.setEnabled(false);
            return;
        }
        LiveButton liveButton3 = this.f10002d;
        if (liveButton3 == null) {
            C89219l.m154710a("mStartButton");
        }
        liveButton3.mo9603b(R.style.sk);
        LiveButton liveButton4 = this.f10002d;
        if (liveButton4 == null) {
            C89219l.m154710a("mStartButton");
        }
        liveButton4.setEnabled(true);
    }

    /* renamed from: a */
    public final void mo8909a(boolean z) {
        AbstractC3411a[] g = m9060g();
        for (AbstractC3411a aVar : g) {
            if (aVar.mo8723a(m9061h())) {
                m9056a(m9052a(aVar));
                return;
            }
        }
        if (z) {
            C3558t.m8952a(this.dataChannel);
        }
        m9062i();
    }

    /* renamed from: a */
    public final void mo8907a(Room room) {
        C3272o oVar;
        try {
            C11118c.m19750a(C11118c.EnumC11119a.ENTER_BROADCAST_ROOM);
            AbstractC2953a a = C6193a.m13435a(IEffectService.class);
            C89219l.m154716b(a, "");
            ((IEffectService) a).getLiveFilterManager().mo9894b();
            C10095g.m18641i();
            this.f10015r.invoke(true);
            C4017b.m9800b(C4017b.EnumC4018a.CreateLive);
            Intent intent = new Intent(this.context, ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostActivity(mo8910b().isStreamingBackground ? 6 : 5));
            if (C11729j.m20688e(mo8910b()) || C11729j.m20689f(mo8910b())) {
                C6805b<Boolean> bVar = AbstractC6804a.f16929ae;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) false);
            }
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154716b(dataChannel, "");
            C3723e.m9231a(C3723e.m9234a(dataChannel) ? SystemClock.elapsedRealtime() : -1);
            DataChannel dataChannel2 = this.dataChannel;
            String str = null;
            intent.putExtra("live.intent.extra.LIVE_PC_TIPS", (dataChannel2 == null || (oVar = (C3272o) dataChannel2.mo28318b(C9094df.class)) == null) ? null : oVar.f9374i);
            Context context = this.context;
            String name = mo8910b().name();
            User user = this.f10014q;
            if (user != null) {
                str = user.getIdStr();
            }
            C3730i.C3731a.m9244a(context, name, str);
            m9058a(intent);
            Context context2 = this.context;
            if (context2 != null) {
                m9057a(context2, intent);
            }
            DataChannelGlobal.f42558d.mo28321a(C9009ac.class, room);
            ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18858a().mo18415a();
            ActivityC0945e a2 = C11279p.m20001a(this.context);
            if (a2 != null) {
                a2.finish();
            }
            ActivityC0945e a3 = C11279p.m20001a(this.context);
            if (a3 != null) {
                a3.overridePendingTransition(0, 0);
            }
            ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().onStartLive();
            C3047a.m8356a("start_broadcast_page", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            C3854a.m9453a(3, "ALogger", e.getMessage());
        }
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        EnumC11728i iVar;
        C89219l.m154721d(cVar, "");
        if (C89219l.m154714a((Object) cVar.f44153a, (Object) "ttlive_apply_success")) {
            AbstractC18754n nVar = cVar.f44154b;
            String str = null;
            if (C89219l.m154714a((Object) (nVar != null ? nVar.mo29763f("status") : null), (Object) "success")) {
                AbstractC18754n nVar2 = cVar.f44154b;
                if (nVar2 != null) {
                    this.f10006h.put(nVar2.mo29763f("mode"), true);
                    DialogInterface$OnCancelListenerC0944d dVar = this.f10005g;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                    C11226ao.m19881a(C11279p.m20001a(this.context), C3966y.m9657a((int) R.string.e63));
                    C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_live_access_apply_success").mo12643a(this.dataChannel);
                    DataChannel dataChannel = this.dataChannel;
                    if (!(dataChannel == null || (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) == null)) {
                        str = C11729j.m20684a(iVar);
                    }
                    a.mo12651a("live_type", str).mo12655b();
                    return;
                }
                return;
            }
            AbstractC18754n nVar3 = cVar.f44154b;
            if (nVar3 != null) {
                str = nVar3.mo29763f("status");
            }
            if (C89219l.m154714a((Object) str, (Object) "hit-risk")) {
                C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.e5y), 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$b */
    static final class C3618b extends AbstractC89220m implements AbstractC89171a<HandlerC11626a> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10017a;

        static {
            Covode.recordClassIndex(4126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3618b(PreviewStartLiveWidget previewStartLiveWidget) {
            super(0);
            this.f10017a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC11626a invoke() {
            return new HandlerC11626a(this.f10017a);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C18494b.m34422b("ttlive_apply_success", this);
        this.f10005g = null;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$d */
    static final class C3620d extends AbstractC89220m implements AbstractC89171a<AbstractC3411a.C3412a> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10019a;

        static {
            Covode.recordClassIndex(4128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3620d(PreviewStartLiveWidget previewStartLiveWidget) {
            super(0);
            this.f10019a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC3411a.C3412a invoke() {
            Context context = this.f10019a.context;
            C89219l.m154716b(context, "");
            return new AbstractC3411a.C3412a(context, this.f10019a.dataChannel, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.C3620d.C36211 */

                /* renamed from: a */
                final /* synthetic */ C3620d f10020a;

                static {
                    Covode.recordClassIndex(4129);
                }

                {
                    this.f10020a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f10020a.f10019a.mo8909a(false);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i mo8910b() {
        /*
            r2 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r2.dataChannel
            if (r1 == 0) goto L_0x0012
            java.lang.Class<com.bytedance.android.live.broadcast.x> r0 = com.bytedance.android.live.broadcast.C3802x.class
            java.lang.Object r0 = r1.mo28318b(r0)
            com.bytedance.android.livesdkapi.depend.model.live.i r0 = (com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i) r0
            if (r0 != 0) goto L_0x0011
        L_0x000e:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0011:
            return r0
        L_0x0012:
            r0 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.mo8910b():com.bytedance.android.livesdkapi.depend.model.live.i");
    }

    /* renamed from: e */
    public final void mo8913e() {
        C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.gvw), 0);
        m9056a(105);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$c */
    static final class C3619c extends AbstractC89220m implements AbstractC89171a<AbstractC3411a[]> {

        /* renamed from: a */
        public static final C3619c f10018a = new C3619c();

        static {
            Covode.recordClassIndex(4127);
        }

        C3619c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC3411a[] invoke() {
            return new AbstractC3411a[]{new C3413a(), new C3414b(), new C3415c(), new C3416d(), new C3417e(), new C3418f()};
        }
    }

    /* renamed from: c */
    public final void mo8911c() {
        if (!this.f10007i && C10610a.m19180a(this.dataChannel)) {
            C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
            C89219l.m154716b(bVar, "");
            mo8906a(GameTag.C9511a.m17802a(bVar.mo13066a()));
            mo8908a("read local SelectedGameItem");
        }
    }

    /* renamed from: d */
    public final boolean mo8912d() {
        Map map;
        C3263i.C3264a aVar;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (map = (Map) dataChannel.mo28318b(C3804z.class)) == null || (aVar = (C3263i.C3264a) map.get(mo8905a())) == null || aVar.f9349h != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveButton)) {
            view = null;
        }
        LiveButton liveButton = (LiveButton) view;
        if (liveButton != null) {
            this.f10002d = liveButton;
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new View$OnClickListenerC3624g(this));
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28313b((AbstractC1204m) this, C3010ab.class, (AbstractC89172b) new C3625h(this)).mo28314b(C3802x.class, (AbstractC89172b) new C3626i(this)).mo28314b(C3804z.class, (AbstractC89172b) new C3627j(this)).mo28313b((AbstractC1204m) this, C9079cr.class, (AbstractC89172b) new C3628k(this)).mo28313b((AbstractC1204m) this, C3752w.class, (AbstractC89172b) new C3629l(this)).mo28313b((AbstractC1204m) this, C9094df.class, (AbstractC89172b) new C3630m(this)).mo28313b((AbstractC1204m) this, C3005a.class, (AbstractC89172b) new C3631n(this));
            }
            C18494b.m34417a("ttlive_apply_success", this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017b, code lost:
        if (r0 == null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a9, code lost:
        if (r0 == null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e0, code lost:
        if (r0.booleanValue() != false) goto L_0x01e2;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9062i() {
        /*
        // Method dump skipped, instructions count: 720
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.m9062i():void");
    }

    /* renamed from: a */
    public final String mo8905a() {
        Object b = this.dataChannel.mo28318b(C3802x.class);
        if (b == null) {
            C89219l.m154715b();
        }
        String modeFromServer = ((EnumC11728i) b).getModeFromServer();
        C89219l.m154716b(modeFromServer, "");
        return modeFromServer;
    }

    /* renamed from: a */
    public static final /* synthetic */ LiveButton m9054a(PreviewStartLiveWidget previewStartLiveWidget) {
        LiveButton liveButton = previewStartLiveWidget.f10002d;
        if (liveButton == null) {
            C89219l.m154710a("mStartButton");
        }
        return liveButton;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$j */
    static final class C3627j extends AbstractC89220m implements AbstractC89172b<Map<String, ? extends C3263i.C3264a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10026a;

        static {
            Covode.recordClassIndex(4135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3627j(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10026a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, ? extends C3263i.C3264a> map) {
            C89219l.m154721d(map, "");
            if (!this.f10026a.f10007i) {
                PreviewStartLiveWidget previewStartLiveWidget = this.f10026a;
                previewStartLiveWidget.f10008j = !previewStartLiveWidget.mo8912d();
                this.f10026a.mo8908a("observe PermissionApply");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$k */
    static final class C3628k extends AbstractC89220m implements AbstractC89172b<GameTag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10027a;

        static {
            Covode.recordClassIndex(4136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3628k(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10027a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(GameTag gameTag) {
            GameTag gameTag2 = gameTag;
            C89219l.m154721d(gameTag2, "");
            if (!this.f10027a.f10007i) {
                this.f10027a.mo8906a(gameTag2);
                this.f10027a.mo8908a("observe SelectedGameItem");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$m */
    static final class C3630m extends AbstractC89220m implements AbstractC89172b<C3272o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10029a;

        static {
            Covode.recordClassIndex(4138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3630m(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10029a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3272o oVar) {
            C89219l.m154721d(oVar, "");
            if (!this.f10029a.f10007i) {
                this.f10029a.mo8911c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m9056a(int i) {
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().mo8697a(i, this.dataChannel);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$h */
    static final class C3625h extends AbstractC89220m implements AbstractC89172b<C3269m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10024a;

        static {
            Covode.recordClassIndex(4133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3625h(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10024a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C3269m mVar) {
            C89219l.m154721d(mVar, "");
            PreviewStartLiveWidget.m9054a(this.f10024a).setEnabled(true);
            PreviewStartLiveWidget.m9054a(this.f10024a).mo9603b(R.style.sl);
            this.f10024a.f10007i = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$i */
    static final class C3626i extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10025a;

        static {
            Covode.recordClassIndex(4134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3626i(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10025a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            C89219l.m154721d(iVar, "");
            if (!this.f10025a.f10007i) {
                PreviewStartLiveWidget previewStartLiveWidget = this.f10025a;
                previewStartLiveWidget.f10008j = !previewStartLiveWidget.mo8912d();
                this.f10025a.mo8911c();
                this.f10025a.mo8908a("observe LiveMode");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$l */
    static final class C3629l extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10028a;

        static {
            Covode.recordClassIndex(4137);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3629l(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10028a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                PreviewStartLiveWidget previewStartLiveWidget = this.f10028a;
                LiveButton liveButton = previewStartLiveWidget.f10002d;
                if (liveButton == null) {
                    C89219l.m154710a("mStartButton");
                }
                previewStartLiveWidget.f10004f = C4097j.m9924a(((C4081a.C4082a) new C4081a.C4082a(liveButton).mo9559d()).mo9527a(R.string.e73).mo9530b());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$n */
    static final class C3631n extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10030a;

        static {
            Covode.recordClassIndex(4139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3631n(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.f10030a = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            PreviewStartLiveWidget.m9054a(this.f10030a).setEnabled(false);
            PreviewStartLiveWidget.m9054a(this.f10030a).mo9603b(R.style.sl);
            this.f10030a.f10007i = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$q */
    public static final class C3634q implements IHostPlugin.AbstractC11790a {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10033a;

        /* renamed from: b */
        final /* synthetic */ Room f10034b;

        static {
            Covode.recordClassIndex(4142);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.AbstractC11790a
        /* renamed from: a */
        public final void mo8919a(String str) {
            C89219l.m154721d(str, "");
            IHostPlugin iHostPlugin = (IHostPlugin) C6193a.m13435a(IHostPlugin.class);
            if (iHostPlugin != null && !iHostPlugin.isFull()) {
                iHostPlugin.preload(EnumC8917a.LiveResource.getPackageName());
            }
            EnumC8917a.LiveResource.load(this.f10033a.context, false);
            this.f10033a.mo8907a(this.f10034b);
        }

        C3634q(PreviewStartLiveWidget previewStartLiveWidget, Room room) {
            this.f10033a = previewStartLiveWidget;
            this.f10034b = room;
        }
    }

    /* renamed from: a */
    private static int m9052a(AbstractC3411a aVar) {
        if (aVar instanceof C3413a) {
            return 100;
        }
        if (aVar instanceof C3414b) {
            return 101;
        }
        if (aVar instanceof C3415c) {
            return 107;
        }
        if (aVar instanceof C3416d) {
            return 108;
        }
        if (aVar instanceof C3417e) {
            return 109;
        }
        if (aVar instanceof C3418f) {
            return 110;
        }
        return 102;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$g */
    static final class View$OnClickListenerC3624g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10023a;

        static {
            Covode.recordClassIndex(4132);
        }

        View$OnClickListenerC3624g(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f10023a = previewStartLiveWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
            if (com.bytedance.android.livesdk.utils.C11279p.m20012a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
            if (com.bytedance.android.livesdk.utils.C11279p.m20012a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
            if (com.bytedance.android.livesdk.utils.C11279p.m20012a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
            if (com.bytedance.android.livesdk.utils.C11279p.m20023c(r5.f10023a.f10006h.get(r5.f10023a.mo8905a())) == false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
            r1 = r5.f10023a.dataChannel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
            if (r1 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
            r1 = (java.util.Map) r1.mo28318b(com.bytedance.android.live.broadcast.C3804z.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
            if (r1 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
            r0 = (com.bytedance.android.live.broadcast.model.C3263i.C3264a) r1.get(r5.f10023a.mo8905a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
            if (r0 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
            if (r0.f9349h == 1) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
            r1 = r5.f10023a.dataChannel;
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
            r1 = com.bytedance.android.live.broadcast.preview.C3560u.m8960a(r1, r5.f10023a.mo8905a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
            if (r1 == null) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            r5.f10023a.f10005g = r1;
            com.bytedance.android.live.core.widget.C4031a.m9839a(com.bytedance.android.live.core.p218f.C3888a.m9506b(r5.f10023a.context), r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
            r1 = r5.f10023a.dataChannel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
            if (r1 == null) goto L_0x011f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
            com.bytedance.android.live.broadcast.preview.C3560u.m8962b(r1, r5.f10023a.mo8905a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
            com.bytedance.android.live.broadcast.preview.C3558t.m8954a(r5.f10023a.dataChannel, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 298
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.View$OnClickListenerC3624g.onClick(android.view.View):void");
        }
    }

    /* renamed from: a */
    private final void m9058a(Intent intent) {
        Boolean bool;
        if (C11729j.m20689f(mo8910b())) {
            intent.putExtra("hotsoon.intent.extra.PROJECTION_INTENT", this.f10001c);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.mo28318b(C3249k.class);
            } else {
                bool = null;
            }
            intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", bool);
        }
    }

    /* renamed from: a */
    public final void mo8906a(GameTag gameTag) {
        boolean z = true;
        if ((mo8910b() == EnumC11728i.SCREEN_RECORD || mo8910b() == EnumC11728i.THIRD_PARTY) && gameTag == null) {
            z = false;
        }
        this.f10013p = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0386, code lost:
        if (r6 == null) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0394, code lost:
        if (r6 != null) goto L_0x0397;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x078d  */
    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r26) {
        /*
        // Method dump skipped, instructions count: 1946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    private static void m9057a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$f */
    static final class DialogInterface$OnClickListenerC3623f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC3623f f10022a = new DialogInterface$OnClickListenerC3623f();

        static {
            Covode.recordClassIndex(4131);
        }

        DialogInterface$OnClickListenerC3623f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$e */
    static final class DialogInterface$OnClickListenerC3622e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10021a;

        static {
            Covode.recordClassIndex(4130);
        }

        DialogInterface$OnClickListenerC3622e(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f10021a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            View$OnClickListenerC3783e eVar;
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            DataChannel dataChannel = this.f10021a.dataChannel;
            if (dataChannel != null && (eVar = (View$OnClickListenerC3783e) dataChannel.mo28318b(C3738v.class)) != null) {
                eVar.mo9121b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$o */
    static final class DialogInterface$OnClickListenerC3632o implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10031a;

        static {
            Covode.recordClassIndex(4140);
        }

        DialogInterface$OnClickListenerC3632o(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f10031a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3558t.m8955a("end_live", this.f10031a.dataChannel);
            C7307f.m15216a((Handler) null);
            this.f10031a.f10003e = true;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget$p */
    static final class DialogInterface$OnClickListenerC3633p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewStartLiveWidget f10032a;

        static {
            Covode.recordClassIndex(4141);
        }

        DialogInterface$OnClickListenerC3633p(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f10032a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C3558t.m8955a("back", this.f10032a.dataChannel);
            ActivityC0945e a = C11279p.m20001a(this.f10032a.getContext());
            if (a != null) {
                a.finish();
            }
        }
    }

    /* renamed from: a */
    public static Object m9055a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8128);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(8128);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewStartLiveWidget(User user, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89171a<? extends AbstractC11683e> aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f10014q = user;
        this.f10015r = bVar;
        this.f10016s = aVar;
    }
}
