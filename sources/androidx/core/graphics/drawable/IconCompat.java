package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: h */
    static final PorterDuff.Mode f2768h = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2769a;

    /* renamed from: b */
    public Object f2770b;

    /* renamed from: c */
    public byte[] f2771c;

    /* renamed from: d */
    public Parcelable f2772d;

    /* renamed from: e */
    public int f2773e;

    /* renamed from: f */
    public int f2774f;

    /* renamed from: g */
    public ColorStateList f2775g;

    /* renamed from: i */
    PorterDuff.Mode f2776i;

    /* renamed from: j */
    public String f2777j;

    static {
        Covode.recordClassIndex(784);
    }

    public IconCompat() {
        this.f2769a = -1;
        this.f2776i = f2768h;
    }

    /* renamed from: e */
    private Uri m2489e() {
        if (this.f2769a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2487d((Icon) this.f2770b);
        }
        int i = this.f2769a;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2770b);
        }
        throw new IllegalStateException("called getUri() on ".concat(String.valueOf(this)));
    }

    /* renamed from: d */
    private String m2488d() {
        if (this.f2769a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2485b((Icon) this.f2770b);
        }
        if (this.f2769a == 2) {
            return ((String) this.f2770b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on ".concat(String.valueOf(this)));
    }

    /* renamed from: c */
    public final Bundle mo2735c() {
        Bundle bundle = new Bundle();
        switch (this.f2769a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f2770b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                bundle.putParcelable("obj", (Bitmap) this.f2770b);
                break;
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                bundle.putString("obj", (String) this.f2770b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f2770b);
                break;
        }
        bundle.putInt(StringSet.type, this.f2769a);
        bundle.putInt("int1", this.f2773e);
        bundle.putInt("int2", this.f2774f);
        ColorStateList colorStateList = this.f2775g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f2776i;
        if (mode != f2768h) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    /* renamed from: a */
    public final int mo2733a() {
        if (this.f2769a == -1 && Build.VERSION.SDK_INT >= 23) {
            return m2486c((Icon) this.f2770b);
        }
        if (this.f2769a == 2) {
            return this.f2773e;
        }
        throw new IllegalStateException("called getResId() on ".concat(String.valueOf(this)));
    }

    /* renamed from: b */
    public final Icon mo2734b() {
        Icon icon;
        switch (this.f2769a) {
            case -1:
                return (Icon) this.f2770b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f2770b);
                break;
            case 2:
                icon = Icon.createWithResource(m2488d(), this.f2773e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f2770b, this.f2773e, this.f2774f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f2770b);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m2483a((Bitmap) this.f2770b));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2770b);
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m2489e());
        }
        ColorStateList colorStateList = this.f2775g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2776i;
        if (mode != f2768h) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public String toString() {
        String str;
        if (this.f2769a == -1) {
            return String.valueOf(this.f2770b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2769a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                str = "BITMAP_MASKABLE";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        StringBuilder append = sb.append(str);
        switch (this.f2769a) {
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                append.append(" size=").append(((Bitmap) this.f2770b).getWidth()).append("x").append(((Bitmap) this.f2770b).getHeight());
                break;
            case 2:
                append.append(" pkg=").append(m2488d()).append(" id=").append(C1764a.m5928a("0x%08x", new Object[]{Integer.valueOf(mo2733a())}));
                break;
            case 3:
                append.append(" len=").append(this.f2773e);
                if (this.f2774f != 0) {
                    append.append(" off=").append(this.f2774f);
                    break;
                }
                break;
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                append.append(" uri=").append(this.f2770b);
                break;
        }
        if (this.f2775g != null) {
            append.append(" tint=");
            append.append(this.f2775g);
        }
        if (this.f2776i != f2768h) {
            append.append(" mode=").append(this.f2776i);
        }
        append.append(")");
        return append.toString();
    }

    private IconCompat(byte b) {
        this.f2769a = -1;
        this.f2776i = f2768h;
        this.f2769a = 2;
    }

    /* renamed from: a */
    public static int m2482a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static String m2485b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static int m2486c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static Uri m2487d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m2483a(Bitmap bitmap) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = ((float) min) * 0.5f;
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f, f, 0.9166667f * f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    public static IconCompat m2484a(String str, int i) {
        if (i != 0) {
            IconCompat iconCompat = new IconCompat((byte) 0);
            iconCompat.f2773e = i;
            iconCompat.f2770b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
}
