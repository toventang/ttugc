package com.p2082ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.lottie.AbstractC2038c;
import com.airbnb.lottie.AbstractC2186i;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2108f;
import com.airbnb.lottie.C2152h;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.pendant.g */
public final class C62780g extends AbstractC62753a implements AbstractC62770d {

    /* renamed from: A */
    private int f142318A = Integer.MAX_VALUE;

    /* renamed from: B */
    private int f142319B;

    /* renamed from: C */
    private int f142320C;

    /* renamed from: D */
    private int f142321D;

    /* renamed from: E */
    private int f142322E = Integer.MAX_VALUE;

    /* renamed from: F */
    private int f142323F;

    /* renamed from: G */
    private int f142324G = Integer.MAX_VALUE;

    /* renamed from: H */
    private int f142325H;

    /* renamed from: I */
    private int f142326I = Integer.MAX_VALUE;

    /* renamed from: J */
    private final String f142327J;

    /* renamed from: u */
    public boolean f142328u;

    /* renamed from: v */
    public final LottieAnimationView f142329v;

    /* renamed from: w */
    public final LottieAnimationView f142330w;

    /* renamed from: x */
    private int f142331x;

    /* renamed from: y */
    private int f142332y;

    /* renamed from: z */
    private int f142333z;

    static {
        Covode.recordClassIndex(73603);
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62753a
    /* renamed from: c */
    public final void mo100717c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62770d
    public final boolean getTimeLimitState() {
        return this.f142328u;
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62753a
    /* renamed from: a */
    public final void mo100713a() {
        super.mo100713a();
        if (this.f142252j) {
            if (this.f142329v.getVisibility() == 0) {
                if (!this.f142251i) {
                    if (this.f142328u) {
                        mo100760c(true);
                    } else {
                        mo100759b(true);
                    }
                }
                if (!this.f142329v.f5900b.mo6025g()) {
                    this.f142329v.mo5826a();
                }
            }
            if (this.f142330w.getVisibility() == 0) {
                if (!this.f142251i) {
                    if (this.f142328u) {
                        mo100760c(false);
                    } else {
                        mo100759b(false);
                    }
                }
                if (!this.f142330w.f5900b.mo6025g()) {
                    this.f142330w.mo5826a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.g$d */
    public static final class C62786d implements AbstractC2038c {

        /* renamed from: a */
        final /* synthetic */ String f142346a;

        static {
            Covode.recordClassIndex(73609);
        }

        C62786d(String str) {
            this.f142346a = str;
        }

        @Override // com.airbnb.lottie.AbstractC2038c
        /* renamed from: a */
        public final Bitmap mo5937a(C2152h hVar) {
            MethodCollector.m26663i(8340);
            Bitmap bitmap = null;
            if (hVar != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = C13628n.m24524d(C17867d.m33078a());
                try {
                    bitmap = BitmapFactory.decodeFile(this.f142346a + File.separator + hVar.f6512d, options);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MethodCollector.m26664o(8340);
                return bitmap;
            }
            MethodCollector.m26664o(8340);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.g$b */
    public static final class C62782b implements AbstractC88986z<String> {

        /* renamed from: a */
        final /* synthetic */ C62780g f142335a;

        /* renamed from: b */
        final /* synthetic */ InputStream f142336b;

        /* renamed from: c */
        final /* synthetic */ InputStream f142337c;

        static {
            Covode.recordClassIndex(73605);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            try {
                this.f142336b.close();
                this.f142337c.close();
            } catch (Exception unused) {
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(String str) {
            C89219l.m154721d(str, "");
            if (this.f142335a.f142261s.f142371i) {
                List<Integer> list = this.f142335a.f142261s.f142368f;
                if (list != null && (!list.isEmpty())) {
                    if (this.f142335a.f142328u) {
                        this.f142335a.mo100760c(true);
                    } else {
                        this.f142335a.mo100759b(true);
                    }
                }
                List<Integer> list2 = this.f142335a.f142261s.f142369g;
                if (list2 != null && (!list2.isEmpty())) {
                    if (this.f142335a.f142328u) {
                        this.f142335a.mo100760c(false);
                    } else {
                        this.f142335a.mo100759b(false);
                    }
                }
            }
            this.f142335a.f142329v.mo5826a();
            this.f142335a.f142330w.mo5826a();
            this.f142335a.f142252j = true;
            AbstractC89171a<C89391z> aVar = this.f142335a.f142261s.f142367e;
            if (aVar != null) {
                aVar.invoke();
            }
            try {
                this.f142336b.close();
                this.f142337c.close();
            } catch (Exception unused) {
            }
        }

        C62782b(C62780g gVar, InputStream inputStream, InputStream inputStream2) {
            this.f142335a = gVar;
            this.f142336b = inputStream;
            this.f142337c = inputStream2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.g$c */
    static final class C62783c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62780g f142338a;

        /* renamed from: b */
        final /* synthetic */ C62786d f142339b;

        /* renamed from: c */
        final /* synthetic */ InputStream f142340c;

        static {
            Covode.recordClassIndex(73606);
        }

        C62783c(C62780g gVar, C62786d dVar, InputStream inputStream) {
            this.f142338a = gVar;
            this.f142339b = dVar;
            this.f142340c = inputStream;
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.g$c$a */
        static final class C62784a<T> implements AbstractC2186i {

            /* renamed from: a */
            final /* synthetic */ LottieAnimationView f142341a;

            /* renamed from: b */
            final /* synthetic */ C62783c f142342b;

            /* renamed from: c */
            final /* synthetic */ AbstractC88982v f142343c;

            static {
                Covode.recordClassIndex(73607);
            }

            C62784a(LottieAnimationView lottieAnimationView, C62783c cVar, AbstractC88982v vVar) {
                this.f142341a = lottieAnimationView;
                this.f142342b = cVar;
                this.f142343c = vVar;
            }

            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* synthetic */ void mo5889a(Object obj) {
                this.f142341a.setComposition((C2044e) obj);
                AbstractC88982v vVar = this.f142343c;
                C89219l.m154716b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f142343c.mo143031a((Object) "0");
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.g$c$b */
        static final class C62785b<T> implements AbstractC2186i {

            /* renamed from: a */
            final /* synthetic */ C62783c f142344a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f142345b;

            static {
                Covode.recordClassIndex(73608);
            }

            C62785b(C62783c cVar, AbstractC88982v vVar) {
                this.f142344a = cVar;
                this.f142345b = vVar;
            }

            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* synthetic */ void mo5889a(Object obj) {
                Throwable th = (Throwable) obj;
                AbstractC88982v vVar = this.f142345b;
                C89219l.m154716b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f142345b.mo143024a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            LottieAnimationView lottieAnimationView = this.f142338a.f142329v;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f142339b);
            C2108f.m6593a(this.f142340c, "bigLottie").mo6130a((AbstractC2186i<C2044e>) new C62784a(lottieAnimationView, this, vVar)).mo6136c(new C62785b(this, vVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.g$e */
    static final class C62787e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C62780g f142347a;

        /* renamed from: b */
        final /* synthetic */ C62786d f142348b;

        /* renamed from: c */
        final /* synthetic */ InputStream f142349c;

        static {
            Covode.recordClassIndex(73610);
        }

        C62787e(C62780g gVar, C62786d dVar, InputStream inputStream) {
            this.f142347a = gVar;
            this.f142348b = dVar;
            this.f142349c = inputStream;
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.g$e$a */
        static final class C62788a<T> implements AbstractC2186i {

            /* renamed from: a */
            final /* synthetic */ LottieAnimationView f142350a;

            /* renamed from: b */
            final /* synthetic */ C62787e f142351b;

            /* renamed from: c */
            final /* synthetic */ AbstractC88982v f142352c;

            static {
                Covode.recordClassIndex(73611);
            }

            C62788a(LottieAnimationView lottieAnimationView, C62787e eVar, AbstractC88982v vVar) {
                this.f142350a = lottieAnimationView;
                this.f142351b = eVar;
                this.f142352c = vVar;
            }

            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* synthetic */ void mo5889a(Object obj) {
                this.f142350a.setComposition((C2044e) obj);
                AbstractC88982v vVar = this.f142352c;
                C89219l.m154716b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f142352c.mo143031a((Object) "1");
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.pendant.g$e$b */
        static final class C62789b<T> implements AbstractC2186i {

            /* renamed from: a */
            final /* synthetic */ C62787e f142353a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f142354b;

            static {
                Covode.recordClassIndex(73612);
            }

            C62789b(C62787e eVar, AbstractC88982v vVar) {
                this.f142353a = eVar;
                this.f142354b = vVar;
            }

            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* synthetic */ void mo5889a(Object obj) {
                Throwable th = (Throwable) obj;
                AbstractC88982v vVar = this.f142354b;
                C89219l.m154716b(vVar, "");
                if (!vVar.isDisposed()) {
                    this.f142354b.mo143024a(th);
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            LottieAnimationView lottieAnimationView = this.f142347a.f142330w;
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setRepeatMode(1);
            lottieAnimationView.setImageAssetDelegate(this.f142348b);
            C2108f.m6593a(this.f142349c, "smallLottie").mo6130a((AbstractC2186i<C2044e>) new C62788a(lottieAnimationView, this, vVar)).mo6136c(new C62789b(this, vVar));
        }
    }

    /* renamed from: b */
    public final void mo100759b(boolean z) {
        LottieAnimationView lottieAnimationView;
        int i;
        int i2;
        if (z) {
            lottieAnimationView = this.f142329v;
            i = this.f142333z;
            i2 = this.f142318A;
        } else {
            lottieAnimationView = this.f142330w;
            i = this.f142321D;
            i2 = this.f142322E;
        }
        lottieAnimationView.mo5827a(i, i2);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
    }

    /* renamed from: c */
    public final void mo100760c(boolean z) {
        LottieAnimationView lottieAnimationView;
        int i;
        int i2;
        if (z) {
            lottieAnimationView = this.f142329v;
            i = this.f142323F;
            i2 = this.f142324G;
        } else {
            lottieAnimationView = this.f142330w;
            i = this.f142325H;
            i2 = this.f142326I;
        }
        lottieAnimationView.mo5827a(i, i2);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62770d
    public final void setTimeLimitState(boolean z) {
        if (this.f142328u != z) {
            this.f142328u = z;
            if (this.f142261s.f142371i) {
                if (this.f142328u) {
                    mo100760c(!this.f142250h);
                    mo100760c(this.f142250h);
                } else {
                    mo100759b(!this.f142250h);
                    mo100759b(this.f142250h);
                }
                if (this.f142329v.getVisibility() == 0) {
                    this.f142329v.mo5826a();
                }
                if (this.f142330w.getVisibility() == 0) {
                    this.f142330w.mo5826a();
                }
            }
            if (this.f142250h && z) {
                mo100714a((AbstractC89171a<C89391z>) null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public final void mo100758a(C62802k kVar) {
        C89219l.m154721d(kVar, "");
        InputStream inputStream = kVar.f142398a;
        InputStream inputStream2 = kVar.f142399b;
        String str = kVar.f142400c;
        if (inputStream != null && inputStream2 != null && str != null && !TextUtils.isEmpty(str)) {
            C62786d dVar = new C62786d(str);
            AbstractC88979t a = AbstractC88979t.m154294a(new C62783c(this, dVar, inputStream));
            C89219l.m154716b(a, "");
            AbstractC88979t a2 = AbstractC88979t.m154294a(new C62787e(this, dVar, inputStream2));
            C89219l.m154716b(a2, "");
            AbstractC88979t.m154296a(a, a2, C62781a.f142334a).mo143062b((AbstractC88986z) new C62782b(this, inputStream2, inputStream));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.g$a */
    static final class C62781a<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C62781a f142334a = new C62781a();

        static {
            Covode.recordClassIndex(73604);
        }

        C62781a() {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62780g(Context context, View view, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, View view2, RelativeLayout relativeLayout, C62795i iVar) {
        super(context, view, lottieAnimationView, lottieAnimationView2, view2, relativeLayout, iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(lottieAnimationView, "");
        C89219l.m154721d(lottieAnimationView2, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(relativeLayout, "");
        C89219l.m154721d(iVar, "");
        this.f142329v = lottieAnimationView;
        this.f142330w = lottieAnimationView2;
        if (iVar.f142371i) {
            if (iVar.f142368f != null && iVar.f142368f.size() == 4) {
                List<Integer> list = iVar.f142368f;
                this.f142333z = list.get(0).intValue();
                this.f142318A = list.get(1).intValue() - 1;
                this.f142331x = list.get(1).intValue();
                this.f142332y = list.get(2).intValue() - 1;
                this.f142323F = list.get(2).intValue();
                this.f142324G = list.get(3).intValue() - 1;
            }
            if (iVar.f142369g != null && iVar.f142369g.size() == 3) {
                List<Integer> list2 = iVar.f142369g;
                this.f142321D = list2.get(0).intValue();
                int intValue = list2.get(1).intValue() - 1;
                this.f142322E = intValue;
                this.f142319B = this.f142321D;
                this.f142320C = intValue;
                this.f142325H = list2.get(1).intValue();
                this.f142326I = list2.get(2).intValue() - 1;
            }
        }
        this.f142327J = "newpendant";
    }
}
