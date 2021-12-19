package android.support.p010v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.p010v4.media.session.C0160e;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.media.session.f */
final class C0163f {

    /* renamed from: android.support.v4.media.session.f$a */
    public interface AbstractC0164a extends C0160e.AbstractC0161a {
        static {
            Covode.recordClassIndex(187);
        }
    }

    static {
        Covode.recordClassIndex(186);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.f$b */
    public static class C0165b<T extends AbstractC0164a> extends C0160e.C0162b<T> {
        static {
            Covode.recordClassIndex(188);
        }

        public final void onPrepare() {
        }

        public C0165b(T t) {
            super(t);
        }

        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }

        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }

        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m227a(bundle);
        }
    }

    /* renamed from: a */
    public static String m568a(Object obj) {
        try {
            return (String) obj.getClass().getMethod("getCallingPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
