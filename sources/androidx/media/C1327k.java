package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.core.p036g.C0691d;
import androidx.media.C1323i;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.media.k */
final class C1327k extends C1326j {
    static {
        Covode.recordClassIndex(1440);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.media.k$a */
    public static final class C1328a implements C1323i.AbstractC1325b {

        /* renamed from: a */
        final MediaSessionManager.RemoteUserInfo f4307a;

        static {
            Covode.recordClassIndex(1441);
        }

        public final int hashCode() {
            return C0691d.m2447a(this.f4307a);
        }

        C1328a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4307a = remoteUserInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1328a)) {
                return false;
            }
            return this.f4307a.equals(((C1328a) obj).f4307a);
        }

        C1328a(String str, int i, int i2) {
            this.f4307a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }
    }
}
