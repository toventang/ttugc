package com.p2082ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38194o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget */
public final class NewCommentAdWidget extends BaseCommentWidget implements View.OnClickListener, AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: i */
    static final /* synthetic */ AbstractC89286i[] f88007i = {new C89232y(NewCommentAdWidget.class, "mCommentAdLayout", "getMCommentAdLayout()Landroid/widget/LinearLayout;", 0), new C89232y(NewCommentAdWidget.class, "mCommentAdSourceTv", "getMCommentAdSourceTv()Landroid/widget/TextView;", 0), new C89232y(NewCommentAdWidget.class, "mCommentAdDesTv", "getMCommentAdDesTv()Landroid/widget/TextView;", 0), new C89232y(NewCommentAdWidget.class, "mCommentAdUserIv", "getMCommentAdUserIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new C89232y(NewCommentAdWidget.class, "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;", 0)};

    /* renamed from: j */
    public static final C37307a f88008j = new C37307a((byte) 0);

    /* renamed from: k */
    private final BaseCommentWidget.C37302a f88009k = m75298a((int) R.id.a91);

    /* renamed from: l */
    private final BaseCommentWidget.C37302a f88010l = m75298a((int) R.id.a90);

    /* renamed from: m */
    private final BaseCommentWidget.C37302a f88011m = m75298a((int) R.id.a8y);

    /* renamed from: n */
    private final BaseCommentWidget.C37302a f88012n = m75298a((int) R.id.a92);

    /* renamed from: o */
    private final BaseCommentWidget.C37302a f88013o = m75298a((int) R.id.a8x);

    /* renamed from: p */
    private final AbstractC89244h f88014p = C89250i.m154774a(EnumC89331m.NONE, C37308b.f88021a);

    /* renamed from: q */
    private boolean f88015q = true;

    /* renamed from: r */
    private boolean f88016r;

    /* renamed from: s */
    private int f88017s;

    /* renamed from: t */
    private boolean f88018t;

    /* renamed from: u */
    private int f88019u;

    /* renamed from: v */
    private final AbstractC89171a<C89391z> f88020v;

    static {
        Covode.recordClassIndex(44681);
    }

    /* renamed from: l */
    private final LinearLayout m75337l() {
        return (LinearLayout) this.f88009k.mo64904a(this, f88007i[0]);
    }

    /* renamed from: m */
    private final View m75338m() {
        return this.f88013o.mo64904a(this, f88007i[4]);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: c */
    public final int mo60207c() {
        return R.layout.bju;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget$a */
    public static final class C37307a {
        static {
            Covode.recordClassIndex(44682);
        }

        private C37307a() {
        }

        public /* synthetic */ C37307a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget$b */
    static final class C37308b extends AbstractC89220m implements AbstractC89171a<AbstractC38029b> {

        /* renamed from: a */
        public static final C37308b f88021a = new C37308b();

        static {
            Covode.recordClassIndex(44683);
        }

        C37308b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC38029b invoke() {
            return C373091.f88022a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        m75340o();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        m75339n();
    }

    /* renamed from: p */
    private final void m75341p() {
        LinearLayout l = m75337l();
        Context context = this.f80270b;
        C89219l.m154716b(context, "");
        m75335a(l, context.getResources().getDimensionPixelOffset(R.dimen.bi), 0, false);
    }

    /* renamed from: q */
    private final void m75342q() {
        LinearLayout l = m75337l();
        Context context = this.f80270b;
        C89219l.m154716b(context, "");
        m75335a(l, context.getResources().getDimensionPixelOffset(R.dimen.bi), 300, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: k */
    public final void mo64903k() {
        m75337l().setOnClickListener(this);
        m75338m().setOnClickListener(this);
        m75338m().setAlpha(0.5f);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.f80273e.mo60190a("comment_ad_struct", this, true).mo60190a("comment_ad_view_state", this, true);
    }

    /* renamed from: n */
    private final void m75339n() {
        if (mo64898f() && mo64897e().isAppAd() && !C37699a.m76276av(mo64897e()) && !this.f88016r) {
            this.f88016r = true;
        }
    }

    /* renamed from: o */
    private final void m75340o() {
        if (mo64898f() && mo64897e().isAppAd() && mo64897e().getAwemeRawAd() != null && this.f88016r) {
            this.f88016r = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* renamed from: b */
    private final void m75336b(int i) {
        if (i == 0) {
            if (this.f88017s != 0) {
                this.f80273e.mo60193b("comment_shown", (AbstractC1214u<C33942b>) this);
            }
        } else if (i > 0) {
            this.f80273e.mo60190a("comment_shown", this, true);
        }
        this.f88017s = i;
    }

    public NewCommentAdWidget(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f88020v = aVar;
    }

    public final void onClick(View view) {
        ViewGroup.LayoutParams layoutParams;
        AwemeRawAd awemeRawAd;
        ClickAgent.onClick(view);
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin >= 0 && mo64898f() && (awemeRawAd = mo64897e().getAwemeRawAd()) != null) {
            C89219l.m154716b(awemeRawAd, "");
            int id = view.getId();
            if (id == R.id.a91) {
                String type = awemeRawAd.getType();
                if (type != null && type.length() != 0) {
                    Aweme e = mo64897e();
                    if (e.isAd()) {
                        C18129a.m33746a("comment_end_ad", "click", e.getAwemeRawAd()).mo28900b("refer", "button").mo28897a("anchor_id", C38189j.m77501b(e)).mo28897a("room_id", C38189j.m77461a(e)).mo28901b();
                        AwemeRawAd awemeRawAd2 = e.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            C38164aj.m77369a("click", awemeRawAd2.getClickTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), new C38194o(awemeRawAd2));
                        }
                    }
                    if (C38767w.m78666a(this.f80270b, mo64897e(), 6, (AbstractC38029b) this.f88014p.getValue())) {
                        this.f88020v.invoke();
                    }
                }
            } else if (id == R.id.a8x) {
                this.f88015q = false;
                Context context = this.f80270b;
                JSONObject a = C38189j.m77470a(context, awemeRawAd, true, (Map<String, String>) null);
                if (!TextUtils.isEmpty("button")) {
                    try {
                        a.put("refer", "button");
                    } catch (JSONException unused) {
                    }
                }
                C38189j.m77511b(context, "close", awemeRawAd, a);
                C18129a.m33746a("comment_end_ad", "close", awemeRawAd).mo28900b("refer", "button").mo28902c();
                m75342q();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    /* renamed from: a */
    public final void mo64896a(C33942b bVar) {
        int i;
        int i2;
        C38255s sVar;
        Aweme aweme;
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f80277a;
            boolean z = false;
            switch (str.hashCode()) {
                case -1106422991:
                    if (str.equals("comment_shown")) {
                        boolean a = bVar.mo60212a();
                        if (a == null) {
                            a = false;
                        }
                        if (C89219l.m154714a(a, (Object) 0) && (i = this.f88017s) > 0 && this.f88018t && (i2 = this.f88019u) < i) {
                            int i3 = i2 + 1;
                            this.f88019u = i3;
                            if (i3 == i && this.f88015q) {
                                m75335a(m75337l(), C34728n.m70946a(16.0d), 300, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 566175283:
                    if (str.equals("comment_ad_view_state")) {
                        boolean a2 = bVar.mo60212a();
                        if (a2 == null) {
                            a2 = false;
                        }
                        if (C89219l.m154714a(a2, (Object) 0)) {
                            m75341p();
                            return;
                        } else if (C89219l.m154714a(a2, (Object) 1)) {
                            m75342q();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 584899985:
                    if (str.equals("comment_ad_struct") && (sVar = (C38255s) bVar.mo60212a()) != null) {
                        m75336b(sVar.getShowButtonNumber());
                        BaseCommentWidget.C37302a aVar = this.f88010l;
                        AbstractC89286i<?>[] iVarArr = f88007i;
                        ((TextView) aVar.mo64904a(this, iVarArr[1])).setText(sVar.getSource());
                        ((TextView) this.f88011m.mo64904a(this, iVarArr[2])).setText(sVar.getTitle());
                        C34577e.m70592a((RemoteImageView) this.f88012n.mo64904a(this, iVarArr[3]), sVar.getAvatarIcon());
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(C13628n.m24520b(this.f80270b, 4.0f));
                        gradientDrawable.setColor(Color.parseColor(C37699a.m76265ak(mo64897e())));
                        m75337l().setBackground(gradientDrawable);
                        return;
                    }
                    return;
                case 2016314694:
                    if (str.equals("comment_aweme_and_params")) {
                        this.f88015q = true;
                        this.f88019u = 0;
                        m75336b(0);
                        m75341p();
                        C89378p pVar = (C89378p) bVar.mo60212a();
                        if (pVar != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (awemeRawAd != null) {
                                z = awemeRawAd.isCommentAreaSwitch();
                            }
                            this.f88018t = z;
                            m75340o();
                            m75339n();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private final void m75335a(View view, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            int i3 = marginLayoutParams2.bottomMargin;
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (!z2) {
                    C38189j.m77486a(this.f80270b, mo64897e().getAwemeRawAd());
                    C18129a.m33746a("comment_end_ad", "othershow", mo64897e().getAwemeRawAd()).mo28902c();
                    C80595j.m139737a(view, i3, i, i2).start();
                }
            } else if (z2) {
                C80595j.m139737a(view, i3, i, i2).start();
            }
        }
    }
}
