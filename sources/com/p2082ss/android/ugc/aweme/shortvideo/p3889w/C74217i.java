package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14197p;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65416cz;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68090d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69844av;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73365ae;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74167d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72775au;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72779b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.i */
public final class C74217i {
    static {
        Covode.recordClassIndex(86976);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.i$a */
    public static final class C74218a extends AbstractC89220m implements AbstractC89172b<C74172g.C74180b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC14209z f166720a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f166721b;

        /* renamed from: c */
        final /* synthetic */ ShortVideoContext f166722c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f166723d = null;

        static {
            Covode.recordClassIndex(86977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74218a(AbstractC14209z zVar, ActivityC0945e eVar, ShortVideoContext shortVideoContext, AbstractC89172b bVar) {
            super(1);
            this.f166720a = zVar;
            this.f166721b = eVar;
            this.f166722c = shortVideoContext;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74172g.C74180b bVar) {
            C74172g.C74180b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo116675a(C74166c.f166567a);
            bVar2.mo116676a(new C74224j(C65357b.m117048d(), C65357b.m117047c(), C65416cz.m117135a(), C72775au.m128326a()));
            final boolean a = C65369bi.m117065a();
            C742191 r0 = new AbstractC89171a<Boolean>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74217i.C74218a.C742191 */

                static {
                    Covode.recordClassIndex(86978);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(a);
                }
            };
            C89219l.m154721d(r0, "");
            bVar2.f166663d = r0;
            bVar2.mo116679b(C742202.f166725a);
            AbstractC14209z zVar = this.f166720a;
            C89219l.m154721d(zVar, "");
            bVar2.f166664e = new C74167d.C74168a(zVar);
            Context applicationContext = this.f166721b.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            C89219l.m154721d(applicationContext, "");
            bVar2.f166665f = new C74167d.C74169b();
            bVar2.mo116678a(C742213.f166726a);
            bVar2.mo116674a(new C72779b(new C72779b.AbstractC72780a(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74217i.C74218a.C742224 */

                /* renamed from: a */
                final /* synthetic */ C74218a f166727a;

                static {
                    Covode.recordClassIndex(86981);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72779b.AbstractC72780a
                /* renamed from: a */
                public final void mo115065a() {
                    C73975b.C73976a.f166071a.start("av_video_stop_record", "stopRecordAsync");
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72779b.AbstractC72780a
                /* renamed from: b */
                public final void mo115066b() {
                    C84911q.m145928d("MultiEditlog: stopRecordAsync ret = ret");
                    this.f166727a.f166720a.mo22747A().getEndFrameTimeUS();
                    C73975b.C73976a.f166071a.end("av_video_stop_record", "stopRecordAsync#callback");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f166727a = r1;
                }
            }));
            bVar2.f166668i = true;
            bVar2.f166669j = new C73365ae(this.f166720a, this.f166722c);
            bVar2.mo116677a(C742235.f166728a);
            bVar2.f166674o = C68090d.m120392a();
            AbstractC89172b bVar3 = this.f166723d;
            if (bVar3 != null) {
                bVar3.invoke(bVar2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C74228n m130483a(C21582f fVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(shortVideoContext, "");
        AbstractC14209z zVar = (AbstractC14209z) fVar.mo35249a(AbstractC14209z.class, (String) null);
        ActivityC0945e eVar = (ActivityC0945e) fVar.mo35249a(ActivityC0945e.class, (String) null);
        C74228n nVar = new C74228n(fVar, new C74218a(zVar, eVar, (ShortVideoContext) fVar.mo35249a(ShortVideoContext.class, (String) null), null));
        nVar.mo22884a(C14197p.class, new C69844av(eVar, zVar, nVar, shortVideoContext, (C73592c) fVar.mo35248a(C73592c.class, (String) null)));
        return nVar;
    }
}
