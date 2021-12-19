package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C47035m;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63765ad;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cz */
public final class C64135cz {

    /* renamed from: b */
    public static final C64136a f145491b = new C64136a((byte) 0);

    /* renamed from: a */
    public final View f145492a;

    /* renamed from: c */
    private final AbstractC89244h f145493c = C89250i.m154773a((AbstractC89171a) new C64139d(this));

    /* renamed from: d */
    private final AbstractC89244h f145494d = C89250i.m154773a((AbstractC89171a) new C64140e(this));

    /* renamed from: e */
    private final AbstractC89244h f145495e = C89250i.m154773a((AbstractC89171a) new C64145j(this));

    /* renamed from: f */
    private final AbstractC89244h f145496f = C89250i.m154773a((AbstractC89171a) new C64138c(this));

    /* renamed from: g */
    private final AbstractC89244h f145497g = C89250i.m154773a((AbstractC89171a) new C64144i(this));

    /* renamed from: h */
    private final AbstractC89244h f145498h = C89250i.m154773a((AbstractC89171a) new C64141f(this));

    /* renamed from: i */
    private final AbstractC89244h f145499i = C89250i.m154773a((AbstractC89171a) new C64143h(this));

    /* renamed from: j */
    private final AbstractC89244h f145500j = C89250i.m154773a((AbstractC89171a) new C64142g(this));

    /* renamed from: k */
    private final AbstractC89244h f145501k = C89250i.m154773a((AbstractC89171a) new C64137b(this));

    static {
        Covode.recordClassIndex(75579);
    }

    /* renamed from: a */
    private static boolean m116057a(int i, int i2) {
        return i == 0 && i2 == 1;
    }

    /* renamed from: g */
    private final View m116058g() {
        return (View) this.f145498h.getValue();
    }

    /* renamed from: h */
    private final TextView m116059h() {
        return (TextView) this.f145499i.getValue();
    }

    /* renamed from: i */
    private final DmtButton m116060i() {
        return (DmtButton) this.f145500j.getValue();
    }

    /* renamed from: a */
    public final View mo103736a() {
        return (View) this.f145493c.getValue();
    }

    /* renamed from: b */
    public final View mo103738b() {
        return (View) this.f145494d.getValue();
    }

    /* renamed from: c */
    public final TuxButton mo103739c() {
        return (TuxButton) this.f145495e.getValue();
    }

    /* renamed from: d */
    public final TextView mo103740d() {
        return (TextView) this.f145496f.getValue();
    }

    /* renamed from: e */
    public final TextView mo103741e() {
        return (TextView) this.f145497g.getValue();
    }

    /* renamed from: f */
    public final ImageView mo103742f() {
        return (ImageView) this.f145501k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$a */
    public static final class C64136a {
        static {
            Covode.recordClassIndex(75580);
        }

        private C64136a() {
        }

        public /* synthetic */ C64136a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m116068a(User user) {
            C89219l.m154721d(user, "");
            if (user.getAccountType() != 3 || user.isSecret() || user.getBizAccountInfo() == null || !user.getBizAccountInfo().enableDM()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$b */
    static final class C64137b extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145502a;

        static {
            Covode.recordClassIndex(75581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64137b(C64135cz czVar) {
            super(0);
            this.f145502a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f145502a.f145492a.findViewById(R.id.amz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$c */
    static final class C64138c extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145503a;

        static {
            Covode.recordClassIndex(75582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64138c(C64135cz czVar) {
            super(0);
            this.f145503a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f145503a.f145492a.findViewById(R.id.d7l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$d */
    static final class C64139d extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145504a;

        static {
            Covode.recordClassIndex(75583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64139d(C64135cz czVar) {
            super(0);
            this.f145504a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f145504a.f145492a.findViewById(R.id.b6o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$e */
    static final class C64140e extends AbstractC89220m implements AbstractC89171a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145505a;

        static {
            Covode.recordClassIndex(75584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64140e(C64135cz czVar) {
            super(0);
            this.f145505a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RelativeLayout invoke() {
            return this.f145505a.f145492a.findViewById(R.id.b6p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$f */
    static final class C64141f extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145506a;

        static {
            Covode.recordClassIndex(75585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64141f(C64135cz czVar) {
            super(0);
            this.f145506a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f145506a.f145492a.findViewById(R.id.bxw);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$g */
    static final class C64142g extends AbstractC89220m implements AbstractC89171a<DmtButton> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145507a;

        static {
            Covode.recordClassIndex(75586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64142g(C64135cz czVar) {
            super(0);
            this.f145507a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtButton invoke() {
            return this.f145507a.f145492a.findViewById(R.id.cpd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$h */
    static final class C64143h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145508a;

        static {
            Covode.recordClassIndex(75587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64143h(C64135cz czVar) {
            super(0);
            this.f145508a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f145508a.f145492a.findViewById(R.id.ewa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$i */
    static final class C64144i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145509a;

        static {
            Covode.recordClassIndex(75588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64144i(C64135cz czVar) {
            super(0);
            this.f145509a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f145509a.f145492a.findViewById(R.id.diy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.cz$j */
    static final class C64145j extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ C64135cz f145510a;

        static {
            Covode.recordClassIndex(75589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64145j(C64135cz czVar) {
            super(0);
            this.f145510a = czVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f145510a.f145492a.findViewById(R.id.dvl);
        }
    }

    public C64135cz(View view) {
        C89219l.m154721d(view, "");
        this.f145492a = view;
    }

    /* renamed from: a */
    public static void m116056a(int i, User user, boolean z) {
        if (user != null) {
            String uid = user.getUid();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!TextUtils.equals(uid, g.getCurUserId())) {
                boolean z2 = false;
                IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
                if (createIMainServiceHelperbyMonsterPlugin != null && !createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16()) {
                    if (C16048b.m29633a().mo25421a(true, "hide_profile_message_button", false) && !user.isShowMessageButton()) {
                        return;
                    }
                    if (!C47035m.m90295b() || !C64136a.m116068a(user)) {
                        if (((i == 1 || i == 2) && !z) || (i == 0 && z)) {
                            String uid2 = user.getUid();
                            if (user.getAccountType() == 3) {
                                z2 = true;
                            }
                            C63765ad.m115315a(uid2, i, z2);
                        }
                    } else if (!z) {
                        String uid3 = user.getUid();
                        if (user.getAccountType() == 3) {
                            z2 = true;
                        }
                        C63765ad.m115315a(uid3, i, z2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0290, code lost:
        if (r0 == null) goto L_0x0292;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103737a(com.p2082ss.android.ugc.aweme.profile.model.User r15, java.lang.String r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 786
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.C64135cz.mo103737a(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, int, int):void");
    }
}
