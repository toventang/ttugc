package com.p2082ss.android.ugc.aweme.feed.guide;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.h */
public final class C49592h {

    /* renamed from: a */
    private CopyOnWriteArrayList<String> f114093a;

    /* renamed from: b */
    private final SharedPreferences f114094b;

    static {
        Covode.recordClassIndex(58438);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.h$a */
    public static class C49593a {

        /* renamed from: a */
        public static final C49592h f114095a = new C49592h((byte) 0);

        static {
            Covode.recordClassIndex(58439);
        }
    }

    private C49592h() {
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "sp_show_share_guide_cache", 0);
        this.f114094b = a;
        try {
            this.f114093a = (CopyOnWriteArrayList) C80361dw.m139335b(a.getString("cached_video_id", ""), String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f114093a == null) {
            this.f114093a = new CopyOnWriteArrayList<>();
        }
    }

    /* synthetic */ C49592h(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo81382a(String str) {
        return this.f114093a.contains(str);
    }

    /* renamed from: b */
    public final void mo81383b(String str) {
        if (!TextUtils.isEmpty(str) && !this.f114093a.contains(str)) {
            if (this.f114093a.size() >= 20) {
                this.f114093a.remove(0);
            }
            this.f114093a.add(str);
            try {
                this.f114094b.edit().putString("cached_video_id", C80361dw.m139334a(this.f114093a)).apply();
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo81381a(List<Aweme> list) {
        if (!(C13603b.m24435a((Collection) list) || list.size() < 3 || this.f114094b.getBoolean("sp_cached_first_three_video", false))) {
            for (Aweme aweme : list.subList(0, 3)) {
                mo81383b(aweme.getAid());
            }
            this.f114094b.edit().putBoolean("sp_cached_first_three_video", true).apply();
        }
    }
}
