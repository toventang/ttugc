package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46592e;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46611n;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiApi;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56236d;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.e */
public final class C55283e implements AbstractC56236d {
    static {
        Covode.recordClassIndex(65038);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56236d
    /* renamed from: a */
    public final Runnable mo92296a() {
        return new RunnableC55284a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.e$a */
    static final class RunnableC55284a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55283e f126392a;

        static {
            Covode.recordClassIndex(65039);
        }

        RunnableC55284a(C55283e eVar) {
            this.f126392a = eVar;
        }

        public final void run() {
            C46611n.m89946a();
            if (C46611n.m89948c() || !C46611n.m89947b()) {
                C46597h.m89936a();
                C46642d a = C46642d.m90028a();
                C89219l.m154716b(a, "");
                a.mo79255f();
                return;
            }
            ImSysEmojiApi imSysEmojiApi = C46592e.f108637a;
            C46642d a2 = C46642d.m90028a();
            C89219l.m154716b(a2, "");
            AbstractC88403ab.m153601a((AbstractC88984x) imSysEmojiApi.getResources(a2.mo79255f())).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo116431a_(new C46597h.C46603e());
        }
    }
}
