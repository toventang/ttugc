package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.i */
public final class C83065i {

    /* renamed from: a */
    public static final C83065i f185614a = new C83065i();

    /* renamed from: b */
    private static C83012a f185615b;

    private C83065i() {
    }

    static {
        Covode.recordClassIndex(96938);
    }

    /* renamed from: a */
    private static C83012a m143412a() {
        if (f185615b == null) {
            try {
                f185615b = (C83012a) SettingsManager.m29616a().mo25396a("creative_read_text_sticker_config", C83012a.class);
            } catch (Exception e) {
                C40970e.m82485a("ReadTextHelper#getConfig: e: " + e.getMessage());
            }
        }
        C83012a aVar = f185615b;
        if (aVar == null) {
            return new C83012a();
        }
        return aVar;
    }

    /* renamed from: b */
    public static File m143415b(String str) {
        MethodCollector.m26663i(12029);
        C89219l.m154721d(str, "");
        try {
            String e = C63244g.m114602a().mo73279g().mo69470c().mo69479e("read_text_audio");
            if (!new File(e).exists()) {
                new File(e).mkdirs();
            }
            StringBuilder append = new StringBuilder().append(e).append(File.separator);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            C89219l.m154716b(instance, "");
            File file = new File(append.append(simpleDateFormat.format(instance.getTime()) + ".mp3").toString());
            new FileOutputStream(file).write(Base64.decode(str, 0));
            MethodCollector.m26664o(12029);
            return file;
        } catch (Exception e2) {
            C40970e.m82485a("Base64 to File failed, Exception: " + e2.getMessage());
            MethodCollector.m26664o(12029);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m143414a(String str, int i) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                i3++;
            } else if (charAt <= 2047) {
                i3 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i3 += 4;
                i2++;
            } else {
                i3 += 3;
            }
            i2++;
        }
        if (i3 <= i) {
            return true;
        }
        return false;
    }
}
