package com.p2082ss.android.ugc.aweme.story.feed.common.p4045b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77188a;
import com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b;
import com.p2082ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.p2082ss.android.ugc.aweme.story.feed.p4046ui.progress.StoryListProgressBar;
import com.p2082ss.android.ugc.aweme.story.p4019b.AbstractC76591a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76600j;
import com.p2082ss.android.ugc.aweme.story.p4019b.EnumC76597g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.publish.C77428e;
import com.p2082ss.android.ugc.aweme.story.publish.C77429f;
import com.p2082ss.android.ugc.aweme.story.publish.C77444g;
import com.p2082ss.android.ugc.aweme.story.publish.C77445h;
import com.p2082ss.android.ugc.aweme.story.publish.EnumC77446i;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.a */
public final class C77191a extends AbstractC77190b {

    /* renamed from: i */
    public final ViewGroup f173174i;

    /* renamed from: j */
    private View f173175j;

    /* renamed from: k */
    private final HashMap<String, Float> f173176k = new HashMap<>();

    /* renamed from: l */
    private final HashMap<String, EnumC77199d> f173177l = new HashMap<>();

    /* renamed from: m */
    private String f173178m = "";

    /* renamed from: n */
    private int f173179n;

    /* renamed from: o */
    private int f173180o = -1;

    /* renamed from: p */
    private Aweme f173181p;

    static {
        Covode.recordClassIndex(90203);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: g */
    public final void mo120807g() {
        StoryFeedViewModel c = mo120810c();
        c.mo60189a("UPLOADING_USER_STORY_PROGRESS", (AbstractC1214u<C33942b>) this);
        c.mo60189a("UPLOADING_USER_STORY_SUCCESS", (AbstractC1214u<C33942b>) this);
        c.mo60189a("UPLOADING_USER_STORY_FAIL", (AbstractC1214u<C33942b>) this);
        c.mo60189a("UPLOADING_LOCAL_VIDEO_READY", (AbstractC1214u<C33942b>) this);
        c.mo60189a("UPLOADING_USER_STORY_ALL_SUCCESS", (AbstractC1214u<C33942b>) this);
        this.f173174i.setVisibility(8);
        View a = C1764a.m5927a(LayoutInflater.from(mo120812e()), R.layout.b29, this.f173174i, true);
        C89219l.m154716b(a, "");
        this.f173175j = a;
        if (a == null) {
            C89219l.m154710a("uploadingBar");
        }
        ((TuxTextView) a.findViewById(R.id.djd)).setOnClickListener(new View$OnClickListenerC77192a(this));
        View view = this.f173175j;
        if (view == null) {
            C89219l.m154710a("uploadingBar");
        }
        ((TuxIconView) view.findViewById(R.id.fjv)).setOnClickListener(new View$OnClickListenerC77193b(this));
    }

    public C77191a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f173174i = viewGroup;
    }

