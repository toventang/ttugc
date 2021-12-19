package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ak */
public final class C0404ak extends C0393ad {

    /* renamed from: a */
    private final WeakReference<Context> f1584a;

    static {
        Covode.recordClassIndex(469);
    }

    @Override // androidx.appcompat.widget.C0393ad, android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1584a.get();
        if (!(drawable == null || context == null)) {
            C0428h.m1581a();
            C0428h.m1585a(context, i, drawable);
        }
        return drawable;
    }

    public C0404ak(Context context, Resources resources) {
        super(resources);
        this.f1584a = new WeakReference<>(context);
    }
}
