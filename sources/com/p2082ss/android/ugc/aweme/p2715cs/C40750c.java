package com.p2082ss.android.ugc.aweme.p2715cs;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.cs.c */
public final class C40750c {
    static {
        Covode.recordClassIndex(48602);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.c$a */
    public enum EnumC40751a {
        POST(new AbstractC40749b() {
            /* class com.p2082ss.android.ugc.aweme.p2715cs.C40750c.EnumC40751a.C407521 */

            static {
                Covode.recordClassIndex(48604);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2715cs.AbstractC40749b
            /* renamed from: a */
            public final Object mo69984a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                PreloadApiServiceImpl.m65398a().mo57231a(aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), C40748a.m82211a(aweme.getAid(), EnumC40751a.POST));
                return null;
            }
        }),
        PROFILE(new AbstractC40749b() {
            /* class com.p2082ss.android.ugc.aweme.p2715cs.C40750c.EnumC40751a.C407532 */

            static {
                Covode.recordClassIndex(48605);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2715cs.AbstractC40749b
            /* renamed from: a */
            public final Object mo69984a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                PreloadApiServiceImpl.m65398a().mo57230a(aweme, C40748a.m82211a(aweme.getAid(), EnumC40751a.PROFILE));
                return null;
            }
        }),
        COMMENT(new AbstractC40749b() {
            /* class com.p2082ss.android.ugc.aweme.p2715cs.C40750c.EnumC40751a.C407543 */

            static {
                Covode.recordClassIndex(48606);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2715cs.AbstractC40749b
            /* renamed from: a */
            public final Object mo69984a(Object[] objArr) {
                Aweme aweme = (Aweme) objArr[0];
                aweme.getAuthorUid();
                CommentService e = CommentServiceImpl.m73664e();
                String aid = aweme.getAid();
                C40748a.m82211a(aweme.getAid(), EnumC40751a.COMMENT);
                e.mo63296a(aid, (String) objArr[1]);
                return null;
            }
        });
        

        /* renamed from: a */
        private AbstractC40749b f95404a;

        public final AbstractC40749b getPreloader() {
            return this.f95404a;
        }

        static {
            Covode.recordClassIndex(48603);
        }

        private EnumC40751a(AbstractC40749b bVar) {
            this.f95404a = bVar;
        }
    }
}
