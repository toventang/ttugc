package com.p2082ss.android.ugc.aweme.video.simpreloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1733u.C23435d;
import com.bytedance.p1733u.EnumC23438f;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.j */
public final class C81063j implements AbstractC80850i {
    static {
        Covode.recordClassIndex(94384);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i
    /* renamed from: a */
    public final boolean mo124205a() {
        return C23435d.m44115a();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.j$1 */
    static /* synthetic */ class C810641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f181184a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 94385(0x170b1, float:1.32262E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.video.preload.api.i$a[] r0 = com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i.EnumC80851a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.video.simpreloader.C81063j.C810641.f181184a = r2
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i.EnumC80851a.PREFER_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.simpreloader.C81063j.C810641.f181184a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i.EnumC80851a.PREFER_PRIVATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.video.simpreloader.C81063j.C810641.f181184a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i.EnumC80851a.PREFER_SD_CARD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simpreloader.C81063j.C810641.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i
    /* renamed from: a */
    public final File mo124204a(Context context, AbstractC80850i.EnumC80851a aVar) {
        EnumC23438f fVar;
        int i = C810641.f181184a[aVar.ordinal()];
        if (i == 1) {
            fVar = EnumC23438f.PREFER_EXTERNAL;
        } else if (i == 2) {
            fVar = EnumC23438f.PREFER_PRIVATE;
        } else if (i != 3) {
            fVar = null;
        } else {
            fVar = EnumC23438f.PREFER_SD_CARD;
        }
        return C23435d.m44117b(context, fVar);
    }
}
