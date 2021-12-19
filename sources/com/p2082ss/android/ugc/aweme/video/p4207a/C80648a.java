package com.p2082ss.android.ugc.aweme.video.p4207a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80775n;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.video.a.a */
public final class C80648a {

    /* renamed from: i */
    public static final C80649a f180325i = new C80649a((byte) 0);

    /* renamed from: a */
    public AbstractC80747i f180326a;

    /* renamed from: b */
    public final C84294j f180327b;

    /* renamed from: c */
    public Aweme f180328c;

    /* renamed from: d */
    public String f180329d;

    /* renamed from: e */
    public boolean f180330e;

    /* renamed from: f */
    public final long f180331f;

    /* renamed from: g */
    public final long f180332g;

    /* renamed from: h */
    public final OnUIPlayListener f180333h;

    /* renamed from: j */
    private final C80652b f180334j;

    static {
        Covode.recordClassIndex(93927);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.a.a$a */
    public static final class C80649a {
        static {
            Covode.recordClassIndex(93928);
        }

        private C80649a() {
        }

        public /* synthetic */ C80649a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo123836c() {
        AbstractC80747i iVar = this.f180326a;
        if (iVar != null) {
            iVar.mo123908B();
        }
    }

    /* renamed from: g */
    public final void mo123840g() {
        AbstractC80747i iVar = this.f180326a;
        if (iVar != null) {
            iVar.mo123912F();
        }
    }

    /* renamed from: a */
    public final String mo123832a() {
        String str = this.f180329d;
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            return null;
        }
        return this.f180329d;
    }

    /* renamed from: h */
    private final boolean m139858h() {
        Aweme aweme;
        AwemeStatus status;
        Aweme aweme2 = this.f180328c;
        if (aweme2 == null || aweme2.getStatus() == null || (aweme = this.f180328c) == null || (status = aweme.getStatus()) == null || !status.isDelete()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo123835b() {
        AbstractC80747i iVar = this.f180326a;
        if (iVar != null && iVar.mo123945b(this.f180333h) && 1 != 0) {
            iVar.mo123937a((OnUIPlayListener) null);
        }
    }

    /* renamed from: e */
    public final Video mo123838e() {
        Video a;
        String a2 = mo123832a();
        if (a2 != null && (a = this.f180334j.mo123841a(String.class, a2)) != null) {
            return a;
        }
        Aweme aweme = this.f180328c;
        if (aweme != null) {
            return this.f180334j.mo123841a(Aweme.class, aweme);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo123839f() {
        C84294j jVar = this.f180327b;
        C89219l.m154716b(jVar, "");
        if (!jVar.mo129315c() || m139858h()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo123837d() {
        Video e;
        if (!mo123839f()) {
            if ((this.f180328c != null || mo123832a() != null) && (e = mo123838e()) != null) {
                AbstractC80747i iVar = this.f180326a;
                if (iVar != null) {
                    iVar.mo123937a(this.f180333h);
                }
                AbstractC80747i iVar2 = this.f180326a;
                if (iVar2 != null) {
                    C84294j jVar = this.f180327b;
                    C89219l.m154716b(jVar, "");
                    iVar2.mo123934a(jVar.mo129313b());
                }
                AbstractC80747i iVar3 = this.f180326a;
                if (iVar3 != null) {
                    iVar3.mo123927a(e, this.f180333h, 0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.a.a$c */
    static final class C80651c extends AbstractC89220m implements AbstractC89172b<Aweme, Video> {

        /* renamed from: a */
        public static final C80651c f180336a = new C80651c();

        static {
            Covode.recordClassIndex(93930);
        }

        C80651c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Video invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            C89219l.m154721d(aweme2, "");
            Video video = aweme2.getVideo();
            if (video == null) {
                return null;
            }
            video.setRationAndSourceId(aweme2.getAid());
            return video;
        }
    }

    /* renamed from: a */
    public final void mo123834a(int i) {
        if (!mo123839f()) {
            m139857b(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.a.a$b */
    static final class C80650b extends AbstractC89220m implements AbstractC89172b<String, Video> {

        /* renamed from: a */
        public static final C80650b f180335a = new C80650b();

        static {
            Covode.recordClassIndex(93929);
        }

        C80650b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Video invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            Video video = new Video();
            VideoUrlModel videoUrlModel = new VideoUrlModel();
            videoUrlModel.setBytevc1(false);
            videoUrlModel.setUrlList(C89070n.m154516a(str2));
            videoUrlModel.setUri(str2);
            videoUrlModel.setUrlKey(str2);
            videoUrlModel.setSourceId(str2);
            video.setPlayAddr(videoUrlModel);
            video.setSourceId(str2);
            return video;
        }
    }

    /* renamed from: b */
    private final void m139857b(int i) {
        Video e;
        if ((this.f180328c != null || mo123832a() != null) && (e = mo123838e()) != null) {
            AbstractC80747i iVar = this.f180326a;
            if (iVar != null) {
                iVar.mo123937a(this.f180333h);
            }
            AbstractC80747i iVar2 = this.f180326a;
            if (iVar2 != null) {
                C84294j jVar = this.f180327b;
                C89219l.m154716b(jVar, "");
                iVar2.mo123934a(jVar.mo129313b());
            }
            AbstractC80747i iVar3 = this.f180326a;
            if (iVar3 != null) {
                C80775n.C80777b bVar = new C80775n.C80777b();
                bVar.mo123986a(true);
                bVar.mo123983a(C80942a.m140477a(e));
                bVar.mo123991c(true);
                bVar.mo123981a(i);
                bVar.mo123997i(this.f180330e);
                iVar3.mo123943b(bVar.f180650a);
            }
        }
    }

    /* renamed from: a */
    public final void mo123833a(float f, float f2) {
        AbstractC80747i iVar = this.f180326a;
        if (iVar != null) {
            iVar.mo123932a(f, f2);
        }
    }

    public C80648a(KeepSurfaceTextureView keepSurfaceTextureView, OnUIPlayListener onUIPlayListener) {
        long j;
        C89219l.m154721d(onUIPlayListener, "");
        this.f180333h = onUIPlayListener;
        this.f180327b = C84294j.m144981a(keepSurfaceTextureView);
        AbstractC80747i iVar = this.f180326a;
        long j2 = 0;
        if (iVar != null) {
            j = iVar.mo123887j();
        } else {
            j = 0;
        }
        this.f180331f = j;
        AbstractC80747i iVar2 = this.f180326a;
        this.f180332g = iVar2 != null ? iVar2.mo123891n() : j2;
        C80652b bVar = new C80652b();
        bVar.mo123842a(String.class, (AbstractC89172b) C80650b.f180335a);
        bVar.mo123842a(Aweme.class, (AbstractC89172b) C80651c.f180336a);
        this.f180334j = bVar;
    }
}
