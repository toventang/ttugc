package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3251m;
import com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b;
import com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3182f;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.bgbroadcast.p189a.p190a.C3092a;
import com.bytedance.android.live.broadcast.utils.C3729h;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.core.widget.p228a.C4034b;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5865d;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.C5891i;
import com.bytedance.android.live.publicscreen.p386a.C5892j;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.livesdk.chatroom.p488c.C7408x;
import com.bytedance.android.livesdk.chatroom.p499ui.C7762ap;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.model.EnumC9592k;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p605r.AbstractC10312b;
import com.bytedance.android.livesdk.p605r.C10313c;
import com.bytedance.android.livesdk.p605r.C10319h;
import com.bytedance.android.livesdk.p605r.C10328j;
import com.bytedance.android.livesdk.p605r.C10330k;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j */
public final class C3126j extends AbstractC3153b {

    /* renamed from: k */
    public static final C3127a f9062k = new C3127a((byte) 0);

    /* renamed from: f */
    public boolean f9063f;

    /* renamed from: g */
    AbstractC5865d f9064g;

    /* renamed from: h */
    public int f9065h;

    /* renamed from: i */
    public C3102g f9066i;

    /* renamed from: j */
    AbstractC5863b f9067j;

    /* renamed from: l */
    private boolean f9068l;

