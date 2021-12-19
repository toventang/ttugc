package com.p2082ss.android.vesdk;

import android.media.MediaExtractor;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vesdk.s */
public final class C85562s {

    /* renamed from: a */
    private static String f191732a = "VEConcatHelper";

    static {
        Covode.recordClassIndex(99738);
    }

    /* renamed from: a */
    private static String m147470a(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    str2 = string;
                }
            }
            mediaExtractor.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m147471a(String[] strArr) {
        String str = null;
        for (String str2 : strArr) {
            String a = m147470a(str2);
            if ((str == null && (str = a) == null) || !str.equals(a)) {
                C85315al.m146642d(f191732a, "isCodecsValid false mime= " + a + " lastMime " + str);
                return false;
            }
        }
        C85315al.m146637a(f191732a, "isCodecsValid");
        return true;
    }
}
