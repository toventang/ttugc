package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f */
public abstract class AbstractC76337f {
    static {
        Covode.recordClassIndex(89292);
    }

    private AbstractC76337f() {
    }

    public /* synthetic */ AbstractC76337f(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f$a */
    public static final class C76338a extends AbstractC76337f {

        /* renamed from: a */
        public final String f171476a;

        static {
            Covode.recordClassIndex(89293);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C76338a) && C89219l.m154714a(this.f171476a, ((C76338a) obj).f171476a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f171476a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ClearPropSearchText(panelUnfold=" + this.f171476a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76338a(String str) {
            super((byte) 0);
            C89219l.m154721d(str, "");
            this.f171476a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f$b */
    public static final class C76339b extends AbstractC76337f {

        /* renamed from: a */
        public final String f171477a;

        static {
            Covode.recordClassIndex(89294);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C76339b) && C89219l.m154714a(this.f171477a, ((C76339b) obj).f171477a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f171477a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ClickSearchIcon(enterMethod=" + this.f171477a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76339b(String str) {
            super((byte) 0);
            C89219l.m154721d(str, "");
            this.f171477a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f$d */
    public static final class C76341d extends AbstractC76337f {

        /* renamed from: a */
        public final String f171483a;

        static {
            Covode.recordClassIndex(89296);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C76341d) && C89219l.m154714a(this.f171483a, ((C76341d) obj).f171483a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f171483a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "PropSearchCancel(panelUnfold=" + this.f171483a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76341d(String str) {
            super((byte) 0);
            C89219l.m154721d(str, "");
            this.f171483a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f$c */
    public static final class C76340c extends AbstractC76337f {

        /* renamed from: a */
        public final String f171478a;

        /* renamed from: b */
        public final String f171479b;

        /* renamed from: c */
        public final String f171480c;

        /* renamed from: d */
        public final String f171481d;

        /* renamed from: e */
        public final String f171482e;

        static {
            Covode.recordClassIndex(89295);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76340c)) {
                return false;
            }
            C76340c cVar = (C76340c) obj;
            return C89219l.m154714a(this.f171478a, cVar.f171478a) && C89219l.m154714a(this.f171479b, cVar.f171479b) && C89219l.m154714a(this.f171480c, cVar.f171480c) && C89219l.m154714a(this.f171481d, cVar.f171481d) && C89219l.m154714a(this.f171482e, cVar.f171482e);
        }

        public final int hashCode() {
            String str = this.f171478a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f171479b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f171480c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f171481d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f171482e;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            return "PropSearch(enterMethod=" + this.f171478a + ", searchKeyword=" + this.f171479b + ", searchId=" + this.f171480c + ", isSuccess=" + this.f171481d + ", duration=" + this.f171482e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76340c(String str, String str2, String str3, String str4, String str5) {
            super((byte) 0);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            this.f171478a = str;
            this.f171479b = str2;
            this.f171480c = str3;
            this.f171481d = str4;
            this.f171482e = str5;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.f$e */
    public static final class C76342e extends AbstractC76337f {

        /* renamed from: a */
        public final String f171484a;

        /* renamed from: b */
        public final String f171485b;

        /* renamed from: c */
        public final String f171486c;

        /* renamed from: d */
        public final Effect f171487d;

        /* renamed from: e */
        public final int f171488e;

        static {
            Covode.recordClassIndex(89297);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76342e)) {
                return false;
            }
            C76342e eVar = (C76342e) obj;
            return C89219l.m154714a(this.f171484a, eVar.f171484a) && C89219l.m154714a(this.f171485b, eVar.f171485b) && C89219l.m154714a(this.f171486c, eVar.f171486c) && C89219l.m154714a(this.f171487d, eVar.f171487d) && this.f171488e == eVar.f171488e;
        }

        public final int hashCode() {
            String str = this.f171484a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f171485b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f171486c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Effect effect = this.f171487d;
            if (effect != null) {
                i = effect.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.f171488e;
        }

        public final String toString() {
            return "PropShow(searchMethod=" + this.f171484a + ", searchId=" + this.f171485b + ", panelUnfold=" + this.f171486c + ", effect=" + this.f171487d + ", index=" + this.f171488e + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76342e(String str, String str2, String str3, Effect effect, int i) {
            super((byte) 0);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(effect, "");
            this.f171484a = str;
            this.f171485b = str2;
            this.f171486c = str3;
            this.f171487d = effect;
            this.f171488e = i;
        }
    }
}
