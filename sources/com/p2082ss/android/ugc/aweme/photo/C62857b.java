package com.p2082ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.b */
public final class C62857b implements AbstractC62884s {

    /* renamed from: a */
    static int f142549a;

    /* renamed from: b */
    String f142550b;

    /* renamed from: c */
    public Bitmap.CompressFormat f142551c = Bitmap.CompressFormat.PNG;

    /* renamed from: d */
    final SimpleDateFormat f142552d;

    static {
        Covode.recordClassIndex(73688);
    }

    public C62857b() {
        File file = new File(AVServiceImpl.m113116a().shortVideoDir(), UGCMonitor.TYPE_PHOTO);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f142550b = file.getAbsolutePath();
        this.f142552d = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    @Override // com.p2082ss.android.ugc.aweme.photo.AbstractC62884s
    /* renamed from: a */
    public final String mo100820a() {
        String str;
        if (this.f142551c == Bitmap.CompressFormat.JPEG) {
            str = ".jpeg";
        } else {
            str = ".png";
        }
        Locale locale = Locale.getDefault();
        String concat = "%s/IMG_%s".concat(str);
        StringBuilder append = new StringBuilder().append(this.f142552d.format(new Date())).append("_");
        int i = f142549a + 1;
        f142549a = i;
        return C1764a.m5929a(locale, concat, new Object[]{this.f142550b, append.append(i).toString()});
    }
}
