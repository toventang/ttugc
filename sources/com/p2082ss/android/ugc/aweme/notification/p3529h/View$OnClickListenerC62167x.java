package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61558j;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61562n;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61626a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.EnumC61633h;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61619a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationDetailVM;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.EnumC62270m;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62323a;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62340e;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62341f;
import com.p2082ss.android.ugc.aweme.notification.view.template.EnumC62343h;
import com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateBottomView;
import com.p2082ss.android.ugc.aweme.notification.view.template.p3532a.C62324a;
import com.p2082ss.android.ugc.aweme.notification.view.template.p3534c.C62330a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.x */
public final class View$OnClickListenerC62167x extends AbstractC62159w implements View.OnClickListener, AbstractC62027a {

    /* renamed from: a */
    public NotificationDetailVM f141157a;

    /* renamed from: b */
    public final AbstractC89172b<Integer, C89391z> f141158b;

    /* renamed from: c */
    private MusNotice f141159c;

    /* renamed from: d */
    private String f141160d;

    /* renamed from: e */
    private boolean f141161e;

    /* renamed from: f */
    private String f141162f;

    /* renamed from: v */
    private int f141163v;

    /* renamed from: w */
    private String f141164w;

    /* renamed from: x */
    private List<? extends AbstractC62329c> f141165x;

