package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b */
public final class C55712b {

    /* renamed from: a */
    public static final C55712b f127086a = new C55712b();

    private C55712b() {
    }

    static {
        Covode.recordClassIndex(65498);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$a */
    public static final /* synthetic */ class C55713a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55713a f127087a = new C55713a();

        static {
            Covode.recordClassIndex(65499);
        }

        C55713a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$b */
    public static final /* synthetic */ class C55714b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55714b f127088a = new C55714b();

        static {
            Covode.recordClassIndex(65500);
        }

        C55714b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$c */
    public static final /* synthetic */ class C55715c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55715c f127089a = new C55715c();

        static {
            Covode.recordClassIndex(65501);
        }

        C55715c() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$d */
    public static final /* synthetic */ class C55716d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C55716d f127090a = new C55716d();

        static {
            Covode.recordClassIndex(65502);
        }

        C55716d() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m101457a(SharePackage sharePackage, String str, long j) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        long currentTimeMillis = System.currentTimeMillis();
        C55714b bVar = C55714b.f127088a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        String str7 = null;
        if (sharePackage == null || (bundle5 = sharePackage.f155492i) == null) {
            str2 = null;
        } else {
            str2 = bundle5.getString("enter_method");
        }
        if ((!C89219l.m154714a((Object) "long_press", (Object) str2)) && (!C89219l.m154714a((Object) "long_press_more", (Object) str2))) {
            str2 = "more_button";
        }
        String str8 = "chat";
        if (sharePackage == null || (bundle4 = sharePackage.f155492i) == null) {
            str3 = null;
        } else {
            str3 = bundle4.getString("platform", str8);
        }
        if (!TextUtils.equals(str3, "chat_list")) {
            str8 = str3;
        }
        String a = C55708a.m101451a("share_video_success", currentTimeMillis);
        C33744d a2 = new C33744d().mo59983a("platform", str8);
        if (sharePackage == null || (bundle3 = sharePackage.f155492i) == null) {
            str4 = null;
        } else {
            str4 = bundle3.getString("aid");
        }
        C33744d a3 = a2.mo59983a("group_id", str4);
        if (sharePackage == null || (bundle2 = sharePackage.f155492i) == null) {
            str5 = null;
        } else {
            str5 = bundle2.getString("author_id");
        }
        C33744d a4 = a3.mo59983a("author_id", str5);
        if (!(sharePackage == null || (bundle = sharePackage.f155492i) == null)) {
            str7 = bundle.getString("enter_from");
        }
        C33744d a5 = a4.mo59983a("enter_from", str7);
        if (j > 0) {
            str6 = "private";
        } else {
            str6 = "group";
        }
        Map<String, String> map = a5.mo59983a("chat_type", str6).mo59983a("enter_method", str2).mo59983a("bind_id", a).f79943a;
        C89219l.m154716b(map, "");
        bVar.invoke("share_video_success", map);
        C0484a aVar = new C0484a();
        aVar.put("bind_id", a);
        aVar.put("conversation_id", str);
        if (j > 0) {
            aVar.put("to_user_id", String.valueOf(j));
        }
        bVar.invoke("share_video_success_info", aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0158, code lost:
        if (r10 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0168, code lost:
        if (r0 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016a, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        com.p2082ss.android.ugc.aweme.upvote.event.C79900c.m138666a(r9, r1, r8, r0);
        r0 = r9.f79943a;
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, "");
        r3.invoke("share_video_to_chat", r0);
        r5 = new com.p2082ss.android.ugc.aweme.app.p2328f.C33744d();
        r5.mo59983a("bind_id", r14);
        r5.mo59983a("conversation_id", "");
        r5.mo59983a("to_user_id", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018e, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r0 = new com.p2082ss.android.ugc.aweme.profile.model.User();
        r0.setSocialInfo(r2);
        com.p2082ss.android.ugc.aweme.utils.C80409eu.m139390a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        r1 = r5.f79943a;
        p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
        r3.invoke("share_video_to_chat_info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m101459a(com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r13, java.lang.String r14, java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b.m101459a(com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.lang.String, java.util.List):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m101458a(SharePackage sharePackage, String str, long j, boolean z, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C55713a aVar = C55713a.f127087a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C33744d a = new C33744d().mo59983a("platform", "chat");
        String str7 = null;
        if (sharePackage == null || (bundle3 = sharePackage.f155492i) == null) {
            str3 = null;
        } else {
            str3 = bundle3.getString("aid");
        }
        C33744d a2 = a.mo59983a("group_id", str3);
        if (sharePackage == null || (bundle2 = sharePackage.f155492i) == null) {
            str4 = null;
        } else {
            str4 = bundle2.getString("author_id");
        }
        C33744d a3 = a2.mo59983a("author_id", str4);
        if (!(sharePackage == null || (bundle = sharePackage.f155492i) == null)) {
            str7 = bundle.getString("enter_from");
        }
        C33744d a4 = a3.mo59983a("enter_from", str7).mo59983a("conversation_id", str);
        if (j > 0) {
            a4.mo59981a("to_user_id", j);
        }
        if (j > 0) {
            str5 = "private";
        } else {
            str5 = "group";
        }
        C33744d a5 = a4.mo59983a("chat_type", str5).mo59983a("enter_method", "more_button");
        if (z) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        Map<String, String> map = a5.mo59983a("status", str6).mo59983a("error_code", str2).f79943a;
        C89219l.m154716b(map, "");
        aVar.invoke("share_video_response", map);
    }
}
