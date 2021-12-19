package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.h */
public final class C53690h {

    /* renamed from: d */
    public static final C53691a f123204d = new C53691a((byte) 0);

    /* renamed from: a */
    public final C19538ai f123205a;

    /* renamed from: b */
    public final String f123206b;

    /* renamed from: c */
    public final EnumC53694i f123207c;

    static {
        Covode.recordClassIndex(63270);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.h$a */
    public static final class C53691a {
        static {
            Covode.recordClassIndex(63271);
        }

        private C53691a() {
        }

        public /* synthetic */ C53691a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.h$c */
    public static final class C53693c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C53693c f123209a = new C53693c();

        static {
            Covode.recordClassIndex(63273);
        }

        C53693c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", "report error send msg");
            C89219l.m154716b(th, "");
            hashMap.put("error_desc", th);
            C55197c.m100920b("send_msg_error", hashMap);
            C51423a.m95786a((Exception) new RuntimeException(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.h$b */
    public static final class C53692b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C53690h f123208a;

        static {
            Covode.recordClassIndex(63272);
        }

        public C53692b(C53690h hVar) {
            this.f123208a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String a;
            C19538ai aiVar = (C19538ai) obj;
            C89219l.m154716b(aiVar, "");
            BaseContent b = EnumC53772b.C53814f.m99071b(aiVar);
            String a2 = C55231t.m100995a(aiVar, b);
            EnumC53694i iVar = this.f123208a.f123207c;
            C89219l.m154716b(a2, "");
            if (iVar.shouldReport(a2)) {
                Map<String, String> makeParams = this.f123208a.f123207c.makeParams(aiVar, b, a2, this.f123208a.f123206b);
                String str2 = null;
                if (!a2.equals("live_room") && !a2.equals("ttFarm") && (a = C55058a.m100683a(C55059b.f126007a)) != null && a.length() > 0) {
                    makeParams.put("enter_from", a);
                }
                if (aiVar.getReferenceInfo() != null) {
                    str = "1";
                } else {
                    str = "0";
                }
                makeParams.put("if_contain_quote", str);
                makeParams.put("from_group_id", aiVar.getLocalExt().get("from_group_id"));
                makeParams.put("from_story_collection_id", aiVar.getLocalExt().get("from_story_collection_id"));
                makeParams.put("is_share_pop_up", aiVar.getLocalExt().get("is_share_pop_up"));
                try {
                    String optString = new JSONObject(aiVar.getContent()).optString("link_url");
                    if (optString != null) {
                        if (Uri.parse(optString).getQueryParameter("_is_eoy") != null) {
                            makeParams.put("message_type", "eoy_hub");
                        }
                        str2 = optString;
                    }
                    C89379q.m157068constructorimpl(str2);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                this.f123208a.f123207c.beforeReport(aiVar);
                C39162r.m79460a("send_message", makeParams);
            }
        }
    }

    public C53690h(C19538ai aiVar, String str, EnumC53694i iVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        this.f123205a = aiVar;
        this.f123206b = str;
        this.f123207c = iVar;
    }
}
