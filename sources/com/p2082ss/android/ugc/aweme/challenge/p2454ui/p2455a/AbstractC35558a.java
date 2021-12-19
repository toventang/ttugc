package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p2082ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p2082ss.android.ugc.aweme.challenge.p2451g.C35520a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a.C35565a;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a.C35566b;
import com.p2082ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a */
public abstract class AbstractC35558a extends FrameLayout implements AbstractC90252i, AbstractC90253j {

    /* renamed from: g */
    public static final C35559a f83841g = new C35559a((byte) 0);

    /* renamed from: A */
    private final List<AbstractC35585l> f83842A = new ArrayList();

    /* renamed from: B */
    private final C35583j f83843B;

    /* renamed from: C */
    private ChallengeDetailViewModel f83844C;

    /* renamed from: D */
    private final AbstractC1214u<C89378p<Integer, C35520a>> f83845D;

    /* renamed from: E */
    private final C35561c f83846E;

    /* renamed from: a */
    public LinearLayout f83847a;

    /* renamed from: b */
    protected SmartImageView f83848b;

    /* renamed from: c */
    protected TextView f83849c;

    /* renamed from: d */
    public ViewStub f83850d;

    /* renamed from: e */
    protected ChallengeDetail f83851e;

    /* renamed from: f */
    protected Challenge f83852f;

    /* renamed from: h */
    private final String f83853h = "AbsCommonHeaderView";

    /* renamed from: i */
    private View f83854i;

    /* renamed from: j */
    private TextView f83855j;

    /* renamed from: k */
    private LinearLayout f83856k;

    /* renamed from: l */
    private TextView f83857l;

    /* renamed from: m */
    private ImageView f83858m;

    /* renamed from: n */
    private ViewStub f83859n;

    /* renamed from: o */
    private View f83860o;

    /* renamed from: p */
    private TextView f83861p;

    /* renamed from: q */
    private RecyclerView f83862q;

    /* renamed from: r */
    private ViewStub f83863r;

    /* renamed from: s */
    private View f83864s;

    /* renamed from: t */
    private View f83865t;

    /* renamed from: u */
    private TextView f83866u;

    /* renamed from: v */
    private RecyclerView f83867v;

    /* renamed from: w */
    private C35565a f83868w;

    /* renamed from: x */
    private FrameLayout f83869x;

    /* renamed from: y */
    private SmartImageView f83870y;

    /* renamed from: z */
    private View f83871z;

    static {
        Covode.recordClassIndex(42782);
    }

    /* renamed from: a */
    public void mo62538a() {
    }

    /* access modifiers changed from: protected */
    public abstract int getAttrsResId();

    /* access modifiers changed from: protected */
    public abstract int getButtonResId();

