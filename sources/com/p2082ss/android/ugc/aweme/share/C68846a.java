package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.a */
public final class C68846a {

    /* renamed from: a */
    public static int f153968a;

    /* renamed from: b */
    public static final C68847a f153969b = new C68847a((byte) 0);

    static {
        Covode.recordClassIndex(81147);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.a$a */
    public static final class C68847a {
        static {
            Covode.recordClassIndex(81148);
        }

        private C68847a() {
        }

        /* renamed from: a */
        public static boolean m121492a() {
            Boolean bool;
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                bool = iESSettingsProxy.getSilentShareConfigurable();
            } catch (C16041a unused) {
                bool = true;
            }
            C89219l.m154716b(bool, "");
            if (!bool.booleanValue() || C68846a.f153968a != 0) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C68847a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m121491a(C28022o oVar) {
            C89219l.m154721d(oVar, "");
            C28022o f = oVar.mo46807f("data");
            if (f != null) {
                C68846a.f153968a = m121490a(f, "tt_publish_enhancement");
            }
        }

        /* renamed from: a */
        private static int m121490a(C28022o oVar, String str) {
            try {
                C28025r d = oVar.mo46804d(str);
                if (d == null) {
                    return 0;
                }
                if (!(d.f65806a instanceof Boolean)) {
                    return d.mo46694g();
                }
                if (d.mo46695h()) {
                    return 1;
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
    }
}
