package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36389e;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76443a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76594d;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.af */
public abstract class AbstractC41164af extends C41178b {

    /* renamed from: I */
    public static final C41165a f96191I = new C41165a((byte) 0);

    /* renamed from: F */
    private boolean f96192F;

    /* renamed from: a */
    private boolean f96193a;

    static {
        Covode.recordClassIndex(49047);
    }

    /* renamed from: a */
    public void mo70404a(C33942b bVar) {
    }

    /* renamed from: ab */
    public void mo70394ab() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(369, new RunnableC90250g(AbstractC41164af.class, "onStoryCommentBubbleItemClicked", C76594d.class, ThreadMode.MAIN, 0, false));
        return subscriberEventTypes;
    }

    /* renamed from: o */
    public void mo70389o() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.af$a */
    public static final class C41165a {
        static {
            Covode.recordClassIndex(49048);
        }

        private C41165a() {
        }

        public /* synthetic */ C41165a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c
    /* renamed from: c */
    public final void mo63766c() {
        this.f96192F = true;
        mo84739bN();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c
    /* renamed from: d */
    public final void mo63767d() {
        this.f96192F = false;
        mo84740bO();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: y */
    public final Aweme mo70429y() {
        return mo84738bM();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: v */
    public final void mo70428v() {
        super.mo70428v();
        this.f114759N.post(new RunnableC41169e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.af$e */
    static final class RunnableC41169e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC41164af f96197a;

        static {
            Covode.recordClassIndex(49052);
        }

        RunnableC41169e(AbstractC41164af afVar) {
            this.f96197a = afVar;
        }

        public final void run() {
            AbstractC48191b bVar = this.f96197a.f114768W;
            C89219l.m154716b(bVar, "");
            if (bVar.getCount() > 0 && this.f96197a.mo84730bE()) {
                this.f96197a.mo70394ab();
            }
        }
    }

    /* renamed from: ad */
    public final boolean mo70420ad() {
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        return C89219l.m154714a((Object) bVar.getEventType(), (Object) "story_archive");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public void mo70407p() {
        super.mo70407p();
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        String eventType = bVar.getEventType();
        C89219l.m154716b(eventType, "");
        if (m82897r(eventType)) {
            m82896r(this.f96242g);
        }
    }

    /* renamed from: ae */
    public final void mo70421ae() {
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        String eventType = bVar.getEventType();
        C89219l.m154716b(eventType, "");
        boolean r = m82897r(eventType);
        IStoryService storyService = AVExternalServiceImpl.m113114a().storyService();
        Activity activity = this.f183419bv;
        C89219l.m154716b(activity, "");
        storyService.startStoryActivity(activity, new EnterStoryParam(null, "click_story_bottom_camera", "story", r, false, false, !C76660b.m134249i(), 49, null));
    }

    /* renamed from: af */
    public final String mo70422af() {
        Aweme bM;
        AwemeStatistics statistics;
        long commentCount;
        long j = 0;
        if (CommentServiceImpl.m73664e().mo63307c(mo84738bM()) || (bM = mo84738bM()) == null || (statistics = bM.getStatistics()) == null) {
            commentCount = 0;
        } else {
            commentCount = statistics.getCommentCount();
        }
        if (commentCount >= 0) {
            j = commentCount;
        }
        try {
            String a = C53437b.m98615a(j);
            C89219l.m154716b(a, "");
            return a;
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return "0";
        }
    }

    /* renamed from: bZ */
    private static Aweme m82895bZ() {
        Aweme aweme = new Aweme();
        aweme.setAid("0");
        aweme.setAwemeType(40);
        Aweme aweme2 = new Aweme();
        aweme2.setAwemeType(5457744);
        aweme2.setStory(new Story(0, false, 0, false, 0, false, false, true, false, 383, null));
        aweme.setUserStory(new UserStory(C89070n.m154524c(aweme2), 1, 0, false, 0, 0, false, false, 0, 0, null, false, false, false, 16372, null));
        return aweme;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.af$b */
    static final class C41166b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC41164af f96194a;

        static {
            Covode.recordClassIndex(49049);
        }

        C41166b(AbstractC41164af afVar) {
            this.f96194a = afVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f96194a.mo70404a((C33942b) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.af$c */
    static final class C41167c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC41164af f96195a;

        static {
            Covode.recordClassIndex(49050);
        }

        C41167c(AbstractC41164af afVar) {
            this.f96195a = afVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f96195a.mo70404a((C33942b) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.af$d */
    public static final class C41168d implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ AbstractC41164af f96196a;

        static {
            Covode.recordClassIndex(49051);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41168d(AbstractC41164af afVar) {
            this.f96196a = afVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            AbstractC41262aa aaVar = this.f96196a.f96241f;
            if (!(aaVar instanceof AbstractC76443a)) {
                aaVar = null;
            }
            AbstractC76443a aVar = (AbstractC76443a) aaVar;
            if (aVar != null) {
                aVar.mo89687b(i);
            }
        }
    }

    /* renamed from: r */
    private static boolean m82897r(String str) {
        return TextUtils.equals(str, "westwindow");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC41164af(C49812b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: j */
    public final void mo70423j(String str) {
        C89219l.m154721d(str, "");
        mo84691a(mo84738bM(), 3, str);
    }

    /* renamed from: a */
    public static String m82894a(long j) {
        if (j <= 999) {
            return String.valueOf(j);
        }
        String string = C17867d.m33078a().getResources().getString(R.string.h_b);
        C89219l.m154716b(string, "");
        return string;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onStoryCommentBubbleItemClicked(C76594d dVar) {
        C89219l.m154721d(dVar, "");
        if (!this.f114829bd) {
            mo84694a(mo84738bM(), dVar.f171911a, true, "bubble");
        }
    }

    /* renamed from: r */
    private final void m82896r(boolean z) {
        if (mo84730bE()) {
            C49812b bVar = this.f114782aJ;
            C89219l.m154716b(bVar, "");
            if (TextUtils.equals(bVar.getEventType(), "westwindow") && !z) {
                ArrayList arrayList = new ArrayList();
                AbstractC48191b bVar2 = this.f114768W;
                C89219l.m154716b(bVar2, "");
                List<Aweme> e = bVar2.mo80288e();
                C89219l.m154716b(e, "");
                arrayList.addAll(e);
                arrayList.add(m82895bZ());
                this.f114768W.mo80286a(arrayList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public void onCommentListPageDialogEvent(C36389e eVar) {
        C89219l.m154721d(eVar, "");
        Activity activity = this.f183419bv;
        if (activity != null && !activity.isFinishing() && eVar.f86068b == activity.hashCode()) {
            if (eVar.f86067a == 1) {
                this.f96193a = true;
                mo84739bN();
                return;
            }
            this.f96193a = false;
            mo84740bO();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public void onVideoEvent(C49672ag agVar) {
        String str;
        if (agVar != null && 14 == agVar.f114315a) {
            Object obj = agVar.f114316b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Aweme bM = mo84738bM();
            if (bM != null) {
                str = bM.getAid();
            } else {
                str = null;
            }
            if (C13627m.m24499a(str, str2)) {
                mo70389o();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo70419a(boolean z) {
        if (!this.f96193a && !this.f96192F) {
            if (z) {
                mo84739bN();
            } else {
                mo84740bO();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    public void onCommentEvent(C36387c cVar) {
        Integer valueOf;
        String str = null;
        if (cVar != null && (valueOf = Integer.valueOf(cVar.f86061a)) != null) {
            if ((valueOf.intValue() == 3 || valueOf.intValue() == 4 || valueOf.intValue() == 8) && (cVar.f86062b instanceof Object[])) {
                Object obj = cVar.f86062b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    Aweme bM = mo84738bM();
                    if (bM != null) {
                        str = bM.getAid();
                    }
                    if (C13627m.m24499a(str, (String) objArr[0])) {
                        mo70389o();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public void mo59517b(List<Aweme> list, boolean z) {
        super.mo59517b(list, z);
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        String eventType = bVar.getEventType();
        C89219l.m154716b(eventType, "");
        if (m82897r(eventType)) {
            m82896r(z);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public void mo59512a(List<Aweme> list, boolean z) {
        super.mo59512a(list, z);
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        String eventType = bVar.getEventType();
        C89219l.m154716b(eventType, "");
        if (m82897r(eventType)) {
            m82896r(z);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r1.equals("story_archive") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r1.equals("chat_list") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r1.equals("follow_request") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r1.equals("notification_page") != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r3 = true;
     */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70393a(android.view.View r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af.mo70393a(android.view.View, android.os.Bundle):void");
    }
}
