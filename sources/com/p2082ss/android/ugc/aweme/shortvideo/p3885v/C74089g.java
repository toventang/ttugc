package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80272bs;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.g */
public final class C74089g {
    static {
        Covode.recordClassIndex(86841);
    }

    /* renamed from: c */
    public static final float m130289c() {
        return ((float) m130287b()) / ((float) m130284a());
    }

    /* renamed from: d */
    public static final int m130291d() {
        C73964ar arVar = C73964ar.f166038a;
        C89219l.m154716b(arVar, "");
        return (int) (arVar.f166042e / 1024);
    }

    /* renamed from: a */
    public static final int m130284a() {
        return (int) ((Runtime.getRuntime().maxMemory() / 1024) / 1024);
    }

    /* renamed from: b */
    public static final int m130287b() {
        return (int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) / 1024);
    }

    /* renamed from: a */
    public static /* synthetic */ float m130283a(int i) {
        if (i <= 0) {
            return 1.0f;
        }
        float f = (float) i;
        return (f - ((float) m130291d())) / f;
    }

    /* renamed from: b */
    public static final int m130288b(Context context) {
        C89219l.m154721d(context, "");
        return (int) ((C80272bs.m139142a(context) / 1024) / 1024);
    }

    /* renamed from: a */
    public static final boolean m130286a(Context context) {
        C89219l.m154721d(context, "");
        try {
            C74092i d = m130292d(context);
            C73991bj.m130128a("PreSyntheticMachinePerformanceLimitLevel2 " + d.f166342b);
            return d.f166341a;
        } catch (Throwable th) {
            C73991bj.m130129a(th);
            return false;
        }
    }

    /* renamed from: c */
    private static final boolean m130290c(Context context) {
        try {
            C74092i d = m130292d(context);
            C73991bj.m130128a("PreSyntheticMachinePerformanceLimitLevel1 " + d.f166342b);
            return d.f166341a;
        } catch (Throwable th) {
            C73991bj.m130129a(th);
            return false;
        }
    }

    /* renamed from: d */
    private static final C74092i m130292d(Context context) {
        int b = m130288b(context);
        if (b <= 0 || b >= 1600) {
            return new C74092i(false, "allow");
        }
        return new C74092i(true, "TotalMemory min:1600 current:" + b);
    }

    /* renamed from: a */
    public static final int m130285a(Context context, VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(videoPublishEditModel, "");
        boolean isMvThemeVideoType = videoPublishEditModel.isMvThemeVideoType();
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return 0;
        }
        if (!C16048b.m29633a().mo25421a(true, "enable_mv_theme_pre_upload", false) && isMvThemeVideoType) {
            return 0;
        }
        boolean a = C74087e.m130277a();
        boolean enablePreUploadByUser = C63244g.m114602a().mo73277e().getEnablePreUploadByUser(false);
        boolean enablePreUpload = C63244g.m114602a().mo73277e().getEnablePreUpload(false);
        C73991bj.m130128a("enablePreUploadByBusiness switchEnable:" + a + " userEnable:" + enablePreUploadByUser + " authkeyEnable:" + enablePreUpload);
        if (a && enablePreUploadByUser && enablePreUpload && C63244g.m114602a().mo73255A().mo93903b() && !C63244g.m114602a().mo73255A().mo93901a() && !m130290c(context)) {
            return 2;
        }
        if (!C16048b.m29633a().mo25421a(true, "enable_pre_synthetic", false) || m130290c(context)) {
            return 0;
        }
        return 1;
    }
}
