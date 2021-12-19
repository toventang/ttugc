package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC1567a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    static {
        Covode.recordClassIndex(785);
    }

    public static IconCompat read(AbstractC1567a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2769a = aVar.mo5216b(iconCompat.f2769a, 1);
        iconCompat.f2771c = aVar.mo5229c(iconCompat.f2771c);
        iconCompat.f2772d = aVar.mo5217b(iconCompat.f2772d, 3);
        iconCompat.f2773e = aVar.mo5216b(iconCompat.f2773e, 4);
        iconCompat.f2774f = aVar.mo5216b(iconCompat.f2774f, 5);
        iconCompat.f2775g = (ColorStateList) aVar.mo5217b(iconCompat.f2775g, 6);
        iconCompat.f2777j = aVar.mo5227c(iconCompat.f2777j);
        iconCompat.f2776i = PorterDuff.Mode.valueOf(iconCompat.f2777j);
        switch (iconCompat.f2769a) {
            case -1:
                if (iconCompat.f2772d != null) {
                    iconCompat.f2770b = iconCompat.f2772d;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (iconCompat.f2772d == null) {
                    iconCompat.f2770b = iconCompat.f2771c;
                    iconCompat.f2769a = 3;
                    iconCompat.f2773e = 0;
                    iconCompat.f2774f = iconCompat.f2771c.length;
                    break;
                } else {
                    iconCompat.f2770b = iconCompat.f2772d;
                    break;
                }
            case 2:
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                iconCompat.f2770b = new String(iconCompat.f2771c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2770b = iconCompat.f2771c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1567a aVar) {
        iconCompat.f2777j = iconCompat.f2776i.name();
        switch (iconCompat.f2769a) {
            case -1:
                iconCompat.f2772d = (Parcelable) iconCompat.f2770b;
                break;
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                iconCompat.f2772d = (Parcelable) iconCompat.f2770b;
                break;
            case 2:
                iconCompat.f2771c = ((String) iconCompat.f2770b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2771c = (byte[]) iconCompat.f2770b;
                break;
            case 4:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                iconCompat.f2771c = iconCompat.f2770b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        if (-1 != iconCompat.f2769a) {
            aVar.mo5206a(iconCompat.f2769a, 1);
        }
        if (iconCompat.f2771c != null) {
            aVar.mo5222b(iconCompat.f2771c);
        }
        if (iconCompat.f2772d != null) {
            aVar.mo5208a(iconCompat.f2772d, 3);
        }
        if (iconCompat.f2773e != 0) {
            aVar.mo5206a(iconCompat.f2773e, 4);
        }
        if (iconCompat.f2774f != 0) {
            aVar.mo5206a(iconCompat.f2774f, 5);
        }
        if (iconCompat.f2775g != null) {
            aVar.mo5208a(iconCompat.f2775g, 6);
        }
        if (iconCompat.f2777j != null) {
            aVar.mo5221b(iconCompat.f2777j);
        }
    }
}
