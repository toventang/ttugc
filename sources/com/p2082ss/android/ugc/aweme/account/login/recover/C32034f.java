package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C52817g;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32038g;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.p2310al.C33490e;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.f */
public final class C32034f extends AbstractC32613a implements WeakHandler.IHandler, C32038g.AbstractC32040b {

    /* renamed from: b */
    public static final C32035a f76461b = new C32035a((byte) 0);

    /* renamed from: a */
    public C32036b f76462a;

    /* renamed from: c */
    private WeakHandler f76463c;

    /* renamed from: d */
    private final EnumC32330v[] f76464d = EnumC32330v.values();

    /* renamed from: e */
    private C32038g f76465e;

    /* renamed from: j */
    private HashMap f76466j;

    static {
        Covode.recordClassIndex(38789);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76466j == null) {
            this.f76466j = new HashMap();
        }
        View view = (View) this.f76466j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76466j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.h4;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76466j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$a */
    public static final class C32035a {
        static {
            Covode.recordClassIndex(38790);
        }

        private C32035a() {
        }

        public /* synthetic */ C32035a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$b */
    public static final class C32036b implements Serializable {

        /* renamed from: a */
        private final String f76467a;

        /* renamed from: b */
        private final String f76468b;

        /* renamed from: c */
        private final String f76469c;

        /* renamed from: d */
        private final String f76470d;

        /* renamed from: e */
        private final List<String> f76471e;

        /* renamed from: f */
        private final String f76472f;

        /* renamed from: g */
        private final boolean f76473g;

        /* renamed from: h */
        private boolean f76474h;

        static {
            Covode.recordClassIndex(38791);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.recover.f$b */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32036b copy$default(C32036b bVar, String str, String str2, String str3, String str4, List list, String str5, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f76467a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.f76468b;
            }
            if ((i & 4) != 0) {
                str3 = bVar.f76469c;
            }
            if ((i & 8) != 0) {
                str4 = bVar.f76470d;
            }
            if ((i & 16) != 0) {
                list = bVar.f76471e;
            }
            if ((i & 32) != 0) {
                str5 = bVar.f76472f;
            }
            if ((i & 64) != 0) {
                z = bVar.f76473g;
            }
            if ((i & 128) != 0) {
                z2 = bVar.f76474h;
            }
            return bVar.copy(str, str2, str3, str4, list, str5, z, z2);
        }

        public final String component1() {
            return this.f76467a;
        }

        public final String component2() {
            return this.f76468b;
        }

        public final String component3() {
            return this.f76469c;
        }

        public final String component4() {
            return this.f76470d;
        }

        public final List<String> component5() {
            return this.f76471e;
        }

        public final String component6() {
            return this.f76472f;
        }

        public final boolean component7() {
            return this.f76473g;
        }

        public final boolean component8() {
            return this.f76474h;
        }

        public final C32036b copy(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
            return new C32036b(str, str2, str3, str4, list, str5, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32036b)) {
                return false;
            }
            C32036b bVar = (C32036b) obj;
            return C89219l.m154714a(this.f76467a, bVar.f76467a) && C89219l.m154714a(this.f76468b, bVar.f76468b) && C89219l.m154714a(this.f76469c, bVar.f76469c) && C89219l.m154714a(this.f76470d, bVar.f76470d) && C89219l.m154714a(this.f76471e, bVar.f76471e) && C89219l.m154714a(this.f76472f, bVar.f76472f) && this.f76473g == bVar.f76473g && this.f76474h == bVar.f76474h;
        }

        public final int hashCode() {
            String str = this.f76467a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f76468b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f76469c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f76470d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<String> list = this.f76471e;
            int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
            String str5 = this.f76472f;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i2 = (hashCode5 + i) * 31;
            boolean z = this.f76473g;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            if (!this.f76474h) {
                i3 = 0;
            }
            return i7 + i3;
        }

