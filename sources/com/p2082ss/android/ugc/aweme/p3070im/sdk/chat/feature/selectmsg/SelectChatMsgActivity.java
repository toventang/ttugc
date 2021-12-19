package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56197d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity */
public final class SelectChatMsgActivity extends AbstractActivityC54312a {

    /* renamed from: a */
    private HashMap f124410a;

    static {
        Covode.recordClassIndex(64008);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f124410a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f124410a == null) {
            this.f124410a = new HashMap();
        }
        View view = (View) this.f124410a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f124410a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.bt, R.anim.bw);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        String conversationId;
        C53709a aVar = this.f124684d;
        if (!(aVar == null || (conversationId = aVar.getConversationId()) == null || conversationId.length() <= 0)) {
            C56197d dVar = new C56197d();
            dVar.f128194b = conversationId;
            AbstractC81915c.m141874a(dVar);
        }
        super.onBackPressed();
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

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b
    public final void bH_() {
        String str;
        int i;
        List<C19538ai> list;
        super.bH_();
        Bundle a = m99604a(getIntent());
        if (a != null) {
            C53709a aVar = this.f124684d;
            C56245a aVar2 = null;
            if (aVar != null) {
                str = aVar.getConversationId();
            } else {
                str = null;
            }
            C53709a aVar3 = this.f124684d;
            if (aVar3 != null) {
                HashMap<String, List<C19538ai>> hashMap = C54314c.f124413a;
                if (hashMap != null) {
                    list = hashMap.get(str);
                } else {
                    list = null;
                }
                aVar3.setSelectMsgList(list);
            }
            Serializable serializable = a.getSerializable("key_enter_chat_params");
            if (serializable instanceof C56245a) {
                aVar2 = serializable;
            }
            C56245a aVar4 = aVar2;
            C53709a aVar5 = this.f124684d;
            if (aVar5 != null) {
                if (aVar4 != null) {
                    i = aVar4.getSelectMsgType();
                } else {
                    i = 0;
                }
                aVar5.setSelectMsgType(i);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m99604a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.AbstractActivityC54312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.bu, R.anim.bt);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.SelectChatMsgActivity", "onCreate", false);
    }
}
