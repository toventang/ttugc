package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.ai */
public class C0402ai extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1576a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0402ai>> f1577b;

    /* renamed from: c */
    private final Resources f1578c;

    /* renamed from: d */
    private final Resources.Theme f1579d;

    public Resources getResources() {
        return this.f1578c;
    }

    public AssetManager getAssets() {
        return this.f1578c.getAssets();
    }

    static {
        Covode.recordClassIndex(467);
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1579d;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1579d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    private C0402ai(Context context) {
        super(context);
        if (C0414aq.m1537a()) {
            C0414aq aqVar = new C0414aq(this, context.getResources());
            this.f1578c = aqVar;
            Resources.Theme newTheme = aqVar.newTheme();
            this.f1579d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1578c = new C0404ak(this, context.getResources());
        this.f1579d = null;
    }

    /* renamed from: a */
    public static Context m1462a(Context context) {
        C0402ai aiVar;
        if ((context instanceof C0402ai) || (context.getResources() instanceof C0404ak) || (context.getResources() instanceof C0414aq) || (Build.VERSION.SDK_INT >= 21 && !C0414aq.m1537a())) {
            return context;
        }
        synchronized (f1576a) {
            ArrayList<WeakReference<C0402ai>> arrayList = f1577b;
            if (arrayList == null) {
                f1577b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0402ai> weakReference = f1577b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1577b.remove(size);
                    }
                }
                for (int size2 = f1577b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0402ai> weakReference2 = f1577b.get(size2);
                    if (!(weakReference2 == null || (aiVar = weakReference2.get()) == null || aiVar.getBaseContext() != context)) {
                        return aiVar;
                    }
                }
            }
            C0402ai aiVar2 = new C0402ai(context);
            f1577b.add(new WeakReference<>(aiVar2));
            return aiVar2;
        }
    }
}
