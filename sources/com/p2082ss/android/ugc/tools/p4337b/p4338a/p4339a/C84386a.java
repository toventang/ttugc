package com.p2082ss.android.ugc.tools.p4337b.p4338a.p4339a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.ugc.effectplatform.model.net.QueryInfoStickerResponse;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.b.a.a.a */
public final class C84386a {

    /* renamed from: a */
    public static final EffectChannelResponse f188661a = new EffectChannelResponse(null, 1, null);

    /* renamed from: b */
    public static final EffectCategoryResponse f188662b = new EffectCategoryResponse(new com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse("", "", "", null, null, null, null, C89086z.INSTANCE, C89086z.INSTANCE, "", null, false, null, 7288, null));

    /* renamed from: c */
    private static final QueryInfoStickerResponse f188663c = new QueryInfoStickerResponse(null, null, 0, 7, null);

    static {
        Covode.recordClassIndex(98351);
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$d */
    public static final class C84390d implements ICheckChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188688a;

        /* renamed from: b */
        final /* synthetic */ String f188689b;

        /* renamed from: c */
        final /* synthetic */ IFetchEffectChannelListener f188690c;

        /* renamed from: d */
        final /* synthetic */ boolean f188691d = false;

        static {
            Covode.recordClassIndex(98355);
        }

        /* renamed from: com.ss.android.ugc.tools.b.a.a.a$d$a */
        public static final class C84391a implements IFetchEffectChannelListener {

            /* renamed from: a */
            final /* synthetic */ C84390d f188692a;

            static {
                Covode.recordClassIndex(98356);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C84391a(C84390d dVar) {
                this.f188692a = dVar;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
                this.f188692a.f188688a.mo78910a(this.f188692a.f188689b, false, this.f188692a.f188691d, this.f188692a.f188690c);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C89219l.m154721d(effectChannelResponse2, "");
                if (effectChannelResponse2.getAllCategoryEffects().size() == 0) {
                    this.f188692a.f188688a.mo78910a(this.f188692a.f188689b, false, this.f188692a.f188691d, this.f188692a.f188690c);
                    return;
                }
                this.f188692a.f188690c.onSuccess(effectChannelResponse2);
            }
        }

        /* renamed from: com.ss.android.ugc.tools.b.a.a.a$d$b */
        public static final class C84392b implements IFetchEffectChannelListener {

            /* renamed from: a */
            final /* synthetic */ C84390d f188693a;

            static {
                Covode.recordClassIndex(98357);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C84392b(C84390d dVar) {
                this.f188693a = dVar;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C89219l.m154721d(exceptionResult, "");
                this.f188693a.f188688a.mo78910a(this.f188693a.f188689b, false, this.f188693a.f188691d, this.f188693a.f188690c);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C89219l.m154721d(effectChannelResponse2, "");
                if (effectChannelResponse2.getAllCategoryEffects().isEmpty()) {
                    this.f188693a.f188688a.mo78910a(this.f188693a.f188689b, false, this.f188693a.f188691d, this.f188693a.f188690c);
                    return;
                }
                this.f188693a.f188690c.onSuccess(effectChannelResponse2);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f188688a.mo78910a(this.f188689b, true, this.f188691d, (IFetchEffectChannelListener) new C84391a(this));
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            if (z) {
                this.f188688a.mo78910a(this.f188689b, false, this.f188691d, this.f188690c);
                return;
            }
            this.f188688a.mo78910a(this.f188689b, true, this.f188691d, (IFetchEffectChannelListener) new C84392b(this));
        }

        C84390d(AbstractC84398d dVar, String str, IFetchEffectChannelListener iFetchEffectChannelListener, boolean z) {
            this.f188688a = dVar;
            this.f188689b = str;
            this.f188690c = iFetchEffectChannelListener;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$b */
    public static final class C84388b implements IFetchCategoryEffectListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188672a;

        /* renamed from: b */
        final /* synthetic */ IFetchCategoryEffectListener f188673b;

        /* renamed from: c */
        final /* synthetic */ String f188674c;

        /* renamed from: d */
        final /* synthetic */ String f188675d;

        /* renamed from: e */
        final /* synthetic */ int f188676e;

        /* renamed from: f */
        final /* synthetic */ int f188677f;

        /* renamed from: g */
        final /* synthetic */ int f188678g;

        /* renamed from: h */
        final /* synthetic */ String f188679h;

        static {
            Covode.recordClassIndex(98353);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
            this.f188673b.onSuccess(categoryPageModel);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f188672a.mo78894a(this.f188674c, this.f188675d, this.f188676e, this.f188677f, this.f188678g, this.f188679h, false, this.f188673b);
        }

        C84388b(AbstractC84398d dVar, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, int i, int i2, int i3, String str3) {
            this.f188672a = dVar;
            this.f188673b = iFetchCategoryEffectListener;
            this.f188674c = str;
            this.f188675d = str2;
            this.f188676e = i;
            this.f188677f = i2;
            this.f188678g = i3;
            this.f188679h = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$e */
    public static final class C84393e implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188694a;

        /* renamed from: b */
        final /* synthetic */ IFetchEffectChannelListener f188695b;

        /* renamed from: c */
        final /* synthetic */ String f188696c;

        /* renamed from: d */
        final /* synthetic */ boolean f188697d = false;

        static {
            Covode.recordClassIndex(98358);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            this.f188695b.onSuccess(effectChannelResponse);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f188694a.mo78910a(this.f188696c, true, this.f188697d, this.f188695b);
        }

        public C84393e(AbstractC84398d dVar, IFetchEffectChannelListener iFetchEffectChannelListener, String str) {
            this.f188694a = dVar;
            this.f188695b = iFetchEffectChannelListener;
            this.f188696c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$g */
    public static final class C84395g implements IFetchPanelInfoListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188705a;

        /* renamed from: b */
        final /* synthetic */ IFetchPanelInfoListener f188706b;

        /* renamed from: c */
        final /* synthetic */ String f188707c;

        /* renamed from: d */
        final /* synthetic */ boolean f188708d;

        /* renamed from: e */
        final /* synthetic */ String f188709e;

        /* renamed from: f */
        final /* synthetic */ int f188710f;

        /* renamed from: g */
        final /* synthetic */ int f188711g;

        static {
            Covode.recordClassIndex(98360);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
            C89219l.m154721d(panelInfoModel, "");
            this.f188706b.onSuccess(panelInfoModel);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f188705a.mo78909a(this.f188707c, this.f188708d, this.f188709e, this.f188710f, this.f188711g, false, this.f188706b);
        }

        C84395g(AbstractC84398d dVar, IFetchPanelInfoListener iFetchPanelInfoListener, String str, boolean z, String str2, int i, int i2) {
            this.f188705a = dVar;
            this.f188706b = iFetchPanelInfoListener;
            this.f188707c = str;
            this.f188708d = z;
            this.f188709e = str2;
            this.f188710f = i;
            this.f188711g = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$a */
    public static final class C84387a implements ICheckChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188664a;

        /* renamed from: b */
        final /* synthetic */ String f188665b;

        /* renamed from: c */
        final /* synthetic */ String f188666c;

        /* renamed from: d */
        final /* synthetic */ int f188667d;

        /* renamed from: e */
        final /* synthetic */ int f188668e;

        /* renamed from: f */
        final /* synthetic */ int f188669f;

        /* renamed from: g */
        final /* synthetic */ String f188670g;

        /* renamed from: h */
        final /* synthetic */ IFetchCategoryEffectListener f188671h;

        static {
            Covode.recordClassIndex(98352);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            C84386a.m145137a(this.f188664a, this.f188665b, this.f188666c, true, this.f188667d, this.f188668e, this.f188669f, this.f188670g, this.f188671h);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            C84386a.m145137a(this.f188664a, this.f188665b, this.f188666c, !z, this.f188667d, this.f188668e, this.f188669f, this.f188670g, this.f188671h);
        }

        public C84387a(AbstractC84398d dVar, String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            this.f188664a = dVar;
            this.f188665b = str;
            this.f188666c = str2;
            this.f188667d = i;
            this.f188668e = i2;
            this.f188669f = i3;
            this.f188670g = str3;
            this.f188671h = iFetchCategoryEffectListener;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$c */
    public static final class C84389c implements ICheckChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188680a;

        /* renamed from: b */
        final /* synthetic */ String f188681b;

        /* renamed from: c */
        final /* synthetic */ String f188682c;

        /* renamed from: d */
        final /* synthetic */ int f188683d;

        /* renamed from: e */
        final /* synthetic */ int f188684e;

        /* renamed from: f */
        final /* synthetic */ int f188685f;

        /* renamed from: g */
        final /* synthetic */ String f188686g;

        /* renamed from: h */
        final /* synthetic */ IFetchCategoryEffectListener f188687h;

        static {
            Covode.recordClassIndex(98354);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            this.f188680a.mo78894a(this.f188681b, this.f188682c, this.f188683d, this.f188684e, this.f188685f, this.f188686g, true, this.f188687h);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            C84386a.m145137a(this.f188680a, this.f188681b, this.f188682c, !z, this.f188683d, this.f188684e, this.f188685f, this.f188686g, this.f188687h);
        }

        public C84389c(AbstractC84398d dVar, String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            this.f188680a = dVar;
            this.f188681b = str;
            this.f188682c = str2;
            this.f188683d = i;
            this.f188684e = i2;
            this.f188685f = i3;
            this.f188686g = str3;
            this.f188687h = iFetchCategoryEffectListener;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.b.a.a.a$f */
    public static final class C84394f implements ICheckChannelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f188698a;

        /* renamed from: b */
        final /* synthetic */ String f188699b;

        /* renamed from: c */
        final /* synthetic */ boolean f188700c;

        /* renamed from: d */
        final /* synthetic */ String f188701d;

        /* renamed from: e */
        final /* synthetic */ int f188702e;

        /* renamed from: f */
        final /* synthetic */ int f188703f;

        /* renamed from: g */
        final /* synthetic */ IFetchPanelInfoListener f188704g;

        static {
            Covode.recordClassIndex(98359);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelFailed(ExceptionResult exceptionResult) {
            this.f188698a.mo78909a(this.f188699b, this.f188700c, this.f188701d, this.f188702e, this.f188703f, true, this.f188704g);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
        public final void checkChannelSuccess(boolean z) {
            IFetchPanelInfoListener iFetchPanelInfoListener;
            AbstractC84398d dVar = this.f188698a;
            String str = this.f188699b;
            boolean z2 = this.f188700c;
            String str2 = this.f188701d;
            int i = this.f188702e;
            int i2 = this.f188703f;
            boolean z3 = !z;
            IFetchPanelInfoListener iFetchPanelInfoListener2 = this.f188704g;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchPanelInfoListener2, "");
            if (z3) {
                iFetchPanelInfoListener = new C84395g(dVar, iFetchPanelInfoListener2, str, z2, str2, i, i2);
            } else {
                iFetchPanelInfoListener = iFetchPanelInfoListener2;
            }
            dVar.mo78909a(str, z2, str2, i, i2, z3, iFetchPanelInfoListener);
        }

        C84394f(AbstractC84398d dVar, String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            this.f188698a = dVar;
            this.f188699b = str;
            this.f188700c = z;
            this.f188701d = str2;
            this.f188702e = i;
            this.f188703f = i2;
            this.f188704g = iFetchPanelInfoListener;
        }
    }

    /* renamed from: a */
    public static final Exception m145135a(ExceptionResult exceptionResult) {
        Exception exc;
        String str;
        if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
            StringBuilder sb = new StringBuilder("Failed on fetch from effect platform, msg: ");
            Integer num = null;
            if (exceptionResult != null) {
                str = exceptionResult.getMsg();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append(", code: ");
            if (exceptionResult != null) {
                num = Integer.valueOf(exceptionResult.getErrorCode());
            }
            exc = new RuntimeException(append.append(num).toString());
        }
        return exc;
    }

    /* renamed from: a */
    public static final void m145136a(AbstractC84398d dVar, String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iFetchEffectChannelListener, "");
        dVar.mo78896a(str, null, AbstractC84398d.C84399a.f188713a, new C84390d(dVar, str, iFetchEffectChannelListener, false), null);
    }

    /* renamed from: a */
    public static final void m145138a(AbstractC84398d dVar, String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iFetchPanelInfoListener, "");
        dVar.mo78896a(str, str2, AbstractC84398d.C84399a.f188715c, new C84394f(dVar, str, z, str2, i, i2, iFetchPanelInfoListener), null);
    }

    /* renamed from: a */
    public static final void m145137a(AbstractC84398d dVar, String str, String str2, boolean z, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        IFetchCategoryEffectListener iFetchCategoryEffectListener2;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iFetchCategoryEffectListener, "");
        if (z) {
            iFetchCategoryEffectListener2 = new C84388b(dVar, iFetchCategoryEffectListener, str, str2, i, i2, i3, str3);
        } else {
            iFetchCategoryEffectListener2 = iFetchCategoryEffectListener;
        }
        dVar.mo78894a(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener2);
    }
}
