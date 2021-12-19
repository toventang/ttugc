package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.DmViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatDiggLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80274bu;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d */
public final class C54252d implements AbstractC54262f {

    /* renamed from: m */
    public static final C54256a f124278m = new C54256a((byte) 0);

    /* renamed from: a */
    public final AppCompatImageView f124279a;

    /* renamed from: b */
    public final TuxTextView f124280b;

    /* renamed from: c */
    public final Context f124281c;

    /* renamed from: d */
    public final C54246a f124282d;

    /* renamed from: e */
    public final RecyclerView f124283e;

    /* renamed from: f */
    public final String f124284f = C55197c.m100919b().toString();

    /* renamed from: g */
    public final Map<String, C54251c> f124285g = new LinkedHashMap();

    /* renamed from: h */
    public C19538ai f124286h;

    /* renamed from: i */
    public boolean f124287i;

    /* renamed from: j */
    public AnimatorSet f124288j;

    /* renamed from: k */
    public final View f124289k;

    /* renamed from: l */
    public final int f124290l;

    /* renamed from: o */
    private ChatDiggLayout f124291o;

    /* renamed from: p */
    private final AbstractC89244h f124292p = C89250i.m154773a((AbstractC89171a) C54260e.f124301a);

    /* renamed from: q */
    private final int[] f124293q;

    /* renamed from: r */
    private final AbstractC89172b<Boolean, C89391z> f124294r;

