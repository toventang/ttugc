package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.experiment.C46954ft;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.View$OnClickListenerC64377l;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView */
public class RecommendCommonUserView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    View f145848a;

    /* renamed from: b */
    View f145849b;

    /* renamed from: c */
    View f145850c;

    /* renamed from: d */
    TextView f145851d;

    /* renamed from: e */
    public RecyclerView f145852e;

    /* renamed from: f */
    TextView f145853f;

    /* renamed from: g */
    public AbstractC64344a f145854g;

    /* renamed from: h */
    public String f145855h;

    /* renamed from: i */
    public boolean f145856i;

    /* renamed from: j */
    private ViewStub f145857j;

    /* renamed from: k */
    private View f145858k;

    /* renamed from: l */
    private View f145859l;

    /* renamed from: m */
    private View f145860m;

    /* renamed from: n */
    private View f145861n;

    /* renamed from: o */
    private View f145862o;

    /* renamed from: p */
    private View f145863p;

    /* renamed from: q */
    private C64357h f145864q;

    /* renamed from: r */
    private boolean f145865r = true;

    /* renamed from: s */
    private int f145866s;

    /* renamed from: t */
    private List<User> f145867t;

    /* renamed from: u */
    private int f145868u;

    /* renamed from: v */
    private C64352f f145869v = new C64352f(this);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView$a */
    public interface AbstractC64344a {
        static {
            Covode.recordClassIndex(75796);
        }

        /* renamed from: a */
        void mo81343a();
    }

    static {
        Covode.recordClassIndex(75792);
    }

    public Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f145909g;
    }

    /* renamed from: a */
    private void m116222a() {
        this.f145862o.setVisibility(0);
        this.f145861n.setVisibility(8);
    }

    private C64357h getAdapter() {
        if (this.f145864q == null) {
            this.f145864q = new C64357h();
        }
        return this.f145864q;
    }

    public List<User> getData() {
        if (this.f145867t == null) {
            this.f145867t = new ArrayList();
        }
        return this.f145867t;
    }

    public void setOnLookMoreUserListener(AbstractC64344a aVar) {
        this.f145854g = aVar;
    }

    public void setOnItemOperationListener(C64357h.AbstractC64362b bVar) {
        getAdapter().f145904b = bVar;
    }

    public void setOnViewAttachedToWindowListener(AbstractC39097c<View$OnClickListenerC64377l> cVar) {
        getAdapter().f145906d = cVar;
    }

    public void setReminderText(int i) {
        TextView textView = this.f145851d;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!(parent instanceof RecyclerView));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        m116223a(getContext());
        findViewById(R.id.c5l).setBackgroundResource(i);
    }

    public void setShowLookMore(boolean z) {
        int i;
        m116223a(getContext());
        this.f145865r = z;
        View view = this.f145859l;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        View view2 = this.f145860m;
        if (!z) {
            i2 = 4;
        }
        view2.setVisibility(i2);
        getAdapter().mo67829d(z);
    }

    private void setFindMoreLayout(List<User> list) {
        if (list.size() <= 3) {
            findViewById(R.id.b2f).setVisibility(8);
            return;
        }
        AvatarImageView avatarImageView = (AvatarImageView) this.f145849b.findViewById(R.id.b2d);
        AvatarImageView avatarImageView2 = (AvatarImageView) this.f145849b.findViewById(R.id.b2e);
        C34577e.m70592a((RemoteImageView) this.f145849b.findViewById(R.id.b2c), list.get(3).getAvatarThumb());
        if (list.size() >= 5) {
            C34577e.m70592a(avatarImageView, list.get(4).getAvatarThumb());
            if (list.size() >= 6) {
                C34577e.m70592a(avatarImageView2, list.get(5).getAvatarThumb());
            } else {
                avatarImageView2.setVisibility(8);
            }
        } else {
            avatarImageView.setVisibility(8);
            avatarImageView2.setVisibility(8);
        }
    }

    public void setPageType(int i) {
        this.f145866s = i;
        getAdapter().f145908f = i;
        C64352f fVar = this.f145869v;
        fVar.f145887a.f145848a.setVisibility(0);
        fVar.f145887a.f145849b.setVisibility(8);
        if (i == 0) {
            fVar.f145887a.f145848a.setVisibility(8);
            fVar.f145887a.f145849b.setVisibility(8);
            fVar.f145887a.f145853f.setVisibility(8);
            fVar.f145887a.f145850c.setVisibility(8);
            fVar.f145887a.f145851d.setText(R.string.evs);
            fVar.f145887a.setShowLookMore(false);
        }
    }

    public void onClick(View view) {
        AbstractC64344a aVar;
        AbstractC64344a aVar2;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.ch8 && this.f145865r && (aVar2 = this.f145854g) != null) {
            aVar2.mo81343a();
        }
        if (view.getId() == R.id.b2h && (aVar = this.f145854g) != null) {
            aVar.mo81343a();
        }
        if (view.getId() == R.id.d6k) {
            HashMap hashMap = new HashMap();
            int i = this.f145866s;
            if (i == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else if (i == 2) {
                hashMap.put("enter_from", "homepage_friends");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            C39162r.m79460a("click_privacy_tips", hashMap);
            String c = SharePrefCache.inst().getPrivacyReminderH5Url().mo59941c();
            if (c != null) {
                try {
                    SmartRouter.buildRoute(getContext(), "aweme://webview/?url=" + URLEncoder.encode(c, "UTF-8")).withParam("show_load_dialog", true).withParam("hide_nav_bar", false).withParam("use_webview_title", true).open();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    C51423a.m95786a((Exception) e);
                }
            }
        }
    }

    /* renamed from: a */
    private void m116223a(final Context context) {
        int i;
        MethodCollector.m26663i(7833);
        if (this.f145858k != null) {
            MethodCollector.m26664o(7833);
            return;
        }
        View inflate = this.f145857j.inflate();
        this.f145858k = inflate;
        this.f145859l = inflate.findViewById(R.id.ch8);
        this.f145860m = this.f145858k.findViewById(R.id.ch9);
        this.f145849b = this.f145858k.findViewById(R.id.b2h);
        this.f145848a = this.f145858k.findViewById(R.id.ch_);
        RecyclerView recyclerView = (RecyclerView) this.f145858k.findViewById(R.id.dgw);
        this.f145852e = recyclerView;
        recyclerView.setAdapter(getAdapter());
        this.f145863p = this.f145858k.findViewById(R.id.c9b);
        this.f145853f = (TextView) this.f145858k.findViewById(R.id.f1k);
        this.f145850c = this.f145858k.findViewById(R.id.d6k);
        this.f145851d = (TextView) this.f145858k.findViewById(R.id.f27);
        this.f145862o = this.f145858k.findViewById(R.id.ffu);
        this.f145861n = this.f145858k.findViewById(R.id.ffv);
        int i2 = 0;
        ((AbstractC1391ab) this.f145852e.getItemAnimator()).f4621m = false;
        getAdapter().f145905c = new C64357h.AbstractC64361a() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.RecommendCommonUserView.C643411 */

            static {
                Covode.recordClassIndex(75793);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h.AbstractC64361a
            /* renamed from: a */
            public final void mo103898a() {
                if (RecommendCommonUserView.this.f145854g != null) {
                    RecommendCommonUserView.this.f145854g.mo81343a();
                }
            }
        };
        getAdapter().f145911i = new View$OnClickListenerC64377l.AbstractC64379b() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.RecommendCommonUserView.C643422 */

            static {
                Covode.recordClassIndex(75794);
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.View$OnClickListenerC64377l.AbstractC64379b
            /* renamed from: a */
            public final void mo103899a() {
                RecommendCommonUserView.this.f145852e.mo4395a((int) C13628n.m24520b(context, 130.0f), 0);
            }
        };
        RecyclerView recyclerView2 = this.f145852e;
        recyclerView2.setPadding((int) C13628n.m24520b(recyclerView2.getContext(), 8.0f), 0, 0, 0);
        this.f145852e.setClipToPadding(false);
        this.f145852e.mo4402a(new C51453d(0, (int) C13628n.m24520b(context, 4.0f), 0));
        this.f145852e.setLayoutManager(new WrapLinearLayoutManager(0));
        this.f145859l.setOnClickListener(this);
        this.f145849b.setOnClickListener(this);
        if (!C16048b.m29633a().mo25421a(true, "enable_privacy_reminder", false)) {
            this.f145850c.setVisibility(8);
        } else {
            this.f145850c.setVisibility(0);
            this.f145850c.setOnClickListener(this);
        }
        if (!SharePrefCache.inst().getIsEuropeCountry().mo59941c().booleanValue() || (C46954ft.m90242b() && !C31575b.m65865g().isLogin())) {
            this.f145853f.setVisibility(8);
        } else {
            this.f145853f.setVisibility(0);
            String string = getContext().getResources().getString(R.string.erx);
            String a = C1764a.m5928a(getContext().getString(R.string.erw), new Object[]{string});
            String[] split = a.split(string);
            if (split == null || split.length != 2) {
                i = 0;
            } else {
                i2 = split[0].length();
                i = string.length() + i2;
            }
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ClickableSpan() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.RecommendCommonUserView.C643433 */

                static {
                    Covode.recordClassIndex(75795);
                }

                public final void onClick(View view) {
                    SmartRouter.buildRoute(RecommendCommonUserView.this.getContext(), "//privacy/setting").open();
                }

                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(RecommendCommonUserView.this.getResources().getColor(R.color.b9));
                    textPaint.setUnderlineText(false);
                }
            }, i2, i, 33);
            this.f145853f.setText(spannableString);
            this.f145853f.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.f145869v.f145887a.f145849b.setVisibility(8);
        MethodCollector.m26664o(7833);
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7697);
        ViewStub viewStub = new ViewStub(context);
        this.f145857j = viewStub;
        viewStub.setLayoutResource(R.layout.bj5);
        this.f145857j.setInflatedId(R.id.c5l);
        addView(this.f145857j);
        MethodCollector.m26664o(7697);
    }

    /* renamed from: a */
    public final void mo103885a(List<User> list, String str) {
        if (list != null) {
            m116223a(getContext());
            if (list.size() > 0) {
                m116222a();
            }
            this.f145855h = str;
            this.f145867t = list;
            getAdapter().mo62377b_(this.f145867t);
            getAdapter().f145907e = str;
            if (!this.f145865r || this.f145867t.size() < 10) {
                getAdapter().mo67829d(false);
            } else {
                getAdapter().mo67829d(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(7979);
        if (this.f145856i) {
            if (z && getHeight() > 0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                int top = getTop() - ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                if (this.f145868u == 0) {
                    this.f145868u = top;
                }
                if (top != this.f145868u) {
                    getTop();
                    int i5 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                    getTop();
                    int i6 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin;
                    ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin += this.f145868u - top;
                    post(new RunnableC64351e(this));
                    this.f145868u = top;
                }
            } else if (getHeight() == 0) {
                this.f145868u = 0;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        MethodCollector.m26664o(7979);
    }
}
