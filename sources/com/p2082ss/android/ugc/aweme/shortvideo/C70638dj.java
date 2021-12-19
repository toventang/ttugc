package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dj */
public class C70638dj {

    /* renamed from: d */
    public static final String f158101d;

    /* renamed from: e */
    public static final String f158102e;

    /* renamed from: f */
    public static final String f158103f;

    /* renamed from: g */
    public static final String f158104g;

    /* renamed from: h */
    public static final String f158105h;

    /* renamed from: i */
    public static final String f158106i;

    /* renamed from: j */
    public static final String f158107j;

    /* renamed from: k */
    public static final String f158108k;

    /* renamed from: l */
    public static final String f158109l;

    /* renamed from: m */
    public static final String f158110m;

    /* renamed from: n */
    public static final String f158111n;

    /* renamed from: o */
    public static final String f158112o;

    /* renamed from: p */
    public static final String f158113p;

    /* renamed from: q */
    public static final String f158114q;

    /* renamed from: r */
    public static final String f158115r;

    /* renamed from: s */
    public static final String f158116s;

    /* renamed from: t */
    public static final String f158117t;

    /* renamed from: u */
    public static final String f158118u;

    /* renamed from: b */
    public static long m124843b() {
        try {
            StatFs statFs = new StatFs(f158101d);
            int i = Build.VERSION.SDK_INT;
            return statFs.getAvailableBytes();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static String m124841a() {
        String str;
        C63244g.m114602a().mo73295w();
        try {
            str = C84902i.m145895b(C63247i.f143610a) + "/";
        } catch (Exception e) {
            C84911q.m145926b("getCreativeToolRootDir error exception:" + e.getMessage());
            str = ((IVideoRecordPreferences) new C14401a((byte) 0).mo23215a(C63247i.f143610a, IVideoRecordPreferences.class)).getCreativeToolRootDir("");
        }
        if (TextUtils.isEmpty(str)) {
            str = C63247i.f143610a.getFilesDir() + "/";
        }
        C1731i.m5640b(new CallableC70639dk(str), C1731i.f5562a);
        return str;
    }

    static {
        Covode.recordClassIndex(83104);
        String a = m124841a();
        f158101d = a;
        f158102e = a + "tmp/";
        f158103f = a + "draft/";
        f158104g = a + "import/";
        f158105h = a + "background_video/tmp/";
        f158106i = a + "background_video/draft/";
        f158107j = a + "origin_sound/";
        f158108k = a + "tmp_video/";
        f158109l = a + "parallel_upload/";
        f158110m = a + "record_work_space";
        f158111n = a + "shortvideo/videoedit/audiorecord/";
        f158112o = a + "cache/";
        f158113p = a + "filters/";
        f158114q = a + "audio-effect/";
        f158115r = a + "music/";
        f158116s = a + "noCopyDraft/";
        f158117t = a + "effect/download/";
        f158118u = a + "compat_draft_track/";
        C84902i.m145900c(new File(a));
    }

    /* renamed from: a */
    public static String m124842a(String str) {
        return f158101d + m124844b(str);
    }

    /* renamed from: b */
    public static String m124844b(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }
}