    static {
        Covode.recordClassIndex(63942);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$a */
    public static final class C54256a {
        static {
            Covode.recordClassIndex(63946);
        }

        private C54256a() {
        }

        public /* synthetic */ C54256a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private boolean m99504d() {
        if (this.f124285g.get(this.f124284f) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m99505e() {
        this.f124279a.setOnClickListener(new View$OnClickListenerC54257b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$e */
    static final class C54260e extends AbstractC89220m implements AbstractC89171a<IMUser> {

        /* renamed from: a */
        public static final C54260e f124301a = new C54260e();

        static {
            Covode.recordClassIndex(63950);
        }

        C54260e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IMUser invoke() {
            IMUser fromUser;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            User currentUser = createIUserServicebyMonsterPlugin.getCurrentUser();
            if (currentUser == null || (fromUser = IMUser.fromUser(currentUser)) == null) {
                return null;
            }
            return fromUser;
        }
    }

    /* renamed from: c */
    private final boolean m99503c() {
        C19538ai aiVar = this.f124286h;
        if (aiVar == null) {
            return false;
        }
        C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(aiVar.getConversationId());
        if (a == null) {
            return true;
        }
        if (!a.isGroupChat()) {
            return false;
        }
        if (!a.isMember() || a.isDissolved()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.AbstractC54262f
    /* renamed from: a */
    public final void mo91335a() {
        mo91341b();
        this.f124289k.setVisibility(0);
        AppCompatImageView appCompatImageView = this.f124279a;
        C89219l.m154716b(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        C19538ai aiVar = this.f124286h;
        if (aiVar != null) {
            C89219l.m154721d(aiVar, "");
            C39162r.m79460a("like_message_show", C54261e.m99515a(aiVar).f79943a);
        }
        if (C54881c.m100499c()) {
            AnimatorSet animatorSet = this.f124288j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f124288j = null;
            TuxTextView tuxTextView = this.f124280b;
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.f124279a;
            C89219l.m154716b(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(200L);
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f124279a, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f124280b, "alpha", 0.0f, 1.0f));
            animatorSet2.start();
        }
        AppCompatImageView appCompatImageView3 = this.f124279a;
        C89219l.m154716b(appCompatImageView3, "");
        appCompatImageView3.setSelected(false);
        this.f124279a.setImageDrawable(C0643b.m2369a(this.f124281c, 2131232248));
        m99505e();
    }

    /* renamed from: b */
    public final void mo91341b() {
        this.f124289k.setVisibility(8);
        TuxTextView tuxTextView = this.f124280b;
        C89219l.m154716b(tuxTextView, "");
        if (tuxTextView.getVisibility() == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f124279a, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f124280b, "alpha", 1.0f, 0.0f));
            animatorSet.addListener(new C54259d(this));
            animatorSet.start();
            this.f124288j = animatorSet;
        } else {
            AppCompatImageView appCompatImageView = this.f124279a;
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            TuxTextView tuxTextView2 = this.f124280b;
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        this.f124282d.mo91334a();
        AbstractC89172b<Boolean, C89391z> bVar = this.f124294r;
        if (bVar != null) {
            bVar.invoke(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$c */
    public static final class C54258c implements AbstractC19479b<C19587an> {

        /* renamed from: a */
        final /* synthetic */ C19538ai f124299a;

        static {
            Covode.recordClassIndex(63948);
        }

        C54258c(C19538ai aiVar) {
            this.f124299a = aiVar;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C89219l.m154721d(uVar, "");
            C56244a.m102191c("DmHelper", "addProperty " + this.f124299a.getUuid() + " onFailure");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19587an anVar) {
            C89219l.m154721d(anVar, "");
            C56244a.m102191c("DmHelper", "addProperty " + this.f124299a.getUuid() + " onSuccess");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$d */
    public static final class C54259d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C54252d f124300a;

        static {
            Covode.recordClassIndex(63949);
        }

        C54259d(C54252d dVar) {
            this.f124300a = dVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AppCompatImageView appCompatImageView = this.f124300a.f124279a;
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            TuxTextView tuxTextView = this.f124300a.f124280b;
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            this.f124300a.f124288j = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.AbstractC54262f
    /* renamed from: a */
    public final void mo91338a(ChatDiggLayout chatDiggLayout) {
        C89219l.m154721d(chatDiggLayout, "");
        this.f124291o = chatDiggLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.d$b */
    public static final class View$OnClickListenerC54257b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54252d f124298a;

        static {
            Covode.recordClassIndex(63947);
        }

        View$OnClickListenerC54257b(C54252d dVar) {
            this.f124298a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C55232u.m101003a(view, 1000)) {
                this.f124298a.mo91339a(null, null, false);
            }
        }
    }

    /* renamed from: b */
    private final void m99502b(boolean z) {
        if (!z) {
            this.f124285g.remove(this.f124284f);
        } else {
            m99501a((IMUser) this.f124292p.getValue());
        }
        mo91340a(this.f124287i);
    }

    /* renamed from: a */
    private final void m99501a(IMUser iMUser) {
        if (iMUser != null) {
            String uid = iMUser.getUid();
            if (uid == null) {
                C56244a.m102192d("DmHelper", "putItemToItemsMapSafely-> uid is null->".concat(String.valueOf(iMUser)));
            } else {
                this.f124285g.put(uid, new C54251c(0, iMUser, 0, 5));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo91340a(boolean z) {
        String str;
        Collection<C54251c> values = this.f124285g.values();
        if (values.isEmpty()) {
            C19538ai aiVar = this.f124286h;
            if (aiVar != null) {
                Integer.valueOf(aiVar.getMsgType());
            }
            if (C54881c.f125657b.mo91895a(z)) {
                mo91335a();
            } else {
                mo91341b();
            }
        } else {
            AppCompatImageView appCompatImageView = this.f124279a;
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setSelected(false);
            this.f124289k.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.f124279a;
            C89219l.m154716b(appCompatImageView2, "");
            appCompatImageView2.setVisibility(0);
            TuxTextView tuxTextView = this.f124280b;
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            C54246a aVar = this.f124282d;
            C89219l.m154721d(values, "");
            List j = C89070n.m154590j(values);
            int size = values.size();
            if (size > 3) {
                j = C89070n.m154554a((Collection) j.subList(0, 3), (Object) new C54251c(1, null, size - 3, 2));
            }
            C1445j.C1450d a = C1445j.m4922a(new C80274bu(aVar.f124269a, j), true);
            C89219l.m154716b(a, "");
            aVar.f124269a.clear();
            C89070n.m154535a((Collection) aVar.f124269a, (Iterable) j);
            a.mo4951a(aVar);
            Iterator<C54251c> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    IMUser iMUser = it.next().f124276b;
                    if (iMUser != null) {
                        str = iMUser.getUid();
                    } else {
                        str = null;
                    }
                    if (C89219l.m154714a((Object) str, (Object) this.f124284f)) {
                        AppCompatImageView appCompatImageView3 = this.f124279a;
                        C89219l.m154716b(appCompatImageView3, "");
                        appCompatImageView3.setSelected(true);
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f124279a.setImageDrawable(C0643b.m2369a(this.f124281c, (int) R.drawable.aq5));
            m99505e();
            AbstractC89172b<Boolean, C89391z> bVar = this.f124294r;
            if (bVar != null) {
                bVar.invoke(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.AbstractC54262f
    /* renamed from: a */
    public final void mo91336a(float f, float f2) {
        mo91339a(Float.valueOf(f), Float.valueOf(f2), true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.AbstractC54262f
    /* renamed from: a */
    public final void mo91337a(C19538ai aiVar, boolean z) {
        List<C19536ag> list;
        C89219l.m154721d(aiVar, "");
        this.f124286h = aiVar;
        this.f124287i = z;
        Map<String, List<C19536ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
        this.f124285g.clear();
        if (!(propertyItemListMap == null || (list = propertyItemListMap.get("e:love")) == null)) {
            for (T t : list) {
                IMUser b = C55085g.m100757b(t.idempotent_id, t.sec_uid);
                if (b != null) {
                    m99501a(b);
                }
            }
        }
        mo91340a(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54252d(View view, int i, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(view, "");
        this.f124289k = view;
        this.f124290l = i;
        this.f124294r = bVar;
        this.f124279a = (AppCompatImageView) view.findViewById(R.id.an0);
        this.f124280b = (TuxTextView) view.findViewById(R.id.ao1);
        Context context = view.getContext();
        this.f124281c = context;
        C89219l.m154716b(context, "");
        C54246a aVar = new C54246a(context);
        this.f124282d = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.do7);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
        recyclerView.setItemAnimator(new C1434i());
        this.f124283e = recyclerView;
        view.postDelayed(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.C54252d.RunnableC542531 */

            /* renamed from: a */
            final /* synthetic */ C54252d f124295a;

            static {
                Covode.recordClassIndex(63943);
            }

            {
                this.f124295a = r1;
            }

            public final void run() {
                DmViewModel a;
                C1213t<Boolean> b;
                LiveData liveData;
                DmViewModel a2 = DmViewModel.C54241a.m99497a(this.f124295a.f124281c);
                if (!(a2 == null || (liveData = (LiveData) a2.f124261b.getValue()) == null)) {
                    Context context = this.f124295a.f124281c;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    liveData.observe((AbstractC1204m) context, new AbstractC1214u(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.C54252d.RunnableC542531.C542541 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC542531 f124296a;

                        static {
                            Covode.recordClassIndex(63944);
                        }

                        {
                            this.f124296a = r1;
                        }

                        @Override // androidx.lifecycle.AbstractC1214u
                        public final /* synthetic */ void onChanged(Object obj) {
                            C19538ai aiVar;
                            String uuid;
                            C89378p pVar = (C89378p) obj;
                            if (pVar != null && (aiVar = this.f124296a.f124295a.f124286h) != null && (uuid = aiVar.getUuid()) != null && ((String) pVar.getFirst()).equals(uuid)) {
                                if (((Boolean) pVar.getSecond()).booleanValue()) {
                                    this.f124296a.f124295a.mo91341b();
                                } else {
                                    this.f124296a.f124295a.mo91340a(this.f124296a.f124295a.f124287i);
                                }
                            }
                        }
                    });
                }
                if (C54881c.m100499c() && (a = DmViewModel.C54241a.m99497a(this.f124295a.f124281c)) != null && (b = a.mo91333b()) != null) {
                    Context context2 = this.f124295a.f124281c;
                    Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                    b.observe((AbstractC1204m) context2, new AbstractC1214u(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.C54252d.RunnableC542531.C542552 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC542531 f124297a;

                        static {
                            Covode.recordClassIndex(63945);
                        }

                        {
                            this.f124297a = r1;
                        }

                        @Override // androidx.lifecycle.AbstractC1214u
                        public final /* synthetic */ void onChanged(Object obj) {
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                bool.booleanValue();
                                TuxTextView tuxTextView = this.f124297a.f124295a.f124280b;
                                C89219l.m154716b(tuxTextView, "");
                                tuxTextView.setVisibility(8);
                            }
                        }
                    });
                }
            }
        }, 20);
        this.f124293q = new int[2];
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r10 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r9 != null) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91339a(java.lang.Float r9, java.lang.Float r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui.C54252d.mo91339a(java.lang.Float, java.lang.Float, boolean):void");
    }
}
