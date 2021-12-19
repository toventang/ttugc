package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33923b;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33926d;
import com.p2082ss.android.ugc.aweme.p4243y.C81779c;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity */
public class HeaderDetailActivity extends ActivityC17312a implements AbstractC63852p, AbstractC63860x {

    /* renamed from: A */
    private C63828ae f144963A;

    /* renamed from: B */
    private boolean f144964B;

    /* renamed from: C */
    private String f144965C;

    /* renamed from: D */
    private ObjectAnimator f144966D;

    /* renamed from: a */
    View f144967a;

    /* renamed from: b */
    AutoRTLImageView f144968b;

    /* renamed from: c */
    RemoteImageView f144969c;

    /* renamed from: d */
    FixedRatioFrameLayout f144970d;

    /* renamed from: e */
    ViewGroup f144971e;

    /* renamed from: f */
    ImageView f144972f;

    /* renamed from: g */
    ImageView f144973g;

    /* renamed from: h */
    View f144974h;

    /* renamed from: i */
    View f144975i;

    /* renamed from: j */
    TextView f144976j;

    /* renamed from: k */
    View f144977k;

    /* renamed from: l */
    TextView f144978l;

    /* renamed from: m */
    TextView f144979m;

    /* renamed from: n */
    RelativeLayout f144980n;

    /* renamed from: o */
    RemoteImageView f144981o;

    /* renamed from: p */
    public Bitmap f144982p;

    /* renamed from: q */
    public User f144983q;

    /* renamed from: r */
    private ZoomAnimationUtils.ZoomInfo f144984r;

    /* renamed from: s */
    private View f144985s;

    /* renamed from: t */
    private float f144986t;

    /* renamed from: u */
    private boolean f144987u = true;

    /* renamed from: v */
    private boolean f144988v = true;

    /* renamed from: w */
    private Challenge f144989w;

    /* renamed from: x */
    private String[] f144990x;

    /* renamed from: y */
    private C24636b[] f144991y;

    /* renamed from: z */
    private C63821a f144992z;

