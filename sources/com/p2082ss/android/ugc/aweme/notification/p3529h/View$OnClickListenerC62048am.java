package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.bean.RoomInfo;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.am */
public final class View$OnClickListenerC62048am extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    private final int f140839a = 14;

    /* renamed from: b */
    private final View f140840b;

    /* renamed from: c */
    private final AvatarImageWithVerify f140841c;

    /* renamed from: d */
    private final TextView f140842d;

    /* renamed from: e */
    private final TextView f140843e;

    /* renamed from: f */
    private final Button f140844f;

    /* renamed from: q */
    private C61871f f140845q;

    /* renamed from: r */
    private long[] f140846r;

    /* renamed from: s */
    private int f140847s;

    static {
        Covode.recordClassIndex(72802);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: c */
    private static boolean m112236c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        C61871f fVar = this.f140845q;
        if (fVar != null) {
            this.f140768h.mo100338a(fVar, new C62049a(this, fVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.am$a */
    static final class C62049a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC62048am f140848a;

        /* renamed from: b */
        final /* synthetic */ C61871f f140849b;

        static {
            Covode.recordClassIndex(72803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62049a(View$OnClickListenerC62048am amVar, C61871f fVar) {
            super(0);
            this.f140848a = amVar;
            this.f140849b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f140848a.f140985k;
            String str = this.f140848a.f140986l;
            C89219l.m154716b(str, "");
            C62259e.m112619a("live", i, str, this.f140848a.f140768h.mo100337a(), this.f140849b.templateId);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62048am(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140840b = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f140841c = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cuw);
        C89219l.m154716b(findViewById3, "");
        this.f140842d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById4, "");
        this.f140843e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById5, "");
        Button button = (Button) findViewById5;
        this.f140844f = button;
        this.f140847s = -1;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageWithVerify);
        C62023a.m112168a(button);
        button.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(C80397em.m139369a(101));
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        User user;
        Integer valueOf;
        boolean z;
        long j;
        RoomInfo roomInfo;
        Long l;
        long j2;
        RoomInfo roomInfo2;
        Long l2;
        RoomInfo roomInfo3;
        Boolean bool;
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112236c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        C61871f fVar = this.f140845q;
        if (fVar != null && (user = fVar.f140462a) != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cv7 || valueOf.intValue() == R.id.cu6) {
                mo100143a("live", getLayoutPosition());
                LogHelper a = LogHelperImpl.m77303a();
                Context context = this.f140983i;
                C89219l.m154716b(context, "");
                String requestId = user.getRequestId();
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                a.mo66429a(context, requestId, uid, user.roomId);
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                C61871f fVar2 = this.f140845q;
                if (fVar2 == null || (roomInfo3 = fVar2.f140464c) == null || (bool = roomInfo3.liveTypeScreenshot) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                roomsData.f28336aq = z;
                if (C16048b.m29633a().mo25421a(true, "enable_inbox_live_slide", false)) {
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    AbstractC66586a i = s.mo95835i();
                    Context context2 = this.f140983i;
                    long[] jArr = this.f140846r;
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    C61871f fVar3 = this.f140845q;
                    if (fVar3 == null || (roomInfo2 = fVar3.f140464c) == null || (l2 = roomInfo2.ownerUserId) == null) {
                        j2 = 0;
                    } else {
                        j2 = l2.longValue();
                    }
                    i.mo105590a(context2, enterRoomConfig, user, jArr, j2, this.f140847s);
                    return;
                }
                ILiveOuterService s2 = LiveOuterService.m107269s();
                C89219l.m154716b(s2, "");
                AbstractC66586a i2 = s2.mo95835i();
                Context context3 = this.f140983i;
                long[] jArr2 = new long[0];
                C61871f fVar4 = this.f140845q;
                if (fVar4 == null || (roomInfo = fVar4.f140464c) == null || (l = roomInfo.ownerUserId) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                i2.mo105590a(context3, enterRoomConfig, user, jArr2, j, this.f140847s);
            } else if (valueOf.intValue() == R.id.cuf) {
                AbstractView$OnLongClickListenerC62118k.m112176b(user.getUid(), user.getSecUid(), "message");
                AbstractView$OnLongClickListenerC62118k.m112174a(user.getUid(), "notification_page", "click_head");
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public final void mo100111a(com.p2082ss.android.ugc.aweme.notification.bean.C61871f r7, long[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62048am.mo100111a(com.ss.android.ugc.aweme.notification.bean.f, long[], int):void");
    }
}
