package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.C65622b;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.C65625c;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import com.p2082ss.ttuploader.TTImageUploader;
import java.io.File;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a */
public abstract class AbstractC74096a {

    /* renamed from: a */
    public static final C74097a f166362a = new C74097a((byte) 0);

    static {
        Covode.recordClassIndex(86849);
    }

    /* renamed from: a */
    public abstract void mo116482a(TTImageUploader tTImageUploader, C65612d dVar);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$a */
    public static final class C74097a {
        static {
            Covode.recordClassIndex(86850);
        }

        private C74097a() {
        }

        public /* synthetic */ C74097a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$e */
    public static final class C74101e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Object f166368a;

        /* renamed from: b */
        final /* synthetic */ C74099c f166369b;

        static {
            Covode.recordClassIndex(86854);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74101e(Object obj, C74099c cVar) {
            super(0);
            this.f166368a = obj;
            this.f166369b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo116485a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo116485a() {
            JSONObject a;
            Object obj = this.f166368a;
            if (obj instanceof VideoPublishEditModel) {
                a = this.f166369b.invoke((VideoPublishEditModel) obj).mo104807a(EnumC72680s.SUCCESS).mo110191a();
            } else {
                a = new C69840ar().mo110191a();
            }
            if (C68743i.m121176a()) {
                C63244g.m114602a().mo73263I().mo101629a("upload_cover_text_image_suc_rate", 0, a);
            }
            C63244g.m114602a().mo73263I().mo101629a("aweme_movie_publish_error_rate_parallel", 0, a);
        }
    }

    /* renamed from: a */
    public static C65512a<C65616g> m130309a(C65616g gVar) {
        return new C74098b(gVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$b */
    public static final class C74098b extends C65512a<C65616g> {

        /* renamed from: b */
        final /* synthetic */ C65616g f166363b;

        static {
            Covode.recordClassIndex(86851);
        }

        C74098b(C65616g gVar) {
            this.f166363b = gVar;
            if (gVar != null) {
                gVar.f147919h = "";
            } else {
                gVar = null;
            }
            mo46227b(gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$c */
    public static final class C74099c extends AbstractC89220m implements AbstractC89172b<VideoPublishEditModel, C65622b> {

        /* renamed from: a */
        final /* synthetic */ String f166364a;

        /* renamed from: b */
        final /* synthetic */ boolean f166365b;

        static {
            Covode.recordClassIndex(86852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74099c(String str, boolean z) {
            super(1);
            this.f166364a = str;
            this.f166365b = z;
        }

        /* renamed from: a */
        public final C65622b invoke(VideoPublishEditModel videoPublishEditModel) {
            C89219l.m154721d(videoPublishEditModel, "");
            C69840ar arVar = new C69840ar();
            C89219l.m154716b(arVar, "");
            return new C65622b(arVar).mo104805a(this.f166364a).mo104802a(videoPublishEditModel).mo104803a(EnumC72679r.COVER_TEXT_UPLOAD).mo104804a(EnumC72682u.VIDEO).mo104800a().mo104808b().mo104806a(this.f166365b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$d */
    public static final class C74100d extends AbstractC89220m implements AbstractC89183m<Throwable, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Object f166366a;

        /* renamed from: b */
        final /* synthetic */ C74099c f166367b;

        static {
            Covode.recordClassIndex(86853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74100d(Object obj, C74099c cVar) {
            super(2);
            this.f166366a = obj;
            this.f166367b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Throwable th, String str) {
            mo116484a(th, str);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo116484a(Throwable th, String str) {
            JSONObject a;
            C89219l.m154721d(th, "");
            C89219l.m154721d(str, "");
            if (this.f166366a instanceof VideoPublishEditModel) {
                File file = new File(str);
                a = this.f166367b.invoke((VideoPublishEditModel) this.f166366a).mo104801a(new C65625c(th, str)).mo104807a(EnumC72680s.FAILED).mo110185a("file_exist", Boolean.valueOf(file.exists())).mo110188a("file_size", Long.valueOf(file.length())).mo110189a("file_path", str).mo110191a();
            } else {
                a = new C69840ar().mo110191a();
            }
            if (C68743i.m121176a()) {
                C63244g.m114602a().mo73263I().mo101629a("upload_cover_text_image_suc_rate", 1, a);
            }
            C63244g.m114602a().mo73263I().mo101629a("aweme_movie_publish_error_rate_parallel", 1, a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$f */
    public static final class C74102f extends C65512a<C65616g> {

        /* renamed from: b */
        final /* synthetic */ AbstractC74096a f166370b;

        /* renamed from: c */
        final /* synthetic */ C65616g f166371c;

        /* renamed from: i */
        final /* synthetic */ C74101e f166372i;

        /* renamed from: j */
        final /* synthetic */ String f166373j;

        /* renamed from: k */
        final /* synthetic */ Object f166374k;

        /* renamed from: l */
        final /* synthetic */ C74100d f166375l;

        /* renamed from: m */
        final /* synthetic */ C65612d f166376m;

        static {
            Covode.recordClassIndex(86855);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C74102f(com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a r5, com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g r6, com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a.C74101e r7, java.lang.String r8, java.lang.Object r9, com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a.C74100d r10, com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d r11) {
            /*
            // Method dump skipped, instructions count: 160
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.AbstractC74096a.C74102f.<init>(com.ss.android.ugc.aweme.shortvideo.vechoosecover.a, com.ss.android.ugc.aweme.publish.f.g, com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$e, java.lang.String, java.lang.Object, com.ss.android.ugc.aweme.shortvideo.vechoosecover.a$d, com.ss.android.ugc.aweme.publish.f.d):void");
        }
    }
}
