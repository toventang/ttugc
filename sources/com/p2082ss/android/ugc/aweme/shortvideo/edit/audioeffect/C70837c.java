package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.app.Application;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c */
public final class C70837c {

    /* renamed from: b */
    public static final AbstractC89244h f158595b = C89250i.m154773a((AbstractC89171a) C70839b.f158600a);

    /* renamed from: c */
    public static AbstractC46415f f158596c;

    /* renamed from: d */
    public static final AbstractC89244h f158597d = C89250i.m154773a((AbstractC89171a) C70840c.f158601a);

    /* renamed from: e */
    public static final C70838a f158598e = new C70838a((byte) 0);

    /* renamed from: a */
    public CategoryPageModel f158599a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$d */
    public interface AbstractC70841d {
        static {
            Covode.recordClassIndex(83332);
        }

        /* renamed from: a */
        void mo112012a(Effect effect);

        /* renamed from: a */
        void mo112013a(Effect effect, ExceptionResult exceptionResult);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e */
    public interface AbstractC70842e {
        static {
            Covode.recordClassIndex(83333);
        }

        /* renamed from: a */
        void mo87719a(CategoryPageModel categoryPageModel);

        /* renamed from: a */
        void mo87720a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a */
    public static final class C70838a {
        static {
            Covode.recordClassIndex(83329);
        }

        /* renamed from: a */
        public static C70837c m125105a() {
            return (C70837c) C70837c.f158595b.getValue();
        }

        /* renamed from: c */
        public static C70857g m125107c() {
            return (C70857g) C70837c.f158597d.getValue();
        }

        private C70838a() {
        }

        /* renamed from: b */
        public static AbstractC46415f m125106b() {
            if (C70837c.f158596c == null) {
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                AbstractC46415f a = C46404c.m89554a(application, null);
                C63244g.m114602a().mo73294v();
                C70837c.f158596c = a;
            }
            return C70837c.f158596c;
        }

        public /* synthetic */ C70838a(byte b) {
            this();
        }
    }

    private C70837c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$b */
    static final class C70839b extends AbstractC89220m implements AbstractC89171a<C70837c> {

        /* renamed from: a */
        public static final C70839b f158600a = new C70839b();

        static {
            Covode.recordClassIndex(83330);
        }

        C70839b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70837c invoke() {
            return new C70837c((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$c */
    static final class C70840c extends AbstractC89220m implements AbstractC89171a<C70857g> {

        /* renamed from: a */
        public static final C70840c f158601a = new C70840c();

        static {
            Covode.recordClassIndex(83331);
        }

        C70840c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70857g invoke() {
            return new C70857g((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(83328);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f */
    public static final class C70843f implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC70841d f158602a;

        static {
            Covode.recordClassIndex(83334);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        C70843f(AbstractC70841d dVar) {
            this.f158602a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            AbstractC70841d dVar = this.f158602a;
            if (dVar != null) {
                dVar.mo112012a(effect2);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            AbstractC70841d dVar = this.f158602a;
            if (dVar != null) {
                dVar.mo112013a(effect, exceptionResult);
            }
        }
    }

    public /* synthetic */ C70837c(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$g */
    public static final class C70844g implements IFetchCategoryEffectListener {

        /* renamed from: a */
        final /* synthetic */ C70837c f158603a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70842e f158604b;

        static {
            Covode.recordClassIndex(83335);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
            CategoryPageModel categoryPageModel2 = categoryPageModel;
            this.f158603a.f158599a = categoryPageModel2;
            AbstractC70842e eVar = this.f158604b;
            if (eVar != null) {
                eVar.mo87719a(categoryPageModel2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r0 == null) goto L_0x000f;
         */
        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFail(com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e r1 = r2.f158604b
                if (r1 == 0) goto L_0x0014
                if (r3 == 0) goto L_0x000f
                r3.getErrorCode()
                java.lang.String r0 = r3.getMsg()
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r0 = ""
            L_0x0011:
                r1.mo87720a(r0)
            L_0x0014:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c.C70844g.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
        }

        C70844g(C70837c cVar, AbstractC70842e eVar) {
            this.f158603a = cVar;
            this.f158604b = eVar;
        }
    }

    /* renamed from: a */
    public static boolean m125103a(Effect effect) {
        AbstractC46415f b;
        if (C70825a.m125085a(effect)) {
            return true;
        }
        if (effect == null || (((b = C70838a.m125106b()) == null || !b.mo78914a(effect)) && effect.getEffectType() == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo112011a(AbstractC70842e eVar) {
        CategoryPageModel categoryPageModel = this.f158599a;
        if (categoryPageModel == null || C13603b.m24435a((Collection) categoryPageModel.getUrl_prefix())) {
            AbstractC46415f b = C70838a.m125106b();
            if (b != null) {
                b.mo78902a("voicechanger", "all", false, 0, 0, 0, "", (IFetchCategoryEffectListener) new C70844g(this, eVar));
                return;
            }
            return;
        }
        eVar.mo87719a(this.f158599a);
    }
}
