package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1204m;
import androidx.loader.p062a.C1232c;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
public abstract class AbstractC1247a {

    /* renamed from: androidx.loader.app.a$a */
    public interface AbstractC1248a<D> {
        static {
            Covode.recordClassIndex(1357);
        }

        /* renamed from: a */
        C1232c<D> mo4109a(Bundle bundle);

        /* renamed from: a */
        void mo4110a();

        /* renamed from: a */
        void mo4111a(D d);
    }

    static {
        Covode.recordClassIndex(1356);
    }

    /* renamed from: a */
    public abstract <D> C1232c<D> mo4097a(int i, Bundle bundle, AbstractC1248a<D> aVar);

    /* renamed from: a */
    public abstract void mo4098a();

    /* renamed from: a */
    public abstract void mo4099a(int i);

    /* renamed from: a */
    public abstract void mo4100a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public static <T extends AbstractC1204m & AbstractC1183ag> AbstractC1247a m3990a(T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }
}
