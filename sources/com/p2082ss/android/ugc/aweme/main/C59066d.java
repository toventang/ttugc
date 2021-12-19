package com.p2082ss.android.ugc.aweme.main;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.main.d */
public final class C59066d {

    /* renamed from: a */
    static int f134457a = 1;

    /* renamed from: b */
    static final WeakHashMap<Context, C59067a> f134458b = new WeakHashMap<>();

    /* renamed from: c */
    static volatile boolean f134459c = false;

    static {
        Covode.recordClassIndex(69412);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d$a */
    public static class C59067a {

        /* renamed from: a */
        public Context f134460a;

        /* renamed from: b */
        public ContextThemeWrapper f134461b;

        /* renamed from: c */
        public Configuration f134462c;

        static {
            Covode.recordClassIndex(69413);
        }

        /* renamed from: a */
        public final boolean mo96595a(MainActivity mainActivity) {
            if (!mainActivity.getOriginResources().getConfiguration().equals(this.f134462c)) {
                return m108547b(mainActivity);
            }
            return false;
        }

        /* renamed from: b */
        private boolean m108547b(MainActivity mainActivity) {
            if (mainActivity == null) {
                return true;
            }
            this.f134460a = C59066d.m108545a(mainActivity);
            this.f134462c = mainActivity.getOriginResources().getConfiguration();
            try {
                Method declaredMethod = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]);
                declaredMethod.setAccessible(true);
                this.f134461b = new ContextThemeWrapper(mainActivity, ((Integer) declaredMethod.invoke(mainActivity, new Object[0])).intValue());
                return false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static Context m108545a(MainActivity mainActivity) {
        try {
            Trace.beginSection("generateWrapperContext");
            Configuration configuration = (Configuration) m108546a(mainActivity.getOriginResources().getConfiguration());
            Field a = C59088f.m108568a(Configuration.class, "assetsSeq");
            int intValue = ((Integer) a.get(configuration)).intValue();
            int i = f134457a;
            f134457a = i + 1;
            a.set(configuration, Integer.valueOf(intValue + i));
            Context createConfigurationContext = mainActivity.createConfigurationContext(configuration);
            Trace.endSection();
            return createConfigurationContext;
        } catch (Throwable unused) {
            Trace.endSection();
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m108546a(Parcelable parcelable) {
        Parcel parcel;
        Throwable th;
        try {
            parcel = Parcel.obtain();
            try {
                parcel.writeParcelable(parcelable, 0);
                parcel.setDataPosition(0);
                T t = (T) parcel.readParcelable(parcelable.getClass().getClassLoader());
                parcel.recycle();
                return t;
            } catch (Throwable th2) {
                th = th2;
                parcel.recycle();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            parcel = null;
            parcel.recycle();
            throw th;
        }
    }
}
