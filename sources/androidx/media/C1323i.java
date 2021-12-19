package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.media.C1327k;
import androidx.media.C1329l;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.media.i */
public final class C1323i {

    /* renamed from: a */
    static final boolean f4304a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b */
    private static final Object f4305b = new Object();

    /* renamed from: androidx.media.i$b */
    interface AbstractC1325b {
        static {
            Covode.recordClassIndex(1438);
        }
    }

    /* renamed from: androidx.media.i$a */
    public static final class C1324a {

        /* renamed from: a */
        AbstractC1325b f4306a;

        static {
            Covode.recordClassIndex(1437);
        }

        public final int hashCode() {
            return this.f4306a.hashCode();
        }

        public C1324a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f4306a = new C1327k.C1328a(remoteUserInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1324a)) {
                return false;
            }
            return this.f4306a.equals(((C1324a) obj).f4306a);
        }

        public C1324a(String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f4306a = new C1327k.C1328a(str, i, i2);
            } else {
                this.f4306a = new C1329l.C1330a(str, i, i2);
            }
        }
    }

    static {
        Covode.recordClassIndex(1436);
    }
}
