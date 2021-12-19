package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70857g;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b */
public final class C51970b {

    /* renamed from: a */
    public static final AbstractC89244h f119719a = C89250i.m154773a((AbstractC89171a) C51972b.f119723a);

    /* renamed from: b */
    public static AbstractC46415f f119720b;

    /* renamed from: c */
    public static final AbstractC89244h f119721c = C89250i.m154773a((AbstractC89171a) C51973c.f119724a);

    /* renamed from: d */
    public static final C51971a f119722d = new C51971a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$d */
    public interface AbstractC51974d {
        static {
            Covode.recordClassIndex(61346);
        }

        /* renamed from: a */
        void mo87699a(Effect effect);

        /* renamed from: a */
        void mo87700a(Effect effect, ExceptionResult exceptionResult);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$a */
    public static final class C51971a {
        static {
            Covode.recordClassIndex(61343);
        }

        /* renamed from: a */
        public static C51970b m96696a() {
            return (C51970b) C51970b.f119719a.getValue();
        }

        /* renamed from: c */
        public static C70857g m96698c() {
            return (C70857g) C51970b.f119721c.getValue();
        }

        private C51971a() {
        }

        /* renamed from: b */
        public static AbstractC46415f m96697b() {
            if (C51970b.f119720b == null) {
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                AbstractC46415f a = C46404c.m89554a(application, null);
                C63244g.m114602a().mo73294v();
                C51970b.f119720b = a;
            }
            return C51970b.f119720b;
        }

        public /* synthetic */ C51971a(byte b) {
            this();
        }
    }

    private C51970b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$b */
    static final class C51972b extends AbstractC89220m implements AbstractC89171a<C51970b> {

        /* renamed from: a */
        public static final C51972b f119723a = new C51972b();

        static {
            Covode.recordClassIndex(61344);
        }

        C51972b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51970b invoke() {
            return new C51970b((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$c */
    static final class C51973c extends AbstractC89220m implements AbstractC89171a<C70857g> {

        /* renamed from: a */
        public static final C51973c f119724a = new C51973c();

        static {
            Covode.recordClassIndex(61345);
        }

        C51973c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70857g invoke() {
            return new C70857g((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(61342);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.b$e */
    public static final class C51975e implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC51974d f119725a;

        static {
            Covode.recordClassIndex(61347);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        C51975e(AbstractC51974d dVar) {
            this.f119725a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            AbstractC51974d dVar = this.f119725a;
            if (dVar != null) {
                dVar.mo87699a(effect2);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            AbstractC51974d dVar = this.f119725a;
            if (dVar != null) {
                dVar.mo87700a(effect, exceptionResult);
            }
        }
    }

    public /* synthetic */ C51970b(byte b) {
        this();
    }

    /* renamed from: a */
    public static boolean m96695a(Effect effect) {
        AbstractC46415f b;
        if (C51969a.m96692a(effect)) {
            return true;
        }
        if (effect == null || (((b = C51971a.m96697b()) == null || !b.mo78914a(effect)) && effect.getEffectType() == 0)) {
            return false;
        }
        return true;
    }
}
