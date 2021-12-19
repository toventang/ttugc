package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui.StrangerListActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f */
public final class C54856f extends C54859g {

    /* renamed from: h */
    public static final C54857a f125634h = new C54857a((byte) 0);

    /* renamed from: g */
    public String f125635g;

    static {
        Covode.recordClassIndex(64575);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.AbstractC54850d
    public final String bL_() {
        return "stranger_1";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a, com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54859g
    /* renamed from: c */
    public final int mo91860c() {
        return 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f$a */
    public static final class C54857a {
        static {
            Covode.recordClassIndex(64576);
        }

        private C54857a() {
        }

        public /* synthetic */ C54857a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a, com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54859g
    /* renamed from: b */
    public final AbstractC56238b mo91859b() {
        return new C54858b(this);
    }

    /* renamed from: h */
    public final String mo91871h() {
        String str = this.f125635g;
        if (str == null) {
            C89219l.m154710a("lastConversationId");
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54859g
    /* renamed from: f */
    public final String mo91869f() {
        String string = C17867d.m33078a().getString(R.string.d2r);
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f125635g;
        if (str == null) {
            C89219l.m154710a("lastConversationId");
        }
        return hashCode + str.hashCode();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: g */
    public final String mo91870g() {
        String str = this.f125635g;
        if (str == null) {
            C89219l.m154710a("lastConversationId");
        }
        String valueOf = String.valueOf(AbstractC17427b.C17428a.m32311c(str));
        IMUser a = C55085g.m100751a(valueOf, this.f125622d);
        C56244a.m102190b("StrangerCellSession", "wrapContent: " + valueOf + ", " + this.f125622d);
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            String displayName = a.getDisplayName();
            C89219l.m154716b(displayName, "");
            if (!TextUtils.isEmpty(displayName) && displayName.length() > 6) {
                StringBuilder sb2 = new StringBuilder();
                Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                String substring = displayName.substring(0, 6);
                C89219l.m154716b(substring, "");
                displayName = sb2.append(substring).append("...").toString();
            }
            return sb.append(displayName).append("：").append(this.f128235n).toString();
        }
        C56244a.m102193e("StrangerCellSession", "wrapContent user null: " + valueOf + ", " + this.f125622d);
        String str2 = this.f128235n;
        C89219l.m154716b(str2, "");
        return str2;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.f$b */
    public static final class C54858b implements AbstractC56238b {

        /* renamed from: a */
        final /* synthetic */ C54856f f125636a;

        static {
            Covode.recordClassIndex(64577);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54858b(C54856f fVar) {
            this.f125636a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b
        /* renamed from: a */
        public final void mo91861a(ActivityC0945e eVar, AbstractC56237a aVar, int i) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(aVar, "");
            if (i == 1 || i == 2) {
                C89219l.m154721d(eVar, "");
                Intent intent = new Intent(eVar, StrangerListActivity.class);
                C84349a.m145093a(intent, eVar);
                eVar.startActivity(intent);
                AbstractC81915c.m141874a(new C61561m(11, -1));
                C39162r.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("stranger").setValue(null));
                C39162r.onEventV3("im_click_stranger_message");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54856f)) {
            return false;
        }
        String str = this.f125635g;
        if (str == null) {
            C89219l.m154710a("lastConversationId");
        }
        C54856f fVar = (C54856f) obj;
        if (TextUtils.equals(str, fVar.mo91871h()) && TextUtils.equals(this.f128234m, fVar.f128234m) && TextUtils.equals(this.f128235n, fVar.f128235n) && this.f128236o == fVar.f128236o && this.f128238q == fVar.f128238q) {
            return true;
        }
        return false;
    }

    private C54856f(String str, IMUser iMUser) {
        super(str, iMUser);
    }

    public /* synthetic */ C54856f(String str, IMUser iMUser, byte b) {
        this(str, iMUser);
    }
}
