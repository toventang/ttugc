package com.p2082ss.android.ugc.aweme.compliance.business.personalization;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.NewPersAdSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PersonalizationDataText;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39231b;
import com.p2082ss.android.ugc.aweme.compliance.business.personalization.p2653a.C39438a;
import com.p2082ss.android.ugc.aweme.compliance.business.personalization.viewmodel.PersonalizationViewModel;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity */
public final class PersonalizationActivity extends ActivityC17312a implements AbstractC39231b, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C39409a f93014e = new C39409a((byte) 0);

    /* renamed from: j */
    private static final boolean f93015j = false;

    /* renamed from: a */
    public CommonItemView f93016a;

    /* renamed from: b */
    PersonalizationDataText f93017b;

    /* renamed from: c */
    public boolean f93018c;

    /* renamed from: d */
    public final View.OnClickListener f93019d = new View$OnClickListenerC39437z(this);

    /* renamed from: f */
    private TuxNavBar f93020f;

    /* renamed from: g */
    private CommonItemView f93021g;

    /* renamed from: h */
    private final AbstractC89244h f93022h = C89250i.m154773a((AbstractC89171a) new C39429u(this));

    /* renamed from: i */
    private boolean f93023i;

    /* renamed from: k */
    private SparseArray f93024k;

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93024k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93024k == null) {
            this.f93024k = new SparseArray();
        }
        View view = (View) this.f93024k.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93024k.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final PersonalizationViewModel mo68877a() {
        return (PersonalizationViewModel) this.f93022h.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(PersonalizationActivity.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$a */
    public static final class C39409a {
        static {
            Covode.recordClassIndex(47097);
        }

        private C39409a() {
        }

        public /* synthetic */ C39409a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$t */
    static final class C39428t extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93052a;

        static {
            Covode.recordClassIndex(47116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39428t(PersonalizationActivity personalizationActivity) {
            super(0);
            this.f93052a = personalizationActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93052a.onBackPressed();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$u */
    static final class C39429u extends AbstractC89220m implements AbstractC89171a<PersonalizationViewModel> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93053a;

        static {
            Covode.recordClassIndex(47117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39429u(PersonalizationActivity personalizationActivity) {
            super(0);
            this.f93053a = personalizationActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PersonalizationViewModel invoke() {
            return C1181ae.m3881a(this.f93053a, (C1175ad.AbstractC1177b) null).mo3983a(PersonalizationViewModel.class);
        }
    }

    static {
        Covode.recordClassIndex(47096);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onResume", true);
        super.onResume();
        if (C39608b.m80416b()) {
            C39438a.m80135a(this, this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        String str;
        if (this.f93023i) {
            AdPersonalitySettings i = C39608b.m80423i();
            if (i != null) {
                str = i.getBusiness();
            } else {
                str = null;
            }
            boolean a = C89219l.m154714a((Object) str, (Object) "lat_strategy_update");
            boolean z = true;
            if (!a) {
                if (this.f93018c) {
                    Intent intent = new Intent();
                    intent.putExtra("result", 0);
                    setResult(10, intent);
                } else {
                    if (C39608b.m80420f() != 1) {
                        z = false;
                    }
                    mo68880c(z);
                }
            }
        }
        super.onBackPressed();
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$s */
    public static final class C39427s extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93048a;

        /* renamed from: b */
        final /* synthetic */ String f93049b;

        /* renamed from: c */
        final /* synthetic */ int f93050c;

        /* renamed from: d */
        final /* synthetic */ String f93051d;

        static {
            Covode.recordClassIndex(47115);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            SmartRouter.buildRoute(this.f93048a, "//webview").withParam("url", this.f93049b).withParam("use_webview_title", true).open();
        }

        C39427s(PersonalizationActivity personalizationActivity, String str, int i, String str2) {
            this.f93048a = personalizationActivity;
            this.f93049b = str;
            this.f93050c = i;
            this.f93051d = str2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CommonItemView m80126a(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f93016a;
        if (commonItemView == null) {
            C89219l.m154710a("mAdSettingItem");
        }
        return commonItemView;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$h */
    static final class View$OnClickListenerC39416h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93033a;

        /* renamed from: b */
        final /* synthetic */ boolean f93034b = false;

        static {
            Covode.recordClassIndex(47104);
        }

        View$OnClickListenerC39416h(PersonalizationActivity personalizationActivity) {
            this.f93033a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C79459a(this.f93033a).mo123050a(R.string.fnx).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$j */
    static final class View$OnClickListenerC39418j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93038a;

        /* renamed from: b */
        final /* synthetic */ boolean f93039b;

        static {
            Covode.recordClassIndex(47106);
        }

        View$OnClickListenerC39418j(PersonalizationActivity personalizationActivity, boolean z) {
            this.f93038a = personalizationActivity;
            this.f93039b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C79459a(this.f93038a).mo123050a(R.string.fo2).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$k */
    static final class View$OnClickListenerC39419k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93040a;

        static {
            Covode.recordClassIndex(47107);
        }

        View$OnClickListenerC39419k(PersonalizationActivity personalizationActivity) {
            this.f93040a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f93040a, "//webview").withParam("url", "https://www.tiktok.com/web-inapp/account/delete/guest?hide_nav_bar=1").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$l */
    public static final class View$OnClickListenerC39420l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93041a;

        static {
            Covode.recordClassIndex(47108);
        }

        View$OnClickListenerC39420l(PersonalizationActivity personalizationActivity) {
            this.f93041a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f93041a;
            String string = personalizationActivity.getString(R.string.bl);
            C89219l.m154716b(string, "");
            personalizationActivity.mo68878a("https://www.tiktok.com/falcon/fe_tiktok_common/inferred_interests/index.html", string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$r */
    static final class View$OnClickListenerC39426r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93047a;

        static {
            Covode.recordClassIndex(47114);
        }

        View$OnClickListenerC39426r(PersonalizationActivity personalizationActivity) {
            this.f93047a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f93047a;
            String string = personalizationActivity.getString(R.string.gbw);
            C89219l.m154716b(string, "");
            personalizationActivity.mo68878a("https://www.tiktok.com/inapp/third_party_measurements?hide_more=1", string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$v */
    static final class C39430v extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C39430v f93054a = new C39430v();

        static {
            Covode.recordClassIndex(47118);
        }

        C39430v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C394311.f93055a);
            baseActivityViewModel2.config(C394322.f93056a);
            baseActivityViewModel2.config(C394333.f93057a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$y */
    static final class View$OnClickListenerC39436y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93060a;

        static {
            Covode.recordClassIndex(47124);
        }

        View$OnClickListenerC39436y(PersonalizationActivity personalizationActivity) {
            this.f93060a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C79459a(this.f93060a).mo123050a(R.string.dlc).mo123053a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$z */
    static final class View$OnClickListenerC39437z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93061a;

        static {
            Covode.recordClassIndex(47125);
        }

        View$OnClickListenerC39437z(PersonalizationActivity personalizationActivity) {
            this.f93061a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationActivity personalizationActivity = this.f93061a;
            personalizationActivity.mo68880c(!PersonalizationActivity.m80126a(personalizationActivity).mo27138d());
            this.f93061a.f93018c = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$c */
    static final class View$OnClickListenerC39411c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f93026a;

        static {
            Covode.recordClassIndex(47099);
        }

        View$OnClickListenerC39411c(CommonItemView commonItemView) {
            this.f93026a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TextView tvwDesc = this.f93026a.getTvwDesc();
            C89219l.m154716b(tvwDesc, "");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f93026a.getTvwDesc();
                C89219l.m154716b(tvwDesc2, "");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f93026a.performClick();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$d */
    static final class C39412d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93027a;

        static {
            Covode.recordClassIndex(47100);
        }

        C39412d(PersonalizationActivity personalizationActivity) {
            this.f93027a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f93027a._$_findCachedViewById(R.id.eha);
            C89219l.m154716b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$e */
    static final class View$OnClickListenerC39413e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f93028a;

        static {
            Covode.recordClassIndex(47101);
        }

        View$OnClickListenerC39413e(CommonItemView commonItemView) {
            this.f93028a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TextView tvwDesc = this.f93028a.getTvwDesc();
            C89219l.m154716b(tvwDesc, "");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f93028a.getTvwDesc();
                C89219l.m154716b(tvwDesc2, "");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f93028a.performClick();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$f */
    static final class C39414f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93029a;

        static {
            Covode.recordClassIndex(47102);
        }

        C39414f(PersonalizationActivity personalizationActivity) {
            this.f93029a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f93029a._$_findCachedViewById(R.id.cz8);
            C89219l.m154716b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$g */
    static final class View$OnClickListenerC39415g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f93030a;

        /* renamed from: b */
        final /* synthetic */ PersonalizationActivity f93031b;

        /* renamed from: c */
        final /* synthetic */ boolean f93032c = true;

        static {
            Covode.recordClassIndex(47103);
        }

        View$OnClickListenerC39415g(CommonItemView commonItemView, PersonalizationActivity personalizationActivity) {
            this.f93030a = commonItemView;
            this.f93031b = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f93031b.f93018c = true;
            PersonalizationViewModel a = this.f93031b.mo68877a();
            CommonItemView commonItemView = this.f93030a;
            C89219l.m154716b(commonItemView, "");
            PersonalizationViewModel.m80137a(a, Integer.valueOf(1 ^ commonItemView.mo27138d()), null, 5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$i */
    static final class View$OnClickListenerC39417i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f93035a;

        /* renamed from: b */
        final /* synthetic */ PersonalizationActivity f93036b;

        /* renamed from: c */
        final /* synthetic */ boolean f93037c;

        static {
            Covode.recordClassIndex(47105);
        }

        View$OnClickListenerC39417i(CommonItemView commonItemView, PersonalizationActivity personalizationActivity, boolean z) {
            this.f93035a = commonItemView;
            this.f93036b = personalizationActivity;
            this.f93037c = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f93036b.f93018c = true;
            PersonalizationViewModel a = this.f93036b.mo68877a();
            CommonItemView commonItemView = this.f93035a;
            C89219l.m154716b(commonItemView, "");
            PersonalizationViewModel.m80137a(a, null, Integer.valueOf(1 ^ commonItemView.mo27138d()), 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$m */
    static final class C39421m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93042a;

        static {
            Covode.recordClassIndex(47109);
        }

        C39421m(PersonalizationActivity personalizationActivity) {
            this.f93042a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f93042a._$_findCachedViewById(R.id.d15);
            C89219l.m154716b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$n */
    static final class View$OnClickListenerC39422n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93043a;

        static {
            Covode.recordClassIndex(47110);
        }

        View$OnClickListenerC39422n(PersonalizationActivity personalizationActivity) {
            this.f93043a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationViewModel a = this.f93043a.mo68877a();
            CommonItemView commonItemView = (CommonItemView) this.f93043a._$_findCachedViewById(R.id.d15);
            C89219l.m154716b(commonItemView, "");
            PersonalizationViewModel.m80139b(a, Integer.valueOf(!commonItemView.mo27138d()), null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$o */
    static final class C39423o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93044a;

        static {
            Covode.recordClassIndex(47111);
        }

        C39423o(PersonalizationActivity personalizationActivity) {
            this.f93044a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f93044a._$_findCachedViewById(R.id.d16);
            C89219l.m154716b(commonItemView, "");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$p */
    static final class View$OnClickListenerC39424p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93045a;

        static {
            Covode.recordClassIndex(47112);
        }

        View$OnClickListenerC39424p(PersonalizationActivity personalizationActivity) {
            this.f93045a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            PersonalizationViewModel a = this.f93045a.mo68877a();
            CommonItemView commonItemView = (CommonItemView) this.f93045a._$_findCachedViewById(R.id.d16);
            C89219l.m154716b(commonItemView, "");
            PersonalizationViewModel.m80139b(a, null, Integer.valueOf(!commonItemView.mo27138d()), 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$q */
    static final class C39425q<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93046a;

        static {
            Covode.recordClassIndex(47113);
        }

        C39425q(PersonalizationActivity personalizationActivity) {
            this.f93046a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C89378p pVar = (C89378p) obj;
            PersonalizationActivity personalizationActivity = this.f93046a;
            Integer num2 = (Integer) pVar.getFirst();
            boolean z = true;
            if ((num2 == null || num2.intValue() != 1) && ((num = (Integer) pVar.getSecond()) == null || num.intValue() != 1)) {
                z = false;
            }
            personalizationActivity.mo68879b(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$w */
    static final class C39434w<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93058a;

        static {
            Covode.recordClassIndex(47122);
        }

        C39434w(PersonalizationActivity personalizationActivity) {
            this.f93058a = personalizationActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Context applicationContext = this.f93058a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            String packageName = applicationContext.getPackageName();
            C89219l.m154716b(packageName, "");
            Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268468224);
                C84349a.m145093a(launchIntentForPackage, applicationContext);
                applicationContext.startActivity(launchIntentForPackage);
                Runtime.getRuntime().exit(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$x */
    static final class C39435x<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93059a;

        static {
            Covode.recordClassIndex(47123);
        }

        C39435x(PersonalizationActivity personalizationActivity) {
            this.f93059a = personalizationActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            PersonalizationActivity personalizationActivity = this.f93059a;
            SmartRouter.buildRoute(personalizationActivity, "//main?tab=1").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
            AbstractC34892bo b = C31575b.m65860b();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = personalizationActivity;
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_fullscreen_dialog", true);
            bundle.putBoolean("is_skippable_dialog", false);
            dVar.f74963d = bundle;
            b.showLoginAndRegisterView(dVar.mo57084a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo68879b(boolean z) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        AdPersonalitySettings i = C39608b.m80423i();
        String str4 = null;
        if (i != null) {
            bool = i.getShowInterestLabel();
        } else {
            bool = null;
        }
        if (!C89219l.m154714a((Object) bool, (Object) true) || !z) {
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.d18);
            C89219l.m154716b(commonItemView, "");
            commonItemView.setVisibility(8);
            return;
        }
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.d18);
        commonItemView2.setVisibility(0);
        commonItemView2.setOnClickListener(new View$OnClickListenerC39420l(this));
        PersonalizationDataText personalizationDataText = this.f93017b;
        if (personalizationDataText != null) {
            str = personalizationDataText.getInterestLabelTitle();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            PersonalizationDataText personalizationDataText2 = this.f93017b;
            if (personalizationDataText2 != null) {
                str3 = personalizationDataText2.getInterestLabelTitle();
            } else {
                str3 = null;
            }
            commonItemView2.setLeftText(str3);
        }
        PersonalizationDataText personalizationDataText3 = this.f93017b;
        if (personalizationDataText3 != null) {
            str2 = personalizationDataText3.getInterestLabelDetail();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            PersonalizationDataText personalizationDataText4 = this.f93017b;
            if (personalizationDataText4 != null) {
                str4 = personalizationDataText4.getInterestLabelDetail();
            }
            commonItemView2.setDesc(str4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68880c(boolean r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity.mo68880c(boolean):void");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        try {
            if (TextUtils.equals("delete_guest_account_success", jVar.f111077b.getString("eventName"))) {
                String string = jVar.f111077b.getJSONObject("data").getString("reset_device");
                AgeGateServiceImpl.m80208e().mo68582a(false);
                if (TextUtils.equals("true", string)) {
                    Context applicationContext = getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    DeviceRegisterManager.clearDidAndIid(applicationContext, UUID.randomUUID().toString());
                    if (Build.VERSION.SDK_INT >= 21) {
                        CookieManager.getInstance().removeAllCookies(null);
                    }
                    C1731i.m5631a(1000).mo5532a(new C39434w(this));
                    return;
                }
                C1731i.m5631a(300).mo5534a(new C39435x(this), C1731i.f5564c, null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39231b
    /* renamed from: a */
    public final void mo68110a(boolean z) {
        if (z) {
            if (C39608b.m80420f() == 1) {
                mo68880c(false);
            }
            CommonItemView commonItemView = this.f93016a;
            if (commonItemView == null) {
                C89219l.m154710a("mAdSettingItem");
            }
            commonItemView.setAlpha(0.34f);
            CommonItemView commonItemView2 = this.f93016a;
            if (commonItemView2 == null) {
                C89219l.m154710a("mAdSettingItem");
            }
            commonItemView2.setOnClickListener(new View$OnClickListenerC39436y(this));
            return;
        }
        CommonItemView commonItemView3 = this.f93016a;
        if (commonItemView3 == null) {
            C89219l.m154710a("mAdSettingItem");
        }
        commonItemView3.setAlpha(1.0f);
        CommonItemView commonItemView4 = this.f93016a;
        if (commonItemView4 == null) {
            C89219l.m154710a("mAdSettingItem");
        }
        commonItemView4.setOnClickListener(this.f93019d);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity$b */
    static final class C39410b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f93025a;

        static {
            Covode.recordClassIndex(47098);
        }

        C39410b(PersonalizationActivity personalizationActivity) {
            this.f93025a = personalizationActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            boolean z2;
            Boolean bool;
            Boolean bool2;
            boolean z3;
            Boolean bool3;
            Integer value;
            String str;
            String str2;
            String str3;
            float f;
            Integer num = (Integer) obj;
            CommonItemView a = PersonalizationActivity.m80126a(this.f93025a);
            if (num != null && num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            a.setChecked(z);
            PersonalizationActivity personalizationActivity = this.f93025a;
            if (num != null && num.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            AdPersonalitySettings i = C39608b.m80423i();
            String str4 = null;
            if (i != null) {
                bool = i.getShowThirdAd();
            } else {
                bool = null;
            }
            float f2 = 1.0f;
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                CommonItemView commonItemView = (CommonItemView) personalizationActivity._$_findCachedViewById(R.id.eha);
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                commonItemView.setAlpha(f);
                if (z2) {
                    commonItemView.setOnClickListener(new View$OnClickListenerC39415g(commonItemView, personalizationActivity));
                } else {
                    commonItemView.setOnClickListener(new View$OnClickListenerC39416h(personalizationActivity));
                }
            }
            AdPersonalitySettings i2 = C39608b.m80423i();
            if (i2 != null) {
                bool2 = i2.getShowPartnerAd();
            } else {
                bool2 = null;
            }
            if (C89219l.m154714a((Object) bool2, (Object) true)) {
                CommonItemView commonItemView2 = (CommonItemView) personalizationActivity._$_findCachedViewById(R.id.cz8);
                if (!z2) {
                    f2 = 0.34f;
                }
                commonItemView2.setAlpha(f2);
                if (z2) {
                    commonItemView2.setOnClickListener(new View$OnClickListenerC39417i(commonItemView2, personalizationActivity, z2));
                } else {
                    commonItemView2.setOnClickListener(new View$OnClickListenerC39418j(personalizationActivity, z2));
                }
            }
            PersonalizationActivity personalizationActivity2 = this.f93025a;
            if (num != null && num.intValue() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            personalizationActivity2.mo68879b(z3);
            PersonalizationActivity personalizationActivity3 = this.f93025a;
            AdPersonalitySettings i3 = C39608b.m80423i();
            if (i3 != null) {
                bool3 = i3.getShowThirdPartyMeasurement();
            } else {
                bool3 = null;
            }
            if (!C89219l.m154714a((Object) bool3, (Object) true) || (value = personalizationActivity3.mo68877a().mo68902a().getValue()) == null || value.intValue() != 1) {
                CommonItemView commonItemView3 = (CommonItemView) personalizationActivity3._$_findCachedViewById(R.id.ehb);
                C89219l.m154716b(commonItemView3, "");
                commonItemView3.setVisibility(8);
                return;
            }
            CommonItemView commonItemView4 = (CommonItemView) personalizationActivity3._$_findCachedViewById(R.id.ehb);
            commonItemView4.setVisibility(0);
            commonItemView4.setOnClickListener(new View$OnClickListenerC39426r(personalizationActivity3));
            PersonalizationDataText personalizationDataText = personalizationActivity3.f93017b;
            if (personalizationDataText != null) {
                str = personalizationDataText.getThirdPartyMeasurementTitle();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                PersonalizationDataText personalizationDataText2 = personalizationActivity3.f93017b;
                if (personalizationDataText2 != null) {
                    str3 = personalizationDataText2.getThirdPartyMeasurementTitle();
                } else {
                    str3 = null;
                }
                commonItemView4.setLeftText(str3);
            }
            PersonalizationDataText personalizationDataText3 = personalizationActivity3.f93017b;
            if (personalizationDataText3 != null) {
                str2 = personalizationDataText3.getThirdPartyMeasurementDetail();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                PersonalizationDataText personalizationDataText4 = personalizationActivity3.f93017b;
                if (personalizationDataText4 != null) {
                    str4 = personalizationDataText4.getThirdPartyMeasurementDetail();
                }
                commonItemView4.setDesc(str4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v122, resolved type: com.bytedance.ies.dmt.ui.common.views.CommonItemView[] */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: com.ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        PersonalizationDataText personalizationDataText;
        Boolean bool;
        String str;
        String str2;
        Boolean bool2;
        Boolean bool3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        PersonalizationDataText personalizationDataText2;
        PersonalizationDataText personalizationDataText3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        PersonalizationDataText personalizationDataText4;
        PersonalizationDataText personalizationDataText5;
        String str14;
        Boolean bool4;
        Boolean bool5;
        String string;
        String string2;
        String string3;
        String string4;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onCreate", true);
        activityConfiguration(C39430v.f93054a);
        super.onCreate(bundle);
        setContentView(R.layout.u1);
        View findViewById = findViewById(R.id.ejf);
        C89219l.m154716b(findViewById, "");
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById;
        this.f93020f = tuxNavBar;
        if (tuxNavBar == null) {
            C89219l.m154710a("mTitle");
        }
        C23194g gVar = new C23194g();
        String string5 = getString(R.string.fjv);
        C89219l.m154716b(string5, "");
        tuxNavBar.mo37725a(gVar.mo37753a(string5));
        TuxNavBar tuxNavBar2 = this.f93020f;
        if (tuxNavBar2 == null) {
            C89219l.m154710a("mTitle");
        }
        tuxNavBar2.mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C39428t(this)));
        TuxNavBar tuxNavBar3 = this.f93020f;
        if (tuxNavBar3 == null) {
            C89219l.m154710a("mTitle");
        }
        tuxNavBar3.mo37727a(true);
        View findViewById2 = findViewById(R.id.d17);
        C89219l.m154716b(findViewById2, "");
        this.f93016a = (CommonItemView) findViewById2;
        View findViewById3 = findViewById(R.id.aj1);
        C89219l.m154716b(findViewById3, "");
        this.f93021g = (CommonItemView) findViewById3;
        this.f93023i = C89219l.m154714a((Object) "feed", (Object) m80127a(getIntent(), "enterfrom"));
        AdPersonalitySettings i = C39608b.m80423i();
        if (i != null) {
            personalizationDataText = i.getPersonalizationDataText();
        } else {
            personalizationDataText = null;
        }
        this.f93017b = personalizationDataText;
        if (C39608b.m80422h() == 2) {
            CommonItemView[] commonItemViewArr = {_$_findCachedViewById(R.id.d17), _$_findCachedViewById(R.id.eha), _$_findCachedViewById(R.id.cz8), _$_findCachedViewById(R.id.ehb)};
            int i2 = 0;
            do {
                DiskManagerItemView diskManagerItemView = commonItemViewArr[i2];
                C89219l.m154716b(diskManagerItemView, "");
                diskManagerItemView.setVisibility(8);
                i2++;
            } while (i2 < 4);
            NewPersAdSettings g = C39608b.m80421g();
            if (g != null) {
                bool4 = g.getShowMode1P();
            } else {
                bool4 = null;
            }
            boolean a = C89219l.m154714a((Object) bool4, (Object) true);
            if (g != null) {
                bool5 = g.getShowMode3P();
            } else {
                bool5 = null;
            }
            boolean a2 = C89219l.m154714a((Object) bool5, (Object) true);
            if (a) {
                CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.d15);
                C89219l.m154716b(commonItemView, "");
                commonItemView.setVisibility(0);
                CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.d15);
                if (g == null || (string3 = g.getTitleMode1P()) == null || string3.length() <= 0) {
                    string3 = getString(R.string.fjr);
                    C89219l.m154716b(string3, "");
                }
                commonItemView2.setLeftText(string3);
                CommonItemView commonItemView3 = (CommonItemView) _$_findCachedViewById(R.id.d15);
                if (g == null || (string4 = g.getDescMode1P()) == null || string4.length() <= 0) {
                    string4 = getString(R.string.fjs);
                    C89219l.m154716b(string4, "");
                }
                commonItemView3.setDesc(string4);
                mo68877a().mo68906d().observe(this, new C39421m(this));
                ((CommonItemView) _$_findCachedViewById(R.id.d15)).setOnClickListener(new View$OnClickListenerC39422n(this));
            } else {
                CommonItemView commonItemView4 = (CommonItemView) _$_findCachedViewById(R.id.d15);
                C89219l.m154716b(commonItemView4, "");
                commonItemView4.setVisibility(8);
            }
            if (a2) {
                CommonItemView commonItemView5 = (CommonItemView) _$_findCachedViewById(R.id.d16);
                C89219l.m154716b(commonItemView5, "");
                commonItemView5.setVisibility(0);
                CommonItemView commonItemView6 = (CommonItemView) _$_findCachedViewById(R.id.d16);
                if (g == null || (string = g.getTitleMode3P()) == null || string.length() <= 0) {
                    string = getString(R.string.fjt);
                    C89219l.m154716b(string, "");
                }
                commonItemView6.setLeftText(string);
                CommonItemView commonItemView7 = (CommonItemView) _$_findCachedViewById(R.id.d16);
                if (g == null || (string2 = g.getDescMode3P()) == null || string2.length() <= 0) {
                    string2 = getString(R.string.fju);
                    C89219l.m154716b(string2, "");
                }
                commonItemView7.setDesc(string2);
                mo68877a().mo68907e().observe(this, new C39423o(this));
                ((CommonItemView) _$_findCachedViewById(R.id.d16)).setOnClickListener(new View$OnClickListenerC39424p(this));
            } else {
                CommonItemView commonItemView8 = (CommonItemView) _$_findCachedViewById(R.id.d16);
                C89219l.m154716b(commonItemView8, "");
                commonItemView8.setVisibility(8);
            }
            if (a || a2) {
                ((LiveData) mo68877a().f93072a.getValue()).observe(this, new C39425q(this));
            } else {
                CommonItemView commonItemView9 = (CommonItemView) _$_findCachedViewById(R.id.d18);
                C89219l.m154716b(commonItemView9, "");
                commonItemView9.setVisibility(8);
            }
        } else {
            AdPersonalitySettings i3 = C39608b.m80423i();
            if (i3 != null) {
                bool = i3.isShowSettings();
            } else {
                bool = null;
            }
            if (true ^ C89219l.m154714a((Object) bool, (Object) true)) {
                CommonItemView commonItemView10 = this.f93016a;
                if (commonItemView10 == null) {
                    C89219l.m154710a("mAdSettingItem");
                }
                commonItemView10.setVisibility(8);
                CommonItemView commonItemView11 = (CommonItemView) _$_findCachedViewById(R.id.d18);
                C89219l.m154716b(commonItemView11, "");
                commonItemView11.setVisibility(8);
                CommonItemView commonItemView12 = (CommonItemView) _$_findCachedViewById(R.id.ehb);
                C89219l.m154716b(commonItemView12, "");
                commonItemView12.setVisibility(8);
            } else {
                AdPersonalitySettings i4 = C39608b.m80423i();
                if (i4 != null) {
                    str = i4.getDescription();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.flq);
                }
                AdPersonalitySettings i5 = C39608b.m80423i();
                if (i5 != null) {
                    str2 = i5.getPaMainTitle();
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = getString(R.string.flp);
                }
                CommonItemView commonItemView13 = this.f93016a;
                if (commonItemView13 == null) {
                    C89219l.m154710a("mAdSettingItem");
                }
                commonItemView13.setDesc(str);
                CommonItemView commonItemView14 = this.f93016a;
                if (commonItemView14 == null) {
                    C89219l.m154710a("mAdSettingItem");
                }
                commonItemView14.setLeftText(str2);
                mo68877a().mo68902a().observe(this, new C39410b(this));
                CommonItemView commonItemView15 = this.f93016a;
                if (commonItemView15 == null) {
                    C89219l.m154710a("mAdSettingItem");
                }
                commonItemView15.setOnClickListener(this.f93019d);
            }
            AdPersonalitySettings i6 = C39608b.m80423i();
            if (i6 != null) {
                bool2 = i6.getShowThirdAd();
            } else {
                bool2 = null;
            }
            if (C89219l.m154714a((Object) bool2, (Object) true)) {
                CommonItemView commonItemView16 = (CommonItemView) _$_findCachedViewById(R.id.eha);
                commonItemView16.setVisibility(0);
                PersonalizationDataText personalizationDataText6 = this.f93017b;
                if (personalizationDataText6 != null) {
                    str9 = personalizationDataText6.getThirdAdTitle();
                } else {
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str9)) {
                    PersonalizationDataText personalizationDataText7 = this.f93017b;
                    if (personalizationDataText7 != null) {
                        str14 = personalizationDataText7.getThirdAdTitle();
                    } else {
                        str14 = null;
                    }
                    commonItemView16.setLeftText(str14);
                }
                PersonalizationDataText personalizationDataText8 = this.f93017b;
                if (personalizationDataText8 != null) {
                    str10 = personalizationDataText8.getThirdAdDetail();
                } else {
                    str10 = null;
                }
                if (TextUtils.isEmpty(str10) || (personalizationDataText5 = this.f93017b) == null || (str11 = personalizationDataText5.getThirdAdDetail()) == null) {
                    str11 = getString(R.string.fnw);
                    C89219l.m154716b(str11, "");
                }
                PersonalizationDataText personalizationDataText9 = this.f93017b;
                if (personalizationDataText9 != null) {
                    str12 = personalizationDataText9.getListThirdAd();
                } else {
                    str12 = null;
                }
                if (TextUtils.isEmpty(str12) || (personalizationDataText4 = this.f93017b) == null || (str13 = personalizationDataText4.getListThirdAd()) == null) {
                    str13 = getString(R.string.fny);
                    C89219l.m154716b(str13, "");
                }
                TextView tvwDesc = commonItemView16.getTvwDesc();
                C89219l.m154716b(tvwDesc, "");
                tvwDesc.setText(m80125a(str11, str13, "https://www.tiktok.com/falcon/fe_tiktok_common/third_party_detail/index.html/?advertisers_type=1&hide_loading=1&hide_nav_bar=1"));
                TextView tvwDesc2 = commonItemView16.getTvwDesc();
                C89219l.m154716b(tvwDesc2, "");
                tvwDesc2.setMovementMethod(LinkMovementMethod.getInstance());
                commonItemView16.getTvwDesc().setOnClickListener(new View$OnClickListenerC39411c(commonItemView16));
                mo68877a().mo68904b().observe(this, new C39412d(this));
            } else {
                CommonItemView commonItemView17 = (CommonItemView) _$_findCachedViewById(R.id.eha);
                C89219l.m154716b(commonItemView17, "");
                commonItemView17.setVisibility(8);
            }
            AdPersonalitySettings i7 = C39608b.m80423i();
            if (i7 != null) {
                bool3 = i7.getShowPartnerAd();
            } else {
                bool3 = null;
            }
            if (C89219l.m154714a((Object) bool3, (Object) true)) {
                CommonItemView commonItemView18 = (CommonItemView) _$_findCachedViewById(R.id.cz8);
                commonItemView18.setVisibility(0);
                PersonalizationDataText personalizationDataText10 = this.f93017b;
                if (personalizationDataText10 != null) {
                    str3 = personalizationDataText10.getPartnerAdTitle();
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str3)) {
                    PersonalizationDataText personalizationDataText11 = this.f93017b;
                    if (personalizationDataText11 != null) {
                        str8 = personalizationDataText11.getPartnerAdTitle();
                    } else {
                        str8 = null;
                    }
                    commonItemView18.setLeftText(str8);
                }
                PersonalizationDataText personalizationDataText12 = this.f93017b;
                if (personalizationDataText12 != null) {
                    str4 = personalizationDataText12.getPartnerAdDetail();
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4) || (personalizationDataText3 = this.f93017b) == null || (str5 = personalizationDataText3.getPartnerAdDetail()) == null) {
                    str5 = getString(R.string.fo0);
                    C89219l.m154716b(str5, "");
                }
                PersonalizationDataText personalizationDataText13 = this.f93017b;
                if (personalizationDataText13 != null) {
                    str6 = personalizationDataText13.getListPartner();
                } else {
                    str6 = null;
                }
                if (TextUtils.isEmpty(str6) || (personalizationDataText2 = this.f93017b) == null || (str7 = personalizationDataText2.getListPartner()) == null) {
                    str7 = getString(R.string.fo1);
                    C89219l.m154716b(str7, "");
                }
                TextView tvwDesc3 = commonItemView18.getTvwDesc();
                C89219l.m154716b(tvwDesc3, "");
                tvwDesc3.setText(m80125a(str5, str7, "https://www.tiktok.com/falcon/fe_tiktok_common/third_party/index.html?type=partner&hide_loading=1&hide_nav_bar=1"));
                TextView tvwDesc4 = commonItemView18.getTvwDesc();
                C89219l.m154716b(tvwDesc4, "");
                tvwDesc4.setMovementMethod(LinkMovementMethod.getInstance());
                commonItemView18.getTvwDesc().setOnClickListener(new View$OnClickListenerC39413e(commonItemView18));
                mo68877a().mo68905c().observe(this, new C39414f(this));
            } else {
                CommonItemView commonItemView19 = (CommonItemView) _$_findCachedViewById(R.id.cz8);
                C89219l.m154716b(commonItemView19, "");
                commonItemView19.setVisibility(8);
            }
        }
        if (!GuestModeServiceImpl.m65990d().mo57219c()) {
            CommonItemView commonItemView20 = this.f93021g;
            if (commonItemView20 == null) {
                C89219l.m154710a("mDeleteGuestDataItem");
            }
            commonItemView20.setVisibility(8);
        } else {
            CommonItemView commonItemView21 = this.f93021g;
            if (commonItemView21 == null) {
                C89219l.m154710a("mDeleteGuestDataItem");
            }
            commonItemView21.setOnClickListener(new View$OnClickListenerC39419k(this));
        }
        C39162r.m79460a("pa_setting_page_show", new C33744d().mo59980a("setting_type", C39608b.m80422h()).f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.personalization.PersonalizationActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m80127a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo68878a(String str, String str2) {
        SmartRouter.buildRoute(this, "//webview").withParam("url", str).withParam("title", str2).open();
    }

    /* renamed from: a */
    private final SpannableStringBuilder m80125a(String str, String str2, String str3) {
        String str4 = str + ' ' + str2;
        int a = C89361p.m154888a((CharSequence) str4, str2, 0, false, 6);
        if (a == -1) {
            return new SpannableStringBuilder(str4);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        spannableStringBuilder.setSpan(new C39427s(this, str3, a, str2), a, str2.length() + a, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(this, R.color.bx)), a, str2.length() + a, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), a, str2.length() + a, 33);
        return spannableStringBuilder;
    }
}
