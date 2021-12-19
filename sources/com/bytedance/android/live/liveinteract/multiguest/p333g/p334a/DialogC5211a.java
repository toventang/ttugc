package com.bytedance.android.live.liveinteract.multiguest.p333g.p334a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C3071d;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.C4387aa;
import com.bytedance.android.live.liveinteract.api.C4388ab;
import com.bytedance.android.live.liveinteract.api.C4389ac;
import com.bytedance.android.live.liveinteract.api.C4453w;
import com.bytedance.android.live.liveinteract.api.C4456z;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p320d.AbstractC5170a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
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
import com.bytedance.android.livesdk.p562k.DialogC9146a;
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

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.a */
public class DialogC5211a extends Dialog implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, AbstractC3022a.AbstractC3024b, C5134a.AbstractC5136b {

    /* renamed from: a */
    public static final String f13459a = DialogC5211a.class.getSimpleName();

    /* renamed from: A */
    private int f13460A;

    /* renamed from: B */
    private boolean f13461B;

    /* renamed from: C */
    private AbstractC5170a.C5171a f13462C;

    /* renamed from: D */
    private final C88411a f13463D = new C88411a();

    /* renamed from: E */
    private final EnumC5215a f13464E;

    /* renamed from: b */
    public TextView f13465b;

    /* renamed from: c */
    C5134a.AbstractC5135a f13466c;

    /* renamed from: d */
    public AbstractC3022a f13467d;

    /* renamed from: e */
    public C5130c f13468e;

    /* renamed from: f */
    protected boolean f13469f;

    /* renamed from: g */
    DataChannel f13470g;

    /* renamed from: h */
    public AbstractC3022a.AbstractC3023a f13471h = new AbstractC3022a.AbstractC3023a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a.C52143 */

        static {
            Covode.recordClassIndex(5806);
        }

        @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3023a
        /* renamed from: a */
        public final void mo8234a(String str, C11672a aVar) {
            DialogC5211a.this.mo10992a(str, aVar, 3);
        }

