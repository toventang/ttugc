package com.p2082ss.android.ugc.aweme.homepage.story.icon;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a;
import com.p2082ss.android.ugc.aweme.story.publish.C77444g;
import com.p2082ss.android.ugc.aweme.story.publish.EnumC77446i;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.j */
public final class C53174j extends AbstractC12769a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    private final AbstractC77389a f122200j = C77260g.f173332a.mo120158f();

    /* renamed from: k */
    private final AbstractC89244h f122201k = C89250i.m154773a((AbstractC89171a) new C53175a(this));

    static {
        Covode.recordClassIndex(62722);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, new RunnableC90250g(C53174j.class, "onStoryPublishEventPost", StoryPublishEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public final DrawerViewModel mo89670v() {
        return (DrawerViewModel) this.f122201k.getValue();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.j$a */
    static final class C53175a extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C53174j f122202a;

        static {
            Covode.recordClassIndex(62723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53175a(C53174j jVar) {
            super(0);
            this.f122202a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122202a);
            if (b != null) {
                return DrawerViewModel.C53032a.m97961a(b);
            }
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C80298cg.m139204a(this);
        C53116a.f122145a.restoreScheduleInfoFromDraft(C53176b.f122203a);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        view.setOnClickListener(new View$OnClickListenerC53177c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.j$c */
    static final class View$OnClickListenerC53177c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53174j f122204a;

        static {
            Covode.recordClassIndex(62725);
        }

        View$OnClickListenerC53177c(C53174j jVar) {
            this.f122204a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DrawerViewModel v = this.f122204a.mo89670v();
            if (v != null) {
                v.mo89466a(1, "click_upper_left_camera");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.icon.j$b */
    static final class C53176b extends AbstractC89220m implements AbstractC89172b<List<? extends ScheduleInfo>, C89391z> {

        /* renamed from: a */
        public static final C53176b f122203a = new C53176b();

        static {
            Covode.recordClassIndex(62724);
        }

        C53176b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends ScheduleInfo> list) {
            List<? extends ScheduleInfo> list2 = list;
            C89219l.m154721d(list2, "");
            if (!list2.isEmpty()) {
                AbstractC77389a f = C77260g.f173332a.mo120158f();
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    C77444g gVar = new C77444g(it.next());
                    gVar.f173767b.mo121052a(EnumC77446i.FAILED);
                    arrayList.add(gVar);
                }
                f.mo120169a(C89070n.m154585g((Collection) arrayList));
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onStoryPublishEventPost(StoryPublishEvent storyPublishEvent) {
        ActivityC0945e b;
        C89219l.m154721d(storyPublishEvent, "");
        AbstractC77389a aVar = this.f122200j;
        List<ScheduleInfo> scheduleList = storyPublishEvent.getScheduleList();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) scheduleList, 10));
        Iterator<T> it = scheduleList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C77444g(it.next()));
        }
        aVar.mo120169a(C89070n.m154585g((Collection) arrayList));
        if (storyPublishEvent.getSwitch2FeedTab() && (b = C12777b.m23004b(this)) != null) {
            String f = Hox.C15490a.m28529a(b).mo25219f(C34792be.f82124c);
            if (!(!C89219l.m154714a((Object) f, (Object) "page_feed"))) {
                String f2 = Hox.C15490a.m28529a(b).mo25219f(f);
                if (!C89219l.m154714a((Object) f, (Object) "USER")) {
                    Hox a = Hox.C15490a.m28529a(b);
                    Bundle bundle = new Bundle();
                    bundle.putString(C34792be.f82123b, f2);
                    a.mo25211b("USER", bundle);
                }
            }
        }
        DrawerViewModel v = mo89670v();
        if (v != null) {
            v.mo89466a(4, "close_publish");
        }
    }
}
