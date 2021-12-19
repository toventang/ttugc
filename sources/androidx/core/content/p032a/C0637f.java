package androidx.core.content.p032a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.core.content.p032a.C0629c;
import androidx.core.graphics.C0715e;
import androidx.core.p034e.C0657b;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.a.f */
public final class C0637f {
    static {
        Covode.recordClassIndex(716);
    }

    /* renamed from: androidx.core.content.a.f$a */
    public static abstract class AbstractC0638a {
        static {
            Covode.recordClassIndex(717);
        }

        /* renamed from: a */
        public abstract void mo2006a(Typeface typeface);

        /* renamed from: a */
        public final void mo2671a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.p032a.C0637f.AbstractC0638a.RunnableC06402 */

                static {
                    Covode.recordClassIndex(719);
                }

                public final void run() {
                }
            });
        }

        /* renamed from: a */
        public final void mo2672a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                /* class androidx.core.content.p032a.C0637f.AbstractC0638a.RunnableC06391 */

                static {
                    Covode.recordClassIndex(718);
                }

                public final void run() {
                    AbstractC0638a.this.mo2006a(typeface);
                }
            });
        }
    }

    /* renamed from: b */
    public static int m2349b(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: a */
    public static Drawable m2348a(Resources resources, int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    public static Typeface m2346a(Context context, int i, TypedValue typedValue, int i2, AbstractC0638a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m2350b(context, i, typedValue, i2, aVar);
    }

    /* renamed from: b */
    private static Typeface m2350b(Context context, int i, TypedValue typedValue, int i2, AbstractC0638a aVar) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m2347a(context, resources, typedValue, i, i2, aVar);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* renamed from: a */
    private static Typeface m2347a(Context context, Resources resources, TypedValue typedValue, int i, int i2, AbstractC0638a aVar) {
        Typeface typeface;
        boolean z;
        if (typedValue.string != null) {
            String charSequence = typedValue.string.toString();
            if (!charSequence.startsWith("res/")) {
                if (aVar != null) {
                    aVar.mo2671a(-3, (Handler) null);
                }
                return null;
            }
            Typeface a = C0715e.f2808b.mo2091a(C0715e.m2527a(resources, i, i2));
            if (a != null) {
                if (aVar != null) {
                    aVar.mo2672a(a, (Handler) null);
                }
                return a;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    C0629c.AbstractC0630a a2 = C0629c.m2337a(resources.getXml(i), resources);
                    if (a2 == null) {
                        if (aVar != null) {
                            aVar.mo2671a(-3, (Handler) null);
                        }
                        return null;
                    }
                    if (a2 instanceof C0629c.C0633d) {
                        C0629c.C0633d dVar = (C0629c.C0633d) a2;
                        if (dVar.f2634c == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        typeface = C0657b.m2394a(context, dVar.f2632a, aVar, null, z, dVar.f2633b, i2);
                    } else {
                        typeface = C0715e.f2807a.mo2797a(context, (C0629c.C0631b) a2, resources, i2);
                        if (aVar != null) {
                            if (typeface != null) {
                                aVar.mo2672a(typeface, (Handler) null);
                            } else {
                                aVar.mo2671a(-3, (Handler) null);
                            }
                        }
                    }
                    if (typeface != null) {
                        C0715e.f2808b.mo2092a(C0715e.m2527a(resources, i, i2), typeface);
                    }
                    return typeface;
                }
                Typeface a3 = C0715e.m2525a(context, resources, i, charSequence, i2);
                if (aVar != null) {
                    if (a3 != null) {
                        aVar.mo2672a(a3, (Handler) null);
                    } else {
                        aVar.mo2671a(-3, (Handler) null);
                    }
                }
                return a3;
            } catch (IOException | XmlPullParserException unused) {
                if (aVar != null) {
                    aVar.mo2671a(-3, (Handler) null);
                }
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
    }
}
