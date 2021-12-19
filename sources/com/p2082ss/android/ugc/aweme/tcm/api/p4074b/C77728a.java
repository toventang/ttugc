package com.p2082ss.android.ugc.aweme.tcm.api.p4074b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;

/* renamed from: com.ss.android.ugc.aweme.tcm.api.b.a */
public final class C77728a {

    /* renamed from: a */
    public static AbstractC77729a f174309a;

    /* renamed from: b */
    public static final C77728a f174310b = new C77728a();

    /* renamed from: com.ss.android.ugc.aweme.tcm.api.b.a$a */
    public interface AbstractC77729a {
        static {
            Covode.recordClassIndex(90783);
        }

        String getBcStarAtlasContent();

        String getBcType();

        TagBAUser getShouldBeDetag();

        TagBAUser getTagBA();

        void setBcStarAtlasContent(String str);

        void setBcType(String str);

        void setShouldBeDetag(TagBAUser tagBAUser);

        void setTagBA(TagBAUser tagBAUser);
    }

    private C77728a() {
    }

    static {
        Covode.recordClassIndex(90782);
    }

    /* renamed from: a */
    public static final String m135797a() {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            return aVar.getBcStarAtlasContent();
        }
        return null;
    }

    /* renamed from: b */
    public static final String m135800b() {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            return aVar.getBcType();
        }
        return null;
    }

    /* renamed from: c */
    public static final TagBAUser m135802c() {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            return aVar.getTagBA();
        }
        return null;
    }

    /* renamed from: d */
    public static final void m135803d() {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            aVar.setShouldBeDetag(null);
        }
    }

    /* renamed from: a */
    public static final void m135798a(TagBAUser tagBAUser) {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            aVar.setTagBA(tagBAUser);
        }
    }

    /* renamed from: a */
    public static final void m135799a(String str) {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            aVar.setBcStarAtlasContent(str);
        }
    }

    /* renamed from: b */
    public static final void m135801b(String str) {
        AbstractC77729a aVar = f174309a;
        if (aVar != null) {
            if (str == null) {
                str = "0";
            }
            aVar.setBcType(str);
        }
    }
}
