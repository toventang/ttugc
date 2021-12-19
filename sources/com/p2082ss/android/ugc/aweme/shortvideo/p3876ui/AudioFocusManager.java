package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager */
public final class AudioFocusManager implements AbstractC33974au {

    /* renamed from: b */
    public static final C73302a f164617b = new C73302a((byte) 0);

    /* renamed from: a */
    public final ActivityC0218d f164618a;

    /* renamed from: c */
    private final AbstractC89244h f164619c;

    /* renamed from: d */
    private final C73504bg f164620d;

    static {
        Covode.recordClassIndex(86021);
    }

    /* renamed from: a */
    public final AudioManager mo115807a() {
        return (AudioManager) this.f164619c.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$a */
    public static final class C73302a {
        static {
            Covode.recordClassIndex(86022);
        }

        private C73302a() {
        }

        public /* synthetic */ C73302a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AudioFocusManager m129359a(ActivityC0218d dVar) {
            C89219l.m154721d(dVar, "");
            return new AudioFocusManager(dVar, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$c */
    static final class C73304c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f164622a;

        static {
            Covode.recordClassIndex(86024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73304c(AudioFocusManager audioFocusManager) {
            super(0);
            this.f164622a = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            try {
                this.f164622a.mo115807a().requestAudioFocus(null, 3, 1);
            } catch (Throwable unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$d */
    static final class C73305d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f164623a;

        static {
            Covode.recordClassIndex(86025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73305d(AudioFocusManager audioFocusManager) {
            super(0);
            this.f164623a = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            try {
                this.f164623a.mo115807a().abandonAudioFocus(null);
            } catch (Throwable unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager$b */
    static final class C73303b extends AbstractC89220m implements AbstractC89171a<AudioManager> {

        /* renamed from: a */
        final /* synthetic */ AudioFocusManager f164621a;

        static {
            Covode.recordClassIndex(86023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73303b(AudioFocusManager audioFocusManager) {
            super(0);
            this.f164621a = audioFocusManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AudioManager invoke() {
            Context applicationContext = this.f164621a.f164618a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            Object a = m129360a(applicationContext, DataType.AUDIO);
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.media.AudioManager");
            return a;
        }

        /* renamed from: a */
        private static Object m129360a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(6643);
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
                        MethodCollector.m26664o(6643);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC89171a<C89391z> aVar;
        C73504bg bgVar = this.f164620d;
        int i = C73504bg.f165143c + 1;
        C73504bg.f165143c = i;
        if (i == 1 && (aVar = bgVar.f165145a) != null) {
            aVar.invoke();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        AbstractC89171a<C89391z> aVar;
        C73504bg bgVar = this.f164620d;
        int i = C73504bg.f165143c - 1;
        C73504bg.f165143c = i;
        if (i == 0 && (aVar = bgVar.f165146b) != null) {
            aVar.invoke();
        }
    }

    private AudioFocusManager(ActivityC0218d dVar) {
        this.f164618a = dVar;
        dVar.getLifecycle().mo4012a(this);
        this.f164619c = C89250i.m154773a((AbstractC89171a) new C73303b(this));
        this.f164620d = new C73504bg(new C73304c(this), new C73305d(this));
    }

    public /* synthetic */ AudioFocusManager(ActivityC0218d dVar, byte b) {
        this(dVar);
    }
}
