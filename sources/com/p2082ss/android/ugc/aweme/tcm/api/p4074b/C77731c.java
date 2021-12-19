package com.p2082ss.android.ugc.aweme.tcm.api.p4074b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tcm.api.b.c */
public final class C77731c {

    /* renamed from: a */
    public static AbstractC77732a f174314a;

    /* renamed from: b */
    public static AbstractC77733b f174315b;

    /* renamed from: c */
    public static final C77731c f174316c = new C77731c();

    /* renamed from: com.ss.android.ugc.aweme.tcm.api.b.c$a */
    public interface AbstractC77732a {
        static {
            Covode.recordClassIndex(90786);
        }

        String getBrandedContentType();

        String getStarAtlasContent();

        void setBrandedContentType(String str);

        void setStarAtlasContent(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.api.b.c$b */
    public interface AbstractC77733b {
        static {
            Covode.recordClassIndex(90787);
        }

        void setBrandedContentType(String str);
    }

    private C77731c() {
    }

    static {
        Covode.recordClassIndex(90785);
    }

    /* renamed from: a */
    public static final String m135804a() {
        AbstractC77732a aVar = f174314a;
        if (aVar != null) {
            return aVar.getStarAtlasContent();
        }
        return null;
    }

    /* renamed from: b */
    public static final String m135806b() {
        AbstractC77732a aVar = f174314a;
        if (aVar != null) {
            return aVar.getBrandedContentType();
        }
        return null;
    }

    /* renamed from: a */
    public static final void m135805a(String str) {
        AbstractC77732a aVar = f174314a;
        if (aVar != null) {
            aVar.setStarAtlasContent(str);
        }
    }

    /* renamed from: b */
    public static final void m135807b(String str) {
        String str2;
        AbstractC77732a aVar = f174314a;
        if (aVar != null) {
            if (str == null) {
                str2 = "0";
            } else {
                str2 = str;
            }
            aVar.setBrandedContentType(str2);
        }
        AbstractC77733b bVar = f174315b;
        if (bVar != null) {
            if (str == null) {
                str = "0";
            }
            bVar.setBrandedContentType(str);
        }
    }
}
