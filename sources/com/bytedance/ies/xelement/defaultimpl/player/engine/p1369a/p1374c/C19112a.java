package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.C19175b;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a */
public final class C19112a extends AbstractC19174a implements AbstractC19161f {

    /* renamed from: d */
    public static final String f45259d = C19112a.class.getSimpleName();

    /* renamed from: e */
    public static final C19113a f45260e = new C19113a((byte) 0);

    /* renamed from: b */
    public final Context f45261b;

    /* renamed from: c */
    public long f45262c;

    /* renamed from: f */
    private final AbstractC89244h f45263f;

    /* renamed from: g */
    private final AbstractC89244h f45264g;

    /* renamed from: h */
    private AudioManager.OnAudioFocusChangeListener f45265h;

    /* renamed from: h */
    private final AudioManager m35618h() {
        return (AudioManager) this.f45264g.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final C19169n mo30465b(C19169n nVar) {
        return nVar;
    }

    /* renamed from: c */
    public final C19116d.HandlerC191171 mo30492c() {
        return (C19116d.HandlerC191171) this.f45263f.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: f */
    public final boolean mo30469f() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a$a */
    public static final class C19113a {
        static {
            Covode.recordClassIndex(21876);
        }

        private C19113a() {
        }

        public /* synthetic */ C19113a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a$d */
    static final class C19116d extends AbstractC89220m implements AbstractC89171a<HandlerC191171> {

        /* renamed from: a */
        final /* synthetic */ C19112a f45268a;

        static {
            Covode.recordClassIndex(21879);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19116d(C19112a aVar) {
            super(0);
            this.f45268a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC191171 invoke() {
            return new Handler(this, Looper.getMainLooper()) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c.C19112a.C19116d.HandlerC191171 */

                /* renamed from: a */
                final /* synthetic */ C19116d f45269a;

                static {
                    Covode.recordClassIndex(21880);
                }

                public final void handleMessage(Message message) {
                    AbstractC19158c cVar;
                    super.handleMessage(message);
                    C19175b bVar = this.f45269a.f45268a.f45324a;
                    if (bVar != null && (cVar = bVar.f45329e) != null && message != null && message.what == 1 && cVar.mo30387b().isPlayingState()) {
                        C19004g.f44970a.mo30155a(C19112a.f45259d, "AUDIOFOCUS_LOSS, and pause the play");
                        cVar.mo30397d(new C19194c("PAUSE_FROM_LOSS_FOCUS"));
                    }
                }

                {
                    this.f45269a = r1;
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a$c */
    static final class C19115c extends AbstractC89220m implements AbstractC89171a<AudioManager> {

        /* renamed from: a */
        final /* synthetic */ C19112a f45267a;

        static {
            Covode.recordClassIndex(21878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19115c(C19112a aVar) {
            super(0);
            this.f45267a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AudioManager invoke() {
            Object a = m35632a(this.f45267a.f45261b, DataType.AUDIO);
            if (a != null) {
                return a;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        /* renamed from: a */
        private static Object m35632a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(5493);
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
                        MethodCollector.m26664o(5493);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(21875);
    }

    /* renamed from: i */
    private final void m35619i() {
        try {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f45265h;
            if (onAudioFocusChangeListener != null) {
                m35618h().abandonAudioFocus(onAudioFocusChangeListener);
            }
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c(f45259d, th.getMessage());
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30490a() {
        AbstractC19162g gVar;
        super.mo30490a();
        m35619i();
        C19175b bVar = this.f45324a;
        if (!(bVar == null || (gVar = bVar.f45328d) == null)) {
            gVar.mo30389b(this);
        }
        this.f45265h = null;
    }

    /* renamed from: g */
    public final boolean mo30493g() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f45265h;
        if (onAudioFocusChangeListener == null || m35618h().requestAudioFocus(onAudioFocusChangeListener, 3, 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a$b */
    public static final class C19114b implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        private final WeakReference<C19112a> f45266a;

        static {
            Covode.recordClassIndex(21877);
        }

        public C19114b(WeakReference<C19112a> weakReference) {
            C89219l.m154719c(weakReference, "");
            this.f45266a = weakReference;
        }

        public final void onAudioFocusChange(int i) {
            AbstractC19158c cVar;
            String str;
            C19112a aVar = this.f45266a.get();
            if (aVar != null) {
                C89219l.m154709a((Object) aVar, "");
                boolean z = true;
                if (i == -2 || i == -1) {
                    if (System.currentTimeMillis() > aVar.f45262c) {
                        aVar.mo30492c().sendEmptyMessageDelayed(1, 1000);
                    } else {
                        aVar.mo30493g();
                    }
                } else if (i == 1) {
                    C19004g.f44970a.mo30155a(C19112a.f45259d, "AUDIOFOCUS_GAIN, and resume the play");
                    C19175b bVar = aVar.f45324a;
                    if (bVar != null && (cVar = bVar.f45329e) != null) {
                        if (cVar.mo30387b() != EnumC19170o.PLAYBACK_STATE_PAUSED) {
                            z = false;
                        }
                        C19194c g = cVar.mo30402g();
                        if (g != null) {
                            str = g.f45337a;
                        } else {
                            str = null;
                        }
                        boolean a = C89219l.m154714a((Object) str, (Object) "PAUSE_FROM_LOSS_FOCUS");
                        if (z && a) {
                            cVar.mo30399e(null);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final boolean mo30466b(C19194c cVar) {
        String str;
        if (cVar != null) {
            str = cVar.f45337a;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "PAUSE_FROM_LOSS_FOCUS")) {
            C19004g.f44970a.mo30155a(f45259d, "Pause reason is loss focus, we needn't release audio focus for help us can retrieve focus again.");
            return false;
        }
        m35619i();
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: c */
    public final boolean mo30467c(C19194c cVar) {
        if (mo30493g()) {
            return false;
        }
        C19004g.f44970a.mo30155a(f45259d, "Request audio focus failed, we intercept this resume operation.");
        return true;
    }

    public C19112a(Context context) {
        C89219l.m154719c(context, "");
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154709a((Object) applicationContext, "");
        this.f45261b = applicationContext;
        this.f45263f = C89250i.m154773a((AbstractC89171a) new C19116d(this));
        this.f45264g = C89250i.m154773a((AbstractC89171a) new C19115c(this));
        this.f45265h = new C19114b(new WeakReference(this));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30454a(EnumC19157b bVar) {
        C89219l.m154719c(bVar, "");
        super.mo30454a(bVar);
        m35619i();
        C19004g.f44970a.mo30157c(f45259d, "abandon focus because of onError: ".concat(String.valueOf(bVar)));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: d */
    public final boolean mo30468d(C19194c cVar) {
        if (mo30492c().hasMessages(1)) {
            mo30492c().removeMessages(1);
            C19004g.f44970a.mo30155a(f45259d, "Found pending execute pause task when stop invoked, remove this task immediate.");
        }
        this.f45262c = System.currentTimeMillis() + 1000;
        m35619i();
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30457a(EnumC19170o oVar) {
        C89219l.m154719c(oVar, "");
        super.mo30457a(oVar);
        if (oVar == EnumC19170o.PLAYBACK_STATE_ERROR || oVar == EnumC19170o.PLAYBACK_STATE_STOPPED) {
            m35619i();
            C19004g.f44970a.mo30155a(f45259d, "abandon focus because of: ".concat(String.valueOf(oVar)));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30491a(C19175b bVar) {
        AbstractC19162g gVar;
        C89219l.m154719c(bVar, "");
        super.mo30491a(bVar);
        C19175b bVar2 = this.f45324a;
        if (bVar2 != null && (gVar = bVar2.f45328d) != null) {
            gVar.mo30376a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: a */
    public final boolean mo30464a(C19194c cVar) {
        if (mo30493g()) {
            return false;
        }
        C19004g.f44970a.mo30156b(f45259d, "Request audio focus failed, we intercept this play operation.");
        return true;
    }
}
