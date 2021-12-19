package com.bytedance.android.live.liveinteract.multilive.p341a.p345d;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C3071d;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.C4387aa;
import com.bytedance.android.live.liveinteract.api.C4388ab;
import com.bytedance.android.live.liveinteract.api.C4389ac;
import com.bytedance.android.live.liveinteract.api.C4453w;
import com.bytedance.android.live.liveinteract.api.C4456z;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5386b;
import com.bytedance.android.live.liveinteract.multilive.p341a.p342a.C5388d;
import com.bytedance.android.live.liveinteract.multilive.p341a.p344c.EnumC5399a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a;
import com.bytedance.android.livesdk.chatroom.interact.model.C7606e;
import com.bytedance.android.livesdk.chatroom.model.p497c.C7677b;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9106dr;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88404ac;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.a */
public class View$OnClickListenerC5408a extends AbstractC5439m implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, AbstractC3022a.AbstractC3024b, C5134a.AbstractC5136b {

    /* renamed from: a */
    static final String f13923a = View$OnClickListenerC5408a.class.getSimpleName();

    /* renamed from: A */
    private View f13924A;

    /* renamed from: B */
    private View f13925B;

    /* renamed from: C */
    private boolean f13926C = true;

    /* renamed from: D */
    private int f13927D;

    /* renamed from: E */
    private int f13928E;

    /* renamed from: F */
    private boolean f13929F;

    /* renamed from: G */
    private DialogC9148b f13930G;
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: H */
    private C5271a f13931H;

    /* renamed from: b */
    public AbstractC3060a f13932b;

    /* renamed from: c */
    public View f13933c;

    /* renamed from: d */
    public TextView f13934d;

    /* renamed from: e */
    public AbstractC11293v f13935e;

    /* renamed from: f */
    public C5134a.AbstractC5135a f13936f;

    /* renamed from: g */
    public AbstractC3022a f13937g;

    /* renamed from: h */
    public C5130c f13938h;

    /* renamed from: i */
    protected boolean f13939i;

    /* renamed from: j */
    public DataChannel f13940j;

    /* renamed from: k */
    final C88411a f13941k = new C88411a();

    /* renamed from: l */
    public DialogC5211a.EnumC5215a f13942l;

    /* renamed from: m */
    public AbstractC3022a.AbstractC3023a f13943m = new AbstractC3022a.AbstractC3023a() {
        /* class com.bytedance.android.live.liveinteract.multilive.p341a.p345d.View$OnClickListenerC5408a.C54113 */

        static {
            Covode.recordClassIndex(6006);
        }

        @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3023a
        /* renamed from: a */
        public final void mo8234a(String str, C11672a aVar) {
            View$OnClickListenerC5408a.this.mo11212a(str, aVar, 3);
        }

        @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3023a
        /* renamed from: b */
        public final void mo8235b(String str, C11672a aVar) {
            View$OnClickListenerC5408a.this.mo11212a(str, aVar, 2);
        }
    };

    /* renamed from: n */
    boolean f13944n = false;

    /* renamed from: o */
    private HSImageView f13945o;

    /* renamed from: p */
    private LottieAnimationView f13946p;

    /* renamed from: q */
    private HSAnimImageView f13947q;

    /* renamed from: r */
    private ImageView f13948r;

    /* renamed from: s */
    private View f13949s;

    /* renamed from: t */
    private View f13950t;

    /* renamed from: u */
    private View f13951u;

    /* renamed from: v */
    private TextView f13952v;

    /* renamed from: w */
    private TextView f13953w;

    /* renamed from: x */
    private View f13954x;

    /* renamed from: y */
    private SeekBar f13955y;

