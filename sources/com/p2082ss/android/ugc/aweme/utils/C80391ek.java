package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ek */
public final class C80391ek {

    /* renamed from: a */
    public static final C80391ek f179924a = new C80391ek();

    /* renamed from: com.ss.android.ugc.aweme.utils.ek$d */
    public static final class C80395d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C80395d f179928a = new C80395d();

        static {
            Covode.recordClassIndex(93663);
        }

        C80395d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C80391ek() {
    }

    static {
        Covode.recordClassIndex(93659);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ek$a */
    public static final class C80392a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C80392a f179925a = new C80392a();

        static {
            Covode.recordClassIndex(93660);
        }

        C80392a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            return new JSONObject(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ek$c */
    public static final class C80394c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f179927a;

        static {
            Covode.recordClassIndex(93662);
        }

        public C80394c(AbstractC89172b bVar) {
            this.f179927a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179927a.invoke(Integer.valueOf(((JSONObject) obj).optInt("stream_type", 0)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ek$b */
    public static final class C80393b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C80393b f179926a = new C80393b();

        static {
            Covode.recordClassIndex(93661);
        }

        C80393b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C89219l.m154721d(jSONObject, "");
            if (TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_Android") || TextUtils.equals(jSONObject.optString("source"), "TTLiveSDK_IOS")) {
                return true;
            }
            return false;
        }
    }
}