    /* access modifiers changed from: protected */
    public abstract int getLayoutResId();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(AbstractC35558a.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$a */
    public static final class C35559a {
        static {
            Covode.recordClassIndex(42783);
        }

        private C35559a() {
        }

        public /* synthetic */ C35559a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m72672a(ChallengeDetail challengeDetail) {
            ChallengeTransform transfrom;
            C89219l.m154721d(challengeDetail, "");
            Challenge challenge = challengeDetail.challenge;
            if (challenge == null || (transfrom = challenge.getTransfrom()) == null || !C35570b.m72676a(transfrom.getText()) || !C35570b.m72676a(transfrom.getAction())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$f */
    public static final class C35564f extends RecyclerView.AbstractC1361h {
        static {
            Covode.recordClassIndex(42788);
        }

        C35564f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (d == 0) {
                rect.left = C34728n.m70946a(16.0d);
            }
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(adapter, "");
            if (d == adapter.getItemCount() - 1) {
                rect.right = C34728n.m70946a(16.0d);
            } else {
                rect.right = C34728n.m70946a(4.0d);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final View getMDescContainer() {
        return this.f83854i;
    }

    /* access modifiers changed from: protected */
    public final TextView getMDescTv() {
        return this.f83855j;
    }

    /* access modifiers changed from: protected */
    public final ImageView getMExpandIv() {
        return this.f83858m;
    }

    /* access modifiers changed from: protected */
    public final TextView getMExpandTv() {
        return this.f83857l;
    }

    /* access modifiers changed from: protected */
    public final C35583j getMHeaderParam() {
        return this.f83843B;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetailViewModel getMViewModel() {
        return this.f83844C;
    }

    public final String getTag() {
        return this.f83853h;
    }

    public final ChallengeDetailParam getDetailParam() {
        return this.f83843B.f83916f;
    }

    public final ActivityC0945e getActivity() {
        Activity d = C34729o.m70962d(this);
        if (!(d instanceof ActivityC0945e)) {
            d = null;
        }
        return (ActivityC0945e) d;
    }

    public final int getAvatarContainerHight() {
        SmartImageView smartImageView = this.f83848b;
        if (smartImageView == null) {
            C89219l.m154710a("mAvatar");
        }
        return smartImageView.getHeight();
    }

    /* access modifiers changed from: protected */
    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.f83848b;
        if (smartImageView == null) {
            C89219l.m154710a("mAvatar");
        }
        return smartImageView;
    }

    /* access modifiers changed from: protected */
    public final Challenge getMChallenge() {
        Challenge challenge = this.f83852f;
        if (challenge == null) {
            C89219l.m154710a("mChallenge");
        }
        return challenge;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.f83851e;
        if (challengeDetail == null) {
            C89219l.m154710a("mChallengeDetail");
        }
        return challengeDetail;
    }

    public final ViewStub getMDescContainerVs() {
        ViewStub viewStub = this.f83850d;
        if (viewStub == null) {
            C89219l.m154710a("mDescContainerVs");
        }
        return viewStub;
    }

    public final LinearLayout getMHeaderContainer() {
        LinearLayout linearLayout = this.f83847a;
        if (linearLayout == null) {
            C89219l.m154710a("mHeaderContainer");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final TextView getMTitle() {
        TextView textView = this.f83849c;
        if (textView == null) {
            C89219l.m154710a("mTitle");
        }
        return textView;
    }

    /* renamed from: c */
    public final void mo62543c() {
        C33943c<C89378p<Integer, C35520a>> cVar;
        C89378p<Integer, C35520a> value;
        C35520a second;
        ChallengeDetailViewModel challengeDetailViewModel = this.f83844C;
        if (challengeDetailViewModel != null && (cVar = challengeDetailViewModel.f84177b) != null && (value = cVar.getValue()) != null && (second = value.getSecond()) != null) {
            ChallengeDetail challengeDetail = this.f83851e;
            if (challengeDetail == null) {
                C89219l.m154710a("mChallengeDetail");
            }
            second.mo62418a(challengeDetail.slideList);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        ChallengeDetailViewModel a = ChallengeDetailViewModel.C35676a.m72830a(activity);
        this.f83844C = a;
        if (a == null) {
            C89219l.m154715b();
        }
        C33943c<C89378p<Integer, C35520a>> cVar = a.f84177b;
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        cVar.observe(activity2, this.f83845D);
        mo62543c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.m156962a().mo145395b(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.f83844C;
        if (challengeDetailViewModel == null) {
            C89219l.m154715b();
        }
        challengeDetailViewModel.f84177b.removeObserver(this.f83845D);
        this.f83844C = null;
        Iterator<T> it = this.f83842A.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: b */
    public void mo62542b() {
        View findViewById = findViewById(R.id.be4);
        C89219l.m154716b(findViewById, "");
        this.f83847a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.nz);
        C89219l.m154716b(findViewById2, "");
        this.f83848b = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.title);
        C89219l.m154716b(findViewById3, "");
        this.f83849c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.fhd);
        C89219l.m154716b(findViewById4, "");
        this.f83850d = (ViewStub) findViewById4;
        View findViewById5 = findViewById(R.id.fho);
        C89219l.m154716b(findViewById5, "");
        this.f83859n = (ViewStub) findViewById5;
        View findViewById6 = findViewById(R.id.fhf);
        C89219l.m154716b(findViewById6, "");
        this.f83863r = (ViewStub) findViewById6;
        View findViewById7 = findViewById(R.id.ve);
        C89219l.m154716b(findViewById7, "");
        this.f83871z = findViewById7;
        Iterator<T> it = this.f83842A.iterator();
        while (it.hasNext()) {
            it.next().mo62524a(this, this.f83843B);
        }
    }

    /* renamed from: d */
    public final void mo62544d() {
        View view = this.f83871z;
        if (view == null) {
            C89219l.m154710a("mBottomSpace");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout linearLayout = this.f83847a;
        if (linearLayout == null) {
            C89219l.m154710a("mHeaderContainer");
        }
        for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            LinearLayout linearLayout2 = this.f83847a;
            if (linearLayout2 == null) {
                C89219l.m154710a("mHeaderContainer");
            }
            View childAt = linearLayout2.getChildAt(childCount);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup != null) {
                int id = viewGroup.getId();
                if (id == R.id.ob || id == R.id.e2o) {
                    layoutParams.height = C34728n.m70946a(32.0d);
                    return;
                }
                if (id != R.id.ajj) {
                    CommerceChallengeServiceImpl.m75741e();
                    if (id != R.id.aab) {
                        return;
                    }
                }
                layoutParams.height = C34728n.m70946a(23.0d);
                return;
            }
        }
    }

    /* renamed from: e */
    private final void mo62601e() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ChallengeDetail challengeDetail = this.f83851e;
        if (challengeDetail == null) {
            C89219l.m154710a("mChallengeDetail");
        }
        List<RelatedChallengeMusic> list = challengeDetail.relatedChallengeMusicList;
        C89219l.m154716b(list, "");
        for (T t : list) {
            C89219l.m154716b(t, "");
            if (t.categoryType == 1 && t.music != null) {
                Music music = t.music;
                C89219l.m154716b(music, "");
                sb.append(music.getMid()).append(",");
            } else if (t.categoryType == 2 && t.challenge != null) {
                Challenge challenge = t.challenge;
                C89219l.m154716b(challenge, "");
                sb2.append(challenge.getCid()).append(",");
            }
        }
        C89361p.m154894a((CharSequence) sb, (CharSequence) ",");
        C89361p.m154894a((CharSequence) sb2, (CharSequence) ",");
        if (TextUtils.equals(this.f83843B.f83914d, "from_related_tag")) {
            Challenge challenge2 = this.f83852f;
            if (challenge2 == null) {
                C89219l.m154710a("mChallenge");
            }
            str2 = challenge2.getCid();
            C89219l.m154716b(str2, "");
            str = "1";
        } else {
            str = "0";
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str);
            jSONObject.put("enter_from", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("music", sb.toString());
            jSONObject2.put("challenge", sb2.toString());
            jSONObject.put("related", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MobClick labelName = MobClick.obtain().setEventName("extend_challenge").setLabelName("challenge");
        Challenge challenge3 = this.f83852f;
        if (challenge3 == null) {
            C89219l.m154710a("mChallenge");
        }
        C39162r.onEvent(labelName.setValue(challenge3.getCid()).setJsonObject(jSONObject));
    }

    /* access modifiers changed from: protected */
    public final void setMDescContainer(View view) {
        this.f83854i = view;
    }

    /* access modifiers changed from: protected */
    public final void setMDescTv(TextView textView) {
        this.f83855j = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMExpandIv(ImageView imageView) {
        this.f83858m = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setMExpandTv(TextView textView) {
        this.f83857l = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.f83844C = challengeDetailViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$b */
    static final class C35560b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC35558a f83872a;

        static {
            Covode.recordClassIndex(42784);
        }

        C35560b(AbstractC35558a aVar) {
            this.f83872a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f83872a.mo62543c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$c */
    public static final class C35561c implements C35566b.AbstractC35569b {

        /* renamed from: a */
        final /* synthetic */ AbstractC35558a f83873a;

        static {
            Covode.recordClassIndex(42785);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35561c(AbstractC35558a aVar) {
            this.f83873a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a.C35566b.AbstractC35569b
        /* renamed from: a */
        public final void mo62579a(Aweme aweme) {
            C33943c<C89378p<Integer, C35520a>> cVar;
            C89378p<Integer, C35520a> value;
            C35520a second;
            C89219l.m154721d(aweme, "");
            ChallengeDetailViewModel mViewModel = this.f83873a.getMViewModel();
            if (mViewModel != null && (cVar = mViewModel.f84177b) != null && (value = cVar.getValue()) != null && (second = value.getSecond()) != null) {
                C50529ae.f116790a = second;
                C36125t.m73596a(C36125t.m73591a(), this.f83873a.getActivity(), C36131u.m73602a("aweme://aweme/detail/" + aweme.getAid()).mo63248a("refer", "challenge").mo63248a("video_from", "from_challenge").mo63248a("challenge_id", this.f83873a.getMChallenge().getCid()).mo63247a("video_type", 2).mo63247a("profile_enterprise_type", aweme.getEnterpriseType()).mo63249a());
                C49419b.m92487a(aweme);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMAvatar(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        this.f83848b = smartImageView;
    }

    /* access modifiers changed from: protected */
    public final void setMChallenge(Challenge challenge) {
        C89219l.m154721d(challenge, "");
        this.f83852f = challenge;
    }

    /* access modifiers changed from: protected */
    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        C89219l.m154721d(challengeDetail, "");
        this.f83851e = challengeDetail;
    }

    public final void setMDescContainerVs(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f83850d = viewStub;
    }

    public final void setMHeaderContainer(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f83847a = linearLayout;
    }

    /* access modifiers changed from: protected */
    public final void setMTitle(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f83849c = textView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$e */
    public static final class View$OnClickListenerC35563e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC35558a f83876a;

        /* renamed from: b */
        final /* synthetic */ String f83877b;

        static {
            Covode.recordClassIndex(42787);
        }

        View$OnClickListenerC35563e(AbstractC35558a aVar, String str) {
            this.f83876a = aVar;
            this.f83877b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83876a.mo62541a(this.f83877b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62540a(AbstractC35585l lVar) {
        C89219l.m154721d(lVar, "");
        this.f83842A.add(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a$d */
    public static final class View$OnClickListenerC35562d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC35558a f83874a;

        /* renamed from: b */
        final /* synthetic */ C81779c f83875b;

        static {
            Covode.recordClassIndex(42786);
        }

        View$OnClickListenerC35562d(AbstractC35558a aVar, C81779c cVar) {
            this.f83874a = aVar;
            this.f83875b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IChallengeDetailLegacyService a = ChallengeDetailLegacyServiceImpl.m72544a();
            Context context = this.f83874a.getContext();
            C81779c.C81781b bVar = this.f83875b.f182885s;
            C89219l.m154716b(bVar, "");
            a.mo57209a(context, bVar.f182889b);
        }
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals("challenge", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            Context context = getContext();
            SmartImageView smartImageView = this.f83848b;
            if (smartImageView == null) {
                C89219l.m154710a("mAvatar");
            }
            createIIMServicebyMonsterPlugin.showIMSnackbar(context, smartImageView, jVar);
        }
    }

    public final void setHeaderAlpha(float f) {
        LinearLayout linearLayout = this.f83847a;
        if (linearLayout == null) {
            C89219l.m154710a("mHeaderContainer");
        }
        linearLayout.setAlpha(1.0f - f);
        Iterator<T> it = this.f83842A.iterator();
        while (it.hasNext()) {
            it.next().mo62523a(f);
        }
    }

    /* renamed from: a */
    public final void mo62541a(String str) {
        String str2 = this.f83843B.f83915e;
        Challenge challenge = this.f83852f;
        if (challenge == null) {
            C89219l.m154710a("mChallenge");
        }
        C39162r.m79460a("tag_detail_click_icon", new C33744d().mo59983a("process_id", str2).mo59983a("tag_id", challenge.getCid()).f79943a);
        IChallengeDetailLegacyService a = ChallengeDetailLegacyServiceImpl.m72544a();
        ActivityC0945e activity = getActivity();
        C80222ap apVar = new C80222ap();
        SmartImageView smartImageView = this.f83848b;
        if (smartImageView == null) {
            C89219l.m154710a("mAvatar");
        }
        C80222ap a2 = apVar.mo123647a("extra_zoom_info", ZoomAnimationUtils.m138997a(smartImageView));
        a2.f179700a.putFloat("wh_ratio", 0.1f);
        C80222ap a3 = a2.mo123650a("enable_download_img", false);
        Challenge challenge2 = this.f83852f;
        if (challenge2 == null) {
            C89219l.m154710a("mChallenge");
        }
        C80222ap a4 = a3.mo123648a("challenge_info", challenge2).mo123649a("process_id", this.f83843B.f83915e);
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            str = new Uri.Builder().scheme("res").path("2131233180").build().toString();
        }
        strArr[0] = str;
        a.mo57208a(activity, a4.mo123651a("uri", strArr).f179700a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023a A[LOOP:0: B:92:0x0234->B:94:0x023a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0250  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62539a(com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail r28) {
        /*
        // Method dump skipped, instructions count: 1503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.AbstractC35558a.mo62539a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC35558a(Context context, C35583j jVar, AttributeSet attributeSet) {
        super(context, null);
        C89219l.m154721d(context, "");
        if (jVar == null) {
            C89219l.m154715b();
        }
        this.f83843B = jVar;
        C1764a.m5927a(LayoutInflater.from(context), getLayoutResId(), this, true);
        mo62538a();
        mo62542b();
        this.f83845D = new C35560b(this);
        this.f83846E = new C35561c(this);
    }
}
