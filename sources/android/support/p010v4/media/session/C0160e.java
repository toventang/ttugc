package android.support.p010v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.p010v4.media.session.C0157d;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.session.e */
final class C0160e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface AbstractC0161a extends C0157d.AbstractC0158a {
        static {
            Covode.recordClassIndex(184);
        }
    }

    static {
        Covode.recordClassIndex(183);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.e$b */
    public static class C0162b<T extends AbstractC0161a> extends C0157d.C0159b<T> {
        static {
            Covode.recordClassIndex(185);
        }

        public C0162b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }
    }
}
