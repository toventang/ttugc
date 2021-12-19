package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71332a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71337b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71339c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71350a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71351b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.C71362e;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a */
public final class C71323a extends FrameLayout implements AbstractC71357c, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C71326b f159841i = new C71326b((byte) 0);

    /* renamed from: a */
    public final RecyclerView f159842a;

    /* renamed from: b */
    final C71351b f159843b;

    /* renamed from: c */
    public final C71332a f159844c;

    /* renamed from: d */
    public final C71339c f159845d;

    /* renamed from: e */
    public final LinearLayoutManager f159846e;

    /* renamed from: f */
    public final int f159847f;

    /* renamed from: g */
    boolean f159848g;

    /* renamed from: h */
    public boolean f159849h;

    /* renamed from: j */
    private final AbstractC89244h f159850j;

    /* renamed from: k */
    private final AbstractC89244h f159851k;

    /* renamed from: l */
    private final C71337b f159852l;

    /* renamed from: m */
    private int f159853m;

    /* renamed from: n */
    private AbstractC71325a f159854n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$a */
    public interface AbstractC71325a {
        static {
            Covode.recordClassIndex(83848);
        }

        /* renamed from: a */
        void mo112807a(User user);
    }

    static {
        Covode.recordClassIndex(83846);
    }

    /* access modifiers changed from: package-private */
    public final HashSet<String> getFetchedUidSet() {
        return (HashSet) this.f159850j.getValue();
    }

    public final C71362e getMSummonFriendSearchPresenter() {
        return (C71362e) this.f159851k.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(138, new RunnableC90250g(C71323a.class, "onSummonFriendClickEvent", C71350a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$b */
    public static final class C71326b {
        static {
            Covode.recordClassIndex(83849);
        }

        private C71326b() {
        }

        public /* synthetic */ C71326b(byte b) {
            this();
        }
    }

    public final AbstractC71325a getCallback() {
        return this.f159854n;
    }

    public final int getFrom() {
        return this.f159853m;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$c */
    static final class C71327c extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C71327c f159856a = new C71327c();

        static {
            Covode.recordClassIndex(83850);
        }

        C71327c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$f */
    static final class C71330f extends AbstractC89220m implements AbstractC89171a<C71362e> {

        /* renamed from: a */
        public static final C71330f f159859a = new C71330f();

        static {
            Covode.recordClassIndex(83853);
        }

        C71330f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71362e invoke() {
            return new C71362e();
        }
    }

    /* renamed from: c */
    private final void m126021c() {
        if (!C89219l.m154714a(this.f159842a.getAdapter(), this.f159852l)) {
            this.f159842a.setAdapter(this.f159852l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo112810a() {
        this.f159843b.mo112836a().mo5534a(new C71329e(this), C1731i.f5564c, null);
    }

    /* renamed from: b */
    public final C67681g mo112813b() {
        return new C67681g(6, null, this.f159845d.f159887c, "at_user", 20, C89070n.m154590j(getFetchedUidSet()));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: i */
    public final void mo112465i() {
        if (this.f159845d.getItemCount() == 0) {
            mo112814b(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: j */
    public final void mo112466j() {
        this.f159848g = false;
        if (this.f159845d.getItemCount() == 0) {
            mo112814b(2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!EventBus.m156962a().mo145393a(this)) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    public final void setCallback(AbstractC71325a aVar) {
        this.f159854n = aVar;
    }

    public final void setFrom(int i) {
        this.f159853m = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$d */
    public static final class C71328d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C71323a f159857a;

        static {
            Covode.recordClassIndex(83851);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71328d(C71323a aVar) {
            this.f159857a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            T t;
            T t2;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (!(!C89219l.m154714a(recyclerView.getAdapter(), this.f159857a.f159845d))) {
                int m = this.f159857a.f159846e.mo4373m();
                int A = this.f159857a.f159846e.mo4685A();
                if (m >= this.f159857a.f159847f && A - m < 8 && (t = this.f159857a.getMSummonFriendSearchPresenter().f159790b) != null && (t2 = t.f159788e) != null && t2.mo106753a()) {
                    C71323a aVar = this.f159857a;
                    if (!aVar.f159848g) {
                        aVar.f159848g = true;
                        aVar.getMSummonFriendSearchPresenter().mo112786a(false, aVar.mo112813b());
                    }
                }
            }
        }
    }

    public final void setSelectedUser$tools_camera_edit_release(User user) {
        this.f159845d.f159889e = user;
        this.f159844c.f159862a = user;
    }

    /* renamed from: a */
    public final void mo112811a(int i) {
        if (!C89219l.m154714a(this.f159842a.getAdapter(), this.f159844c)) {
            this.f159842a.setAdapter(this.f159844c);
        }
        mo112814b(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo112814b(Integer num) {
        if (num != null && num.intValue() == 0) {
            setVisibility(0);
            this.f159849h = false;
            m126021c();
            return;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                m126021c();
                setVisibility(4);
                this.f159849h = false;
                return;
            } else if (num.intValue() == 2) {
                m126021c();
                setVisibility(4);
                this.f159849h = false;
                return;
            }
        }
        setVisibility(0);
        this.f159849h = true;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSummonFriendClickEvent(C71350a aVar) {
        if (aVar != null) {
            if (C89219l.m154714a(this.f159842a.getAdapter(), this.f159844c)) {
                setSelectedUser$tools_camera_edit_release(aVar.f159910a);
                this.f159844c.notifyDataSetChanged();
            } else if (C89219l.m154714a(this.f159842a.getAdapter(), this.f159845d)) {
                setSelectedUser$tools_camera_edit_release(aVar.f159910a);
                this.f159845d.notifyDataSetChanged();
            }
            AbstractC71325a aVar2 = this.f159854n;
            if (aVar2 != null) {
                aVar2.mo112807a(aVar.f159910a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$e */
    public static final class C71329e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71323a f159858a;

        static {
            Covode.recordClassIndex(83852);
        }

        C71329e(C71323a aVar) {
            this.f159858a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            C89219l.m154716b(iVar, "");
            int i = 1;
            if (iVar.mo5539b() || iVar.mo5544c() || !A.mo93903b()) {
                this.f159858a.mo112814b(1);
            } else {
                C71332a aVar = this.f159858a.f159844c;
                C71351b.C71352a.C71353a aVar2 = (C71351b.C71352a.C71353a) iVar.mo5545d();
                aVar.f159866e = aVar2;
                if (aVar2 != null) {
                    aVar.f159863b = aVar2.f159921f;
                    aVar.f159864c = aVar2.f159922g;
                }
                this.f159858a.f159844c.notifyDataSetChanged();
                this.f159858a.f159842a.mo4413b(0);
                C71323a aVar3 = this.f159858a;
                if (aVar3.f159844c.getItemCount() != 0) {
                    i = -1;
                }
                aVar3.mo112811a(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.a$g */
    static final class C71331g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71323a f159860a;

        /* renamed from: b */
        final /* synthetic */ String f159861b;

        static {
            Covode.recordClassIndex(83854);
        }

        C71331g(C71323a aVar, String str) {
            this.f159860a = aVar;
            this.f159861b = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5539b() || iVar.mo5544c()) {
                this.f159860a.mo112814b(0);
            } else {
                this.f159860a.f159845d.f159885a = (List) iVar.mo5545d();
                List list = (List) iVar.mo5545d();
                if (list != null && (!list.isEmpty())) {
                    this.f159860a.mo112812a((Integer) -1);
                }
                this.f159860a.f159845d.notifyDataSetChanged();
                this.f159860a.f159842a.mo4413b(0);
            }
            this.f159860a.getMSummonFriendSearchPresenter().mo112786a(true, this.f159860a.mo112813b());
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C71323a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13194);
        C71351b bVar = new C71351b();
        bVar.f159912a = true;
        this.f159843b = bVar;
        this.f159850j = C89250i.m154773a((AbstractC89171a) C71327c.f159856a);
        this.f159851k = C89250i.m154773a((AbstractC89171a) C71330f.f159859a);
        this.f159852l = new C71337b();
        this.f159844c = new C71332a();
        C71339c cVar = new C71339c();
        this.f159845d = cVar;
        this.f159847f = 8;
        this.f159849h = true;
        View.inflate(context, R.layout.bi_, this);
        View findViewById = findViewById(R.id.dgn);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f159842a = recyclerView;
        cVar.f159888d = new C71339c.AbstractC71340a(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71323a.C713241 */

            /* renamed from: a */
            final /* synthetic */ C71323a f159855a;

            static {
                Covode.recordClassIndex(83847);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3823a.C71339c.AbstractC71340a
            /* renamed from: a */
            public final String mo112825a() {
                return this.f159855a.getMSummonFriendSearchPresenter().f159937a;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f159855a = r1;
            }
        };
        AtFriendHorizontalView$2 atFriendHorizontalView$2 = new AtFriendHorizontalView$2(this, context);
        this.f159846e = atFriendHorizontalView$2;
        recyclerView.setLayoutManager(atFriendHorizontalView$2);
        mo112811a(0);
        mo112810a();
        recyclerView.mo4405a(new C71328d(this));
        MethodCollector.m26664o(13194);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo112812a(Integer num) {
        if (!C89219l.m154714a(this.f159842a.getAdapter(), this.f159845d)) {
            this.f159842a.setAdapter(this.f159845d);
        }
        mo112814b(num);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.p3824b.AbstractC71357c
    /* renamed from: a */
    public final void mo112456a(C67683h hVar) {
        ArrayList arrayList;
        String userId;
        C89219l.m154721d(hVar, "");
        this.f159848g = false;
        if (!TextUtils.isEmpty(this.f159845d.f159887c)) {
            C71339c cVar = this.f159845d;
            List<? extends C67679e> list = hVar.f151688a;
            int i = 1;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    C71351b bVar = this.f159843b;
                    String userId2 = t.f151672g.getUserId();
                    if (userId2 == null) {
                        userId2 = "";
                    }
                    if (!bVar.mo112838a(userId2)) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            cVar.f159886b = arrayList;
            ArrayList arrayList3 = new ArrayList();
            List<? extends C67679e> list2 = hVar.f151688a;
            if (list2 != null) {
                for (T t2 : list2) {
                    if (t2.f151672g.getMentionBlockType() == 1 && (userId = t2.f151672g.getUserId()) != null) {
                        arrayList3.add(userId);
                    }
                }
            }
            C71339c cVar2 = this.f159845d;
            C89219l.m154721d(arrayList3, "");
            cVar2.f159890f = arrayList3;
            this.f159845d.notifyDataSetChanged();
            if (this.f159845d.getItemCount() != 0) {
                i = -1;
            }
            mo112812a(Integer.valueOf(i));
            getFetchedUidSet().addAll(this.f159845d.mo112829a());
        }
    }

    public /* synthetic */ C71323a(Context context, byte b) {
        this(context);
    }
}
