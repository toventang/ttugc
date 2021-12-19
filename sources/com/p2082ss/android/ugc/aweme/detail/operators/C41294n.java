package com.p2082ss.android.ugc.aweme.detail.operators;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41235i;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.notice.api.services.AbstractC61610a;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.n */
public final class C41294n extends C41291k {

    /* renamed from: c */
    public static final C41295a f96397c = new C41295a((byte) 0);

    static {
        Covode.recordClassIndex(49182);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$a */
    public static final class C41295a {
        static {
            Covode.recordClassIndex(49183);
        }

        private C41295a() {
        }

        public /* synthetic */ C41295a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.n$b */
    public static final class C41296b extends C41237j {

        /* renamed from: a */
        public C49812b f96398a;

        static {
            Covode.recordClassIndex(49184);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.detail.p2750i.C41237j
        /* renamed from: c */
        public final void mo57528c() {
            String upvoteId;
            super.mo57528c();
            C49812b bVar = this.f96398a;
            if (bVar == null || (upvoteId = bVar.getUpvoteId()) == null || upvoteId.length() == 0) {
                AbstractC39085b bVar2 = this.f92286h;
                C89219l.m154716b(bVar2, "");
                T t = bVar2.mData;
                if (t != null) {
                    C61611b.f139811a.mo99379b().mo99386a((Aweme) t);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.C41291k, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f96392b = new C41296b();
        return super.init(fragment);
    }

    /* renamed from: a */
    public final List<Aweme> mo70581a(C49812b bVar) {
        String aid;
        String upvoteId;
        String str;
        C41237j jVar = this.f96392b;
        if (!(jVar instanceof C41296b)) {
            jVar = null;
        }
        C41296b bVar2 = (C41296b) jVar;
        if (bVar2 != null) {
            bVar2.f96398a = bVar;
        }
        if (bVar == null || (aid = bVar.getAid()) == null || aid.length() == 0 || ((upvoteId = bVar.getUpvoteId()) != null && upvoteId.length() != 0)) {
            return null;
        }
        C41235i iVar = this.f96391a;
        C89219l.m154716b(iVar, "");
        T t = iVar.mData;
        if (t == null) {
            AbstractC61610a b = C61611b.f139811a.mo99379b();
            String aid2 = bVar.getAid();
            C89219l.m154716b(aid2, "");
            t = b.mo99385a(aid2);
        }
        StringBuilder append = new StringBuilder("getAwemeList:").append(bVar.getAid()).append(", ");
        if (t != null) {
            str = t.getAid();
        } else {
            str = null;
        }
        C39109f.m79403b("DetailFromNoticeOperator", append.append(str).toString());
        if (t != null) {
            Aweme a = AwemeService.m70060b().mo60677a(t);
            C89219l.m154716b(a, "");
            return C89070n.m154524c(a);
        }
        return null;
    }
}