        public final String toString() {
            return "RecoverAccountModel(avatar_url=" + this.f76467a + ", nickname=" + this.f76468b + ", email=" + this.f76469c + ", mobile=" + this.f76470d + ", oauth_platform=" + this.f76471e + ", ticket=" + this.f76472f + ", safe=" + this.f76473g + ", needStoreLastMethod=" + this.f76474h + ")";
        }

        public final String getAvatar_url() {
            return this.f76467a;
        }

        public final String getEmail() {
            return this.f76469c;
        }

        public final String getMobile() {
            return this.f76470d;
        }

        public final boolean getNeedStoreLastMethod() {
            return this.f76474h;
        }

        public final String getNickname() {
            return this.f76468b;
        }

        public final List<String> getOauth_platform() {
            return this.f76471e;
        }

        public final boolean getSafe() {
            return this.f76473g;
        }

        public final String getTicket() {
            return this.f76472f;
        }

        public final void setNeedStoreLastMethod(boolean z) {
            this.f76474h = z;
        }

        public C32036b(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
            this.f76467a = str;
            this.f76468b = str2;
            this.f76469c = str3;
            this.f76470d = str4;
            this.f76471e = list;
            this.f76472f = str5;
            this.f76473g = z;
            this.f76474h = z2;
        }
    }

