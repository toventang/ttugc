package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.discover.alading.AbstractC41825b;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41806a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.h */
public abstract class AbstractC34152h extends AbstractC41825b implements AbstractC34146d, AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public static final C34154a f80757h = new C34154a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f80758a;

    /* renamed from: b */
    private final AbstractC89244h f80759b;

    /* renamed from: c */
    private final AbstractC89244h f80760c;

    /* renamed from: d */
    public Aweme f80761d;

    /* renamed from: e */
    public String f80762e;

    /* renamed from: f */
    public List<? extends Aweme> f80763f;

    /* renamed from: g */
    public AbstractC51044b f80764g;

    static {
        Covode.recordClassIndex(41086);
    }

    /* renamed from: a */
    public RecyclerView mo60484a() {
        return (RecyclerView) this.f80758a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    /* renamed from: g */
    public final LinearLayoutManager mo60488g() {
        return (LinearLayoutManager) this.f80759b.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(AbstractC34152h.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public C34169m mo60489h() {
        return (C34169m) this.f80760c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.h$a */
    public static final class C34154a {
        static {
            Covode.recordClassIndex(41088);
        }

        private C34154a() {
        }

        public /* synthetic */ C34154a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        mo60489h().mo60424A();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        mo60489h().mo60425B();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        mo60489h().bg_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        mo60489h().bi_();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return mo60489h().f80810e;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.h$b */
    static final class C34155b extends AbstractC89220m implements AbstractC89171a<LinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ C41827d f80766a;

        static {
            Covode.recordClassIndex(41089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34155b(C41827d dVar) {
            super(0);
            this.f80766a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayoutManager invoke() {
            RecyclerView.AbstractC1362i layoutManager = this.f80766a.f97566a.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            return layoutManager;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return mo60489h().aZ_();
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.AbstractC51062a
    /* renamed from: e */
    public final boolean mo60483e() {
        return mo60489h().mo60483e();
    }

    /* renamed from: i */
    public final View mo60490i() {
        View view = this.f97564j.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.h$d */
    static final class C34157d extends AbstractC89220m implements AbstractC89171a<C34169m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34152h f80768a;

        /* renamed from: b */
        final /* synthetic */ AbstractC51043a f80769b;

        static {
            Covode.recordClassIndex(41091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34157d(AbstractC34152h hVar, AbstractC51043a aVar) {
            super(0);
            this.f80768a = hVar;
            this.f80769b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34169m invoke() {
            return new C34169m(this.f80768a.mo60484a(), this.f80768a.mo60490i(), this.f80768a.f80764g, this.f80769b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.h$c */
    static final class C34156c extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C41827d f80767a;

        static {
            Covode.recordClassIndex(41090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34156c(C41827d dVar) {
            super(0);
            this.f80767a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            Context context = GlobalContext.getContext();
            C89219l.m154716b(context, "");
            new C34150f(C23163i.m43663a(context), C34723i.m70928b(GlobalContext.getContext())).mo4857a(this.f80767a.f97566a);
            return this.f80767a.f97566a;
        }
    }

    /* renamed from: a */
    public final void mo60485a(AbstractC34107a aVar) {
        mo60489h().f80807b = aVar;
    }

    /* renamed from: a */
    public final void mo60486a(AbstractView$OnAttachStateChangeListenerC34144b bVar) {
        mo60489h().f80809d = bVar;
    }

    /* renamed from: a */
    public final void mo60487a(List<? extends Aweme> list) {
        if (list != null && (!list.isEmpty())) {
            mo60489h().f80808c = (Aweme) list.get(0);
        }
        this.f80763f = list;
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        AbstractView$OnAttachStateChangeListenerC34144b bVar;
        int i;
        C89219l.m154721d(agVar, "");
        if (C0792v.m2791y(this.f97564j.itemView) && (bVar = mo60489h().f80809d) != null && bVar.mo60473C() && agVar.f114315a == 21) {
            Aweme aweme = null;
            if (mo60490i() != null) {
                C67704b.m119869a(null);
            }
            Object obj = agVar.f114316b;
            if (obj instanceof Aweme) {
                aweme = obj;
            }
            Aweme aweme2 = aweme;
            if (aweme2 != null && !TextUtils.equals(C41806a.f97519f, aweme2.getAid())) {
                List<? extends Aweme> list = this.f80763f;
                if (list == null) {
                    C89219l.m154715b();
                }
                Iterator<? extends Aweme> it = list.iterator();
                int i2 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        break;
                    } else if (!m69783a((Aweme) it.next(), aweme2)) {
                        i2++;
                    } else if (i2 != -1) {
                        mo60488g().mo4347a(i2, 0);
                        return;
                    }
                }
                if (this.f80761d != null) {
                    List<? extends Aweme> list2 = this.f80763f;
                    if (list2 != null) {
                        Iterator<? extends Aweme> it2 = list2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Aweme aweme3 = (Aweme) it2.next();
                            Aweme aweme4 = this.f80761d;
                            if (aweme4 == null) {
                                C89219l.m154715b();
                            }
                            if (m69783a(aweme3, aweme4)) {
                                i = i3;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        i = 0;
                    }
                    mo60488g().mo4347a(i, 0);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m69783a(Aweme aweme, Aweme aweme2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(aweme2, "");
        return TextUtils.equals(aweme.getAid(), aweme2.getAid());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC34152h(C41827d dVar, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        this.f80764g = bVar;
        this.f80758a = C89250i.m154773a((AbstractC89171a) new C34156c(dVar));
        this.f80759b = C89250i.m154773a((AbstractC89171a) new C34155b(dVar));
        this.f80760c = C89250i.m154773a((AbstractC89171a) new C34157d(this, aVar));
        dVar.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34152h.View$OnAttachStateChangeListenerC341531 */

            /* renamed from: a */
            final /* synthetic */ AbstractC34152h f80765a;

            static {
                Covode.recordClassIndex(41087);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f80765a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                EventBus.m156966a(EventBus.m156962a(), this.f80765a);
            }

            public final void onViewDetachedFromWindow(View view) {
                EventBus.m156962a().mo145395b(this.f80765a);
            }
        });
    }
}
