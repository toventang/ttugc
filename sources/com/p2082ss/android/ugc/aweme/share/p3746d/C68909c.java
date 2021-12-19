package com.p2082ss.android.ugc.aweme.share.p3746d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.d.c */
public final class C68909c {

    /* renamed from: a */
    public static boolean f154153a;

    /* renamed from: b */
    public static boolean f154154b;

    /* renamed from: c */
    public static boolean f154155c;

    /* renamed from: d */
    public static Aweme f154156d;

    /* renamed from: e */
    public static Aweme f154157e;

    /* renamed from: f */
    public static String f154158f;

    /* renamed from: g */
    public static String f154159g;

    /* renamed from: h */
    public static int f154160h;

    /* renamed from: i */
    static String f154161i = "";

    /* renamed from: j */
    public static int f154162j = 1;

    /* renamed from: k */
    public static final C68909c f154163k = new C68909c();

    /* renamed from: l */
    private static final ArrayList<String> f154164l;

    /* renamed from: m */
    private static final List<String> f154165m = C89070n.m154522b("download", "download_no_watermark");

    private C68909c() {
    }

    /* renamed from: b */
    public static final boolean m121606b() {
        if (f154153a || f154154b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m121608c() {
        return ShareDependService.C68822a.m121324a().mo109348b();
    }

    /* renamed from: d */
    public static final boolean m121609d() {
        Activity j = C17873f.m33102j();
        if (j == null) {
            return false;
        }
        return f154164l.contains(j.getLocalClassName());
    }

    static {
        Covode.recordClassIndex(81215);
        ArrayList<String> arrayList = new ArrayList<>();
        f154164l = arrayList;
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
    }

    /* renamed from: a */
    public static boolean m121605a() {
        Aweme aweme = f154157e;
        if (aweme == null || f154156d == null) {
            return false;
        }
        String aid = aweme.getAid();
        Aweme aweme2 = f154156d;
        if (aweme2 == null) {
            C89219l.m154715b();
        }
        return C89219l.m154714a((Object) aid, (Object) aweme2.getAid());
    }

    /* renamed from: a */
    public static void m121604a(String str) {
        C89219l.m154721d(str, "");
        f154161i = str;
    }

    /* renamed from: a */
    public static void m121603a(C68906a aVar) {
        C89219l.m154721d(aVar, "");
        if (m121607b("download")) {
            C34603a.C34604a.f81659a.mo61063a("video_download_status").postValue(aVar);
        }
    }

    /* renamed from: b */
    public static final boolean m121607b(String str) {
        C89219l.m154721d(str, "");
        if (f154159g != null && C16048b.m29633a().mo25421a(false, "download_not_block_user", false)) {
            List<String> list = f154165m;
            String str2 = f154159g;
            if (str2 == null) {
                C89219l.m154715b();
            }
            if (!list.contains(str2) || !list.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
