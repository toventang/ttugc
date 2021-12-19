package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b */
public final class C73849b {
    static {
        Covode.recordClassIndex(86595);
    }

    /* renamed from: a */
    private static final int m129922a(C65614f fVar) {
        if (!fVar.f147908w) {
            return -1;
        }
        if (C72829c.m128604b(C63247i.f143610a)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m129923a(C65614f fVar, String str) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        int a = m129922a(fVar);
        C84911q.m145921a("TTUploader " + str + " checkNetState: " + a);
        return a;
    }
}
