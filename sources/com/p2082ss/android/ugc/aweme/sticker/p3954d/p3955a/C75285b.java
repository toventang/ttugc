package com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b */
public final class C75285b implements AbstractC75292d {

    /* renamed from: a */
    public final ShortVideoContext f169259a;

    /* renamed from: b */
    public final AbstractC89172b<AbstractC75296b<?>, C89391z> f169260b;

    /* renamed from: c */
    private Object f169261c;

    /* renamed from: d */
    private final Context f169262d;

    static {
        Covode.recordClassIndex(88187);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b$a */
    public static final class C75286a implements AbstractC63257p.AbstractC63258a {

        /* renamed from: a */
        final /* synthetic */ C75285b f169263a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75296b f169264b;

        static {
            Covode.recordClassIndex(88188);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101754a(int i) {
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b$a$a */
        static final class CallableC75287a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C75286a f169265a;

            static {
                Covode.recordClassIndex(88189);
            }

            CallableC75287a(C75286a aVar) {
                this.f169265a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f169265a.f169263a.f169260b.invoke(this.f169265a.f169264b);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.d.a.b$a$b */
        static final class CallableC75288b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C75286a f169266a;

            static {
                Covode.recordClassIndex(88190);
            }

            CallableC75288b(C75286a aVar) {
                this.f169266a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f169266a.f169263a.f169260b.invoke(this.f169266a.f169264b);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101753a() {
            C84911q.m145921a("download music strong beat " + this.f169263a.f169259a.f155820e);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101756a(String str) {
            C89219l.m154721d(str, "");
            C1731i.m5640b(new CallableC75288b(this), C1731i.f5564c);
            C84911q.m145921a("download music strong beat success " + this.f169263a.f169259a.f155820e);
        }

        C75286a(C75285b bVar, AbstractC75296b bVar2) {
            this.f169263a = bVar;
            this.f169264b = bVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101755a(Integer num, String str) {
            C1731i.m5640b(new CallableC75287a(this), C1731i.f5564c);
            C84911q.m145921a("download music strong beat failure " + this.f169263a.f169259a.f155820e + ", err " + str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d
    /* renamed from: a */
    public final <T> boolean mo118624a(AbstractC75296b<T> bVar) {
        String str;
        C89219l.m154721d(bVar, "");
        if ((!C89219l.m154714a(this.f169261c, bVar)) && (bVar instanceof C75297c)) {
            C75297c cVar = (C75297c) bVar;
            if (cVar.f169280a.getTags() == null) {
                return false;
            }
            List<String> tags = cVar.f169280a.getTags();
            if (tags == null) {
                C89219l.m154715b();
            }
            if (!(!tags.contains("strong_beat") || (str = this.f169259a.f155820e) == null || str.length() == 0 || this.f169259a.f155824i == null || C84902i.m145892a(C63244g.m114602a().mo73291s().mo101742a(this.f169259a.f155817b.mo109893e())))) {
                this.f169261c = bVar;
                AbstractC63257p s = C63244g.m114602a().mo73291s();
                Context context = this.f169262d;
                String str2 = this.f169259a.f155820e;
                C89219l.m154716b(str2, "");
                UrlModel urlModel = this.f169259a.f155824i;
                C89219l.m154716b(urlModel, "");
                s.mo101745a(context, str2, urlModel, new C75286a(this, bVar));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75285b(Context context, ShortVideoContext shortVideoContext, AbstractC89172b<? super AbstractC75296b<?>, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(bVar, "");
        this.f169262d = context;
        this.f169259a = shortVideoContext;
        this.f169260b = bVar;
    }
}
