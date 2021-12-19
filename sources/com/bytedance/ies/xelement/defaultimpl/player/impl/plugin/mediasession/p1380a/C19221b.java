package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.lang.reflect.Field;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b */
public final class C19221b implements AbstractC19192a {

    /* renamed from: f */
    public static final C19222a f45398f = new C19222a((byte) 0);

    /* renamed from: a */
    final NotificationManager f45399a;

    /* renamed from: b */
    final C19230d f45400b;

    /* renamed from: c */
    public C19239e f45401c;

    /* renamed from: d */
    public final IBinder.DeathRecipient f45402d;

    /* renamed from: e */
    public MediaSessionService.BinderC19241b f45403e;

    /* renamed from: g */
    private final AbstractC89244h f45404g = C89250i.m154773a((AbstractC89171a) new C19226e(this));

    /* renamed from: h */
    private final AbstractC89244h f45405h = C89250i.m154773a((AbstractC89171a) C19228f.f45416a);

    /* renamed from: i */
    private final ServiceConnection f45406i;

    /* renamed from: j */
    private final Context f45407j;

    /* renamed from: k */
    private final AbstractC19181b f45408k;

    /* renamed from: l */
    private final AbstractC18997c f45409l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$b */
    public static final class C19223b {

        /* renamed from: a */
        public boolean f45410a = false;

        /* renamed from: b */
        public boolean f45411b = false;

