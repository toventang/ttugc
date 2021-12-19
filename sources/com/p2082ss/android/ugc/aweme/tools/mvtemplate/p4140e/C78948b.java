package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.p2477ci.C36080a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.e.b */
public final class C78948b {

    /* renamed from: a */
    public static String f177442a = "change_mode";

    static {
        Covode.recordClassIndex(92097);
    }

    /* renamed from: a */
    public static boolean m137763a() {
        return AVServiceImpl.m113116a().avSettingsService().showMvThemeRecordMode();
    }

    /* renamed from: b */
    public static String m137767b() {
        return C63238c.f143574a.getFilesDir().getAbsolutePath() + File.separator + "mvtheme";
    }

    /* renamed from: a */
    public static String m137762a(String str) {
        String b = m137768b(str);
        if (!new File(b).exists()) {
            new File(b).mkdirs();
        }
        return b;
    }

    /* renamed from: b */
    public static String m137768b(String str) {
        return m137767b() + File.separator + str;
    }

    /* renamed from: a */
    public static boolean m137764a(ShortVideoContext shortVideoContext) {
        if (!m137763a() || shortVideoContext == null || shortVideoContext.f155817b.mo109889b() || shortVideoContext.f155817b.mo109890c()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m137769c(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }

    /* renamed from: a */
    public static boolean m137765a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f177184a == null || C84904k.m145909a(mvThemeData.f177184a.getTags())) {
            return false;
        }
        return mvThemeData.f177184a.getTags().contains("NeedServerAlgorithm");
    }

    /* renamed from: a */
    public static boolean m137766a(String str, String str2, int i, int i2, int i3, Bitmap.CompressFormat compressFormat) {
        Bitmap a;
        if (C84902i.m145892a(str) && (a = C36080a.m73531a(str, i, i2, C36080a.m73537b(str), i3)) != null) {
            return C36080a.m73535a(a, new File(str2.toString()), compressFormat);
        }
        return false;
    }
}
