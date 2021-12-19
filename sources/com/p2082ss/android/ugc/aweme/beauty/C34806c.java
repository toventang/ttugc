package com.p2082ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.c */
public final class C34806c {

    /* renamed from: a */
    public static String f82228a = "";

    /* renamed from: b */
    public static ComposerBeautyBuriedInfo f82229b;

    /* renamed from: c */
    public static C34810g f82230c;

    /* renamed from: d */
    public static final C34806c f82231d = new C34806c();

    /* renamed from: e */
    private static String f82232e = "";

    private C34806c() {
    }

    static {
        Covode.recordClassIndex(41810);
    }

    /* renamed from: a */
    public static final void m71112a() {
        f82229b = null;
        f82232e = "";
        f82228a = "";
    }

    /* renamed from: b */
    public static final int m71113b(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo == null || composerBeautyBuriedInfo.getBeautifyUsed() != 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public static final int m71115c(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        if (composerBeautyBuriedInfo != null) {
            return composerBeautyBuriedInfo.getModeChosen();
        }
        return 0;
    }

    /* renamed from: a */
    private static int m71110a(AbstractC34803a aVar) {
        if (aVar == null || aVar.getBeautyStatus() != 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static final String m71111a(ComposerBeautyBuriedInfo composerBeautyBuriedInfo) {
        List<BeautifyInfo> list;
        String b;
        if (C89219l.m154714a(composerBeautyBuriedInfo, f82229b)) {
            b = f82232e;
        } else {
            C27910f G = C63244g.m114602a().mo73261G();
            if (composerBeautyBuriedInfo != null) {
                list = composerBeautyBuriedInfo.getBeautifyInfo();
            } else {
                list = null;
            }
            b = G.mo46674b(list);
        }
        C89219l.m154716b(b, "");
        f82232e = b;
        if (composerBeautyBuriedInfo != null) {
            f82229b = ComposerBeautyBuriedInfo.copy$default(composerBeautyBuriedInfo, 0, 0, 0, null, 15, null);
        }
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static final int m71109a(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, C34810g gVar) {
        if (m71110a((AbstractC34803a) composerBeautyBuriedInfo) == 1 || m71110a(gVar) == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m71114b(ComposerBeautyBuriedInfo composerBeautyBuriedInfo, C34810g gVar) {
        C89219l.m154721d(composerBeautyBuriedInfo, "");
        C89219l.m154721d(gVar, "");
        String a = m71111a(composerBeautyBuriedInfo);
        C80322d.m139251a("perf_record_video", new C84425b().mo129403a("beautify_used", m71113b(composerBeautyBuriedInfo)).mo129403a("is_composer", composerBeautyBuriedInfo.getModeChosen()).mo129406a("beautify_info", a).f188764a);
        if (f82228a.length() == 0) {
            f82228a = a;
        }
        f82230c = gVar;
    }
}
