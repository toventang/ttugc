package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.p2617a.C38545a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33172g;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.C33174i;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.C33168a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33136a;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2287b.C33144a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80509gq;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.d.b */
public final class C33151b extends LinearLayout {

    /* renamed from: a */
    CircleImageView f78753a;

    /* renamed from: b */
    TuxTextView f78754b;

    /* renamed from: c */
    MentionTextView f78755c;

    /* renamed from: d */
    View f78756d;

    /* renamed from: e */
    View f78757e;

    /* renamed from: f */
    TextView f78758f;

    /* renamed from: g */
    MentionTextView f78759g;

    /* renamed from: h */
    ImageView f78760h;

    /* renamed from: i */
    View f78761i;

    /* renamed from: j */
    TextView f78762j;

    /* renamed from: k */
    ImageView f78763k;

    /* renamed from: l */
    TextView f78764l;

    /* renamed from: m */
    TextView f78765m;

    /* renamed from: n */
    RelativeLayout f78766n;

    /* renamed from: o */
    TextView f78767o;

    /* renamed from: p */
    LinearLayout f78768p;

    /* renamed from: q */
    int f78769q;

    /* renamed from: r */
    protected String f78770r;

    /* renamed from: s */
    protected Aweme f78771s;

    /* renamed from: t */
    protected Keva f78772t;

    /* renamed from: u */
    protected WeakReference<AbstractC33136a> f78773u;

    /* renamed from: v */
    AbstractC38029b f78774v;

    /* renamed from: w */
    private C38255s f78775w;

    /* renamed from: x */
    private AbstractC89171a<C89391z> f78776x;

    static {
        Covode.recordClassIndex(39969);
    }

    public final C38255s getData() {
        return this.f78775w;
    }

    public final String getEventType() {
        return this.f78770r;
    }

