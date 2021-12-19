package dagger.hilt.android.internal.managers;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import dagger.hilt.android.internal.p4538a.AbstractC88096e;
import dagger.hilt.android.internal.p4538a.AbstractC88097f;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.hilt.p4536a.C88085c;
import java.lang.reflect.Field;

/* renamed from: dagger.hilt.android.internal.managers.g */
public final class C88116g implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile Object f200014a;

    /* renamed from: b */
    private final Object f200015b;

    /* renamed from: c */
    private final boolean f200016c;

    /* renamed from: d */
    private final View f200017d;

    /* renamed from: dagger.hilt.android.internal.managers.g$b */
    public interface AbstractC88118b {
        static {
            Covode.recordClassIndex(104146);
        }

        /* renamed from: l */
        AbstractC88096e mo60018l();
    }

    /* renamed from: dagger.hilt.android.internal.managers.g$c */
    public interface AbstractC88119c {
        static {
            Covode.recordClassIndex(104147);
        }

        /* renamed from: a */
        AbstractC88097f mo60024a();
    }

    static {
        Covode.recordClassIndex(104144);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        AbstractC88084b bVar;
        Object a;
        boolean z;
        MethodCollector.m26663i(4188);
        if (this.f200014a == null) {
            synchronized (this.f200015b) {
                try {
                    if (this.f200014a == null) {
                        if (this.f200016c) {
                            Context a2 = m153189a(C88117a.class);
                            if (a2 instanceof C88117a) {
                                bVar = (AbstractC88084b) ((C88117a) a2).f200018a;
                            } else {
                                Context a3 = m153189a(AbstractC88084b.class);
                                if (!(a3 instanceof AbstractC88084b)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C88085c.m153156a(z, "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f200017d.getClass(), a3.getClass().getName());
                                IllegalStateException illegalStateException = new IllegalStateException(C1764a.m5928a("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f200017d.getClass()}));
                                MethodCollector.m26664o(4188);
                                throw illegalStateException;
                            }
                        } else {
                            Context a4 = m153189a(AbstractC88084b.class);
                            if (a4 instanceof AbstractC88084b) {
                                bVar = (AbstractC88084b) a4;
                            }
                            IllegalStateException illegalStateException2 = new IllegalStateException(C1764a.m5928a("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f200017d.getClass()}));
                            MethodCollector.m26664o(4188);
                            throw illegalStateException2;
                        }
                        if (this.f200016c) {
                            a = ((AbstractC88119c) bVar.generatedComponent()).mo60024a().mo60032a(this.f200017d).mo60031a();
                        } else {
                            a = ((AbstractC88118b) bVar.generatedComponent()).mo60018l().mo60034a(this.f200017d).mo60033a();
                        }
                        this.f200014a = a;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4188);
                    throw th;
                }
            }
        }
        Object obj = this.f200014a;
        MethodCollector.m26664o(4188);
        return obj;
    }

    /* renamed from: a */
    private static Context m153187a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: dagger.hilt.android.internal.managers.g$a */
    public static final class C88117a extends ContextWrapper {

        /* renamed from: a */
        public final Fragment f200018a;

        /* renamed from: b */
        private LayoutInflater f200019b;

        /* renamed from: c */
        private LayoutInflater f200020c;

        static {
            Covode.recordClassIndex(104145);
        }

        @Override // android.content.Context, android.content.ContextWrapper
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return m153190a(getBaseContext(), str);
            }
            if (this.f200020c == null) {
                if (this.f200019b == null) {
                    this.f200019b = (LayoutInflater) m153190a(getBaseContext(), "layout_inflater");
                }
                this.f200020c = this.f200019b.cloneInContext(this);
            }
            return this.f200020c;
        }

        public C88117a(Context context, Fragment fragment) {
            super((Context) C88085c.m153155a(context));
            this.f200019b = null;
            this.f200018a = (Fragment) C88085c.m153155a(fragment);
        }

        public C88117a(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) C88085c.m153155a(((LayoutInflater) C88085c.m153155a(layoutInflater)).getContext()));
            this.f200019b = layoutInflater;
            this.f200018a = (Fragment) C88085c.m153155a(fragment);
        }

        /* renamed from: a */
        private static Object m153190a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(7451);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(7451);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: a */
    private Context m153189a(Class<?> cls) {
        Context a = m153188a(this.f200017d.getContext(), cls);
        if (a != m153188a(m153187a(a), AbstractC88084b.class)) {
            return a;
        }
        C88085c.m153156a(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f200017d.getClass());
        return null;
    }

    /* renamed from: a */
    private static Context m153188a(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
