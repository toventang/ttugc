package com.p2082ss.android.ugc.aweme.story.record.recordcontrol;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65416cz;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68090d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74224j;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72779b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.story.record.p4061a.AbstractC77466a;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.C77623d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.f */
public final class C77629f {

    /* renamed from: a */
    public static final C77629f f174122a = new C77629f();

    private C77629f() {
    }

    static {
        Covode.recordClassIndex(90668);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.f$a */
    public static final class C77630a extends AbstractC89220m implements AbstractC89172b<C74172g.C74180b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f174123a;

        /* renamed from: b */
        final /* synthetic */ AbstractC77466a f174124b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f174125c = null;

        static {
            Covode.recordClassIndex(90669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77630a(ActivityC0945e eVar, AbstractC77466a aVar) {
            super(1);
            this.f174123a = eVar;
            this.f174124b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74172g.C74180b bVar) {
            C74172g.C74180b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo116675a(C77622c.f174113a);
            bVar2.mo116676a(new C74224j(C65357b.m117048d(), C65357b.m117047c(), C65416cz.m117135a(), C77610d.m135601a()));
            bVar2.mo116679b(C776311.f174126a);
            Context applicationContext = this.f174123a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            C89219l.m154721d(applicationContext, "");
            bVar2.f166665f = new C77623d.C77624a();
            bVar2.mo116678a(C776322.f174127a);
            bVar2.mo116674a(new C72779b(new C72779b.AbstractC72780a(this) {
                /* class com.p2082ss.android.ugc.aweme.story.record.recordcontrol.C77629f.C77630a.C776333 */

                /* renamed from: a */
                final /* synthetic */ C77630a f174128a;

                static {
                    Covode.recordClassIndex(90672);
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
                    this.f174128a.f174124b.mo22747A().getEndFrameTimeUS();
                    C73975b.C73976a.f166071a.end("av_video_stop_record", "stopRecordAsync#callback");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f174128a = r1;
                }
            }));
            bVar2.f166668i = true;
            bVar2.f166669j = new C77635g(this.f174124b);
            bVar2.mo116677a(C776344.f174129a);
            bVar2.f166674o = C68090d.m120392a();
            AbstractC89172b bVar3 = this.f174125c;
            if (bVar3 != null) {
                bVar3.invoke(bVar2);
            }
            return C89391z.f203057a;
        }
    }
}