    /* renamed from: d */
    private void m67940d() {
        if (this.f78773u.get() != null) {
            this.f78773u.get().mo58996a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo59012a() {
        Aweme aweme = this.f78771s;
        if (aweme != null && aweme.isAd()) {
            m67936a("title");
            m67935a(4);
            m67939c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getDiggSpKey() {
        return "COMMENT_DIGG" + this.f78775w.getAwemeId();
    }

    /* renamed from: b */
    private void m67938b() {
        if (this.f78775w.getUserDigged() == 1) {
            this.f78763k.setSelected(true);
            ImageView imageView = this.f78763k;
            imageView.setImageDrawable(imageView.getResources().getDrawable(2131232219));
            return;
        }
        this.f78763k.setSelected(false);
        ImageView imageView2 = this.f78763k;
        imageView2.setImageDrawable(imageView2.getResources().getDrawable(2131232220));
    }

    /* renamed from: c */
    private void m67939c() {
        Aweme aweme;
        if (this.f78775w != null && (aweme = this.f78771s) != null && aweme.getAdCommentStruct() == null) {
            if (C33168a.f78817a != null) {
                C33168a.f78817a.mo59056a(getContext(), this.f78771s);
            }
            m67940d();
            if (C33168a.f78817a != null) {
                C33168a.f78817a.mo59065a(this.f78770r, "click_comment_link", this.f78771s, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Aweme aweme = this.f78771s;
        if (aweme != null && aweme.isAd()) {
            if (this.f78775w.getCommentStyle() == 1) {
                AwemeRawAd awemeRawAd = this.f78771s.getAwemeRawAd();
                C38187i.C38188a aVar = new C38187i.C38188a();
                aVar.f90222a = awemeRawAd;
                C33144a.m67925a("othershow", awemeRawAd, aVar.mo66507a());
                C18129a.m33746a("comment_first_ad", "othershow", this.f78771s.getAwemeRawAd()).mo28897a("anchor_id", m67937b(this.f78771s)).mo28897a("room_id", m67934a(this.f78771s)).mo28902c();
            } else if (this.f78775w.getCommentStyle() == 0) {
                AwemeRawAd awemeRawAd2 = this.f78771s.getAwemeRawAd();
                C38187i.C38188a aVar2 = new C38187i.C38188a();
                aVar2.f90222a = awemeRawAd2;
                C33144a.m67925a("comment_first_show", awemeRawAd2, aVar2.mo66507a());
                C18129a.m33746a("comment_first_ad", "comment_first_show", this.f78771s.getAwemeRawAd()).mo28897a("anchor_id", m67937b(this.f78771s)).mo28897a("room_id", m67934a(this.f78771s)).mo28902c();
            }
        }
        if (C33168a.f78817a != null) {
            C33168a.f78817a.mo59065a(this.f78770r, "show_comment_link", this.f78771s, false);
        }
    }

    public final void setEventType(String str) {
        this.f78770r = str;
    }

    public C33151b(Context context) {
        this(context, (byte) 0);
    }

    public final void setOnInternalEventListener(AbstractC33136a aVar) {
        this.f78773u = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private void m67935a(int i) {
        Aweme aweme;
        if (this.f78775w != null && (aweme = this.f78771s) != null && aweme.isAd() && C33168a.f78817a != null) {
            C33168a.f78817a.mo59066a(getContext(), this.f78771s, i, this.f78774v);
        }
    }

    /* renamed from: a */
    private static String m67934a(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().f114485id);
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().roomId);
        }
    }

    /* renamed from: b */
    private static String m67937b(Aweme aweme) {
        if (aweme.isLive()) {
            if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null) {
                return null;
            }
            return String.valueOf(aweme.getRoomFeedCellStruct().getNewLiveRoomData().getAnchorId());
        } else if (aweme.getAuthor() == null || !aweme.getAuthor().isLive()) {
            return null;
        } else {
            return String.valueOf(aweme.getAuthor().getUid());
        }
    }

    /* renamed from: a */
    private void m67936a(String str) {
        AwemeRawAd awemeRawAd = this.f78771s.getAwemeRawAd();
        if (awemeRawAd != null) {
            String openUrl = awemeRawAd.getOpenUrl();
            C18129a.m33746a("comment_first_ad", "click", awemeRawAd).mo28900b("refer", str).mo28897a("anchor_id", m67937b(this.f78771s)).mo28897a("room_id", m67934a(this.f78771s)).mo28901b();
            if (C33168a.f78817a != null) {
                C33168a.f78817a.mo59063a(awemeRawAd);
            }
            if (C33168a.f78817a == null || !C33168a.f78817a.mo59068a(openUrl)) {
                C33144a.m67926b(awemeRawAd);
                C18129a.m33746a("comment_first_ad", "click_title", this.f78771s.getAwemeRawAd()).mo28897a("anchor_id", m67937b(this.f78771s)).mo28897a("room_id", m67934a(this.f78771s)).mo28902c();
                return;
            }
            C33144a.m67924a(awemeRawAd);
            C18129a.m33746a("comment_first_ad", "click_message", awemeRawAd).mo28897a("anchor_id", m67937b(this.f78771s)).mo28897a("room_id", m67934a(this.f78771s)).mo28902c();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo59024i(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33151b.mo59024i(android.view.View):void");
    }

    public final void setData(C38255s sVar) {
        boolean z;
        this.f78775w = sVar;
        String aid = sVar.getAid();
        IAwemeService b = AwemeService.m70060b();
        Aweme d = b.mo60690d(aid);
        Aweme b2 = b.mo60684b(aid);
        Aweme a = b.mo60679a(aid);
        if (d == null) {
            if (b2 != null) {
                d = b2;
            } else {
                d = a;
            }
        }
        this.f78771s = d;
        if (((C24246a) this.f78753a.getHierarchy()).f57470a != null) {
            ((C24246a) this.f78753a.getHierarchy()).f57470a.mo39985c((float) C34728n.m70946a(0.5d));
            ((C24246a) this.f78753a.getHierarchy()).f57470a.f57504f = this.f78753a.getResources().getColor(R.color.b6);
        }
        User user = this.f78775w.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                C34577e.m70591a(this.f78753a, 2131232314);
            } else {
                CircleImageView circleImageView = this.f78753a;
                int i = this.f78769q;
                C34577e.m70595a(circleImageView, avatarThumb, i, i, null, circleImageView.getControllerListener());
            }
        }
        String commentInfo = this.f78775w.getCommentInfo();
        if (!(this.f78771s == null || TextUtils.isEmpty(commentInfo) || C33168a.f78817a == null)) {
            boolean isAd = this.f78771s.isAd();
            if (this.f78771s.getAdCommentStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (isAd && z) {
                List<TextExtraStruct> a2 = C33174i.f78834a.mo59078a(this.f78775w, this.f78771s.getAwemeRawAd(), this.f78776x);
                this.f78755c.setText(C33168a.f78817a.mo59070b(this.f78775w));
                this.f78755c.mo124999a(a2, new C33172g(), (MentionTextView.AbstractC81407d) null);
                this.f78755c.setMovementMethod(LinkMovementMethod.getInstance());
                C38545a.m78162a(this.f78768p);
            } else {
                List<TextExtraStruct> a3 = C33168a.f78817a.mo59052a(getContext(), this.f78771s, this.f78775w);
                this.f78755c.setText(C33168a.f78817a.mo59070b(this.f78775w));
                if (a3 != null) {
                    this.f78755c.mo124999a(a3, new C33172g(), (MentionTextView.AbstractC81407d) null);
                    this.f78755c.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        this.f78762j.setVisibility(8);
        this.f78766n.setVisibility(0);
        int i2 = this.f78772t.getInt(getDiggSpKey(), -1);
        if (i2 != -1) {
            this.f78775w.setUserDigged(i2);
        }
        m67938b();
        String str = "";
        if (this.f78775w.showCreatorTag()) {
            this.f78764l.setVisibility(0);
            this.f78764l.setText(C1764a.m5928a(getResources().getString(R.string.akf), new Object[]{str}));
            this.f78765m.setVisibility(0);
            this.f78765m.setText(getResources().getText(R.string.wr));
        }
        TuxTextView tuxTextView = this.f78754b;
        if (!TextUtils.isEmpty(this.f78775w.getCommentNickName())) {
            str = this.f78775w.getCommentNickName();
        }
        tuxTextView.setText(str);
        this.f78754b.setTuxFont(62);
        this.f78754b.setTextColor(C0643b.m2378c(getContext(), R.color.c4));
    }

    private C33151b(Context context, byte b) {
        this(context, (char) 0);
    }

    private C33151b(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(13060);
        this.f78770r = "";
        this.f78772t = Keva.getRepo("ad_comment");
        this.f78774v = new AbstractC38029b() {
            /* class com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d.C33151b.C331521 */

            static {
                Covode.recordClassIndex(39970);
            }
        };
        this.f78776x = new C33153c(this);
        LayoutInflater.from(context).inflate(R.layout.a8z, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f78769q = C34728n.m70946a(32.0d);
        this.f78753a = (CircleImageView) findViewById(R.id.nz);
        this.f78754b = (TuxTextView) findViewById(R.id.title);
        this.f78755c = (MentionTextView) findViewById(R.id.acq);
        this.f78756d = findViewById(R.id.a99);
        this.f78757e = findViewById(R.id.di1);
        this.f78758f = (TextView) findViewById(R.id.dib);
        this.f78759g = (MentionTextView) findViewById(R.id.di2);
        this.f78760h = (ImageView) findViewById(R.id.axv);
        this.f78761i = findViewById(R.id.di3);
        this.f78762j = (TextView) findViewById(R.id.a_v);
        this.f78763k = (ImageView) findViewById(R.id.bv1);
        this.f78764l = (TextView) findViewById(R.id.a_e);
        this.f78765m = (TextView) findViewById(R.id.a_q);
        this.f78766n = (RelativeLayout) findViewById(R.id.c3u);
        this.f78767o = (TextView) findViewById(R.id.di0);
        this.f78768p = (LinearLayout) findViewById(R.id.adi);
        View findViewById = findViewById(R.id.c3u);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC33154d(this));
        }
        View findViewById2 = findViewById(R.id.nz);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC33155e(this));
        }
        View findViewById3 = findViewById(R.id.title);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC33156f(this));
        }
        View findViewById4 = findViewById(R.id.a9w);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC33157g(this));
        }
        View findViewById5 = findViewById(R.id.adi);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC33158h(this));
        }
        View findViewById6 = findViewById(R.id.acq);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new View$OnClickListenerC33159i(this));
        }
        View findViewById7 = findViewById(R.id.a99);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new View$OnClickListenerC33160j(this));
        }
        View findViewById8 = findViewById(R.id.a_q);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new View$OnClickListenerC33161k(this));
        }
        View findViewById9 = findViewById(R.id.a_e);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new View$OnClickListenerC33162l(this));
        }
        setOrientation(1);
        C80509gq.m139525a(this.f78755c);
        C80509gq.m139525a(this.f78759g);
        MethodCollector.m26664o(13060);
    }
}
