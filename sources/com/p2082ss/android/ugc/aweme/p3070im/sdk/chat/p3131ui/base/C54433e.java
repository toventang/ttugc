package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3128b.C54363b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53638d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53679d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.C55276a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88593f;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.e */
public final class C54433e implements AbstractC54432d {
    static {
        Covode.recordClassIndex(64138);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d
    /* renamed from: a */
    public final void mo91502a(String str) {
        C89219l.m154721d(str, "");
        AbstractC81915c.m141874a(new C55276a(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d
    /* renamed from: a */
    public final void mo91500a(C19638h hVar) {
        if (hVar != null) {
            hVar.getConversationId();
        }
        if (hVar != null) {
            Map<String, String> localExt = hVar.getLocalExt();
            if (localExt != null) {
                localExt.get("a:s_author_im_supporter");
            }
            if (C89219l.m154714a((Object) C53651a.f123099a, (Object) hVar.getConversationId()) && (!C89219l.m154714a((Object) "1", (Object) hVar.getLocalExt().get("a:s_author_im_supporter")))) {
                Map<String, String> localExt2 = hVar.getLocalExt();
                C89219l.m154716b(localExt2, "");
                localExt2.put("a:s_author_im_supporter", "1");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d
    /* renamed from: b */
    public final AbstractC88973n<List<C19538ai>> mo91504b(List<C19538ai> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC88973n<List<C19538ai>> a = C88925a.m154169a((AbstractC88973n) C88593f.f201012a);
            C89219l.m154716b(a, "");
            return a;
        }
        AbstractC88973n<List<C19538ai>> a2 = AbstractC88973n.m154246a((Callable) new C53679d.CallableC53681b(list)).mo143248c(C53679d.C53682c.f123187a).mo143237a((AbstractC88434g) C53679d.C53684d.f123189a);
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d
    /* renamed from: a */
    public final void mo91503a(List<C19538ai> list) {
        C89219l.m154721d(list, "");
        if (C16048b.m29633a().mo25412a(true, "im_preload_strategy", 0) == 2) {
            C56244a.m102190b("MediaPreloader", "preloadFromChatPie QueryMessageFromPie");
            C53638d.m98897b(list);
        }
        if (list != null && C53660b.f123120a != null) {
            AbstractC89568bz unused = C89624i.m155555a(C53660b.f123123d, C89546bf.f203267b, null, new C53660b.C53672g(list, null), 2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d
    /* renamed from: a */
    public final void mo91501a(SystemContent systemContent, String str) {
        C89219l.m154721d(systemContent, "");
        C89219l.m154721d(str, "");
        AbstractC81915c.m141874a(new C54363b(systemContent, str));
    }
}
