package com.p2082ss.android.ugc.aweme.choosemusic.p2465e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60822a;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.e.c */
public class C35836c extends AbstractC35831a {

    /* renamed from: d */
    private static volatile C35836c f84601d;

    static {
        Covode.recordClassIndex(43075);
    }

    private C35836c() {
        this.f84592a = 10;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a
    /* renamed from: d */
    public final String mo62943d() {
        return C60822a.C60823a.m110418a("music_search_history_v2", "", "music_sp");
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35835b
    /* renamed from: f */
    public final void mo62945f() {
        C89219l.m154721d("music_search_history", "");
        C89219l.m154721d("music_sp", "");
        Keva.getRepoFromSp(C17867d.m33078a(), "music_sp", 0).erase("music_search_history");
    }

    /* renamed from: g */
    public static C35836c m73228g() {
        MethodCollector.m26663i(3188);
        if (f84601d == null) {
            synchronized (C35836c.class) {
                try {
                    if (f84601d == null) {
                        f84601d = new C35836c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3188);
                    throw th;
                }
            }
        }
        C35836c cVar = f84601d;
        MethodCollector.m26664o(3188);
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a
    /* renamed from: c */
    public final List<MusicSearchHistory> mo62942c() {
        C89219l.m154721d("music_search_history", "");
        C89219l.m154721d(MusicSearchHistory.class, "");
        C89219l.m154721d("music_sp", "");
        String string = Keva.getRepoFromSp(C17867d.m33078a(), "music_sp", 0).getString("music_search_history", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        List<MusicSearchHistory> b = C80361dw.m139335b(string, MusicSearchHistory.class);
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2465e.AbstractC35831a
    /* renamed from: a */
    public final void mo62939a(String str) {
        C60822a.C60823a.m110419a("music_search_history_v2", (Object) str, "music_sp");
    }
}
