package com.p2082ss.android.ugc.gamora.editor.p4274a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.p2082ss.android.ugc.effectmanager.IFetchResourceListener;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.a.c */
public final class C82030c {

    /* renamed from: a */
    static boolean f183587a;

    /* renamed from: b */
    public static final C82030c f183588b = new C82030c();

    /* renamed from: com.ss.android.ugc.gamora.editor.a.c$a */
    public static final class C82031a implements IFetchResourceListener {
        static {
            Covode.recordClassIndex(95855);
        }

        C82031a() {
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j) {
            C82030c.f183587a = false;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            C89219l.m154721d(exc, "");
            C82030c.f183587a = false;
        }
    }

    private C82030c() {
    }

    static {
        Covode.recordClassIndex(95854);
    }

    /* renamed from: c */
    public static boolean m142036c() {
        if (m142035b()) {
            return true;
        }
        m142037d();
        return false;
    }

    /* renamed from: b */
    public static boolean m142035b() {
        if (m142034a().length() <= 0 || !new File(m142034a()).exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static void m142037d() {
        if (!f183587a) {
            Map<String, List<String>> b = C89041ag.m154427b(new C89378p("requirement_ftgru", C89070n.m154524c("unet_denoise_44k_music_model_v1.0")));
            f183587a = true;
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"requirement_ftgru"}, b, new C82031a());
        }
    }

    /* renamed from: a */
    public static String m142034a() {
        String str;
        try {
            boolean z = false;
            if (!UseKNPlatform.enableKNPlatform || !C86709e.C86710a.m150209b()) {
                str = DownloadableModelSupportResourceFinder.findResourceUri(null, "unet_denoise_44k_music_model_v1.0");
            } else {
                str = C86709e.C86710a.m150208a().mo139947a().realFindResourceUri(0, null, "unet_denoise_44k_music_model_v1.0");
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                URI create = URI.create(str);
                C89219l.m154716b(create, "");
                str = create.getPath();
            }
            C89219l.m154716b(str, "");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
