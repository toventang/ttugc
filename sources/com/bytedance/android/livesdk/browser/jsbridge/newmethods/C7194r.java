package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r */
public final class C7194r extends AbstractC18334e<C7195a, C7196b> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$a */
    public static final class C7195a {
        @AbstractC27891c(mo46611a = StringSet.type)

        /* renamed from: a */
        public final String f17904a;
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: b */
        public final String f17905b;
        @AbstractC27891c(mo46611a = "text")

        /* renamed from: c */
        public final String f17906c;
        @AbstractC27891c(mo46611a = "left_button_text")

        /* renamed from: d */
        public final String f17907d;
        @AbstractC27891c(mo46611a = "left_button_text_color")

        /* renamed from: e */
        public final String f17908e;
        @AbstractC27891c(mo46611a = "right_button_text")

        /* renamed from: f */
        public final String f17909f;
        @AbstractC27891c(mo46611a = "right_button_text_color")

        /* renamed from: g */
        public final String f17910g;
        @AbstractC27891c(mo46611a = "corner_radius")

        /* renamed from: h */
        public final Float f17911h;

        static {
            Covode.recordClassIndex(7941);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7195a)) {
                return false;
            }
            C7195a aVar = (C7195a) obj;
            return C89219l.m154714a(this.f17904a, aVar.f17904a) && C89219l.m154714a(this.f17905b, aVar.f17905b) && C89219l.m154714a(this.f17906c, aVar.f17906c) && C89219l.m154714a(this.f17907d, aVar.f17907d) && C89219l.m154714a(this.f17908e, aVar.f17908e) && C89219l.m154714a(this.f17909f, aVar.f17909f) && C89219l.m154714a(this.f17910g, aVar.f17910g) && C89219l.m154714a(this.f17911h, aVar.f17911h);
        }

        public final int hashCode() {
            String str = this.f17904a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f17905b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f17906c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f17907d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f17908e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f17909f;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f17910g;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Float f = this.f17911h;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode7 + i;
        }

        public final String toString() {
            return "Params(type=" + this.f17904a + ", title=" + this.f17905b + ", text=" + this.f17906c + ", leftButtonText=" + this.f17907d + ", leftButtonTextColor=" + this.f17908e + ", rightButtonText=" + this.f17909f + ", rightButtonTextColor=" + this.f17910g + ", cornerRadius=" + this.f17911h + ")";
        }
    }

    static {
        Covode.recordClassIndex(7940);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$f */
    static final class C7200f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C7200f f17923a = new C7200f();

        static {
            Covode.recordClassIndex(7946);
        }

        C7200f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$e */
    static final class C7199e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC9148b f17922a;

        static {
            Covode.recordClassIndex(7945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7199e(DialogC9148b bVar) {
            super(0);
            this.f17922a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            DialogC9148b bVar = this.f17922a;
            if (bVar != null) {
                bVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$b */
    public static final class C7196b {
        @AbstractC27891c(mo46611a = "code")

        /* renamed from: a */
        public final int f17912a = 1;
        @AbstractC27891c(mo46611a = "action")

        /* renamed from: b */
        public final String f17913b;

        static {
            Covode.recordClassIndex(7942);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7196b)) {
                return false;
            }
            C7196b bVar = (C7196b) obj;
            return this.f17912a == bVar.f17912a && C89219l.m154714a(this.f17913b, bVar.f17913b);
        }

        public final int hashCode() {
            int i = this.f17912a * 31;
            String str = this.f17913b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Result(code=" + this.f17912a + ", action=" + this.f17913b + ")";
        }

        public C7196b(String str) {
            C89219l.m154721d(str, "");
            this.f17913b = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$c */
    static final class DialogInterface$OnClickListenerC7197c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC9148b.C9149a f17914a;

        /* renamed from: b */
        final /* synthetic */ C7194r f17915b;

        /* renamed from: c */
        final /* synthetic */ C7195a f17916c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f17917d;

        static {
            Covode.recordClassIndex(7943);
        }

        DialogInterface$OnClickListenerC7197c(DialogC9148b.C9149a aVar, C7194r rVar, C7195a aVar2, C89233z.C89238e eVar) {
            this.f17914a = aVar;
            this.f17915b = rVar;
            this.f17916c = aVar2;
            this.f17917d = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f17915b.finishWithResult(new C7196b("right"));
            this.f17917d.element.invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.r$d */
    static final class DialogInterface$OnClickListenerC7198d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC9148b.C9149a f17918a;

        /* renamed from: b */
        final /* synthetic */ C7194r f17919b;

        /* renamed from: c */
        final /* synthetic */ C7195a f17920c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f17921d;

        static {
            Covode.recordClassIndex(7944);
        }

        DialogInterface$OnClickListenerC7198d(DialogC9148b.C9149a aVar, C7194r rVar, C7195a aVar2, C89233z.C89238e eVar) {
            this.f17918a = aVar;
            this.f17919b = rVar;
            this.f17920c = aVar2;
            this.f17921d = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f17919b.finishWithResult(new C7196b("left"));
            this.f17921d.element.invoke();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7195a aVar, C18338g gVar) {
        C7195a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(gVar, "");
        try {
            String str = aVar2.f17904a;
            if (str.hashCode() == 951117504 && str.equals("confirm")) {
                Context context = gVar.f43859a;
                C89219l.m154716b(context, "");
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) C7200f.f17923a;
                DialogC9148b.C9149a aVar3 = new DialogC9148b.C9149a(context);
                String str2 = aVar2.f17905b;
                if (str2 != null) {
                    aVar3.f22244a = str2;
                }
                String str3 = aVar2.f17906c;
                if (str3 != null) {
                    aVar3.f22245b = str3;
                }
                Float f = aVar2.f17911h;
                if (f != null) {
                    aVar3.f22257n = (int) f.floatValue();
                }
                aVar3.f22256m = false;
                String str4 = aVar2.f17909f;
                if (str4 != null && str4.length() > 0) {
                    SpannableString spannableString = new SpannableString(str4);
                    String str5 = aVar2.f17910g;
                    if (str5 != null) {
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str5)), 0, spannableString.length(), 33);
                    }
                    aVar3.mo15245a((CharSequence) spannableString, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7197c(aVar3, this, aVar2, eVar), false);
                }
                String str6 = aVar2.f17907d;
                if (str6 != null && str6.length() > 0) {
                    SpannableString spannableString2 = new SpannableString(str6);
                    String str7 = aVar2.f17908e;
                    if (str7 != null) {
                        spannableString2.setSpan(new ForegroundColorSpan(Color.parseColor(str7)), 0, spannableString2.length(), 33);
                    }
                    aVar3.mo15250b((CharSequence) spannableString2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7198d(aVar3, this, aVar2, eVar), false);
                }
                DialogC9148b a = aVar3.mo15247a();
                a.show();
                eVar.element = (T) new C7199e(a);
                return;
            }
            finishWithFailure();
        } catch (Throwable th) {
            finishWithFailure();
            C6555i.m14021b();
            C3854a.m9455a(5, "ttlive_exception", th.getStackTrace());
        }
    }
}
