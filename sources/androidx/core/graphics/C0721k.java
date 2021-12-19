package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.p032a.C0629c;
import androidx.core.p034e.C0657b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.k */
public class C0721k {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0629c.C0631b> f2825a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.k$a */
    public interface AbstractC0724a<T> {
        static {
            Covode.recordClassIndex(805);
        }

        /* renamed from: a */
        boolean mo2803a(T t);

        /* renamed from: b */
        int mo2804b(T t);
    }

    static {
        Covode.recordClassIndex(802);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2801a(Context context, InputStream inputStream) {
        File a = C0725l.m2574a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0725l.m2580a(a, inputStream)) {
                return null;
            }
            Typeface a2 = m2560a(a.getPath());
            m2562a(a);
            return a2;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m2562a(a);
        }
    }

    C0721k() {
    }

    /* renamed from: a */
    private static long m2559a(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Typeface m2560a(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface createFromFile = Typeface.createFromFile(str);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(str, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(str);
    }

    /* renamed from: a */
    private static boolean m2562a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0657b.C0663b mo2802a(C0657b.C0663b[] bVarArr, int i) {
        return (C0657b.C0663b) m2561a(bVarArr, i, new AbstractC0724a<C0657b.C0663b>() {
            /* class androidx.core.graphics.C0721k.C07221 */

            static {
                Covode.recordClassIndex(803);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.C0721k.AbstractC0724a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo2803a(C0657b.C0663b bVar) {
                return bVar.f2677d;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.C0721k.AbstractC0724a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo2804b(C0657b.C0663b bVar) {
                return bVar.f2676c;
            }
        });
    }

    /* renamed from: a */
    private static <T> T m2561a(T[] tArr, int i, AbstractC0724a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.mo2804b(t2) - i2) * 2;
            if (aVar.mo2803a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo2796a(Context context, CancellationSignal cancellationSignal, C0657b.C0663b[] bVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2802a(bVarArr, i).f2674a);
            try {
                Typeface a = mo2801a(context, inputStream);
                C0725l.m2578a(inputStream);
                return a;
            } catch (IOException unused) {
                C0725l.m2578a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                C0725l.m2578a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0725l.m2578a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C0725l.m2578a(inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo2797a(Context context, C0629c.C0631b bVar, Resources resources, int i) {
        C0629c.C0632c cVar = (C0629c.C0632c) m2561a(bVar.f2625a, i, new AbstractC0724a<C0629c.C0632c>() {
            /* class androidx.core.graphics.C0721k.C07232 */

            static {
                Covode.recordClassIndex(804);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.C0721k.AbstractC0724a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo2803a(C0629c.C0632c cVar) {
                return cVar.f2628c;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.core.graphics.C0721k.AbstractC0724a
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ int mo2804b(C0629c.C0632c cVar) {
                return cVar.f2627b;
            }
        });
        if (cVar == null) {
            return null;
        }
        Typeface a = C0715e.m2525a(context, resources, cVar.f2631f, cVar.f2626a, i);
        long a2 = m2559a(a);
        if (a2 != 0) {
            this.f2825a.put(Long.valueOf(a2), bVar);
        }
        return a;
    }

    /* renamed from: a */
    public Typeface mo2798a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0725l.m2574a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0725l.m2579a(a, resources, i)) {
                return null;
            }
            Typeface a2 = m2560a(a.getPath());
            m2562a(a);
            return a2;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m2562a(a);
        }
    }
}
