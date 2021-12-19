package com.bytedance.android.live.publicscreen.impl.p395b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.view.action.LiveActionButton;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6099c;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.p395b.C5904b;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p542g.DialogC8776b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.b.a */
public final class View$OnClickListenerC5899a extends DialogC8776b implements View.OnClickListener, C5904b.AbstractC5905a, AbstractC6101c, AbstractC6105g {

    /* renamed from: a */
    public User f14762a;

    /* renamed from: b */
    public final Room f14763b;

    /* renamed from: c */
    public final boolean f14764c;

    /* renamed from: d */
    public final AbstractC6571a f14765d;

    /* renamed from: e */
    public final AbstractC2994b f14766e;

    /* renamed from: i */
    private final C5904b f14767i;

    /* renamed from: j */
    private boolean f14768j;

    /* renamed from: k */
    private boolean f14769k;

    /* renamed from: l */
    private final boolean f14770l;

    /* renamed from: m */
    private View f14771m;

    /* renamed from: n */
    private View f14772n;

    /* renamed from: o */
    private final Context f14773o;

    /* renamed from: p */
    private final boolean f14774p;

    /* renamed from: q */
    private final String f14775q;

    /* renamed from: r */
    private final AbstractC89171a<C89391z> f14776r;

    static {
        Covode.recordClassIndex(6507);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: a */
    public final void mo11758a(C6099c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: c */
    public final void mo11762c() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6101c
    /* renamed from: k_ */
    public final void mo11763k_() {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14768j = true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p395b.C5904b.AbstractC5905a
    /* renamed from: a */
    public final void mo11756a() {
        if (this.f14768j) {
            this.f14769k = false;
            m12898b(true);
        }
    }

    public final void onDetachedFromWindow() {
        this.f14768j = false;
        this.f14767i.mo8577b();
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.p542g.DialogC8776b
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(1024);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setStatusBarColor(0);
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setNavigationBarColor(C4079b.m9888a(getContext(), (int) R.attr.ala));
            }
            Window window5 = getWindow();
            if (window5 != null) {
                window5.setLayout(-1, -1);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.a$b */
    static final class View$OnClickListenerC5901b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5899a f14779a;

        static {
            Covode.recordClassIndex(6509);
        }

        View$OnClickListenerC5901b(View$OnClickListenerC5899a aVar) {
            this.f14779a = aVar;
        }

        public final void onClick(View view) {
            this.f14779a.cancel();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.a$c */
    static final class View$OnClickListenerC5902c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5899a f14780a;

        static {
            Covode.recordClassIndex(6510);
        }

        View$OnClickListenerC5902c(View$OnClickListenerC5899a aVar) {
            this.f14780a = aVar;
        }

        public final void onClick(View view) {
            this.f14780a.dismiss();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11759a(Exception exc) {
        if (this.f14768j) {
            C11264f.m19958a(this.f14773o, exc, (int) R.string.gpl);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.a$a */
    static final class C5900a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5899a f14777a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6103e f14778b;

        static {
            Covode.recordClassIndex(6508);
        }

        C5900a(View$OnClickListenerC5899a aVar, AbstractC6103e eVar) {
            this.f14777a = aVar;
            this.f14778b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3265j jVar = (C3265j) obj;
            AbstractC6103e eVar = this.f14778b;
            User user = this.f14777a.f14762a;
            long id = this.f14777a.f14763b.getId();
            C89219l.m154716b(jVar, "");
            eVar.muteUser(user, id, jVar, this.f14777a);
            this.f14777a.mo11760a("mute");
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p395b.C5904b.AbstractC5905a
    /* renamed from: a */
    public final void mo11757a(AbstractC2994b bVar) {
        if (this.f14768j) {
            if (bVar == null || bVar.getId() <= 0) {
                new IllegalArgumentException("User is invalid");
                mo11756a();
                return;
            }
            User from = User.from(bVar);
            if (from != null) {
                this.f14762a = from;
                this.f14769k = true;
                m12898b(false);
                return;
            }
            new IllegalArgumentException("User is invalid");
            mo11756a();
        }
    }

    /* renamed from: a */
    public final void mo11760a(String str) {
        ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getMuteDuration().mo142929d(new C5903d(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.a$d */
    public static final class C5903d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC5899a f14781a;

        /* renamed from: b */
        final /* synthetic */ String f14782b;

        static {
            Covode.recordClassIndex(6511);
        }

        C5903d(View$OnClickListenerC5899a aVar, String str) {
            this.f14781a = aVar;
            this.f14782b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool;
            String str;
            C9542az userAttr;
            String str2;
            long j;
            C3265j jVar = (C3265j) obj;
            C6501b a = C6501b.C6502a.m13948a("livesdk_manage_negative_comment");
            C9878i iVar = null;
            if (this.f14781a.f14764c) {
                str = "anchor";
            } else {
                AbstractC2994b bVar = this.f14781a.f14766e;
                if (bVar == null || (userAttr = bVar.getUserAttr()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(userAttr.f23192b);
                }
                if (C11279p.m20012a(bool)) {
                    str = "admin";
                } else {
                    str = "viewer";
                }
            }
            C6501b a2 = a.mo12651a("admin_type", str).mo12646a("to_user_id", this.f14781a.f14762a.getId());
            AbstractC6571a aVar = this.f14781a.f14765d;
            if (aVar instanceof C9878i) {
                iVar = aVar;
            }
            C9878i iVar2 = iVar;
            if (iVar2 == null || (str2 = iVar2.f23853f) == null) {
                str2 = "";
            }
            C6501b a3 = a2.mo12651a("live_message", str2).mo12651a("manage_action", this.f14782b);
            AbstractC2994b bVar2 = this.f14781a.f14766e;
            if (bVar2 != null) {
                j = bVar2.getId();
            } else {
                j = 0;
            }
            C6501b a4 = a3.mo12646a("user_id", j).mo12646a("anchor_id", this.f14781a.f14763b.getOwnerUserId()).mo12646a("room_id", this.f14781a.f14763b.getId()).mo12646a("msg_id", this.f14781a.f14765d.getMessageId());
            if (C89219l.m154714a((Object) this.f14782b, (Object) "mute")) {
                a4.mo12646a("mute_duration", jVar.f9352a).mo12646a("default_mute_set", jVar.f9352a);
            }
            a4.mo12655b();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6105g
    /* renamed from: a */
    public final void mo11761a(boolean z) {
        if (this.f14768j) {
            m12898b(false);
        }
    }

    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        String str = "";
        if (num != null && num.intValue() == R.id.dik) {
            String a = C6544e.m13987a();
            String d = C6544e.m13990d();
            AbstractC6103e eVar = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
            Context context = this.f14773o;
            long id = this.f14763b.getId();
            long ownerUserId = this.f14763b.getOwnerUserId();
            long id2 = this.f14762a.getId();
            String secUid = this.f14762a.getSecUid();
            long messageId = this.f14765d.getMessageId();
            AbstractC6571a aVar = this.f14765d;
            if (aVar instanceof C9878i) {
                str = ((C9878i) aVar).f23853f;
            }
            C11838d dVar = new C11838d(id, ownerUserId, id2, secUid, UGCMonitor.EVENT_COMMENT, messageId, str, this.f14763b.getRequestId(), a, d, "report_message", "1");
            dVar.f28220s = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getReportScene();
            eVar.report(context, dVar);
            mo11760a("report");
        } else {
            boolean z = true;
            if (num != null && num.intValue() == R.id.dhy) {
                User user = this.f14762a;
                C7382ao aoVar = new C7382ao(C6581g.m14075a(user), str);
                aoVar.f18301e = user;
                C6779a.m14563a().mo13053a(aoVar);
                C6905bf.m14776a().mo13206a(true);
            } else {
                String str2 = "anchor";
                if (num != null) {
                    if (num.intValue() == R.id.cov) {
                        if (this.f14762a.getUserAttr() != null) {
                            C9542az userAttr = this.f14762a.getUserAttr();
                            C89219l.m154716b(userAttr, str);
                            if (userAttr.f23191a) {
                                z = false;
                            }
                        }
                        AbstractC6103e eVar2 = (AbstractC6103e) C6193a.m13435a(AbstractC6103e.class);
                        if (z) {
                            eVar2.getMuteDuration().mo142929d(new C5900a(this, eVar2));
                        } else {
                            eVar2.unmuteUser(this.f14762a, this.f14763b.getId(), this);
                            C6501b a2 = C6501b.C6502a.m13948a("livesdk_unmute_comment").mo12639a();
                            if (!this.f14764c) {
                                str2 = "admin";
                            }
                            a2.mo12651a("admin_type", str2).mo12646a("anchor_id", this.f14763b.getOwnerUserId()).mo12646a("room_id", this.f14763b.getId()).mo12646a("to_user_id", this.f14762a.getId()).mo12655b();
                        }
                        dismiss();
                        return;
                    } else if (num.intValue() == R.id.c29) {
                        User user2 = this.f14762a;
                        Dialog ensureKickOutDialog = ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).getEnsureKickOutDialog(this.f14773o, this.f14763b.getId(), this.f14763b.getOwnerUserId(), user2.getId(), null);
                        if (ensureKickOutDialog != null) {
                            ensureKickOutDialog.show();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", String.valueOf(this.f14763b.getOwnerUserId()));
                        String idStr = this.f14763b.getIdStr();
                        C89219l.m154716b(idStr, str);
                        hashMap.put("room_id", idStr);
                        if (!this.f14764c) {
                            str2 = "admin";
                        }
                        hashMap.put("admin_type", str2);
                        hashMap.put("user_id", String.valueOf(user2.getId()));
                        C6501b.C6502a.m13948a("blocked_list_click").mo12639a().mo12652a((Map<String, String>) hashMap).mo12654b("relation").mo12656c("click").mo12655b();
                        mo11760a("block");
                    } else if (num.intValue() == R.id.djd) {
                        m12898b(false);
                        return;
                    } else if (num.intValue() == R.id.en9) {
                        AbstractC89171a<C89391z> aVar2 = this.f14776r;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        dismiss();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(3325);
        Drawable drawable = null;
        setContentView(getLayoutInflater().inflate(R.layout.b6b, (ViewGroup) null));
        ((FrameLayout) findViewById(R.id.emn)).setOnClickListener(new View$OnClickListenerC5901b(this));
        Drawable a = C0643b.m2369a(getContext(), (int) R.drawable.bte);
        if (a != null) {
            a.mutate();
            C0705a.m2494a(a, C4079b.m9888a(getContext(), (int) R.attr.am1));
            drawable = a;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cpr);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setDividerDrawable(drawable);
        View findViewById = findViewById(R.id.djd);
        C89219l.m154716b(findViewById, "");
        this.f14771m = findViewById;
        View findViewById2 = findViewById(R.id.d_3);
        C89219l.m154716b(findViewById2, "");
        this.f14772n = findViewById2;
        View view = this.f14771m;
        if (view == null) {
            C89219l.m154710a("retry");
        }
        view.setOnClickListener(this);
        LiveActionButton liveActionButton = (LiveActionButton) findViewById(R.id.a0w);
        if (liveActionButton != null) {
            liveActionButton.setOnClickListener(new View$OnClickListenerC5902c(this));
        }
        LiveActionButton liveActionButton2 = (LiveActionButton) findViewById(R.id.dik);
        if (liveActionButton2 != null) {
            liveActionButton2.setOnClickListener(this);
        }
        LiveActionButton liveActionButton3 = (LiveActionButton) findViewById(R.id.dhy);
        if (liveActionButton3 != null) {
            liveActionButton3.setOnClickListener(this);
        }
        LiveActionButton liveActionButton4 = (LiveActionButton) findViewById(R.id.cov);
        if (liveActionButton4 != null) {
            liveActionButton4.setOnClickListener(this);
        }
        LiveActionButton liveActionButton5 = (LiveActionButton) findViewById(R.id.c29);
        if (liveActionButton5 != null) {
            liveActionButton5.setOnClickListener(this);
        }
        ((LiveActionButton) findViewById(R.id.en9)).setOnClickListener(this);
        m12898b(false);
        if (this.f14774p) {
            LiveActionButton liveActionButton6 = (LiveActionButton) findViewById(R.id.en9);
            C89219l.m154716b(liveActionButton6, "");
            liveActionButton6.setVisibility(0);
            ((LiveActionButton) findViewById(R.id.en9)).setText(this.f14775q);
            MethodCollector.m26664o(3325);
            return;
        }
        LiveActionButton liveActionButton7 = (LiveActionButton) findViewById(R.id.en9);
        C89219l.m154716b(liveActionButton7, "");
        liveActionButton7.setVisibility(8);
        MethodCollector.m26664o(3325);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (com.bytedance.android.livesdk.utils.C11279p.m20023c(java.lang.Boolean.valueOf(r1)) != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m12898b(boolean r10) {
        /*
        // Method dump skipped, instructions count: 533
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.p395b.View$OnClickListenerC5899a.m12898b(boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC5899a(Context context, User user, Room room, boolean z, AbstractC6571a aVar, AbstractC2994b bVar, boolean z2, String str, AbstractC89171a<C89391z> aVar2) {
        super(context, true);
        long j;
        C89219l.m154721d(context, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        boolean z3 = true;
        this.f14773o = context;
        this.f14762a = user;
        this.f14763b = room;
        this.f14764c = z;
        this.f14765d = aVar;
        this.f14766e = bVar;
        this.f14774p = z2;
        this.f14775q = str;
        this.f14776r = aVar2;
        C5904b bVar2 = new C5904b();
        bVar2.mo10297a(this);
        this.f14767i = bVar2;
        long id = this.f14762a.getId();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            j = b.mo13161c();
        } else {
            j = 0;
        }
        this.f14770l = id != j ? false : z3;
    }
}
