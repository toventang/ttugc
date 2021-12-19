package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface AbstractC0568a {
        static {
            Covode.recordClassIndex(644);
        }

        /* renamed from: a */
        Object mo2550a();
    }

    static {
        Covode.recordClassIndex(643);
    }

    /* renamed from: a */
    private static <T> T m2177a(T t) {
        T t2;
        if (!(t instanceof AbstractC0568a) || (t2 = (T) t.mo2550a()) == null) {
            return t;
        }
        return t2;
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m2177a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m2177a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m2177a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m2177a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m2177a(super.instantiateService(classLoader, str, intent));
    }
}
