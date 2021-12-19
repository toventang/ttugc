package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3168d;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3160a.C54922a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54823a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54846b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3166b.C55000a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.AbstractC55101k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55097i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55168aa;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.C55276a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a */
public final class C55004a implements AbstractC55101k<AbstractC56237a>, AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public static final C55005a f125905d = new C55005a((byte) 0);

    /* renamed from: a */
    public final AbstractC89516am f125906a = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: b */
    public String f125907b = "";

    /* renamed from: c */
    public final C55000a f125908c;

    /* renamed from: e */
    private boolean f125909e = true;

    /* renamed from: f */
    private final TuxStatusView.C23263c f125910f;

    /* renamed from: g */
    private final C54922a f125911g;

    /* renamed from: h */
    private final TuxStatusView f125912h;

    static {
        Covode.recordClassIndex(64730);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(189, new RunnableC90250g(C55004a.class, "onEvent", C55276a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a$a */
    public static final class C55005a {
        static {
            Covode.recordClassIndex(64731);
        }

        private C55005a() {
        }

        public /* synthetic */ C55005a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a$b */
    static final class RunnableC55006b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55004a f125913a;

        static {
            Covode.recordClassIndex(64732);
        }

        RunnableC55006b(C55004a aVar) {
            this.f125913a = aVar;
        }

        public final void run() {
            this.f125913a.mo91960a();
        }
    }

    /* renamed from: a */
    public final void mo91960a() {
        if (!this.f125911g.f4921a.f4672f.isEmpty() || !this.f125908c.f4921a.f4672f.isEmpty()) {
            this.f125912h.setVisibility(8);
            if (this.f125908c.mo91959a()) {
                List<T> list = this.f125911g.f4921a.f4672f;
                C89219l.m154716b(list, "");
                if (!list.isEmpty()) {
                    this.f125908c.mo5018a(C89070n.m154516a(C54846b.f125626a));
                    return;
                }
                return;
            }
            return;
        }
        this.f125912h.setVisibility(0);
        this.f125912h.setStatus(this.f125910f);
    }

    @AbstractC90264r
    public final void onEvent(C55276a aVar) {
        C89219l.m154721d(aVar, "");
        C55168aa.m100877a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a$c */
    static final class C55007c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125914a;

        /* renamed from: b */
        final /* synthetic */ List f125915b;

        static {
            Covode.recordClassIndex(64733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55007c(List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125915b = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55007c(this.f125915b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55007c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f125914a == 0) {
                C89382r.m154942a(obj);
                C55097i.m100771a(this.f125915b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.AbstractC55101k
    /* renamed from: a */
    public final void mo91910a(List<AbstractC56237a> list) {
        C89219l.m154721d(list, "");
        this.f125908c.mo5019a(list, new RunnableC55006b(this));
        if (this.f125909e) {
            this.f125909e = false;
            AbstractC89568bz unused = C89624i.m155555a(this.f125906a, C89546bf.f203267b, null, new C55007c(list, null), 2);
            C35434c.m72464b("im_chat_list");
        }
        C54823a.m100424a(list.size(), -1);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.d.a$d */
    static final class C55008d extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C55008d f125916a = new C55008d();

        static {
            Covode.recordClassIndex(64734);
        }

        C55008d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_direct_message;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    public C55004a(C54922a aVar, C55000a aVar2, TuxStatusView tuxStatusView) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(tuxStatusView, "");
        this.f125911g = aVar;
        this.f125908c = aVar2;
        this.f125912h = tuxStatusView;
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
        tuxStatusView.setVisibility(0);
        tuxStatusView.mo37867a();
        TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C55008d.f125916a));
        String string = tuxStatusView.getContext().getString(R.string.d2o);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = a.mo37879a(string);
        String string2 = tuxStatusView.getContext().getString(R.string.d2n);
        C89219l.m154716b(string2, "");
        this.f125910f = a2.mo37878a((CharSequence) string2);
    }
}
