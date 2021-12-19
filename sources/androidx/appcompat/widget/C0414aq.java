package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.aq */
public final class C0414aq extends Resources {

    /* renamed from: a */
    public static boolean f1630a;

    /* renamed from: b */
    private final WeakReference<Context> f1631b;

    static {
        Covode.recordClassIndex(479);
    }

    /* renamed from: a */
    public static boolean m1537a() {
        if (!f1630a || Build.VERSION.SDK_INT > 20) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo1878a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Context context = this.f1631b.get();
        if (context != null) {
            return C0428h.m1581a().mo1928a(context, this, i);
        }
        return super.getDrawable(i);
    }

    public C0414aq(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1631b = new WeakReference<>(context);
    }
}
