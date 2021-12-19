package com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73925y;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.C85615x;
import java.io.IOException;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.c.a */
public final class C65630a {

    /* renamed from: a */
    public static final C65630a f147953a = new C65630a();

    /* renamed from: b */
    private static final Integer[] f147954b = {-5, -110, 120000};

    private C65630a() {
    }

    static {
        Covode.recordClassIndex(77121);
    }

    /* renamed from: a */
    public static final boolean m117451a(int i) {
        return C89064i.m154489a(f147954b, Integer.valueOf(i));
    }

    /* renamed from: b */
    public static final int m117453b(Throwable th) {
        if (th instanceof C71798ef) {
            return ((C71798ef) th).getCode();
        }
        if (th instanceof C85615x) {
            return ((C85615x) th).getRetCd();
        }
        return 10038;
    }

    /* renamed from: c */
    public static final int m117454c(Throwable th) {
        C89219l.m154721d(th, "");
        if (th instanceof C73925y) {
            C73925y yVar = (C73925y) th;
            if (yVar.getErrorCode() != 0) {
                return (int) yVar.getErrorCode();
            }
        }
        return 12;
    }

    /* renamed from: a */
    public static final boolean m117452a(Throwable th) {
        C89219l.m154721d(th, "");
        long min = Math.min(C80720e.m139940f(), 2147483647L);
        Throwable cause = th.getCause();
        if (!(cause instanceof IOException)) {
            return false;
        }
        if (C89219l.m154714a((Object) cause.getMessage(), (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final String m117455d(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C89219l.m154721d(th, "");
        if (th instanceof C34485a) {
            Object rawResponse = ((C34485a) th).getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) rawResponse).extra) != null) {
                String str = serverTimeExtra.logid;
                if (str == null) {
                    return "empty_logid";
                }
                return str;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static final int m117450a(Throwable th, int i) {
        C89219l.m154721d(th, "");
        if (th instanceof C34485a) {
            return ((C34480a) th).getErrorCode();
        }
        return i;
    }
}
