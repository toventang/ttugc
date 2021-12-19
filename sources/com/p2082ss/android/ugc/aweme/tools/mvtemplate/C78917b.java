package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.p1559o.C21582f;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73924x;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78973n;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.DialogInterface$OnClickListenerC78952f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.DialogInterface$OnClickListenerC78953g;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f.C78957b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a;
import com.p2082ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.b */
public final class C78917b implements AbstractC35318a, AbstractC78969l {

    /* renamed from: a */
    ActivityC0945e f177389a;

    /* renamed from: b */
    MvTemplateView f177390b;

    /* renamed from: c */
    AbstractC46415f f177391c;

    /* renamed from: d */
    Effect f177392d;

    /* renamed from: e */
    ShortVideoContext f177393e;

    /* renamed from: f */
    public String f177394f;

    /* renamed from: g */
    String f177395g;

    /* renamed from: h */
    int f177396h;

    /* renamed from: i */
    String f177397i = "";

    /* renamed from: j */
    String f177398j;

    /* renamed from: k */
    public int f177399k;

    /* renamed from: l */
    public int f177400l;

    /* renamed from: m */
    public String f177401m;

    /* renamed from: n */
    public boolean f177402n = true;

    /* renamed from: o */
    boolean f177403o;

    /* renamed from: p */
    public boolean f177404p;

    /* renamed from: q */
    public volatile boolean f177405q;

    /* renamed from: r */
    private C21582f f177406r;

    /* renamed from: s */
    private ViewStubCompat f177407s;

    /* renamed from: t */
    private boolean f177408t;

    /* renamed from: u */
    private final int f177409u = 20;

    /* renamed from: v */
    private boolean f177410v = true;

    /* renamed from: w */
    private boolean f177411w;

    static {
        Covode.recordClassIndex(92066);
    }