    /* renamed from: a */
    private final void m134960a(String str) {
        String str2;
        Aweme aweme = this.f173181p;
        if (aweme != null) {
            str2 = aweme.getScheduleId();
        } else {
            str2 = null;
        }
        if (!C89219l.m154714a((Object) str2, (Object) str)) {
            C76598h.m134187c(C77429f.m135382f(str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: a */
    public final void mo120804a(int i) {
        View view = this.f173175j;
        if (view == null) {
            C89219l.m154710a("uploadingBar");
        }
        view.setVisibility(8);
        this.f173180o = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.a$b */
    static final class View$OnClickListenerC77193b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77191a f173183a;

        static {
            Covode.recordClassIndex(90205);
        }

        View$OnClickListenerC77193b(C77191a aVar) {
            this.f173183a = aVar;
        }

        public final void onClick(View view) {
            String scheduleId;
            ClickAgent.onClick(view);
            final Aweme c = this.f173183a.mo120808a().mo80287c(this.f173183a.mo120809b().getCurrentItem());
            if (C76706a.m134282h(c) && c != null && (scheduleId = c.getScheduleId()) != null && scheduleId.length() != 0) {
                if (c != null) {
                    c.getScheduleId();
                }
                ((C23023b) C23028c.m43435a(C23013a.C23015a.m43405a(this.f173183a.mo120812e()).mo37413d(this.f173183a.mo120812e().getString(R.string.b5k)), new AbstractC89172b<C23025b, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.story.feed.common.p4045b.C77191a.View$OnClickListenerC77193b.C771941 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC77193b f173184a;

                    static {
                        Covode.recordClassIndex(90206);
                    }

                    {
                        this.f173184a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        String string = this.f173184a.f173183a.mo120812e().getString(R.string.j);
                        C89219l.m154716b(string, "");
                        bVar2.mo37417a(string, (AbstractC89172b<? super C23024a, C89391z>) null);
                        String string2 = this.f173184a.f173183a.mo120812e().getString(R.string.as0);
                        C89219l.m154716b(string2, "");
                        bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.story.feed.common.p4045b.C77191a.View$OnClickListenerC77193b.C771941.C771951 */

                            /* renamed from: a */
                            final /* synthetic */ C771941 f173186a;

                            static {
                                Covode.recordClassIndex(90207);
                            }

                            {
                                this.f173186a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                Aweme aweme = c;
                                if (aweme == null) {
                                    C89219l.m154715b();
                                }
                                String f = C77429f.m135382f(aweme.getScheduleId());
                                String str = this.f173186a.f173184a.f173183a.mo120811d().f173159h;
                                C89219l.m154716b(str, "");
                                C76598h.m134182a(f, str, "cancel");
                                AbstractC77188a d = this.f173186a.f173184a.f173183a.mo120811d();
                                String aid = c.getAid();
                                C89219l.m154716b(aid, "");
                                d.mo80271b(aid);
                                this.f173186a.f173184a.f173183a.mo120808a().getCount();
                                StoryListProgressBar storyListProgressBar = this.f173186a.f173184a.f173183a.f173171f;
                                if (storyListProgressBar == null) {
                                    C89219l.m154710a("progressBar");
                                }
                                storyListProgressBar.mo120843a(this.f173186a.f173184a.f173183a.mo120808a().getCount());
                                String scheduleId = c.getScheduleId();
                                C89219l.m154716b(scheduleId, "");
                                C89219l.m154721d(scheduleId, "");
                                C77445h.f173768a.removePublishTask(scheduleId);
                                return C89391z.f203057a;
                            }
                        });
                        return C89391z.f203057a;
                    }
                }).mo37482a(false)).mo37405a().mo37396b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.b.a$a */
    static final class View$OnClickListenerC77192a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77191a f173182a;

        static {
            Covode.recordClassIndex(90204);
        }

        View$OnClickListenerC77192a(C77191a aVar) {
            this.f173182a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme c = this.f173182a.mo120808a().mo80287c(this.f173182a.mo120809b().getCurrentItem());
            if (C76706a.m134282h(c) && c != null) {
                String scheduleId = c.getScheduleId();
                int i = 0;
                if (scheduleId != null && scheduleId.length() != 0) {
                    if (c != null) {
                        c.getScheduleId();
                    } else {
                        C89219l.m154715b();
                    }
                    String scheduleId2 = c.getScheduleId();
                    C89219l.m154716b(scheduleId2, "");
                    C89219l.m154721d(scheduleId2, "");
                    C77444g c2 = C77429f.m135377c(scheduleId2);
                    if (c2 != null && c2.f173767b.f173722b == EnumC77446i.FAILED && C77445h.f173768a.retryPublish(scheduleId2)) {
                        c2.f173767b.f173721a = 0.0f;
                        c2.f173767b.mo121053a("");
                        c2.f173767b.mo121052a(EnumC77446i.UPLOADING);
                        C77429f.f173730e = true;
                        List<C77444g> list = C77429f.f173731f;
                        if (list == null) {
                            i = 1;
                        } else if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if (it.next().f173767b.f173722b == EnumC77446i.UPLOADING && (i = i + 1) < 0) {
                                    C89070n.m154523b();
                                }
                            }
                        }
                        C77429f.f173729d = i;
                    }
                    String f = C77429f.m135382f(c.getScheduleId());
                    String str = this.f173182a.mo120811d().f173159h;
                    C89219l.m154716b(str, "");
                    C76598h.m134182a(f, str, "publish");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: b */
    public final void mo120806b(int i) {
        Aweme c = mo120808a().mo80287c(i);
        if (c != null) {
            String scheduleId = c.getScheduleId();
            if (scheduleId == null) {
                scheduleId = "";
            }
            C89219l.m154721d(scheduleId, "");
            List<C77444g> list = C77429f.f173731f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (TextUtils.equals(scheduleId, next.f173766a.getScheduleId())) {
                        C77428e eVar = next.f173767b;
                        if (eVar != null) {
                            int i2 = C77196b.f173187a[eVar.f173722b.ordinal()];
                            if (i2 == 1) {
                                View view = this.f173175j;
                                if (view == null) {
                                    C89219l.m154710a("uploadingBar");
                                }
                                C77197c.m134965a(view, EnumC77199d.UPLOADING, eVar.f173721a, null);
                            } else if (i2 != 2) {
                                View view2 = this.f173175j;
                                if (view2 == null) {
                                    C89219l.m154710a("uploadingBar");
                                }
                                view2.setVisibility(8);
                            } else {
                                View view3 = this.f173175j;
                                if (view3 == null) {
                                    C89219l.m154710a("uploadingBar");
                                }
                                C77197c.m134965a(view3, EnumC77199d.UPLOAD_FAIL, 0.0f, eVar.f173723c);
                                m134960a(c.getScheduleId());
                            }
                        }
                    }
                }
            }
        } else {
            c = null;
        }
        this.f173181p = c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        int i;
        C33942b bVar2 = bVar;
        if (mo120811d().f173157f != null) {
            String str2 = null;
            if (bVar2 != null && (str = bVar2.f80277a) != null) {
                switch (str.hashCode()) {
                    case -208800987:
                        if (str.equals("UPLOADING_USER_STORY_ALL_SUCCESS")) {
                            if (((Integer) bVar2.mo60212a()).intValue() > 1) {
                                i = R.string.h3s;
                            } else {
                                i = R.string.g5k;
                            }
                            C48238ce ceVar = this.f173172g;
                            if (ceVar == null) {
                                C89219l.m154710a("params");
                            }
                            new C23144b(ceVar.f111746c).mo37640e(i).mo37637b();
                            return;
                        }
                        return;
                    case 271694622:
                        if (str.equals("UPLOADING_USER_STORY_FAIL")) {
                            C89378p pVar = (C89378p) bVar2.mo60212a();
                            String str3 = (String) pVar.component1();
                            String str4 = (String) pVar.component2();
                            this.f173177l.put(str3, EnumC77199d.UPLOAD_FAIL);
                            Aweme c = mo120808a().mo80287c(mo120809b().getCurrentItem());
                            if (C76706a.m134282h(c)) {
                                if (C89361p.m154872a(str3, c != null ? c.getScheduleId() : null, true)) {
                                    View view = this.f173175j;
                                    if (view == null) {
                                        C89219l.m154710a("uploadingBar");
                                    }
                                    C77197c.m134965a(view, EnumC77199d.UPLOAD_FAIL, 0.0f, str4);
                                    if (c != null) {
                                        str2 = c.getScheduleId();
                                    }
                                    m134960a(str2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 1555587043:
                        if (str.equals("UPLOADING_USER_STORY_SUCCESS")) {
                            C89378p pVar2 = (C89378p) bVar2.mo60212a();
                            Object first = pVar2.getFirst();
                            Object second = pVar2.getSecond();
                            this.f173176k.put(first, Float.valueOf(1.0f));
                            this.f173177l.put(first, EnumC77199d.UPLOAD_SUCCESS);
                            Aweme c2 = mo120808a().mo80287c(mo120809b().getCurrentItem());
                            if (!C76706a.m134282h(c2)) {
                                String authorUid = c2 != null ? c2.getAuthorUid() : null;
                                User b = C80580in.m139683b();
                                C89219l.m154716b(b, "");
                                if (!C89361p.m154872a(authorUid, b.getUid(), true)) {
                                    return;
                                }
                            }
                            List<Aweme> e = mo120808a().mo80288e();
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) e, 10));
                            for (T t : e) {
                                if (C76706a.m134282h(t) && C89219l.m154714a((Object) t.getScheduleId(), first)) {
                                    t = (T) second;
                                }
                                arrayList.add(t);
                            }
                            mo120808a().mo80286a(arrayList);
                            mo120811d().mo120795a(mo120809b().getCurrentItem(), false);
                            mo120811d().mo120796a(EnumC76597g.ON_PUBLISH_SUCCESS, (AbstractC76591a) null);
                            return;
                        }
                        return;
                    case 2005298957:
                        if (str.equals("UPLOADING_LOCAL_VIDEO_READY")) {
                            String str5 = (String) bVar2.mo60212a();
                            int currentItem = mo120809b().getCurrentItem();
                            Aweme c3 = mo120808a().mo80287c(currentItem);
                            if (C76706a.m134282h(c3)) {
                                if (c3 != null) {
                                    str2 = c3.getScheduleId();
                                }
                                if (C89361p.m154872a(str5, str2, true)) {
                                    AbstractC48149ai aiVar = mo120811d().f173153b;
                                    if (aiVar != null) {
                                        aiVar.mo80114a(c3, this.f173180o);
                                    }
                                    AbstractC77188a d = mo120811d();
                                    EnumC76597g gVar = EnumC76597g.ON_PAGE_SELECTED;
                                    if (c3 == null) {
                                        C89219l.m154715b();
                                    }
                                    d.mo120796a(gVar, new C76600j(c3, mo120811d().f173155d, currentItem, mo120808a().getCount(), false));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 2025168429:
                        if (str.equals("UPLOADING_USER_STORY_PROGRESS")) {
                            C89378p pVar3 = (C89378p) bVar2.mo60212a();
                            String str6 = (String) pVar3.getFirst();
                            float floatValue = ((Number) pVar3.getSecond()).floatValue();
                            this.f173176k.put(str6, Float.valueOf(floatValue));
                            this.f173177l.put(str6, EnumC77199d.UPLOADING);
                            Aweme c4 = mo120808a().mo80287c(mo120809b().getCurrentItem());
                            if (C76706a.m134282h(c4)) {
                                if (C89361p.m154872a(str6, c4 != null ? c4.getScheduleId() : null, true)) {
                                    View view2 = this.f173175j;
                                    if (view2 == null) {
                                        C89219l.m154710a("uploadingBar");
                                    }
                                    C77197c.m134965a(view2, EnumC77199d.UPLOADING, floatValue, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.feed.common.AbstractC77190b
    /* renamed from: a */
    public final void mo120805a(Aweme aweme, int i) {
        C89219l.m154721d(aweme, "");
        mo120810c();
        this.f173178m = StoryFeedViewModel.m134856a(aweme);
        this.f173179n = i;
    }
}
