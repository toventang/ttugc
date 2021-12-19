package com.p2082ss.android.ugc.aweme.port.internal;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69908cb;
import com.p2082ss.android.ugc.aweme.shortvideo.C69921cc;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.C74330z;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.port.internal.l */
public final class C63285l implements AbstractC74304x<C69831ai> {

    /* renamed from: a */
    public final C69921cc f143647a;

    /* renamed from: b */
    public final C69908cb f143648b;

    /* renamed from: c */
    private final AbstractC89244h f143649c = C89250i.m154773a((AbstractC89171a) C63286a.f143656a);

    /* renamed from: d */
    private int f143650d;

    /* renamed from: e */
    private int f143651e;

    /* renamed from: f */
    private final AbstractC72630h f143652f;

    /* renamed from: g */
    private final IAVPublishService.OnPublishCallback f143653g;

    /* renamed from: h */
    private final String f143654h;

    /* renamed from: i */
    private final C72678q f143655i;

    static {
        Covode.recordClassIndex(74562);
    }

    /* renamed from: a */
    public final IAVPublishService mo101871a() {
        return (IAVPublishService) this.f143649c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishPause() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishResume() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSynthetiseSuccess(String str) {
    }

    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$a */
    static final class C63286a extends AbstractC89220m implements AbstractC89171a<IAVPublishService> {

        /* renamed from: a */
        public static final C63286a f143656a = new C63286a();

        static {
            Covode.recordClassIndex(74563);
        }

        C63286a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAVPublishService invoke() {
            return AVExternalServiceImpl.m113114a().publishService();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$b */
    public static final class CallableC63287b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C63285l f143657a;

        /* renamed from: b */
        final /* synthetic */ C72678q f143658b;

        static {
            Covode.recordClassIndex(74564);
        }

        CallableC63287b(C63285l lVar, C72678q qVar) {
            this.f143657a = lVar;
            this.f143658b = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f143657a.mo101871a().getCover(this.f143658b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onParallelPublishCancel() {
        this.f143651e = Math.max(this.f143651e, this.f143650d);
        this.f143650d = 0;
    }

    /* renamed from: b */
    private final void m114780b() {
        this.f143652f.mo101825b(this);
        if (mo101871a().isParallelPublishTaskFinished()) {
            this.f143648b.mo110321c();
            this.f143653g.onStopPublish();
            return;
        }
        this.f143647a.mo110328a(5);
        m114782d();
    }

    /* renamed from: c */
    private final void m114781c() {
        Object obj = null;
        this.f143647a.mo110330b(null);
        this.f143647a.mo110331c(null);
        mo101872a(this.f143655i, new C63291f(this));
        List<C72678q> allPublishModel = mo101871a().getAllPublishModel();
        C89219l.m154716b(allPublishModel, "");
        Iterator it = C89070n.m154585g((Collection) allPublishModel).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!C89219l.m154714a(next, this.f143655i)) {
                obj = next;
                break;
            }
        }
        C72678q qVar = (C72678q) obj;
        if (qVar != null) {
            mo101872a(qVar, new C63290e(this));
        }
    }

    /* renamed from: d */
    private final void m114782d() {
        List<C72678q> allPublishModel = mo101871a().getAllPublishModel();
        C89219l.m154716b(allPublishModel, "");
        List g = C89070n.m154585g((Collection) allPublishModel);
        g.remove(this.f143655i);
        if (g.size() > 0) {
            if (g.size() == 1) {
                Object obj = g.get(0);
                C89219l.m154716b(obj, "");
                mo101872a((C72678q) obj, new C63292g(this));
                return;
            }
            Object obj2 = g.get(0);
            C89219l.m154716b(obj2, "");
            Object obj3 = g.get(1);
            C89219l.m154716b(obj3, "");
            mo101872a((C72678q) obj2, new C63294h(this, (C72678q) obj3));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onError(C71818ev evVar) {
        m114780b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$c */
    public static final class C63288c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f143659a;

        static {
            Covode.recordClassIndex(74565);
        }

        C63288c(AbstractC89172b bVar) {
            this.f143659a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            Bitmap bitmap = (Bitmap) iVar.mo5545d();
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f143659a.invoke(bitmap);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$e */
    public static final class C63290e extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63285l f143661a;

        static {
            Covode.recordClassIndex(74567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63290e(C63285l lVar) {
            super(1);
            this.f143661a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C89219l.m154721d(bitmap2, "");
            this.f143661a.f143647a.mo110330b(bitmap2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$f */
    public static final class C63291f extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63285l f143662a;

        static {
            Covode.recordClassIndex(74568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63291f(C63285l lVar) {
            super(1);
            this.f143662a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C89219l.m154721d(bitmap2, "");
            this.f143662a.f143647a.mo110329a(bitmap2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$h */
    public static final class C63294h extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63285l f143666a;

        /* renamed from: b */
        final /* synthetic */ C72678q f143667b;

        static {
            Covode.recordClassIndex(74571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63294h(C63285l lVar, C72678q qVar) {
            super(1);
            this.f143666a = lVar;
            this.f143667b = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            final Bitmap bitmap2 = bitmap;
            C89219l.m154721d(bitmap2, "");
            this.f143666a.mo101872a(this.f143667b, new AbstractC89172b<Bitmap, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.port.internal.C63285l.C63294h.C632951 */

                /* renamed from: a */
                final /* synthetic */ C63294h f143668a;

                static {
                    Covode.recordClassIndex(74572);
                }

                {
                    this.f143668a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
                    final Bitmap bitmap2 = bitmap;
                    C89219l.m154721d(bitmap2, "");
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f143668a.f143666a.f143647a.mo110331c(bitmap2);
                        C69908cb cbVar = this.f143668a.f143666a.f143648b;
                        C632961 r3 = new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.port.internal.C63285l.C63294h.C632951.C632961 */

                            /* renamed from: a */
                            final /* synthetic */ C632951 f143670a;

                            static {
                                Covode.recordClassIndex(74573);
                            }

                            {
                                this.f143670a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f143670a.f143668a.f143666a.f143647a.mo110329a(bitmap2);
                                this.f143670a.f143668a.f143666a.f143647a.mo110330b(bitmap2);
                                this.f143670a.f143668a.f143666a.f143647a.mo110331c(null);
                                return C89391z.f203057a;
                            }
                        };
                        C89219l.m154721d(r3, "");
                        cbVar.f156219g.mo110116a();
                        cbVar.mo110322d();
                        ImageView imageView = cbVar.f156215c;
                        if (imageView == null) {
                            C89219l.m154710a("mBGCoverFirst");
                        }
                        float x = imageView.getX();
                        ImageView imageView2 = cbVar.f156216d;
                        if (imageView2 == null) {
                            C89219l.m154710a("mBGCoverSecond");
                        }
                        float x2 = x - imageView2.getX();
                        ImageView imageView3 = cbVar.f156215c;
                        if (imageView3 == null) {
                            C89219l.m154710a("mBGCoverFirst");
                        }
                        float y = imageView3.getY();
                        ImageView imageView4 = cbVar.f156216d;
                        if (imageView4 == null) {
                            C89219l.m154710a("mBGCoverSecond");
                        }
                        float y2 = y - imageView4.getY();
                        C74330z zVar = new C74330z();
                        ImageView imageView5 = cbVar.f156215c;
                        if (imageView5 == null) {
                            C89219l.m154710a("mBGCoverFirst");
                        }
                        ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                        ImageView imageView6 = cbVar.f156215c;
                        if (imageView6 == null) {
                            C89219l.m154710a("mBGCoverFirst");
                        }
                        ViewPropertyAnimator duration = alpha.translationY(((float) ((-imageView6.getHeight()) * 2)) / 3.0f).setDuration(300);
                        ImageView imageView7 = cbVar.f156217e;
                        if (imageView7 == null) {
                            C89219l.m154710a("mBGCoverThird");
                        }
                        imageView7.setAlpha(0.0f);
                        ImageView imageView8 = cbVar.f156217e;
                        if (imageView8 == null) {
                            C89219l.m154710a("mBGCoverThird");
                        }
                        imageView8.setTranslationX((float) C34728n.m70946a(15.0d));
                        ImageView imageView9 = cbVar.f156217e;
                        if (imageView9 == null) {
                            C89219l.m154710a("mBGCoverThird");
                        }
                        imageView9.setTranslationY((float) C34728n.m70946a(15.0d));
                        ImageView imageView10 = cbVar.f156217e;
                        if (imageView10 == null) {
                            C89219l.m154710a("mBGCoverThird");
                        }
                        ViewPropertyAnimator duration2 = imageView10.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300);
                        ImageView imageView11 = cbVar.f156216d;
                        if (imageView11 == null) {
                            C89219l.m154710a("mBGCoverSecond");
                        }
                        zVar.mo116957a(new C69908cb.C69919k(cbVar, zVar, duration, duration2, imageView11.animate().translationX(x2).translationY(y2).setDuration(300).withEndAction(new C69908cb.RunnableC69920l(cbVar, zVar, r3))));
                        cbVar.f156219g.mo110117a(zVar);
                    } else {
                        this.f143668a.f143666a.f143647a.mo110329a(bitmap2);
                        this.f143668a.f143666a.f143647a.mo110330b(bitmap2);
                        this.f143668a.f143666a.f143647a.mo110331c(null);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$d */
    static final class C63289d extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63285l f143660a;

        static {
            Covode.recordClassIndex(74566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63289d(C63285l lVar) {
            super(1);
            this.f143660a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            C89219l.m154721d(bitmap2, "");
            if (Build.VERSION.SDK_INT >= 21) {
                C69908cb cbVar = this.f143660a.f143648b;
                cbVar.f156219g.mo110116a();
                cbVar.mo110322d();
                ImageView imageView = cbVar.f156216d;
                if (imageView == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                imageView.setAlpha(0.0f);
                ImageView imageView2 = cbVar.f156216d;
                if (imageView2 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                imageView2.setTranslationX((float) C34728n.m70946a(15.0d));
                ImageView imageView3 = cbVar.f156216d;
                if (imageView3 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                imageView3.setTranslationY((float) C34728n.m70946a(15.0d));
                C74330z zVar = new C74330z();
                ImageView imageView4 = cbVar.f156216d;
                if (imageView4 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                zVar.mo116957a(new C69908cb.C69915g(cbVar, zVar, imageView4.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300).withEndAction(new C69908cb.RunnableC69916h(cbVar, zVar))));
                cbVar.f156219g.mo110117a(zVar);
            }
            this.f143660a.f143647a.mo110330b(bitmap2);
            this.f143660a.f143647a.mo110331c(null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.port.internal.l$g */
    public static final class C63292g extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63285l f143663a;

        static {
            Covode.recordClassIndex(74569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63292g(C63285l lVar) {
            super(1);
            this.f143663a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            final Bitmap bitmap2 = bitmap;
            C89219l.m154721d(bitmap2, "");
            if (Build.VERSION.SDK_INT >= 21) {
                C69908cb cbVar = this.f143663a.f143648b;
                C632931 r6 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.port.internal.C63285l.C63292g.C632931 */

                    /* renamed from: a */
                    final /* synthetic */ C63292g f143664a;

                    static {
                        Covode.recordClassIndex(74570);
                    }

                    {
                        this.f143664a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f143664a.f143663a.f143647a.mo110329a(bitmap2);
                        this.f143664a.f143663a.f143647a.mo110330b(null);
                        this.f143664a.f143663a.f143647a.mo110331c(null);
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(r6, "");
                cbVar.f156219g.mo110116a();
                cbVar.mo110322d();
                ImageView imageView = cbVar.f156215c;
                if (imageView == null) {
                    C89219l.m154710a("mBGCoverFirst");
                }
                float x = imageView.getX();
                ImageView imageView2 = cbVar.f156216d;
                if (imageView2 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                float x2 = x - imageView2.getX();
                ImageView imageView3 = cbVar.f156215c;
                if (imageView3 == null) {
                    C89219l.m154710a("mBGCoverFirst");
                }
                float y = imageView3.getY();
                ImageView imageView4 = cbVar.f156216d;
                if (imageView4 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                float y2 = y - imageView4.getY();
                C74330z zVar = new C74330z();
                ImageView imageView5 = cbVar.f156215c;
                if (imageView5 == null) {
                    C89219l.m154710a("mBGCoverFirst");
                }
                ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                ImageView imageView6 = cbVar.f156215c;
                if (imageView6 == null) {
                    C89219l.m154710a("mBGCoverFirst");
                }
                ViewPropertyAnimator duration = alpha.translationY(((float) ((-imageView6.getHeight()) * 2)) / 3.0f).setDuration(300);
                ImageView imageView7 = cbVar.f156216d;
                if (imageView7 == null) {
                    C89219l.m154710a("mBGCoverSecond");
                }
                zVar.mo116957a(new C69908cb.C69917i(cbVar, zVar, duration, imageView7.animate().translationX(x2).translationY(y2).setDuration(300).withEndAction(new C69908cb.RunnableC69918j(cbVar, zVar, r6))));
                cbVar.f156219g.mo110117a(zVar);
            } else {
                this.f143663a.f143647a.mo110329a(bitmap2);
                this.f143663a.f143647a.mo110330b(null);
                this.f143663a.f143647a.mo110331c(null);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo101872a(C72678q qVar, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        C1731i.m5640b(new CallableC63287b(this, qVar), C1731i.f5562a).mo5534a(new C63288c(bVar), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onProgressUpdate(int i, boolean z) {
        int i2 = this.f143651e;
        if (i < i2) {
            this.f143647a.mo110328a(i2);
            return;
        }
        this.f143647a.mo110328a(i);
        this.f143650d = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x
    public final void onSuccess(C69831ai aiVar, boolean z) {
        C73991bj.m130133d("PublishParallel ParallelPublishForUICallback " + this.f143654h + " onSuccess");
        m114780b();
    }

    public C63285l(C69908cb cbVar, AbstractC72630h hVar, IAVPublishService.OnPublishCallback onPublishCallback, String str, C72678q qVar) {
        C89219l.m154721d(cbVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(onPublishCallback, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(qVar, "");
        this.f143648b = cbVar;
        this.f143652f = hVar;
        this.f143653g = onPublishCallback;
        this.f143654h = str;
        this.f143655i = qVar;
        C69921cc ccVar = cbVar.f156220h;
        this.f143647a = ccVar;
        C73991bj.m130133d("PublishParallel ParallelPublishForUICallback " + str + " created");
        if (C89219l.m154714a((Object) mo101871a().getCurrentPublishTaskId(), (Object) str)) {
            m114781c();
            return;
        }
        this.f143651e = 5;
        List<C72678q> allPublishModel = mo101871a().getAllPublishModel();
        if (allPublishModel.size() >= 2 && ccVar.f156250d.getValue() == null) {
            C72678q qVar2 = allPublishModel.get(1);
            C89219l.m154716b(qVar2, "");
            mo101872a(qVar2, new C63289d(this));
        }
    }
}
