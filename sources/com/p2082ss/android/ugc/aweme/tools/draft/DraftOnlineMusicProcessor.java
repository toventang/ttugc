package com.p2082ss.android.ugc.aweme.tools.draft;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftOnlineMusicProcessor */
public final class DraftOnlineMusicProcessor implements AbstractC33974au, AbstractC78207bb {

    /* renamed from: a */
    public boolean f175427a = true;

    /* renamed from: b */
    public String f175428b;

    /* renamed from: c */
    final C43223c f175429c;

    /* renamed from: d */
    AbstractC89183m<? super Boolean, ? super String, C89391z> f175430d;

    /* renamed from: e */
    AbstractC89171a<C89391z> f175431e;

    static {
        Covode.recordClassIndex(91224);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f175430d = null;
        this.f175431e = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.AbstractC78207bb
    /* renamed from: a */
    public final void mo122037a() {
        if (C72829c.m128602a(C63247i.f143610a)) {
            C69905c cVar = this.f175429c.f100906f;
            C89219l.m154716b(cVar.getMusicId(), "");
            C43223c cVar2 = this.f175429c;
            C89219l.m154716b(cVar, "");
            C1743j jVar = new C1743j();
            C1731i.m5640b(new CallableC78115a(this, cVar, cVar2, jVar), C1731i.f5562a);
            C1731i<TResult> iVar = jVar.f5610a;
            C89219l.m154716b(iVar, "");
            iVar.mo5534a(new C78117b(this), C1731i.f5564c, null);
            return;
        }
        C69905c cVar3 = this.f175429c.f100906f;
        C89219l.m154716b(cVar3, "");
        if (C78177ax.m136665a(cVar3)) {
            C43223c cVar4 = this.f175429c;
            C69905c cVar5 = cVar4.f100906f;
            C89219l.m154716b(cVar5, "");
            cVar4.f100908h = C78177ax.m136666b(cVar5);
            C73991bj.m130128a("draft_music_process, Network not available, Online music file exist");
            AbstractC89183m<? super Boolean, ? super String, C89391z> mVar = this.f175430d;
            if (mVar != null) {
                mVar.invoke(true, null);
            }
        } else {
            C73991bj.m130131b("draft_music_process, Network not available, Online music file not exist, draft resume fail");
        }
        AbstractC89171a<C89391z> aVar = this.f175431e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftOnlineMusicProcessor$a */
    static final class CallableC78115a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ DraftOnlineMusicProcessor f175432a;

        /* renamed from: b */
        final /* synthetic */ C69905c f175433b;

        /* renamed from: c */
        final /* synthetic */ C43223c f175434c;

        /* renamed from: d */
        final /* synthetic */ C1743j f175435d;

        static {
            Covode.recordClassIndex(91225);
        }

        CallableC78115a(DraftOnlineMusicProcessor draftOnlineMusicProcessor, C69905c cVar, C43223c cVar2, C1743j jVar) {
            this.f175432a = draftOnlineMusicProcessor;
            this.f175433b = cVar;
            this.f175434c = cVar2;
            this.f175435d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
            if (com.bytedance.common.utility.C13627m.m24498a(r0) == false) goto L_0x0013;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0018  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 326
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.DraftOnlineMusicProcessor.CallableC78115a.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftOnlineMusicProcessor$b */
    static final class C78117b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ DraftOnlineMusicProcessor f175437a;

        static {
            Covode.recordClassIndex(91227);
        }

        C78117b(DraftOnlineMusicProcessor draftOnlineMusicProcessor) {
            this.f175437a = draftOnlineMusicProcessor;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC89171a<C89391z> aVar = this.f175437a.f175431e;
            if (aVar != null) {
                aVar.invoke();
            }
            AbstractC89183m<? super Boolean, ? super String, C89391z> mVar = this.f175437a.f175430d;
            if (mVar != null) {
                mVar.invoke(Boolean.valueOf(this.f175437a.f175427a), this.f175437a.f175428b);
            }
            return C89391z.f203057a;
        }
    }

    public DraftOnlineMusicProcessor(C43223c cVar, AbstractC89183m<? super Boolean, ? super String, C89391z> mVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(cVar, "");
        this.f175429c = cVar;
        this.f175430d = mVar;
        this.f175431e = aVar;
    }
}
