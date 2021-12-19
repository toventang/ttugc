package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a;
import java.lang.ref.WeakReference;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.d */
public final class C72784d {

    /* renamed from: a */
    public WeakReference<Activity> f163209a;

    /* renamed from: b */
    public volatile long f163210b = -1;

    /* renamed from: c */
    public final AbstractC72786b f163211c;

    /* renamed from: d */
    public final AbstractC73354a f163212d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.d$b */
    public interface AbstractC72786b {
        static {
            Covode.recordClassIndex(85472);
        }

        /* renamed from: a */
        void mo115068a();

        /* renamed from: a */
        void mo115069a(int i, int i2, double d);

        /* renamed from: b */
        void mo115070b();
    }

    static {
        Covode.recordClassIndex(85470);
    }

    /* renamed from: a */
    public final AudioRecorderInterface mo115067a() {
        return new C72785a(this, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.d$a */
    class C72785a extends AbstractC72787e {
        static {
            Covode.recordClassIndex(85471);
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final void lackPermission() {
            C72784d.this.f163211c.mo115070b();
            Activity activity = C72784d.this.f163209a.get();
            if (activity != null) {
                C72784d.this.f163212d.mo116015a(activity);
            }
        }

        private C72785a() {
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int closeWavFile(boolean z) {
            C72784d.this.f163211c.mo115068a();
            return 0;
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final void recordStatus(boolean z) {
            if (!z && C72784d.this.f163210b == -1) {
                C72784d.this.f163210b = System.currentTimeMillis();
            }
        }

        /* synthetic */ C72785a(C72784d dVar, byte b) {
            this();
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int initWavFile(int i, int i2, double d) {
            C72784d.this.f163210b = -1;
            C72784d.this.f163211c.mo115069a(i, i2, d);
            return 0;
        }

        @Override // org.libsdl.app.AudioRecorderInterface
        public final int addPCMData(byte[] bArr, int i, long j) {
            if (C72784d.this.f163210b != -1) {
                return 0;
            }
            C72784d.this.f163210b = System.currentTimeMillis();
            return 0;
        }
    }

    public C72784d(Activity activity, AbstractC73354a aVar, AbstractC72786b bVar) {
        this.f163209a = new WeakReference<>(activity);
        this.f163212d = aVar;
        this.f163211c = bVar;
    }
}
