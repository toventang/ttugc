package com.p2082ss.android.ugc.gamora.editor.sticker.donation;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a */
public final class C82726a {

    /* renamed from: a */
    public static final C82726a f184907a = new C82726a();

    /* renamed from: b */
    private static final AbstractC89244h f184908b = C89250i.m154773a((AbstractC89171a) C82727a.f184909a);

    /* renamed from: a */
    public static String m142891a() {
        return (String) f184908b.getValue();
    }

    private C82726a() {
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$a */
    static final class C82727a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C82727a f184909a = new C82727a();

        static {
            Covode.recordClassIndex(96574);
        }

        C82727a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
            if (appLanguage == null) {
                return "";
            }
            return appLanguage;
        }
    }

    static {
        Covode.recordClassIndex(96573);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$f */
    static final class C82732f extends AbstractC89220m implements AbstractC89172b<JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f184928a;

        /* renamed from: b */
        final /* synthetic */ String f184929b;

        static {
            Covode.recordClassIndex(96579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82732f(String str, String str2) {
            super(1);
            this.f184928a = str;
            this.f184929b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C89219l.m154721d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.f184928a);
            jSONObject2.put("creation_id", this.f184929b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$b */
    static final class C82728b extends AbstractC89220m implements AbstractC89172b<JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f184910a;

        /* renamed from: b */
        final /* synthetic */ String f184911b;

        /* renamed from: c */
        final /* synthetic */ String f184912c;

        /* renamed from: d */
        final /* synthetic */ String f184913d;

        /* renamed from: e */
        final /* synthetic */ String f184914e;

        static {
            Covode.recordClassIndex(96575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82728b(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.f184910a = str;
            this.f184911b = str2;
            this.f184912c = str3;
            this.f184913d = str4;
            this.f184914e = str5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C89219l.m154721d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.f184910a);
            jSONObject2.put("creation_id", this.f184911b);
            jSONObject2.put("ngo_name", this.f184912c);
            jSONObject2.put("language", C82726a.m142891a());
            jSONObject2.put("content_source", this.f184913d);
            jSONObject2.put("content_type", this.f184914e);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$c */
    public static final class C82729c extends AbstractC89220m implements AbstractC89172b<JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f184915a;

        /* renamed from: b */
        final /* synthetic */ String f184916b;

        /* renamed from: c */
        final /* synthetic */ String f184917c;

        static {
            Covode.recordClassIndex(96576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82729c(String str, String str2, String str3) {
            super(1);
            this.f184915a = str;
            this.f184916b = str2;
            this.f184917c = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C89219l.m154721d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.f184915a);
            jSONObject2.put("creation_id", this.f184916b);
            jSONObject2.put("ngo_name", this.f184917c);
            jSONObject2.put("language", C82726a.m142891a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$e */
    public static final class C82731e extends AbstractC89220m implements AbstractC89172b<JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f184924a;

        /* renamed from: b */
        final /* synthetic */ String f184925b;

        /* renamed from: c */
        final /* synthetic */ String f184926c;

        /* renamed from: d */
        final /* synthetic */ int f184927d;

        static {
            Covode.recordClassIndex(96578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82731e(String str, String str2, String str3, int i) {
            super(1);
            this.f184924a = str;
            this.f184925b = str2;
            this.f184926c = str3;
            this.f184927d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C89219l.m154721d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.f184924a);
            jSONObject2.put("creation_id", this.f184925b);
            jSONObject2.put("ngo_name", this.f184926c);
            jSONObject2.put("language", C82726a.m142891a());
            jSONObject2.put("impr_position", this.f184927d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$d */
    public static final class C82730d extends AbstractC89220m implements AbstractC89172b<JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f184918a;

        /* renamed from: b */
        final /* synthetic */ String f184919b;

        /* renamed from: c */
        final /* synthetic */ String f184920c;

        /* renamed from: d */
        final /* synthetic */ String f184921d;

        /* renamed from: e */
        final /* synthetic */ String f184922e;

        /* renamed from: f */
        final /* synthetic */ int f184923f;

        static {
            Covode.recordClassIndex(96577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82730d(String str, String str2, String str3, String str4, String str5, int i) {
            super(1);
            this.f184918a = str;
            this.f184919b = str2;
            this.f184920c = str3;
            this.f184921d = str4;
            this.f184922e = str5;
            this.f184923f = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            C89219l.m154721d(jSONObject2, "");
            jSONObject2.put("enter_from", "video_edit_page");
            jSONObject2.put("shoot_way", this.f184918a);
            jSONObject2.put("creation_id", this.f184919b);
            jSONObject2.put("ngo_name", this.f184920c);
            jSONObject2.put("language", C82726a.m142891a());
            jSONObject2.put("content_source", this.f184921d);
            jSONObject2.put("content_type", this.f184922e);
            jSONObject2.put("impr_position", this.f184923f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m142892a(JSONObject jSONObject, AbstractC89172b<? super JSONObject, C89391z> bVar) {
        try {
            bVar.invoke(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