    /* renamed from: m */
    private final boolean f9069m = this.f9128b.getIntent().getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);

    /* renamed from: n */
    private boolean f9070n;

    /* renamed from: o */
    private boolean f9071o;

    /* renamed from: p */
    private Dialog f9072p;

    /* renamed from: q */
    private AbstractC88412b f9073q;

    /* renamed from: r */
    private final C7408x f9074r = new C7408x();

    /* renamed from: s */
    private final Handler f9075s = new Handler();

    /* renamed from: t */
    private C3149r f9076t;

    /* renamed from: u */
    private C3142k f9077u;

    /* renamed from: v */
    private Intent f9078v;

    /* renamed from: w */
    private HSImageView f9079w;

    /* renamed from: x */
    private AbstractBinderC11605a f9080x;

    /* renamed from: y */
    private final BroadcastReceiver f9081y = new C3141n(this);

    static {
        Covode.recordClassIndex(3607);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: b */
    public final int mo8446b() {
        return R.layout.b4a;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$a */
    public static final class C3127a {
        static {
            Covode.recordClassIndex(3608);
        }

        private C3127a() {
        }

        public /* synthetic */ C3127a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo8445a(boolean z) {
        EnumC3091a aVar = EnumC3091a.CMD_ORIENTATION_CHANGED;
        aVar.setParam(new C3145n(z, this.f9065h));
        mo8443a(aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$c */
    public static final class C3130c extends C10313c {

        /* renamed from: a */
        final /* synthetic */ C3126j f9084a;

        static {
            Covode.recordClassIndex(3611);
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: d */
        public final void mo8459d() {
            this.f9084a.mo8443a(EnumC3091a.CMD_DRAG_MOVE_END);
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: e */
        public final void mo8460e() {
            this.f9084a.mo8443a(EnumC3091a.CMD_CLICK_FLOAT_BALL);
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: a */
        public final void mo8455a() {
            C6501b.C6502a.m13948a("livesdk_floating_window_status").mo12651a("isOpen", "1").mo12655b();
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: b */
        public final void mo8457b() {
            C6501b.C6502a.m13948a("livesdk_floating_window_status").mo12651a("isOpen", "0").mo12655b();
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: c */
        public final void mo8458c() {
            this.f9084a.mo8443a(EnumC3091a.CMD_DRAG_MOVE_START);
            C6501b.C6502a.m13948a("livesdk_floating_ball_drag").mo12655b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3130c(C3126j jVar) {
            this.f9084a = jVar;
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: a */
        public final void mo8456a(int i, int i2) {
            C3126j jVar = this.f9084a;
            EnumC3091a aVar = EnumC3091a.CMD_DRAG_ONGOING;
            aVar.setParam(new C3146o(true, i, i2));
            jVar.mo8443a(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$d */
    public static final class C3131d implements AbstractC5862a {

        /* renamed from: a */
        final /* synthetic */ C3126j f9085a;

        static {
            Covode.recordClassIndex(3612);
        }

        @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a
        /* renamed from: b */
        public final void mo8463b() {
            this.f9085a.mo8443a(EnumC3091a.CMD_NEW_COMMON_MSG);
        }

        @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a
        /* renamed from: a */
        public final void mo8461a() {
            if (this.f9085a.f9066i != null) {
                this.f9085a.mo8443a(EnumC3091a.CMD_READ_REMIND_MSG);
            }
        }

        @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a
        /* renamed from: c */
        public final void mo8464c() {
            C3102g gVar = this.f9085a.f9066i;
            if (gVar != null && C89219l.m154714a(gVar.f9014n, gVar.f9017q) && gVar.mo8423f()) {
                C10319h hVar = gVar.f9003c;
                if (hVar == null) {
                    C89219l.m154710a("msgWindow");
                }
                if (hVar.f24939k) {
                    gVar.mo8415a(true, false);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3131d(C3126j jVar) {
            this.f9085a = jVar;
        }

        @Override // com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a
        /* renamed from: a */
        public final void mo8462a(int i) {
            C3102g gVar = this.f9085a.f9066i;
            if (gVar != null) {
                gVar.f9006f = i;
                if (i == 1) {
                    gVar.mo8415a(true, false);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$e */
    public static final class C3132e extends C10313c {

        /* renamed from: a */
        final /* synthetic */ C3126j f9086a;

        static {
            Covode.recordClassIndex(3613);
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: d */
        public final void mo8459d() {
            this.f9086a.mo8443a(EnumC3091a.CMD_DRAG_MOVE_END);
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: c */
        public final void mo8458c() {
            this.f9086a.mo8443a(EnumC3091a.CMD_DRAG_MOVE_START);
            C6501b.C6502a.m13948a("livesdk_floating_ball_drag").mo12655b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3132e(C3126j jVar) {
            this.f9086a = jVar;
        }

        @Override // com.bytedance.android.livesdk.p605r.C10313c, com.bytedance.android.livesdk.p605r.AbstractC10317f
        /* renamed from: a */
        public final void mo8456a(int i, int i2) {
            C3126j jVar = this.f9086a;
            EnumC3091a aVar = EnumC3091a.CMD_DRAG_ONGOING;
            aVar.setParam(new C3146o(false, i, i2));
            jVar.mo8443a(aVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$l */
    static final class RunnableC3139l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3126j f9094a;

        static {
            Covode.recordClassIndex(3620);
        }

        RunnableC3139l(C3126j jVar) {
            this.f9094a = jVar;
        }

        public final void run() {
            this.f9094a.mo8443a(EnumC3091a.CMD_TRANSITION_TO_HIDDEN);
        }
    }

    /* renamed from: k */
    private static C10319h m8503k() {
        AbstractC10312b b = C10328j.m18798b("control_view");
        if (!(b instanceof C10319h)) {
            b = null;
        }
        return (C10319h) b;
    }

    /* renamed from: l */
    private static C10319h m8504l() {
        return (C10319h) C10328j.m18798b("msg_view");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: i */
    public final void mo8453i() {
        mo8443a(EnumC3091a.CMD_TRANSITION_TO_DESTROY);
        this.f9063f = true;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$i */
    static final class RunnableC3136i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3126j f9090a;

        /* renamed from: b */
        final /* synthetic */ View f9091b;

        static {
            Covode.recordClassIndex(3617);
        }

        RunnableC3136i(C3126j jVar, View view) {
            this.f9090a = jVar;
            this.f9091b = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f9091b.getWindowVisibleDisplayFrame(rect);
            if (rect.top == 0) {
                this.f9090a.f9065h = 0;
            }
            this.f9090a.mo8445a(true);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$m */
    static final class C3140m implements AbstractBinderC11605a.AbstractC11606a {

        /* renamed from: a */
        final /* synthetic */ C3126j f9095a;

        static {
            Covode.recordClassIndex(3621);
        }

        C3140m(C3126j jVar) {
            this.f9095a = jVar;
        }

        @Override // com.bytedance.android.livesdkapi.AbstractBinderC11605a.AbstractC11606a
        /* renamed from: a */
        public final void mo8469a() {
            C3854a.m9453a(3, this.f9095a.f9127a, "room close onLiveFinished");
            this.f9095a.f9130d.mo8505d();
        }
    }

    /* renamed from: m */
    private final void m8505m() {
        MethodCollector.m26663i(8287);
        if (this.f9076t != null) {
            MethodCollector.m26664o(8287);
            return;
        }
        View inflate = LayoutInflater.from(C3966y.m9669e()).inflate(R.layout.bed, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        inflate.setClickable(false);
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        Context a = m8497a(e);
        C89219l.m154716b(a, "");
        this.f9076t = new C3149r(a, inflate);
        MethodCollector.m26664o(8287);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8440a() {
        EnumC9592k.GAME.config();
        this.f9131e.mo28312a(this, C5892j.class, new C3135h(this));
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: f */
    public final void mo8450f() {
        this.f9070n = C10330k.m18807a(this.f9128b);
        if (this.f9071o) {
            AbstractC5863b bVar = this.f9067j;
            if (bVar != null) {
                bVar.mo11663b();
            }
            this.f9073q = AbstractC88979t.m154307b(1000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3137j(this), C3138k.f9093a);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: g */
    public final void mo8451g() {
        Dialog dialog;
        mo8443a(EnumC3091a.CMD_TRANSITION_TO_DESTROY);
        C6805b<Boolean> bVar = AbstractC6804a.f16929ae;
        C89219l.m154716b(bVar, "");
        if (!bVar.mo13066a().booleanValue() && (dialog = this.f9072p) != null) {
            C11279p.m20014b(dialog);
        }
        AbstractC88412b bVar2 = this.f9073q;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f9131e.mo28316b(this);
        AbstractC5863b bVar3 = this.f9067j;
        if (bVar3 != null) {
            bVar3.mo11664c();
        }
        this.f9128b.unregisterReceiver(this.f9081y);
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$b */
    public static final class C3128b implements C3092a.AbstractC3093a {

        /* renamed from: a */
        final /* synthetic */ C3126j f9082a;

        static {
            Covode.recordClassIndex(3609);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.p190a.C3092a.AbstractC3093a
        /* renamed from: a */
        public final void mo8399a() {
            Activity activity = this.f9082a.f9128b;
            String str = Build.MANUFACTURER;
            str.hashCode();
            if (str.equals("Xiaomi")) {
                int i = Build.VERSION.SDK_INT;
                if (!C10330k.m18812d(activity)) {
                    new DialogC9148b.C9149a(this.f9082a.f9128b).mo15248b(R.string.gl8).mo15244a(R.string.gtk, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC3129a.f9083a, false).mo15247a().show();
                    return;
                }
            }
            this.f9082a.f9130d.mo8507f();
            C6501b a = C6501b.C6502a.m13948a("livesdk_floating_ball_click").mo12651a("click_icon", "home");
            C6805b<Boolean> bVar = AbstractC6804a.f16875D;
            C89219l.m154716b(bVar, "");
            Boolean a2 = bVar.mo13066a();
            C89219l.m154716b(a2, "");
            a.mo12645a("notification_status", a2.booleanValue() ? 1 : 0).mo12655b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3128b(C3126j jVar) {
            this.f9082a = jVar;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.p190a.C3092a.AbstractC3093a
        /* renamed from: a */
        public final void mo8400a(boolean z) {
            EnumC3091a aVar;
            C3126j jVar = this.f9082a;
            if (z) {
                aVar = EnumC3091a.CMD_CLICK_MSG_BTN_CHECKED;
            } else {
                aVar = EnumC3091a.CMD_CLICK_MSG_BTN_UNCHECKED;
            }
            jVar.mo8443a(aVar);
            C6501b.C6502a.m13948a("livesdk_floating_ball_click").mo12651a("click_icon", "notification").mo12645a("notification_status", z ? 1 : 0).mo12655b();
        }

        /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$b$a */
        static final class DialogInterface$OnClickListenerC3129a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC3129a f9083a = new DialogInterface$OnClickListenerC3129a();

            static {
                Covode.recordClassIndex(3610);
            }

            DialogInterface$OnClickListenerC3129a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C89219l.m154721d(dialogInterface, "");
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: n */
    private final void m8506n() {
        AbstractC5863b createGameMessageView = ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).createGameMessageView(this.f9128b, 2, new C3131d(this));
        this.f9067j = createGameMessageView;
        AbstractC5865d dVar = this.f9064g;
        if (!(dVar == null || createGameMessageView == null)) {
            createGameMessageView.mo11661a(dVar);
        }
        C10328j.C10329a a = C10328j.m18796a(C3966y.m9669e());
        a.f24964b = this.f9067j;
        a.f24980r = "msg_view";
        a.f24973k = 2;
        C10328j.C10329a a2 = a.mo17109a().mo17110a(new AccelerateDecelerateInterpolator());
        a2.f24981s = true;
        a2.f24982t = new C3132e(this);
        a2.mo17111b();
    }

    /* renamed from: o */
    private final void m8507o() {
        C3092a aVar = new C3092a(this.f9128b);
        aVar.setOnViewClickListener(new C3128b(this));
        C10328j.C10329a a = C10328j.m18796a(C3966y.m9669e());
        a.f24964b = aVar;
        a.f24980r = "control_view";
        a.f24973k = 2;
        a.f24966d = C3966y.m9653a(166.0f);
        a.f24967e = C3966y.m9653a(96.0f);
        C10328j.C10329a a2 = a.mo17109a().mo17110a(new AccelerateDecelerateInterpolator());
        a2.f24981s = true;
        a2.f24982t = new C3130c(this);
        a2.mo17111b();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: d */
    public final void mo8448d() {
        HSImageView hSImageView;
        this.f9079w = (HSImageView) this.f9128b.findViewById(R.id.px);
        float a = (float) (C13628n.m24504a(this.f9128b) / C13628n.m24521b(this.f9128b));
        if (this.f9129c.background != null) {
            if (Build.VERSION.SDK_INT >= 23 && (hSImageView = this.f9079w) != null) {
                hSImageView.setForeground(null);
            }
            C3941k.m9601a(this.f9079w, this.f9129c.background);
            return;
        }
        HSImageView hSImageView2 = this.f9079w;
        User owner = this.f9129c.getOwner();
        C89219l.m154716b(owner, "");
        C3941k.m9604a(hSImageView2, owner.getAvatarThumb(), new C11291z(5, a));
    }

    /* renamed from: j */
    private final void m8502j() {
        Boolean bool;
        C10319h l;
        C10319h l2;
        C10319h k;
        if (!this.f9068l) {
            this.f9068l = true;
            C10319h k2 = m8503k();
            Boolean bool2 = null;
            if (k2 != null) {
                bool = Boolean.valueOf(k2.f24939k);
            } else {
                bool = null;
            }
            if (C11279p.m20012a(bool) && (k = m8503k()) != null) {
                k.mo17082a();
            }
            C10319h l3 = m8504l();
            if (l3 != null) {
                bool2 = Boolean.valueOf(l3.f24939k);
            }
            if (C11279p.m20012a(bool2) && (l2 = m8504l()) != null) {
                l2.mo17082a();
            }
            if (this.f9128b != null) {
                int i = Build.VERSION.SDK_INT;
                if (!this.f9128b.isDestroyed()) {
                    m8507o();
                    m8506n();
                    m8505m();
                    this.f9077u = new C3142k();
                    C3102g gVar = new C3102g();
                    C3149r rVar = this.f9076t;
                    if (rVar != null) {
                        C10319h k3 = m8503k();
                        if (!(k3 == null || (l = m8504l()) == null)) {
                            gVar.mo8411a(k3, l, rVar);
                        }
                        C3142k kVar = this.f9077u;
                        if (kVar == null) {
                            C89219l.m154715b();
                        }
                        gVar.mo8416a(kVar);
                    }
                    this.f9066i = gVar;
                    mo8443a(EnumC3091a.CMD_TRANSITION_TO_INIT);
                    mo8443a(EnumC3091a.CMD_TRANSITION_TO_HIDDEN);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: c */
    public final void mo8447c() {
        Intent createScreenCaptureIntent;
        Activity activity = this.f9128b;
        BroadcastReceiver broadcastReceiver = this.f9081y;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        m8501b(activity, broadcastReceiver, intentFilter);
        this.f9070n = C10330k.m18807a(this.f9128b);
        C3966y.f10870c = false;
        C3966y.f10869b = new int[]{0, 0};
        this.f9078v = (Intent) this.f9128b.getIntent().getParcelableExtra("hotsoon.intent.extra.PROJECTION_INTENT");
        if (Build.VERSION.SDK_INT >= 21 && EnableTTCaptureSetting.INSTANCE.enable()) {
            C3251m.m8741a().mo8583b();
            if (this.f9078v == null) {
                Object a = m8499a(this.f9128b, "media_projection");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) a;
                Pair<Boolean, Object> a2 = C15346a.m28238a(mediaProjectionManager, new Object[0], 102100, "android.content.Intent", false, null);
                if (((Boolean) a2.first).booleanValue()) {
                    createScreenCaptureIntent = (Intent) a2.second;
                } else {
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    C15346a.m28240a(createScreenCaptureIntent, mediaProjectionManager, new Object[0], 102100, "com_bytedance_android_live_broadcast_bgbroadcast_game_GameUiStrategy_android_media_projection_MediaProjectionManager_createScreenCaptureIntent(Landroid/media/projection/MediaProjectionManager;)Landroid/content/Intent;");
                }
                this.f9130d.mo8504c().startActivityForResult(createScreenCaptureIntent, 1000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r1 == false) goto L_0x0079;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[Catch:{ Exception -> 0x0057 }] */
    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8449e() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3126j.mo8449e():void");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: h */
    public final void mo8452h() {
        Dialog dialog;
        boolean a = C10330k.m18807a(this.f9128b);
        if (a) {
            m8502j();
        }
        if (a) {
            C6805b<Boolean> bVar = AbstractC6804a.f16933ai;
            C89219l.m154716b(bVar, "");
            if (bVar.mo13066a().booleanValue()) {
                C6805b<Boolean> bVar2 = AbstractC6804a.f16932ah;
                C89219l.m154716b(bVar2, "");
                if (bVar2.mo13066a().booleanValue()) {
                    return;
                }
            }
        }
        C3854a.m9453a(4, this.f9127a, "onShowInteraction: no float window permission");
        DialogC9148b a2 = new DialogC9148b.C9149a(this.f9128b).mo15243a(R.string.eht).mo15248b(R.string.ehs).mo15244a(R.string.ehq, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3133f(this), false).mo15249b(R.string.ehp, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3134g(this), false).mo15247a();
        this.f9072p = a2;
        if (!(a2 instanceof DialogC9148b)) {
            a2 = null;
        }
        DialogC9148b bVar3 = a2;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = this.f9072p;
        if (dialog2 != null && !dialog2.isShowing() && !this.f9063f && (dialog = this.f9072p) != null) {
            dialog.show();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$n */
    public static final class C3141n extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C3126j f9096a;

        static {
            Covode.recordClassIndex(3622);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3141n(C3126j jVar) {
            this.f9096a = jVar;
        }

        /* renamed from: a */
        private static Object m8538a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(8058);
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
                        MethodCollector.m26664o(8058);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z;
            C89219l.m154721d(context, "");
            C89219l.m154721d(intent, "");
            if (TextUtils.equals(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
                int a = C3729h.m9239a();
                int b = C3729h.m9242b();
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                Object a2 = m8538a(applicationContext, "window");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) a2;
                Point point = new Point();
                try {
                    windowManager.getDefaultDisplay().getSize(point);
                    a = point.x;
                    b = point.y;
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    C89219l.m154716b(defaultDisplay, "");
                    int rotation = defaultDisplay.getRotation();
                    z = true;
                    if (rotation == 1) {
                        if (a > b || !z || Build.VERSION.SDK_INT < 28) {
                            C3126j jVar = this.f9096a;
                            jVar.f9065h = 0;
                            jVar.mo8445a(false);
                        }
                        C3126j jVar2 = this.f9096a;
                        Activity i = jVar2.f9130d.mo8510i();
                        C89219l.m154716b(i, "");
                        Window window = i.getWindow();
                        C89219l.m154716b(window, "");
                        View decorView = window.getDecorView();
                        C89219l.m154716b(decorView, "");
                        decorView.post(new RunnableC3136i(jVar2, decorView));
                        return;
                    }
                } catch (Exception e) {
                    C3854a.m9453a(3, this.f9096a.f9127a, e.toString());
                }
                z = false;
                if (a > b) {
                }
                C3126j jVar3 = this.f9096a;
                jVar3.f9065h = 0;
                jVar3.mo8445a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo8443a(EnumC3091a aVar) {
        C3102g gVar = this.f9066i;
        if (gVar != null) {
            gVar.mo8409a(aVar);
        }
    }

    /* renamed from: a */
    private static Context m8497a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$k */
    static final class C3138k<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3138k f9093a = new C3138k();

        static {
            Covode.recordClassIndex(3619);
        }

        C3138k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            C3854a.m9453a(6, "ALogger", th.getMessage());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$h */
    static final class C3135h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C3126j f9089a;

        static {
            Covode.recordClassIndex(3616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3135h(C3126j jVar) {
            super(1);
            this.f9089a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            AbstractC5865d dVar = (AbstractC5865d) this.f9089a.f9131e.mo28318b(C5891i.class);
            if (dVar != null) {
                C3126j jVar = this.f9089a;
                jVar.f9064g = dVar;
                if (jVar.f9067j != null) {
                    AbstractC5863b bVar = jVar.f9067j;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo11661a(dVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$j */
    static final class C3137j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3126j f9092a;

        static {
            Covode.recordClassIndex(3618);
        }

        C3137j(C3126j jVar) {
            this.f9092a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (C10330k.m18807a(this.f9092a.f9128b)) {
                int i = Build.VERSION.SDK_INT;
                if (!this.f9092a.f9128b.isDestroyed()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance != 100 && runningAppProcessInfo.importance != 200) {
                        this.f9092a.mo8443a(EnumC3091a.CMD_TRANSITION_TO_FLOATING);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8442a(Bundle bundle) {
        C3147p pVar;
        C89219l.m154721d(bundle, "");
        super.mo8442a(bundle);
        Dialog dialog = this.f9072p;
        if (dialog != null) {
            C11279p.m20014b(dialog);
        }
        try {
            AbstractC10312b b = C10328j.m18798b("control_view");
            if (b != null) {
                b.mo17082a();
            }
        } catch (Throwable th) {
            C3854a.m9453a(6, "ALogger", th.getMessage());
        }
        try {
            AbstractC10312b b2 = C10328j.m18798b("msg_view");
            if (b2 != null) {
                b2.mo17082a();
            }
        } catch (Throwable th2) {
            C3854a.m9453a(6, "ALogger", th2.getMessage());
        }
        C3142k kVar = this.f9077u;
        if (kVar != null && (pVar = kVar.f9097a) != null) {
            bundle.putLong("live_end_ui_float_time", pVar.f9109d);
            bundle.putFloat("live_end_ui_float_time_percent", pVar.f9110e);
            bundle.putLong("live_end_ui_snapped_time", pVar.f9107b);
            bundle.putFloat("live_end_ui_snapped_time_percent", pVar.f9108c);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8444a(AbstractBinderC11605a aVar) {
        C89219l.m154721d(aVar, "");
        this.f9080x = aVar;
        if (aVar.isLiveFinished()) {
            C3854a.m9453a(3, this.f9127a, "room close onServiceConnected isLiveFinished");
            this.f9130d.mo8505d();
        } else {
            aVar.setLiveStatusListener(new C3140m(this));
            if (!EnableTTCaptureSetting.INSTANCE.enable()) {
                C3854a.m9453a(4, C3126j.class.getCanonicalName(), "ksystart: " + System.currentTimeMillis());
                aVar.startStream(this.f9069m, PrivacyCert.Builder.Companion.with("bpea-574").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                C3854a.m9453a(4, C3126j.class.getCanonicalName(), "ksyend: " + System.currentTimeMillis());
            }
            DataChannel dataChannel = this.f9131e;
            Object b = this.f9131e.mo28318b(C9068cg.class);
            if (b == null) {
                b = ((IMessageService) C6193a.m13435a(IMessageService.class)).messageManagerProvider(this.f9129c.getId(), true, (Context) this.f9128b);
            }
            dataChannel.mo28311a(C9068cg.class, b);
        }
        Intent intent = this.f9078v;
        if (intent != null) {
            m8500a(intent, PrivacyCert.Builder.Companion.with("bpea-577").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$f */
    static final class DialogInterface$OnClickListenerC3133f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3126j f9087a;

        static {
            Covode.recordClassIndex(3614);
        }

        DialogInterface$OnClickListenerC3133f(C3126j jVar) {
            this.f9087a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            if (!C10330k.m18807a(this.f9087a.f9128b)) {
                C10330k.m18808b(this.f9087a.f9128b);
            } else {
                C6805b<Boolean> bVar = AbstractC6804a.f16933ai;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a((C6800c) bVar, (Object) true);
                C6806c.m14603a((C6800c) AbstractC6804a.f16932ah, (Object) true);
            }
            dialogInterface.dismiss();
            C6501b.C6502a.m13948a("livesdk_gift_and_comment_notification").mo12651a("click_icon", "allow").mo12655b();
        }
    }

    /* renamed from: a */
    private static Object m8499a(Activity activity, String str) {
        Object obj;
        MethodCollector.m26663i(8139);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
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
                    MethodCollector.m26664o(8139);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$g */
    static final class DialogInterface$OnClickListenerC3134g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3126j f9088a;

        static {
            Covode.recordClassIndex(3615);
        }

        DialogInterface$OnClickListenerC3134g(C3126j jVar) {
            this.f9088a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C89219l.m154721d(dialogInterface, "");
            dialogInterface.dismiss();
            if (!this.f9088a.f9063f) {
                C3126j jVar = this.f9088a;
                C6805b<Integer> bVar = AbstractC6804a.f16876E;
                if (bVar.mo13066a().intValue() < 3) {
                    C6806c.m14603a(bVar, Integer.valueOf(bVar.mo13066a().intValue() + 1));
                    C4034b.C4035a aVar = new C4034b.C4035a(jVar.f9128b);
                    aVar.f11163m = true;
                    aVar.f11168r = R.string.ehy;
                    aVar.f11169s = 182.0f;
                    aVar.f11165o = ((int) C13628n.m24520b(jVar.f9128b, 206.0f)) + ((int) C13628n.m24520b(aVar.f11150F, 14.0f));
                    aVar.f11166p = ((int) C13628n.m24520b(jVar.f9128b, 58.0f)) + ((int) C13628n.m24520b(aVar.f11150F, 14.0f));
                    aVar.f11162l = 3000;
                    aVar.f11155e = false;
                    aVar.f11146B = true;
                    aVar.f11160j = (int) (-C13628n.m24520b(jVar.f9128b, 5.0f));
                    aVar.f11153c = jVar.f9128b.getResources().getColor(R.color.vc);
                    C4034b bVar2 = new C4034b(aVar);
                    bVar2.mo9471a();
                    View view = EnumC5847l.MORE.getView(jVar.f9131e);
                    if (view != null) {
                        float c = ((float) bVar2.mo9475c()) - C13628n.m24520b(jVar.f9128b, 20.0f);
                        bVar2.f11124d = view.getMeasuredWidth() - bVar2.mo9475c();
                        bVar2.f11122b = c;
                        bVar2.mo9472a(view);
                    }
                }
            }
            C6501b.C6502a.m13948a("livesdk_gift_and_comment_notification").mo12651a("click_icon", "cancel").mo12655b();
        }
    }

    /* renamed from: a */
    private final void m8500a(Intent intent, PrivacyCert privacyCert) {
        AbstractBinderC11605a aVar = this.f9080x;
        if (aVar != null) {
            aVar.setData(intent, this.f9069m, this.f9131e);
            BgBroadcastServiceImpl.setProjectionIntent(null);
            aVar.startStream(this.f9069m, privacyCert);
            C3854a.m9453a(4, C3126j.class.getCanonicalName(), "end: " + System.currentTimeMillis());
            DataChannel dataChannel = this.f9131e;
            Object b = this.f9131e.mo28318b(C9068cg.class);
            if (b == null) {
                b = ((IMessageService) C6193a.m13435a(IMessageService.class)).messageManagerProvider(this.f9129c.getId(), true, (Context) this.f9128b);
            }
            dataChannel.mo28311a(C9068cg.class, b);
            this.f9130d.mo8497a(new C7762ap());
            this.f9071o = true;
        }
    }

    /* renamed from: a */
    private static Intent m8498a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3126j(Room room, AbstractC3182f fVar, DataChannel dataChannel) {
        super(room, fVar, dataChannel);
        C89219l.m154721d(room, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dataChannel, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m8501b(android.app.Activity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m8498a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.p189a.C3126j.m8501b(android.app.Activity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.AbstractC3153b
    /* renamed from: a */
    public final void mo8441a(int i, int i2, Intent intent) {
        super.mo8441a(i, i2, intent);
        if (i != 1000) {
            return;
        }
        if (i2 != -1) {
            this.f9130d.mo8505d();
        } else if (intent != null) {
            m8500a(intent, PrivacyCert.Builder.Companion.with("bpea-576").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }
}
