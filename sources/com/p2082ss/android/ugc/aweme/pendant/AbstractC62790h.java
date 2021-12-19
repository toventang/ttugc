package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.h */
public abstract class AbstractC62790h extends AbstractC62753a {

    /* renamed from: u */
    private final SmartImageView f142355u;

    /* renamed from: v */
    private final SmartImageView f142356v;

    static {
        Covode.recordClassIndex(73613);
    }

    /* renamed from: a */
    public void mo100761a(C20766v vVar) {
        C89219l.m154721d(vVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.h$c */
    public static final class C62794c implements AbstractC88986z<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC62790h f142362a;

        static {
            Covode.recordClassIndex(73617);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62794c(AbstractC62790h hVar) {
            this.f142362a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(String str) {
            C89219l.m154721d(str, "");
            this.f142362a.f142252j = true;
            AbstractC89171a<C89391z> aVar = this.f142362a.f142261s.f142367e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.pendant.h$a */
    public static final class C62791a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ AbstractC62790h f142357a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f142358b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f142359c;

        static {
            Covode.recordClassIndex(73614);
        }

        C62791a(AbstractC62790h hVar, UrlModel urlModel, SmartImageView smartImageView) {
            this.f142357a = hVar;
            this.f142358b = urlModel;
            this.f142359c = smartImageView;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            C20766v a = C20761r.m39060a(C34735v.m70965a(this.f142358b));
            AbstractC62790h hVar = this.f142357a;
            C89219l.m154716b(a, "");
            hVar.mo100761a(a);
            a.f49092E = this.f142359c;
            a.mo34179a("NewPendant").mo34181a(new AbstractC20727d() {
                /* class com.p2082ss.android.ugc.aweme.pendant.AbstractC62790h.C62791a.C627921 */

                static {
                    Covode.recordClassIndex(73615);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34147a(Uri uri, View view) {
                    C89219l.m154721d(uri, "");
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34159a(Uri uri, View view, Throwable th) {
                    C89219l.m154721d(uri, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        AbstractC88982v vVar2 = vVar;
                        if (th == null) {
                            C89219l.m154715b();
                        }
                        vVar2.mo143024a(th);
                    }
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143031a((Object) "");
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public void mo100758a(C62802k kVar) {
        C89219l.m154721d(kVar, "");
        com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel = kVar.f142401d;
        com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel2 = kVar.f142402e;
        if (urlModel != null && urlModel2 != null) {
            AbstractC88979t<String> a = m113175a(this.f142355u, urlModel);
            AbstractC88979t<String> a2 = m113175a(this.f142356v, urlModel2);
            if (a != null && a2 != null) {
                AbstractC88979t.m154296a(a, a2, C62793b.f142361a).mo143062b((AbstractC88986z) new C62794c(this));
                this.f142355u.getDrawable().setVisible(true, false);
                this.f142356v.getDrawable().setVisible(true, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.h$b */
    static final class C62793b<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C62793b f142361a = new C62793b();

        static {
            Covode.recordClassIndex(73616);
        }

        C62793b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return str + str2;
        }
    }

    /* renamed from: a */
    private final AbstractC88979t<String> m113175a(SmartImageView smartImageView, com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        try {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(urlModel.getUrlList());
            AbstractC88979t<String> a = AbstractC88979t.m154294a(new C62791a(this, urlModel2, smartImageView)).mo143258a(3);
            C89219l.m154716b(a, "");
            return a;
        } catch (C16041a unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC62790h(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, C62795i iVar) {
        super(context, view, smartImageView, smartImageView2, view2, view3, iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(smartImageView, "");
        C89219l.m154721d(smartImageView2, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(iVar, "");
        this.f142355u = smartImageView;
        this.f142356v = smartImageView2;
    }
}
