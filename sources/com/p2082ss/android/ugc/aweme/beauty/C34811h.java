package com.p2082ss.android.ugc.aweme.beauty;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a.AbstractC77891e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77978b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.h */
public final class C34811h {

    /* renamed from: a */
    public static final C34811h f82238a = new C34811h();

    /* renamed from: b */
    private static final Keva f82239b;

    /* renamed from: com.ss.android.ugc.aweme.beauty.h$a */
    public static final class C34812a extends C27895a<List<? extends UlikeBeautyData>> {
        static {
            Covode.recordClassIndex(41816);
        }

        C34812a() {
        }
    }

    private C34811h() {
    }

    static {
        Covode.recordClassIndex(41815);
        Keva repo = Keva.getRepo("ulike_repo");
        C89219l.m154716b(repo, "");
        f82239b = repo;
    }

    /* renamed from: a */
    public static ArrayList<UlikeBeautyData> m71121a() {
        Void r0;
        String str;
        Keva keva = f82239b;
        String string = keva.getString("ulike_download_config", "");
        if (TextUtils.isEmpty(string)) {
            AbstractC77891e eVar = C77886a.f174754k;
            if (eVar != null) {
                str = eVar.mo121540a();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                keva.storeString("ulike_download_config", str);
                string = str;
            }
        }
        try {
            if (TextUtils.isEmpty(string)) {
                r0 = null;
            } else {
                r0 = (Void) C77978b.m136237a().mo46671a(string, new C34812a().type);
            }
            return (ArrayList) r0;
        } catch (Exception e) {
            C41093a.m82764b("getUlikeBeautyDataList " + e.getMessage());
            return null;
        }
    }
}
