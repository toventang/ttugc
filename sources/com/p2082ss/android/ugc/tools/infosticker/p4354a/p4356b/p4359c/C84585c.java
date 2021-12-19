package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84541i;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84547o;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84548p;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84600h;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84601i;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84604l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.c */
public final class C84585c implements AbstractC84538f {

    /* renamed from: a */
    public final AbstractC84601i f189037a;

    /* renamed from: b */
    public final AbstractC84603k f189038b;

    /* renamed from: c */
    private final AbstractC84600h f189039c;

    /* renamed from: d */
    private final AbstractC84604l f189040d;

    static {
        Covode.recordClassIndex(98550);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.c$b */
    static final class CallableC84587b<V> implements Callable<AbstractC88984x<? extends C84541i>> {

        /* renamed from: a */
        final /* synthetic */ C84585c f189043a;

        /* renamed from: b */
        final /* synthetic */ InfoStickerEffect f189044b;

        static {
            Covode.recordClassIndex(98552);
        }

        CallableC84587b(C84585c cVar, InfoStickerEffect infoStickerEffect) {
            this.f189043a = cVar;
            this.f189044b = infoStickerEffect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ AbstractC88984x<? extends C84541i> call() {
            return this.f189043a.f189037a.mo129430a(this.f189044b, true).mo143292d(new AbstractC88434g<C84445d<InfoStickerEffect, String>, C84541i>(this) {
                /* class com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c.C84585c.CallableC84587b.C845881 */

                /* renamed from: a */
                final /* synthetic */ CallableC84587b f189045a;

                static {
                    Covode.recordClassIndex(98553);
                }

                {
                    this.f189045a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ C84541i apply(C84445d<InfoStickerEffect, String> dVar) {
                    C84547o oVar;
                    C84445d<InfoStickerEffect, String> dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    KEY key = dVar2.f188780b;
                    C84585c cVar = this.f189045a.f189043a;
                    int i = C84589d.f189046a[dVar2.f188779a.ordinal()];
                    if (i == 1 || i == 2) {
                        oVar = new C84547o(EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOADING, "");
                    } else if (i == 3) {
                        RESULT result = dVar2.f188781c;
                        if (result == null) {
                            result = cVar.f189038b.mo129520a(dVar2.f188780b);
                        }
                        oVar = new C84547o(EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS, result);
                    } else if (i != 4) {
                        oVar = new C84547o(EnumC84548p.SEARCH_STICKER_STICKER_UNKNOWN, "");
                    } else {
                        oVar = new C84547o(EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOAD_FAILED, "");
                    }
                    return new C84541i(key, oVar, dVar2.f188783e, dVar2.f188782d);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.c$a */
    static final class C84586a<T> implements AbstractC88983w<C84541i> {

        /* renamed from: a */
        final /* synthetic */ C84585c f189041a;

        /* renamed from: b */
        final /* synthetic */ InfoStickerEffect f189042b;

        static {
            Covode.recordClassIndex(98551);
        }

        C84586a(C84585c cVar, InfoStickerEffect infoStickerEffect) {
            this.f189041a = cVar;
            this.f189042b = infoStickerEffect;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C84541i> vVar) {
            C89219l.m154721d(vVar, "");
            if (this.f189041a.f189038b.mo129521b(this.f189042b)) {
                vVar.mo143031a(new C84541i(this.f189042b, new C84547o(EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS, this.f189041a.f189038b.mo129520a(this.f189042b))));
            }
            vVar.mo143023a();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f
    /* renamed from: a */
    public final AbstractC88979t<C84541i> mo129486a(InfoStickerEffect infoStickerEffect) {
        C89219l.m154721d(infoStickerEffect, "");
        AbstractC88979t<C84541i> d = AbstractC88979t.m154294a(new C84586a(this, infoStickerEffect)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143293d(AbstractC88979t.m154303a(new CallableC84587b(this, infoStickerEffect)));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f
    /* renamed from: a */
    public final AbstractC84451j<InfoStickerEffect, InfoStickerListModel> mo129484a(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f189039c.mo129524a(i, str, str2);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f
    /* renamed from: a */
    public final AbstractC84451j<InfoStickerEffect, InfoStickerListModel> mo129485a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return this.f189039c.mo129525a(str, str2, str3);
    }

    public C84585c(AbstractC84600h hVar, AbstractC84604l lVar, AbstractC84601i iVar, AbstractC84603k kVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(kVar, "");
        this.f189039c = hVar;
        this.f189040d = lVar;
        this.f189037a = iVar;
        this.f189038b = kVar;
    }
}