        static {
            Covode.recordClassIndex(21990);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19223b)) {
                return false;
            }
            C19223b bVar = (C19223b) obj;
            return this.f45410a == bVar.f45410a && this.f45411b == bVar.f45411b;
        }

        public final int hashCode() {
            boolean z = this.f45410a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            if (!this.f45411b) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "NotificationContext(isActive=" + this.f45410a + ", isShown=" + this.f45411b + ")";
        }
    }

    static {
        Covode.recordClassIndex(21988);
    }

    /* renamed from: e */
    private final C19226e.HandlerC192271 m35921e() {
        return (C19226e.HandlerC192271) this.f45404g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C19223b mo30579b() {
        return (C19223b) this.f45405h.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$a */
    public static final class C19222a {
        static {
            Covode.recordClassIndex(21989);
        }

        private C19222a() {
        }

        public /* synthetic */ C19222a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$d */
    static final class C19225d implements IBinder.DeathRecipient {

        /* renamed from: a */
        final /* synthetic */ C19221b f45413a;

        static {
            Covode.recordClassIndex(21992);
        }

        C19225d(C19221b bVar) {
            this.f45413a = bVar;
        }

        public final void binderDied() {
            this.f45413a.mo30581d();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$f */
    static final class C19228f extends AbstractC89220m implements AbstractC89171a<C19223b> {

        /* renamed from: a */
        public static final C19228f f45416a = new C19228f();

        static {
            Covode.recordClassIndex(21995);
        }

        C19228f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19223b invoke() {
            return new C19223b();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$e */
    static final class C19226e extends AbstractC89220m implements AbstractC89171a<HandlerC192271> {

        /* renamed from: a */
        final /* synthetic */ C19221b f45414a;

        static {
            Covode.recordClassIndex(21993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19226e(C19221b bVar) {
            super(0);
            this.f45414a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC192271 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.p1380a.C19221b.C19226e.HandlerC192271 */

                /* renamed from: a */
                final /* synthetic */ C19226e f45415a;

                static {
                    Covode.recordClassIndex(21994);
                }

                public final void handleMessage(Message message) {
                    Integer valueOf;
                    super.handleMessage(message);
                    Boolean bool = null;
                    if (message != null && (valueOf = Integer.valueOf(message.what)) != null) {
                        if (valueOf.intValue() == 1) {
                            Object obj = message.obj;
                            if (!(obj instanceof C19239e)) {
                                obj = null;
                            }
                            C19239e eVar = (C19239e) obj;
                            if (eVar != null) {
                                C19221b bVar = this.f45415a.f45414a;
                                Notification a = bVar.f45400b.mo30589a(eVar);
                                if (a != null) {
                                    try {
                                        C19239e eVar2 = bVar.f45401c;
                                        if (eVar2 != null) {
                                            bool = eVar2.f45442a;
                                        }
                                        if (C89219l.m154714a((Object) bool, (Object) true)) {
                                            MediaSessionService.BinderC19241b bVar2 = bVar.f45403e;
                                            if (bVar2 != null) {
                                                int i = C19218a.f45396a;
                                                C89219l.m154719c(a, "");
                                                try {
                                                    bVar2.f45450a.startForeground(i, a);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        } else {
                                            bVar.f45399a.notify(C19218a.f45396a, a);
                                        }
                                        bVar.mo30579b().f45411b = true;
                                    } catch (Throwable th) {
                                        C19004g.f44970a.mo30157c("NotificationController", "showImmediate: " + Log.getStackTraceString(th));
                                    }
                                }
                            }
                        } else if (valueOf.intValue() == 2) {
                            this.f45415a.f45414a.mo30580c();
                        }
                    }
                }

                {
                    this.f45415a = r1;
                }
            };
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        mo30580c();
        m35924h();
        this.f45401c = null;
    }

    /* renamed from: h */
    private final void m35924h() {
        try {
            MediaSessionService.BinderC19241b bVar = this.f45403e;
            if (bVar != null) {
                bVar.unlinkToDeath(this.f45402d, 0);
            }
            this.f45407j.unbindService(this.f45406i);
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c("NotificationController", th.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo30581d() {
        MediaSessionService.BinderC19241b bVar = this.f45403e;
        if (bVar != null) {
            bVar.unlinkToDeath(this.f45402d, 0);
        }
        this.f45403e = null;
        m35923g();
    }

    /* renamed from: f */
    private void m35922f() {
        if (mo30579b().f45411b) {
            m35921e().removeMessages(1);
            m35921e().removeMessages(2);
            m35921e().sendMessageDelayed(Message.obtain(m35921e(), 2), 300);
        }
    }

    /* renamed from: g */
    private final void m35923g() {
        if (this.f45403e == null) {
            try {
                Intent intent = new Intent(this.f45407j, MediaSessionService.class);
                Context context = this.f45407j;
                ServiceConnection serviceConnection = this.f45406i;
                if (context == null || !(context instanceof Context)) {
                    context.bindService(intent, serviceConnection, 1);
                } else if (!C65713d.m117625a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
            } catch (Throwable th) {
                C19004g.f44970a.mo30157c("NotificationController", th.getMessage());
            }
        }
    }

    /* renamed from: c */
    public final void mo30580c() {
        try {
            MediaSessionService.BinderC19241b bVar = this.f45403e;
            if (bVar != null) {
                bVar.mo30593a();
            }
            this.f45399a.cancel(C19218a.f45396a);
            mo30579b().f45411b = false;
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c("NotificationController", "hideImmediate: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a.b$c */
    public static final class ServiceConnectionC19224c implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ C19221b f45412a;

        static {
            Covode.recordClassIndex(21991);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ServiceConnectionC19224c(C19221b bVar) {
            this.f45412a = bVar;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f45412a.mo30581d();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof MediaSessionService.BinderC19241b) {
                this.f45412a.f45403e = (MediaSessionService.BinderC19241b) iBinder;
                MediaSessionService.BinderC19241b bVar = this.f45412a.f45403e;
                if (bVar != null) {
                    bVar.linkToDeath(this.f45412a.f45402d, 0);
                }
                C19239e eVar = this.f45412a.f45401c;
                if (eVar != null) {
                    this.f45412a.mo30577a(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo30578a(boolean z) {
        mo30579b().f45410a = z;
    }

    /* renamed from: a */
    public final void mo30573a(Intent intent) {
        int intExtra;
        AbstractC18997c cVar;
        C89219l.m154719c(intent, "");
        if (!mo30579b().f45410a || (intExtra = intent.getIntExtra("command_from_notification", -1)) == -1) {
            return;
        }
        if (intExtra == 1 || intExtra == 2) {
            mo30580c();
        } else if (intExtra == 3 && (cVar = this.f45409l) != null && cVar.bq_()) {
            this.f45409l.br_();
        }
    }

    /* renamed from: a */
    public final void mo30574a(Bitmap bitmap) {
        C19239e eVar = this.f45401c;
        if (eVar != null) {
            eVar.f45448g = bitmap;
            eVar.f45443b = Boolean.valueOf(this.f45408k.mo30405j());
            eVar.f45444c = Boolean.valueOf(this.f45408k.mo30404i());
            mo30577a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo30575a(EnumC19170o oVar) {
        C89219l.m154719c(oVar, "");
        if (C19229c.f45417a[oVar.ordinal()] != 1) {
            C19239e eVar = this.f45401c;
            if (eVar != null) {
                eVar.f45442a = Boolean.valueOf(oVar.isPlayingState());
                eVar.f45443b = Boolean.valueOf(this.f45408k.mo30405j());
                eVar.f45444c = Boolean.valueOf(this.f45408k.mo30404i());
                mo30577a(eVar);
                return;
            }
            return;
        }
        m35922f();
    }

    /* renamed from: a */
    public final void mo30576a(AbstractC19186f fVar) {
        if (fVar == null) {
            mo30373a();
            return;
        }
        C19239e eVar = new C19239e();
        eVar.f45442a = false;
        eVar.f45443b = Boolean.valueOf(this.f45408k.mo30405j());
        eVar.f45444c = Boolean.valueOf(this.f45408k.mo30404i());
        eVar.f45445d = fVar.getSongName();
        eVar.f45446e = fVar.getArtistName();
        eVar.f45447f = fVar.getAlbumName();
        eVar.f45448g = null;
        mo30577a(eVar);
        this.f45401c = eVar;
    }

    /* renamed from: a */
    public final void mo30577a(C19239e eVar) {
        if (C89219l.m154714a((Object) eVar.f45442a, (Object) true) || mo30579b().f45411b) {
            m35921e().removeMessages(1);
            m35921e().removeMessages(2);
            m35921e().sendMessageDelayed(Message.obtain(m35921e(), 1, eVar), 150);
        }
    }

    /* renamed from: a */
    private static Object m35920a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5336);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5336);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C19221b(Context context, MediaSessionCompat.Token token, AbstractC19181b bVar, ComponentName componentName, AbstractC18997c cVar, int i) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(token, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(componentName, "");
        this.f45407j = context;
        this.f45408k = bVar;
        this.f45409l = cVar;
        Object a = m35920a(context, "notification");
        if (a != null) {
            NotificationManager notificationManager = (NotificationManager) a;
            this.f45399a = notificationManager;
            this.f45402d = new C19225d(this);
            this.f45406i = new ServiceConnectionC19224c(this);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("X_AUDIO_DEFAULT_PLAY_SERVICE", "X_AUDIO_DEFAULT_PLAY_SERVICE_CHANNEL", 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.setDescription("X_AUDIO_DEFAULT_PLAY_SERVICE");
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            this.f45400b = new C19230d(context, token, componentName, i);
            m35923g();
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
