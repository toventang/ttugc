package dmt.p4542av.p4543a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70898f;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.a */
public abstract class AbstractC88123a {

    /* renamed from: d */
    public static final C88124a f200026d = new C88124a((byte) 0);

    /* renamed from: a */
    public int f200027a = -999;

    /* renamed from: b */
    public int f200028b = -999;

    /* renamed from: c */
    public final C88128c f200029c;

    /* renamed from: dmt.av.a.a$b */
    public static final class C88125b {

        /* renamed from: a */
        public final String f200030a;

        /* renamed from: b */
        public final EnumC88126a f200031b;

        /* renamed from: c */
        public final EnumC88126a f200032c;

        /* renamed from: d */
        public final EnumC88126a f200033d;

        /* renamed from: e */
        public final int f200034e;

        /* renamed from: f */
        public final String f200035f;

        static {
            Covode.recordClassIndex(104153);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C88125b)) {
                return false;
            }
            C88125b bVar = (C88125b) obj;
            return C89219l.m154714a(this.f200030a, bVar.f200030a) && C89219l.m154714a(this.f200031b, bVar.f200031b) && C89219l.m154714a(this.f200032c, bVar.f200032c) && C89219l.m154714a(this.f200033d, bVar.f200033d) && this.f200034e == bVar.f200034e && C89219l.m154714a(this.f200035f, bVar.f200035f);
        }

        public final int hashCode() {
            String str = this.f200030a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EnumC88126a aVar = this.f200031b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            EnumC88126a aVar2 = this.f200032c;
            int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            EnumC88126a aVar3 = this.f200033d;
            int hashCode4 = (((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f200034e) * 31;
            String str2 = this.f200035f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "SeparatorReport(separatorTag=" + this.f200030a + ", originFileStatus=" + this.f200031b + ", recordFileStatus=" + this.f200032c + ", outputFileStatus=" + this.f200033d + ", checkResult=" + this.f200034e + ", extra=" + this.f200035f + ")";
        }

        /* renamed from: dmt.av.a.a$b$a */
        public enum EnumC88126a {
            EXIT("exit"),
            ABSENCE("miss"),
            NO_NEEDED("no needed");
            

            /* renamed from: b */
            private final String f200037b;

            public final String getStatus() {
                return this.f200037b;
            }

            static {
                Covode.recordClassIndex(104154);
            }

            private EnumC88126a(String str) {
                this.f200037b = str;
            }
        }

        /* renamed from: a */
        public final String mo142631a() {
            return "Tag: " + this.f200030a + " \nOrigin File Exit: " + this.f200031b.getStatus() + " \nRecord File Exit: " + this.f200032c.getStatus() + " \nOutput File Exit: " + this.f200033d.getStatus() + " \nExtra: " + this.f200035f;
        }

        public /* synthetic */ C88125b(String str, EnumC88126a aVar, EnumC88126a aVar2, EnumC88126a aVar3, int i) {
            this(str, aVar, aVar2, aVar3, i, "");
        }

        public C88125b(String str, EnumC88126a aVar, EnumC88126a aVar2, EnumC88126a aVar3, int i, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(str2, "");
            this.f200030a = str;
            this.f200031b = aVar;
            this.f200032c = aVar2;
            this.f200033d = aVar3;
            this.f200034e = i;
            this.f200035f = str2;
        }
    }

    static {
        Covode.recordClassIndex(104151);
    }

    /* renamed from: c */
    public abstract C88125b mo142629c(VideoPublishEditModel videoPublishEditModel);

    /* renamed from: d */
    public abstract C88125b mo142630d(VideoPublishEditModel videoPublishEditModel);

    /* renamed from: dmt.av.a.a$a */
    public static final class C88124a {
        static {
            Covode.recordClassIndex(104152);
        }

        private C88124a() {
        }

        public /* synthetic */ C88124a(byte b) {
            this();
        }
    }

    public AbstractC88123a(C88128c cVar) {
        C89219l.m154721d(cVar, "");
        this.f200029c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo142627a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (this.f200029c.f200041b.length() > 0 && !C84902i.m145892a(this.f200029c.f200041b)) {
            C84902i.m145883a(this.f200029c.f200041b, false);
        }
        if (this.f200029c.f200040a.length() > 0 && !C84902i.m145892a(this.f200029c.f200040a)) {
            C84902i.m145883a(this.f200029c.f200040a, false);
        }
    }

    /* renamed from: b */
    public final C88125b mo142628b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        mo142627a(videoPublishEditModel);
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord() || !C70898f.m125188a()) {
            return mo142630d(videoPublishEditModel);
        }
        return mo142629c(videoPublishEditModel);
    }
}
