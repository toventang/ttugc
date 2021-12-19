package com.p2082ss.android.ugc.aweme.feed.assem;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22874b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48146af;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48155ao;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50544l;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.f */
public final class C48704f {

    /* renamed from: a */
    public ConcurrentHashMap<String, C48155ao<VideoBaseCell, VideoItemParams>> f112565a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final AbstractC48146af f112566b;

    static {
        Covode.recordClassIndex(57484);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.f$b */
    public static final class C48706b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C48704f f112569a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f112570b;

        /* renamed from: c */
        final /* synthetic */ int f112571c;

        static {
            Covode.recordClassIndex(57486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48706b(C48704f fVar, C89233z.C89238e eVar, int i) {
            super(0);
            this.f112569a = fVar;
            this.f112570b = eVar;
            this.f112571c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m92028a());
        }

        /* renamed from: a */
        private int m92028a() {
            try {
                List<Aweme> e = this.f112569a.f112566b.mo80288e();
                if (e == null) {
                    return -1;
                }
                int i = 0;
                for (Aweme aweme : e) {
                    if (C89219l.m154714a((Object) C50544l.m94759a(aweme), (Object) this.f112570b.element)) {
                        return i;
                    }
                    i++;
                }
                return -1;
            } catch (Exception unused) {
                return this.f112571c;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.f$a */
    public static final class C48705a extends AbstractC89220m implements AbstractC89172b<VideoItemParams, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48155ao f112567a;

        /* renamed from: b */
        final /* synthetic */ int f112568b;

        static {
            Covode.recordClassIndex(57485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48705a(C48155ao aoVar, int i) {
            super(1);
            this.f112567a = aoVar;
            this.f112568b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(VideoItemParams videoItemParams) {
            C89219l.m154721d(videoItemParams, "");
            C48155ao aoVar = this.f112567a;
            int i = this.f112568b;
            AbstractC22874b<R, ITEM> bVar = aoVar.f111543b;
            if (bVar != null) {
                bVar.mo23356a(i, videoItemParams);
            }
            return C89391z.f203057a;
        }
    }

    public C48704f(AbstractC48146af afVar) {
        C89219l.m154721d(afVar, "");
        this.f112566b = afVar;
    }
}
