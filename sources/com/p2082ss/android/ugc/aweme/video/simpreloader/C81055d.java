package com.p2082ss.android.ugc.aweme.video.simpreloader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.d */
public final class C81055d {

    /* renamed from: e */
    public static final C81056a f181173e = new C81056a((byte) 0);

    /* renamed from: a */
    public int f181174a;

    /* renamed from: b */
    AbstractC24157c<Void> f181175b;

    /* renamed from: c */
    public final WeakReference<Aweme> f181176c;

    /* renamed from: d */
    public AbstractC81061h f181177d;

    static {
        Covode.recordClassIndex(94376);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.d$a */
    public static final class C81056a {
        static {
            Covode.recordClassIndex(94377);
        }

        private C81056a() {
        }

        public /* synthetic */ C81056a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo124517b() {
        AbstractC24157c<Void> cVar = this.f181175b;
        if (cVar != null) {
            cVar.mo39750g();
        }
        this.f181175b = null;
        this.f181177d = null;
        Aweme aweme = this.f181176c.get();
        if (aweme != null) {
            aweme.getAid();
        }
    }

    /* renamed from: a */
    public final void mo124516a() {
        String str;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        int i = this.f181174a;
        if (i == 1) {
            Aweme aweme = this.f181176c.get();
            if (aweme != null) {
                aweme.getAid();
            }
        } else if (i == 2) {
            Aweme aweme2 = this.f181176c.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            AbstractC81061h hVar = this.f181177d;
            if (hVar != null) {
                Aweme aweme3 = this.f181176c.get();
                if (aweme3 != null) {
                    aweme3.getAid();
                }
                hVar.mo124518a();
            }
        } else {
            Aweme aweme4 = this.f181176c.get();
            if (aweme4 == null || (video = aweme4.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty())) {
                str = "";
            } else {
                str = urlList.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                Aweme aweme5 = this.f181176c.get();
                if (aweme5 != null) {
                    aweme5.getAid();
                }
                AbstractC81061h hVar2 = this.f181177d;
                if (hVar2 != null) {
                    Aweme aweme6 = this.f181176c.get();
                    if (aweme6 != null) {
                        aweme6.getAid();
                    }
                    hVar2.mo124518a();
                    return;
                }
                return;
            }
            this.f181175b = C24428k.m46551a().mo40247e().mo40236d(C24636b.fromUri(str), null);
            this.f181174a = 1;
            Aweme aweme7 = this.f181176c.get();
            if (aweme7 != null) {
                aweme7.getAid();
            }
            AbstractC24157c<Void> cVar = this.f181175b;
            if (cVar == null) {
                C89219l.m154715b();
            }
            cVar.mo39739a(new C81057b(this), C81067m.C81070a.m140763a().f181189a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.d$b */
    public static final class C81057b implements AbstractC24160e<Void> {

        /* renamed from: a */
        final /* synthetic */ C81055d f181178a;

        static {
            Covode.recordClassIndex(94378);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81057b(C81055d dVar) {
            this.f181178a = dVar;
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onProgressUpdate(AbstractC24157c<Void> cVar) {
            Aweme aweme;
            if (this.f181178a.f181177d != null && (aweme = this.f181178a.f181176c.get()) != null) {
                aweme.getAid();
            }
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onCancellation(AbstractC24157c<Void> cVar) {
            Aweme aweme;
            Aweme aweme2 = this.f181178a.f181176c.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            if (!(this.f181178a.f181177d == null || (aweme = this.f181178a.f181176c.get()) == null)) {
                aweme.getAid();
            }
            this.f181178a.f181174a = 4;
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onFailure(AbstractC24157c<Void> cVar) {
            Aweme aweme = this.f181178a.f181176c.get();
            if (aweme != null) {
                aweme.getAid();
            }
            AbstractC81061h hVar = this.f181178a.f181177d;
            if (hVar != null) {
                Aweme aweme2 = this.f181178a.f181176c.get();
                if (aweme2 != null) {
                    aweme2.getAid();
                }
                hVar.mo124519b();
            }
            this.f181178a.f181174a = 3;
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onNewResult(AbstractC24157c<Void> cVar) {
            if (cVar != null && cVar.mo39745b()) {
                Aweme aweme = this.f181178a.f181176c.get();
                if (aweme != null) {
                    aweme.getAid();
                }
                AbstractC81061h hVar = this.f181178a.f181177d;
                if (hVar != null) {
                    Aweme aweme2 = this.f181178a.f181176c.get();
                    if (aweme2 != null) {
                        aweme2.getAid();
                    }
                    hVar.mo124518a();
                }
                this.f181178a.f181174a = 2;
            }
        }
    }

    public C81055d(WeakReference<Aweme> weakReference, AbstractC81061h hVar) {
        C89219l.m154721d(weakReference, "");
        this.f181176c = weakReference;
        this.f181177d = hVar;
    }
}
