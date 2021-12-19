package com.p2082ss.android.ugc.aweme.share.p3767m;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.setting.C68126m;
import com.p2082ss.android.ugc.aweme.share.C68862ag;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.m.e */
public final class C69311e {

    /* renamed from: a */
    public static final C69311e f154876a = new C69311e();

    /* renamed from: b */
    private static final C27910f f154877b = new C27910f();

    /* renamed from: com.ss.android.ugc.aweme.share.m.e$a */
    public static final class C69312a extends C27895a<HashMap<String, VideoUrlModel>> {
        static {
            Covode.recordClassIndex(81642);
        }

        C69312a() {
        }
    }

    private C69311e() {
    }

    static {
        Covode.recordClassIndex(81641);
    }

    /* renamed from: a */
    public static final VideoUrlModel m122506a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        Map<String, VideoUrlModel> b = m122508b(aweme);
        if (b != null) {
            return b.get("suffix_scene");
        }
        return null;
    }

    /* renamed from: b */
    private static Map<String, VideoUrlModel> m122508b(Aweme aweme) {
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        return (Map) f154877b.mo46671a(video.getMiscDownloadAddrs(), new C69312a().type);
    }

    /* renamed from: a */
    public static final VideoUrlModel m122507a(Aweme aweme, String str) {
        List<C68862ag> list;
        C89219l.m154721d(aweme, "");
        if (str == null) {
            return null;
        }
        C89219l.m154721d(aweme, "");
        C68960a a = C68960a.m121644a();
        C89219l.m154716b(a, "");
        List<C68862ag> list2 = a.f154275a;
        if (list2 == null || list2.isEmpty()) {
            list = C68126m.m120417a();
        } else {
            C68960a a2 = C68960a.m121644a();
            C89219l.m154716b(a2, "");
            list = a2.f154275a;
        }
        C89219l.m154716b(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (C68862ag agVar : list) {
            arrayList.add(agVar.f154008a);
        }
        Set l = C89070n.m154592l(arrayList);
        Map<String, VideoUrlModel> b = m122508b(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b != null) {
            for (Map.Entry<String, VideoUrlModel> entry : b.entrySet()) {
                if (l.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return (VideoUrlModel) linkedHashMap.get(str);
    }
}