        @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3023a
        /* renamed from: b */
        public final void mo8235b(String str, C11672a aVar) {
            DialogC5211a.this.mo10992a(str, aVar, 2);
        }
    };

    /* renamed from: i */
    public AbstractC5170a f13472i;

    /* renamed from: j */
    private HSImageView f13473j;

    /* renamed from: k */
    private AbstractC3060a f13474k;

    /* renamed from: l */
    private View f13475l;

    /* renamed from: m */
    private LottieAnimationView f13476m;

    /* renamed from: n */
    private HSAnimImageView f13477n;

    /* renamed from: o */
    private ImageView f13478o;

    /* renamed from: p */
    private View f13479p;

    /* renamed from: q */
    private View f13480q;

    /* renamed from: r */
    private TextView f13481r;

    /* renamed from: s */
    private TextView f13482s;

    /* renamed from: t */
    private TextView f13483t;

    /* renamed from: u */
    private View f13484u;

    /* renamed from: v */
    private SeekBar f13485v;

    /* renamed from: w */
    private LiveButton f13486w;

    /* renamed from: x */
    private RecyclerView f13487x;

    /* renamed from: y */
    private View f13488y;

    /* renamed from: z */
    private Dialog f13489z;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo10997d() {
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10993a(List<C11672a> list) {
        if (list.isEmpty()) {
            list.add(new C11672a());
            return;
        }
        list.add(0, new C11672a());
        this.f13468e = new C5130c(getContext(), list, new C5130c.AbstractC5132a() {
            /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a.C52132 */

            static {
                Covode.recordClassIndex(5805);
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c.AbstractC5132a
            /* renamed from: a */
            public final void mo10863a(C11672a aVar) {
                if (DialogC5211a.this.f13467d.mo8233a(aVar)) {
                    DialogC5211a.this.f13468e.mo10861a(C4147a.f11585c, aVar, 2);
                } else {
                    DialogC5211a.this.f13467d.mo8232a(C4147a.f11585c, aVar, DialogC5211a.this.f13471h);
                }
            }

            @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c.AbstractC5132a
            /* renamed from: b */
            public final void mo10864b(C11672a aVar) {
                DialogC5211a aVar2 = DialogC5211a.this;
                if (!TextUtils.equals(aVar.f27894b, aVar2.f13466c.mo10873c())) {
                    aVar2.f13466c.mo10869a(aVar.f27894b);
                    ((IEffectService) C6193a.m13435a(IEffectService.class)).composerManager().mo9845a(C4147a.f11585c);
                    if (TextUtils.equals(aVar.f27894b, "")) {
                        aVar2.f13466c.mo10868a((C11672a) null);
                    } else {
                        ((IEffectService) C6193a.m13435a(IEffectService.class)).composerManager().mo9846a(C4147a.f11585c, aVar);
                        aVar2.f13466c.mo10868a(aVar);
                    }
                    C3071d dVar = new C3071d("liveinteract", aVar, "");
                    if (aVar2.f13470g != null) {
                        aVar2.f13470g.mo28320c(C9106dr.class, dVar);
                    }
                }
            }
        });
        RecyclerView recyclerView = this.f13487x;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.f13487x.setAdapter(this.f13468e);
    }

    /* renamed from: a */
    public final void mo10994a(boolean z, PrivacyCert privacyCert) {
        AbstractC3060a aVar = this.f13474k;
        if (aVar != null && ((View) aVar).getVisibility() == 0) {
            AbstractC3060a aVar2 = this.f13474k;
            if (aVar2 instanceof AbstractC7600a) {
                if (z) {
                    ((AbstractC7600a) aVar2).mo9073b_(privacyCert);
                } else {
                    ((AbstractC7600a) aVar2).mo9072a_(privacyCert);
                }
                ((AbstractC7600a) this.f13474k).mo9071a(true, PrivacyCert.Builder.with("bpea-800").usage("").tag("mute audio in apply dialog").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    static {
        Covode.recordClassIndex(5803);
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3024b
    /* renamed from: a */
    public final void mo8236a() {
        mo10993a(new ArrayList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10995b() {
        this.f13486w.setClickable(false);
        m11541a(true);
        C5714i.m12564f();
        this.f13466c.mo10876f();
    }

    /* renamed from: c */
    public final void mo10996c() {
        this.f13465b.setText(String.valueOf(this.f13485v.getProgress()));
        m11543f();
    }

    public void dismiss() {
        ((View) this.f13474k).setVisibility(4);
        this.f13475l.setVisibility(0);
        if (isShowing()) {
            this.f13475l.post(new RunnableC5222h(this));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13466c.mo10938a(this);
        this.f13485v.setProgress(this.f13466c.mo10871b());
        this.f13469f = true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.a$a */
    public enum EnumC5215a {
        SEND_REQUEST,
        GO_LIVE;

        static {
            Covode.recordClassIndex(5807);
        }
    }

    public void onDetachedFromWindow() {
        this.f13466c.mo10939g();
        this.f13476m.mo5836d();
        this.f13477n.mo9391b();
        this.f13467d.mo8230a();
        this.f13469f = false;
        this.f13463D.mo142944a();
        AbstractC5170a aVar = this.f13472i;
        if (aVar != null) {
            aVar.mo10925a();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m11543f() {
        int centerX;
        if (this.f13485v.getWidth() == 0 || this.f13465b.getWidth() == 0) {
            this.f13465b.invalidate();
        }
        Rect bounds = this.f13485v.getThumb().getBounds();
        if (C6229a.m13521a(getContext())) {
            centerX = -((this.f13485v.getWidth() - bounds.centerX()) - (this.f13465b.getWidth() / 2));
        } else {
            centerX = bounds.centerX() - (this.f13465b.getWidth() / 2);
        }
        this.f13465b.setTranslationX((float) centerX);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo10999e() {
        if (this.f13469f) {
            this.f13460A = C13628n.m24504a(getContext());
            View findViewById = this.f13480q.findViewById(R.id.cym);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.f13460A;
            findViewById.setLayoutParams(layoutParams);
            this.f13467d.mo8231a(C4147a.f11585c, this);
            m11540a(PrivacyCert.Builder.with("bpea-469").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    /* renamed from: a */
    private void m11541a(boolean z) {
        if (z) {
            if (this.f13489z == null) {
                DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(getContext());
                aVar.f22147b = getContext().getString(R.string.go5);
                this.f13489z = aVar.mo15240a();
            }
            if (!this.f13489z.isShowing()) {
                this.f13489z.show();
                return;
            }
            return;
        }
        Dialog dialog = this.f13489z;
        if (dialog != null && dialog.isShowing()) {
            this.f13489z.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: b */
    public final void mo10880b(Throwable th) {
        DataChannel dataChannel = this.f13470g;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4456z.class, "");
        }
        C11264f.m19957a(C3966y.m9669e(), th);
        this.f13486w.setClickable(true);
        m11541a(false);
        dismiss();
    }

    /* renamed from: a */
    private void m11540a(PrivacyCert privacyCert) {
        m11542b(true, privacyCert);
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) this.f13484u.getLayoutParams();
        aVar.f2273k = R.id.rh;
        aVar.f2269g = R.id.rh;
        aVar.f2266d = R.id.rh;
        this.f13484u.setLayoutParams(aVar);
        this.f13485v.setVisibility(0);
        this.f13465b.setVisibility(0);
        this.f13487x.setVisibility(8);
        this.f13488y.setVisibility(8);
        this.f13481r.setTextColor(-1);
        this.f13482s.setTextColor(-2130706433);
        this.f13483t.setTextColor(-2130706433);
    }

    @Override // com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a.AbstractC3024b
    /* renamed from: a */
    public final void mo8237a(EffectChannelResponse effectChannelResponse) {
        ((AbstractC11137ac) AbstractC88979t.m154309b((Iterable) effectChannelResponse.getAllCategoryEffects()).mo143292d(C5219e.f13497a).mo143303h().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142916a((AbstractC88404ac) C11152e.m19788a(this.f13487x))).mo17937a(new C5220f(this), C5221g.f13499a);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.b67);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        this.f13474k = (AbstractC3060a) findViewById(R.id.d6b);
        this.f13475l = findViewById(R.id.d5t);
        this.f13473j = (HSImageView) findViewById(R.id.o9);
        this.f13476m = (LottieAnimationView) findViewById(R.id.mi);
        this.f13477n = (HSAnimImageView) findViewById(R.id.mj);
        this.f13478o = (ImageView) findViewById(R.id.nz);
        this.f13479p = findViewById(R.id.a0t);
        this.f13480q = findViewById(R.id.cyn);
        this.f13481r = (TextView) findViewById(R.id.rh);
        this.f13482s = (TextView) findViewById(R.id.e9m);
        this.f13483t = (TextView) findViewById(R.id.mp);
        this.f13484u = findViewById(R.id.bmu);
        this.f13485v = (SeekBar) findViewById(R.id.rf);
        this.f13465b = (TextView) findViewById(R.id.rg);
        this.f13487x = (RecyclerView) findViewById(R.id.e9e);
        this.f13488y = findViewById(R.id.mk);
        this.f13486w = (LiveButton) findViewById(R.id.kn);
        this.f13479p.setOnClickListener(this);
        findViewById(R.id.a6q).setOnClickListener(this);
        this.f13481r.setOnClickListener(this);
        this.f13482s.setOnClickListener(this);
        this.f13483t.setOnClickListener(this);
        this.f13485v.setOnSeekBarChangeListener(this);
        this.f13486w.setOnClickListener(this);
        this.f13465b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.android.live.liveinteract.multiguest.p333g.p334a.DialogC5211a.ViewTreeObserver$OnGlobalLayoutListenerC52121 */

            static {
                Covode.recordClassIndex(5804);
            }

            public final void onGlobalLayout() {
                DialogC5211a.this.mo10996c();
                DialogC5211a.this.f13465b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f13476m.setVisibility(8);
        this.f13477n.mo9389a(HSAnimImageView.m9804a("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
        this.f13480q.post(new RunnableC5216b(this));
        if (this.f13464E == EnumC5215a.SEND_REQUEST) {
            this.f13486w.setText(R.string.ejf);
        } else {
            this.f13486w.setText(R.string.gij);
        }
        this.f13462C = new AbstractC5170a.C5171a(getContext(), this.f13470g, new C5217c(this), new C5218d(this));
        if (!C6894d.m14753a().f17267l || this.f13464E != EnumC5215a.SEND_REQUEST) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            findViewById(R.id.bf5).setVisibility(8);
            findViewById(R.id.eym).setVisibility(8);
        } else {
            ((LiveTextView) findViewById(R.id.eym)).setText(C3966y.m9657a((int) R.string.e98));
        }
        if (this.f13464E == EnumC5215a.GO_LIVE) {
            C5714i.m12562e();
        }
        C4386c.m10499a().f11983d = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10878a(String str) {
        this.f13486w.setClickable(true);
        m11541a(false);
        dismiss();
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e3h);
        DataChannel dataChannel = this.f13470g;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4453w.class, str);
        }
    }

    public void onClick(View view) {
        C5134a.AbstractC5135a aVar;
        int id = view.getId();
        if (id == R.id.a0t) {
            C4386c.m10499a().f11983d = !C4386c.m10499a().f11983d;
            this.f13474k.mo8322a(PrivacyCert.Builder.with("bpea-401").usage("").tag("link mic reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.a6q) {
            if (this.f13464E == EnumC5215a.SEND_REQUEST) {
                dismiss();
            } else if (this.f13464E == EnumC5215a.GO_LIVE && (aVar = this.f13466c) != null) {
                aVar.mo10870a(false);
            }
        } else if (id == R.id.rh) {
            m11540a(PrivacyCert.Builder.with("bpea-470").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        } else if (id == R.id.e9m) {
            m11542b(true, PrivacyCert.Builder.with("bpea-468").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) this.f13484u.getLayoutParams();
            aVar2.f2273k = R.id.e9m;
            aVar2.f2269g = R.id.e9m;
            aVar2.f2266d = R.id.e9m;
            this.f13484u.setLayoutParams(aVar2);
            this.f13485v.setVisibility(8);
            this.f13465b.setVisibility(8);
            this.f13487x.setVisibility(0);
            this.f13488y.setVisibility(8);
            this.f13481r.setTextColor(-2130706433);
            this.f13482s.setTextColor(-1);
            this.f13483t.setTextColor(-2130706433);
        } else if (id == R.id.mp) {
            m11542b(false, PrivacyCert.Builder.with("bpea-466").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            ConstraintLayout.C0547a aVar3 = (ConstraintLayout.C0547a) this.f13484u.getLayoutParams();
            aVar3.f2273k = R.id.mp;
            aVar3.f2269g = R.id.mp;
            aVar3.f2266d = R.id.mp;
            this.f13484u.setLayoutParams(aVar3);
            this.f13485v.setVisibility(8);
            this.f13465b.setVisibility(8);
            this.f13487x.setVisibility(8);
            this.f13488y.setVisibility(0);
            this.f13481r.setTextColor(-2130706433);
            this.f13482s.setTextColor(-2130706433);
            this.f13483t.setTextColor(-1);
        } else if (id != R.id.kn) {
        } else {
            if (this.f13464E == EnumC5215a.SEND_REQUEST) {
                if (!this.f13466c.mo10875e()) {
                    mo10995b();
                } else if (C6229a.m13521a(getContext())) {
                    this.f13480q.scrollTo(-this.f13460A, 0);
                } else {
                    this.f13480q.scrollTo(this.f13460A, 0);
                }
            } else if (this.f13464E != EnumC5215a.GO_LIVE) {
            } else {
                if (C6894d.m14753a().f17273t >= 2) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e8n);
                    dismiss();
                } else if (C4384b.C4385a.m10496a().mo10147a() != 2) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e7o);
                    dismiss();
                } else {
                    this.f13486w.setClickable(false);
                    m11541a(true);
                    C6555i.m14021b();
                    C6555i.m9463b("invite_issue_check", "replyAnchor");
                    ((AbstractC7600a) this.f13474k).mo9074c(PrivacyCert.Builder.with("bpea-395").usage("").tag("link mic apply").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    C6894d.m14753a().mo13186a(true);
                    C5134a.AbstractC5135a aVar4 = this.f13466c;
                    if (aVar4 != null) {
                        aVar4.mo10870a(true);
                    }
                    DataChannel dataChannel = this.f13470g;
                    if (dataChannel != null) {
                        dataChannel.mo28320c(C4389ac.class, "");
                    }
                    C4386c.m10499a().mo10159a((Integer) 1);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10879a(Throwable th) {
        this.f13486w.setClickable(true);
        m11541a(false);
        C11264f.m19958a(getContext(), th, (int) R.string.go4);
    }

    /* renamed from: b */
    private void m11542b(boolean z, PrivacyCert privacyCert) {
        if (z) {
            ((View) this.f13474k).setVisibility(0);
            mo10994a(true, privacyCert);
            this.f13479p.setVisibility(0);
            this.f13473j.setVisibility(4);
            this.f13477n.setVisibility(4);
            this.f13477n.mo9391b();
            this.f13478o.setVisibility(4);
            this.f13466c.mo10866a(1);
            return;
        }
        mo10994a(false, privacyCert);
        ((View) this.f13474k).setVisibility(4);
        this.f13479p.setVisibility(4);
        this.f13473j.setVisibility(0);
        this.f13477n.setVisibility(0);
        this.f13477n.mo9390a();
        if (!this.f13461B) {
            ImageModel d = this.f13466c.mo10874d();
            C3941k.m9604a(this.f13473j, d, new C11291z(5, 0.0f));
            ImageView imageView = this.f13478o;
            C7577g.m15571a(imageView, d, imageView.getWidth(), this.f13478o.getHeight(), 2131234441);
            this.f13461B = true;
        }
        this.f13478o.setVisibility(0);
        this.f13466c.mo10866a(2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5134a.AbstractC5136b
    /* renamed from: a */
    public final void mo10877a(C7606e eVar, boolean z) {
        C6894d.m14753a().f17259d = eVar.f18874m;
        C6898g.C6899a.f17285a.mo13199a(((Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)).getOwnerUserId(), eVar.f18874m);
        DataChannel dataChannel = this.f13470g;
        if (dataChannel != null) {
            dataChannel.mo28320c(C4387aa.class, Boolean.valueOf(z));
            if (MultiLiveServerAutoJoinChannel.INSTANCE.getValue() && eVar.f18876o) {
                C7677b bVar = new C7677b();
                bVar.f19021a = eVar.f18876o;
                bVar.f19022b = eVar.f18877p;
                bVar.f19023c = eVar.f18878q;
                this.f13470g.mo28315b(C4388ab.class, bVar);
            }
        }
        this.f13486w.setClickable(true);
        m11541a(false);
        dismiss();
    }

    /* renamed from: a */
    public final void mo10992a(String str, C11672a aVar, int i) {
        if (C4147a.f11585c.equals(str)) {
            this.f13468e.mo10861a(str, aVar, i);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i >= 0 && i <= seekBar.getMax()) {
            C3854a.m9453a(4, f13459a, "newLevel: " + i + " fromUser: " + z);
            if (z) {
                mo10996c();
                this.f13466c.mo10872b(i);
                this.f13474k.mo8321a(i);
            }
        }
    }

    public DialogC5211a(Activity activity, C5134a.AbstractC5135a aVar, DataChannel dataChannel, EnumC5215a aVar2) {
        super(activity, R.style.a2_);
        this.f13466c = aVar;
        this.f13470g = dataChannel;
        this.f13467d = ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).stickerPresenter();
        this.f13464E = aVar2;
    }
}
