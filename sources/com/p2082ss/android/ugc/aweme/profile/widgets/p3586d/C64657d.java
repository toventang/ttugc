package com.p2082ss.android.ugc.aweme.profile.widgets.p3586d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63800w;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63991at;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.views.ProfileLiveEventView;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d */
public final class C64657d extends AbstractC12769a {

    /* renamed from: l */
    public static final C64659b f146375l = new C64659b((byte) 0);

    /* renamed from: j */
    public String f146376j = "";

    /* renamed from: k */
    public ProfileLiveEventView f146377k;

    /* renamed from: m */
    private final C12786i f146378m = new C12786i(bW_(), new C64658a(this, null));

    /* renamed from: n */
    private long f146379n;

    static {
        Covode.recordClassIndex(76123);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$b */
    public static final class C64659b {
        static {
            Covode.recordClassIndex(76125);
        }

        private C64659b() {
        }

        public /* synthetic */ C64659b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$a */
    public static final class C64658a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146380a;

        /* renamed from: b */
        final /* synthetic */ String f146381b;

        static {
            Covode.recordClassIndex(76124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64658a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146380a = aVar;
            this.f146381b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146380a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146381b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3586d.C64657d.C64658a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$f */
    static final class C64663f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64657d f146387a;

        static {
            Covode.recordClassIndex(76129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64663f(C64657d dVar) {
            super(1);
            this.f146387a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            this.f146387a.mo104163a((List<LiveEventStruct>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$d */
    static final class C64661d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64657d f146385a;

        static {
            Covode.recordClassIndex(76127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64661d(C64657d dVar) {
            super(1);
            this.f146385a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            List<LiveEventStruct> list;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.isBlock)) {
                T t2 = aVar2.f31085a;
                if (t2 != null) {
                    list = t2.getLiveEventStructList();
                } else {
                    list = null;
                }
                this.f146385a.mo104163a(list);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof ProfileLiveEventView)) {
            view = null;
        }
        this.f146377k = (ProfileLiveEventView) view;
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64664e.f146388a, new C64661d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64665f.f146389a, new C64662e(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C64666g.f146390a, new C64663f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$e */
    static final class C64662e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64657d f146386a;

        static {
            Covode.recordClassIndex(76128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64662e(C64657d dVar) {
            super(1);
            this.f146386a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
            if (r1 != null) goto L_0x004b;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.assem.arch.extensions.C12776a<? extends java.lang.Boolean> r6) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.p3586d.C64657d.C64662e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.d.d$c */
    public static final class C64660c implements ProfileLiveEventView.AbstractC64320b {

        /* renamed from: a */
        final /* synthetic */ C64657d f146382a;

        /* renamed from: b */
        final /* synthetic */ List f146383b;

        /* renamed from: c */
        final /* synthetic */ User f146384c;

        static {
            Covode.recordClassIndex(76126);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.views.ProfileLiveEventView.AbstractC64320b
        /* renamed from: a */
        public final void mo103812a(LiveEventStruct liveEventStruct) {
            ActivityC0945e b;
            AbstractC0952i supportFragmentManager;
            User user;
            LiveEventStruct liveEventStruct2;
            C89219l.m154721d(liveEventStruct, "");
            List list = this.f146383b;
            int i = 0;
            boolean z = true;
            if (list == null || list.size() != 1) {
                List list2 = this.f146383b;
                if (!(list2 == null || list2.size() <= 0 || (b = C12777b.m23004b(this.f146382a)) == null || (supportFragmentManager = b.getSupportFragmentManager()) == null)) {
                    User user2 = this.f146384c;
                    List list3 = this.f146383b;
                    C89219l.m154721d(supportFragmentManager, "");
                    C89219l.m154721d(user2, "");
                    C89219l.m154721d(user2, "");
                    C63991at atVar = new C63991at();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("live_event_user", user2);
                    Objects.requireNonNull(list3, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("live_event_list", (Serializable) list3);
                    atVar.setArguments(bundle);
                    new C23226a.C23227a().mo37817a(atVar).mo37812a(1).mo37819a(true).mo37822b(false).f55057a.show(supportFragmentManager, "LiveEventBottomSheetFragment");
                }
            } else {
                C63800w.m115393a(this.f146382a.az_(), liveEventStruct);
            }
            C64615i iVar = (C64615i) C12801d.m23029f(this.f146382a, C89204ab.m154669a(AbstractC64616j.class));
            if (iVar != null && (user = iVar.f146329a) != null) {
                List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
                if (liveEventStructList == null || (liveEventStruct2 = liveEventStructList.get(0)) == null || !liveEventStruct2.isPaidEvent()) {
                    z = false;
                }
                String str = this.f146382a.f146376j;
                List list4 = this.f146383b;
                if (list4 != null) {
                    i = list4.size();
                }
                C64314y.m116182a(str, "click", i, C64314y.m116174a(user), z);
            }
        }

        C64660c(C64657d dVar, List list, User user) {
            this.f146382a = dVar;
            this.f146383b = list;
            this.f146384c = user;
        }
    }

    /* renamed from: a */
    public final void mo104163a(List<LiveEventStruct> list) {
        boolean z;
        String str;
        ProfileLiveEventView profileLiveEventView;
        LiveEventStruct liveEventStruct;
        boolean z2;
        int i;
        LiveEventStruct liveEventStruct2;
        LiveEventStruct liveEventStruct3;
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        User user = null;
        if (iVar != null) {
            user = iVar.f146329a;
        }
        if (list == null || list.isEmpty() || C80580in.m139687c()) {
            z = false;
        } else {
            z = true;
        }
        if (list == null || (liveEventStruct3 = list.get(0)) == null || (str = liveEventStruct3.getId()) == null) {
            str = "";
        }
        this.f146376j = str;
        if (!(user == null || !z || (profileLiveEventView = this.f146377k) == null)) {
            C64660c cVar = new C64660c(this, list, user);
            C89219l.m154721d(cVar, "");
            if (!(list == null || (liveEventStruct = list.get(0)) == null || TextUtils.isEmpty(liveEventStruct.getId()))) {
                TextView textView = profileLiveEventView.f145788b;
                Context context = profileLiveEventView.getContext();
                C89219l.m154716b(context, "");
                Resources resources = context.getResources();
                Object[] objArr = new Object[1];
                String e = C80187aa.C80188a.m139014e(liveEventStruct.getStartTime());
                if (C80471gb.m139483a(profileLiveEventView.getContext())) {
                    e = "‏".concat(String.valueOf(e));
                }
                objArr[0] = e;
                textView.setText(resources.getString(R.string.bpv, objArr));
                profileLiveEventView.f145787a.setOnClickListener(new ProfileLiveEventView.View$OnClickListenerC64321c(cVar, liveEventStruct));
                if (System.currentTimeMillis() - this.f146379n > 500) {
                    List<LiveEventStruct> liveEventStructList = user.getLiveEventStructList();
                    if (liveEventStructList == null || (liveEventStruct2 = liveEventStructList.get(0)) == null) {
                        z2 = false;
                    } else {
                        z2 = liveEventStruct2.isPaidEvent();
                    }
                    String str2 = this.f146376j;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    C64314y.m116182a(str2, "show", i, C64314y.m116174a(user), z2);
                    this.f146379n = System.currentTimeMillis();
                }
                ProfileLiveEventView profileLiveEventView2 = this.f146377k;
                if (profileLiveEventView2 != null) {
                    profileLiveEventView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        ProfileLiveEventView profileLiveEventView3 = this.f146377k;
        if (profileLiveEventView3 != null) {
            profileLiveEventView3.setVisibility(8);
        }
    }
}
