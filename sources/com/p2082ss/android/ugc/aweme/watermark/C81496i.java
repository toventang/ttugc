package com.p2082ss.android.ugc.aweme.watermark;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c.p3883a.C73867a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.watermark.C81513v;
import java.util.List;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.i */
public final class C81496i implements AbstractC81493f {

    /* renamed from: a */
    private final AbstractC89244h f182201a = C89250i.m154773a((AbstractC89171a) C81498b.f182203a);

    static {
        Covode.recordClassIndex(94869);
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.i$a */
    static final class C81497a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f182202a;

        static {
            Covode.recordClassIndex(94870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81497a(boolean z) {
            super(0);
            this.f182202a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f182202a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.i$b */
    static final class C81498b extends AbstractC89220m implements AbstractC89171a<C81511u> {

        /* renamed from: a */
        public static final C81498b f182203a = new C81498b();

        static {
            Covode.recordClassIndex(94871);
        }

        C81498b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C81511u invoke() {
            return new C81511u();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: a */
    public final AbstractC81495h mo125205a() {
        return (C81511u) this.f182201a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: d */
    public final boolean mo125209d() {
        return new C73867a().mo116330c();
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: e */
    public final String mo125210e() {
        return new C73867a().mo116328a();
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: b */
    public final boolean mo125207b() {
        C89219l.m154716b(C70005cr.m123611a(), "");
        if (C70005cr.m123616g()) {
            return false;
        }
        C73867a aVar = new C73867a();
        if (!aVar.mo116330c()) {
            return false;
        }
        C80720e.m139938e(aVar.mo116328a());
        C81499j.m141328a(false);
        C81499j.m141326a(-1, -1);
        C81499j.m141327a("", false);
        C81499j.m141327a("", true);
        C81499j.m141330b("", false);
        C81499j.m141330b("", true);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: c */
    public final long mo125208c() {
        C89219l.m154716b(C70005cr.m123611a(), "");
        if (C70005cr.m123616g()) {
            return 0;
        }
        C73867a aVar = new C73867a();
        if (!aVar.mo116330c()) {
            return 0;
        }
        return C80720e.m139933d(aVar.mo116328a());
    }

    @Override // com.p2082ss.android.ugc.aweme.watermark.AbstractC81493f
    /* renamed from: a */
    public final void mo125206a(List<Integer> list, String str, AbstractC32846a aVar, AbstractC89188r<? super Boolean, ? super List<String>, ? super String, ? super String, C89391z> rVar, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar, "");
        Application application = C63247i.f143610a;
        boolean a = C89219l.m154714a((Object) C63244g.m114602a().mo73255A().mo93904c(), (Object) aVar.mo58660c());
        C73867a aVar2 = new C73867a();
        boolean d = aVar2.mo116331d();
        if (aVar2.mo116330c()) {
            C89219l.m154716b(application, "");
            C81513v vVar = new C81513v(application, aVar2.mo116328a(), list, str, aVar, new C81497a(a), d);
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(vVar.f182258a.plus(C89546bf.f203267b).plus(new C81513v.C81519f(CoroutineExceptionHandler.f203145c, bVar))), null, null, new C81513v.C81520g(vVar, rVar, null), 3);
        } else if (bVar != null) {
            bVar.invoke(new IllegalStateException("the new ending watermark is not enabled, skip loading ending watermark resources"));
        }
    }
}
