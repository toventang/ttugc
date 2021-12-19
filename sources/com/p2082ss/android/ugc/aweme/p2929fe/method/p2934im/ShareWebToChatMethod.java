package com.p2082ss.android.ugc.aweme.p2929fe.method.p2934im;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.AbstractC34530c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.ImWebSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod */
public final class ShareWebToChatMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47957a f111074a = new C47957a((byte) 0);

    static {
        Covode.recordClassIndex(56666);
    }

    private ShareWebToChatMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod$a */
    public static final class C47957a {
        static {
            Covode.recordClassIndex(56667);
        }

        private C47957a() {
        }

        public /* synthetic */ C47957a(byte b) {
            this();
        }
    }

    private /* synthetic */ ShareWebToChatMethod() {
        this((C18288a) null);
    }

    public ShareWebToChatMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.im.ShareWebToChatMethod$b */
    static final class C47958b<T> implements AbstractC34530c {

        /* renamed from: a */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f111075a;

        static {
            Covode.recordClassIndex(56668);
        }

        C47958b(BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f111075a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34530c
        /* renamed from: a */
        public final /* synthetic */ void mo60998a(Object obj) {
            Boolean bool = (Boolean) obj;
            C51423a.m95784a(4, "ShareWebToChatMethod", "success ".concat(String.valueOf(bool)));
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f111075a;
            if (aVar != null) {
                C89219l.m154716b(bool, "");
                aVar.mo79887a(null, bool.booleanValue() ? 1 : 0, "callback");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: com.ss.android.ugc.aweme.im.service.model.IMConversation */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        IMUser iMUser;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(StringSet.type);
            if (optInt == 1) {
                String optString = jSONObject.optString("uid");
                IMUser iMUser2 = new IMUser();
                iMUser2.setUid(optString);
                iMUser = iMUser2;
            } else if (optInt == 2) {
                String optString2 = jSONObject.optString("cid");
                IMConversation iMConversation = new IMConversation();
                iMConversation.setConversationId(optString2);
                iMUser = iMConversation;
            } else if (aVar != null) {
                aVar.mo79885a(0, "unknown type");
                return;
            } else {
                return;
            }
            Activity j = C17873f.m33102j();
            if (j != null) {
                try {
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("desc");
                    String string3 = jSONObject.getString("pic_url");
                    String string4 = jSONObject.getString("web_url");
                    String optString3 = jSONObject.optString("enter_from");
                    String optString4 = jSONObject.optString("message_type");
                    C51423a.m95784a(4, "ShareWebToChatMethod", "start to share ");
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    SharePackage.C69654a a = new SharePackage.C69654a().mo109803a("web");
                    C89219l.m154716b(string, "");
                    SharePackage.C69654a c = a.mo109807c(string);
                    C89219l.m154716b(string2, "");
                    SharePackage.C69654a d = c.mo109808d(string2);
                    C89219l.m154716b(string4, "");
                    SharePackage.C69654a e = d.mo109809e(string4);
                    C89219l.m154716b(optString3, "");
                    SharePackage.C69654a a2 = e.mo109804a("enter_from", optString3);
                    C89219l.m154716b(optString4, "");
                    ImWebSharePackage imWebSharePackage = new ImWebSharePackage(a2.mo109804a("message_type", optString4));
                    imWebSharePackage.f128341a = string3;
                    imWebSharePackage.f128342b = false;
                    imWebSharePackage.f155492i.putString("thumb_url", imWebSharePackage.f128341a);
                    createIIMServicebyMonsterPlugin.shareSingleMsg(j, iMUser, imWebSharePackage, new C47958b(aVar));
                } catch (Exception e2) {
                    C51423a.m95790a((Throwable) e2);
                    if (aVar != null) {
                        aVar.mo79885a(0, "catch exception:" + e2.getMessage());
                    }
                }
            } else if (aVar != null) {
                aVar.mo79885a(0, "activity is null");
            }
        } else if (aVar != null) {
            aVar.mo79885a(0, "no params found");
        }
    }
}
