package com.p2082ss.android.ugc.aweme.p4173ug.praise;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.a */
public abstract class AbstractC79681a {

    /* renamed from: a */
    public final C79698c f178791a;

    /* renamed from: b */
    public C79682a f178792b;

    /* renamed from: c */
    public final Context f178793c;

    /* renamed from: d */
    private final C79684b.EnumC79686b f178794d;

    static {
        Covode.recordClassIndex(92898);
    }

    /* renamed from: b */
    public abstract C79682a mo123223b();

    /* renamed from: c */
    public abstract void mo123224c();

    /* renamed from: a */
    public final C79682a mo123221a() {
        C79682a aVar = this.f178792b;
        if (aVar == null) {
            C89219l.m154710a("dialogContent");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo123222a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("rating_window_type", this.f178794d.getValue()).f79943a);
    }

    /* renamed from: a */
    static void m138499a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    public AbstractC79681a(Context context, C79684b.EnumC79686b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f178793c = context;
        this.f178794d = bVar;
        this.f178791a = new C79698c(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.a$a */
    public static final class C79682a {

        /* renamed from: a */
        public final String f178795a;

        /* renamed from: b */
        public final String f178796b;

        /* renamed from: c */
        public final String f178797c;

        /* renamed from: d */
        public final String f178798d;

        /* renamed from: e */
        public final String f178799e;

        static {
            Covode.recordClassIndex(92899);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C79682a)) {
                return false;
            }
            C79682a aVar = (C79682a) obj;
            return C89219l.m154714a(this.f178795a, aVar.f178795a) && C89219l.m154714a(this.f178796b, aVar.f178796b) && C89219l.m154714a(this.f178797c, aVar.f178797c) && C89219l.m154714a(this.f178798d, aVar.f178798d) && C89219l.m154714a(this.f178799e, aVar.f178799e);
        }

        public final int hashCode() {
            String str = this.f178795a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f178796b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f178797c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f178798d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f178799e;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "DialogContent(title=" + this.f178795a + ", content=" + this.f178796b + ", feedbackStr=" + this.f178797c + ", positiveBtn=" + this.f178798d + ", packageName=" + this.f178799e + ")";
        }

        public C79682a(String str, String str2, String str3, String str4, String str5) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            this.f178795a = str;
            this.f178796b = str2;
            this.f178797c = str3;
            this.f178798d = str4;
            this.f178799e = str5;
        }
    }
}
