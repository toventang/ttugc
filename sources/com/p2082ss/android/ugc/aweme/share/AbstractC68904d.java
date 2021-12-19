package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.p025c.C0484a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.aweme.share.p3776ui.SharePublishLayout;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.MicroShareChannelBar;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.d */
public abstract class AbstractC68904d extends PopupWindow implements AbstractC17242a, AbstractC68903b {

    /* renamed from: a */
    protected View f154120a;

    /* renamed from: b */
    protected RemoteImageView f154121b;

    /* renamed from: c */
    protected Activity f154122c;

    /* renamed from: d */
    LinearLayout f154123d;

    /* renamed from: e */
    RunnableC68905a f154124e;

    /* renamed from: f */
    public int f154125f = 4000;

    /* renamed from: g */
    protected SharePublishLayout f154126g;

    /* renamed from: h */
    boolean f154127h;

    /* renamed from: i */
    protected LinearLayout f154128i;

    /* renamed from: j */
    protected C69684e f154129j;

    /* renamed from: k */
    protected Aweme f154130k;

    /* renamed from: l */
    protected MicroShareChannelBar f154131l;

    /* renamed from: m */
    public long f154132m;

    /* renamed from: n */
    private View f154133n;

    /* renamed from: o */
    private RemoteImageView f154134o;

    /* renamed from: p */
    private TextView f154135p;

    /* renamed from: q */
    private View f154136q;

    /* renamed from: r */
    private int f154137r = 49;

    /* renamed from: s */
    private int f154138s = 59;

    /* renamed from: t */
    private int f154139t = 23;

    /* renamed from: u */
    private int f154140u = 23;

    static {
        Covode.recordClassIndex(81210);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: b */
    public void mo27279b() {
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a
    /* renamed from: a */
    public void mo27278a() {
        mo109462f();
    }

    /* renamed from: f */
    public final void mo109462f() {
        this.f154127h = false;
        mo85245d();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.d$a */
    class RunnableC68905a implements Runnable {

        /* renamed from: a */
        boolean f154141a;

        static {
            Covode.recordClassIndex(81211);
        }

        public final void run() {
            if (!this.f154141a && System.currentTimeMillis() >= AbstractC68904d.this.f154132m) {
                AbstractC68904d.this.mo85245d();
            }
        }

        private RunnableC68905a() {
        }

        /* synthetic */ RunnableC68905a(AbstractC68904d dVar, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: d */
    public final void mo85245d() {
        if (isShowing() && !this.f154127h) {
            try {
                Activity activity = this.f154122c;
                if (activity != null && !activity.isFinishing()) {
                    this.f154126g.mo27262a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo109442e() {
        View decorView = this.f154122c.getWindow().getDecorView();
        int i = Build.VERSION.SDK_INT;
        showAtLocation(decorView, 48, 0, -C13628n.m24525e(this.f154122c));
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    /* renamed from: c */
    public final void mo85244c() {
        this.f154126g.mo27261a();
        Activity activity = this.f154122c;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = this.f154125f;
            this.f154132m = currentTimeMillis + ((long) i);
            this.f154126g.postDelayed(this.f154124e, (long) i);
            if (this.f154120a.getParent() != null) {
                ((ViewGroup) this.f154120a.getParent()).removeView(this.f154120a);
            }
            try {
                mo109442e();
            } catch (WindowManager.BadTokenException e) {
                e.printStackTrace();
            }
            C0484a aVar = new C0484a();
            aVar.put("enter_method", "publish_then_share");
            C39162r.m79460a("share_panel_show", aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo109463g() {
        if (this.f154130k != null) {
            AwemeService.m70060b().mo60677a(this.f154130k);
            C36125t.m73596a(C36125t.m73591a(), this.f154122c, C36131u.m73602a("aweme://aweme/detail/" + this.f154130k.getAid()).mo63247a("profile_enterprise_type", this.f154130k.getEnterpriseType()).mo63248a("query_aweme_mode", "from_local").mo63248a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").mo63249a());
            AVExternalServiceImpl.m113114a().publishService().setPublishStatus(11);
            dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public final void mo109461a(Aweme aweme) {
        this.f154130k = aweme;
        if (aweme.getVideo() != null) {
            C34577e.m70593a(this.f154121b, aweme.getVideo().getCover(), (int) C13628n.m24520b(this.f154122c, (float) this.f154137r), (int) C13628n.m24520b(this.f154122c, (float) this.f154138s));
        }
    }

    public AbstractC68904d(Activity activity, C69684e eVar) {
        super(activity);
        this.f154122c = activity;
        this.f154129j = eVar;
        this.f154120a = LayoutInflater.from(activity).inflate(R.layout.az5, (ViewGroup) null);
        this.f154124e = new RunnableC68905a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f154120a);
        setWidth(C13628n.m24504a(this.f154122c));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a16);
        View view = this.f154120a;
        this.f154121b = (RemoteImageView) view.findViewById(R.id.bwr);
        this.f154123d = (LinearLayout) view.findViewById(R.id.dlx);
        this.f154126g = (SharePublishLayout) view.findViewById(R.id.dat);
        this.f154134o = (RemoteImageView) view.findViewById(R.id.bue);
        this.f154135p = (TextView) view.findViewById(R.id.eu1);
        this.f154133n = view.findViewById(R.id.cco);
        this.f154136q = view.findViewById(R.id.c9a);
        this.f154128i = (LinearLayout) view.findViewById(R.id.cca);
        this.f154126g.mo27263a(this.f154123d);
        this.f154126g.setPullUpListener(this);
        this.f154123d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f154121b.setOnClickListener(new View$OnClickListenerC68918e(this));
        this.f154131l = (MicroShareChannelBar) ((ViewStub) view.findViewById(R.id.dyl)).inflate().findViewById(R.id.dyk);
        this.f154126g.setInternalTouchEventListener(new C68921f(this));
    }
}