    /* renamed from: z */
    private RecyclerView f13956z;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11213a(List<C11672a> list) {
        if (list.isEmpty()) {
            list.add(new C11672a());
            return;
        }
        list.add(0, new C11672a());
        this.f13938h = new C5130c(getContext(), list, new C5130c.AbstractC5132a() {
            /* class com.bytedance.android.live.liveinteract.multilive.p341a.p345d.View$OnClickListenerC5408a.C54102 */

            static {
                Covode.recordClassIndex(6005);
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c.AbstractC5132a
            /* renamed from: a */
            public final void mo10863a(C11672a aVar) {
                if (View$OnClickListenerC5408a.this.f13937g.mo8233a(aVar)) {
                    View$OnClickListenerC5408a.this.f13938h.mo10861a(C4147a.f11585c, aVar, 2);
                } else {
                    View$OnClickListenerC5408a.this.f13937g.mo8232a(C4147a.f11585c, aVar, View$OnClickListenerC5408a.this.f13943m);
                }
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c.AbstractC5132a
            /* renamed from: b */
            public final void mo10864b(C11672a aVar) {
                View$OnClickListenerC5408a aVar2 = View$OnClickListenerC5408a.this;
                if (!TextUtils.equals(aVar.f27894b, aVar2.f13936f.mo10873c())) {
                    aVar2.f13936f.mo10869a(aVar.f27894b);
                    ((IEffectService) C6193a.m13435a(IEffectService.class)).composerManager().mo9845a(C4147a.f11585c);
                    if (TextUtils.equals(aVar.f27894b, "")) {
                        aVar2.f13936f.mo10868a((C11672a) null);
                    } else {
                        ((IEffectService) C6193a.m13435a(IEffectService.class)).composerManager().mo9846a(C4147a.f11585c, aVar);
                        aVar2.f13936f.mo10868a(aVar);
                    }
                    C3071d dVar = new C3071d("liveinteract", aVar, "");
                    if (aVar2.f13940j != null) {
                        aVar2.f13940j.mo28320c(C9106dr.class, dVar);
                    }
                }
            }
        });
        RecyclerView recyclerView = this.f13956z;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.f13956z.setAdapter(this.f13938h);
    }

    static {
        Covode.recordClassIndex(6003);
    }

    /* renamed from: h */
    private boolean m11892h() {
        if (this.f13942l == DialogC5211a.EnumC5215a.GO_LIVE) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3024b
    /* renamed from: a */
    public final void mo8236a() {
        mo11213a(new ArrayList());
    }

    /* renamed from: b */
    public final void mo11214b() {
        this.f13934d.setText(String.valueOf(this.f13955y.getProgress()));
        m11891g();
    }

    /* renamed from: c */
    public final void mo11215c() {
        DataChannel a;
        if (!m11892h() && (a = C17846f.m33055a(this)) != null) {
            EnumC5399a aVar = EnumC5399a.GUEST_USER_INFO;
            aVar.setGoNextPage(false);
            a.mo28315b(C5388d.class, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11216d() {
        AbstractC11293v vVar = this.f13935e;
        if (vVar != null) {
            vVar.dismiss();
        }
        DialogC9148b bVar = this.f13930G;
        if (bVar != null && bVar.isShowing()) {
            this.f13930G.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f13946p.mo5836d();
        this.f13947q.mo9391b();
        this.f13937g.mo8230a();
        this.f13939i = false;
        this.f13941k.mo142944a();
        this.f13940j.mo28320c(C5386b.class, DialogC5211a.EnumC5215a.SEND_REQUEST);
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m11889b(false, PrivacyCert.Builder.with("bpea-464").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m11889b(true, PrivacyCert.Builder.with("bpea-463").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
    }

    /* renamed from: f */
    private void m11890f() {
        this.f13927D = 1;
        this.f13926C = true;
        m11888a(true, PrivacyCert.Builder.with("bpea-468").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) this.f13954x.getLayoutParams();
        aVar.f2273k = R.id.e9m;
        aVar.f2269g = R.id.e9m;
        aVar.f2266d = R.id.e9m;
        this.f13954x.setLayoutParams(aVar);
        this.f13955y.setVisibility(8);
        this.f13934d.setVisibility(8);
        this.f13956z.setVisibility(0);
        this.f13924A.setVisibility(8);
        this.f13952v.setTextColor(-2130706433);
        this.f13953w.setTextColor(-1);
        this.f13951u.setVisibility(0);
    }

    /* renamed from: g */
    private void m11891g() {
        int centerX;
        if (this.f13955y.getWidth() == 0 || this.f13934d.getWidth() == 0) {
            this.f13934d.invalidate();
        }
        Rect bounds = this.f13955y.getThumb().getBounds();
        if (C6229a.m13521a(getContext())) {
            centerX = -((this.f13955y.getWidth() - bounds.centerX()) - (this.f13934d.getWidth() / 2));
        } else {
            centerX = bounds.centerX() - (this.f13934d.getWidth() / 2);
        }
        this.f13934d.setTranslationX((float) centerX);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11217e() {
        if (this.f13939i) {
            this.f13928E = C13628n.m24504a(getContext());
            View findViewById = this.f13951u.findViewById(R.id.cym);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.f13928E;
            findViewById.setLayoutParams(layoutParams);
            this.f13937g.mo8231a(C4147a.f11585c, this);
            m11887a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10878a(String str) {
        mo11216d();
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e3h);
        DataChannel dataChannel = this.f13940j;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4453w.class, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3024b
    /* renamed from: a */
    public final void mo8237a(EffectChannelResponse effectChannelResponse) {
        ((AbstractC11137ac) AbstractC88979t.m154309b((Iterable) effectChannelResponse.getAllCategoryEffects()).mo143292d(C5413c.f13961a).mo143303h().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142916a((AbstractC88404ac) C11152e.m19788a(this.f13956z))).mo17937a(new C5414d(this), C5415e.f13963a);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: b */
    public final void mo10880b(Throwable th) {
        C4386c.m10499a().mo10159a((Integer) 0);
        this.f13940j.mo28320c(C4456z.class, "");
        C11264f.m19957a(C3966y.m9669e(), th);
        mo11216d();
    }

    /* renamed from: a */
    private void m11887a(PrivacyCert privacyCert) {
        this.f13927D = 0;
        this.f13926C = true;
        m11888a(true, privacyCert);
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) this.f13954x.getLayoutParams();
        aVar.f2273k = R.id.rh;
        aVar.f2269g = R.id.rh;
        aVar.f2266d = R.id.rh;
        this.f13954x.setLayoutParams(aVar);
        this.f13955y.setVisibility(0);
        this.f13934d.setVisibility(0);
        this.f13956z.setVisibility(8);
        this.f13924A.setVisibility(8);
        this.f13952v.setTextColor(-1);
        this.f13953w.setTextColor(-2130706433);
        this.f13951u.setVisibility(0);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c37) {
            mo11215c();
            return;
        }
        boolean z = false;
        if (id == R.id.c3v) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null && room.getOwner() != null) {
                DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
                aVar.f22244a = C3966y.m9660a((int) R.string.dyk, room.getOwner().displayId);
                DialogC9148b a = aVar.mo15248b(R.string.e4u).mo15249b(R.string.dyn, DialogInterface$OnClickListenerC5416f.f13964a, false).mo15244a(R.string.dym, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5417g(this), false).mo15247a();
                this.f13930G = a;
                a.show();
            }
        } else if (id == R.id.a0t) {
            if (this.f13926C) {
                this.f13931H.f13635f = !this.f13931H.f13635f;
                this.f13932b.mo8322a(PrivacyCert.Builder.with("bpea-401").usage("").tag("link mic reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        } else if (id == R.id.rh) {
            m11887a(PrivacyCert.Builder.with("bpea-470").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.e9m) {
            m11890f();
        } else if (id == R.id.fdq) {
            boolean z2 = !this.f13926C;
            this.f13926C = z2;
            m11888a(z2, PrivacyCert.Builder.with("bpea-466").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            if (this.f13926C) {
                int i = this.f13927D;
                if (i == 0) {
                    m11887a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                } else if (i == 1) {
                    m11890f();
                }
                this.f13925B.setVisibility(0);
                return;
            }
            this.f13951u.setVisibility(4);
            this.f13955y.setVisibility(8);
            this.f13934d.setVisibility(8);
            this.f13956z.setVisibility(8);
            this.f13924A.setVisibility(0);
            this.f13952v.setTextColor(-2130706433);
            this.f13953w.setTextColor(-2130706433);
            this.f13925B.setVisibility(4);
        } else if (id != R.id.bbd || this.f13942l != DialogC5211a.EnumC5215a.GO_LIVE || C4386c.m10499a().f17248n.intValue() != 0) {
        } else {
            if (C6894d.m14753a().f17273t >= C6894d.m14753a().f17275v) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8n);
                mo11216d();
            } else if (C4384b.C4385a.m10496a().mo10147a() != 2) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7o);
                mo11216d();
            } else {
                C6555i.m14021b();
                C6555i.m9463b("invite_issue_check", "replyAnchor");
                ((AbstractC7600a) this.f13932b).mo9074c(PrivacyCert.Builder.with("bpea-395").usage("").tag("link mic apply").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                C6894d.m14753a().mo13186a(true);
                C5271a aVar2 = this.f13931H;
                if (this.f13936f.mo10865a() != 2) {
                    z = true;
                }
                aVar2.f13633d = z;
                this.f13936f.mo10870a(true);
                C4386c.m10499a().mo10159a((Integer) 1);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10879a(Throwable th) {
        C11264f.m19958a(getContext(), th, (int) R.string.go4);
    }

    /* renamed from: b */
    private void m11889b(boolean z, PrivacyCert privacyCert) {
        AbstractC3060a aVar = this.f13932b;
        if (aVar != null) {
            ((AbstractC7600a) aVar).mo9071a(true, PrivacyCert.Builder.with("bpea-801").usage("").tag("mute audio in preview dialog").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            if (((View) this.f13932b).getVisibility() == 0) {
                AbstractC3060a aVar2 = this.f13932b;
                if (!(aVar2 instanceof AbstractC7600a)) {
                    return;
                }
                if (z) {
                    ((AbstractC7600a) aVar2).mo9073b_(privacyCert);
                } else {
                    ((AbstractC7600a) aVar2).mo9072a_(privacyCert);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11888a(boolean z, PrivacyCert privacyCert) {
        m11889b(z, privacyCert);
        if (z) {
            ((View) this.f13932b).setVisibility(0);
            this.f13949s.setBackground(C3966y.m9665c(2131234624));
            this.f13950t.setBackground(C3966y.m9665c(2131234567));
            this.f13945o.setVisibility(4);
            this.f13947q.setVisibility(4);
            this.f13947q.mo9391b();
            this.f13948r.setVisibility(4);
            this.f13936f.mo10866a(1);
            return;
        }
        ((View) this.f13932b).setVisibility(4);
        this.f13949s.setBackground(C3966y.m9665c(2131234622));
        this.f13950t.setBackground(C3966y.m9665c(2131234565));
        this.f13945o.setVisibility(0);
        this.f13947q.setVisibility(0);
        this.f13947q.mo9390a();
        if (!this.f13929F) {
            ImageModel d = this.f13936f.mo10874d();
            C3941k.m9604a(this.f13945o, d, new C11291z(5, 0.0f));
            ImageView imageView = this.f13948r;
            C7577g.m15571a(imageView, d, imageView.getWidth(), this.f13948r.getHeight(), 2131234441);
            this.f13929F = true;
        }
        this.f13948r.setVisibility(0);
        this.f13936f.mo10866a(2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10877a(C7606e eVar, boolean z) {
        if (this.f13942l == DialogC5211a.EnumC5215a.GO_LIVE) {
            this.f13940j.mo28320c(C4389ac.class, "");
        }
        C6894d.m14753a().f17259d = eVar.f18874m;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            C6898g.C6899a.f17285a.mo13199a(room.getOwnerUserId(), eVar.f18874m);
        }
        if (z) {
            this.f13940j.mo28320c(C4387aa.class, true);
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.f18876o) {
                C7677b bVar = new C7677b();
                bVar.f19021a = eVar.f18876o;
                bVar.f19022b = eVar.f18877p;
                bVar.f19023c = eVar.f18878q;
                this.f13940j.mo28315b(C4388ab.class, bVar);
            }
        }
        mo11216d();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i >= 0 && i <= seekBar.getMax() && z) {
            mo11214b();
            this.f13936f.mo10872b(i);
            this.f13932b.mo8321a(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.b8v, viewGroup, false);
        this.f13932b = (AbstractC3060a) a.findViewById(R.id.d6b);
        this.f13933c = a.findViewById(R.id.d5t);
        this.f13945o = (HSImageView) a.findViewById(R.id.o9);
        this.f13946p = (LottieAnimationView) a.findViewById(R.id.mi);
        this.f13947q = (HSAnimImageView) a.findViewById(R.id.mj);
        this.f13948r = (ImageView) a.findViewById(R.id.nz);
        this.f13949s = a.findViewById(R.id.fdq);
        this.f13950t = a.findViewById(R.id.a0t);
        this.f13951u = a.findViewById(R.id.cyn);
        this.f13952v = (TextView) a.findViewById(R.id.rh);
        this.f13953w = (TextView) a.findViewById(R.id.e9m);
        this.f13954x = a.findViewById(R.id.bmu);
        this.f13955y = (SeekBar) a.findViewById(R.id.rf);
        this.f13934d = (TextView) a.findViewById(R.id.rg);
        this.f13956z = (RecyclerView) a.findViewById(R.id.e9e);
        this.f13924A = a.findViewById(R.id.mk);
        LiveButton liveButton = (LiveButton) a.findViewById(R.id.bbd);
        this.f13925B = a.findViewById(R.id.fe7);
        View findViewById = a.findViewById(R.id.c37);
        View findViewById2 = a.findViewById(R.id.c3v);
        if (m11892h()) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            liveButton.setVisibility(0);
            C5714i.m12562e();
        } else {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            liveButton.setVisibility(8);
        }
        this.f13936f.mo10938a(this);
        C4431e.f12034a.mo10201a(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        liveButton.setOnClickListener(this);
        this.f13949s.setOnClickListener(this);
        this.f13950t.setOnClickListener(this);
        this.f13952v.setOnClickListener(this);
        this.f13953w.setOnClickListener(this);
        this.f13955y.setOnSeekBarChangeListener(this);
        this.f13934d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.android.live.liveinteract.multilive.p341a.p345d.View$OnClickListenerC5408a.ViewTreeObserver$OnGlobalLayoutListenerC54091 */

            static {
                Covode.recordClassIndex(6004);
            }

            public final void onGlobalLayout() {
                View$OnClickListenerC5408a.this.mo11214b();
                View$OnClickListenerC5408a.this.f13934d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f13946p.setVisibility(8);
        this.f13947q.mo9389a(HSAnimImageView.m9804a("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
        this.f13951u.post(new RunnableC5412b(this));
        this.f13937g = ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).stickerPresenter();
        this.f13955y.setProgress(this.f13936f.mo10871b());
        this.f13939i = true;
        this.f13929F = false;
        return a;
    }

    /* renamed from: a */
    public final void mo11212a(String str, C11672a aVar, int i) {
        if (C4147a.f11585c.equals(str)) {
            this.f13938h.mo10861a(str, aVar, i);
        }
    }
}
