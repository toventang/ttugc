package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.p032a.C0629c;
import androidx.core.p034e.C0657b;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.j */
public final class C0720j extends C0721k {
    static {
        Covode.recordClassIndex(801);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2801a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final C0657b.C0663b mo2802a(C0657b.C0663b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2796a(Context context, CancellationSignal cancellationSignal, C0657b.C0663b[] bVarArr, int i) {
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        int length = bVarArr.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            C0657b.C0663b bVar = bVarArr[i4];
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(bVar.f2674a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.f2676c);
                        if (!bVar.f2677d) {
                            i5 = 0;
                        }
                        Font build = weight.setSlant(i5).setTtcIndex(bVar.f2675b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i3)).build();
        throw th;
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2797a(Context context, C0629c.C0631b bVar, Resources resources, int i) {
        int i2;
        C0629c.C0632c[] cVarArr = bVar.f2625a;
        int length = cVarArr.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            C0629c.C0632c cVar = cVarArr[i4];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.f2631f).setWeight(cVar.f2627b);
                if (!cVar.f2628c) {
                    i5 = 0;
                }
                Font build = weight.setSlant(i5).setTtcIndex(cVar.f2630e).setFontVariationSettings(cVar.f2629d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i3)).build();
    }

    @Override // androidx.core.graphics.C0721k
    /* renamed from: a */
    public final Typeface mo2798a(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
