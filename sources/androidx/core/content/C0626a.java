package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.core.p033d.C0646a;
import androidx.core.p033d.C0650d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.content.a */
public final class C0626a {
    static {
        Covode.recordClassIndex(705);
    }

    /* renamed from: a */
    public static Cursor m2327a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0646a aVar) {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (aVar != null) {
            try {
                obj = aVar.mo2677c();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new C0650d();
                }
                throw e;
            }
        } else {
            obj = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
