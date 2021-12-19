package com.p2082ss.android.ugc.aweme.tools.draft.p4113k;

import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.concurrent.Callable;
import p4600h.C89391z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.k.a */
public final class C78399a {

    /* renamed from: a */
    public static final C78399a f176142a = new C78399a();

    private C78399a() {
    }

    static {
        Covode.recordClassIndex(91525);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.k.a$a */
    public static final class CallableC78400a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C43223c f176143a;

        static {
            Covode.recordClassIndex(91526);
        }

        public CallableC78400a(C43223c cVar) {
            this.f176143a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f176143a.f100900W.f100754N != null) {
                C13609b.m24452a(this.f176143a.f100900W.f100754N.getVideoCoverImgPath());
                C13609b.m24452a(this.f176143a.f100900W.f100754N.getEffectPath());
                String bgPath = this.f176143a.f100900W.f100754N.getBgPath();
                if (C89361p.m154908a((CharSequence) bgPath, (CharSequence) "status/resizeImage", false)) {
                    C13609b.m24452a(bgPath);
                }
                C13609b.m24452a(this.f176143a.f100900W.f100754N.getMusicPath());
            }
            return C89391z.f203057a;
        }
    }
}
