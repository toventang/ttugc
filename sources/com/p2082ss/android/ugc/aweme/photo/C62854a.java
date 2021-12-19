package com.p2082ss.android.ugc.aweme.photo;

import android.os.Environment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.a */
public final class C62854a implements AbstractC62884s {

    /* renamed from: a */
    public final String f142544a;

    /* renamed from: b */
    private final SimpleDateFormat f142545b;

    static {
        Covode.recordClassIndex(73685);
    }

    public C62854a() {
        File file = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera/");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f142544a = file.getAbsolutePath();
        this.f142545b = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    @Override // com.p2082ss.android.ugc.aweme.photo.AbstractC62884s
    /* renamed from: a */
    public final String mo100820a() {
        return C1764a.m5929a(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.f142544a, this.f142545b.format(new Date())});
    }
}
