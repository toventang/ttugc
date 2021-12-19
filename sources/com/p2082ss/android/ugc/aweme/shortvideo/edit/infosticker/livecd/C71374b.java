package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.b */
public final class C71374b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.b$b */
    public static final class C71376b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C71376b f159955a = new C71376b();

        static {
            Covode.recordClassIndex(83904);
        }

        C71376b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(83902);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd.b$a */
    public static final class C71375a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C71375a f159954a = new C71375a();

        static {
            Covode.recordClassIndex(83903);
        }

        C71375a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<StickerPublishStruct> stickerList;
            StickerPermissionResponse stickerPermissionResponse = (StickerPermissionResponse) obj;
            if (stickerPermissionResponse.status_code == 0 && (stickerList = stickerPermissionResponse.getStickerList()) != null) {
                if (!(stickerList instanceof Collection) || !stickerList.isEmpty()) {
                    for (T t : stickerList) {
                        if (t != null && t.getStickerType() == 10) {
                            new C71372a().mo112862a(true);
                            return;
                        }
                    }
                }
            }
        }
    }
}