    static {
        Covode.recordClassIndex(72921);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notification.view.template.c>, java.util.List<com.ss.android.ugc.aweme.notification.view.template.c> */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: h */
    public final List<AbstractC62329c> mo100149h() {
        return this.f141165x;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: i */
    public final String mo100089i() {
        return this.f141162f;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: j */
    public final String mo100090j() {
        return this.f141160d;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: k */
    public final boolean mo100091k() {
        return this.f141161e;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: l */
    public final int mo100092l() {
        return this.f141163v;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: m */
    public final String mo100093m() {
        return this.f141164w;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: p */
    public final View.OnLongClickListener mo100096p() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: o */
    public final void mo100095o() {
        mo100168a(EnumC62270m.Click);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.x$a */
    static final class C62168a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62167x f141166a;

        static {
            Covode.recordClassIndex(72922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62168a(View$OnClickListenerC62167x xVar) {
            super(0);
            this.f141166a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f141166a.mo100168a(EnumC62270m.Show);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.x$b */
    static final class C62169b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62167x f141167a;

        static {
            Covode.recordClassIndex(72923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62169b(View$OnClickListenerC62167x xVar) {
            super(0);
            this.f141167a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f141167a.mo100168a(EnumC62270m.Show);
            return C89391z.f203057a;
        }
    }

    /* renamed from: s */
    private final String m112418s() {
        C61630e eVar;
        MusNotice musNotice = this.f141159c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null) {
            return null;
        }
        return eVar.f139892h;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        C61630e eVar;
        MusNotice musNotice = this.f141159c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null || eVar.f139894j) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: r */
    public final void mo100098r() {
        AbstractC89172b<Integer, C89391z> bVar = this.f141158b;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(getAdapterPosition()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w
    /* renamed from: c */
    public final User mo100067c() {
        C61630e eVar;
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        MusNotice musNotice = this.f141159c;
        if (musNotice == null || (eVar = musNotice.templateNotice) == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        BaseNotificationVM baseNotificationVM = this.f140768h;
        if (baseNotificationVM != null) {
            baseNotificationVM.mo100338a(this.f141159c, new C62168a(this));
            return;
        }
        NotificationDetailVM notificationDetailVM = this.f141157a;
        if (notificationDetailVM != null) {
            notificationDetailVM.mo100372a(this.f141159c, new C62169b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: n */
    public final void mo100094n() {
        C61630e eVar;
        Object obj;
        C61626a aVar;
        MusNotice musNotice = this.f141159c;
        if (musNotice != null && (eVar = musNotice.templateNotice) != null) {
            try {
                if (!(eVar.f139885a == null || (aVar = eVar.f139895k) == null || !aVar.f139872a)) {
                    Long l = eVar.f139885a;
                    if (l == null) {
                        C89219l.m154715b();
                    }
                    MusNotificationApiManager.m111993a(l.longValue(), EnumC61633h.NOTICE_ACTION_CLICK, eVar.f139896l);
                }
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            C89379q.m157067boximpl(obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: q */
    public final String mo100097q() {
        C61630e eVar;
        Object obj;
        JSONObject jSONObject;
        C61630e eVar2;
        String str;
        MusNotice musNotice = this.f141159c;
        if (!(musNotice == null || (eVar = musNotice.templateNotice) == null)) {
            if (eVar.f139898n == null) {
                try {
                    MusNotice musNotice2 = this.f141159c;
                    if (musNotice2 == null || (eVar2 = musNotice2.templateNotice) == null || (str = eVar2.f139893i) == null) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    eVar.f139898n = jSONObject.optString("account_type");
                    obj = C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C89379q.m157067boximpl(obj);
            }
            String str2 = eVar.f139898n;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        return "";
    }

    public /* synthetic */ View$OnClickListenerC62167x(View view) {
        this(view, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    /* renamed from: a */
    public final void mo100151a(View view) {
        C89219l.m154721d(view, "");
        mo100094n();
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: d */
    public final void mo100087d(int i) {
        EnumC61551c cVar;
        C61558j e = C62221f.m112529e(i);
        if (e != null) {
            cVar = e.f139729a;
        } else {
            cVar = null;
        }
        if (cVar == EnumC61551c.AfterClick) {
            if (C61542b.m111469c(i)) {
                C61542b.m111470d(i);
                AbstractC81915c.m141874a(new C61562n());
            }
        }
    }

    /* renamed from: b */
    private void m112417b(EnumC62270m mVar) {
        C59256u.EnumC59257a aVar;
        User user;
        JSONObject jSONObject;
        String str;
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        C89219l.m154721d(mVar, "");
        MusNotice musNotice = this.f141159c;
        if (musNotice != null && musNotice.type == 225) {
            C59256u uVar = new C59256u();
            if (mVar == EnumC62270m.Show) {
                aVar = C59256u.EnumC59257a.SHOW;
            } else {
                aVar = C59256u.EnumC59257a.ENTER_PROFILE;
            }
            uVar.f135352b = aVar;
            C59256u a = uVar.mo96834a("notification_page");
            a.f135350a = C59256u.EnumC59259c.INBOX_NOTICE;
            C61630e eVar = musNotice.templateNotice;
            if (eVar == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null) {
                user = null;
            } else {
                user = (User) C89070n.m154583g((List) list);
            }
            C59256u a2 = a.mo96832a(user);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C61630e eVar2 = musNotice.templateNotice;
            if (eVar2 == null || (str = eVar2.f139893i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                        Iterator<String> keys2 = jSONObject2.keys();
                        C89219l.m154716b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            C89219l.m154716b(next2, "");
                            String optString = jSONObject2.optString(next2);
                            C89219l.m154716b(optString, "");
                            linkedHashMap.put(next2, optString);
                        }
                    } else if (!linkedHashMap.containsKey(next)) {
                        C89219l.m154716b(next, "");
                        String optString2 = jSONObject.optString(next);
                        C89219l.m154716b(optString2, "");
                        linkedHashMap.put(next, optString2);
                    }
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            }
            a2.mo96788a(linkedHashMap).mo96792f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        Integer valueOf;
        int i;
        C61630e eVar;
        C61630e eVar2;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            mo100094n();
            C61968c.HandlerC61971c b = C61968c.m112097b();
            if (b != null) {
                b.mo100034b(this.f141159c);
            }
            if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.cv7) {
                MusNotice musNotice = this.f141159c;
                if (!(musNotice == null || (eVar2 = musNotice.templateNotice) == null)) {
                    String s = m112418s();
                    EnumC62343h hVar = EnumC62343h.Root;
                    int i2 = this.f141163v;
                    String str = this.f141164w;
                    String str2 = this.f141160d;
                    String str3 = this.f141162f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C62341f fVar = new C62341f(eVar2, view, s, hVar, i2, str, str2, str3, this.f141161e);
                    List<? extends AbstractC62329c> list = this.f141165x;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (it.next().mo100002a(fVar)) {
                                mo100168a(EnumC62270m.Click);
                                return;
                            }
                        }
                    }
                }
                String s2 = m112418s();
                if (s2 != null) {
                    mo100168a(EnumC62270m.Click);
                    MusNotice musNotice2 = this.f141159c;
                    if (musNotice2 == null || (eVar = musNotice2.templateNotice) == null) {
                        i = -1;
                    } else {
                        i = eVar.f139897m;
                    }
                    mo100087d(i);
                    C36125t a = C36125t.m73591a();
                    C36131u a2 = C36131u.m73602a(s2);
                    C89219l.m154716b(a2, "");
                    C36125t.m73598a(a, C61968c.m112095a(a2, s2).f85356a.mo52126a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo100168a(EnumC62270m mVar) {
        JSONObject jSONObject;
        String str;
        Long l;
        String str2;
        int i;
        Integer num;
        C61630e eVar;
        C61621c cVar;
        C61624f fVar;
        C61619a aVar;
        User c;
        C61630e eVar2;
        String str3;
        C61630e eVar3;
        C61630e eVar4;
        String str4;
        m112417b(mVar);
        try {
            MusNotice musNotice = this.f141159c;
            if (musNotice == null || (eVar4 = musNotice.templateNotice) == null || (str4 = eVar4.f139893i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str4);
            }
            String optString = jSONObject.optString("notification_type");
            if (optString == null) {
                optString = "";
            }
            C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("account_type", jSONObject.optString("account_type")).mo59983a("tab_name", this.f141160d);
            MusNotice musNotice2 = this.f141159c;
            if (musNotice2 != null) {
                str = musNotice2.nid;
            } else {
                str = null;
            }
            C33744d a2 = a.mo59983a("content_id", str).mo59983a("action_type", mVar.getValue()).mo59983a("client_order", String.valueOf(this.f141163v));
            MusNotice musNotice3 = this.f141159c;
            if (musNotice3 == null || (eVar3 = musNotice3.templateNotice) == null) {
                l = null;
            } else {
                l = eVar3.f139887c;
            }
            C33744d a3 = a2.mo59982a("message_time", l);
            MusNotice musNotice4 = this.f141159c;
            if (musNotice4 != null) {
                str2 = musNotice4.templateId;
            } else {
                str2 = null;
            }
            C33744d a4 = a3.mo59983a("template_id", str2);
            MusNotice musNotice5 = this.f141159c;
            if (musNotice5 == null || !musNotice5.hasRead) {
                i = 0;
            } else {
                i = 1;
            }
            C33744d a5 = a4.mo59980a("is_read", i);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                        Iterator<String> keys2 = jSONObject2.keys();
                        C89219l.m154716b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            C89219l.m154716b(next2, "");
                            String optString2 = jSONObject2.optString(next2);
                            C89219l.m154716b(optString2, "");
                            linkedHashMap.put(next2, optString2);
                        }
                    } else if (!linkedHashMap.containsKey(next)) {
                        C89219l.m154716b(next, "");
                        String optString3 = jSONObject.optString(next);
                        C89219l.m154716b(optString3, "");
                        linkedHashMap.put(next, optString3);
                    }
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a5.mo59983a((String) entry.getKey(), (String) entry.getValue());
            }
            String s = m112418s();
            if (s == null) {
                s = "";
            }
            String queryParameter = Uri.parse(s).getQueryParameter("event_keyword");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            if (queryParameter.length() != 0) {
                a5.mo59983a("event_keyword", queryParameter);
            }
            CharSequence charSequence = (CharSequence) linkedHashMap.get("group_id");
            if (!(charSequence == null || charSequence.length() == 0)) {
                MusNotice musNotice6 = this.f141159c;
                if (musNotice6 == null || musNotice6.type != 219) {
                    str3 = UGCMonitor.TYPE_POST;
                } else {
                    str3 = "story";
                }
                a5.mo59983a("story_type", str3);
            }
            String optString4 = jSONObject.optString("from_user_id");
            if (!(optString4 == null || optString4.length() == 0)) {
                a5.mo59983a("from_user_id", jSONObject.optString("from_user_id"));
            }
            MusNotice musNotice7 = this.f141159c;
            if (musNotice7 == null || (eVar2 = musNotice7.templateNotice) == null) {
                num = null;
            } else {
                num = eVar2.f139889e;
            }
            if (num != null && num.intValue() == 216) {
                try {
                    a5.mo59983a("button_type", new JSONObject(jSONObject.optString("business_extra")).optString("button_type"));
                } catch (Exception unused) {
                }
            }
            MusNotice musNotice8 = this.f141159c;
            if (!(musNotice8 == null || (eVar = musNotice8.templateNotice) == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (aVar = fVar.f139870e) == null || aVar.f139831a != 2 || (c = mo100067c()) == null || c.getFollowStatus() != 0)) {
                if (c.getFollowerStatus() == 0) {
                    a5.mo59983a("with_follow_button", "follow");
                } else {
                    a5.mo59983a("with_follow_button", "follow_back");
                }
            }
            if (!this.f141161e) {
                a5.mo59983a("timeline", this.f141164w).mo59983a("is_together", jSONObject.optString("is_together"));
                if (C89219l.m154714a((Object) "official", (Object) optString)) {
                    C39162r.m79460a("official_message_inner_message", a5.f79943a);
                    return;
                }
                a5.mo59983a("group_id", jSONObject.optString("group_id"));
                C39162r.m79460a("notification_message_inner_message", a5.f79943a);
            } else if (C89219l.m154714a((Object) "official", (Object) optString)) {
                C39162r.m79460a("official_message_folded_message", a5.f79943a);
            } else {
                a5.mo59983a("group_id", jSONObject.optString("group_id"));
                View view = this.itemView;
                C89219l.m154716b(view, "");
                a5.mo59983a("button_type", C62265i.m112641a(view.getContext(), mo100067c()));
                C39162r.m79460a("notification_message_folded_message", a5.f79943a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62167x(View view, AbstractC89172b<? super Integer, C89391z> bVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f141158b = bVar;
        this.f141163v = -1;
        this.f141164w = "";
        this.f141165x = C89086z.INSTANCE;
        view.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.cv7);
        C89219l.m154716b(relativeLayout, "");
        C62266j.m112647b(relativeLayout);
        view.setOnLongClickListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: a */
    public final void mo100084a(User user, String str) {
        String str2;
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a("enter_from", "notification_page");
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        C39162r.m79460a("enter_personal_detail", a.mo59983a("to_user_id", str2).mo59983a("enter_method", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: c */
    public final void mo100086c(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C62129p.C62130a.m112360a(str, str2, false, str3, null, 32);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a
    /* renamed from: b */
    public final void mo100085b(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        C89219l.m154721d(textView, "");
        mo100155a(textView, list, num, baseNotice, str);
    }

    /* renamed from: a */
    public final void mo100167a(MusNotice musNotice, int i, String str, String str2, String str3, boolean z, List<? extends AbstractC62329c> list) {
        C61630e eVar;
        AbstractC62323a aVar;
        String str4 = "";
        C89219l.m154721d(musNotice, str4);
        C89219l.m154721d(str, str4);
        C89219l.m154721d(str3, str4);
        C89219l.m154721d(list, str4);
        this.f141159c = musNotice;
        this.f141160d = str2;
        this.f141161e = z;
        this.f141162f = str3;
        this.f141164w = str;
        this.f141163v = i;
        this.f141165x = list;
        View view = this.itemView;
        C89219l.m154716b(view, str4);
        ((AbstractView$OnClickListenerC62342g) view.findViewById(R.id.cun)).mo100307a(musNotice, this);
        View view2 = this.itemView;
        C89219l.m154716b(view2, str4);
        ((AbstractView$OnClickListenerC62342g) view2.findViewById(R.id.cuv)).mo100307a(musNotice, this);
        View view3 = this.itemView;
        C89219l.m154716b(view3, str4);
        ((AbstractView$OnClickListenerC62342g) view3.findViewById(R.id.cv6)).mo100307a(musNotice, this);
        View view4 = this.itemView;
        C89219l.m154716b(view4, str4);
        NoticeTemplateBottomView noticeTemplateBottomView = (NoticeTemplateBottomView) view4.findViewById(R.id.cu5);
        C89219l.m154721d(musNotice, str4);
        C89219l.m154721d(this, str4);
        noticeTemplateBottomView.f141423a = this;
        noticeTemplateBottomView.setVisibility(C62340e.m112762a(musNotice));
        Integer num = null;
        if (noticeTemplateBottomView.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = noticeTemplateBottomView.getLayoutParams();
            layoutParams.height = -2;
            noticeTemplateBottomView.setLayoutParams(layoutParams);
            noticeTemplateBottomView.setAlpha(1.0f);
            C89219l.m154721d(musNotice, str4);
            if (C62340e.m112763a(musNotice, "video_link")) {
                aVar = new C62330a();
            } else if (C62340e.m112764b(musNotice)) {
                aVar = new C62324a();
            } else {
                aVar = null;
            }
            noticeTemplateBottomView.f141424b = aVar;
            AbstractC62323a aVar2 = noticeTemplateBottomView.f141424b;
            if (aVar2 != null) {
                aVar2.mo100316a(musNotice, noticeTemplateBottomView);
            }
        }
        MusNotice musNotice2 = this.f141159c;
        if (musNotice2 != null) {
            int i2 = this.f141163v;
            String str5 = this.f141164w;
            String str6 = this.f141160d;
            String str7 = this.f141162f;
            if (str7 != null) {
                str4 = str7;
            }
            C62339d dVar = new C62339d(musNotice2, i2, str5, str6, str4, this.f141161e);
            Iterator<T> it = this.f141165x.iterator();
            while (it.hasNext()) {
                it.next().mo100001a(dVar);
            }
        }
        MusNotice musNotice3 = this.f141159c;
        if (!(musNotice3 == null || (eVar = musNotice3.templateNotice) == null)) {
            num = eVar.f139889e;
        }
        mo100165a(C89064i.m154489a(new Integer[]{219, 84, 228, 250}, num));
    }
}
