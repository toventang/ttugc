package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4134d;

import android.app.Activity;
import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78899d;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78853c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.d */
public final class C78876d extends AbstractC78851a {

    /* renamed from: d */
    public String f177269d;

    static {
        Covode.recordClassIndex(92025);
    }

    /* renamed from: a */
    public final void mo122707a() {
        AbstractC46415f fVar = this.f177240c.f177255l;
        if (fVar == null) {
            C89219l.m154715b();
        }
        fVar.mo78892a(this.f177269d, new C78877a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.d$a */
    public static final class C78877a implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C78876d f177270a;

        static {
            Covode.recordClassIndex(92026);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78877a(C78876d dVar) {
            this.f177270a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            C89219l.m154721d(effectChannelResponse2, "");
            this.f177270a.mo122708a(effectChannelResponse2);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            long a = this.f177270a.f177239b.mo122711a("fetch mv panel list", "failed.");
            C78899d dVar = this.f177270a.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177319b = (int) a;
            }
            C78899d dVar2 = this.f177270a.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177329l = exceptionResult.getMsg();
            }
            C78899d dVar3 = this.f177270a.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177328k = 1;
            }
            AbstractC78853c cVar = this.f177270a.f177240c.f177251h;
            if (cVar != null) {
                cVar.mo122696a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.d.d$b */
    public static final class C78878b implements IFetchEffectChannelListener {

        /* renamed from: a */
        final /* synthetic */ C78876d f177271a;

        static {
            Covode.recordClassIndex(92027);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78878b(C78876d dVar) {
            this.f177271a = dVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f177271a.mo122707a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            C89219l.m154721d(effectChannelResponse2, "");
            if (!this.f177271a.mo122708a(effectChannelResponse2)) {
                this.f177271a.mo122707a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        Activity activity;
        WeakReference<Activity> weakReference;
        Activity activity2;
        Activity activity3;
        if (!this.f177240c.f177246c) {
            AbstractC78856e eVar = this.f177238a;
            if (eVar != null) {
                eVar.mo122701a(obj);
                return;
            }
            return;
        }
        this.f177239b.f177276a = System.currentTimeMillis();
        C78899d dVar = this.f177240c.f177249f;
        if (dVar != null) {
            dVar.f177318a = 1;
        }
        WeakReference<Activity> weakReference2 = this.f177240c.f177250g;
        Application application = null;
        if (weakReference2 != null) {
            activity = weakReference2.get();
        } else {
            activity = null;
        }
        if (activity == null || !((weakReference = this.f177240c.f177250g) == null || (activity3 = weakReference.get()) == null || !activity3.isFinishing())) {
            long a = this.f177239b.mo122711a("fetch mv panel list", "failed.");
            C78899d dVar2 = this.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177319b = (int) a;
            }
            C78899d dVar3 = this.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177329l = "activity is finish";
            }
            C78899d dVar4 = this.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177328k = 1;
            }
            AbstractC78853c cVar = this.f177240c.f177251h;
            if (cVar != null) {
                cVar.mo122696a();
                return;
            }
            return;
        }
        if (this.f177240c.f177255l == null) {
            WeakReference<Activity> weakReference3 = this.f177240c.f177250g;
            if (weakReference3 == null || weakReference3.get() == null) {
                long a2 = this.f177239b.mo122711a("fetch mv panel list", "failed.");
                C78899d dVar5 = this.f177240c.f177249f;
                if (dVar5 != null) {
                    dVar5.f177319b = (int) a2;
                }
                C78899d dVar6 = this.f177240c.f177249f;
                if (dVar6 != null) {
                    dVar6.f177329l = "activity is null";
                }
                C78899d dVar7 = this.f177240c.f177249f;
                if (dVar7 != null) {
                    dVar7.f177328k = 1;
                }
                AbstractC78853c cVar2 = this.f177240c.f177251h;
                if (cVar2 != null) {
                    cVar2.mo122696a();
                }
            } else {
                C78859b bVar = this.f177240c;
                EffectService instance = EffectService.getInstance();
                WeakReference<Activity> weakReference4 = this.f177240c.f177250g;
                if (weakReference4 == null || (activity2 = weakReference4.get()) == null || (application = activity2.getApplication()) == null) {
                    C89219l.m154715b();
                }
                bVar.f177255l = instance.createMvEffectPlatform(application);
            }
        }
        AbstractC46415f fVar = this.f177240c.f177255l;
        if (fVar != null) {
            fVar.mo78907a(this.f177269d, false, (IFetchEffectChannelListener) new C78878b(this));
        }
    }

    /* renamed from: a */
    public final boolean mo122708a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || C84904k.m145909a(effectChannelResponse.getAllCategoryEffects())) {
            long a = this.f177239b.mo122711a("fetch mv panel list", "failed.");
            C78899d dVar = this.f177240c.f177249f;
            if (dVar != null) {
                dVar.f177319b = (int) a;
            }
            C78899d dVar2 = this.f177240c.f177249f;
            if (dVar2 != null) {
                dVar2.f177329l = "mv list is null";
            }
            C78899d dVar3 = this.f177240c.f177249f;
            if (dVar3 != null) {
                dVar3.f177328k = 1;
            }
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            MvThemeData mvThemeData = new MvThemeData();
            mvThemeData.mo122666a(effect);
            mvThemeData.f177185b = effectChannelResponse.getUrlPrefix();
            arrayList.add(mvThemeData);
        }
        if (arrayList.size() <= 0) {
            long a2 = this.f177239b.mo122711a("fetch mv panel list", "failed.");
            C78899d dVar4 = this.f177240c.f177249f;
            if (dVar4 != null) {
                dVar4.f177319b = (int) a2;
            }
            C78899d dVar5 = this.f177240c.f177249f;
            if (dVar5 != null) {
                dVar5.f177329l = "mv list is null";
            }
            C78899d dVar6 = this.f177240c.f177249f;
            if (dVar6 != null) {
                dVar6.f177328k = 1;
            }
            AbstractC78853c cVar = this.f177240c.f177251h;
            if (cVar != null) {
                cVar.mo122696a();
            }
            return false;
        }
        long a3 = this.f177239b.mo122711a("fetch mv panel list", "success");
        C78899d dVar7 = this.f177240c.f177249f;
        if (dVar7 != null) {
            dVar7.f177319b = (int) a3;
        }
        AbstractC78856e eVar = this.f177238a;
        if (eVar != null) {
            eVar.mo122701a(arrayList);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78876d(String str, C78859b bVar) {
        super(bVar);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f177269d = str;
    }
}