    /* renamed from: e */
    private static boolean m66426e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(getString(R.string.f8r), null, false, null, null, true, null, false, false, 1358);
    }

    /* renamed from: g */
    private final String m66427g() {
        ArrayList arrayList = new ArrayList();
        C32036b bVar = this.f76462a;
        if (bVar != null) {
            if (!TextUtils.isEmpty(bVar.getMobile())) {
                arrayList.add("mobile");
            }
            C32036b bVar2 = this.f76462a;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            if (!TextUtils.isEmpty(bVar2.getEmail())) {
                arrayList.add("email");
            }
            C32036b bVar3 = this.f76462a;
            if (bVar3 == null) {
                C89219l.m154715b();
            }
            if (bVar3.getOauth_platform() != null) {
                C32036b bVar4 = this.f76462a;
                if (bVar4 == null) {
                    C89219l.m154715b();
                }
                List<String> oauth_platform = bVar4.getOauth_platform();
                if (oauth_platform == null) {
                    C89219l.m154715b();
                }
                arrayList.addAll(oauth_platform);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((String) it.next()) + ',');
        }
        if (!TextUtils.isEmpty(sb)) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        super.onCreate(bundle);
        this.f76463c = new WeakHandler(this);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("verify_account_data");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverVerifyAccountFragment.RecoverAccountModel");
        this.f76462a = (C32036b) serializable;
        Context context = getContext();
        List<C32038g.C32041c> a = m66425a(this.f76462a);
        C32036b bVar = this.f76462a;
        if (bVar != null) {
            str = bVar.getNickname();
        } else {
            str = null;
        }
        C32036b bVar2 = this.f76462a;
        if (bVar2 != null) {
            str2 = bVar2.getAvatar_url();
        } else {
            str2 = null;
        }
        C32036b bVar3 = this.f76462a;
        if (bVar3 != null) {
            bool = Boolean.valueOf(bVar3.getSafe());
        }
        C32038g gVar = new C32038g(context, a, str, str2, bool);
        this.f76465e = gVar;
        C89219l.m154721d(this, "");
        gVar.f76477a = this;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$c */
    static final class View$OnClickListenerC32037c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32034f f76475a;

        static {
            Covode.recordClassIndex(38792);
        }

        View$OnClickListenerC32037c(C32034f fVar) {
            this.f76475a = fVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f76475a.f76462a != null) {
                C32036b bVar = this.f76475a.f76462a;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                boolean z = !TextUtils.isEmpty(bVar.getMobile());
                C32036b bVar2 = this.f76475a.f76462a;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                boolean z2 = !TextUtils.isEmpty(bVar2.getEmail());
                Bundle arguments = this.f76475a.getArguments();
                String str2 = null;
                String string = arguments != null ? arguments.getString("feedback_param") : null;
                Context context = this.f76475a.getContext();
                this.f76475a.mo58466w();
                this.f76475a.mo58467x();
                C32036b bVar3 = this.f76475a.f76462a;
                String nickname = bVar3 != null ? bVar3.getNickname() : null;
                if (context != null) {
                    try {
                        str2 = C52912c.f121688a.f121689b.getFeConfigCollection().getRecoverAccountVerificationFormUrl().getSchema();
                    } catch (C16041a e) {
                        e.printStackTrace();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Faccount_recover%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fmodule_name%3Dpage_account_recover%26channel%3Dtiktok_rn_account_recover%26bundle%3Dindex.js";
                    }
                    C36125t a = C36125t.m73591a();
                    Uri parse = Uri.parse(str2);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                    for (String str3 : parse.getQueryParameterNames()) {
                        String valueOf = String.valueOf(z);
                        String valueOf2 = String.valueOf(z2);
                        if (TextUtils.equals("url", str3) || TextUtils.equals("rn_schema", str3)) {
                            str = C32857g.m67457a(str3, parse, nickname, valueOf, valueOf2, string);
                        } else {
                            str = parse.getQueryParameter(str3);
                        }
                        builder.appendQueryParameter(str3, str);
                    }
                    C36125t.m73598a(a, builder.build().toString());
                }
            }
        }
    }

    /* renamed from: a */
    private final List<C32038g.C32041c> m66425a(C32036b bVar) {
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            if (bVar.getMobile() != null && !TextUtils.isEmpty(bVar.getMobile())) {
                C32038g.C32041c cVar = new C32038g.C32041c();
                cVar.setMethodType(1);
                Context context = getContext();
                cVar.setMethodName(context != null ? context.getString(R.string.d8x) : null);
                if (bVar.getSafe()) {
                    string2 = bVar.getMobile();
                } else {
                    Context context2 = getContext();
                    string2 = context2 != null ? context2.getString(R.string.f8b) : null;
                }
                cVar.setMethodInfo(string2);
                arrayList.add(cVar);
            }
            if (bVar.getEmail() != null && !TextUtils.isEmpty(bVar.getEmail())) {
                C32038g.C32041c cVar2 = new C32038g.C32041c();
                cVar2.setMethodType(2);
                Context context3 = getContext();
                cVar2.setMethodName(context3 != null ? context3.getString(R.string.d6j) : null);
                if (bVar.getSafe()) {
                    string = bVar.getEmail();
                } else {
                    Context context4 = getContext();
                    string = context4 != null ? context4.getString(R.string.f8b) : null;
                }
                cVar2.setMethodInfo(string);
                arrayList.add(cVar2);
            }
            if (bVar.getOauth_platform() != null) {
                for (String str : bVar.getOauth_platform()) {
                    C32038g.C32041c cVar3 = new C32038g.C32041c();
                    cVar3.setMethodType(3);
                    cVar3.setAuthType(EnumC32033e.valueOf(str));
                    Context context5 = getContext();
                    cVar3.setMethodInfo(context5 != null ? context5.getString(R.string.f8b) : null);
                    cVar3.setMethodName(str);
                    arrayList.add(cVar3);
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo57434c(R.id.chi);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) mo57434c(R.id.chi);
        C89219l.m154716b(recyclerView2, "");
        C32038g gVar = this.f76465e;
        if (gVar == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView2.setAdapter(gVar);
        ((TuxTextView) mo57434c(R.id.f4x)).setOnClickListener(new View$OnClickListenerC32037c(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.recover.C32038g.AbstractC32040b
    /* renamed from: a */
    public final void mo57983a(int i, EnumC32033e eVar) {
        boolean z;
        Boolean valueOf;
        String str = "";
        if (i == 1) {
            C32036b bVar = this.f76462a;
            if (bVar == null || (valueOf = Boolean.valueOf(bVar.getSafe())) == null) {
                z = false;
            } else {
                z = valueOf.booleanValue();
            }
            IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
            if (iFeed0VVManagerService != null) {
                iFeed0VVManagerService.mo60082a("click_login");
                iFeed0VVManagerService.mo60083b("LOGIN");
            }
            if (!z) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue());
                arguments.putInt("child_page", EnumC32594j.INPUT_PHONE_LOGIN.getValue());
                arguments.putString("previous_uid", new C52817g().getCurUserId());
                arguments.putString("enter_from", "find_account");
                arguments.putString("enter_method", "find_account");
                arguments.putInt("current_scene", mo58458A().getValue());
                arguments.putSerializable("recover_account_data", this.f76462a);
                C89219l.m154716b(arguments, str);
                mo58461a(arguments);
            } else {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
                arguments2.putInt("current_scene", EnumC32592i.RECOVER_ACCOUNT.getValue());
                arguments2.putSerializable("recover_account_data", this.f76462a);
                arguments2.putBoolean("code_sent", false);
                arguments2.putBoolean("use_whatsapp", false);
                arguments2.putString("previous_uid", new C52817g().getCurUserId());
                arguments2.putString("enter_from", "find_account");
                arguments2.putString("enter_method", "find_account");
                arguments2.putBoolean("email_should_add_email", true);
                arguments2.putBoolean("from_choose_dialog", false);
                C89219l.m154716b(arguments2, str);
                mo58461a(arguments2);
            }
            str = "phone";
        } else if (i == 2) {
            C32036b bVar2 = this.f76462a;
            if (bVar2 != null) {
                Boolean.valueOf(bVar2.getSafe());
            }
            IFeed0VVManagerService iFeed0VVManagerService2 = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
            if (iFeed0VVManagerService2 != null) {
                iFeed0VVManagerService2.mo60082a("click_login");
                iFeed0VVManagerService2.mo60083b("LOGIN");
            }
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putInt("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue());
            arguments3.putInt("child_page", EnumC32594j.INPUT_EMAIL_LOGIN.getValue());
            arguments3.putInt("current_scene", mo58458A().getValue());
            arguments3.putString("previous_uid", new C52817g().getCurUserId());
            arguments3.putString("enter_from", "find_account");
            arguments3.putString("enter_method", "find_account");
            arguments3.putBoolean("email_should_add_email", true);
            arguments3.putSerializable("recover_account_data", this.f76462a);
            C89219l.m154716b(arguments3, str);
            mo58461a(arguments3);
            str = "email";
        } else if (i == 3) {
            getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m66426e();
            }
            if (!C58029j.f132256h) {
                new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            for (EnumC32330v vVar : this.f76464d) {
                String vVar2 = vVar.toString();
                Objects.requireNonNull(vVar2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = vVar2.toLowerCase();
                C89219l.m154716b(lowerCase, str);
                String valueOf2 = String.valueOf(eVar);
                Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = valueOf2.toLowerCase();
                C89219l.m154716b(lowerCase2, str);
                if (C89219l.m154714a((Object) lowerCase, (Object) lowerCase2)) {
                    if (eVar != EnumC32033e.apple) {
                        String valueOf3 = String.valueOf(eVar);
                        IFeed0VVManagerService iFeed0VVManagerService3 = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
                        if (iFeed0VVManagerService3 != null) {
                            iFeed0VVManagerService3.mo60082a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(valueOf3)));
                            iFeed0VVManagerService3.mo60083b("LOGIN");
                        }
                        Intent intent = new Intent(getActivity(), AuthorizeActivity.class);
                        intent.putExtra("platform", valueOf3).putExtra("enter_from", "find_account").putExtra("enter_method", "find_account").putExtra("enter_type", mo58468y()).putExtra("previous_uid", new C52817g().getCurUserId());
                        ActivityC0945e activity = getActivity();
                        if (activity != null) {
                            activity.startActivityForResult(intent, 1001);
                        }
                        str = String.valueOf(eVar);
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        C39162r.m79460a("find_account_verify_click", new C31376a().mo57399a("platform", m66427g()).mo57399a("enter_type", str).mo57397a("aid", 1180).f75156a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            C31667a.m65983a(13);
            AbstractC81915c.m141874a(new C33488c());
            AbstractC81915c.m141874a(new C33490e());
        }
    }
}