    /* renamed from: m */
    private static boolean m137708m() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: n */
    private void m137709n() {
        if (this.f177403o) {
            mo122734j();
        } else {
            m137710o();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
    /* renamed from: a */
    public final void mo62175a() {
        MvTemplateView mvTemplateView = this.f177390b;
        if (mvTemplateView != null && mvTemplateView.getVisibility() == 0) {
            this.f177390b.mo122652d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
    /* renamed from: c */
    public final void mo62178c() {
        if (mo122732g()) {
            this.f177390b.mo122654e();
        }
    }

    /* renamed from: k */
    public final void mo122735k() {
        this.f177391c.mo78892a("mv", new IFetchEffectChannelListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.C789225 */

            static {
                Covode.recordClassIndex(92071);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C78917b bVar = C78917b.this;
                bVar.mo122728a(bVar.f177394f);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C78917b bVar = C78917b.this;
                if (!(effectChannelResponse2 == null || C84904k.m145909a(effectChannelResponse2.getAllCategoryEffects()))) {
                    ArrayList arrayList = new ArrayList();
                    for (Effect effect : effectChannelResponse2.getAllCategoryEffects()) {
                        MvThemeData mvThemeData = new MvThemeData();
                        mvThemeData.mo122666a(effect);
                        mvThemeData.f177185b = effectChannelResponse2.getUrlPrefix();
                        arrayList.add(mvThemeData);
                    }
                    if (arrayList.size() > 0) {
                        if (bVar.f177392d != null && !TextUtils.isEmpty(bVar.f177392d.getEffectId())) {
                            MvThemeData mvThemeData2 = new MvThemeData();
                            mvThemeData2.mo122666a(bVar.f177392d);
                            mvThemeData2.f177185b = effectChannelResponse2.getUrlPrefix();
                            arrayList.add(0, mvThemeData2);
                            int i = 1;
                            while (true) {
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (bVar.f177392d.getEffectId().equals(((MvThemeData) arrayList.get(i)).mo122665a())) {
                                    arrayList.remove(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        if (bVar.mo122732g()) {
                            bVar.f177390b.mo122648a(arrayList);
                            bVar.f177390b.mo122645a();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: h */
    public static boolean m137707h() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean m = m137708m();
        C58029j.f132253e = m;
        return m;
    }

    /* renamed from: o */
    private void m137710o() {
        ActivityC0945e eVar = this.f177389a;
        if (eVar != null && !eVar.isFinishing()) {
            mo122733i();
            this.f177391c.mo78908a("mv", true, "all", 0, 0, (IFetchPanelInfoListener) new IFetchPanelInfoListener() {
                /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.C789203 */

                static {
                    Covode.recordClassIndex(92069);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C78917b.this.mo122735k();
                    if (exceptionResult == null) {
                        C78917b.m137706a(false, 1, (Exception) null);
                    } else {
                        C78917b.m137706a(false, exceptionResult.getErrorCode(), exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    PanelInfoModel panelInfoModel2 = panelInfoModel;
                    C78917b bVar = C78917b.this;
                    if (!(panelInfoModel2 == null || panelInfoModel2.getCategoryEffectModel() == null || C84904k.m145909a(panelInfoModel2.getCategoryEffectModel().getEffects()))) {
                        ArrayList arrayList = new ArrayList();
                        for (Effect effect : panelInfoModel2.getCategoryEffectModel().getEffects()) {
                            MvThemeData mvThemeData = new MvThemeData();
                            mvThemeData.mo122666a(effect);
                            mvThemeData.f177185b = panelInfoModel2.getUrlPrefix();
                            arrayList.add(mvThemeData);
                        }
                        if (arrayList.size() > 0) {
                            if (bVar.f177392d != null && !TextUtils.isEmpty(bVar.f177392d.getEffectId())) {
                                MvThemeData mvThemeData2 = new MvThemeData();
                                mvThemeData2.mo122666a(bVar.f177392d);
                                mvThemeData2.f177185b = panelInfoModel2.getUrlPrefix();
                                arrayList.add(0, mvThemeData2);
                                int i = 1;
                                while (true) {
                                    if (i >= arrayList.size()) {
                                        break;
                                    } else if (bVar.f177392d.getEffectId().equals(((MvThemeData) arrayList.get(i)).mo122665a())) {
                                        arrayList.remove(i);
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            if (bVar.mo122732g()) {
                                bVar.f177390b.mo122648a(arrayList);
                                bVar.f177390b.mo122645a();
                            }
                            C78917b.m137706a(true, 0, (Exception) null);
                        }
                    }
                    C78917b.this.mo122735k();
                    C78917b.m137706a(true, 0, (Exception) null);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
    /* renamed from: d */
    public final void mo62179d() {
        if (this.f177390b != null) {
            EventBus.m156962a().mo145395b(this.f177390b);
            this.f177390b.f177170w.release();
        }
        AbstractC46415f fVar = this.f177391c;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo122733i() {
        if (this.f177391c == null) {
            this.f177391c = EffectService.getInstance().createMvEffectPlatform(this.f177389a.getApplication());
        }
    }

    /* renamed from: l */
    public final void mo122736l() {
        this.f177405q = true;
        this.f177391c.mo78902a("mv", "all", true, 20, this.f177399k, this.f177400l, this.f177401m, (IFetchCategoryEffectListener) new IFetchCategoryEffectListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.C789236 */

            static {
                Covode.recordClassIndex(92072);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                C78917b bVar = C78917b.this;
                bVar.mo122728a(bVar.f177394f);
                if (C78917b.this.f177405q) {
                    C78917b.this.f177405q = false;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (TextUtils.isEmpty(C78917b.this.f177401m)) {
                    C78917b.this.f177401m = categoryPageModel2.getCategoryEffects().getVersion();
                }
                C78917b.this.f177399k = categoryPageModel2.getCategoryEffects().getCursor();
                C78917b.this.f177400l = categoryPageModel2.getCategoryEffects().getSortingPosition();
                C78917b.this.f177402n = categoryPageModel2.getCategoryEffects().hasMore();
                if (C78917b.this.mo122730a(categoryPageModel2)) {
                    C78917b.this.f177404p = true;
                }
                if (C78917b.this.f177405q) {
                    C78917b.this.f177405q = false;
                }
            }
        });
    }

    /* renamed from: p */
    private C84425b m137711p() {
        C84425b a = new C84425b().mo129406a("shoot_way", this.f177398j).mo129406a("enter_from", "video_shoot_page").mo129406a("content_type", "mv").mo129406a("creation_id", this.f177395g);
        int i = this.f177396h;
        if (i != 0) {
            a.mo129403a("draft_id", i);
        }
        if (!TextUtils.isEmpty(this.f177397i)) {
            a.mo129406a("new_draft_id", this.f177397i);
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
    /* renamed from: b */
    public final void mo62177b() {
        if (mo122732g()) {
            MvTemplateView mvTemplateView = this.f177390b;
            C78957b a = mvTemplateView.mo122644a(mvTemplateView.f177155h);
            if (a != null && a.f177456e != null && a.f177456e.isPlaying()) {
                a.f177456e.pause();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo122734j() {
        ActivityC0945e eVar = this.f177389a;
        if (eVar != null && !eVar.isFinishing()) {
            mo122733i();
            this.f177405q = true;
            this.f177391c.mo78902a("mv", "all", false, 20, this.f177399k, this.f177400l, this.f177401m, (IFetchCategoryEffectListener) new IFetchCategoryEffectListener() {
                /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.C789214 */

                static {
                    Covode.recordClassIndex(92070);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C78917b.this.mo122736l();
                    if (exceptionResult == null) {
                        C78917b.m137706a(false, 1, (Exception) null);
                    } else {
                        C78917b.m137706a(false, exceptionResult.getErrorCode(), exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (TextUtils.isEmpty(C78917b.this.f177401m)) {
                        C78917b.this.f177401m = categoryPageModel2.getCategoryEffects().getVersion();
                    }
                    C78917b.this.f177399k = categoryPageModel2.getCategoryEffects().getCursor();
                    C78917b.this.f177400l = categoryPageModel2.getCategoryEffects().getSortingPosition();
                    C78917b.this.f177402n = categoryPageModel2.getCategoryEffects().hasMore();
                    if (!C78917b.this.mo122730a(categoryPageModel2)) {
                        C78917b.this.mo122736l();
                    }
                    if (C78917b.this.f177405q) {
                        C78917b.this.f177405q = false;
                    }
                    C78917b.m137706a(true, 0, (Exception) null);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
    /* renamed from: f */
    public final void mo62181f() {
        MvTemplateView mvTemplateView = this.f177390b;
        if (mvTemplateView != null) {
            if (mvTemplateView.getVisibility() != 8) {
                if (mvTemplateView.f177168u != null) {
                    mvTemplateView.f177168u.cancel();
                }
                mvTemplateView.f177169v = ObjectAnimator.ofFloat(mvTemplateView.f177152e, "alpha", 1.0f, 0.0f);
                mvTemplateView.f177169v.setDuration(300L);
                mvTemplateView.f177169v.addListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
                      (wrap: android.animation.ObjectAnimator : 0x002c: IGET  (r1v3 android.animation.ObjectAnimator) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.v android.animation.ObjectAnimator)
                      (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5 : 0x0030: CONSTRUCTOR  (r0v7 com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) call: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.5.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.animation.ObjectAnimator.addListener(android.animation.Animator$AnimatorListener):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.b.f():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r0v7 com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) call: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.5.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.b.f():void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 112
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78917b.mo62181f():void");
            }

            /* access modifiers changed from: package-private */
            /* renamed from: g */
            public final boolean mo122732g() {
                if (this.f177390b != null) {
                    return true;
                }
                ViewStubCompat viewStubCompat = this.f177407s;
                if (viewStubCompat == null || viewStubCompat.getParent() == null) {
                    return false;
                }
                MvTemplateView mvTemplateView = (MvTemplateView) this.f177407s.mo1691a();
                this.f177390b = mvTemplateView;
                mvTemplateView.setDiContainer(this.f177406r);
                this.f177390b.setOnClickListener(View$OnClickListenerC78927c.f177424a);
                this.f177390b.setMvThemeClickListener(this);
                this.f177390b.setMoreDataFetcher(new C78936d(this));
                mo122733i();
                this.f177390b.setMvEffectPlatform(this.f177391c);
                if (mo122732g()) {
                    MvTemplateView mvTemplateView2 = this.f177390b;
                    if (mvTemplateView2.f177159l != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mvTemplateView2.f177159l.getLayoutParams();
                        layoutParams.topMargin = (int) (((float) C70636dh.m124833c(mvTemplateView2.getContext())) + C13628n.m24520b(mvTemplateView2.getContext(), 24.5f));
                        mvTemplateView2.f177159l.setLayoutParams(layoutParams);
                    }
                }
                if (this.f177408t) {
                    mo62176a(true);
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
            /* renamed from: e */
            public final void mo62180e() {
                if (mo122732g()) {
                    EventBus.m156966a(EventBus.m156962a(), this.f177390b);
                    MvTemplateView mvTemplateView = this.f177390b;
                    if (mvTemplateView.f177169v != null) {
                        mvTemplateView.f177169v.cancel();
                    }
                    mvTemplateView.setVisibility(0);
                    mvTemplateView.f177168u = ObjectAnimator.ofFloat(mvTemplateView.f177152e, "alpha", 0.0f, 1.0f);
                    mvTemplateView.f177168u.setDuration(300L);
                    mvTemplateView.f177168u.start();
                    mvTemplateView.mo122652d();
                    if (this.f177390b.getDataCount() == 0) {
                        MvTemplateView mvTemplateView2 = this.f177390b;
                        mvTemplateView2.f177157j.setVisibility(0);
                        mvTemplateView2.f177156i.setVisibility(4);
                        mvTemplateView2.mo122651c();
                        m137709n();
                    } else if (this.f177390b.f177158k) {
                        m137709n();
                    } else {
                        this.f177390b.mo122645a();
                    }
                }
                C39162r.m79460a("enter_mv_shoot_page", m137711p().mo129406a("content_source", "upload").mo129406a("content_type", "mv").mo129406a("enter_method", C78948b.f177442a).f188764a);
                C78948b.f177442a = "change_mode";
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.AbstractC78969l
            /* renamed from: b */
            public final void mo122731b(MvThemeData mvThemeData) {
                m137705a("mv_show", mvThemeData, 0);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2425bv.AbstractC35318a
            /* renamed from: a */
            public final void mo62176a(boolean z) {
                this.f177408t = z;
                MvTemplateView mvTemplateView = this.f177390b;
                if (mvTemplateView != null) {
                    mvTemplateView.mo122647a(Boolean.valueOf(z));
                }
            }

            /* renamed from: a */
            public final void mo122728a(String str) {
                if (mo122732g()) {
                    new C79459a(this.f177390b.getContext()).mo123052a(str).mo123053a();
                    if (this.f177390b.getDataCount() == 0) {
                        MvTemplateView mvTemplateView = this.f177390b;
                        mvTemplateView.f177157j.setVisibility(8);
                        mvTemplateView.f177156i.setVisibility(0);
                        mvTemplateView.f177149b.setVisibility(8);
                        mvTemplateView.f177148a.setVisibility(8);
                        mvTemplateView.f177161n.setNoScroll(true);
                        mvTemplateView.f177150c.setVisibility(8);
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        do {
                            MvThemeData mvThemeData = new MvThemeData();
                            mvThemeData.f177192i = true;
                            arrayList.add(mvThemeData);
                            i++;
                        } while (i < 3);
                        mvTemplateView.mo122648a(arrayList);
                        mvTemplateView.mo122651c();
                        if (mvTemplateView.f177166s) {
                            mvTemplateView.f177164q.f177537d = false;
                            mvTemplateView.mo122655f();
                        }
                        mvTemplateView.f177158k = true;
                        mvTemplateView.f177153f.mo122819a();
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.AbstractC78969l
            /* renamed from: a */
            public final boolean mo122729a(MvThemeData mvThemeData) {
                if (!C78948b.m137765a(mvThemeData)) {
                    return true;
                }
                ActivityC0945e eVar = this.f177389a;
                DialogInterface$OnClickListenerC78955f fVar = new DialogInterface$OnClickListenerC78955f(this);
                if (!(eVar == null || eVar.isFinishing() || mvThemeData == null || mvThemeData.f177184a == null)) {
                    String id = mvThemeData.f177184a.getId();
                    C89219l.m154721d(id, "");
                    if (C34822d.m71158a(C63238c.f143574a, "mv_template", 0).getBoolean(id, false)) {
                        fVar.onClick(null, 0);
                    } else {
                        C17197a.C17200a aVar = new C17197a.C17200a(eVar);
                        aVar.f41070a = eVar.getResources().getString(R.string.gr);
                        aVar.f41071b = eVar.getResources().getString(R.string.go);
                        aVar.mo27196b(eVar.getResources().getString(R.string.gp), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC78952f(), false).mo27192a(eVar.getResources().getString(R.string.gq), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC78953g(mvThemeData, fVar), false).mo27193a().mo27185c().show();
                    }
                }
                return false;
            }

            /* renamed from: a */
            public final boolean mo122730a(CategoryPageModel categoryPageModel) {
                if (categoryPageModel == null || C84904k.m145909a(categoryPageModel.getCategoryEffects().getEffects())) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Effect effect : categoryPageModel.getCategoryEffects().getEffects()) {
                    MvThemeData mvThemeData = new MvThemeData();
                    mvThemeData.mo122666a(effect);
                    mvThemeData.f177185b = categoryPageModel.getUrl_prefix();
                    arrayList.add(mvThemeData);
                }
                if (arrayList.size() <= 0) {
                    return false;
                }
                Effect effect2 = this.f177392d;
                if (effect2 != null && !TextUtils.isEmpty(effect2.getEffectId())) {
                    if (!this.f177411w) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            } else if (this.f177392d.getEffectId().equals(((MvThemeData) arrayList.get(i)).mo122665a())) {
                                arrayList.remove(i);
                                this.f177411w = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (this.f177390b.getDataCount() == 0) {
                        MvThemeData mvThemeData2 = new MvThemeData();
                        mvThemeData2.mo122666a(this.f177392d);
                        mvThemeData2.f177185b = categoryPageModel.getUrl_prefix();
                        arrayList.add(0, mvThemeData2);
                    }
                }
                if (!this.f177410v) {
                    this.f177390b.mo122648a(arrayList);
                } else if (mo122732g()) {
                    this.f177390b.mo122648a(arrayList);
                    this.f177390b.mo122645a();
                    this.f177410v = false;
                }
                if (!this.f177402n) {
                    this.f177390b.mo122655f();
                }
                return true;
            }

            public C78917b(ActivityC0945e eVar, ViewStubCompat viewStubCompat, C21582f fVar) {
                if (eVar != null && !eVar.isFinishing()) {
                    this.f177406r = fVar;
                    this.f177389a = eVar;
                    this.f177407s = viewStubCompat;
                    this.f177391c = EffectService.getInstance().createMvEffectPlatform(eVar.getApplication());
                    this.f177394f = this.f177389a.getResources().getString(R.string.bop);
                    this.f177403o = false;
                }
            }

            /* renamed from: a */
            private void m137705a(String str, MvThemeData mvThemeData, int i) {
                if (mvThemeData != null) {
                    C39162r.m79460a(str, m137711p().mo129406a("mv_id", mvThemeData.mo122665a()).mo129406a("mv_name", mvThemeData.mo122672f()).mo129403a("impr_position", i + 1).f188764a);
                }
            }

            /* renamed from: a */
            public static void m137706a(boolean z, int i, Exception exc) {
                JSONObject jSONObject = null;
                if (z) {
                    C40982q.m82520a("mv_resource_list_download_error_state", 0, (JSONObject) null);
                    return;
                }
                if (exc != null) {
                    jSONObject = new C69840ar().mo110189a("exception", C24098m.m45633c(exc)).mo110189a("event", C73924x.f165970a.mo116371a().toString()).mo110191a();
                }
                C40982q.m82520a("mv_resource_list_download_error_state", i, jSONObject);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.AbstractC78969l
            /* renamed from: a */
            public final void mo122727a(MvThemeData mvThemeData, int i, int i2) {
                if (i == 2) {
                    mo62181f();
                    AbstractC83678a aVar = (AbstractC83678a) this.f177406r.mo35252b(AbstractC83678a.class, null);
                    if (aVar != null) {
                        aVar.mo128664a("click_cross", System.currentTimeMillis());
                    }
                } else if (i == 1) {
                    if (!mo122732g() || this.f177390b.getVisibility() == 0) {
                        ActivityC0945e eVar = this.f177389a;
                        ShortVideoContext shortVideoContext = this.f177393e;
                        String str = "";
                        C89219l.m154721d(eVar, str);
                        if (mvThemeData != null && mvThemeData.f177186c >= 0) {
                            String d = mvThemeData.mo122669d();
                            if (C80720e.m139927b(d)) {
                                mvThemeData.f177194k = C78948b.m137765a(mvThemeData);
                                Bundle bundle = new Bundle();
                                bundle.putString("key_mv_src_limited_toast", mvThemeData.f177200q);
                                bundle.putInt("upload_photo_min_height", mvThemeData.f177199p);
                                bundle.putInt("upload_photo_min_width", mvThemeData.f177198o);
                                bundle.putString("key_mv_hint_text", mvThemeData.mo122674h());
                                bundle.putString("key_mv_resource_unzip_path", d);
                                bundle.putParcelable("key_select_mv_data", mvThemeData);
                                bundle.putParcelable("key_short_video_context", shortVideoContext);
                                String a = C78973n.C78974a.m137798a(mvThemeData.f177184a);
                                if (a != null) {
                                    bundle.putString("Key_challenge_id", a);
                                }
                                if (mvThemeData.f177184a != null) {
                                    bundle.putString("key_sdk_extra_data", mvThemeData.f177184a.getSdkExtra());
                                }
                                if (mvThemeData.f177195l != null) {
                                    str = mvThemeData.f177195l;
                                }
                                bundle.putString("key_mv_algorithm_hint", str);
                                bundle.putInt("key_photo_select_min_count", mvThemeData.f177186c);
                                bundle.putInt("key_photo_select_max_count", mvThemeData.f177187d);
                                bundle.putInt("key_support_flag", 3);
                                bundle.putInt("key_choose_scene", 2);
                                MvChoosePhotoActivity.C72040a.m127136a(eVar, bundle, 10001);
                                if ((eVar instanceof ActivityC0945e) && eVar != null) {
                                    C20531t.m38716a(eVar).mo33800a(PermissionStateViewModel.class).mo33689c(PermissionStateViewModel.C83940a.f187386a);
                                }
                            }
                        }
                        m137705a("select_mv", mvThemeData, i2);
                    }
                } else if (i == 3) {
                    m137705a("mv_show", mvThemeData, i2);
                }
            }
        }
