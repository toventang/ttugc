package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.c */
public final class C78823c {

    /* renamed from: a */
    public static final C78824a f177139a = new C78824a((byte) 0);

    static {
        Covode.recordClassIndex(91966);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.c$a */
    public static final class C78824a {
        static {
            Covode.recordClassIndex(91967);
        }

        private C78824a() {
        }

        public /* synthetic */ C78824a(byte b) {
            this();
        }

        /* renamed from: a */
        public static List<MusicModel> m137590a(List<? extends Music> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Music music : list) {
                if (music != null) {
                    arrayList.add(music.convertToMusicModel());
                }
            }
            return arrayList;
        }
    }
}