    static {
        Covode.recordClassIndex(75365);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo103494c() {
        return false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        C63821a aVar;
        if (!isDestroyed() && this.f144963A != null && (aVar = this.f144992z) != null) {
            if (4 == i) {
                aVar.mo103277d();
                if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                    C29823c.m60080a(this, "profile_image_setting", "review_failure");
                }
            } else if (i == 116) {
                return;
            }
            C33615a.m68848a((Context) this, (Throwable) exc, (int) R.string.ewo);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
        if (!isDestroyed()) {
            this.f144992z.mo103277d();
            if (!TextUtils.isEmpty(str)) {
                new C79459a(C17867d.m33078a()).mo123052a(str).mo123053a();
                if (z) {
                    finish();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo103496e() {
        C63821a aVar = this.f144992z;
        if (aVar.f144680b != null) {
            aVar.f144680b.mo102354e();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.cc);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        ObjectAnimator objectAnimator = this.f144966D;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: d */
    public void mo103495d() {
        this.f144984r = (ZoomAnimationUtils.ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f144990x = getIntent().getStringArrayExtra("uri");
        this.f144986t = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.f144983q = (User) getIntent().getSerializableExtra("share_info");
        boolean z = true;
        this.f144987u = getIntent().getBooleanExtra("enable_download_img", true);
        Intent intent = getIntent();
        if (this.f144983q == null || !C31575b.m65865g().isMe(this.f144983q.getUid())) {
            z = false;
        }
        this.f144988v = intent.getBooleanExtra("enable_edit_img", z);
        this.f144989w = (Challenge) getIntent().getSerializableExtra("challenge_info");
    }

    /* renamed from: a */
    public final String mo103491a() {
        String str;
        AbstractC24018a a;
        File file;
        if (C34717d.m70909a(this.f144991y)) {
            return "";
        }
        C24636b[] bVarArr = this.f144991y;
        for (C24636b bVar : bVarArr) {
            if (bVar != null) {
                if (!C24428k.m46551a().mo40246d().mo39582d(C24389j.m46446a().mo40187a(bVar)) || (a = C24428k.m46551a().mo40246d().mo39575a(C24389j.m46446a().mo40187a(bVar))) == null || (file = ((C24019b) a).f56886a) == null) {
                    str = "";
                } else {
                    str = file.getAbsolutePath();
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
        this.f144964B = true;
        this.f144965C = str;
        C63821a aVar = this.f144992z;
        if (aVar != null) {
            this.f144964B = false;
            aVar.mo103275a(0);
        }
    }

    /* renamed from: a */
    private static C24636b mo103507a(String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.f57756e = false;
        C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
        C24639c a = C24639c.m47149a(Uri.parse(str));
        a.f58555f = bVar;
        int[] c = m115633c(str);
        if (c != null && c[0] > 0 && c[1] > 0) {
            a.f58553d = new C24363d(c[0], c[1]);
        }
        return a.mo40483a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
        C63821a aVar;
        if (!isDestroyed() && (aVar = this.f144992z) != null) {
            aVar.mo103277d();
            if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 20022) {
                C29823c.m60080a(this, "profile_image_setting", "review_failure");
            }
            C33615a.m68848a((Context) this, (Throwable) exc, (int) R.string.nd);
        }
    }

    public void showLoadAnim(final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        this.f144966D = ofFloat;
        ofFloat.setDuration(600L);
        this.f144966D.setRepeatCount(-1);
        this.f144966D.setInterpolator(new LinearInterpolator());
        this.f144966D.start();
        this.f144966D.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity.C639332 */

            static {
                Covode.recordClassIndex(75367);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }

    /* renamed from: a */
    private static String m115629a(List<String> list) {
        C24413h e = C24428k.m46551a().mo40247e();
        for (String str : list) {
            if (e.mo40231b(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int[] m115633c(String str) {
        int i;
        MethodCollector.m26663i(7879);
        Uri parse = Uri.parse(str);
        if (!C80720e.m139927b(parse.getPath())) {
            MethodCollector.m26664o(7879);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > 720 || i3 > 1280) {
            int i4 = i2 >> 1;
            int i5 = i3 >> 1;
            i = 1;
            while (i4 / i > 720 && i5 / i > 1280) {
                i <<= 1;
            }
        } else {
            i = 1;
        }
        int[] iArr = {i2 >> i, i3 >> i};
        MethodCollector.m26664o(7879);
        return iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
        this.f144992z.mo103277d();
        if (avatarUri == null) {
            new C79459a(this).mo123050a(R.string.nd).mo123053a();
            return;
        }
        this.f144963A.mo103297d(avatarUri.uri);
        Uri parse = Uri.parse("file://" + this.f144965C);
        C24428k.m46551a().mo40247e().mo40228a(parse);
        mo103492a(this.f144969c, false, parse.toString());
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        User user;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ama);
        this.f144967a = findViewById(R.id.eiz);
        this.f144968b = (AutoRTLImageView) findViewById(R.id.bsy);
        this.f144969c = (RemoteImageView) findViewById(R.id.f_d);
        this.f144970d = (FixedRatioFrameLayout) findViewById(R.id.b8j);
        this.f144971e = (ViewGroup) findViewById(R.id.dnk);
        this.f144972f = (ImageView) findViewById(R.id.bv3);
        this.f144973g = (ImageView) findViewById(R.id.byn);
        this.f144974h = findViewById(R.id.byo);
        this.f144975i = findViewById(R.id.rq);
        this.f144976j = (TextView) findViewById(R.id.evj);
        this.f144977k = findViewById(R.id.og);
        this.f144978l = (TextView) findViewById(R.id.oh);
        this.f144979m = (TextView) findViewById(R.id.of);
        this.f144980n = (RelativeLayout) findViewById(R.id.od);
        this.f144981o = (RemoteImageView) findViewById(R.id.oe);
        View findViewById = findViewById(R.id.bsy);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC63974af(this));
        }
        View findViewById2 = findViewById(R.id.bv3);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC63975ag(this));
        }
        View findViewById3 = findViewById(R.id.evj);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC63976ah(this));
        }
        overridePendingTransition(R.anim.cb, R.anim.cc);
        this.f144985s = findViewById(16908290);
        mo103495d();
        this.f144970d.setWhRatio(this.f144986t);
        ((C24246a) this.f144969c.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57454d);
        mo103492a(this.f144969c, true, this.f144990x);
        C63821a aVar = new C63821a();
        this.f144992z = aVar;
        aVar.f144681c = this;
        Drawable drawable = null;
        this.f144992z.mo102165b(this, null);
        C63828ae aeVar = new C63828ae();
        this.f144963A = aeVar;
        aeVar.f144692c = this;
        this.f144971e.setBackgroundColor(-16777216);
        this.f144971e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity.View$OnClickListenerC639321 */

            static {
                Covode.recordClassIndex(75366);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (HeaderDetailActivity.this.f144967a.getVisibility() != 0) {
                    HeaderDetailActivity.this.onBackPressed();
                }
            }
        });
        if (this.f144987u) {
            this.f144972f.setVisibility(0);
            this.f144975i.setVisibility(0);
        }
        if (C33918a.m69450a() && (user = this.f144983q) != null && !C80580in.m139694g(user) && this.f144989w == null && this.f144983q.isActivityUser()) {
            this.f144977k.setVisibility(0);
            this.f144980n.setVisibility(0);
            C81779c b = C33918a.m69453b();
            if (!(b == null || b.f182875i == null)) {
                this.f144979m.setText(b.f182875i.f182865b);
                this.f144978l.setText(b.f182875i.f182864a);
                RemoteImageView remoteImageView = this.f144981o;
                Drawable drawable2 = C33926d.f80238a.get("avatar_hat.png");
                if (drawable2 == null) {
                    C33923b a = C33923b.m69462a();
                    String str = a.f80234b;
                    if (TextUtils.isEmpty(str)) {
                        a.f80234b = C33923b.f80232a + File.separator + C13607d.m24442b(C33923b.m69465b());
                        str = a.f80234b;
                    }
                    File file = new File(str);
                    if (file.exists() && file.isDirectory() && file.exists() && file.isDirectory()) {
                        File file2 = new File(file, "avatar_hat.png");
                        if (file2.exists() && file2.isFile() && file2.exists()) {
                            drawable = Drawable.createFromPath(file2.getPath());
                            if (drawable instanceof BitmapDrawable) {
                                ((BitmapDrawable) drawable).setTargetDensity((C13628n.m24524d(C17867d.m33078a()) * C13628n.m24524d(C17867d.m33078a())) / 480);
                            }
                            if (drawable != null) {
                                C33926d.f80238a.put("avatar_hat.png", drawable);
                            }
                        }
                    }
                    drawable2 = drawable;
                }
                remoteImageView.setImageDrawable(drawable2);
            }
        }
        if (this.f144988v && !C80580in.m139687c()) {
            this.f144976j.setVisibility(0);
        }
        if (this.f144989w != null) {
            this.f144967a.setVisibility(0);
            this.f144968b.setImageDrawable(getResources().getDrawable(R.drawable.b8p));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static void m115630a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m115631a(Activity activity, Bundle bundle) {
        if (activity != null) {
            Intent intent = new Intent(activity, I18nHeaderDetailActivity.class);
            intent.putExtras(bundle);
            m115630a(activity, intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
        this.f144964B = true;
        if (i == 4) {
            if (user.getAvatarMedium() != null) {
                mo103492a(this.f144969c, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                C34577e.m70592a(this.f144969c, user.getAvatarMedium());
            }
            new C79459a(C17867d.m33078a()).mo123050a(R.string.evr).mo123053a();
        }
        C63821a aVar = this.f144992z;
        if (aVar != null) {
            aVar.mo103277d();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f144992z.mo102163a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo103492a(RemoteImageView remoteImageView, boolean z, String... strArr) {
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!C34717d.m70909a(strArr)) {
                for (String str : strArr) {
                    if (!C13627m.m24498a(str)) {
                        arrayList.add(mo103507a(str));
                    }
                }
            }
            REQUEST request = null;
            if (z) {
                UrlModel a = C80630u.m139797a(this.f144983q);
                String a2 = a != null ? m115629a(a.getUrlList()) : null;
                if (!TextUtils.isEmpty(a2)) {
                    request = (REQUEST) mo103507a(a2);
                }
                if (C34717d.m70908a(arrayList)) {
                    C34577e.m70591a(remoteImageView, 2131232314);
                    return;
                }
            }
            this.f144991y = new C24636b[arrayList.size()];
            C24185e eVar = (C24185e) C24182c.m45843b().mo39823a(arrayList.toArray(this.f144991y));
            eVar.f57309m = remoteImageView.getController();
            eVar.f57306j = mo103494c();
            if (request != null) {
                eVar.f57300d = request;
            }
            remoteImageView.setController(eVar.mo39827e());
        }
    }

    /* renamed from: a */
    public static void m115632a(Activity activity, View view, float f, User user, boolean z, boolean z2, String... strArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m138997a(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f);
        bundle.putBoolean("enable_download_img", z);
        bundle.putBoolean("handle_with_video_avatar", z2);
        if (user != null) {
            bundle.putSerializable("share_info", user);
        }
        m115631a(activity, bundle);
    }
}
