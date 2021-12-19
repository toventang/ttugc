package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.br */
public final class C68032br implements AbstractC68342a, AbstractC68350b {

    /* renamed from: a */
    public static final C68032br f152383a = new C68032br();

    /* renamed from: b */
    private static C88960c<String> f152384b;

    /* renamed from: c */
    private static final Queue<String> f152385c = new ArrayBlockingQueue(10);

    /* renamed from: d */
    private static final ArrayList<String> f152386d = C89070n.m154525d("digg_push", "comment_push", "follow_push", "mention_push", "im_push");

    /* renamed from: e */
    private static C68348f f152387e;

    /* renamed from: f */
    private static final AbstractC89244h f152388f = C89250i.m154773a((AbstractC89171a) C68033a.f152389a);

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60119a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    private C68032br() {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
        m120332c();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        m120332c();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.br$a */
    static final class C68033a extends AbstractC89220m implements AbstractC89171a<C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b>> {

        /* renamed from: a */
        public static final C68033a f152389a = new C68033a();

        static {
            Covode.recordClassIndex(80229);
        }

        C68033a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> invoke() {
            C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePrivateSettingChangePresenter = C68432f.f153189a.providePrivateSettingChangePresenter();
            providePrivateSettingChangePresenter.mo67839a_(C68032br.f152383a);
            return providePrivateSettingChangePresenter;
        }
    }

    /* renamed from: c */
    private static void m120332c() {
        Queue<String> queue = f152385c;
        if (queue == null || queue.isEmpty()) {
            C88960c<String> cVar = f152384b;
            if (cVar != null) {
                cVar.onComplete();
                return;
            }
            return;
        }
        String poll = queue.poll();
        C88960c<String> cVar2 = f152384b;
        if (cVar2 != null) {
            cVar2.onNext(poll);
        }
    }

    static {
        Covode.recordClassIndex(80228);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
    /* renamed from: a */
    public final void mo60118a(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        f152387e = fVar;
    }
}
