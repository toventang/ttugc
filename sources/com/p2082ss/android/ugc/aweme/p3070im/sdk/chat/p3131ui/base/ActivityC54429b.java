package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1213c.AbstractC17446a;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3135c.C54434a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3179b.AbstractC55147b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b */
public class ActivityC54429b extends ActivityC17312a implements AbstractC33501c {

    /* renamed from: e */
    public static final C54430a f124680e = new C54430a((byte) 0);

    /* renamed from: a */
    private AnalysisActivityComponent f124681a;

    /* renamed from: b */
    private C54434a f124682b;

    /* renamed from: c */
    private HashMap f124683c;

    /* renamed from: d */
    public C53709a f124684d;

    static {
        Covode.recordClassIndex(64134);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f124683c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f124683c == null) {
            this.f124683c = new HashMap();
        }
        View view = (View) this.f124683c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f124683c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.b$a */
    public static final class C54430a {
        static {
            Covode.recordClassIndex(64135);
        }

        private C54430a() {
        }

        public /* synthetic */ C54430a(byte b) {
            this();
        }
    }

    public ActivityC54429b() {
        AbstractC55147b.f126186a.mo92071a("chat_room");
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        BaseChatPanel baseChatPanel;
        C54434a aVar = this.f124682b;
        if (!(aVar == null || (baseChatPanel = aVar.f124685e) == null)) {
            baseChatPanel.mo91491h();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        C54434a aVar = this.f124682b;
        if (aVar != null) {
            aVar.mo64296c();
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        super.onPause();
        AnalysisActivityComponent analysisActivityComponent = this.f124681a;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.mo61002a();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        super.onResume();
        AnalysisActivityComponent analysisActivityComponent = this.f124681a;
        if (analysisActivityComponent != null) {
            analysisActivityComponent.f81535a = System.currentTimeMillis();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("chat");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        super.onDestroy();
        C55059b.f126008b = "";
        if (C55059b.f126009c != null) {
            C55059b.f126009c.clear();
        }
        this.f124681a = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        if (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a.m98927a(r6) != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bH_() {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b.bH_():void");
    }

    /* renamed from: a */
    private static Bundle m99756a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        BaseChatPanel baseChatPanel;
        super.onWindowFocusChanged(z);
        C54434a aVar = this.f124682b;
        if (aVar != null && (baseChatPanel = aVar.f124685e) != null) {
            baseChatPanel.f124645o = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91499a(String str) {
        C89219l.m154721d(str, "");
        C54434a aVar = this.f124682b;
        if (aVar != null) {
            C89219l.m154721d(str, "");
            BaseChatPanel baseChatPanel = aVar.f124685e;
            if (baseChatPanel != null) {
                baseChatPanel.mo91484a(str);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        bH_();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("back_to_chat_room", false);
        }
        m99759a(!z);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        C53709a aVar = this.f124684d;
        if (aVar != null) {
            bundle.putSerializable("key_session_info", aVar);
        }
    }

    /* renamed from: a */
    private final void m99759a(boolean z) {
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo3551a("chat_room_fragment");
        if (a == null || z) {
            a = new C54434a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_session_info", this.f124684d);
            a.setArguments(bundle);
        }
        this.f124682b = (C54434a) a;
        AbstractC0976n a2 = supportFragmentManager.mo3552a();
        C89219l.m154716b(a2, "");
        a2.mo3470b(R.id.b82, a, "chat_room_fragment").mo3473c();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17419b.m32261a().mo27887a(AbstractC17446a.EnumC17447a.ENTER_CHAT_ROOM);
        if (bundle != null) {
            getIntent().putExtras(bundle);
        }
        Window window = getWindow();
        C89219l.m154716b(window, "");
        window.getDecorView().setBackgroundResource(R.drawable.aq2);
        C55076b.m100727f();
        setContentView(R.layout.a44);
        bH_();
        m99759a(false);
        this.f124681a = new AnalysisActivityComponent(this);
        AbstractC55147b.C55148a aVar = AbstractC55147b.f126186a;
        View findViewById = findViewById(R.id.b82);
        C89219l.m154716b(findViewById, "");
        aVar.mo92070a(findViewById, "chat_room");
    }

    /* renamed from: a */
    private static C56245a m99757a(C56245a aVar) {
        String enterFromForMob;
        IMUser imUser;
        String uid;
        IMUser imUser2;
        String uid2;
        String enterMethodForMob;
        IMContact imContact = aVar.getImContact();
        IMConversation iMConversation = null;
        if (imContact != null) {
            if (imContact instanceof IMConversation) {
                iMConversation = imContact;
            }
            IMConversation iMConversation2 = iMConversation;
            if (iMConversation2 == null || iMConversation2.getConversationType() != C19489e.AbstractC19490a.f46181b) {
                IMUser a = C55083f.m100745a(imContact);
                if (a != null) {
                    aVar.setImUser(a);
                }
            } else {
                aVar.setSessionId(iMConversation2.getConversationId());
                aVar.setChatType(3);
            }
        }
        int i = 2;
        if (aVar.getEnterFrom() == 6 && ((enterMethodForMob = aVar.getEnterMethodForMob()) == null || enterMethodForMob.length() == 0)) {
            aVar.setEnterMethodForMob("share_toast");
        } else if (aVar.getEnterFrom() == 2 && ((enterFromForMob = aVar.getEnterFromForMob()) == null || enterFromForMob.length() == 0)) {
            aVar.setEnterMethodForMob("stranger_message_box");
        }
        if (aVar.getChatType() == -1) {
            IMUser imUser3 = aVar.getImUser();
            if (aVar.getEnterFrom() == 2) {
                i = 1;
            } else if (imUser3 == null || imUser3.getCommerceUserLevel() <= 0) {
                i = 0;
            }
            aVar.setChatType(i);
        }
        if (aVar.getChatType() != 3) {
            if (aVar.getImUser() == null) {
                IMUser a2 = C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(aVar.getSessionId())), C55080c.m100730a(aVar.getSessionId()));
                if (a2 == null) {
                    C56244a.m102193e("BaseChatRoomActivity", "ChatRoomActivity.start user = null");
                    AbstractC89172b<Boolean, C89391z> routerCallback = aVar.getRouterCallback();
                    if (routerCallback != null) {
                        routerCallback.invoke(false);
                    }
                    return aVar;
                }
                try {
                    String uid3 = a2.getUid();
                    C89219l.m154716b(uid3, "");
                    Long.parseLong(uid3);
                    aVar.setImUser(a2);
                } catch (Exception unused) {
                    C56244a.m102193e("BaseChatRoomActivity", "ChatRoomActivity.start uid is invalid: " + a2.getUid());
                    AbstractC89172b<Boolean, C89391z> routerCallback2 = aVar.getRouterCallback();
                    if (routerCallback2 != null) {
                        routerCallback2.invoke(false);
                    }
                    return aVar;
                }
            }
            String shareUserId = aVar.getShareUserId();
            if (!((shareUserId != null && shareUserId.length() != 0) || (imUser2 = aVar.getImUser()) == null || (uid2 = imUser2.getUid()) == null)) {
                aVar.setShareUserId(uid2);
            }
            String sessionId = aVar.getSessionId();
            if (!((sessionId != null && sessionId.length() != 0) || (imUser = aVar.getImUser()) == null || (uid = imUser.getUid()) == null || uid.length() == 0)) {
                aVar.setSessionId(AbstractC17427b.C17428a.m32310b(uid));
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m99758a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C54434a aVar = this.f124682b;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
