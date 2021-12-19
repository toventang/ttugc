package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce.C37499j;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37590a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33263f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2295d.C33243a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63766ae;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout */
public class EnterpriseTransformLayout extends LinearLayout {

    /* renamed from: n */
    private static final int f144943n = ((int) C13628n.m24520b(C17867d.m33078a(), 16.0f));

    /* renamed from: a */
    public TextView f144944a;

    /* renamed from: b */
    public TextView f144945b;

    /* renamed from: c */
    public TextView f144946c;

    /* renamed from: d */
    public View f144947d;

    /* renamed from: e */
    List<String> f144948e;

    /* renamed from: f */
    List<String> f144949f;

    /* renamed from: g */
    SparseBooleanArray f144950g;

    /* renamed from: h */
    public User f144951h;

    /* renamed from: i */
    Activity f144952i;

    /* renamed from: j */
    public Aweme f144953j;

    /* renamed from: k */
    String f144954k;

    /* renamed from: l */
    public boolean f144955l;

    /* renamed from: m */
    public boolean f144956m;

    /* renamed from: o */
    private boolean f144957o;

    /* renamed from: a */
    private static int m115617a(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 5;
        }
        return 6;
    }

    static {
        Covode.recordClassIndex(75362);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo103486b() {
        if (this.f144951h == null) {
            return false;
        }
        return TextUtils.equals(C31575b.m65865g().getCurUserId(), this.f144951h.getUid());
    }

    /* renamed from: a */
    public final void mo103482a() {
        String uid;
        if (C80580in.m139683b() == null || !TextUtils.equals(C80580in.m139683b().getUid(), this.f144951h.getUid())) {
            C33744d dVar = new C33744d();
            if (C80580in.m139683b() == null) {
                uid = "0";
            } else {
                uid = C80580in.m139683b().getUid();
            }
            C39162r.m79460a("ttelite_BA_download_link_show", dVar.mo59983a("from_user_id", uid).mo59983a("to_user_id", this.f144951h.getUid()).mo59983a("enter_from", this.f144954k).f79943a);
        }
        this.f144956m = true;
    }

    public void setHasShownDownloadLink(boolean z) {
        this.f144956m = z;
    }

    public void setIsVisibleToUser(boolean z) {
        this.f144957o = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$a */
    public class C63931a {

        /* renamed from: a */
        public int f144959a;

        /* renamed from: b */
        public String f144960b;

        /* renamed from: c */
        public String f144961c;

        static {
            Covode.recordClassIndex(75364);
        }

        private C63931a() {
        }

        public /* synthetic */ C63931a(EnterpriseTransformLayout enterpriseTransformLayout, byte b) {
            this();
        }
    }

    public void setEnterFrom(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Other";
        }
        this.f144954k = str;
    }

    /* renamed from: a */
    static JSONObject m115618a(String str) {
        C39163s sVar = new C39163s();
        sVar.mo67941a("link_type", str);
        return sVar.mo67942a();
    }

    /* renamed from: a */
    public static boolean m115620a(User user) {
        if (C80580in.m139694g(user)) {
            if (user.getAccountType() != 3 || !C63766ae.m115318a()) {
                return false;
            }
            return true;
        } else if (user.getAccountType() == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ boolean mo103487c(String str) {
        Activity activity;
        if (!TextUtils.isEmpty(str) && (activity = this.f144952i) != null) {
            try {
                C80228av.m139063a(str, str, activity, PrivacyCert.Builder.with("bpea-220").usage("On the profile page, long press to copy the email address. ").tag("longPressToCopyEmailAdress").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
        new C79459a(this.f144952i).mo123050a(R.string.a7_).mo123053a();
        return true;
    }

    /* renamed from: a */
    public final C63931a mo103481a(C37499j jVar) {
        if (jVar == null) {
            return null;
        }
        C63931a aVar = new C63931a(this, (byte) 0);
        aVar.f144959a = m115617a(jVar.getOfflineInfoType());
        aVar.f144961c = jVar.getAction();
        aVar.f144960b = jVar.getText();
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo103485b(String str) {
        String str2;
        String str3;
        if (this.f144951h != null) {
            Aweme aweme = this.f144953j;
            if (aweme != null && C37699a.m76221X(aweme)) {
                C38000g.m77050a().mo65901m(getContext(), this.f144953j);
                C18129a.m33746a("homepage_ad", "homepagelink_click", this.f144953j.getAwemeRawAd()).mo28902c();
            }
            getContext();
            String str4 = "personal_homepage";
            if (mo103486b()) {
                str2 = str4;
            } else {
                str2 = "others_homepage";
            }
            C39162r.m79459a("click_link", str2, this.f144951h.getUid(), "0", m115618a(str));
            C33243a aVar = C33263f.f79009a.f79010b;
            String str5 = "";
            long j = 0;
            if (aVar != null) {
                if (aVar.f78980a != null) {
                    j = aVar.f78980a.longValue();
                }
                str3 = aVar.f78981b;
            } else {
                str3 = str5;
            }
            C33744d a = new C33744d().mo59983a("author_id", this.f144951h.getUid());
            if (!mo103486b()) {
                str4 = "others_homepage";
            }
            C33744d a2 = a.mo59983a("enter_from", str4).mo59983a("link_type", str);
            Aweme aweme2 = this.f144953j;
            if (aweme2 != null) {
                str5 = aweme2.getAid();
            }
            C39162r.m79460a("click_link", a2.mo59983a("group_id", str5).mo59981a("cid", j).mo59983a("log_extra", str3).f79943a);
            if (C37699a.m76314s(this.f144953j)) {
                str.hashCode();
                if (str.equals("web_link")) {
                    C38000g.m77050a().mo65903o(getContext(), this.f144953j);
                } else if (str.equals("download_link")) {
                    C38000g.m77050a().mo65902n(getContext(), this.f144953j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103484a(List<C63931a> list) {
        User user = this.f144951h;
        if (user != null) {
            if (user.getBizAccountInfo() != null && !TextUtils.isEmpty(this.f144951h.getBizAccountInfo().getAndroidDownloadAppLink())) {
                C63931a aVar = new C63931a(this, (byte) 0);
                aVar.f144959a = 5;
                aVar.f144961c = this.f144951h.getBizAccountInfo().getAndroidDownloadAppLink();
                aVar.f144960b = getResources().getString(R.string.a8);
                list.add(aVar);
            } else if (this.f144951h.getCommerceInfo() != null && !C13603b.m24435a((Collection) this.f144951h.getCommerceInfo().getOfflineInfoList())) {
                for (C37499j jVar : this.f144951h.getCommerceInfo().getOfflineInfoList()) {
                    if (jVar != null && jVar.getOfflineInfoType() == 2) {
                        list.add(mo103481a(jVar));
                        return;
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public static void m115619a(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            int i2 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private EnterpriseTransformLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7852);
        this.f144948e = new ArrayList();
        this.f144949f = new ArrayList();
        this.f144950g = new SparseBooleanArray(2);
        this.f144954k = null;
        this.f144955l = true;
        this.f144956m = false;
        this.f144957o = false;
        LayoutInflater.from(context).inflate(R.layout.anq, this);
        setOrientation(1);
        this.f144944a = (TextView) findViewById(R.id.en0);
        this.f144945b = (TextView) findViewById(R.id.en1);
        this.f144946c = (TextView) findViewById(R.id.en2);
        this.f144947d = findViewById(R.id.akf);
        this.f144948e.clear();
        this.f144949f.clear();
        MethodCollector.m26664o(7852);
    }

    /* renamed from: a */
    public final void mo103483a(TextView textView, C63931a aVar, int i) {
        String str;
        String str2;
        String str3 = "";
        if (aVar == null || aVar.f144960b == null) {
            textView.setText(str3);
            return;
        }
        textView.setVisibility(0);
        Activity j = C17873f.m33102j();
        this.f144952i = j;
        if (j != null) {
            SpannableString spannableString = new SpannableString("[label] " + aVar.f144960b);
            C37590a aVar2 = null;
            if (aVar.f144961c != null) {
                str = aVar.f144961c;
            } else {
                str = str3;
            }
            int i2 = aVar.f144959a;
            if (i2 == 1) {
                aVar2 = new C37590a(textView.getContext(), 2131233447);
                textView.setOnClickListener(new View$OnClickListenerC64395z(this, str, str3));
                textView.setOnLongClickListener(new View$OnLongClickListenerC63969aa(this, str));
            } else if (i2 == 4) {
                aVar2 = new C37590a(textView.getContext(), 2131233447);
                textView.setOnClickListener(new View$OnClickListenerC63970ab(this, str3));
            } else if (i2 == 5) {
                str3 = "download_link";
                aVar2 = new C37590a(textView.getContext(), 2131233446);
                textView.setOnClickListener(new View$OnClickListenerC63971ac(this, str, str3));
                if (!this.f144956m && this.f144957o) {
                    mo103482a();
                }
            } else if (i2 == 6) {
                str3 = "web_link";
                aVar2 = new C37590a(textView.getContext(), 2131233457);
                textView.setOnClickListener(new View$OnClickListenerC63972ad(this, str, aVar, str3));
            }
            User user = this.f144951h;
            if (user != null && !TextUtils.isEmpty(user.getUid()) && !this.f144950g.get(i)) {
                this.f144948e.add(str3);
                this.f144949f.add(str);
                this.f144950g.put(i, true);
                if (mo103486b()) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                getContext();
                C39162r.m79459a("show_link", str2, this.f144951h.getUid(), "0", m115618a(str3));
                C39162r.m79460a("show_link", new C33744d().mo59983a("author_id", this.f144951h.getUid()).mo59983a("enter_from", str2).mo59983a("link_type", str3).f79943a);
            }
            if (aVar2 != null) {
                spannableString.setSpan(aVar2, 0, 7, 17);
                textView.setText(spannableString);
                if (textView == this.f144945b) {
                    m115619a(textView, f144943n);
                }
                if (textView.getLayoutParams().height != -2) {
                    textView.getLayoutParams().height = -2;
                    textView.setLayoutParams(textView.getLayoutParams());
                }
                C80595j.m139739a(textView);
            }
        }
    }
}
